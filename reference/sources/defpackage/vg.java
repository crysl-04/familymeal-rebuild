package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vg extends cy1 {
    public static volatile vg d;
    public static final ug e = new ug((byte) 0);
    public final c80 c = new c80();

    public static vg V() {
        if (d != null) {
            return d;
        }
        synchronized (vg.class) {
            if (d == null) {
                d = new vg();
            }
        }
        return d;
    }
}
