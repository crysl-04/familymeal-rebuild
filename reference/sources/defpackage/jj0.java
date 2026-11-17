package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.TextView;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 implements qp1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ mj0 i;

    public /* synthetic */ jj0(mj0 mj0Var, byte b) {
        this.h = b;
        this.i = mj0Var;
    }

    @Override // defpackage.qp1
    public final void w(Object obj) {
        byte b = this.h;
        mj0 mj0Var = this.i;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                Handler handler = mj0Var.v0;
                q6 q6Var = mj0Var.w0;
                handler.removeCallbacks(q6Var);
                int iIntValue = num.intValue();
                if (mj0Var.A0 != null) {
                    int i = mj0Var.x0.t;
                    Context contextJ = mj0Var.j();
                    Drawable drawable = null;
                    if (contextJ != null) {
                        int i2 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i == 0 && iIntValue == 1) {
                            drawable = contextJ.getDrawable(i2);
                        } else {
                            if (i == 1 && iIntValue == 2) {
                                i2 = R.drawable.fingerprint_dialog_error;
                            } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                            }
                            drawable = contextJ.getDrawable(i2);
                        }
                    }
                    if (drawable != null) {
                        mj0Var.A0.setImageDrawable(drawable);
                        if ((i != 0 || iIntValue != 1) && ((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1))) {
                            kj0.a(drawable);
                        }
                        mj0Var.x0.t = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = mj0Var.B0;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? mj0Var.y0 : mj0Var.z0);
                }
                handler.postDelayed(q6Var, 2000L);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                Handler handler2 = mj0Var.v0;
                q6 q6Var2 = mj0Var.w0;
                handler2.removeCallbacks(q6Var2);
                TextView textView2 = mj0Var.B0;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(q6Var2, 2000L);
                break;
        }
    }
}
