package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 {
    public static final bq2 h;
    public static final bq2 i;
    public static final bq2 j;
    public static final bq2 k;
    public static final bq2 l;
    public static final /* synthetic */ bq2[] m;

    static {
        bq2 bq2Var = new bq2("END", 0);
        h = bq2Var;
        bq2 bq2Var2 = new bq2("ROLLBACK", 1);
        i = bq2Var2;
        bq2 bq2Var3 = new bq2("BEGIN_EXCLUSIVE", 2);
        j = bq2Var3;
        bq2 bq2Var4 = new bq2("BEGIN_IMMEDIATE", 3);
        k = bq2Var4;
        bq2 bq2Var5 = new bq2("BEGIN_DEFERRED", 4);
        l = bq2Var5;
        m = new bq2[]{bq2Var, bq2Var2, bq2Var3, bq2Var4, bq2Var5};
    }

    public static bq2 valueOf(String str) {
        return (bq2) Enum.valueOf(bq2.class, str);
    }

    public static bq2[] values() {
        return (bq2[]) m.clone();
    }
}
