package defpackage;

import android.app.NotificationManager;
import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class po1 {
    public final NotificationManager a;

    public po1(MainActivity mainActivity) {
        this.a = (NotificationManager) mainActivity.getSystemService("notification");
    }
}
