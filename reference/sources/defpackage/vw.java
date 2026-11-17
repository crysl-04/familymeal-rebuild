package defpackage;

import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ MainActivity i;

    public /* synthetic */ vw(MainActivity mainActivity, byte b) {
        this.h = b;
        this.i = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        MainActivity mainActivity = this.i;
        switch (b) {
            case 0:
                gx.j(mainActivity);
                break;
            default:
                mainActivity.invalidateOptionsMenu();
                break;
        }
    }
}
