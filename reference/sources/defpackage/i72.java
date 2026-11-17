package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public static final i72 h;
    public static final i72 i;
    public static final i72 j;
    public static final i72 k;
    public static final i72 l;
    public static final i72 m;
    public static final /* synthetic */ i72[] n;

    static {
        i72 i72Var = new i72("ShutDown", 0);
        h = i72Var;
        i72 i72Var2 = new i72("ShuttingDown", 1);
        i = i72Var2;
        i72 i72Var3 = new i72("Inactive", 2);
        j = i72Var3;
        i72 i72Var4 = new i72("InactivePendingWork", 3);
        k = i72Var4;
        i72 i72Var5 = new i72("Idle", 4);
        l = i72Var5;
        i72 i72Var6 = new i72("PendingWork", 5);
        m = i72Var6;
        n = new i72[]{i72Var, i72Var2, i72Var3, i72Var4, i72Var5, i72Var6};
    }

    public static i72 valueOf(String str) {
        return (i72) Enum.valueOf(i72.class, str);
    }

    public static i72[] values() {
        return (i72[]) n.clone();
    }
}
