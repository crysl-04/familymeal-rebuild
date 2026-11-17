package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x03 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final wk b;
    public volatile int c = 0;

    public x03(wk wkVar, int i) {
        this.b = wkVar;
        this.a = i;
    }

    public final int a(int i) {
        cg1 cg1VarB = b();
        int iA = cg1VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) cg1VarB.k;
        int i2 = iA + cg1VarB.h;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final cg1 b() {
        ThreadLocal threadLocal = d;
        cg1 cg1Var = (cg1) threadLocal.get();
        if (cg1Var == null) {
            cg1Var = new cg1();
            threadLocal.set(cg1Var);
        }
        dg1 dg1Var = (dg1) this.b.i;
        int iA = dg1Var.a(6);
        if (iA != 0) {
            int i = iA + dg1Var.h;
            int i2 = ((ByteBuffer) dg1Var.k).getInt(i) + i + 4 + (this.a << 2);
            int i3 = ((ByteBuffer) dg1Var.k).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) dg1Var.k;
            cg1Var.k = byteBuffer;
            if (byteBuffer != null) {
                cg1Var.h = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                cg1Var.i = i4;
                cg1Var.j = ((ByteBuffer) cg1Var.k).getShort(i4);
                return cg1Var;
            }
            cg1Var.h = 0;
            cg1Var.i = 0;
            cg1Var.j = 0;
        }
        return cg1Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        cg1 cg1VarB = b();
        int iA = cg1VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) cg1VarB.k).getInt(iA + cg1VarB.h) : 0));
        sb.append(", codepoints:");
        cg1 cg1VarB2 = b();
        int iA2 = cg1VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + cg1VarB2.h;
            i = ((ByteBuffer) cg1VarB2.k).getInt(((ByteBuffer) cg1VarB2.k).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
