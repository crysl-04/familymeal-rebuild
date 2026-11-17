package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class an implements Runnable {
    public final /* synthetic */ byte h;
    public final WeakReference i;

    public an(jn jnVar, byte b) {
        this.h = b;
        switch (b) {
            case 2:
                this.i = new WeakReference(jnVar);
                break;
            default:
                this.i = new WeakReference(jnVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        WeakReference weakReference = this.i;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((bn) weakReference.get()).L();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((jn) weakReference.get()).l = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((jn) weakReference.get()).m = false;
                }
                break;
        }
    }

    public an(bn bnVar) {
        this.h = (byte) 0;
        this.i = new WeakReference(bnVar);
    }
}
