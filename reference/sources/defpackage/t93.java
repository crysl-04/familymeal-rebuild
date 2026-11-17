package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t93 {
    public static final t93 a = new t93();

    public final long a(Paint paint) {
        int i = kv.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(ia2.w(i));
    }

    public final void c(Paint paint, long j) {
        int i = (int) (63 & j);
        paint.setColor((i == uv.x.c || i == uv.s.c || i == uv.t.c) ? t03.Q(kv.a(j, uv.e)) : t03.Q(j));
    }
}
