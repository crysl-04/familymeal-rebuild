package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h41 {
    public static final h41 h;
    public static final h41 i;
    public static final h41 j;
    public static final h41 k;
    public static final h41 l;
    public static final /* synthetic */ h41[] m;

    static {
        h41 h41Var = new h41("Measuring", 0);
        h = h41Var;
        h41 h41Var2 = new h41("LookaheadMeasuring", 1);
        i = h41Var2;
        h41 h41Var3 = new h41("LayingOut", 2);
        j = h41Var3;
        h41 h41Var4 = new h41("LookaheadLayingOut", 3);
        k = h41Var4;
        h41 h41Var5 = new h41("Idle", 4);
        l = h41Var5;
        m = new h41[]{h41Var, h41Var2, h41Var3, h41Var4, h41Var5};
    }

    public static h41 valueOf(String str) {
        return (h41) Enum.valueOf(h41.class, str);
    }

    public static h41[] values() {
        return (h41[]) m.clone();
    }
}
