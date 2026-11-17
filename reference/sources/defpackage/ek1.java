package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ek1 {
    public static final ek1 h;
    public static final ek1 i;
    public static final ek1 j;
    public static final /* synthetic */ ek1[] k;

    static {
        ek1 ek1Var = new ek1("Default", 0);
        h = ek1Var;
        ek1 ek1Var2 = new ek1("UserInput", 1);
        i = ek1Var2;
        ek1 ek1Var3 = new ek1("PreventUserInput", 2);
        j = ek1Var3;
        k = new ek1[]{ek1Var, ek1Var2, ek1Var3};
    }

    public static ek1 valueOf(String str) {
        return (ek1) Enum.valueOf(ek1.class, str);
    }

    public static ek1[] values() {
        return (ek1[]) k.clone();
    }
}
