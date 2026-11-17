package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends t0 {
    public final /* synthetic */ byte h;
    public final ex1 i;

    public /* synthetic */ kx1(ex1 ex1Var, byte b) {
        this.h = b;
        this.i = ex1Var;
    }

    @Override // defpackage.q
    public final int a() {
        byte b = this.h;
        ex1 ex1Var = this.i;
        switch (b) {
            case 0:
                break;
        }
        return ex1Var.i;
    }

    @Override // defpackage.q, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.h;
        ex1 ex1Var = this.i;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = ex1Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && ex1Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return ex1Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.h;
        ex1 ex1Var = this.i;
        switch (b) {
            case 0:
                e03 e03Var = ex1Var.h;
                f03[] f03VarArr = new f03[8];
                for (int i = 0; i < 8; i++) {
                    f03VarArr[i] = new g03((byte) 0);
                }
                return new lx1(e03Var, f03VarArr);
            default:
                e03 e03Var2 = ex1Var.h;
                f03[] f03VarArr2 = new f03[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    f03VarArr2[i2] = new g03((byte) 1);
                }
                return new lx1(e03Var2, f03VarArr2);
        }
    }
}
