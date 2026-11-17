package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s70 implements wd2 {
    public final /* synthetic */ t70 a;

    public s70(t70 t70Var) {
        this.a = t70Var;
    }

    @Override // defpackage.wd2
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        t70 t70Var = this.a;
        float fFloatValue = ((Number) t70Var.a.h(Float.valueOf(f))).floatValue();
        t70Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        t70Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
