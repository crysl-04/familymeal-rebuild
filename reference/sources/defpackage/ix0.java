package defpackage;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ix0 implements qu, ci1, of0, rf2, dy0, cp2, sq, as1 {
    public static final int[] k = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ byte h;
    public Object i;
    public Object j;

    public ix0(byte b) {
        this.h = b;
        switch (b) {
            case 10:
                break;
            case 20:
                s03 s03Var = aa3.Q;
                Float fValueOf = Float.valueOf(0.0f);
                this.j = new dd(s03Var, fValueOf, (id) s03Var.a.h(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 22:
                this.i = ConcurrentHashMap.newKeySet();
                this.j = new CopyOnWriteArrayList();
                break;
            case 24:
                this.i = new mj1();
                this.j = new mj1();
                break;
            case 25:
                this.i = new uj1(new l41[16]);
                break;
            default:
                this.i = new c43(true);
                this.j = new c43(true);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void q(l41 l41Var) {
        if (l41Var.T > 0) {
            if (l41Var.M.d == h41.l && !l41Var.p() && !l41Var.q() && !l41Var.U && l41Var.J()) {
                qg1 qg1Var = l41Var.L.f;
                if ((qg1Var.k & 256) != 0) {
                    while (qg1Var != null) {
                        if ((qg1Var.j & 256) != 0) {
                            ?? R = qg1Var;
                            ?? uj1Var = 0;
                            while (R != 0) {
                                if (R instanceof sr0) {
                                    sr0 sr0Var = (sr0) R;
                                    sr0Var.v(cu.W(sr0Var, 256));
                                } else if ((R.j & 256) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var2 = ((k80) R).w;
                                    int i = 0;
                                    R = R;
                                    uj1Var = uj1Var;
                                    while (qg1Var2 != null) {
                                        if ((qg1Var2.j & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                uj1Var = uj1Var;
                                                R = qg1Var2;
                                            } else {
                                                if (uj1Var == 0) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var.b(R);
                                                    R = 0;
                                                }
                                                uj1Var.b(qg1Var2);
                                            }
                                        }
                                        qg1Var2 = qg1Var2.m;
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                R = cu.R(uj1Var);
                            }
                        }
                        if ((qg1Var.k & 256) == 0) {
                            break;
                        } else {
                            qg1Var = qg1Var.m;
                        }
                    }
                }
            }
            l41Var.S = false;
            uj1 uj1VarZ = l41Var.z();
            Object[] objArr = uj1VarZ.h;
            int i2 = uj1VarZ.j;
            for (int i3 = 0; i3 < i2; i3++) {
                q((l41) objArr[i3]);
            }
        }
    }

    public final void A(jo0 jo0Var, Bundle bundle, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.A(jo0Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void B(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.B(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void C(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.C(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void D(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.D(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final ClipboardManager E() {
        ClipboardManager clipboardManager = (ClipboardManager) this.j;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.i).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.j = clipboardManager2;
        return clipboardManager2;
    }

    public final InputMethodManager F() {
        return (InputMethodManager) ((d51) this.j).getValue();
    }

    public final ze1 G() {
        return (ze1) ((lu1) this.j).getValue();
    }

    public final AutofillManager H() {
        AutofillManager autofillManager = (AutofillManager) this.j;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.i).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.j = autofillManager2;
            return autofillManager2;
        }
        li1.g("Could not locate AutofillManager from context");
        return null;
    }

    public void I(AttributeSet attributeSet, int i) {
        int resourceId;
        switch (this.h) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.i;
                eg egVarW = eg.w(absSeekBar.getContext(), attributeSet, k, i);
                Drawable drawableL = egVarW.l(0);
                if (drawableL != null) {
                    if (drawableL instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableL;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableP = P(animationDrawable.getFrame(i2), true);
                            drawableP.setLevel(10000);
                            animationDrawable2.addFrame(drawableP, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableL = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableL);
                }
                Drawable drawableL2 = egVarW.l(1);
                if (drawableL2 != null) {
                    absSeekBar.setProgressDrawable(P(drawableL2, false));
                }
                egVarW.A();
                return;
            default:
                ImageView imageView = (ImageView) this.i;
                Context context = imageView.getContext();
                int[] iArr = f52.f;
                eg egVarW2 = eg.w(context, attributeSet, iArr, i);
                TypedArray typedArray = (TypedArray) egVarW2.i;
                Context context2 = imageView.getContext();
                TypedArray typedArray2 = (TypedArray) egVarW2.i;
                WeakHashMap weakHashMap = t43.a;
                r43.b(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
                try {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = df.a(imageView.getContext(), resourceId)) != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (drawable != null) {
                        int i3 = zd0.a;
                    }
                    if (typedArray.hasValue(2)) {
                        imageView.setImageTintList(egVarW2.h(2));
                    }
                    if (typedArray.hasValue(3)) {
                        imageView.setImageTintMode(zd0.b(typedArray.getInt(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                    egVarW2.A();
                }
        }
    }

    public final AutofillId J(long j) {
        return ((ContentCaptureSession) this.j).newAutofillId(((View) this.i).getAutofillId(), j);
    }

    public final void K(View view, int i, boolean z) {
        H().notifyViewVisibilityChanged(view, i, z);
    }

    public final void L(f3 f3Var) {
        wk wkVar = (wk) this.i;
        ((ActionMode.Callback) wkVar.i).onDestroyActionMode(wkVar.r(f3Var));
        te teVar = (te) this.j;
        if (teVar.u != null) {
            teVar.l.getDecorView().removeCallbacks(teVar.v);
        }
        if (teVar.t != null) {
            l53 l53Var = teVar.w;
            if (l53Var != null) {
                l53Var.b();
            }
            l53 l53VarA = t43.a(teVar.t);
            l53VarA.a(0.0f);
            teVar.w = l53VarA;
            l53VarA.d(new ne(this, (byte) 2));
        }
        teVar.s = null;
        ViewGroup viewGroup = teVar.z;
        WeakHashMap weakHashMap = t43.a;
        viewGroup.requestApplyInsets();
    }

    public final boolean M(f3 f3Var, if1 if1Var) {
        ViewGroup viewGroup = ((te) this.j).z;
        WeakHashMap weakHashMap = t43.a;
        viewGroup.requestApplyInsets();
        wk wkVar = (wk) this.i;
        ActionMode.Callback callback = (ActionMode.Callback) wkVar.i;
        vp2 vp2VarR = wkVar.r(f3Var);
        bj2 bj2Var = (bj2) wkVar.l;
        Menu zf1Var = (Menu) bj2Var.get(if1Var);
        if (zf1Var == null) {
            zf1Var = new zf1((Context) wkVar.j, if1Var);
            bj2Var.put(if1Var, zf1Var);
        }
        return callback.onPrepareActionMode(vp2VarR, zf1Var);
    }

    public final void N(fn0 fn0Var) {
        zm zmVar = (zm) this.j;
        xl1 xl1Var = (xl1) this.i;
        int i = fn0Var.b;
        if (i == 0) {
            zmVar.execute(new z2(xl1Var, fn0Var.a, (byte) 3, false));
        } else {
            zmVar.execute(new lq(xl1Var, i));
        }
    }

    public final void O() {
        dn2 dn2Var = (dn2) this.i;
        id idVar = null;
        if (dn2Var != null) {
            dn2Var.a(null);
        }
        this.j = new dd(aa3.Q, Float.valueOf(0.0f), idVar, 60);
    }

    public final Drawable P(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.j) == null) {
                this.j = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = P(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
        }
        return layerDrawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(float f, e90 e90Var, x20 x20Var) {
        if (f <= e90Var.A(1.0f)) {
            return;
        }
        uk2 uk2VarN = y02.n();
        m10 m10Var = null;
        Object[] objArr = 0;
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            float fFloatValue = ((Number) ((dd) this.j).i.getValue()).floatValue();
            dn2 dn2Var = (dn2) this.i;
            if (dn2Var != null) {
                dn2Var.a(null);
            }
            dd ddVar = (dd) this.j;
            if (ddVar.m) {
                this.j = ie1.k(ddVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.j = new dd(aa3.Q, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.i = ie1.p(x20Var, null, new qj(this, m10Var, (byte) 5), 3);
        } finally {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        }
    }

    public final void R(SQLiteConnection sQLiteConnection, Object obj) {
        sQLiteConnection.getClass();
        try {
            ((es) this.i).Q(sQLiteConnection, obj);
        } catch (SQLException e) {
            String message = e.getMessage();
            if (message == null) {
                throw e;
            }
            if (!co2.Q(message, "unique", true) && !co2.Q(message, "2067", false) && !co2.Q(message, "1555", false)) {
                throw e;
            }
            ou ouVar = (ou) this.j;
            if (obj != null) {
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(ouVar.s());
                try {
                    ouVar.m(sQLiteStatementPrepare, obj);
                    sQLiteStatementPrepare.step();
                    ie1.j(sQLiteStatementPrepare, null);
                    r02.u(sQLiteConnection);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ie1.j(sQLiteStatementPrepare, th);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // defpackage.of0
    public final Object a() {
        return (n23) this.i;
    }

    @Override // defpackage.rf2
    public final int b(int i) {
        TextPaint textPaint = (TextPaint) this.j;
        CharSequence charSequence = (CharSequence) this.i;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // defpackage.cp2
    public final void c(bp2 bp2Var) {
        bj1 bj1Var = (bj1) this.j;
        bj1Var.a();
        gj1 gj1Var = (gj1) bp2Var.i;
        Object[] objArr = gj1Var.b;
        long[] jArr = gj1Var.c;
        int i = gj1Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((r61) this.i).b(obj);
            int iD = bj1Var.d(objB);
            int i3 = iD >= 0 ? bj1Var.c[iD] : 0;
            if (i3 == 7) {
                bp2Var.remove(obj);
            } else {
                bj1Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.sq
    public final void cancel() {
        if (((ji) this.j).compareAndSet(1, 1)) {
            return;
        }
        ((zi) this.i).a();
    }

    @Override // defpackage.as1
    public final List d(Integer num) {
        List listD = ((as1) this.i).d(null);
        ik2 ik2Var = (ik2) this.j;
        int i = ik2Var.v;
        return i < 0 ? listD : dv.I0(cu.t(ik2Var, num, i, Integer.valueOf(ik2Var.D(ik2Var.b, i))), listD);
    }

    @Override // defpackage.rf2
    public final int e(int i) {
        TextPaint textPaint = (TextPaint) this.j;
        CharSequence charSequence = (CharSequence) this.i;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.as1
    public final boolean f() {
        return ((as1) this.i).f();
    }

    @Override // defpackage.of0
    public final boolean g(CharSequence charSequence, int i, int i2, x03 x03Var) {
        if ((x03Var.c & 4) > 0) {
            return true;
        }
        if (((n23) this.i) == null) {
            this.i = new n23(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((yy) this.j).getClass();
        ((n23) this.i).setSpan(new y03(x03Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.cp2
    public final boolean h(Object obj, Object obj2) {
        r61 r61Var = (r61) this.i;
        return uz0.g(r61Var.b(obj), r61Var.b(obj2));
    }

    @Override // defpackage.rf2
    public final int i(int i) {
        TextPaint textPaint = (TextPaint) this.j;
        CharSequence charSequence = (CharSequence) this.i;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.j).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // defpackage.ci1
    public final Comparable j(q22 q22Var) {
        vc2 vc2VarK = (vc2) this.i;
        if (vc2VarK == null) {
            vc2VarK = ((fy1) this.j).h().k();
        }
        return (Comparable) vc2VarK.get();
    }

    @Override // defpackage.rf2
    public final int k(int i) {
        TextPaint textPaint = (TextPaint) this.j;
        CharSequence charSequence = (CharSequence) this.i;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.j).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    public final boolean l(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((ix0) this.j).i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (y02.k(((b12) obj).a, j)) {
                break;
            }
            i++;
        }
        b12 b12Var = (b12) obj;
        if (b12Var != null) {
            return b12Var.h;
        }
        return false;
    }

    public final void m(un1 un1Var) {
        if (((ConcurrentHashMap.KeySetView) this.i).add(un1Var)) {
            Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
            while (it.hasNext()) {
                ((oi1) it.next()).a.add(un1Var);
            }
        }
    }

    public final vv2 n(List list) {
        we0 we0Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            we0Var = null;
            while (i < size) {
                try {
                    we0 we0Var2 = (we0) list.get(i);
                    try {
                        we0Var2.a((xe0) this.j);
                        i++;
                        we0Var = we0Var2;
                    } catch (Exception e2) {
                        e = e2;
                        we0Var = we0Var2;
                        StringBuilder sb = new StringBuilder();
                        int iC = ((xe0) this.j).a.c();
                        qw2 qw2VarC = ((xe0) this.j).c();
                        xe0 xe0Var = (xe0) this.j;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iC + ", composition=" + qw2VarC + ", selection=" + qw2.h(m02.a(xe0Var.b, xe0Var.c)) + "):");
                        sb.append('\n');
                        dv.D0(list, sb, new p(we0Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            xe0 xe0Var2 = (xe0) this.j;
            xe0Var2.getClass();
            od odVar = new od(xe0Var2.a.toString());
            xe0 xe0Var3 = (xe0) this.j;
            long jA = m02.a(xe0Var3.b, xe0Var3.c);
            qw2 qw2Var = qw2.g(((vv2) this.i).b) ? null : new qw2(jA);
            vv2 vv2Var = new vv2(odVar, qw2Var != null ? qw2Var.a : m02.a(qw2.e(jA), qw2.f(jA)), ((xe0) this.j).c());
            this.i = vv2Var;
            return vv2Var;
        } catch (Exception e4) {
            we0Var = null;
            e = e4;
        }
    }

    public final void o() {
        ImageView imageView = (ImageView) this.i;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i = zd0.a;
            wx2 wx2Var = (wx2) this.j;
            if (wx2Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = ve.b;
                x82.i(drawable, wx2Var, drawableState);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        Object[] objArr;
        uj1 uj1Var = (uj1) this.i;
        Arrays.sort(uj1Var.h, 0, uj1Var.j, mm0.k);
        int i = uj1Var.j;
        l41[] l41VarArr = (l41[]) this.j;
        if (l41VarArr == null || l41VarArr.length < i) {
            objArr = l41VarArr;
            objArr = new l41[Math.max(16, i)];
        }
        objArr = l41VarArr;
        this.j = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uj1Var.h[i2];
        }
        uj1Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.j = objArr;
                return;
            }
            l41 l41Var = objArr[i];
            l41Var.getClass();
            if (l41Var.S) {
                q(l41Var);
            }
            objArr[i] = 0;
        }
    }

    public final void r(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.r(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void s(jo0 jo0Var, boolean z) {
        yo0 yo0Var = (yo0) this.i;
        MainActivity mainActivity = yo0Var.w.m;
        jo0 jo0Var2 = yo0Var.y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.s(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void t(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.t(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.dy0
    public final ay0 toInstant() {
        throw new by0(((String) this.i) + " when parsing an Instant from \"" + tz0.L(64, (String) this.j) + '\"');
    }

    public final String toString() {
        int iLastIndexOf;
        switch (this.h) {
            case 21:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                e91 e91Var = (e91) this.i;
                String simpleName = e91Var.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = e91Var.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(iLastIndexOf + 1);
                }
                sb.append(simpleName);
                sb.append('{');
                sb.append(Integer.toHexString(System.identityHashCode(e91Var)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void u(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.u(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void v(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.v(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void w(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.w(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void x(jo0 jo0Var, boolean z) {
        yo0 yo0Var = (yo0) this.i;
        MainActivity mainActivity = yo0Var.w.m;
        jo0 jo0Var2 = yo0Var.y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.x(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void y(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.y(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public final void z(jo0 jo0Var, boolean z) {
        jo0 jo0Var2 = ((yo0) this.i).y;
        if (jo0Var2 != null) {
            jo0Var2.l().o.z(jo0Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                li1.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ ix0(Object obj, Object obj2, byte b) {
        this.h = b;
        this.j = obj;
        this.i = obj2;
    }

    public /* synthetic */ ix0(Object obj, Object obj2, byte b, boolean z) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    public /* synthetic */ ix0(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    public ix0(yo0 yo0Var) {
        this.h = (byte) 13;
        this.i = yo0Var;
        this.j = new CopyOnWriteArrayList();
    }

    public ix0(l41 l41Var, ze1 ze1Var) {
        this.h = (byte) 18;
        this.i = l41Var;
        this.j = rz1.x(ze1Var);
    }

    public ix0(zi ziVar) {
        this.h = (byte) 26;
        this.i = ziVar;
        this.j = new ji(0);
    }

    public ix0(e91 e91Var, g53 g53Var) {
        this.h = (byte) 21;
        this.i = e91Var;
        g53Var.getClass();
        c30 c30Var = c30.b;
        c30Var.getClass();
        wk wkVar = new wk(g53Var, mb1.c, c30Var);
        du duVarA = z72.a(mb1.class);
        String strB = duVarA.b();
        if (strB != null) {
            this.j = (mb1) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            wg.m("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public ix0(View view) {
        this.h = (byte) 0;
        this.i = view;
        this.j = vs.N(g81.i, new o9((Object) this, (byte) 16));
    }

    public ix0(long j, fy1 fy1Var) {
        this.h = (byte) 7;
        this.i = null;
        Math.toIntExact(j);
        this.j = fy1Var;
    }

    public ix0(hn hnVar) {
        this.h = (byte) 5;
        this.j = hnVar;
    }

    public ix0(r61 r61Var) {
        this.h = (byte) 19;
        this.i = r61Var;
        bj1 bj1Var = ip1.a;
        this.j = new bj1();
    }

    public ix0(ArrayList arrayList, ArrayList arrayList2) {
        this.h = (byte) 14;
        int size = arrayList.size();
        this.i = new int[size];
        this.j = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.i)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.j)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public ix0(int i, int i2) {
        this.h = (byte) 14;
        this.i = new int[]{i, i2};
        this.j = new float[]{0.0f, 1.0f};
    }

    public ix0(int i, int i2, int i3) {
        this.h = (byte) 14;
        this.i = new int[]{i, i2, i3};
        this.j = new float[]{0.0f, 0.5f, 1.0f};
    }
}
