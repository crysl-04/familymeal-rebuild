package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class z implements Iterator, l21 {
    public final /* synthetic */ byte h;
    public int i;
    public final Object j;

    public z(Object[] objArr) {
        this.h = (byte) 1;
        objArr.getClass();
        this.j = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.h;
        Object obj = this.j;
        switch (b) {
            case 0:
                return this.i < ((c0) obj).a();
            case 1:
                return this.i < ((Object[]) obj).length;
            case 2:
                return ((Iterator) obj).hasNext();
            case 3:
                return this.i < ((dm2) obj).d();
            case 4:
                return this.i < ((byte[]) obj).length;
            case 5:
                return this.i < ((int[]) obj).length;
            case 6:
                return this.i < ((long[]) obj).length;
            default:
                return this.i < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.h;
        Object obj = this.j;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    wg.p();
                    return null;
                }
                int i = this.i;
                this.i = i + 1;
                return ((c0) obj).get(i);
            case 1:
                try {
                    int i2 = this.i;
                    this.i = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.i--;
                    li1.m(e.getMessage());
                    return null;
                }
            case 2:
                int i3 = this.i;
                this.i = i3 + 1;
                if (i3 >= 0) {
                    return new yu0(i3, ((Iterator) obj).next());
                }
                lt.h0();
                throw null;
            case 3:
                int i4 = this.i;
                this.i = i4 + 1;
                return ((dm2) obj).e(i4);
            case 4:
                int i5 = this.i;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.i = i5 + 1;
                    return new h13(bArr[i5]);
                }
                li1.m(String.valueOf(i5));
                return null;
            case 5:
                int i6 = this.i;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.i = i6 + 1;
                    return new m13(iArr[i6]);
                }
                li1.m(String.valueOf(i6));
                return null;
            case 6:
                int i7 = this.i;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.i = i7 + 1;
                    return new r13(jArr[i7]);
                }
                li1.m(String.valueOf(i7));
                return null;
            default:
                int i8 = this.i;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.i = i8 + 1;
                    return new w13(sArr[i8]);
                }
                li1.m(String.valueOf(i8));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ z(Object obj, byte b) {
        this.h = b;
        this.j = obj;
    }

    public z(Iterator it) {
        this.h = (byte) 2;
        it.getClass();
        this.j = it;
    }
}
