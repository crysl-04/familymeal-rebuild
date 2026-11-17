package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u32 implements sj1, x20 {
    public final /* synthetic */ sj1 h;
    public final o20 i;

    public u32(sj1 sj1Var, o20 o20Var) {
        this.h = sj1Var;
        this.i = o20Var;
    }

    @Override // defpackage.x20
    public final o20 f() {
        return this.i;
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return this.h.getValue();
    }

    @Override // defpackage.sj1
    public final void setValue(Object obj) {
        this.h.setValue(obj);
    }
}
