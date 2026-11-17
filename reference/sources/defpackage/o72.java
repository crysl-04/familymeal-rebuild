package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements InputConnection {
    public final g2 a;
    public final boolean b;
    public final p81 c;
    public final kv2 d;
    public final v43 e;
    public int f;
    public vv2 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public o72(vv2 vv2Var, g2 g2Var, boolean z, p81 p81Var, kv2 kv2Var, v43 v43Var) {
        this.a = g2Var;
        this.b = z;
        this.c = p81Var;
        this.d = kv2Var;
        this.e = v43Var;
        this.g = vv2Var;
    }

    public final void a(we0 we0Var) {
        this.f++;
        try {
            this.j.add(we0Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((q81) this.a.i).c.h(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((q81) this.a.i).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (uz0.g(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new fw(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new r80(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new s80(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new nj0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        vv2 vv2Var = this.g;
        return TextUtils.getCapsMode(vv2Var.a.i, qw2.f(vv2Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return r02.F(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (qw2.c(this.g.b)) {
            return null;
        }
        return pz1.p(this.g).i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return pz1.q(this.g, i).i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return pz1.r(this.g, i).i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new bi2(0, this.g.a.i.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((q81) this.a.i).d.h(new mu0(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02b7  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        od odVar;
        long jH;
        int i;
        int i2;
        String string;
        kw2 kw2VarD;
        kw2 kw2VarD2;
        if (Build.VERSION.SDK_INT >= 34) {
            z61 z61Var = new z61(this, (byte) 13);
            p81 p81Var = this.c;
            final int iB = 3;
            if (p81Var != null && (odVar = p81Var.j) != null) {
                kw2 kw2VarD3 = p81Var.d();
                if (odVar.equals(kw2VarD3 != null ? kw2VarD3.a.a.a : null)) {
                    boolean zP = v8.p(handwritingGesture);
                    kv2 kv2Var = this.d;
                    if (zP) {
                        SelectGesture selectGestureK = v8.k(handwritingGesture);
                        long jC = ls.C(p81Var, y02.y(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() == 1 ? 1 : 0);
                        if (qw2.c(jC)) {
                            iB = es.B(us0.m(selectGestureK), z61Var);
                        } else {
                            z61Var.h(new bi2((int) (jC >> 32), (int) (jC & 4294967295L)));
                            if (kv2Var != null) {
                                kv2Var.e(true);
                            }
                            iB = 1;
                        }
                    } else if (us0.A(handwritingGesture)) {
                        DeleteGesture deleteGestureK = us0.k(handwritingGesture);
                        int i3 = deleteGestureK.getGranularity() != 1 ? 0 : 1;
                        long jC2 = ls.C(p81Var, y02.y(deleteGestureK.getDeletionArea()), i3);
                        if (qw2.c(jC2)) {
                            iB = es.B(us0.m(deleteGestureK), z61Var);
                        } else {
                            es.Y(jC2, odVar, i3 == 1, z61Var);
                            iB = 1;
                        }
                    } else if (us0.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureO = us0.o(handwritingGesture);
                        long jD = ls.D(p81Var, y02.y(selectRangeGestureO.getSelectionStartArea()), y02.y(selectRangeGestureO.getSelectionEndArea()), selectRangeGestureO.getGranularity() == 1 ? 1 : 0);
                        if (qw2.c(jD)) {
                            iB = es.B(us0.m(selectRangeGestureO), z61Var);
                        } else {
                            z61Var.h(new bi2((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (kv2Var != null) {
                                kv2Var.e(true);
                            }
                            iB = 1;
                        }
                    } else if (us0.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureL = us0.l(handwritingGesture);
                        int i4 = deleteRangeGestureL.getGranularity() != 1 ? 0 : 1;
                        long jD2 = ls.D(p81Var, y02.y(deleteRangeGestureL.getDeletionStartArea()), y02.y(deleteRangeGestureL.getDeletionEndArea()), i4);
                        if (qw2.c(jD2)) {
                            iB = es.B(us0.m(deleteRangeGestureL), z61Var);
                        } else {
                            es.Y(jD2, odVar, i4 == 1, z61Var);
                            iB = 1;
                        }
                    } else {
                        boolean zU = us0.u(handwritingGesture);
                        v43 v43Var = this.e;
                        if (zU) {
                            JoinOrSplitGesture joinOrSplitGestureN = us0.n(handwritingGesture);
                            if (v43Var == null) {
                                iB = es.B(us0.y(joinOrSplitGestureN), z61Var);
                            } else {
                                int iA = ls.A(p81Var, ls.Z(joinOrSplitGestureN.getJoinOrSplitPoint()), v43Var);
                                if (iA == -1 || ((kw2VarD2 = p81Var.d()) != null && ls.N(kw2VarD2.a, iA))) {
                                    iB = es.B(us0.m(joinOrSplitGestureN), z61Var);
                                } else {
                                    int iCharCount = iA;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(odVar, iCharCount);
                                        if (!ls.P(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iA < odVar.i.length()) {
                                        int iCodePointAt = Character.codePointAt(odVar, iA);
                                        if (!ls.P(iCodePointAt)) {
                                            break;
                                        } else {
                                            iA += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jA = m02.a(iCharCount, iA);
                                    if (qw2.c(jA)) {
                                        int i5 = (int) (jA >> 32);
                                        z61Var.h(new vs0(new we0[]{new bi2(i5, i5), new fw(" ", 1)}));
                                    } else {
                                        es.Y(jA, odVar, false, z61Var);
                                    }
                                    iB = 1;
                                }
                            }
                        } else if (v8.u(handwritingGesture)) {
                            InsertGesture insertGestureJ = v8.j(handwritingGesture);
                            if (v43Var == null) {
                                iB = es.B(us0.y(insertGestureJ), z61Var);
                            } else {
                                int iA2 = ls.A(p81Var, ls.Z(insertGestureJ.getInsertionPoint()), v43Var);
                                if (iA2 == -1 || ((kw2VarD = p81Var.d()) != null && ls.N(kw2VarD.a, iA2))) {
                                    iB = es.B(us0.m(insertGestureJ), z61Var);
                                } else {
                                    z61Var.h(new vs0(new we0[]{new bi2(iA2, iA2), new fw(insertGestureJ.getTextToInsert(), 1)}));
                                    iB = 1;
                                }
                            }
                        } else if (v8.w(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureB = o83.b(handwritingGesture);
                            kw2 kw2VarD4 = p81Var.d();
                            jw2 jw2Var = kw2VarD4 != null ? kw2VarD4.a : null;
                            long jZ = ls.Z(removeSpaceGestureB.getStartPoint());
                            long jZ2 = ls.Z(removeSpaceGestureB.getEndPoint());
                            t31 t31VarC = p81Var.c();
                            if (jw2Var != null) {
                                uh1 uh1Var = jw2Var.b;
                                if (t31VarC != null) {
                                    long jV = t31VarC.v(jZ);
                                    long jV2 = t31VarC.v(jZ2);
                                    int iZ = ls.z(uh1Var, jV, v43Var);
                                    int iZ2 = ls.z(uh1Var, jV2, v43Var);
                                    if (iZ != -1) {
                                        if (iZ2 != -1) {
                                            iZ = Math.min(iZ, iZ2);
                                        }
                                        iZ2 = iZ;
                                    } else if (iZ2 == -1) {
                                        jH = qw2.b;
                                    }
                                    float fB = (uh1Var.b(iZ2) + uh1Var.f(iZ2)) / 2.0f;
                                    int i6 = (int) (jV >> 32);
                                    int i7 = (int) (jV2 >> 32);
                                    jH = uh1Var.h(new r72(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), fB - 0.1f, Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), fB + 0.1f), 0, vz1.w);
                                } else {
                                    jH = qw2.b;
                                }
                            } else {
                                jH = qw2.b;
                            }
                            if (qw2.c(jH)) {
                                iB = es.B(us0.m(removeSpaceGestureB), z61Var);
                            } else {
                                String str = odVar.subSequence(qw2.f(jH), qw2.e(jH)).i;
                                Pattern patternCompile = Pattern.compile("\\s+");
                                patternCompile.getClass();
                                str.getClass();
                                Matcher matcher = patternCompile.matcher(str);
                                matcher.getClass();
                                eg egVarL = pz1.l(matcher, 0, str);
                                if (egVarL == null) {
                                    string = str.toString();
                                    i2 = -1;
                                    i = -1;
                                } else {
                                    int length = str.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    int i8 = 0;
                                    i = -1;
                                    while (true) {
                                        sb.append((CharSequence) str, i8, egVarL.p().h);
                                        if (i == -1) {
                                            i = egVarL.p().h;
                                        }
                                        i2 = egVarL.p().i + 1;
                                        sb.append((CharSequence) "");
                                        int i9 = egVarL.p().i + 1;
                                        egVarL = egVarL.v();
                                        if (i9 >= length) {
                                            break;
                                        }
                                        if (egVarL == null) {
                                            sb.append((CharSequence) str, i9, length);
                                            break;
                                        }
                                        i8 = i9;
                                    }
                                    string = sb.toString();
                                }
                                if (i == -1 || i2 == -1) {
                                    iB = es.B(us0.m(removeSpaceGestureB), z61Var);
                                } else {
                                    int i10 = (int) (jH >> 32);
                                    iB = 1;
                                    z61Var.h(new vs0(new we0[]{new bi2(i10 + i, i10 + i2), new fw(string.substring(i, string.length() - (qw2.d(jH) - i2)), 1)}));
                                }
                            }
                        } else {
                            iB = 2;
                        }
                    }
                }
            }
            if (intConsumer != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: wd
                        @Override // java.lang.Runnable
                        public final void run() {
                            intConsumer.accept(iB);
                        }
                    });
                } else {
                    intConsumer.accept(iB);
                }
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        p81 p81Var;
        od odVar;
        if (Build.VERSION.SDK_INT >= 34 && (p81Var = this.c) != null && (odVar = p81Var.j) != null) {
            kw2 kw2VarD = p81Var.d();
            if (odVar.equals(kw2VarD != null ? kw2VarD.a.a.a : null)) {
                boolean zP = v8.p(previewableHandwritingGesture);
                byte b = 1;
                qs0 qs0Var = qs0.h;
                kv2 kv2Var = this.d;
                if (zP) {
                    SelectGesture selectGestureK = v8.k(previewableHandwritingGesture);
                    if (kv2Var != null) {
                        long jC = ls.C(p81Var, y02.y(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        p81 p81Var2 = kv2Var.d;
                        if (p81Var2 != null) {
                            p81Var2.f(jC);
                        }
                        p81 p81Var3 = kv2Var.d;
                        if (p81Var3 != null) {
                            p81Var3.e(qw2.b);
                        }
                        if (!qw2.c(jC)) {
                            kv2Var.u(false);
                            kv2Var.r(qs0Var);
                        }
                    }
                } else if (us0.A(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureK = us0.k(previewableHandwritingGesture);
                    if (kv2Var != null) {
                        long jC2 = ls.C(p81Var, y02.y(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() != 1 ? 0 : 1);
                        p81 p81Var4 = kv2Var.d;
                        if (p81Var4 != null) {
                            p81Var4.e(jC2);
                        }
                        p81 p81Var5 = kv2Var.d;
                        if (p81Var5 != null) {
                            p81Var5.f(qw2.b);
                        }
                        if (!qw2.c(jC2)) {
                            kv2Var.u(false);
                            kv2Var.r(qs0Var);
                        }
                    }
                } else if (us0.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureO = us0.o(previewableHandwritingGesture);
                    if (kv2Var != null) {
                        long jD = ls.D(p81Var, y02.y(selectRangeGestureO.getSelectionStartArea()), y02.y(selectRangeGestureO.getSelectionEndArea()), selectRangeGestureO.getGranularity() != 1 ? 0 : 1);
                        p81 p81Var6 = kv2Var.d;
                        if (p81Var6 != null) {
                            p81Var6.f(jD);
                        }
                        p81 p81Var7 = kv2Var.d;
                        if (p81Var7 != null) {
                            p81Var7.e(qw2.b);
                        }
                        if (!qw2.c(jD)) {
                            kv2Var.u(false);
                            kv2Var.r(qs0Var);
                        }
                    }
                } else if (us0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureL = us0.l(previewableHandwritingGesture);
                    if (kv2Var != null) {
                        long jD2 = ls.D(p81Var, y02.y(deleteRangeGestureL.getDeletionStartArea()), y02.y(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        p81 p81Var8 = kv2Var.d;
                        if (p81Var8 != null) {
                            p81Var8.e(jD2);
                        }
                        p81 p81Var9 = kv2Var.d;
                        if (p81Var9 != null) {
                            p81Var9.f(qw2.b);
                        }
                        if (!qw2.c(jD2)) {
                            kv2Var.u(false);
                            kv2Var.r(qs0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new oy(kv2Var, b));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:49:0x006e), top: B:56:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:49:0x006e), top: B:56:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        l81 l81Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            l81Var = ((q81) this.a.i).m;
            synchronized (l81Var.c) {
                l81Var.f = z2;
                l81Var.g = z3;
                l81Var.h = z5;
                l81Var.i = z;
                if (z6) {
                    l81Var.e = true;
                    if (l81Var.j != null) {
                        l81Var.a();
                    }
                }
                l81Var.d = z7;
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        l81Var = ((q81) this.a.i).m;
        synchronized (l81Var.c) {
            l81Var.f = z2;
            l81Var.g = z3;
            l81Var.h = z5;
            l81Var.i = z;
            if (z6) {
                l81Var.e = true;
                if (l81Var.j != null) {
                    l81Var.a();
                }
            }
            l81Var.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((q81) this.a.i).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new zh2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new ai2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new bi2(i, i2));
        return true;
    }
}
