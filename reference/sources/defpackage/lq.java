package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lq implements Runnable {
    public final /* synthetic */ byte h = 1;

    public /* synthetic */ lq() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                return;
            default:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (if0.d()) {
                        if0.a().e();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    public lq(xl1 xl1Var, int i) {
    }

    private final void a() {
    }
}
