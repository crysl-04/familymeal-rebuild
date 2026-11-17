package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s30 {
    public static final s30 h;
    public static final s30 i;
    public static final s30 j;
    public static final /* synthetic */ s30[] k;

    static {
        s30 s30Var = new s30("None", 0);
        h = s30Var;
        s30 s30Var2 = new s30("Cancelled", 1);
        i = s30Var2;
        s30 s30Var3 = new s30("Redirected", 2);
        j = s30Var3;
        k = new s30[]{s30Var, s30Var2, s30Var3, new s30("RedirectCancelled", 3)};
    }

    public static s30 valueOf(String str) {
        return (s30) Enum.valueOf(s30.class, str);
    }

    public static s30[] values() {
        return (s30[]) k.clone();
    }
}
