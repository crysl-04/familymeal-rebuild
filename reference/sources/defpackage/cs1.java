package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 {
    public static final cs1 h;
    public static final cs1 i;
    public static final cs1 j;
    public static final cs1 k;
    public static final cs1 l;
    public static final /* synthetic */ cs1[] m;

    static {
        cs1 cs1Var = new cs1("EQUALITY", 0);
        h = cs1Var;
        cs1 cs1Var2 = new cs1("LOWER", 1);
        i = cs1Var2;
        cs1 cs1Var3 = new cs1("NONE", 2);
        j = cs1Var3;
        cs1 cs1Var4 = new cs1("RANGE", 3);
        k = cs1Var4;
        cs1 cs1Var5 = new cs1("UPPER", 4);
        l = cs1Var5;
        m = new cs1[]{cs1Var, cs1Var2, cs1Var3, cs1Var4, cs1Var5};
    }

    public static cs1 valueOf(String str) {
        return (cs1) Enum.valueOf(cs1.class, str);
    }

    public static cs1[] values() {
        return (cs1[]) m.clone();
    }
}
