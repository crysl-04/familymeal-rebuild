package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lt1[], still in use, count: 1, list:
  (r0v1 lt1[]) from 0x0024: CONSTRUCTOR (r0v1 lt1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:37) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class lt1 {
    j("SLOW", "慢（约 0.25 kg/周）"),
    k("MEDIUM", "中（约 0.5 kg/周）");

    public static final /* synthetic */ lh0 m;
    public final String h;
    public final double i;

    static {
        m = new lh0(lt1VarArr);
    }

    public lt1(String str, String str2) {
        super(str, i);
        this.h = str2;
        this.i = d;
    }

    public static lt1 valueOf(String str) {
        return (lt1) Enum.valueOf(lt1.class, str);
    }

    public static lt1[] values() {
        return (lt1[]) l.clone();
    }
}
