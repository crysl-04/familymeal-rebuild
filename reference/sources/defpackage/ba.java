package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ba implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ArrayList i;

    public /* synthetic */ ba(ArrayList arrayList, byte b) {
        this.h = b;
        this.i = arrayList;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        ArrayList arrayList = this.i;
        switch (b) {
            case 0:
                my1 my1Var = (my1) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        my1.k(my1Var, (ny1) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return j23.a;
            case 1:
                arrayList.get(((Number) obj).intValue());
                return null;
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
