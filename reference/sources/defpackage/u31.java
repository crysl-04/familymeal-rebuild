package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u31 {
    public static final u31 h;
    public static final u31 i;
    public static final /* synthetic */ u31[] j;

    static {
        u31 u31Var = new u31("Ltr", 0);
        h = u31Var;
        u31 u31Var2 = new u31("Rtl", 1);
        i = u31Var2;
        j = new u31[]{u31Var, u31Var2};
    }

    public static u31 valueOf(String str) {
        return (u31) Enum.valueOf(u31.class, str);
    }

    public static u31[] values() {
        return (u31[]) j.clone();
    }
}
