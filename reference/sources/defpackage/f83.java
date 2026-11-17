package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f83 extends e83 {
    public f83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var, windowInsets);
    }

    @Override // defpackage.m83
    public q83 a() {
        return q83.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.m83
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return Objects.equals(this.c, f83Var.c) && Objects.equals(this.g, f83Var.g) && d83.K(this.h, f83Var.h);
    }

    @Override // defpackage.m83
    public za0 g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new za0(displayCutout);
    }

    @Override // defpackage.m83
    public int hashCode() {
        return this.c.hashCode();
    }
}
