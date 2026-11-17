package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fi0 {
    public static final fi0 h;
    public static final fi0 i;
    public static final /* synthetic */ fi0[] j;

    static {
        fi0 fi0Var = new fi0("ACTIVE_SET_OR_ADMM", 0);
        h = fi0Var;
        fi0 fi0Var2 = new fi0("JAVA_OR_NATIVE_CODE", 1);
        fi0 fi0Var3 = new fi0("LP_OR_QP", 2);
        fi0 fi0Var4 = new fi0("PRIMAL_OR_DUAL_LP", 3);
        i = fi0Var4;
        j = new fi0[]{fi0Var, fi0Var2, fi0Var3, fi0Var4, new fi0("TEMPORARY", 4)};
    }

    public static fi0 valueOf(String str) {
        return (fi0) Enum.valueOf(fi0.class, str);
    }

    public static fi0[] values() {
        return (fi0[]) j.clone();
    }
}
