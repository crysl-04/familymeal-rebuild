package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.jy1;
import defpackage.tw0;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements tw0 {
    @Override // defpackage.tw0
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.tw0
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: w32
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new x32(applicationContext, (byte) 0), new Random().nextInt(1000) + 5000);
            }
        });
        return new jy1((byte) 5);
    }
}
