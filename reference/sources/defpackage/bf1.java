package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface bf1 extends nz0 {
    af1 Q(int i, int i2, Map map, vp0 vp0Var, vp0 vp0Var2);

    default af1 g0(int i, int i2, Map map, vp0 vp0Var) {
        return Q(i, i2, map, null, vp0Var);
    }
}
