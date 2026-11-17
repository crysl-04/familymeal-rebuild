package defpackage;

import java.util.function.ToDoubleFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn1 implements ToDoubleFunction {
    public final /* synthetic */ byte a;

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return -((un1) obj).k;
            case 1:
                return -((un1) obj).i;
            case 2:
                return ((un1) obj).k;
            case 3:
                return -((un1) obj).i;
            case 4:
                return ((un1) obj).i;
            case 5:
                return -((un1) obj).i;
            default:
                return ((bo1) obj).a;
        }
    }
}
