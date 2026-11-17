package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 {
    public static final ef1 h;
    public static final ef1 i;
    public static final /* synthetic */ ef1[] j;

    static {
        ef1 ef1Var = new ef1("Width", 0);
        h = ef1Var;
        ef1 ef1Var2 = new ef1("Height", 1);
        i = ef1Var2;
        j = new ef1[]{ef1Var, ef1Var2};
    }

    public static ef1 valueOf(String str) {
        return (ef1) Enum.valueOf(ef1.class, str);
    }

    public static ef1[] values() {
        return (ef1[]) j.clone();
    }
}
