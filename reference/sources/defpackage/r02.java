package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r02 {
    public static final void A(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ax0.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fO = o(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fO);
                }
            }
            float fSqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : o(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fO2 = o(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fO2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fO2 / fArr11[i14];
        }
    }

    public static final long B(z02 z02Var, boolean z) {
        long jD = up1.d(z02Var.c, z02Var.g);
        if (z || !z02Var.c()) {
            return jD;
        }
        return 0L;
    }

    public static Set C(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final Object D(ld2 ld2Var, ld2 ld2Var2, zp0 zp0Var) throws Throwable {
        Object mwVar;
        Object objU;
        try {
            t03.k(2, zp0Var);
            mwVar = zp0Var.f(ld2Var2, ld2Var);
        } catch (Throwable th) {
            mwVar = new mw(th, false);
        }
        y20 y20Var = y20.h;
        if (mwVar == y20Var || (objU = ld2Var.U(mwVar)) == ie1.C) {
            return y20Var;
        }
        if (objU instanceof mw) {
            throw ((mw) objU).a;
        }
        return ie1.D(objU);
    }

    public static final int E(ri1 ri1Var) {
        int iC;
        int i = ri1Var.b;
        int iC2 = ri1Var.c(0);
        while (ri1Var.b != 0 && ri1Var.c(0) == iC2) {
            ri1Var.f(0, ri1Var.d());
            ri1Var.e(ri1Var.b - 1);
            int i2 = ri1Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = ri1Var.c(i4);
                int i5 = (i4 + 1) << 1;
                int i6 = i5 - 1;
                int iC4 = ri1Var.c(i6);
                if (i5 < i2 && (iC = ri1Var.c(i5)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    ri1Var.f(i4, iC);
                    ri1Var.f(i5, iC3);
                    i4 = i5;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    ri1Var.f(i4, iC4);
                    ri1Var.f(i6, iC3);
                    i4 = i6;
                }
            }
        }
        return iC2;
    }

    public static final ExtractedText F(vv2 vv2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = vv2Var.a.i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = vv2Var.b;
        extractedText.selectionStart = qw2.f(j);
        extractedText.selectionEnd = qw2.e(j);
        extractedText.flags = !co2.R(vv2Var.a.i, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void G(wg2 wg2Var, int i, nd2 nd2Var) {
        uj1 uj1Var = new uj1(new wg2[16]);
        List listI = wg2Var.i(false, false);
        while (true) {
            uj1Var.d(uj1Var.j, listI);
            while (true) {
                int i2 = uj1Var.j;
                if (i2 == 0) {
                    return;
                }
                wg2 wg2Var2 = (wg2) uj1Var.k(i2 - 1);
                boolean z = aa3.z(wg2Var2);
                rg2 rg2Var = wg2Var2.d;
                mj1 mj1Var = rg2Var.h;
                if (!z && !mj1Var.c(ah2.j)) {
                    pn1 pn1VarD = wg2Var2.d();
                    if (pn1VarD == null) {
                        throw wi0.e("Expected semantics node to have a coordinator.");
                    }
                    ry0 ry0VarA0 = cu.a0(es.s(pn1VarD, true));
                    if (ry0VarA0.a < ry0VarA0.c && ry0VarA0.b < ry0VarA0.d) {
                        Object objG = rg2Var.h.g(qg2.e);
                        if (objG == null) {
                            objG = null;
                        }
                        zp0 zp0Var = (zp0) objG;
                        Object objG2 = mj1Var.g(ah2.w);
                        md2 md2Var = (md2) (objG2 != null ? objG2 : null);
                        if (zp0Var == null || md2Var == null || ((Number) md2Var.b.a()).floatValue() <= 0.0f) {
                            listI = wg2Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            nd2Var.h(new pd2(wg2Var2, i3, ry0VarA0, pn1VarD));
                            G(wg2Var2, i3, nd2Var);
                        }
                    }
                }
            }
        }
    }

    public static final void a(int i, rg1 rg1Var, long j, long j2, nx nxVar, nx nxVar2, nx nxVar3, dr0 dr0Var, int i2) {
        rg1 rg1Var2;
        long j3;
        long j4;
        nx nxVar4;
        nx nxVar5;
        dr0Var.W(-1012974221);
        int i3 = i2 | (dr0Var.d(i) ? 4 : 2) | 222384;
        if (dr0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                long jD = rv.d(p22.d, dr0Var);
                long jD2 = rv.d(p22.f, dr0Var);
                nx nxVarN = dt.N(1338273762, new tr2(i), dr0Var);
                nxVar5 = zx.a;
                j4 = jD2;
                j3 = jD;
                rg1Var2 = og1.h;
                nxVar4 = nxVarN;
            } else {
                dr0Var.Q();
                rg1Var2 = rg1Var;
                j3 = j;
                j4 = j2;
                nxVar4 = nxVar;
                nxVar5 = nxVar2;
            }
            dr0Var.q();
            b(rg1Var2, j3, j4, nxVar4, nxVar5, nxVar3, dr0Var, 224262);
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            j3 = j;
            j4 = j2;
            nxVar4 = nxVar;
            nxVar5 = nxVar2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new sr2(i, rg1Var2, j3, j4, nxVar4, nxVar5, nxVar3, i2);
        }
    }

    public static final void b(rg1 rg1Var, long j, long j2, nx nxVar, nx nxVar2, nx nxVar3, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(1955286154);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(nxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.h(nxVar2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.h(nxVar3) ? 131072 : 65536;
        }
        byte b = 0;
        if (dr0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            iq2.a(tg2.a(rg1Var, false, new jc2((byte) 20)), null, j, j2, 0.0f, dt.N(830280655, new wr2(nxVar3, nxVar2, nxVar, b), dr0Var), dr0Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new sr2(rg1Var, j, j2, nxVar, nxVar2, nxVar3, i);
        }
    }

    public static final void c(ri1 ri1Var, int i) {
        if (ri1Var.b == 0 || !(ri1Var.c(0) == i || ri1Var.c(ri1Var.b - 1) == i)) {
            int i2 = ri1Var.b;
            ri1Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = ri1Var.c(i3);
                if (i <= iC) {
                    break;
                }
                ri1Var.f(i2, iC);
                i2 = i3;
            }
            ri1Var.f(i2, i);
        }
    }

    public static final void d(xl1 xl1Var, z02 z02Var) {
        id1 id1Var = (id1) xl1Var.i;
        c43 c43Var = id1Var.b;
        c43 c43Var2 = id1Var.a;
        boolean zK = k(z02Var);
        long j = z02Var.b;
        if (zK) {
            f40[] f40VarArr = c43Var2.d;
            Arrays.fill(f40VarArr, 0, f40VarArr.length, (Object) null);
            c43Var2.e = 0;
            f40[] f40VarArr2 = c43Var.d;
            Arrays.fill(f40VarArr2, 0, f40VarArr2.length, (Object) null);
            c43Var.e = 0;
            id1Var.c = 0L;
        }
        if (!m(z02Var)) {
            List listB = z02Var.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                ft0 ft0Var = (ft0) listB.get(i);
                id1Var.a(ft0Var.a, up1.e(ft0Var.e, 0L));
            }
            id1Var.a(j, up1.e(z02Var.n, 0L));
        }
        if (m(z02Var) && j - id1Var.c > 40) {
            f40[] f40VarArr3 = c43Var2.d;
            Arrays.fill(f40VarArr3, 0, f40VarArr3.length, (Object) null);
            c43Var2.e = 0;
            f40[] f40VarArr4 = c43Var.d;
            Arrays.fill(f40VarArr4, 0, f40VarArr4.length, (Object) null);
            c43Var.e = 0;
            id1Var.c = 0L;
        }
        id1Var.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(w71 w71Var, float f, dd ddVar, u60 u60Var, lk2 lk2Var, n10 n10Var) {
        rk2 rk2Var;
        float f2;
        u72 u72Var;
        if (n10Var instanceof rk2) {
            rk2Var = (rk2) n10Var;
            int i = rk2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rk2Var.o = i - Integer.MIN_VALUE;
            } else {
                rk2Var = new rk2(n10Var);
            }
        } else {
            rk2Var = new rk2(n10Var);
        }
        Object obj = rk2Var.n;
        int i2 = rk2Var.o;
        if (i2 == 0) {
            m02.y(obj);
            u72 u72Var2 = new u72();
            boolean z = ((Number) ddVar.a()).floatValue() == 0.0f;
            qk2 qk2Var = new qk2(f, u72Var2, w71Var, lk2Var, (byte) 0);
            rk2Var.l = ddVar;
            rk2Var.m = u72Var2;
            rk2Var.k = f;
            rk2Var.o = 1;
            Object objF = cy1.f(ddVar, u60Var, !z, qk2Var, rk2Var);
            y20 y20Var = y20.h;
            if (objF == y20Var) {
                return y20Var;
            }
            f2 = f;
            u72Var = u72Var2;
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = rk2Var.k;
            u72Var = rk2Var.m;
            ddVar = rk2Var.l;
            m02.y(obj);
        }
        return new zc(new Float(f2 - u72Var.h), ddVar);
    }

    public static final void f(bd bdVar, w71 w71Var, lk2 lk2Var, float f) {
        float fA;
        try {
            fA = w71Var.a(f);
        } catch (CancellationException unused) {
            bdVar.a();
            fA = 0.0f;
        }
        lk2Var.h(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            bdVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object g(w71 w71Var, float f, float f2, dd ddVar, zm2 zm2Var, vp0 vp0Var, n10 n10Var) {
        sk2 sk2Var;
        float fFloatValue;
        dd ddVar2;
        u72 u72Var;
        float f3 = f;
        if (n10Var instanceof sk2) {
            sk2Var = (sk2) n10Var;
            int i = sk2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk2Var.p = i - Integer.MIN_VALUE;
            } else {
                sk2Var = new sk2(n10Var);
            }
        } else {
            sk2Var = new sk2(n10Var);
        }
        sk2 sk2Var2 = sk2Var;
        Object obj = sk2Var2.o;
        int i2 = sk2Var2.p;
        if (i2 == 0) {
            m02.y(obj);
            u72 u72Var2 = new u72();
            fFloatValue = ((Number) ddVar.a()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) ddVar.a()).floatValue() == 0.0f;
            qk2 qk2Var = new qk2(f2, u72Var2, w71Var, vp0Var, (byte) 1);
            sk2Var2.m = ddVar;
            sk2Var2.n = u72Var2;
            sk2Var2.k = f3;
            sk2Var2.l = fFloatValue;
            sk2Var2.p = 1;
            Object objG = cy1.g(ddVar, f4, zm2Var, !z, qk2Var, sk2Var2);
            y20 y20Var = y20.h;
            if (objG == y20Var) {
                return y20Var;
            }
            ddVar2 = ddVar;
            u72Var = u72Var2;
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = sk2Var2.l;
            float f6 = sk2Var2.k;
            u72Var = sk2Var2.n;
            ddVar2 = sk2Var2.m;
            m02.y(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new zc(new Float(f3 - u72Var.h), ie1.k(ddVar2, 0.0f, n(((Number) ddVar2.a()).floatValue(), fFloatValue), 29));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:21:0x0050->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object h(defpackage.sq2 r6, defpackage.rk r7) {
        /*
            boolean r0 = r7 instanceof defpackage.t92
            if (r0 == 0) goto L13
            r0 = r7
            t92 r0 = (defpackage.t92) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            t92 r0 = new t92
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
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L61
            java.lang.Object r5 = r7.get(r4)
            z02 r5 = (defpackage.z02) r5
            boolean r5 = j(r5)
            if (r5 == 0) goto L31
            int r4 = r4 + 1
            goto L50
        L61:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r02.h(sq2, rk):java.lang.Object");
    }

    public static yh2 i(yh2 yh2Var) {
        wd1 wd1Var = yh2Var.h;
        wd1Var.b();
        return wd1Var.p > 0 ? yh2Var : yh2.i;
    }

    public static final boolean j(z02 z02Var) {
        return (z02Var.c() || z02Var.h || !z02Var.d) ? false : true;
    }

    public static final boolean k(z02 z02Var) {
        return !z02Var.h && z02Var.d;
    }

    public static final boolean l(z02 z02Var) {
        return (z02Var.c() || !z02Var.h || z02Var.d) ? false : true;
    }

    public static final boolean m(z02 z02Var) {
        return z02Var.h && !z02Var.d;
    }

    public static final float n(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final Object p(j12 j12Var, String str, n10 n10Var) {
        Object objB = j12Var.b(str, new ss2((byte) 15), n10Var);
        return objB == y20.h ? objB : j23.a;
    }

    public static final h53 q(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            h53 h53Var = tag instanceof h53 ? (h53) tag : null;
            if (h53Var != null) {
                return h53Var;
            }
            Object objP = rz1.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final Object r(rg2 rg2Var, ch2 ch2Var) {
        Object objG = rg2Var.h.g(ch2Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final long s(double d) {
        return z((float) d, 4294967296L);
    }

    public static final long t(int i) {
        return z(i, 4294967296L);
    }

    public static final int u(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            sQLiteStatementPrepare.step();
            int i = (int) sQLiteStatementPrepare.getLong(0);
            ie1.j(sQLiteStatementPrepare, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final boolean v(int i, KeyEvent keyEvent) {
        return ((int) (ys.F(keyEvent) >> 32)) == i;
    }

    public static final boolean w(z02 z02Var, long j, long j2) {
        int i = z02Var.i == 1 ? 1 : 0;
        long j3 = z02Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat > f2) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4);
    }

    public static boolean x(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void y(String str) {
        throw new IllegalArgumentException(wi0.h("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final long z(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        bx2[] bx2VarArr = ax2.b;
        return jFloatToRawIntBits;
    }
}
