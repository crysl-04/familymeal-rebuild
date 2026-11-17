package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public qo0(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    public final void d(boolean z) {
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fq1 fq1Var = (fq1) obj;
            fq1Var.f(fq1Var.g && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo0(Object obj, byte b) {
        this(false);
        this.d = b;
        this.e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qo0(z7 z7Var) {
        this(true);
        this.d = (byte) 2;
        this.e = z7Var;
    }

    public final void a() {
    }

    public final void b(cj cjVar) {
    }

    public final void c(cj cjVar) {
    }
}
