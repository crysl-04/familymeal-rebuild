package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class th2 implements rh2, aq {
    public final String a;
    public final p02 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final rh2[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final rh2[] j;
    public final yq2 k;

    public th2(String str, p02 p02Var, int i, List list, eu euVar) {
        this.a = str;
        this.b = p02Var;
        this.c = i;
        ArrayList arrayList = euVar.b;
        HashSet hashSet = new HashSet(ee1.K(ev.o0(arrayList, 12)));
        dv.P0(arrayList, hashSet);
        this.d = hashSet;
        byte b = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = t03.p(euVar.d);
        this.g = (List[]) euVar.e.toArray(new List[0]);
        ArrayList arrayList2 = euVar.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zArr[i2] = ((Boolean) obj).booleanValue();
            i2++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        zu0 zu0Var = new zu0(new o9((Object) strArr, (byte) 5), b);
        byte b2 = 10;
        ArrayList arrayList3 = new ArrayList(ev.o0(zu0Var, 10));
        Iterator it = zu0Var.iterator();
        while (true) {
            z zVar = (z) it;
            if (!((Iterator) zVar.j).hasNext()) {
                this.i = ee1.M(arrayList3);
                this.j = t03.p(list);
                this.k = new yq2(new xu1(this, b2));
                return;
            }
            yu0 yu0Var = (yu0) zVar.next();
            arrayList3.add(new wt1(yu0Var.b, Integer.valueOf(yu0Var.a)));
        }
    }

    @Override // defpackage.rh2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.rh2
    public final String b() {
        return this.a;
    }

    @Override // defpackage.rh2
    public final p02 c() {
        return this.b;
    }

    @Override // defpackage.rh2
    public final int d() {
        return this.c;
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th2) {
            rh2 rh2Var = (rh2) obj;
            if (this.a.equals(rh2Var.b()) && Arrays.equals(this.j, ((th2) obj).j)) {
                int iD = rh2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        rh2[] rh2VarArr = this.f;
                        if (uz0.g(rh2VarArr[i2].b(), rh2Var.j(i2).b()) && uz0.g(rh2VarArr[i2].c(), rh2Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aq
    public final Set g() {
        return this.d;
    }

    @Override // defpackage.rh2
    public final List getAnnotations() {
        return ag0.h;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        return this.g[i];
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        return this.f[i];
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        return this.h[i];
    }

    public final String toString() {
        return p02.M(this);
    }
}
