package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public final String a;
    public final zp0 b;
    public final boolean c;

    public /* synthetic */ ch2(String str) {
        this(str, new kc2((byte) 23));
    }

    public final String toString() {
        return jp1.j("AccessibilityKey: ", this.a);
    }

    public ch2(String str, zp0 zp0Var) {
        this.a = str;
        this.b = zp0Var;
    }

    public ch2(String str, int i) {
        this(str);
        this.c = true;
    }

    public ch2(String str, boolean z, zp0 zp0Var) {
        this(str, zp0Var);
        this.c = z;
    }
}
