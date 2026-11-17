package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yj {
    public static final xj Companion = new xj();
    public static final d51[] j;
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;

    static {
        r3 r3Var = new r3((byte) 17);
        g81 g81Var = g81.h;
        j = new d51[]{null, null, null, null, vs.N(g81Var, r3Var), vs.N(g81Var, new r3((byte) 18)), vs.N(g81Var, new r3((byte) 19)), vs.N(g81Var, new r3((byte) 20)), vs.N(g81Var, new r3((byte) 21))};
    }

    public /* synthetic */ yj(int i, String str, int i2, String str2, boolean z, List list, List list2, List list3, List list4, Map map) {
        if (383 != (i & 383)) {
            m02.x(i, 383, wj.a.d());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = list2;
        this.g = list3;
        if ((i & 128) == 0) {
            this.h = ag0.h;
        } else {
            this.h = list4;
        }
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj)) {
            return false;
        }
        yj yjVar = (yj) obj;
        return uz0.g(this.a, yjVar.a) && this.b == yjVar.b && uz0.g(this.c, yjVar.c) && this.d == yjVar.d && uz0.g(this.e, yjVar.e) && uz0.g(this.f, yjVar.f) && uz0.g(this.g, yjVar.g) && uz0.g(this.h, yjVar.h) && uz0.g(this.i, yjVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + jp1.g(this.h, jp1.g(this.g, jp1.g(this.f, jp1.g(this.e, jp1.c(jp1.f(this.c, jp1.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31), 31);
    }

    public final String toString() {
        return "FileDto(format=" + this.a + ", version=" + this.b + ", exportedAt=" + this.c + ", includesBodyData=" + this.d + ", ingredients=" + this.e + ", recipes=" + this.f + ", persons=" + this.g + ", weightEntries=" + this.h + ", schedule=" + this.i + ")";
    }

    public yj(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LinkedHashMap linkedHashMap) {
        this.a = "meal-planner-backup";
        this.b = 1;
        this.c = str;
        this.d = z;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = arrayList4;
        this.i = linkedHashMap;
    }
}
