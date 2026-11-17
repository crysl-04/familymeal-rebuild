package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ca {
    public static final ie0 a = new ie0(new r3((byte) 9), (byte) 0);
    public static final ie0 b = new ie0(new sz((byte) 27), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0258  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0223  */
    public static final void a(o12 o12Var, kp0 kp0Var, final p12 p12Var, final nx nxVar, dr0 dr0Var, final int i, final int i2) {
        int i3;
        kp0 kp0Var2;
        p12 p12Var2;
        boolean z;
        final kp0 kp0Var3;
        e72 e72VarR;
        kp0 kp0Var4;
        View view;
        e90 e90Var;
        String str;
        u31 u31Var;
        br0 br0VarC0;
        sj1 sj1VarC;
        Object objK;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objK2;
        int i4;
        String str2;
        byte b2;
        m12 m12Var;
        int i5;
        byte b3;
        int i6;
        byte b4;
        boolean z2;
        Object objK3;
        byte b5;
        byte b6;
        boolean z3;
        Object objK4;
        byte b7;
        int i7;
        Object obj3;
        boolean zH;
        Object obj4;
        boolean zH2;
        Object obj5;
        boolean zH3;
        Object obj6;
        int i8;
        int i9;
        final o12 o12Var2 = o12Var;
        dr0Var.W(-1772091631);
        if ((i & 6) == 0) {
            i3 = (dr0Var.f(o12Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                kp0Var2 = kp0Var;
                i3 |= dr0Var.h(kp0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                p12Var2 = p12Var;
                if (dr0Var.f(p12Var2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                p12Var2 = p12Var;
            }
            if ((i & 3072) == 0) {
                if (dr0Var.h(nxVar)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i3 & 1, z)) {
                if (i10 != 0) {
                    kp0Var4 = null;
                } else {
                    kp0Var4 = kp0Var2;
                }
                view = (View) dr0Var.j(i7.f);
                e90Var = (e90) dr0Var.j(uz.h);
                str = (String) dr0Var.j(a);
                u31Var = (u31) dr0Var.j(uz.n);
                br0VarC0 = lt.c0(dr0Var);
                sj1VarC = rz1.C(nxVar, dr0Var);
                Object[] objArr = new Object[0];
                objK = dr0Var.K();
                obj = zy.a;
                obj2 = objK;
                if (objK == obj) {
                    Object r3Var = new r3((byte) 10);
                    dr0Var.f0(r3Var);
                    obj2 = r3Var;
                }
                uuid = (UUID) rz1.z(objArr, (kp0) obj2, dr0Var, 48);
                zBooleanValue = ((Boolean) dr0Var.j(b)).booleanValue();
                objK2 = dr0Var.K();
                if (objK2 == obj) {
                    str2 = str;
                    i4 = i3;
                    b2 = 0;
                    m12 m12Var2 = new m12(kp0Var4, p12Var2, str2, view, e90Var, o12Var2, uuid, zBooleanValue);
                    o12Var2 = o12Var2;
                    m12Var2.n(br0VarC0, new nx(-297523940, true, new u9(m12Var2, sj1VarC, b2)));
                    dr0Var.f0(m12Var2);
                    objK2 = m12Var2;
                } else {
                    i4 = i3;
                    str2 = str;
                    b2 = 0;
                }
                m12Var = (m12) objK2;
                boolean zH4 = dr0Var.h(m12Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    b3 = 1;
                } else {
                    b3 = b2;
                }
                int i11 = (zH4 ? 1 : 0) | b3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    b4 = 1;
                } else {
                    b4 = b2;
                }
                z2 = (((i11 | b4) | (dr0Var.f(str2) ? 1 : 0)) == true ? 1 : 0) | (dr0Var.d(u31Var.ordinal()) ? 1 : 0);
                objK3 = dr0Var.K();
                if (z2 == 0 || objK3 == obj) {
                    Object u3Var = new u3(m12Var, kp0Var4, p12Var, str2, u31Var);
                    dr0Var.f0(u3Var);
                    objK3 = u3Var;
                }
                h7.G(m12Var, (vp0) objK3, dr0Var);
                boolean zH5 = dr0Var.h(m12Var);
                if (i5 == 32) {
                    b5 = 1;
                } else {
                    b5 = b2;
                }
                int i12 = (zH5 ? 1 : 0) | b5;
                if (i6 == 256) {
                    b6 = 1;
                } else {
                    b6 = b2;
                }
                z3 = (((i12 | b6) | (dr0Var.f(str2) ? 1 : 0)) == true ? 1 : 0) | (dr0Var.d(u31Var.ordinal()) ? 1 : 0);
                objK4 = dr0Var.K();
                if (z3 == 0 || objK4 == obj) {
                    Object v9Var = new v9(m12Var, kp0Var4, p12Var, str2, u31Var, (byte) 0);
                    dr0Var.f0(v9Var);
                    objK4 = v9Var;
                }
                h7.S((kp0) objK4, dr0Var);
                boolean zH6 = dr0Var.h(m12Var);
                if ((i4 & 14) == 4) {
                    b7 = 1;
                } else {
                    b7 = b2;
                }
                i7 = (zH6 ? 1 : 0) | b7;
                Object objK5 = dr0Var.K();
                obj3 = objK5;
                if (i7 == 0 || objK5 == obj) {
                    Object gVar = new g(m12Var, o12Var2, (byte) 2);
                    dr0Var.f0(gVar);
                    obj3 = gVar;
                }
                h7.G(o12Var2, (vp0) obj3, dr0Var);
                zH = dr0Var.h(m12Var);
                Object objK6 = dr0Var.K();
                obj4 = objK6;
                if (zH || objK6 == obj) {
                    Object hVar = new h((Object) m12Var, (m10) null, (byte) 3);
                    dr0Var.f0(hVar);
                    obj4 = hVar;
                }
                h7.J((zp0) obj4, dr0Var, m12Var);
                zH2 = dr0Var.h(m12Var);
                Object objK7 = dr0Var.K();
                obj5 = objK7;
                if (zH2 || objK7 == obj) {
                    Object t9Var = new t9(m12Var, (byte) 1);
                    dr0Var.f0(t9Var);
                    obj5 = t9Var;
                }
                rg1 rg1VarV = tz0.v(og1.h, (vp0) obj5);
                zH3 = dr0Var.h(m12Var) | dr0Var.d(u31Var.ordinal());
                Object objK8 = dr0Var.K();
                obj6 = objK8;
                if (zH3 || objK8 == obj) {
                    Object x9Var = new x9(m12Var, u31Var);
                    dr0Var.f0(x9Var);
                    obj6 = x9Var;
                }
                ze1 ze1Var = (ze1) obj6;
                int iHashCode = Long.hashCode(dr0Var.T);
                dx1 dx1VarL = dr0Var.l();
                rg1 rg1VarU = ls.U(dr0Var, rg1VarV);
                sy.f.getClass();
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(l41.W);
                } else {
                    dr0Var.i0();
                }
                h12.y(c5.F, dr0Var, ze1Var);
                h12.y(c5.E, dr0Var, dx1VarL);
                h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                h12.t(dr0Var);
                h12.y(c5.D, dr0Var, rg1VarU);
                dr0Var.p(true);
                kp0Var3 = kp0Var4;
            } else {
                dr0Var.Q();
                kp0Var3 = kp0Var2;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: w9
                    @Override // defpackage.zp0
                    public final Object f(Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        ca.a(o12Var2, kp0Var3, p12Var, nxVar, (dr0) obj7, m02.A(i | 1), i2);
                        return j23.a;
                    }
                };
            }
        }
        i3 |= 48;
        kp0Var2 = kp0Var;
        if ((i & 384) == 0) {
            p12Var2 = p12Var;
            if (dr0Var.f(p12Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            p12Var2 = p12Var;
        }
        if ((i & 3072) == 0) {
            if (dr0Var.h(nxVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dr0Var.N(i3 & 1, z)) {
            if (i10 != 0) {
                kp0Var4 = null;
            } else {
                kp0Var4 = kp0Var2;
            }
            view = (View) dr0Var.j(i7.f);
            e90Var = (e90) dr0Var.j(uz.h);
            str = (String) dr0Var.j(a);
            u31Var = (u31) dr0Var.j(uz.n);
            br0VarC0 = lt.c0(dr0Var);
            sj1VarC = rz1.C(nxVar, dr0Var);
            Object[] objArr2 = new Object[0];
            objK = dr0Var.K();
            obj = zy.a;
            obj2 = objK;
            if (objK == obj) {
                Object r3Var2 = new r3((byte) 10);
                dr0Var.f0(r3Var2);
                obj2 = r3Var2;
            }
            uuid = (UUID) rz1.z(objArr2, (kp0) obj2, dr0Var, 48);
            zBooleanValue = ((Boolean) dr0Var.j(b)).booleanValue();
            objK2 = dr0Var.K();
            if (objK2 == obj) {
                str2 = str;
                i4 = i3;
                b2 = 0;
                m12 m12Var3 = new m12(kp0Var4, p12Var2, str2, view, e90Var, o12Var2, uuid, zBooleanValue);
                o12Var2 = o12Var2;
                m12Var3.n(br0VarC0, new nx(-297523940, true, new u9(m12Var3, sj1VarC, b2)));
                dr0Var.f0(m12Var3);
                objK2 = m12Var3;
            } else {
                i4 = i3;
                str2 = str;
                b2 = 0;
            }
            m12Var = (m12) objK2;
            boolean zH7 = dr0Var.h(m12Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                b3 = 1;
            } else {
                b3 = b2;
            }
            int i13 = (zH7 ? 1 : 0) | b3;
            i6 = i4 & 896;
            if (i6 == 256) {
                b4 = 1;
            } else {
                b4 = b2;
            }
            z2 = (((i13 | b4) | (dr0Var.f(str2) ? 1 : 0)) == true ? 1 : 0) | (dr0Var.d(u31Var.ordinal()) ? 1 : 0);
            objK3 = dr0Var.K();
            if (z2 == 0) {
                Object u3Var2 = new u3(m12Var, kp0Var4, p12Var, str2, u31Var);
                dr0Var.f0(u3Var2);
                objK3 = u3Var2;
            } else {
                Object u3Var3 = new u3(m12Var, kp0Var4, p12Var, str2, u31Var);
                dr0Var.f0(u3Var3);
                objK3 = u3Var3;
            }
            h7.G(m12Var, (vp0) objK3, dr0Var);
            boolean zH8 = dr0Var.h(m12Var);
            if (i5 == 32) {
                b5 = 1;
            } else {
                b5 = b2;
            }
            int i14 = (zH8 ? 1 : 0) | b5;
            if (i6 == 256) {
                b6 = 1;
            } else {
                b6 = b2;
            }
            z3 = (((i14 | b6) | (dr0Var.f(str2) ? 1 : 0)) == true ? 1 : 0) | (dr0Var.d(u31Var.ordinal()) ? 1 : 0);
            objK4 = dr0Var.K();
            if (z3 == 0) {
                Object v9Var2 = new v9(m12Var, kp0Var4, p12Var, str2, u31Var, (byte) 0);
                dr0Var.f0(v9Var2);
                objK4 = v9Var2;
            } else {
                Object v9Var3 = new v9(m12Var, kp0Var4, p12Var, str2, u31Var, (byte) 0);
                dr0Var.f0(v9Var3);
                objK4 = v9Var3;
            }
            h7.S((kp0) objK4, dr0Var);
            boolean zH9 = dr0Var.h(m12Var);
            if ((i4 & 14) == 4) {
                b7 = 1;
            } else {
                b7 = b2;
            }
            i7 = (zH9 ? 1 : 0) | b7;
            Object objK9 = dr0Var.K();
            obj3 = objK9;
            if (i7 == 0) {
                Object gVar2 = new g(m12Var, o12Var2, (byte) 2);
                dr0Var.f0(gVar2);
                obj3 = gVar2;
            } else {
                Object gVar3 = new g(m12Var, o12Var2, (byte) 2);
                dr0Var.f0(gVar3);
                obj3 = gVar3;
            }
            h7.G(o12Var2, (vp0) obj3, dr0Var);
            zH = dr0Var.h(m12Var);
            Object objK10 = dr0Var.K();
            obj4 = objK10;
            if (zH) {
                Object hVar2 = new h((Object) m12Var, (m10) null, (byte) 3);
                dr0Var.f0(hVar2);
                obj4 = hVar2;
            } else {
                Object hVar3 = new h((Object) m12Var, (m10) null, (byte) 3);
                dr0Var.f0(hVar3);
                obj4 = hVar3;
            }
            h7.J((zp0) obj4, dr0Var, m12Var);
            zH2 = dr0Var.h(m12Var);
            Object objK11 = dr0Var.K();
            obj5 = objK11;
            if (zH2) {
                Object t9Var2 = new t9(m12Var, (byte) 1);
                dr0Var.f0(t9Var2);
                obj5 = t9Var2;
            } else {
                Object t9Var3 = new t9(m12Var, (byte) 1);
                dr0Var.f0(t9Var3);
                obj5 = t9Var3;
            }
            rg1 rg1VarV2 = tz0.v(og1.h, (vp0) obj5);
            zH3 = dr0Var.h(m12Var) | dr0Var.d(u31Var.ordinal());
            Object objK12 = dr0Var.K();
            obj6 = objK12;
            if (zH3) {
                Object x9Var2 = new x9(m12Var, u31Var);
                dr0Var.f0(x9Var2);
                obj6 = x9Var2;
            } else {
                Object x9Var3 = new x9(m12Var, u31Var);
                dr0Var.f0(x9Var3);
                obj6 = x9Var3;
            }
            ze1 ze1Var2 = (ze1) obj6;
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, rg1VarV2);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1Var2);
            h12.y(c5.E, dr0Var, dx1VarL2);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode2));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU2);
            dr0Var.p(true);
            kp0Var3 = kp0Var4;
        } else {
            dr0Var.Q();
            kp0Var3 = kp0Var2;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: w9
                @Override // defpackage.zp0
                public final Object f(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    ca.a(o12Var2, kp0Var3, p12Var, nxVar, (dr0) obj7, m02.A(i | 1), i2);
                    return j23.a;
                }
            };
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
