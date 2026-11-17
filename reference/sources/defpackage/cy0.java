package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 implements dy0 {
    public final long h;
    public final int i;

    public cy0(int i, long j) {
        this.h = j;
        this.i = i;
    }

    @Override // defpackage.dy0
    public final ay0 toInstant() {
        ay0 ay0Var = ay0.j;
        ay0 ay0Var2 = ay0.j;
        long j = ay0Var2.h;
        long j2 = this.h;
        if (j2 >= j) {
            ay0 ay0Var3 = ay0.k;
            if (j2 <= ay0Var3.h) {
                long j3 = this.i;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? ay0Var3 : ay0Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new ay0((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
                    }
                }
            }
        }
        throw new by0("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
