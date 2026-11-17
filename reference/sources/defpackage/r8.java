package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ r8(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.h) {
            case 0:
                s8 s8Var = (s8) this.i;
                Context context = view.getContext();
                if (!s8Var.c) {
                    context.getApplicationContext().registerComponentCallbacks(s8Var.d);
                    s8Var.c = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                s8 s8Var = (s8) obj;
                Context context = view.getContext();
                if (s8Var.c) {
                    context.getApplicationContext().unregisterComponentCallbacks(s8Var.d);
                    s8Var.c = false;
                }
                break;
            case 1:
                fr frVar = (fr) obj;
                ViewTreeObserver viewTreeObserver = frVar.E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        frVar.E = view.getViewTreeObserver();
                    }
                    frVar.E.removeGlobalOnLayoutListener(frVar.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                en2 en2Var = (en2) obj;
                ViewTreeObserver viewTreeObserver2 = en2Var.v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        en2Var.v = view.getViewTreeObserver();
                    }
                    en2Var.v.removeGlobalOnLayoutListener(en2Var.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                u uVar = (u) obj;
                for (Object obj2 : ph2.H(uVar.getParent(), x43.o)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                uVar.f();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((dn2) obj).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
