package kotlinx.serialization.json.internal;

import defpackage.az;
import defpackage.b32;
import defpackage.bu;
import defpackage.cz;
import defpackage.d32;
import defpackage.dz;
import defpackage.g12;
import defpackage.h12;
import defpackage.i12;
import defpackage.ia2;
import defpackage.j11;
import defpackage.jy1;
import defpackage.l11;
import defpackage.li1;
import defpackage.ls;
import defpackage.lt;
import defpackage.o11;
import defpackage.p02;
import defpackage.p4;
import defpackage.po2;
import defpackage.r21;
import defpackage.rh2;
import defpackage.t03;
import defpackage.t11;
import defpackage.t81;
import defpackage.uz0;
import defpackage.vh2;
import defpackage.wg;
import defpackage.wi0;
import defpackage.wn2;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final az a;
    public final t11 b;
    public final t81 c;
    public final b[] d;
    public final jy1 e;
    public final j11 f;
    public boolean g;
    public String h;
    public String i;

    public b(az azVar, t11 t11Var, t81 t81Var, b[] bVarArr) {
        this.a = azVar;
        this.b = t11Var;
        this.c = t81Var;
        this.d = bVarArr;
        this.e = t11Var.b;
        this.f = t11Var.a;
        int iOrdinal = t81Var.ordinal();
        if (bVarArr != null) {
            b bVar = bVarArr[iOrdinal];
            if (bVar == null && bVar == this) {
                return;
            }
            bVarArr[iOrdinal] = this;
        }
    }

    public final b a(rh2 rh2Var) {
        b bVar;
        rh2Var.getClass();
        t11 t11Var = this.b;
        t81 t81VarV = ls.V(t11Var, rh2Var);
        char c = t81VarV.h;
        az azVar = this.a;
        azVar.f(c);
        azVar.a();
        String str = this.h;
        if (str != null) {
            String strB = this.i;
            if (strB == null) {
                strB = rh2Var.b();
            }
            azVar.b();
            azVar.j(str);
            azVar.f(':');
            azVar.k();
            r(strB);
            this.h = null;
            this.i = null;
        }
        if (this.c == t81VarV) {
            return this;
        }
        b[] bVarArr = this.d;
        return (bVarArr == null || (bVar = bVarArr[t81VarV.ordinal()]) == null) ? new b(azVar, t11Var, t81VarV, bVarArr) : bVar;
    }

    public final void b(boolean z) {
        if (this.g) {
            r(String.valueOf(z));
        } else {
            ((p4) this.a.b).i(String.valueOf(z));
        }
    }

    public final void c(byte b) {
        if (this.g) {
            r(String.valueOf((int) b));
        } else {
            this.a.e(b);
        }
    }

    public final void d(char c) {
        r(String.valueOf(c));
    }

    public final void e(double d) {
        if (this.g) {
            r(String.valueOf(d));
        } else {
            ((p4) this.a.b).i(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new l11(lt.U(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final void f(rh2 rh2Var, int i, double d) {
        rh2Var.getClass();
        g(rh2Var, i);
        e(d);
    }

    public final void g(rh2 rh2Var, int i) {
        rh2Var.getClass();
        int iOrdinal = this.c.ordinal();
        az azVar = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!azVar.a) {
                azVar.f(',');
            }
            azVar.b();
            return;
        }
        if (iOrdinal == 2) {
            if (azVar.a) {
                this.g = true;
                azVar.b();
                return;
            }
            if (i % 2 == 0) {
                azVar.f(',');
                azVar.b();
            } else {
                azVar.f(':');
                azVar.k();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!azVar.a) {
                azVar.f(',');
            }
            azVar.b();
            ia2.s(this.b, rh2Var);
            r(rh2Var.e(i));
            azVar.f(':');
            azVar.k();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            azVar.f(',');
            azVar.k();
            this.g = false;
        }
    }

    public final void h(float f) {
        if (this.g) {
            r(String.valueOf(f));
        } else {
            ((p4) this.a.b).i(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new l11(lt.U(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final b i(rh2 rh2Var) {
        az czVar = this.a;
        p4 p4Var = (p4) czVar.b;
        rh2Var.getClass();
        boolean zA = wn2.a(rh2Var);
        t81 t81Var = this.c;
        t11 t11Var = this.b;
        if (zA) {
            if (!(czVar instanceof dz)) {
                czVar = new dz(p4Var, this.g);
            }
            return new b(czVar, t11Var, t81Var, null);
        }
        if (rh2Var.f() && rh2Var.equals(o11.a)) {
            if (!(czVar instanceof cz)) {
                czVar = new cz(p4Var, this.g);
            }
            return new b(czVar, t11Var, t81Var, null);
        }
        if (this.h != null) {
            this.i = rh2Var.b();
        }
        return this;
    }

    public final b j(b32 b32Var, int i) {
        g(b32Var, i);
        return i(b32Var.j(i));
    }

    public final void k(int i) {
        if (this.g) {
            r(String.valueOf(i));
        } else {
            this.a.g(i);
        }
    }

    public final void l(long j) {
        if (this.g) {
            r(String.valueOf(j));
        } else {
            this.a.h(j);
        }
    }

    public final void m() {
        ((p4) this.a.b).i("null");
    }

    public final void n(rh2 rh2Var, int i, r21 r21Var, Object obj) {
        rh2Var.getClass();
        if (obj != null || this.f.c) {
            rh2Var.getClass();
            g(rh2Var, i);
            if (r21Var.d().h()) {
                p(r21Var, obj);
            } else if (obj == null) {
                m();
            } else {
                p(r21Var, obj);
            }
        }
    }

    public final void o(rh2 rh2Var, int i, r21 r21Var, Object obj) {
        rh2Var.getClass();
        r21Var.getClass();
        g(rh2Var, i);
        p(r21Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public final void p(r21 r21Var, Object obj) {
        String strF;
        String str;
        r21Var.getClass();
        t11 t11Var = this.b;
        j11 j11Var = t11Var.a;
        boolean z = r21Var instanceof i12;
        bu buVar = j11Var.g;
        if (!z) {
            int iOrdinal = buVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    p02 p02VarC = r21Var.d().c();
                    if (uz0.g(p02VarC, po2.i) || uz0.g(p02VarC, po2.l)) {
                        strF = h12.f(t11Var, r21Var.d());
                    }
                } else if (iOrdinal != 2) {
                    wg.n();
                    return;
                }
            }
            strF = null;
        } else if (buVar != bu.h) {
            strF = h12.f(t11Var, r21Var.d());
        } else {
            strF = null;
        }
        if (z) {
            i12 i12Var = (i12) r21Var;
            if (obj == null) {
                li1.h("Value for serializer ", i12Var.d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            } else {
                obj.getClass();
                this.e.getClass();
                throw null;
            }
        }
        if (strF != null) {
            rh2 rh2VarD = r21Var.d();
            rh2VarD.getClass();
            ia2.s(t11Var, rh2VarD);
            if (t03.m(rh2VarD).contains(strF)) {
                String strB = r21Var.d().b();
                String strB2 = r21Var.d().b();
                if (j11Var.g == bu.i && uz0.g(strB, strB2)) {
                    str = "in ALL_JSON_OBJECTS class discriminator mode";
                } else {
                    str = "as base class '" + strB + '\'';
                }
                throw new l11(wi0.i(wi0.l("Class '", strB2, "' cannot be serialized ", str, " because it has property name that conflicts with JSON class discriminator '"), strF, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            p02 p02VarC2 = r21Var.d().c();
            p02VarC2.getClass();
            if (p02VarC2 instanceof vh2) {
                li1.g("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (p02VarC2 instanceof d32) {
                li1.g("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (p02VarC2 instanceof g12) {
                li1.g("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strB3 = r21Var.d().b();
                this.h = strF;
                this.i = strB3;
            }
        }
        r21Var.c(this, obj);
    }

    public final void q(short s) {
        if (this.g) {
            r(String.valueOf((int) s));
        } else {
            this.a.i(s);
        }
    }

    public final void r(String str) {
        str.getClass();
        this.a.j(str);
    }

    public final void s(rh2 rh2Var, int i, String str) {
        rh2Var.getClass();
        str.getClass();
        g(rh2Var, i);
        r(str);
    }

    public final void t(rh2 rh2Var) {
        rh2Var.getClass();
        az azVar = this.a;
        azVar.l();
        azVar.c();
        azVar.f(this.c.i);
    }

    public final boolean u(rh2 rh2Var) {
        rh2Var.getClass();
        return false;
    }
}
