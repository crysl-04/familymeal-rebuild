package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gg extends t03 {
    public final /* synthetic */ byte I;

    public /* synthetic */ gg(byte b) {
        this.I = b;
    }

    @Override // defpackage.t03
    public final void A(CharSequence charSequence) {
        switch (this.I) {
            case 0:
                charSequence.getClass();
                lu1 lu1Var = hg.a;
                hg.b.setValue(charSequence.toString());
                break;
        }
    }

    @Override // defpackage.t03
    public final void B(en enVar) {
        switch (this.I) {
            case 0:
                hg.a.setValue(Boolean.TRUE);
                break;
        }
    }
}
