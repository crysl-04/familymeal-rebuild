package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y20 {
    public static final y20 h;
    public static final y20 i;
    public static final y20 j;
    public static final /* synthetic */ y20[] k;

    static {
        y20 y20Var = new y20("COROUTINE_SUSPENDED", 0);
        h = y20Var;
        y20 y20Var2 = new y20("UNDECIDED", 1);
        i = y20Var2;
        y20 y20Var3 = new y20("RESUMED", 2);
        j = y20Var3;
        k = new y20[]{y20Var, y20Var2, y20Var3};
    }

    public static y20 valueOf(String str) {
        return (y20) Enum.valueOf(y20.class, str);
    }

    public static y20[] values() {
        return (y20[]) k.clone();
    }
}
