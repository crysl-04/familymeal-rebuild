package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 implements ln0 {
    public final float[] a;
    public final float[] b;

    public nn0(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            wg.m("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.ln0
    public final float a(float f) {
        return cu.L(f, this.b, this.a);
    }

    @Override // defpackage.ln0
    public final float b(float f) {
        return cu.L(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nn0)) {
            return false;
        }
        nn0 nn0Var = (nn0) obj;
        return Arrays.equals(this.a, nn0Var.a) && Arrays.equals(this.b, nn0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        string.getClass();
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }
}
