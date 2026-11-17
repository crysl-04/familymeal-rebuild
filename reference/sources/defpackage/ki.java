package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ki extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ ni a;

    public ki(ni niVar) {
        this.a = niVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((hn) this.a).a;
        if (weakReference.get() == null || ((jn) weakReference.get()).k || !((jn) weakReference.get()).j) {
            return;
        }
        jn jnVar = (jn) weakReference.get();
        um umVar = new um(i, charSequence);
        vi1 vi1Var = jnVar.o;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar.o = vi1Var;
        }
        jn.g(vi1Var, umVar);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((hn) this.a).a;
        if (weakReference.get() == null || !((jn) weakReference.get()).j) {
            return;
        }
        jn jnVar = (jn) weakReference.get();
        vi1 vi1Var = jnVar.q;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar.q = vi1Var;
        }
        jn.g(vi1Var, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int iA;
        BiometricPrompt.CryptoObject cryptoObject;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null && j30.d(cryptoObject) == null && j30.f(cryptoObject) == null && j30.e(cryptoObject) == null && Build.VERSION.SDK_INT >= 30) {
            k30.b(cryptoObject);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = mi.a(authenticationResult);
            } else {
                iA = -1;
            }
        } else if (i == 29) {
            iA = -1;
        } else {
            iA = 2;
        }
        en enVar = new en();
        WeakReference weakReference = ((hn) this.a).a;
        if (weakReference.get() == null || !((jn) weakReference.get()).j) {
            return;
        }
        if (iA == -1) {
            gn gnVar = ((jn) weakReference.get()).d;
            enVar = new en();
        }
        jn jnVar = (jn) weakReference.get();
        vi1 vi1Var = jnVar.n;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar.n = vi1Var;
        }
        jn.g(vi1Var, enVar);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
