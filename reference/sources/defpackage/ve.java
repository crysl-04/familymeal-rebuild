package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ve {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ve c;
    public x82 a;

    public static synchronized ve a() {
        if (c == null) {
            c();
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            ve veVar = new ve();
            c = veVar;
            veVar.a = x82.c();
            x82 x82Var = c.a;
            o5 o5Var = new o5();
            synchronized (x82Var) {
                x82Var.e = o5Var;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
