package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gc1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec1(gc1 gc1Var, Object obj, byte b) {
        this.a = b;
        this.b = gc1Var;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.c;
        gc1 gc1Var = this.b;
        switch (b) {
            case 0:
                return ((b) gc1Var).k.W1((l52) obj);
            case 1:
                return ((b) gc1Var).k.e1((re1) obj);
            default:
                return gc1Var.k.i((Comparable) obj);
        }
    }
}
