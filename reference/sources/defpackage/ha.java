package defpackage;

import java.time.LocalDate;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ha(nx nxVar, Object obj, Object obj2, int i) {
        this.h = (byte) 2;
        this.i = nxVar;
        this.k = obj;
        this.l = obj2;
        this.j = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        int i = this.j;
        Object obj3 = this.i;
        Object obj4 = this.l;
        Object obj5 = this.k;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                h7.I((yp1) obj5, (d5) obj4, (nx) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                h7.P((rg1) obj5, (ie0) obj4, (nx) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((nx) obj3).j(obj5, obj4, (dr0) obj, m02.A(i) | 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                j10.a((e10) obj5, (rg1) obj4, (nx) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA = m02.A(7);
                n60.f((rg1) obj5, this.j, (vp0) obj4, (s40) obj3, (dr0) obj, iA);
                break;
            case 5:
                ((Integer) obj2).getClass();
                e80.c((fl) obj5, (gt2) obj4, (kp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(1);
                cu.o((s61) obj5, this.l, this.j, this.i, (dr0) obj, iA2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA3 = m02.A(3073);
                ls.f(this.k, this.j, (a71) obj4, (nx) obj3, (dr0) obj, iA3);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                ((Integer) obj2).getClass();
                ((d81) obj5).b(obj4, (nx) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((Integer) obj2).intValue();
                vs.e((e91) obj5, (i91) obj4, (vp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                vs.g((e91) obj5, (m91) obj4, (vp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((pb2) obj5).b(obj4, (nx) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                tz0.f((zo2) obj5, (rg1) obj4, (zp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = m02.A(1);
                tz0.i((LocalDate) obj5, this.j, (vp0) obj4, (kp0) obj3, (dr0) obj, iA4);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ ha(s61 s61Var, Object obj, int i, Object obj2, int i2) {
        this.h = (byte) 6;
        this.k = s61Var;
        this.l = obj;
        this.j = i;
        this.i = obj2;
    }

    public /* synthetic */ ha(Object obj, int i, Object obj2, Object obj3, int i2, byte b) {
        this.h = b;
        this.k = obj;
        this.j = i;
        this.l = obj2;
        this.i = obj3;
    }

    public /* synthetic */ ha(Object obj, Object obj2, hq0 hq0Var, int i, byte b) {
        this.h = b;
        this.k = obj;
        this.l = obj2;
        this.i = hq0Var;
        this.j = i;
    }
}
