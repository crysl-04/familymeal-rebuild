package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux implements cq0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ ux(byte b) {
        this.h = b;
    }

    @Override // defpackage.cq0
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                rt2 rt2Var = (rt2) obj;
                gt2 gt2Var = (gt2) obj2;
                kp0 kp0Var = (kp0) obj3;
                dr0 dr0Var = (dr0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? ((iIntValue & 8) == 0 ? dr0Var.f(rt2Var) : dr0Var.h(rt2Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? dr0Var.f(gt2Var) : dr0Var.h(gt2Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= dr0Var.h(kp0Var) ? 256 : 128;
                }
                if (!dr0Var.N(i & 1, (i & 1171) != 1170)) {
                    dr0Var.Q();
                } else {
                    e80.c((fl) rt2Var, gt2Var, kp0Var, dr0Var, i & 1022);
                }
                break;
            case 1:
                rt2 rt2Var2 = (rt2) obj;
                gt2 gt2Var2 = (gt2) obj2;
                kp0 kp0Var2 = (kp0) obj3;
                dr0 dr0Var2 = (dr0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? ((iIntValue2 & 8) == 0 ? dr0Var2.f(rt2Var2) : dr0Var2.h(rt2Var2) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? dr0Var2.f(gt2Var2) : dr0Var2.h(gt2Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= dr0Var2.h(kp0Var2) ? 256 : 128;
                }
                if (!dr0Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
                    dr0Var2.Q();
                } else {
                    e80.c((fl) rt2Var2, gt2Var2, kp0Var2, dr0Var2, i2 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((qw2) obj5).a;
                String string = ((CharSequence) obj4).subSequence(qw2.f(j), qw2.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return j23Var;
    }
}
