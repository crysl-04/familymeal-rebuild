package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts2 implements kr0 {
    public static final ts2 a;
    private static final rh2 descriptor;

    static {
        ts2 ts2Var = new ts2();
        a = ts2Var;
        o02 o02Var = new o02("com.familymeal.core.io.TargetsDto", ts2Var, 5);
        o02Var.l("kcal", false);
        o02Var.l("protein", false);
        o02Var.l("fat", false);
        o02Var.l("carb", false);
        o02Var.l("fiber", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        int i = 0;
        q52 q52Var = null;
        q52 q52Var2 = null;
        q52 q52Var3 = null;
        q52 q52Var4 = null;
        q52 q52Var5 = null;
        boolean z = true;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                q52Var = (q52) hzVarD.y(rh2Var, 0, o52.a, q52Var);
                i |= 1;
            } else if (iH == 1) {
                q52Var2 = (q52) hzVarD.y(rh2Var, 1, o52.a, q52Var2);
                i |= 2;
            } else if (iH == 2) {
                q52Var3 = (q52) hzVarD.y(rh2Var, 2, o52.a, q52Var3);
                i |= 4;
            } else if (iH == 3) {
                q52Var4 = (q52) hzVarD.y(rh2Var, 3, o52.a, q52Var4);
                i |= 8;
            } else {
                if (iH != 4) {
                    throw new l23(iH);
                }
                q52Var5 = (q52) hzVarD.y(rh2Var, 4, o52.a, q52Var5);
                i |= 16;
            }
        }
        hzVarD.s(rh2Var);
        return new vs2(i, q52Var, q52Var2, q52Var3, q52Var4, q52Var5);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        o52 o52Var = o52.a;
        return new r21[]{o52Var, o52Var, o52Var, o52Var, o52Var};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        vs2 vs2Var = (vs2) obj;
        vs2Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        o52 o52Var = o52.a;
        bVarA.o(rh2Var, 0, o52Var, vs2Var.a);
        bVarA.o(rh2Var, 1, o52Var, vs2Var.b);
        bVarA.o(rh2Var, 2, o52Var, vs2Var.c);
        bVarA.o(rh2Var, 3, o52Var, vs2Var.d);
        bVarA.o(rh2Var, 4, o52Var, vs2Var.e);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
