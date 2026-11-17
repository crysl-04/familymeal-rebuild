package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ hf(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                qf qfVar = (qf) obj;
                if (!qfVar.getInternalPopup().a()) {
                    qfVar.m.m(qfVar.getTextDirection(), qfVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = qfVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                nf nfVar = (nf) obj;
                qf qfVar2 = nfVar.K;
                WeakHashMap weakHashMap = t43.a;
                if (qfVar2.isAttachedToWindow() && qfVar2.getGlobalVisibleRect(nfVar.I)) {
                    nfVar.s();
                    nfVar.d();
                } else {
                    nfVar.dismiss();
                }
                break;
            case 2:
                fr frVar = (fr) obj;
                ArrayList arrayList = frVar.o;
                if (frVar.a() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((er) arrayList.get(0)).a.E) {
                        View view = frVar.v;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                ((er) obj2).a.d();
                            }
                        } else {
                            frVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                en2 en2Var = (en2) obj;
                uf1 uf1Var = en2Var.o;
                if (en2Var.a() && !uf1Var.E) {
                    View view2 = en2Var.t;
                    if (view2 != null && view2.isShown()) {
                        uf1Var.d();
                    } else {
                        en2Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
