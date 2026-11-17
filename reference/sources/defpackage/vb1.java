package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 {
    public final wb1 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public vb1(wb1 wb1Var) {
        this.a = wb1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vb1) {
            return this.a.equals(((vb1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
