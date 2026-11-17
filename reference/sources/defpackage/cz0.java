package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {
    public final wo1 a;
    public final wo1 b;
    public final double c;
    public final byte d;
    public final List e;
    public final BigDecimal f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final byte k;
    public final byte l;

    public cz0() {
        Object[] objArr = {dz0.l, dz0.i, dz0.m, dz0.j, dz0.n, dz0.k};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        wo1 wo1VarG = wo1.G(7);
        wo1 wo1VarG2 = wo1.G(6);
        double d = h32.i;
        BigDecimal bigDecimal = om.m;
        this.e = listUnmodifiableList;
        this.a = wo1VarG;
        this.b = wo1VarG2;
        this.c = d;
        this.f = bigDecimal;
        this.d = (byte) 3;
        this.i = (byte) 10;
        this.h = (byte) 3;
        this.g = (byte) 100;
        this.l = (byte) 10;
        this.k = (byte) 10;
        this.j = (byte) 100;
    }
}
