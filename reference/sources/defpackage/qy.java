package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qy {
    public final Object a;

    public qy(byte b) {
        switch (b) {
            case 1:
                si1 si1Var = my0.a;
                this.a = new si1();
                break;
            case 2:
                this.a = new LinkedTransferQueue();
                break;
            case 3:
                this.a = new Object();
                break;
            case 4:
                this.a = rz1.x(Boolean.FALSE);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public final boolean a(int i, fr0 fr0Var, Object obj) {
        ArrayList arrayList = fr0Var.a;
        if (arrayList == null) {
            b(i, fr0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof xq0)) {
                if (!(obj2 instanceof fr0)) {
                    wg.h(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (fr0) obj2, obj)) {
                    b(0, fr0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, fr0Var, obj2);
                return true;
            }
        }
        return false;
    }

    public final void b(int i, fr0 fr0Var, Object obj) {
        ((ArrayList) this.a).add(new ry(i, null, null));
    }

    public final Object c() {
        Object objPoll = ((LinkedTransferQueue) this.a).poll();
        return objPoll == null ? j() : objPoll;
    }

    public abstract void d(ds dsVar);

    public abstract void e();

    public abstract void f();

    public abstract Object g();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List h(v61 v61Var, int i, long j) {
        si1 si1Var = (si1) this.a;
        List list = (List) si1Var.b(i);
        if (list != null) {
            return list;
        }
        s61 s61Var = v61Var.j;
        si1 si1Var2 = v61Var.k;
        List listI = (List) si1Var2.b(i);
        if (listI == null) {
            Object objB = s61Var.b(i);
            listI = v61Var.i.I(v61Var.h.a(i, objB, s61Var.c(i)), objB);
            si1Var2.h(i, listI);
        }
        int size = listI.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ue1) listI.get(i2)).e(j));
        }
        si1Var.h(i, arrayList);
        return arrayList;
    }

    public abstract Object i();

    public abstract Object j();

    public final void k(int i, Object obj, fr0 fr0Var, Object obj2) {
        if (uz0.g(obj, zy.a)) {
            b(i, fr0Var, null);
        }
    }

    public abstract vp0 l(ds dsVar);

    public abstract void m(ds dsVar);

    public abstract void n(Object obj);

    public void p() {
    }

    public void o(qz2 qz2Var) {
    }
}
