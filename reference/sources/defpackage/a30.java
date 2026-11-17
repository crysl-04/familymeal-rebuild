package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a30 {
    public static final a30 h;
    public static final a30 i;
    public static final a30 j;
    public static final a30 k;
    public static final /* synthetic */ a30[] l;

    static {
        a30 a30Var = new a30("DEFAULT", 0);
        h = a30Var;
        a30 a30Var2 = new a30("LAZY", 1);
        i = a30Var2;
        a30 a30Var3 = new a30("ATOMIC", 2);
        j = a30Var3;
        a30 a30Var4 = new a30("UNDISPATCHED", 3);
        k = a30Var4;
        l = new a30[]{a30Var, a30Var2, a30Var3, a30Var4};
    }

    public static a30 valueOf(String str) {
        return (a30) Enum.valueOf(a30.class, str);
    }

    public static a30[] values() {
        return (a30[]) l.clone();
    }
}
