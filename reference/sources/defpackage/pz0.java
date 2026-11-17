package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 {
    public static final pz0 h;
    public static final pz0 i;
    public static final /* synthetic */ pz0[] j;

    static {
        pz0 pz0Var = new pz0("Min", 0);
        h = pz0Var;
        pz0 pz0Var2 = new pz0("Max", 1);
        i = pz0Var2;
        j = new pz0[]{pz0Var, pz0Var2};
    }

    public static pz0 valueOf(String str) {
        return (pz0) Enum.valueOf(pz0.class, str);
    }

    public static pz0[] values() {
        return (pz0[]) j.clone();
    }
}
