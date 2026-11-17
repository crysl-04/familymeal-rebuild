package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w81 {
    private static final /* synthetic */ kh0 $ENTRIES;
    private static final /* synthetic */ w81[] $VALUES;
    public static final u81 Companion;
    public static final w81 ON_ANY;
    public static final w81 ON_CREATE;
    public static final w81 ON_DESTROY;
    public static final w81 ON_PAUSE;
    public static final w81 ON_RESUME;
    public static final w81 ON_START;
    public static final w81 ON_STOP;

    static {
        w81 w81Var = new w81("ON_CREATE", 0);
        ON_CREATE = w81Var;
        w81 w81Var2 = new w81("ON_START", 1);
        ON_START = w81Var2;
        w81 w81Var3 = new w81("ON_RESUME", 2);
        ON_RESUME = w81Var3;
        w81 w81Var4 = new w81("ON_PAUSE", 3);
        ON_PAUSE = w81Var4;
        w81 w81Var5 = new w81("ON_STOP", 4);
        ON_STOP = w81Var5;
        w81 w81Var6 = new w81("ON_DESTROY", 5);
        ON_DESTROY = w81Var6;
        w81 w81Var7 = new w81("ON_ANY", 6);
        ON_ANY = w81Var7;
        w81[] w81VarArr = {w81Var, w81Var2, w81Var3, w81Var4, w81Var5, w81Var6, w81Var7};
        $VALUES = w81VarArr;
        $ENTRIES = new lh0(w81VarArr);
        Companion = new u81();
    }

    public static w81 valueOf(String str) {
        return (w81) Enum.valueOf(w81.class, str);
    }

    public static w81[] values() {
        return (w81[]) $VALUES.clone();
    }

    public final x81 a() {
        switch (v81.a[ordinal()]) {
            case 1:
            case 2:
                return x81.j;
            case 3:
            case 4:
                return x81.k;
            case 5:
                return x81.l;
            case 6:
                return x81.h;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                wg.n();
                return null;
        }
    }
}
