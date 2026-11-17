package defpackage;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ro extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(Long l, hq hqVar, k40 k40Var, Locale locale, sj1 sj1Var, m10 m10Var) {
        super(2, m10Var);
        this.m = l;
        this.n = hqVar;
        this.o = k40Var;
        this.p = locale;
        this.q = sj1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                return ((ro) p(m10Var, x20Var)).r(j23Var);
            default:
                ((ro) p(m10Var, x20Var)).r(j23Var);
                return j23Var;
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                ro roVar = new ro((so) obj5, (pn1) obj4, (h6) obj3, (zi) obj2, m10Var);
                roVar.m = obj;
                return roVar;
            default:
                return new ro((Long) this.m, (hq) obj5, (k40) obj4, (Locale) obj3, (sj1) obj2, m10Var);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                m02.y(obj);
                x20 x20Var = (x20) this.m;
                so soVar = (so) obj5;
                ie1.p(x20Var, null, new j(soVar, (pn1) obj4, (h6) obj3, null, (byte) 3), 3);
                return ie1.p(x20Var, null, new h(soVar, (zi) obj2, null, (byte) 8), 3);
            default:
                m02.y(obj);
                Long l = (Long) this.m;
                if (l != null) {
                    sj1 sj1Var = (sj1) obj2;
                    long jLongValue = l.longValue();
                    String str = ((k40) obj4).c;
                    ZoneId zoneId = hq.e;
                    String str2 = Instant.ofEpochMilli(jLongValue).atZone(hq.e).toLocalDate().format(s60.n(str, (Locale) obj3, ((hq) obj5).b));
                    vv2 vv2Var = new vv2(str2, str2.length() == 0 ? qw2.b : m02.a(str2.length(), str2.length()), 4);
                    rt1 rt1Var = q40.a;
                    sj1Var.setValue(vv2Var);
                }
                return j23.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(so soVar, pn1 pn1Var, h6 h6Var, zi ziVar, m10 m10Var) {
        super(2, m10Var);
        this.n = soVar;
        this.o = pn1Var;
        this.p = h6Var;
        this.q = ziVar;
    }
}
