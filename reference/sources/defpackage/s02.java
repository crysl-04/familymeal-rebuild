package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s02 {
    public static final s02 h;
    public static final s02 i;
    public static final s02 j;
    public static final /* synthetic */ s02[] k;

    static {
        s02 s02Var = new s02("Initial", 0);
        h = s02Var;
        s02 s02Var2 = new s02("Main", 1);
        i = s02Var2;
        s02 s02Var3 = new s02("Final", 2);
        j = s02Var3;
        k = new s02[]{s02Var, s02Var2, s02Var3};
    }

    public static s02 valueOf(String str) {
        return (s02) Enum.valueOf(s02.class, str);
    }

    public static s02[] values() {
        return (s02[]) k.clone();
    }
}
