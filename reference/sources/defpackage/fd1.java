package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fd1 {
    public static final fd1 h;
    public static final fd1 i;
    public static final fd1 j;
    public static final /* synthetic */ fd1[] k;

    static {
        fd1 fd1Var = new fd1("IsPlacedInLookahead", 0);
        h = fd1Var;
        fd1 fd1Var2 = new fd1("IsPlacedInApproach", 1);
        i = fd1Var2;
        fd1 fd1Var3 = new fd1("IsNotPlaced", 2);
        j = fd1Var3;
        k = new fd1[]{fd1Var, fd1Var2, fd1Var3};
    }

    public static fd1 valueOf(String str) {
        return (fd1) Enum.valueOf(fd1.class, str);
    }

    public static fd1[] values() {
        return (fd1[]) k.clone();
    }
}
