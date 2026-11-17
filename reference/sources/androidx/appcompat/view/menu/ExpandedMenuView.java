package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.eg;
import defpackage.hf1;
import defpackage.if1;
import defpackage.lf1;
import defpackage.yf1;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements hf1, yf1, AdapterView.OnItemClickListener {
    public static final int[] i = {R.attr.background, R.attr.divider};
    public if1 h;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        eg egVarW = eg.w(context, attributeSet, i, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) egVarW.i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(egVarW.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(egVarW.k(1));
        }
        egVarW.A();
    }

    @Override // defpackage.hf1
    public final boolean a(lf1 lf1Var) {
        return this.h.q(lf1Var, null, 0);
    }

    @Override // defpackage.yf1
    public final void b(if1 if1Var) {
        this.h = if1Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        a((lf1) getAdapter().getItem(i2));
    }
}
