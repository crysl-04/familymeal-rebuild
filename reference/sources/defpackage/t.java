package defpackage;

import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0241  */
    /* JADX WARN: Code duplicated, block: B:153:0x0251 A[Catch: all -> 0x0280, LOOP:1: B:138:0x01f2->B:153:0x0251, LOOP_END, TryCatch #0 {all -> 0x0280, blocks: (B:135:0x01e4, B:138:0x01f2, B:140:0x0202, B:142:0x020e, B:144:0x0217, B:146:0x0226, B:148:0x0243, B:153:0x0251, B:154:0x0255, B:156:0x0267, B:160:0x027c, B:161:0x027f, B:155:0x025a), top: B:181:0x01e4, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0255 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        byte b = this.h;
        Boolean bool = null;
        int i = 0;
        Object obj = this.i;
        switch (b) {
            case 0:
                ((u) obj).c();
                return;
            case 1:
                ((xu1) obj).a();
                return;
            case 2:
                a7 a7Var = (a7) obj;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    a7Var.k.s(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        a7Var.i();
                        Trace.endSection();
                        a7Var.P = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 3:
                o7 o7Var = (o7) obj;
                boolean zH = o7Var.h();
                t6 t6Var = o7Var.h;
                if (zH) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        t6Var.s(true);
                        si1 si1Var = o7Var.q;
                        int[] iArr = si1Var.b;
                        long[] jArr = si1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = i;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (!o7Var.g().a(i5)) {
                                                o7Var.k.add(new q00(i5, o7Var.p, r00.i, null));
                                                o7Var.n.s(j23.a);
                                            }
                                        }
                                        j >>= 8;
                                        i4++;
                                        length = length;
                                    }
                                    int i6 = length;
                                    if (i3 == 8) {
                                        length = i6;
                                        if (i2 != length) {
                                            i2++;
                                            i = 0;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                    i = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            o7Var.j(t6Var.getSemanticsOwner().a(), o7Var.r);
                            Trace.endSection();
                            o7Var.f(o7Var.g());
                            o7Var.m();
                            o7Var.s = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((za) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                cx cxVar = (cx) obj;
                Runnable runnable = cxVar.i;
                if (runnable != null) {
                    runnable.run();
                    cxVar.i = null;
                    return;
                }
                return;
            case 6:
                jx.f((jx) obj);
                return;
            case 7:
                bn0 bn0Var = (bn0) obj;
                synchronized (bn0Var.c) {
                    if (bn0Var.g == null) {
                        return;
                    }
                    try {
                        sn0 sn0VarC = bn0Var.c();
                        int i7 = sn0VarC.f;
                        if (i7 == 2) {
                            synchronized (bn0Var.c) {
                            }
                        }
                        if (i7 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = v03.a(bn0Var.a, new sn0[]{sn0VarC}, 0);
                            MappedByteBuffer mappedByteBufferQ = m02.q(bn0Var.a, sn0VarC.a);
                            if (mappedByteBufferQ == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                wk wkVar = new wk(typefaceA, dt.L(mappedByteBufferQ));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (bn0Var.c) {
                                    dt dtVar = bn0Var.g;
                                    if (dtVar != null) {
                                        dtVar.K(wkVar);
                                    }
                                    break;
                                }
                                bn0Var.b();
                                return;
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        synchronized (bn0Var.c) {
                            dt dtVar2 = bn0Var.g;
                            if (dtVar2 != null) {
                                dtVar2.J(th6);
                            }
                            bn0Var.b();
                            return;
                        }
                    }
                    break;
                }
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                Iterator it = ((yo0) obj).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    li1.c();
                    return;
                }
                return;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                o32 o32Var = (o32) obj;
                h91 h91Var = o32Var.m;
                if (o32Var.i == 0) {
                    o32Var.j = true;
                    h91Var.d(w81.ON_PAUSE);
                }
                if (o32Var.h == 0 && o32Var.j) {
                    h91Var.d(w81.ON_STOP);
                    o32Var.k = true;
                    return;
                }
                return;
            case 10:
                x92.setRippleState$lambda$1((x92) obj);
                return;
            case 11:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                cw2 cw2Var = (cw2) obj;
                eg egVar = cw2Var.b;
                cw2Var.n = null;
                uj1 uj1Var = cw2Var.m;
                View view2 = cw2Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    uj1Var.g();
                    return;
                }
                Object[] objArr = uj1Var.h;
                int i8 = uj1Var.j;
                Boolean boolValueOf = null;
                for (int i9 = 0; i9 < i8; i9++) {
                    bw2 bw2Var = (bw2) objArr[i9];
                    int iOrdinal = bw2Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            wg.n();
                            return;
                        } else if (!uz0.g(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(bw2Var == bw2.j);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                uj1Var.g();
                if (uz0.g(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((d51) egVar.j).getValue()).restartInput((View) egVar.i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((xl1) ((xl1) egVar.k).i).G();
                    } else {
                        ((xl1) ((xl1) egVar.k).i).v();
                    }
                }
                if (uz0.g(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((d51) egVar.j).getValue()).restartInput((View) egVar.i);
                    return;
                }
                return;
        }
    }
}
