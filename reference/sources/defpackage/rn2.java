package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rn2 implements qn2 {
    public final ji h = new ji(0);

    public final boolean e(int i) {
        return (this.h.get() & i) != 0;
    }

    public final void f(int i) {
        ji jiVar;
        int i2;
        do {
            jiVar = this.h;
            i2 = jiVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!jiVar.compareAndSet(i2, i2 | i));
    }
}
