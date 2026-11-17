package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 extends qg1 implements d12, e90, c12 {
    public final uj1 A;
    public final uj1 B;
    public final uj1 C;
    public q02 D;
    public long E;
    public Object v;
    public Object w;
    public PointerInputEventHandler x;
    public dn2 y;
    public q02 z = oq2.a;

    public tq2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.v = obj;
        this.w = obj2;
        this.x = pointerInputEventHandler;
        uj1 uj1Var = new uj1(new sq2[16]);
        this.A = uj1Var;
        this.B = uj1Var;
        this.C = new uj1(new sq2[16]);
        this.E = 0L;
    }

    @Override // defpackage.qg1
    public final void C0() {
        L0();
    }

    public final Object J0(zp0 zp0Var, m10 m10Var) {
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        sq2 sq2Var = new sq2(this, rqVar);
        synchronized (this.B) {
            this.A.b(sq2Var);
            new gb2(ls.F(ls.v(sq2Var, sq2Var, zp0Var))).g(j23.a);
        }
        rqVar.w(new aa(sq2Var, (byte) 3));
        return rqVar.t();
    }

    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        this.E = j;
        if (s02Var == s02.h) {
            this.z = q02Var;
        }
        m10 m10Var = null;
        if (this.y == null) {
            this.y = ie1.p(x0(), null, new og(this, m10Var, (byte) 2), 1);
        }
        K0(q02Var, s02Var);
        List list = q02Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!r02.m((z02) list.get(i))) {
                this.D = q02Var;
            }
        }
        q02Var = null;
        this.D = q02Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000d, B:12:0x001a, B:13:0x0020, B:14:0x0021, B:17:0x002d, B:19:0x0035, B:21:0x0039, B:22:0x003e, B:23:0x0041, B:25:0x004a, B:27:0x0052, B:29:0x0056), top: B:39:0x000d }] */
    public final void K0(q02 q02Var, s02 s02Var) {
        Object[] objArr;
        int i;
        int i2;
        sq2 sq2Var;
        rq rqVar;
        rq rqVar2;
        synchronized (this.B) {
            uj1 uj1Var = this.C;
            uj1Var.c(uj1Var.j, this.A);
        }
        try {
            int iOrdinal = s02Var.ordinal();
            if (iOrdinal == 0) {
                uj1 uj1Var2 = this.C;
                objArr = uj1Var2.h;
                i = uj1Var2.j;
                for (i2 = 0; i2 < i; i2++) {
                    sq2Var = (sq2) objArr[i2];
                    if (s02Var != sq2Var.k && (rqVar = sq2Var.j) != null) {
                        sq2Var.j = null;
                        rqVar.g(q02Var);
                    }
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new a42((byte) 4);
                }
                uj1 uj1Var3 = this.C;
                objArr = uj1Var3.h;
                i = uj1Var3.j;
                while (i2 < i) {
                    sq2Var = (sq2) objArr[i2];
                    if (s02Var != sq2Var.k) {
                    }
                }
            } else {
                uj1 uj1Var4 = this.C;
                int i3 = uj1Var4.j - 1;
                Object[] objArr2 = uj1Var4.h;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        sq2 sq2Var2 = (sq2) objArr2[i3];
                        if (s02Var == sq2Var2.k && (rqVar2 = sq2Var2.j) != null) {
                            sq2Var2.j = null;
                            rqVar2.g(q02Var);
                        }
                        i3--;
                    }
                }
            }
            this.C.g();
        } catch (Throwable th) {
            this.C.g();
            throw th;
        }
    }

    public final void L0() {
        dn2 dn2Var = this.y;
        if (dn2Var != null) {
            dn2Var.C(new vg1("Pointer input was reset", (byte) 2));
            this.y = null;
        }
    }

    @Override // defpackage.j80
    public final void a() {
        L0();
    }

    @Override // defpackage.e90
    public final float b() {
        return cu.Y(this).E.b();
    }

    @Override // defpackage.c12
    public final void d0() {
        L0();
    }

    @Override // defpackage.c12
    public final void j0() {
        q02 q02Var = this.D;
        if (q02Var != null) {
            List list = q02Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((z02) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        z02 z02Var = (z02) list.get(i2);
                        long j = z02Var.a;
                        long j2 = z02Var.c;
                        long j3 = z02Var.b;
                        float f = z02Var.e;
                        boolean z = z02Var.d;
                        arrayList.add(new z02(j, j3, j2, false, f, j3, j2, z, z, z02Var.i, 0L, 1.0f, 0L));
                    }
                    q02 q02Var2 = new q02(arrayList, null);
                    this.z = q02Var2;
                    K0(q02Var2, s02.h);
                    K0(q02Var2, s02.i);
                    K0(q02Var2, s02.j);
                    this.D = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.e90
    public final float n() {
        return cu.Y(this).E.n();
    }
}
