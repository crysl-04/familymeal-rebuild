package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public static final v20 h;
    public static final v20 i;
    public static final v20 j;
    public static final v20 k;
    public static final v20 l;
    public static final /* synthetic */ v20[] m;

    static {
        v20 v20Var = new v20("CPU_ACQUIRED", 0);
        h = v20Var;
        v20 v20Var2 = new v20("BLOCKING", 1);
        i = v20Var2;
        v20 v20Var3 = new v20("PARKING", 2);
        j = v20Var3;
        v20 v20Var4 = new v20("DORMANT", 3);
        k = v20Var4;
        v20 v20Var5 = new v20("TERMINATED", 4);
        l = v20Var5;
        m = new v20[]{v20Var, v20Var2, v20Var3, v20Var4, v20Var5};
    }

    public static v20 valueOf(String str) {
        return (v20) Enum.valueOf(v20.class, str);
    }

    public static v20[] values() {
        return (v20[]) m.clone();
    }
}
