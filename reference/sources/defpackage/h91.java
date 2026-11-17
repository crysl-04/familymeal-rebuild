package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h91 {
    public final boolean a;
    public eg b;
    public final a63 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public x81 h;
    public final nn2 i;

    public h91(e91 e91Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new eg((byte) 9);
        this.c = new a63(e91Var);
        this.g = new ArrayList();
        x81 x81Var = x81.i;
        this.h = x81Var;
        this.i = h7.N(x81Var);
    }

    public final void a(d91 d91Var) {
        c91 o70Var;
        g91 g91Var;
        e91 e91Var;
        w81 w81Var;
        d91Var.getClass();
        c("addObserver");
        x81 x81Var = this.h;
        x81 x81Var2 = x81.h;
        if (x81Var != x81Var2) {
            x81Var2 = x81.i;
        }
        g91 g91Var2 = new g91();
        g91Var2.a = x81Var2;
        HashMap map = n91.a;
        boolean z = d91Var instanceof c91;
        boolean z2 = d91Var instanceof m70;
        byte b = 2;
        Object obj = null;
        byte b2 = 0;
        if (z && z2) {
            o70Var = new o70((m70) d91Var, (c91) d91Var, b2);
        } else if (z2) {
            o70Var = new o70((m70) d91Var, obj, b2);
        } else if (z) {
            o70Var = (c91) d91Var;
        } else {
            Class<?> cls = d91Var.getClass();
            if (n91.b(cls) == 2) {
                Object obj2 = n91.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    n91.a((Constructor) list.get(0), d91Var);
                    throw null;
                }
                int size = list.size();
                jr0[] jr0VarArr = new jr0[size];
                if (size > 0) {
                    n91.a((Constructor) list.get(0), d91Var);
                    throw null;
                }
                o70Var = new q72(jr0VarArr, b);
            } else {
                o70Var = new o70(d91Var);
            }
        }
        g91Var2.b = o70Var;
        eg egVar = this.b;
        egVar.getClass();
        mj1 mj1Var = (mj1) egVar.i;
        ui0 ui0Var = (ui0) mj1Var.g(d91Var);
        if (ui0Var != null) {
            g91Var = ui0Var.i;
        } else {
            ui0 ui0Var2 = new ui0(d91Var, g91Var2);
            mj1Var.n(d91Var, ui0Var2);
            ui0 ui0Var3 = (ui0) egVar.k;
            if (ui0Var3 == null) {
                egVar.j = ui0Var2;
                egVar.k = ui0Var2;
            } else {
                ui0Var3.j = ui0Var2;
                ui0Var2.k = ui0Var3;
                egVar.k = ui0Var2;
            }
            g91Var = null;
        }
        if (g91Var != null || (e91Var = (e91) this.c.a.get()) == null) {
            return;
        }
        b2 = (this.d != 0 || this.e) ? (byte) 1 : (byte) 0;
        x81 x81VarB = b(d91Var);
        this.d++;
        while (g91Var2.a.compareTo(x81VarB) < 0) {
            eg egVar2 = this.b;
            egVar2.getClass();
            if (!((mj1) egVar2.i).c(d91Var)) {
                break;
            }
            x81 x81Var3 = g91Var2.a;
            ArrayList arrayList = this.g;
            arrayList.add(x81Var3);
            u81 u81Var = w81.Companion;
            x81 x81Var4 = g91Var2.a;
            u81Var.getClass();
            x81Var4.getClass();
            int iOrdinal = x81Var4.ordinal();
            if (iOrdinal == 1) {
                w81Var = w81.ON_CREATE;
            } else if (iOrdinal != 2) {
                w81Var = iOrdinal != 3 ? null : w81.ON_RESUME;
            } else {
                w81Var = w81.ON_START;
            }
            if (w81Var == null) {
                wg.o(g91Var2.a, "no event up from ");
                return;
            } else {
                g91Var2.a(e91Var, w81Var);
                iv.t0(arrayList);
                x81VarB = b(d91Var);
            }
        }
        if (b2 == 0) {
            h();
        }
        this.d--;
    }

    public final x81 b(d91 d91Var) {
        eg egVar = this.b;
        egVar.getClass();
        d91Var.getClass();
        ui0 ui0Var = (ui0) ((mj1) egVar.i).g(d91Var);
        ui0 ui0Var2 = ui0Var != null ? ui0Var.k : null;
        x81 x81Var = ui0Var2 != null ? ui0Var2.i.a : null;
        ArrayList arrayList = this.g;
        x81 x81Var2 = arrayList.isEmpty() ? null : (x81) arrayList.get(arrayList.size() - 1);
        x81 x81Var3 = this.h;
        if (x81Var == null || x81Var.compareTo(x81Var3) >= 0) {
            x81Var = x81Var3;
        }
        return (x81Var2 == null || x81Var2.compareTo(x81Var) >= 0) ? x81Var : x81Var2;
    }

    public final void c(String str) {
        if (this.a) {
            vg.V().getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(wi0.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(w81 w81Var) {
        w81Var.getClass();
        c("handleLifecycleEvent");
        e(w81Var.a());
    }

    public final void e(x81 x81Var) {
        if (this.h != x81Var) {
            e91 e91Var = (e91) this.c.a.get();
            x81 x81Var2 = this.h;
            x81 x81Var3 = x81.i;
            x81 x81Var4 = x81.h;
            if (x81Var2 == x81Var3 && x81Var == x81Var4) {
                throw new IllegalStateException(("State must be at least '" + x81.j + "' to be moved to '" + x81Var + "' in component " + e91Var).toString());
            }
            if (x81Var2 == x81Var4 && x81Var2 != x81Var) {
                throw new IllegalStateException(("State is '" + x81Var4 + "' and cannot be moved to `" + x81Var + "` in component " + e91Var).toString());
            }
            this.h = x81Var;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            h();
            this.e = false;
            if (this.h == x81Var4) {
                this.b = new eg((byte) 9);
            }
        }
    }

    public final void f(d91 d91Var) {
        d91Var.getClass();
        c("removeObserver");
        eg egVar = this.b;
        egVar.getClass();
        ui0 ui0Var = (ui0) ((mj1) egVar.i).l(d91Var);
        if (ui0Var == null) {
            return;
        }
        ui0 ui0Var2 = ui0Var.k;
        ui0 ui0Var3 = ui0Var.j;
        if (ui0Var2 == null) {
            egVar.j = ui0Var3;
        } else {
            ui0Var2.j = ui0Var3;
        }
        ui0 ui0Var4 = ui0Var.j;
        if (ui0Var4 == null) {
            egVar.k = ui0Var2;
        } else {
            ui0Var4.k = ui0Var2;
        }
        ui0Var.l = true;
    }

    public final void g(x81 x81Var) {
        x81Var.getClass();
        c("setCurrentState");
        e(x81Var);
    }

    public final void h() {
        Object obj = this.c.a.get();
        if (obj == null) {
            li1.g("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final e91 e91Var = (e91) obj;
        while (true) {
            eg egVar = this.b;
            final byte b = 0;
            if (((mj1) egVar.i).e == 0) {
                break;
            }
            ui0 ui0Var = (ui0) egVar.j;
            if (ui0Var == null) {
                li1.m("Collection is empty.");
                return;
            }
            x81 x81Var = ui0Var.i.a;
            ui0 ui0Var2 = (ui0) egVar.k;
            if (ui0Var2 == null) {
                li1.m("Collection is empty.");
                return;
            }
            x81 x81Var2 = ui0Var2.i.a;
            if (x81Var == x81Var2 && this.h == x81Var2) {
                break;
            }
            this.f = false;
            x81 x81Var3 = this.h;
            if (ui0Var == null) {
                li1.m("Collection is empty.");
                return;
            }
            if (x81Var3.compareTo(x81Var) < 0) {
                eg egVar2 = this.b;
                vp0 vp0Var = new vp0(this) { // from class: f91
                    public final /* synthetic */ h91 i;

                    {
                        this.i = this;
                    }

                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        w81 w81Var;
                        w81 w81Var2;
                        byte b2 = b;
                        j23 j23Var = j23.a;
                        e91 e91Var2 = e91Var;
                        h91 h91Var = this.i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b2) {
                            case 0:
                                entry.getClass();
                                d91 d91Var = (d91) entry.getKey();
                                g91 g91Var = (g91) entry.getValue();
                                while (true) {
                                    x81 x81Var4 = g91Var.a;
                                    x81 x81Var5 = h91Var.h;
                                    ArrayList arrayList = h91Var.g;
                                    if (x81Var4.compareTo(x81Var5) <= 0 || h91Var.f) {
                                        return j23Var;
                                    }
                                    eg egVar3 = h91Var.b;
                                    egVar3.getClass();
                                    d91Var.getClass();
                                    if (!((mj1) egVar3.i).c(d91Var)) {
                                        return j23Var;
                                    }
                                    u81 u81Var = w81.Companion;
                                    x81 x81Var6 = g91Var.a;
                                    u81Var.getClass();
                                    x81Var6.getClass();
                                    int iOrdinal = x81Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        w81Var = w81.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        w81Var = iOrdinal != 4 ? null : w81.ON_PAUSE;
                                    } else {
                                        w81Var = w81.ON_STOP;
                                    }
                                    if (w81Var == null) {
                                        li1.f(g91Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(w81Var.a());
                                    g91Var.a(e91Var2, w81Var);
                                    iv.t0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                d91 d91Var2 = (d91) entry.getKey();
                                g91 g91Var2 = (g91) entry.getValue();
                                while (true) {
                                    x81 x81Var7 = g91Var2.a;
                                    x81 x81Var8 = h91Var.h;
                                    ArrayList arrayList2 = h91Var.g;
                                    if (x81Var7.compareTo(x81Var8) >= 0 || h91Var.f) {
                                        return j23Var;
                                    }
                                    eg egVar4 = h91Var.b;
                                    egVar4.getClass();
                                    d91Var2.getClass();
                                    if (!((mj1) egVar4.i).c(d91Var2)) {
                                        return j23Var;
                                    }
                                    arrayList2.add(g91Var2.a);
                                    u81 u81Var2 = w81.Companion;
                                    x81 x81Var9 = g91Var2.a;
                                    u81Var2.getClass();
                                    x81Var9.getClass();
                                    int iOrdinal2 = x81Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        w81Var2 = w81.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        w81Var2 = iOrdinal2 != 3 ? null : w81.ON_RESUME;
                                    } else {
                                        w81Var2 = w81.ON_START;
                                    }
                                    if (w81Var2 == null) {
                                        li1.f(g91Var2.a, "no event up from ");
                                        return null;
                                    }
                                    g91Var2.a(e91Var2, w81Var2);
                                    iv.t0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                egVar2.getClass();
                for (ui0 ui0Var3 = (ui0) egVar2.k; ui0Var3 != null; ui0Var3 = ui0Var3.k) {
                    if (!ui0Var3.l) {
                        vp0Var.h(ui0Var3);
                    }
                }
            }
            ui0 ui0Var4 = (ui0) this.b.k;
            if (!this.f && ui0Var4 != null && this.h.compareTo(ui0Var4.i.a) > 0) {
                eg egVar3 = this.b;
                final byte b2 = 1;
                vp0 vp0Var2 = new vp0(this) { // from class: f91
                    public final /* synthetic */ h91 i;

                    {
                        this.i = this;
                    }

                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        w81 w81Var;
                        w81 w81Var2;
                        byte b3 = b2;
                        j23 j23Var = j23.a;
                        e91 e91Var2 = e91Var;
                        h91 h91Var = this.i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b3) {
                            case 0:
                                entry.getClass();
                                d91 d91Var = (d91) entry.getKey();
                                g91 g91Var = (g91) entry.getValue();
                                while (true) {
                                    x81 x81Var4 = g91Var.a;
                                    x81 x81Var5 = h91Var.h;
                                    ArrayList arrayList = h91Var.g;
                                    if (x81Var4.compareTo(x81Var5) <= 0 || h91Var.f) {
                                        return j23Var;
                                    }
                                    eg egVar4 = h91Var.b;
                                    egVar4.getClass();
                                    d91Var.getClass();
                                    if (!((mj1) egVar4.i).c(d91Var)) {
                                        return j23Var;
                                    }
                                    u81 u81Var = w81.Companion;
                                    x81 x81Var6 = g91Var.a;
                                    u81Var.getClass();
                                    x81Var6.getClass();
                                    int iOrdinal = x81Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        w81Var = w81.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        w81Var = iOrdinal != 4 ? null : w81.ON_PAUSE;
                                    } else {
                                        w81Var = w81.ON_STOP;
                                    }
                                    if (w81Var == null) {
                                        li1.f(g91Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(w81Var.a());
                                    g91Var.a(e91Var2, w81Var);
                                    iv.t0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                d91 d91Var2 = (d91) entry.getKey();
                                g91 g91Var2 = (g91) entry.getValue();
                                while (true) {
                                    x81 x81Var7 = g91Var2.a;
                                    x81 x81Var8 = h91Var.h;
                                    ArrayList arrayList2 = h91Var.g;
                                    if (x81Var7.compareTo(x81Var8) >= 0 || h91Var.f) {
                                        return j23Var;
                                    }
                                    eg egVar5 = h91Var.b;
                                    egVar5.getClass();
                                    d91Var2.getClass();
                                    if (!((mj1) egVar5.i).c(d91Var2)) {
                                        return j23Var;
                                    }
                                    arrayList2.add(g91Var2.a);
                                    u81 u81Var2 = w81.Companion;
                                    x81 x81Var9 = g91Var2.a;
                                    u81Var2.getClass();
                                    x81Var9.getClass();
                                    int iOrdinal2 = x81Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        w81Var2 = w81.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        w81Var2 = iOrdinal2 != 3 ? null : w81.ON_RESUME;
                                    } else {
                                        w81Var2 = w81.ON_START;
                                    }
                                    if (w81Var2 == null) {
                                        li1.f(g91Var2.a, "no event up from ");
                                        return null;
                                    }
                                    g91Var2.a(e91Var2, w81Var2);
                                    iv.t0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                egVar3.getClass();
                for (ui0 ui0Var5 = (ui0) egVar3.j; ui0Var5 != null; ui0Var5 = ui0Var5.j) {
                    if (!ui0Var5.l) {
                        vp0Var2.h(ui0Var5);
                    }
                }
            }
        }
        this.f = false;
        this.i.h(this.h);
    }
}
