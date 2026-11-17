package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class od2 {
    public final lu1 a = rz1.x(Boolean.FALSE);

    public final void a(t6 t6Var, zg2 zg2Var, o20 o20Var, Consumer consumer) {
        uj1 uj1Var = new uj1(new pd2[16]);
        r02.G(zg2Var.a(), 0, new nd2(1, uj1Var, uj1.class, "add", "add(Ljava/lang/Object;)Z", 8));
        Arrays.sort(uj1Var.h, 0, uj1Var.j, vs.t(new jc2((byte) 16), new jc2((byte) 17)));
        int i = uj1Var.j;
        pd2 pd2Var = (pd2) (i == 0 ? null : uj1Var.h[i - 1]);
        if (pd2Var == null) {
            return;
        }
        ry0 ry0Var = pd2Var.c;
        ny nyVar = new ny(pd2Var.a, ry0Var, vs.b(o20Var), this, t6Var);
        pn1 pn1Var = pd2Var.d;
        r72 r72VarM = es.D(pn1Var).M(pn1Var, true);
        long j = (((long) ry0Var.a) << 32) | (((long) ry0Var.b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(t6Var, y02.w(cu.a0(r72VarM)), new Point((int) (j >> 32), (int) (j & 4294967295L)), nyVar);
        scrollCaptureTarget.setScrollBounds(y02.w(ry0Var));
        consumer.accept(scrollCaptureTarget);
    }
}
