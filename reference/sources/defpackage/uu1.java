package defpackage;

import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 extends mq2 implements vp0 {
    public final /* synthetic */ wu1 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ vp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu1(wu1 wu1Var, String str, vp0 vp0Var, m10 m10Var) {
        super(1, m10Var);
        this.l = wu1Var;
        this.m = str;
        this.n = vp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        String str = this.m;
        vp0 vp0Var = this.n;
        return new uu1(this.l, str, vp0Var, (m10) obj).r(j23.a);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        SQLiteStatement sQLiteStatementPrepare = this.l.b.prepare(this.m);
        try {
            Object objH = this.n.h(sQLiteStatementPrepare);
            ie1.j(sQLiteStatementPrepare, null);
            return objH;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
