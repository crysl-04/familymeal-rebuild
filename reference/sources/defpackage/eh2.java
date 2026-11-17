package defpackage;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eh2 implements Comparator {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ eh2(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zr zrVar;
        zr zrVar2;
        byte b = this.h;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                l41 l41Var = ((wg2) obj).c;
                l41 l41Var2 = ((wg2) obj2).c;
                return l41Var.x() == l41Var2.x() ? uz0.i(l41Var.v(), l41Var2.v()) : Float.compare(l41Var.x(), l41Var2.x());
            case 1:
                int iCompare2 = ((eh2) obj3).compare(obj, obj2);
                return iCompare2 == 0 ? Integer.valueOf(((wg2) obj).f).compareTo(Integer.valueOf(((wg2) obj2).f)) : iCompare2;
            default:
                Map map = ((ez1) obj3).f;
                j62 j62Var = (j62) map.get((String) obj);
                int iOrdinal = 99;
                Integer numValueOf = Integer.valueOf((j62Var == null || (zrVar2 = j62Var.d) == null) ? 99 : zrVar2.ordinal());
                j62 j62Var2 = (j62) map.get((String) obj2);
                if (j62Var2 != null && (zrVar = j62Var2.d) != null) {
                    iOrdinal = zrVar.ordinal();
                }
                return numValueOf.compareTo(Integer.valueOf(iOrdinal));
        }
    }
}
