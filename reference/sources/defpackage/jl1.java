package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
@rm1("navigation")
public class jl1 extends sm1 {
    public final tm1 c;

    public jl1(tm1 tm1Var) {
        tm1Var.getClass();
        this.c = tm1Var;
    }

    @Override // defpackage.sm1
    public final void d(List list, vl1 vl1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pk1 pk1Var = (pk1) it.next();
            dl1 dl1Var = pk1Var.i;
            dl1Var.getClass();
            gl1 gl1Var = (gl1) dl1Var;
            fe feVar = gl1Var.i;
            x72 x72Var = new x72();
            x72Var.h = pk1Var.a();
            u30 u30Var = gl1Var.m;
            int i = u30Var.b;
            String str = (String) u30Var.f;
            if (i == 0 && str == null) {
                feVar.getClass();
                String strValueOf = String.valueOf(feVar.b);
                strValueOf.getClass();
                if (((gl1) u30Var.c).i.b == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            dl1 dl1VarC = str != null ? u30Var.c(str, false) : (dl1) aa3.g((dm2) u30Var.d, i);
            if (dl1VarC == null) {
                String strValueOf2 = (String) u30Var.e;
                if (strValueOf2 == null) {
                    strValueOf2 = (String) u30Var.f;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(u30Var.b);
                    }
                    u30Var.e = strValueOf2;
                }
                strValueOf2.getClass();
                wg.m(wi0.h("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            fe feVar2 = dl1VarC.i;
            if (str != null) {
                if (!str.equals((String) feVar2.f)) {
                    cl1 cl1VarR = feVar2.r(str);
                    Bundle bundle = cl1VarR != null ? cl1VarR.i : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        bundleL.putAll(bundle);
                        Bundle bundle2 = (Bundle) x72Var.h;
                        if (bundle2 != null) {
                            bundleL.putAll(bundle2);
                        }
                        x72Var.h = bundleL;
                    }
                }
                if (ee1.N((LinkedHashMap) feVar2.e).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListN = cu.N(ee1.N((LinkedHashMap) feVar2.e), new f6(x72Var, (byte) 3));
                    if (!arrayListN.isEmpty()) {
                        li1.o("Cannot navigate to startDestination ", dl1VarC, ". Missing required arguments [", arrayListN, "]");
                        return;
                    }
                }
            }
            this.c.b(dl1VarC.h).d(lt.P(b().b(dl1VarC, dl1VarC.a((Bundle) x72Var.h))), vl1Var);
        }
    }

    @Override // defpackage.sm1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public gl1 a() {
        return new gl1(this);
    }
}
