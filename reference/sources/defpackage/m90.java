package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m90 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ m90(ny1[] ny1VarArr, ua2 ua2Var, int i, int[] iArr) {
        this.h = (byte) 2;
        this.j = ny1VarArr;
        this.k = ua2Var;
        this.i = i;
        this.l = iArr;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        int i = 0;
        j23 j23Var = j23.a;
        Object obj2 = this.l;
        int i2 = this.i;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                sy0 sy0Var = (sy0) obj3;
                bj1 bj1Var = (bj1) obj2;
                if (obj == ((o90) obj4)) {
                    li1.g("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof qn2)) {
                    return j23Var;
                }
                int i3 = sy0Var.a - i2;
                int iD = bj1Var.d(obj);
                bj1Var.g(Math.min(i3, iD >= 0 ? bj1Var.c[iD] : Integer.MAX_VALUE), obj);
                return j23Var;
            case 1:
                qt0 qt0Var = (qt0) obj4;
                bf1 bf1Var = (bf1) obj3;
                ny1 ny1Var = (ny1) obj2;
                my1 my1Var = (my1) obj;
                int i4 = qt0Var.i;
                bv2 bv2Var = qt0Var.h;
                hz2 hz2Var = qt0Var.j;
                kw2 kw2Var = (kw2) qt0Var.k.a();
                bv2Var.a(ks1.i, h12.j(my1Var, i4, hz2Var, kw2Var != null ? kw2Var.a : null, bf1Var.getLayoutDirection() == u31.i, ny1Var.h), i2, ny1Var.h);
                my1.k(my1Var, ny1Var, Math.round(-bv2Var.a.g()), 0);
                return j23Var;
            default:
                ny1[] ny1VarArr = (ny1[]) obj4;
                ua2 ua2Var = (ua2) obj3;
                int[] iArr = (int[]) obj2;
                my1 my1Var2 = (my1) obj;
                int length = ny1VarArr.length;
                int i5 = 0;
                while (i < length) {
                    ny1 ny1Var2 = ny1VarArr[i];
                    int i6 = i5 + 1;
                    ny1Var2.getClass();
                    Object objL = ny1Var2.l();
                    sa2 sa2Var = objL instanceof sa2 ? (sa2) objL : null;
                    f30 f30Var = sa2Var != null ? sa2Var.c : null;
                    my1.i(my1Var2, ny1Var2, iArr[i5], f30Var != null ? f30Var.h.a(ny1Var2.i, i2, u31.h) : ua2Var.b.a(ny1Var2.i, i2));
                    i++;
                    i5 = i6;
                }
                return j23Var;
        }
    }

    public /* synthetic */ m90(byte b, int i, Object obj, Object obj2, Object obj3) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.i = i;
    }
}
