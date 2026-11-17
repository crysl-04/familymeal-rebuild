package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gc implements ze1 {
    public final oc a;
    public ny1[] b;
    public ny1[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final fc h = new fc(this, (byte) 1);
    public final fc i = new fc(this, (byte) 0);

    public gc(oc ocVar) {
        this.a = ocVar;
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).g(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).g(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        wt1 wt1Var;
        int size = list.size();
        ny1[] ny1VarArr = new ny1[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            ue1 ue1Var = (ue1) list.get(i);
            Object objL = ue1Var.l();
            jc jcVar = objL instanceof jc ? (jc) objL : null;
            if (jcVar != null && ((Boolean) jcVar.h.getValue()).booleanValue()) {
                ny1 ny1VarE = ue1Var.e(j);
                long j3 = (((long) ny1VarE.h) << 32) | (((long) ny1VarE.i) & 4294967295L);
                ny1VarArr[i] = ny1VarE;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ue1 ue1Var2 = (ue1) list.get(i2);
            if (ny1VarArr[i2] == null) {
                ny1VarArr[i2] = ue1Var2.e(j);
            }
        }
        if (bf1Var.u()) {
            wt1Var = new wt1(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                ny1 ny1Var = ny1VarArr[i5];
                if (ny1Var != null) {
                    Object objL2 = ((ue1) list.get(i5)).l();
                    jc jcVar2 = objL2 instanceof jc ? (jc) objL2 : null;
                    if (jcVar2 == null || !((Boolean) jcVar2.i.getValue()).booleanValue()) {
                        int i6 = ny1Var.h;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = ny1Var.i;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            wt1Var = new wt1(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) wt1Var.h).intValue();
        int iIntValue2 = ((Number) wt1Var.i).intValue();
        boolean zU = bf1Var.u();
        bg0 bg0Var = bg0.h;
        if (zU) {
            this.b = ny1VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return bf1Var.g0(iIntValue, iIntValue2, bg0Var, this.h);
        }
        this.a.c.setValue(new vy0((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = ny1VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return bf1Var.g0(iIntValue, iIntValue2, bg0Var, this.i);
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).d0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).d0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).U(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
