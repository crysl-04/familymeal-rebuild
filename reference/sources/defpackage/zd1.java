package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class zd1 implements Map.Entry, l21 {
    public final /* synthetic */ byte h;
    public final Object i;
    public final Object j;

    public /* synthetic */ zd1(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.h) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && uz0.g(entry.getKey(), this.i) && uz0.g(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.h) {
            case 0:
                Object obj = this.i;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return this.i + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
