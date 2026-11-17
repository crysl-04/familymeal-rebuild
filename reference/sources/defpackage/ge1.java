package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 extends q {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ ge1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.q
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((Matcher) ((eg) obj).i).groupCount() + 1;
            default:
                return ((ex1) obj).i;
        }
    }

    public final fe1 b(int i) {
        Matcher matcher = (Matcher) ((eg) this.i).i;
        qy0 qy0VarS = cy1.S(matcher.start(i), matcher.end(i));
        if (qy0VarS.h < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new fe1(strGroup, qy0VarS);
    }

    @Override // defpackage.q, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (obj == null ? true : obj instanceof fe1) {
                    return super.contains((fe1) obj);
                }
                return false;
            default:
                return ((ex1) this.i).containsValue(obj);
        }
    }

    @Override // defpackage.q, java.util.Collection
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new iz2(new ds2(new jv(new qy0(0, size() - 1, 1), (byte) 0), new z61(this, (byte) 5), (byte) 1));
            default:
                e03 e03Var = ((ex1) this.i).h;
                f03[] f03VarArr = new f03[8];
                for (int i = 0; i < 8; i++) {
                    f03VarArr[i] = new g03((byte) 2);
                }
                return new lx1(e03Var, f03VarArr);
        }
    }
}
