package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s8 implements bs0 {
    public final t6 a;
    public final Object b = new Object();
    public boolean c;
    public final q8 d;

    public s8(t6 t6Var) {
        this.a = t6Var;
        q8 q8Var = new q8();
        this.d = q8Var;
        if (t6Var.isAttachedToWindow()) {
            Context context = t6Var.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(q8Var);
                this.c = true;
            }
        }
        t6Var.addOnAttachStateChangeListener(new r8(this, (byte) 0));
    }

    @Override // defpackage.bs0
    public final void a(cs0 cs0Var) {
        synchronized (this.b) {
            if (!cs0Var.s) {
                cs0Var.s = true;
                cs0Var.b();
            }
        }
    }

    @Override // defpackage.bs0
    public final cs0 b() {
        cs0 cs0Var;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            cs0Var = new cs0(new gs0());
        }
        return cs0Var;
    }
}
