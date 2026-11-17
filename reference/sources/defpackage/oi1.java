package defpackage;

import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 {
    public final PriorityBlockingQueue a;
    public final /* synthetic */ ix0 b;

    public oi1(ix0 ix0Var, ConcurrentHashMap.KeySetView keySetView, Comparator comparator) {
        this.b = ix0Var;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(Math.max(9, keySetView.size()), comparator);
        this.a = priorityBlockingQueue;
        priorityBlockingQueue.addAll(keySetView);
    }
}
