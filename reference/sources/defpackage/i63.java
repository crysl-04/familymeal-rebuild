package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i63 implements kp0 {
    public final /* synthetic */ ek2 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ sj1 j;

    public i63(ek2 ek2Var, String str, sj1 sj1Var) {
        this.h = ek2Var;
        this.i = str;
        this.j = sj1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        wt1 wt1Var = new wt1(this.h, this.i);
        Map map = m63.a;
        this.j.setValue(wt1Var);
        return j23.a;
    }
}
