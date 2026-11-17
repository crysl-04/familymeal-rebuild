package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 {
    public final ri0 a;
    public final ck2 b;
    public final bs c;
    public final ad2 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ pz2(ri0 ri0Var, ck2 ck2Var, bs bsVar, ad2 ad2Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : ri0Var, (i & 2) != 0 ? null : ck2Var, (i & 4) != 0 ? null : bsVar, (i & 8) != 0 ? null : ad2Var, (i & 32) == 0, (i & 64) != 0 ? bg0.h : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz2)) {
            return false;
        }
        pz2 pz2Var = (pz2) obj;
        return uz0.g(this.a, pz2Var.a) && uz0.g(this.b, pz2Var.b) && uz0.g(this.c, pz2Var.c) && uz0.g(this.d, pz2Var.d) && this.e == pz2Var.e && uz0.g(this.f, pz2Var.f);
    }

    public final int hashCode() {
        ri0 ri0Var = this.a;
        int iHashCode = (ri0Var == null ? 0 : ri0Var.hashCode()) * 31;
        ck2 ck2Var = this.b;
        int iHashCode2 = (iHashCode + (ck2Var == null ? 0 : ck2Var.hashCode())) * 31;
        bs bsVar = this.c;
        int iHashCode3 = (iHashCode2 + (bsVar == null ? 0 : bsVar.hashCode())) * 31;
        ad2 ad2Var = this.d;
        return this.f.hashCode() + jp1.c((iHashCode3 + (ad2Var != null ? ad2Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public pz2(ri0 ri0Var, ck2 ck2Var, bs bsVar, ad2 ad2Var, boolean z, Map map) {
        this.a = ri0Var;
        this.b = ck2Var;
        this.c = bsVar;
        this.d = ad2Var;
        this.e = z;
        this.f = map;
    }
}
