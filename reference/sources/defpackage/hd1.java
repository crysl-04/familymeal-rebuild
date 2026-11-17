package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class hd1 {
    public final byte a;
    public final vw0 b;
    public final yy c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public hd1(int i) {
        this.a = i;
        if (i <= 0) {
            wg.m("maxSize <= 0");
            throw null;
        }
        this.b = new vw0((byte) 1);
        this.c = new yy((byte) 23);
    }

    public final void a(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            objPut = this.b.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        if (objPut != null) {
            a(obj, objPut, obj2);
        }
        d(this.a);
        return objPut;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    public final void d(int i) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                    break;
                }
                if (this.d > i && !this.b.a.isEmpty()) {
                    Set setEntrySet = this.b.a.entrySet();
                    setEntrySet.getClass();
                    Set set = setEntrySet;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (list.isEmpty()) {
                            next = null;
                        } else {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        key = entry.getKey();
                        value = entry.getValue();
                        vw0 vw0Var = this.b;
                        key.getClass();
                        vw0Var.a.remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                }
                return;
            }
            a(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
