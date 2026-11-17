package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r00 {
    public static final r00 h;
    public static final r00 i;
    public static final /* synthetic */ r00[] j;

    static {
        r00 r00Var = new r00("VIEW_APPEAR", 0);
        h = r00Var;
        r00 r00Var2 = new r00("VIEW_DISAPPEAR", 1);
        i = r00Var2;
        j = new r00[]{r00Var, r00Var2};
    }

    public static r00 valueOf(String str) {
        return (r00) Enum.valueOf(r00.class, str);
    }

    public static r00[] values() {
        return (r00[]) j.clone();
    }
}
