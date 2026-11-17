package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 {
    public static final ra0 h;
    public static final ra0 i;
    public static final ra0 j;
    public static final /* synthetic */ ra0[] k;

    static {
        ra0 ra0Var = new ra0("Vertical", 0);
        h = ra0Var;
        ra0 ra0Var2 = new ra0("Horizontal", 1);
        i = ra0Var2;
        ra0 ra0Var3 = new ra0("Both", 2);
        j = ra0Var3;
        k = new ra0[]{ra0Var, ra0Var2, ra0Var3};
    }

    public static ra0 valueOf(String str) {
        return (ra0) Enum.valueOf(ra0.class, str);
    }

    public static ra0[] values() {
        return (ra0[]) k.clone();
    }
}
