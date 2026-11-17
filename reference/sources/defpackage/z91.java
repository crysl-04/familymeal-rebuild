package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class z91 extends ViewGroup.MarginLayoutParams {
    public float a;
    public int b;

    public z91(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.n);
        this.a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.b = typedArrayObtainStyledAttributes.getInt(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public z91(int i) {
        super(i, -2);
        this.b = -1;
        this.a = 0.0f;
    }

    public z91(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = -1;
    }
}
