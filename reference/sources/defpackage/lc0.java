package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 {
    public static final lc0 h;
    public static final lc0 i;
    public static final lc0 j;
    public static final /* synthetic */ lc0[] k;

    static {
        lc0 lc0Var = new lc0("Yes", 0);
        h = lc0Var;
        lc0 lc0Var2 = new lc0("No", 1);
        i = lc0Var2;
        lc0 lc0Var3 = new lc0("NotInitialized", 2);
        j = lc0Var3;
        k = new lc0[]{lc0Var, lc0Var2, lc0Var3};
    }

    public static lc0 valueOf(String str) {
        return (lc0) Enum.valueOf(lc0.class, str);
    }

    public static lc0[] values() {
        return (lc0[]) k.clone();
    }
}
