package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kv2 {
    public boolean A;
    public final h23 a;
    public p81 d;
    public kp0 f;
    public pu g;
    public x20 h;
    public d02 i;
    public ws0 j;
    public gm0 k;
    public final lu1 l;
    public final lu1 m;
    public long n;
    public qw2 o;
    public long p;
    public final lu1 q;
    public final lu1 r;
    public int s;
    public vv2 t;
    public tj2 u;
    public qw2 v;
    public final lu1 w;
    public final k42 x;
    public final iv2 y;
    public final tj2 z;
    public xp1 b = a33.a;
    public vp0 c = new ss2(9);
    public final lu1 e = rz1.x(new vv2((String) null, 0, 7));

    public kv2(h23 h23Var) {
        this.a = h23Var;
        Boolean bool = Boolean.TRUE;
        this.l = rz1.x(bool);
        this.m = rz1.x(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = rz1.x(null);
        this.r = rz1.x(null);
        this.s = -1;
        this.t = new vv2((String) null, 0L, 7);
        this.w = rz1.x(Boolean.FALSE);
        k42 k42Var = new k42((byte) 6);
        k42Var.j = gy2.h;
        this.x = k42Var;
        this.y = new iv2(this);
        this.z = new tj2(this);
    }

    public static vv2 b(od odVar, long j) {
        return new vv2(odVar, j, (qw2) null);
    }

    public final dn2 a(boolean z) {
        x20 x20Var = this.h;
        if (x20Var != null) {
            return ie1.p(x20Var, null, new fv2(this, z, null), 1);
        }
        return null;
    }

    public final void c() {
        x20 x20Var = this.h;
        if (x20Var != null) {
            ie1.p(x20Var, null, new qj(this, null, (byte) 11), 1);
        }
    }

    public final void d(up1 up1Var) {
        if (!qw2.c(l().b)) {
            p81 p81Var = this.d;
            kw2 kw2VarD = p81Var != null ? p81Var.d() : null;
            int iE = (up1Var == null || kw2VarD == null) ? qw2.e(l().b) : this.b.n(kw2VarD.b(up1Var.a, true));
            vv2 vv2VarA = vv2.a(l(), null, m02.a(iE, iE), 5);
            this.c.h(vv2VarA);
            this.v = new qw2(vv2VarA.b);
        }
        r((up1Var == null || l().a.i.length() <= 0) ? qs0.h : qs0.j);
        u(false);
    }

    public final void e(boolean z) {
        gm0 gm0Var;
        p81 p81Var = this.d;
        if (p81Var != null && !p81Var.b() && (gm0Var = this.k) != null) {
            gm0.a(gm0Var);
        }
        this.t = l();
        u(z);
        r(qs0.i);
    }

    public final wt1 f() {
        String str;
        qw2 qw2Var;
        od odVarK = k();
        if (odVarK == null || (str = odVarK.i) == null || (qw2Var = this.v) == null) {
            return null;
        }
        long j = qw2Var.a;
        return new wt1(str, new qw2(m02.a(this.b.s((int) (j >> 32)), this.b.s((int) (j & 4294967295L)))));
    }

    public final up1 g() {
        return (up1) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        kw2 kw2VarD;
        p81 p81Var = this.d;
        if (p81Var == null || (kw2VarD = p81Var.d()) == null) {
            return 9205357640488583168L;
        }
        jw2 jw2Var = kw2VarD.a;
        uh1 uh1Var = jw2Var.b;
        od odVarK = k();
        if (odVarK == null) {
            return 9205357640488583168L;
        }
        if (!uz0.g(odVarK.i, jw2Var.a.a.i)) {
            return 9205357640488583168L;
        }
        long j = l().b;
        int i = qw2.c;
        int iS = this.b.s((int) (z ? j >> 32 : j & 4294967295L));
        boolean zG = qw2.g(l().b);
        long j2 = jw2Var.c;
        int iD = uh1Var.d(iS);
        if (iD >= uh1Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = jw2Var.a((!z ? !zG : zG) ? Math.max(iS + (-1), 0) : iS) == jw2Var.g(iS);
        uh1Var.k(iS);
        int length = ((od) uh1Var.a.i).i.length();
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(iS == length ? arrayList.size() - 1 : ys.w(iS, arrayList));
        g9 g9Var = yt1Var.a;
        int iB = yt1Var.b(iS);
        hw2 hw2Var = g9Var.d;
        return (((long) Float.floatToRawIntBits(cy1.m(z2 ? hw2Var.j(iB, false) : hw2Var.k(iB, false), 0.0f, (int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(cy1.m(uh1Var.b(iD), 0.0f, (int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public final od k() {
        p81 p81Var = this.d;
        if (p81Var != null) {
            return p81Var.a.a;
        }
        return null;
    }

    public final vv2 l() {
        return (vv2) this.e.getValue();
    }

    public final void m() {
        dn2 dn2Var;
        ut2 ut2Var = (ut2) this.x.i;
        if (ut2Var == null || (dn2Var = ut2Var.B) == null) {
            return;
        }
        dn2Var.a(null);
        ut2Var.B = null;
    }

    public final void n(qw2 qw2Var) {
        od odVarK;
        String str;
        x20 x20Var;
        if (qw2Var != null) {
            long j = qw2Var.a;
            d02 d02Var = this.i;
            if (d02Var == null || (odVarK = k()) == null || (str = odVarK.i) == null) {
                return;
            }
            xp1 xp1Var = this.b;
            long jA = m02.a(xp1Var.s((int) (j >> 32)), xp1Var.s((int) (j & 4294967295L)));
            if (str.length() <= 0 || qw2.c(jA) || (x20Var = this.h) == null) {
                return;
            }
            ie1.p(x20Var, null, new v00(d02Var, str, jA, qw2Var, this, xp1Var, null), 3);
        }
    }

    public final void o() {
        x20 x20Var = this.h;
        if (x20Var != null) {
            ie1.p(x20Var, null, new cv2(this, null, (byte) 1), 1);
        }
    }

    public final void p(up1 up1Var) {
        this.r.setValue(up1Var);
    }

    public final void q(os0 os0Var) {
        this.q.setValue(os0Var);
    }

    public final void r(qs0 qs0Var) {
        p81 p81Var = this.d;
        if (p81Var != null) {
            if (p81Var.a() == qs0Var) {
                p81Var = null;
            }
            if (p81Var != null) {
                p81Var.k.setValue(qs0Var);
            }
        }
    }

    public final void s() {
        p81 p81Var;
        ot2 ot2Var;
        uk2 uk2VarN = y02.n();
        m10 m10Var = null;
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            if (!i() || ((p81Var = this.d) != null && !((Boolean) p81Var.q.getValue()).booleanValue())) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                return;
            }
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            k42 k42Var = this.x;
            if (((gy2) k42Var.j) == gy2.h) {
                dx0.c("ToolbarRequester is not initialized.");
            }
            ut2 ut2Var = (ut2) k42Var.i;
            if (ut2Var == null || !ut2Var.u) {
                return;
            }
            dn2 dn2Var = ut2Var.B;
            if ((dn2Var == null || !dn2Var.b()) && (ot2Var = (ot2) vs.z(ut2Var, pt2.b)) != null) {
                ut2Var.B = ie1.p(ut2Var.x0(), null, new ul(ut2Var, ot2Var, m10Var, (byte) 2), 1);
            }
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(n10 n10Var) {
        jv2 jv2Var;
        if (n10Var instanceof jv2) {
            jv2Var = (jv2) n10Var;
            int i = jv2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jv2Var.n = i - Integer.MIN_VALUE;
            } else {
                jv2Var = new jv2(this, n10Var);
            }
        } else {
            jv2Var = new jv2(this, n10Var);
        }
        Object objValueOf = jv2Var.l;
        int i2 = jv2Var.n;
        if (i2 == 0) {
            m02.y(objValueOf);
            pu puVar = this.g;
            if (puVar != null) {
                jv2Var.k = this;
                jv2Var.n = 1;
                if (!(puVar instanceof c6)) {
                    li1.e(jp1.j("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", z72.a(puVar.getClass()).b()));
                    return null;
                }
                ClipDescription primaryClipDescription = ((c6) puVar).a.E().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = y20.h;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return j23.a;
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = jv2Var.k;
        m02.y(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.w.setValue(bool);
        return j23.a;
    }

    public final void u(boolean z) {
        p81 p81Var = this.d;
        if (p81Var != null) {
            p81Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    public final long v(vv2 vv2Var, long j, boolean z, boolean z2, li1 li1Var, boolean z3, xs0 xs0Var) {
        kw2 kw2VarD;
        long j2;
        int i;
        long j3;
        bg2 bg2Var;
        bg2 bg2Var2;
        boolean z4;
        ws0 ws0Var;
        ag2 ag2VarE;
        ag2 ag2Var;
        ag2 ag2Var2;
        p81 p81Var = this.d;
        if (p81Var == null || (kw2VarD = p81Var.d()) == null) {
            return qw2.b;
        }
        xp1 xp1Var = this.b;
        long j4 = vv2Var.b;
        od odVar = vv2Var.a;
        int i2 = qw2.c;
        long jA = m02.a(xp1Var.s((int) (j4 >> 32)), this.b.s((int) (j4 & 4294967295L)));
        int iB = kw2VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jA >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jA & 4294967295L);
        }
        tj2 tj2Var = this.u;
        int i4 = -1;
        if (z || tj2Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = this.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        jw2 jw2Var = kw2VarD.a;
        if (z) {
            bg2Var = null;
        } else {
            int i6 = (int) (jA >> 32);
            int i7 = (int) (jA & j3);
            bg2Var = new bg2(new ag2(i6, m02.m(jw2Var, i6)), new ag2(i7, m02.m(jw2Var, i7)), qw2.g(jA));
        }
        tj2 tj2Var2 = new tj2(z2, bg2Var, new yq0(i3, i, i4, jw2Var));
        if (bg2Var != null && tj2Var != null && z2 == tj2Var.b) {
            yq0 yq0Var = (yq0) tj2Var.d;
            if (i3 == yq0Var.b && i == yq0Var.c) {
                return j4;
            }
        }
        this.u = tj2Var2;
        this.s = iB;
        byte b = li1Var.h;
        h30 h30Var = h30.h;
        Object obj = tj2Var2.d;
        switch (b) {
            case 19:
                yq0 yq0Var2 = (yq0) obj;
                bg2Var2 = new bg2(yq0Var2.a(yq0Var2.b), yq0Var2.a(yq0Var2.c), tj2Var2.a() == h30Var);
                break;
            case 20:
                bg2Var2 = pz1.e(tj2Var2, vz1.n);
                break;
            case 21:
                bg2Var2 = pz1.e(tj2Var2, vz1.m);
                break;
            default:
                bg2Var2 = (bg2) tj2Var2.c;
                yq0 yq0Var3 = (yq0) obj;
                if (bg2Var2 != null) {
                    ag2 ag2Var3 = bg2Var2.b;
                    ag2 ag2Var4 = bg2Var2.a;
                    if (tj2Var2.b) {
                        ag2VarE = pz1.E(tj2Var2, yq0Var3, ag2Var4);
                        ag2Var2 = ag2Var3;
                        ag2Var3 = ag2Var4;
                        ag2Var = ag2VarE;
                    } else {
                        ag2VarE = pz1.E(tj2Var2, yq0Var3, ag2Var3);
                        ag2Var = ag2Var4;
                        ag2Var2 = ag2VarE;
                    }
                    if (!uz0.g(ag2VarE, ag2Var3)) {
                        bg2 bg2Var3 = new bg2(ag2Var, ag2Var2, tj2Var2.a() == h30Var || (tj2Var2.a() == h30.j && ag2Var.b > ag2Var2.b));
                        yq0 yq0Var4 = (yq0) obj;
                        ag2 ag2Var5 = bg2Var3.a;
                        ag2Var5.getClass();
                        ag2 ag2Var6 = bg2Var3.b;
                        ag2Var6.getClass();
                        if (ag2Var5.b != ag2Var6.b) {
                            bg2Var2 = bg2Var3;
                        } else {
                            bg2 bg2Var4 = (bg2) tj2Var2.c;
                            String str = ((jw2) yq0Var4.e).a.a.i;
                            if (bg2Var4 == null || str.length() == 0) {
                                bg2Var2 = bg2Var3;
                            } else {
                                boolean z5 = tj2Var2.b;
                                String str2 = ((jw2) yq0Var4.e).a.a.i;
                                int i8 = yq0Var4.b;
                                int length = str2.length();
                                if (i8 == 0) {
                                    int iW = p02.w(0, str2);
                                    bg2Var2 = !z5 ? bg2.a(bg2Var3, null, pz1.g(ag2Var6, yq0Var4, iW), false, 1) : bg2.a(bg2Var3, pz1.g(ag2Var5, yq0Var4, iW), null, true, 2);
                                } else if (i8 != length) {
                                    boolean z6 = bg2Var4.c;
                                    int iX = z5 ^ z6 ? p02.x(i8, str2) : p02.w(i8, str2);
                                    bg2Var2 = !z5 ? bg2.a(bg2Var3, null, pz1.g(ag2Var6, yq0Var4, iX), z6, 1) : bg2.a(bg2Var3, pz1.g(ag2Var5, yq0Var4, iX), null, z6, 2);
                                } else {
                                    int iX2 = p02.x(length, str2);
                                    bg2Var2 = !z5 ? bg2.a(bg2Var3, null, pz1.g(ag2Var6, yq0Var4, iX2), true, 1) : bg2.a(bg2Var3, pz1.g(ag2Var5, yq0Var4, iX2), null, false, 2);
                                }
                            }
                        }
                    }
                } else {
                    bg2Var2 = pz1.e(tj2Var2, vz1.n);
                }
                break;
        }
        long jA2 = m02.a(this.b.n(bg2Var2.a.b), this.b.n(bg2Var2.b.b));
        if (qw2.b(jA2, j4)) {
            return j4;
        }
        boolean z7 = qw2.g(jA2) != qw2.g(j4) && qw2.b(m02.a((int) (jA2 & j3), (int) (jA2 >> 32)), j4);
        boolean z8 = qw2.c(jA2) && qw2.c(j4);
        if (z3 && odVar.i.length() > 0 && !z7 && !z8 && xs0Var != null && (ws0Var = this.j) != null) {
            ((sz1) ws0Var).a(xs0Var.a);
        }
        this.c.h(b(odVar, jA2));
        this.v = new qw2(jA2);
        if (!z3) {
            u(!qw2.c(jA2));
        }
        p81 p81Var2 = this.d;
        if (p81Var2 != null) {
            p81Var2.q.setValue(Boolean.valueOf(z3));
        }
        p81 p81Var3 = this.d;
        if (p81Var3 != null) {
            p81Var3.m.setValue(Boolean.valueOf(!qw2.c(jA2) && cy1.L(this, true)));
        }
        p81 p81Var4 = this.d;
        if (p81Var4 != null) {
            z4 = false;
            p81Var4.n.setValue(Boolean.valueOf(!qw2.c(jA2) && cy1.L(this, false)));
        } else {
            z4 = false;
        }
        p81 p81Var5 = this.d;
        if (p81Var5 != null) {
            p81Var5.o.setValue(Boolean.valueOf((qw2.c(jA2) && cy1.L(this, true)) ? true : z4));
        }
        return jA2;
    }
}
