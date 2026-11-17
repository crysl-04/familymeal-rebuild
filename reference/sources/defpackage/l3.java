package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new m3(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                of ofVar = new of(parcel);
                ofVar.h = parcel.readByte() != 0;
                return ofVar;
            case 2:
                return new fj(parcel);
            case 3:
                return new gj(parcel);
            case 4:
                return new l70(parcel.readInt());
            case 5:
                uo0 uo0Var = new uo0();
                uo0Var.h = parcel.readString();
                uo0Var.i = parcel.readInt();
                return uo0Var;
            case 6:
                zo0 zo0Var = new zo0();
                zo0Var.l = null;
                zo0Var.m = new ArrayList();
                zo0Var.n = new ArrayList();
                zo0Var.h = parcel.createStringArrayList();
                zo0Var.i = parcel.createStringArrayList();
                zo0Var.j = (fj[]) parcel.createTypedArray(fj.CREATOR);
                zo0Var.k = parcel.readInt();
                zo0Var.l = parcel.readString();
                zo0Var.m = parcel.createStringArrayList();
                zo0Var.n = parcel.createTypedArrayList(gj.CREATOR);
                zo0Var.o = parcel.createTypedArrayList(uo0.CREATOR);
                return zo0Var;
            case 7:
                return new dp0(parcel);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new fz0((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                en1 en1Var = new en1(parcel);
                en1Var.h = parcel.readInt();
                return en1Var;
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                return new hu1(parcel.readFloat());
            case 12:
                return new iu1(parcel.readInt());
            default:
                return new ju1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m3[i];
            case 1:
                return new of[i];
            case 2:
                return new fj[i];
            case 3:
                return new gj[i];
            case 4:
                return new l70[i];
            case 5:
                return new uo0[i];
            case 6:
                return new zo0[i];
            case 7:
                return new dp0[i];
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return new fz0[i];
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return new en1[i];
            case 10:
                return new ParcelImpl[i];
            case 11:
                return new hu1[i];
            case 12:
                return new iu1[i];
            default:
                return new ju1[i];
        }
    }
}
