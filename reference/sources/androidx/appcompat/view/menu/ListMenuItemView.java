package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.eg;
import defpackage.f52;
import defpackage.if1;
import defpackage.lf1;
import defpackage.t43;
import defpackage.xf1;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements xf1, AbsListView.SelectionBoundsAdjuster {
    public lf1 h;
    public ImageView i;
    public RadioButton j;
    public TextView k;
    public CheckBox l;
    public TextView m;
    public ImageView n;
    public ImageView o;
    public LinearLayout p;
    public final Drawable q;
    public final int r;
    public final Context s;
    public boolean t;
    public final Drawable u;
    public final boolean v;
    public LayoutInflater w;
    public boolean x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        eg egVarW = eg.w(getContext(), attributeSet, f52.r, R.attr.listMenuViewStyle);
        this.q = egVarW.k(5);
        TypedArray typedArray = (TypedArray) egVarW.i;
        this.r = typedArray.getResourceId(1, -1);
        this.t = typedArray.getBoolean(7, false);
        this.s = context;
        this.u = egVarW.k(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.v = typedArrayObtainStyledAttributes.hasValue(0);
        egVarW.A();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.w;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.w = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    @Override // defpackage.xf1
    public final void a(lf1 lf1Var) {
        boolean z;
        int i;
        String string;
        this.h = lf1Var;
        boolean zIsVisible = lf1Var.isVisible();
        if1 if1Var = lf1Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(lf1Var.e);
        setCheckable(lf1Var.isCheckable());
        if (if1Var.o()) {
            if ((if1Var.n() ? lf1Var.j : lf1Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if1Var.n();
        if (z) {
            lf1 lf1Var2 = this.h;
            if1 if1Var2 = lf1Var2.n;
            if (if1Var2.o()) {
                i = (if1Var2.n() ? lf1Var2.j : lf1Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.m;
            lf1 lf1Var3 = this.h;
            if1 if1Var3 = lf1Var3.n;
            Context context = if1Var3.a;
            char c = if1Var3.n() ? lf1Var3.j : lf1Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = if1Var3.n() ? lf1Var3.k : lf1Var3.i;
                lf1.c(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                lf1.c(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                lf1.c(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                lf1.c(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                lf1.c(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                lf1.c(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.m.getVisibility() != i) {
            this.m.setVisibility(i);
        }
        setIcon(lf1Var.getIcon());
        setEnabled(lf1Var.isEnabled());
        setSubMenuArrowVisible(lf1Var.hasSubMenu());
        setContentDescription(lf1Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o.getLayoutParams();
        rect.top = this.o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.xf1
    public lf1 getItemData() {
        return this.h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = t43.a;
        setBackground(this.q);
        TextView textView = (TextView) findViewById(R.id.title);
        this.k = textView;
        int i = this.r;
        if (i != -1) {
            textView.setTextAppearance(this.s, i);
        }
        this.m = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.u);
        }
        this.o = (ImageView) findViewById(R.id.group_divider);
        this.p = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.i != null && this.t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.j == null && this.l == null) {
            return;
        }
        if ((this.h.x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
            compoundButton2 = this.l;
            compoundButton3 = compoundButton2;
        } else {
            if (this.l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.l = checkBox;
                LinearLayout linearLayout2 = this.p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.l;
            compoundButton2 = this.j;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.j;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.h.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.h.x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
        } else {
            if (this.l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.l = checkBox;
                LinearLayout linearLayout2 = this.p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.l;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.x = z;
        this.t = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility((this.v || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        if1 if1Var = this.h.n;
        boolean z = this.x;
        if (z || this.t) {
            ImageView imageView = this.i;
            if (imageView == null && drawable == null && !this.t) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.i = imageView2;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.t) {
                this.i.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.i;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.k;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.k.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.k.getVisibility() != 0) {
                this.k.setVisibility(0);
            }
        }
    }
}
