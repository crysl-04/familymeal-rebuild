package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 extends lm1 {
    public final qo0 f;
    public boolean g;

    public fq1(qo0 qo0Var, gq1 gq1Var) {
        super(gq1Var, qo0Var.b);
        this.f = qo0Var;
        this.g = true;
    }

    @Override // defpackage.lm1
    public final void a() {
        qo0 qo0Var = this.f;
        switch (qo0Var.d) {
            case 0:
                yo0 yo0Var = (yo0) qo0Var.e;
                if (yo0.J(3)) {
                    Objects.toString(yo0Var);
                }
                yo0Var.d();
                break;
        }
    }

    @Override // defpackage.lm1
    public final void b() {
        qo0 qo0Var = this.f;
        switch (qo0Var.d) {
            case 0:
                yo0 yo0Var = (yo0) qo0Var.e;
                if (yo0.J(3)) {
                    Objects.toString(yo0Var);
                }
                qo0 qo0Var2 = yo0Var.j;
                ArrayList arrayList = yo0Var.n;
                yo0Var.i = true;
                yo0Var.A(true);
                int i = 0;
                yo0Var.i = false;
                if (yo0Var.h == null) {
                    if (qo0Var2.b) {
                        yo0Var.R();
                        return;
                    } else {
                        yo0Var.g.b().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(yo0.F(yo0Var.h));
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (obj != null) {
                            li1.c();
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = yo0Var.h.a;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    jo0 jo0Var = ((hp0) obj2).b;
                    if (jo0Var != null) {
                        jo0Var.t = false;
                    }
                }
                for (z70 z70Var : yo0Var.g(new ArrayList(Collections.singletonList(yo0Var.h)), 0, 1)) {
                    ArrayList arrayList3 = z70Var.c;
                    z70Var.c(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        ((wm2) obj3).getClass();
                        iv.q0(null, arrayList4);
                    }
                    List listR0 = dv.R0(dv.U0(arrayList4));
                    int size4 = listR0.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        ((vm2) listR0.get(i5)).a(z70Var.a);
                    }
                    int size5 = arrayList3.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        ((wm2) arrayList3.get(i6)).getClass();
                    }
                    List listR1 = dv.R0(arrayList3);
                    if (listR1.size() > 0) {
                        ((wm2) listR1.get(0)).getClass();
                        throw null;
                    }
                }
                ArrayList arrayList5 = yo0Var.h.a;
                int size6 = arrayList5.size();
                while (i < size6) {
                    Object obj4 = arrayList5.get(i);
                    i++;
                    jo0 jo0Var2 = ((hp0) obj4).b;
                    if (jo0Var2 != null && jo0Var2.M == null) {
                        yo0Var.h(jo0Var2).j();
                    }
                }
                yo0Var.h = null;
                yo0Var.f0();
                if (yo0.J(3)) {
                    boolean z = qo0Var2.b;
                    yo0Var.toString();
                    return;
                }
                return;
            case 1:
                ((kl1) qo0Var.e).b();
                return;
            default:
                ((z7) qo0Var.e).h(qo0Var);
                return;
        }
    }

    @Override // defpackage.lm1
    public final void c(jm1 jm1Var) {
        cj cjVar = new cj(jm1Var);
        qo0 qo0Var = this.f;
        switch (qo0Var.d) {
            case 0:
                yo0 yo0Var = (yo0) qo0Var.e;
                if (yo0.J(2)) {
                    Objects.toString(yo0Var);
                }
                if (yo0Var.h != null) {
                    for (z70 z70Var : yo0Var.g(new ArrayList(Collections.singletonList(yo0Var.h)), 0, 1)) {
                        z70Var.getClass();
                        ArrayList arrayList = z70Var.c;
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
                            ((vm2) listR0.get(i2)).b(cjVar, z70Var.a);
                        }
                    }
                    Iterator it = yo0Var.n.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        li1.c();
                    }
                }
                break;
        }
    }

    @Override // defpackage.lm1
    public final void d(jm1 jm1Var) {
        jm1Var.getClass();
        new cj(jm1Var);
        qo0 qo0Var = this.f;
        switch (qo0Var.d) {
            case 0:
                yo0 yo0Var = (yo0) qo0Var.e;
                if (yo0.J(3)) {
                    Objects.toString(yo0Var);
                }
                yo0Var.x();
                yo0Var.y(new xo0(yo0Var), false);
                break;
        }
    }

    public final void g(boolean z) {
        this.g = z;
        f(z && this.f.b);
    }
}
