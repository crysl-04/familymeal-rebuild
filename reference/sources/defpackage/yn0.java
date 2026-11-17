package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    public /* synthetic */ yn0(ll1 ll1Var, boolean z) {
        this.h = (byte) 1;
        this.j = ll1Var;
        this.i = z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.j;
        boolean z = this.i;
        switch (b) {
            case 0:
                vp0 vp0Var = (vp0) obj2;
                String str = (String) obj;
                str.getClass();
                int i = 0;
                if (z) {
                    while (i < str.length()) {
                        if (Character.isDigit(str.charAt(i))) {
                            i++;
                        }
                    }
                    if (str.length() <= 8) {
                        vp0Var.h(str);
                    }
                } else {
                    while (i < str.length()) {
                        char cCharAt = str.charAt(i);
                        if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == ',') {
                            i++;
                        }
                    }
                    if (str.length() <= 8) {
                        vp0Var.h(str);
                    }
                }
                return j23Var;
            case 1:
                ll1 ll1Var = (ll1) obj2;
                ll1Var.f(z);
                return new ml1((m91) obj, ll1Var);
            default:
                ((j92) obj).c(z ? 1.0f : ((Number) ((kp0) obj2).a()).floatValue());
                return j23Var;
        }
    }

    public /* synthetic */ yn0(boolean z, hq0 hq0Var, byte b) {
        this.h = b;
        this.i = z;
        this.j = hq0Var;
    }
}
