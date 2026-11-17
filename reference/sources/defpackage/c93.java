package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c93 implements b93 {
    public final f90 b;

    public c93() {
        this.b = Build.VERSION.SDK_INT >= 34 ? g90.h : c5.O;
        lt.c(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
