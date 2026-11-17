package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 implements zg1 {
    public final Context h;
    public k10 i;
    public final hu1 j = new hu1(1.0f);
    public dn2 k;

    public ah1(Context context) {
        this.h = context;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }

    @Override // defpackage.zg1
    public final float u() {
        m10 m10Var;
        ln2 ln2Var;
        if (this.k == null) {
            Context context = this.h;
            mj1 mj1Var = j93.a;
            synchronized (mj1Var) {
                Object objG = mj1Var.g(context);
                m10Var = null;
                if (objG == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    fp fpVarA = ls.a(-1, 6, null);
                    vr vrVar = new vr(new ik1(contentResolver, uriFor, new m30(fpVarA, Handler.createAsync(Looper.getMainLooper())), fpVarA, context, null), (byte) 4);
                    up2 up2Var = new up2(null);
                    r70 r70Var = ya0.a;
                    objG = lt.f0(vrVar, new k10(cu.Q(up2Var, pd1.a)), new jn2(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    mj1Var.n(context, objG);
                }
                ln2Var = (ln2) objG;
            }
            this.j.h(((Number) ln2Var.getValue()).floatValue());
            k10 k10Var = this.i;
            if (k10Var == null) {
                li1.g("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.k = ie1.p(k10Var, null, new h(ln2Var, this, m10Var, (byte) 21), 3);
        }
        return this.j.g();
    }
}
