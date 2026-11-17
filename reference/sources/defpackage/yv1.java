package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 {
    public static final yv1 h;
    public static final yv1 i;
    public static final yv1 j;
    public static final yv1 k;
    public static final yv1 l;
    public static final yv1 m;
    public static final yv1 n;
    public static final /* synthetic */ yv1[] o;

    static {
        yv1 yv1Var = new yv1("Invalid", 0);
        h = yv1Var;
        yv1 yv1Var2 = new yv1("Cancelled", 1);
        i = yv1Var2;
        yv1 yv1Var3 = new yv1("InitialPending", 2);
        j = yv1Var3;
        yv1 yv1Var4 = new yv1("RecomposePending", 3);
        k = yv1Var4;
        yv1 yv1Var5 = new yv1("Recomposing", 4);
        l = yv1Var5;
        yv1 yv1Var6 = new yv1("ApplyPending", 5);
        m = yv1Var6;
        yv1 yv1Var7 = new yv1("Applied", 6);
        n = yv1Var7;
        o = new yv1[]{yv1Var, yv1Var2, yv1Var3, yv1Var4, yv1Var5, yv1Var6, yv1Var7};
    }

    public static yv1 valueOf(String str) {
        return (yv1) Enum.valueOf(yv1.class, str);
    }

    public static yv1[] values() {
        return (yv1[]) o.clone();
    }
}
