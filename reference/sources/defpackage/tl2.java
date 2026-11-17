package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tl2 {
    public static final tl2 h;
    public static final tl2 i;
    public static final tl2 j;
    public static final tl2 k;
    public static final /* synthetic */ tl2[] l;

    static {
        tl2 tl2Var = new tl2("OPTIMAL", 0);
        h = tl2Var;
        tl2 tl2Var2 = new tl2("FEASIBLE", 1);
        i = tl2Var2;
        tl2 tl2Var3 = new tl2("INFEASIBLE", 2);
        j = tl2Var3;
        tl2 tl2Var4 = new tl2("TIMEOUT_NO_SOLUTION", 3);
        k = tl2Var4;
        l = new tl2[]{tl2Var, tl2Var2, tl2Var3, tl2Var4, new tl2("CANCELLED", 4)};
    }

    public static tl2 valueOf(String str) {
        return (tl2) Enum.valueOf(tl2.class, str);
    }

    public static tl2[] values() {
        return (tl2[]) l.clone();
    }
}
