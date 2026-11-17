package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 {
    public static final fk1 h;
    public static final /* synthetic */ fk1[] i;

    static {
        fk1 fk1Var = new fk1("Default", 0);
        h = fk1Var;
        i = new fk1[]{fk1Var, new fk1("UserInput", 1), new fk1("PreventUserInput", 2)};
    }

    public static fk1 valueOf(String str) {
        return (fk1) Enum.valueOf(fk1.class, str);
    }

    public static fk1[] values() {
        return (fk1[]) i.clone();
    }
}
