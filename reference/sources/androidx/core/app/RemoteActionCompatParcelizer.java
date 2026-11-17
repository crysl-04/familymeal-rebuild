package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.g43;
import defpackage.h43;
import defpackage.i43;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(g43 g43Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        i43 i43VarG = remoteActionCompat.a;
        boolean z = true;
        if (g43Var.e(1)) {
            i43VarG = g43Var.g();
        }
        remoteActionCompat.a = (IconCompat) i43VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (g43Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h43) g43Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (g43Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h43) g43Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) g43Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (g43Var.e(5)) {
            z2 = ((h43) g43Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!g43Var.e(6)) {
            z = z3;
        } else if (((h43) g43Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, g43 g43Var) {
        g43Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        g43Var.h(1);
        g43Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        g43Var.h(2);
        Parcel parcel = ((h43) g43Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        g43Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        g43Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        g43Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        g43Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
