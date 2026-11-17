package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l82 {
    public static final l82 h;
    public static final /* synthetic */ l82[] i;

    static {
        l82 l82Var = new l82("Restart", 0);
        h = l82Var;
        i = new l82[]{l82Var, new l82("Reverse", 1)};
    }

    public static l82 valueOf(String str) {
        return (l82) Enum.valueOf(l82.class, str);
    }

    public static l82[] values() {
        return (l82[]) i.clone();
    }
}
