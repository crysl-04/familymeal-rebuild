package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p60[], still in use, count: 1, list:
  (r0v1 p60[]) from 0x0064: CONSTRUCTOR (r0v1 p60[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:101) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p60 {
    /* JADX INFO: Fake field, exist only in values array */
    MONDAY("monday", "周一"),
    /* JADX INFO: Fake field, exist only in values array */
    TUESDAY("tuesday", "周二"),
    WEDNESDAY("wednesday", "周三"),
    /* JADX INFO: Fake field, exist only in values array */
    THURSDAY("thursday", "周四"),
    FRIDAY("friday", "周五"),
    SATURDAY("saturday", "周六"),
    SUNDAY("sunday", "周日");

    public static final yy j = new yy(5);
    public static final /* synthetic */ lh0 p;
    public final String h;
    public final String i;

    static {
        p = new lh0(new p60[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public p60(String str, String str2) {
        super(str, i);
        this.h = str;
        this.i = str2;
    }

    public static p60 valueOf(String str) {
        return (p60) Enum.valueOf(p60.class, str);
    }

    public static p60[] values() {
        return (p60[]) o.clone();
    }
}
