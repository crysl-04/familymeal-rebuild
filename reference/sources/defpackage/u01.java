package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class u01 extends z01 {
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(s01 s01Var) {
        super(true);
        boolean z = true;
        Q(s01Var);
        Unsafe unsafe = hi.a;
        long j = z01.h;
        ht htVar = (ht) unsafe.getObjectVolatile(this, j);
        jt jtVar = htVar instanceof jt ? (jt) htVar : null;
        if (jtVar == null) {
            z = false;
            break;
        }
        z01 z01VarL = jtVar.l();
        while (!z01VarL.K()) {
            ht htVar2 = (ht) hi.a.getObjectVolatile(z01VarL, j);
            jt jtVar2 = htVar2 instanceof jt ? (jt) htVar2 : null;
            if (jtVar2 == null) {
                z = false;
                break;
            }
            z01VarL = jtVar2.l();
        }
        this.j = z;
    }

    @Override // defpackage.z01
    public final boolean K() {
        return this.j;
    }

    @Override // defpackage.z01
    public final boolean L() {
        return true;
    }
}
