package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg2 {
    public static final li1 a = vz1.p;

    public static final boolean a(q02 q02Var) {
        MotionEvent motionEventA;
        List list = q02Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((z02) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = q02Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = q02Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
