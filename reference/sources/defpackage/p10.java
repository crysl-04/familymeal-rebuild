package defpackage;

import java.util.EnumMap;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p10 implements Supplier {
    public final /* synthetic */ byte a;

    public /* synthetic */ p10(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                cb2 cb2Var = new cb2();
                cb2Var.a = h32.b;
                cb2Var.b = null;
                cb2Var.c = null;
                cb2Var.d = null;
                cb2Var.e = null;
                cb2Var.f = 0;
                return cb2Var;
            case 1:
                b00 b00Var = new b00();
                b00Var.h = b00.p;
                b00Var.i = null;
                b00Var.j = Integer.MAX_VALUE;
                e32 e32Var = h32.q;
                b00Var.l = null;
                b00Var.m = null;
                b00Var.n = null;
                b00Var.o = null;
                q01 q01Var = new q01();
                q01Var.a = null;
                b00Var.k = q01Var;
                return b00Var;
            default:
                EnumMap enumMap = new EnumMap(dz0.class);
                su suVar = new su();
                suVar.n = null;
                suVar.o = null;
                suVar.p = 0L;
                enumMap.put(dz0.i, suVar);
                tk0 tk0Var = new tk0();
                tk0Var.n = null;
                tk0Var.o = null;
                enumMap.put(dz0.j, tk0Var);
                enumMap.put(dz0.k, new wq0());
                enumMap.put(dz0.l, new qu0());
                enumMap.put(dz0.m, new j31());
                enumMap.put(dz0.n, new jd1());
                return enumMap;
        }
    }
}
