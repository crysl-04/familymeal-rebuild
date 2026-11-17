package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class uz {
    public static final ie0 a = new ie0(new r3(27), (byte) 1);
    public static final ie0 b = new ie0(new r3(28), (byte) 1);
    public static final ie0 c = new ie0(new sz((byte) 3), (byte) 1);
    public static final ie0 d = new ie0(new sz((byte) 4), (byte) 1);
    public static final ie0 e = new ie0(new sz((byte) 5), (byte) 1);
    public static final ie0 f = new ie0(new sz((byte) 6), (byte) 1);
    public static final ie0 g = new ie0(new sz((byte) 7), (byte) 1);
    public static final ie0 h = new ie0(new sz((byte) 9), (byte) 1);
    public static final ie0 i = new ie0(new sz((byte) 10), (byte) 1);
    public static final ie0 j = new ie0(new sz((byte) 11), (byte) 1);
    public static final ie0 k = new ie0(new sz((byte) 8), (byte) 1);
    public static final ie0 l = new ie0(new sz((byte) 12), (byte) 1);
    public static final ie0 m = new ie0(new sz((byte) 13), (byte) 1);
    public static final ie0 n = new ie0(new sz((byte) 14), (byte) 1);
    public static final ie0 o = new ie0(new sz((byte) 15), (byte) 1);
    public static final ie0 p = new ie0(new sz((byte) 16), (byte) 1);
    public static final ie0 q = new ie0(new sz((byte) 17), (byte) 1);
    public static final ie0 r = new ie0(new sz((byte) 18), (byte) 1);
    public static final ie0 s = new ie0(new sz((byte) 19), (byte) 1);
    public static final ie0 t = new ie0(new r3(29), (byte) 1);
    public static final ie0 u = new ie0(new sz((byte) 0), (byte) 1);
    public static final ie0 v = new ie0(new sz((byte) 1), (byte) 1);
    public static final ie0 w = new ie0(new sz((byte) 2), (byte) 1);
    public static final ie0 x = new ie0(new sz((byte) 27), (byte) 0);
    public static final ie0 y = new ie0(new sz((byte) 26), (byte) 1);

    public static final void a(t6 t6Var, vz1 vz1Var, nx nxVar, dr0 dr0Var, int i2) {
        dr0Var.W(1925803616);
        int i3 = i2 | (dr0Var.f(t6Var) ? 4 : 2) | (dr0Var.f(vz1Var) ? 32 : 16) | (dr0Var.h(nxVar) ? 256 : 128);
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            i42 i42VarA = a.a(t6Var.getAccessibilityManager());
            i42 i42VarA2 = b.a(t6Var.getAutofill());
            i42 i42VarA3 = d.a(t6Var.getAutofillManager());
            i42 i42VarA4 = c.a(t6Var.getAutofillTree());
            i42 i42VarA5 = e.a(t6Var.getClipboardManager());
            i42 i42VarA6 = f.a(t6Var.getClipboard());
            i42 i42VarA7 = h.a(t6Var.getDensity());
            i42 i42VarA8 = i.a(t6Var.getFocusOwner());
            i42 i42VarA9 = j.a(t6Var.getFontLoader());
            i42VarA9.g = false;
            i42 i42VarA10 = k.a(t6Var.getFontFamilyResolver());
            i42VarA10.g = false;
            i42 i42VarA11 = l.a(t6Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z || objK == yyVar) {
                objK = new d6(t6Var, (byte) 5);
                dr0Var.f0(objK);
            }
            i42 i42VarC = m.c((vp0) objK);
            i42 i42VarA12 = n.a(t6Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objK2 = dr0Var.K();
            if (z2 || objK2 == yyVar) {
                objK2 = new d6(t6Var, (byte) 6);
                dr0Var.f0(objK2);
            }
            i42 i42VarC2 = p.c((vp0) objK2);
            boolean z3 = i4 == 4;
            Object objK3 = dr0Var.K();
            if (z3 || objK3 == yyVar) {
                objK3 = new d6(t6Var, (byte) 7);
                dr0Var.f0(objK3);
            }
            i42 i42VarC3 = q.c((vp0) objK3);
            boolean z4 = i4 == 4;
            Object objK4 = dr0Var.K();
            byte b2 = 8;
            if (z4 || objK4 == yyVar) {
                objK4 = new d6(t6Var, b2);
                dr0Var.f0(objK4);
            }
            i42 i42VarC4 = r.c((vp0) objK4);
            i42 i42VarA13 = s.a(vz1Var);
            i42 i42VarA14 = t.a(t6Var.getViewConfiguration());
            i42 i42VarA15 = u.a(t6Var.getWindowInfo());
            boolean z5 = i4 == 4;
            Object objK5 = dr0Var.K();
            if (z5 || objK5 == yyVar) {
                objK5 = new d6(t6Var, (byte) 9);
                dr0Var.f0(objK5);
            }
            ys.b(new i42[]{i42VarA, i42VarA2, i42VarA3, i42VarA4, i42VarA5, i42VarA6, i42VarA7, i42VarA8, i42VarA9, i42VarA10, i42VarA11, i42VarC, i42VarA12, i42VarC2, i42VarC3, i42VarC4, i42VarA13, i42VarA14, i42VarA15, w.c((vp0) objK5), g.a(t6Var.getGraphicsContext()), qb1.a.a(t6Var.getRetainedValuesStore()), o.a(t6Var.getLocaleList())}, nxVar, dr0Var, 8 | ((i3 >> 3) & 112));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(t6Var, vz1Var, nxVar, i2, (byte) 3);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
