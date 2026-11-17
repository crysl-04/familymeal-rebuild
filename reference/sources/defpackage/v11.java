package defpackage;

import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v11 implements r21 {
    public static final v11 a = new v11();
    public static final j32 b;

    static {
        d32 d32Var = d32.q;
        if (co2.X("kotlinx.serialization.json.JsonLiteral")) {
            wg.m("Blank serial names are prohibited");
            return;
        }
        Object it = ((yd1) k32.a.values()).iterator();
        while (((vd1) it).hasNext()) {
            r21 r21Var = (r21) ((td1) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(r21Var.d().b())) {
                wg.m(do2.H("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + z72.a(r21Var.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new j32("kotlinx.serialization.json.JsonLiteral", d32Var);
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        a aVarT = dt.t(v60Var);
        n11 n11VarQ0 = aVarT.q0();
        if (n11VarQ0 instanceof u11) {
            return (u11) n11VarQ0;
        }
        throw new l11(lt.z(-1, "Unexpected JSON element, expected JsonLiteral, had " + z72.a(n11VarQ0.getClass()), null, null, aVarT.r0().a.h ? lt.R(-1, n11VarQ0.toString()).toString() : null));
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        Double dValueOf;
        u11 u11Var = (u11) obj;
        u11Var.getClass();
        String str = u11Var.i;
        dt.u(bVar);
        if (u11Var.h) {
            bVar.r(str);
            return;
        }
        Long lP = jo2.P(str);
        if (lP != null) {
            bVar.l(lP.longValue());
            return;
        }
        r13 r13VarO = p02.O(str);
        if (r13VarO != null) {
            bVar.i(v13.b).l(r13VarO.h);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = io2.J(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            bVar.e(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            bVar.b(bool.booleanValue());
        } else {
            bVar.r(str);
        }
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
