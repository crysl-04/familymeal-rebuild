package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j21 {
    public final fe a;
    public final short b;
    public int c;

    public j21(j11 j11Var, fe feVar) {
        this.a = feVar;
        this.b = j11Var.i;
        this.c = ((d21) feVar.d).e;
    }

    public final n11 a() {
        fe feVar = this.a;
        byte bV = feVar.v();
        if (bV == 1) {
            return d(true);
        }
        if (bV == 0) {
            return d(false);
        }
        short s = this.b;
        if (bV != 6) {
            if (bV != 8) {
                fe.m(feVar, "Cannot read Json element because of unexpected ".concat(s60.L(bV)), 0, null, 6);
                throw null;
            }
            int i = this.c + 1;
            this.c = i;
            if (i >= s) {
                ou.C(s);
                throw null;
            }
            e11 e11VarB = b();
            this.c--;
            return e11VarB;
        }
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 >= s) {
            ou.C(s);
            throw null;
        }
        if (i3 != 200) {
            byte bG = feVar.g((byte) 6);
            if (feVar.v() == 4) {
                fe.m(feVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (feVar.c()) {
                String strJ = feVar.j();
                feVar.g((byte) 5);
                linkedHashMap.put(strJ, a());
                bG = feVar.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    fe.m(feVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                feVar.g((byte) 7);
            } else if (bG == 4) {
                lt.I(feVar, "object");
                throw null;
            }
            a21 a21Var = new a21(linkedHashMap);
            this.c--;
            return a21Var;
        }
        this.c = i2;
        h21 h21Var = new h21(this, null);
        x60 x60Var = new x60();
        x60Var.h = h21Var;
        x60Var.i = x60Var;
        y20 y20Var = uz0.x;
        x60Var.j = y20Var;
        while (true) {
            Object obj = x60Var.j;
            m10 m10Var = x60Var.i;
            if (m10Var == null) {
                m02.y(obj);
                return (n11) obj;
            }
            if (uz0.g(y20Var, obj)) {
                try {
                    h21 h21Var2 = x60Var.h;
                    t03.k(3, h21Var2);
                    h21 h21Var3 = new h21(h21Var2.m, m10Var);
                    h21Var3.l = x60Var;
                    Object objR = h21Var3.r(j23.a);
                    if (objR != y20.h) {
                        m10Var.g(objR);
                    }
                } catch (Throwable th) {
                    m10Var.g(new d92(th));
                }
            } else {
                x60Var.j = y20Var;
                m10Var.g(obj);
            }
        }
    }

    public final e11 b() {
        fe feVar = this.a;
        byte bF = feVar.f();
        if (feVar.v() == 4) {
            fe.m(feVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (feVar.c()) {
            arrayList.add(a());
            bF = feVar.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = feVar.b;
                if (z) {
                    break;
                }
                fe.m(feVar, "Expected end of the array or comma", i, null, 4);
                throw null;
            }
        }
        if (bF == 8) {
            feVar.g((byte) 9);
        } else if (bF == 4) {
            lt.I(feVar, "array");
            throw null;
        }
        return new e11(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x60 x60Var, rk rkVar) {
        i21 i21Var;
        byte bG;
        LinkedHashMap linkedHashMap;
        j21 j21Var;
        byte bF;
        LinkedHashMap linkedHashMap2;
        fe feVar;
        if (rkVar instanceof i21) {
            i21Var = (i21) rkVar;
            int i = i21Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                i21Var.q = i - Integer.MIN_VALUE;
            } else {
                i21Var = new i21(this, rkVar);
            }
        } else {
            i21Var = new i21(this, rkVar);
        }
        Object obj = i21Var.o;
        int i2 = i21Var.q;
        if (i2 != 0) {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = i21Var.n;
            linkedHashMap2 = i21Var.m;
            j21Var = i21Var.l;
            x60 x60Var2 = i21Var.k;
            m02.y(obj);
            linkedHashMap2.put(str, (n11) obj);
            bF = j21Var.a.f();
            if (bF == 4) {
                bG = bF;
                this = j21Var;
                linkedHashMap = linkedHashMap2;
                x60Var = x60Var2;
            } else if (bF != 7) {
                fe.m(j21Var.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            feVar = j21Var.a;
            if (bF == 6) {
                feVar.g((byte) 7);
            } else if (bF == 4) {
                lt.I(feVar, "object");
                throw null;
            }
            return new a21(linkedHashMap2);
        }
        m02.y(obj);
        fe feVar2 = this.a;
        bG = feVar2.g((byte) 6);
        if (feVar2.v() == 4) {
            fe.m(feVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        fe feVar3 = this.a;
        if (feVar3.c()) {
            String strJ = feVar3.j();
            feVar3.g((byte) 5);
            i21Var.k = x60Var;
            i21Var.l = this;
            i21Var.m = linkedHashMap;
            i21Var.n = strJ;
            i21Var.q = 1;
            x60Var.getClass();
            x60Var.i = i21Var;
            return y20.h;
        }
        byte b = bG;
        j21Var = this;
        bF = b;
        linkedHashMap2 = linkedHashMap;
        feVar = j21Var.a;
        if (bF == 6) {
            feVar.g((byte) 7);
        } else if (bF == 4) {
            lt.I(feVar, "object");
            throw null;
        }
        return new a21(linkedHashMap2);
    }

    public final f21 d(boolean z) {
        fe feVar = this.a;
        String strK = !z ? feVar.k() : feVar.j();
        return (z || !uz0.g(strK, "null")) ? new u11(strK, z) : x11.INSTANCE;
    }
}
