package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class np1 {
    public static final np1 h;
    public static final np1 i;
    public static final np1 j;
    public static final /* synthetic */ np1[] k;

    static {
        np1 np1Var = new np1("NO_OP", 0);
        h = np1Var;
        np1 np1Var2 = new np1("ADD", 1);
        i = np1Var2;
        np1 np1Var3 = new np1("REMOVE", 2);
        j = np1Var3;
        k = new np1[]{np1Var, np1Var2, np1Var3};
    }

    public static np1 valueOf(String str) {
        return (np1) Enum.valueOf(np1.class, str);
    }

    public static np1[] values() {
        return (np1[]) k.clone();
    }
}
