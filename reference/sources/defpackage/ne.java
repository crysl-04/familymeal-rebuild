package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ne extends pz1 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ne(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override // defpackage.o53
    public final void a() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                te teVar = ((le) obj).i;
                teVar.t.setAlpha(1.0f);
                teVar.w.d(null);
                teVar.w = null;
                break;
            case 1:
                te teVar2 = (te) obj;
                teVar2.t.setAlpha(1.0f);
                teVar2.w.d(null);
                teVar2.w = null;
                break;
            default:
                te teVar3 = (te) ((ix0) obj).j;
                teVar3.t.setVisibility(8);
                PopupWindow popupWindow = teVar3.u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (teVar3.t.getParent() instanceof View) {
                    View view = (View) teVar3.t.getParent();
                    WeakHashMap weakHashMap = t43.a;
                    view.requestApplyInsets();
                }
                teVar3.t.removeAllViews();
                teVar3.w.d(null);
                teVar3.w = null;
                ViewGroup viewGroup = teVar3.z;
                WeakHashMap weakHashMap2 = t43.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.pz1, defpackage.o53
    public final void c() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((le) obj).i.t.setVisibility(0);
                break;
            case 1:
                te teVar = (te) obj;
                teVar.t.setVisibility(0);
                teVar.t.sendAccessibilityEvent(32);
                if (teVar.t.getParent() instanceof View) {
                    View view = (View) teVar.t.getParent();
                    WeakHashMap weakHashMap = t43.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
