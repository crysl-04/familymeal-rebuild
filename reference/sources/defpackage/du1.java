package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class du1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        bx2[] bx2VarArr = ax2.b;
        a = ax2.c;
    }

    public static final cu1 a(cu1 cu1Var, int i, int i2, long j, zv2 zv2Var, xz1 xz1Var, w91 w91Var, int i3, int i4, ow2 ow2Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        zv2 zv2Var2 = zv2Var;
        xz1 xz1Var2 = xz1Var;
        w91 w91Var2 = w91Var;
        int i7 = i3;
        int i8 = i4;
        ow2 ow2Var2 = ow2Var;
        if (i5 == 0 || i5 == cu1Var.a) {
            bx2[] bx2VarArr = ax2.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (ax2.a(j3, cu1Var.c)) {
                }
            }
            if ((zv2Var2 == null || zv2Var2.equals(cu1Var.d)) && ((i6 == 0 || i6 == cu1Var.b) && ((xz1Var2 == null || xz1Var2.equals(cu1Var.e)) && ((w91Var2 == null || w91Var2.equals(cu1Var.f)) && ((i7 == 0 || i7 == cu1Var.g) && ((i8 == 0 || i8 == cu1Var.h) && (ow2Var2 == null || ow2Var2.equals(cu1Var.i)))))))) {
                return cu1Var;
            }
        } else {
            j2 = 0;
        }
        bx2[] bx2VarArr2 = ax2.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = cu1Var.c;
        }
        if (zv2Var2 == null) {
            zv2Var2 = cu1Var.d;
        }
        if (i5 == 0) {
            i5 = cu1Var.a;
        }
        if (i6 == 0) {
            i6 = cu1Var.b;
        }
        xz1 xz1Var3 = cu1Var.e;
        if (xz1Var3 != null && xz1Var2 == null) {
            xz1Var2 = xz1Var3;
        }
        if (w91Var2 == null) {
            w91Var2 = cu1Var.f;
        }
        if (i7 == 0) {
            i7 = cu1Var.g;
        }
        if (i8 == 0) {
            i8 = cu1Var.h;
        }
        if (ow2Var2 == null) {
            ow2Var2 = cu1Var.i;
        }
        return new cu1(i5, i6, j3, zv2Var2, xz1Var2, w91Var2, i7, i8, ow2Var2);
    }
}
