package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 extends mq2 implements vp0 {
    public dy1 l;
    public byte m;
    public final /* synthetic */ LocalDate n;
    public final /* synthetic */ double o;
    public final /* synthetic */ LocalDate p;
    public final /* synthetic */ tw1 q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw1(LocalDate localDate, double d, LocalDate localDate2, tw1 tw1Var, String str, m10 m10Var) {
        super(1, m10Var);
        this.n = localDate;
        this.o = d;
        this.p = localDate2;
        this.q = tw1Var;
        this.r = str;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        tw1 tw1Var = this.q;
        String str = this.r;
        return new fw1(this.n, this.o, this.p, tw1Var, str, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[RETURN] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objA;
        dy1 dy1VarJ0;
        Object objP;
        Object objP2;
        dy1 dy1Var;
        Object objE;
        tw1 tw1Var = this.q;
        AppDatabase appDatabase = tw1Var.a;
        byte b = this.m;
        double d = this.o;
        LocalDate localDate = this.n;
        String str = this.r;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            b82 b82Var = bh0.a;
            na1 na1VarH = bh0.h(localDate, d, this.p);
            if (!na1VarH.isEmpty()) {
                return new bw1(na1VarH);
            }
            sx1 sx1VarO = appDatabase.o();
            this.m = (byte) 1;
            objA = sx1VarO.a(str, this);
            if (objA != y20Var) {
            }
            return y20Var;
        }
        if (b == 1) {
            m02.y(obj);
            objA = obj;
        } else {
            if (b == 2) {
                dy1VarJ0 = this.l;
                m02.y(obj);
                objP = obj;
                if (((Number) objP).intValue() >= 2000) {
                    return new bw1(lt.P(new m32("date", "体重记录已达上限 2000 条")));
                }
                r63 r63VarT = appDatabase.t();
                String string = localDate.toString();
                string.getClass();
                s63 s63Var = new s63(str, string, d);
                this.l = dy1VarJ0;
                this.m = (byte) 3;
                objP2 = cu.P(this, new uy1(r63VarT, s63Var, (byte) 27), r63VarT.a, false, true);
                if (objP2 != y20Var) {
                    objP2 = j23.a;
                }
                if (objP2 != y20Var) {
                    dy1Var = dy1VarJ0;
                }
                return y20Var;
            }
            if (b != 3) {
                if (b == 4) {
                    m02.y(obj);
                    return obj;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dy1Var = this.l;
            m02.y(obj);
        }
        this.l = null;
        this.m = (byte) 4;
        objE = tw1Var.e(dy1Var, this);
        if (objE != y20Var) {
            return y20Var;
        }
        return objE;
        by1 by1Var = (by1) objA;
        if (by1Var == null) {
            return new bw1(lt.P(new m32("person", "找不到这位家人")));
        }
        dy1VarJ0 = cu.j0(by1Var);
        r63 r63VarT2 = appDatabase.t();
        this.l = dy1VarJ0;
        this.m = (byte) 2;
        objP = cu.P(this, new ql(str, (byte) 29), r63VarT2.a, true, false);
        if (objP != y20Var) {
            if (((Number) objP).intValue() >= 2000) {
                return new bw1(lt.P(new m32("date", "体重记录已达上限 2000 条")));
            }
            r63 r63VarT3 = appDatabase.t();
            String string2 = localDate.toString();
            string2.getClass();
            s63 s63Var2 = new s63(str, string2, d);
            this.l = dy1VarJ0;
            this.m = (byte) 3;
            objP2 = cu.P(this, new uy1(r63VarT3, s63Var2, (byte) 27), r63VarT3.a, false, true);
            if (objP2 != y20Var) {
                objP2 = j23.a;
            }
            if (objP2 != y20Var) {
                dy1Var = dy1VarJ0;
                this.l = null;
                this.m = (byte) 4;
                objE = tw1Var.e(dy1Var, this);
                if (objE != y20Var) {
                    return objE;
                }
            }
        }
        return y20Var;
    }
}
