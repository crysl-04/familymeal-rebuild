package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class wz1 extends CancellationException {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz1(String str, byte b) {
        super(str);
        this.h = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.h) {
            case 0:
                setStackTrace(tz0.a0);
                break;
            case 1:
                setStackTrace(ia2.Z);
                break;
            default:
                setStackTrace(uz0.B);
                break;
        }
        return this;
    }
}
