package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p71 extends lt {
    public final u8 h = new u8();

    public p71(vp0 vp0Var) {
        vp0Var.h(this);
    }

    public static void o0(p71 p71Var, String str, nx nxVar, int i) {
        byte b = 1;
        if ((i & 1) != 0) {
            str = null;
        }
        p71Var.h.a(1, new o71(str != null ? new z61(str, (byte) 1) : null, new vv0((byte) 18), new nx(-857469575, true, new j9(nxVar, b))));
    }

    @Override // defpackage.lt
    public final u8 F() {
        return this.h;
    }

    public final void p0(int i, vp0 vp0Var, vp0 vp0Var2, nx nxVar) {
        this.h.a(i, new o71(vp0Var, vp0Var2, nxVar));
    }
}
