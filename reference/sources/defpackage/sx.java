package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx implements fq0 {
    @Override // defpackage.fq0
    public final Object n(String str, Boolean bool, e10 e10Var, Object obj, Object obj2, dr0 dr0Var, Integer num) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        aq0 aq0Var = (aq0) obj;
        kp0 kp0Var = (kp0) obj2;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        og1 og1Var = og1.h;
        if (i2 == 0) {
            i = (dr0Var.f(og1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dr0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= dr0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= dr0Var.f(e10Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= dr0Var.h(aq0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= dr0Var.h(kp0Var) ? 131072 : 65536;
        }
        if (dr0Var.N(i & 1, (599187 & i) != 599186)) {
            j10.c(str, zBooleanValue, e10Var, og1Var, aq0Var, kp0Var, dr0Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
