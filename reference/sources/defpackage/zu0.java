package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 implements Iterable, l21 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ zu0(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return new z(aa3.B((Object[]) ((o9) obj).i));
            default:
                return new t80((u80) obj);
        }
    }
}
