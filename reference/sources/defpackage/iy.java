package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iy extends c92 implements zp0 {
    public int j;
    public int k;
    public int l;
    public boolean m;
    public /* synthetic */ m10 n;
    public final /* synthetic */ jy o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(jy jyVar, m10 m10Var) {
        super(2, m10Var);
        this.o = jyVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((iy) p((m10) obj2, (oh2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        iy iyVar = new iy(this.o, m10Var);
        iyVar.n = (m10) obj;
        return iyVar;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        oh2 oh2Var;
        int i;
        int i2;
        int i3;
        String strF;
        int i4;
        int i5;
        String str;
        jy jyVar = this.o;
        fj1 fj1Var = jyVar.h;
        ri1 ri1Var = jyVar.j;
        boolean z = this.m;
        if (!z) {
            m02.y(obj);
            oh2Var = (oh2) this.n;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.l;
            i2 = this.k;
            i3 = this.j;
            oh2Var = (oh2) this.n;
            m02.y(obj);
        }
        if (i3 >= Math.min(jyVar.k + 10, ri1Var.b)) {
            return j23.a;
        }
        int i6 = i3 + 1;
        int iC = ri1Var.c(i3);
        switch (iC) {
            case 0:
                strF = "up";
                break;
            case 1:
                Object objG = fj1Var.g(i2);
                i2++;
                strF = "down " + objG;
                break;
            case 2:
                strF = wi0.f(ri1Var.c(i6), ri1Var.c(i3 + 2), "remove ", " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = ri1Var.c(i6);
                int iC3 = ri1Var.c(i3 + 2);
                int iC4 = ri1Var.c(i3 + 3);
                StringBuilder sbK = wi0.k("move ", iC2, " ", iC3, " ");
                sbK.append(iC4);
                strF = sbK.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strF = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = ri1Var.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + fj1Var.g(i2);
                int i7 = i4;
                strF = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = ri1Var.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + fj1Var.g(i2);
                int i8 = i4;
                strF = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objG2 = fj1Var.g(i2);
                objG2.getClass();
                t03.k(2, objG2);
                i2 += 2;
                strF = "apply " + ((zp0) objG2);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                strF = "reuse " + jyVar.i.g(i);
                i++;
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                strF = "recompose pending";
                break;
            default:
                strF = jp1.h(iC, "unknown op: ");
                break;
        }
        this.n = oh2Var;
        this.j = i6;
        this.k = i2;
        this.l = i;
        this.m = true;
        oh2Var.b(i3 + ": " + strF, this);
        return y20.h;
    }
}
