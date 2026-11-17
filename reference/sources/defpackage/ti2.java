package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ti2 {
    public static final ti2 h;
    public static final ti2 i;
    public static final ti2 j;
    public static final /* synthetic */ ti2[] k;

    static {
        ti2 ti2Var = new ti2("START", 0);
        h = ti2Var;
        ti2 ti2Var2 = new ti2("STOP", 1);
        i = ti2Var2;
        ti2 ti2Var3 = new ti2("STOP_AND_RESET_REPLAY_CACHE", 2);
        j = ti2Var3;
        k = new ti2[]{ti2Var, ti2Var2, ti2Var3};
    }

    public static ti2 valueOf(String str) {
        return (ti2) Enum.valueOf(ti2.class, str);
    }

    public static ti2[] values() {
        return (ti2[]) k.clone();
    }
}
