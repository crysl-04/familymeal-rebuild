package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g81 {
    public static final g81 h;
    public static final g81 i;
    public static final /* synthetic */ g81[] j;

    /* JADX INFO: Fake field, exist only in values array */
    g81 EF0;

    static {
        g81 g81Var = new g81("SYNCHRONIZED", 0);
        g81 g81Var2 = new g81("PUBLICATION", 1);
        h = g81Var2;
        g81 g81Var3 = new g81("NONE", 2);
        i = g81Var3;
        j = new g81[]{g81Var, g81Var2, g81Var3};
    }

    public static g81 valueOf(String str) {
        return (g81) Enum.valueOf(g81.class, str);
    }

    public static g81[] values() {
        return (g81[]) j.clone();
    }
}
