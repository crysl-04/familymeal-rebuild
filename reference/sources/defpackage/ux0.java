package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    public /* synthetic */ ux0(int i, ny1 ny1Var, int i2) {
        this.h = (byte) 1;
        this.i = i;
        this.j = ny1Var;
        this.k = i2;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.k;
        int i2 = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                my1.i((my1) obj, (ny1) obj2, i2, i);
                break;
            case 1:
                ny1 ny1Var = (ny1) obj2;
                my1.i((my1) obj, ny1Var, ie1.x((i2 - ny1Var.h) / 2.0f), ie1.x((i - ny1Var.i) / 2.0f));
                break;
            case 2:
                my1.i((my1) obj, (ny1) obj2, i2, i);
                break;
            default:
                l9 l9Var = (l9) obj2;
                yt1 yt1Var = (yt1) obj;
                g9 g9Var = yt1Var.a;
                int iB = yt1Var.b(i2);
                int iB2 = yt1Var.b(i);
                CharSequence charSequence = g9Var.e;
                if (iB < 0 || iB > iB2 || iB2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbK = wi0.k("start(", iB, ") or end(", iB2, ") is out of range [0..");
                    sbK.append(length);
                    sbK.append("], or start > end!");
                    bx0.a(sbK.toString());
                }
                Path path = new Path();
                hw2 hw2Var = g9Var.d;
                hw2Var.f.getSelectionPath(iB, iB2, path);
                int i3 = hw2Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long jFloatToRawIntBits = Float.floatToRawIntBits(yt1Var.f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(0.0f, Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                l9Var.a.addPath(path, 0.0f, 0.0f);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ ux0(Object obj, int i, int i2, byte b) {
        this.h = b;
        this.j = obj;
        this.i = i;
        this.k = i2;
    }
}
