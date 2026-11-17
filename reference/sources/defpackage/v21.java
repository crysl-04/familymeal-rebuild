package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v21 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof v21) {
            return uz0.g(this.a, ((v21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
