package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements e53 {
    public final b53[] a;

    public uw0(b53... b53VarArr) {
        this.a = b53VarArr;
    }

    @Override // defpackage.e53
    public final z43 b(Class cls, pi1 pi1Var) {
        b53 b53Var;
        vp0 vp0Var;
        du duVarA = z72.a(cls);
        b53[] b53VarArr = this.a;
        b53[] b53VarArr2 = (b53[]) Arrays.copyOf(b53VarArr, b53VarArr.length);
        int length = b53VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                b53Var = null;
                break;
            }
            b53Var = b53VarArr2[i];
            if (b53Var.a.equals(duVarA)) {
                break;
            }
            i++;
        }
        z43 z43Var = (b53Var == null || (vp0Var = b53Var.b) == null) ? null : (z43) vp0Var.h(pi1Var);
        if (z43Var != null) {
            return z43Var;
        }
        li1.e(jp1.j("No initializer set for given class ", duVarA.b()));
        return null;
    }
}
