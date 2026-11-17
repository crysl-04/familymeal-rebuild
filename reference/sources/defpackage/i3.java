package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 i3[], still in use, count: 1, list:
  (r0v1 i3[]) from 0x0040: CONSTRUCTOR (r0v1 i3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:65) call: lh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class i3 {
    SEDENTARY("久坐", "办公室工作，几乎不运动"),
    LIGHT("轻度活动", "每周运动 1–3 次"),
    MODERATE("中度活动", "每周运动 3–5 次"),
    ACTIVE("高强度活动", "每周运动 6–7 次，或体力劳动");

    public static final /* synthetic */ lh0 o;
    public final String h;
    public final String i;

    static {
        o = new lh0(i3VarArr);
    }

    public i3(String str, String str2) {
        super(str, i);
        this.h = str;
        this.i = str2;
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) n.clone();
    }
}
