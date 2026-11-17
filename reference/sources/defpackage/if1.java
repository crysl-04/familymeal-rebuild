package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class if1 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public gf1 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public lf1 v;
    public boolean x;
    public boolean l = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public if1(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.d = z;
    }

    public final lf1 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            wg.m("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        lf1 lf1Var = new lf1(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((lf1) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, lf1Var);
                p(true);
                return lf1Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, lf1Var);
        p(true);
        return lf1Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            lf1 lf1VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            lf1VarA.setIcon(resolveInfo.loadIcon(packageManager));
            lf1VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = lf1VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        lf1 lf1VarA = a(i, i2, i3, charSequence);
        wo2 wo2Var = new wo2(this.a, this, lf1VarA);
        lf1VarA.o = wo2Var;
        wo2Var.setHeaderTitle(lf1VarA.e);
        return wo2Var;
    }

    public final void b(wf1 wf1Var, Context context) {
        this.u.add(new WeakReference(wf1Var));
        wf1Var.i(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            wf1 wf1Var = (wf1) weakReference.get();
            if (wf1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wf1Var.c(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        lf1 lf1Var = this.v;
        if (lf1Var != null) {
            d(lf1Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(lf1 lf1Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zB = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == lf1Var) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                wf1 wf1Var = (wf1) weakReference.get();
                if (wf1Var != null) {
                    zB = wf1Var.b(lf1Var);
                    if (zB) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zB) {
                this.v = null;
            }
        }
        return zB;
    }

    public boolean e(if1 if1Var, MenuItem menuItem) {
        gf1 gf1Var = this.e;
        return gf1Var != null && gf1Var.b(if1Var, menuItem);
    }

    public boolean f(lf1 lf1Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            wf1 wf1Var = (wf1) weakReference.get();
            if (wf1Var != null) {
                zF = wf1Var.f(lf1Var);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zF) {
            this.v = lf1Var;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lf1 lf1Var = (lf1) arrayList.get(i2);
            if (lf1Var.a == i) {
                return lf1Var;
            }
            if (lf1Var.hasSubMenu() && (menuItemFindItem = lf1Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final lf1 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (lf1) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            lf1 lf1Var = (lf1) arrayList.get(i2);
            char c = zN ? lf1Var.j : lf1Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return lf1Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                lf1 lf1Var = (lf1) arrayList2.get(i3);
                if (lf1Var.hasSubMenu()) {
                    lf1Var.o.h(arrayList, i, keyEvent);
                }
                if (zN) {
                    c = lf1Var.j;
                    i2 = lf1Var.k;
                } else {
                    c = lf1Var.h;
                    i2 = lf1Var.i;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && lf1Var.isEnabled()) {
                        arrayList.add(lf1Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lf1) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zK = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                wf1 wf1Var = (wf1) weakReference.get();
                if (wf1Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK |= wf1Var.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zK) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    lf1 lf1Var = (lf1) arrayListL.get(i);
                    if ((lf1Var.x & 32) == 32) {
                        arrayList.add(lf1Var);
                    } else {
                        arrayList2.add(lf1Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            lf1 lf1Var = (lf1) arrayList2.get(i);
            if (lf1Var.isVisible()) {
                arrayList.add(lf1Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            wf1 wf1Var = (wf1) weakReference.get();
            if (wf1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wf1Var.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        lf1 lf1VarG = g(i, keyEvent);
        boolean zQ = lf1VarG != null ? q(lf1VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x009c A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, wf1 wf1Var, int i) {
        mf1 mf1Var;
        boolean zExpandActionView;
        mf1 mf1Var2;
        boolean z;
        wo2 wo2Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        wf1 wf1Var2;
        lf1 lf1Var = (lf1) menuItem;
        boolean zJ = false;
        if (lf1Var == null || !lf1Var.isEnabled()) {
            return false;
        }
        if1 if1Var = lf1Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = lf1Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(lf1Var)) && !if1Var.e(if1Var, lf1Var)) {
            Intent intent = lf1Var.g;
            if (intent != null) {
                try {
                    if1Var.a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    mf1Var = lf1Var.A;
                    if (mf1Var == null) {
                    }
                    zExpandActionView = false;
                    mf1Var2 = lf1Var.A;
                    if (mf1Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (lf1Var.e()) {
                        zExpandActionView |= lf1Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (lf1Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!lf1Var.hasSubMenu()) {
                            wo2 wo2Var2 = new wo2(this.a, this, lf1Var);
                            lf1Var.o = wo2Var2;
                            wo2Var2.setHeaderTitle(lf1Var.e);
                        }
                        wo2Var = lf1Var.o;
                        if (z) {
                            mf1Var2.a.onPrepareSubMenu(wo2Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (wf1Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                wf1Var2 = (wf1) weakReference.get();
                                if (wf1Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = wf1Var2.j(wo2Var);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!lf1Var.hasSubMenu()) {
                            wo2 wo2Var3 = new wo2(this.a, this, lf1Var);
                            lf1Var.o = wo2Var3;
                            wo2Var3.setHeaderTitle(lf1Var.e);
                        }
                        wo2Var = lf1Var.o;
                        if (z) {
                            mf1Var2.a.onPrepareSubMenu(wo2Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zJ = wf1Var != null ? wf1Var.j(wo2Var) : false;
                            while (r8.hasNext()) {
                                wf1Var2 = (wf1) weakReference.get();
                                if (wf1Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = wf1Var2.j(wo2Var);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                mf1Var = lf1Var.A;
                if (mf1Var == null && mf1Var.a.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        mf1Var2 = lf1Var.A;
        if (mf1Var2 == null && mf1Var2.a.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (lf1Var.e()) {
            zExpandActionView |= lf1Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (lf1Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!lf1Var.hasSubMenu()) {
                wo2 wo2Var4 = new wo2(this.a, this, lf1Var);
                lf1Var.o = wo2Var4;
                wo2Var4.setHeaderTitle(lf1Var.e);
            }
            wo2Var = lf1Var.o;
            if (z) {
                mf1Var2.a.onPrepareSubMenu(wo2Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (wf1Var != null) {
                }
                while (r8.hasNext()) {
                    wf1Var2 = (wf1) weakReference.get();
                    if (wf1Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = wf1Var2.j(wo2Var);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(wf1 wf1Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            wf1 wf1Var2 = (wf1) weakReference.get();
            if (wf1Var2 == null || wf1Var2 == wf1Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((lf1) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((lf1) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((lf1) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((wo2) item.getSubMenu()).s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
                return;
            }
            menuItemFindItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lf1 lf1Var = (lf1) arrayList.get(i2);
            if (lf1Var.b == i) {
                lf1Var.x = (lf1Var.x & (-5)) | (z2 ? 4 : 0);
                lf1Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lf1 lf1Var = (lf1) arrayList.get(i2);
            if (lf1Var.b == i) {
                lf1Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            lf1 lf1Var = (lf1) arrayList.get(i2);
            if (lf1Var.b == i) {
                int i3 = lf1Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                lf1Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((wo2) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public if1 k() {
        return this;
    }
}
