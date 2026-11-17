package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {
    public static final ks1 h;
    public static final ks1 i;
    public static final /* synthetic */ ks1[] j;

    static {
        ks1 ks1Var = new ks1("Vertical", 0);
        h = ks1Var;
        ks1 ks1Var2 = new ks1("Horizontal", 1);
        i = ks1Var2;
        j = new ks1[]{ks1Var, ks1Var2};
    }

    public static ks1 valueOf(String str) {
        return (ks1) Enum.valueOf(ks1.class, str);
    }

    public static ks1[] values() {
        return (ks1[]) j.clone();
    }
}
