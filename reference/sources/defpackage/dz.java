package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dz extends az {
    public final boolean c;

    public dz(p4 p4Var, boolean z) {
        super(p4Var);
        this.c = z;
    }

    @Override // defpackage.az
    public final void e(byte b) {
        boolean z = this.c;
        String strValueOf = String.valueOf(b & 255);
        if (z) {
            j(strValueOf);
        } else {
            strValueOf.getClass();
            ((p4) this.b).i(strValueOf);
        }
    }

    @Override // defpackage.az
    public final void g(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((p4) this.b).i(unsignedString);
        }
    }

    @Override // defpackage.az
    public final void h(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((p4) this.b).i(unsignedString);
        }
    }

    @Override // defpackage.az
    public final void i(short s) {
        boolean z = this.c;
        String strValueOf = String.valueOf(s & 65535);
        if (z) {
            j(strValueOf);
        } else {
            strValueOf.getClass();
            ((p4) this.b).i(strValueOf);
        }
    }
}
