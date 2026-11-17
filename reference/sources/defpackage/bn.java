package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.familymeal.app.MainActivity;
import java.util.concurrent.Executor;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class bn extends jo0 {
    public final Handler f0 = new Handler(Looper.getMainLooper());
    public jn g0;

    @Override // defpackage.jo0
    public final void C() {
        int i;
        this.L = true;
        if (Build.VERSION.SDK_INT == 29) {
            jn jnVar = this.g0;
            gn gnVar = jnVar.d;
            if (gnVar != null) {
                fn fnVar = jnVar.e;
                i = gnVar.a;
                if (i == 0) {
                    i = fnVar != null ? 15 : 255;
                }
            } else {
                i = 0;
            }
            if (uz0.l(i)) {
                jn jnVar2 = this.g0;
                jnVar2.m = true;
                this.f0.postDelayed(new an(jnVar2, (byte) 2), 250L);
            }
        }
    }

    public final void H(int i) {
        if (i == 3 || !this.g0.m) {
            J();
            jn jnVar = this.g0;
            g2 g2Var = jnVar.g;
            if (g2Var == null) {
                g2Var = new g2((byte) 4, false);
                jnVar.g = g2Var;
            }
            CancellationSignal cancellationSignal = (CancellationSignal) g2Var.i;
            if (cancellationSignal != null) {
                try {
                    tq.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                g2Var.i = null;
            }
        }
    }

    public final void I() {
        jn jnVar = this.g0;
        jnVar.i = false;
        jnVar.i = false;
        if (p()) {
            yo0 yo0VarL = l();
            mj0 mj0Var = (mj0) yo0VarL.D("androidx.biometric.FingerprintDialogFragment");
            if (mj0Var != null) {
                if (mj0Var.p()) {
                    mj0Var.H(false);
                } else {
                    ej ejVar = new ej(yo0VarL);
                    ejVar.h(mj0Var);
                    ejVar.e(true, true);
                }
            }
        }
        if (!this.g0.k && p()) {
            ej ejVar2 = new ej(l());
            ejVar2.h(this);
            ejVar2.e(true, true);
        }
        Context contextJ = j();
        if (contextJ != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29 || str == null) {
                return;
            }
            for (String str2 : contextJ.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                if (str.equals(str2)) {
                    jn jnVar2 = this.g0;
                    jnVar2.l = true;
                    this.f0.postDelayed(new an(jnVar2, (byte) 1), 600L);
                    return;
                }
            }
        }
    }

    public final void J() {
        if (h() == null || this.g0.e == null) {
            return;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
    }

    public final void K(int i, CharSequence charSequence) {
        jn jnVar = this.g0;
        if (!jnVar.k && jnVar.j) {
            jnVar.j = false;
            Executor zmVar = jnVar.b;
            if (zmVar == null) {
                zmVar = new zm((byte) 1);
            }
            zmVar.execute(new z2(this, i, charSequence));
        }
        I();
    }

    public final void L() {
        int i;
        if (this.g0.i || j() == null) {
            return;
        }
        jn jnVar = this.g0;
        jnVar.i = true;
        jnVar.j = true;
        J();
        BiometricPrompt.Builder builderD = wm.d(F().getApplicationContext());
        jn jnVar2 = this.g0;
        gn gnVar = jnVar2.d;
        String str = gnVar != null ? "解锁家庭食谱" : null;
        String str2 = gnVar != null ? "使用指纹、面容或锁屏密码" : null;
        jnVar2.getClass();
        if (str != null) {
            wm.g(builderD, str);
        }
        if (str2 != null) {
            wm.f(builderD, str2);
        }
        String str3 = this.g0.d != null ? "" : null;
        if (!TextUtils.isEmpty(str3)) {
            Executor zmVar = this.g0.b;
            if (zmVar == null) {
                zmVar = new zm((byte) 1);
            }
            jn jnVar3 = this.g0;
            in inVar = jnVar3.h;
            if (inVar == null) {
                inVar = new in(jnVar3);
                jnVar3.h = inVar;
            }
            wm.e(builderD, str3, zmVar, inVar);
        }
        gn gnVar2 = this.g0.d;
        xm.a(builderD, true);
        jn jnVar4 = this.g0;
        gn gnVar3 = jnVar4.d;
        boolean z = false;
        if (gnVar3 != null) {
            fn fnVar = jnVar4.e;
            i = gnVar3.a;
            if (i == 0) {
                i = fnVar != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ym.a(builderD, i);
        } else {
            xm.b(builderD, uz0.l(i));
        }
        BiometricPrompt biometricPromptC = wm.c(builderD);
        Context contextJ = j();
        BiometricPrompt.CryptoObject cryptoObjectW = dt.W(this.g0.e);
        jn jnVar5 = this.g0;
        g2 g2Var = jnVar5.g;
        if (g2Var == null) {
            g2Var = new g2((byte) 4, z);
            jnVar5.g = g2Var;
        }
        CancellationSignal cancellationSignalB = (CancellationSignal) g2Var.i;
        if (cancellationSignalB == null) {
            cancellationSignalB = tq.b();
            g2Var.i = cancellationSignalB;
        }
        zm zmVar2 = new zm((byte) 0);
        jn jnVar6 = this.g0;
        ix0 ix0Var = jnVar6.f;
        if (ix0Var == null) {
            ix0Var = new ix0(new hn(jnVar6));
            jnVar6.f = ix0Var;
        }
        BiometricPrompt.AuthenticationCallback authenticationCallbackA = (BiometricPrompt.AuthenticationCallback) ix0Var.i;
        if (authenticationCallbackA == null) {
            authenticationCallbackA = li.a((hn) ix0Var.j);
            ix0Var.i = authenticationCallbackA;
        }
        try {
            if (cryptoObjectW == null) {
                wm.b(biometricPromptC, cancellationSignalB, zmVar2, authenticationCallbackA);
            } else {
                wm.a(biometricPromptC, cryptoObjectW, cancellationSignalB, zmVar2, authenticationCallbackA);
            }
        } catch (NullPointerException unused) {
            K(1, contextJ != null ? contextJ.getString(R.string.default_error_msg) : "");
        }
    }

    @Override // defpackage.jo0
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        if (i == 1) {
            jn jnVar = this.g0;
            jnVar.k = false;
            if (i2 != -1) {
                K(10, m(R.string.generic_error_user_canceled));
                return;
            }
            en enVar = new en();
            if (jnVar.j) {
                jnVar.j = false;
                Executor zmVar = jnVar.b;
                if (zmVar == null) {
                    zmVar = new zm((byte) 1);
                }
                zmVar.execute(new z2((Object) this, (Object) enVar, (byte) 2));
            }
            I();
        }
    }

    @Override // defpackage.jo0
    public final void v(Bundle bundle) {
        Bundle bundle2;
        byte b = 1;
        this.L = true;
        Bundle bundle3 = this.i;
        byte b2 = 0;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.C.W(bundle2);
            yo0 yo0Var = this.C;
            yo0Var.H = false;
            yo0Var.I = false;
            yo0Var.O.g = false;
            yo0Var.v(1);
        }
        yo0 yo0Var2 = this.C;
        if (yo0Var2.v < 1) {
            yo0Var2.H = false;
            yo0Var2.I = false;
            yo0Var2.O.g = false;
            yo0Var2.v(1);
        }
        if (h() == null) {
            return;
        }
        MainActivity mainActivityH = h();
        mainActivityH.getClass();
        g53 g53VarF = mainActivityH.f();
        e53 e53VarA = cy1.A(mainActivityH);
        e30 e30VarZ = cy1.z(mainActivityH);
        e53VarA.getClass();
        e30VarZ.getClass();
        wk wkVar = new wk(g53VarF, e53VarA, e30VarZ);
        du duVarA = z72.a(jn.class);
        String strB = duVarA.b();
        if (strB == null) {
            wg.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        jn jnVar = (jn) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.g0 = jnVar;
        vi1 vi1Var = jnVar.n;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar.n = vi1Var;
        }
        vi1Var.d(this, new vm(this, b2));
        jn jnVar2 = this.g0;
        vi1 vi1Var2 = jnVar2.o;
        if (vi1Var2 == null) {
            vi1Var2 = new vi1();
            jnVar2.o = vi1Var2;
        }
        vi1Var2.d(this, new vm(this, b));
        jn jnVar3 = this.g0;
        vi1 vi1Var3 = jnVar3.p;
        if (vi1Var3 == null) {
            vi1Var3 = new vi1();
            jnVar3.p = vi1Var3;
        }
        vi1Var3.d(this, new vm(this, (byte) 2));
        jn jnVar4 = this.g0;
        vi1 vi1Var4 = jnVar4.q;
        if (vi1Var4 == null) {
            vi1Var4 = new vi1();
            jnVar4.q = vi1Var4;
        }
        vi1Var4.d(this, new vm(this, (byte) 3));
        jn jnVar5 = this.g0;
        vi1 vi1Var5 = jnVar5.r;
        if (vi1Var5 == null) {
            vi1Var5 = new vi1();
            jnVar5.r = vi1Var5;
        }
        vi1Var5.d(this, new vm(this, (byte) 4));
        jn jnVar6 = this.g0;
        vi1 vi1Var6 = jnVar6.s;
        if (vi1Var6 == null) {
            vi1Var6 = new vi1();
            jnVar6.s = vi1Var6;
        }
        vi1Var6.d(this, new vm(this, (byte) 5));
    }
}
