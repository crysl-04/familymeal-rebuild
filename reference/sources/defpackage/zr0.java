package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 extends k80 implements sd0 {
    public Object A;
    public final /* synthetic */ byte x = 1;
    public final j8 y;
    public final oe0 z;

    public zr0(tq2 tq2Var, j8 j8Var, oe0 oe0Var, rt1 rt1Var) {
        this.y = j8Var;
        this.z = oe0Var;
        this.A = rt1Var;
        J0(tq2Var);
    }

    public static boolean M0(float f, EdgeEffect edgeEffect, RecordingCanvas recordingCanvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(recordingCanvas);
        }
        int iSave = recordingCanvas.save();
        recordingCanvas.rotate(f);
        boolean zDraw = edgeEffect.draw(recordingCanvas);
        recordingCanvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean N0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01f0 A[PHI: r21
  0x01f0: PHI (r21v2 boolean) = (r21v1 boolean), (r21v11 boolean) binds: [B:91:0x01a9, B:98:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        boolean zN0;
        char c;
        boolean zM0;
        boolean z;
        byte b = this.x;
        j8 j8Var = this.y;
        oe0 oe0Var = this.z;
        switch (b) {
            case 0:
                rt1 rt1Var = (rt1) this.A;
                yq yqVar = n41Var.h;
                j8Var.j(yqVar.d());
                if (wj2.c(yqVar.d())) {
                    n41Var.a();
                    return;
                }
                n41Var.a();
                j8Var.d.getValue();
                Canvas canvasA = b6.a(yqVar.i.g());
                if (oe0.f(oe0Var.f)) {
                    zN0 = N0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (yqVar.d() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(n41Var.A(rt1Var.a(n41Var.getLayoutDirection())))) & 4294967295L), oe0Var.c(), canvasA);
                } else {
                    zN0 = false;
                }
                if (oe0.f(oe0Var.d)) {
                    zN0 = N0(0.0f, ((long) Float.floatToRawIntBits(n41Var.A(rt1Var.b))) & 4294967295L, oe0Var.e(), canvasA) || zN0;
                }
                if (oe0.f(oe0Var.g)) {
                    EdgeEffect edgeEffectD = oe0Var.d();
                    zN0 = N0(90.0f, ((long) Float.floatToRawIntBits(n41Var.A(rt1Var.b(n41Var.getLayoutDirection())) + (-((float) ie1.x(Float.intBitsToFloat((int) (yqVar.d() >> 32))))))) & 4294967295L, edgeEffectD, canvasA) || zN0;
                }
                if (oe0.f(oe0Var.e)) {
                    EdgeEffect edgeEffectB = oe0Var.b();
                    float fA = n41Var.A(rt1Var.d);
                    zN0 = N0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (yqVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (yqVar.d() & 4294967295L))) + fA)) & 4294967295L), edgeEffectB, canvasA) || zN0;
                }
                if (zN0) {
                    j8Var.d();
                    return;
                }
                return;
            default:
                yq yqVar2 = n41Var.h;
                j8Var.j(yqVar2.d());
                Canvas canvasA2 = b6.a(yqVar2.i.g());
                j8Var.d.getValue();
                if (wj2.c(yqVar2.d())) {
                    n41Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = oe0Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = oe0Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = oe0Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = oe0Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = oe0Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = oe0Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = oe0Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = oe0Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    n41Var.a();
                    return;
                }
                float fA2 = n41Var.A(30.0f);
                boolean z2 = true;
                boolean z3 = oe0.f(oe0Var.d) || oe0.g(oe0Var.h) || oe0.f(oe0Var.e) || oe0.g(oe0Var.i);
                boolean z4 = oe0.f(oe0Var.f) || oe0.g(oe0Var.j) || oe0.f(oe0Var.g) || oe0.g(oe0Var.k);
                if (!z3) {
                    c = ' ';
                    if (!z4) {
                        n41Var.a();
                        return;
                    }
                    O0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight() + (ie1.x(fA2) << 1));
                } else if (z4) {
                    c = ' ';
                    O0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    c = ' ';
                    O0().setPosition(0, 0, canvasA2.getWidth() + (ie1.x(fA2) << 1), canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = O0().beginRecording();
                boolean zG = oe0.g(oe0Var.j);
                ks1 ks1Var = ks1.i;
                if (zG) {
                    EdgeEffect edgeEffectA = oe0Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = oe0Var.a(ks1Var);
                        oe0Var.j = edgeEffectA;
                    }
                    M0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (oe0.f(oe0Var.f)) {
                    EdgeEffect edgeEffectC = oe0Var.c();
                    zM0 = M0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (oe0.g(oe0Var.f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8Var.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = oe0Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = oe0Var.a(ks1Var);
                            oe0Var.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fD = i >= 31 ? m7.d(edgeEffectC) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i >= 31) {
                            m7.f(edgeEffectA2, fD, f);
                        } else {
                            edgeEffectA2.onPull(fD, f);
                        }
                    }
                } else {
                    zM0 = false;
                }
                boolean zG2 = oe0.g(oe0Var.h);
                ks1 ks1Var2 = ks1.h;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = oe0Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = oe0Var.a(ks1Var2);
                        oe0Var.h = edgeEffectA3;
                    }
                    M0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (oe0.f(oe0Var.d)) {
                    EdgeEffect edgeEffectE = oe0Var.e();
                    zM0 = M0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zM0;
                    if (oe0.g(oe0Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8Var.c() >> c));
                        EdgeEffect edgeEffectA4 = oe0Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = oe0Var.a(ks1Var2);
                            oe0Var.h = edgeEffectA4;
                        }
                        z = z3;
                        int i2 = Build.VERSION.SDK_INT;
                        float fD2 = i2 >= 31 ? m7.d(edgeEffectE) : 0.0f;
                        if (i2 >= 31) {
                            m7.f(edgeEffectA4, fD2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                }
                if (oe0.g(oe0Var.k)) {
                    EdgeEffect edgeEffectA5 = oe0Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = oe0Var.a(ks1Var);
                        oe0Var.k = edgeEffectA5;
                    }
                    M0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (oe0.f(oe0Var.g)) {
                    EdgeEffect edgeEffectD2 = oe0Var.d();
                    zM0 = M0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zM0;
                    if (oe0.g(oe0Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8Var.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = oe0Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = oe0Var.a(ks1Var);
                            oe0Var.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fD3 = i3 >= 31 ? m7.d(edgeEffectD2) : 0.0f;
                        if (i3 >= 31) {
                            m7.f(edgeEffectA6, fD3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                        }
                    }
                }
                if (oe0.g(oe0Var.i)) {
                    EdgeEffect edgeEffectA7 = oe0Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = oe0Var.a(ks1Var2);
                        oe0Var.i = edgeEffectA7;
                    }
                    M0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (oe0.f(oe0Var.e)) {
                    EdgeEffect edgeEffectB2 = oe0Var.b();
                    if (!M0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) && !zM0) {
                        z2 = false;
                    }
                    if (oe0.g(oe0Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j8Var.c() >> c));
                        EdgeEffect edgeEffectA8 = oe0Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = oe0Var.a(ks1Var2);
                            oe0Var.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fD4 = i4 >= 31 ? m7.d(edgeEffectB2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            m7.f(edgeEffectA8, fD4, f2);
                        } else {
                            edgeEffectA8.onPull(fD4, f2);
                        }
                    }
                    zM0 = z2;
                }
                if (zM0) {
                    j8Var.d();
                }
                float f3 = z4 ? 0.0f : fA2;
                if (z) {
                    fA2 = 0.0f;
                }
                u31 layoutDirection = n41Var.getLayoutDirection();
                a6 a6Var = new a6();
                a6Var.a = recordingCanvasBeginRecording;
                long jD = yqVar2.d();
                eg egVar = yqVar2.i;
                xq xqVar = ((yq) egVar.k).h;
                e90 e90Var = xqVar.a;
                u31 u31Var = xqVar.b;
                wq wqVarG = egVar.g();
                long jQ = yqVar2.i.q();
                eg egVar2 = yqVar2.i;
                cs0 cs0Var = (cs0) egVar2.j;
                egVar2.F(n41Var);
                egVar2.G(layoutDirection);
                egVar2.E(a6Var);
                egVar2.H(jD);
                egVar2.j = null;
                a6Var.l();
                try {
                    ((g2) yqVar2.i.i).P(f3, fA2);
                    try {
                        n41Var.a();
                        float f4 = -f3;
                        float f5 = -fA2;
                        ((g2) yqVar2.i.i).P(f4, f5);
                        a6Var.i();
                        eg egVar3 = yqVar2.i;
                        egVar3.F(e90Var);
                        egVar3.G(u31Var);
                        egVar3.E(wqVarG);
                        egVar3.H(jQ);
                        egVar3.j = cs0Var;
                        O0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f4, f5);
                        canvasA2.drawRenderNode(O0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((g2) yqVar2.i.i).P(-f3, -fA2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a6Var.i();
                    eg egVar4 = yqVar2.i;
                    egVar4.F(e90Var);
                    egVar4.G(u31Var);
                    egVar4.E(wqVarG);
                    egVar4.H(jQ);
                    egVar4.j = cs0Var;
                    throw th2;
                }
        }
    }

    public final RenderNode O0() {
        RenderNode renderNode = (RenderNode) this.A;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.A = renderNode2;
        return renderNode2;
    }

    public zr0(tq2 tq2Var, j8 j8Var, oe0 oe0Var) {
        this.y = j8Var;
        this.z = oe0Var;
        J0(tq2Var);
    }
}
