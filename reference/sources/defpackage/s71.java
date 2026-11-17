package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s71 extends qy {
    public final q71 b;
    public final v61 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ v61 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ bm i;
    public final /* synthetic */ cm j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ b81 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(long j, boolean z, q71 q71Var, v61 v61Var, int i, int i2, bm bmVar, cm cmVar, int i3, int i4, long j2, b81 b81Var) {
        super((byte) 1);
        this.e = z;
        this.f = v61Var;
        this.g = i;
        this.h = i2;
        this.i = bmVar;
        this.j = cmVar;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = b81Var;
        this.b = q71Var;
        this.c = v61Var;
        this.d = l00.b(0, z ? k00.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : k00.h(j), 5);
    }

    public final v71 q(int i, long j) {
        q71 q71Var = this.b;
        Object objB = q71Var.b(i);
        Object objA = q71Var.b.A(i);
        return new v71(i, h(this.c, i, j), this.e, this.i, this.j, this.f.i.getLayoutDirection(), this.k, this.l, i == this.g + (-1) ? 0 : this.h, this.m, objB, objA, this.n.o, j);
    }
}
