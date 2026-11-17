package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends Binder implements zt0 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public sh1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, zt0.b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = zt0.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        yt0 yt0Var = null;
        yt0 yt0Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(yt0.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yt0)) {
                    xt0 xt0Var = new xt0();
                    xt0Var.c = strongBinder;
                    yt0Var = xt0Var;
                } else {
                    yt0Var = (yt0) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            yt0Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
                synchronized (multiInstanceInvalidationService.j) {
                    int i4 = multiInstanceInvalidationService.h + 1;
                    multiInstanceInvalidationService.h = i4;
                    if (multiInstanceInvalidationService.j.register(yt0Var, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService.i.put(Integer.valueOf(i4), string);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.h--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(yt0.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof yt0)) {
                    xt0 xt0Var2 = new xt0();
                    xt0Var2.c = strongBinder2;
                    yt0Var2 = xt0Var2;
                } else {
                    yt0Var2 = (yt0) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            yt0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.c;
            synchronized (multiInstanceInvalidationService2.j) {
                multiInstanceInvalidationService2.j.unregister(yt0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.c;
        synchronized (multiInstanceInvalidationService3.j) {
            String str2 = (String) multiInstanceInvalidationService3.i.get(Integer.valueOf(i6));
            if (str2 != null) {
                int iBeginBroadcast = multiInstanceInvalidationService3.j.beginBroadcast();
                while (i3 < iBeginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.j.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.i.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((yt0) multiInstanceInvalidationService3.j.getBroadcastItem(i3)).a(strArrCreateStringArray);
                            } catch (RemoteException unused) {
                            }
                        }
                        i3++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService3.j.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService3.j.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
