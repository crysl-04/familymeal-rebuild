package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 {
    public static final gv0 h;
    public static final gv0 i;
    public static final gv0 j;
    public static final /* synthetic */ gv0[] k;

    static {
        gv0 gv0Var = new gv0("Yes", 0);
        h = gv0Var;
        gv0 gv0Var2 = new gv0("No", 1);
        i = gv0Var2;
        gv0 gv0Var3 = new gv0("NotInitialized", 2);
        j = gv0Var3;
        k = new gv0[]{gv0Var, gv0Var2, gv0Var3};
    }

    public static gv0 valueOf(String str) {
        return (gv0) Enum.valueOf(gv0.class, str);
    }

    public static gv0[] values() {
        return (gv0[]) k.clone();
    }
}
