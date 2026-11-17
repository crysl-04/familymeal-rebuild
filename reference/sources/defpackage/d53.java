package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d53 extends f53 {
    public static d53 c;
    public static final c53 d = new c53(0);
    public final Application b;

    public d53(Application application) {
        this.b = application;
    }

    @Override // defpackage.f53, defpackage.e53
    public final z43 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.f53, defpackage.e53
    public final z43 b(Class cls, pi1 pi1Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) pi1Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!nb.class.isAssignableFrom(cls)) {
            return vs.y(cls);
        }
        wg.m("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final z43 d(Class cls, Application application) {
        if (!nb.class.isAssignableFrom(cls)) {
            return vs.y(cls);
        }
        try {
            z43 z43Var = (z43) cls.getConstructor(Application.class).newInstance(application);
            z43Var.getClass();
            return z43Var;
        } catch (IllegalAccessException e) {
            li1.k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            li1.k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            li1.k("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            li1.k("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
