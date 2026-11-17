package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends kq0 implements vp0 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.o = b;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x023b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0257  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        Object[] objArr;
        dy1 dy1VarF;
        e40 e40Var;
        fw fwVar;
        u21 u21VarK;
        Integer numValueOf;
        byte b = this.o;
        boolean z = true;
        byte b2 = 0;
        m10 m10Var = null;
        j23 j23Var = j23.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lu luVar = (lu) obj2;
                xi1 xi1Var = luVar.L;
                if (zBooleanValue) {
                    luVar.R0();
                } else {
                    if (luVar.x != null) {
                        Object[] objArr2 = xi1Var.c;
                        long[] jArr = xi1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((j & 255) < 128) {
                                            ie1.p(luVar.x0(), null, new n(luVar, (m22) objArr2[(i << 3) + i4], m10Var, b2), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i3 == i2) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i != length) {
                                    i++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        m22 m22Var = luVar.N;
                        if (m22Var != null) {
                            ie1.p(luVar.x0(), null, new n(luVar, m22Var, m10Var, (byte) 1), 3);
                        }
                    }
                    xi1Var.a();
                    luVar.N = null;
                }
                return j23Var;
            case 1:
                ((Set) obj).getClass();
                f01 f01Var = (f01) obj2;
                ReentrantLock reentrantLock = f01Var.d;
                reentrantLock.lock();
                try {
                    List listR0 = dv.R0(f01Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = listR0.iterator();
                    if (!it.hasNext()) {
                        return j23Var;
                    }
                    ((tp1) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                ((v01) obj2).n((Throwable) obj);
                return j23Var;
            case 3:
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                ((sy1) obj2).getClass();
                return Boolean.valueOf(sy1.e(j62Var));
            case 4:
                j62 j62Var2 = (j62) obj;
                j62Var2.getClass();
                ((sy1) obj2).getClass();
                return Boolean.valueOf(j62Var2.i.contains("shrimp"));
            case 5:
                String str = (String) obj;
                str.getClass();
                ay1 ay1Var = (ay1) obj2;
                ay1Var.getClass();
                ay1Var.p.setValue(ay1Var.g().contains(str) ? ci2.H(ay1Var.g(), str) : ci2.I(ay1Var.g(), str));
                return j23Var;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                ay1 ay1Var2 = (ay1) obj2;
                ay1Var2.r.setValue(bool);
                if (zBooleanValue2) {
                    List listI = ay1Var2.i();
                    if (listI == null || !listI.isEmpty()) {
                        Iterator it2 = listI.iterator();
                        while (it2.hasNext()) {
                            if (!co2.X((String) it2.next())) {
                            }
                        }
                        dy1VarF = ay1Var2.f();
                        if (dy1VarF != null) {
                            dy1 dy1VarA = dy1.a(dy1VarF, null, null, null, null, null, null, 0.0d, null, 14335);
                            Map map = rs2.a;
                            e40Var = rs2.a(dy1VarA, ay1Var2.e).a;
                            if (e40Var != null) {
                                ay1Var2.s.setValue(ay1.l(e40Var));
                            }
                        }
                    } else {
                        dy1VarF = ay1Var2.f();
                        if (dy1VarF != null) {
                            dy1 dy1VarA2 = dy1.a(dy1VarF, null, null, null, null, null, null, 0.0d, null, 14335);
                            Map map2 = rs2.a;
                            e40Var = rs2.a(dy1VarA2, ay1Var2.e).a;
                            if (e40Var != null) {
                                ay1Var2.s.setValue(ay1.l(e40Var));
                            }
                        }
                    }
                }
                return j23Var;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                ay1 ay1Var3 = (ay1) obj2;
                ay1Var3.getClass();
                ay1Var3.i.setValue(str2);
                List listE = ay1Var3.e();
                if (!listE.contains(ay1Var3.h())) {
                    as0 as0Var = as0.l;
                    if (!listE.equals(lt.P(as0Var))) {
                        as0Var = as0.j;
                    }
                    ay1Var3.m.setValue(as0Var);
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                j62 j62Var3 = (j62) obj;
                j62Var3.getClass();
                ((sy1) obj2).getClass();
                return Boolean.valueOf(j62Var3.i.contains("fish_whole"));
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                j62 j62Var4 = (j62) obj;
                j62Var4.getClass();
                ((sy1) obj2).getClass();
                return Boolean.valueOf(sy1.e(j62Var4));
            case 10:
                te1 te1Var = (te1) obj;
                te1Var.getClass();
                x62 x62Var = (x62) obj2;
                x62Var.getClass();
                lu1 lu1Var = x62Var.g;
                lu1Var.setValue(((Set) lu1Var.getValue()).contains(te1Var) ? ci2.H((Set) lu1Var.getValue(), te1Var) : ci2.I((Set) lu1Var.getValue(), te1Var));
                return j23Var;
            case 11:
                long j2 = ((up1) obj).a;
                kt2 kt2Var = (kt2) obj2;
                kt2Var.getClass();
                ot2 ot2Var = (ot2) vs.z(kt2Var, pt2.a);
                if (ot2Var != null) {
                    ie1.p(kt2Var.x0(), null, new k(kt2Var, j2, ot2Var, new jt2(kt2Var, j2), (m10) null), 3);
                }
                return j23Var;
            case 12:
                ((dt2) obj2).b.a((vp0) obj);
                return j23Var;
            case 13:
                KeyEvent keyEvent = ((v21) obj).a;
                qu2 qu2Var = (qu2) obj2;
                pw2 pw2Var = qu2Var.f;
                boolean z2 = qu2Var.d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    fwVar = null;
                } else {
                    q60 q60Var = qu2Var.i;
                    q60Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        q60Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = q60Var.a;
                        if (num != null) {
                            q60Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        fwVar = new fw(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        fwVar = null;
                    }
                }
                if (fwVar != null) {
                    if (z2) {
                        qu2Var.a(lt.P(fwVar));
                        pw2Var.a = null;
                    } else {
                        z = false;
                    }
                } else if (ys.G(keyEvent) != 2 || (u21VarK = h7.M.k(keyEvent)) == null || (u21VarK.h && !z2)) {
                    z = false;
                } else {
                    t72 t72Var = new t72();
                    t72Var.h = true;
                    qb qbVar = new qb((Object) u21VarK, (Object) qu2Var, (Object) t72Var, (byte) 18);
                    vv2 vv2Var = qu2Var.c;
                    tu2 tu2Var = new tu2(vv2Var, qu2Var.g, qu2Var.a.d(), pw2Var);
                    qbVar.h(tu2Var);
                    boolean zB = qw2.b(tu2Var.f, vv2Var.b);
                    od odVar = tu2Var.g;
                    if (!zB || !uz0.g(odVar, vv2Var.a)) {
                        qu2Var.j.h(vv2.a(vv2Var, odVar, tu2Var.f, 4));
                    }
                    qu2Var.h.e = true;
                    z = t72Var.h;
                }
                return Boolean.valueOf(z);
            default:
                int iIntValue = ((Number) obj).intValue();
                p63 p63Var = (p63) obj2;
                iu1 iu1Var = p63Var.d;
                if (((n63) p63Var.j.getValue()) == null && iIntValue != iu1Var.g() && iIntValue >= 0 && iIntValue < 2) {
                    iu1Var.h(iIntValue);
                    p63Var.f.setValue(null);
                    p63Var.g.setValue(null);
                    p63Var.h.setValue(ag0.h);
                    p63Var.e.setValue(Boolean.FALSE);
                    p63Var.k.setValue(null);
                    p63Var.f();
                }
                return j23Var;
        }
    }
}
