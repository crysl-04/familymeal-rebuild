package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kl2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static ll2 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = kl2.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new ll2();
        }
        ox1 ox1VarE = jk2.i.e();
        for (int i2 = 0; i2 < i; i2++) {
            ox1VarE.add(parcel.readValue(classLoader));
        }
        return new ll2(ox1VarE.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new af2(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ll2[i];
            default:
                return new af2[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new af2(parcel, classLoader);
        }
    }
}
