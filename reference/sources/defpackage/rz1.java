package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.familymeal.app.MealPlannerApp;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.R;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 implements sh {
    public static final float h = 64.0f;

    public static final Object A(Object[] objArr, k42 k42Var, kp0 kp0Var, dr0 dr0Var, int i) {
        Object[] objArr2;
        k42 k42Var2;
        Object obj;
        Object objE;
        long j = dr0Var.T;
        vs.r(36);
        String string = Long.toString(j, 36);
        string.getClass();
        k42Var.getClass();
        qb2 qb2Var = (qb2) dr0Var.j(sb2.a);
        Object objK = dr0Var.K();
        Object obj2 = zy.a;
        if (objK == obj2) {
            Object objH = (qb2Var == null || (objE = qb2Var.e(string)) == null) ? null : ((vp0) k42Var.j).h(objE);
            if (objH == null) {
                objH = kp0Var.a();
            }
            objArr2 = objArr;
            k42Var2 = k42Var;
            Object nb2Var = new nb2(k42Var2, qb2Var, string, objH, objArr2);
            dr0Var.f0(nb2Var);
            objK = nb2Var;
        } else {
            objArr2 = objArr;
            k42Var2 = k42Var;
        }
        nb2 nb2Var2 = (nb2) objK;
        Object objA = Arrays.equals(objArr2, nb2Var2.l) ? nb2Var2.k : null;
        if (objA == null) {
            objA = kp0Var.a();
        }
        boolean zH = dr0Var.h(nb2Var2) | dr0Var.h(k42Var2) | dr0Var.h(qb2Var) | dr0Var.f(string) | dr0Var.h(objA) | dr0Var.h(objArr2);
        Object objK2 = dr0Var.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objA;
            Object jjVar = new jj(nb2Var2, k42Var2, qb2Var, string, obj, objArr3);
            dr0Var.f0(jjVar);
            objK2 = jjVar;
        } else {
            obj = objA;
        }
        h7.S((kp0) objK2, dr0Var);
        return obj;
    }

    public static final Object B(Object[] objArr, k42 k42Var, kp0 kp0Var, dr0 dr0Var, int i) {
        return A(Arrays.copyOf(objArr, objArr.length), k42Var, kp0Var, dr0Var, 384 | ((i << 3) & 7168));
    }

    public static final sj1 C(Object obj, dr0 dr0Var) {
        Object objK = dr0Var.K();
        if (objK == zy.a) {
            objK = x(obj);
            dr0Var.f0(objK);
        }
        sj1 sj1Var = (sj1) objK;
        sj1Var.setValue(obj);
        return sj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r15 == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.sq2 r12, defpackage.zt2 r13, defpackage.q02 r14, defpackage.rk r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.D(sq2, zt2, q02, rk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r15 == r6) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.sq2 r11, defpackage.zt2 r12, defpackage.q02 r13, int r14, defpackage.rk r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.E(sq2, zt2, q02, int, rk):java.lang.Object");
    }

    public static d33 F(int i, String str) {
        return new d33(new xx0(0, 0, 0, 0), str);
    }

    public static final void a(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        rg1 rg1Var2;
        nx nxVar2;
        dr0Var.W(790527681);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(nxVar) ? 32 : 16;
        }
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                lu1 lu1Var = new lu1(null, c5.f0);
                dr0Var.f0(lu1Var);
                objK = lu1Var;
            }
            sj1 sj1Var = (sj1) objK;
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new bb(sj1Var, (byte) 22);
                dr0Var.f0(objK2);
            }
            kp0 kp0Var = (kp0) objK2;
            p12 p12Var = e80.a;
            gl glVarV = h7.V(s60.e, dr0Var, 6);
            rg1Var2 = rg1Var;
            nxVar2 = nxVar;
            ys.b(new i42[]{pt2.b.a(s60.B(kp0Var, dr0Var, 2)), pt2.a.a(glVarV)}, dt.N(1070596993, new cr(rg1Var2, sj1Var, nxVar2, glVarV, kp0Var), dr0Var), dr0Var, 56);
        } else {
            rg1Var2 = rg1Var;
            nxVar2 = nxVar;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ab(rg1Var2, nxVar2, i, (byte) 3);
        }
    }

    public static final void b(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(155925518);
        int i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        byte b = 0;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = dr0Var.j(pt2.a) != null;
            boolean z2 = dr0Var.j(pt2.b) != null;
            if (z) {
                if (z2) {
                    dr0Var.V(-1977187922);
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1Var);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1VarC);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    nxVar.f(dr0Var, 6);
                    dr0Var.p(true);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(-1976997706);
                    s60.d(rg1Var, nxVar, dr0Var, i2 & 126);
                    dr0Var.p(false);
                }
            } else if (z2) {
                dr0Var.V(-1976846922);
                e80.d(rg1Var, nxVar, dr0Var, i2 & 126);
                dr0Var.p(false);
            } else {
                dr0Var.V(-1976716505);
                a(rg1Var, nxVar, dr0Var, i2 & 126);
                dr0Var.p(false);
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new qz1(rg1Var, nxVar, i, b);
        }
    }

    public static final void c(kp0 kp0Var, dr0 dr0Var, int i) {
        kp0Var.getClass();
        dr0Var.W(-1576495764);
        int i2 = i | (dr0Var.h(kp0Var) ? 4 : 2);
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            Context applicationContext = ((Context) dr0Var.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            sj1 sj1VarH = pz1.h(mealPlannerApp.c().e, ag0.h, dr0Var, 48, 2);
            sj1 sj1VarH2 = pz1.h(mealPlannerApp.c().f, new ed2(bg0.h), dr0Var, 0, 2);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = h7.Y(dr0Var);
                dr0Var.f0(objK);
            }
            cy1.a(null, dt.N(169475632, new gw0(kp0Var, (byte) 7), dr0Var), null, null, null, 0, 0L, 0L, null, dt.N(1334559739, new t61(sj1VarH2, sj1VarH, (x20) objK, mealPlannerApp), dr0Var), dr0Var, 805306416, 509);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new gw0(kp0Var, i, (byte) 8);
        }
    }

    public static final void d(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(-1854833411);
        int i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        byte b = 1;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = c8.g;
                dr0Var.f0(objK);
            }
            ze1 ze1Var = (ze1) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1Var);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            wi0.n(6, nxVar, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new qz1(rg1Var, nxVar, i, b);
        }
    }

    public static void e(ik2 ik2Var, List list, oz ozVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = ik2Var.c((xq0) list.get(i));
            int iM = ik2Var.M(ik2Var.b, ik2Var.q(iC));
            Object obj = iM < ik2Var.f(ik2Var.b, ik2Var.q(iC + 1)) ? ik2Var.c[ik2Var.g(iM)] : zy.a;
            e72 e72Var = obj instanceof e72 ? (e72) obj : null;
            if (e72Var != null) {
                e72Var.a = ozVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:19:0x0049->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object f(defpackage.sq2 r6, defpackage.rk r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dg2
            if (r0 == 0) goto L13
            r0 = r7
            dg2 r0 = (defpackage.dg2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            dg2 r0 = new dg2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            sq2 r6 = r0.k
            defpackage.m02.y(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.m02.y(r7)
        L31:
            r0.k = r6
            r0.m = r2
            s02 r7 = defpackage.s02.i
            java.lang.Object r7 = r6.a(r7, r0)
            y20 r1 = defpackage.y20.h
            if (r7 != r1) goto L40
            return r1
        L40:
            q02 r7 = (defpackage.q02) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5a
            java.lang.Object r5 = r1.get(r4)
            z02 r5 = (defpackage.z02) r5
            boolean r5 = defpackage.r02.j(r5)
            if (r5 == 0) goto L31
            int r4 = r4 + 1
            goto L49
        L5a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.f(sq2, rk):java.lang.Object");
    }

    public static final int g(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            bx0.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            bx0.a("invalid end value");
        }
        if (i3 < 0) {
            bx0.a("invalid maxLines value");
        }
        if (i < 0) {
            bx0.a("invalid width value");
        }
        if (i4 < 0) {
            bx0.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            b2.j(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static u83 i(dr0 dr0Var) {
        View view = (View) dr0Var.j(i7.f);
        u83 u83VarO = o(view);
        boolean zH = dr0Var.h(u83VarO) | dr0Var.h(view);
        Object objK = dr0Var.K();
        if (zH || objK == zy.a) {
            objK = new uy1((Object) u83VarO, (Object) view, (byte) 28);
            dr0Var.f0(objK);
        }
        h7.G(u83VarO, (vp0) objK, dr0Var);
        return u83VarO;
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final String m(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static u83 o(View view) {
        u83 u83Var;
        WeakHashMap weakHashMap = u83.v;
        synchronized (weakHashMap) {
            Object u83Var2 = weakHashMap.get(view);
            if (u83Var2 == null) {
                u83Var2 = new u83(view);
                weakHashMap.put(view, u83Var2);
            }
            u83Var = (u83) u83Var2;
        }
        return u83Var;
    }

    public static final ViewParent p(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:184:0x018f A[EDGE_INSN: B:184:0x018f->B:75:0x018f BREAK  A[LOOP:4: B:64:0x0167->B:189:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0076 A[PHI: r10
  0x0076: PHI (r10v20 boolean) = (r10v2 boolean), (r10v25 boolean) binds: [B:14:0x0051, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        r0 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int q(defpackage.hw2 r20, android.text.Layout r21, defpackage.bj r22, int r23, android.graphics.RectF r24, defpackage.rf2 r25, defpackage.s r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.q(hw2, android.text.Layout, bj, int, android.graphics.RectF, rf2, s, boolean):int");
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void s(boolean z, boolean z2, boolean z3, int i, double[] dArr, int i2, double[] dArr2, int i3) {
        if (z2) {
            if (!z) {
                int i4 = i - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    int i6 = i5 * i2;
                    int i7 = (i6 + i) - 1;
                    double d = 0.0d;
                    int i8 = i4;
                    while (i8 > i5) {
                        d += dArr[i7] * dArr2[i3 + i8];
                        i8--;
                        i7--;
                    }
                    int i9 = i3 + i5;
                    double d2 = dArr2[i9] - d;
                    if (!z3) {
                        d2 /= dArr[i6 + i5];
                    }
                    dArr2[i9] = d2;
                }
                return;
            }
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 * i2;
                int i12 = i3;
                double d3 = 0.0d;
                int i13 = 0;
                int i14 = i11;
                while (i13 < i10) {
                    d3 += dArr[i14] * dArr2[i12];
                    i13++;
                    i14++;
                    i12++;
                }
                int i15 = i3 + i10;
                double d4 = dArr2[i15] - d3;
                if (!z3) {
                    d4 /= dArr[i11 + i10];
                }
                dArr2[i15] = d4;
            }
            return;
        }
        if (z) {
            for (int i16 = i - 1; i16 >= 0; i16--) {
                if (!z3) {
                    int i17 = i3 + i16;
                    dArr2[i17] = dArr2[i17] / dArr[(i16 * i2) + i16];
                }
                double d5 = dArr2[i3 + i16];
                if (d5 != h32.a) {
                    t03.w(-d5, i16, i16 * i2, 1, i3, 1, dArr, dArr2);
                }
            }
            return;
        }
        if (i > 40) {
            for (int i18 = 0; i18 < i; i18++) {
                if (!z3) {
                    int i19 = i3 + i18;
                    dArr2[i19] = dArr2[i19] / dArr[(i18 * i2) + i18];
                }
                int i20 = i3 + i18;
                double d6 = dArr2[i20];
                if (d6 != h32.a) {
                    t03.w(-d6, (i - 1) - i18, (i18 * i2) + i18 + 1, 1, i20 + 1, 1, dArr, dArr2);
                }
            }
            return;
        }
        for (int i21 = 0; i21 < i; i21++) {
            int i22 = i3;
            double d7 = 0.0d;
            int i23 = 0;
            int i24 = i21;
            while (i23 < i21) {
                d7 += dArr[i24] * dArr2[i22];
                i23++;
                i24 += i2;
                i22++;
            }
            int i25 = i3 + i21;
            double d8 = dArr2[i25] - d7;
            if (!z3) {
                d8 /= dArr[(i21 * i2) + i21];
            }
            dArr2[i25] = d8;
        }
    }

    public static void t(double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr[i] = Math.sqrt(dArr[i]);
        }
    }

    public static oh2 u(zp0 zp0Var) {
        oh2 oh2Var = new oh2();
        oh2Var.j = ls.v(oh2Var, oh2Var, zp0Var);
        return oh2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float v(my1 my1Var, boolean z, pt0[] pt0VarArr, float f) {
        float f2 = Float.NaN;
        for (pt0 pt0Var : pt0VarArr) {
            float fA = my1Var.a(pt0Var);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r3 != r13) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
    
        if (r3 == r13) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.sq2 r17, defpackage.tj2 r18, defpackage.u8 r19, defpackage.q02 r20, defpackage.rk r21) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.w(sq2, tj2, u8, q02, rk):java.lang.Object");
    }

    public static lu1 x(Object obj) {
        return new lu1(obj, vz1.s);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02bf A[PHI: r14 r15
  0x02bf: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:101:0x0273, B:114:0x02bd] A[DONT_GENERATE, DONT_INLINE]
  0x02bf: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:101:0x0273, B:114:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02c3 A[LOOP:3: B:100:0x0265->B:117:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:181:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:184:0x03db  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ec A[LOOP:5: B:188:0x03ea->B:189:0x03ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x042e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0435  */
    /* JADX WARN: Code duplicated, block: B:202:0x043e  */
    /* JADX WARN: Code duplicated, block: B:208:0x044f  */
    /* JADX WARN: Code duplicated, block: B:227:0x02cb A[EDGE_INSN: B:227:0x02cb->B:119:0x02cb BREAK  A[LOOP:3: B:100:0x0265->B:117:0x02c3], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x03ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    public static final void y(ViewStructure viewStructure, l41 l41Var, AutofillId autofillId, String str, s72 s72Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        p7 p7Var;
        od odVar;
        m8 m8Var;
        by2 by2Var;
        ba2 ba2Var;
        boolean z;
        b10 b10Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        boolean z3;
        String[] strArrY;
        boolean z4;
        boolean z5;
        boolean z6;
        String strD;
        int size;
        String str2;
        int i;
        String[] strArrY2;
        String[] strArrY3;
        int i2;
        int i3;
        int i4;
        boolean z7;
        p7 p7Var2;
        by2 by2Var2;
        od odVar2;
        m8 m8Var2;
        ba2 ba2Var2;
        boolean z8;
        ch2 ch2Var = ah2.a;
        ch2 ch2Var2 = qg2.a;
        rg2 rg2VarW = l41Var.w();
        boolean z9 = true;
        if (rg2VarW != null) {
            mj1 mj1Var = rg2VarW.h;
            j = 128;
            Object[] objArr = mj1Var.b;
            Object[] objArr2 = mj1Var.c;
            long[] jArr = mj1Var.a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                p7Var2 = null;
                z = false;
                by2Var2 = null;
                odVar2 = null;
                m8Var2 = null;
                b10Var = null;
                bool = null;
                ba2Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr[i8];
                                Object obj3 = objArr2[i8];
                                ch2 ch2Var3 = (ch2) obj2;
                                if (uz0.g(ch2Var3, ah2.s)) {
                                    obj3.getClass();
                                    p7Var2 = (p7) obj3;
                                } else if (uz0.g(ch2Var3, ah2.a)) {
                                    obj3.getClass();
                                    String str3 = (String) dv.y0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (uz0.g(ch2Var3, ah2.r)) {
                                    obj3.getClass();
                                    b10Var = (b10) obj3;
                                } else if (uz0.g(ch2Var3, ah2.t)) {
                                    obj3.getClass();
                                    m8Var2 = (m8) obj3;
                                } else if (uz0.g(ch2Var3, ah2.G)) {
                                    obj3.getClass();
                                    odVar2 = (od) obj3;
                                } else if (uz0.g(ch2Var3, ah2.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (uz0.g(ch2Var3, ah2.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (uz0.g(ch2Var3, ah2.N)) {
                                    z2 = z9;
                                } else if (uz0.g(ch2Var3, ah2.o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (uz0.g(ch2Var3, ah2.z)) {
                                    obj3.getClass();
                                    ba2Var2 = (ba2) obj3;
                                } else if (uz0.g(ch2Var3, ah2.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (uz0.g(ch2Var3, ah2.L)) {
                                    obj3.getClass();
                                    by2Var2 = (by2) obj3;
                                } else if (uz0.g(ch2Var3, qg2.b)) {
                                    viewStructure.setClickable(z9);
                                } else if (uz0.g(ch2Var3, qg2.c)) {
                                    viewStructure.setLongClickable(z9);
                                } else if (uz0.g(ch2Var3, qg2.w)) {
                                    viewStructure.setFocusable(z9);
                                } else if (uz0.g(ch2Var3, qg2.k)) {
                                    z = z9;
                                }
                                z8 = z9;
                                if (Build.VERSION.SDK_INT >= 34 && uz0.g(ch2Var3, h7.V)) {
                                    obj = obj3;
                                }
                            } else {
                                z8 = z9;
                            }
                            j4 >>= 8;
                            i7++;
                            z9 = z8;
                        }
                        z7 = z9;
                        z7 = z7;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        z7 = z9 ? 1 : 0;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z9 = z7 ? 1 : 0;
                }
            } else {
                z7 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                p7Var2 = null;
                z = false;
                by2Var2 = null;
                odVar2 = null;
                m8Var2 = null;
                b10Var = null;
                bool = null;
                ba2Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            p7Var = p7Var2;
            by2Var = by2Var2;
            odVar = odVar2;
            m8Var = m8Var2;
            ba2Var = ba2Var2;
            r38 = z7;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            p7Var = null;
            odVar = null;
            m8Var = null;
            by2Var = null;
            ba2Var = null;
            z = false;
            b10Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        rg2 rg2VarW2 = l41Var.w();
        if (rg2VarW2 != null && rg2VarW2.j && !rg2VarW2.k) {
            rg2 rg2Var = new rg2();
            rg2Var.j = rg2VarW2.j;
            rg2Var.k = rg2VarW2.k;
            rg2Var.h.k(rg2VarW2.h);
            fj1 fj1Var = new fj1(((uj1) ((dj1) l41Var.n()).i).j);
            fj1Var.c(l41Var.n());
            while (fj1Var.j()) {
                l41 l41Var2 = (l41) fj1Var.l(fj1Var.b - 1);
                rg2 rg2VarW3 = l41Var2.w();
                if (rg2VarW3 != null && !rg2VarW3.j) {
                    rg2Var.c(rg2VarW3);
                    if (!rg2VarW3.k) {
                        fj1Var.c(l41Var2.n());
                    }
                }
            }
            rg2VarW2 = rg2Var;
        }
        if (rg2VarW2 != null) {
            mj1 mj1Var2 = rg2VarW2.h;
            Object[] objArr3 = mj1Var2.b;
            Object[] objArr4 = mj1Var2.c;
            long[] jArr2 = mj1Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 8;
                list = null;
                int i10 = 0;
                while (true) {
                    long j5 = jArr2[i10];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i2 = i10;
                        if (i2 != length2) {
                            break;
                            break;
                        } else {
                            i10 = i2 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i10 << 3) + i12;
                                Object obj4 = objArr5[i13];
                                Object obj5 = objArr4[i13];
                                i4 = i9;
                                ch2 ch2Var4 = (ch2) obj4;
                                i3 = i12;
                                if (uz0.g(ch2Var4, ah2.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (uz0.g(ch2Var4, ah2.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i3 = i12;
                                i4 = i9;
                            }
                            j5 >>= i4;
                            i12 = i3 + 1;
                            i9 = i4;
                        }
                        if (i11 != i9) {
                            break;
                        }
                        i2 = i10;
                        if (i2 != length2) {
                            break;
                        }
                        i10 = i2 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(l41Var.i);
        if (l41Var.u() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (p7Var != null) {
            numValueOf = Integer.valueOf(p7Var.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = by2Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (odVar != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(ia2.A(odVar.i)));
        }
        if (m8Var != null) {
            viewStructure.setAutofillValue(m8Var.a);
        }
        if (b10Var != null && (strArrY3 = ou.y(b10Var)) != null) {
            viewStructure.setAutofillHints(strArrY3);
        }
        l41 l41Var3 = (l41) s72Var.a.b(l41Var.i);
        if (l41Var3 != null && l41Var3.n != -4) {
            u8 u8Var = s72Var.c;
            int iD = s72Var.d(l41Var3);
            long[] jArr4 = (long[]) u8Var.b;
            long j6 = jArr4[iD];
            long j7 = jArr4[iD + 1];
            int i14 = (int) (j6 >> 32);
            int i15 = (int) j6;
            viewStructure.setDimens(i14, i15, 0, 0, ((int) (j7 >> 32)) - i14, ((int) j7) - i15);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (by2Var == null) {
            if (bool != null && (ba2Var == null || ba2Var.a != 4)) {
                z3 = true;
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            b10.a.getClass();
            strArrY = ou.y(a10.b);
            strArrY.getClass();
            if (strArrY.length != 0) {
                li1.m("Array is empty.");
                return;
            }
            String str4 = strArrY[0];
            if (b10Var != null || (strArrY2 = ou.y(b10Var)) == null || gi.Z(strArrY2, str4) < 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (!z2 || z4) {
                z5 = z3;
            } else {
                z5 = false;
            }
            if (!z5 || zBooleanValue) {
                z6 = z3;
            } else {
                z6 = false;
            }
            viewStructure.setDataIsSensitive(z6);
            viewStructure.setVisibility(l41Var.L.d.e1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i = 0; i < size; i++) {
                    str2 = ((Object) str2) + ((od) list.get(i)).i + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((dj1) l41Var.n()).isEmpty() && ba2Var != null && (strD = pz1.D(ba2Var.a)) != null) {
                viewStructure.setClassName(strD);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z5) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            li1.c();
            return;
        }
        viewStructure.setCheckable(r38);
        viewStructure.setChecked(by2Var == by2.h);
        z3 = true;
        b10.a.getClass();
        strArrY = ou.y(a10.b);
        strArrY.getClass();
        if (strArrY.length != 0) {
            li1.m("Array is empty.");
            return;
        }
        String str5 = strArrY[0];
        if (b10Var != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z2) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        if (z5) {
            z6 = z3;
        } else {
            z6 = z3;
        }
        viewStructure.setDataIsSensitive(z6);
        viewStructure.setVisibility(l41Var.L.d.e1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i < size) {
                str2 = ((Object) str2) + ((od) list.get(i)).i + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((dj1) l41Var.n()).isEmpty()) {
            viewStructure.setClassName(strD);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z5) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final Object z(Object[] objArr, kp0 kp0Var, dr0 dr0Var, int i) {
        return A(Arrays.copyOf(objArr, objArr.length), s60.y0, kp0Var, dr0Var, ((i << 6) & 7168) | 384);
    }
}
