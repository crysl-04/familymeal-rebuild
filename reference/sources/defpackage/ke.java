package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ke {
    public static final bi h = new bi(0);
    public static final Object i = new Object();

    public static void c(te teVar) {
        synchronized (i) {
            bi biVar = h;
            biVar.getClass();
            nh nhVar = new nh(biVar);
            while (nhVar.hasNext()) {
                ke keVar = (ke) ((WeakReference) nhVar.next()).get();
                if (keVar == teVar || keVar == null) {
                    nhVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean d(int i2);
}
