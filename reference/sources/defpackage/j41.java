package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j41 {
    public static final j41 h;
    public static final j41 i;
    public static final j41 j;
    public static final /* synthetic */ j41[] k;

    static {
        j41 j41Var = new j41("InMeasureBlock", 0);
        h = j41Var;
        j41 j41Var2 = new j41("InLayoutBlock", 1);
        i = j41Var2;
        j41 j41Var3 = new j41("NotUsed", 2);
        j = j41Var3;
        k = new j41[]{j41Var, j41Var2, j41Var3};
    }

    public static j41 valueOf(String str) {
        return (j41) Enum.valueOf(j41.class, str);
    }

    public static j41[] values() {
        return (j41[]) k.clone();
    }
}
