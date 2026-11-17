package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ny implements ScrollCaptureCallback {
    public final wg2 a;
    public final ry0 b;
    public final od2 c;
    public final t6 d;
    public final k10 e;
    public final nt0 f;

    public ny(wg2 wg2Var, ry0 ry0Var, k10 k10Var, od2 od2Var, t6 t6Var) {
        this.a = wg2Var;
        this.b = ry0Var;
        this.c = od2Var;
        this.d = t6Var;
        this.e = new k10(k10Var.h.i(sa0.i));
        this.f = new nt0(ry0Var.d - ry0Var.b, new qx2(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, ry0 ry0Var, n10 n10Var) {
        my myVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionJ;
        int i3;
        ry0 ry0Var2;
        int i4;
        int iN;
        int iN2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (n10Var instanceof my) {
            myVar = (my) n10Var;
            int i7 = myVar.q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                myVar.q = i7 - Integer.MIN_VALUE;
            } else {
                myVar = new my(this, n10Var);
            }
        } else {
            myVar = new my(this, n10Var);
        }
        Object obj = myVar.o;
        int i8 = myVar.q;
        nt0 nt0Var = this.f;
        y20 y20Var = y20.h;
        if (i8 == 0) {
            m02.y(obj);
            i = ry0Var.b;
            i2 = ry0Var.d;
            myVar.k = scrollCaptureSession;
            myVar.l = ry0Var;
            myVar.m = i;
            myVar.n = i2;
            myVar.q = 1;
            if (i > i2) {
                nt0Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = nt0Var.a;
            if (i9 > i10) {
                li1.e(wi0.f(i9, i10, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objB = nt0Var.b((((i9 / 2) + i) - (i10 / 2)) - nt0Var.b, myVar);
            Object obj2 = j23.a;
            if (objB != y20Var) {
                objB = obj2;
            }
            if (objB == y20Var) {
                obj2 = objB;
            }
            if (obj2 != y20Var) {
            }
            return y20Var;
        }
        if (i8 == 1) {
            int i11 = myVar.n;
            int i12 = myVar.m;
            ry0 ry0Var3 = myVar.l;
            ScrollCaptureSession scrollCaptureSessionJ2 = d7.j(myVar.k);
            m02.y(obj);
            i = i12;
            ry0Var = ry0Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionJ2;
        } else {
            if (i8 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = myVar.n;
            i4 = myVar.m;
            ry0Var2 = myVar.l;
            scrollCaptureSessionJ = d7.j(myVar.k);
            m02.y(obj);
        }
        iN = cy1.n(i4 - ie1.x(nt0Var.b), 0, nt0Var.a);
        iN2 = cy1.n(i3 - ie1.x(nt0Var.b), 0, nt0Var.a);
        i5 = ry0Var2.a;
        i6 = ry0Var2.c;
        if (iN == iN2) {
            return ry0.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionJ.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iN);
            ry0 ry0Var4 = this.b;
            canvasLockHardwareCanvas.translate(-ry0Var4.a, -ry0Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iX = ie1.x(nt0Var.b);
            return new ry0(i5, iN + iX, i6, iN2 + iX);
        } finally {
            scrollCaptureSessionJ.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        rt rtVar = new rt((byte) 1);
        myVar.k = scrollCaptureSession;
        myVar.l = ry0Var;
        myVar.m = i;
        myVar.n = i2;
        myVar.q = 2;
        o20 o20Var = myVar.i;
        o20Var.getClass();
        if (es.M(o20Var).c(myVar, rtVar) != y20Var) {
            scrollCaptureSessionJ = scrollCaptureSession;
            i3 = i2;
            ry0Var2 = ry0Var;
            i4 = i;
            iN = cy1.n(i4 - ie1.x(nt0Var.b), 0, nt0Var.a);
            iN2 = cy1.n(i3 - ie1.x(nt0Var.b), 0, nt0Var.a);
            i5 = ry0Var2.a;
            i6 = ry0Var2.c;
            if (iN == iN2) {
                return ry0.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionJ.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iN);
            ry0 ry0Var5 = this.b;
            canvasLockHardwareCanvas.translate(-ry0Var5.a, -ry0Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iX2 = ie1.x(nt0Var.b);
            return new ry0(i5, iN + iX2, i6, iN2 + iX2);
        }
        return y20Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ie1.p(this.e, eo1.i, new h(this, runnable, null, (byte) 11), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        dn2 dn2VarP = ie1.p(this.e, null, new ly(this, scrollCaptureSession, rect, consumer, null), 3);
        dn2VarP.r(new p((Object) cancellationSignal, (byte) 13));
        cancellationSignal.setOnCancelListener(new oy(dn2VarP, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(y02.w(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
