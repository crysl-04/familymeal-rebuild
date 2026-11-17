package defpackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a8 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ a8(o60 o60Var, kp0 kp0Var, vp0 vp0Var, LocalDate localDate) {
        this.h = (byte) 2;
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        this.i = o60Var;
        this.j = kp0Var;
        this.k = vp0Var;
        this.l = localDate;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj = this.l;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                ((na0) obj4).i((kp0) obj3, (la0) obj2, (u31) obj);
                break;
            case 1:
                Float f = (Float) obj4;
                rv0 rv0Var = (rv0) obj3;
                Float f2 = (Float) obj2;
                qv0 qv0Var = (qv0) obj;
                if (!f.equals(rv0Var.h) || !f2.equals(rv0Var.i)) {
                    rv0Var.h = f;
                    rv0Var.i = f2;
                    rv0Var.k = new os2(qv0Var, aa3.Q, f, f2, null);
                    rv0Var.o.b.setValue(Boolean.TRUE);
                    rv0Var.l = false;
                    rv0Var.m = true;
                }
                break;
            default:
                kp0 kp0Var = (kp0) obj3;
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                vp0 vp0Var = (vp0) obj2;
                LocalDate localDate = (LocalDate) obj;
                Long lB = ((o60) obj4).b();
                if (lB != null) {
                    vp0Var.h(Integer.valueOf(cy1.n((int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(lB.longValue()).atZone(zoneOffset).toLocalDate(), localDate), 0, 1830)));
                }
                kp0Var.a();
                break;
        }
        return j23Var;
    }

    public /* synthetic */ a8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }
}
