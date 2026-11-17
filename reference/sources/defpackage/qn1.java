package defpackage;

import java.util.Map;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn1 implements ToIntFunction {
    public final /* synthetic */ byte a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((un1) obj).h;
            case 1:
                return ((un1) obj).h;
            case 2:
                return ((un1) obj).h;
            case 3:
                return -((un1) obj).h;
            default:
                return ((lo2) ((Map.Entry) obj).getKey()).h;
        }
    }
}
