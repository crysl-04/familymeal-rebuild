package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y02 implements u43 {
    public static iu0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [vp0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void A(j80 j80Var, Object obj, vp0 vp0Var) {
        ln1 ln1Var;
        if (!((qg1) j80Var).h.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var = ((qg1) j80Var).h.l;
        l41 l41VarY = cu.Y(j80Var);
        while (l41VarY != null) {
            if ((l41VarY.L.f.k & 262144) != 0) {
                while (qg1Var != null) {
                    if ((qg1Var.j & 262144) != 0) {
                        ?? R = qg1Var;
                        ?? uj1Var = 0;
                        while (R != 0) {
                            if (R instanceof yz2) {
                                yz2 yz2Var = (yz2) R;
                                if (!(obj.equals(yz2Var.r()) ? ((Boolean) vp0Var.h(yz2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((R.j & 262144) != 0 && (R instanceof k80)) {
                                qg1 qg1Var2 = ((k80) R).w;
                                int i = 0;
                                while (qg1Var2 != null) {
                                    if ((qg1Var2.j & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            R = R;
                                            uj1Var = uj1Var;
                                            uj1Var = uj1Var;
                                            R = qg1Var2;
                                        } else {
                                            if (uj1Var == 0) {
                                                uj1Var = new uj1(new qg1[16]);
                                            }
                                            if (R != 0) {
                                                uj1Var.b(R);
                                                R = 0;
                                            }
                                            uj1Var.b(qg1Var2);
                                        }
                                    } else {
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    qg1Var2 = qg1Var2.m;
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                                if (i != 1) {
                                    R = R;
                                    uj1Var = uj1Var;
                                } else {
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                            }
                            R = cu.R(uj1Var);
                        }
                    }
                    qg1Var = qg1Var.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [j80, java.lang.Object, yz2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [vp0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void B(yz2 yz2Var, vp0 vp0Var) {
        ln1 ln1Var;
        qg1 qg1Var = (qg1) yz2Var;
        if (!qg1Var.h.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var2 = qg1Var.h.l;
        l41 l41VarY = cu.Y(yz2Var);
        while (l41VarY != null) {
            if ((l41VarY.L.f.k & 262144) != 0) {
                while (qg1Var2 != null) {
                    if ((qg1Var2.j & 262144) != 0) {
                        ?? R = qg1Var2;
                        ?? uj1Var = 0;
                        while (R != 0) {
                            boolean zBooleanValue = true;
                            if (R instanceof yz2) {
                                yz2 yz2Var2 = (yz2) R;
                                if (uz0.g(yz2Var.r(), yz2Var2.r()) && yz2Var.getClass() == yz2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) vp0Var.h(yz2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((R.j & 262144) != 0 && (R instanceof k80)) {
                                qg1 qg1Var3 = ((k80) R).w;
                                int i = 0;
                                while (qg1Var3 != null) {
                                    if ((qg1Var3.j & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            R = R;
                                            uj1Var = uj1Var;
                                            uj1Var = uj1Var;
                                            R = qg1Var3;
                                        } else {
                                            if (uj1Var == 0) {
                                                uj1Var = new uj1(new qg1[16]);
                                            }
                                            if (R != 0) {
                                                uj1Var.b(R);
                                                R = 0;
                                            }
                                            uj1Var.b(qg1Var3);
                                        }
                                    } else {
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    qg1Var3 = qg1Var3.m;
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                                if (i != 1) {
                                    R = R;
                                    uj1Var = uj1Var;
                                } else {
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                            }
                            R = cu.R(uj1Var);
                        }
                    }
                    qg1Var2 = qg1Var2.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var2 = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [vp0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void C(qg1 qg1Var, String str, vp0 vp0Var) {
        if (!qg1Var.h.u) {
            ax0.b("visitSubtreeIf called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var2 = qg1Var.h;
        qg1 qg1Var3 = qg1Var2.m;
        if (qg1Var3 == null) {
            cu.q(uj1Var, qg1Var2);
        } else {
            uj1Var.b(qg1Var3);
        }
        while (true) {
            int i = uj1Var.j;
            if (i == 0) {
                return;
            }
            qg1 qg1Var4 = (qg1) uj1Var.k(i - 1);
            if ((qg1Var4.k & 262144) != 0) {
                qg1 qg1Var5 = qg1Var4;
                while (true) {
                    if (qg1Var5 != null && qg1Var5.u) {
                        if ((qg1Var5.j & 262144) != 0) {
                            ?? R = qg1Var5;
                            ?? uj1Var2 = 0;
                            while (R != 0) {
                                if (R instanceof yz2) {
                                    yz2 yz2Var = (yz2) R;
                                    xz2 xz2Var = str.equals(yz2Var.r()) ? (xz2) vp0Var.h(yz2Var) : xz2.h;
                                    if (xz2Var == xz2.j) {
                                        return;
                                    }
                                    if (xz2Var == xz2.i) {
                                        break;
                                    }
                                } else if ((R.j & 262144) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var6 = ((k80) R).w;
                                    int i2 = 0;
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                    while (qg1Var6 != null) {
                                        if ((qg1Var6.j & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uj1Var2 = uj1Var2;
                                                R = qg1Var6;
                                            } else {
                                                if (uj1Var2 == 0) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var2.b(R);
                                                    R = 0;
                                                }
                                                uj1Var2.b(qg1Var6);
                                            }
                                        }
                                        qg1Var6 = qg1Var6.m;
                                        R = R;
                                        uj1Var2 = uj1Var2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                R = cu.R(uj1Var2);
                            }
                        }
                        qg1Var5 = qg1Var5.m;
                    }
                }
            }
            cu.q(uj1Var, qg1Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, yz2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [vp0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void D(yz2 yz2Var, vp0 vp0Var) {
        qg1 qg1Var = (qg1) yz2Var;
        if (!qg1Var.h.u) {
            ax0.b("visitSubtreeIf called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var2 = qg1Var.h;
        qg1 qg1Var3 = qg1Var2.m;
        if (qg1Var3 == null) {
            cu.q(uj1Var, qg1Var2);
        } else {
            uj1Var.b(qg1Var3);
        }
        while (true) {
            int i = uj1Var.j;
            if (i == 0) {
                return;
            }
            qg1 qg1Var4 = (qg1) uj1Var.k(i - 1);
            if ((qg1Var4.k & 262144) != 0) {
                qg1 qg1Var5 = qg1Var4;
                while (true) {
                    if (qg1Var5 != null && qg1Var5.u) {
                        if ((qg1Var5.j & 262144) != 0) {
                            ?? R = qg1Var5;
                            ?? uj1Var2 = 0;
                            while (R != 0) {
                                if (R instanceof yz2) {
                                    yz2 yz2Var2 = (yz2) R;
                                    xz2 xz2Var = (uz0.g(yz2Var.r(), yz2Var2.r()) && yz2Var.getClass() == yz2Var2.getClass()) ? (xz2) vp0Var.h(yz2Var2) : xz2.h;
                                    if (xz2Var == xz2.j) {
                                        return;
                                    }
                                    if (xz2Var == xz2.i) {
                                        break;
                                    }
                                } else if ((R.j & 262144) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var6 = ((k80) R).w;
                                    int i2 = 0;
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                    while (qg1Var6 != null) {
                                        if ((qg1Var6.j & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uj1Var2 = uj1Var2;
                                                R = qg1Var6;
                                            } else {
                                                if (uj1Var2 == 0) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var2.b(R);
                                                    R = 0;
                                                }
                                                uj1Var2.b(qg1Var6);
                                            }
                                        }
                                        qg1Var6 = qg1Var6.m;
                                        R = R;
                                        uj1Var2 = uj1Var2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                R = cu.R(uj1Var2);
                            }
                        }
                        qg1Var5 = qg1Var5.m;
                    }
                }
            }
            cu.q(uj1Var, qg1Var4);
        }
    }

    public static final double E(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static Double F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(ev.o0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((t63) obj).a);
        }
        if (dv.w0(arrayList2).size() >= 2) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                wg.p();
                return null;
            }
            LocalDate localDate = ((t63) it.next()).a;
            while (it.hasNext()) {
                LocalDate localDate2 = ((t63) it.next()).a;
                if (localDate.compareTo((Object) localDate2) > 0) {
                    localDate = localDate2;
                }
            }
            ArrayList arrayList3 = new ArrayList(ev.o0(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                arrayList3.add(Double.valueOf(ChronoUnit.DAYS.between(localDate, ((t63) obj2).a)));
            }
            ArrayList arrayList4 = new ArrayList(ev.o0(arrayList, 10));
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                arrayList4.add(Double.valueOf(((t63) obj3).b));
            }
            double dU0 = dv.u0(arrayList3);
            double dU1 = dv.u0(arrayList4);
            int size4 = arrayList3.size();
            double dDoubleValue = 0.0d;
            int i4 = 0;
            double d = 0.0d;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                double dDoubleValue2 = ((Number) obj4).doubleValue() - dU0;
                d += dDoubleValue2 * dDoubleValue2;
            }
            if (d != 0.0d) {
                Iterator it2 = new qy0(0, arrayList3.size() - 1, 1).iterator();
                while (((py0) it2).j) {
                    int iNextInt = ((jy0) it2).nextInt();
                    dDoubleValue += (((Number) arrayList4.get(iNextInt)).doubleValue() - dU1) * (((Number) arrayList3.get(iNextInt)).doubleValue() - dU0);
                }
                return Double.valueOf((dDoubleValue / d) * 7.0d);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x028c  */
    /* JADX WARN: Code duplicated, block: B:185:0x028f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0298  */
    /* JADX WARN: Code duplicated, block: B:192:0x029c  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:206:0x0311  */
    /* JADX WARN: Code duplicated, block: B:208:0x0314  */
    /* JADX WARN: Code duplicated, block: B:212:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0321  */
    /* JADX WARN: Code duplicated, block: B:218:0x033d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0349  */
    /* JADX WARN: Code duplicated, block: B:227:0x036f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0372  */
    /* JADX WARN: Code duplicated, block: B:232:0x0376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0378  */
    /* JADX WARN: Code duplicated, block: B:235:0x037c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0395  */
    /* JADX WARN: Code duplicated, block: B:240:0x0398  */
    /* JADX WARN: Code duplicated, block: B:244:0x039f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:249:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:251:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:254:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:259:0x042d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0431  */
    /* JADX WARN: Code duplicated, block: B:264:0x044e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0451  */
    /* JADX WARN: Code duplicated, block: B:268:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0494  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:275:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:276:0x0510  */
    /* JADX WARN: Code duplicated, block: B:278:0x053a  */
    /* JADX WARN: Code duplicated, block: B:280:0x053e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x0540  */
    /* JADX WARN: Code duplicated, block: B:282:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x0545  */
    /* JADX WARN: Code duplicated, block: B:284:0x0548  */
    /* JADX WARN: Code duplicated, block: B:287:0x0551  */
    /* JADX WARN: Code duplicated, block: B:290:0x0568  */
    /* JADX WARN: Code duplicated, block: B:295:0x0595  */
    /* JADX WARN: Code duplicated, block: B:298:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:303:0x05cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:304:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:305:0x05d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:306:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:307:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:309:0x05db  */
    /* JADX WARN: Code duplicated, block: B:312:0x0602  */
    /* JADX WARN: Code duplicated, block: B:314:0x0610  */
    /* JADX WARN: Code duplicated, block: B:315:0x0613 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x0615  */
    /* JADX WARN: Code duplicated, block: B:317:0x0618 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x061a  */
    /* JADX WARN: Code duplicated, block: B:319:0x061d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0621  */
    /* JADX WARN: Code duplicated, block: B:322:0x062e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0651  */
    /* JADX WARN: Code duplicated, block: B:327:0x0655 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0657  */
    /* JADX WARN: Code duplicated, block: B:329:0x065a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x065c  */
    /* JADX WARN: Code duplicated, block: B:331:0x065f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0664  */
    /* JADX WARN: Code duplicated, block: B:334:0x0671  */
    /* JADX WARN: Code duplicated, block: B:337:0x0699  */
    /* JADX WARN: Code duplicated, block: B:340:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:341:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:344:0x06ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:345:0x06f1  */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0265, code lost:
    
        if (r8 == 2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0290, code lost:
    
        if (r2 != 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ec, code lost:
    
        if (r5 == 2) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0315, code lost:
    
        if (r5 != 2) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0373, code lost:
    
        if (r1 == 2) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0399, code lost:
    
        if (r1 != 2) goto L242;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r44, final defpackage.zp0 r45, final defpackage.su2 r46, final defpackage.nx r47, final defpackage.nx r48, final defpackage.nx r49, final defpackage.nx r50, final defpackage.nx r51, final boolean r52, final boolean r53, final boolean r54, final defpackage.hz0 r55, final defpackage.rt1 r56, final defpackage.au2 r57, final defpackage.nx r58, defpackage.dr0 r59, final int r60, final int r61) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y02.a(java.lang.CharSequence, zp0, su2, nx, nx, nx, nx, nx, boolean, boolean, boolean, hz0, rt1, au2, nx, dr0, int, int):void");
    }

    public static final void b(long j, xw2 xw2Var, nx nxVar, dr0 dr0Var, final int i) {
        dr0 dr0Var2;
        final nx nxVar2;
        final xw2 xw2Var2;
        final long j2;
        dr0Var.W(396611577);
        int i2 = (dr0Var.e(j) ? 4 : 2) | i | (dr0Var.f(xw2Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(nxVar) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            dr0Var2 = dr0Var;
            h12.a(j, xw2Var, nxVar, dr0Var2, i2 & 1022);
            j2 = j;
            xw2Var2 = xw2Var;
            nxVar2 = nxVar;
        } else {
            dr0Var2 = dr0Var;
            nxVar2 = nxVar;
            xw2Var2 = xw2Var;
            j2 = j;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: fu2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y02.b(j2, xw2Var2, nxVar2, (dr0) obj, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }

    public static final void c(long j, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(590397809);
        int i2 = (dr0Var.e(j) ? 4 : 2) | i | (dr0Var.h(nxVar) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ys.a(s00.a.a(new kv(j)), nxVar, dr0Var, 8 | (i2 & 112));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new r7(j, nxVar, i);
        }
    }

    public static final void d(dr0 dr0Var, rg1 rg1Var) {
        c8 c8Var = c8.h;
        int iHashCode = Long.hashCode(dr0Var.T);
        rg1 rg1VarU = ls.U(dr0Var, rg1Var);
        dx1 dx1VarL = dr0Var.l();
        sy.f.getClass();
        dr0Var.Y();
        if (dr0Var.S) {
            dr0Var.k(l41.W);
        } else {
            dr0Var.i0();
        }
        h12.y(c5.F, dr0Var, c8Var);
        h12.y(c5.E, dr0Var, dx1VarL);
        h12.t(dr0Var);
        h12.y(c5.D, dr0Var, rg1VarU);
        h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
        dr0Var.p(true);
    }

    public static final void e(dt2 dt2Var, Context context, final boolean z, final String str, final long j) {
        if (qw2.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) s60.w0.h(context2);
        if (list.isEmpty()) {
            return;
        }
        fj1 fj1Var = dt2Var.a;
        fj1 fj1Var2 = dt2Var.a;
        qt2 qt2Var = qt2.b;
        fj1Var.a(qt2Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            fj1Var2.a(new mt2(new p32(i), resolveInfo.loadLabel(packageManager).toString(), 0, new vp0() { // from class: q32
                @Override // defpackage.vp0
                public final Object h(Object obj) {
                    s60.x0.i(context2, resolveInfo, Boolean.valueOf(z), str, new qw2(j));
                    ((rt2) obj).close();
                    return j23.a;
                }
            }));
            i++;
            context2 = context;
        }
        fj1Var2.a(qt2Var);
    }

    public static void f(StringBuilder sb, Object obj, vp0 vp0Var) {
        if (vp0Var != null) {
            sb.append((CharSequence) vp0Var.h(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean g(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !uz0.g(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!g((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!gi.N((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int h(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = h((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    public static final long i() {
        return Thread.currentThread().getId();
    }

    public static final r72 j(qg1 qg1Var, boolean z, boolean z2) {
        if (!qg1Var.h.u) {
            return r72.e;
        }
        if (z) {
            return cu.W(qg1Var, 8).s1();
        }
        pn1 pn1VarW = cu.W(qg1Var, 8);
        return es.D(pn1VarW).M(pn1VarW, z2);
    }

    public static final boolean k(long j, long j2) {
        return j == j2;
    }

    public static e70 l(dr0 dr0Var) {
        float f = xm2.a;
        e90 e90Var = (e90) dr0Var.j(uz.h);
        boolean zC = dr0Var.c(e90Var.b());
        Object objK = dr0Var.K();
        Object obj = zy.a;
        if (zC || objK == obj) {
            objK = new u60(new xl1(e90Var));
            dr0Var.f0(objK);
        }
        u60 u60Var = (u60) objK;
        boolean zF = dr0Var.f(u60Var);
        Object objK2 = dr0Var.K();
        if (zF || objK2 == obj) {
            objK2 = new e70(u60Var);
            dr0Var.f0(objK2);
        }
        return (e70) objK2;
    }

    public static final int m(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int iG = h12.g(sQLiteStatement, str);
        if (iG >= 0) {
            return iG;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + dv.E0(arrayList, null, null, null, null, 63) + ']');
    }

    public static uk2 n() {
        return (uk2) bl2.b.f();
    }

    public static final bm o(su2 su2Var) {
        if (su2Var instanceof su2) {
            return c5.u;
        }
        wg.l(su2Var, "Unknown position: ");
        return null;
    }

    public static final void p(ug2 ug2Var) {
        cu.Y(ug2Var).G();
    }

    public static uk2 q(uk2 uk2Var) {
        if (uk2Var instanceof uz2) {
            uz2 uz2Var = (uz2) uk2Var;
            if (uz2Var.t == i()) {
                uz2Var.r = null;
                return uk2Var;
            }
        }
        if (uk2Var instanceof vz2) {
            vz2 vz2Var = (vz2) uk2Var;
            if (vz2Var.i == i()) {
                vz2Var.h = null;
                return uk2Var;
            }
        }
        uk2 uk2VarE = bl2.e(uk2Var, null, false);
        uk2VarE.j();
        return uk2VarE;
    }

    public static final float r(dr0 dr0Var) {
        long j = ((c13) dr0Var.j(e13.a)).l.b.c;
        long j2 = u03.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((e90) dr0Var.j(uz.h)).L(j) / 2.0f;
    }

    public static Object s(m90 m90Var, kp0 kp0Var) {
        uk2 uz2Var;
        uk2 uk2Var = (uk2) bl2.b.f();
        if (uk2Var instanceof uz2) {
            uz2 uz2Var2 = (uz2) uk2Var;
            if (uz2Var2.t == i()) {
                vp0 vp0Var = uz2Var2.r;
                vp0 vp0Var2 = uz2Var2.s;
                try {
                    ((uz2) uk2Var).r = bl2.i(m90Var, vp0Var, true);
                    ((uz2) uk2Var).s = vp0Var2;
                    return kp0Var.a();
                } finally {
                    uz2Var2.r = vp0Var;
                    uz2Var2.s = vp0Var2;
                }
            }
        }
        if (uk2Var == null || (uk2Var instanceof rj1)) {
            uz2Var = new uz2(uk2Var instanceof rj1 ? (rj1) uk2Var : null, m90Var, null, true, false);
        } else {
            uz2Var = uk2Var.u(m90Var);
        }
        try {
            uk2 uk2VarJ = uz2Var.j();
            try {
                Object objA = kp0Var.a();
                uk2.q(uk2VarJ);
                uz2Var.c();
                return objA;
            } catch (Throwable th) {
                uk2.q(uk2VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            uz2Var.c();
            throw th2;
        }
    }

    public static as2 t(SQLiteConnection sQLiteConnection, String str) {
        long j;
        Map mapB;
        yh2 yh2Var;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (sQLiteStatementPrepare.step()) {
                int iG = h12.g(sQLiteStatementPrepare, "name");
                int iG2 = h12.g(sQLiteStatementPrepare, "type");
                int iG3 = h12.g(sQLiteStatementPrepare, "notnull");
                int iG4 = h12.g(sQLiteStatementPrepare, "pk");
                int iG5 = h12.g(sQLiteStatementPrepare, "dflt_value");
                wd1 wd1Var = new wd1();
                while (true) {
                    String text = sQLiteStatementPrepare.getText(iG);
                    j = j2;
                    wd1Var.put(text, new xr2(text, sQLiteStatementPrepare.getText(iG2), sQLiteStatementPrepare.getLong(iG3) != j2, (int) sQLiteStatementPrepare.getLong(iG4), sQLiteStatementPrepare.isNull(iG5) ? null : sQLiteStatementPrepare.getText(iG5), 2));
                    if (!sQLiteStatementPrepare.step()) {
                        break;
                    }
                    j2 = j;
                }
                mapB = wd1Var.b();
                ie1.j(sQLiteStatementPrepare, null);
            } else {
                mapB = bg0.h;
                ie1.j(sQLiteStatementPrepare, null);
                j = 0;
            }
            SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iG6 = h12.g(sQLiteStatementPrepare2, "id");
                int iG7 = h12.g(sQLiteStatementPrepare2, "seq");
                int iG8 = h12.g(sQLiteStatementPrepare2, "table");
                int iG9 = h12.g(sQLiteStatementPrepare2, "on_delete");
                int iG10 = h12.g(sQLiteStatementPrepare2, "on_update");
                List listT = m02.t(sQLiteStatementPrepare2);
                sQLiteStatementPrepare2.reset();
                yh2 yh2Var2 = new yh2();
                while (sQLiteStatementPrepare2.step()) {
                    if (sQLiteStatementPrepare2.getLong(iG7) == j) {
                        int i = (int) sQLiteStatementPrepare2.getLong(iG6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iG6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listT) {
                            int i3 = iG7;
                            List list = listT;
                            if (((vn0) obj).h == i) {
                                arrayList3.add(obj);
                            }
                            iG7 = i3;
                            listT = list;
                        }
                        int i4 = iG7;
                        List list2 = listT;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            vn0 vn0Var = (vn0) obj2;
                            arrayList.add(vn0Var.j);
                            arrayList2.add(vn0Var.k);
                            arrayList3 = arrayList3;
                        }
                        yh2Var2.add(new yr2(sQLiteStatementPrepare2.getText(iG8), sQLiteStatementPrepare2.getText(iG9), sQLiteStatementPrepare2.getText(iG10), arrayList, arrayList2));
                        iG6 = i2;
                        iG7 = i4;
                        listT = list2;
                    }
                }
                yh2 yh2VarI = r02.i(yh2Var2);
                ie1.j(sQLiteStatementPrepare2, null);
                SQLiteStatement sQLiteStatementPrepare3 = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
                try {
                    int iG11 = h12.g(sQLiteStatementPrepare3, "name");
                    int iG12 = h12.g(sQLiteStatementPrepare3, "origin");
                    int iG13 = h12.g(sQLiteStatementPrepare3, "unique");
                    if (iG11 == -1 || iG12 == -1 || iG13 == -1) {
                        ie1.j(sQLiteStatementPrepare3, null);
                        yh2Var = null;
                    } else {
                        yh2 yh2Var3 = new yh2();
                        while (sQLiteStatementPrepare3.step()) {
                            if ("c".equals(sQLiteStatementPrepare3.getText(iG12))) {
                                zr2 zr2VarU = m02.u(sQLiteConnection, sQLiteStatementPrepare3.getText(iG11), sQLiteStatementPrepare3.getLong(iG13) == 1);
                                if (zr2VarU == null) {
                                    ie1.j(sQLiteStatementPrepare3, null);
                                    yh2Var = null;
                                } else {
                                    yh2Var3.add(zr2VarU);
                                }
                            }
                        }
                        yh2 yh2VarI2 = r02.i(yh2Var3);
                        ie1.j(sQLiteStatementPrepare3, null);
                        yh2Var = yh2VarI2;
                    }
                    return new as2(str, mapB, yh2VarI, yh2Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ie1.j(sQLiteStatementPrepare3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ie1.j(sQLiteStatementPrepare2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ie1.j(sQLiteStatementPrepare, th5);
                throw th6;
            }
        }
    }

    public static void u(uk2 uk2Var, uk2 uk2Var2, vp0 vp0Var) {
        if (uk2Var != uk2Var2) {
            uk2Var2.getClass();
            uk2.q(uk2Var);
            uk2Var2.c();
        } else if (uk2Var instanceof uz2) {
            ((uz2) uk2Var).r = vp0Var;
        } else if (uk2Var instanceof vz2) {
            ((vz2) uk2Var).h = vp0Var;
        } else {
            wg.h(uk2Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void v(ga2 ga2Var) {
        if (((AtomicBoolean) ga2Var.g.k).get()) {
            li1.g("Database is closed");
        }
    }

    public static final Rect w(ry0 ry0Var) {
        return new Rect(ry0Var.a, ry0Var.b, ry0Var.c, ry0Var.d);
    }

    public static final RectF x(r72 r72Var) {
        return new RectF(r72Var.a, r72Var.b, r72Var.c, r72Var.d);
    }

    public static final r72 y(RectF rectF) {
        return new r72(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static String z(long j) {
        return "PointerId(value=" + j + ")";
    }
}
