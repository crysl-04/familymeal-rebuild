package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix2 {
    public static final /* synthetic */ long b = hi.a.objectFieldOffset(ix2.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public qh0[] a;

    public final void a(qh0 qh0Var) {
        qh0Var.d((rh0) this);
        qh0[] qh0VarArr = this.a;
        if (qh0VarArr == null) {
            qh0VarArr = new qh0[4];
            this.a = qh0VarArr;
        } else if (b() >= qh0VarArr.length) {
            qh0VarArr = (qh0[]) Arrays.copyOf(qh0VarArr, b() << 1);
            this.a = qh0VarArr;
        }
        int iB = b();
        hi.a.putIntVolatile(this, b, iB + 1);
        qh0VarArr[iB] = qh0Var;
        qh0Var.i = iB;
        d(iB);
    }

    public final int b() {
        return hi.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074 A[LOOP:0: B:9:0x003c->B:18:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[EDGE_INSN: B:21:0x0079->B:19:0x0079 BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[EDGE_INSN: B:22:0x0079->B:19:0x0079 BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[SYNTHETIC] */
    public final qh0 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        hi.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i <= 0) {
                while (true) {
                    i2 = i << 1;
                    i3 = i2 + 1;
                    if (i3 < b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) > 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            } else {
                qh0 qh0Var = objArr2[i];
                qh0Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (qh0Var.compareTo(obj2) >= 0) {
                    while (true) {
                        i2 = i << 1;
                        i3 = i2 + 1;
                        if (i3 < b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) > 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                } else {
                    e(i, i5);
                    d(i5);
                }
            }
        }
        qh0 qh0Var2 = objArr2[b()];
        qh0Var2.getClass();
        qh0Var2.d(null);
        qh0Var2.i = -1;
        objArr2[b()] = null;
        return qh0Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            qh0[] qh0VarArr = this.a;
            qh0VarArr.getClass();
            int i2 = (i - 1) / 2;
            qh0 qh0Var = qh0VarArr[i2];
            qh0Var.getClass();
            qh0 qh0Var2 = qh0VarArr[i];
            qh0Var2.getClass();
            if (qh0Var.compareTo(qh0Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        qh0[] qh0VarArr = this.a;
        qh0VarArr.getClass();
        qh0 qh0Var = qh0VarArr[i2];
        qh0Var.getClass();
        qh0 qh0Var2 = qh0VarArr[i];
        qh0Var2.getClass();
        qh0VarArr[i] = qh0Var;
        qh0VarArr[i2] = qh0Var2;
        qh0Var.i = i;
        qh0Var2.i = i2;
    }
}
