package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u82 {
    public static final u82 h;
    public static final u82 i;
    public static final /* synthetic */ u82[] j;

    static {
        u82 u82Var = new u82("Ltr", 0);
        h = u82Var;
        u82 u82Var2 = new u82("Rtl", 1);
        i = u82Var2;
        j = new u82[]{u82Var, u82Var2};
    }

    public static u82 valueOf(String str) {
        return (u82) Enum.valueOf(u82.class, str);
    }

    public static u82[] values() {
        return (u82[]) j.clone();
    }
}
