package defpackage;

import java.time.LocalDate;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o60 {
    public final qy0 a;
    public final Locale b;
    public final hq c;
    public final lu1 d;
    public final lu1 e;
    public final lu1 f;
    public final lu1 g;

    public o60(Long l, Long l2, qy0 qy0Var, int i, vf2 vf2Var, Locale locale) {
        iq iqVarC;
        this.a = qy0Var;
        this.b = locale;
        hq hqVar = new hq(locale);
        this.c = hqVar;
        this.d = rz1.x(vf2Var);
        if (l2 != null) {
            iqVarC = hqVar.b(l2.longValue());
            if (!qy0Var.c(iqVarC.a)) {
                dq dqVarD = hqVar.d();
                iqVarC = hqVar.c(LocalDate.of(dqVarD.h, dqVarD.i, 1));
            }
        } else {
            dq dqVarD2 = hqVar.d();
            iqVarC = hqVar.c(LocalDate.of(dqVarD2.h, dqVarD2.i, 1));
        }
        this.e = rz1.x(iqVarC);
        dq dqVar = null;
        if (l != null) {
            dq dqVarA = this.c.a(l.longValue());
            if (qy0Var.c(dqVarA.h)) {
                dqVar = dqVarA;
            }
        }
        this.f = rz1.x(dqVar);
        this.g = rz1.x(new ab0(i));
    }

    public final int a() {
        return ((ab0) this.g.getValue()).a;
    }

    public final Long b() {
        dq dqVar = (dq) this.f.getValue();
        if (dqVar != null) {
            return Long.valueOf(dqVar.k);
        }
        return null;
    }
}
