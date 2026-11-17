package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k11 extends h7 {
    public final fe f0;
    public final jy1 g0;

    public k11(fe feVar, c11 c11Var) {
        this.f0 = feVar;
        this.g0 = c11Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // defpackage.h7, defpackage.v60
    public final short A() {
        w13 w13Var;
        fe feVar = this.f0;
        String strK = feVar.k();
        try {
            strK.getClass();
            m13 m13VarN = p02.N(strK);
            if (m13VarN != null) {
                int i = m13VarN.h;
                if (Integer.compareUnsigned(i, 65535) <= 0) {
                    w13Var = new w13((short) i);
                } else {
                    w13Var = null;
                }
            } else {
                w13Var = null;
            }
            if (w13Var != null) {
                return w13Var.h;
            }
            jo2.K(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'UShort' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.h7, defpackage.v60
    public final long b() {
        fe feVar = this.f0;
        String strK = feVar.k();
        try {
            strK.getClass();
            r13 r13VarO = p02.O(strK);
            if (r13VarO != null) {
                return r13VarO.h;
            }
            jo2.K(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'ULong' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hz
    public final int h(rh2 rh2Var) {
        rh2Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.h7, defpackage.v60
    public final int q() {
        fe feVar = this.f0;
        String strK = feVar.k();
        try {
            strK.getClass();
            m13 m13VarN = p02.N(strK);
            if (m13VarN != null) {
                return m13VarN.h;
            }
            jo2.K(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'UInt' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hz
    public final jy1 t() {
        return this.g0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // defpackage.h7, defpackage.v60
    public final byte v() {
        h13 h13Var;
        fe feVar = this.f0;
        String strK = feVar.k();
        try {
            strK.getClass();
            m13 m13VarN = p02.N(strK);
            if (m13VarN != null) {
                int i = m13VarN.h;
                if (Integer.compareUnsigned(i, 255) <= 0) {
                    h13Var = new h13((byte) i);
                } else {
                    h13Var = null;
                }
            } else {
                h13Var = null;
            }
            if (h13Var != null) {
                return h13Var.h;
            }
            jo2.K(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'UByte' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }
}
