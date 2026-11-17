package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dp {
    public static final dp h;
    public static final dp i;
    public static final dp j;
    public static final /* synthetic */ dp[] k;

    static {
        dp dpVar = new dp("SUSPEND", 0);
        h = dpVar;
        dp dpVar2 = new dp("DROP_OLDEST", 1);
        i = dpVar2;
        dp dpVar3 = new dp("DROP_LATEST", 2);
        j = dpVar3;
        k = new dp[]{dpVar, dpVar2, dpVar3};
    }

    public static dp valueOf(String str) {
        return (dp) Enum.valueOf(dp.class, str);
    }

    public static dp[] values() {
        return (dp[]) k.clone();
    }
}
