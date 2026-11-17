package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.sqlite.SQLiteStatement;
import com.familymeal.app.MealPlannerApp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou {
    public static t8 a;
    public static a6 b;
    public static yq c;
    public static iu0 d;
    public static iu0 e;
    public static iu0 f;

    public static final int A(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i) {
            return (lineEnd != i || z) ? lineForOffset : lineForOffset + 1;
        }
        return z ? lineForOffset - 1 : lineForOffset;
    }

    public static double B(int i, int i2, int i3, int i4, double[] dArr, double[] dArr2) {
        if (i4 == 1) {
            return es.f0(i2, i3, 0, i, dArr, dArr2);
        }
        int i5 = i3;
        double d2 = h32.a;
        if (i4 < 0) {
            i5 -= (i - 1) * i4;
        }
        int i6 = 0;
        int i7 = i5;
        int i8 = i2;
        int i9 = i7;
        while (i6 < i) {
            d2 += dArr[i8] * dArr2[i9];
            i6++;
            i8++;
            i9 += i4;
        }
        return d2;
    }

    public static final void C(int i) {
        throw new l11(lt.z(-1, "Json input is too nested and may be impossible to parse without stack overflow.", null, jp1.i(i, "Current nesting limit is ", ". To adjust it, use 'maxNestingDepth' in 'Json {}' builder."), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(qg1 qg1Var, kp0 kp0Var) {
        sp1 sp1Var = qg1Var.n;
        if (sp1Var == null) {
            sp1Var = new sp1((rp1) qg1Var);
            qg1Var.n = sp1Var;
        }
        it1 snapshotObserver = cu.Z(qg1Var).getSnapshotObserver();
        snapshotObserver.a.d(sp1Var, sp1.i, kp0Var);
    }

    public static float E(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return me0.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final View F(j80 j80Var) {
        if (!((qg1) j80Var).h.u) {
            ax0.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return o41.a(cu.Y(j80Var));
    }

    public static final long G(long j) {
        return (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
    }

    public static final boolean H(Throwable th, kp0 kp0Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = o01.a;
        r90 r90Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = tz1.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = ag0.h;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof r90) {
                return false;
            }
        }
        try {
            py pyVar = (py) kp0Var.a();
            if (pyVar != null) {
                List list = pyVar.a;
                if (pyVar.b) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ry) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                pyVar.getClass();
                r90Var = new r90(pyVar);
            }
        } catch (Throwable th2) {
            r90Var = th2;
        }
        if (r90Var != null) {
            vs.l(th, r90Var);
        }
        return z;
    }

    public static final g23 I(m10 m10Var, o20 o20Var, Object obj) {
        g23 g23Var = null;
        if ((m10Var instanceof z20) && o20Var.m(vq.k) != null) {
            z20 z20VarD = (z20) m10Var;
            while (!(z20VarD instanceof ua0) && (z20VarD = z20VarD.d()) != null) {
                if (z20VarD instanceof g23) {
                    g23Var = (g23) z20VarD;
                    break;
                }
            }
            if (g23Var != null) {
                g23Var.k0(o20Var, obj);
            }
        }
        return g23Var;
    }

    public static final q7 a(String str) {
        return new q7(r02.C(str));
    }

    public static final long b(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static final void c(final kp0 kp0Var, rg1 rg1Var, hi2 hi2Var, long j, long j2, gk0 gk0Var, final nx nxVar, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        final hi2 hi2Var2;
        final long j3;
        final long j4;
        final gk0 gk0Var2;
        int i2;
        dr0Var.W(748201188);
        int i3 = i | (dr0Var.h(kp0Var) ? 4 : 2) | 1647792;
        if (dr0Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                hi2 hi2VarA = mi2.a(ie1.z, dr0Var);
                long jD = rv.d(ia2.n, dr0Var);
                long jB = rv.b(jD, dr0Var);
                gk0 gk0Var3 = new gk0(ia2.o, ia2.r, ia2.p, ia2.q);
                i2 = i3 & (-524161);
                rg1Var2 = og1.h;
                j4 = jB;
                gk0Var2 = gk0Var3;
                j3 = jD;
                hi2Var2 = hi2VarA;
            } else {
                dr0Var.Q();
                i2 = i3 & (-524161);
                rg1Var2 = rg1Var;
                hi2Var2 = hi2Var;
                j3 = j;
                j4 = j2;
                gk0Var2 = gk0Var;
            }
            dr0Var.q();
            d(kp0Var, e13.a(uz0.z, dr0Var), ie1.A, rg1Var2, hi2Var2, j3, j4, gk0Var2, nxVar, dr0Var, 805334400 | (i2 & 14), 6);
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            hi2Var2 = hi2Var;
            j3 = j;
            j4 = j2;
            gk0Var2 = gk0Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var2, hi2Var2, j3, j4, gk0Var2, nxVar, i) { // from class: lk0
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ hi2 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ gk0 m;
                public final /* synthetic */ nx n;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(12582913);
                    ou.c(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void d(final kp0 kp0Var, final xw2 xw2Var, final float f2, final rg1 rg1Var, final hi2 hi2Var, final long j, final long j2, final gk0 gk0Var, final nx nxVar, dr0 dr0Var, final int i, final int i2) {
        int i3;
        nx nxVar2;
        int i4;
        dr0Var.W(121669932);
        if ((i & 6) == 0) {
            i3 = (dr0Var.h(kp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dr0Var.f(xw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dr0Var.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dr0Var.c(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dr0Var.f(rg1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dr0Var.f(hi2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= dr0Var.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= dr0Var.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= dr0Var.f(gk0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= dr0Var.f(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i2 & 6) == 0) {
            nxVar2 = nxVar;
            i4 = i2 | (dr0Var.h(nxVar2) ? 4 : 2);
        } else {
            nxVar2 = nxVar;
            i4 = i2;
        }
        if (dr0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            dr0Var.S();
            if ((i & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            dr0Var.V(-282833393);
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (objK == obj) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            Object objK2 = dr0Var.K();
            if (objK2 == obj) {
                objK2 = new rt((byte) 21);
                dr0Var.f0(objK2);
            }
            rg1 rg1VarA = tg2.a(rg1Var, false, (vp0) objK2);
            float f3 = gk0Var.a;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zF = dr0Var.f(ui1Var);
            Object objK3 = dr0Var.K();
            if (zF || objK3 == obj) {
                objK3 = new jk0(gk0Var.a, gk0Var.b, gk0Var.d, gk0Var.c);
                dr0Var.f0(objK3);
            }
            jk0 jk0Var = (jk0) objK3;
            boolean zH = dr0Var.h(jk0Var) | (((i6 ^ 48) > 32 && dr0Var.f(gk0Var)) || (i5 & 48) == 32);
            Object objK4 = dr0Var.K();
            if (zH || objK4 == obj) {
                objK4 = new h(jk0Var, gk0Var, null, (byte) 15);
                dr0Var.f0(objK4);
            }
            h7.J((zp0) objK4, dr0Var, gk0Var);
            boolean zF2 = dr0Var.f(ui1Var) | dr0Var.h(jk0Var);
            Object objK5 = dr0Var.K();
            if (zF2 || objK5 == obj) {
                objK5 = new j(ui1Var, jk0Var, (m10) null);
                dr0Var.f0(objK5);
            }
            h7.J((zp0) objK5, dr0Var, ui1Var);
            int i7 = i3 >> 6;
            iq2.c(kp0Var, rg1VarA, false, hi2Var, j, j2, f3, ((cc0) jk0Var.e.c.i.getValue()).h, null, ui1Var, dt.N(-1779603465, new nk0(j2, xw2Var, f2, nxVar2), dr0Var), dr0Var, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: kk0
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = m02.A(i | 1);
                    int iA2 = m02.A(i2);
                    ou.d(kp0Var, xw2Var, f2, rg1Var, hi2Var, j, j2, gk0Var, nxVar, (dr0) obj2, iA, iA2);
                    return j23.a;
                }
            };
        }
    }

    public static final void e(final rg1 rg1Var, final zg zgVar, yg ygVar, cm cmVar, int i, int i2, final nx nxVar, dr0 dr0Var, final int i3) {
        final yg ygVar2;
        final cm cmVar2;
        final int i4;
        final int i5;
        dr0Var.W(-1303174015);
        int i6 = i3 | (dr0Var.f(rg1Var) ? 4 : 2) | 224640;
        if (dr0Var.N(i6 & 1, (599187 & i6) != 599186)) {
            yg ygVar3 = uz0.g;
            cm cmVar3 = c5.r;
            f(rg1Var, zgVar, ygVar3, cmVar3, c5.V, nxVar, dr0Var, (i6 & 14) | 14380464);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            ygVar2 = ygVar3;
            cmVar2 = cmVar3;
        } else {
            dr0Var.Q();
            ygVar2 = ygVar;
            cmVar2 = cmVar;
            i4 = i;
            i5 = i2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(zgVar, ygVar2, cmVar2, i4, i5, nxVar, i3) { // from class: jl0
                public final /* synthetic */ zg i;
                public final /* synthetic */ yg j;
                public final /* synthetic */ cm k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;
                public final /* synthetic */ nx n;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1572913);
                    ou.e(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r7v25 */
    public static final void f(rg1 rg1Var, zg zgVar, yg ygVar, cm cmVar, c5 c5Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        Object obj;
        ?? r7;
        Object obj2;
        dr0Var.W(-1956591841);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(zgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.f(ygVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.f(cmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.d(Integer.MAX_VALUE) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj = c5Var;
            i2 |= dr0Var.f(obj) ? 1048576 : 524288;
        } else {
            obj = c5Var;
        }
        if ((i & 12582912) == 0) {
            i2 |= dr0Var.h(nxVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (dr0Var.N(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = i3 & 3670016;
            boolean z = i4 == 1048576;
            Object objK = dr0Var.K();
            Object obj3 = zy.a;
            if (z || objK == obj3) {
                obj.getClass();
                objK = new ml0();
                dr0Var.f0(objK);
            }
            ml0 ml0Var = (ml0) objK;
            int i5 = i3 >> 3;
            boolean zF = ((((i5 & 14) ^ 6) > 4 && dr0Var.f(zgVar)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && dr0Var.f(ygVar)) || (i5 & 48) == 32) | ((((i5 & 896) ^ 384) > 256 && dr0Var.f(cmVar)) || (i5 & 384) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && dr0Var.d(Integer.MAX_VALUE)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && dr0Var.d(Integer.MAX_VALUE)) || (i5 & 24576) == 16384) | dr0Var.f(ml0Var);
            Object objK2 = dr0Var.K();
            if (zF || objK2 == obj3) {
                float fA = zgVar.a();
                g30 g30Var = new g30(cmVar);
                ygVar.getClass();
                Object ol0Var = new ol0(zgVar, ygVar, fA, g30Var, 0.0f, ml0Var);
                dr0Var.f0(ol0Var);
                objK2 = ol0Var;
            }
            ol0 ol0Var2 = (ol0) objK2;
            boolean z2 = (i4 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072);
            Object objK3 = dr0Var.K();
            if (z2 || objK3 == obj3) {
                ArrayList arrayList = new ArrayList();
                r7 = 1;
                arrayList.add(new nx(-1192950673, true, new kl0(nxVar)));
                c5Var.getClass();
                dr0Var.f0(arrayList);
                obj2 = arrayList;
            } else {
                r7 = 1;
                obj2 = objK3;
            }
            nx nxVar2 = new nx(1271844412, r7, new hw0((List) obj2, (byte) r7));
            boolean zF2 = dr0Var.f(ol0Var2);
            Object objK4 = dr0Var.K();
            if (zF2 || objK4 == obj3) {
                objK4 = new rh1(ol0Var2);
                dr0Var.f0(objK4);
            }
            ze1 ze1Var = (ze1) objK4;
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
            wi0.n(0, nxVar2, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new kx(rg1Var, zgVar, ygVar, cmVar, c5Var, nxVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(String str, kp0 kp0Var, dr0 dr0Var, int i) {
        byte b2;
        dr0 dr0Var2;
        Object obj;
        boolean z;
        dr0 dr0Var3;
        Object obj2;
        Object obj3;
        dr0 dr0Var4 = dr0Var;
        kp0Var.getClass();
        dr0Var4.W(-1466805957);
        byte b3 = 4;
        int i2 = i | (dr0Var4.f(str) ? 4 : 2) | (dr0Var4.h(kp0Var) ? 32 : 16);
        byte b4 = 0;
        if (dr0Var4.N(i2 & 1, (i2 & 19) != 18)) {
            Context applicationContext = ((Context) dr0Var4.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            String strJ = jp1.j("ingredient_", str);
            boolean zH = dr0Var4.h(mealPlannerApp) | ((i2 & 14) == 4);
            Object objK = dr0Var4.K();
            yy yyVar = zy.a;
            Object obj4 = objK;
            if (zH || objK == yyVar) {
                fw0 fw0Var = new fw0(mealPlannerApp, str, b4);
                dr0Var4.f0(fw0Var);
                obj4 = fw0Var;
            }
            vp0 vp0Var = (vp0) obj4;
            h53 h53VarA = sb1.a(dr0Var4);
            if (h53VarA == null) {
                li1.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            du duVarA = z72.a(lw0.class);
            vw0 vw0Var = new vw0((byte) 0);
            vw0Var.a(z72.a(lw0.class), vp0Var);
            lw0 lw0Var = (lw0) h12.D(duVarA, h53VarA, strJ, vw0Var.b(), cy1.z(h53VarA), dr0Var4);
            Object[] objArr = new Object[0];
            Object objK2 = dr0Var4.K();
            if (objK2 == yyVar) {
                obj = objK2;
                jw0 jw0Var = new jw0(b4);
                dr0Var4.f0(jw0Var);
                obj = jw0Var;
            }
            obj = objK2;
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) obj, dr0Var4, 48);
            Boolean bool = (Boolean) lw0Var.o.getValue();
            bool.booleanValue();
            boolean zH2 = dr0Var4.h(lw0Var) | ((i2 & 112) == 32);
            Object objK3 = dr0Var4.K();
            Object obj5 = objK3;
            if (zH2 || objK3 == yyVar) {
                rj rjVar = new rj(lw0Var, kp0Var, null, b3);
                dr0Var4.f0(rjVar);
                obj5 = rjVar;
            }
            h7.J((zp0) obj5, dr0Var4, bool);
            cy1.a(null, dt.N(654028799, new s62((z43) lw0Var, kp0Var, sj1Var, (byte) 5), dr0Var4), null, null, null, 0, 0L, 0L, null, dt.N(-64773558, new kw0(lw0Var, b4), dr0Var4), dr0Var4, 805306416, 509);
            if (((Boolean) sj1Var.getValue()).booleanValue()) {
                dr0Var4.V(-616351584);
                boolean zF = dr0Var4.f(sj1Var);
                Object objK4 = dr0Var4.K();
                if (zF || objK4 == yyVar) {
                    obj3 = objK4;
                    bb bbVar = new bb(sj1Var, (byte) 14);
                    dr0Var4.f0(bbVar);
                    obj3 = bbVar;
                }
                z = false;
                uz0.a((kp0) obj3, dt.N(-1723769010, new j7(sj1Var, lw0Var, (byte) 15), dr0Var4), null, dt.N(435315084, new y7(sj1Var, (byte) 5), dr0Var4), dt.N(-1700568118, new cw0(lw0Var, (byte) 0), dr0Var4), uz0.t, null, 0L, 0L, 0L, 0L, null, dr0Var, 1772592, 16276);
                dr0 dr0Var5 = dr0Var;
                dr0Var5.p(false);
                dr0Var3 = dr0Var5;
            } else {
                z = false;
                dr0Var4.V(-615975833);
                dr0Var4.p(false);
                dr0Var3 = dr0Var4;
            }
            List list = (List) lw0Var.n.getValue();
            if (list == null) {
                dr0Var3.V(-615947190);
                dr0Var3.p(z);
                b2 = z;
                dr0Var2 = dr0Var3;
            } else {
                dr0Var3.V(-615947189);
                boolean zH3 = dr0Var3.h(lw0Var);
                Object objK5 = dr0Var3.K();
                if (zH3 || objK5 == yyVar) {
                    obj2 = objK5;
                    dw0 dw0Var = new dw0(lw0Var, z ? (byte) 1 : (byte) 0);
                    dr0Var3.f0(dw0Var);
                    obj2 = dw0Var;
                }
                obj2 = objK5;
                uz0.a((kp0) obj2, dt.N(864993106, new cw0(lw0Var, (byte) 1), dr0Var3), null, null, uz0.v, dt.N(-1175124969, new hw0(list, z ? (byte) 1 : (byte) 0), dr0Var3), null, 0L, 0L, 0L, 0L, null, dr0Var, 1769520, 16284);
                dr0 dr0Var6 = dr0Var;
                dr0Var6.p(z);
                b2 = z;
                dr0Var2 = dr0Var6;
            }
        } else {
            b2 = 0;
            dr0Var4.Q();
            dr0Var2 = dr0Var4;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new iw0(str, kp0Var, i, b2);
        }
    }

    public static final void h(final hs0 hs0Var, final rg1 rg1Var, final c61 c61Var, rt1 rt1Var, final bh bhVar, final zg zgVar, e70 e70Var, boolean z, j8 j8Var, final vp0 vp0Var, dr0 dr0Var, final int i) {
        final rt1 rt1Var2;
        final e70 e70Var2;
        final boolean z2;
        final j8 j8Var2;
        rt1 rt1Var3;
        int i2;
        e70 e70VarL;
        j8 j8VarB;
        boolean z3;
        zg zgVar2;
        dr0Var.W(-2072102870);
        int i3 = i | (dr0Var.f(hs0Var) ? 4 : 2) | (dr0Var.f(rg1Var) ? 32 : 16) | (dr0Var.f(c61Var) ? 256 : 128) | 373320704;
        int i4 = dr0Var.h(vp0Var) ? 4 : 2;
        boolean z4 = true;
        if (dr0Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                rt1Var3 = new rt1(0.0f, 0.0f, 0.0f, 0.0f);
                i2 = i3 & (-1908408321);
                e70VarL = y02.l(dr0Var);
                j8VarB = dt1.b(dr0Var);
                z3 = true;
            } else {
                dr0Var.Q();
                i2 = i3 & (-1908408321);
                rt1Var3 = rt1Var;
                z3 = z;
                j8VarB = j8Var;
                e70VarL = e70Var;
            }
            dr0Var.q();
            int i5 = (i2 & 14) | 48;
            if ((((i5 & 14) ^ 6) <= 4 || !dr0Var.f(hs0Var)) && (i5 & 6) != 4) {
                z4 = false;
            }
            Object objK = dr0Var.K();
            if (z4 || objK == zy.a) {
                zgVar2 = zgVar;
                objK = new js0(new s(hs0Var, zgVar2));
                dr0Var.f0(objK);
            } else {
                zgVar2 = zgVar;
            }
            int i6 = i2 >> 3;
            rt1 rt1Var4 = rt1Var3;
            es.d(rg1Var, c61Var, (js0) objK, rt1Var4, e70VarL, z3, j8VarB, bhVar, zgVar2, vp0Var, dr0Var, (i6 & 14) | 196608 | (i6 & 112) | 817916928, 6 | ((i4 << 3) & 112));
            rt1Var2 = rt1Var4;
            j8Var2 = j8VarB;
            z2 = z3;
            e70Var2 = e70VarL;
        } else {
            dr0Var.Q();
            rt1Var2 = rt1Var;
            e70Var2 = e70Var;
            z2 = z;
            j8Var2 = j8Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var, c61Var, rt1Var2, bhVar, zgVar, e70Var2, z2, j8Var2, vp0Var, i) { // from class: h51
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ c61 j;
                public final /* synthetic */ rt1 k;
                public final /* synthetic */ bh l;
                public final /* synthetic */ zg m;
                public final /* synthetic */ e70 n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ j8 p;
                public final /* synthetic */ vp0 q;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1769473);
                    ou.h(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void i(pk1 pk1Var, pb2 pb2Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(233973821);
        int i2 = (dr0Var.h(pk1Var) ? 4 : 2) | i | (dr0Var.h(pb2Var) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ys.b(new i42[]{sb1.a.a(pk1Var), ob1.a.a(pk1Var), rb1.a.a(pk1Var)}, dt.N(1808964477, new rk1(pb2Var, pk1Var, nxVar), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new rk1(pk1Var, pb2Var, nxVar, i);
        }
    }

    public static final void j(pb2 pb2Var, nx nxVar, dr0 dr0Var, int i) {
        dr0 dr0Var2;
        dr0Var.W(832919318);
        int i2 = (dr0Var.h(pb2Var) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new de1((byte) 3);
                dr0Var.f0(objK);
            }
            vp0 vp0Var = (vp0) objK;
            h53 h53VarA = sb1.a(dr0Var);
            if (h53VarA == null) {
                li1.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            du duVarA = z72.a(dj.class);
            vw0 vw0Var = new vw0((byte) 0);
            vw0Var.a(z72.a(dj.class), vp0Var);
            dr0Var2 = dr0Var;
            dj djVar = (dj) h12.D(duVarA, h53VarA, null, vw0Var.b(), cy1.z(h53VarA), dr0Var2);
            djVar.d = new a63(pb2Var);
            pb2Var.b(djVar.c, nxVar, dr0Var2, 48 | ((i2 << 6) & 896));
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 22, i, pb2Var, nxVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[LOOP:0: B:22:0x0066->B:25:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[EDGE_INSN: B:30:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:25:0x0072], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object k(defpackage.sq2 r7, defpackage.s02 r8, defpackage.rk r9) {
        /*
            boolean r0 = r9 instanceof defpackage.tn0
            if (r0 == 0) goto L13
            r0 = r9
            tn0 r0 = (defpackage.tn0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            tn0 r0 = new tn0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.m
            int r1 = r0.n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            s02 r7 = r0.l
            sq2 r8 = r0.k
            defpackage.m02.y(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            r7 = 0
            return r7
        L34:
            defpackage.m02.y(r9)
            tq2 r9 = r7.l
            q02 r9 = r9.z
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L78
            java.lang.Object r5 = r9.get(r4)
            z02 r5 = (defpackage.z02) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L75
        L4e:
            r0.k = r7
            r0.l = r8
            r0.n = r3
            java.lang.Object r9 = r7.a(r8, r0)
            y20 r1 = defpackage.y20.h
            if (r9 != r1) goto L5d
            return r1
        L5d:
            q02 r9 = (defpackage.q02) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L78
            java.lang.Object r5 = r9.get(r4)
            z02 r5 = (defpackage.z02) r5
            boolean r5 = r5.d
            if (r5 != 0) goto L4e
            int r4 = r4 + 1
            goto L66
        L75:
            int r4 = r4 + 1
            goto L42
        L78:
            j23 r7 = defpackage.j23.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou.k(sq2, s02, rk):java.lang.Object");
    }

    public static final Object l(d12 d12Var, zp0 zp0Var, m10 m10Var) {
        Object objJ0 = ((tq2) d12Var).J0(new un0(m10Var.e(), zp0Var, null, (byte) 0), m10Var);
        return objJ0 == y20.h ? objJ0 : j23.a;
    }

    public static int n(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final rg1 o(rg1 rg1Var, hi2 hi2Var) {
        return h7.j0(rg1Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, hi2Var, true, 0L, 0L, 1042431);
    }

    public static final rg1 p(rg1 rg1Var) {
        return h7.j0(rg1Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044479);
    }

    public static final boolean r(r72 r72Var, float f2, float f3) {
        float f4 = r72Var.a;
        if (f2 > r72Var.c || f4 > f2) {
            return false;
        }
        return f3 <= r72Var.d && r72Var.b <= f3;
    }

    public static final boolean t(long j, long j2) {
        return j == j2;
    }

    public static final int u(int i, s61 s61Var, Object obj) {
        int iE;
        return (obj == null || s61Var.a() == 0 || (i < s61Var.a() && obj.equals(s61Var.b(i))) || (iE = s61Var.e(obj)) == -1) ? i : iE;
    }

    public static final o20 v(o20 o20Var, o20 o20Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 12;
        boolean zBooleanValue = ((Boolean) o20Var.p(new yx(b2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) o20Var2.p(new yx(b2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return o20Var.i(o20Var2);
        }
        yx yxVar = new yx((byte) 10);
        xf0 xf0Var = xf0.h;
        o20 o20Var3 = (o20) o20Var.p(yxVar, xf0Var);
        Object objP = o20Var2;
        if (zBooleanValue2) {
            objP = o20Var2.p(new yx((byte) 11), xf0Var);
        }
        return o20Var3.i((o20) objP);
    }

    public static final String[] y(b10 b10Var) {
        b10Var.getClass();
        return (String[]) ((q7) b10Var).b.toArray(new String[0]);
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return me0.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract void m(SQLiteStatement sQLiteStatement, Object obj);

    public boolean q(h42 h42Var) {
        return false;
    }

    public abstract String s();

    public Object w() {
        throw new IllegalStateException("");
    }

    public abstract r72 x();
}
