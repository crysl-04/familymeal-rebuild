package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gm extends im {
    public final /* synthetic */ byte i;
    public BigDecimal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm(byte b) {
        super((byte) 0);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        switch (this.i) {
            case 0:
                return this.j.intValue();
            case 1:
                return this.j.intValue();
            case 2:
                return this.j.intValue();
            case 3:
                return this.j.intValue();
            case 4:
                lm lmVar = om.a0;
                BigDecimal bigDecimal = this.j;
                lmVar.getClass();
                return lg1.f(2, bigDecimal).intValue();
            case 5:
                return this.j.intValue();
            default:
                return this.j.intValue();
        }
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                mm mmVar = om.S;
                BigDecimal bigDecimal = this.j;
                mmVar.getClass();
                this.j = bigDecimal.add((BigDecimal) comparable);
                break;
            case 1:
                BigDecimal bigDecimal2 = (BigDecimal) comparable;
                mm mmVar2 = om.S;
                BigDecimal bigDecimal3 = this.j;
                om.Z.getClass();
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal2);
                mmVar2.getClass();
                this.j = bigDecimal3.add(bigDecimalMultiply);
                break;
            case 2:
                mm mmVar3 = om.X;
                BigDecimal bigDecimal4 = this.j;
                om.R.getClass();
                BigDecimal bigDecimalAbs = ((BigDecimal) comparable).abs();
                mmVar3.getClass();
                this.j = bigDecimal4.max(bigDecimalAbs);
                break;
            case 3:
                mm mmVar4 = om.S;
                BigDecimal bigDecimal5 = this.j;
                BigDecimal bigDecimalAbs2 = ((BigDecimal) comparable).abs();
                mmVar4.getClass();
                this.j = bigDecimal5.add(bigDecimalAbs2);
                break;
            case 4:
                BigDecimal bigDecimal6 = (BigDecimal) comparable;
                mm mmVar5 = om.S;
                BigDecimal bigDecimal7 = this.j;
                om.Z.getClass();
                BigDecimal bigDecimalMultiply2 = bigDecimal6.multiply(bigDecimal6);
                mmVar5.getClass();
                this.j = bigDecimal7.add(bigDecimalMultiply2);
                break;
            case 5:
                mm mmVar6 = om.Z;
                BigDecimal bigDecimal8 = this.j;
                mmVar6.getClass();
                this.j = bigDecimal8.multiply((BigDecimal) comparable);
                break;
            default:
                BigDecimal bigDecimal9 = (BigDecimal) comparable;
                mm mmVar7 = om.Z;
                BigDecimal bigDecimal10 = this.j;
                mmVar7.getClass();
                this.j = bigDecimal10.multiply(bigDecimal9.multiply(bigDecimal9));
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = om.a;
                break;
            case 1:
                this.j = om.a;
                break;
            case 2:
                this.j = om.a;
                break;
            case 3:
                this.j = om.a;
                break;
            case 4:
                this.j = om.a;
                break;
            case 5:
                this.j = om.b;
                break;
            default:
                this.j = om.b;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        switch (this.i) {
            case 0:
                return this.j;
            case 1:
                return this.j;
            case 2:
                return this.j;
            case 3:
                return this.j;
            case 4:
                lm lmVar = om.a0;
                BigDecimal bigDecimal = this.j;
                lmVar.getClass();
                return lg1.f(2, bigDecimal);
            case 5:
                return this.j;
            default:
                return this.j;
        }
    }
}
