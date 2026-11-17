package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 {
    public static final qs0 h;
    public static final qs0 i;
    public static final qs0 j;
    public static final /* synthetic */ qs0[] k;

    static {
        qs0 qs0Var = new qs0("None", 0);
        h = qs0Var;
        qs0 qs0Var2 = new qs0("Selection", 1);
        i = qs0Var2;
        qs0 qs0Var3 = new qs0("Cursor", 2);
        j = qs0Var3;
        k = new qs0[]{qs0Var, qs0Var2, qs0Var3};
    }

    public static qs0 valueOf(String str) {
        return (qs0) Enum.valueOf(qs0.class, str);
    }

    public static qs0[] values() {
        return (qs0[]) k.clone();
    }
}
