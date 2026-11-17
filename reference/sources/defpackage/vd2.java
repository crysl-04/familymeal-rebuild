package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 implements ht1 {
    public final int h;
    public final ArrayList i;
    public Float j = null;
    public Float k = null;
    public md2 l = null;
    public md2 m = null;

    public vd2(ArrayList arrayList, int i) {
        this.h = i;
        this.i = arrayList;
    }

    @Override // defpackage.ht1
    public final boolean B() {
        return this.i.contains(this);
    }
}
