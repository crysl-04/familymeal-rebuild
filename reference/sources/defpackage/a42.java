package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends RuntimeException {
    public final /* synthetic */ byte h;

    public static void a() {
        throw new a42("The column dimension of the left matrix does not match the row dimension of the right matrix!", (byte) 0);
    }

    public static void b() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        switch (this.h) {
            case 0:
                String simpleName = a42.class.getSimpleName();
                String localizedMessage = getLocalizedMessage();
                return localizedMessage != null ? wi0.h(simpleName, ": ", localizedMessage) : simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(String str, byte b) {
        super(str);
        this.h = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(String str, Throwable th, byte b) {
        super(str, th);
        this.h = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(Throwable th, byte b) {
        super(th);
        this.h = b;
    }
}
