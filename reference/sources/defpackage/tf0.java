package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements tu0 {
    public final boolean h;

    public tf0(boolean z) {
        this.h = z;
    }

    @Override // defpackage.tu0
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.tu0
    public final wn1 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.h ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
