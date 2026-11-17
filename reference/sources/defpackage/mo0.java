package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mo0 extends FrameLayout {
    public final ArrayList h;
    public final ArrayList i;
    public View.OnApplyWindowInsetsListener j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(Context context, AttributeSet attributeSet, yo0 yo0Var) {
        String str;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e52.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        jo0 jo0VarC = yo0Var.C(id);
        if (classAttribute != null && jo0VarC == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + ((Object) string);
                } else {
                    str = "";
                }
                wg.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str);
                throw null;
            }
            so0 so0VarH = yo0Var.H();
            context.getClassLoader();
            jo0 jo0VarA = so0VarH.a(classAttribute);
            jo0VarA.getClass();
            jo0VarA.E = id;
            jo0VarA.F = id;
            jo0VarA.G = string;
            jo0VarA.A = yo0Var;
            lo0 lo0Var = yo0Var.w;
            jo0VarA.B = lo0Var;
            jo0VarA.L = true;
            if ((lo0Var == null ? null : lo0Var.l) != null) {
                jo0VarA.L = true;
            }
            ej ejVar = new ej(yo0Var);
            ejVar.o = true;
            jo0VarA.M = this;
            jo0VarA.w = true;
            ejVar.f(getId(), jo0VarA, string);
            if (ejVar.g) {
                li1.g("This transaction is already being added to the back stack");
                throw null;
            }
            yo0 yo0Var2 = ejVar.q;
            if (yo0Var2.w != null && !yo0Var2.J) {
                yo0Var2.z(true);
                ej ejVar2 = yo0Var2.h;
                if (ejVar2 != null) {
                    ejVar2.r = false;
                    ejVar2.d();
                    if (yo0.J(3)) {
                        Objects.toString(yo0Var2.h);
                        Objects.toString(ejVar);
                    }
                    yo0Var2.h.e(false, false);
                    yo0Var2.h.a(yo0Var2.L, yo0Var2.M);
                    ArrayList arrayList = yo0Var2.h.a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        jo0 jo0Var = ((hp0) obj).b;
                        if (jo0Var != null) {
                            jo0Var.t = false;
                        }
                    }
                    yo0Var2.h = null;
                }
                ejVar.a(yo0Var2.L, yo0Var2.M);
                yo0Var2.b = true;
                try {
                    yo0Var2.V(yo0Var2.L, yo0Var2.M);
                    yo0Var2.e();
                    yo0Var2.f0();
                    if (yo0Var2.K) {
                        yo0Var2.K = false;
                        yo0Var2.d0();
                    }
                    ((HashMap) yo0Var2.c.j).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    yo0Var2.e();
                    throw th;
                }
            }
        }
        ArrayList arrayListS = yo0Var.c.s();
        int size2 = arrayListS.size();
        while (i < size2) {
            Object obj2 = arrayListS.get(i);
            i++;
            jo0 jo0Var2 = ((ep0) obj2).c;
            getId();
        }
    }

    public final void a(View view) {
        if (this.i.contains(view)) {
            this.h.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof jo0 ? (jo0) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q83 q83VarC;
        windowInsets.getClass();
        q83 q83VarC2 = q83.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.j;
        if (onApplyWindowInsetsListener != null) {
            q83VarC = q83.c(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = t43.a;
            WindowInsets windowInsetsB = q83VarC2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                q83VarC2 = q83.c(windowInsetsB, this);
            }
            q83VarC = q83VarC2;
        }
        if (!q83VarC.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                t43.b(getChildAt(i), q83VarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.k) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.k) {
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.i.remove(view);
        if (this.h.remove(view)) {
            this.k = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends jo0> F getFragment() {
        jo0 jo0Var;
        MainActivity mainActivity;
        yo0 yo0VarI;
        View view = this;
        while (true) {
            if (view == null) {
                jo0Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            jo0Var = tag instanceof jo0 ? (jo0) tag : null;
            if (jo0Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (jo0Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    mainActivity = null;
                    break;
                }
                if (context instanceof MainActivity) {
                    mainActivity = (MainActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (mainActivity == null) {
                wg.j("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            yo0VarI = ((lo0) mainActivity.B.i).o;
        } else {
            if (!jo0Var.p()) {
                throw new IllegalStateException("The Fragment " + jo0Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            yo0VarI = jo0Var.i();
        }
        return (F) yo0VarI.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.k = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.j = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.i.add(view);
        }
        super.startViewTransition(view);
    }
}
