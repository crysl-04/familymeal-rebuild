package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kg2 {
    public static final kg2 h;
    public static final kg2 i;
    public static final kg2 j;
    public static final /* synthetic */ kg2[] k;

    static {
        kg2 kg2Var = new kg2("Left", 0);
        h = kg2Var;
        kg2 kg2Var2 = new kg2("Middle", 1);
        i = kg2Var2;
        kg2 kg2Var3 = new kg2("Right", 2);
        j = kg2Var3;
        k = new kg2[]{kg2Var, kg2Var2, kg2Var3};
    }

    public static kg2 valueOf(String str) {
        return (kg2) Enum.valueOf(kg2.class, str);
    }

    public static kg2[] values() {
        return (kg2[]) k.clone();
    }
}
