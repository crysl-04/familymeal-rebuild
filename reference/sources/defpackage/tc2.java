package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 {
    public static final tc2 h;
    public static final tc2 i;
    public static final tc2 j;
    public static final tc2 k;
    public static final tc2 l;
    public static final /* synthetic */ tc2[] m;

    static {
        tc2 tc2Var = new tc2("TopBar", 0);
        h = tc2Var;
        tc2 tc2Var2 = new tc2("MainContent", 1);
        i = tc2Var2;
        tc2 tc2Var3 = new tc2("Snackbar", 2);
        j = tc2Var3;
        tc2 tc2Var4 = new tc2("Fab", 3);
        k = tc2Var4;
        tc2 tc2Var5 = new tc2("BottomBar", 4);
        l = tc2Var5;
        m = new tc2[]{tc2Var, tc2Var2, tc2Var3, tc2Var4, tc2Var5};
    }

    public static tc2 valueOf(String str) {
        return (tc2) Enum.valueOf(tc2.class, str);
    }

    public static tc2[] values() {
        return (tc2[]) m.clone();
    }
}
