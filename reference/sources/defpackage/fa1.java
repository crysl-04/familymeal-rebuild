package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 implements Iterator, l21 {
    public final CharSequence h;
    public byte i;
    public int j;
    public int k;
    public int l;

    public fa1(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.i;
        if (b != 0) {
            return b == 1;
        }
        if (this.l < 0) {
            this.i = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.h;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.j; i3 < length2; i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.i = (byte) 1;
                this.l = i;
                this.k = length;
                return true;
            }
        }
        i = -1;
        this.i = (byte) 1;
        this.l = i;
        this.k = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wg.p();
            return null;
        }
        this.i = (byte) 0;
        int i = this.k;
        int i2 = this.j;
        this.j = this.l + i;
        return this.h.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
