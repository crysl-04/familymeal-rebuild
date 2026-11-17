package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 {
    public transient int[] a = null;
    public final ArrayList b = new ArrayList();
    public transient int[] c = null;
    public final ArrayList d = new ArrayList();
    public transient int[] e = null;
    public final ArrayList f = new ArrayList();
    public transient int[] g = null;
    public final ArrayList h = new ArrayList();

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        int[] iArr = new int[size];
        this.a = iArr;
        Arrays.fill(iArr, -1);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        int[] iArr2 = new int[size];
        this.g = iArr2;
        Arrays.fill(iArr2, -1);
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int[] iArr3 = new int[size];
        this.e = iArr3;
        Arrays.fill(iArr3, -1);
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        int[] iArr4 = new int[size];
        this.c = iArr4;
        Arrays.fill(iArr4, -1);
        for (int i = 0; i < size; i++) {
            e33 e33Var = (e33) arrayList.get(i);
            if (!e33Var.p()) {
                arrayList2.add(e33Var);
                this.a[i] = arrayList2.size() - 1;
                if (!e33Var.v() || e33Var.l.signum() == 1) {
                    arrayList3.add(e33Var);
                    this.g[i] = arrayList3.size() - 1;
                }
                if (!e33Var.s() || e33Var.j.signum() == -1) {
                    arrayList4.add(e33Var);
                    this.e[i] = arrayList4.size() - 1;
                }
                if (e33Var.q) {
                    arrayList5.add(e33Var);
                    this.c[i] = arrayList5.size() - 1;
                }
            }
        }
    }
}
