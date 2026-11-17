package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 te1[], still in use, count: 1, list:
  (r0v1 te1[]) from 0x0032: CONSTRUCTOR (r0v1 te1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class te1 {
    BREAKFAST("breakfast", "早餐"),
    LUNCH("lunch", "午餐"),
    DINNER("dinner", "晚餐");

    public static final yy j = new yy(24);
    public static final /* synthetic */ lh0 o;
    public final String h;
    public final String i;

    static {
        o = new lh0(new te1[]{r0, r1, r2});
    }

    public te1(String str, String str2) {
        super(str, i);
        this.h = str;
        this.i = str2;
    }

    public static te1 valueOf(String str) {
        return (te1) Enum.valueOf(te1.class, str);
    }

    public static te1[] values() {
        return (te1[]) n.clone();
    }
}
