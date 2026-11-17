package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class je1 {
    public static final je1 j;
    public static final je1 k;
    public static final je1 l;
    public static final je1 m;
    public static final je1 n;
    public static final je1 o;
    public static final je1 p;
    public static final je1 q;
    public static final je1 r;
    public static final je1 s;
    public static final je1 t;
    public static final /* synthetic */ je1[] u;
    public final byte h;
    public final r01 i;

    static {
        r01 r01Var = r01.DOUBLE;
        je1 je1Var = new je1("C128", 0, 2, r01Var);
        j = je1Var;
        je1 je1Var2 = new je1("H256", 1, 4, r01Var);
        k = je1Var2;
        r01 r01Var2 = r01.LONG;
        je1 je1Var3 = new je1("Q128", 2, 2, r01Var2);
        l = je1Var3;
        je1 je1Var4 = new je1("R032", 3, 1, r01.FLOAT);
        m = je1Var4;
        je1 je1Var5 = new je1("R064", 4, 1, r01Var);
        n = je1Var5;
        je1 je1Var6 = new je1("R128", 5, 2, r01Var);
        o = je1Var6;
        je1 je1Var7 = new je1("R256", 6, 1, r01.REFERENCE);
        p = je1Var7;
        je1 je1Var8 = new je1("Z008", 7, 1, r01.BYTE);
        q = je1Var8;
        je1 je1Var9 = new je1("Z016", 8, 1, r01.SHORT);
        r = je1Var9;
        je1 je1Var10 = new je1("Z032", 9, 1, r01.INT);
        s = je1Var10;
        je1 je1Var11 = new je1("Z064", 10, 1, r01Var2);
        t = je1Var11;
        u = new je1[]{je1Var, je1Var2, je1Var3, je1Var4, je1Var5, je1Var6, je1Var7, je1Var8, je1Var9, je1Var10, je1Var11};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public je1(String str, int i, int i2, r01 r01Var) {
        super(str, i);
        this.i = r01Var;
        this.h = i2;
    }

    public static je1 valueOf(String str) {
        return (je1) Enum.valueOf(je1.class, str);
    }

    public static je1[] values() {
        return (je1[]) u.clone();
    }

    public final boolean a() {
        return this.h == 1 && this.i != r01.REFERENCE;
    }
}
