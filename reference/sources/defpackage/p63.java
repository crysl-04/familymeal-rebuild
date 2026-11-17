package defpackage;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p63 extends z43 {
    public final kz1 b;
    public final LocalDate c;
    public final iu1 d;
    public final lu1 e;
    public final lu1 f;
    public final lu1 g;
    public final lu1 h;
    public final lu1 i;
    public final lu1 j;
    public final lu1 k;
    public dn2 l;

    public p63(kz1 kz1Var) {
        kz1Var.getClass();
        this.b = kz1Var;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        LocalDate localDateWith = localDateNow.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        localDateWith.getClass();
        this.c = localDateWith;
        this.d = new iu1(LocalDate.now().getDayOfWeek().getValue() >= 6 ? 1 : 0);
        this.e = rz1.x(Boolean.FALSE);
        this.f = rz1.x(null);
        this.g = rz1.x(null);
        this.h = rz1.x(ag0.h);
        this.i = rz1.x(yf0.h);
        this.j = rz1.x(null);
        this.k = rz1.x(null);
        f();
    }

    public final LocalDate e() {
        return this.c.plusWeeks(this.d.g());
    }

    public final void f() {
        ie1.p(h7.h0(this), null, new ul(this, null, (byte) 4), 3);
    }

    public final void g(n63 n63Var, vp0 vp0Var) {
        lu1 lu1Var = this.j;
        if (((n63) lu1Var.getValue()) != null) {
            return;
        }
        lu1Var.setValue(n63Var);
        this.k.setValue(null);
        this.l = ie1.p(h7.h0(this), null, new ha2(this, vp0Var, null, (byte) 6), 3);
    }
}
