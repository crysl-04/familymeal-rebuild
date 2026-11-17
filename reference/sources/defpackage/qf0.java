package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 implements of0 {
    public final /* synthetic */ byte h;
    public final String i;

    public /* synthetic */ qf0(String str, byte b) {
        this.h = b;
        this.i = str;
    }

    @Override // defpackage.of0
    public final boolean g(CharSequence charSequence, int i, int i2, x03 x03Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.i)) {
            return true;
        }
        x03Var.c = (x03Var.c & 3) | 4;
        return false;
    }

    public final String toString() {
        switch (this.h) {
            case 1:
                return "<" + this.i + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.of0
    public final Object a() {
        return this;
    }
}
