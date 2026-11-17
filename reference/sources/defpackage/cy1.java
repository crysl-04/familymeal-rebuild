package defpackage;

import android.database.SQLException;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cy1 {
    public static iu0 a;
    public static iu0 b;

    public static final e53 A(h53 h53Var) {
        return h53Var instanceof at0 ? ((at0) h53Var).c() : g80.b;
    }

    public static final float B(sa2 sa2Var) {
        if (sa2Var != null) {
            return sa2Var.a;
        }
        return 0.0f;
    }

    public static final boolean C(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int D(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        wg.m(jp1.h(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final int E(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean F(wg2 wg2Var) {
        rg2 rg2VarK = wg2Var.k();
        return rg2VarK.h.c(ah2.B);
    }

    public static final boolean G(r72 r72Var, r72 r72Var2, r72 r72Var3, int i) {
        if (!H(i, r72Var, r72Var3)) {
            return false;
        }
        if (!H(i, r72Var2, r72Var3) || i(r72Var3, r72Var, r72Var2, i)) {
            return true;
        }
        return !i(r72Var3, r72Var2, r72Var, i) && I(i, r72Var3, r72Var) < I(i, r72Var3, r72Var2);
    }

    public static final boolean H(int i, r72 r72Var, r72 r72Var2) {
        if (i == 3) {
            float f = r72Var2.c;
            float f2 = r72Var2.a;
            float f3 = r72Var.c;
            return (f > f3 || f2 >= f3) && f2 > r72Var.a;
        }
        if (i == 4) {
            float f4 = r72Var2.a;
            float f5 = r72Var2.c;
            float f6 = r72Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < r72Var.c;
        }
        if (i == 5) {
            float f7 = r72Var2.d;
            float f8 = r72Var2.b;
            float f9 = r72Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > r72Var.b;
        }
        if (i != 6) {
            li1.g("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = r72Var2.b;
        float f11 = r72Var2.d;
        float f12 = r72Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < r72Var.d;
    }

    public static final long I(int i, r72 r72Var, r72 r72Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = r72Var.a;
            f2 = r72Var2.c;
        } else if (i == 4) {
            f = r72Var2.a;
            f2 = r72Var.c;
        } else if (i == 5) {
            f = r72Var.b;
            f2 = r72Var2.d;
        } else {
            if (i != 6) {
                li1.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = r72Var2.b;
            f2 = r72Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = r72Var.b;
            f3 = ((r72Var.d - f7) / 2.0f) + f7;
            f4 = r72Var2.b;
            f5 = r72Var2.d;
        } else {
            if (i != 5 && i != 6) {
                li1.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = r72Var.a;
            f3 = ((r72Var.c - f8) / 2.0f) + f8;
            f4 = r72Var2.a;
            f5 = r72Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean J(Object obj) {
        return obj == h7.D;
    }

    public static final boolean K(float f, float f2, l9 l9Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        l9 l9VarA = n9.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            n9.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = l9VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            l9VarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = l9VarA.a;
        RectF rectF2 = l9VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        l9 l9VarA2 = n9.a();
        l9VarA2.e(l9Var, l9VarA, 1);
        boolean zIsEmpty = l9VarA2.a.isEmpty();
        l9VarA2.f();
        l9VarA.f();
        return !zIsEmpty;
    }

    public static final boolean L(kv2 kv2Var, boolean z) {
        t31 t31VarC;
        p81 p81Var = kv2Var.d;
        if (p81Var == null || (t31VarC = p81Var.c()) == null) {
            return false;
        }
        r72 r72VarP = p02.P(t31VarC);
        long j = kv2Var.j(z);
        float f = r72VarP.a;
        float f2 = r72VarP.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = r72VarP.b;
        float f4 = r72VarP.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final boolean M(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final boolean N(int i, qb qbVar, lm0 lm0Var, r72 r72Var) {
        lm0 lm0VarR;
        uj1 uj1Var = new uj1(new lm0[16]);
        if (!lm0Var.h.u) {
            ax0.b("visitChildren called on an unattached node");
        }
        uj1 uj1Var2 = new uj1(new qg1[16]);
        qg1 qg1Var = lm0Var.h;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 == null) {
            cu.q(uj1Var2, qg1Var);
        } else {
            uj1Var2.b(qg1Var2);
        }
        while (true) {
            int i2 = uj1Var2.j;
            if (i2 == 0) {
                break;
            }
            qg1 qg1VarR = (qg1) uj1Var2.k(i2 - 1);
            if ((qg1VarR.k & 1024) == 0) {
                cu.q(uj1Var2, qg1VarR);
            } else {
                while (qg1VarR != null) {
                    if ((qg1VarR.j & 1024) != 0) {
                        uj1 uj1Var3 = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof lm0) {
                                lm0 lm0Var2 = (lm0) qg1VarR;
                                if (lm0Var2.u) {
                                    uj1Var.b(lm0Var2);
                                }
                            } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                int i3 = 0;
                                for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                    if ((qg1Var3.j & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            qg1VarR = qg1Var3;
                                        } else {
                                            if (uj1Var3 == null) {
                                                uj1Var3 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR != null) {
                                                uj1Var3.b(qg1VarR);
                                                qg1VarR = null;
                                            }
                                            uj1Var3.b(qg1Var3);
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var3);
                        }
                        break;
                    }
                    qg1VarR = qg1VarR.m;
                }
            }
        }
        while (uj1Var.j != 0 && (lm0VarR = r(uj1Var, r72Var, i)) != null) {
            if (lm0VarR.L0().a) {
                return ((Boolean) qbVar.h(lm0VarR)).booleanValue();
            }
            if (u(i, qbVar, lm0VarR, r72Var)) {
                return true;
            }
            uj1Var.j(lm0VarR);
        }
        return false;
    }

    public static final Object O(tx2 tx2Var, zp0 zp0Var) throws Throwable {
        Object mwVar;
        Object objU;
        ys.M(tx2Var, true, new nb0(lt.C(tx2Var.k.e()).d(tx2Var.l, tx2Var, tx2Var.j)));
        try {
            if (zp0Var == null) {
                mwVar = ls.b0(zp0Var, tx2Var, tx2Var);
            } else {
                t03.k(2, zp0Var);
                mwVar = zp0Var.f(tx2Var, tx2Var);
            }
        } catch (Throwable th) {
            mwVar = new mw(th, false);
        }
        y20 y20Var = y20.h;
        if (mwVar == y20Var || (objU = tx2Var.U(mwVar)) == ie1.C) {
            return y20Var;
        }
        if (objU instanceof mw) {
            Throwable th2 = ((mw) objU).a;
            if (!(th2 instanceof sx2) || ((sx2) th2).h != tx2Var) {
                throw th2;
            }
            if (mwVar instanceof mw) {
                throw ((mw) mwVar).a;
            }
        } else {
            mwVar = ie1.D(objU);
        }
        return mwVar;
    }

    public static oy0 P(qy0 qy0Var) {
        qy0Var.getClass();
        return new oy0(qy0Var.h, qy0Var.i, qy0Var.j > 0 ? 2 : -2);
    }

    public static final void Q(int i, String str) {
        throw new SQLException(jp1.h(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final Boolean R(int i, qb qbVar, lm0 lm0Var, r72 r72Var) {
        int iOrdinal = lm0Var.O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (lm0VarB == null) {
                    li1.g("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = lm0VarB.O0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolR = R(i, qbVar, lm0VarB, r72Var);
                        if (!uz0.g(boolR, Boolean.FALSE)) {
                            return boolR;
                        }
                        if (r72Var == null) {
                            if (lm0VarB.O0() != km0.i) {
                                li1.g("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            lm0 lm0VarV = ys.v(lm0VarB);
                            if (lm0VarV == null) {
                                li1.g("ActiveParent must have a focusedChild");
                                return null;
                            }
                            r72Var = ys.A(lm0VarV);
                        }
                        return Boolean.valueOf(u(i, qbVar, lm0Var, r72Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            wg.n();
                            return null;
                        }
                        li1.g("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (r72Var == null) {
                    r72Var = ys.A(lm0VarB);
                }
                return Boolean.valueOf(u(i, qbVar, lm0Var, r72Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wg.n();
                    return null;
                }
                if (lm0Var.L0().a) {
                    return (Boolean) qbVar.h(lm0Var);
                }
                return r72Var == null ? Boolean.valueOf(s(lm0Var, i, qbVar)) : Boolean.valueOf(N(i, qbVar, lm0Var, r72Var));
            }
        }
        return Boolean.valueOf(s(lm0Var, i, qbVar));
    }

    public static qy0 S(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new qy0(i, i2 - 1, 1);
        }
        qy0 qy0Var = qy0.k;
        return qy0.k;
    }

    public static final void T(bd bdVar, dd ddVar) {
        ddVar.i.setValue(bdVar.e.getValue());
        id idVar = ddVar.j;
        id idVar2 = bdVar.f;
        int iB = idVar.b();
        for (int i = 0; i < iB; i++) {
            idVar.e(i, idVar2.a(i));
        }
        ddVar.l = bdVar.h;
        ddVar.k = bdVar.g;
        ddVar.m = ((Boolean) bdVar.i.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object U(long j, zp0 zp0Var, n10 n10Var) throws Throwable {
        ux2 ux2Var;
        x72 x72Var;
        if (n10Var instanceof ux2) {
            ux2Var = (ux2) n10Var;
            int i = ux2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ux2Var.m = i - Integer.MIN_VALUE;
            } else {
                ux2Var = new ux2(n10Var);
            }
        } else {
            ux2Var = new ux2(n10Var);
        }
        Object obj = ux2Var.l;
        int i2 = ux2Var.m;
        if (i2 == 0) {
            m02.y(obj);
            if (j > 0) {
                x72 x72Var2 = new x72();
                try {
                    ux2Var.k = x72Var2;
                    ux2Var.m = 1;
                    tx2 tx2Var = new tx2(j, ux2Var);
                    x72Var2.h = tx2Var;
                    Object objO = O(tx2Var, zp0Var);
                    y20 y20Var = y20.h;
                    return objO == y20Var ? y20Var : objO;
                } catch (sx2 e) {
                    e = e;
                    x72Var = x72Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x72Var = ux2Var.k;
        try {
            m02.y(obj);
            return obj;
        } catch (sx2 e2) {
            e = e2;
        }
        if (e.h != x72Var.h) {
            throw e;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    public static final void a(rg1 rg1Var, nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, int i, long j, long j2, m73 m73Var, final nx nxVar5, dr0 dr0Var, final int i2, final int i3) {
        nx nxVar6;
        int i4;
        nx nxVar7;
        int i5;
        int i6;
        int i7;
        final nx nxVar8;
        int i8;
        m73 i23Var;
        int i9;
        boolean z;
        final nx nxVar9;
        final int i10;
        final long j3;
        final nx nxVar10;
        final nx nxVar11;
        final m73 m73Var2;
        final long j4;
        final rg1 rg1Var2;
        e72 e72VarR;
        long j5;
        long jB;
        int i11;
        int i12;
        int i13;
        boolean z2;
        Object objK;
        wj1 wj1Var;
        boolean zF;
        Object objK2;
        dr0Var.W(-1211482744);
        int i14 = i2 | 6;
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                nxVar6 = nxVar;
                i14 |= dr0Var.h(nxVar6) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    nxVar7 = nxVar2;
                    if (dr0Var.h(nxVar7)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i14 |= i5;
                }
                i6 = i14 | 3072;
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        nxVar8 = nxVar4;
                        if (dr0Var.h(nxVar8)) {
                            i8 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                        } else {
                            i8 = 8192;
                        }
                        i6 |= i8;
                    }
                    int i16 = i6 | 4915200;
                    if ((i3 & 256) == 0) {
                        i23Var = m73Var;
                        int i17 = dr0Var.f(i23Var) ? 67108864 : 33554432;
                        i9 = i16 | i17;
                        if ((306783379 & i9) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dr0Var.N(i9 & 1, z)) {
                            dr0Var.S();
                            if ((i2 & 1) != 0 || dr0Var.x()) {
                                if (i15 != 0) {
                                    nxVar10 = xx.a;
                                } else {
                                    nxVar10 = nxVar6;
                                }
                                if (i4 != 0) {
                                    nxVar11 = xx.b;
                                } else {
                                    nxVar11 = nxVar7;
                                }
                                nxVar9 = xx.c;
                                if (i7 != 0) {
                                    nxVar8 = xx.d;
                                }
                                j5 = ((pv) dr0Var.j(rv.a)).n;
                                jB = rv.b(j5, dr0Var);
                                i11 = i9 & (-33030145);
                                i12 = i3 & 256;
                                i13 = 2;
                                og1 og1Var = og1.h;
                                if (i12 != 0) {
                                    WeakHashMap weakHashMap = u83.v;
                                    i11 = i9 & (-267911169);
                                    i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                                }
                                rg1Var2 = og1Var;
                            } else {
                                dr0Var.Q();
                                i11 = i9 & (-33030145);
                                if ((i3 & 256) != 0) {
                                    i11 = i9 & (-267911169);
                                }
                                nxVar9 = nxVar3;
                                i13 = i;
                                j5 = j;
                                jB = j2;
                                nxVar10 = nxVar6;
                                nxVar11 = nxVar7;
                                nxVar8 = nxVar8;
                                rg1Var2 = rg1Var;
                            }
                            dr0Var.q();
                            int i18 = (i11 & 234881024) ^ 100663296;
                            z2 = (i18 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864;
                            objK = dr0Var.K();
                            Object obj = zy.a;
                            if (z2 || objK == obj) {
                                objK = new wj1(i23Var);
                                dr0Var.f0(objK);
                            }
                            wj1Var = (wj1) objK;
                            zF = dr0Var.f(wj1Var) | ((i18 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                            objK2 = dr0Var.K();
                            if (zF || objK2 == obj) {
                                objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                                dr0Var.f0(objK2);
                            }
                            iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                            long j6 = j5;
                            m73Var2 = i23Var;
                            j4 = j6;
                            j3 = jB;
                            i10 = i13;
                        } else {
                            dr0Var.Q();
                            nxVar9 = nxVar3;
                            i10 = i;
                            j3 = j2;
                            nxVar10 = nxVar6;
                            nxVar11 = nxVar7;
                            m73Var2 = i23Var;
                            j4 = j;
                            nxVar8 = nxVar8;
                            rg1Var2 = rg1Var;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: nc2
                                @Override // defpackage.zp0
                                public final Object f(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int iA = m02.A(i2 | 1);
                                    cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj2, iA, i3);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i23Var = m73Var;
                    i9 = i16 | i17;
                    if ((306783379 & i9) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dr0Var.N(i9 & 1, z)) {
                        dr0Var.S();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var2 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap2 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var2;
                        } else {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var3 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap3 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var3;
                        }
                        dr0Var.q();
                        int i19 = (i11 & 234881024) ^ 100663296;
                        if (i19 <= 67108864) {
                        }
                        objK = dr0Var.K();
                        Object obj2 = zy.a;
                        if (z2) {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        } else {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        }
                        wj1Var = (wj1) objK;
                        zF = dr0Var.f(wj1Var) | ((i19 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                        objK2 = dr0Var.K();
                        if (zF) {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        } else {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        }
                        iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                        long j7 = j5;
                        m73Var2 = i23Var;
                        j4 = j7;
                        j3 = jB;
                        i10 = i13;
                    } else {
                        dr0Var.Q();
                        nxVar9 = nxVar3;
                        i10 = i;
                        j3 = j2;
                        nxVar10 = nxVar6;
                        nxVar11 = nxVar7;
                        m73Var2 = i23Var;
                        j4 = j;
                        nxVar8 = nxVar8;
                        rg1Var2 = rg1Var;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: nc2
                            @Override // defpackage.zp0
                            public final Object f(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iA = m02.A(i2 | 1);
                                cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj3, iA, i3);
                                return j23.a;
                            }
                        };
                    }
                }
                i6 = i14 | 27648;
                nxVar8 = nxVar4;
                int i110 = i6 | 4915200;
                if ((i3 & 256) == 0) {
                    i23Var = m73Var;
                    if (dr0Var.f(i23Var)) {
                    }
                    i9 = i110 | i17;
                    if ((306783379 & i9) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dr0Var.N(i9 & 1, z)) {
                        dr0Var.S();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var4 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap4 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var4;
                        } else {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var5 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap5 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var5;
                        }
                        dr0Var.q();
                        int i111 = (i11 & 234881024) ^ 100663296;
                        if (i111 <= 67108864) {
                        }
                        objK = dr0Var.K();
                        Object obj3 = zy.a;
                        if (z2) {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        } else {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        }
                        wj1Var = (wj1) objK;
                        zF = dr0Var.f(wj1Var) | ((i111 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                        objK2 = dr0Var.K();
                        if (zF) {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        } else {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        }
                        iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                        long j8 = j5;
                        m73Var2 = i23Var;
                        j4 = j8;
                        j3 = jB;
                        i10 = i13;
                    } else {
                        dr0Var.Q();
                        nxVar9 = nxVar3;
                        i10 = i;
                        j3 = j2;
                        nxVar10 = nxVar6;
                        nxVar11 = nxVar7;
                        m73Var2 = i23Var;
                        j4 = j;
                        nxVar8 = nxVar8;
                        rg1Var2 = rg1Var;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: nc2
                            @Override // defpackage.zp0
                            public final Object f(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                int iA = m02.A(i2 | 1);
                                cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj4, iA, i3);
                                return j23.a;
                            }
                        };
                    }
                }
                i23Var = m73Var;
                i9 = i110 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var6 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap6 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var6;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var7 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap7 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var7;
                    }
                    dr0Var.q();
                    int i112 = (i11 & 234881024) ^ 100663296;
                    if (i112 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj4 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i112 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j9 = j5;
                    m73Var2 = i23Var;
                    j4 = j9;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj5, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i14 |= 384;
            nxVar7 = nxVar2;
            i6 = i14 | 3072;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    nxVar8 = nxVar4;
                    if (dr0Var.h(nxVar8)) {
                        i8 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                int i113 = i6 | 4915200;
                if ((i3 & 256) == 0) {
                    i23Var = m73Var;
                    if (dr0Var.f(i23Var)) {
                    }
                    i9 = i113 | i17;
                    if ((306783379 & i9) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dr0Var.N(i9 & 1, z)) {
                        dr0Var.S();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var8 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap8 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var8;
                        } else {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var9 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap9 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var9;
                        }
                        dr0Var.q();
                        int i114 = (i11 & 234881024) ^ 100663296;
                        if (i114 <= 67108864) {
                        }
                        objK = dr0Var.K();
                        Object obj5 = zy.a;
                        if (z2) {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        } else {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        }
                        wj1Var = (wj1) objK;
                        zF = dr0Var.f(wj1Var) | ((i114 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                        objK2 = dr0Var.K();
                        if (zF) {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        } else {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        }
                        iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                        long j10 = j5;
                        m73Var2 = i23Var;
                        j4 = j10;
                        j3 = jB;
                        i10 = i13;
                    } else {
                        dr0Var.Q();
                        nxVar9 = nxVar3;
                        i10 = i;
                        j3 = j2;
                        nxVar10 = nxVar6;
                        nxVar11 = nxVar7;
                        m73Var2 = i23Var;
                        j4 = j;
                        nxVar8 = nxVar8;
                        rg1Var2 = rg1Var;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: nc2
                            @Override // defpackage.zp0
                            public final Object f(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int iA = m02.A(i2 | 1);
                                cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj6, iA, i3);
                                return j23.a;
                            }
                        };
                    }
                }
                i23Var = m73Var;
                i9 = i113 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var10 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap10 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var10;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var11 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap11 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var11;
                    }
                    dr0Var.q();
                    int i115 = (i11 & 234881024) ^ 100663296;
                    if (i115 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj6 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i115 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j11 = j5;
                    m73Var2 = i23Var;
                    j4 = j11;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj7, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i6 = i14 | 27648;
            nxVar8 = nxVar4;
            int i116 = i6 | 4915200;
            if ((i3 & 256) == 0) {
                i23Var = m73Var;
                if (dr0Var.f(i23Var)) {
                }
                i9 = i116 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var12 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap12 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var12;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var13 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap13 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var13;
                    }
                    dr0Var.q();
                    int i117 = (i11 & 234881024) ^ 100663296;
                    if (i117 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj7 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i117 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j12 = j5;
                    m73Var2 = i23Var;
                    j4 = j12;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj8, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i23Var = m73Var;
            i9 = i116 | i17;
            if ((306783379 & i9) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i9 & 1, z)) {
                dr0Var.S();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var14 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap14 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var14;
                } else {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var15 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap15 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var15;
                }
                dr0Var.q();
                int i118 = (i11 & 234881024) ^ 100663296;
                if (i118 <= 67108864) {
                }
                objK = dr0Var.K();
                Object obj8 = zy.a;
                if (z2) {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                } else {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                }
                wj1Var = (wj1) objK;
                zF = dr0Var.f(wj1Var) | ((i118 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                objK2 = dr0Var.K();
                if (zF) {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                } else {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                }
                iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                long j13 = j5;
                m73Var2 = i23Var;
                j4 = j13;
                j3 = jB;
                i10 = i13;
            } else {
                dr0Var.Q();
                nxVar9 = nxVar3;
                i10 = i;
                j3 = j2;
                nxVar10 = nxVar6;
                nxVar11 = nxVar7;
                m73Var2 = i23Var;
                j4 = j;
                nxVar8 = nxVar8;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: nc2
                    @Override // defpackage.zp0
                    public final Object f(Object obj9, Object obj10) {
                        ((Integer) obj10).getClass();
                        int iA = m02.A(i2 | 1);
                        cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj9, iA, i3);
                        return j23.a;
                    }
                };
            }
        }
        i14 = i2 | 54;
        nxVar6 = nxVar;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                nxVar7 = nxVar2;
                if (dr0Var.h(nxVar7)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i14 |= i5;
            }
            i6 = i14 | 3072;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    nxVar8 = nxVar4;
                    if (dr0Var.h(nxVar8)) {
                        i8 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                int i119 = i6 | 4915200;
                if ((i3 & 256) == 0) {
                    i23Var = m73Var;
                    if (dr0Var.f(i23Var)) {
                    }
                    i9 = i119 | i17;
                    if ((306783379 & i9) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dr0Var.N(i9 & 1, z)) {
                        dr0Var.S();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var16 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap16 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var16;
                        } else {
                            if (i15 != 0) {
                                nxVar10 = xx.a;
                            } else {
                                nxVar10 = nxVar6;
                            }
                            if (i4 != 0) {
                                nxVar11 = xx.b;
                            } else {
                                nxVar11 = nxVar7;
                            }
                            nxVar9 = xx.c;
                            if (i7 != 0) {
                                nxVar8 = xx.d;
                            }
                            j5 = ((pv) dr0Var.j(rv.a)).n;
                            jB = rv.b(j5, dr0Var);
                            i11 = i9 & (-33030145);
                            i12 = i3 & 256;
                            i13 = 2;
                            og1 og1Var17 = og1.h;
                            if (i12 != 0) {
                                WeakHashMap weakHashMap17 = u83.v;
                                i11 = i9 & (-267911169);
                                i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                            }
                            rg1Var2 = og1Var17;
                        }
                        dr0Var.q();
                        int i1110 = (i11 & 234881024) ^ 100663296;
                        if (i1110 <= 67108864) {
                        }
                        objK = dr0Var.K();
                        Object obj9 = zy.a;
                        if (z2) {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        } else {
                            objK = new wj1(i23Var);
                            dr0Var.f0(objK);
                        }
                        wj1Var = (wj1) objK;
                        zF = dr0Var.f(wj1Var) | ((i1110 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                        objK2 = dr0Var.K();
                        if (zF) {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        } else {
                            objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                            dr0Var.f0(objK2);
                        }
                        iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                        long j14 = j5;
                        m73Var2 = i23Var;
                        j4 = j14;
                        j3 = jB;
                        i10 = i13;
                    } else {
                        dr0Var.Q();
                        nxVar9 = nxVar3;
                        i10 = i;
                        j3 = j2;
                        nxVar10 = nxVar6;
                        nxVar11 = nxVar7;
                        m73Var2 = i23Var;
                        j4 = j;
                        nxVar8 = nxVar8;
                        rg1Var2 = rg1Var;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: nc2
                            @Override // defpackage.zp0
                            public final Object f(Object obj10, Object obj11) {
                                ((Integer) obj11).getClass();
                                int iA = m02.A(i2 | 1);
                                cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj10, iA, i3);
                                return j23.a;
                            }
                        };
                    }
                }
                i23Var = m73Var;
                i9 = i119 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var18 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap18 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var18;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var19 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap19 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var19;
                    }
                    dr0Var.q();
                    int i1111 = (i11 & 234881024) ^ 100663296;
                    if (i1111 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj10 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i1111 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j15 = j5;
                    m73Var2 = i23Var;
                    j4 = j15;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj11, Object obj12) {
                            ((Integer) obj12).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj11, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i6 = i14 | 27648;
            nxVar8 = nxVar4;
            int i1112 = i6 | 4915200;
            if ((i3 & 256) == 0) {
                i23Var = m73Var;
                if (dr0Var.f(i23Var)) {
                }
                i9 = i1112 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var110 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap110 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var110;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var111 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap111 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var111;
                    }
                    dr0Var.q();
                    int i1113 = (i11 & 234881024) ^ 100663296;
                    if (i1113 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj11 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i1113 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j16 = j5;
                    m73Var2 = i23Var;
                    j4 = j16;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj12, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i23Var = m73Var;
            i9 = i1112 | i17;
            if ((306783379 & i9) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i9 & 1, z)) {
                dr0Var.S();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var112 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap112 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var112;
                } else {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var113 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap113 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var113;
                }
                dr0Var.q();
                int i1114 = (i11 & 234881024) ^ 100663296;
                if (i1114 <= 67108864) {
                }
                objK = dr0Var.K();
                Object obj12 = zy.a;
                if (z2) {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                } else {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                }
                wj1Var = (wj1) objK;
                zF = dr0Var.f(wj1Var) | ((i1114 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                objK2 = dr0Var.K();
                if (zF) {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                } else {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                }
                iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                long j17 = j5;
                m73Var2 = i23Var;
                j4 = j17;
                j3 = jB;
                i10 = i13;
            } else {
                dr0Var.Q();
                nxVar9 = nxVar3;
                i10 = i;
                j3 = j2;
                nxVar10 = nxVar6;
                nxVar11 = nxVar7;
                m73Var2 = i23Var;
                j4 = j;
                nxVar8 = nxVar8;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: nc2
                    @Override // defpackage.zp0
                    public final Object f(Object obj13, Object obj14) {
                        ((Integer) obj14).getClass();
                        int iA = m02.A(i2 | 1);
                        cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj13, iA, i3);
                        return j23.a;
                    }
                };
            }
        }
        i14 |= 384;
        nxVar7 = nxVar2;
        i6 = i14 | 3072;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                nxVar8 = nxVar4;
                if (dr0Var.h(nxVar8)) {
                    i8 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            int i1115 = i6 | 4915200;
            if ((i3 & 256) == 0) {
                i23Var = m73Var;
                if (dr0Var.f(i23Var)) {
                }
                i9 = i1115 | i17;
                if ((306783379 & i9) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dr0Var.N(i9 & 1, z)) {
                    dr0Var.S();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var114 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap114 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var114;
                    } else {
                        if (i15 != 0) {
                            nxVar10 = xx.a;
                        } else {
                            nxVar10 = nxVar6;
                        }
                        if (i4 != 0) {
                            nxVar11 = xx.b;
                        } else {
                            nxVar11 = nxVar7;
                        }
                        nxVar9 = xx.c;
                        if (i7 != 0) {
                            nxVar8 = xx.d;
                        }
                        j5 = ((pv) dr0Var.j(rv.a)).n;
                        jB = rv.b(j5, dr0Var);
                        i11 = i9 & (-33030145);
                        i12 = i3 & 256;
                        i13 = 2;
                        og1 og1Var115 = og1.h;
                        if (i12 != 0) {
                            WeakHashMap weakHashMap115 = u83.v;
                            i11 = i9 & (-267911169);
                            i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                        }
                        rg1Var2 = og1Var115;
                    }
                    dr0Var.q();
                    int i1116 = (i11 & 234881024) ^ 100663296;
                    if (i1116 <= 67108864) {
                    }
                    objK = dr0Var.K();
                    Object obj13 = zy.a;
                    if (z2) {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    } else {
                        objK = new wj1(i23Var);
                        dr0Var.f0(objK);
                    }
                    wj1Var = (wj1) objK;
                    zF = dr0Var.f(wj1Var) | ((i1116 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                    objK2 = dr0Var.K();
                    if (zF) {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    } else {
                        objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                        dr0Var.f0(objK2);
                    }
                    iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                    long j18 = j5;
                    m73Var2 = i23Var;
                    j4 = j18;
                    j3 = jB;
                    i10 = i13;
                } else {
                    dr0Var.Q();
                    nxVar9 = nxVar3;
                    i10 = i;
                    j3 = j2;
                    nxVar10 = nxVar6;
                    nxVar11 = nxVar7;
                    m73Var2 = i23Var;
                    j4 = j;
                    nxVar8 = nxVar8;
                    rg1Var2 = rg1Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: nc2
                        @Override // defpackage.zp0
                        public final Object f(Object obj14, Object obj15) {
                            ((Integer) obj15).getClass();
                            int iA = m02.A(i2 | 1);
                            cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj14, iA, i3);
                            return j23.a;
                        }
                    };
                }
            }
            i23Var = m73Var;
            i9 = i1115 | i17;
            if ((306783379 & i9) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i9 & 1, z)) {
                dr0Var.S();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var116 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap116 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var116;
                } else {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var117 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap117 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var117;
                }
                dr0Var.q();
                int i1117 = (i11 & 234881024) ^ 100663296;
                if (i1117 <= 67108864) {
                }
                objK = dr0Var.K();
                Object obj14 = zy.a;
                if (z2) {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                } else {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                }
                wj1Var = (wj1) objK;
                zF = dr0Var.f(wj1Var) | ((i1117 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                objK2 = dr0Var.K();
                if (zF) {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                } else {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                }
                iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                long j19 = j5;
                m73Var2 = i23Var;
                j4 = j19;
                j3 = jB;
                i10 = i13;
            } else {
                dr0Var.Q();
                nxVar9 = nxVar3;
                i10 = i;
                j3 = j2;
                nxVar10 = nxVar6;
                nxVar11 = nxVar7;
                m73Var2 = i23Var;
                j4 = j;
                nxVar8 = nxVar8;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: nc2
                    @Override // defpackage.zp0
                    public final Object f(Object obj15, Object obj16) {
                        ((Integer) obj16).getClass();
                        int iA = m02.A(i2 | 1);
                        cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj15, iA, i3);
                        return j23.a;
                    }
                };
            }
        }
        i6 = i14 | 27648;
        nxVar8 = nxVar4;
        int i1118 = i6 | 4915200;
        if ((i3 & 256) == 0) {
            i23Var = m73Var;
            if (dr0Var.f(i23Var)) {
            }
            i9 = i1118 | i17;
            if ((306783379 & i9) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i9 & 1, z)) {
                dr0Var.S();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var118 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap118 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var118;
                } else {
                    if (i15 != 0) {
                        nxVar10 = xx.a;
                    } else {
                        nxVar10 = nxVar6;
                    }
                    if (i4 != 0) {
                        nxVar11 = xx.b;
                    } else {
                        nxVar11 = nxVar7;
                    }
                    nxVar9 = xx.c;
                    if (i7 != 0) {
                        nxVar8 = xx.d;
                    }
                    j5 = ((pv) dr0Var.j(rv.a)).n;
                    jB = rv.b(j5, dr0Var);
                    i11 = i9 & (-33030145);
                    i12 = i3 & 256;
                    i13 = 2;
                    og1 og1Var119 = og1.h;
                    if (i12 != 0) {
                        WeakHashMap weakHashMap119 = u83.v;
                        i11 = i9 & (-267911169);
                        i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                    }
                    rg1Var2 = og1Var119;
                }
                dr0Var.q();
                int i1119 = (i11 & 234881024) ^ 100663296;
                if (i1119 <= 67108864) {
                }
                objK = dr0Var.K();
                Object obj15 = zy.a;
                if (z2) {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                } else {
                    objK = new wj1(i23Var);
                    dr0Var.f0(objK);
                }
                wj1Var = (wj1) objK;
                zF = dr0Var.f(wj1Var) | ((i1119 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
                objK2 = dr0Var.K();
                if (zF) {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                } else {
                    objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                    dr0Var.f0(objK2);
                }
                iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
                long j110 = j5;
                m73Var2 = i23Var;
                j4 = j110;
                j3 = jB;
                i10 = i13;
            } else {
                dr0Var.Q();
                nxVar9 = nxVar3;
                i10 = i;
                j3 = j2;
                nxVar10 = nxVar6;
                nxVar11 = nxVar7;
                m73Var2 = i23Var;
                j4 = j;
                nxVar8 = nxVar8;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: nc2
                    @Override // defpackage.zp0
                    public final Object f(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        int iA = m02.A(i2 | 1);
                        cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj16, iA, i3);
                        return j23.a;
                    }
                };
            }
        }
        i23Var = m73Var;
        i9 = i1118 | i17;
        if ((306783379 & i9) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (dr0Var.N(i9 & 1, z)) {
            dr0Var.S();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    nxVar10 = xx.a;
                } else {
                    nxVar10 = nxVar6;
                }
                if (i4 != 0) {
                    nxVar11 = xx.b;
                } else {
                    nxVar11 = nxVar7;
                }
                nxVar9 = xx.c;
                if (i7 != 0) {
                    nxVar8 = xx.d;
                }
                j5 = ((pv) dr0Var.j(rv.a)).n;
                jB = rv.b(j5, dr0Var);
                i11 = i9 & (-33030145);
                i12 = i3 & 256;
                i13 = 2;
                og1 og1Var1110 = og1.h;
                if (i12 != 0) {
                    WeakHashMap weakHashMap1110 = u83.v;
                    i11 = i9 & (-267911169);
                    i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                }
                rg1Var2 = og1Var1110;
            } else {
                if (i15 != 0) {
                    nxVar10 = xx.a;
                } else {
                    nxVar10 = nxVar6;
                }
                if (i4 != 0) {
                    nxVar11 = xx.b;
                } else {
                    nxVar11 = nxVar7;
                }
                nxVar9 = xx.c;
                if (i7 != 0) {
                    nxVar8 = xx.d;
                }
                j5 = ((pv) dr0Var.j(rv.a)).n;
                jB = rv.b(j5, dr0Var);
                i11 = i9 & (-33030145);
                i12 = i3 & 256;
                i13 = 2;
                og1 og1Var1111 = og1.h;
                if (i12 != 0) {
                    WeakHashMap weakHashMap1111 = u83.v;
                    i11 = i9 & (-267911169);
                    i23Var = new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b);
                }
                rg1Var2 = og1Var1111;
            }
            dr0Var.q();
            int i11110 = (i11 & 234881024) ^ 100663296;
            if (i11110 <= 67108864) {
            }
            objK = dr0Var.K();
            Object obj16 = zy.a;
            if (z2) {
                objK = new wj1(i23Var);
                dr0Var.f0(objK);
            } else {
                objK = new wj1(i23Var);
                dr0Var.f0(objK);
            }
            wj1Var = (wj1) objK;
            zF = dr0Var.f(wj1Var) | ((i11110 <= 67108864 && dr0Var.f(i23Var)) || (i11 & 100663296) == 67108864);
            objK2 = dr0Var.K();
            if (zF) {
                objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                dr0Var.f0(objK2);
            } else {
                objK2 = new uy1((Object) wj1Var, (Object) i23Var, (byte) 11);
                dr0Var.f0(objK2);
            }
            iq2.a(ie1.s(rg1Var2, (vp0) objK2), null, j5, jB, 0.0f, dt.N(848889571, new rc2(i13, nxVar10, nxVar5, nxVar9, nxVar8, wj1Var, nxVar11), dr0Var), dr0Var, 12582912, 114);
            long j111 = j5;
            m73Var2 = i23Var;
            j4 = j111;
            j3 = jB;
            i10 = i13;
        } else {
            dr0Var.Q();
            nxVar9 = nxVar3;
            i10 = i;
            j3 = j2;
            nxVar10 = nxVar6;
            nxVar11 = nxVar7;
            m73Var2 = i23Var;
            j4 = j;
            nxVar8 = nxVar8;
            rg1Var2 = rg1Var;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: nc2
                @Override // defpackage.zp0
                public final Object f(Object obj17, Object obj18) {
                    ((Integer) obj18).getClass();
                    int iA = m02.A(i2 | 1);
                    cy1.a(rg1Var2, nxVar10, nxVar11, nxVar9, nxVar8, i10, j4, j3, m73Var2, nxVar5, (dr0) obj17, iA, i3);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final int i, final nx nxVar, final nx nxVar2, final nx nxVar3, final nx nxVar4, final m73 m73Var, final nx nxVar5, dr0 dr0Var, final int i2) {
        boolean z;
        dr0Var.W(-280287501);
        int i3 = i2 | (dr0Var.d(i) ? 4 : 2) | (dr0Var.h(nxVar) ? 32 : 16) | (dr0Var.h(nxVar2) ? 256 : 128) | (dr0Var.h(nxVar3) ? 2048 : 1024) | (dr0Var.h(nxVar4) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (dr0Var.f(m73Var) ? 131072 : 65536) | (dr0Var.h(nxVar5) ? 1048576 : 524288);
        if (dr0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (objK == obj) {
                objK = new sc2();
                dr0Var.f0(objK);
            }
            final sc2 sc2Var = (sc2) objK;
            boolean z2 = (i3 & 112) == 32;
            Object objK2 = dr0Var.K();
            if (z2 || objK2 == obj) {
                objK2 = new nx(605195056, true, new v4(nxVar, (byte) 8));
                dr0Var.f0(objK2);
            }
            final zp0 zp0Var = (zp0) objK2;
            boolean z3 = (i3 & 7168) == 2048;
            Object objK3 = dr0Var.K();
            if (z3 || objK3 == obj) {
                objK3 = new nx(418899191, true, new v4(nxVar3, (byte) 7));
                dr0Var.f0(objK3);
            }
            final zp0 zp0Var2 = (zp0) objK3;
            boolean z4 = (57344 & i3) == 16384;
            Object objK4 = dr0Var.K();
            if (z4 || objK4 == obj) {
                objK4 = new nx(338600263, true, new v4(nxVar4, (byte) 6));
                dr0Var.f0(objK4);
            }
            final zp0 zp0Var3 = (zp0) objK4;
            boolean z5 = (i3 & 896) == 256;
            Object objK5 = dr0Var.K();
            if (z5 || objK5 == obj) {
                objK5 = new nx(-1776388365, true, new rl(nxVar2, sc2Var, (byte) 9, false));
                dr0Var.f0(objK5);
            }
            final zp0 zp0Var4 = (zp0) objK5;
            boolean z6 = (i3 & 3670016) == 1048576;
            Object objK6 = dr0Var.K();
            if (z6 || objK6 == obj) {
                z = true;
                Object nxVar6 = new nx(-1731662488, true, new v4(nxVar5, (byte) 5));
                dr0Var.f0(nxVar6);
                objK6 = nxVar6;
            } else {
                z = true;
            }
            final zp0 zp0Var5 = (zp0) objK6;
            boolean zF = ((i3 & 458752) == 131072 ? z : false) | dr0Var.f(zp0Var) | dr0Var.f(zp0Var2) | dr0Var.f(zp0Var3) | ((i3 & 14) == 4) | dr0Var.f(zp0Var5) | dr0Var.f(zp0Var4);
            Object objK7 = dr0Var.K();
            if (zF || objK7 == obj) {
                Object obj2 = new zp0() { // from class: oc2
                    @Override // defpackage.zp0
                    public final Object f(Object obj3, Object obj4) {
                        int iR;
                        int iR2;
                        ji0 ji0Var;
                        Integer numValueOf;
                        int i4;
                        int iIntValue;
                        int iR3;
                        int iA;
                        final ap2 ap2Var = (ap2) obj3;
                        k00 k00Var = (k00) obj4;
                        final int i5 = k00.i(k00Var.a);
                        final int iH = k00.h(k00Var.a);
                        long jB = k00.b(k00Var.a, 0, 0, 0, 0, 10);
                        u31 layoutDirection = ap2Var.getLayoutDirection();
                        final m73 m73Var2 = m73Var;
                        int iD = m73Var2.d(ap2Var, layoutDirection);
                        int iC = m73Var2.c(ap2Var, ap2Var.getLayoutDirection());
                        int iA2 = m73Var2.a(ap2Var);
                        final ny1 ny1VarE = ((ue1) dv.x0(ap2Var.I(zp0Var, tc2.h))).e(jB);
                        int i6 = (-iD) - iC;
                        int i7 = -iA2;
                        final ny1 ny1VarE2 = ((ue1) dv.x0(ap2Var.I(zp0Var2, tc2.j))).e(l00.i(jB, i6, i7));
                        final ny1 ny1VarE3 = ((ue1) dv.x0(ap2Var.I(zp0Var3, tc2.k))).e(l00.i(jB, i6, i7));
                        int i8 = ny1VarE3.h;
                        byte b2 = i;
                        if (i8 == 0 && ny1VarE3.i == 0) {
                            ji0Var = null;
                        } else {
                            int i9 = ny1VarE3.i;
                            u31 u31Var = u31.h;
                            if (b2 == 0) {
                                if (ap2Var.getLayoutDirection() == u31Var) {
                                    iR = ap2Var.R(16.0f);
                                    iR2 = iR + iD;
                                } else {
                                    iR2 = ((i5 - ap2Var.R(16.0f)) - i8) - iC;
                                }
                            } else if (b2 != 2 && b2 != 3) {
                                iR2 = (((i5 - i8) + iD) - iC) / 2;
                            } else if (ap2Var.getLayoutDirection() == u31Var) {
                                iR2 = ((i5 - ap2Var.R(16.0f)) - i8) - iC;
                            } else {
                                iR = ap2Var.R(16.0f);
                                iR2 = iR + iD;
                            }
                            ji0Var = new ji0();
                            ji0Var.a = iR2;
                            ji0Var.b = i9;
                        }
                        final ny1 ny1VarE4 = ((ue1) dv.x0(ap2Var.I(zp0Var5, tc2.l))).e(jB);
                        boolean z7 = ny1VarE4.h == 0 && ny1VarE4.i == 0;
                        if (ji0Var != null) {
                            int i10 = ji0Var.b;
                            if (z7 || b2 == 3) {
                                iR3 = ap2Var.R(16.0f) + i10;
                                iA = m73Var2.a(ap2Var);
                            } else {
                                iR3 = ny1VarE4.i + i10;
                                iA = ap2Var.R(16.0f);
                            }
                            numValueOf = Integer.valueOf(iA + iR3);
                        } else {
                            numValueOf = null;
                        }
                        int i11 = ny1VarE2.i;
                        if (i11 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(ny1VarE4.i);
                                if (z7) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : m73Var2.a(ap2Var);
                            }
                            i4 = i11 + iIntValue;
                        } else {
                            i4 = 0;
                        }
                        wx0 wx0Var = new wx0(m73Var2, ap2Var);
                        final ji0 ji0Var2 = ji0Var;
                        sc2Var.a.setValue(new rt1(t03.o(wx0Var, ap2Var.getLayoutDirection()), (ny1VarE.h == 0 && ny1VarE.i == 0) ? wx0Var.d() : ap2Var.r0(ny1VarE.i), t03.n(wx0Var, ap2Var.getLayoutDirection()), z7 ? wx0Var.c() : ap2Var.r0(ny1VarE4.i)));
                        final ny1 ny1VarE5 = ((ue1) dv.x0(ap2Var.I(zp0Var4, tc2.i))).e(jB);
                        final Integer num = numValueOf;
                        final int i12 = i4;
                        return ap2Var.g0(i5, iH, bg0.h, new vp0() { // from class: qc2
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                my1 my1Var = (my1) obj5;
                                my1.i(my1Var, ny1VarE5, 0, 0);
                                my1.i(my1Var, ny1VarE, 0, 0);
                                ny1 ny1Var = ny1VarE2;
                                int i13 = i5 - ny1Var.h;
                                ap2 ap2Var2 = ap2Var;
                                u31 layoutDirection2 = ap2Var2.getLayoutDirection();
                                m73 m73Var3 = m73Var2;
                                int iD2 = ((m73Var3.d(ap2Var2, layoutDirection2) + i13) - m73Var3.c(ap2Var2, ap2Var2.getLayoutDirection())) / 2;
                                int i14 = iH;
                                my1.i(my1Var, ny1Var, iD2, i14 - i12);
                                ny1 ny1Var2 = ny1VarE4;
                                my1.i(my1Var, ny1Var2, 0, i14 - ny1Var2.i);
                                ji0 ji0Var3 = ji0Var2;
                                if (ji0Var3 != null) {
                                    int i15 = ji0Var3.a;
                                    Integer num2 = num;
                                    num2.getClass();
                                    my1.i(my1Var, ny1VarE3, i15, i14 - num2.intValue());
                                }
                                return j23.a;
                            }
                        });
                    }
                };
                dr0Var.f0(obj2);
                objK7 = obj2;
            }
            tz0.e(null, (zp0) objK7, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(i, nxVar, nxVar2, nxVar3, nxVar4, m73Var, nxVar5, i2) { // from class: pc2
                public final /* synthetic */ byte h;
                public final /* synthetic */ nx i;
                public final /* synthetic */ nx j;
                public final /* synthetic */ nx k;
                public final /* synthetic */ nx l;
                public final /* synthetic */ m73 m;
                public final /* synthetic */ nx n;

                @Override // defpackage.zp0
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = m02.A(1);
                    cy1.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj3, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final u82 u82Var, final kv2 kv2Var, dr0 dr0Var, final int i) {
        kw2 kw2VarD;
        dr0Var.W(-1344558920);
        int i2 = (dr0Var.d(u82Var.ordinal()) ? 32 : 16) | i | (dr0Var.h(kv2Var) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zF = dr0Var.f(kv2Var);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (zF || objK == yyVar) {
                objK = new hv2(kv2Var, z);
                dr0Var.f0(objK);
            }
            zt2 zt2Var = (zt2) objK;
            boolean zH = dr0Var.h(kv2Var);
            Object objK2 = dr0Var.K();
            if (zH || objK2 == yyVar) {
                objK2 = new mv2(kv2Var, z);
                dr0Var.f0(objK2);
            }
            yp1 yp1Var = (yp1) objK2;
            boolean zG = qw2.g(kv2Var.l().b);
            int i3 = (int) (z ? kv2Var.l().b >> 32 : kv2Var.l().b & 4294967295L);
            p81 p81Var = kv2Var.d;
            float fH = 0.0f;
            if (p81Var != null && (kw2VarD = p81Var.d()) != null) {
                jw2 jw2Var = kw2VarD.a;
                if (i3 >= 0) {
                    iw2 iw2Var = jw2Var.a;
                    uh1 uh1Var = jw2Var.b;
                    if (iw2Var.a.i.length() != 0) {
                        int iMin = Math.min(uh1Var.d(i3), Math.min(uh1Var.b - 1, uh1Var.f - 1));
                        if (i3 <= uh1Var.c(iMin, false)) {
                            uh1Var.l(iMin);
                            ArrayList arrayList = uh1Var.h;
                            yt1 yt1Var = (yt1) arrayList.get(ys.x(iMin, arrayList));
                            fH = yt1Var.a.d.h(iMin - yt1Var.d);
                        }
                    }
                }
            }
            float f = fH;
            boolean zH2 = dr0Var.h(zt2Var);
            Object objK3 = dr0Var.K();
            if (zH2 || objK3 == yyVar) {
                objK3 = new i8(zt2Var, (byte) 5);
                dr0Var.f0(objK3);
            }
            h7.Q(yp1Var, z, u82Var, zG, 0L, f, oq2.a(og1.h, zt2Var, (PointerInputEventHandler) objK3), dr0Var, (i2 << 3) & 1008);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(z, u82Var, kv2Var, i) { // from class: lv2
                public final /* synthetic */ boolean h;
                public final /* synthetic */ u82 i;
                public final /* synthetic */ kv2 j;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(7);
                    cy1.c(this.h, this.i, this.j, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010f A[Catch: CancellationException -> 0x0181, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0181, blocks: (B:45:0x00fa, B:47:0x010f), top: B:83:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0143 A[Catch: CancellationException -> 0x0176, TryCatch #6 {CancellationException -> 0x0176, blocks: (B:16:0x003f, B:51:0x0133, B:53:0x0143, B:55:0x014d, B:56:0x015a, B:57:0x015f, B:58:0x0160), top: B:92:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014d A[Catch: CancellationException -> 0x0176, TryCatch #6 {CancellationException -> 0x0176, blocks: (B:16:0x003f, B:51:0x0133, B:53:0x0143, B:55:0x014d, B:56:0x015a, B:57:0x015f, B:58:0x0160), top: B:92:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x015a A[Catch: CancellationException -> 0x0176, TryCatch #6 {CancellationException -> 0x0176, blocks: (B:16:0x003f, B:51:0x0133, B:53:0x0143, B:55:0x014d, B:56:0x015a, B:57:0x015f, B:58:0x0160), top: B:92:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0160 A[Catch: CancellationException -> 0x0176, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0176, blocks: (B:16:0x003f, B:51:0x0133, B:53:0x0143, B:55:0x014d, B:56:0x015a, B:57:0x015f, B:58:0x0160), top: B:92:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object d(defpackage.dd r23, defpackage.xc r24, long r25, final defpackage.vp0 r27, defpackage.n10 r28) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy1.d(dd, xc, long, vp0, n10):java.lang.Object");
    }

    public static Object e(float f, float f2, q03 q03Var, zp0 zp0Var, mq2 mq2Var, int i) {
        cd cdVarY = q03Var;
        if ((i & 8) != 0) {
            cdVarY = uz0.y(0.0f, 0.0f, null, 7);
        }
        cd cdVar = cdVarY;
        s03 s03Var = aa3.Q;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        vp0 vp0Var = s03Var.a;
        id idVarC = (id) vp0Var.h(f5);
        if (idVarC == null) {
            idVarC = ((id) vp0Var.h(f3)).c();
        }
        id idVar = idVarC;
        Object objD = d(new dd(s03Var, f3, idVar, 56), new os2(cdVar, s03Var, f3, f4, idVar), Long.MIN_VALUE, new z61(zp0Var, (byte) 26), mq2Var);
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        if (objD != y20Var) {
            objD = j23Var;
        }
        return objD == y20Var ? objD : j23Var;
    }

    public static final Object f(dd ddVar, u60 u60Var, boolean z, vp0 vp0Var, n10 n10Var) {
        Object objD = d(ddVar, new t60(u60Var, ddVar.h, ddVar.i.getValue(), ddVar.j), z ? ddVar.k : Long.MIN_VALUE, vp0Var, n10Var);
        return objD == y20.h ? objD : j23.a;
    }

    public static final Object g(dd ddVar, Float f, cd cdVar, boolean z, vp0 vp0Var, n10 n10Var) {
        Object objD = d(ddVar, new os2(cdVar, ddVar.h, ddVar.i.getValue(), f, ddVar.j), z ? ddVar.k : Long.MIN_VALUE, vp0Var, n10Var);
        return objD == y20.h ? objD : j23.a;
    }

    public static /* synthetic */ Object h(dd ddVar, Float f, zm2 zm2Var, boolean z, vp0 vp0Var, n10 n10Var, int i) {
        if ((i & 2) != 0) {
            zm2Var = uz0.y(0.0f, 0.0f, null, 7);
        }
        zm2 zm2Var2 = zm2Var;
        if ((i & 8) != 0) {
            vp0Var = new jc2((byte) 27);
        }
        return g(ddVar, f, zm2Var2, z, vp0Var, n10Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r10 <= r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r9 >= r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 <= r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r21 == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r1 >= 0.0f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r21 != 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r21 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r21 != 5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r21 != 6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r11 >= 1.0f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (r1 >= r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        defpackage.li1.g("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        defpackage.li1.g("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r11 >= r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(defpackage.r72 r18, defpackage.r72 r19, defpackage.r72 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = j(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L99
            boolean r0 = j(r3, r1, r0)
            if (r0 == 0) goto L99
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L34
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L95
            goto L48
        L34:
            if (r3 != r15) goto L3b
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L95
            goto L48
        L3b:
            if (r3 != r14) goto L42
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L95
            goto L48
        L42:
            if (r3 != r13) goto L96
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L95
        L48:
            if (r3 == r0) goto L4c
            if (r3 != r15) goto L4d
        L4c:
            return r18
        L4d:
            if (r3 != r0) goto L54
            float r1 = r1.c
            float r1 = r11 - r1
            goto L66
        L54:
            if (r3 != r15) goto L5a
            float r1 = r1.a
            float r1 = r1 - r10
            goto L66
        L5a:
            if (r3 != r14) goto L61
            float r1 = r1.d
            float r1 = r9 - r1
            goto L66
        L61:
            if (r3 != r13) goto L91
            float r1 = r1.b
            float r1 = r1 - r8
        L66:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L6e
            r1 = r16
        L6e:
            if (r3 != r0) goto L72
            float r11 = r11 - r7
            goto L80
        L72:
            if (r3 != r15) goto L77
            float r11 = r2 - r10
            goto L80
        L77:
            if (r3 != r14) goto L7c
            float r11 = r9 - r5
            goto L80
        L7c:
            if (r3 != r13) goto L8d
            float r11 = r6 - r8
        L80:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L87
            r11 = r0
        L87:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8c
            return r18
        L8c:
            return r12
        L8d:
            defpackage.li1.g(r4)
            return r12
        L91:
            defpackage.li1.g(r4)
            return r12
        L95:
            return r18
        L96:
            defpackage.li1.g(r4)
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy1.i(r72, r72, r72, int):boolean");
    }

    public static final boolean j(int i, r72 r72Var, r72 r72Var2) {
        if (i == 3 || i == 4) {
            return r72Var.d > r72Var2.b && r72Var.b < r72Var2.d;
        }
        if (i == 5 || i == 6) {
            return r72Var.c > r72Var2.a && r72Var.a < r72Var2.c;
        }
        li1.g("This function should only be used for 2-D focus search");
        return false;
    }

    public static final int k(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static double l(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float m(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long o(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static final void p(lm0 lm0Var, uj1 uj1Var) {
        if (!lm0Var.h.u) {
            ax0.b("visitChildren called on an unattached node");
        }
        uj1 uj1Var2 = new uj1(new qg1[16]);
        qg1 qg1Var = lm0Var.h;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 == null) {
            cu.q(uj1Var2, qg1Var);
        } else {
            uj1Var2.b(qg1Var2);
        }
        while (true) {
            int i = uj1Var2.j;
            if (i == 0) {
                return;
            }
            qg1 qg1VarR = (qg1) uj1Var2.k(i - 1);
            if ((qg1VarR.k & 1024) == 0) {
                cu.q(uj1Var2, qg1VarR);
            } else {
                while (qg1VarR != null) {
                    if ((qg1VarR.j & 1024) != 0) {
                        uj1 uj1Var3 = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof lm0) {
                                lm0 lm0Var2 = (lm0) qg1VarR;
                                if (lm0Var2.u && !cu.Y(lm0Var2).U) {
                                    if (lm0Var2.L0().a) {
                                        uj1Var.b(lm0Var2);
                                    } else {
                                        p(lm0Var2, uj1Var);
                                    }
                                }
                            } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                int i2 = 0;
                                for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                    if ((qg1Var3.j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            qg1VarR = qg1Var3;
                                        } else {
                                            if (uj1Var3 == null) {
                                                uj1Var3 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR != null) {
                                                uj1Var3.b(qg1VarR);
                                                qg1VarR = null;
                                            }
                                            uj1Var3.b(qg1Var3);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var3);
                        }
                        break;
                    }
                    qg1VarR = qg1VarR.m;
                }
            }
        }
    }

    public static final void q(bd bdVar, long j, float f, xc xcVar, dd ddVar, vp0 vp0Var) {
        long jC = f == 0.0f ? xcVar.c() : (long) ((j - bdVar.c) / f);
        bdVar.g = j;
        bdVar.e.setValue(xcVar.b(jC));
        bdVar.f = xcVar.f(jC);
        if (xcVar.g(jC)) {
            bdVar.h = bdVar.g;
            bdVar.i.setValue(Boolean.FALSE);
        }
        T(bdVar, ddVar);
        vp0Var.h(bdVar);
    }

    public static final lm0 r(uj1 uj1Var, r72 r72Var, int i) {
        r72 r72VarH;
        lm0 lm0Var = null;
        if (i == 3) {
            r72VarH = r72Var.h((r72Var.c - r72Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            r72VarH = r72Var.h(-((r72Var.c - r72Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            r72VarH = r72Var.h(0.0f, (r72Var.d - r72Var.b) + 1.0f);
        } else {
            if (i != 6) {
                li1.g("This function should only be used for 2-D focus search");
                return null;
            }
            r72VarH = r72Var.h(0.0f, -((r72Var.d - r72Var.b) + 1.0f));
        }
        Object[] objArr = uj1Var.h;
        int i2 = uj1Var.j;
        for (int i3 = 0; i3 < i2; i3++) {
            lm0 lm0Var2 = (lm0) objArr[i3];
            if (ys.P(lm0Var2)) {
                r72 r72VarA = ys.A(lm0Var2);
                if (G(r72VarA, r72VarH, r72Var, i)) {
                    lm0Var = lm0Var2;
                    r72VarH = r72VarA;
                }
            }
        }
        return lm0Var;
    }

    public static final boolean s(lm0 lm0Var, int i, vp0 vp0Var) {
        r72 r72Var;
        uj1 uj1Var = new uj1(new lm0[16]);
        p(lm0Var, uj1Var);
        int i2 = uj1Var.j;
        if (i2 <= 1) {
            lm0 lm0Var2 = (lm0) (i2 == 0 ? null : uj1Var.h[0]);
            if (lm0Var2 != null) {
                return ((Boolean) vp0Var.h(lm0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                r72 r72VarA = ys.A(lm0Var);
                float f = r72VarA.a;
                float f2 = r72VarA.b;
                r72Var = new r72(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    li1.g("This function should only be used for 2-D focus search");
                    return false;
                }
                r72 r72VarA2 = ys.A(lm0Var);
                float f3 = r72VarA2.c;
                float f4 = r72VarA2.d;
                r72Var = new r72(f3, f4, f3, f4);
            }
            lm0 lm0VarR = r(uj1Var, r72Var, i);
            if (lm0VarR != null) {
                return ((Boolean) vp0Var.h(lm0VarR)).booleanValue();
            }
        }
        return false;
    }

    public static final void t(i12 i12Var, hz hzVar, String str) {
        hzVar.t().getClass();
        uz0.z(null, str);
        throw null;
    }

    public static final boolean u(int i, qb qbVar, lm0 lm0Var, r72 r72Var) {
        if (N(i, qbVar, lm0Var, r72Var)) {
            return true;
        }
        Boolean bool = (Boolean) ie1.A(lm0Var, i, new qq1(((em0) cu.Z(lm0Var).getFocusOwner()).f(), lm0Var, r72Var, i, qbVar, (byte) 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float v(o20 o20Var) {
        zg1 zg1Var = (zg1) o20Var.m(c5.d0);
        float fU = zg1Var != null ? zg1Var.u() : 1.0f;
        if (fU >= 0.0f) {
            return fU;
        }
        y12.b("negative scale factor");
        return fU;
    }

    public static final iu0 w() {
        iu0 iu0Var = b;
        if (iu0Var != null) {
            return iu0Var;
        }
        hu0 hu0Var = new hu0("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = k33.a;
        rl2 rl2Var = new rl2(kv.b);
        xl1 xl1Var = new xl1((byte) 3);
        xl1Var.A(17.65f, 6.35f);
        xl1Var.r(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        xl1Var.s(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        xl1Var.D(3.57f, 8.0f, 7.99f, 8.0f);
        xl1Var.s(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        xl1Var.x(-2.08f);
        xl1Var.s(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        xl1Var.s(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        xl1Var.D(2.69f, -6.0f, 6.0f, -6.0f);
        xl1Var.s(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        xl1Var.y(13.0f, 11.0f);
        xl1Var.x(7.0f);
        xl1Var.H(4.0f);
        xl1Var.z(-2.35f, 2.35f);
        xl1Var.m();
        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
        iu0 iu0VarB = hu0Var.b();
        b = iu0VarB;
        return iu0VarB;
    }

    public static final sa2 x(ue1 ue1Var) {
        Object objL = ue1Var.l();
        if (objL instanceof sa2) {
            return (sa2) objL;
        }
        return null;
    }

    public static final qf2 y(Object obj) {
        if (obj != h7.D) {
            return (qf2) obj;
        }
        li1.g("Does not contain segment");
        return null;
    }

    public static final e30 z(h53 h53Var) {
        return h53Var instanceof at0 ? ((at0) h53Var).d() : c30.b;
    }
}
