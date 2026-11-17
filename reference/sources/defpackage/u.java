package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends ViewGroup {
    public WeakReference h;
    public IBinder i;
    public r93 j;
    public jz k;
    public wy l;
    public zi m;
    public boolean n;
    public boolean o;
    public boolean p;

    public u(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        r8 r8Var = new r8(this, (byte) 3);
        addOnAttachStateChangeListener(r8Var);
        li1 li1Var = new li1((byte) 29);
        pz1.o(this).a.add(li1Var);
        this.m = new zi((Object) this, (Object) r8Var, (Object) li1Var, (byte) 9);
    }

    private final void setParentContext(jz jzVar) {
        if (this.k != jzVar) {
            this.k = jzVar;
            if (jzVar != null) {
                this.h = null;
            }
            r93 r93Var = this.j;
            if (r93Var != null) {
                r93Var.d();
                this.j = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.i != iBinder) {
            this.i = iBinder;
            this.h = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(int i, dr0 dr0Var);

    public final void c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.l == null) {
                t6 t6Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof t6) {
                        t6Var = (t6) childAt;
                    }
                }
                if (t6Var != null) {
                    t6Var.setComposeViewContext(l(es.E(this), t6Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                g();
            }
        }
    }

    public final void d() {
        if (!this.o) {
            throw new UnsupportedOperationException(wi0.h("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    public final void e() {
        wy wyVar;
        if (this.k != null || isAttachedToWindow() || ((wyVar = this.l) != null && wyVar.a.isAttachedToWindow())) {
            g();
        } else {
            li1.g("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void f() {
        View childAt = getChildAt(0);
        t6 t6Var = childAt instanceof t6 ? (t6) childAt : null;
        if (t6Var != null && t6Var.J0) {
            t6Var.getComposeViewContext().b();
            t6Var.J0 = false;
        }
        r93 r93Var = this.j;
        if (r93Var != null) {
            r93Var.d();
        }
        this.j = null;
        requestLayout();
    }

    public final void g() {
        if (this.j == null) {
            byte b = 0;
            try {
                this.o = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    wy wyVarJ = this.l;
                    if (wyVarJ == null) {
                        wyVarJ = j();
                    }
                    this.j = v93.a(this, wyVarJ, new nx(1003123809, true, new s(this, b)));
                    Trace.endSection();
                    this.o = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.o = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m12getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        oi oiVar = tag instanceof oi ? (oi) tag : null;
        if (oiVar != null) {
            return oiVar.a;
        }
        return 1;
    }

    public final wy getComposeViewContext$ui() {
        return this.l;
    }

    public final boolean getHasComposition() {
        return this.j != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.n;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.p || super.isTransitionGroup();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final wy j() {
        wy composeViewContext;
        h53 h53Var;
        h53 h53Var2 = null;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            t6 t6Var = childAt instanceof t6 ? (t6) childAt : null;
            if (t6Var != null) {
                composeViewContext = t6Var.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        } else {
            composeViewContext = null;
        }
        View viewE = es.E(this);
        wy wyVarI = es.I(viewE);
        if (wyVarI != null) {
            return l(viewE, wyVarI);
        }
        jz jzVarK = k();
        e91 e91VarI = m02.i(viewE);
        if (e91VarI == null) {
            e91VarI = composeViewContext != null ? composeViewContext.d() : null;
            if (e91VarI == null) {
                li1.g("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        e91 e91Var = e91VarI;
        dc2 dc2VarY = p02.y(viewE);
        if (dc2VarY == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                dc2VarY = composeViewContext.e;
                dc2VarY.getClass();
            } else {
                dc2VarY = null;
            }
            if (dc2VarY == null) {
                li1.g("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        dc2 dc2Var = dc2VarY;
        h53 h53VarQ = r02.q(viewE);
        if (h53VarQ == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                h53Var2 = composeViewContext.f;
            }
            h53Var = h53Var2;
        } else {
            h53Var = h53VarQ;
        }
        wy wyVar = new wy(es.I(es.E(viewE)), viewE, jzVarK, e91Var, dc2Var, h53Var);
        viewE.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(wyVar));
        return wyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [jz] */
    /* JADX WARN: Type inference failed for: r0v1, types: [jz] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [jz] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [l72] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final jz k() {
        jz jzVar;
        ?? A = this.k;
        if (A == 0) {
            A = j93.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    jz jzVarA = j93.a(view);
                    parent = rz1.p(view);
                    A = jzVarA;
                }
            }
            i72 i72Var = i72.i;
            if (A != 0) {
                ?? r3 = (!(A instanceof l72) || ((i72) ((l72) A).u.getValue()).compareTo(i72Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.h = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.h;
                if (weakReference == null || (jzVar = (jz) weakReference.get()) == null || ((jzVar instanceof l72) && ((i72) ((l72) jzVar).u.getValue()).compareTo(i72Var) <= 0)) {
                    A = jzVar;
                    A = jzVar;
                    A = 0;
                }
                if (A == 0) {
                    A = j93.b(this);
                    ?? r2 = ((i72) A.u.getValue()).compareTo(i72Var) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.h = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    public final wy l(View view, wy wyVar) {
        jz jzVarK = k();
        e91 e91VarI = m02.i(view);
        h53 h53VarQ = r02.q(view);
        dc2 dc2VarY = p02.y(view);
        if (jzVarK == wyVar.c() && e91VarI == wyVar.d()) {
            wyVar.g();
            if (h53VarQ == wyVar.f) {
                wyVar.g();
                dc2 dc2Var = wyVar.e;
                dc2Var.getClass();
                if (dc2VarY == dc2Var) {
                    return wyVar;
                }
            }
        }
        if (jzVarK.j() != wyVar.c().j()) {
            f();
        }
        if (e91VarI == null) {
            e91VarI = wyVar.d();
        }
        e91 e91Var = e91VarI;
        if (dc2VarY == null) {
            wyVar.g();
            dc2VarY = wyVar.e;
            dc2VarY.getClass();
        }
        wy wyVar2 = new wy(wyVar, view, jzVarK, e91Var, dc2VarY, h53VarQ);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(wyVar2));
        return wyVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mj1 mj1Var = j93.a;
        Object objP = rz1.p(this);
        View view = this;
        while (objP instanceof View) {
            View view2 = (View) objP;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objP = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new t(this, (byte) 0));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m13setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new oi(i));
    }

    public final void setComposeViewContext$ui(wy wyVar) {
        if (this.l != wyVar) {
            if (wyVar == null) {
                f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                t6 t6Var = childAt instanceof t6 ? (t6) childAt : null;
                if (t6Var != null) {
                    if (t6Var.getCoroutineContext() != wyVar.c().j()) {
                        f();
                    }
                    t6Var.setComposeViewContext(wyVar);
                }
            }
            this.l = wyVar;
        }
    }

    public final void setParentCompositionContext(jz jzVar) {
        setParentContext(jzVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.n = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((t6) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.p = true;
    }

    public final void setViewCompositionStrategy(u43 u43Var) {
        zi ziVar = this.m;
        if (ziVar != null) {
            ziVar.a();
        }
        ((y02) u43Var).getClass();
        r8 r8Var = new r8(this, (byte) 3);
        addOnAttachStateChangeListener(r8Var);
        li1 li1Var = new li1((byte) 29);
        pz1.o(this).a.add(li1Var);
        this.m = new zi((Object) this, (Object) r8Var, (Object) li1Var, (byte) 9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
