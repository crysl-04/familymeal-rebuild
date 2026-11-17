package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class md implements Appendable {
    public final StringBuilder h = new StringBuilder(16);
    public final ArrayList i = new ArrayList();

    public md(od odVar) {
        a(odVar);
    }

    public final void a(od odVar) {
        StringBuilder sb = this.h;
        int length = sb.length();
        sb.append(odVar.i);
        List list = odVar.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nd ndVar = (nd) list.get(i);
                this.i.add(new ld(ndVar.a, ndVar.b + length, ndVar.c + length, ndVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof od;
        StringBuilder sb = this.h;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        od odVar = (od) charSequence;
        int length = sb.length();
        sb.append((CharSequence) odVar.i, i, i2);
        List listA = pd.a(odVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                nd ndVar = (nd) listA.get(i3);
                this.i.add(new ld(ndVar.a, ndVar.b + length, ndVar.c + length, ndVar.d));
            }
        }
        return this;
    }

    public final od b() {
        StringBuilder sb = this.h;
        String string = sb.toString();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ld ldVar = (ld) arrayList.get(i);
            int length = sb.length();
            int i2 = ldVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                bx0.b("Item.end should be set first");
            }
            arrayList2.add(new nd(ldVar.a, ldVar.b, length, ldVar.d));
        }
        return new od(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof od) {
            a((od) charSequence);
            return this;
        }
        this.h.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.h.append(c);
        return this;
    }
}
