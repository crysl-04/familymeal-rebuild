package defpackage;

import android.content.Context;
import android.net.Uri;
import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sj extends mq2 implements zp0 {
    public sj1 l;
    public sj1 m;
    public sj1 n;
    public sj1 o;
    public sj1 p;
    public byte q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Uri s;
    public final /* synthetic */ MealPlannerApp t;
    public final /* synthetic */ sj1 u;
    public final /* synthetic */ sj1 v;
    public final /* synthetic */ sj1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(Context context, Uri uri, MealPlannerApp mealPlannerApp, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, m10 m10Var) {
        super(2, m10Var);
        this.r = context;
        this.s = uri;
        this.t = mealPlannerApp;
        this.u = sj1Var;
        this.v = sj1Var2;
        this.w = sj1Var3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((sj) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new sj(this.r, this.s, this.t, this.u, this.v, this.w, m10Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:8:0x002b, B:29:0x00ac, B:49:0x00ce, B:50:0x00e8, B:52:0x0102, B:54:0x011c, B:13:0x0040, B:25:0x0087, B:16:0x004a, B:22:0x006f, B:19:0x0055), top: B:61:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0102, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        sj1 sj1Var;
        sj1 sj1Var2;
        Object objG;
        sj1 sj1Var3;
        Object objG2;
        sj1 sj1Var4;
        sj1 sj1Var5;
        Object objG3;
        sj1 sj1Var6;
        sj1 sj1Var7;
        String str;
        byte b = this.q;
        MealPlannerApp mealPlannerApp = this.t;
        byte b2 = 1;
        byte b3 = 0;
        sj1 sj1Var8 = this.v;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        y20 y20Var = y20.h;
        try {
            if (b == 0) {
                m02.y(obj);
                sj1Var = this.w;
                try {
                    r70 r70Var = ya0.a;
                    j70 j70Var = j70.j;
                    rj rjVar = new rj(this.r, this.s, objArr == true ? 1 : 0, b2);
                    this.l = sj1Var;
                    this.m = sj1Var;
                    this.q = (byte) 1;
                    objG = ie1.G(j70Var, rjVar, this);
                    if (objG != y20Var) {
                        sj1Var3 = sj1Var;
                    }
                    return y20Var;
                } catch (g40 e) {
                    e = e;
                    sj1Var2 = sj1Var;
                    String strE0 = dv.E0(dv.N0(e.h, 5), "；", null, null, null, 62);
                    if (e.h.size() > 5) {
                        str = " 等 " + e.h.size() + " 个问题";
                    } else {
                        str = "";
                    }
                    str2 = "无法恢复：" + strE0 + str;
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                } catch (Exception e2) {
                    e = e2;
                    sj1Var2 = sj1Var;
                    str2 = "无法读取文件（" + e.getClass().getSimpleName() + "）";
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                }
            } else if (b == 1) {
                sj1Var = this.m;
                sj1Var3 = this.l;
                try {
                    m02.y(obj);
                    objG = obj;
                } catch (g40 e3) {
                    e = e3;
                    sj1Var2 = sj1Var3;
                    String strE1 = dv.E0(dv.N0(e.h, 5), "；", null, null, null, 62);
                    if (e.h.size() > 5) {
                        str = " 等 " + e.h.size() + " 个问题";
                    } else {
                        str = "";
                    }
                    str2 = "无法恢复：" + strE1 + str;
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                } catch (Exception e4) {
                    e = e4;
                    sj1Var2 = sj1Var3;
                    str2 = "无法读取文件（" + e.getClass().getSimpleName() + "）";
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                }
            } else {
                if (b != 2) {
                    if (b != 3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sj1Var7 = this.p;
                    sj1Var6 = this.o;
                    sj1Var2 = this.n;
                    try {
                        m02.y(obj);
                        objG3 = obj;
                        sj1Var7.setValue((hk) objG3);
                        ia2.e(sj1Var8, false);
                    } catch (g40 e5) {
                        e = e5;
                        String strE2 = dv.E0(dv.N0(e.h, 5), "；", null, null, null, 62);
                        if (e.h.size() > 5) {
                            str = " 等 " + e.h.size() + " 个问题";
                        } else {
                            str = "";
                        }
                        str2 = "无法恢复：" + strE2 + str;
                        ia2.e(sj1Var8, false);
                        sj1Var6 = sj1Var2;
                    } catch (Exception e6) {
                        e = e6;
                        str2 = "无法读取文件（" + e.getClass().getSimpleName() + "）";
                        ia2.e(sj1Var8, false);
                        sj1Var6 = sj1Var2;
                    }
                    sj1Var6.setValue(str2);
                    return j23.a;
                }
                sj1Var = this.n;
                sj1Var4 = this.m;
                try {
                    m02.y(obj);
                    objG2 = obj;
                    sj1Var5 = this.u;
                    r70 r70Var2 = ya0.a;
                    j70 j70Var2 = j70.j;
                    h hVar = new h(mealPlannerApp, (hk) objG2, objArr3 == true ? 1 : 0, (byte) 6);
                    this.l = null;
                    this.m = null;
                    this.n = sj1Var4;
                    this.o = sj1Var;
                    this.p = sj1Var5;
                    this.q = (byte) 3;
                    objG3 = ie1.G(j70Var2, hVar, this);
                    if (objG3 != y20Var) {
                        sj1Var6 = sj1Var;
                        sj1Var2 = sj1Var4;
                        sj1Var7 = sj1Var5;
                        sj1Var7.setValue((hk) objG3);
                        ia2.e(sj1Var8, false);
                        sj1Var6.setValue(str2);
                        return j23.a;
                    }
                    return y20Var;
                } catch (g40 e7) {
                    e = e7;
                    sj1Var2 = sj1Var4;
                    String strE3 = dv.E0(dv.N0(e.h, 5), "；", null, null, null, 62);
                    if (e.h.size() > 5) {
                        str = " 等 " + e.h.size() + " 个问题";
                    } else {
                        str = "";
                    }
                    str2 = "无法恢复：" + strE3 + str;
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                } catch (Exception e8) {
                    e = e8;
                    sj1Var2 = sj1Var4;
                    str2 = "无法读取文件（" + e.getClass().getSimpleName() + "）";
                    ia2.e(sj1Var8, false);
                    sj1Var6 = sj1Var2;
                }
            }
            r70 r70Var3 = ya0.a;
            rj rjVar2 = new rj(mealPlannerApp, (String) objG, objArr2 == true ? 1 : 0, b3);
            this.l = null;
            this.m = sj1Var3;
            this.n = sj1Var;
            this.q = (byte) 2;
            objG2 = ie1.G(r70Var3, rjVar2, this);
            if (objG2 != y20Var) {
                sj1Var4 = sj1Var3;
                sj1Var5 = this.u;
                r70 r70Var4 = ya0.a;
                j70 j70Var3 = j70.j;
                h hVar2 = new h(mealPlannerApp, (hk) objG2, objArr3 == true ? 1 : 0, (byte) 6);
                this.l = null;
                this.m = null;
                this.n = sj1Var4;
                this.o = sj1Var;
                this.p = sj1Var5;
                this.q = (byte) 3;
                objG3 = ie1.G(j70Var3, hVar2, this);
                if (objG3 != y20Var) {
                    sj1Var6 = sj1Var;
                    sj1Var2 = sj1Var4;
                    sj1Var7 = sj1Var5;
                    sj1Var7.setValue((hk) objG3);
                    ia2.e(sj1Var8, false);
                    sj1Var6.setValue(str2);
                    return j23.a;
                }
            }
            return y20Var;
        } catch (Throwable th) {
            ia2.e(sj1Var8, false);
            throw th;
        }
    }
}
