package defpackage;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ s(hs0 hs0Var, zg zgVar) {
        this.h = (byte) 13;
        this.i = zgVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x028d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0294  */
    /* JADX WARN: Code duplicated, block: B:207:0x049d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x049f A[Catch: all -> 0x04c0, LOOP:9: B:198:0x0473->B:208:0x049f, LOOP_END, TryCatch #0 {, blocks: (B:195:0x0460, B:198:0x0473, B:200:0x047f, B:202:0x0489, B:204:0x048f, B:205:0x0497, B:208:0x049f, B:209:0x04a2, B:211:0x04a8, B:213:0x04ae), top: B:308:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0235 A[LOOP:3: B:84:0x01ff->B:97:0x0235, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0294, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        boolean zG;
        qb2 qb2Var;
        String str;
        char c;
        char c2;
        Object objI0;
        String str2;
        byte b = 12;
        char c3 = 7;
        qq qqVarY = null;
        dsVar = null;
        dsVar = null;
        dsVar = null;
        ds dsVar = null;
        s01 s01Var = null;
        switch (this.h) {
            case 0:
                u uVar = (u) this.i;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uVar.b(0, dr0Var);
                } else {
                    dr0Var.Q();
                }
                return j23.a;
            case 1:
                je2 je2Var = (je2) this.i;
                ie1.p(je2Var.x0(), null, new q0(je2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                li1 li1Var = (li1) this.i;
                r72 r72VarY = y02.y((RectF) obj);
                r72 r72VarY2 = y02.y((RectF) obj2);
                switch (li1Var.h) {
                    case 26:
                        zG = r72VarY.g(r72VarY2);
                        break;
                    default:
                        zG = r72VarY2.a(r72VarY.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 3:
                ((Integer) obj2).getClass();
                ((ty) this.i).b(m02.A(1), (dr0) obj);
                return j23.a;
            case 4:
                dr0 dr0Var2 = (dr0) this.i;
                rg1 rg1Var = (rg1) obj;
                rg1 rg1VarT = (pg1) obj2;
                if (rg1VarT instanceof xy) {
                    aq0 aq0Var = ((xy) rg1VarT).i;
                    t03.k(3, aq0Var);
                    rg1VarT = ls.T(dr0Var2, (rg1) aq0Var.c(og1.h, dr0Var2, 0));
                }
                return rg1Var.c(rg1VarT);
            case 5:
                g82 g82Var = (g82) this.i;
                ((Integer) obj).getClass();
                if (obj2 instanceof hy) {
                    hy hyVar = (hy) obj2;
                    nj1 nj1Var = g82Var.h;
                    if (nj1Var == null) {
                        nj1 nj1Var2 = cd2.a;
                        nj1Var = new nj1();
                        g82Var.h = nj1Var;
                    }
                    nj1Var.k(hyVar);
                    g82Var.f.b(hyVar);
                }
                if (obj2 instanceof hr0) {
                    g82Var.e((hr0) obj2);
                }
                if (obj2 instanceof e72) {
                    ((e72) obj2).c();
                }
                return j23.a;
            case 6:
                ((Integer) obj2).getClass();
                dt.q((kv2) this.i, (dr0) obj, m02.A(1));
                return j23.a;
            case 7:
                return (zm2) this.i;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                mt2 mt2Var = (mt2) this.i;
                dr0 dr0Var3 = (dr0) obj;
                ((Integer) obj2).getClass();
                dr0Var3.V(666084174);
                String str3 = mt2Var.b;
                dr0Var3.p(false);
                return str3;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((Integer) obj2).getClass();
                vs.c((ka0) this.i, (dr0) obj, m02.A(1));
                return j23.a;
            case 10:
                ((Integer) obj2).getClass();
                ((ia0) this.i).b(m02.A(1), (dr0) obj);
                return j23.a;
            case 11:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (dr0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                dr0Var4.Q();
                return j23.a;
            case 12:
                ((Integer) obj2).getClass();
                ((tv0) this.i).a(m02.A(1), (dr0) obj);
                return j23.a;
            case 13:
                zg zgVar = (zg) this.i;
                e90 e90Var = (e90) obj;
                k00 k00Var = (k00) obj2;
                if (k00.i(k00Var.a) == Integer.MAX_VALUE) {
                    dx0.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i = k00.i(k00Var.a);
                int iR = i - (e90Var.R(zgVar.a()) << 1);
                int i2 = iR / 3;
                int i3 = iR % 3;
                ArrayList arrayList = new ArrayList(3);
                int i4 = 0;
                while (i4 < 3) {
                    arrayList.add(Integer.valueOf((i4 < i3 ? 1 : 0) + i2));
                    i4++;
                }
                int[] iArrQ0 = dv.Q0(arrayList);
                int[] iArr = new int[iArrQ0.length];
                zgVar.d(e90Var, i, iArrQ0, u31.h, iArr);
                return new x51(iArrQ0, iArr);
            case 14:
                nb2 nb2Var = (nb2) obj;
                List list = (List) ((zp0) this.i).f(nb2Var, obj2);
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = list.get(i5);
                    if (obj3 != null && (qb2Var = nb2Var.i) != null && !qb2Var.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i5 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 15:
                ((zt2) this.i).e(((up1) obj2).a);
                return j23.a;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                zh1 zh1Var = (zh1) this.i;
                Set set = (Set) obj;
                x72 x72Var = new x72();
                synchronized (zh1Var.a) {
                    mj1 mj1Var = zh1Var.b;
                    qb qbVar = new qb(set, zh1Var, x72Var, b);
                    t03.k(1, qbVar);
                    Object[] objArr = mj1Var.b;
                    long[] jArr = mj1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j & 255) < 128) {
                                        qbVar.h(objArr[(i6 << 3) + i8]);
                                    }
                                    j >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length) {
                                i6++;
                            }
                        }
                    }
                    List list2 = (List) x72Var.h;
                    if (list2 != null) {
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            ((lh2) list2.get(i9)).s(j23.a);
                        }
                    }
                }
                return j23.a;
            case 17:
                ((Integer) obj2).getClass();
                ((m12) this.i).b(m02.A(1), (dr0) obj);
                return j23.a;
            case 18:
                uv0 uv0Var = (uv0) this.i;
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (dr0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    iu0 iu0VarB = ls.h;
                    if (iu0VarB == null) {
                        hu0 hu0Var = new hu0("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = k33.a;
                        rl2 rl2Var = new rl2(kv.b);
                        xl1 xl1Var = new xl1((byte) 3);
                        xl1Var.A(19.0f, 6.41f);
                        xl1Var.y(17.59f, 5.0f);
                        xl1Var.y(12.0f, 10.59f);
                        xl1Var.y(6.41f, 5.0f);
                        xl1Var.y(5.0f, 6.41f);
                        xl1Var.y(10.59f, 12.0f);
                        xl1Var.y(5.0f, 17.59f);
                        xl1Var.y(6.41f, 19.0f);
                        xl1Var.y(12.0f, 13.41f);
                        xl1Var.y(17.59f, 19.0f);
                        xl1Var.y(19.0f, 17.59f);
                        xl1Var.y(13.41f, 12.0f);
                        xl1Var.m();
                        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
                        iu0VarB = hu0Var.b();
                        ls.h = iu0VarB;
                    }
                    iu0 iu0Var = iu0VarB;
                    if (uv0Var == null || (str = uv0Var.b) == null) {
                        str = "";
                    }
                    eu0.a(iu0Var, "移除".concat(str), null, 0L, dr0Var5, 0, 12);
                } else {
                    dr0Var5.Q();
                }
                return j23.a;
            case 19:
                l72 l72Var = (l72) this.i;
                Set set2 = (Set) obj;
                synchronized (l72Var.c) {
                    if (((i72) l72Var.u.getValue()).compareTo(i72.l) >= 0) {
                        nj1 nj1Var3 = l72Var.h;
                        if (set2 instanceof dd2) {
                            nj1 nj1Var4 = ((dd2) set2).h;
                            Object[] objArr2 = nj1Var4.b;
                            long[] jArr2 = nj1Var4.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j2 = jArr2[i11];
                                    if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j2 & 255) < 128) {
                                                Object obj4 = objArr2[(i11 << 3) + i13];
                                                c2 = c3;
                                                if (!(obj4 instanceof rn2) || ((rn2) obj4).e(1)) {
                                                    nj1Var3.a(obj4);
                                                }
                                            } else {
                                                c2 = c3;
                                            }
                                            j2 >>= 8;
                                            i13++;
                                            c3 = c2;
                                        }
                                        c = c3;
                                        if (i12 == 8) {
                                        }
                                    } else {
                                        c = c3;
                                    }
                                    if (i11 != length2) {
                                        i11++;
                                        c3 = c;
                                    }
                                }
                            }
                        } else {
                            for (Object obj5 : set2) {
                                if (!(obj5 instanceof rn2) || ((rn2) obj5).e(1)) {
                                    nj1Var3.a(obj5);
                                }
                            }
                        }
                        qqVarY = l72Var.y();
                    }
                    break;
                }
                if (qqVarY != null) {
                    ((rq) qqVarY).g(j23.a);
                }
                return j23.a;
            case 20:
                db2 db2Var = (db2) this.i;
                int iIntValue4 = ((Integer) obj).intValue();
                m20 m20Var = (m20) obj2;
                n20 key = m20Var.getKey();
                m20 m20VarM = db2Var.l.m(key);
                if (key == c5.Z) {
                    s01 s01Var2 = (s01) m20VarM;
                    s01 parent = (s01) m20Var;
                    while (parent != null) {
                        if (parent == s01Var2 || !(parent instanceof ld2)) {
                            s01Var = parent;
                            if (s01Var == s01Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s01Var + ", expected child of " + s01Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (s01Var2 != null) {
                                iIntValue4++;
                            }
                        } else {
                            ht htVar = (ht) hi.a.getObjectVolatile((ld2) parent, z01.h);
                            parent = htVar != null ? htVar.getParent() : null;
                        }
                    }
                    if (s01Var == s01Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s01Var + ", expected child of " + s01Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (s01Var2 != null) {
                        iIntValue4++;
                    }
                } else if (m20Var != m20VarM) {
                    iIntValue4 = Integer.MIN_VALUE;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 21:
                w72 w72Var = (w72) this.i;
                ((z02) obj).a();
                w72Var.h = ((up1) obj2).a;
                return j23.a;
            case 22:
                uj2 uj2Var = (uj2) this.i;
                Set set3 = (Set) obj;
                synchronized (uj2Var.a) {
                    nj1 nj1Var5 = uj2Var.d;
                    if (nj1Var5 != null) {
                        Object[] objArr3 = nj1Var5.b;
                        long[] jArr3 = nj1Var5.a;
                        int length3 = jArr3.length - 2;
                        if (length3 >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j3 = jArr3[i14];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < i15) {
                                            if ((j3 & 255) >= 128 || !set3.contains(objArr3[(i14 << 3) + i16])) {
                                                j3 >>= 8;
                                                i16++;
                                            } else {
                                                dsVar = uj2Var.f;
                                            }
                                        } else if (i15 == 8) {
                                            if (i14 != length3) {
                                                i14++;
                                            }
                                        }
                                    }
                                } else if (i14 != length3) {
                                    i14++;
                                }
                            }
                        }
                    } else if (dv.v0(set3, uj2Var.b)) {
                        dsVar = uj2Var.f;
                    }
                }
                if (dsVar != null) {
                    dsVar.s(j23.a);
                }
                return j23.a;
            case 23:
                nl2 nl2Var = (nl2) this.i;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = nl2Var.b;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        objI0 = set4;
                    } else if (obj6 instanceof Set) {
                        objI0 = lt.Q(obj6, set4);
                    } else {
                        if (!(obj6 instanceof List)) {
                            ez.b("Unexpected notification");
                            wg.k();
                            return null;
                        }
                        objI0 = dv.I0((Collection) obj6, lt.P(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj6, objI0)) {
                            if (nl2Var.c()) {
                                nl2Var.a.h(new xu1(nl2Var, b));
                            }
                            return j23.a;
                        }
                    } while (atomicReference.get() == obj6);
                }
                break;
            case 24:
                char[] cArr = (char[]) this.i;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iW = co2.W(charSequence, cArr, iIntValue5, false);
                if (iW >= 0) {
                    return new wt1(Integer.valueOf(iW), 1);
                }
                return null;
            case 25:
                TextClassification textClassification = (TextClassification) this.i;
                dr0 dr0Var6 = (dr0) obj;
                ((Integer) obj2).intValue();
                dr0Var6.V(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                dr0Var6.p(false);
                return strValueOf;
            case 26:
                RemoteAction remoteAction = (RemoteAction) this.i;
                dr0 dr0Var7 = (dr0) obj;
                ((Integer) obj2).intValue();
                dr0Var7.V(-1376593684);
                String string = remoteAction.getTitle().toString();
                dr0Var7.p(false);
                return string;
            case 27:
                iu1 iu1Var = (iu1) this.i;
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (dr0Var8.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    int i17 = 0;
                    for (Object obj7 : lt.Q("总览", "营养", "采购")) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            lt.h0();
                            throw null;
                        }
                        String str4 = (String) obj7;
                        boolean z = iu1Var.g() == i17;
                        boolean zF = dr0Var8.f(iu1Var) | dr0Var8.d(i17);
                        Object objK = dr0Var8.K();
                        if (zF || objK == zy.a) {
                            objK = new j60(i17, iu1Var);
                            dr0Var8.f0(objK);
                        }
                        pr2.b(24576, 0L, 0L, dt.N(1863152793, new xn0(str4, (byte) 6), dr0Var8), (kp0) objK, dr0Var8, null, z, false);
                        i17 = i18;
                    }
                } else {
                    dr0Var8.Q();
                }
                return j23.a;
            case 28:
                ((Integer) obj2).getClass();
                m63.g((p63) this.i, (dr0) obj, m02.A(9));
                return j23.a;
            default:
                dy1 dy1Var = (dy1) this.i;
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (dr0Var9.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    if (dy1Var == null || (str2 = dy1Var.b) == null) {
                        str2 = "";
                    }
                    gw2.b(str2.concat(" · 体重记录"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 0, 0, 262142);
                } else {
                    dr0Var9.Q();
                }
                return j23.a;
        }
    }

    public /* synthetic */ s(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    public /* synthetic */ s(Object obj, int i, byte b) {
        this.h = b;
        this.i = obj;
    }
}
