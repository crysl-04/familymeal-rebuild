package defpackage;

import android.graphics.Paint;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u3 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ u3(x20 x20Var, sj1 sj1Var, b81 b81Var, qy0 qy0Var, iq iqVar) {
        this.h = (byte) 3;
        this.i = x20Var;
        this.m = sj1Var;
        this.j = b81Var;
        this.k = qy0Var;
        this.l = iqVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        List listSubList;
        byte b = this.h;
        boolean z = false;
        j23 j23Var = j23.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (b) {
            case 0:
                q3 q3Var = (q3) obj6;
                q3Var.a = ((ex) obj5).c((String) obj4, (p3) obj3, new v3((sj1) obj2));
                return new w3(q3Var, (byte) 0);
            case 1:
                q81 q81Var = (q81) obj;
                k81 k81Var = ((c9) obj5).a;
                q81Var.h = (vv2) obj6;
                q81Var.i = (nu0) obj4;
                q81Var.c = (qb) obj3;
                q81Var.d = (v10) obj2;
                q81Var.e = k81Var != null ? k81Var.w : null;
                q81Var.f = k81Var != null ? k81Var.x : null;
                q81Var.g = k81Var != null ? (v43) vs.z(k81Var, uz.t) : null;
                return j23Var;
            case 2:
                m12 m12Var = (m12) obj6;
                m12Var.w.addView(m12Var, m12Var.x);
                m12Var.o((kp0) obj5, (p12) obj3, (String) obj4, (u31) obj2);
                return new w3(m12Var, (byte) 2);
            case 3:
                sj1 sj1Var = (sj1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                rt1 rt1Var = n60.a;
                sj1Var.setValue(Boolean.valueOf(!((Boolean) sj1Var.getValue()).booleanValue()));
                ie1.p((x20) obj6, null, new w50((b81) obj5, iIntValue, (qy0) obj4, (iq) obj3, null), 3);
                return j23Var;
            case 4:
                nh1 nh1Var = (nh1) obj6;
                x72 x72Var = (x72) obj5;
                u72 u72Var = (u72) obj4;
                qe2 qe2Var = (qe2) obj3;
                t72 t72Var = (t72) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                jh1 jh1VarG = nh1.g(nh1Var.g);
                if (jh1VarG != null) {
                    ix0 ix0Var = nh1Var.e;
                    long j = jh1VarG.b;
                    long j2 = jh1VarG.a;
                    ((c43) ix0Var.i).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((c43) ix0Var.j).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    jh1 jh1VarA = ((jh1) x72Var.h).a(jh1VarG);
                    x72Var.h = jh1VarA;
                    float fJ = qe2Var.j(qe2Var.f(jh1VarA.a));
                    u72Var.h = fJ;
                    t72Var.h = !vs.L(fJ - fFloatValue);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ArrayList arrayList = (ArrayList) obj5;
                v72 v72Var = (v72) obj4;
                xk1 xk1Var = (xk1) obj3;
                Bundle bundle = (Bundle) obj2;
                pk1 pk1Var = (pk1) obj;
                pk1Var.getClass();
                ((t72) obj6).h = true;
                int iIndexOf = arrayList.indexOf(pk1Var);
                if (iIndexOf != -1) {
                    int i = iIndexOf + 1;
                    listSubList = arrayList.subList(v72Var.h, i);
                    v72Var.h = i;
                } else {
                    listSubList = ag0.h;
                }
                xk1Var.a(pk1Var.i, bundle, pk1Var, listSubList);
                return j23Var;
            default:
                xp1 xp1Var = (xp1) obj5;
                vv2 vv2Var = (vv2) obj4;
                p81 p81Var = (p81) obj3;
                rl2 rl2Var = (rl2) obj2;
                n41 n41Var = (n41) obj;
                n41Var.a();
                yq yqVar = n41Var.h;
                float fG = ((q30) obj6).c.g();
                if (fG != 0.0f) {
                    long j3 = vv2Var.b;
                    int i2 = qw2.c;
                    int iS = xp1Var.s((int) (j3 >> 32));
                    kw2 kw2VarD = p81Var.d();
                    r72 r72VarC = kw2VarD != null ? kw2VarD.a.c(iS) : new r72(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(n41Var.A(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = r72VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (yqVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(r72VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(r72VarC.d)) & 4294967295L);
                    wq wqVar = yqVar.h.c;
                    e9 e9VarD = yqVar.k;
                    if (e9VarD == null) {
                        e9VarD = aa3.d();
                        e9VarD.l(1);
                        yqVar.k = e9VarD;
                    }
                    Paint paint = (Paint) e9VarD.b;
                    rl2Var.a(fG, yqVar.d(), e9VarD);
                    if (!uz0.g((ln) e9VarD.d, null)) {
                        e9VarD.f(null);
                    }
                    if (e9VarD.a != 3) {
                        e9VarD.d(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        e9VarD.k(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (e9VarD.a() != 0) {
                        e9VarD.i(0);
                    }
                    if (e9VarD.b() != 0) {
                        e9VarD.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        e9VarD.g(1);
                    }
                    wqVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, e9VarD);
                }
                return j23Var;
        }
    }

    public /* synthetic */ u3(m12 m12Var, kp0 kp0Var, p12 p12Var, String str, u31 u31Var) {
        this.h = (byte) 2;
        this.i = m12Var;
        this.j = kp0Var;
        this.l = p12Var;
        this.k = str;
        this.m = u31Var;
    }

    public /* synthetic */ u3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
    }
}
