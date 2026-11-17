package defpackage;

import java.util.Iterator;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c32 extends cv {
    public final b32 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c32(r21 r21Var) {
        super(r21Var);
        r21Var.getClass();
        this.b = new b32(r21Var.d());
    }

    @Override // defpackage.r, defpackage.r21
    public final Object a(v60 v60Var) {
        return i(v60Var);
    }

    @Override // defpackage.cv, defpackage.r21
    public final void c(b bVar, Object obj) {
        int iH = h(obj);
        b32 b32Var = this.b;
        b bVarA = bVar.a(b32Var);
        n(bVarA, obj, iH);
        bVarA.t(b32Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return this.b;
    }

    @Override // defpackage.r
    public final Object e() {
        return m();
    }

    @Override // defpackage.r
    public final int f(Object obj) {
        a32 a32Var = (a32) obj;
        a32Var.getClass();
        return a32Var.d();
    }

    @Override // defpackage.r
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.r
    public final Object k(Object obj) {
        a32 a32Var = (a32) obj;
        a32Var.getClass();
        return a32Var.a();
    }

    @Override // defpackage.cv
    public final void l(int i, Object obj, Object obj2) {
        ((a32) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public a32 m() {
        qn qnVar = new qn();
        qnVar.a = new boolean[10];
        qnVar.b = 0;
        return qnVar;
    }

    public void n(b bVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        bVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            bVar.g(this.b, i2);
            bVar.b(z);
        }
    }
}
