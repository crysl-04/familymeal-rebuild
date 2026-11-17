package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends m31 implements kp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ si2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg0(si2 si2Var, byte b) {
        super(0);
        this.i = b;
        this.j = si2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.i;
        si2 si2Var = this.j;
        switch (b) {
            case 0:
                return si2Var;
            default:
                lu1 lu1Var = si2Var.b;
                Boolean bool = Boolean.FALSE;
                lu1Var.setValue(bool);
                si2Var.c(false);
                p61 p61Var = si2Var.c;
                ((lu1) p61Var.a).setValue(bool);
                ((lu1) p61Var.c).setValue(bool);
                ((lu1) p61Var.e).setValue(bool);
                ((lu1) p61Var.g).setValue(bool);
                si2Var.e = kv.f;
                si2Var.f = 1.0f;
                si2Var.g = 1.0f;
                c43 c43Var = si2Var.j;
                if (c43Var != null) {
                    f40[] f40VarArr = c43Var.d;
                    Arrays.fill(f40VarArr, 0, f40VarArr.length, (Object) null);
                    c43Var.e = 0;
                }
                si2Var.h = 4539628425446424576L;
                si2Var.i = 0L;
                return j23.a;
        }
    }
}
