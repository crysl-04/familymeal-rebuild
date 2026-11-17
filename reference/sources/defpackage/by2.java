package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class by2 {
    public static final by2 h;
    public static final by2 i;
    public static final by2 j;
    public static final /* synthetic */ by2[] k;

    static {
        by2 by2Var = new by2("On", 0);
        h = by2Var;
        by2 by2Var2 = new by2("Off", 1);
        i = by2Var2;
        by2 by2Var3 = new by2("Indeterminate", 2);
        j = by2Var3;
        k = new by2[]{by2Var, by2Var2, by2Var3};
    }

    public static by2 valueOf(String str) {
        return (by2) Enum.valueOf(by2.class, str);
    }

    public static by2[] values() {
        return (by2[]) k.clone();
    }
}
