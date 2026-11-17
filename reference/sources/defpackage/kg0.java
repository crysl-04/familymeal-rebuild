package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kg0 {
    public static final kg0 h;
    public static final kg0 i;
    public static final kg0 j;
    public static final /* synthetic */ kg0[] k;

    static {
        kg0 kg0Var = new kg0("PreEnter", 0);
        h = kg0Var;
        kg0 kg0Var2 = new kg0("Visible", 1);
        i = kg0Var2;
        kg0 kg0Var3 = new kg0("PostExit", 2);
        j = kg0Var3;
        k = new kg0[]{kg0Var, kg0Var2, kg0Var3};
    }

    public static kg0 valueOf(String str) {
        return (kg0) Enum.valueOf(kg0.class, str);
    }

    public static kg0[] values() {
        return (kg0[]) k.clone();
    }
}
