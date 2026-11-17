package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ec extends m31 implements zp0 {
    public static final ec j;
    public static final ec k;
    public final /* synthetic */ byte i;

    static {
        int i = 2;
        j = new ec(i, (byte) 0);
        k = new ec(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec(int i, byte b) {
        super(i);
        this.i = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                long j2 = ((vy0) obj).a;
                long j3 = ((vy0) obj2).a;
                Map map = u53.a;
                return uz0.y(0.0f, 400.0f, new vy0(4294967297L), 1);
            default:
                kg0 kg0Var = (kg0) obj2;
                return Boolean.valueOf(((kg0) obj) == kg0Var && kg0Var == kg0.j);
        }
    }
}
