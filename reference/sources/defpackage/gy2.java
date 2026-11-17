package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gy2 {
    public static final gy2 h;
    public static final gy2 i;
    public static final gy2 j;
    public static final /* synthetic */ gy2[] k;

    static {
        gy2 gy2Var = new gy2("Uninitialized", 0);
        h = gy2Var;
        gy2 gy2Var2 = new gy2("Detached", 1);
        i = gy2Var2;
        gy2 gy2Var3 = new gy2("Attached", 2);
        j = gy2Var3;
        k = new gy2[]{gy2Var, gy2Var2, gy2Var3};
    }

    public static gy2 valueOf(String str) {
        return (gy2) Enum.valueOf(gy2.class, str);
    }

    public static gy2[] values() {
        return (gy2[]) k.clone();
    }
}
