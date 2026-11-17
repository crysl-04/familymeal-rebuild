package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i62 implements ln2, pk0, lq0 {
    public final /* synthetic */ nn2 h;

    public i62(nn2 nn2Var) {
        this.h = nn2Var;
    }

    @Override // defpackage.pk0
    public final Object a(qk0 qk0Var, m10 m10Var) {
        this.h.a(qk0Var, m10Var);
        return y20.h;
    }

    @Override // defpackage.lq0
    public final pk0 b(o20 o20Var, int i, dp dpVar) {
        return (((i < 0 || i >= 2) && i != -2) || dpVar != dp.i) ? tz0.s(this, o20Var, i, dpVar) : this;
    }

    @Override // defpackage.ln2
    public final Object getValue() {
        return this.h.getValue();
    }
}
