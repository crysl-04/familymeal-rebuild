package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class km0 {
    public static final km0 h;
    public static final km0 i;
    public static final km0 j;
    public static final /* synthetic */ km0[] k;

    static {
        km0 km0Var = new km0("Active", 0);
        h = km0Var;
        km0 km0Var2 = new km0("ActiveParent", 1);
        i = km0Var2;
        km0 km0Var3 = new km0("Captured", 2);
        km0 km0Var4 = new km0("Inactive", 3);
        j = km0Var4;
        k = new km0[]{km0Var, km0Var2, km0Var3, km0Var4};
    }

    public static km0 valueOf(String str) {
        return (km0) Enum.valueOf(km0.class, str);
    }

    public static km0[] values() {
        return (km0[]) k.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                wg.n();
                return false;
            }
        }
        return true;
    }
}
