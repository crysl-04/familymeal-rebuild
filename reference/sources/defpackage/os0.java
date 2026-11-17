package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class os0 {
    public static final os0 h;
    public static final os0 i;
    public static final os0 j;
    public static final /* synthetic */ os0[] k;

    static {
        os0 os0Var = new os0("Cursor", 0);
        h = os0Var;
        os0 os0Var2 = new os0("SelectionStart", 1);
        i = os0Var2;
        os0 os0Var3 = new os0("SelectionEnd", 2);
        j = os0Var3;
        k = new os0[]{os0Var, os0Var2, os0Var3};
    }

    public static os0 valueOf(String str) {
        return (os0) Enum.valueOf(os0.class, str);
    }

    public static os0[] values() {
        return (os0[]) k.clone();
    }
}
