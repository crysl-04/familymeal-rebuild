package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mh extends AbstractSet {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Map i;

    public /* synthetic */ mh(Map map, byte b) {
        this.h = b;
        this.i = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.h;
        Map map = this.i;
        switch (b) {
            case 0:
                return new ph((rh) map);
            default:
                vc1 vc1Var = new vc1();
                vc1Var.h = ((wc1) map).j.b();
                return vc1Var;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.h;
        Map map = this.i;
        switch (b) {
            case 0:
                return ((rh) map).j;
            default:
                return ((wc1) map).j.i;
        }
    }
}
