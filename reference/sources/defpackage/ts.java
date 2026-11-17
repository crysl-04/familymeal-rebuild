package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ts implements CharacterIterator {
    public final CharSequence h;
    public final int i;
    public int j = 0;

    public ts(int i, CharSequence charSequence) {
        this.h = charSequence;
        this.i = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.j;
        if (i == this.i) {
            return (char) 65535;
        }
        return this.h.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.j = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.i;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.j;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.i;
        if (i == 0) {
            this.j = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.j = i2;
        return this.h.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.j + 1;
        this.j = i;
        int i2 = this.i;
        if (i < i2) {
            return this.h.charAt(i);
        }
        this.j = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.j;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.j = i2;
        return this.h.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.i || i < 0) {
            wg.m("invalid position");
            return (char) 0;
        }
        this.j = i;
        return current();
    }
}
