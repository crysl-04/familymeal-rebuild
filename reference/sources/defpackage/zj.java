package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj implements kr0 {
    public static final zj a;
    private static final rh2 descriptor;

    static {
        zj zjVar = new zj();
        a = zjVar;
        o02 o02Var = new o02("com.familymeal.core.io.BackupCodec.Header", zjVar, 2);
        o02Var.l("format", false);
        o02Var.l("version", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        String strP = null;
        boolean z = true;
        int i = 0;
        int iZ = 0;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strP = hzVarD.p(rh2Var, 0);
                i |= 1;
            } else {
                if (iH != 1) {
                    throw new l23(iH);
                }
                iZ = hzVarD.z(rh2Var, 1);
                i |= 2;
            }
        }
        hzVarD.s(rh2Var);
        return new bk(strP, i, iZ);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        return new r21[]{bo2.a, ty0.a};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bk bkVar = (bk) obj;
        bkVar.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        bVarA.s(rh2Var, 0, bkVar.a);
        int i = bkVar.b;
        bVarA.g(rh2Var, 1);
        bVarA.k(i);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
