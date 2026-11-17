package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.familymeal.app.MealPlannerApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class es implements sh {
    public static iu0 h;
    public static iu0 i;
    public static iu0 j;
    public static iu0 k;

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:13:0x002f, B:23:0x0050, B:26:0x0064, B:28:0x006c, B:18:0x0041, B:22:0x004c), top: B:49:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r1.m(r10, r0) == r5) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:31:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.qk0 r7, defpackage.ds r8, boolean r9, defpackage.n10 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.uk0
            if (r0 == 0) goto L13
            r0 = r10
            uk0 r0 = (defpackage.uk0) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            uk0 r0 = new uk0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.o
            int r1 = r0.p
            r2 = 0
            r3 = 2
            r4 = 1
            y20 r5 = defpackage.y20.h
            if (r1 == 0) goto L45
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            boolean r9 = r0.n
            ep r7 = r0.m
            ds r8 = r0.l
            qk0 r1 = r0.k
            defpackage.m02.y(r10)     // Catch: java.lang.Throwable -> L8c
            goto L81
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            return r2
        L39:
            boolean r9 = r0.n
            ep r7 = r0.m
            ds r8 = r0.l
            qk0 r1 = r0.k
            defpackage.m02.y(r10)     // Catch: java.lang.Throwable -> L8c
            goto L64
        L45:
            defpackage.m02.y(r10)
            boolean r10 = r7 instanceof defpackage.ox2
            if (r10 != 0) goto La8
            ep r10 = r8.iterator()     // Catch: java.lang.Throwable -> L8c
        L50:
            r0.k = r7     // Catch: java.lang.Throwable -> L8c
            r0.l = r8     // Catch: java.lang.Throwable -> L8c
            r0.m = r10     // Catch: java.lang.Throwable -> L8c
            r0.n = r9     // Catch: java.lang.Throwable -> L8c
            r0.p = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L8c
            if (r1 == r5) goto L80
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L8c
            r0.k = r1     // Catch: java.lang.Throwable -> L8c
            r0.l = r8     // Catch: java.lang.Throwable -> L8c
            r0.m = r7     // Catch: java.lang.Throwable -> L8c
            r0.n = r9     // Catch: java.lang.Throwable -> L8c
            r0.p = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r1.m(r10, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r5) goto L81
        L80:
            return r5
        L81:
            r10 = r7
            r7 = r1
            goto L50
        L84:
            if (r9 == 0) goto L89
            r8.a(r2)
        L89:
            j23 r7 = defpackage.j23.a
            return r7
        L8c:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto La7
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L98
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L98:
            if (r2 != 0) goto La4
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La4:
            r8.a(r2)
        La7:
            throw r10
        La8:
            ox2 r7 = (defpackage.ox2) r7
            java.lang.Throwable r7 = r7.h
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es.A(qk0, ds, boolean, n10):java.lang.Object");
    }

    public static int B(HandwritingGesture handwritingGesture, z61 z61Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        z61Var.h(new fw(fallbackText, 1));
        return 5;
    }

    public static final int C(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objP = rz1.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return i4;
    }

    public static final t31 D(t31 t31Var) {
        t31 t31Var2;
        t31 t31VarM = t31Var.m();
        while (true) {
            t31 t31Var3 = t31VarM;
            t31Var2 = t31Var;
            t31Var = t31Var3;
            if (t31Var == null) {
                break;
            }
            t31VarM = t31Var.m();
        }
        pn1 pn1Var = t31Var2 instanceof pn1 ? (pn1) t31Var2 : null;
        if (pn1Var == null) {
            return t31Var2;
        }
        pn1 pn1Var2 = pn1Var;
        while (true) {
            pn1Var2 = pn1Var2.D;
            if (pn1Var2 == null) {
                return pn1Var;
            }
            pn1Var = pn1Var2;
        }
    }

    public static final View E(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(C(view, R.id.view_tree_lifecycle_owner), C(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (I(view) == null) {
                i2++;
                Object objP = rz1.p(view);
                View view4 = view2;
                view2 = view;
                view = objP instanceof View ? (View) objP : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final boolean F(lm0 lm0Var, qb qbVar) {
        int iOrdinal = lm0Var.O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (lm0VarB != null) {
                    return F(lm0VarB, qbVar) || G(lm0Var, lm0VarB, 1, qbVar);
                }
                li1.g("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return lm0Var.L0().a ? ((Boolean) qbVar.h(lm0Var)).booleanValue() : a0(lm0Var, qbVar);
                }
                wg.n();
                return false;
            }
        }
        return a0(lm0Var, qbVar);
    }

    public static final boolean G(lm0 lm0Var, lm0 lm0Var2, int i2, qb qbVar) {
        if (b0(lm0Var, lm0Var2, i2, qbVar)) {
            return true;
        }
        Boolean bool = (Boolean) ie1.A(lm0Var, i2, new qq1(((em0) cu.Z(lm0Var).getFocusOwner()).f(), lm0Var, lm0Var2, i2, qbVar, (byte) 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final du H(rh2 rh2Var) {
        rh2Var.getClass();
        if (!(rh2Var instanceof d10) && (rh2Var instanceof sh2)) {
            return H(((sh2) rh2Var).a);
        }
        return null;
    }

    public static final wy I(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (wy) weakReference.get();
        }
        return null;
    }

    public static final iu0 J() {
        iu0 iu0Var = h;
        if (iu0Var != null) {
            return iu0Var;
        }
        hu0 hu0Var = new hu0("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = k33.a;
        rl2 rl2Var = new rl2(kv.b);
        xl1 xl1Var = new xl1((byte) 3);
        xl1Var.A(6.0f, 19.0f);
        xl1Var.s(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        xl1Var.x(8.0f);
        xl1Var.s(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        xl1Var.H(7.0f);
        xl1Var.w(6.0f);
        xl1Var.I(12.0f);
        xl1Var.m();
        xl1Var.A(19.0f, 4.0f);
        xl1Var.x(-3.5f);
        xl1Var.z(-1.0f, -1.0f);
        xl1Var.x(-5.0f);
        xl1Var.z(-1.0f, 1.0f);
        xl1Var.w(5.0f);
        xl1Var.I(2.0f);
        xl1Var.x(14.0f);
        xl1Var.H(4.0f);
        xl1Var.m();
        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
        iu0 iu0VarB = hu0Var.b();
        h = iu0VarB;
        return iu0VarB;
    }

    public static String K(lf0 lf0Var, int i2) {
        lf0Var.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            Context context = lf0Var.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i2);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static nh2 L(dl1 dl1Var) {
        dl1Var.getClass();
        return ph2.H(dl1Var, new de1((byte) 8));
    }

    public static final kb M(o20 o20Var) {
        kb kbVar = (kb) o20Var.m(c5.c0);
        if (kbVar != null) {
            return kbVar;
        }
        li1.g("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static c13 N(dr0 dr0Var) {
        return (c13) dr0Var.j(e13.a);
    }

    public static final void O(o20 o20Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = s20.a.iterator();
        while (it.hasNext()) {
            try {
                ((r20) it.next()).n(o20Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    vs.l(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            vs.l(th, new s90(o20Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final float[] R(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static vc2 S(vc2[] vc2VarArr, int i2, vc2[] vc2VarArr2, int i3, int i4, uc2 uc2Var) {
        vc2 vc2VarK = uc2Var.k();
        for (int i5 = 0; i5 < i4; i5++) {
            vc2VarK = vc2VarK.z1((vc2) vc2VarArr[i2 + i5].i(vc2VarArr2[i3 + i5]));
        }
        return (vc2) vc2VarK.get();
    }

    public static final k42 T(zp0 zp0Var, vp0 vp0Var) {
        s sVar = new s((Object) zp0Var, (byte) 14);
        t03.k(1, vp0Var);
        return new k42(sVar, vp0Var, (byte) 4);
    }

    public static final float[] U(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] V(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static void Y(long j2, od odVar, boolean z, z61 z61Var) {
        if (z) {
            int i2 = qw2.c;
            int iCharCount = (int) (j2 >> 32);
            int iCharCount2 = (int) (j2 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(odVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < odVar.i.length() ? Character.codePointAt(odVar, iCharCount2) : 10;
            if (ls.Q(iCodePointBefore) && (ls.P(iCodePointAt) || ls.O(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(odVar, iCharCount);
                    }
                } while (ls.Q(iCodePointBefore));
                j2 = m02.a(iCharCount, iCharCount2);
            } else if (ls.Q(iCodePointAt) && (ls.P(iCodePointBefore) || ls.O(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == odVar.i.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(odVar, iCharCount2);
                    }
                } while (ls.Q(iCodePointAt));
                j2 = m02.a(iCharCount, iCharCount2);
            }
        }
        int i3 = (int) (4294967295L & j2);
        z61Var.h(new vs0(new we0[]{new bi2(i3, i3), new r80(qw2.d(j2), 0)}));
    }

    public static final boolean Z(lm0 lm0Var, qb qbVar) {
        Object[] objArr = new lm0[16];
        if (!lm0Var.h.u) {
            ax0.b("visitChildren called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var = lm0Var.h;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 == null) {
            cu.q(uj1Var, qg1Var);
        } else {
            uj1Var.b(qg1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = uj1Var.j;
            if (i3 == 0) {
                break;
            }
            qg1 qg1VarR = (qg1) uj1Var.k(i3 - 1);
            if ((qg1VarR.k & 1024) == 0) {
                cu.q(uj1Var, qg1VarR);
            } else {
                while (qg1VarR != null) {
                    if ((qg1VarR.j & 1024) != 0) {
                        uj1 uj1Var2 = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof lm0) {
                                lm0 lm0Var2 = (lm0) qg1VarR;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length << 1)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = lm0Var2;
                                i2 = i4;
                            } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                int i5 = 0;
                                for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                    if ((qg1Var3.j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            qg1VarR = qg1Var3;
                                        } else {
                                            if (uj1Var2 == null) {
                                                uj1Var2 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR != null) {
                                                uj1Var2.b(qg1VarR);
                                                qg1VarR = null;
                                            }
                                            uj1Var2.b(qg1Var3);
                                        }
                                    }
                                }
                                if (i5 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var2);
                        }
                        break;
                    }
                    qg1VarR = qg1VarR.m;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, mm0.i);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                lm0 lm0Var3 = (lm0) objArr[i6];
                if (ys.P(lm0Var3) && o(lm0Var3, qbVar)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final boolean a0(lm0 lm0Var, qb qbVar) {
        Object[] objArr = new lm0[16];
        if (!lm0Var.h.u) {
            ax0.b("visitChildren called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var = lm0Var.h;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 == null) {
            cu.q(uj1Var, qg1Var);
        } else {
            uj1Var.b(qg1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = uj1Var.j;
            if (i3 == 0) {
                break;
            }
            qg1 qg1VarR = (qg1) uj1Var.k(i3 - 1);
            if ((qg1VarR.k & 1024) == 0) {
                cu.q(uj1Var, qg1VarR);
            } else {
                while (qg1VarR != null) {
                    if ((qg1VarR.j & 1024) != 0) {
                        uj1 uj1Var2 = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof lm0) {
                                lm0 lm0Var2 = (lm0) qg1VarR;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length << 1)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = lm0Var2;
                                i2 = i4;
                            } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                int i5 = 0;
                                for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                    if ((qg1Var3.j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            qg1VarR = qg1Var3;
                                        } else {
                                            if (uj1Var2 == null) {
                                                uj1Var2 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR != null) {
                                                uj1Var2.b(qg1VarR);
                                                qg1VarR = null;
                                            }
                                            uj1Var2.b(qg1Var3);
                                        }
                                    }
                                }
                                if (i5 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var2);
                        }
                        break;
                    }
                    qg1VarR = qg1VarR.m;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, mm0.i);
        for (int i6 = 0; i6 < i2; i6++) {
            lm0 lm0Var3 = (lm0) objArr[i6];
            if (ys.P(lm0Var3) && F(lm0Var3, qbVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0194  */
    /* JADX WARN: Code duplicated, block: B:153:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x012a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134 A[ADDED_TO_REGION, LOOP:6: B:89:0x0134->B:116:0x0180, LOOP_START, PHI: r13
  0x0134: PHI (r13v12 qg1) = (r13v7 qg1), (r13v13 qg1) binds: [B:88:0x0132, B:116:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean b0(lm0 lm0Var, lm0 lm0Var2, int i2, qb qbVar) {
        qg1 qg1Var;
        qg1 qg1Var2;
        l41 l41VarY;
        ln1 ln1Var;
        qg1 qg1VarR;
        uj1 uj1Var;
        if (lm0Var.O0() != km0.i) {
            li1.g("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new lm0[16];
        if (!lm0Var.h.u) {
            ax0.b("visitChildren called on an unattached node");
        }
        uj1 uj1Var2 = new uj1(new qg1[16]);
        qg1 qg1Var3 = lm0Var.h;
        qg1 qg1Var4 = qg1Var3.m;
        if (qg1Var4 == null) {
            cu.q(uj1Var2, qg1Var3);
        } else {
            uj1Var2.b(qg1Var4);
        }
        int i3 = 0;
        while (true) {
            int i4 = uj1Var2.j;
            qg1Var = null;
            if (i4 == 0) {
                break;
            }
            qg1 qg1VarR2 = (qg1) uj1Var2.k(i4 - 1);
            if ((qg1VarR2.k & 1024) == 0) {
                cu.q(uj1Var2, qg1VarR2);
            } else {
                while (qg1VarR2 != null) {
                    if ((qg1VarR2.j & 1024) != 0) {
                        uj1 uj1Var3 = null;
                        while (qg1VarR2 != null) {
                            if (qg1VarR2 instanceof lm0) {
                                lm0 lm0Var3 = (lm0) qg1VarR2;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length << 1)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = lm0Var3;
                                i3 = i5;
                            } else if ((qg1VarR2.j & 1024) != 0 && (qg1VarR2 instanceof k80)) {
                                int i6 = 0;
                                for (qg1 qg1Var5 = ((k80) qg1VarR2).w; qg1Var5 != null; qg1Var5 = qg1Var5.m) {
                                    if ((qg1Var5.j & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            qg1VarR2 = qg1Var5;
                                        } else {
                                            if (uj1Var3 == null) {
                                                uj1Var3 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR2 != null) {
                                                uj1Var3.b(qg1VarR2);
                                                qg1VarR2 = null;
                                            }
                                            uj1Var3.b(qg1Var5);
                                        }
                                    }
                                }
                                if (i6 != 1) {
                                }
                            }
                            qg1VarR2 = cu.R(uj1Var3);
                        }
                        break;
                    }
                    qg1VarR2 = qg1VarR2.m;
                }
            }
        }
        Arrays.sort(objArr, 0, i3, mm0.i);
        if (i2 != 1) {
            if (i2 != 2) {
                li1.g("This function should only be used for 1-D focus search");
                return false;
            }
            qy0 qy0VarS = cy1.S(0, i3);
            int i7 = qy0VarS.h;
            int i8 = qy0VarS.i;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        lm0 lm0Var4 = (lm0) objArr[i8];
                        if (ys.P(lm0Var4) && o(lm0Var4, qbVar)) {
                            return true;
                        }
                    }
                    if (uz0.g(objArr[i8], lm0Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!lm0Var.h.u) {
                    ax0.b("visitAncestors called on an unattached node");
                }
                qg1Var2 = lm0Var.h.l;
                l41VarY = cu.Y(lm0Var);
                loop5: while (l41VarY != null) {
                    if ((l41VarY.L.f.k & 1024) != 0) {
                        while (qg1Var2 != null) {
                            if ((qg1Var2.j & 1024) != 0) {
                                qg1VarR = qg1Var2;
                                uj1Var = null;
                                while (qg1VarR != null) {
                                    if (qg1VarR instanceof lm0) {
                                        qg1Var = qg1VarR;
                                        break loop5;
                                    }
                                    if ((qg1VarR.j & 1024) == 0) {
                                    }
                                    qg1VarR = cu.R(uj1Var);
                                }
                            }
                            qg1Var2 = qg1Var2.l;
                        }
                    }
                    l41VarY = l41VarY.u();
                    if (l41VarY != null) {
                    }
                }
                if (qg1Var != null) {
                    return ((Boolean) qbVar.h(lm0Var)).booleanValue();
                }
            }
            return false;
        }
        qy0 qy0VarS2 = cy1.S(0, i3);
        int i9 = qy0VarS2.h;
        int i10 = qy0VarS2.i;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    lm0 lm0Var5 = (lm0) objArr[i9];
                    if (ys.P(lm0Var5) && F(lm0Var5, qbVar)) {
                        return true;
                    }
                }
                if (uz0.g(objArr[i9], lm0Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && lm0Var.L0().a) {
            if (!lm0Var.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1Var2 = lm0Var.h.l;
            l41VarY = cu.Y(lm0Var);
            loop5: while (l41VarY != null) {
                if ((l41VarY.L.f.k & 1024) != 0) {
                    while (qg1Var2 != null) {
                        if ((qg1Var2.j & 1024) != 0) {
                            qg1VarR = qg1Var2;
                            uj1Var = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof lm0) {
                                    qg1Var = qg1VarR;
                                    break loop5;
                                }
                                if ((qg1VarR.j & 1024) == 0 && (qg1VarR instanceof k80)) {
                                    int i11 = 0;
                                    for (qg1 qg1Var6 = ((k80) qg1VarR).w; qg1Var6 != null; qg1Var6 = qg1Var6.m) {
                                        if ((qg1Var6.j & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qg1VarR = qg1Var6;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var6);
                                            }
                                        }
                                    }
                                    if (i11 != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        }
                        qg1Var2 = qg1Var2.l;
                    }
                }
                l41VarY = l41VarY.u();
                qg1Var2 = (l41VarY != null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
            }
            if (qg1Var != null) {
                return ((Boolean) qbVar.h(lm0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void c(vp0 vp0Var, kp0 kp0Var, dr0 dr0Var, int i2) {
        byte b;
        vp0Var.getClass();
        kp0Var.getClass();
        dr0Var.W(-1193376943);
        int i3 = i2 | (dr0Var.h(vp0Var) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16);
        byte b2 = 1;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context applicationContext = ((Context) dr0Var.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            sj1 sj1VarH = pz1.h(((MealPlannerApp) applicationContext).b().d, ag0.h, dr0Var, 48, 2);
            Object[] objArr = new Object[0];
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new jw0(b2);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK, dr0Var, 48);
            List list = (List) sj1VarH.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                uv0 uv0Var = (uv0) obj;
                if (co2.X((String) sj1Var.getValue()) || co2.Q(uv0Var.b, co2.g0((String) sj1Var.getValue()).toString(), false) || co2.Q(uv0Var.c, co2.g0((String) sj1Var.getValue()).toString(), false)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                String str = ((uv0) obj2).c;
                Object arrayList2 = linkedHashMap.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            WeakHashMap weakHashMap = u83.v;
            pb pbVar = rz1.i(dr0Var).f;
            nx nxVarN = dt.N(-517400470, new gw0(kp0Var, b2), dr0Var);
            nx nxVarN2 = dt.N(1708811426, new nw0(sj1Var, linkedHashMap, vp0Var, arrayList, sj1VarH), dr0Var);
            b = 0;
            cy1.a(null, null, null, null, nxVarN, 0, 0L, 0L, pbVar, nxVarN2, dr0Var, 805330944, 239);
        } else {
            b = 0;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ow0(vp0Var, kp0Var, i2, b);
        }
    }

    public static final String c0(Object obj) {
        return wi0.h(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final void d(final rg1 rg1Var, c61 c61Var, final js0 js0Var, final rt1 rt1Var, final e70 e70Var, final boolean z, final j8 j8Var, final bh bhVar, final zg zgVar, final vp0 vp0Var, dr0 dr0Var, final int i2, final int i3) {
        int i4;
        int i5;
        c61 c61Var2;
        c61 c61Var3;
        boolean z2;
        p21 p21Var;
        rg1 rg1VarQ;
        dr0Var.W(708740370);
        if ((i2 & 6) == 0) {
            i4 = (dr0Var.f(rg1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.f(c61Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? dr0Var.f(js0Var) : dr0Var.h(js0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dr0Var.f(rt1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dr0Var.g(false) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dr0Var.g(true) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dr0Var.f(e70Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dr0Var.g(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dr0Var.f(j8Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dr0Var.f(bhVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (dr0Var.f(zgVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i7 = i5 | (dr0Var.h(vp0Var) ? 32 : 16);
        if (dr0Var.N(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            dr0Var.S();
            if ((i2 & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            int i8 = i6 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | (i7 & 112);
            sj1 sj1VarC = rz1.C(vp0Var, dr0Var);
            boolean z3 = (((i10 & 14) ^ 6) > 4 && dr0Var.f(c61Var)) || (i10 & 6) == 4;
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (z3 || objK == obj) {
                vz1 vz1Var = vz1.k;
                bb bbVar = new bb(sj1VarC, (byte) 15);
                eg egVar = il2.a;
                objK = new m51(new o90(new h6((Object) new o90(bbVar, vz1Var), (Object) c61Var, (byte) 21), vz1Var), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 0);
                dr0Var.f0(objK);
            }
            p21 p21Var2 = (p21) objK;
            int i11 = i9 | ((i6 >> 9) & 112);
            boolean z4 = ((((i11 & 14) ^ 6) > 4 && dr0Var.f(c61Var)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && dr0Var.g(false)) || (i11 & 48) == 32);
            Object objK2 = dr0Var.K();
            if (z4 || objK2 == obj) {
                objK2 = new e81(c61Var);
                dr0Var.f0(objK2);
            }
            e81 e81Var = (e81) objK2;
            Object objK3 = dr0Var.K();
            if (objK3 == obj) {
                objK3 = h7.Y(dr0Var);
                dr0Var.f0(objK3);
            }
            x20 x20Var = (x20) objK3;
            bs0 bs0Var = (bs0) dr0Var.j(uz.g);
            int i12 = i6 & 112;
            jy1 jy1Var = !((Boolean) dr0Var.j(uz.x)).booleanValue() ? vn2.a : null;
            int i13 = (i6 & 524272) | ((i7 << 18) & 3670016) | ((i6 >> 6) & 29360128);
            boolean zF = ((((i13 & 112) ^ 48) > 32 && dr0Var.f(c61Var)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && dr0Var.f(js0Var)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && dr0Var.f(rt1Var)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && dr0Var.g(false)) || (i13 & 24576) == 16384) | ((((458752 & i13) ^ 196608) > 131072 && dr0Var.g(true)) || (i13 & 196608) == 131072) | ((((i13 & 3670016) ^ 1572864) > 1048576 && dr0Var.f(zgVar)) || (i13 & 1572864) == 1048576) | ((((i13 & 29360128) ^ 12582912) > 8388608 && dr0Var.f(bhVar)) || (i13 & 12582912) == 8388608) | dr0Var.f(bs0Var);
            Object objK4 = dr0Var.K();
            if (zF || objK4 == obj) {
                c61Var3 = c61Var;
                z2 = true;
                objK4 = new r51(c61Var3, rt1Var, p21Var2, js0Var, bhVar, zgVar, x20Var, bs0Var, jy1Var);
                p21Var = p21Var2;
                dr0Var.f0(objK4);
            } else {
                c61Var3 = c61Var;
                p21Var = p21Var2;
                z2 = true;
            }
            u61 u61Var = (u61) objK4;
            boolean z5 = i12 == 32 ? z2 : false;
            Object objK5 = dr0Var.K();
            if (z5 || objK5 == obj) {
                objK5 = new o9((Object) c61Var3, (byte) 20);
                dr0Var.f0(objK5);
            }
            un2 un2VarO = dt.O(z2, (kp0) objK5, dr0Var, (i6 >> 12) & 126);
            ks1 ks1Var = ks1.h;
            if (z) {
                dr0Var.V(27471107);
                boolean z6 = (((i9 ^ 6) <= 4 || !dr0Var.f(c61Var3)) && (i8 & 6) != 4) ? false : z2;
                Object objK6 = dr0Var.K();
                if (z6 || objK6 == obj) {
                    objK6 = new g51(c61Var3);
                    dr0Var.f0(objK6);
                }
                rg1VarQ = ie1.q((g51) objK6, c61Var3.n, ks1Var);
                dr0Var.p(false);
            } else {
                dr0Var.V(27767312);
                dr0Var.p(false);
                rg1VarQ = og1.h;
            }
            c61Var2 = c61Var3;
            h(p21Var, ie1.z(ia2.q(aa3.C(rg1Var.c(c61Var3.k).c(c61Var3.l), p21Var, e81Var, ks1Var, z).c(rg1VarQ), c61Var3.m), c61Var3, ks1Var, j8Var, z, e70Var, c61Var3.f, un2VarO), c61Var2.o, u61Var, dr0Var, 0);
        } else {
            c61Var2 = c61Var;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final c61 c61Var4 = c61Var2;
            e72VarR.d = new zp0() { // from class: o51
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    es.d(rg1Var, c61Var4, js0Var, rt1Var, e70Var, z, j8Var, bhVar, zgVar, vp0Var, (dr0) obj2, m02.A(i2 | 1), m02.A(i3));
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    public static final nu d0(od odVar) {
        List list = odVar.j;
        ag0 ag0Var = ag0.h;
        List list2 = list == null ? ag0Var : list;
        CharSequence charSequence = odVar.i;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            g2 g2Var = new g2((byte) 18, false);
            g2Var.i = Parcel.obtain();
            if (list == null) {
                list = ag0Var;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                nd ndVar = (nd) list.get(i2);
                yl2 yl2Var = (yl2) ndVar.a;
                int i3 = ndVar.b;
                int i4 = ndVar.c;
                ((Parcel) g2Var.i).recycle();
                g2Var.i = Parcel.obtain();
                xv2 xv2Var = yl2Var.a;
                long j2 = yl2Var.l;
                long j3 = yl2Var.h;
                long j4 = yl2Var.b;
                List list3 = list;
                int i5 = size;
                long jA = xv2Var.a();
                SpannableString spannableString2 = spannableString;
                int i6 = i2;
                long j5 = kv.g;
                if (!r13.a(jA, j5)) {
                    g2Var.B((byte) 1);
                    ((Parcel) g2Var.i).writeLong(yl2Var.a.a());
                }
                long j6 = ax2.c;
                byte b = 2;
                if (!ax2.a(j4, j6)) {
                    g2Var.B((byte) 2);
                    g2Var.D(j4);
                }
                qn0 qn0Var = yl2Var.c;
                if (qn0Var != null) {
                    g2Var.B((byte) 3);
                    ((Parcel) g2Var.i).writeInt(qn0Var.h);
                }
                on0 on0Var = yl2Var.d;
                if (on0Var != null) {
                    int i7 = on0Var.a;
                    g2Var.B((byte) 4);
                    g2Var.B((i7 == 0 || i7 != 1) ? (byte) 0 : (byte) 1);
                }
                pn0 pn0Var = yl2Var.e;
                if (pn0Var != null) {
                    int i8 = pn0Var.a;
                    g2Var.B((byte) 5);
                    if (i8 == 0) {
                        b = 0;
                    } else if (i8 == 65535) {
                        b = 1;
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    g2Var.B(b);
                }
                String str = yl2Var.g;
                if (str != null) {
                    g2Var.B((byte) 6);
                    ((Parcel) g2Var.i).writeString(str);
                }
                if (!ax2.a(j3, j6)) {
                    g2Var.B((byte) 7);
                    g2Var.D(j3);
                }
                uk ukVar = yl2Var.i;
                if (ukVar != null) {
                    float f = ukVar.a;
                    g2Var.B((byte) 8);
                    g2Var.C(f);
                }
                yv2 yv2Var = yl2Var.j;
                if (yv2Var != null) {
                    g2Var.B((byte) 9);
                    g2Var.C(yv2Var.a);
                    g2Var.C(yv2Var.b);
                }
                if (!r13.a(j2, j5)) {
                    g2Var.B((byte) 10);
                    ((Parcel) g2Var.i).writeLong(j2);
                }
                vt2 vt2Var = yl2Var.m;
                if (vt2Var != null) {
                    g2Var.B((byte) 11);
                    ((Parcel) g2Var.i).writeInt(vt2Var.a);
                }
                ei2 ei2Var = yl2Var.n;
                if (ei2Var != null) {
                    g2Var.B((byte) 12);
                    ((Parcel) g2Var.i).writeLong(ei2Var.a);
                    long j7 = ei2Var.b;
                    g2Var.C(Float.intBitsToFloat((int) (j7 >> 32)));
                    g2Var.C(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    g2Var.C(ei2Var.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) g2Var.i).marshall(), 0)), i3, i4, 33);
                i2 = i6 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new nu(ClipData.newPlainText("plain text", charSequence));
    }

    public static final jm1 e0(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new jm1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static double f0(int i2, int i3, int i4, int i5, double[] dArr, double[] dArr2) {
        int i6 = i2 + 1;
        int i7 = i2 + 2;
        int i8 = i2 + 3;
        int i9 = i3 + 1;
        int i10 = i3 + 2;
        int i11 = i3 + 3;
        int i12 = i5 - ((i5 - i4) % 4);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i13 = i4;
        double d4 = 0.0d;
        while (i13 < i12) {
            d4 = (dArr[i2 + i13] * dArr2[i3 + i13]) + d4;
            d = (dArr[i6 + i13] * dArr2[i9 + i13]) + d;
            d2 = (dArr[i7 + i13] * dArr2[i10 + i13]) + d2;
            d3 = (dArr[i8 + i13] * dArr2[i11 + i13]) + d3;
            i13 += 4;
        }
        while (i13 < i5) {
            d4 += dArr[i2 + i13] * dArr2[i3 + i13];
            i13++;
        }
        return d4 + d + d2 + d3;
    }

    public static float g0(float[] fArr, int i2, float[] fArr2, int i3, int i4) {
        int i5 = i2 + 1;
        int i6 = i2 + 2;
        int i7 = i2 + 3;
        int i8 = i3 + 1;
        int i9 = i3 + 2;
        int i10 = i3 + 3;
        int i11 = i4 - (i4 % 4);
        int i12 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i12 < i11) {
            f += fArr[i2 + i12] * fArr2[i3 + i12];
            f2 += fArr[i5 + i12] * fArr2[i8 + i12];
            f3 += fArr[i6 + i12] * fArr2[i9 + i12];
            f4 += fArr[i7 + i12] * fArr2[i10 + i12];
            i12 += 4;
        }
        while (i12 < i4) {
            f += fArr[i2 + i12] * fArr2[i3 + i12];
            i12++;
        }
        return f + f2 + f3 + f4;
    }

    public static final void h(p21 p21Var, rg1 rg1Var, d71 d71Var, u61 u61Var, dr0 dr0Var, int i2) {
        u61 u61Var2;
        d71 d71Var2;
        rg1 rg1Var2;
        dr0Var.W(1055276397);
        int i3 = (dr0Var.h(p21Var) ? 4 : 2) | i2 | (dr0Var.f(rg1Var) ? 32 : 16) | (dr0Var.f(d71Var) ? 256 : 128) | (dr0Var.f(u61Var) ? 2048 : 1024);
        if (dr0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            u61Var2 = u61Var;
            t61 t61Var = new t61(d71Var, rg1Var, u61Var2, rz1.C(p21Var, dr0Var), (byte) 0);
            d71Var2 = d71Var;
            rg1Var2 = rg1Var;
            cu.j(dt.N(-933153643, t61Var, dr0Var), dr0Var, 6);
        } else {
            u61Var2 = u61Var;
            d71Var2 = d71Var;
            rg1Var2 = rg1Var;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new hl(p21Var, rg1Var2, d71Var2, u61Var2, i2);
        }
    }

    public static final Object h0(o20 o20Var, Object obj, Object obj2, zp0 zp0Var, m10 m10Var) {
        Object objE = ie1.E(o20Var, obj2);
        try {
            an2 an2Var = new an2(m10Var, o20Var);
            t03.k(2, zp0Var);
            Object objF = zp0Var.f(obj, an2Var);
            ie1.v(o20Var, objE);
            if (objF == y20.h) {
                m10Var.getClass();
            }
            return objF;
        } catch (Throwable th) {
            ie1.v(o20Var, objE);
            throw th;
        }
    }

    public static float i(EdgeEffect edgeEffect, float f, float f2, e90 e90Var) {
        float f3 = ne0.a;
        double dB = e90Var.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) ne0.a) * dB;
        float fExp = (float) (Math.exp((ne0.b / ne0.c) * Math.log(dAbs / d)) * d);
        int i2 = Build.VERSION.SDK_INT;
        if (fExp > (i2 >= 31 ? m7.d(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iX = ie1.x(f);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(iX);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iX);
        }
        return f;
    }

    public static sv l(sv svVar) {
        g73 g73Var = s60.U;
        if (ou.t(svVar.b, 12884901888L)) {
            s92 s92Var = (s92) svVar;
            g73 g73Var2 = s92Var.d;
            if (!u(g73Var2, g73Var)) {
                return new s92(s92Var.a, s92Var.h, g73Var, U(t(y3.c.b, g73Var2.a(), g73Var.a()), s92Var.i), s92Var.k, s92Var.n, s92Var.e, s92Var.f, s92Var.g, -1);
            }
        }
        return svVar;
    }

    public static final void m(z43 z43Var, k42 k42Var, h91 h91Var) {
        k42Var.getClass();
        h91Var.getClass();
        vb2 vb2Var = (vb2) z43Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (vb2Var == null || vb2Var.j) {
            return;
        }
        vb2Var.d(k42Var, h91Var);
        x81 x81Var = h91Var.h;
        if (x81Var == x81.i || x81Var.compareTo(x81.k) >= 0) {
            k42Var.l();
        } else {
            h91Var.a(new o70((Object) h91Var, (Object) k42Var, (byte) 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[RETURN] */
    public static final boolean o(lm0 lm0Var, qb qbVar) {
        int iOrdinal = lm0Var.O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (lm0VarB == null) {
                    li1.g("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = lm0VarB.O0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (o(lm0VarB, qbVar) || G(lm0Var, lm0VarB, 2, qbVar) || (lm0VarB.L0().a && ((Boolean) qbVar.h(lm0VarB)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            wg.n();
                            return false;
                        }
                        li1.g("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return G(lm0Var, lm0VarB, 2, qbVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wg.n();
                    return false;
                }
                if (!Z(lm0Var, qbVar)) {
                    if (!(lm0Var.L0().a ? ((Boolean) qbVar.h(lm0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return Z(lm0Var, qbVar);
    }

    public static final int p(int i2, uj1 uj1Var) {
        int i3 = uj1Var.j - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = uj1Var.h;
            int i6 = ((mz0) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((mz0) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static final r72 r(t31 t31Var) {
        t31 t31VarM = t31Var.m();
        return t31VarM != null ? t31VarM.M(t31Var, true) : new r72(0.0f, 0.0f, (int) (t31Var.O() >> 32), (int) (t31Var.O() & 4294967295L));
    }

    public static final r72 s(t31 t31Var, boolean z) {
        t31 t31VarD = D(t31Var);
        float fO = (int) (t31VarD.O() >> 32);
        float fO2 = (int) (t31VarD.O() & 4294967295L);
        r72 r72VarM = t31VarD.M(t31Var, z);
        float f = r72VarM.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fO) {
                f = fO;
            }
        }
        float f2 = r72VarM.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fO2) {
                f2 = fO2;
            }
        }
        float f3 = r72VarM.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fO) {
                fO = f3;
            }
            f3 = fO;
        }
        float f4 = r72VarM.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fO2) {
                fO2 = f5;
            }
            f4 = fO2;
        }
        if (f == f3 || f2 == f4) {
            return r72.e;
        }
        long jK = t31VarD.k((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jK2 = t31VarD.k((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jK3 = t31VarD.k((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jK4 = t31VarD.k((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jK4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jK3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jK & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jK2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jK4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jK3 & 4294967295L));
        return new r72(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final float[] t(float[] fArr, float[] fArr2, float[] fArr3) {
        V(fArr, fArr2);
        V(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrR = R(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return U(fArrR, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final boolean u(g73 g73Var, g73 g73Var2) {
        if (g73Var == g73Var2) {
            return true;
        }
        return Math.abs(g73Var.a - g73Var2.a) < 0.001f && Math.abs(g73Var.b - g73Var2.b) < 0.001f;
    }

    public static final boolean v(kc0 kc0Var, long j2) {
        if (!kc0Var.h.u) {
            return false;
        }
        gx0 gx0Var = cu.Y(kc0Var).L.c;
        if (!gx0Var.i0.u) {
            return false;
        }
        long jS = gx0Var.S(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS & 4294967295L));
        long j3 = kc0Var.x;
        float f = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static final f00 w(sv svVar, sv svVar2) {
        if (svVar == svVar2) {
            return new d00(svVar, svVar, 1);
        }
        return (ou.t(svVar.b, 12884901888L) && ou.t(svVar2.b, 12884901888L)) ? new e00((s92) svVar, (s92) svVar2) : new f00(svVar, svVar2, 0);
    }

    public static final rl0 x(ga2 ga2Var, String[] strArr, vp0 vp0Var) {
        ga2Var.getClass();
        f01 f01VarE = ga2Var.e();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        y02.v(f01VarE.a);
        p03 p03Var = f01VarE.b;
        p03Var.getClass();
        yh2 yh2Var = new yh2();
        byte b = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = p03Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                yh2Var.addAll(set);
            } else {
                yh2Var.add(str);
            }
        }
        String[] strArr3 = (String[]) r02.i(yh2Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = p03Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                wg.m("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i2] = num.intValue();
        }
        m10 m10Var = null;
        return new rl0(vs.p(new xk0(new zk0(new pl(f01VarE, m10Var, (byte) 1), new vr(new hd0((Object) p03Var, (Object) iArr, (Object) strArr3, m10Var, (byte) 7), (byte) 4), b), new e01(f01VarE, null)), -1), ga2Var, vp0Var);
    }

    public static void z(td0 td0Var, ou ouVar, long j2) {
        if (ouVar instanceof ns1) {
            r72 r72Var = ((ns1) ouVar).g;
            float f = r72Var.a;
            float f2 = r72Var.b;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
            float f3 = r72Var.c - r72Var.a;
            float f4 = r72Var.d - r72Var.b;
            td0Var.y(j2, jFloatToRawIntBits, 3, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
            return;
        }
        boolean z = ouVar instanceof os1;
        xi0 xi0Var = xi0.a;
        if (!z) {
            if (ouVar instanceof ms1) {
                td0Var.Z(((ms1) ouVar).g, j2, xi0Var);
                return;
            } else {
                wg.n();
                return;
            }
        }
        os1 os1Var = (os1) ouVar;
        l9 l9Var = os1Var.h;
        if (l9Var != null) {
            td0Var.Z(l9Var, j2, xi0Var);
            return;
        }
        na2 na2Var = os1Var.g;
        float f5 = na2Var.b;
        float f6 = na2Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (na2Var.h >> 32));
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float f7 = na2Var.c - f6;
        float f8 = na2Var.d - f5;
        td0Var.z(j2, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), xi0Var);
    }

    public final void P(SQLiteConnection sQLiteConnection, Iterable iterable) {
        sQLiteConnection.getClass();
        if (iterable == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(y());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    q(sQLiteStatementPrepare, obj);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            ie1.j(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final void Q(SQLiteConnection sQLiteConnection, Object obj) {
        sQLiteConnection.getClass();
        if (obj == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(y());
        try {
            q(sQLiteStatementPrepare, obj);
            sQLiteStatementPrepare.step();
            ie1.j(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public abstract View W(int i2);

    public abstract boolean X();

    public abstract void q(SQLiteStatement sQLiteStatement, Object obj);

    public abstract String y();
}
