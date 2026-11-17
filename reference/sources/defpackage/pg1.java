package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface pg1 extends rg1 {
    @Override // defpackage.rg1
    default Object a(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.rg1
    default boolean b(vp0 vp0Var) {
        return ((Boolean) vp0Var.h(this)).booleanValue();
    }
}
