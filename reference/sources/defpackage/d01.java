package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d01 {
    public static final d01 h;
    public static final d01 i;
    public static final d01 j;
    public static final d01 k;
    public static final /* synthetic */ d01[] l;

    static {
        d01 d01Var = new d01("IGNORED", 0);
        h = d01Var;
        d01 d01Var2 = new d01("SCHEDULED", 1);
        i = d01Var2;
        d01 d01Var3 = new d01("DEFERRED", 2);
        j = d01Var3;
        d01 d01Var4 = new d01("IMMINENT", 3);
        k = d01Var4;
        l = new d01[]{d01Var, d01Var2, d01Var3, d01Var4};
    }

    public static d01 valueOf(String str) {
        return (d01) Enum.valueOf(d01.class, str);
    }

    public static d01[] values() {
        return (d01[]) l.clone();
    }
}
