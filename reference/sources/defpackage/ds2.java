package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ds2 implements nh2 {
    public final /* synthetic */ byte a;
    public final nh2 b;
    public final vp0 c;

    public /* synthetic */ ds2(nh2 nh2Var, vp0 vp0Var, byte b) {
        this.a = b;
        this.b = nh2Var;
        this.c = vp0Var;
    }

    @Override // defpackage.nh2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ij0(this);
            default:
                return new iz2(this);
        }
    }
}
