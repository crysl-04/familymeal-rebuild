package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 {
    public static final ys0 h;
    public static final ys0 i;
    public static final ys0 j;
    public static final ys0 k;
    public static final ys0 l;
    public static final ys0 m;
    public static final /* synthetic */ ys0[] n;

    static {
        ys0 ys0Var = new ys0("AARCH64", 0);
        h = ys0Var;
        ys0 ys0Var2 = new ys0("ARM", 1);
        i = ys0Var2;
        ys0 ys0Var3 = new ys0("OTHER", 2);
        j = ys0Var3;
        ys0 ys0Var4 = new ys0("PPC", 3);
        k = ys0Var4;
        ys0 ys0Var5 = new ys0("X86", 4);
        l = ys0Var5;
        ys0 ys0Var6 = new ys0("X86_64", 5);
        m = ys0Var6;
        n = new ys0[]{ys0Var, ys0Var2, ys0Var3, ys0Var4, ys0Var5, ys0Var6};
    }

    public static ys0 valueOf(String str) {
        return (ys0) Enum.valueOf(ys0.class, str);
    }

    public static ys0[] values() {
        return (ys0[]) n.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "aarch64";
        }
        if (iOrdinal == 1) {
            return "arm";
        }
        if (iOrdinal == 3) {
            return "ppc";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "other" : "x86_64";
        }
        return "x86";
    }
}
