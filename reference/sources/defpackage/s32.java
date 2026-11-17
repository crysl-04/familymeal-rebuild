package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s32 implements Callable {
    public final xy0 a;
    public final LinkedTransferQueue b;

    public s32(LinkedTransferQueue linkedTransferQueue, xy0 xy0Var) {
        this.b = linkedTransferQueue;
        this.a = xy0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        while (true) {
            Object objPoll = this.b.poll();
            if (objPoll == null) {
                return Boolean.TRUE;
            }
            this.a.accept(objPoll);
        }
    }
}
