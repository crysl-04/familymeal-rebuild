package defpackage;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Magnifier;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class xl1 implements ak0, bb2, SupportSQLiteQuery, sg, jd, r33 {
    public final /* synthetic */ byte h;
    public Object i;

    public xl1(long[] jArr) {
        wi1 wi1Var;
        this.h = (byte) 9;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            wi1Var = new wi1(jArrCopyOf.length);
            int i = wi1Var.b;
            if (i < 0) {
                wg.i("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = wi1Var.a;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    wi1Var.a = jArrCopyOf2;
                }
                int i2 = wi1Var.b;
                if (i != i2) {
                    gi.P(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                }
                gi.P(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                wi1Var.b += jArrCopyOf.length;
            }
        } else {
            wi1Var = new wi1();
        }
        this.i = wi1Var;
    }

    public final void A(float f, float f2) {
        ((ArrayList) this.i).add(new gv1(f, f2));
    }

    public final ix0 B(ix0 ix0Var, t6 t6Var) {
        long j;
        boolean z;
        long jF;
        tc1 tc1Var = (tc1) this.i;
        ArrayList arrayList = (ArrayList) ix0Var.i;
        tc1 tc1Var2 = new tc1(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b12 b12Var = (b12) arrayList.get(i);
            long j2 = b12Var.a;
            a12 a12Var = (a12) tc1Var.a(j2);
            if (a12Var == null) {
                j = b12Var.b;
                jF = b12Var.d;
                z = false;
            } else {
                long j3 = a12Var.a;
                j = j3;
                z = a12Var.c;
                jF = t6Var.F(a12Var.b);
            }
            long j4 = b12Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            tc1Var2.c(j4, new z02(j4, b12Var.b, b12Var.d, b12Var.e, b12Var.f, j, jF, z, b12Var.g, b12Var.i, b12Var.j, b12Var.k, b12Var.l, b12Var.m));
            boolean z2 = b12Var.e;
            if (z2) {
                tc1Var.c(j2, new a12(b12Var.b, b12Var.c, z2));
            } else {
                tc1Var.d(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new ix0(tc1Var2, ix0Var, (byte) 17, false);
    }

    public final void C(float f, float f2, float f3, float f4) {
        ((ArrayList) this.i).add(new iv1(f, f2, f3, f4));
    }

    public final void D(float f, float f2, float f3, float f4) {
        ((ArrayList) this.i).add(new qv1(f, f2, f3, f4));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[LOOP:0: B:20:0x004f->B:32:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[EDGE_INSN: B:50:0x0097->B:33:0x0097 BREAK  A[LOOP:0: B:20:0x004f->B:32:0x0094], SYNTHETIC] */
    public final Object E(ds dsVar, kp0 kp0Var) {
        uj2 uj2Var;
        ds dsVar2;
        if (((qy) this.i) == null) {
            w12.b("Called runAndWatch on a manager that has been disposed of");
        }
        qy qyVar = (qy) this.i;
        if ((qyVar instanceof uj2) && (dsVar2 = (uj2Var = (uj2) qyVar).f) != null && !dsVar2.equals(dsVar)) {
            zh1 zh1Var = new zh1();
            ds dsVar3 = uj2Var.f;
            if (dsVar3 == null) {
                w12.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            nj1 nj1Var = uj2Var.d;
            ArrayList arrayList = zh1Var.c;
            if (nj1Var != null) {
                Object[] objArr = nj1Var.b;
                long[] jArr = nj1Var.a;
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
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new wh1(objArr[(i << 3) + i4], dsVar3));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = uj2Var.b;
                obj.getClass();
                arrayList.add(new wh1(obj, dsVar3));
            }
            zh1Var.e();
            uj2Var.f();
            this.i = zh1Var;
        }
        qy qyVar2 = (qy) this.i;
        qyVar2.getClass();
        uk2 uk2VarU = bl2.h().u(qyVar2.l(dsVar));
        qyVar2.d(dsVar);
        try {
            uk2 uk2VarJ = uk2VarU.j();
            try {
                Object objA = kp0Var.a();
                uk2.q(uk2VarJ);
                uk2VarU.c();
                qyVar2.e();
                return objA;
            } catch (Throwable th) {
                uk2.q(uk2VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            uk2VarU.c();
            throw th2;
        }
    }

    public final void F(ry0 ry0Var) {
        ((Region) this.i).set(ry0Var.a, ry0Var.b, ry0Var.c, ry0Var.d);
    }

    public void G() {
        View viewFindViewById;
        View view = (View) this.i;
        if (view != null) {
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new t(viewFindViewById, (byte) 11));
        }
    }

    public final void H(float f) {
        ((ArrayList) this.i).add(new tv1(f));
    }

    public final void I(float f) {
        ((ArrayList) this.i).add(new sv1(f));
    }

    @Override // defpackage.r33, defpackage.o33
    public final boolean a() {
        return false;
    }

    @Override // defpackage.o33
    public final long b(id idVar, id idVar2, id idVar3) {
        return ((wk) this.i).b(idVar, idVar2, idVar3);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        dq2 dq2Var = (dq2) this.i;
        int length = dq2Var.k.length;
        for (int i = 1; i < length; i++) {
            int i2 = dq2Var.k[i];
            if (i2 == 1) {
                supportSQLiteProgram.bindLong(i, dq2Var.l[i]);
            } else if (i2 == 2) {
                supportSQLiteProgram.bindDouble(i, dq2Var.m[i]);
            } else if (i2 == 3) {
                String str = dq2Var.n[i];
                str.getClass();
                supportSQLiteProgram.bindString(i, str);
            } else if (i2 == 4) {
                byte[] bArr = dq2Var.o[i];
                bArr.getClass();
                supportSQLiteProgram.bindBlob(i, bArr);
            } else if (i2 == 5) {
                supportSQLiteProgram.bindNull(i);
            }
        }
    }

    @Override // defpackage.ak0
    public final long c(float f) {
        return ((long) (Math.exp(((vj0) this.i).b(f) / 1.3582017421722412d) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.ak0
    public final float d() {
        return 0.0f;
    }

    @Override // defpackage.sg
    public final Object e(w71 w71Var, Float f, Float f2, lk2 lk2Var, ok2 ok2Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objG = r02.g(w71Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, ie1.b(0.0f, fFloatValue2, 28), (zm2) this.i, lk2Var, ok2Var);
        return objG == y20.h ? objG : (zc) objG;
    }

    @Override // defpackage.ak0
    public final float f(float f, float f2) {
        vj0 vj0Var = (vj0) this.i;
        double dB = vj0Var.b(f2);
        return (Math.signum(f2) * ((float) (Math.exp(1.7362676463664735d * dB) * ((double) (vj0Var.h * vj0Var.i))))) + f;
    }

    @Override // defpackage.ak0
    public final float g(float f, long j) {
        long j2 = j / 1000000;
        uj0 uj0VarA = ((vj0) this.i).a(f);
        long j3 = uj0VarA.c;
        return (((Math.signum(uj0VarA.a) * o8.a(j3 > 0 ? j2 / j3 : 1.0f).b) * uj0VarA.b) / j3) * 1000.0f;
    }

    @Override // defpackage.jd
    public final xj0 get(int i) {
        switch (this.h) {
            case 19:
                return ((ek0[]) this.i)[i];
            case 20:
                return (ek0) this.i;
            default:
                return (xj0) this.i;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String getSql() {
        return ((dq2) this.i).i;
    }

    @Override // defpackage.ak0
    public final float h(float f, float f2, long j) {
        long j2 = j / 1000000;
        uj0 uj0VarA = ((vj0) this.i).a(f2);
        long j3 = uj0VarA.c;
        return (Math.signum(uj0VarA.a) * uj0VarA.b * o8.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    public final long i(long j) {
        id1 id1Var = (id1) this.i;
        if (a43.b(j) <= 0.0f || a43.c(j) <= 0.0f) {
            ax0.b("maximumVelocity should be a positive value. You specified=".concat(a43.f(j)));
        }
        return p02.c(id1Var.a.c(a43.b(j)), id1Var.b.c(a43.c(j)));
    }

    public final void j(String str) {
        j53 j53Var = (j53) ((yq2) ((eg) this.i).k).getValue();
        i53 i53Var = (i53) j53Var.b.g(str);
        if (i53Var != null) {
            i53Var.c = true;
            i53 i53Var2 = (i53) j53Var.b.l(str);
            if (i53Var2 != null) {
                i53Var2.b.a();
            }
        }
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        return ((wk) this.i).l(j, idVar, idVar2, idVar3);
    }

    public final void m() {
        ((ArrayList) this.i).add(cv1.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void n(js jsVar, n10 n10Var) {
        pp1 pp1Var;
        if (n10Var instanceof pp1) {
            pp1Var = (pp1) n10Var;
            int i = pp1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp1Var.m = i - Integer.MIN_VALUE;
            } else {
                pp1Var = new pp1(this, n10Var);
            }
        } else {
            pp1Var = new pp1(this, n10Var);
        }
        Object obj = pp1Var.k;
        int i2 = pp1Var.m;
        if (i2 == 0) {
            m02.y(obj);
            nn2 nn2Var = (nn2) this.i;
            pp1Var.m = 1;
            nn2Var.a(jsVar, pp1Var);
            return;
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
        } else {
            m02.y(obj);
            wg.k();
        }
    }

    @Override // defpackage.bb2
    public final SQLiteConnection open(String str) {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = (SupportSQLiteOpenHelper) this.i;
        String databaseName = supportSQLiteOpenHelper.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
                li1.e(wi0.h("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !co2.d0(databaseName).equals(co2.d0(str))) {
            li1.e(jp1.k("This driver is configured to open a database named '", supportSQLiteOpenHelper.getDatabaseName(), "' but '", str, "' was requested."));
            return null;
        }
        return new aq2(supportSQLiteOpenHelper.getWritableDatabase());
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        return ((wk) this.i).p(j, idVar, idVar2, idVar3);
    }

    @Override // defpackage.o33
    public final id q(id idVar, id idVar2, id idVar3) {
        return ((wk) this.i).q(idVar, idVar2, idVar3);
    }

    public final void r(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.i).add(new dv1(f, f2, f3, f4, f5, f6));
    }

    public final void s(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.i).add(new lv1(f, f2, f3, f4, f5, f6));
    }

    /* JADX WARN: Code duplicated, block: B:307:0x0897  */
    public final az1 t(c63 c63Var) {
        double d;
        LinkedHashMap linkedHashMap;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        int i5;
        c63Var.getClass();
        ArrayList arrayList = new ArrayList();
        sy1 sy1Var = (sy1) this.i;
        ArrayList arrayList2 = sy1Var.h;
        bz1 bz1Var = sy1Var.a;
        ArrayList arrayList3 = sy1Var.g;
        LinkedHashMap linkedHashMap2 = sy1Var.d;
        lz1 lz1Var = sy1Var.b;
        LinkedHashMap linkedHashMap3 = c63Var.a;
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            ek2 ek2Var = (ek2) entry.getKey();
            List<String> list = (List) entry.getValue();
            for (String str : list) {
                if (!linkedHashMap2.containsKey(str)) {
                    arrayList.add(ek2Var + ": unknown recipe " + str);
                }
            }
            if (!list.isEmpty() && !arrayList3.contains(ek2Var)) {
                arrayList.add(ek2Var + ": dishes in an inactive slot");
            }
            if (dv.U0(list).size() != list.size()) {
                arrayList.add(ek2Var + ": duplicate dish");
            }
        }
        int size = arrayList3.size();
        int i6 = 0;
        while (true) {
            List list2 = ag0.h;
            if (i6 >= size) {
                ArrayList arrayList4 = arrayList2;
                Collection collectionValues = linkedHashMap3.values();
                collectionValues.getClass();
                ArrayList arrayList5 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    iv.q0((Iterable) it.next(), arrayList5);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = arrayList5.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList5.get(i7);
                    i7++;
                    String str2 = (String) obj2;
                    Object v72Var = linkedHashMap4.get(str2);
                    if (v72Var == null && !linkedHashMap4.containsKey(str2)) {
                        v72Var = new v72();
                    }
                    v72 v72Var2 = (v72) v72Var;
                    v72Var2.h++;
                    linkedHashMap4.put(str2, v72Var2);
                }
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    entry2.getClass();
                    if ((entry2 instanceof l21) && !(entry2 instanceof m21)) {
                        t03.P(entry2, "kotlin.collections.MutableMap.MutableEntry");
                        throw null;
                    }
                    entry2.setValue(Integer.valueOf(((v72) entry2.getValue()).h));
                }
                for (Map.Entry entry3 : t03.j(linkedHashMap4).entrySet()) {
                    String str3 = (String) entry3.getKey();
                    int iIntValue = ((Number) entry3.getValue()).intValue();
                    j62 j62Var = (j62) linkedHashMap2.get(str3);
                    if (j62Var != null && !sy1Var.f(j62Var) && iIntValue > lz1Var.b) {
                        arrayList.add(str3 + " used " + iIntValue + " times");
                    }
                }
                List listQ = lt.Q(te1.LUNCH, te1.DINNER);
                boolean z = lz1Var.d;
                lh0 lh0Var = p60.p;
                if (z) {
                    Iterator it2 = listQ.iterator();
                    while (it2.hasNext()) {
                        te1 te1Var = (te1) it2.next();
                        int iA = lh0Var.a() - 1;
                        int i8 = 0;
                        while (i8 < iA) {
                            List list3 = listQ;
                            int i9 = i8 + 1;
                            Iterator it3 = it2;
                            LinkedHashSet linkedHashSetB0 = dv.B0(dv.U0(c63Var.a((p60) lh0Var.get(i8), te1Var)), dv.U0(c63Var.a((p60) lh0Var.get(i9), te1Var)));
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it4 = linkedHashSetB0.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                Object next = it5.next();
                                List list4 = list2;
                                j62 j62Var2 = (j62) linkedHashMap2.get((String) next);
                                if (j62Var2 != null && !sy1Var.f(j62Var2)) {
                                    arrayList6.add(next);
                                }
                                it4 = it5;
                                list2 = list4;
                            }
                            List list5 = list2;
                            int size3 = arrayList6.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj3 = arrayList6.get(i10);
                                int i11 = i10 + 1;
                                te1 te1Var2 = te1Var;
                                int i12 = i9;
                                arrayList.add(((String) obj3) + " on consecutive " + te1Var.h + " " + ((p60) lh0Var.get(i8)).h + "/" + ((p60) lh0Var.get(i9)).h);
                                i10 = i11;
                                size3 = size3;
                                iA = iA;
                                te1Var = te1Var2;
                                i9 = i12;
                            }
                            int i13 = i9;
                            listQ = list3;
                            it2 = it3;
                            list2 = list5;
                            i8 = i13;
                        }
                    }
                }
                List list6 = listQ;
                List list7 = list2;
                if (lz1Var.e) {
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        te1 te1Var3 = (te1) it6.next();
                        int iD = sy1Var.d(te1Var3);
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size4) {
                            Object obj4 = arrayList3.get(i14);
                            i14++;
                            Iterator it7 = it6;
                            if (((ek2) obj4).b == te1Var3) {
                                arrayList7.add(obj4);
                            }
                            it6 = it7;
                        }
                        Iterator it8 = it6;
                        int size5 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size5) {
                            int i16 = i15 + 1;
                            int size6 = arrayList7.size();
                            int i17 = i16;
                            while (i17 < size6) {
                                int i18 = size5;
                                List list8 = (List) linkedHashMap3.get(arrayList7.get(i15));
                                if (list8 == null) {
                                    list8 = list7;
                                }
                                Set setU0 = dv.U0(list8);
                                ArrayList arrayList8 = arrayList3;
                                List list9 = (List) linkedHashMap3.get(arrayList7.get(i17));
                                if (list9 == null) {
                                    list9 = list7;
                                }
                                LinkedHashSet linkedHashSetB1 = dv.B0(setU0, dv.U0(list9));
                                if (linkedHashSetB1.isEmpty()) {
                                    i3 = 0;
                                } else {
                                    Iterator it9 = linkedHashSetB1.iterator();
                                    i3 = 0;
                                    while (it9.hasNext()) {
                                        Iterator it10 = it9;
                                        j62 j62Var3 = (j62) linkedHashMap2.get((String) it9.next());
                                        if (j62Var3 != null && !sy1Var.f(j62Var3) && (i3 = i3 + 1) < 0) {
                                            lt.g0();
                                            throw null;
                                        }
                                        it9 = it10;
                                    }
                                }
                                if (iD > 0 && i3 >= iD) {
                                    arrayList.add(arrayList7.get(i15) + " and " + arrayList7.get(i17) + " share " + i3 + " dishes");
                                }
                                i17++;
                                size5 = i18;
                                arrayList3 = arrayList8;
                                i15 = i15;
                                iD = iD;
                            }
                            i15 = i16;
                        }
                        it6 = it8;
                    }
                }
                if (lz1Var.j && !arrayList4.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    int size7 = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size7) {
                        ArrayList arrayList10 = arrayList4;
                        Object obj5 = arrayList10.get(i19);
                        i19++;
                        List list10 = (List) linkedHashMap3.get((ek2) obj5);
                        if (list10 == null) {
                            list10 = list7;
                        }
                        iv.q0(list10, arrayList9);
                        arrayList4 = arrayList10;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int size8 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size8) {
                        Object obj6 = arrayList9.get(i20);
                        i20++;
                        j62 j62Var4 = (j62) linkedHashMap2.get((String) obj6);
                        if (j62Var4 != null) {
                            arrayList11.add(j62Var4);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        i = 0;
                    } else {
                        int size9 = arrayList11.size();
                        i = 0;
                        int i21 = 0;
                        while (i21 < size9) {
                            Object obj7 = arrayList11.get(i21);
                            i21++;
                            if (sy1.e((j62) obj7) && (i = i + 1) < 0) {
                                lt.g0();
                                throw null;
                            }
                        }
                    }
                    if (i != 1) {
                        arrayList.add("weekend lunches: need exactly 1 fish");
                    }
                    if (arrayList11.isEmpty()) {
                        i2 = 0;
                    } else {
                        int size10 = arrayList11.size();
                        i2 = 0;
                        int i22 = 0;
                        while (i22 < size10) {
                            Object obj8 = arrayList11.get(i22);
                            i22++;
                            j62 j62Var5 = (j62) obj8;
                            j62Var5.getClass();
                            if (j62Var5.i.contains("shrimp") && (i2 = i2 + 1) < 0) {
                                lt.g0();
                                throw null;
                            }
                        }
                    }
                    if (i2 != 1) {
                        arrayList.add("weekend lunches: need exactly 1 shrimp");
                    }
                }
                wu wuVar = lz1Var.m;
                Iterator it11 = c63Var.b.entrySet().iterator();
                while (it11.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it11.next();
                    q12 q12Var = (q12) entry4.getKey();
                    double dDoubleValue = ((Number) entry4.getValue()).doubleValue();
                    String str4 = q12Var.c;
                    String str5 = q12Var.b;
                    ek2 ek2Var2 = q12Var.a;
                    j62 j62Var6 = (j62) linkedHashMap2.get(str4);
                    Iterator it12 = it11;
                    if (j62Var6 != null) {
                        zr zrVar = j62Var6.d;
                        List list11 = (List) linkedHashMap3.get(ek2Var2);
                        linkedHashMap = linkedHashMap3;
                        if ((list11 == null ? list7 : list11).contains(q12Var.c)) {
                            zr zrVar2 = zr.n;
                            if (zrVar != zrVar2 && dDoubleValue != 1.0d) {
                                arrayList.add(ek2Var2 + ": portion for non-staple " + j62Var6.a);
                            } else if (!sy1Var.a(ek2Var2).contains(str5)) {
                                arrayList.add(ek2Var2 + ": portion for non-diner " + str5);
                            } else if (zrVar == zrVar2 && (dDoubleValue < ((Number) wuVar.a()).doubleValue() - 1.0E-6d || dDoubleValue > ((Number) wuVar.b()).doubleValue() + 1.0E-6d)) {
                                arrayList.add(ek2Var2 + ": staple portion " + dDoubleValue + " outside " + wuVar);
                            }
                        }
                        it11 = it12;
                        linkedHashMap3 = linkedHashMap;
                    } else {
                        linkedHashMap = linkedHashMap3;
                    }
                    arrayList.add(ek2Var2 + ": portion for a dish not in the slot");
                    it11 = it12;
                    linkedHashMap3 = linkedHashMap;
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it13 = bz1Var.c.iterator();
                double d2 = 0.0d;
                while (it13.hasNext()) {
                    rx1 rx1Var = (rx1) it13.next();
                    lh0Var.getClass();
                    z zVar = new z(lh0Var, (byte) 0);
                    while (zVar.hasNext()) {
                        p60 p60Var = (p60) zVar.next();
                        ArrayList arrayList13 = new ArrayList();
                        lh0 lh0Var2 = te1.o;
                        lh0Var2.getClass();
                        it13 = it13;
                        lh0Var = lh0Var;
                        z zVar2 = new z(lh0Var2, (byte) 0);
                        while (zVar2.hasNext()) {
                            Object next2 = zVar2.next();
                            te1 te1Var4 = (te1) next2;
                            p60Var.getClass();
                            te1Var4.getClass();
                            z zVar3 = zVar2;
                            if (bz1Var.d.a(p60Var, te1Var4).contains(rx1Var.a)) {
                                arrayList13.add(next2);
                            }
                            zVar2 = zVar3;
                        }
                        if (!arrayList13.isEmpty()) {
                            ArrayList arrayList14 = new ArrayList();
                            int size11 = arrayList13.size();
                            int i23 = 0;
                            while (i23 < size11) {
                                Object obj9 = arrayList13.get(i23);
                                i23++;
                                bz1 bz1Var2 = bz1Var;
                                te1 te1Var5 = (te1) obj9;
                                ArrayList arrayList15 = arrayList13;
                                List listA = c63Var.a(p60Var, te1Var5);
                                int i24 = size11;
                                double d3 = d2;
                                ArrayList arrayList16 = new ArrayList(ev.o0(listA, 10));
                                Iterator it14 = listA.iterator();
                                while (it14.hasNext()) {
                                    arrayList16.add(new wt1(new ek2(p60Var, te1Var5), (String) it14.next()));
                                    te1Var5 = te1Var5;
                                }
                                iv.q0(arrayList16, arrayList14);
                                size11 = i24;
                                d2 = d3;
                                arrayList13 = arrayList15;
                                bz1Var = bz1Var2;
                            }
                            bz1 bz1Var3 = bz1Var;
                            ArrayList arrayList17 = arrayList13;
                            double d4 = d2;
                            ArrayList arrayList18 = new ArrayList();
                            int size12 = arrayList14.size();
                            int i25 = 0;
                            while (i25 < size12) {
                                Object obj10 = arrayList14.get(i25);
                                i25++;
                                wt1 wt1Var = (wt1) obj10;
                                ek2 ek2Var3 = (ek2) wt1Var.h;
                                String str6 = (String) wt1Var.i;
                                j62 j62Var7 = (j62) linkedHashMap2.get(str6);
                                bp1 bp1VarC = j62Var7 != null ? j62Var7.b().c(c63Var.b(ek2Var3, rx1Var.a, str6)) : null;
                                if (bp1VarC != null) {
                                    arrayList18.add(bp1VarC);
                                }
                                arrayList14 = arrayList14;
                            }
                            int size13 = arrayList18.size();
                            bp1 bp1VarB = bp1.f;
                            int i26 = 0;
                            while (i26 < size13) {
                                Object obj11 = arrayList18.get(i26);
                                i26++;
                                bp1VarB = bp1VarB.b((bp1) obj11);
                            }
                            e40 e40VarG = sy1Var.g(rx1Var, p60Var);
                            lh0 lh0Var3 = zo1.n;
                            lh0Var3.getClass();
                            z zVar4 = new z(lh0Var3, (byte) 0);
                            double dDoubleValue2 = 0.0d;
                            while (zVar4.hasNext()) {
                                zo1 zo1Var = (zo1) zVar4.next();
                                ap1 ap1VarA = e40VarG.a(zo1Var);
                                double dA = bp1VarB.a(zo1Var);
                                p60 p60Var2 = p60Var;
                                bp1 bp1Var = bp1VarB;
                                double d5 = ap1VarA.a;
                                if (dA < d5) {
                                    d = d5 - dA;
                                } else if (ap1VarA.a()) {
                                    double d6 = ap1VarA.b;
                                    if (dA > d6) {
                                        d = dA - d6;
                                    } else {
                                        d = 0.0d;
                                    }
                                } else {
                                    d = 0.0d;
                                }
                                Double d7 = (Double) lz1Var.l.get(zo1Var);
                                dDoubleValue2 = ((d7 != null ? d7.doubleValue() : 0.0d) * d) + dDoubleValue2;
                                p60Var = p60Var2;
                                bp1VarB = bp1Var;
                            }
                            arrayList12.add(new zy1(rx1Var.a, p60Var, bp1VarB, dDoubleValue2, e40VarG, arrayList17));
                            d2 = d4 + dDoubleValue2;
                            bz1Var = bz1Var3;
                        }
                    }
                }
                return new az1(d2, arrayList, arrayList12);
            }
            Object obj12 = arrayList3.get(i6);
            int i27 = i6 + 1;
            ek2 ek2Var4 = (ek2) obj12;
            List list12 = (List) linkedHashMap3.get(ek2Var4);
            if (list12 != null) {
                list2 = list12;
            }
            ArrayList arrayList19 = new ArrayList();
            Iterator it15 = list2.iterator();
            while (it15.hasNext()) {
                j62 j62Var8 = (j62) linkedHashMap2.get((String) it15.next());
                if (j62Var8 != null) {
                    arrayList19.add(j62Var8);
                }
            }
            int size14 = arrayList19.size();
            int i28 = 0;
            while (i28 < size14) {
                Object obj13 = arrayList19.get(i28);
                i28++;
                int i29 = size;
                j62 j62Var9 = (j62) obj13;
                int i30 = size14;
                if (!sy1Var.c.contains(j62Var9)) {
                    arrayList.add(ek2Var4 + ": " + j62Var9.a + " out of season");
                } else if (!sy1Var.b(j62Var9, ek2Var4)) {
                    arrayList.add(ek2Var4 + ": " + j62Var9.a + " not eligible");
                }
                size14 = i30;
                size = i29;
            }
            int i31 = size;
            Map map = (Map) lz1Var.a.get(ek2Var4.b);
            if (map == null) {
                map = bg0.h;
            }
            Iterator it16 = map.entrySet().iterator();
            while (it16.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it16.next();
                zr zrVar3 = (zr) entry5.getKey();
                qy0 qy0Var = (qy0) entry5.getValue();
                if (arrayList19.isEmpty()) {
                    i5 = 0;
                } else {
                    int size15 = arrayList19.size();
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < size15) {
                        Object obj14 = arrayList19.get(i32);
                        i32++;
                        int i34 = size15;
                        if (((j62) obj14).d == zrVar3 && (i33 = i33 + 1) < 0) {
                            lt.g0();
                            throw null;
                        }
                        size15 = i34;
                    }
                    i5 = i33;
                }
                int i35 = qy0Var.h;
                ArrayList arrayList20 = arrayList2;
                if (i5 > qy0Var.i || i35 > i5) {
                    arrayList.add(ek2Var4 + ": " + i5 + " x " + zrVar3.h + ", expected " + qy0Var);
                }
                it16 = it16;
                arrayList2 = arrayList20;
                i27 = i27;
            }
            ArrayList arrayList21 = arrayList2;
            int i36 = i27;
            Set<String> set = (Set) bz1Var.g.get(ek2Var4);
            if (set != null) {
                for (String str7 : set) {
                    if (!arrayList19.isEmpty()) {
                        int size16 = arrayList19.size();
                        int i37 = 0;
                        do {
                            if (i37 < size16) {
                                obj = arrayList19.get(i37);
                                i37++;
                            }
                        } while (!uz0.g(((j62) obj).a, str7));
                    }
                    arrayList.add(ek2Var4 + ": locked " + str7 + " missing");
                }
            }
            vp0 vp0VarC = sy1Var.c(ek2Var4);
            if (vp0VarC != null) {
                if (arrayList19.isEmpty()) {
                    i4 = 0;
                } else {
                    int size17 = arrayList19.size();
                    i4 = 0;
                    int i38 = 0;
                    while (i38 < size17) {
                        Object obj15 = arrayList19.get(i38);
                        i38++;
                        if (((Boolean) vp0VarC.h(obj15)).booleanValue() && (i4 = i4 + 1) < 0) {
                            lt.g0();
                            throw null;
                        }
                    }
                }
                if (i4 != 1) {
                    arrayList.add(ek2Var4 + ": fish slot requirement not met");
                }
            }
            size = i31;
            arrayList2 = arrayList21;
            i6 = i36;
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "NavControllerViewModel(provider=" + ((eg) this.i) + ")";
            default:
                return super.toString();
        }
    }

    public final long u() {
        Magnifier magnifier = (Magnifier) this.i;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    public void v() {
        View view = (View) this.i;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final void w(float f) {
        ((ArrayList) this.i).add(new ev1(f));
    }

    public final void x(float f) {
        ((ArrayList) this.i).add(new mv1(f));
    }

    public final void y(float f, float f2) {
        ((ArrayList) this.i).add(new fv1(f, f2));
    }

    public final void z(float f, float f2) {
        ((ArrayList) this.i).add(new nv1(f, f2));
    }

    public /* synthetic */ xl1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    public xl1(float f, float f2, id idVar) {
        jd xl1Var;
        this.h = (byte) 22;
        int[] iArr = p33.a;
        if (idVar == null && f == 1.0f && f2 == 1500.0f) {
            xl1Var = a80.h;
        } else if (idVar != null) {
            xl1Var = new xl1(idVar, f, f2);
        } else {
            xl1Var = new xl1(f, f2);
        }
        this.i = new wk(xl1Var);
    }

    public xl1(bz1 bz1Var) {
        this.h = (byte) 4;
        this.i = new sy1(bz1Var);
    }

    public xl1(byte b) {
        this.h = b;
        switch (b) {
            case 6:
                this.i = new tc1();
                break;
            case 7:
                this.i = new Region();
                break;
            case 23:
                this.i = new id1();
                break;
            default:
                this.i = new ArrayList(32);
                break;
        }
    }

    public xl1(e90 e90Var) {
        this.h = (byte) 12;
        this.i = new vj0(xm2.a, e90Var);
    }

    public xl1(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.h = (byte) 13;
        supportSQLiteOpenHelper.getClass();
        this.i = supportSQLiteOpenHelper;
    }

    public xl1(View view) {
        this.h = (byte) 11;
        if (Build.VERSION.SDK_INT >= 30) {
            ql2 ql2Var = new ql2(view, (byte) 10);
            ql2Var.j = view;
            this.i = ql2Var;
            return;
        }
        this.i = new xl1((Object) view, (byte) 10);
    }

    public /* synthetic */ xl1(byte b, boolean z) {
        this.h = b;
    }

    public xl1(int i) {
        this.h = (byte) 2;
        this.i = h7.N(new int[i]);
    }

    public xl1(id idVar, float f, float f2) {
        this.h = (byte) 19;
        int iB = idVar.b();
        ek0[] ek0VarArr = new ek0[iB];
        for (int i = 0; i < iB; i++) {
            ek0VarArr[i] = new ek0(f, f2, idVar.a(i));
        }
        this.i = ek0VarArr;
    }

    public xl1(float f, float f2) {
        this.h = (byte) 20;
        this.i = new ek0(f, f2);
    }
}
