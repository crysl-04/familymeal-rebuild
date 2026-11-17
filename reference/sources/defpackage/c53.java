package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c53 implements d30 {
    public final /* synthetic */ byte h;

    public /* synthetic */ c53(byte b) {
        this.h = b;
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                int iHashCode = hashCode();
                vs.r(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return jp1.k("CreationExtras.Key@", string, "<", z72.a(Application.class).c(), ">");
            default:
                int iHashCode2 = hashCode();
                vs.r(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return jp1.k("CreationExtras.Key@", string2, "<", z72.a(String.class).c(), ">");
        }
    }
}
