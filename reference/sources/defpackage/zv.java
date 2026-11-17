package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv implements vp0 {
    public final /* synthetic */ byte h = 2;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ zv(zm2 zm2Var, zm2 zm2Var2, zm2 zm2Var3, int i, zm2 zm2Var4) {
        this.j = zm2Var;
        this.k = zm2Var2;
        this.l = zm2Var3;
        this.i = i;
        this.m = zm2Var4;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = 0;
        int i2 = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (b) {
            case 0:
                ny1[] ny1VarArr = (ny1[]) obj5;
                aw awVar = (aw) obj4;
                bf1 bf1Var = (bf1) obj3;
                int[] iArr = (int[]) obj2;
                my1 my1Var = (my1) obj;
                int length = ny1VarArr.length;
                int i3 = 0;
                while (i < length) {
                    ny1 ny1Var = ny1VarArr[i];
                    int i4 = i3 + 1;
                    ny1Var.getClass();
                    Object objL = ny1Var.l();
                    sa2 sa2Var = objL instanceof sa2 ? (sa2) objL : null;
                    u31 layoutDirection = bf1Var.getLayoutDirection();
                    f30 f30Var = sa2Var != null ? sa2Var.c : null;
                    my1.i(my1Var, ny1Var, f30Var != null ? f30Var.h.a(ny1Var.h, i2, layoutDirection) : awVar.b.a(ny1Var.h, i2, layoutDirection), iArr[i3]);
                    i++;
                    i3 = i4;
                }
                return j23Var;
            case 1:
                zm2 zm2Var = (zm2) obj5;
                zm2 zm2Var2 = (zm2) obj4;
                zm2 zm2Var3 = (zm2) obj3;
                ic icVar = (ic) obj;
                return icVar.a(((ab0) icVar.d()).a == 1 ? ia2.x(vg0.h(new rt((byte) 9), zm2Var).a(vg0.d(zm2Var2, 2)), vg0.e(zm2Var3, 2).a(vg0.i(new a50(i2), zm2Var))) : ia2.x(vg0.h(new a50(i2), zm2Var).a(vg0.d(zm2Var2, 2)), vg0.i(new rt((byte) 9), zm2Var).a(vg0.e(zm2Var3, 2))), new ak2(new s((zm2) obj2, (byte) 7)));
            default:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                v72 v72Var = (v72) obj2;
                my1 my1Var2 = (my1) obj;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    my1.k(my1Var2, (ny1) arrayList.get(i5), v72Var.h * i5, 0);
                }
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ny1 ny1Var2 = (ny1) arrayList2.get(i6);
                    my1.k(my1Var2, ny1Var2, 0, i2 - ny1Var2.i);
                }
                int size3 = arrayList3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ny1 ny1Var3 = (ny1) arrayList3.get(i7);
                    my1.k(my1Var2, ny1Var3, 0, i2 - ny1Var3.i);
                }
                return j23Var;
        }
    }

    public /* synthetic */ zv(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, v72 v72Var, int i) {
        this.j = arrayList;
        this.k = arrayList2;
        this.l = arrayList3;
        this.m = v72Var;
        this.i = i;
    }

    public /* synthetic */ zv(ny1[] ny1VarArr, aw awVar, int i, bf1 bf1Var, int[] iArr) {
        this.j = ny1VarArr;
        this.k = awVar;
        this.i = i;
        this.l = bf1Var;
        this.m = iArr;
    }
}
