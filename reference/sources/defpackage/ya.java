package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(Object obj, Object obj2, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        m10 m10Var = (m10) obj;
        switch (b) {
            case 0:
                return new ya((za) obj3, (gt2) obj2, m10Var, (byte) 0).r(j23Var);
            case 1:
                return new ya((gl) obj3, (fl) obj2, m10Var, (byte) 1).r(j23Var);
            case 2:
                return new ya((ga2) obj3, (vu1) obj2, m10Var, (byte) 2).r(j23Var);
            default:
                return new ya((ga2) obj3, (vp0) obj2, m10Var, (byte) 3).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        va vaVar;
        byte b = this.l;
        j23 j23Var = j23.a;
        byte b2 = 4;
        byte b3 = 0;
        Object obj2 = this.o;
        y20 y20Var = y20.h;
        Object obj3 = this.n;
        m10 m10Var = null;
        switch (b) {
            case 0:
                za zaVar = (za) obj3;
                nl2 nl2Var = zaVar.e;
                View view = zaVar.a;
                boolean z = this.m;
                try {
                    if (!z) {
                        m02.y(obj);
                        wa waVar = new wa();
                        gt2 gt2Var = (gt2) obj2;
                        va vaVar2 = new va(waVar, new ta(zaVar, gt2Var, (byte) 0), new ta(zaVar, gt2Var, (byte) 1), view);
                        vp0 vp0Var = zaVar.b;
                        if (vp0Var != null && (vaVar = (va) vp0Var.h(vaVar2)) != null) {
                            vaVar2 = vaVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            xa xaVar = zaVar.i;
                            if (xaVar == null) {
                                xaVar = new xa(zaVar, vaVar2, waVar, b3);
                                zaVar.i = xaVar;
                            }
                            view.post(xaVar);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ok0(vaVar2), 1);
                            if (actionModeStartActionMode == null) {
                                return j23Var;
                            }
                            zaVar.h = actionModeStartActionMode;
                        }
                        this.m = true;
                        Object objV = waVar.a.v(this);
                        if (objV != y20Var) {
                            objV = j23Var;
                        }
                        if (objV == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    nl2Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable tVar = zaVar.j;
                        if (tVar == null) {
                            tVar = new t(zaVar, (byte) 4);
                            zaVar.j = tVar;
                        }
                        view.post(tVar);
                    } else {
                        ActionMode actionMode = zaVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    xa xaVar2 = zaVar.i;
                    if (xaVar2 != null) {
                        view.removeCallbacks(xaVar2);
                    }
                    zaVar.h = null;
                    return j23Var;
                } catch (Throwable th) {
                    nl2Var.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable tVar2 = zaVar.j;
                        if (tVar2 == null) {
                            tVar2 = new t(zaVar, (byte) 4);
                            zaVar.j = tVar2;
                        }
                        view.post(tVar2);
                    } else {
                        ActionMode actionMode2 = zaVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    xa xaVar3 = zaVar.i;
                    if (xaVar3 != null) {
                        view.removeCallbacks(xaVar3);
                    }
                    zaVar.h = null;
                    throw th;
                }
            case 1:
                fl flVar = (fl) obj2;
                lu1 lu1Var = ((gl) obj3).c;
                boolean z2 = this.m;
                try {
                    if (!z2) {
                        m02.y(obj);
                        lu1Var.setValue(flVar);
                        this.m = true;
                        Object objV2 = flVar.b.v(this);
                        if (objV2 != y20Var) {
                            objV2 = j23Var;
                        }
                        if (objV2 == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    lu1Var.setValue(null);
                    return j23Var;
                } catch (Throwable th2) {
                    lu1Var.setValue(null);
                    throw th2;
                }
            case 2:
                boolean z3 = this.m;
                if (z3) {
                    if (z3) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ga2 ga2Var = (ga2) obj3;
                x30 x30Var = new x30(ga2Var, m10Var, (vu1) obj2, b3);
                this.m = true;
                Object objL = ga2Var.l(false, x30Var, this);
                return objL == y20Var ? y20Var : objL;
            default:
                ga2 ga2Var2 = (ga2) obj3;
                boolean z4 = this.m;
                try {
                    if (!z4) {
                        m02.y(obj);
                        ga2Var2.a();
                        ga2Var2.a();
                        SupportSQLiteDatabase writableDatabase = ga2Var2.f().getWritableDatabase();
                        if (!writableDatabase.inTransaction()) {
                            qj qjVar = new qj(ga2Var2.e(), m10Var, b2);
                            Thread.interrupted();
                            uz0.w(xf0.h, new rj(qjVar, m10Var, (byte) 7));
                        }
                        if (writableDatabase.isWriteAheadLoggingEnabled()) {
                            writableDatabase.beginTransactionNonExclusive();
                        } else {
                            writableDatabase.beginTransaction();
                        }
                        this.m = true;
                        obj = ((vp0) obj2).h(this);
                        if (obj == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z4) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    ga2Var2.f().getWritableDatabase().setTransactionSuccessful();
                    ga2Var2.f().getWritableDatabase().endTransaction();
                    if (!ga2Var2.j()) {
                        f01 f01VarE = ga2Var2.e();
                        f01VarE.b.c(f01VarE.f, f01VarE.g);
                    }
                    return obj;
                } catch (Throwable th3) {
                    ga2Var2.f().getWritableDatabase().endTransaction();
                    if (!ga2Var2.j()) {
                        f01 f01VarE2 = ga2Var2.e();
                        f01VarE2.b.c(f01VarE2.f, f01VarE2.g);
                    }
                    throw th3;
                }
        }
    }
}
