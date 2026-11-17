package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zr[], still in use, count: 1, list:
  (r0v1 zr[]) from 0x0044: CONSTRUCTOR (r0v1 zr[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zr {
    j("早餐"),
    k("主菜"),
    l("蔬菜"),
    m("汤"),
    n("主食");

    public static final vz1 i = new vz1((byte) 28);
    public static final /* synthetic */ lh0 p;
    public final String h;

    static {
        p = new lh0(new zr[]{r0, r1, r2, r3, r4});
    }

    public zr(String str) {
        super(str, i);
        this.h = str;
    }

    public static zr valueOf(String str) {
        return (zr) Enum.valueOf(zr.class, str);
    }

    public static zr[] values() {
        return (zr[]) o.clone();
    }
}
