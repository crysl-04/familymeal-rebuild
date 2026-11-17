package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s51 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ List k;

    public /* synthetic */ s51(sj1 sj1Var, ArrayList arrayList, List list, boolean z, byte b) {
        this.h = b;
        this.i = sj1Var;
        this.j = arrayList;
        this.k = list;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        List list = this.k;
        ArrayList arrayList = this.j;
        sj1 sj1Var = this.i;
        j23 j23Var = j23.a;
        my1 my1Var = (my1) obj;
        switch (b) {
            case 0:
                my1Var.h = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((u51) arrayList.get(i)).l(my1Var);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((u51) list.get(i2)).l(my1Var);
                }
                my1Var.h = false;
                sj1Var.getValue();
                break;
            default:
                my1Var.h = true;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((v71) arrayList.get(i3)).l(my1Var);
                }
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((v71) list.get(i4)).l(my1Var);
                }
                my1Var.h = false;
                sj1Var.getValue();
                break;
        }
        return j23Var;
    }
}
