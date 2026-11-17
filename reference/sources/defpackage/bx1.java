package defpackage;

import android.app.Application;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bx1 {
    public static final bx1 c = new bx1(ig0.j, new rt((byte) 20));
    public final rt a;
    public final r32 b;

    public bx1(ig0 ig0Var, rt rtVar) {
        r32 r32Var;
        this.a = rtVar;
        if (ig0Var.i) {
            r32Var = ig0.k;
        } else {
            int iMyPid = Process.myPid();
            String processName = Application.getProcessName();
            synchronized (ig0Var.h) {
                if (!ig0Var.i) {
                    ig0.k = new r32(ig0Var, iMyPid, processName);
                    ig0Var.i = true;
                }
            }
            r32Var = ig0.k;
        }
        this.b = r32Var;
    }
}
