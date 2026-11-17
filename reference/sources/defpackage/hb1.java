package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements View.OnTouchListener {
    public static final int x = ViewConfiguration.getTapTimeout();
    public final qi h;
    public final AccelerateInterpolator i;
    public final be0 j;
    public q6 k;
    public final float[] l;
    public final float[] m;
    public final int n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final be0 w;

    public hb1(be0 be0Var) {
        qi qiVar = new qi();
        qiVar.d = Long.MIN_VALUE;
        qiVar.f = -1L;
        qiVar.e = 0L;
        this.h = qiVar;
        this.i = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.l = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.q = fArr5;
        this.j = be0Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.n = x;
        qiVar.a = (short) 500;
        qiVar.b = (short) 500;
        this.w = be0Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.l[i] * f2, 0.0f, this.m[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.i;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.o[i];
            float f5 = this.p[i];
            float f6 = this.q[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.o[i];
        float f9 = this.p[i];
        float f10 = this.q[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.u) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.s) {
            this.u = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        qi qiVar = this.h;
        int i2 = (int) (jCurrentAnimationTimeMillis - qiVar.d);
        short s = qiVar.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        qiVar.h = i;
        qiVar.g = qiVar.a(jCurrentAnimationTimeMillis);
        qiVar.f = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        be0 be0Var;
        int count;
        float f = this.h.c;
        int iAbs = (int) (f / Math.abs(f));
        if (iAbs != 0 && (count = (be0Var = this.w).getCount()) != 0) {
            int childCount = be0Var.getChildCount();
            int firstVisiblePosition = be0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && be0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && be0Var.getChildAt(childCount - 1).getBottom() <= be0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r0 == 3) goto L11;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.v
            r1 = 0
            if (r0 == 0) goto L72
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 == r2) goto L14
            r3 = 2
            if (r0 == r3) goto L1c
            r8 = 3
            if (r0 != r8) goto L72
        L14:
            r7.d()
            return r1
        L18:
            r7.t = r2
            r7.r = r1
        L1c:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            be0 r4 = r7.j
            int r5 = r4.getWidth()
            float r5 = (float) r5
            r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r8 = r7.a(r2, r9, r8, r0)
            qi r9 = r7.h
            r9.c = r8
            boolean r8 = r7.u
            if (r8 != 0) goto L72
            boolean r8 = r7.e()
            if (r8 == 0) goto L72
            q6 r8 = r7.k
            if (r8 != 0) goto L5a
            q6 r8 = new q6
            r8.<init>(r7, r2)
            r7.k = r8
        L5a:
            r7.u = r2
            r7.s = r2
            boolean r9 = r7.r
            if (r9 != 0) goto L6d
            int r9 = r7.n
            if (r9 <= 0) goto L6d
            long r5 = (long) r9
            java.util.WeakHashMap r9 = defpackage.t43.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L70
        L6d:
            r8.run()
        L70:
            r7.r = r2
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
