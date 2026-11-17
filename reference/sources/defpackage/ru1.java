package defpackage;

import androidx.sqlite.SQLiteConnection;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ru1 implements b62, j12 {
    public final /* synthetic */ wu1 a;

    public ru1(wu1 wu1Var) {
        this.a = wu1Var;
    }

    @Override // defpackage.b62
    public final SQLiteConnection a() {
        return this.a.b;
    }

    @Override // defpackage.j12
    public final Object b(String str, vp0 vp0Var, n10 n10Var) {
        return this.a.b(str, vp0Var, n10Var);
    }
}
