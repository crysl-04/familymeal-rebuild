package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xn1 {
    public static final xn1 h;
    public static final xn1 i;
    public static final /* synthetic */ xn1[] j;

    static {
        xn1 xn1Var = new xn1("Min", 0);
        h = xn1Var;
        xn1 xn1Var2 = new xn1("Max", 1);
        i = xn1Var2;
        j = new xn1[]{xn1Var, xn1Var2};
    }

    public static xn1 valueOf(String str) {
        return (xn1) Enum.valueOf(xn1.class, str);
    }

    public static xn1[] values() {
        return (xn1[]) j.clone();
    }
}
