package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rn extends c32 {
    public static final rn c = new rn(sn.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        qn qnVar = (qn) obj;
        qnVar.getClass();
        boolean zU = hzVar.u(this.b, i);
        qnVar.b(qnVar.d() + 1);
        boolean[] zArr = qnVar.a;
        int i2 = qnVar.b;
        qnVar.b = i2 + 1;
        zArr[i2] = zU;
    }
}
