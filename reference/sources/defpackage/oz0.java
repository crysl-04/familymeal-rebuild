package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 {
    public static final oz0 h;
    public static final oz0 i;
    public static final /* synthetic */ oz0[] j;

    static {
        oz0 oz0Var = new oz0("Min", 0);
        h = oz0Var;
        oz0 oz0Var2 = new oz0("Max", 1);
        i = oz0Var2;
        j = new oz0[]{oz0Var, oz0Var2};
    }

    public static oz0 valueOf(String str) {
        return (oz0) Enum.valueOf(oz0.class, str);
    }

    public static oz0[] values() {
        return (oz0[]) j.clone();
    }
}
