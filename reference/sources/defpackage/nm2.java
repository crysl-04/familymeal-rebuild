package defpackage;

import java.util.function.IntBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm2 implements IntBinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dk1 b;

    public /* synthetic */ nm2(dk1 dk1Var, byte b) {
        this.a = b;
        this.b = dk1Var;
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i, int i2) {
        byte b = this.a;
        dk1 dk1Var = this.b;
        switch (b) {
            case 0:
                return ((rm2) dk1Var).n.i;
            case 1:
                return ((rm2) dk1Var).n.i;
            case 2:
                return ((rm2) dk1Var).n.i;
            case 3:
                return ((rm2) dk1Var).n.i;
            case 4:
                return ((rm2) dk1Var).n.i;
            default:
                return ((qm2) dk1Var).i.size();
        }
    }
}
