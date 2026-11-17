package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 implements hz0 {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final zk0 c;

    public ce1(ui1 ui1Var, long j) {
        this.a = j;
        this.c = new zk0(ui1Var.a, this);
    }

    @Override // defpackage.hz0
    public final pk0 a() {
        return this.c;
    }
}
