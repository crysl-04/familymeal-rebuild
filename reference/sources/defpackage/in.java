package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class in implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte h = 0;
    public final Object i;

    public in(jn jnVar) {
        this.i = new WeakReference(jnVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((jn) weakReference.get()).f(true);
                }
                break;
            default:
                ((mj0) obj).x0.f(true);
                break;
        }
    }

    public in(mj0 mj0Var) {
        this.i = mj0Var;
    }
}
