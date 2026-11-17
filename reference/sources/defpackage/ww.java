package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.familymeal.app.MainActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ MainActivity i;

    public /* synthetic */ ww(MainActivity mainActivity, byte b) {
        this.h = b;
        this.i = mainActivity;
    }

    @Override // defpackage.kp0
    public final Object a() {
        String strValueOf;
        byte b = this.h;
        j23 j23Var = j23.a;
        byte b2 = 0;
        MainActivity mainActivity = this.i;
        switch (b) {
            case 0:
                mainActivity.reportFullyDrawn();
                return j23Var;
            case 1:
                return new jp0(mainActivity.m, new ww(mainActivity, b2));
            case 2:
                qa0 qa0Var = new qa0();
                mainActivity.a().e(qa0Var);
                return qa0Var;
            case 3:
                return new fc2(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            case 4:
                kq1 kq1Var = new kq1(new vw(mainActivity, b2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (uz0.g(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.h.a(new xw(kq1Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new l7(mainActivity, kq1Var, (byte) 1));
                    }
                }
                return kq1Var;
            default:
                int i = MainActivity.G;
                hg.b.setValue(null);
                Executor mainExecutor = mainActivity.getMainExecutor();
                gg ggVar = new gg(b2);
                if (mainExecutor != null) {
                    yo0 yo0Var = ((lo0) mainActivity.B.i).o;
                    g53 g53VarF = mainActivity.f();
                    e53 e53VarA = cy1.A(mainActivity);
                    e30 e30VarZ = cy1.z(mainActivity);
                    e53VarA.getClass();
                    e30VarZ.getClass();
                    wk wkVar = new wk(g53VarF, e53VarA, e30VarZ);
                    du duVarA = z72.a(jn.class);
                    String strB = duVarA.b();
                    if (strB != null) {
                        jn jnVar = (jn) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                        jnVar.b = mainExecutor;
                        jnVar.c = ggVar;
                        int i2 = Build.VERSION.SDK_INT;
                        int i3 = i2 >= 30 ? 32783 : 33023;
                        if (!uz0.m(i3)) {
                            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
                            sb.append(i2);
                            sb.append(": ");
                            if (i3 != 32783) {
                                strValueOf = i3 != 33023 ? String.valueOf(i3) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                            } else {
                                strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                            }
                            sb.append(strValueOf);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (uz0.l(i3)) {
                            gn gnVar = new gn(i3);
                            if (yo0Var.O()) {
                                return j23Var;
                            }
                            bn bnVar = (bn) yo0Var.D("androidx.biometric.BiometricFragment");
                            if (bnVar == null) {
                                bnVar = new bn();
                                ej ejVar = new ej(yo0Var);
                                ejVar.f(0, bnVar, "androidx.biometric.BiometricFragment");
                                ejVar.e(true, true);
                                yo0Var.A(true);
                                yo0Var.E();
                            }
                            if (bnVar.h() == null) {
                                return j23Var;
                            }
                            jn jnVar2 = bnVar.g0;
                            jnVar2.d = gnVar;
                            jnVar2.e = null;
                            jn jnVar3 = bnVar.g0;
                            jnVar3.getClass();
                            if (jnVar3.l) {
                                bnVar.f0.postDelayed(new an(bnVar), 600L);
                                return j23Var;
                            }
                            bnVar.L();
                            return j23Var;
                        }
                        wg.m("Negative text must be set and non-empty.");
                    } else {
                        wg.m("Local and anonymous classes can not be ViewModels");
                    }
                } else {
                    wg.m("Executor must not be null.");
                }
                return null;
        }
    }
}
