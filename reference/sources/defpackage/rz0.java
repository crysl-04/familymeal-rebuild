package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 {
    public static final rz0 h;
    public static final rz0 i;
    public static final /* synthetic */ rz0[] j;

    static {
        rz0 rz0Var = new rz0("Width", 0);
        h = rz0Var;
        rz0 rz0Var2 = new rz0("Height", 1);
        i = rz0Var2;
        j = new rz0[]{rz0Var, rz0Var2};
    }

    public static rz0 valueOf(String str) {
        return (rz0) Enum.valueOf(rz0.class, str);
    }

    public static rz0[] values() {
        return (rz0[]) j.clone();
    }
}
