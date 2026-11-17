package defpackage;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j52 implements bf0 {
    public final /* synthetic */ byte h = 0;
    public int i;
    public int j;
    public int k;
    public final k52 l;

    public j52(k52 k52Var, int i) {
        this.i = 0;
        this.l = k52Var;
        this.k = k52Var.p.length - 1;
        this.j = i;
        while (true) {
            int i2 = this.j;
            int[] iArr = this.l.o;
            int i3 = this.i + 1;
            if (i2 < iArr[i3]) {
                return;
            } else {
                this.i = i3;
            }
        }
    }

    @Override // defpackage.xo1
    public final double A0() {
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                return k52Var.p[this.j];
            default:
                return k52Var.p[this.i];
        }
    }

    @Override // defpackage.af0
    public final long D0() {
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                return (((long) this.i) * k52Var.j) + ((long) k52Var.n[this.j]);
            default:
                return (((long) k52Var.n[this.i]) * k52Var.j) + ((long) this.k);
        }
    }

    @Override // defpackage.bf0
    public final long F0() {
        int i;
        switch (this.h) {
            case 0:
                i = this.i;
                break;
            default:
                i = this.l.n[this.i];
                break;
        }
        return i;
    }

    @Override // defpackage.bf0
    public final long Q1() {
        int i;
        switch (this.h) {
            case 0:
                i = this.l.n[this.j];
                break;
            default:
                i = this.k;
                break;
        }
        return i;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        int length;
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                length = k52Var.p.length;
                break;
            default:
                length = k52Var.p.length;
                break;
        }
        return length;
    }

    @Override // defpackage.l1
    public final Object get() {
        switch (this.h) {
            case 0:
                break;
        }
        return Double.valueOf(A0());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                return this.j < this.k;
            default:
                return this.i < this.j;
        }
    }

    @Override // defpackage.af0, java.lang.Iterable
    public final af0 iterator() {
        byte b = this.h;
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                int i = this.j + 1;
                this.j = i;
                if (i > this.k) {
                    wg.p();
                    return null;
                }
                while (true) {
                    int i2 = this.j;
                    int[] iArr = k52Var.o;
                    int i3 = this.i + 1;
                    if (i2 < iArr[i3]) {
                        return this;
                    }
                    this.i = i3;
                }
                break;
            default:
                int i4 = this.i + 1;
                this.i = i4;
                if (i4 > this.j) {
                    wg.p();
                    return null;
                }
                while (true) {
                    int i5 = this.i;
                    int[] iArr2 = k52Var.o;
                    int i6 = this.k + 1;
                    if (i5 < iArr2[i6]) {
                        return this;
                    }
                    this.k = i6;
                }
                break;
        }
    }

    @Override // defpackage.af0, java.util.Spliterator
    public final af0 trySplit() {
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                int i = this.k;
                int i2 = this.j;
                int i3 = i - i2;
                if (i3 > 1) {
                    return new j52(k52Var, (i3 / 2) + i2);
                }
                return null;
            default:
                int i4 = this.j;
                int i5 = this.i;
                int i6 = i4 - i5;
                if (i6 > 1) {
                    return new j52(k52Var, (i6 / 2) + i5, (byte) 0);
                }
                return null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.h;
        return this;
    }

    public j52(k52 k52Var, int i, byte b) {
        this.k = 0;
        this.l = k52Var;
        this.j = k52Var.p.length - 1;
        this.i = i;
        while (true) {
            int i2 = this.i;
            int[] iArr = this.l.o;
            int i3 = this.k + 1;
            if (i2 < iArr[i3]) {
                return;
            } else {
                this.k = i3;
            }
        }
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        byte b = this.h;
        k52 k52Var = this.l;
        switch (b) {
            case 0:
                int i = this.k;
                int i2 = this.j;
                int i3 = i - i2;
                if (i3 > 1) {
                    return new j52(k52Var, (i3 / 2) + i2);
                }
                return null;
            default:
                int i4 = this.j;
                int i5 = this.i;
                int i6 = i4 - i5;
                if (i6 > 1) {
                    return new j52(k52Var, (i6 / 2) + i5, (byte) 0);
                }
                return null;
        }
    }
}
