package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 {
    public static final ac0 h;
    public static final ac0 i;
    public static final ac0 j;
    public static final ac0 k;
    public static final /* synthetic */ ac0[] l;

    static {
        ac0 ac0Var = new ac0("Up", 0);
        h = ac0Var;
        ac0 ac0Var2 = new ac0("Drag", 1);
        i = ac0Var2;
        ac0 ac0Var3 = new ac0("Timeout", 2);
        j = ac0Var3;
        ac0 ac0Var4 = new ac0("Cancel", 3);
        k = ac0Var4;
        l = new ac0[]{ac0Var, ac0Var2, ac0Var3, ac0Var4};
    }

    public static ac0 valueOf(String str) {
        return (ac0) Enum.valueOf(ac0.class, str);
    }

    public static ac0[] values() {
        return (ac0[]) l.clone();
    }
}
