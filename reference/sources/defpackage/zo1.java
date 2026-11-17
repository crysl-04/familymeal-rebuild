package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 {
    public static final zo1 h;
    public static final zo1 i;
    public static final zo1 j;
    public static final zo1 k;
    public static final zo1 l;
    public static final /* synthetic */ zo1[] m;
    public static final /* synthetic */ lh0 n;

    static {
        zo1 zo1Var = new zo1("KCAL", 0);
        h = zo1Var;
        zo1 zo1Var2 = new zo1("PROTEIN", 1);
        i = zo1Var2;
        zo1 zo1Var3 = new zo1("FAT", 2);
        j = zo1Var3;
        zo1 zo1Var4 = new zo1("CARB", 3);
        k = zo1Var4;
        zo1 zo1Var5 = new zo1("FIBER", 4);
        l = zo1Var5;
        zo1[] zo1VarArr = {zo1Var, zo1Var2, zo1Var3, zo1Var4, zo1Var5};
        m = zo1VarArr;
        n = new lh0(zo1VarArr);
    }

    public static zo1 valueOf(String str) {
        return (zo1) Enum.valueOf(zo1.class, str);
    }

    public static zo1[] values() {
        return (zo1[]) m.clone();
    }
}
