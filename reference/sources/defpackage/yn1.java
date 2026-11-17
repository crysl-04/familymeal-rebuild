package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {
    public static final yn1 h;
    public static final yn1 i;
    public static final /* synthetic */ yn1[] j;

    static {
        yn1 yn1Var = new yn1("Width", 0);
        h = yn1Var;
        yn1 yn1Var2 = new yn1("Height", 1);
        i = yn1Var2;
        j = new yn1[]{yn1Var, yn1Var2};
    }

    public static yn1 valueOf(String str) {
        return (yn1) Enum.valueOf(yn1.class, str);
    }

    public static yn1[] values() {
        return (yn1[]) j.clone();
    }
}
