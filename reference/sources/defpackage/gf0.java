package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements Runnable {
    public final ArrayList h;
    public final byte i;

    /* JADX WARN: Multi-variable type inference failed */
    public gf0(List list, int i, Throwable th) {
        m02.c(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        if (this.i != 1) {
            while (i < size) {
                ((h70) arrayList.get(i)).b.i = s60.v;
                i++;
            }
            return;
        }
        while (i < size) {
            h70 h70Var = (h70) arrayList.get(i);
            h70Var.a.setValue(Boolean.TRUE);
            h70Var.b.i = new ou0(true);
            i++;
        }
    }
}
