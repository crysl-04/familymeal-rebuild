package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m31 implements jq0, Serializable {
    public final byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public m31(int i) {
        this.h = i;
    }

    @Override // defpackage.jq0
    public final int b() {
        return this.h;
    }

    public final String toString() {
        z72.a.getClass();
        return a82.a(this);
    }
}
