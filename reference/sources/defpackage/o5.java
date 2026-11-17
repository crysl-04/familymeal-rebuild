package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o5 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public o5() {
        this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
        this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int iC = dx2.c(context, R.attr.colorControlHighlight);
        int iB = dx2.b(context, R.attr.colorButtonNormal);
        int[] iArr = dx2.b;
        int[] iArr2 = dx2.d;
        int iB2 = xv.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, dx2.c, dx2.f}, new int[]{iB, iB2, xv.b(iC, i), i});
    }

    public static void d(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        if (zd0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = ve.b;
        }
        PorterDuff.Mode mode2 = ve.b;
        synchronized (ve.class) {
            porterDuffColorFilterF = x82.f(i, mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final ColorStateList c(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            int i2 = df.a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            int i3 = df.a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = dx2.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = dx2.b;
                iArr2[0] = dx2.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = dx2.e;
                iArr2[1] = dx2.c(context, R.attr.colorControlActivated);
                iArr[2] = dx2.f;
                iArr2[2] = dx2.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = dx2.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = dx2.e;
                iArr2[1] = dx2.c(context, R.attr.colorControlActivated);
                iArr[2] = dx2.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, dx2.c(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return b(context, dx2.c(context, R.attr.colorAccent));
        }
        if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
            int i4 = df.a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a((int[]) this.b, i)) {
            return dx2.d(context, R.attr.colorControlNormal);
        }
        if (a((int[]) this.e, i)) {
            int i5 = df.a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a((int[]) this.f, i)) {
            int i6 = df.a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        int i7 = df.a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public o5(int i, int i2) {
        g52 g52Var = l52.q;
        cw cwVar = new cw(i2);
        this.b = cwVar;
        cwVar.j(i2);
        this.d = g52.R(i2, 1);
        cw cwVar2 = new cw(i);
        this.a = cwVar2;
        cwVar2.j(i2);
        this.c = g52.R(i, 1);
        this.e = g52.R(i, 1);
        this.f = new t5(i, i2);
    }
}
