package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xz2 {
    public static final xz2 h;
    public static final xz2 i;
    public static final xz2 j;
    public static final /* synthetic */ xz2[] k;

    static {
        xz2 xz2Var = new xz2("ContinueTraversal", 0);
        h = xz2Var;
        xz2 xz2Var2 = new xz2("SkipSubtreeAndContinueTraversal", 1);
        i = xz2Var2;
        xz2 xz2Var3 = new xz2("CancelTraversal", 2);
        j = xz2Var3;
        k = new xz2[]{xz2Var, xz2Var2, xz2Var3};
    }

    public static xz2 valueOf(String str) {
        return (xz2) Enum.valueOf(xz2.class, str);
    }

    public static xz2[] values() {
        return (xz2[]) k.clone();
    }
}
