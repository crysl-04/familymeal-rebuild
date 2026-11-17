package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class za0 {
    public final DisplayCutout a;

    public za0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final ox0 a() {
        return Build.VERSION.SDK_INT >= 30 ? ox0.c(a2.c(this.a)) : ox0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || za0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((za0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
