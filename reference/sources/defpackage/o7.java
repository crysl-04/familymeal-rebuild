package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o7 implements m70, View.OnAttachStateChangeListener {
    public final t6 h;
    public final o6 i;
    public ix0 j;
    public final ArrayList k = new ArrayList();
    public k7 l = k7.h;
    public boolean m = true;
    public final fp n = ls.a(1, 6, null);
    public si1 o;
    public long p;
    public final si1 q;
    public xg2 r;
    public boolean s;
    public final t t;

    public o7(t6 t6Var, o6 o6Var) {
        this.h = t6Var;
        this.i = o6Var;
        new Handler(Looper.getMainLooper());
        si1 si1Var = my0.a;
        si1Var.getClass();
        this.o = si1Var;
        this.q = new si1();
        this.r = new xg2(t6Var.getSemanticsOwner().a(), si1Var);
        this.t = new t(this, (byte) 3);
    }

    @Override // defpackage.m70
    public final void a(e91 e91Var) {
        l(this.h.getSemanticsOwner().a());
        i();
        this.j = null;
    }

    @Override // defpackage.m70
    public final void b(e91 e91Var) {
        this.j = (ix0) this.i.a();
        k(-1, this.h.getSemanticsOwner().a());
        i();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (defpackage.lt.r(100, r0) == r4) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.n10 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.n7
            if (r0 == 0) goto L13
            r0 = r9
            n7 r0 = (defpackage.n7) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            n7 r0 = new n7
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.l
            int r1 = r0.n
            r2 = 2
            r3 = 1
            y20 r4 = defpackage.y20.h
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            ep r1 = r0.k
            defpackage.m02.y(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r8)
            r8 = 0
            return r8
        L34:
            ep r1 = r0.k
            defpackage.m02.y(r9)
            goto L51
        L3a:
            defpackage.m02.y(r9)
            ep r9 = new ep
            fp r1 = r8.n
            r9.<init>(r1)
        L44:
            r0.k = r9
            r0.n = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 == r4) goto L84
            r7 = r1
            r1 = r9
            r9 = r7
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r1.c()
            boolean r9 = r8.h()
            if (r9 == 0) goto L65
            r8.i()
        L65:
            t6 r9 = r8.h
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.s
            if (r5 != 0) goto L78
            if (r9 == 0) goto L78
            r8.s = r3
            t r5 = r8.t
            r9.post(r5)
        L78:
            r0.k = r1
            r0.n = r2
            r5 = 100
            java.lang.Object r9 = defpackage.lt.r(r5, r0)
            if (r9 != r4) goto L2b
        L84:
            return r4
        L85:
            j23 r8 = defpackage.j23.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.d(n10):java.lang.Object");
    }

    public final void f(ly0 ly0Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        xg2 xg2Var;
        int i3;
        String str;
        long j3;
        String str2;
        ly0 ly0Var2 = ly0Var;
        int[] iArr3 = ly0Var2.b;
        long[] jArr4 = ly0Var2.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c = c2;
                        xg2 xg2Var2 = (xg2) this.q.b(i8);
                        yg2 yg2Var = (yg2) ly0Var2.b(i8);
                        wg2 wg2Var = yg2Var != null ? yg2Var.a : null;
                        if (wg2Var == null) {
                            throw wi0.e("no value for specified key");
                        }
                        j2 = j5;
                        int i9 = wg2Var.f;
                        mj1 mj1Var = wg2Var.d.h;
                        String str3 = "Invalid content capture ID";
                        if (xg2Var2 != null) {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j = j4;
                            i = i7;
                            Object[] objArr = mj1Var.b;
                            long[] jArr5 = mj1Var.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j6 = jArr5[i10];
                                    Object[] objArr2 = objArr;
                                    long[] jArr6 = jArr5;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                ch2 ch2Var = (ch2) objArr2[(i10 << 3) + i12];
                                                i3 = i12;
                                                ch2 ch2Var2 = ah2.C;
                                                if (uz0.g(ch2Var, ch2Var2)) {
                                                    Object objG = xg2Var2.a.h.g(ch2Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    od odVar = list != null ? (od) dv.y0(list) : null;
                                                    Object objG2 = mj1Var.g(ch2Var2);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    od odVar2 = list2 != null ? (od) dv.y0(list2) : null;
                                                    if (!uz0.g(odVar, odVar2)) {
                                                        String strValueOf = String.valueOf(odVar2);
                                                        ix0 ix0Var = this.j;
                                                        if (ix0Var != null) {
                                                            AutofillId autofillIdJ = ix0Var.J(i9);
                                                            if (autofillIdJ == null) {
                                                                throw wi0.e("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) ix0Var.j).notifyViewTextChanged(autofillIdJ, strValueOf);
                                                        }
                                                    }
                                                }
                                                j6 >>= 8;
                                                i12 = i3 + 1;
                                                xg2Var2 = xg2Var2;
                                                jArr6 = jArr6;
                                            } else {
                                                i3 = i12;
                                            }
                                            j6 >>= 8;
                                            i12 = i3 + 1;
                                            xg2Var2 = xg2Var2;
                                            jArr6 = jArr6;
                                        }
                                        jArr3 = jArr6;
                                        xg2Var = xg2Var2;
                                        if (i11 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        xg2Var = xg2Var2;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    objArr = objArr2;
                                    xg2Var2 = xg2Var;
                                    jArr5 = jArr3;
                                }
                            }
                        } else {
                            Object[] objArr3 = mj1Var.b;
                            long[] jArr7 = mj1Var.a;
                            int i13 = i5;
                            int length3 = jArr7.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j7 = jArr7[i14];
                                    j = j4;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j7 & 255) < 128) {
                                                j3 = j7;
                                                ch2 ch2Var3 = (ch2) objArr3[(i14 << 3) + i16];
                                                ch2 ch2Var4 = ah2.C;
                                                if (uz0.g(ch2Var3, ch2Var4)) {
                                                    Object objG3 = mj1Var.g(ch2Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    String strValueOf2 = String.valueOf(list3 != null ? (od) dv.y0(list3) : null);
                                                    ix0 ix0Var2 = this.j;
                                                    if (ix0Var2 != null) {
                                                        str2 = str3;
                                                        AutofillId autofillIdJ2 = ix0Var2.J(i9);
                                                        if (autofillIdJ2 == null) {
                                                            throw wi0.e(str2);
                                                        }
                                                        ((ContentCaptureSession) ix0Var2.j).notifyViewTextChanged(autofillIdJ2, strValueOf2);
                                                    }
                                                }
                                                j7 = j3 >> i13;
                                                i16++;
                                                i7 = i7;
                                                str3 = str2;
                                            } else {
                                                j3 = j7;
                                            }
                                            str2 = str3;
                                            j7 = j3 >> i13;
                                            i16++;
                                            i7 = i7;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i7;
                                        if (i15 != i13) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i7;
                                    }
                                    if (i14 == length3) {
                                        break;
                                    }
                                    i14++;
                                    j4 = j;
                                    i7 = i;
                                    str3 = str;
                                    i13 = 8;
                                }
                            } else {
                                j = j4;
                                i = i7;
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i7;
                        i2 = i5;
                    }
                    j4 = j >> i2;
                    i7 = i + 1;
                    ly0Var2 = ly0Var;
                    i5 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            ly0Var2 = ly0Var;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    public final ly0 g() {
        if (this.m) {
            this.m = false;
            this.o = aa3.p(this.h.getSemanticsOwner(), new s0((byte) 6));
            this.p = System.currentTimeMillis();
        }
        return this.o;
    }

    public final boolean h() {
        return this.j != null;
    }

    public final void i() {
        ix0 ix0Var = this.j;
        if (ix0Var != null) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) ix0Var.j;
            ArrayList arrayList = this.k;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q00 q00Var = (q00) arrayList.get(i);
                int iOrdinal = q00Var.c.ordinal();
                if (iOrdinal == 0) {
                    xl1 xl1Var = q00Var.d;
                    if (xl1Var != null) {
                        contentCaptureSession.notifyViewAppeared((ViewStructure) xl1Var.i);
                    }
                } else if (iOrdinal != 1) {
                    wg.n();
                    return;
                } else {
                    AutofillId autofillIdJ = ix0Var.J(q00Var.a);
                    if (autofillIdJ != null) {
                        contentCaptureSession.notifyViewDisappeared(autofillIdJ);
                    }
                }
            }
            contentCaptureSession.notifyViewsDisappeared(((View) ix0Var.i).getAutofillId(), new long[]{Long.MIN_VALUE});
            arrayList.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(wg2 wg2Var, xg2 xg2Var) {
        j7 j7Var = new j7(xg2Var, this, 0 == true ? 1 : 0);
        wg2Var.getClass();
        List listJ = wg2.j(4, wg2Var);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (g().a(((wg2) obj).f)) {
                j7Var.f(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = wg2.j(4, wg2Var);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            wg2 wg2Var2 = (wg2) listJ2.get(i3);
            ly0 ly0VarG = g();
            int i4 = wg2Var2.f;
            if (ly0VarG.a(i4)) {
                si1 si1Var = this.q;
                if (si1Var.a(i4)) {
                    Object objB = si1Var.b(i4);
                    if (objB == null) {
                        throw wi0.e("node not present in pruned tree before this change");
                    }
                    j(wg2Var2, (xg2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    public final void k(int i, wg2 wg2Var) {
        vp0 vp0Var;
        xl1 xl1Var;
        r72 r72VarA;
        String strD;
        vp0 vp0Var2;
        if (h()) {
            mj1 mj1Var = wg2Var.d.h;
            Object objG = mj1Var.g(ah2.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.l == k7.h && uz0.g(bool, Boolean.TRUE)) {
                Object objG2 = mj1Var.g(qg2.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                m1 m1Var = (m1) objG2;
                if (m1Var != null && (vp0Var2 = (vp0) m1Var.b) != null) {
                }
            } else if (this.l == k7.i && uz0.g(bool, Boolean.FALSE)) {
                Object objG3 = mj1Var.g(qg2.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                m1 m1Var2 = (m1) objG3;
                if (m1Var2 != null && (vp0Var = (vp0) m1Var2.b) != null) {
                }
            }
            int i2 = wg2Var.f;
            ix0 ix0Var = this.j;
            if (ix0Var != null) {
                AutofillId autofillId = this.h.getAutofillId();
                wg2 wg2VarL = wg2Var.l();
                int i3 = wg2Var.f;
                if (wg2VarL == null || (autofillId = ix0Var.J(wg2VarL.f)) != null) {
                    ViewStructure viewStructureNewVirtualViewStructure = ((ContentCaptureSession) ix0Var.j).newVirtualViewStructure(autofillId, i3);
                    xl1 xl1Var2 = new xl1((Object) viewStructureNewVirtualViewStructure, (byte) 24);
                    rg2 rg2Var = wg2Var.d;
                    ch2 ch2Var = ah2.N;
                    mj1 mj1Var2 = rg2Var.h;
                    if (mj1Var2.c(ch2Var)) {
                        xl1Var = null;
                    } else {
                        Bundle extras = viewStructureNewVirtualViewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.p);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = mj1Var2.g(ah2.A);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructureNewVirtualViewStructure.setId(i3, null, null, str);
                        }
                        Object objG5 = mj1Var2.g(ah2.n);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = mj1Var2.g(ah2.C);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.TextView");
                            viewStructureNewVirtualViewStructure.setText(gb1.a(list, "\n", null, 62));
                        }
                        Object objG7 = mj1Var2.g(ah2.G);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        od odVar = (od) objG7;
                        if (odVar != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.EditText");
                            viewStructureNewVirtualViewStructure.setText(odVar);
                        }
                        Object objG8 = mj1Var2.g(ah2.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructureNewVirtualViewStructure.setContentDescription(gb1.a(list2, "\n", null, 62));
                        }
                        Object objG9 = mj1Var2.g(ah2.z);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        ba2 ba2Var = (ba2) objG9;
                        if (ba2Var != null && (strD = pz1.D(ba2Var.a)) != null) {
                            viewStructureNewVirtualViewStructure.setClassName(strD);
                        }
                        jw2 jw2VarS = pz1.s(rg2Var);
                        if (jw2VarS != null) {
                            iw2 iw2Var = jw2VarS.a;
                            xw2 xw2Var = iw2Var.b;
                            e90 e90Var = iw2Var.g;
                            viewStructureNewVirtualViewStructure.setTextStyle(e90Var.n() * e90Var.b() * ax2.c(xw2Var.a.b), 0, 0, 0);
                        }
                        pn1 pn1VarD = wg2Var.d();
                        if (pn1VarD == null) {
                            r72VarA = r72.e;
                        } else {
                            pn1 pn1Var = pn1VarD.V0().u ? pn1VarD : null;
                            if (pn1Var != null) {
                                r72VarA = wg2Var.a(pn1Var);
                            } else {
                                r72VarA = r72.e;
                            }
                        }
                        float f = r72VarA.a;
                        float f2 = r72VarA.b;
                        viewStructureNewVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (r72VarA.c - f), (int) (r72VarA.d - f2));
                        xl1Var = xl1Var2;
                    }
                } else {
                    xl1Var = null;
                }
            } else {
                xl1Var = null;
            }
            if (xl1Var != null) {
                this.k.add(new q00(i2, this.p, r00.h, xl1Var));
            }
            List listJ = wg2.j(4, wg2Var);
            int size = listJ.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listJ.get(i5);
                if (g().a(((wg2) obj).f)) {
                    k(i4, (wg2) obj);
                    i4++;
                }
            }
        }
    }

    public final void l(wg2 wg2Var) {
        if (h()) {
            this.k.add(new q00(wg2Var.f, this.p, r00.i, null));
            List listJ = wg2.j(4, wg2Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                l((wg2) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void m() {
        si1 si1Var = this.q;
        si1Var.c();
        ly0 ly0VarG = g();
        int[] iArr = ly0VarG.b;
        Object[] objArr = ly0VarG.c;
        long[] jArr = ly0VarG.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            si1Var.h(iArr[i4], new xg2(((yg2) objArr[i4]).a, g()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.r = new xg2(this.h.getSemanticsOwner().a(), g());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.t);
        this.j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
