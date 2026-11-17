package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t80 implements Iterator, l21 {
    public final /* synthetic */ byte h;
    public int i;
    public int j;
    public int k;
    public Object l;
    public final Object m;

    public t80(u80 u80Var) {
        this.h = (byte) 0;
        this.m = u80Var;
        this.i = -1;
        int iN = cy1.n(0, 0, ((CharSequence) u80Var.b).length());
        this.j = iN;
        this.k = iN;
    }

    public final void a() {
        u80 u80Var = (u80) this.m;
        CharSequence charSequence = (CharSequence) u80Var.b;
        int i = this.k;
        if (i < 0) {
            this.i = 0;
            this.l = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.j;
            charSequence.getClass();
            this.l = new qy0(i2, charSequence.length() - 1, 1);
            this.k = -1;
        } else {
            wt1 wt1Var = (wt1) ((s) u80Var.c).f(charSequence, Integer.valueOf(this.k));
            if (wt1Var == null) {
                int i3 = this.j;
                charSequence.getClass();
                this.l = new qy0(i3, charSequence.length() - 1, 1);
                this.k = -1;
            } else {
                int iIntValue = ((Number) wt1Var.h).intValue();
                int iIntValue2 = ((Number) wt1Var.i).intValue();
                this.l = cy1.S(this.j, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.j = i4;
                this.k = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.i = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i == -1) {
                    a();
                }
                return this.i == 1;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (this.i == -1) {
                    a();
                }
                if (this.i == 0) {
                    wg.p();
                    return null;
                }
                qy0 qy0Var = (qy0) this.l;
                qy0Var.getClass();
                this.l = null;
                this.i = -1;
                return qy0Var;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t80(fk2 fk2Var, int i, fr0 fr0Var, r02 r02Var) {
        this.h = (byte) 1;
        this.l = fk2Var;
        this.i = i;
        this.m = r02Var;
        this.j = fk2Var.o;
    }
}
