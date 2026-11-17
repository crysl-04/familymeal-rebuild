package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w33 implements q33 {
    public final byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public w33(int i) {
        this.h = i;
    }

    @Override // defpackage.q33
    public final int k() {
        return this.h;
    }

    @Override // defpackage.q33
    public final int o() {
        return 0;
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        return j < ((long) this.h) * 1000000 ? idVar : idVar2;
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        return idVar3;
    }
}
