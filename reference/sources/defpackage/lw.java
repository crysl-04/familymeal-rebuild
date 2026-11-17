package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lw implements m10 {
    public static final lw i = new lw(0);
    public static final lw j = new lw(1);
    public final /* synthetic */ byte h;

    public /* synthetic */ lw(byte b) {
        this.h = b;
    }

    @Override // defpackage.m10
    public final o20 e() {
        switch (this.h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return xf0.h;
        }
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        switch (this.h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
