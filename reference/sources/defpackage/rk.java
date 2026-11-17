package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rk implements m10, z20, Serializable {
    public final m10 h;

    public rk(m10 m10Var) {
        this.h = m10Var;
    }

    public z20 d() {
        m10 m10Var = this.h;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.m10
    public final void g(Object obj) {
        ?? r2 = this;
        while (true) {
            rk rkVar = (rk) r2;
            m10 m10Var = rkVar.h;
            m10Var.getClass();
            try {
                obj = rkVar.r(obj);
                if (obj == y20.h) {
                    return;
                }
            } catch (Throwable th) {
                obj = new d92(th);
            }
            rkVar.s();
            if (!(m10Var instanceof rk)) {
                m10Var.g(obj);
                return;
            }
            r2 = m10Var;
        }
    }

    public m10 p(m10 m10Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement q() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        r60 r60Var = (r60) getClass().getAnnotation(r60.class);
        String str = null;
        if (r60Var == null || r60Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? r60Var.l()[iIntValue] : -1;
        eg egVar = ia2.t;
        eg egVar2 = ia2.u;
        if (egVar2 == null) {
            try {
                eg egVar3 = new eg((Object) Class.class.getDeclaredMethod("getModule", null), (Object) getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), (Object) getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), (byte) 14);
                ia2.u = egVar3;
                egVar2 = egVar3;
            } catch (Exception unused2) {
                ia2.u = egVar;
                egVar2 = egVar;
            }
        }
        if (egVar2 != egVar && (method = (Method) egVar2.i) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) egVar2.j) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) egVar2.k;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = r60Var.c();
        } else {
            strC = str + '/' + r60Var.c();
        }
        return new StackTraceElement(strC, r60Var.m(), r60Var.f(), i);
    }

    public Object r(Object obj) {
        m02.y(obj);
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objQ = q();
        if (objQ == null) {
            objQ = getClass().getName();
        }
        sb.append(objQ);
        return sb.toString();
    }

    public void s() {
    }
}
