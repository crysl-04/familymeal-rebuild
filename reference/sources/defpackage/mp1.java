package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mp1 implements r21 {
    public final d51 a = vs.N(g81.h, new jw0(this, (byte) 21));

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2VarD = d();
        hz hzVarD = v60Var.D(rh2VarD);
        int iH = hzVarD.h(d());
        if (iH != -1) {
            throw new wh2(jp1.h(iH, "Unexpected index "));
        }
        hzVarD.s(rh2VarD);
        return j23.a;
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        obj.getClass();
        bVar.a(d()).t(d());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return (rh2) this.a.getValue();
    }
}
