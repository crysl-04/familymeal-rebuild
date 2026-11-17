package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q81 {
    public final View a;
    public final ix0 b;
    public p81 e;
    public kv2 f;
    public v43 g;
    public Rect l;
    public final l81 m;
    public vp0 c = new vv0(23);
    public vp0 d = new vv0(24);
    public vv2 h = new vv2("", qw2.b, 4);
    public nu0 i = nu0.g;
    public final ArrayList j = new ArrayList();
    public final d51 k = vs.N(g81.i, new o9((Object) this, (byte) 21));

    public q81(View view, z8 z8Var, ix0 ix0Var) {
        this.a = view;
        this.b = ix0Var;
        this.m = new l81(z8Var, ix0Var);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba A[PHI: r15
  0x00ba: PHI (r15v1 int) = (r15v0 int), (r15v5 int) binds: [B:35:0x00a1, B:45:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    public final o72 a(EditorInfo editorInfo) {
        int i;
        int i2;
        vv2 vv2Var = this.h;
        String str = vv2Var.a.i;
        long j = vv2Var.b;
        nu0 nu0Var = this.i;
        int i3 = nu0Var.e;
        int i4 = nu0Var.d;
        boolean z = nu0Var.a;
        int i5 = 3;
        if (i3 == 1) {
            i = !z ? 0 : 6;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                li1.g("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        ub1 ub1Var = nu0Var.f;
        if (uz0.g(ub1Var, ub1.j)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(ev.o0(ub1Var, 10));
            Iterator it = ub1Var.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((tb1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 != 4) {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    li1.g("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        } else {
            i2 = i5;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (nu0Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i6 = nu0Var.b;
            if (i6 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i6 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i6 == 3) {
                i2 |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                editorInfo.inputType = i2;
            }
            if (nu0Var.c) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = i2 | 2097152;
            }
        }
        int i7 = qw2.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        ys.c0(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!so2.a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                ye0.b(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                ye0.b(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(lt.Q(v8.l(), v8.x(), v8.t(), v8.v(), v8.y(), v8.z(), v8.A()));
            editorInfo.setSupportedHandwritingGesturePreviews(gi.c0(new Class[]{v8.l(), v8.x(), v8.t(), v8.v()}));
        }
        m81 m81Var = n81.a;
        if (if0.d()) {
            if0.a().g(editorInfo);
        }
        o72 o72Var = new o72(this.h, new g2((Object) this, (byte) 25), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(o72Var));
        return o72Var;
    }
}
