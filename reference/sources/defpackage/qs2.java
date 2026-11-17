package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 {
    public static final qs2 h;
    public static final qs2 i;
    public static final qs2 j;
    public static final /* synthetic */ qs2[] k;

    static {
        qs2 qs2Var = new qs2("MANUAL", 0);
        h = qs2Var;
        qs2 qs2Var2 = new qs2("COMPUTED", 1);
        i = qs2Var2;
        qs2 qs2Var3 = new qs2("INCOMPLETE", 2);
        j = qs2Var3;
        k = new qs2[]{qs2Var, qs2Var2, qs2Var3};
    }

    public static qs2 valueOf(String str) {
        return (qs2) Enum.valueOf(qs2.class, str);
    }

    public static qs2[] values() {
        return (qs2[]) k.clone();
    }
}
