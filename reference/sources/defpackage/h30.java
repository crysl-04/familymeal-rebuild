package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public static final h30 h;
    public static final h30 i;
    public static final h30 j;
    public static final /* synthetic */ h30[] k;

    static {
        h30 h30Var = new h30("CROSSED", 0);
        h = h30Var;
        h30 h30Var2 = new h30("NOT_CROSSED", 1);
        i = h30Var2;
        h30 h30Var3 = new h30("COLLAPSED", 2);
        j = h30Var3;
        k = new h30[]{h30Var, h30Var2, h30Var3};
    }

    public static h30 valueOf(String str) {
        return (h30) Enum.valueOf(h30.class, str);
    }

    public static h30[] values() {
        return (h30[]) k.clone();
    }
}
