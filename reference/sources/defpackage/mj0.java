package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.familymeal.app.MainActivity;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class mj0 extends ca0 {
    public ImageView A0;
    public TextView B0;
    public final Handler v0 = new Handler(Looper.getMainLooper());
    public final q6 w0 = new q6(this, 5);
    public jn x0;
    public int y0;
    public int z0;

    @Override // defpackage.jo0
    public final void A() {
        this.L = true;
        jn jnVar = this.x0;
        jnVar.t = 0;
        jnVar.e(1);
        jn jnVar2 = this.x0;
        String strM = m(R.string.fingerprint_dialog_touch_sensor);
        vi1 vi1Var = jnVar2.v;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar2.v = vi1Var;
        }
        jn.g(vi1Var, strM);
    }

    @Override // defpackage.ca0
    public final Dialog I() {
        int i;
        p4 p4Var = new p4(F());
        String strM = null;
        String str = this.x0.d != null ? "解锁家庭食谱" : null;
        l4 l4Var = (l4) p4Var.c;
        l4Var.d = str;
        View viewInflate = LayoutInflater.from(l4Var.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            String str2 = this.x0.d != null ? "使用指纹、面容或锁屏密码" : null;
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.x0.getClass();
            textView2.setVisibility(8);
        }
        this.A0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.B0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        jn jnVar = this.x0;
        gn gnVar = jnVar.d;
        if (gnVar != null) {
            fn fnVar = jnVar.e;
            i = gnVar.a;
            if (i == 0) {
                i = fnVar != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        if (uz0.l(i)) {
            strM = m(R.string.confirm_device_credential_password);
        } else if (this.x0.d != null) {
            strM = "";
        }
        in inVar = new in(this);
        l4Var.f = strM;
        l4Var.g = inVar;
        l4Var.k = viewInflate;
        q4 q4VarC = p4Var.c();
        q4VarC.setCanceledOnTouchOutside(false);
        return q4VarC;
    }

    public final int J(int i) {
        Context contextJ = j();
        MainActivity mainActivityH = h();
        if (contextJ == null || mainActivityH == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextJ.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = mainActivityH.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.ca0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        jn jnVar = this.x0;
        vi1 vi1Var = jnVar.s;
        if (vi1Var == null) {
            vi1Var = new vi1();
            jnVar.s = vi1Var;
        }
        jn.g(vi1Var, Boolean.TRUE);
    }

    @Override // defpackage.ca0, defpackage.jo0
    public final void v(Bundle bundle) {
        super.v(bundle);
        MainActivity mainActivityH = h();
        if (mainActivityH != null) {
            g53 g53VarF = mainActivityH.f();
            e53 e53VarA = cy1.A(mainActivityH);
            e30 e30VarZ = cy1.z(mainActivityH);
            e53VarA.getClass();
            e30VarZ.getClass();
            wk wkVar = new wk(g53VarF, e53VarA, e30VarZ);
            du duVarA = z72.a(jn.class);
            String strB = duVarA.b();
            if (strB == null) {
                wg.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            jn jnVar = (jn) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            this.x0 = jnVar;
            vi1 vi1Var = jnVar.u;
            if (vi1Var == null) {
                vi1Var = new vi1();
                jnVar.u = vi1Var;
            }
            vi1Var.d(this, new jj0(this, (byte) 0));
            jn jnVar2 = this.x0;
            vi1 vi1Var2 = jnVar2.v;
            if (vi1Var2 == null) {
                vi1Var2 = new vi1();
                jnVar2.v = vi1Var2;
            }
            vi1Var2.d(this, new jj0(this, (byte) 1));
        }
        this.y0 = J(lj0.a());
        this.z0 = J(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.jo0
    public final void z() {
        this.L = true;
        this.v0.removeCallbacksAndMessages(null);
    }
}
