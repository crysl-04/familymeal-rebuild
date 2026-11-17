package defpackage;

import android.view.View;
import java.text.Format;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f3 {
    public boolean h = false;
    public Object i;

    public f3(Format format) {
        Objects.requireNonNull(format);
        this.i = (Format) format.clone();
    }

    public abstract void c();

    public final String d(Object obj) {
        Format format = (Format) this.i;
        try {
            if (!this.h) {
                a(format, obj);
                this.h = true;
            }
            return format.format(obj).replace(' ', (char) 160);
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    public abstract View e();

    public abstract if1 f();

    public abstract yp2 h();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z);

    public void a(Format format, Object obj) {
    }
}
