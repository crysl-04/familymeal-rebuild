package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tj1 extends qy {
    public final lu1 b;
    public final lu1 c;

    public tj1(Object obj) {
        super((byte) 4);
        this.b = rz1.x(obj);
        this.c = rz1.x(obj);
    }

    @Override // defpackage.qy
    public final Object g() {
        return this.b.getValue();
    }

    @Override // defpackage.qy
    public final Object i() {
        return this.c.getValue();
    }

    @Override // defpackage.qy
    public final void n(Object obj) {
        this.b.setValue(obj);
    }
}
