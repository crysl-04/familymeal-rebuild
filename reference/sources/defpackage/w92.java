package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w92 extends ViewGroup {
    public final byte h;
    public final ArrayList i;
    public final ArrayList j;
    public final k42 k;
    public int l;

    public w92(Context context) {
        super(context);
        this.h = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        this.k = new k42((byte) 1);
        setClipChildren(false);
        x92 x92Var = new x92(context);
        addView(x92Var);
        arrayList.add(x92Var);
        arrayList2.add(x92Var);
        this.l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
