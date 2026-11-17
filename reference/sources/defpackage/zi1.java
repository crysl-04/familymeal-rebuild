package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 extends zd1 implements m21 {
    public final ix1 k;
    public Object l;

    public zi1(ix1 ix1Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.k = ix1Var;
        this.l = obj2;
    }

    @Override // defpackage.zd1, java.util.Map.Entry
    public final Object getValue() {
        return this.l;
    }

    @Override // defpackage.zd1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.l;
        this.l = obj;
        gx1 gx1Var = (gx1) this.k.i;
        cx1 cx1Var = gx1Var.k;
        Object obj3 = this.i;
        if (!cx1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = gx1Var.j;
        if (!z) {
            cx1Var.put(obj3, obj);
        } else {
            if (!z) {
                wg.p();
                return null;
            }
            f03 f03Var = gx1Var.h[gx1Var.i];
            Object obj4 = f03Var.h[f03Var.j];
            cx1Var.put(obj3, obj);
            gx1Var.c(obj4 != null ? obj4.hashCode() : 0, cx1Var.i, obj4, 0);
        }
        gx1Var.n = cx1Var.k;
        return obj2;
    }
}
