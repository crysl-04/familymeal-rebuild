package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z70 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public z70(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            throw null;
        }
        throw null;
    }

    public final void b() {
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            d();
            c(this.b);
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((wm2) obj).getClass();
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                wm2 wm2Var = (wm2) obj2;
                if (yo0.J(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(wm2Var);
                }
                wm2Var.a(this.a);
            }
            ArrayList arrayList2 = new ArrayList(this.b);
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ((wm2) obj3).getClass();
            }
            int size4 = arrayList2.size();
            while (i < size4) {
                Object obj4 = arrayList2.get(i);
                i++;
                wm2 wm2Var2 = (wm2) obj4;
                if (yo0.J(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(wm2Var2);
                }
                wm2Var2.a(this.a);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wm2) obj).getClass();
            iv.q0(null, arrayList2);
        }
        List listR0 = dv.R0(dv.U0(arrayList2));
        int size2 = listR0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            vm2 vm2Var = (vm2) listR0.get(i2);
            vm2Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!vm2Var.a) {
                vm2Var.c(viewGroup);
            }
            vm2Var.a = true;
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wm2) obj).getClass();
        }
    }
}
