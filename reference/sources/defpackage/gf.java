package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gf extends do0 {
    public final /* synthetic */ nf q;
    public final /* synthetic */ qf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(qf qfVar, qf qfVar2, nf nfVar) {
        super(qfVar2);
        this.r = qfVar;
        this.q = nfVar;
    }

    @Override // defpackage.do0
    public final aj2 b() {
        return this.q;
    }

    @Override // defpackage.do0
    public final boolean c() {
        qf qfVar = this.r;
        if (qfVar.getInternalPopup().a()) {
            return true;
        }
        qfVar.m.m(qfVar.getTextDirection(), qfVar.getTextAlignment());
        return true;
    }
}
