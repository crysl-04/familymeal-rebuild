package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd1 {
    public int h;
    public int i;
    public int j;
    public Object k;

    public vd1() {
        if (jy1.i == null) {
            jy1.i = new jy1((byte) 29);
        }
    }

    public final int a(int i) {
        if (i < this.j) {
            return ((ByteBuffer) this.k).getShort(this.i + i);
        }
        return 0;
    }

    public final void b() {
        if (((wd1) this.k).o != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        while (true) {
            int i = this.h;
            wd1 wd1Var = (wd1) this.k;
            if (i >= wd1Var.m || wd1Var.j[i] >= 0) {
                return;
            } else {
                this.h = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.h < ((wd1) this.k).m;
    }

    public final void remove() {
        wd1 wd1Var = (wd1) this.k;
        b();
        if (this.i == -1) {
            li1.g("Call next() before removing element from the iterator.");
            return;
        }
        wd1Var.c();
        wd1Var.l(this.i);
        this.i = -1;
        this.j = wd1Var.o;
    }
}
