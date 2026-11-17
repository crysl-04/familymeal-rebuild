package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bw2 {
    public static final bw2 h;
    public static final bw2 i;
    public static final bw2 j;
    public static final bw2 k;
    public static final /* synthetic */ bw2[] l;

    static {
        bw2 bw2Var = new bw2("StartInput", 0);
        h = bw2Var;
        bw2 bw2Var2 = new bw2("StopInput", 1);
        i = bw2Var2;
        bw2 bw2Var3 = new bw2("ShowKeyboard", 2);
        j = bw2Var3;
        bw2 bw2Var4 = new bw2("HideKeyboard", 3);
        k = bw2Var4;
        l = new bw2[]{bw2Var, bw2Var2, bw2Var3, bw2Var4};
    }

    public static bw2 valueOf(String str) {
        return (bw2) Enum.valueOf(bw2.class, str);
    }

    public static bw2[] values() {
        return (bw2[]) l.clone();
    }
}
