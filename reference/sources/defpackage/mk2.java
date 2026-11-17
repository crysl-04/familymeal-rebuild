package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mk2 extends mq2 implements zp0 {
    public u72 l;
    public byte m;
    public final /* synthetic */ pk2 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ ss2 p;
    public final /* synthetic */ w71 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk2(pk2 pk2Var, float f, ss2 ss2Var, w71 w71Var, m10 m10Var) {
        super(2, m10Var);
        this.n = pk2Var;
        this.o = f;
        this.p = ss2Var;
        this.q = w71Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((mk2) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new mk2(this.n, this.o, this.p, this.q, m10Var);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        u72 u72Var;
        pk2 pk2Var;
        Object objD;
        char c;
        float f;
        char c2;
        float f2;
        byte b = this.m;
        int i = 0;
        v71 v71Var = null;
        float f3 = 0.0f;
        char c3 = 2;
        boolean z = true;
        ss2 ss2Var = this.p;
        pk2 pk2Var2 = this.n;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            u60 u60Var = pk2Var2.b;
            float f4 = this.o;
            ys.l(u60Var, f4);
            u72Var = new u72();
            float fSignum = Math.signum(f4) * 0.0f;
            u72Var.h = fSignum;
            ss2Var.h(new Float(fSignum));
            float f5 = u72Var.h;
            lk2 lk2Var = new lk2(u72Var, ss2Var, (byte) 0);
            this.l = u72Var;
            this.m = (byte) 1;
            pk2Var = pk2Var2;
            objD = pk2Var.d(this.q, f5, this.o, lk2Var, this);
            if (objD != y20Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                m02.y(obj);
                return obj;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        u72 u72Var2 = this.l;
        m02.y(obj);
        u72Var = u72Var2;
        pk2Var = pk2Var2;
        objD = obj;
        dd ddVar = (dd) objD;
        g2 g2Var = pk2Var.a;
        float fFloatValue = ((Number) ddVar.a()).floatValue();
        b81 b81Var = ((x71) g2Var.i).a;
        List list = b81Var.j().l;
        int size = list.size();
        float f6 = Float.POSITIVE_INFINITY;
        float f7 = Float.NEGATIVE_INFINITY;
        while (i < size) {
            v71 v71Var2 = (v71) list.get(i);
            if (v71Var2 != null) {
                v71Var = v71Var2;
            }
            if (v71Var == null || v71Var.s != z) {
                u71 u71VarJ = b81Var.j();
                f = f3;
                c2 = c3;
                int i2 = (int) (u71VarJ.p == ks1.h ? u71VarJ.i() & 4294967295L : u71VarJ.i() >> 32);
                int i3 = -b81Var.j().m;
                int i4 = b81Var.j().q;
                int i5 = v71Var2.m;
                int i6 = v71Var2.l;
                f2 = fFloatValue;
                int i7 = b81Var.j().o;
                float f8 = i6 - ((((i2 - i3) - i4) / 2) - (i5 / 2));
                if (f8 <= f && f8 > f7) {
                    f7 = f8;
                }
                if (f8 >= f && f8 < f6) {
                    f6 = f8;
                }
            } else {
                f2 = fFloatValue;
                f = f3;
                c2 = c3;
            }
            i++;
            f3 = f;
            c3 = c2;
            fFloatValue = f2;
            v71Var = null;
            z = true;
        }
        float f9 = fFloatValue;
        float f10 = f3;
        char c4 = c3;
        if (Math.abs(f9) < ((u71) b81Var.f.getValue()).i.A(400.0f)) {
            c = 0;
        } else {
            c = f9 > f10 ? (char) 1 : c4;
        }
        if (c == 0) {
            if (Math.abs(f6) <= Math.abs(f7)) {
                f7 = f6;
            }
        } else if (c == 1) {
            f7 = f6;
        } else if (c != c4) {
            f7 = f10;
        }
        float f11 = (f7 == Float.POSITIVE_INFINITY || f7 == Float.NEGATIVE_INFINITY) ? f10 : f7;
        if (Float.isNaN(f11)) {
            dx0.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        u72Var.h = f11;
        dd ddVarK = ie1.k(ddVar, f10, f10, 30);
        zm2 zm2Var = pk2Var.c;
        lk2 lk2Var2 = new lk2(u72Var, ss2Var, (byte) 1);
        this.l = null;
        this.m = (byte) 2;
        Object objG = r02.g(this.q, f11, f11, ddVarK, zm2Var, lk2Var2, this);
        return objG == y20Var ? y20Var : objG;
    }
}
