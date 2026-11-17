package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.familymeal.app.MainActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od1 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ MainActivity i;

    public /* synthetic */ od1(MainActivity mainActivity, byte b) {
        this.h = b;
        this.i = mainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0137 A[PHI: r4
  0x0137: PHI (r4v17 int) = (r4v6 int), (r4v6 int), (r4v0 int) binds: [B:65:0x0135, B:105:0x0137, B:36:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        KeyguardManager keyguardManagerA;
        boolean zB;
        byte b = this.h;
        j23 j23Var = j23.a;
        int iA = 0;
        MainActivity mainActivity = this.i;
        ?? IntValue = 1;
        IntValue = 1;
        IntValue = 1;
        IntValue = 1;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = MainActivity.G;
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    cx2.a(dt.N(-181598922, new od1(mainActivity, IntValue), dr0Var), dr0Var, 6);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = MainActivity.G;
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else if (!((Boolean) hg.a.getValue()).booleanValue()) {
                    dr0Var2.V(1645409898);
                    Context applicationContext = mainActivity.getApplicationContext();
                    BiometricManager biometricManagerB = cn.b(applicationContext);
                    fn fnVar = null;
                    yy yyVar = Build.VERSION.SDK_INT <= 29 ? new yy((byte) 10) : null;
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = i3 >= 30 ? 32783 : 33023;
                    if (i3 >= 30) {
                        if (biometricManagerB != null) {
                            IntValue = dn.a(biometricManagerB, i4);
                        }
                    } else if (!uz0.m(i4)) {
                        IntValue = -2;
                    } else if (h31.a(applicationContext) == null) {
                        IntValue = 12;
                    } else if (uz0.l(i4)) {
                        KeyguardManager keyguardManagerA2 = h31.a(applicationContext);
                        if (keyguardManagerA2 == null ? false : h31.b(keyguardManagerA2)) {
                            IntValue = iA;
                        } else {
                            IntValue = 11;
                        }
                    } else if (i3 == 29) {
                        if ((i4 & 255) != 255) {
                            Method methodC = cn.c();
                            if (methodC != null) {
                                try {
                                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                    keyStore.load(null);
                                    KeyGenParameterSpec.Builder builderB = i30.b("androidxBiometric", 3);
                                    i30.d(builderB);
                                    i30.e(builderB);
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                    i30.c(keyGenerator, i30.a(builderB));
                                    keyGenerator.generateKey();
                                    SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
                                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                                    cipher.init(1, secretKey);
                                    fnVar = new fn(cipher);
                                } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
                                }
                                BiometricPrompt.CryptoObject cryptoObjectW = dt.W(fnVar);
                                if (cryptoObjectW != null) {
                                    try {
                                        Object objInvoke = methodC.invoke(biometricManagerB, cryptoObjectW);
                                        if (objInvoke instanceof Integer) {
                                            IntValue = ((Integer) objInvoke).intValue();
                                            break;
                                        } else {
                                            if (biometricManagerB == null) {
                                                iA = 1;
                                            } else {
                                                iA = cn.a(biometricManagerB);
                                            }
                                            String str = Build.MODEL;
                                            if (Build.VERSION.SDK_INT >= 30 && str != null) {
                                                String[] stringArray = applicationContext.getResources().getStringArray(R.array.assume_strong_biometrics_models);
                                                int length = stringArray.length;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 < length) {
                                                        if (!str.equals(stringArray[i5])) {
                                                            i5++;
                                                        }
                                                    } else if (iA == 0) {
                                                        keyguardManagerA = h31.a(applicationContext);
                                                        if (keyguardManagerA == null) {
                                                            zB = false;
                                                        } else {
                                                            zB = h31.b(keyguardManagerA);
                                                        }
                                                        if (!zB) {
                                                            IntValue = -1;
                                                        } else if (yyVar != null) {
                                                            IntValue = 12;
                                                        }
                                                    }
                                                    IntValue = iA;
                                                }
                                            } else if (iA == 0) {
                                                IntValue = iA;
                                            } else {
                                                keyguardManagerA = h31.a(applicationContext);
                                                if (keyguardManagerA == null) {
                                                    zB = false;
                                                } else {
                                                    zB = h31.b(keyguardManagerA);
                                                }
                                                if (!zB) {
                                                    IntValue = -1;
                                                } else if (yyVar != null) {
                                                    IntValue = 12;
                                                }
                                            }
                                        }
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                                    }
                                } else {
                                    if (biometricManagerB == null) {
                                        iA = 1;
                                    } else {
                                        iA = cn.a(biometricManagerB);
                                    }
                                    String str2 = Build.MODEL;
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        if (iA == 0) {
                                            IntValue = iA;
                                        } else {
                                            keyguardManagerA = h31.a(applicationContext);
                                            if (keyguardManagerA == null) {
                                                zB = false;
                                            } else {
                                                zB = h31.b(keyguardManagerA);
                                            }
                                            if (!zB) {
                                                IntValue = -1;
                                            } else if (yyVar != null) {
                                                IntValue = 12;
                                            }
                                        }
                                    } else if (iA == 0) {
                                        IntValue = iA;
                                    } else {
                                        keyguardManagerA = h31.a(applicationContext);
                                        if (keyguardManagerA == null) {
                                            zB = false;
                                        } else {
                                            zB = h31.b(keyguardManagerA);
                                        }
                                        if (!zB) {
                                            IntValue = -1;
                                        } else if (yyVar != null) {
                                            IntValue = 12;
                                        }
                                    }
                                }
                            } else {
                                if (biometricManagerB == null) {
                                    iA = 1;
                                } else {
                                    iA = cn.a(biometricManagerB);
                                }
                                String str3 = Build.MODEL;
                                if (Build.VERSION.SDK_INT >= 30) {
                                    if (iA == 0) {
                                        IntValue = iA;
                                    } else {
                                        keyguardManagerA = h31.a(applicationContext);
                                        if (keyguardManagerA == null) {
                                            zB = false;
                                        } else {
                                            zB = h31.b(keyguardManagerA);
                                        }
                                        if (!zB) {
                                            IntValue = -1;
                                        } else if (yyVar != null) {
                                            IntValue = 12;
                                        }
                                    }
                                } else if (iA == 0) {
                                    IntValue = iA;
                                } else {
                                    keyguardManagerA = h31.a(applicationContext);
                                    if (keyguardManagerA == null) {
                                        zB = false;
                                    } else {
                                        zB = h31.b(keyguardManagerA);
                                    }
                                    if (!zB) {
                                        IntValue = -1;
                                    } else if (yyVar != null) {
                                        IntValue = 12;
                                    }
                                }
                            }
                        } else if (biometricManagerB != null) {
                            IntValue = cn.a(biometricManagerB);
                        }
                    } else if (yyVar != null) {
                        IntValue = 12;
                    }
                    fg fgVar = IntValue != 0 ? IntValue != 11 ? fg.j : fg.i : fg.h;
                    String str4 = (String) hg.b.getValue();
                    boolean zH = dr0Var2.h(mainActivity);
                    Object objK = dr0Var2.K();
                    if (zH || objK == zy.a) {
                        objK = new ww(mainActivity, (byte) 5);
                        dr0Var2.f0(objK);
                    }
                    vs.h(fgVar, str4, (kp0) objK, dr0Var2, 0);
                    dr0Var2.p(false);
                } else {
                    dr0Var2.V(1645348859);
                    pg.a(0, dr0Var2);
                    dr0Var2.p(false);
                }
                break;
        }
        return j23Var;
    }
}
