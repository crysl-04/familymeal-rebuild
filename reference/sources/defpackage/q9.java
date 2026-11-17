package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q9 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ q9(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        o72 o72Var;
        long j;
        zG = false;
        zG = false;
        zG = false;
        zG = false;
        zG = false;
        boolean zG = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.h) {
            case 0:
                jx0 jx0Var = (jx0) this.i;
                synchronized (jx0Var.c) {
                    jx0Var.e = true;
                    uj1 uj1Var = jx0Var.d;
                    Object[] objArr = uj1Var.h;
                    int i = uj1Var.j;
                    for (int i2 = 0; i2 < i; i2++) {
                        so1 so1Var = (so1) ((z53) objArr[i2]).get();
                        if (so1Var != null && (o72Var = so1Var.b) != null) {
                            o72Var.closeConnection();
                            so1Var.b = null;
                        }
                    }
                    jx0Var.d.g();
                }
                aw2 aw2Var = ((r9) this.j).i;
                aw2Var.b.set(null);
                aw2Var.a.f();
                return j23.a;
            case 1:
                ib ibVar = (ib) this.i;
                jb jbVar = (jb) this.j;
                synchronized (ibVar.l) {
                    ibVar.n.remove(jbVar);
                }
                return j23.a;
            case 2:
                ((Choreographer) ((kb) this.i).i).removeFrameCallback((jb) this.j);
                return j23.a;
            case 3:
                KeyEvent keyEvent = ((v21) obj).a;
                sj1 sj1Var = (sj1) this.j;
                if (!((ry2) this.i).b()) {
                    sj1Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 4:
                KeyEvent keyEvent2 = ((v21) obj).a;
                if (((p81) this.i).a() == qs0.i && keyEvent2.getKeyCode() == 4 && ys.G(keyEvent2) == 1) {
                    ((kv2) this.j).d(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                zk2 zk2Var = (zk2) obj;
                synchronized (bl2.c) {
                    j = bl2.e;
                    bl2.e = 1 + j;
                }
                return new rj1(j, zk2Var, (vp0) this.i, (vp0) this.j);
            case 6:
                return ((vv0) this.i).h(((List) this.j).get(((Number) obj).intValue()));
            case 7:
                n31 n31Var = (n31) this.i;
                Object obj2 = n31Var.b;
                rq rqVar = (rq) this.j;
                synchronized (obj2) {
                    ((ArrayList) n31Var.c).remove(rqVar);
                }
                return j23.a;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((de1) this.i).h(((List) this.j).get(((Number) obj).intValue()));
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return ((vw1) this.i).h(((List) this.j).get(((Number) obj).intValue()));
            case 10:
                return ((vw1) this.i).h(((ArrayList) this.j).get(((Number) obj).intValue()));
            case 11:
                return ((jc2) this.i).h(((lh0) this.j).get(((Number) obj).intValue()));
            case 12:
                KeyEvent keyEvent3 = ((v21) obj).a;
                bm0 bm0Var = (bm0) this.i;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && ys.G(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (r02.v(19, keyEvent3)) {
                        zG = ((em0) bm0Var).g(5, true);
                    } else if (r02.v(20, keyEvent3)) {
                        zG = ((em0) bm0Var).g(6, true);
                    } else if (r02.v(21, keyEvent3)) {
                        zG = ((em0) bm0Var).g(3, true);
                    } else if (r02.v(22, keyEvent3)) {
                        zG = ((em0) bm0Var).g(4, true);
                    } else if (r02.v(23, keyEvent3)) {
                        ol2 ol2Var = ((p81) this.j).c;
                        if (ol2Var != null) {
                            ((m80) ol2Var).b();
                        }
                        zG = true;
                    }
                }
                return Boolean.valueOf(zG);
            case 13:
                return ((h33) this.i).h(((ArrayList) this.j).get(((Number) obj).intValue()));
            case 14:
                return ((h33) this.i).h(((lh0) this.j).get(((Number) obj).intValue()));
            case 15:
                return ((h33) this.i).h(((List) this.j).get(((Number) obj).intValue()));
            default:
                return ((h33) this.i).h(((List) this.j).get(((Number) obj).intValue()));
        }
    }
}
