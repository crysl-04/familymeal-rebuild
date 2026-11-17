package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ku1(byte b) {
        this.a = b;
    }

    public static lu1 a(Parcel parcel, ClassLoader classLoader) {
        hl2 hl2Var;
        if (classLoader == null) {
            classLoader = ku1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            hl2Var = c5.f0;
        } else if (i == 1) {
            hl2Var = vz1.s;
        } else {
            if (i != 2) {
                li1.g(jp1.i(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            hl2Var = vz1.k;
        }
        return new lu1(value, hl2Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return e.i;
                }
                li1.g("superState must be null");
                return null;
            default:
                return new fy2(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lu1[i];
            case 1:
                return new e[i];
            default:
                return new fy2[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return e.i;
                }
                li1.g("superState must be null");
                return null;
            default:
                return new fy2(parcel, null);
        }
    }
}
