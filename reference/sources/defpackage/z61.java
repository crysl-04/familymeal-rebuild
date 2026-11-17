package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z61 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ z61(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        u71 u71Var;
        Bundle bundle;
        Throwable th;
        p81 p81Var;
        float f = 0.0f;
        byte b = 8;
        boolean z = false;
        boolean zC = true;
        Throwable th2 = null;
        switch (this.h) {
            case 0:
                return new w3((y61) this.i, (byte) 9);
            case 1:
                Object obj2 = this.i;
                ((Integer) obj).getClass();
                return obj2;
            case 2:
                s71 s71Var = (s71) this.i;
                return s71Var.q(((Integer) obj).intValue(), s71Var.d);
            case 3:
                b81 b81Var = (b81) this.i;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || b81Var.c()) && (f2 <= 0.0f || b81Var.a())) {
                    if (Math.abs(b81Var.h) > 0.5f) {
                        dx0.c("entered drag with non-zero pending scroll");
                    }
                    b81Var.d = true;
                    float f3 = b81Var.h + f2;
                    b81Var.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = b81Var.h;
                        int iRound = Math.round(f4);
                        u71 u71VarH = ((u71) b81Var.f.getValue()).h(iRound, !b81Var.b);
                        if (u71VarH != null && (u71Var = b81Var.c) != null) {
                            u71 u71VarH2 = u71Var.h(iRound, true);
                            if (u71VarH2 != null) {
                                b81Var.c = u71VarH2;
                            } else {
                                u71VarH = null;
                            }
                        }
                        if (u71VarH != null) {
                            b81Var.g(u71VarH, b81Var.b, true);
                            b81Var.w.setValue(j23.a);
                            b81Var.k(f4 - b81Var.h, u71VarH);
                        } else {
                            l41 l41Var = b81Var.l;
                            if (l41Var != null) {
                                l41Var.k();
                            }
                            b81Var.k(f4 - b81Var.h, b81Var.j());
                        }
                    }
                    if (Math.abs(b81Var.h) > 0.5f) {
                        f2 -= b81Var.h;
                        b81Var.h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 4:
                qb2 qb2Var = (qb2) this.i;
                zC = qb2Var == null ? true : qb2Var.c(obj);
                break;
            case 5:
                return ((ge1) this.i).b(((Integer) obj).intValue());
            case 6:
                ((ok1) this.i).f(null);
                return j23.a;
            case 7:
                Bundle bundle2 = (Bundle) obj;
                kl1 kl1VarQ = ys.q((Context) this.i);
                if (bundle2 != null) {
                    bundle2.setClassLoader(kl1VarQ.a.getClassLoader());
                }
                xk1 xk1Var = kl1VarQ.b;
                LinkedHashMap linkedHashMap = xk1Var.m;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            r02.y("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    xk1Var.d = bundle;
                    xk1Var.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) p02.A("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            r02.y("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            r02.y("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            Throwable th3 = th2;
                            xk1Var.l.put(Integer.valueOf(intArray[i]), !uz0.g(stringArrayList.get(i2), "") ? (String) stringArrayList.get(i2) : th3);
                            i++;
                            i2 = i3;
                            th2 = th3;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            r02.y("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            String str = stringArrayList2.get(i4);
                            i4++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList arrayListA = p02.A("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                ih ihVar = new ih(arrayListA.size());
                                int size2 = arrayListA.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    Object obj3 = arrayListA.get(i5);
                                    i5++;
                                    ihVar.addLast(new sk1((Bundle) obj3));
                                }
                                linkedHashMap.put(str2, ihVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z2 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z2 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z2) : th;
                    kl1VarQ.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                }
                return kl1VarQ;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                sm1 sm1Var = (sm1) this.i;
                pk1 pk1Var = (pk1) obj;
                pk1Var.getClass();
                dl1 dl1Var = pk1Var.i;
                if (dl1Var == null) {
                    dl1Var = null;
                }
                if (dl1Var == null) {
                    return null;
                }
                pk1Var.a();
                dl1 dl1VarC = sm1Var.c(dl1Var);
                if (dl1VarC != null) {
                    return dl1VarC.equals(dl1Var) ? pk1Var : sm1Var.b().b(dl1VarC, dl1VarC.a(pk1Var.a()));
                }
                return null;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((fj1) this.i).a((pg1) obj);
                return Boolean.TRUE;
            case 10:
                rh2 rh2Var = (rh2) this.i;
                int iIntValue = ((Integer) obj).intValue();
                return rh2Var.e(iIntValue) + ": " + rh2Var.j(iIntValue).b();
            case 11:
                ((oz) this.i).y(obj);
                return j23.a;
            case 12:
                l72 l72Var = (l72) this.i;
                Throwable th4 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th4);
                synchronized (l72Var.c) {
                    s01 s01Var = l72Var.d;
                    if (s01Var != null) {
                        nn2 nn2Var = l72Var.u;
                        i72 i72Var = i72.i;
                        nn2Var.getClass();
                        nn2Var.i(null, i72Var);
                        s01Var.a(cancellationException);
                        l72Var.r = null;
                        s01Var.r(new uy1(l72Var, th4, b));
                    } else {
                        l72Var.e = cancellationException;
                        nn2 nn2Var2 = l72Var.u;
                        i72 i72Var2 = i72.h;
                        nn2Var2.getClass();
                        nn2Var2.i(null, i72Var2);
                    }
                }
                return j23.a;
            case 13:
                ((o72) this.i).a((we0) obj);
                return j23.a;
            case 14:
                ea2 ea2Var = (ea2) this.i;
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
                supportSQLiteDatabase.getClass();
                ea2Var.N = supportSQLiteDatabase;
                return j23.a;
            case 15:
                qb2 qb2Var2 = ((pb2) this.i).j;
                if (qb2Var2 != null) {
                    zC = qb2Var2.c(obj);
                }
                break;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                yd2 yd2Var = (yd2) this.i;
                float fFloatValue = ((Float) obj).floatValue();
                iu1 iu1Var = yd2Var.a;
                float fG = iu1Var.g() + fFloatValue + yd2Var.g;
                float fM = cy1.m(fG, 0.0f, yd2Var.f.g());
                z = fG == fM;
                float fG2 = fM - iu1Var.g();
                int iRound2 = Math.round(fG2);
                iu1Var.h(iu1Var.g() + iRound2);
                yd2Var.g = fG2 - iRound2;
                if (!z) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 17:
                qe2 qe2Var = (qe2) this.i;
                return new up1(qe2Var.d(qe2Var.k, ((up1) obj).a, qe2Var.j));
            case 18:
                tj2 tj2Var = (tj2) this.i;
                z02 z02Var = (z02) obj;
                long j = z02Var.c;
                kv2 kv2Var = (kv2) tj2Var.d;
                if (kv2Var.i() && kv2Var.l().a.i.length() != 0 && (p81Var = kv2Var.d) != null && p81Var.d() != null) {
                    tj2Var.c(kv2Var.l(), j, false, vz1.o);
                    z = true;
                }
                if (z) {
                    z02Var.a();
                }
                return j23.a;
            case 19:
                bh2.k((dh2) obj, ((ba2) this.i).a);
                return j23.a;
            case 20:
                ((List) obj).add((Float) ((l71) this.i).a());
                return true;
            case 21:
                r3 r3Var = (r3) this.i;
                obj.getClass();
                return r3Var.a();
            case 22:
                fi2 fi2Var = (fi2) this.i;
                j92 j92Var = (j92) obj;
                j92Var.k(j92Var.A.b() * 3.0f);
                j92Var.l(fi2Var.h);
                j92Var.g(fi2Var.i);
                j92Var.e(fi2Var.j);
                j92Var.m(fi2Var.k);
                return j23.a;
            case 23:
                cj2 cj2Var = (cj2) this.i;
                j92 j92Var2 = (j92) obj;
                j92Var2.i(cj2Var.v);
                j92Var2.j(cj2Var.w);
                j92Var2.c(cj2Var.x);
                float f5 = cj2Var.y;
                if (j92Var2.l != f5) {
                    j92Var2.h |= 8;
                    j92Var2.l = f5;
                }
                float f6 = cj2Var.z;
                if (j92Var2.m != f6) {
                    j92Var2.h |= 16;
                    j92Var2.m = f6;
                }
                j92Var2.k(cj2Var.A);
                float f7 = cj2Var.B;
                if (j92Var2.q != f7) {
                    j92Var2.h |= 256;
                    j92Var2.q = f7;
                }
                float f8 = cj2Var.C;
                if (j92Var2.r != f8) {
                    j92Var2.h |= 512;
                    j92Var2.r = f8;
                }
                float f9 = cj2Var.D;
                if (j92Var2.s != f9) {
                    j92Var2.h |= 1024;
                    j92Var2.s = f9;
                }
                float f10 = cj2Var.E;
                if (j92Var2.t != f10) {
                    j92Var2.h |= 2048;
                    j92Var2.t = f10;
                }
                j92Var2.o(cj2Var.F);
                j92Var2.l(cj2Var.G);
                j92Var2.g(cj2Var.H);
                j92Var2.e(cj2Var.I);
                j92Var2.m(cj2Var.J);
                int i6 = cj2Var.K;
                if (j92Var2.x != i6) {
                    j92Var2.h |= 32768;
                    j92Var2.x = i6;
                }
                int i7 = cj2Var.L;
                if (j92Var2.D != i7) {
                    j92Var2.h |= 524288;
                    j92Var2.D = i7;
                }
                ln lnVar = cj2Var.M;
                if (!uz0.g(j92Var2.C, lnVar)) {
                    j92Var2.h |= 262144;
                    j92Var2.C = lnVar;
                }
                p31 p31Var = cj2Var.N;
                if (!uz0.g(j92Var2.z, p31Var)) {
                    j92Var2.h |= 1048576;
                    j92Var2.z = p31Var;
                }
                return j23.a;
            case 24:
                uj2 uj2Var = (uj2) this.i;
                ds dsVar = uj2Var.f;
                dsVar.getClass();
                if (!uz0.g(uj2Var.f, dsVar)) {
                    w12.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                nj1 nj1Var = uj2Var.e;
                Object obj4 = uj2Var.c;
                if (nj1Var != null) {
                    if (obj4 != null) {
                        w12.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    nj1Var.a(obj);
                } else if (obj4 == null) {
                    uj2Var.c = obj;
                } else {
                    nj1 nj1Var2 = cd2.a;
                    nj1 nj1Var3 = new nj1();
                    nj1Var3.a(obj4);
                    nj1Var3.a(obj);
                    uj2Var.e = nj1Var3;
                    uj2Var.c = null;
                }
                return j23.a;
            case 25:
                nl2 nl2Var = (nl2) this.i;
                synchronized (nl2Var.g) {
                    ml2 ml2Var = nl2Var.i;
                    ml2Var.getClass();
                    Object obj5 = ml2Var.b;
                    obj5.getClass();
                    int i8 = ml2Var.d;
                    bj1 bj1Var = ml2Var.c;
                    if (bj1Var == null) {
                        bj1Var = new bj1();
                        ml2Var.c = bj1Var;
                        ml2Var.f.n(obj5, bj1Var);
                    }
                    ml2Var.b(obj, i8, obj5, bj1Var);
                }
                return j23.a;
            case 26:
                bd bdVar = (bd) obj;
                ((zp0) this.i).f(bdVar.e.getValue(), aa3.Q.b.h(bdVar.f));
                return j23.a;
            case 27:
                Drawable drawable = (Drawable) this.i;
                td0 td0Var = (td0) obj;
                wq wqVarG = td0Var.F().g();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (td0Var.d() >> 32)), (int) Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)));
                drawable.draw(b6.a(wqVarG));
                return j23.a;
            case 28:
                ((vp0) obj).h((dt2) this.i);
                return j23.a;
            default:
                z61 z61Var = (z61) this.i;
                yz2 yz2Var = (yz2) obj;
                if (yz2Var instanceof a4) {
                    z61Var.h(((a4) yz2Var).v);
                    return Boolean.TRUE;
                }
                li1.g("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
        }
        return Boolean.valueOf(zC);
    }

    public /* synthetic */ z61(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
    }
}
