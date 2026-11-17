package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.Array;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s60 {
    public static final qv A;
    public static final gc0 A0;
    public static final float B;
    public static final c53 B0;
    public static final qv C;
    public static final float D;
    public static final qv E;
    public static final float F;
    public static final qv G;
    public static final float H;
    public static final d13 I;
    public static final qv J;
    public static final qv K;
    public static final qv L;
    public static final float M;
    public static final qv N;
    public static final qv O;
    public static final qv P;
    public static final float Q;
    public static final qv R;
    public static final qv S;
    public static final g73 T;
    public static final g73 U;
    public static final g73 V;
    public static final g73 W;
    public static final float[] X;
    public static final qv Y;
    public static final ji2 Z;
    public static final s0 a;
    public static final qv a0;
    public static final float b0;
    public static final qv c0;
    public static final nx d;
    public static final float d0;
    public static final nx e;
    public static final qv e0;
    public static final float f0;
    public static final qv g0;
    public static final nx h;
    public static final d13 h0;
    public static final nx i;
    public static final qv i0;
    public static final float j0;
    public static final qv k0;
    public static final qv l0;
    public static final qv m;
    public static final d13 m0;
    public static final d13 n;
    public static final float n0;
    public static final qv o;
    public static final qv o0;
    public static final ji2 p;
    public static final d13 p0;
    public static final qv q;
    public static final float q0;
    public static final d13 r;
    public static final qf0 r0;
    public static final qv s;
    public static final qv s0;
    public static final d13 t;
    public static final ji2 t0;
    public static final qv u;
    public static final qv u0;
    public static final ou0 v;
    public static final d13 v0;
    public static final ji2 w;
    public static final vw1 w0;
    public static final qv x;
    public static final ux x0;
    public static final float y;
    public static final k42 y0;
    public static final float z;
    public static final jy1 z0;
    public static final float[] b = new float[91];
    public static final Object[] c = new Object[0];
    public static final nx f = new nx(818230498, false, new ig(27));
    public static final nx g = new nx(262676491, false, new ig(28));
    public static final int[] j = new int[0];
    public static final long[] k = new long[0];
    public static final Object[] l = new Object[0];

    static {
        byte b2 = 0;
        a = new s0(b2);
        d = new nx(636288403, false, new ux(b2));
        byte b3 = 1;
        e = new nx(-1357803046, false, new ux(b3));
        byte b4 = 29;
        h = new nx(1163744426, false, new ig(b4));
        i = new nx(-79361150, false, new wx(b2));
        qv qvVar = qv.r;
        m = qvVar;
        d13 d13Var = d13.m;
        n = d13Var;
        o = qv.x;
        p = ji2.h;
        qv qvVar2 = qv.n;
        q = qvVar2;
        r = d13.l;
        qv qvVar3 = qv.o;
        s = qvVar3;
        d13 d13Var2 = d13.i;
        t = d13Var2;
        u = qv.t;
        v = new ou0(false);
        w = ji2.n;
        x = qvVar2;
        y = 0.38f;
        z = 8.0f;
        A = qvVar2;
        B = 0.12f;
        C = qvVar2;
        D = 0.12f;
        E = qv.u;
        F = 1.0f;
        G = qv.q;
        H = 1.0f;
        I = d13Var;
        qv qvVar4 = qv.m;
        J = qvVar4;
        K = qvVar3;
        L = qvVar2;
        M = 0.38f;
        N = qvVar4;
        O = qvVar;
        P = qvVar2;
        Q = 0.38f;
        R = qvVar4;
        S = qvVar3;
        T = new g73(0.31006f, 0.31616f);
        U = new g73(0.34567f, 0.3585f);
        V = new g73(0.32168f, 0.33767f);
        W = new g73(0.31271f, 0.32902f);
        X = new float[]{0.964212f, 1.0f, 0.825188f};
        Y = qv.v;
        Z = ji2.m;
        a0 = qvVar2;
        b0 = 0.38f;
        c0 = qvVar2;
        d0 = 0.38f;
        e0 = qvVar2;
        f0 = 0.38f;
        g0 = qvVar2;
        h0 = d13.h;
        i0 = qvVar3;
        j0 = 56.0f;
        k0 = qvVar3;
        l0 = qvVar3;
        m0 = d13Var2;
        n0 = 88.0f;
        o0 = qvVar3;
        p0 = d13.o;
        q0 = 72.0f;
        r0 = new qf0("NULL", b3);
        s0 = qv.j;
        t0 = ji2.i;
        u0 = qv.i;
        v0 = d13.j;
        w0 = new vw1((byte) 13);
        x0 = new ux((byte) 2);
        y0 = new k42(new yx(b4), new z82((byte) 6), (byte) 4);
        z0 = new jy1((byte) 14);
        A0 = new gc0();
        B0 = new c53(b3);
    }

    public static final za B(kp0 kp0Var, dr0 dr0Var, int i2) {
        View view = (View) dr0Var.j(i7.f);
        boolean zF = dr0Var.f(view);
        Object objK = dr0Var.K();
        Object obj = zy.a;
        if (zF || objK == obj) {
            objK = new za(view, null, kp0Var);
            dr0Var.f0(objK);
        }
        za zaVar = (za) objK;
        boolean zH = dr0Var.h(zaVar);
        Object objK2 = dr0Var.K();
        if (zH || objK2 == obj) {
            objK2 = new sa(zaVar, (byte) 3);
            dr0Var.f0(objK2);
        }
        h7.G(zaVar, (vp0) objK2, dr0Var);
        return zaVar;
    }

    public static final rg1 F(boolean z2, boolean z3, kp0 kp0Var) {
        rg1 to2Var = og1.h;
        if (!z2 || !so2.a) {
            return to2Var;
        }
        if (z3) {
            to2Var = new to2(A0);
        }
        return to2Var.c(new qo2(kp0Var));
    }

    public static final Object[] I(Collection collection) {
        collection.getClass();
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return c;
    }

    public static final Object[] J(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String K(m10 m10Var) {
        Object d92Var;
        if (m10Var instanceof ta0) {
            return ((ta0) m10Var).toString();
        }
        try {
            d92Var = m10Var + '@' + o(m10Var);
        } catch (Throwable th) {
            d92Var = new d92(th);
        }
        if (e92.a(d92Var) != null) {
            d92Var = m10Var.getClass().getName() + '@' + o(m10Var);
        }
        return (String) d92Var;
    }

    public static final String L(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static final void a(vv2 vv2Var, vp0 vp0Var, rg1 rg1Var, boolean z2, xw2 xw2Var, c31 c31Var, b31 b31Var, boolean z3, int i2, int i3, w53 w53Var, vp0 vp0Var2, ui1 ui1Var, rl2 rl2Var, nx nxVar, dr0 dr0Var, int i4) {
        vp0 vp0Var3;
        vp0 vp0Var4;
        int i5;
        dr0Var.W(-971111025);
        int i6 = i2;
        int i7 = i4 | (dr0Var.f(vv2Var) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | (dr0Var.f(rg1Var) ? 256 : 128) | (dr0Var.g(z2) ? 2048 : 1024) | (dr0Var.g(false) ? 16384 : 8192) | (dr0Var.f(xw2Var) ? 131072 : 65536) | (dr0Var.f(c31Var) ? 1048576 : 524288) | (dr0Var.f(b31Var) ? 8388608 : 4194304) | (dr0Var.g(z3) ? 67108864 : 33554432) | (dr0Var.d(i6) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i8 = 196608 | (dr0Var.d(i3) ? 4 : 2) | (dr0Var.f(w53Var) ? 32 : 16) | 384 | (dr0Var.f(ui1Var) ? 2048 : 1024) | (dr0Var.f(rl2Var) ? 16384 : 8192);
        if (dr0Var.N(i7 & 1, ((i7 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            dr0Var.S();
            int i9 = i4 & 1;
            yy yyVar = zy.a;
            if (i9 == 0 || dr0Var.x()) {
                Object objK = dr0Var.K();
                if (objK == yyVar) {
                    objK = new s0((byte) 22);
                    dr0Var.f0(objK);
                }
                vp0Var4 = (vp0) objK;
            } else {
                dr0Var.Q();
                vp0Var4 = vp0Var2;
            }
            dr0Var.q();
            nu0 nu0VarA = c31Var.a(z3);
            boolean z4 = !z3;
            if (z3) {
                i6 = 1;
                i5 = 1;
            } else {
                i5 = i3;
            }
            boolean z5 = ((i7 & 14) == 4) | ((i7 & 112) == 32);
            Object objK2 = dr0Var.K();
            if (z5 || objK2 == yyVar) {
                objK2 = new g(vv2Var, vp0Var, (byte) 4);
                dr0Var.f0(objK2);
            }
            int i10 = i8 << 9;
            dt.h(vv2Var, (vp0) objK2, rg1Var, xw2Var, w53Var, vp0Var4, ui1Var, rl2Var, z4, i6, i5, nu0VarA, b31Var, z2, nxVar, dr0Var, (i7 & 910) | ((i7 >> 6) & 7168) | (i10 & 57344) | 196608 | (i10 & 3670016) | (i10 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
            vp0Var3 = vp0Var4;
        } else {
            dr0Var.Q();
            vp0Var3 = vp0Var2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new il(vv2Var, vp0Var, rg1Var, z2, xw2Var, c31Var, b31Var, z3, i2, i3, w53Var, vp0Var3, ui1Var, rl2Var, nxVar, i4, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:87:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191  */
    /* JADX WARN: Code duplicated, block: B:95:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a7  */
    public static final void b(String str, vp0 vp0Var, rg1 rg1Var, boolean z2, xw2 xw2Var, c31 c31Var, b31 b31Var, boolean z3, int i2, int i3, v53 v53Var, vp0 vp0Var2, ui1 ui1Var, rl2 rl2Var, nx nxVar, dr0 dr0Var, int i4) {
        vp0 vp0Var3;
        vp0 vp0Var4;
        Object obj;
        boolean z4;
        Object objK;
        Object obj2;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        Object objK2;
        dr0Var.W(2026950908);
        int i7 = i4 | (dr0Var.f(str) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | (dr0Var.f(rg1Var) ? 256 : 128) | (dr0Var.g(z2) ? 2048 : 1024) | (dr0Var.g(false) ? 16384 : 8192) | (dr0Var.f(xw2Var) ? 131072 : 65536) | (dr0Var.f(c31Var) ? 1048576 : 524288) | (dr0Var.f(b31Var) ? 8388608 : 4194304) | (dr0Var.g(z3) ? 67108864 : 33554432) | (dr0Var.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i8 = 196608 | (dr0Var.d(i3) ? 4 : 2) | (dr0Var.f(v53Var) ? 32 : 16) | 384 | (dr0Var.f(ui1Var) ? 2048 : 1024) | (dr0Var.f(rl2Var) ? 16384 : 8192);
        if (dr0Var.N(i7 & 1, ((i7 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            dr0Var.S();
            int i9 = i4 & 1;
            Object obj3 = zy.a;
            if (i9 == 0 || dr0Var.x()) {
                Object objK3 = dr0Var.K();
                if (objK3 == obj3) {
                    objK3 = new s0((byte) 21);
                    dr0Var.f0(objK3);
                }
                vp0Var4 = (vp0) objK3;
            } else {
                dr0Var.Q();
                vp0Var4 = vp0Var2;
            }
            dr0Var.q();
            Object objK4 = dr0Var.K();
            vp0 vp0Var5 = vp0Var4;
            if (objK4 == obj3) {
                objK4 = rz1.x(new vv2(str, 0L, 6));
                dr0Var.f0(objK4);
            }
            sj1 sj1Var = (sj1) objK4;
            vv2 vv2Var = (vv2) sj1Var.getValue();
            vv2 vv2Var2 = new vv2(new od(str), vv2Var.b, vv2Var.c);
            boolean zF = dr0Var.f(vv2Var2);
            Object objK5 = dr0Var.K();
            if (zF) {
                obj = obj3;
            } else {
                obj = obj3;
                if (objK5 == obj) {
                }
                h7.S((kp0) objK5, dr0Var);
                if ((i7 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objK = dr0Var.K();
                if (z4 || objK == obj) {
                    objK = rz1.x(str);
                    dr0Var.f0(objK);
                }
                obj2 = (sj1) objK;
                nu0 nu0VarA = c31Var.a(z3);
                boolean z7 = !z3;
                if (z3) {
                    i5 = 1;
                    i6 = 1;
                } else {
                    i5 = i2;
                    i6 = i3;
                }
                boolean zF2 = dr0Var.f(obj2);
                if ((i7 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zF2 | z5;
                objK2 = dr0Var.K();
                if (z6 || objK2 == obj) {
                    objK2 = new qb((Object) vp0Var, (Object) sj1Var, obj2, (byte) 1);
                    dr0Var.f0(objK2);
                }
                int i10 = i8 << 9;
                dt.h(vv2Var2, (vp0) objK2, rg1Var, xw2Var, v53Var, vp0Var5, ui1Var, rl2Var, z7, i5, i6, nu0VarA, b31Var, z2, nxVar, dr0Var, (i7 & 896) | ((i7 >> 6) & 7168) | (i10 & 57344) | 196608 | (3670016 & i10) | (i10 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
                vp0Var3 = vp0Var5;
            }
            objK5 = new h6((Object) vv2Var2, (Object) sj1Var, (byte) 6);
            dr0Var.f0(objK5);
            h7.S((kp0) objK5, dr0Var);
            if ((i7 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objK = dr0Var.K();
            if (z4) {
                objK = rz1.x(str);
                dr0Var.f0(objK);
            } else {
                objK = rz1.x(str);
                dr0Var.f0(objK);
            }
            obj2 = (sj1) objK;
            nu0 nu0VarA2 = c31Var.a(z3);
            boolean z8 = !z3;
            if (z3) {
                i5 = 1;
                i6 = 1;
            } else {
                i5 = i2;
                i6 = i3;
            }
            boolean zF3 = dr0Var.f(obj2);
            if ((i7 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zF3 | z5;
            objK2 = dr0Var.K();
            if (z6) {
                objK2 = new qb((Object) vp0Var, (Object) sj1Var, obj2, (byte) 1);
                dr0Var.f0(objK2);
            } else {
                objK2 = new qb((Object) vp0Var, (Object) sj1Var, obj2, (byte) 1);
                dr0Var.f0(objK2);
            }
            int i11 = i8 << 9;
            dt.h(vv2Var2, (vp0) objK2, rg1Var, xw2Var, v53Var, vp0Var5, ui1Var, rl2Var, z8, i5, i6, nu0VarA2, b31Var, z2, nxVar, dr0Var, (i7 & 896) | ((i7 >> 6) & 7168) | (i11 & 57344) | 196608 | (3670016 & i11) | (i11 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
            vp0Var3 = vp0Var5;
        } else {
            dr0Var.Q();
            vp0Var3 = vp0Var2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new il(str, vp0Var, rg1Var, z2, xw2Var, c31Var, b31Var, z3, i2, i3, v53Var, vp0Var3, ui1Var, rl2Var, nxVar, i4, (byte) 0);
        }
    }

    public static final zn c(float f2, long j2) {
        return new zn(f2, new rl2(j2));
    }

    public static final void d(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.h(nxVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            e(rg1Var, nxVar, dr0Var, (i3 & 14) | 48 | ((i3 << 3) & 896));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ab(rg1Var, nxVar, i2, b2);
        }
    }

    public static final void e(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(771959668);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(nxVar) ? 256 : 128;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
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
                objK2 = new bb(sj1Var, b2);
                dr0Var.f0(objK2);
            }
            ys.a(pt2.b.a(B((kp0) objK2, dr0Var, 0)), dt.N(-291176396, new s62(rg1Var, sj1Var, nxVar), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ab(rg1Var, nxVar, i2, b3);
        }
    }

    public static rg1 f() {
        return new eo();
    }

    public static final int h(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int i(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return ss.b[c2];
        }
        return (byte) 0;
    }

    public static final boolean l(wg2 wg2Var) {
        return !wg2Var.k().h.c(ah2.j);
    }

    public static DateTimeFormatter n(String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = linkedHashMap.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(str2, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return (DateTimeFormatter) objWithDecimalStyle;
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean p(wg2 wg2Var) {
        Object objG = wg2Var.d.h.g(ah2.L);
        if (objG == null) {
            objG = null;
        }
        by2 by2Var = (by2) objG;
        mj1 mj1Var = wg2Var.d.h;
        Object objG2 = mj1Var.g(ah2.z);
        if (objG2 == null) {
            objG2 = null;
        }
        ba2 ba2Var = (ba2) objG2;
        boolean z2 = by2Var != null;
        Object objG3 = mj1Var.g(ah2.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (ba2Var != null && ba2Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String q(wg2 wg2Var, Resources resources) {
        int iN;
        Float fValueOf = Float.valueOf(0.0f);
        rg2 rg2Var = wg2Var.d;
        rg2 rg2Var2 = wg2Var.d;
        Object objG = rg2Var.h.g(ah2.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        mj1 mj1Var = rg2Var2.h;
        Object objG2 = mj1Var.g(ah2.L);
        if (objG2 == null) {
            objG2 = null;
        }
        by2 by2Var = (by2) objG2;
        Object objG3 = mj1Var.g(ah2.z);
        if (objG3 == null) {
            objG3 = null;
        }
        ba2 ba2Var = (ba2) objG3;
        if (by2Var != null) {
            int iOrdinal = by2Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (ba2Var != null && ba2Var.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (ba2Var != null && ba2Var.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = mj1Var.g(ah2.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((ba2Var == null || ba2Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = mj1Var.g(ah2.c);
        if (objG5 == null) {
            objG5 = null;
        }
        b42 b42Var = (b42) objG5;
        if (b42Var != null) {
            if (b42Var != b42.b) {
                if (objG == null) {
                    float fFloatValue = fValueOf.floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (0.0f - fValueOf.floatValue()) / (fValueOf.floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iN = 0;
                    } else {
                        iN = fFloatValue == 1.0f ? 100 : cy1.n(Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(iN));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        ch2 ch2Var = ah2.G;
        if (mj1Var.c(ch2Var)) {
            mj1 mj1Var2 = new wg2(wg2Var.a, true, wg2Var.c, rg2Var2).k().h;
            Object objG6 = mj1Var2.g(ah2.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = mj1Var2.g(ah2.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = mj1Var2.g(ch2Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final od r(wg2 wg2Var) {
        Object objG = wg2Var.d.h.g(ah2.G);
        if (objG == null) {
            objG = null;
        }
        od odVar = (od) objG;
        Object objG2 = wg2Var.d.h.g(ah2.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return odVar == null ? list != null ? (od) dv.y0(list) : null : odVar;
    }

    public static final Object s(ue1 ue1Var) {
        Object objL = ue1Var.l();
        y31 y31Var = objL instanceof y31 ? (y31) objL : null;
        if (y31Var != null) {
            return y31Var.v;
        }
        return null;
    }

    public static final boolean t(wg2 wg2Var, Resources resources) {
        if (aa3.z(wg2Var)) {
            return false;
        }
        rg2 rg2Var = wg2Var.d;
        if (rg2Var.j) {
            return true;
        }
        Object objG = rg2Var.h.g(ah2.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) dv.y0(list) : null) == null && r(wg2Var) == null && q(wg2Var, resources) == null && !p(wg2Var)) && u(wg2Var);
    }

    public static final boolean u(wg2 wg2Var) {
        if (!wg2Var.o()) {
            List listJ = wg2.j(4, wg2Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (cy1.F((wg2) listJ.get(i2))) {
                }
            }
            l41 l41VarU = wg2Var.c.u();
            while (true) {
                if (l41VarU == null) {
                    l41VarU = null;
                    break;
                }
                rg2 rg2VarW = l41VarU.w();
                if (rg2VarW != null && rg2VarW.j) {
                    break;
                }
                l41VarU = l41VarU.u();
            }
            return !(l41VarU != null);
        }
        return false;
    }

    public static final rg1 w(rg1 rg1Var, String str) {
        return rg1Var.c(new x31(str));
    }

    public im A() {
        return ((im) jm.I0.get()).e();
    }

    public im C() {
        return ((im) jm.J0.get()).e();
    }

    public im D() {
        return ((im) jm.K0.get()).e();
    }

    public im E() {
        return ((im) jm.M0.get()).e();
    }

    public im G() {
        return ((im) jm.N0.get()).e();
    }

    public im H() {
        return ((im) jm.O0.get()).e();
    }

    public im g() {
        return ((im) jm.C0.get()).e();
    }

    public im j() {
        return ((im) jm.D0.get()).e();
    }

    public final im m(int i2) {
        switch (wi0.x(i2)) {
            case 0:
                return g();
            case 1:
                return j();
            case 2:
                return v();
            case 3:
                return x();
            case 4:
                return y();
            case 5:
                return z();
            case 6:
                return A();
            case 7:
                return C();
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return D();
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return E();
            case 10:
                return G();
            case 11:
                return H();
            default:
                wg.f();
                return null;
        }
    }

    public im v() {
        return ((im) jm.E0.get()).e();
    }

    public im x() {
        return ((im) jm.F0.get()).e();
    }

    public im y() {
        return ((im) jm.G0.get()).e();
    }

    public im z() {
        return ((im) jm.H0.get()).e();
    }
}
