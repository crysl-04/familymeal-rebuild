package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i40 {
    public final eg a;

    public i40(Context context) {
        this.a = new eg(new File(context.getNoBackupFilesDir(), "db.key"));
    }

    public static SecretKey a(boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("meal_db_kek_v1", 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).setIsStrongBoxBacked(z).build();
        keyGenParameterSpecBuild.getClass();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }

    public static String b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey("meal_db_kek_v1", null);
            SecretKey secretKey = key instanceof SecretKey ? (SecretKey) key : null;
            if (secretKey == null) {
                return "none";
            }
            KeySpec keySpec = SecretKeyFactory.getInstance(secretKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class);
            keySpec.getClass();
            KeyInfo keyInfo = (KeyInfo) keySpec;
            if (Build.VERSION.SDK_INT < 31) {
                return keyInfo.isInsideSecureHardware() ? "TEE" : "software";
            }
            int securityLevel = keyInfo.getSecurityLevel();
            if (securityLevel == 0) {
                return "software";
            }
            if (securityLevel != 1) {
                return securityLevel == 2 ? "StrongBox" : "unknown";
            }
            return "TEE";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readUnsignedByte() != 1) {
                throw new IllegalStateException("unsupported key file version");
            }
            int unsignedByte = dataInputStream.readUnsignedByte();
            if (unsignedByte != 12) {
                throw new IllegalStateException("bad iv length");
            }
            byte[] bArr2 = new byte[unsignedByte];
            dataInputStream.readFully(bArr2);
            int unsignedShort = dataInputStream.readUnsignedShort();
            if (16 > unsignedShort || unsignedShort >= 257) {
                throw new IllegalStateException("bad key length");
            }
            byte[] bArr3 = new byte[unsignedShort];
            dataInputStream.readFully(bArr3);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArr2));
            byte[] bArrDoFinal = cipher.doFinal(bArr3);
            bArrDoFinal.getClass();
            dataInputStream.close();
            return bArrDoFinal;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vs.s(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static byte[] d(SecretKey secretKey, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey);
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeByte(iv.length);
                dataOutputStream.write(iv);
                dataOutputStream.writeShort(bArrDoFinal.length);
                dataOutputStream.write(bArrDoFinal);
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vs.s(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                vs.s(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
