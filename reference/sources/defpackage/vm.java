package defpackage;

import java.util.concurrent.Executor;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vm implements qp1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ bn i;

    public /* synthetic */ vm(bn bnVar, byte b) {
        this.h = b;
        this.i = bnVar;
    }

    @Override // defpackage.qp1
    public final void w(Object obj) {
        byte b = this.h;
        byte b2 = 2;
        bn bnVar = this.i;
        switch (b) {
            case 0:
                en enVar = (en) obj;
                if (enVar != null) {
                    jn jnVar = bnVar.g0;
                    if (jnVar.j) {
                        jnVar.j = false;
                        Executor zmVar = jnVar.b;
                        if (zmVar == null) {
                            zmVar = new zm((byte) 1);
                        }
                        zmVar.execute(new z2(bnVar, enVar, b2));
                    }
                    bnVar.I();
                    jn jnVar2 = bnVar.g0;
                    vi1 vi1Var = jnVar2.n;
                    if (vi1Var == null) {
                        vi1Var = new vi1();
                        jnVar2.n = vi1Var;
                    }
                    jn.g(vi1Var, null);
                }
                break;
            case 1:
                um umVar = (um) obj;
                if (umVar != null) {
                    int i = umVar.a;
                    CharSequence charSequence = umVar.b;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i = 8;
                            break;
                    }
                    bnVar.J();
                    if (charSequence == null) {
                        charSequence = bnVar.m(R.string.default_error_msg) + " " + i;
                    }
                    bnVar.K(i, charSequence);
                    jn jnVar3 = bnVar.g0;
                    vi1 vi1Var2 = jnVar3.o;
                    if (vi1Var2 == null) {
                        vi1Var2 = new vi1();
                        jnVar3.o = vi1Var2;
                    }
                    jn.g(vi1Var2, null);
                }
                break;
            case 2:
                if (((CharSequence) obj) != null) {
                    bnVar.J();
                    jn jnVar4 = bnVar.g0;
                    vi1 vi1Var3 = jnVar4.o;
                    if (vi1Var3 == null) {
                        vi1Var3 = new vi1();
                        jnVar4.o = vi1Var3;
                    }
                    jn.g(vi1Var3, null);
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    bnVar.J();
                    jn jnVar5 = bnVar.g0;
                    if (jnVar5.j) {
                        Executor zmVar2 = jnVar5.b;
                        if (zmVar2 == null) {
                            zmVar2 = new zm((byte) 1);
                        }
                        zmVar2.execute(new q6(bnVar, b2));
                    }
                    jn jnVar6 = bnVar.g0;
                    vi1 vi1Var4 = jnVar6.q;
                    if (vi1Var4 == null) {
                        vi1Var4 = new vi1();
                        jnVar6.q = vi1Var4;
                    }
                    jn.g(vi1Var4, Boolean.FALSE);
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    String strM = bnVar.g0.d != null ? "" : null;
                    if (strM == null) {
                        strM = bnVar.m(R.string.default_error_msg);
                    }
                    bnVar.K(13, strM);
                    bnVar.H(2);
                    bnVar.g0.f(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    bnVar.H(1);
                    bnVar.I();
                    jn jnVar7 = bnVar.g0;
                    vi1 vi1Var5 = jnVar7.s;
                    if (vi1Var5 == null) {
                        vi1Var5 = new vi1();
                        jnVar7.s = vi1Var5;
                    }
                    jn.g(vi1Var5, Boolean.FALSE);
                }
                break;
        }
    }
}
