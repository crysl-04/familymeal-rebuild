package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 {
    public static final nx0 h;
    public static final nx0 i;
    public static final nx0 j;
    public static final /* synthetic */ nx0[] k;

    static {
        nx0 nx0Var = new nx0("Focused", 0);
        h = nx0Var;
        nx0 nx0Var2 = new nx0("UnfocusedEmpty", 1);
        i = nx0Var2;
        nx0 nx0Var3 = new nx0("UnfocusedNotEmpty", 2);
        j = nx0Var3;
        k = new nx0[]{nx0Var, nx0Var2, nx0Var3};
    }

    public static nx0 valueOf(String str) {
        return (nx0) Enum.valueOf(nx0.class, str);
    }

    public static nx0[] values() {
        return (nx0[]) k.clone();
    }
}
