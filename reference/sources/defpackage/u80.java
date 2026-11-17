package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u80 implements nh2 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final hq0 c;

    public u80(CharSequence charSequence, s sVar) {
        this.a = (byte) 0;
        charSequence.getClass();
        this.b = charSequence;
        this.c = sVar;
    }

    @Override // defpackage.nh2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new t80(this);
            case 1:
                return new ij0(this);
            default:
                return new lr0(this);
        }
    }

    public /* synthetic */ u80(byte b, vp0 vp0Var, Object obj) {
        this.a = b;
        this.b = obj;
        this.c = vp0Var;
    }
}
