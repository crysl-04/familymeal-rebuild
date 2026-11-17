package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ArrayList i;

    public /* synthetic */ b8(ArrayList arrayList, byte b) {
        this.h = b;
        this.i = arrayList;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ArrayList arrayList = this.i;
        my1 my1Var = (my1) obj;
        switch (b) {
            case 0:
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    my1.k(my1Var, (ny1) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    my1.l(my1Var, (ny1) arrayList.get(i2), 0, 0);
                }
                break;
            default:
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    my1.i(my1Var, (ny1) arrayList.get(i3), 0, 0);
                }
                break;
        }
        return j23Var;
    }
}
