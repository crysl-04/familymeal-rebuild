package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 extends qy {
    public final mj1 b;
    public final ArrayList c;
    public final mj1 d;
    public final v3 e;

    public zh1() {
        super((byte) 3);
        this.b = p02.v();
        this.c = new ArrayList();
        this.d = new mj1();
        s sVar = new s(this, (byte) 16);
        bl2.b(bl2.a);
        synchronized (bl2.c) {
            bl2.h = dv.J0(bl2.h, sVar);
        }
        this.e = new v3(sVar);
    }

    @Override // defpackage.qy
    public final void d(ds dsVar) {
        this.c.add(new xh1(dsVar));
    }

    @Override // defpackage.qy
    public final void e() {
        synchronized (this.a) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yh1 yh1Var = (yh1) arrayList.get(i);
                if (yh1Var instanceof wh1) {
                    p02.e(this.b, ((wh1) yh1Var).a, ((wh1) yh1Var).b);
                } else {
                    if (!(yh1Var instanceof xh1)) {
                        throw new a42((byte) 4);
                    }
                    p02.G(this.b, ((xh1) yh1Var).a);
                }
            }
        }
        this.c.clear();
    }

    @Override // defpackage.qy
    public final void f() {
        this.e.b();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.qy
    public final vp0 l(ds dsVar) {
        mj1 mj1Var = this.d;
        vp0 gVar = (vp0) mj1Var.g(dsVar);
        if (gVar == null) {
            gVar = new g(this, dsVar, (byte) 22);
            int iF = mj1Var.f(dsVar);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = mj1Var.c;
            Object obj = objArr[iF];
            mj1Var.b[iF] = dsVar;
            objArr[iF] = gVar;
        }
        return gVar;
    }

    @Override // defpackage.qy
    public final void m(ds dsVar) {
        this.d.l(dsVar);
        d(dsVar);
        e();
    }
}
