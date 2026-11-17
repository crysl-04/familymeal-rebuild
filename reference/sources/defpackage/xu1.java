package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xu1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0 A[Catch: all -> 0x01b4, LOOP:4: B:80:0x016f->B:90:0x01a0, LOOP_END, TryCatch #2 {all -> 0x01b4, blocks: (B:77:0x015b, B:80:0x016f, B:82:0x017d, B:84:0x0187, B:86:0x018d, B:87:0x0196, B:90:0x01a0, B:91:0x01a7), top: B:163:0x015b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    @Override // defpackage.kp0
    public final Object a() throws PendingIntent.CanceledException {
        char c;
        boolean z;
        long j;
        long j2 = -9187201950435737472L;
        char c2 = 7;
        boolean z2 = true;
        boolean z3 = false;
        switch (this.h) {
            case 0:
                zu1 zu1Var = (zu1) this.i;
                return zu1Var.h.open(zu1Var.i);
            case 1:
                return Boolean.valueOf(m12.m((m12) this.i));
            case 2:
                s72 s72Var = (s72) this.i;
                s72Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    s72Var.a();
                    return j23.a;
                } finally {
                    Trace.endSection();
                }
            case 3:
                nb2 nb2Var = (nb2) this.i;
                hc2 hc2Var = nb2Var.h;
                Object obj = nb2Var.k;
                if (obj != null) {
                    return hc2Var.a(nb2Var, obj);
                }
                wg.m("Value should be initialized");
                return null;
            case 4:
                k42 k42Var = ((tb2) this.i).j;
                if (k42Var == null) {
                    return null;
                }
                Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                k42Var.g(bundleL);
                if (bundleL.isEmpty()) {
                    return null;
                }
                return bundleL;
            case 5:
                return h7.g0((h53) this.i);
            case 6:
                dc2 dc2Var = (dc2) this.i;
                dc2Var.g().a(new q72(dc2Var, (byte) 0));
                return j23.a;
            case 7:
                ae2 ae2Var = (ae2) this.i;
                k8 k8Var = (k8) vs.z(ae2Var, dt1.a);
                ae2Var.H = k8Var;
                ae2Var.I = k8Var != null ? new j8(k8Var.a, k8Var.b, k8Var.c, k8Var.d) : null;
                return j23.a;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                pf2 pf2Var = (pf2) this.i;
                qz2 qz2Var = pf2Var.e;
                pf2Var.f = qz2Var != null ? ((Number) qz2Var.m.getValue()).longValue() : 0L;
                return j23.a;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return this.i;
            case 10:
                th2 th2Var = (th2) this.i;
                return Integer.valueOf(p02.B(th2Var, th2Var.j));
            case 11:
                di2 di2Var = (di2) this.i;
                lu1 lu1Var = di2Var.j;
                if (((wj2) lu1Var.getValue()).a == 9205357640488583168L || wj2.c(((wj2) lu1Var.getValue()).a)) {
                    return null;
                }
                ap apVar = di2Var.h;
                long j3 = ((wj2) lu1Var.getValue()).a;
                return apVar.c;
            case 12:
                long j4 = 128;
                nl2 nl2Var = (nl2) this.i;
                while (true) {
                    synchronized (nl2Var.g) {
                        if (nl2Var.c) {
                            c = c2;
                        } else {
                            nl2Var.c = z2;
                            try {
                                uj1 uj1Var = nl2Var.f;
                                Object[] objArr = uj1Var.h;
                                int i = uj1Var.j;
                                for (?? r4 = z3; r4 < i; r4++) {
                                    try {
                                        ml2 ml2Var = (ml2) objArr[r4];
                                        nj1 nj1Var = ml2Var.g;
                                        vp0 vp0Var = ml2Var.a;
                                        Object[] objArr2 = nj1Var.b;
                                        long[] jArr = nj1Var.a;
                                        int length = jArr.length - 2;
                                        char c3 = c2;
                                        if (length >= 0) {
                                            ?? r14 = z3;
                                            while (true) {
                                                long j5 = jArr[r14];
                                                long[] jArr2 = jArr;
                                                if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i2 = 8 - ((~(r14 - length)) >>> 31);
                                                    int i3 = 0;
                                                    while (i3 < i2) {
                                                        if ((j5 & 255) < j4) {
                                                            vp0Var.h(objArr2[(r14 << 3) + i3]);
                                                        }
                                                        j5 >>= 8;
                                                        i3++;
                                                        j4 = 128;
                                                    }
                                                    if (i2 == 8) {
                                                        if (r14 != length) {
                                                            jArr = jArr2;
                                                            j4 = 128;
                                                            r14++;
                                                        }
                                                    }
                                                } else if (r14 != length) {
                                                    jArr = jArr2;
                                                    j4 = 128;
                                                    r14++;
                                                }
                                            }
                                        }
                                        nj1Var.b();
                                        c2 = c3;
                                        z3 = false;
                                        j4 = 128;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = false;
                                        nl2Var.c = z;
                                        throw th;
                                    }
                                }
                                c = c2;
                                nl2Var.c = z3;
                            } catch (Throwable th2) {
                                th = th2;
                                z = z3;
                            }
                        }
                    }
                    if (!nl2Var.c()) {
                        return j23.a;
                    }
                    c2 = c;
                    z2 = true;
                    z3 = false;
                    j4 = 128;
                }
                break;
            case 13:
                z41 z41VarA = ((zo2) this.i).a();
                l41 l41Var = z41VarA.h;
                if (z41VarA.u != ((uj1) ((dj1) l41Var.o()).i).j) {
                    mj1 mj1Var = z41VarA.m;
                    Object[] objArr3 = mj1Var.c;
                    long[] jArr3 = mj1Var.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j6 = jArr3[i4];
                            if ((((~j6) << 7) & j6 & j2) != j2) {
                                int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j6 & 255) < 128) {
                                        ((r41) objArr3[(i4 << 3) + i6]).d = true;
                                    }
                                    j6 >>= 8;
                                    i6++;
                                    j2 = j2;
                                }
                                j = j2;
                                if (i5 == 8) {
                                }
                            } else {
                                j = j2;
                            }
                            if (i4 != length2) {
                                i4++;
                                j2 = j;
                            }
                        }
                    }
                    if (l41Var.o != null) {
                        if (!l41Var.M.e) {
                            l41.U(l41Var, false, 7);
                        }
                    } else if (!l41Var.q()) {
                        l41.W(l41Var, false, 7);
                    }
                }
                return j23.a;
            case 14:
                PendingIntent actionIntent = ((RemoteAction) this.i).getActionIntent();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    try {
                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                        if (i7 >= 36) {
                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                        } else {
                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                        }
                        actionIntent.send(activityOptionsMakeBasic.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Objects.toString(actionIntent);
                        e.toString();
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return j23.a;
            case 15:
                ut2 ut2Var = (ut2) this.i;
                return ut2Var.u ? pz1.i(ut2Var) : ft2.b;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return new BaseInputConnection(((cw2) this.i).a, false);
            case 17:
                ww2 ww2Var = (ww2) this.i;
                ww2Var.F = null;
                y02.p(ww2Var);
                vs.E(ww2Var);
                dt.H(ww2Var);
                return Boolean.TRUE;
            case 18:
                ay2 ay2Var = (ay2) this.i;
                ay2Var.U.h(Boolean.valueOf(!ay2Var.T));
                return j23.a;
            case 19:
                m33 m33Var = (m33) this.i;
                j23 j23Var = j23.a;
                m33Var.h.setValue(j23Var);
                return j23Var;
            default:
                eg egVar = (eg) this.i;
                g53 g53Var = (g53) egVar.i;
                if (g53Var == null) {
                    return new j53();
                }
                String str = (String) egVar.j;
                LinkedHashMap linkedHashMap = g53Var.a;
                Object j53Var = linkedHashMap.get(str);
                if (j53Var == null) {
                    j53Var = new j53();
                    linkedHashMap.put(str, j53Var);
                }
                return (j53) ((z43) j53Var);
        }
    }
}
