package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e72 {
    public oz a;
    public int b;
    public xq0 c;
    public zp0 d;
    public int e;
    public bj1 f;
    public mj1 g;

    public e72(oz ozVar) {
        this.a = ozVar;
    }

    public final boolean a() {
        if (this.a != null) {
            xq0 xq0Var = this.c;
            if (xq0Var != null ? xq0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final d01 b(Object obj) {
        d01 d01VarS;
        oz ozVar = this.a;
        return (ozVar == null || (d01VarS = ozVar.s(this, obj)) == null) ? d01.h : d01VarS;
    }

    public final void c() {
        oz ozVar = this.a;
        if (ozVar != null) {
            ozVar.v = true;
            ozVar.A.A();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
