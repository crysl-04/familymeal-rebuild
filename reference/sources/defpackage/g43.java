package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g43 {
    public final rh a;
    public final rh b;
    public final rh c;

    public g43(rh rhVar, rh rhVar2, rh rhVar3) {
        this.a = rhVar;
        this.b = rhVar2;
        this.c = rhVar3;
    }

    public abstract h43 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        rh rhVar = this.c;
        Class cls2 = (Class) rhVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        rhVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        rh rhVar = this.a;
        Method method = (Method) rhVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, g43.class.getClassLoader()).getDeclaredMethod("read", g43.class);
        rhVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        rh rhVar = this.b;
        Method method = (Method) rhVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, g43.class);
        rhVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((h43) this).e.readParcelable(h43.class.getClassLoader());
    }

    public final i43 g() {
        String string = ((h43) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (i43) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(i43 i43Var) {
        if (i43Var == null) {
            ((h43) this).e.writeString(null);
            return;
        }
        try {
            ((h43) this).e.writeString(b(i43Var.getClass()).getName());
            h43 h43VarA = a();
            try {
                d(i43Var.getClass()).invoke(null, i43Var, h43VarA);
                Parcel parcel = h43VarA.e;
                int i = h43VarA.i;
                if (i >= 0) {
                    int i2 = h43VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(i43Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
