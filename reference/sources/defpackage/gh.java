package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gh extends y22 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh(je1 je1Var, byte b) {
        super(je1Var);
        this.l = b;
    }

    @Override // defpackage.li0
    public final mo2 p(int i) {
        switch (this.l) {
            case 0:
                return hh.l2(i);
            case 1:
                u42[] u42VarArr = new u42[i];
                Arrays.fill(u42VarArr, u42.s);
                return new jh(jh.k, u42VarArr);
            case 2:
                z52[] z52VarArr = new z52[i];
                Arrays.fill(z52VarArr, z52.p);
                return new uh(uh.k, z52VarArr);
            default:
                l42[] l42VarArr = new l42[i];
                Arrays.fill(l42VarArr, l42.p);
                return new yh(yh.k, l42VarArr);
        }
    }
}
