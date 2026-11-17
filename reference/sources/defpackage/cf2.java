package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cf2[], still in use, count: 1, list:
  (r0v1 cf2[]) from 0x002c: CONSTRUCTOR (r0v1 cf2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cf2 {
    j("四季"),
    k("夏季"),
    l("冬季");

    public static final jy1 i = new jy1(13);
    public static final /* synthetic */ lh0 n;
    public final String h;

    static {
        n = new lh0(new cf2[]{r0, r1, r2});
    }

    public cf2(String str) {
        super(str, i);
        this.h = str;
    }

    public static cf2 valueOf(String str) {
        return (cf2) Enum.valueOf(cf2.class, str);
    }

    public static cf2[] values() {
        return (cf2[]) m.clone();
    }
}
