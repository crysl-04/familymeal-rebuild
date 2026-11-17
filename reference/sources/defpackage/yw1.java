package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 implements zp0 {
    public final /* synthetic */ dy1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ps2 j;
    public final /* synthetic */ ap1 k;

    public yw1(dy1 dy1Var, int i, ps2 ps2Var, ap1 ap1Var) {
        this.h = dy1Var;
        this.i = i;
        this.j = ps2Var;
        this.k = ap1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        Integer numValueOf;
        String strConcat;
        String str;
        long j;
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            dy1 dy1Var = this.h;
            Integer num = dy1Var.d;
            if (num != null) {
                numValueOf = Integer.valueOf(this.i - num.intValue());
            } else {
                numValueOf = null;
            }
            ir0 ir0Var = dy1Var.c;
            if (numValueOf != null) {
                strConcat = numValueOf.intValue() + " 岁" + ir0Var.h;
            } else {
                strConcat = "年龄未填·".concat(ir0Var.h);
            }
            ps2 ps2Var = this.j;
            String str2 = ps2Var.c.h;
            ap1 ap1Var = this.k;
            if (ap1Var != null) {
                str = t03.t(0, ap1Var.a) + "–" + t03.t(0, ap1Var.b) + " kcal/天";
            } else {
                str = "资料待补全";
            }
            String strE0 = dv.E0(gi.W(new String[]{strConcat, str2, str, ps2Var.b == qs2.h ? "手动目标" : null}), " · ", null, null, null, 62);
            if (ap1Var == null) {
                dr0Var.V(-1142146531);
                j = ((pv) dr0Var.j(rv.a)).w;
            } else {
                dr0Var.V(-1142145336);
                j = ((pv) dr0Var.j(rv.a)).s;
            }
            dr0Var.p(false);
            gw2.b(strE0, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262138);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
