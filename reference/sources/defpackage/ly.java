package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ly extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ ny m;
    public final /* synthetic */ ScrollCaptureSession n;
    public final /* synthetic */ Rect o;
    public final /* synthetic */ Consumer p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(ny nyVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, m10 m10Var) {
        super(2, m10Var);
        this.m = nyVar;
        this.n = scrollCaptureSession;
        this.o = rect;
        this.p = consumer;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((ly) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new ly(this.m, this.n, this.o, this.p, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            ScrollCaptureSession scrollCaptureSession = this.n;
            Rect rect = this.o;
            ry0 ry0Var = new ry0(rect.left, rect.top, rect.right, rect.bottom);
            this.l = true;
            obj = this.m.a(scrollCaptureSession, ry0Var, this);
            y20 y20Var = y20.h;
            if (obj == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        this.p.accept(y02.w((ry0) obj));
        return j23.a;
    }
}
