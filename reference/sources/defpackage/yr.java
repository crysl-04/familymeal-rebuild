package defpackage;

import android.content.res.AssetManager;
import com.familymeal.app.data.db.AppDatabase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yr {
    public final AppDatabase a;
    public final AssetManager b;
    public final ok1 c;
    public final vr d;
    public final vr e;

    public yr(AppDatabase appDatabase, AssetManager assetManager) {
        appDatabase.getClass();
        this.a = appDatabase;
        this.b = assetManager;
        this.c = new ok1();
        this.d = new vr(es.x(appDatabase.m().a, new String[]{"ingredient"}, new vv0((byte) 0)), (byte) 0);
        this.e = new vr(es.x(appDatabase.q().a, new String[]{"recipe"}, new vw1((byte) 16)), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, n10 n10Var) {
        lr lrVar;
        if (n10Var instanceof lr) {
            lrVar = (lr) n10Var;
            int i = lrVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrVar.m = i - Integer.MIN_VALUE;
            } else {
                lrVar = new lr(this, n10Var);
            }
        } else {
            lrVar = new lr(this, n10Var);
        }
        Object obj = lrVar.k;
        int i2 = lrVar.m;
        if (i2 == 0) {
            m02.y(obj);
            m62 m62VarQ = this.a.q();
            lrVar.m = 1;
            Object objP = cu.P(lrVar, new ql(str, (byte) 23), m62VarQ.a, false, true);
            y20 y20Var = y20.h;
            if (objP == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        return ir.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[Catch: all -> 0x012c, TryCatch #4 {all -> 0x012c, blocks: (B:35:0x0083, B:38:0x008f, B:41:0x00a6, B:43:0x00b2, B:44:0x00c1, B:46:0x00d3, B:47:0x00eb), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: all -> 0x012c, LOOP:0: B:42:0x00b0->B:43:0x00b2, LOOP_END, TryCatch #4 {all -> 0x012c, blocks: (B:35:0x0083, B:38:0x008f, B:41:0x00a6, B:43:0x00b2, B:44:0x00c1, B:46:0x00d3, B:47:0x00eb), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3 A[Catch: all -> 0x012c, LOOP:1: B:45:0x00d1->B:46:0x00d3, LOOP_END, TryCatch #4 {all -> 0x012c, blocks: (B:35:0x0083, B:38:0x008f, B:41:0x00a6, B:43:0x00b2, B:44:0x00c1, B:46:0x00d3, B:47:0x00eb), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:64:0x0124, B:51:0x00f3, B:56:0x0101, B:58:0x010b, B:61:0x011b, B:62:0x0122), top: B:82:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:64:0x0124, B:51:0x00f3, B:56:0x0101, B:58:0x010b, B:61:0x011b, B:62:0x0122), top: B:82:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011b A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:64:0x0124, B:51:0x00f3, B:56:0x0101, B:58:0x010b, B:61:0x011b, B:62:0x0122), top: B:82:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0123 A[PHI: r8
  0x0123: PHI (r8v6 ??) = (r8v10 ??), (r8v9 ??) binds: [B:36:0x008b, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        if (defpackage.ia2.C(r9, r0, r6) == r11) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ok1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ok1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [ok1] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n10 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr.b(n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, n10 n10Var) {
        pr prVar;
        if (n10Var instanceof pr) {
            prVar = (pr) n10Var;
            int i = prVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                prVar.m = i - Integer.MIN_VALUE;
            } else {
                prVar = new pr(this, n10Var);
            }
        } else {
            prVar = new pr(this, n10Var);
        }
        Object objP = prVar.k;
        int i2 = prVar.m;
        if (i2 == 0) {
            m02.y(objP);
            yv0 yv0VarM = this.a.m();
            prVar.m = 1;
            objP = cu.P(prVar, new ql(str, (byte) 10), yv0VarM.a, true, false);
            y20 y20Var = y20.h;
            if (objP == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(objP);
        }
        mw0 mw0Var = (mw0) objP;
        if (mw0Var != null) {
            return cu.i0(mw0Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, n10 n10Var) {
        qr qrVar;
        y62 y62Var;
        if (n10Var instanceof qr) {
            qrVar = (qr) n10Var;
            int i = qrVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrVar.o = i - Integer.MIN_VALUE;
            } else {
                qrVar = new qr(this, n10Var);
            }
        } else {
            qrVar = new qr(this, n10Var);
        }
        Object objP = qrVar.m;
        int i2 = qrVar.o;
        AppDatabase appDatabase = this.a;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(objP);
            m62 m62VarQ = appDatabase.q();
            qrVar.k = str;
            qrVar.o = 1;
            objP = cu.P(qrVar, new ql(str, (byte) 25), m62VarQ.a, true, false);
            if (objP != y20Var) {
            }
            return y20Var;
        }
        if (i2 == 1) {
            str = qrVar.k;
            m02.y(objP);
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y62Var = qrVar.l;
            m02.y(objP);
        }
        return cu.k0(y62Var, (List) objP);
        y62 y62Var2 = (y62) objP;
        if (y62Var2 == null) {
            return null;
        }
        m62 m62VarQ2 = appDatabase.q();
        qrVar.k = null;
        qrVar.l = y62Var2;
        qrVar.o = 2;
        Object objP2 = cu.P(qrVar, new ql(str, (byte) 26), m62VarQ2.a, true, false);
        if (objP2 != y20Var) {
            objP = objP2;
            y62Var = y62Var2;
            return cu.k0(y62Var, (List) objP);
        }
        return y20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(uv0 uv0Var, n10 n10Var) {
        rr rrVar;
        if (n10Var instanceof rr) {
            rrVar = (rr) n10Var;
            int i = rrVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrVar.m = i - Integer.MIN_VALUE;
            } else {
                rrVar = new rr(this, n10Var);
            }
        } else {
            rrVar = new rr(this, n10Var);
        }
        Object obj = rrVar.k;
        int i2 = rrVar.m;
        if (i2 == 0) {
            m02.y(obj);
            na1 na1VarC = bh0.c(uv0Var);
            if (!na1VarC.isEmpty()) {
                return new hr(na1VarC);
            }
            yv0 yv0VarM = this.a.m();
            mw0 mw0VarE0 = cu.e0(uv0Var);
            rrVar.m = 1;
            Object objP = cu.P(rrVar, new g(yv0VarM, mw0VarE0, (byte) 15), yv0VarM.a, false, true);
            Object obj2 = y20.h;
            if (objP != obj2) {
                objP = j23.a;
            }
            if (objP == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        return ir.a;
    }
}
