package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pg0 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg0(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        float f = 1.0f;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                int iOrdinal = ((kg0) obj).ordinal();
                if (iOrdinal == 0) {
                    ri0 ri0Var = ((ah0) obj4).a.a;
                    if (ri0Var != null) {
                        f = ri0Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    ri0 ri0Var2 = ((wh0) obj3).a.a;
                    f = ri0Var2 != null ? ri0Var2.a : ((si2) obj2).f;
                }
                return Float.valueOf(f);
            case 1:
                int iOrdinal2 = ((kg0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ad2 ad2Var = ((ah0) obj4).a.d;
                    if (ad2Var != null) {
                        f = ad2Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        wg.n();
                        return null;
                    }
                    ad2 ad2Var2 = ((wh0) obj3).a.d;
                    f = ad2Var2 != null ? ad2Var2.a : ((si2) obj2).g;
                }
                return Float.valueOf(f);
            default:
                return new bc((ll2) obj4, obj3, (oc) obj2, (byte) 0);
        }
    }
}
