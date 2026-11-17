package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import defpackage.aa1;
import defpackage.af2;
import defpackage.av;
import defpackage.bb1;
import defpackage.bf2;
import defpackage.ee;
import defpackage.eg;
import defpackage.f52;
import defpackage.lf;
import defpackage.o30;
import defpackage.rp2;
import defpackage.se2;
import defpackage.t43;
import defpackage.te2;
import defpackage.ue2;
import defpackage.ve2;
import defpackage.we2;
import defpackage.xe2;
import defpackage.ye2;
import defpackage.ze2;
import java.util.WeakHashMap;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends aa1 implements av {
    public static final /* synthetic */ int n0 = 0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final View E;
    public bf2 F;
    public final Rect G;
    public final Rect H;
    public final int[] I;
    public final int[] J;
    public final ImageView K;
    public final Drawable L;
    public final int M;
    public final int N;
    public final Intent O;
    public final Intent P;
    public final CharSequence Q;
    public View.OnFocusChangeListener R;
    public View.OnClickListener S;
    public boolean T;
    public boolean U;
    public o30 V;
    public boolean W;
    public CharSequence a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public CharSequence f0;
    public boolean g0;
    public int h0;
    public SearchableInfo i0;
    public Bundle j0;
    public final te2 k0;
    public final te2 l0;
    public final WeakHashMap m0;
    public final SearchAutoComplete w;
    public final View x;
    public final View y;
    public final View z;

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new int[2];
        this.J = new int[2];
        this.k0 = new te2(this, (byte) 0);
        byte b = 1;
        this.l0 = new te2(this, b);
        this.m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        we2 we2Var = new we2(this);
        lf lfVar = new lf(this, b);
        bb1 bb1Var = new bb1(this, (byte) 1);
        se2 se2Var = new se2(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.u, i, 0);
        eg egVar = new eg(context, typedArrayObtainStyledAttributes);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.x = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.y = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.z = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.A = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.K = imageView5;
        Drawable drawableK = egVar.k(10);
        WeakHashMap weakHashMap = t43.a;
        viewFindViewById.setBackground(drawableK);
        viewFindViewById2.setBackground(egVar.k(14));
        imageView.setImageDrawable(egVar.k(13));
        imageView2.setImageDrawable(egVar.k(7));
        imageView3.setImageDrawable(egVar.k(4));
        imageView4.setImageDrawable(egVar.k(16));
        imageView5.setImageDrawable(egVar.k(13));
        this.L = egVar.k(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.M = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.N = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(se2Var);
        searchAutoComplete.setOnEditorActionListener(we2Var);
        searchAutoComplete.setOnItemClickListener(lfVar);
        searchAutoComplete.setOnItemSelectedListener(bb1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ue2(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.Q = typedArrayObtainStyledAttributes.getText(6);
        this.a0 = typedArrayObtainStyledAttributes.getText(11);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        egVar.A();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.O = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.E = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ve2(this));
        }
        u(this.T);
        r();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.w;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.c0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.w;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.c0 = false;
    }

    public int getImeOptions() {
        return this.w.getImeOptions();
    }

    public int getInputType() {
        return this.w.getInputType();
    }

    public int getMaxWidth() {
        return this.d0;
    }

    public CharSequence getQuery() {
        return this.w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Q : getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.N;
    }

    public int getSuggestionRowLayout() {
        return this.M;
    }

    public o30 getSuggestionsAdapter() {
        return this.V;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.w;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.T) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i) {
        String strG;
        Cursor cursor = this.V.j;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentI = null;
            try {
                try {
                    int i2 = rp2.F;
                    String strG2 = rp2.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strG2 == null) {
                        strG2 = this.i0.getSuggestIntentAction();
                    }
                    if (strG2 == null) {
                        strG2 = "android.intent.action.SEARCH";
                    }
                    String strG3 = rp2.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strG3 == null) {
                        strG3 = this.i0.getSuggestIntentData();
                    }
                    if (strG3 != null && (strG = rp2.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strG3 = strG3 + "/" + Uri.encode(strG);
                    }
                    intentI = i(strG2, strG3 == null ? null : Uri.parse(strG3), rp2.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), rp2.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentI != null) {
                try {
                    getContext().startActivity(intentI);
                } catch (RuntimeException unused3) {
                    intentI.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.w;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i) {
        Editable text = this.w.getText();
        Cursor cursor = this.V.j;
        if (cursor != null) {
            if (!cursor.moveToPosition(i)) {
                setQuery(text);
                return;
            }
            String strC = this.V.c(cursor);
            if (strC != null) {
                setQuery(strC);
            } else {
                setQuery(text);
            }
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.w;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.i0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // defpackage.av
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.w;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f0 = "";
        clearFocus();
        u(true);
        searchAutoComplete.setImeOptions(this.h0);
        this.g0 = false;
    }

    @Override // defpackage.av
    public final void onActionViewExpanded() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        SearchAutoComplete searchAutoComplete = this.w;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.h0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.aa1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.w;
            int[] iArr = this.I;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.J;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.G;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.H;
            rect2.set(i7, 0, i8, i9);
            bf2 bf2Var = this.F;
            if (bf2Var == null) {
                bf2 bf2Var2 = new bf2(rect2, rect, searchAutoComplete);
                this.F = bf2Var2;
                setTouchDelegate(bf2Var2);
            } else {
                bf2Var.b.set(rect2);
                Rect rect3 = bf2Var.d;
                rect3.set(rect2);
                int i10 = -bf2Var.e;
                rect3.inset(i10, i10);
                bf2Var.c.set(rect);
            }
        }
    }

    @Override // defpackage.aa1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.U) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.d0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.d0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof af2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        af2 af2Var = (af2) parcelable;
        super.onRestoreInstanceState(af2Var.h);
        u(af2Var.j);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        af2 af2Var = new af2(super.onSaveInstanceState());
        af2Var.j = this.U;
        return af2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.k0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.w.getText());
        int i = (!zIsEmpty || (this.T && !this.g0)) ? 0 : 8;
        ImageView imageView = this.C;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.T;
        SearchAutoComplete searchAutoComplete = this.w;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.L) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.c0 || !isFocusable()) {
            return false;
        }
        if (this.U) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.w.requestFocus(i, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.z.setVisibility(((this.W || this.e0) && !this.U && (this.B.getVisibility() == 0 || this.D.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.w;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        u(z);
        r();
    }

    public void setImeOptions(int i) {
        this.w.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.w.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.d0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.a0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.b0 = z;
        o30 o30Var = this.V;
        if (o30Var instanceof rp2) {
            ((rp2) o30Var).x = z ? (byte) 2 : (byte) 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.i0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.w;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.i0.getImeOptions());
            int inputType = this.i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            o30 o30Var = this.V;
            if (o30Var != null) {
                o30Var.b(null);
            }
            if (this.i0.getSuggestAuthority() != null) {
                rp2 rp2Var = new rp2(getContext(), this, this.i0, this.m0);
                this.V = rp2Var;
                searchAutoComplete.setAdapter(rp2Var);
                ((rp2) this.V).x = this.b0 ? (byte) 2 : (byte) 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.i0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.O;
            } else if (this.i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.P;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.e0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.U);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.W = z;
        u(this.U);
    }

    public void setSuggestionsAdapter(o30 o30Var) {
        this.V = o30Var;
        this.w.setAdapter(o30Var);
    }

    public final void t(boolean z) {
        boolean z2 = this.W;
        this.B.setVisibility((!z2 || !(z2 || this.e0) || this.U || !hasFocus() || (!z && this.e0)) ? 8 : 0);
    }

    public final void u(boolean z) {
        this.U = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.w.getText());
        this.A.setVisibility(i2);
        t(!zIsEmpty);
        this.x.setVisibility(z ? 8 : 0);
        ImageView imageView = this.K;
        imageView.setVisibility((imageView.getDrawable() == null || this.T) ? 8 : 0);
        p();
        if (this.e0 && !this.U && zIsEmpty) {
            this.B.setVisibility(8);
            i = 0;
        }
        this.D.setVisibility(i);
        s();
    }

    /* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
    public static class SearchAutoComplete extends ee {
        public int k;
        public SearchView l;
        public boolean m;
        public final c n;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = new c(this);
            this.k = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.k <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.ee, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.m) {
                c cVar = this.n;
                removeCallbacks(cVar);
                post(cVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.l;
            searchView.u(searchView.U);
            searchView.post(searchView.k0);
            SearchAutoComplete searchAutoComplete = searchView.w;
            if (searchAutoComplete.hasFocus()) {
                searchAutoComplete.refreshAutoCompleteResults();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.l.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.l.hasFocus() && getVisibility() == 0) {
                this.m = true;
                Context context = getContext();
                int i = SearchView.n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    setInputMethodMode(1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.n;
            if (!z) {
                this.m = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.m = true;
                    return;
                }
                this.m = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.l = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.k = i;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(xe2 xe2Var) {
    }

    public void setOnQueryTextListener(ye2 ye2Var) {
    }

    public void setOnSuggestionListener(ze2 ze2Var) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
