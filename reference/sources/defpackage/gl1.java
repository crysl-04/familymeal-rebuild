package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class gl1 extends dl1 implements Iterable, l21 {
    public static final /* synthetic */ int n = 0;
    public final u30 m;

    public gl1(jl1 jl1Var) {
        super(jl1Var);
        this.m = new u30(this);
    }

    @Override // defpackage.dl1
    public final cl1 b(eg egVar) {
        cl1 cl1VarB = super.b(egVar);
        u30 u30Var = this.m;
        u30Var.getClass();
        return u30Var.h(cl1VarB, egVar, false, (gl1) u30Var.c);
    }

    public final cl1 c(eg egVar, dl1 dl1Var) {
        return this.m.h(super.b(egVar), egVar, true, dl1Var);
    }

    public final cl1 d(String str, boolean z, dl1 dl1Var) {
        cl1 cl1VarD;
        u30 u30Var = this.m;
        u30Var.getClass();
        gl1 gl1Var = (gl1) u30Var.c;
        cl1 cl1VarR = gl1Var.i.r(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = gl1Var.iterator();
        while (true) {
            il1 il1Var = (il1) it;
            cl1VarD = null;
            if (!il1Var.hasNext()) {
                break;
            }
            dl1 dl1Var2 = (dl1) il1Var.next();
            if (!uz0.g(dl1Var2, dl1Var)) {
                if (dl1Var2 instanceof gl1) {
                    cl1VarD = ((gl1) dl1Var2).d(str, false, gl1Var);
                } else {
                    dl1Var2.getClass();
                    cl1VarD = dl1Var2.i.r(str);
                }
            }
            if (cl1VarD != null) {
                arrayList.add(cl1VarD);
            }
        }
        cl1 cl1Var = (cl1) dv.H0(arrayList);
        gl1 gl1Var2 = gl1Var.j;
        if (gl1Var2 != null && z && !gl1Var2.equals(dl1Var)) {
            cl1VarD = gl1Var2.d(str, true, gl1Var);
        }
        return (cl1) dv.H0(gi.W(new cl1[]{cl1VarR, cl1Var, cl1VarD}));
    }

    @Override // defpackage.dl1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gl1) || !super.equals(obj)) {
            return false;
        }
        u30 u30Var = this.m;
        int iD = ((dm2) u30Var.d).d();
        u30 u30Var2 = ((gl1) obj).m;
        if (iD != ((dm2) u30Var2.d).d() || u30Var.b != u30Var2.b) {
            return false;
        }
        for (dl1 dl1Var : (h00) ph2.G(new z((dm2) u30Var.d, (byte) 3))) {
            if (!dl1Var.equals(aa3.g((dm2) u30Var2.d, dl1Var.i.b))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dl1
    public final int hashCode() {
        u30 u30Var = this.m;
        int iB = u30Var.b;
        dm2 dm2Var = (dm2) u30Var.d;
        int iD = dm2Var.d();
        for (int i = 0; i < iD; i++) {
            iB = (((iB * 31) + dm2Var.b(i)) * 31) + ((dl1) dm2Var.e(i)).hashCode();
        }
        return iB;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        u30 u30Var = this.m;
        u30Var.getClass();
        return new il1(u30Var);
    }

    @Override // defpackage.dl1
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        u30 u30Var = this.m;
        String str = (String) u30Var.f;
        u30Var.getClass();
        dl1 dl1VarC = (str == null || co2.X(str)) ? null : u30Var.c(str, true);
        if (dl1VarC == null) {
            dl1VarC = u30Var.b(u30Var.b);
        }
        sb.append(" startDestination=");
        if (dl1VarC == null) {
            String str2 = (String) u30Var.f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) u30Var.e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(u30Var.b));
                }
            }
        } else {
            sb.append("{");
            sb.append(dl1VarC.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
