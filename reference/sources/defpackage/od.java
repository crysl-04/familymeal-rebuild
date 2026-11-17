package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class od implements CharSequence {
    public final List h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;

    static {
        k42 k42Var = mc2.a;
    }

    public od(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.h = list;
        this.i = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                nd ndVar = (nd) list.get(i);
                Object obj = ndVar.a;
                if (obj instanceof yl2) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ndVar);
                } else if (obj instanceof cu1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ndVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.j = arrayList;
        this.k = arrayList2;
        List listM0 = arrayList2 != null ? dv.M0(arrayList2, new mm0((byte) 5)) : null;
        if (listM0 == null || listM0.isEmpty()) {
            return;
        }
        int i2 = ((nd) dv.x0(listM0)).c;
        ri1 ri1Var = ky0.a;
        ri1 ri1Var2 = new ri1(1);
        ri1Var2.a(i2);
        int size2 = listM0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            nd ndVar2 = (nd) listM0.get(i3);
            while (ri1Var2.b != 0) {
                int iD = ri1Var2.d();
                if (ndVar2.b < iD) {
                    int i4 = ndVar2.c;
                    if (i4 <= iD) {
                        break;
                    }
                    bx0.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                    break;
                }
                ri1Var2.e(ri1Var2.b - 1);
            }
            ri1Var2.a(ndVar2.c);
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final od subSequence(int i, int i2) {
        if (!(i <= i2)) {
            bx0.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.i;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        od odVar = pd.a;
        if (i > i2) {
            bx0.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.h;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                nd ndVar = (nd) list.get(i3);
                int i4 = ndVar.b;
                int i5 = ndVar.c;
                if (pd.b(i, i2, i4, i5)) {
                    arrayList2.add(new nd(ndVar.a, Math.max(i, ndVar.b) - i, Math.min(i2, i5) - i, ndVar.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new od(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.i.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return uz0.g(this.i, odVar.i) && uz0.g(this.h, odVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        List list = this.h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.i.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.i;
    }

    public /* synthetic */ od(String str) {
        this(str, ag0.h);
    }

    public od(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
