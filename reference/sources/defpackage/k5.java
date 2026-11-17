package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k5 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new xh(((v5) obj).q());
            case 1:
                return new xh(((s5) obj).i);
            case 2:
                return new yk((y22) obj);
            case 3:
                return new xh(((tk) obj).q());
            case 4:
                return (l52) obj;
            case 5:
                return new xh((double[]) obj);
            default:
                return (fj2) obj;
        }
    }
}
