package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b01 {
    public static final b01 h;
    public static final b01 i;
    public static final b01 j;
    public static final b01 k;
    public static final /* synthetic */ b01[] l;

    static {
        b01 b01Var = new b01("LookaheadMeasurement", 0);
        h = b01Var;
        b01 b01Var2 = new b01("LookaheadPlacement", 1);
        i = b01Var2;
        b01 b01Var3 = new b01("Measurement", 2);
        j = b01Var3;
        b01 b01Var4 = new b01("Placement", 3);
        k = b01Var4;
        l = new b01[]{b01Var, b01Var2, b01Var3, b01Var4};
    }

    public static b01 valueOf(String str) {
        return (b01) Enum.valueOf(b01.class, str);
    }

    public static b01[] values() {
        return (b01[]) l.clone();
    }
}
