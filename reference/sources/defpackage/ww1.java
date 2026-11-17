package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ww1(l43 l43Var, ny1 ny1Var, int i) {
        this.h = (byte) 3;
        this.j = l43Var;
        this.k = ny1Var;
        this.i = i;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        iz izVar;
        long[] jArr;
        iz izVar2;
        int i;
        long[] jArr2;
        int i2;
        byte b = this.h;
        int i3 = 8;
        int i4 = 0;
        j23 j23Var = j23.a;
        int i5 = this.i;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                sj1 sj1Var = (sj1) obj3;
                p71 p71Var = (p71) obj;
                p71Var.getClass();
                List list = (List) sj1Var.getValue();
                p71Var.p0(list.size(), new q9(new de1((byte) 29), list, (byte) 8), new rw0(list, (byte) 1), new nx(802480018, true, new zw1(list, i5, (vp0) obj2)));
                if (((List) sj1Var.getValue()).isEmpty()) {
                    p71.o0(p71Var, null, t03.r, 3);
                }
                break;
            case 1:
                e72 e72Var = (e72) obj3;
                bj1 bj1Var = (bj1) obj2;
                iz izVar3 = (iz) obj;
                if (e72Var.e == i5 && uz0.g(bj1Var, e72Var.f) && (izVar3 instanceof oz)) {
                    long[] jArr3 = bj1Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr3[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = i4;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i6 << 3) + i8;
                                        Object obj4 = bj1Var.b[i9];
                                        boolean z = bj1Var.c[i9] != i5;
                                        if (z) {
                                            i = i3;
                                            oz ozVar = (oz) izVar3;
                                            izVar2 = izVar3;
                                            mj1 mj1Var = ozVar.n;
                                            p02.E(mj1Var, obj4, e72Var);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof o90) {
                                                o90 o90Var = (o90) obj4;
                                                if (!mj1Var.c(o90Var)) {
                                                    p02.G(ozVar.q, o90Var);
                                                }
                                                mj1 mj1Var2 = e72Var.g;
                                                if (mj1Var2 != null) {
                                                    mj1Var2.l(obj4);
                                                }
                                            }
                                        } else {
                                            izVar2 = izVar3;
                                            i = i3;
                                            jArr2 = jArr3;
                                        }
                                        if (z) {
                                            bj1Var.f(i9);
                                        }
                                    } else {
                                        izVar2 = izVar3;
                                        i = i3;
                                        jArr2 = jArr3;
                                    }
                                    j >>= i;
                                    i8++;
                                    izVar3 = izVar2;
                                    jArr3 = jArr2;
                                    i3 = i;
                                }
                                izVar = izVar3;
                                jArr = jArr3;
                                if (i7 != i3) {
                                    break;
                                }
                            } else {
                                izVar = izVar3;
                                jArr = jArr3;
                            }
                            if (i6 != length) {
                                i6++;
                                izVar3 = izVar;
                                jArr3 = jArr;
                                i3 = 8;
                                i4 = 0;
                            }
                        }
                    }
                }
                break;
            case 2:
                ud2 ud2Var = (ud2) obj3;
                ny1 ny1Var = (ny1) obj2;
                my1 my1Var = (my1) obj;
                int iG = ud2Var.v.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i5) {
                    i5 = iG;
                }
                int i10 = -i5;
                if (ud2Var.w) {
                    i2 = 0;
                } else {
                    i2 = i10;
                    i10 = 0;
                }
                my1Var.h = true;
                my1.l(my1Var, ny1Var, i2, i10);
                my1Var.h = false;
                break;
            default:
                l43 l43Var = (l43) obj3;
                ny1 ny1Var2 = (ny1) obj2;
                my1 my1Var2 = (my1) obj;
                int i11 = l43Var.i;
                bv2 bv2Var = l43Var.h;
                hz2 hz2Var = l43Var.j;
                kw2 kw2Var = (kw2) l43Var.k.a();
                bv2Var.a(ks1.h, h12.j(my1Var2, i11, hz2Var, kw2Var != null ? kw2Var.a : null, false, ny1Var2.h), i5, ny1Var2.i);
                my1.k(my1Var2, ny1Var2, 0, Math.round(-bv2Var.a.g()));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ ww1(byte b, int i, Object obj, Object obj2) {
        this.h = b;
        this.j = obj;
        this.i = i;
        this.k = obj2;
    }
}
