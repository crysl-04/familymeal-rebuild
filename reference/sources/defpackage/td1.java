package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class td1 extends vd1 implements Iterator, l21 {
    public final /* synthetic */ byte l;

    public td1(wd1 wd1Var, byte b) {
        this.l = b;
        wd1Var.getClass();
        this.k = wd1Var;
        this.i = -1;
        this.j = wd1Var.o;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                b();
                int i = this.h;
                wd1 wd1Var = (wd1) this.k;
                if (i >= wd1Var.m) {
                    wg.p();
                    return null;
                }
                this.h = i + 1;
                this.i = i;
                ud1 ud1Var = new ud1(wd1Var, i);
                c();
                return ud1Var;
            case 1:
                b();
                int i2 = this.h;
                wd1 wd1Var2 = (wd1) this.k;
                if (i2 >= wd1Var2.m) {
                    wg.p();
                    return null;
                }
                this.h = i2 + 1;
                this.i = i2;
                Object obj = wd1Var2.h[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.h;
                wd1 wd1Var3 = (wd1) this.k;
                if (i3 >= wd1Var3.m) {
                    wg.p();
                    return null;
                }
                this.h = i3 + 1;
                this.i = i3;
                Object[] objArr = wd1Var3.i;
                objArr.getClass();
                Object obj2 = objArr[this.i];
                c();
                return obj2;
        }
    }
}
