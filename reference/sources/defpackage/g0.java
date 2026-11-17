package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Collection i;

    public /* synthetic */ g0(Collection collection, byte b) {
        this.h = b;
        this.i = collection;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        boolean zContains;
        byte b = this.h;
        Collection<?> collection = this.i;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
