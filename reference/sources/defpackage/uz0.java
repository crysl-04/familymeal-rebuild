package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.CursorWindow;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class uz0 {
    public static final yy A;
    public static final xg f;
    public static final vz1 h;
    public static final nx p;
    public static final nx q;
    public static final nx r;
    public static final nx s;
    public static final nx t;
    public static final nx v;
    public static final nx w;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final xg e = new xg(3);
    public static final yg g = new yg();
    public static final vz1 i = new vz1((byte) 24);
    public static final vz1 j = new vz1((byte) 23);
    public static final ji2 k = ji2.j;
    public static final float l = 8.0f;
    public static final float m = 1.0f;
    public static final nx n = new nx(210148896, false, new ig(5));
    public static final nx o = new nx(-378925285, false, new ig(11));
    public static final nx u = new nx(504973711, false, new tx(15));
    public static final y20 x = y20.h;
    public static final Class[] y = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final d13 z = d13.m;
    public static final StackTraceElement[] B = new StackTraceElement[0];
    public static final byte[] C = {48, 49, 53, 0};
    public static final byte[] D = {48, 49, 48, 0};
    public static final byte[] E = {48, 48, 57, 0};
    public static final byte[] F = {48, 48, 53, 0};
    public static final byte[] G = {48, 48, 49, 0};
    public static final byte[] H = {48, 48, 49, 0};
    public static final byte[] I = {48, 48, 50, 0};
    public static final long[] J = new long[0];
    public static final StackTraceElement[] K = new StackTraceElement[0];
    public static final s9 L = new s9(1022);
    public static final qj0 M = new qj0();

    static {
        byte b2 = 14;
        byte b3 = 2;
        f = new xg(b3);
        byte b4 = 22;
        h = new vz1(b4);
        byte b5 = 12;
        p = new nx(1370808041, false, new ig(b5));
        q = new nx(459742500, false, new tx(b5));
        byte b6 = 13;
        r = new nx(-2131412879, false, new tx(b6));
        s = new nx(27671215, false, new tx(b2));
        t = new nx(-621026071, false, new ig(b6));
        v = new nx(-767101354, false, new ig(b2));
        w = new nx(641200809, false, new yx(b3));
        A = new yy(b4);
    }

    public static void A(String str) {
        a42 a42Var = new a42(wi0.h("lateinit property ", str, " has not been initialized"), (byte) 7);
        x(a42Var, uz0.class.getName());
        throw a42Var;
    }

    public static q03 B(int i2, wg wgVar, int i3) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        ke0 ke0Var = wgVar;
        if ((i3 & 4) != 0) {
            ke0Var = le0.a;
        }
        return new q03(i2, i4, ke0Var);
    }

    public static rg1 C(rg1 rg1Var, yd2 yd2Var) {
        return rg1Var.c(ou.o(og1.h, rt0.c)).c(new zd2(null, null, yd2Var.e, ks1.h, yd2Var, null, true, true)).c(new le2(yd2Var));
    }

    public static final rg1 D(rg1 rg1Var) {
        return rg1Var.c(new qz0());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void a(final kp0 kp0Var, final nx nxVar, rg1 rg1Var, nx nxVar2, final nx nxVar3, final nx nxVar4, hi2 hi2Var, long j2, long j3, long j4, long j5, la0 la0Var, dr0 dr0Var, final int i2, final int i3) {
        kp0 kp0Var2;
        int i4;
        nx nxVar5;
        int i5;
        boolean z2;
        final hi2 hi2Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final la0 la0Var2;
        final nx nxVar6;
        final rg1 rg1Var2;
        e72 e72VarR;
        rg1 rg1Var3;
        int i6;
        la0 la0Var3;
        long j10;
        hi2 hi2Var3;
        long j11;
        long j12;
        long j13;
        dr0Var.W(94478519);
        if ((i2 & 6) == 0) {
            kp0Var2 = kp0Var;
            i4 = (dr0Var.h(kp0Var2) ? 4 : 2) | i2;
        } else {
            kp0Var2 = kp0Var;
            i4 = i2;
        }
        int i7 = i4 | 384;
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                nxVar5 = nxVar2;
                i7 |= dr0Var.h(nxVar5) ? 2048 : 1024;
            }
            i5 = i7 | 306208768;
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i5 & 1, z2)) {
                dr0Var.S();
                if ((i2 & 1) != 0 || dr0Var.x()) {
                    if (i8 != 0) {
                        nxVar5 = null;
                    }
                    hi2 hi2VarA = mi2.a(s60.p, dr0Var);
                    long jD = rv.d(s60.o, dr0Var);
                    long jD2 = rv.d(s60.u, dr0Var);
                    long jD3 = rv.d(s60.q, dr0Var);
                    long jD4 = rv.d(s60.s, dr0Var);
                    la0 la0Var4 = new la0(7);
                    rg1Var3 = og1.h;
                    i6 = i5 & (-2143289345);
                    la0Var3 = la0Var4;
                    j10 = jD4;
                    hi2Var3 = hi2VarA;
                    j11 = jD;
                    j12 = jD2;
                    j13 = jD3;
                } else {
                    dr0Var.Q();
                    rg1Var3 = rg1Var;
                    hi2Var3 = hi2Var;
                    j11 = j2;
                    j12 = j3;
                    j13 = j4;
                    j10 = j5;
                    i6 = i5 & (-2143289345);
                    la0Var3 = la0Var;
                }
                dr0Var.q();
                kp0 kp0Var3 = kp0Var2;
                rg1 rg1Var4 = rg1Var3;
                la0 la0Var5 = la0Var3;
                b5.c(kp0Var3, nxVar, rg1Var4, nxVar5, nxVar3, nxVar4, hi2Var3, j11, j12, j13, j10, la0Var5, dr0Var, i6 & 2147483646, 3456);
                nxVar6 = nxVar5;
                la0Var2 = la0Var5;
                rg1Var2 = rg1Var4;
                j9 = j10;
                j8 = j13;
                j7 = j12;
                j6 = j11;
                hi2Var2 = hi2Var3;
            } else {
                dr0Var.Q();
                hi2Var2 = hi2Var;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                j9 = j5;
                la0Var2 = la0Var;
                nxVar6 = nxVar5;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: x5
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i2 | 1);
                        uz0.a(kp0Var, nxVar, rg1Var2, nxVar6, nxVar3, nxVar4, hi2Var2, j6, j7, j8, j9, la0Var2, (dr0) obj, iA, i3);
                        return j23.a;
                    }
                };
            }
        }
        i7 = i4 | 3456;
        nxVar5 = nxVar2;
        i5 = i7 | 306208768;
        if ((306783379 & i5) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (dr0Var.N(i5 & 1, z2)) {
            dr0Var.S();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    nxVar5 = null;
                }
                hi2 hi2VarA2 = mi2.a(s60.p, dr0Var);
                long jD5 = rv.d(s60.o, dr0Var);
                long jD6 = rv.d(s60.u, dr0Var);
                long jD7 = rv.d(s60.q, dr0Var);
                long jD8 = rv.d(s60.s, dr0Var);
                la0 la0Var6 = new la0(7);
                rg1Var3 = og1.h;
                i6 = i5 & (-2143289345);
                la0Var3 = la0Var6;
                j10 = jD8;
                hi2Var3 = hi2VarA2;
                j11 = jD5;
                j12 = jD6;
                j13 = jD7;
            } else {
                if (i8 != 0) {
                    nxVar5 = null;
                }
                hi2 hi2VarA3 = mi2.a(s60.p, dr0Var);
                long jD9 = rv.d(s60.o, dr0Var);
                long jD10 = rv.d(s60.u, dr0Var);
                long jD11 = rv.d(s60.q, dr0Var);
                long jD12 = rv.d(s60.s, dr0Var);
                la0 la0Var7 = new la0(7);
                rg1Var3 = og1.h;
                i6 = i5 & (-2143289345);
                la0Var3 = la0Var7;
                j10 = jD12;
                hi2Var3 = hi2VarA3;
                j11 = jD9;
                j12 = jD10;
                j13 = jD11;
            }
            dr0Var.q();
            kp0 kp0Var4 = kp0Var2;
            rg1 rg1Var5 = rg1Var3;
            la0 la0Var8 = la0Var3;
            b5.c(kp0Var4, nxVar, rg1Var5, nxVar5, nxVar3, nxVar4, hi2Var3, j11, j12, j13, j10, la0Var8, dr0Var, i6 & 2147483646, 3456);
            nxVar6 = nxVar5;
            la0Var2 = la0Var8;
            rg1Var2 = rg1Var5;
            j9 = j10;
            j8 = j13;
            j7 = j12;
            j6 = j11;
            hi2Var2 = hi2Var3;
        } else {
            dr0Var.Q();
            hi2Var2 = hi2Var;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            j9 = j5;
            la0Var2 = la0Var;
            nxVar6 = nxVar5;
            rg1Var2 = rg1Var;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: x5
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i2 | 1);
                    uz0.a(kp0Var, nxVar, rg1Var2, nxVar6, nxVar3, nxVar4, hi2Var2, j6, j7, j8, j9, la0Var2, (dr0) obj, iA, i3);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(oy2 oy2Var, nx nxVar, ry2 ry2Var, rg1 rg1Var, nx nxVar2, dr0 dr0Var, int i2) {
        oy2 oy2Var2;
        int i3;
        sj1 sj1Var;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(-1221877520);
        if ((i2 & 6) == 0) {
            oy2Var2 = oy2Var;
            i3 = (dr0Var2.f(oy2Var2) ? 4 : 2) | i2;
        } else {
            oy2Var2 = oy2Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var2.h(nxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? dr0Var2.f(ry2Var) : dr0Var2.h(ry2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var2.f(rg1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var2.h(null) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        boolean z2 = false;
        if ((i2 & 196608) == 0) {
            i3 |= dr0Var2.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dr0Var2.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dr0Var2.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dr0Var2.h(nxVar2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (dr0Var2.N(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = h7.Y(dr0Var2);
                dr0Var2.f0(objK);
            }
            x20 x20Var = (x20) objK;
            Object objK2 = dr0Var2.K();
            if (objK2 == yyVar) {
                objK2 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK2);
            }
            sj1 sj1Var2 = (sj1) objK2;
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, og1.h);
            sy.f.getClass();
            dr0Var2.Y();
            if (dr0Var2.S) {
                dr0Var2.k(l41.W);
            } else {
                dr0Var2.i0();
            }
            h12.y(c5.F, dr0Var2, ze1VarC);
            h12.y(c5.E, dr0Var2, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var2.S || !g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var2, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var2, rg1VarU);
            if (ry2Var.b()) {
                dr0Var2.V(-1891243071);
                e(oy2Var2, ry2Var, x20Var, false, sj1Var2, nxVar, dr0Var2, ((i4 << 15) & 3670016) | (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                sj1Var = sj1Var2;
                dr0Var2 = dr0Var2;
                dr0Var2.p(false);
            } else {
                sj1Var = sj1Var2;
                dr0Var2.V(-1890863476);
                dr0Var2.p(false);
            }
            f(ry2Var, sj1Var, rg1Var, nxVar2, dr0Var2, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | ((i4 << 3) & 57344) | ((i4 >> 9) & 458752));
            dr0Var2.p(true);
            if ((i4 & 896) == 256 || ((i4 & 512) != 0 && dr0Var2.h(ry2Var))) {
                z2 = true;
            }
            Object objK3 = dr0Var2.K();
            if (z2 || objK3 == yyVar) {
                objK3 = new p((Object) ry2Var, (byte) 10);
                dr0Var2.f0(objK3);
            }
            h7.G(ry2Var, (vp0) objK3, dr0Var2);
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new nl(oy2Var, nxVar, ry2Var, rg1Var, nxVar2, i2);
        }
    }

    public static final void c(kp0 kp0Var, la0 la0Var, nx nxVar, dr0 dr0Var, int i2) {
        dr0Var.W(826668973);
        int i3 = i2 | (dr0Var.h(kp0Var) ? 4 : 2) | (dr0Var.f(la0Var) ? 32 : 16);
        byte b2 = 0;
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) dr0Var.j(i7.f);
            e90 e90Var = (e90) dr0Var.j(uz.h);
            u31 u31Var = (u31) dr0Var.j(uz.n);
            br0 br0VarC0 = lt.c0(dr0Var);
            sj1 sj1VarC = rz1.C(nxVar, dr0Var);
            Object[] objArr = new Object[0];
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (objK == obj) {
                objK = new r3((byte) 8);
                dr0Var.f0(objK);
            }
            UUID uuid = (UUID) rz1.z(objArr, (kp0) objK, dr0Var, 48);
            la0Var.getClass();
            boolean zF = dr0Var.f(view) | dr0Var.f(e90Var) | dr0Var.d(2) | dr0Var.f(null);
            Object objK2 = dr0Var.K();
            Object obj2 = objK2;
            if (zF || objK2 == obj) {
                na0 na0Var = new na0(kp0Var, la0Var, view, u31Var, e90Var, uuid);
                nx nxVar2 = new nx(-1338939603, true, new y7(sj1VarC, b2));
                ia0 ia0Var = na0Var.o;
                ia0Var.setParentCompositionContext(br0VarC0);
                ia0Var.r.setValue(nxVar2);
                ia0Var.v = true;
                ia0Var.e();
                dr0Var.f0(na0Var);
                obj2 = na0Var;
            }
            na0 na0Var2 = (na0) obj2;
            boolean zH = dr0Var.h(na0Var2);
            Object objK3 = dr0Var.K();
            if (zH || objK3 == obj) {
                objK3 = new z7(na0Var2, b2);
                dr0Var.f0(objK3);
            }
            h7.G(na0Var2, (vp0) objK3, dr0Var);
            boolean zH2 = dr0Var.h(na0Var2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | dr0Var.d(u31Var.ordinal());
            Object objK4 = dr0Var.K();
            if (zH2 || objK4 == obj) {
                Object a8Var = new a8(na0Var2, kp0Var, la0Var, u31Var, (byte) 0);
                dr0Var.f0(a8Var);
                objK4 = a8Var;
            }
            h7.S((kp0) objK4, dr0Var);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(kp0Var, la0Var, nxVar, i2, (byte) 1);
        }
    }

    public static final void d(rg1 rg1Var, zp0 zp0Var, dr0 dr0Var, int i2) {
        dr0Var.W(1090521195);
        int i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2 | (dr0Var.h(zp0Var) ? 32 : 16);
        byte b2 = 0;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = c8.b;
                dr0Var.f0(objK);
            }
            ze1 ze1Var = (ze1) objK;
            int i4 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            sy.f.getClass();
            int i5 = ((i4 << 6) & 896) | 6;
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
            zp0Var.f(dr0Var, Integer.valueOf((i5 >> 6) & 14));
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new x7(rg1Var, zp0Var, i2, b2);
        }
    }

    public static final void e(oy2 oy2Var, ry2 ry2Var, x20 x20Var, boolean z2, sj1 sj1Var, nx nxVar, dr0 dr0Var, int i2) {
        oy2 oy2Var2;
        int i3;
        dr0Var.W(-1413720282);
        if ((i2 & 6) == 0) {
            oy2Var2 = oy2Var;
            i3 = (dr0Var.f(oy2Var2) ? 4 : 2) | i2;
        } else {
            oy2Var2 = oy2Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dr0Var.f(ry2Var) : dr0Var.h(ry2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var.h(x20Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var.g(z2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dr0Var.f(sj1Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dr0Var.h(nxVar) ? 1048576 : 524288;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (dr0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            String string = ((Resources) dr0Var.j(i7.c)).getString(net.zetetic.database.R.string.tooltip_description);
            boolean zH = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && dr0Var.h(ry2Var))) | dr0Var.h(x20Var) | ((458752 & i3) == 131072);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new zi(ry2Var, x20Var, sj1Var, b3);
                dr0Var.f0(objK);
            }
            ca.a(oy2Var2, (kp0) objK, new p12(0, z2, true), dt.N(-1287705660, new rl(string, nxVar, b2), dr0Var), dr0Var, (i3 & 14) | 3072, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ol(oy2Var, ry2Var, x20Var, z2, sj1Var, nxVar, i2);
        }
    }

    public static final void f(ry2 ry2Var, sj1 sj1Var, rg1 rg1Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(1873232064);
        byte b2 = 1;
        byte b3 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dr0Var.f(ry2Var) : dr0Var.h(ry2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.f(sj1Var) ? 256 : 128;
        }
        byte b4 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var.f(rg1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dr0Var.h(nxVar) ? 131072 : 65536;
        }
        if (dr0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = h7.Y(dr0Var);
                dr0Var.f0(objK);
            }
            x20 x20Var = (x20) objK;
            rg1 rg1VarE = t03.E(o(oq2.a(oq2.a(rg1Var, ry2Var, new xl(ry2Var, b4)), ry2Var, new xl(ry2Var, b2)).c(new ou1(new qb(((Resources) dr0Var.j(i7.c)).getString(net.zetetic.database.R.string.tooltip_label), x20Var, ry2Var, b3))), new g(x20Var, ry2Var, (byte) 5)), new q9(ry2Var, sj1Var, (byte) 3));
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarE);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1VarC);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            wi0.n((i3 >> 15) & 14, nxVar, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new t4(ry2Var, sj1Var, rg1Var, nxVar, i2);
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final boolean h(Object obj) {
        if (obj instanceof fl2) {
            fl2 fl2Var = (fl2) obj;
            if (fl2Var.d() == c5.f0 || fl2Var.d() == vz1.s || fl2Var.d() == vz1.k) {
                Object value = fl2Var.getValue();
                if (value != null) {
                    return h(value);
                }
                return true;
            }
        } else if (!(obj instanceof hq0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (y[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int i(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int j(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final rq k(m10 m10Var) {
        Unsafe unsafe;
        rq rqVar;
        rq rqVar2;
        if (!(m10Var instanceof ta0)) {
            return new rq(1, m10Var);
        }
        ta0 ta0Var = (ta0) m10Var;
        qf0 qf0Var = tz0.R;
        long j2 = ta0.o;
        loop0: while (true) {
            unsafe = hi.a;
            Object objectVolatile = unsafe.getObjectVolatile(ta0Var, j2);
            rqVar = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(ta0Var, j2, qf0Var);
                rqVar2 = null;
                break;
            }
            if (objectVolatile instanceof rq) {
                do {
                    unsafe = hi.a;
                    if (unsafe.compareAndSwapObject(ta0Var, ta0.o, objectVolatile, qf0Var)) {
                        rqVar2 = (rq) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(ta0Var, j2) == objectVolatile);
            } else if (objectVolatile != qf0Var && !(objectVolatile instanceof Throwable)) {
                wg.h(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (rqVar2 != null) {
            long j3 = rq.o;
            Object objectVolatile2 = unsafe.getObjectVolatile(rqVar2, j3);
            if (!(objectVolatile2 instanceof kw) || ((kw) objectVolatile2).d == null) {
                unsafe.putIntVolatile(rqVar2, rq.m, 536870911);
                unsafe.putObjectVolatile(rqVar2, j3, g3.a);
                rqVar = rqVar2;
            } else {
                rqVar2.q();
            }
            if (rqVar != null) {
                return rqVar;
            }
        }
        return new rq(2, m10Var);
    }

    public static boolean l(int i2) {
        return (i2 & 32768) != 0;
    }

    public static boolean m(int i2) {
        if (i2 != 15 && i2 != 255) {
            if (i2 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i2 != 32783) {
                return i2 == 33023 || i2 == 0;
            }
            return Build.VERSION.SDK_INT > 29;
        }
        return true;
    }

    public static final rg1 n(rg1 rg1Var, aq0 aq0Var) {
        return rg1Var.c(new v31(aq0Var));
    }

    public static final rg1 o(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new sl0(vp0Var));
    }

    public static final rg1 p(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new oq1(vp0Var));
    }

    public static void q(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void r(int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        if (!z2) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public static void s(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z2) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public static void t(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length != 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 : iArr) {
                i4 += i5;
            }
            float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
            float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
            if (z2) {
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i6 = iArr[length];
                    iArr2[length] = Math.round(f2);
                    f2 += i6 + fMax;
                }
                return;
            }
            int length2 = iArr.length;
            int i7 = 0;
            while (i3 < length2) {
                int i8 = iArr[i3];
                iArr2[i7] = Math.round(f2);
                f2 += i8 + fMax;
                i3++;
                i7++;
            }
        }
    }

    public static void u(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z2) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static final yd2 v(dr0 dr0Var) {
        Object[] objArr = new Object[0];
        boolean zD = dr0Var.d(0);
        Object objK = dr0Var.K();
        if (zD || objK == zy.a) {
            objK = new n62((byte) 11);
            dr0Var.f0(objK);
        }
        return (yd2) rz1.B(objArr, yd2.k, (kp0) objK, dr0Var, 0);
    }

    public static final Object w(o20 o20Var, zp0 zp0Var) throws Throwable {
        nh0 nh0VarA;
        o20 o20VarV;
        Thread threadCurrentThread = Thread.currentThread();
        n20 n20Var = c5.L;
        q20 q20Var = (q20) o20Var.m(n20Var);
        xf0 xf0Var = xf0.h;
        if (q20Var == null) {
            nh0VarA = fx2.a();
            o20VarV = ou.v(xf0Var, o20Var.i(nh0VarA), true);
            r70 r70Var = ya0.a;
            if (o20VarV != r70Var && o20VarV.m(n20Var) == null) {
                o20VarV = o20VarV.i(r70Var);
            }
        } else {
            nh0VarA = (nh0) fx2.a.get();
            o20VarV = ou.v(xf0Var, o20Var, true);
            r70 r70Var2 = ya0.a;
            if (o20VarV != r70Var2 && o20VarV.m(n20Var) == null) {
                o20VarV = o20VarV.i(r70Var2);
            }
        }
        on onVar = new on(o20VarV, threadCurrentThread, nh0VarA);
        onVar.i0(a30.h, onVar, zp0Var);
        nh0 nh0Var = onVar.l;
        if (nh0Var != null) {
            int i2 = nh0.m;
            nh0Var.l(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jQ = nh0Var != null ? nh0Var.q() : Long.MAX_VALUE;
                if (!(onVar.N() instanceof tu0)) {
                    if (nh0Var != null) {
                        int i3 = nh0.m;
                        nh0Var.j(false);
                    }
                    Object objD = ie1.D(onVar.N());
                    mw mwVar = objD instanceof mw ? (mw) objD : null;
                    if (mwVar == null) {
                        return objD;
                    }
                    throw mwVar.a;
                }
                LockSupport.parkNanos(onVar, jQ);
            } catch (Throwable th) {
                if (nh0Var != null) {
                    int i4 = nh0.m;
                    nh0Var.j(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        onVar.A(interruptedException);
        throw interruptedException;
    }

    public static void x(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static zm2 y(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new zm2(f2, f3, obj);
    }

    public static final void z(du duVar, String str) {
        String string;
        String str2 = "in the polymorphic scope of '" + duVar.c() + '\'';
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder sbL = wi0.l("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            wi0.v(sbL, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbL.append(duVar.c());
            sbL.append("' has to be sealed and '@Serializable'.");
            string = sbL.toString();
        }
        throw new wh2(string);
    }
}
