package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends AbstractMap implements Map, n21 {
    public yy h = new yy(25);
    public e03 i;
    public Object j;
    public int k;
    public int l;
    public dx1 m;

    public cx1(dx1 dx1Var) {
        this.i = dx1Var.h;
        this.l = dx1Var.i;
        this.m = dx1Var;
    }

    public final dx1 a() {
        e03 e03Var = this.i;
        dx1 dx1Var = this.m;
        if (e03Var != dx1Var.h) {
            this.h = new yy((byte) 25);
            dx1Var = new dx1(this.i, this.l);
        }
        this.m = dx1Var;
        return dx1Var;
    }

    public final boolean b(Object obj) {
        return this.i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.i = e03.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof g42) {
            return b((g42) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c33) {
            return super.containsValue((c33) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.j = null;
        e03 e03VarN = this.i.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (e03VarN == null) {
            e03VarN = e03.e;
        }
        this.i = e03VarN;
        return this.j;
    }

    public final void e(int i) {
        this.l = i;
        this.k++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new hx1(this, (byte) 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof g42) {
            return (c33) c((g42) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof g42) ? obj2 : (c33) super.getOrDefault((g42) obj, (c33) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new hx1(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.j = null;
        this.i = this.i.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        ex1 ex1VarA = null;
        ex1 ex1Var = map instanceof ex1 ? (ex1) map : null;
        if (ex1Var == null) {
            cx1 cx1Var = map instanceof cx1 ? (cx1) map : null;
            if (cx1Var != null) {
                ex1VarA = cx1Var.a();
            }
        } else {
            ex1VarA = ex1Var;
        }
        if (ex1VarA == null) {
            super.putAll(map);
            return;
        }
        v80 v80Var = new v80();
        v80Var.a = 0;
        int i = this.l;
        e03 e03Var = this.i;
        e03 e03Var2 = ex1VarA.h;
        e03Var2.getClass();
        this.i = e03Var.m(e03Var2, 0, v80Var, this);
        int i2 = (ex1VarA.i + i) - v80Var.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.l;
        e03 e03VarO = this.i.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (e03VarO == null) {
            e03VarO = e03.e;
        }
        this.i = e03VarO;
        return i != this.l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new yd1(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof g42) {
            return (c33) d((g42) obj);
        }
        return null;
    }
}
