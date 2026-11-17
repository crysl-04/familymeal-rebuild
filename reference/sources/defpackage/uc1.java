package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 implements Map.Entry {
    public final /* synthetic */ vc1 h;

    public uc1(vc1 vc1Var) {
        this.h = vc1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Long.valueOf(this.h.h.D0());
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h.h.get();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a42.b();
        throw null;
    }
}
