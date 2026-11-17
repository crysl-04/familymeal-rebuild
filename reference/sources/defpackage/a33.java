package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a33 {
    public static final vp1 a = new vp1(wp1.a, 0, 0);

    public static final hz2 a(w53 w53Var, od odVar) {
        hz2 hz2VarA = w53Var.a(odVar);
        int length = odVar.i.length();
        od odVar2 = hz2VarA.a;
        xp1 xp1Var = hz2VarA.b;
        int length2 = odVar2.i.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(xp1Var.s(i), length2, i);
        }
        b(xp1Var.s(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(xp1Var.n(i2), length, i2);
        }
        c(xp1Var.n(length2), length, length2);
        return new hz2(odVar2, new vp1(xp1Var, odVar.i.length(), odVar2.i.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = wi0.k("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
        sbK.append(i2);
        sbK.append("]");
        dx0.c(sbK.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = wi0.k("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
        sbK.append(i2);
        sbK.append("]");
        dx0.c(sbK.toString());
    }
}
