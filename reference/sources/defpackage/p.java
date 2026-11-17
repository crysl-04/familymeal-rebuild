package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.View;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p(we0 we0Var, ix0 ix0Var) {
        this.h = (byte) 20;
        this.i = we0Var;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0436  */
    /* JADX WARN: Code duplicated, block: B:213:0x0470  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        final ud0 ko2Var;
        int i;
        ln lnVar;
        boolean z;
        t8 t8VarD;
        a6 a6Var;
        int i2;
        String strConcat;
        int length;
        int i3;
        String str;
        t51 t51Var;
        byte b = this.h;
        byte b2 = 5;
        float f = 0.0f;
        byte b3 = 7;
        int i4 = 0;
        t51 t51Var2 = null;
        j23 j23Var = j23.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return obj == ((q) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ex1 ex1Var = (ex1) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == ex1Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != ex1Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                c4 c4Var = (c4) obj2;
                c4Var.x.f((dt2) obj, vs.z(c4Var, i7.b));
                return j23Var;
            case 3:
                m41 m41Var = (m41) obj2;
                i5 i5Var = (i5) obj;
                if (i5Var.W() != Integer.MAX_VALUE) {
                    if (i5Var.a().b) {
                        i5Var.r();
                    }
                    for (Map.Entry entry2 : i5Var.a().i.entrySet()) {
                        m41Var.a((e5) entry2.getKey(), ((Number) entry2.getValue()).intValue(), i5Var.p());
                    }
                    pn1 pn1Var = i5Var.p().D;
                    pn1Var.getClass();
                    while (!pn1Var.equals(m41Var.a.p())) {
                        for (e5 e5Var : m41Var.b(pn1Var).keySet()) {
                            m41Var.a(e5Var, m41Var.c(pn1Var, e5Var), pn1Var);
                        }
                        pn1Var = pn1Var.D;
                        pn1Var.getClass();
                    }
                }
                return j23Var;
            case 4:
                return Boolean.valueOf(((lm0) obj).R0(((ul0) obj2).a));
            case 5:
                yc1 yc1Var = (yc1) obj;
                t6 t6Var = ((n6) obj2).w;
                if (t6Var.getInsetsListener().n.g() > 0) {
                    si1 si1Var = y83.a;
                    long jO = yc1Var.a().O();
                    mj1 mj1Var = t6Var.getInsetsListener().m;
                    int i5 = (int) (jO >> 32);
                    int i6 = (int) (jO & 4294967295L);
                    for (w83 w83Var : y83.b) {
                        Object objG = mj1Var.g(w83Var);
                        objG.getClass();
                        k93 k93Var = (k93) objG;
                        y83.a(yc1Var, ((x83) w83Var).c, k93Var.h, i5, i6);
                        if (((Boolean) k93Var.b.getValue()).booleanValue()) {
                            y83.a(yc1Var, k93Var.f, k93Var.j, i5, i6);
                            y83.a(yc1Var, k93Var.g, k93Var.k, i5, i6);
                        }
                        y83.a(yc1Var, ((x83) w83Var).d, k93Var.i, i5, i6);
                    }
                    fj1 fj1Var = t6Var.getInsetsListener().o;
                    if (fj1Var.j()) {
                        ll2 ll2Var = t6Var.getInsetsListener().p;
                        Object[] objArr = fj1Var.a;
                        int i7 = fj1Var.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            sj1 sj1Var = (sj1) objArr[i8];
                            hx0 hx0Var = (hx0) ll2Var.get(i8);
                            Rect rect = (Rect) sj1Var.getValue();
                            yc1Var.c(hx0Var.b(), rect.left);
                            yc1Var.c(hx0Var.d(), rect.top);
                            yc1Var.c(hx0Var.c(), rect.right);
                            yc1Var.c(hx0Var.a(), rect.bottom);
                        }
                    }
                }
                return j23Var;
            case 6:
                return Boolean.valueOf(((ly0) obj2).a(((wg2) obj).f));
            case 7:
                return Boolean.valueOf(s60.t((wg2) obj, (Resources) obj2));
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                ((dh2) obj).a(mg2.a, new lg2(os0.h, ((yp1) obj2).a(), kg2.i, true));
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return new w3((gl) obj2, (byte) 4);
            case 10:
                return new w3((ry2) obj2, b2);
            case 11:
                xn xnVar = (xn) obj2;
                zp zpVar = (zp) obj;
                if (zpVar.b() * xnVar.y < 0.0f || wj2.b(zpVar.h.d()) <= 0.0f) {
                    return zpVar.a(new s0((byte) 23));
                }
                final float fMin = Math.min(cc0.b(xnVar.y, 0.0f) ? 1.0f : (float) Math.ceil(zpVar.b() * xnVar.y), (float) Math.ceil(wj2.b(zpVar.h.d()) / 2.0f));
                final float f2 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (zpVar.h.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (zpVar.h.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f3 = fMin * 2.0f;
                boolean z2 = f3 > wj2.b(zpVar.h.d());
                ou ouVarA = xnVar.A.a(zpVar.h.d(), zpVar.h.getLayoutDirection(), zpVar);
                if (!(ouVarA instanceof ms1)) {
                    if (!(ouVarA instanceof os1)) {
                        boolean z3 = z2;
                        if (!(ouVarA instanceof ns1)) {
                            wg.n();
                            return null;
                        }
                        final rl2 rl2Var = xnVar.z;
                        if (z3) {
                            jFloatToRawIntBits2 = zpVar.h.d();
                            jFloatToRawIntBits = 0;
                            ko2Var = xi0.a;
                        } else {
                            ko2Var = new ko2(fMin, 0.0f, 0, 0, 30);
                        }
                        final long j = jFloatToRawIntBits;
                        final long j2 = jFloatToRawIntBits2;
                        return zpVar.a(new vp0() { // from class: un
                            @Override // defpackage.vp0
                            public final Object h(Object obj3) {
                                n41 n41Var = (n41) obj3;
                                n41Var.a();
                                td0.V(n41Var, rl2Var, j, j2, 0.0f, ko2Var, 104);
                                return j23.a;
                            }
                        });
                    }
                    final rl2 rl2Var2 = xnVar.z;
                    na2 na2Var = ((os1) ouVarA).g;
                    if (h12.o(na2Var)) {
                        final long j3 = na2Var.e;
                        final ko2 ko2Var2 = new ko2(fMin, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return zpVar.a(new vp0() { // from class: vn
                            @Override // defpackage.vp0
                            public final Object h(Object obj3) throws Throwable {
                                long j4;
                                n41 n41Var = (n41) obj3;
                                n41Var.a();
                                yq yqVar = n41Var.h;
                                boolean z5 = z4;
                                rl2 rl2Var3 = rl2Var2;
                                long j5 = j3;
                                if (z5) {
                                    td0.D(n41Var, rl2Var3, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f4 = f2;
                                    if (fIntBitsToFloat < f4) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (yqVar.d() >> 32));
                                        float f5 = fMin;
                                        float f6 = fIntBitsToFloat2 - f5;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (yqVar.d() & 4294967295L)) - f5;
                                        eg egVar = yqVar.i;
                                        long jQ = egVar.q();
                                        egVar.g().l();
                                        try {
                                            ((eg) ((g2) egVar.i).i).g().f(f5, f5, f6, fIntBitsToFloat3, 0);
                                            j4 = jQ;
                                            try {
                                                td0.D(n41Var, rl2Var3, 0L, 0L, j5, null, 246);
                                                wi0.r(egVar, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                wi0.r(egVar, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jQ;
                                        }
                                    } else {
                                        td0.D(n41Var, rl2Var3, jFloatToRawIntBits, jFloatToRawIntBits2, h7.p0(f4, j5), ko2Var2, 208);
                                    }
                                }
                                return j23.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    tn tnVar = xnVar.x;
                    if (tnVar == null) {
                        tnVar = new tn();
                        xnVar.x = tnVar;
                    }
                    l9 l9VarA = tnVar.d;
                    if (l9VarA == null) {
                        l9VarA = n9.a();
                        tnVar.d = l9VarA;
                    }
                    l9VarA.f();
                    l9.b(l9VarA, na2Var);
                    if (!z5) {
                        l9 l9VarA2 = n9.a();
                        l9.b(l9VarA2, new na2(fMin, fMin, (na2Var.c - na2Var.a) - fMin, (na2Var.d - na2Var.b) - fMin, h7.p0(fMin, na2Var.e), h7.p0(fMin, na2Var.f), h7.p0(fMin, na2Var.g), h7.p0(fMin, na2Var.h)));
                        l9VarA.e(l9VarA, l9VarA2, 0);
                    }
                    return zpVar.a(new g(l9VarA, rl2Var2, b3));
                }
                rl2 rl2Var3 = xnVar.z;
                ms1 ms1Var = (ms1) ouVarA;
                l9 l9Var = ms1Var.g;
                if (z2) {
                    return zpVar.a(new g(ms1Var, rl2Var3, (byte) 8));
                }
                if (rl2Var3 != null) {
                    lnVar = new ln(5, kv.b(1.0f, rl2Var3.a));
                    i = 1;
                } else {
                    i = 0;
                    lnVar = null;
                }
                r72 r72VarC = l9Var.c();
                float f4 = r72VarC.b;
                float f5 = r72VarC.a;
                tn tnVar2 = xnVar.x;
                if (tnVar2 == null) {
                    tnVar2 = new tn();
                    xnVar.x = tnVar2;
                }
                l9 l9VarA3 = tnVar2.d;
                if (l9VarA3 == null) {
                    l9VarA3 = n9.a();
                    tnVar2.d = l9VarA3;
                }
                l9VarA3.f();
                float f6 = r72VarC.a;
                float f7 = r72VarC.d;
                float f8 = r72VarC.c;
                float f9 = r72VarC.b;
                if (Float.isNaN(f6) || Float.isNaN(f9) || Float.isNaN(f8) || Float.isNaN(f7)) {
                    n9.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = l9VarA3.b;
                if (rectF == null) {
                    rectF = new RectF();
                    l9VarA3.b = rectF;
                }
                rectF.set(f6, f9, f8, f7);
                Path path = l9VarA3.a;
                RectF rectF2 = l9VarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                l9VarA3.e(l9VarA3, l9Var, 0);
                x72 x72Var = new x72();
                long jCeil = (((long) ((int) Math.ceil(r72VarC.c - f5))) << 32) | (((long) ((int) Math.ceil(r72VarC.d - f4))) & 4294967295L);
                tn tnVar3 = xnVar.x;
                tnVar3.getClass();
                t8 t8Var = tnVar3.a;
                a6 a6Var2 = tnVar3.b;
                fu0 fu0Var = t8Var != null ? new fu0(t8Var.a()) : null;
                if (fu0Var == null || fu0Var.a != 0) {
                    fu0 fu0Var2 = t8Var != null ? new fu0(t8Var.a()) : null;
                    if (fu0Var2 == null || i != fu0Var2.a) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (t8Var == null || a6Var2 == null) {
                    t8VarD = ls.d((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    tnVar3.a = t8VarD;
                    Canvas canvas = b6.a;
                    a6Var = new a6();
                    a6Var.a = new Canvas(ie1.d(t8VarD));
                    tnVar3.b = a6Var;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (zpVar.h.d() >> 32));
                    Bitmap bitmap = t8Var.a;
                    if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (zpVar.h.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                        t8VarD = ls.d((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        tnVar3.a = t8VarD;
                        Canvas canvas2 = b6.a;
                        a6Var = new a6();
                        a6Var.a = new Canvas(ie1.d(t8VarD));
                        tnVar3.b = a6Var;
                    } else {
                        t8VarD = t8Var;
                        a6Var = a6Var2;
                    }
                }
                yq yqVar = tnVar3.c;
                if (yqVar == null) {
                    yqVar = new yq();
                    tnVar3.c = yqVar;
                }
                eg egVar = yqVar.i;
                xq xqVar = yqVar.h;
                long jG = ou.G(jCeil);
                u31 layoutDirection = zpVar.h.getLayoutDirection();
                e90 e90Var = xqVar.a;
                yq yqVar2 = yqVar;
                u31 u31Var = xqVar.b;
                ln lnVar2 = lnVar;
                wq wqVar = xqVar.c;
                t8 t8Var2 = t8VarD;
                long j4 = xqVar.d;
                xqVar.a = zpVar;
                xqVar.b = layoutDirection;
                xqVar.c = a6Var;
                xqVar.d = jG;
                a6Var.l();
                td0.H(yqVar2, kv.b, jG, 58);
                float f10 = -f5;
                float f11 = -f4;
                ((g2) egVar.i).P(f10, f11);
                try {
                    td0.f(yqVar2, ms1Var.g, rl2Var3, 0.0f, new ko2(f3, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (yqVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (yqVar2.d() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (yqVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (yqVar2.d() & 4294967295L));
                    long jX = yqVar2.X();
                    long jQ = egVar.q();
                    egVar.g().l();
                    a6 a6Var3 = a6Var;
                    try {
                        ((g2) egVar.i).M(fIntBitsToFloat2, fIntBitsToFloat3, jX);
                        td0.f(yqVar2, l9VarA3, rl2Var3, 0.0f, null, 28);
                        egVar.g().i();
                        egVar.H(jQ);
                        ((g2) egVar.i).P(-f10, -f11);
                        a6Var3.i();
                        xqVar.a = e90Var;
                        xqVar.b = u31Var;
                        xqVar.c = wqVar;
                        xqVar.d = j4;
                        t8Var2.a.prepareToDraw();
                        x72Var.h = t8Var2;
                        return zpVar.a(new wn(r72VarC, x72Var, jCeil, lnVar2));
                    } catch (Throwable th) {
                        egVar.g().i();
                        egVar.H(jQ);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((g2) egVar.i).P(-f10, -f11);
                    throw th2;
                }
            case 12:
                n41 n41Var = (n41) obj;
                ((uy1) obj2).h(n41Var);
                n41Var.a();
                return j23Var;
            case 13:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return j23Var;
            case 14:
                wy wyVar = (wy) obj2;
                ra raVar = wyVar.x;
                if (raVar != null) {
                    return raVar;
                }
                ra raVar2 = new ra(wyVar.a);
                wyVar.x = raVar2;
                return raVar2;
            case 15:
                yy yyVar = (yy) obj2;
                dx1 dx1Var = (dx1) obj;
                ie0 ie0Var = st0.a;
                dx1Var.getClass();
                View view = ((q53) dt.M(dx1Var, ie0Var)).a;
                while (view != null) {
                    switch (yyVar.h) {
                        case 21:
                            i2 = R.id.view_tree_navigation_event_dispatcher_owner;
                            break;
                        default:
                            i2 = R.id.view_tree_view_model_store_owner;
                            break;
                    }
                    Object tag = view.getTag(i2);
                    if (tag != null) {
                        return tag;
                    }
                    Object objP = rz1.p(view);
                    view = objP instanceof View ? (View) objP : null;
                }
                return null;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                bh2.f((dh2) obj, (String) ((wt1) obj2).h);
                return j23Var;
            case 17:
                g2 g2Var = (g2) obj2;
                kc0 kc0Var = (kc0) obj;
                if (!kc0Var.h.u) {
                    return xz2.i;
                }
                kc0 kc0Var2 = kc0Var.w;
                xz2 xz2Var = xz2.h;
                if (kc0Var2 != null) {
                    p pVar = new p((Object) g2Var, (byte) 17);
                    if (pVar.h(kc0Var2) == xz2Var) {
                        y02.D(kc0Var2, pVar);
                    }
                }
                kc0Var.w = null;
                kc0Var.v = null;
                return xz2Var;
            case 18:
                ((qc1) obj2).a();
                return j23Var;
            case 19:
                pr0 pr0Var = (pr0) obj;
                return Boolean.valueOf(pr0Var instanceof ld0 ? ((Boolean) ((cd0) obj2).h(pr0Var)).booleanValue() : true);
            case 20:
                we0 we0Var = (we0) obj;
                String str2 = ((we0) obj2) == we0Var ? " > " : "   ";
                if (!(we0Var instanceof fw)) {
                    if (we0Var instanceof ai2) {
                        ai2 ai2Var = (ai2) we0Var;
                        length = ai2Var.a.i.length();
                        i3 = ai2Var.b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (we0Var instanceof zh2) {
                        strConcat = ((zh2) we0Var).toString();
                    } else if (we0Var instanceof r80) {
                        strConcat = ((r80) we0Var).toString();
                    } else if (we0Var instanceof s80) {
                        strConcat = ((s80) we0Var).toString();
                    } else if (we0Var instanceof bi2) {
                        strConcat = ((bi2) we0Var).toString();
                    } else if (we0Var instanceof nj0) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (we0Var instanceof q80) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = z72.a(we0Var.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str2.concat(strConcat);
                }
                fw fwVar = (fw) we0Var;
                length = fwVar.a.i.length();
                i3 = fwVar.b;
                str = "CommitTextCommand(text.length=";
                strConcat = wi0.g(str, length, ", newCursorPosition=", i3, ")");
                return str2.concat(strConcat);
            case 21:
                uj1 uj1Var = (uj1) obj2;
                Object[] objArr2 = uj1Var.h;
                int i9 = uj1Var.j;
                while (i4 < i9) {
                    ((af1) objArr2[i4]).b();
                    i4++;
                }
                return j23Var;
            case 22:
                z03 z03Var = (z03) obj;
                return ((tm0) obj2).a(new z03(null, z03Var.b, z03Var.c, z03Var.d)).h;
            case 23:
                fp fpVar = (fp) obj2;
                if (xr0.b.compareAndSet(false, true)) {
                    fpVar.s(j23Var);
                }
                return j23Var;
            case 24:
                td0 td0Var = (td0) obj;
                wq wqVarG = td0Var.F().g();
                zp0 zp0Var = ((es0) obj2).k;
                if (zp0Var != null) {
                    zp0Var.f(wqVarG, (cs0) td0Var.F().j);
                }
                return j23Var;
            case 25:
                ks0 ks0Var = (ks0) obj2;
                z23 z23Var = (z23) obj;
                ks0Var.g(z23Var);
                vp0 vp0Var = ks0Var.i;
                if (vp0Var != null) {
                    vp0Var.h(z23Var);
                }
                return j23Var;
            case 26:
                jx0 jx0Var = (jx0) obj2;
                so1 so1Var = (so1) obj;
                o72 o72Var = so1Var.b;
                if (o72Var != null) {
                    o72Var.closeConnection();
                    so1Var.b = null;
                }
                uj1 uj1Var2 = jx0Var.d;
                Object[] objArr3 = uj1Var2.h;
                int i10 = uj1Var2.j;
                while (true) {
                    if (i4 >= i10) {
                        i4 = -1;
                    } else if (!uz0.g((z53) objArr3[i4], so1Var)) {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    uj1Var2.k(i4);
                }
                if (uj1Var2.j == 0) {
                    jx0Var.b.a();
                }
                return j23Var;
            case 27:
                return Integer.valueOf(((u30) obj2).f(((Integer) obj).intValue()));
            case 28:
                c61 c61Var = (c61) obj2;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || c61Var.c()) && (f12 <= 0.0f || c61Var.a())) {
                    if (Math.abs(c61Var.g) > 0.5f) {
                        dx0.c("entered drag with non-zero pending scroll");
                    }
                    float f13 = c61Var.g + f12;
                    c61Var.g = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = c61Var.g;
                        int iX = ie1.x(f14);
                        t51 t51VarH = ((t51) c61Var.e.getValue()).h(iX, !c61Var.b);
                        if (t51VarH == null || (t51Var = c61Var.c) == null) {
                            t51Var2 = t51VarH;
                        } else {
                            t51 t51VarH2 = t51Var.h(iX, true);
                            if (t51VarH2 != null) {
                                c61Var.c = t51VarH2;
                                t51Var2 = t51VarH;
                            }
                        }
                        if (t51Var2 != null) {
                            c61Var.f(t51Var2, c61Var.b, true);
                            c61Var.r.setValue(j23Var);
                            c61Var.h(f14 - c61Var.g, t51Var2);
                        } else {
                            l41 l41Var = c61Var.j;
                            if (l41Var != null) {
                                l41Var.k();
                            }
                            c61Var.h(f14 - c61Var.g, c61Var.g());
                        }
                    }
                    if (Math.abs(c61Var.g) > 0.5f) {
                        f12 -= c61Var.g;
                        c61Var.g = 0.0f;
                    }
                    f = f12;
                }
                return Float.valueOf(-f);
            default:
                return new w3((q61) obj2, b3);
        }
    }

    public /* synthetic */ p(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }
}
