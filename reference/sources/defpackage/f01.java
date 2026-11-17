package defpackage;

import com.familymeal.app.data.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public final AppDatabase_Impl a;
    public final p03 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final AtomicInteger e;
    public final jw0 f;
    public final jw0 g;
    public final Object h;

    public f01(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = appDatabase_Impl;
        p03 p03Var = new p03(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.j, new i(1, this, f01.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 1));
        this.b = p03Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new AtomicInteger(0);
        this.f = new jw0(this, (byte) 4);
        this.g = new jw0(this, (byte) 5);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.h = new Object();
        p03Var.k = new o9((Object) this, (byte) 17);
    }

    public final void a() {
        if (((AtomicBoolean) this.a.g.k).get()) {
            return;
        }
        this.b.c(this.f, this.g);
    }

    public final Object b(mq2 mq2Var) {
        y02.v(this.a);
        Object objF = this.b.f(mq2Var);
        return objF == y20.h ? objF : j23.a;
    }
}
