package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c73 implements vf2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ LocalDate c;

    public c73(long j, long j2, LocalDate localDate) {
        this.a = j;
        this.b = j2;
        this.c = localDate;
    }

    @Override // defpackage.vf2
    public final boolean a(int i) {
        LocalDate localDate = this.c;
        return i <= localDate.getYear() && localDate.minusYears(5L).getYear() <= i;
    }

    @Override // defpackage.vf2
    public final boolean b(long j) {
        return this.a <= j && j <= this.b;
    }
}
