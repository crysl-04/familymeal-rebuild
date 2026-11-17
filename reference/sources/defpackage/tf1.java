package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends be0 {
    public final byte u;
    public final byte v;
    public kf1 w;
    public lf1 x;

    public tf1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.u = (byte) 21;
            this.v = (byte) 22;
        } else {
            this.u = (byte) 22;
            this.v = (byte) 21;
        }
    }

    @Override // defpackage.be0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ff1 ff1Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.w != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ff1Var = (ff1) headerViewListAdapter.getWrappedAdapter();
            } else {
                ff1Var = (ff1) adapter;
                headersCount = 0;
            }
            lf1 lf1VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ff1Var.getCount()) ? null : ff1Var.getItem(i);
            lf1 lf1Var = this.x;
            if (lf1Var != lf1VarB) {
                if1 if1Var = ff1Var.h;
                if (lf1Var != null) {
                    this.w.g(if1Var, lf1Var);
                }
                this.x = lf1VarB;
                if (lf1VarB != null) {
                    this.w.k(if1Var, lf1VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (i == this.v) {
                setSelection(-1);
                ((ff1) getAdapter()).h.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(kf1 kf1Var) {
        this.w = kf1Var;
    }

    @Override // defpackage.be0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
