package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 {
    public static final gh1 h;
    public static final gh1 i;
    public static final gh1 j;
    public static final gh1 k;
    public static final gh1 l;
    public static final /* synthetic */ gh1[] m;

    static {
        gh1 gh1Var = new gh1("DefaultSpatial", 0);
        h = gh1Var;
        gh1 gh1Var2 = new gh1("FastSpatial", 1);
        i = gh1Var2;
        gh1 gh1Var3 = new gh1("SlowSpatial", 2);
        gh1 gh1Var4 = new gh1("DefaultEffects", 3);
        j = gh1Var4;
        gh1 gh1Var5 = new gh1("FastEffects", 4);
        k = gh1Var5;
        gh1 gh1Var6 = new gh1("SlowEffects", 5);
        l = gh1Var6;
        m = new gh1[]{gh1Var, gh1Var2, gh1Var3, gh1Var4, gh1Var5, gh1Var6};
    }

    public static gh1 valueOf(String str) {
        return (gh1) Enum.valueOf(gh1.class, str);
    }

    public static gh1[] values() {
        return (gh1[]) m.clone();
    }
}
