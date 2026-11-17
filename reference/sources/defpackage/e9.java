package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e9 {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public e9(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            r02.y("nav-entry-state:id");
            throw null;
        }
        this.b = string;
        int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            r02.y("nav-entry-state:destination-id");
            throw null;
        }
        this.a = i;
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            r02.y("nav-entry-state:args");
            throw null;
        }
        this.c = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.d = bundle3;
        } else {
            r02.y("nav-entry-state:saved-state");
            throw null;
        }
    }

    public final int a() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : f9.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 2 : 0;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : f9.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 1 : 0;
        }
        return 2;
    }

    public final void c(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        t93.a.b((Paint) this.b, i);
    }

    public final void e(long j) {
        t93.a.c((Paint) this.b, j);
    }

    public final void f(ln lnVar) {
        this.d = lnVar;
        ((Paint) this.b).setColorFilter(lnVar != null ? lnVar.a : null);
    }

    public final void g(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public final void h(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public final void i(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.b;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public final void j(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public final void k(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public final void l(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public e9(pk1 pk1Var, int i) {
        this.b = pk1Var.m;
        this.a = i;
        this.c = pk1Var.a();
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        this.d = bundleL;
        pk1Var.o.g(bundleL);
    }

    public e9(Paint paint) {
        this.b = paint;
        this.a = 3;
    }
}
