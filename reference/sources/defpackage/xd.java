package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends SegmentFinder {
    public final /* synthetic */ k42 a;

    public xd(k42 k42Var) {
        this.a = k42Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.i(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.k(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.b(i);
    }
}
