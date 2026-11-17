package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a51 {
    public static final a51 h;
    public static final /* synthetic */ a51[] i;

    static {
        a51 a51Var = new a51("Horizontal", 0);
        h = a51Var;
        i = new a51[]{a51Var, new a51("Vertical", 1)};
    }

    public static a51 valueOf(String str) {
        return (a51) Enum.valueOf(a51.class, str);
    }

    public static a51[] values() {
        return (a51[]) i.clone();
    }
}
