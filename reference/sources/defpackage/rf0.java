package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 {
    public byte a = 1;
    public final eg1 b;
    public eg1 c;
    public eg1 d;
    public int e;
    public int f;

    public rf0(eg1 eg1Var) {
        this.b = eg1Var;
        this.c = eg1Var;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        cg1 cg1VarB = this.c.b.b();
        int iA = cg1VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) cg1VarB.k).get(iA + cg1VarB.h) == 0) || this.e == 65039;
    }
}
