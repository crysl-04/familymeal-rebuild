package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p90 {
    public final byte[] a;
    public final File b;
    public final String c;
    public boolean d = false;
    public q90[] e;
    public byte[] f;

    public p90(AssetManager assetManager, ug ugVar, String str, File file) {
        this.c = str;
        this.b = file;
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? uz0.C : (i == 29 || i == 30) ? uz0.D : null;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        new l6(this, i, serializable).run();
    }
}
