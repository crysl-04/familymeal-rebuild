package defpackage;

import androidx.sqlite.SQLiteStatement;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss2 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ ss2(byte b) {
        this.h = b;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        int iOffsetByCodePoints;
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((Float) obj).getClass();
                return j23Var;
            case 1:
                ((Integer) obj).getClass();
                return cu2.a;
            case 2:
                tu2 tu2Var = (tu2) obj;
                String str = tu2Var.g.i;
                long j = tu2Var.f;
                int i = qw2.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 <= 0) {
                    iOffsetByCodePoints = -1;
                } else {
                    if0 if0VarZ = p02.z();
                    if (if0VarZ != null) {
                        int iB = if0VarZ.b(i2 - 1, str);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i2 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                        }
                    } else if (i2 > 0) {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                    } else {
                        iOffsetByCodePoints = -1;
                    }
                }
                if (iOffsetByCodePoints != -1) {
                    return new r80(((int) (tu2Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
                }
                return null;
            case 3:
                tu2 tu2Var2 = (tu2) obj;
                String str2 = tu2Var2.g.i;
                long j2 = tu2Var2.f;
                int i3 = qw2.c;
                int iW = p02.w((int) (j2 & 4294967295L), str2);
                if (iW != -1) {
                    return new r80(0, iW - ((int) (tu2Var2.f & 4294967295L)));
                }
                return null;
            case 4:
                tu2 tu2Var3 = (tu2) obj;
                Integer numE = tu2Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = tu2Var3.f;
                int i4 = qw2.c;
                return new r80(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 5:
                tu2 tu2Var4 = (tu2) obj;
                Integer numD = tu2Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = tu2Var4.f;
                int i5 = qw2.c;
                return new r80(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 6:
                tu2 tu2Var5 = (tu2) obj;
                Integer numC = tu2Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = tu2Var5.f;
                int i6 = qw2.c;
                return new r80(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 7:
                tu2 tu2Var6 = (tu2) obj;
                Integer numB = tu2Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = tu2Var6.f;
                int i7 = qw2.c;
                return new r80(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ks1 ks1Var = ((Boolean) obj2).booleanValue() ? ks1.h : ks1.i;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new bv2(ks1Var, ((Float) obj3).floatValue());
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return j23Var;
            case 10:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                k42 k42Var = mc2.a;
                Boolean bool = Boolean.FALSE;
                od odVar = (uz0.g(obj4, bool) || obj4 == null) ? null : (od) ((vp0) k42Var.j).h(obj4);
                odVar.getClass();
                Object obj5 = list2.get(1);
                int i8 = qw2.c;
                qw2 qw2Var = (uz0.g(obj5, bool) || obj5 == null) ? null : (qw2) ((vp0) mc2.p.j).h(obj5);
                qw2Var.getClass();
                return new vv2(odVar, qw2Var.a, (qw2) null);
            case 11:
            case 13:
                return j23Var;
            case 12:
            case 14:
                return j23Var;
            case 15:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                sQLiteStatement.getClass();
                return Boolean.valueOf(sQLiteStatement.step());
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                pf2 pf2Var = (pf2) obj;
                long j7 = pf2Var.f;
                nl2 nl2Var = pf2Var.h;
                if (nl2Var != null) {
                    nl2Var.d(pf2Var, t03.H, pf2Var.g);
                }
                long j8 = pf2Var.f;
                if (j7 != j8) {
                    hf2 hf2Var = pf2Var.o;
                    if (hf2Var != null) {
                        if (hf2Var.a > j8) {
                            pf2Var.r();
                        } else {
                            hf2Var.g = j8;
                            if (hf2Var.b == null) {
                                hf2Var.h = ie1.y((1.0d - ((double) hf2Var.e.a(0))) * pf2Var.f);
                            }
                        }
                    } else if (j8 != 0) {
                        pf2Var.w();
                    }
                }
                return j23Var;
            case 17:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                sQLiteStatement2.getClass();
                yh2 yh2Var = new yh2();
                while (sQLiteStatement2.step()) {
                    yh2Var.add(Integer.valueOf((int) sQLiteStatement2.getLong(0)));
                }
                return r02.i(yh2Var);
            case 18:
                return new ed(((Float) obj).floatValue());
            case 19:
                return new ed(((Integer) obj).intValue());
            case 20:
                return Integer.valueOf((int) ((ed) obj).a);
            case 21:
                return new ed(((cc0) obj).h);
            case 22:
                return new cc0(((ed) obj).a);
            case 23:
                ec0 ec0Var = (ec0) obj;
                return new fd(Float.intBitsToFloat((int) (ec0Var.a >> 32)), Float.intBitsToFloat((int) (ec0Var.a & 4294967295L)));
            case 24:
                fd fdVar = (fd) obj;
                return new ec0((((long) Float.floatToRawIntBits(fdVar.a)) << 32) | (((long) Float.floatToRawIntBits(fdVar.b)) & 4294967295L));
            case 25:
                wj2 wj2Var = (wj2) obj;
                return new fd(Float.intBitsToFloat((int) (wj2Var.a >> 32)), Float.intBitsToFloat((int) (wj2Var.a & 4294967295L)));
            case 26:
                fd fdVar2 = (fd) obj;
                return new wj2((((long) Float.floatToRawIntBits(fdVar2.a)) << 32) | (((long) Float.floatToRawIntBits(fdVar2.b)) & 4294967295L));
            case 27:
                up1 up1Var = (up1) obj;
                return new fd(Float.intBitsToFloat((int) (up1Var.a >> 32)), Float.intBitsToFloat((int) (up1Var.a & 4294967295L)));
            case 28:
                fd fdVar3 = (fd) obj;
                return new up1((((long) Float.floatToRawIntBits(fdVar3.a)) << 32) | (((long) Float.floatToRawIntBits(fdVar3.b)) & 4294967295L));
            default:
                long j9 = ((ny0) obj).a;
                return new fd((int) (j9 >> 32), (int) (j9 & 4294967295L));
        }
    }
}
