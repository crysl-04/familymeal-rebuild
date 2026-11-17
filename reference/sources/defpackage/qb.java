package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qb(x00 x00Var, t23 t23Var, s01 s01Var, oe2 oe2Var) {
        this.h = (byte) 3;
        this.i = x00Var;
        this.j = s01Var;
        this.k = oe2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object d(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        jw2 jw2Var;
        jw2 jw2Var2;
        kw2 kw2Var;
        kw2 kw2Var2;
        jw2 jw2Var3;
        jw2 jw2Var4;
        kw2 kw2Var3;
        kw2 kw2Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        k42 k42Var;
        u21 u21Var = (u21) this.i;
        qu2 qu2Var = (qu2) this.j;
        t72 t72Var = (t72) this.k;
        tu2 tu2Var = (tu2) obj;
        int iOrdinal = u21Var.ordinal();
        byte b = 4;
        byte b2 = 8;
        j23 j23Var = j23.a;
        vv2 vv2Var = null;
        switch (iOrdinal) {
            case 0:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (qw2.c(tu2Var.f)) {
                        tu2Var.i();
                        return j23Var;
                    }
                    boolean zF = tu2Var.f();
                    long j = tu2Var.f;
                    if (zF) {
                        int iF = qw2.f(j);
                        tu2Var.q(iF, iF);
                        return j23Var;
                    }
                    int iE = qw2.e(j);
                    tu2Var.q(iE, iE);
                }
                return j23Var;
            case 1:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (qw2.c(tu2Var.f)) {
                        tu2Var.m();
                        return j23Var;
                    }
                    boolean zF2 = tu2Var.f();
                    long j2 = tu2Var.f;
                    if (zF2) {
                        int iE2 = qw2.e(j2);
                        tu2Var.q(iE2, iE2);
                        return j23Var;
                    }
                    int iF2 = qw2.f(j2);
                    tu2Var.q(iF2, iF2);
                    return j23Var;
                }
                return j23Var;
            case 2:
                pw2 pw2Var = tu2Var.e;
                pw2Var.a = null;
                od odVar = tu2Var.g;
                String str = odVar.i;
                String str2 = odVar.i;
                if (str.length() > 0) {
                    if (tu2Var.f()) {
                        pw2Var.a = null;
                        if (str2.length() > 0 && (numD = tu2Var.d()) != null) {
                            int iIntValue = numD.intValue();
                            tu2Var.q(iIntValue, iIntValue);
                            return j23Var;
                        }
                    } else {
                        pw2Var.a = null;
                        if (str2.length() > 0 && (numE = tu2Var.e()) != null) {
                            int iIntValue2 = numE.intValue();
                            tu2Var.q(iIntValue2, iIntValue2);
                            return j23Var;
                        }
                    }
                }
                return j23Var;
            case 3:
                pw2 pw2Var2 = tu2Var.e;
                pw2Var2.a = null;
                od odVar2 = tu2Var.g;
                String str3 = odVar2.i;
                String str4 = odVar2.i;
                if (str3.length() > 0) {
                    if (tu2Var.f()) {
                        pw2Var2.a = null;
                        if (str4.length() > 0 && (numE2 = tu2Var.e()) != null) {
                            int iIntValue3 = numE2.intValue();
                            tu2Var.q(iIntValue3, iIntValue3);
                            return j23Var;
                        }
                    } else {
                        pw2Var2.a = null;
                        if (str4.length() > 0 && (numD2 = tu2Var.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            tu2Var.q(iIntValue4, iIntValue4);
                            return j23Var;
                        }
                    }
                }
                return j23Var;
            case 4:
                tu2Var.j();
                return j23Var;
            case 5:
                tu2Var.l();
                return j23Var;
            case 6:
                tu2Var.o();
                return j23Var;
            case 7:
                tu2Var.n();
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (tu2Var.f()) {
                        tu2Var.o();
                        return j23Var;
                    }
                    tu2Var.n();
                    return j23Var;
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (tu2Var.f()) {
                        tu2Var.n();
                        return j23Var;
                    }
                    tu2Var.o();
                    return j23Var;
                }
                return j23Var;
            case 10:
                if (tu2Var.g.i.length() > 0 && (jw2Var = tu2Var.c) != null) {
                    int iG = tu2Var.g(jw2Var, -1);
                    tu2Var.q(iG, iG);
                    return j23Var;
                }
                return j23Var;
            case 11:
                if (tu2Var.g.i.length() > 0 && (jw2Var2 = tu2Var.c) != null) {
                    int iG2 = tu2Var.g(jw2Var2, 1);
                    tu2Var.q(iG2, iG2);
                    return j23Var;
                }
                return j23Var;
            case 12:
            case 48:
                return j23Var;
            case 13:
                if (tu2Var.g.i.length() > 0 && (kw2Var = tu2Var.i) != null) {
                    int iH = tu2Var.h(kw2Var, -1);
                    tu2Var.q(iH, iH);
                    return j23Var;
                }
                return j23Var;
            case 14:
                if (tu2Var.g.i.length() > 0 && (kw2Var2 = tu2Var.i) != null) {
                    int iH2 = tu2Var.h(kw2Var2, 1);
                    tu2Var.q(iH2, iH2);
                    return j23Var;
                }
                return j23Var;
            case 15:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    tu2Var.q(0, 0);
                    return j23Var;
                }
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                tu2Var.e.a = null;
                od odVar3 = tu2Var.g;
                if (odVar3.i.length() > 0) {
                    int length = odVar3.i.length();
                    tu2Var.q(length, length);
                    return j23Var;
                }
                return j23Var;
            case 17:
                qu2Var.b.a(false);
                return j23Var;
            case 18:
                qu2Var.b.o();
                return j23Var;
            case 19:
                qu2Var.b.c();
                return j23Var;
            case 20:
                List listA = tu2Var.a(new ss2((byte) 2));
                if (listA != null) {
                    qu2Var.a(listA);
                    return j23Var;
                }
                return j23Var;
            case 21:
                List listA2 = tu2Var.a(new ss2((byte) 3));
                if (listA2 != null) {
                    qu2Var.a(listA2);
                    return j23Var;
                }
                return j23Var;
            case 22:
                List listA3 = tu2Var.a(new ss2(b));
                if (listA3 != null) {
                    qu2Var.a(listA3);
                    return j23Var;
                }
                return j23Var;
            case 23:
                List listA4 = tu2Var.a(new ss2((byte) 5));
                if (listA4 != null) {
                    qu2Var.a(listA4);
                    return j23Var;
                }
                return j23Var;
            case 24:
                List listA5 = tu2Var.a(new ss2((byte) 6));
                if (listA5 != null) {
                    qu2Var.a(listA5);
                    return j23Var;
                }
                return j23Var;
            case 25:
                List listA6 = tu2Var.a(new ss2((byte) 7));
                if (listA6 != null) {
                    qu2Var.a(listA6);
                    return j23Var;
                }
                return j23Var;
            case 26:
                tu2Var.e.a = null;
                od odVar4 = tu2Var.g;
                if (odVar4.i.length() > 0) {
                    tu2Var.q(0, odVar4.i.length());
                    return j23Var;
                }
                return j23Var;
            case 27:
                tu2Var.i();
                tu2Var.p();
                return j23Var;
            case 28:
                tu2Var.m();
                tu2Var.p();
                return j23Var;
            case 29:
                if (tu2Var.g.i.length() > 0 && (jw2Var3 = tu2Var.c) != null) {
                    int iG3 = tu2Var.g(jw2Var3, -1);
                    tu2Var.q(iG3, iG3);
                }
                tu2Var.p();
                return j23Var;
            case 30:
                if (tu2Var.g.i.length() > 0 && (jw2Var4 = tu2Var.c) != null) {
                    int iG4 = tu2Var.g(jw2Var4, 1);
                    tu2Var.q(iG4, iG4);
                }
                tu2Var.p();
                return j23Var;
            case 31:
                if (tu2Var.g.i.length() > 0 && (kw2Var3 = tu2Var.i) != null) {
                    int iH3 = tu2Var.h(kw2Var3, -1);
                    tu2Var.q(iH3, iH3);
                }
                tu2Var.p();
                return j23Var;
            case 32:
                if (tu2Var.g.i.length() > 0 && (kw2Var4 = tu2Var.i) != null) {
                    int iH4 = tu2Var.h(kw2Var4, 1);
                    tu2Var.q(iH4, iH4);
                }
                tu2Var.p();
                return j23Var;
            case 33:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    tu2Var.q(0, 0);
                }
                tu2Var.p();
                return j23Var;
            case 34:
                tu2Var.e.a = null;
                od odVar5 = tu2Var.g;
                if (odVar5.i.length() > 0) {
                    int length2 = odVar5.i.length();
                    tu2Var.q(length2, length2);
                }
                tu2Var.p();
                return j23Var;
            case 35:
                pw2 pw2Var3 = tu2Var.e;
                pw2Var3.a = null;
                od odVar6 = tu2Var.g;
                String str5 = odVar6.i;
                String str6 = odVar6.i;
                if (str5.length() > 0) {
                    if (tu2Var.f()) {
                        pw2Var3.a = null;
                        if (str6.length() > 0 && (numE3 = tu2Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            tu2Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        pw2Var3.a = null;
                        if (str6.length() > 0 && (numD3 = tu2Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            tu2Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                tu2Var.p();
                return j23Var;
            case 36:
                pw2 pw2Var4 = tu2Var.e;
                pw2Var4.a = null;
                od odVar7 = tu2Var.g;
                String str7 = odVar7.i;
                String str8 = odVar7.i;
                if (str7.length() > 0) {
                    if (tu2Var.f()) {
                        pw2Var4.a = null;
                        if (str8.length() > 0 && (numD4 = tu2Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            tu2Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        pw2Var4.a = null;
                        if (str8.length() > 0 && (numE4 = tu2Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            tu2Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                tu2Var.p();
                return j23Var;
            case 37:
                tu2Var.j();
                tu2Var.p();
                return j23Var;
            case 38:
                tu2Var.l();
                tu2Var.p();
                return j23Var;
            case 39:
                tu2Var.o();
                tu2Var.p();
                return j23Var;
            case 40:
                tu2Var.n();
                tu2Var.p();
                return j23Var;
            case 41:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (tu2Var.f()) {
                        tu2Var.o();
                    } else {
                        tu2Var.n();
                    }
                }
                tu2Var.p();
                return j23Var;
            case 42:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    if (tu2Var.f()) {
                        tu2Var.n();
                    } else {
                        tu2Var.o();
                    }
                }
                tu2Var.p();
                return j23Var;
            case 43:
                tu2Var.e.a = null;
                if (tu2Var.g.i.length() > 0) {
                    long j3 = tu2Var.f;
                    int i = qw2.c;
                    int i2 = (int) (j3 & 4294967295L);
                    tu2Var.q(i2, i2);
                    return j23Var;
                }
                return j23Var;
            case 44:
                if (!qu2Var.e) {
                    qu2Var.a(lt.P(new fw("\n", 1)));
                    return j23Var;
                }
                t72Var.h = qu2Var.a.x.i.r.C(qu2Var.k);
                return j23Var;
            case 45:
                if (qu2Var.e) {
                    t72Var.h = false;
                    return j23Var;
                }
                qu2Var.a(lt.P(new fw("\t", 1)));
                return j23Var;
            case 46:
                qu2Var.h.a(vv2.a(tu2Var.h, tu2Var.g, tu2Var.f, 4));
                h23 h23Var = qu2Var.h;
                k42 k42Var2 = h23Var.a;
                if (k42Var2 != null && (k42Var = (k42) k42Var2.i) != null) {
                    h23Var.a = k42Var;
                    h23Var.c -= ((vv2) k42Var2.j).a.i.length();
                    h23Var.b = new k42(h23Var.b, (vv2) k42Var2.j, b2);
                    vv2Var = (vv2) k42Var.j;
                }
                if (vv2Var != null) {
                    qu2Var.j.h(vv2Var);
                    return j23Var;
                }
                return j23Var;
            case 47:
                h23 h23Var2 = qu2Var.h;
                k42 k42Var3 = h23Var2.b;
                if (k42Var3 != null) {
                    h23Var2.b = (k42) k42Var3.i;
                    vv2 vv2Var2 = (vv2) k42Var3.j;
                    h23Var2.a = new k42(h23Var2.a, vv2Var2, b2);
                    h23Var2.c = vv2Var2.a.i.length() + h23Var2.c;
                    vv2Var = (vv2) k42Var3.j;
                }
                if (vv2Var != null) {
                    qu2Var.j.h(vv2Var);
                    return j23Var;
                }
                return j23Var;
            default:
                wg.n();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x046b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x046d A[LOOP:2: B:126:0x0429->B:139:0x046d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x080b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]) (LINE:2060), block:B:272:0x080b */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        wq wqVar;
        wq wqVar2;
        boolean zBooleanValue;
        Object objG;
        boolean z;
        p81 p81Var;
        byte b = this.h;
        byte b2 = 14;
        byte b3 = 11;
        byte b4 = 10;
        byte b5 = 8;
        byte b6 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        byte b7 = 2;
        j23 j23Var = j23.a;
        byte b8 = 7;
        float f = 0.0f;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        final byte b9 = 1;
        switch (b) {
            case 0:
                tb tbVar = (tb) obj4;
                dd ddVar = (dd) obj3;
                t72 t72Var = (t72) obj2;
                bd bdVar = (bd) obj;
                cy1.T(bdVar, tbVar.c);
                lu1 lu1Var = bdVar.e;
                Object objB = tbVar.b(lu1Var.getValue());
                if (!uz0.g(objB, lu1Var.getValue())) {
                    tbVar.c.i.setValue(objB);
                    ddVar.i.setValue(objB);
                    bdVar.a();
                    t72Var.h = true;
                }
                return j23Var;
            case 1:
                vp0 vp0Var = (vp0) obj4;
                sj1 sj1Var = (sj1) obj2;
                vv2 vv2Var = (vv2) obj;
                ((sj1) obj3).setValue(vv2Var);
                boolean zG = uz0.g((String) sj1Var.getValue(), vv2Var.a.i);
                od odVar = vv2Var.a;
                sj1Var.setValue(odVar.i);
                if (!zG) {
                    vp0Var.h(odVar.i);
                }
                return j23Var;
            case 2:
                h6 h6Var = new h6((x20) obj3, (ry2) obj2, b8);
                q21[] q21VarArr = bh2.a;
                ((dh2) obj).a(qg2.c, new m1((String) obj4, h6Var));
                return j23Var;
            case 3:
                x00 x00Var = (x00) obj4;
                s01 s01Var = (s01) obj3;
                oe2 oe2Var = (oe2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f2 = x00Var.x ? 1.0f : -1.0f;
                qe2 qe2Var = x00Var.w;
                long jF = qe2Var.f(qe2Var.i(f2 * fFloatValue));
                qe2 qe2Var2 = oe2Var.a;
                float fH = qe2Var.h(qe2Var.f(qe2Var2.d(qe2Var2.k, jF, 1))) * f2;
                if (Math.abs(fH) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue + ")");
                    cancellationException.initCause(null);
                    s01Var.a(cancellationException);
                }
                return j23Var;
            case 4:
                p81 p81Var2 = (p81) obj4;
                vv2 vv2Var2 = (vv2) obj3;
                xp1 xp1Var = (xp1) obj2;
                td0 td0Var = (td0) obj;
                kw2 kw2VarD = p81Var2.d();
                if (kw2VarD != null) {
                    wq wqVarG = td0Var.F().g();
                    long j = ((qw2) p81Var2.A.getValue()).a;
                    long j2 = ((qw2) p81Var2.B.getValue()).a;
                    jw2 jw2Var = kw2VarD.a;
                    uh1 uh1Var = jw2Var.b;
                    iw2 iw2Var = jw2Var.a;
                    e9 e9Var = p81Var2.y;
                    long j3 = p81Var2.z;
                    if (!qw2.c(j)) {
                        e9Var.e(j3);
                        int iS = xp1Var.s(qw2.f(j));
                        int iS2 = xp1Var.s(qw2.e(j));
                        if (iS != iS2) {
                            wqVarG.h(jw2Var.h(iS, iS2), e9Var);
                        }
                    } else if (!qw2.c(j2)) {
                        long jB = iw2Var.b.b();
                        kv kvVar = jB != 16 ? new kv(jB) : null;
                        long j4 = kvVar != null ? kvVar.a : kv.b;
                        e9Var.e(kv.b(kv.c(j4) * 0.2f, j4));
                        int iS3 = xp1Var.s(qw2.f(j2));
                        int iS4 = xp1Var.s(qw2.e(j2));
                        if (iS3 != iS4) {
                            wqVarG.h(jw2Var.h(iS3, iS4), e9Var);
                        }
                    } else if (!qw2.c(vv2Var2.b)) {
                        e9Var.e(j3);
                        long j5 = vv2Var2.b;
                        int iS5 = xp1Var.s(qw2.f(j5));
                        int iS6 = xp1Var.s(qw2.e(j5));
                        if (iS5 != iS6) {
                            wqVarG.h(jw2Var.h(iS5, iS6), e9Var);
                        }
                    }
                    long j6 = jw2Var.c;
                    float f3 = (int) (j6 >> 32);
                    uh1 uh1Var2 = jw2Var.b;
                    boolean z2 = ((f3 > uh1Var2.d ? 1 : (f3 == uh1Var2.d ? 0 : -1)) < 0 || uh1Var2.c || (((float) ((int) (j6 & 4294967295L))) > uh1Var2.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == uh1Var2.e ? 0 : -1)) < 0) && iw2Var.f != 3;
                    if (z2) {
                        long j7 = jw2Var.c;
                        r72 r72VarB = h12.b(0L, (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L));
                        wqVarG.l();
                        wq.k(wqVarG, r72VarB);
                    }
                    yl2 yl2Var = iw2Var.b.a;
                    vt2 vt2Var = yl2Var.m;
                    xv2 xv2Var = yl2Var.a;
                    if (vt2Var == null) {
                        vt2Var = vt2.b;
                    }
                    vt2 vt2Var2 = vt2Var;
                    ei2 ei2Var = yl2Var.n;
                    if (ei2Var == null) {
                        ei2Var = ei2.d;
                    }
                    ei2 ei2Var2 = ei2Var;
                    ud0 ud0Var = yl2Var.p;
                    if (ud0Var == null) {
                        ud0Var = xi0.a;
                    }
                    ud0 ud0Var2 = ud0Var;
                    try {
                        zo zoVarB = xv2Var.b();
                        wv2 wv2Var = wv2.a;
                        try {
                            if (zoVarB == null) {
                                wq wqVar3 = wqVarG;
                                long jA = xv2Var != wv2Var ? xv2Var.a() : kv.b;
                                wqVar3.l();
                                ArrayList arrayList = uh1Var.h;
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    yt1 yt1Var = (yt1) arrayList.get(i);
                                    yt1Var.a.e(wqVar3, jA, ei2Var2, vt2Var2, ud0Var2);
                                    wqVar = wqVar3;
                                    try {
                                        float f4 = f;
                                        wqVar.g(f4, yt1Var.a.f);
                                        i++;
                                        wqVar3 = wqVar;
                                        f = f4;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (z2) {
                                            wqVar.i();
                                        }
                                        throw th;
                                    }
                                }
                                wqVar = wqVar3;
                                wqVar.i();
                            } else {
                                uh1.i(uh1Var, wqVarG, zoVarB, xv2Var != wv2Var ? xv2Var.c() : 1.0f, ei2Var2, vt2Var2, ud0Var2);
                                wqVar = wqVarG;
                            }
                            if (z2) {
                                wqVar.i();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            wqVar = wqVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        wqVar = wqVarG;
                    }
                    break;
                }
                return j23Var;
            case 5:
                u72 u72Var = (u72) obj4;
                bd bdVar2 = (bd) obj;
                float fFloatValue2 = ((Number) bdVar2.e.getValue()).floatValue() - u72Var.h;
                float fA = ((w71) obj3).a(fFloatValue2);
                u72Var.h = ((Number) bdVar2.e.getValue()).floatValue();
                ((u72) obj2).h = ((Number) bdVar2.a.b.h(bdVar2.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    bdVar2.a();
                }
                return j23Var;
            case 6:
                Context context = (Context) obj3;
                fl flVar = (fl) obj2;
                f10 f10Var = (f10) obj;
                List list = ((ft2) obj4).a;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    et2 et2Var = (et2) list.get(i2);
                    if (et2Var instanceof mt2) {
                        mt2 mt2Var = (mt2) et2Var;
                        f10.b(f10Var, new s(mt2Var, b5), mt2Var.c == 0 ? null : new nx(-1930700965, true, new d60(mt2Var, b9)), new h6((Object) mt2Var, (Object) flVar, (byte) 13), 6);
                    } else if (et2Var instanceof st2) {
                        st2 st2Var = (st2) et2Var;
                        if (context != null) {
                            int i3 = st2Var.c;
                            TextClassification textClassification = st2Var.b;
                            Drawable drawable = st2Var.d;
                            if (i3 < 0) {
                                f10.b(f10Var, new s((Object) textClassification, (byte) 25), drawable != null ? new nx(-1123224187, true, new lt2(drawable, (byte) 0)) : null, new g72(context, textClassification, b9), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i3);
                                f10.b(f10Var, new s((Object) remoteAction, (byte) 26), drawable != null ? new nx(1106162332, true, new lt2(drawable, b9)) : null, new xu1(remoteAction, b2), 6);
                            }
                        }
                    } else if (et2Var instanceof qt2) {
                        f10Var.a.add(h7.r);
                    }
                    i2++;
                    b5 = 8;
                }
                return j23Var;
            case 7:
                ll2 ll2Var = (ll2) obj4;
                pk1 pk1Var = (pk1) obj3;
                ll2Var.add(pk1Var);
                return new bc((ka0) obj2, pk1Var, ll2Var);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                em0 em0Var = (em0) obj3;
                vp0 vp0Var2 = (vp0) obj2;
                lm0 lm0Var = (lm0) obj;
                if (uz0.g(lm0Var, (lm0) obj4)) {
                    zBooleanValue = false;
                } else {
                    if (uz0.g(lm0Var, em0Var.c)) {
                        li1.g("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) vp0Var2.h(lm0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ArrayList arrayList2 = (ArrayList) obj3;
                vp0 vp0Var3 = (vp0) obj2;
                p71 p71Var = (p71) obj;
                p71Var.getClass();
                for (Map.Entry entry : ((LinkedHashMap) obj4).entrySet()) {
                    String str = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    p71.o0(p71Var, jp1.j("h_", str), new nx(-1205233272, true, new ng(str, list2, b6)), 2);
                    p71Var.p0(list2.size(), new q9(new vv0((byte) 4), list2, (byte) 6), new rw0(list2, (byte) 0), new nx(802480018, true, new sw0(list2, vp0Var3, (byte) 0)));
                }
                if (arrayList2.isEmpty()) {
                    p71.o0(p71Var, null, ie1.q, 3);
                }
                return j23Var;
            case 10:
                e91 e91Var = (e91) obj4;
                final i91 i91Var = (i91) obj3;
                final vp0 vp0Var4 = (vp0) obj2;
                final x72 x72Var = new x72();
                c91 c91Var = new c91() { // from class: a91
                    @Override // defpackage.c91
                    public final void e(e91 e91Var2, w81 w81Var) {
                        byte b10 = b9;
                        vp0 vp0Var5 = vp0Var4;
                        x72 x72Var2 = x72Var;
                        e91 e91Var3 = i91Var;
                        switch (b10) {
                            case 0:
                                m91 m91Var = (m91) e91Var3;
                                int i4 = b91.a[w81Var.ordinal()];
                                if (i4 == 1) {
                                    x72Var2.h = vp0Var5.h(m91Var);
                                } else if (i4 == 2) {
                                    ml1 ml1Var = (ml1) x72Var2.h;
                                    if (ml1Var != null) {
                                        ml1Var.a.f(false);
                                    }
                                    x72Var2.h = null;
                                }
                                break;
                            default:
                                i91 i91Var2 = (i91) e91Var3;
                                int i5 = b91.a[w81Var.ordinal()];
                                if (i5 == 3) {
                                    x72Var2.h = vp0Var5.h(i91Var2);
                                } else if (i5 == 4) {
                                    x72Var2.h = null;
                                }
                                break;
                        }
                    }
                };
                e91Var.g().a(c91Var);
                return new bc(e91Var, c91Var, x72Var, b7);
            case 11:
                e91 e91Var2 = (e91) obj4;
                final m91 m91Var = (m91) obj3;
                final vp0 vp0Var5 = (vp0) obj2;
                final x72 x72Var2 = new x72();
                final byte b10 = 0;
                c91 c91Var2 = new c91() { // from class: a91
                    @Override // defpackage.c91
                    public final void e(e91 e91Var3, w81 w81Var) {
                        byte b11 = b10;
                        vp0 vp0Var6 = vp0Var5;
                        x72 x72Var3 = x72Var2;
                        e91 e91Var4 = m91Var;
                        switch (b11) {
                            case 0:
                                m91 m91Var2 = (m91) e91Var4;
                                int i4 = b91.a[w81Var.ordinal()];
                                if (i4 == 1) {
                                    x72Var3.h = vp0Var6.h(m91Var2);
                                } else if (i4 == 2) {
                                    ml1 ml1Var = (ml1) x72Var3.h;
                                    if (ml1Var != null) {
                                        ml1Var.a.f(false);
                                    }
                                    x72Var3.h = null;
                                }
                                break;
                            default:
                                i91 i91Var2 = (i91) e91Var4;
                                int i5 = b91.a[w81Var.ordinal()];
                                if (i5 == 3) {
                                    x72Var3.h = vp0Var6.h(i91Var2);
                                } else if (i5 == 4) {
                                    x72Var3.h = null;
                                }
                                break;
                        }
                    }
                };
                e91Var2.g().a(c91Var2);
                return new bc(e91Var2, c91Var2, x72Var2, b6);
            case 12:
                zh1 zh1Var = (zh1) obj3;
                x72 x72Var3 = (x72) obj2;
                if (((Set) obj4).contains(obj) && (objG = zh1Var.b.g(obj)) != null) {
                    if (objG instanceof nj1) {
                        nj1 nj1Var = (nj1) objG;
                        Object[] objArr8 = nj1Var.b;
                        long[] jArr = nj1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j8 = jArr[i4];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j8) < 128) {
                                            lh2 lh2Var = (lh2) objArr8[(i4 << 3) + i6];
                                            if (x72Var3.h == null) {
                                                x72Var3.h = new ArrayList();
                                            }
                                            ((List) x72Var3.h).add(lh2Var);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 != length) {
                                            i4++;
                                        }
                                    }
                                } else if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        lh2 lh2Var2 = (lh2) objG;
                        if (x72Var3.h == null) {
                            x72Var3.h = new ArrayList();
                        }
                        ((List) x72Var3.h).add(lh2Var2);
                    }
                }
                return j23Var;
            case 13:
                rt1 rt1Var = (rt1) obj3;
                bm bmVar = (bm) obj2;
                n41 n41Var = (n41) obj;
                long j9 = ((wj2) ((gu2) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fA2 = n41Var.A(4.0f);
                    yq yqVar = n41Var.h;
                    float fA3 = n41Var.A(rt1Var.a(n41Var.getLayoutDirection()));
                    float fA4 = bmVar.a(ie1.x(fIntBitsToFloat), ie1.x((Float.intBitsToFloat((int) (yqVar.d() >> 32)) - fA3) - n41Var.A(rt1Var.b(n41Var.getLayoutDirection()))), n41Var.getLayoutDirection()) + fA3;
                    float f5 = fIntBitsToFloat / 2.0f;
                    float f6 = fA4 + f5;
                    float f7 = (f6 - f5) - fA2;
                    float f8 = f7 < 0.0f ? 0.0f : f7;
                    float f9 = f6 + f5 + fA2;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (yqVar.d() >> 32));
                    float f10 = f9 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f9;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                    float f11 = (-fIntBitsToFloat3) / 2.0f;
                    float f12 = fIntBitsToFloat3 / 2.0f;
                    eg egVar = yqVar.i;
                    long jQ = egVar.q();
                    egVar.g().l();
                    try {
                        ((eg) ((g2) egVar.i).i).g().f(f8, f11, f10, f12, 0);
                        n41Var.a();
                    } finally {
                        wi0.r(egVar, jQ);
                    }
                } else {
                    n41Var.a();
                }
                return j23Var;
            case 14:
                pb2 pb2Var = (pb2) obj4;
                tb2 tb2Var = (tb2) obj2;
                mj1 mj1Var = pb2Var.i;
                if (mj1Var.b(obj3)) {
                    li1.h("Key ", obj3, " was used multiple times ");
                    return null;
                }
                pb2Var.h.remove(obj3);
                mj1Var.n(obj3, tb2Var);
                return new bc(pb2Var, obj3, tb2Var, (byte) 4);
            case 15:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM schedule_slot WHERE day = ? AND meal = ? AND person_id = ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str2);
                    sQLiteStatementPrepare.bindText(2, str3);
                    sQLiteStatementPrepare.bindText(3, str4);
                    sQLiteStatementPrepare.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                tj2 tj2Var = (tj2) obj4;
                li1 li1Var = (li1) obj3;
                t72 t72Var2 = (t72) obj2;
                z02 z02Var = (z02) obj;
                long j10 = z02Var.c;
                kv2 kv2Var = (kv2) tj2Var.d;
                if (!kv2Var.i() || kv2Var.l().a.i.length() == 0 || (p81Var = kv2Var.d) == null || p81Var.d() == null) {
                    z = false;
                } else {
                    tj2Var.c(kv2Var.l(), j10, false, li1Var);
                    z = true;
                }
                if (z) {
                    z02Var.a();
                    t72Var2.h = true;
                }
                return j23Var;
            case 17:
                v10 v10Var = (v10) obj3;
                dw2 dw2Var = (dw2) ((x72) obj2).h;
                vv2 vv2VarN = ((ix0) obj4).n((List) obj);
                if (dw2Var != null) {
                    dw2Var.a(null, vv2VarN);
                }
                v10Var.h(vv2VarN);
                return j23Var;
            case 18:
                return d(obj);
            case 19:
                kv2 kv2Var2 = (kv2) obj4;
                x20 x20Var = (x20) obj3;
                Context context2 = (Context) obj2;
                dt2 dt2Var = (dt2) obj;
                fj1 fj1Var = dt2Var.a;
                fj1 fj1Var2 = dt2Var.a;
                qt2 qt2Var = qt2.b;
                fj1Var.a(qt2Var);
                nt2[] nt2VarArr = nt2.i;
                boolean z3 = (qw2.c(kv2Var2.l().b) || !kv2Var2.h() || kv2Var2.g == null) ? false : true;
                g72 g72Var = new g72(x20Var, new ev2(kv2Var2, objArr7 == true ? 1 : 0, b9), b7);
                Resources resources = context2.getResources();
                byte b11 = 19;
                uy1 uy1Var = new uy1(g72Var, objArr6 == true ? 1 : 0, b11);
                if (z3) {
                    fj1Var2.a(new mt2(h7.Y, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, uy1Var));
                }
                nt2[] nt2VarArr2 = nt2.i;
                boolean z4 = (qw2.c(kv2Var2.l().b) || kv2Var2.g == null) ? false : true;
                g72 g72Var2 = new g72(x20Var, new ev2(kv2Var2, objArr5 == true ? 1 : 0, b7), b7);
                Resources resources2 = context2.getResources();
                uy1 uy1Var2 = new uy1(g72Var2, objArr4 == true ? 1 : 0, b11);
                if (z4) {
                    fj1Var2.a(new mt2(h7.Z, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, uy1Var2));
                }
                nt2[] nt2VarArr3 = nt2.i;
                boolean z5 = kv2Var2.h() && ((Boolean) kv2Var2.w.getValue()).booleanValue() && kv2Var2.g != null;
                g72 g72Var3 = new g72(x20Var, new ev2(kv2Var2, objArr3 == true ? 1 : 0, b6), b7);
                Resources resources3 = context2.getResources();
                uy1 uy1Var3 = new uy1(g72Var3, objArr2 == true ? 1 : 0, b11);
                if (z5) {
                    fj1Var2.a(new mt2(h7.a0, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, uy1Var3));
                }
                nt2[] nt2VarArr4 = nt2.i;
                boolean z6 = qw2.d(kv2Var2.l().b) != kv2Var2.l().a.i.length();
                pv2 pv2Var = new pv2(kv2Var2, (byte) 0);
                pv2 pv2Var2 = new pv2(kv2Var2, b9);
                Resources resources4 = context2.getResources();
                uy1 uy1Var4 = new uy1(pv2Var2, pv2Var, b11);
                if (z6) {
                    fj1Var2.a(new mt2(h7.b0, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, uy1Var4));
                }
                nt2[] nt2VarArr5 = nt2.i;
                b9 = (kv2Var2.h() && qw2.c(kv2Var2.l().b)) ? (byte) 1 : (byte) 0;
                pv2 pv2Var3 = new pv2(kv2Var2, b7);
                Resources resources5 = context2.getResources();
                uy1 uy1Var5 = new uy1(pv2Var3, objArr == true ? 1 : 0, b11);
                if (b9 != 0) {
                    fj1Var2.a(new mt2(h7.c0, resources5.getString(R.string.autofill), 0, uy1Var5));
                }
                fj1Var2.a(qt2Var);
                return j23Var;
            case 20:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj2;
                p71 p71Var2 = (p71) obj;
                p71Var2.getClass();
                p71.o0(p71Var2, null, new nx(-437871580, true, new kw0((az1) obj4, b3)), 3);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : p60.p) {
                    if (linkedHashMap.get((p60) obj5) != null) {
                        arrayList3.add(obj5);
                    }
                }
                p71Var2.p0(arrayList3.size(), new q9(new h33(b4), arrayList3, (byte) 13), new ba(arrayList3, b7), new nx(802480018, true, new h63(arrayList3, linkedHashMap, linkedHashMap2, (byte) 0)));
                return j23Var;
            case 21:
                p71 p71Var3 = (p71) obj;
                p71Var3.getClass();
                h33 h33Var = new h33(b3);
                lh0 lh0Var = p60.p;
                p71Var3.p0(lh0Var.a(), new q9(h33Var, lh0Var, b2), new id2(lh0Var, (byte) 1), new nx(802480018, true, new k63(lh0Var, (ez1) obj4, (p63) obj3, (sj1) obj2, (byte) 0)));
                return j23Var;
            default:
                p63 p63Var = (p63) obj3;
                Set set = (Set) obj2;
                p71 p71Var4 = (p71) obj;
                p71Var4.getClass();
                p71.o0(p71Var4, null, new nx(1292705860, true, new ng(p63Var, set, b5)), 3);
                for (Map.Entry entry2 : ((LinkedHashMap) obj4).entrySet()) {
                    String str5 = (String) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    p71.o0(p71Var4, jp1.j("h_", str5), new nx(-1628508193, true, new kw0(str5, b4)), 2);
                    p71Var4.p0(list3.size(), new q9(new h33((byte) 9), list3, (byte) 15), new rw0(list3, (byte) 3), new nx(802480018, true, new h63(list3, set, p63Var, b9)));
                }
                return j23Var;
        }
    }

    public /* synthetic */ qb(u72 u72Var, w71 w71Var, u72 u72Var2, e70 e70Var) {
        this.h = (byte) 5;
        this.i = u72Var;
        this.j = w71Var;
        this.k = u72Var2;
    }

    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }
}
