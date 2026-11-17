package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ct2 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public ct2(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct2)) {
            return false;
        }
        ct2 ct2Var = (ct2) obj;
        return uz0.g(this.a, ct2Var.a) && qw2.b(this.b, ct2Var.b) && uz0.g(this.c, ct2Var.c) && this.d.equals(ct2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = qw2.c;
        return this.d.hashCode() + ((this.c.hashCode() + jp1.d(this.b, iHashCode, 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + qw2.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
