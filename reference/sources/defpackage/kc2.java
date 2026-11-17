package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc2 implements zp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ kc2(byte b) {
        this.h = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                nb2 nb2Var = (nb2) obj;
                mw2 mw2Var = (mw2) obj2;
                yl2 yl2Var = mw2Var.a;
                k42 k42Var = mc2.i;
                return lt.c(mc2.a(yl2Var, k42Var, nb2Var), mc2.a(mw2Var.b, k42Var, nb2Var), mc2.a(mw2Var.c, k42Var, nb2Var), mc2.a(mw2Var.d, k42Var, nb2Var));
            case 1:
                xz1 xz1Var = (xz1) obj2;
                Boolean boolValueOf = Boolean.valueOf(xz1Var.a);
                k42 k42Var2 = mc2.a;
                return lt.c(boolValueOf, mc2.a(new sf0(xz1Var.b), tz0.e0, (nb2) obj));
            case 2:
                return Integer.valueOf(((sf0) obj2).a);
            case 3:
                return Integer.valueOf(((r91) obj2).a);
            case 4:
                ow2 ow2Var = (ow2) obj2;
                return lt.c(mc2.a(new nw2(ow2Var.a), tz0.h0, (nb2) obj), Boolean.valueOf(ow2Var.b));
            case 5:
                return Integer.valueOf(((nw2) obj2).a);
            case 6:
                return Integer.valueOf(((yd2) obj2).a.g());
            case 7:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = ag0.h;
                }
                return dv.I0(collection, list);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 11:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 12:
                return (ba2) obj;
            case 13:
                return (String) obj;
            case 14:
                return (j23) obj;
            case 15:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return (hi2) obj;
            case 17:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 18:
                return (b10) obj;
            case 19:
                return (p7) obj;
            case 20:
                return (m8) obj;
            case 21:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 22:
                if (obj != null || obj2 != null) {
                    li1.c();
                }
                return null;
            case 23:
                return obj == null ? obj2 : obj;
            case 24:
                wg2 wg2Var = (wg2) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                rg2 rg2Var = ((wg2) obj).d;
                ch2 ch2Var = ah2.u;
                Object objG = rg2Var.h.g(ch2Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = wg2Var.d.h.g(ch2Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 25:
                bv2 bv2Var = (bv2) obj2;
                return lt.Q(Float.valueOf(bv2Var.a.g()), Boolean.valueOf(((ks1) bv2Var.f.getValue()) == ks1.h));
            case 26:
                nb2 nb2Var2 = (nb2) obj;
                vv2 vv2Var = (vv2) obj2;
                return lt.c(mc2.a(vv2Var.a, mc2.a, nb2Var2), mc2.a(new qw2(vv2Var.b), mc2.p, nb2Var2));
            case 27:
                m20 m20Var = (m20) obj2;
                if (!(m20Var instanceof ex2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? m20Var : Integer.valueOf(iIntValue + 1);
            case 28:
                ex2 ex2Var = (ex2) obj;
                m20 m20Var2 = (m20) obj2;
                if (ex2Var != null) {
                    return ex2Var;
                }
                if (m20Var2 instanceof ex2) {
                    return (ex2) m20Var2;
                }
                return null;
            default:
                jx2 jx2Var = (jx2) obj;
                m20 m20Var3 = (m20) obj2;
                if (m20Var3 instanceof ex2) {
                    ex2 ex2Var2 = (ex2) m20Var3;
                    o20 o20Var = jx2Var.a;
                    Object objD = ex2Var2.d();
                    Object[] objArr = jx2Var.b;
                    int i = jx2Var.d;
                    objArr[i] = objD;
                    ex2[] ex2VarArr = jx2Var.c;
                    jx2Var.d = i + 1;
                    ex2VarArr[i] = ex2Var2;
                }
                return jx2Var;
        }
    }
}
