package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cz2 {
    public static final cz2 h;
    public static final cz2 i;
    public static final /* synthetic */ cz2[] j;

    static {
        cz2 cz2Var = new cz2("DEFERRED", 0);
        h = cz2Var;
        cz2 cz2Var2 = new cz2("IMMEDIATE", 1);
        i = cz2Var2;
        j = new cz2[]{cz2Var, cz2Var2, new cz2("EXCLUSIVE", 2)};
    }

    public static cz2 valueOf(String str) {
        return (cz2) Enum.valueOf(cz2.class, str);
    }

    public static cz2[] values() {
        return (cz2[]) j.clone();
    }
}
