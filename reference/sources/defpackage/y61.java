package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y61 {
    public final Object a;
    public final a71 b;
    public int d;
    public y61 e;
    public boolean f;
    public int c = -1;
    public final lu1 g = rz1.x(null);

    public y61(Object obj, a71 a71Var) {
        this.a = obj;
        this.b = a71Var;
    }

    public final y61 a() {
        if (this.f) {
            dx0.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.h.add(this);
            y61 y61Var = (y61) this.g.getValue();
            if (y61Var != null) {
                y61Var.a();
            } else {
                y61Var = null;
            }
            this.e = y61Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            dx0.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.h.remove(this);
        y61 y61Var = this.e;
        if (y61Var != null) {
            y61Var.b();
        }
        this.e = null;
    }
}
