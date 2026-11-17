package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements k21, Serializable {
    public transient k21 h;
    public final Object i;
    public final Class j;
    public final String k;
    public final String l;
    public final boolean m;

    public kq(Object obj, Class cls, String str, String str2, boolean z) {
        this.i = obj;
        this.j = cls;
        this.k = str;
        this.l = str2;
        this.m = z;
    }

    public k21 d() {
        z72.a.getClass();
        return this;
    }

    public final au e() {
        Class cls = this.j;
        if (cls == null) {
            return null;
        }
        if (!this.m) {
            return z72.a(cls);
        }
        z72.a.getClass();
        return new mt1(cls);
    }
}
