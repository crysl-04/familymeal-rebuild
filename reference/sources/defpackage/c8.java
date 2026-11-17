package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c8 implements ze1 {
    public static final c8 b = new c8(0);
    public static final c8 c = new c8(1);
    public static final c8 d = new c8(2);
    public static final c8 e = new c8(3);
    public static final rt f = new rt((byte) 19);
    public static final c8 g = new c8(4);
    public static final c8 h = new c8(5);
    public final /* synthetic */ byte a;

    public /* synthetic */ c8(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        byte b2 = this.a;
        bg0 bg0Var = bg0.h;
        byte b3 = 0;
        switch (b2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iK = 0;
                int iJ = 0;
                for (int i = 0; i < size; i++) {
                    ny1 ny1VarE = ((ue1) list.get(i)).e(j);
                    iK = Math.max(iK, ny1VarE.h);
                    iJ = Math.max(iJ, ny1VarE.i);
                    arrayList.add(ny1VarE);
                }
                if (list.isEmpty()) {
                    iK = k00.k(j);
                    iJ = k00.j(j);
                }
                return bf1Var.g0(iK, iJ, bg0Var, new b8(arrayList, (byte) 0));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return bf1Var.g0(0, 0, bg0Var, z9.i);
                }
                if (size2 == 1) {
                    ny1 ny1VarE2 = ((ue1) list.get(0)).e(j);
                    return bf1Var.g0(ny1VarE2.h, ny1VarE2.i, bg0Var, new aa(ny1VarE2, b3));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i2 = 0; i2 < size3; i2++) {
                    ny1 ny1VarE3 = ((ue1) list.get(i2)).e(j);
                    iMax = Math.max(iMax, ny1VarE3.h);
                    iMax2 = Math.max(iMax2, ny1VarE3.i);
                    arrayList2.add(ny1VarE3);
                }
                return bf1Var.g0(iMax, iMax2, bg0Var, new ba(arrayList2, (byte) 0));
            case 2:
                return bf1Var.g0(k00.k(j), k00.j(j), bg0Var, new s0((byte) 24));
            case 3:
                return bf1Var.g0(k00.i(j), k00.h(j), bg0Var, f);
            case 4:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                while (b3 < size4) {
                    ny1 ny1VarE4 = ((ue1) list.get(b3)).e(j);
                    iMax3 = Math.max(iMax3, ny1VarE4.h);
                    iMax4 = Math.max(iMax4, ny1VarE4.i);
                    arrayList3.add(ny1VarE4);
                    b3++;
                }
                return bf1Var.g0(iMax3, iMax4, bg0Var, new b8(arrayList3, (byte) 2));
            default:
                return bf1Var.g0(k00.g(j) ? k00.i(j) : 0, k00.f(j) ? k00.h(j) : 0, bg0Var, new jc2((byte) 25));
        }
    }
}
