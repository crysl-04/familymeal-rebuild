package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cs0 {
    public boolean A;
    public RectF B;
    public final gs0 a;
    public Outline f;
    public float j;
    public ou k;
    public l9 l;
    public l9 m;
    public boolean n;
    public yq o;
    public e9 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public e90 b = t03.u;
    public u31 c = u31.h;
    public vp0 d = wb.t;
    public final zb e = new zb(this, 3);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final kt r = new kt();

    static {
        uz0.g(Build.FINGERPRINT, "robolectric");
    }

    public cs0(gs0 gs0Var) {
        this.a = gs0Var;
        gs0Var.w = false;
        gs0Var.a();
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        gs0 gs0Var = this.a;
        RenderNode renderNode = gs0Var.c;
        if (this.g) {
            boolean z = this.A;
            if (z || gs0Var.p > 0.0f) {
                l9 l9Var = this.l;
                if (l9Var != null) {
                    Path path = l9Var.a;
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    path.computeBounds(rectF, false);
                    Outline outline = this.f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f = outline;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        outline.setPath(path);
                    } else {
                        outline.setConvexPath(path);
                    }
                    outline.offset(this.v, this.w);
                    this.n = !outline.canClip();
                    this.l = l9Var;
                    outline.setAlpha(gs0Var.h);
                    rectF.width();
                    rectF.height();
                    renderNode.setOutline(outline);
                    gs0Var.g = true;
                    gs0Var.a();
                    if (this.n && this.A) {
                        gs0Var.w = false;
                        gs0Var.a();
                        renderNode.discardDisplayList();
                    } else {
                        gs0Var.w = this.A;
                        gs0Var.a();
                    }
                } else {
                    gs0Var.w = z;
                    gs0Var.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jG = ou.G(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jG = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (jG >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (jG & 4294967295L)) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(gs0Var.h);
                    renderNode.setOutline(outline3);
                    gs0Var.g = true;
                    gs0Var.a();
                }
            } else {
                gs0Var.w = false;
                gs0Var.a();
                renderNode.setOutline(null);
                gs0Var.g = false;
                gs0Var.a();
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            kt ktVar = this.r;
            cs0 cs0Var = (cs0) ktVar.b;
            if (cs0Var != null) {
                cs0Var.q--;
                cs0Var.b();
                ktVar.b = null;
            }
            nj1 nj1Var = (nj1) ktVar.d;
            if (nj1Var != null) {
                Object[] objArr = nj1Var.b;
                long[] jArr = nj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    cs0 cs0Var2 = (cs0) objArr[(i << 3) + i3];
                                    cs0Var2.q--;
                                    cs0Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                nj1Var.b();
            }
            this.a.c.discardDisplayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(td0 td0Var) {
        kt ktVar = this.r;
        ktVar.c = (cs0) ktVar.b;
        nj1 nj1Var = (nj1) ktVar.d;
        if (nj1Var != null && nj1Var.h()) {
            nj1 nj1Var2 = (nj1) ktVar.e;
            if (nj1Var2 == null) {
                nj1 nj1Var3 = cd2.a;
                nj1Var2 = new nj1();
                ktVar.e = nj1Var2;
            }
            nj1Var2.j(nj1Var);
            nj1Var.b();
        }
        ktVar.a = true;
        this.d.h(td0Var);
        ktVar.a = false;
        cs0 cs0Var = (cs0) ktVar.c;
        if (cs0Var != null) {
            cs0Var.q--;
            cs0Var.b();
        }
        nj1 nj1Var4 = (nj1) ktVar.e;
        if (nj1Var4 == null || !nj1Var4.h()) {
            return;
        }
        Object[] objArr = nj1Var4.b;
        long[] jArr = nj1Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            cs0 cs0Var2 = (cs0) objArr[(i << 3) + i3];
                            cs0Var2.q--;
                            cs0Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        nj1Var4.b();
    }

    public final ou d() {
        ou ns1Var;
        ou ouVar = this.k;
        l9 l9Var = this.l;
        if (ouVar != null) {
            return ouVar;
        }
        if (l9Var != null) {
            ms1 ms1Var = new ms1(l9Var);
            this.k = ms1Var;
            return ms1Var;
        }
        long jG = ou.G(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jG = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jG >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jG & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            ns1Var = new os1(h12.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)));
        } else {
            ns1Var = new ns1(new r72(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = ns1Var;
        return ns1Var;
    }

    public final void e() {
        e90 e90Var = this.b;
        u31 u31Var = this.c;
        gs0 gs0Var = this.a;
        yq yqVar = gs0Var.b;
        RenderNode renderNode = gs0Var.c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(gs0Var.x)) << 32) | (((long) Float.floatToRawIntBits(gs0Var.y)) & 4294967295L);
        try {
            zq zqVar = gs0Var.a;
            a6 a6Var = zqVar.a;
            Canvas canvas = a6Var.a;
            a6Var.a = recordingCanvasBeginRecording;
            eg egVar = yqVar.i;
            egVar.F(e90Var);
            egVar.G(u31Var);
            egVar.j = this;
            egVar.H(gs0Var.d);
            egVar.E(a6Var);
            float f = gs0Var.x;
            zb zbVar = this.e;
            if (f > 0.0f || gs0Var.y > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                a6Var.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                zbVar.h(yqVar);
                a6Var.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                zbVar.h(yqVar);
            }
            zqVar.a.a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void f(long j) {
        if (up1.b(this.z, j)) {
            return;
        }
        this.z = j;
        gs0 gs0Var = this.a;
        gs0Var.k = j;
        gs0Var.d();
    }

    public final void g(long j, long j2) {
        gs0 gs0Var = this.a;
        RenderNode renderNode = gs0Var.c;
        gs0Var.D = (int) (j >> 32);
        gs0Var.E = (int) (j & 4294967295L);
        boolean zA = wj2.a(gs0Var.d, ou.G(j2));
        gs0Var.d = ou.G(j2);
        gs0Var.e();
        if (zA || !up1.b(gs0Var.k, 9205357640488583168L)) {
            return;
        }
        renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + gs0Var.x);
        renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + gs0Var.y);
    }

    public final void h(float f, long j, long j2) {
        long jE = up1.e(j, (((long) Float.floatToRawIntBits(this.v)) << 32) | (((long) Float.floatToRawIntBits(this.w)) & 4294967295L));
        if (up1.b(this.h, jE) && wj2.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
