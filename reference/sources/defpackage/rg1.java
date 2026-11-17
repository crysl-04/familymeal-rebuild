package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface rg1 {
    Object a(zp0 zp0Var, Object obj);

    boolean b(vp0 vp0Var);

    default rg1 c(rg1 rg1Var) {
        return rg1Var == og1.h ? this : new ew(this, rg1Var);
    }
}
