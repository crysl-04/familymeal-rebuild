package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 extends f0 {
    public final /* synthetic */ byte h;
    public final cx1 i;

    public /* synthetic */ hx1(cx1 cx1Var, byte b) {
        this.h = b;
        this.i = cx1Var;
    }

    @Override // defpackage.f0
    public final int a() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                cx1 cx1Var = this.i;
                Object obj2 = cx1Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cx1Var.containsKey(entry.getKey());
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.h;
        cx1 cx1Var = this.i;
        switch (b) {
            case 0:
                return new ix1(cx1Var);
            default:
                f03[] f03VarArr = new f03[8];
                for (int i = 0; i < 8; i++) {
                    f03VarArr[i] = new g03((byte) 1);
                }
                return new jx1(cx1Var, f03VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.i.remove(entry.getKey(), entry.getValue());
            default:
                cx1 cx1Var = this.i;
                if (!cx1Var.containsKey(obj)) {
                    return false;
                }
                cx1Var.remove(obj);
                return true;
        }
    }
}
