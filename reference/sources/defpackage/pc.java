package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pc implements ze1 {
    public final wc a;
    public boolean b;

    public pc(wc wcVar) {
        this.a = wcVar;
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iG = ((ue1) list.get(0)).g(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iG2 = ((ue1) list.get(i2)).g(i);
                if (iG2 > iG) {
                    iG = iG2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iG;
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((ue1) list.get(0)).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA1 = ((ue1) list.get(i2)).a0(i);
                if (iA1 > iA0) {
                    iA0 = iA1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        lu1 lu1Var = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            ny1 ny1VarE = ((ue1) list.get(i)).e(j);
            iMax = Math.max(iMax, ny1VarE.h);
            iMax2 = Math.max(iMax2, ny1VarE.i);
            arrayList.add(ny1VarE);
        }
        if (bf1Var.u()) {
            this.b = true;
            lu1Var.setValue(new vy0((((long) iMax) << 32) | (((long) iMax2) & 4294967295L)));
        } else if (!this.b) {
            lu1Var.setValue(new vy0((((long) iMax) << 32) | (((long) iMax2) & 4294967295L)));
        }
        return bf1Var.g0(iMax, iMax2, bg0.h, new zb(arrayList, (byte) 1));
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD0 = ((ue1) list.get(0)).d0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iD1 = ((ue1) list.get(i2)).d0(i);
                if (iD1 > iD0) {
                    iD0 = iD1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iD0;
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU = ((ue1) list.get(0)).U(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iU2 = ((ue1) list.get(i2)).U(i);
                if (iU2 > iU) {
                    iU = iU2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iU;
    }
}
