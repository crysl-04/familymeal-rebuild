package defpackage;

import java.util.Comparator;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements Comparator {
    public static final mm0 i = new mm0(0);
    public static final mm0 j = new mm0(1);
    public static final mm0 k = new mm0(2);
    public static final mm0 l = new mm0(3);
    public static final mm0 m = new mm0(4);
    public final /* synthetic */ byte h;

    public /* synthetic */ mm0(byte b) {
        this.h = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                lm0 lm0Var = (lm0) obj;
                lm0 lm0Var2 = (lm0) obj2;
                if (!ys.P(lm0Var) || !ys.P(lm0Var2)) {
                    if (ys.P(lm0Var)) {
                        return -1;
                    }
                    return ys.P(lm0Var2) ? 1 : 0;
                }
                l41 l41VarY = cu.Y(lm0Var);
                l41 l41VarY2 = cu.Y(lm0Var2);
                if (uz0.g(l41VarY, l41VarY2)) {
                    return 0;
                }
                Object[] objArr = new l41[16];
                int i2 = 0;
                while (l41VarY != null) {
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i3, length << 1)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i2 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                    }
                    objArr[0] = l41VarY;
                    i2++;
                    l41VarY = l41VarY.u();
                }
                Object[] objArr3 = new l41[16];
                int i4 = 0;
                while (l41VarY2 != null) {
                    int i5 = i4 + 1;
                    if (objArr3.length < i5) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i5, length2 << 1)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i4 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i4 + 0);
                    }
                    objArr3[0] = l41VarY2;
                    i4++;
                    l41VarY2 = l41VarY2.u();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    int i6 = 0;
                    while (uz0.g(objArr[i6], objArr3[i6])) {
                        if (i6 != iMin) {
                            i6++;
                        }
                    }
                    return uz0.i(((l41) objArr[i6]).v(), ((l41) objArr3[i6]).v());
                }
                li1.g("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                r72 r72VarH = ((wg2) obj).h();
                r72 r72VarH2 = ((wg2) obj2).h();
                int iCompare = Float.compare(r72VarH.a, r72VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(r72VarH.b, r72VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(r72VarH.d, r72VarH2.d);
                return iCompare3 == 0 ? Float.compare(r72VarH.c, r72VarH2.c) : iCompare3;
            case 2:
                l41 l41Var = (l41) obj;
                l41 l41Var2 = (l41) obj2;
                int i7 = uz0.i(l41Var2.v, l41Var.v);
                return i7 == 0 ? uz0.i(l41Var.hashCode(), l41Var2.hashCode()) : i7;
            case 3:
                r72 r72VarH3 = ((wg2) obj).h();
                r72 r72VarH4 = ((wg2) obj2).h();
                int iCompare4 = Float.compare(r72VarH4.c, r72VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(r72VarH3.b, r72VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(r72VarH3.d, r72VarH4.d);
                return iCompare6 == 0 ? Float.compare(r72VarH4.a, r72VarH3.a) : iCompare6;
            case 4:
                wt1 wt1Var = (wt1) obj;
                wt1 wt1Var2 = (wt1) obj2;
                int iCompare7 = Float.compare(((r72) wt1Var.h).b, ((r72) wt1Var2.h).b);
                return iCompare7 == 0 ? Float.compare(((r72) wt1Var.h).d, ((r72) wt1Var2.h).d) : iCompare7;
            case 5:
                return Integer.valueOf(((nd) obj).b).compareTo(Integer.valueOf(((nd) obj2).b));
            case 6:
                return Integer.valueOf(((nd) obj).b).compareTo(Integer.valueOf(((nd) obj2).b));
            case 7:
                l41 l41Var3 = (l41) obj;
                l41 l41Var4 = (l41) obj2;
                int i8 = uz0.i(l41Var3.v, l41Var4.v);
                return i8 == 0 ? uz0.i(l41Var3.hashCode(), l41Var4.hashCode()) : i8;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return Integer.valueOf(((d72) obj).d).compareTo(Integer.valueOf(((d72) obj2).d));
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                uv0 uv0Var = (uv0) obj;
                uv0 uv0Var2 = (uv0) obj2;
                return (uv0Var.c + uv0Var.b).compareTo(uv0Var2.c + uv0Var2.b);
            case 10:
                return vs.u((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 11:
                return vs.u((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 12:
                return vs.u(((xr2) obj).a, ((xr2) obj2).a);
            case 13:
                return vs.u(((zr2) obj).a, ((zr2) obj2).a);
            case 14:
                return ((t63) obj).a.compareTo((Object) ((t63) obj2).a);
            case 15:
                return ((t63) obj2).a.compareTo((Object) ((t63) obj).a);
            default:
                return ((t63) obj).a.compareTo((Object) ((t63) obj2).a);
        }
    }
}
