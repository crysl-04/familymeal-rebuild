package defpackage;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n5 implements IntFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ n5(byte b) {
        this.a = b;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new zh0[i];
            case 1:
                return new e33[i];
            default:
                return Long.valueOf(i);
        }
    }
}
