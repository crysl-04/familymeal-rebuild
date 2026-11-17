package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a7 extends p1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final ri1 U;
    public int A;
    public Integer B;
    public final bi C;
    public final fp D;
    public boolean E;
    public x6 F;
    public si1 G;
    public final ti1 H;
    public final qi1 I;
    public final qi1 J;
    public final String K;
    public final String L;
    public final eg M;
    public final si1 N;
    public xg2 O;
    public boolean P;
    public final qi1 Q;
    public final t R;
    public final ArrayList S;
    public final u6 T;
    public final t6 k;
    public int l = Integer.MIN_VALUE;
    public final u6 m = new u6(this, 0);
    public final AccessibilityManager n;
    public long o;
    public List p;
    public final w6 q;
    public int r;
    public int s;
    public e2 t;
    public e2 u;
    public boolean v;
    public final si1 w;
    public final si1 x;
    public final dm2 y;
    public final dm2 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        ri1 ri1Var = ky0.a;
        ri1 ri1Var2 = new ri1(32);
        int i = ri1Var2.b;
        if (i < 0) {
            wg.i("");
            return;
        }
        int i2 = i + 32;
        ri1Var2.b(i2);
        int[] iArr2 = ri1Var2.a;
        int i3 = ri1Var2.b;
        if (i != i3) {
            gi.O(i2, i, i3, iArr2, iArr2);
        }
        gi.R(i, 0, 12, iArr, iArr2);
        ri1Var2.b += 32;
        U = ri1Var2;
    }

    public a7(t6 t6Var) {
        this.k = t6Var;
        Object systemService = t6Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.n = (AccessibilityManager) systemService;
        this.o = 100L;
        new Handler(Looper.getMainLooper());
        this.q = new w6(this);
        this.r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.w = new si1();
        this.x = new si1();
        this.y = new dm2(0);
        this.z = new dm2(0);
        this.A = -1;
        this.C = new bi(0);
        this.D = ls.a(1, 6, null);
        this.E = true;
        si1 si1Var = my0.a;
        si1Var.getClass();
        this.G = si1Var;
        this.H = new ti1();
        this.I = new qi1();
        this.J = new qi1();
        this.K = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.L = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.M = new eg((byte) 23);
        this.N = new si1();
        this.O = new xg2(t6Var.getSemanticsOwner().a(), si1Var);
        int i = hy0.a;
        this.Q = new qi1();
        t6Var.addOnAttachStateChangeListener(this);
        this.R = new t(this, (byte) 2);
        this.S = new ArrayList();
        this.T = new u6(this, (byte) 1);
    }

    public static Rect G(ou ouVar, float f, float f2) {
        if (!(ouVar instanceof ns1) && !(ouVar instanceof os1)) {
            return null;
        }
        r72 r72VarX = ouVar.x();
        return new Rect((int) (r72VarX.a + f), (int) (r72VarX.b + f2), (int) (r72VarX.c + f), (int) (r72VarX.d + f2));
    }

    public static float[] I(ou ouVar) {
        if (!(ouVar instanceof os1)) {
            return null;
        }
        na2 na2Var = ((os1) ouVar).g;
        long j = na2Var.h;
        long j2 = na2Var.g;
        long j3 = na2Var.f;
        long j4 = na2Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(ou ouVar, float f, float f2) {
        if (!(ouVar instanceof ms1)) {
            return null;
        }
        l9 l9Var = ((ms1) ouVar).g;
        r72 r72VarH = l9Var.c().h(f, f2);
        Region region = new Region(new Rect((int) (r72VarH.a + 0.0f), (int) (r72VarH.b + 0.0f), (int) (r72VarH.c + 0.0f), (int) (r72VarH.d + 0.0f)));
        Region region2 = new Region();
        if (l9Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = l9Var.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String o(wg2 wg2Var) {
        od odVar;
        if (wg2Var != null) {
            rg2 rg2Var = wg2Var.d;
            mj1 mj1Var = rg2Var.h;
            ch2 ch2Var = ah2.a;
            if (mj1Var.c(ch2Var)) {
                return gb1.a((List) rg2Var.b(ch2Var), ",", null, 62);
            }
            ch2 ch2Var2 = ah2.G;
            if (mj1Var.c(ch2Var2)) {
                Object objG = mj1Var.g(ch2Var2);
                if (objG == null) {
                    objG = null;
                }
                od odVar2 = (od) objG;
                if (odVar2 != null) {
                    return odVar2.i;
                }
            } else {
                Object objG2 = mj1Var.g(ah2.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (odVar = (od) dv.y0(list)) != null) {
                    return odVar.i;
                }
            }
        }
        return null;
    }

    public static final boolean s(md2 md2Var, float f) {
        kp0 kp0Var = md2Var.a;
        if (f >= 0.0f || ((Number) kp0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) kp0Var.a()).floatValue() < ((Number) md2Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean t(md2 md2Var) {
        kp0 kp0Var = md2Var.a;
        if (((Number) kp0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) kp0Var.a()).floatValue();
        ((Number) md2Var.b.a()).floatValue();
        return false;
    }

    public static final boolean u(md2 md2Var) {
        kp0 kp0Var = md2Var.a;
        if (((Number) kp0Var.a()).floatValue() < ((Number) md2Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) kp0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(a7 a7Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        a7Var.y(i, i2, num, null);
    }

    public final void A(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        x6 x6Var = this.F;
        if (x6Var != null) {
            wg2 wg2Var = x6Var.a;
            if (i != wg2Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - x6Var.f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(wg2Var.f), 131072);
                accessibilityEventJ.setFromIndex(x6Var.d);
                accessibilityEventJ.setToIndex(x6Var.e);
                accessibilityEventJ.setAction(x6Var.b);
                accessibilityEventJ.setMovementGranularity(x6Var.c);
                accessibilityEventJ.getText().add(o(wg2Var));
                x(accessibilityEventJ);
            }
        }
        this.F = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0282  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ff A[LOOP:4: B:127:0x02ef->B:131:0x02ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x030d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0320 A[LOOP:5: B:134:0x0309->B:138:0x0320, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0346  */
    /* JADX WARN: Code duplicated, block: B:150:0x0350  */
    /* JADX WARN: Code duplicated, block: B:154:0x0377  */
    /* JADX WARN: Code duplicated, block: B:157:0x0396  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03de  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:176:0x042b  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:235:0x050c  */
    /* JADX WARN: Code duplicated, block: B:238:0x051d A[LOOP:6: B:233:0x0508->B:238:0x051d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x052c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0539  */
    /* JADX WARN: Code duplicated, block: B:248:0x0546  */
    /* JADX WARN: Code duplicated, block: B:274:0x061d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0308 A[EDGE_INSN: B:297:0x0308->B:133:0x0308 BREAK  A[LOOP:4: B:127:0x02ef->B:131:0x02ff], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0325 A[EDGE_INSN: B:299:0x0325->B:140:0x0325 BREAK  A[LOOP:5: B:134:0x0309->B:138:0x0320], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x019f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    public final void C(ly0 ly0Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        rg2 rg2Var;
        wg2 wg2Var;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        mj1 mj1Var;
        l41 l41Var;
        int i7;
        rg2 rg2Var2;
        long j;
        int i8;
        int i9;
        int i10;
        Integer num5;
        vd2 vd2Var;
        boolean z4;
        ch2 ch2Var;
        int i11;
        ch2 ch2Var2;
        ArrayList arrayList5;
        ch2 ch2Var3;
        String str;
        ch2 ch2Var4;
        int size;
        int i12;
        vd2 vd2Var2;
        Object objG;
        Object objG2;
        boolean z5;
        int i13;
        Object objG3;
        od odVar;
        String str2;
        Object objG4;
        od odVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceK;
        int length;
        int length2;
        int i14;
        Integer num6;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zC;
        boolean z6;
        boolean z7;
        AccessibilityEvent accessibilityEventK;
        Object objG6;
        ba2 ba2Var;
        String str3;
        a7 a7Var = this;
        ly0 ly0Var2 = ly0Var;
        Integer num7 = 64;
        ArrayList arrayList6 = a7Var.S;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        arrayList6.clear();
        int[] iArr3 = ly0Var2.b;
        long[] jArr3 = ly0Var2.a;
        int i19 = 2;
        int length3 = jArr3.length - 2;
        int i20 = 0;
        Integer num8 = 0;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        xg2 xg2Var = (xg2) a7Var.N.b(i27);
                        if (xg2Var != null) {
                            rg2 rg2Var3 = xg2Var.a;
                            mj1 mj1Var2 = rg2Var3.h;
                            yg2 yg2Var = (yg2) ly0Var2.b(i27);
                            int i28 = i24;
                            wg2 wg2Var2 = yg2Var != null ? yg2Var.a : null;
                            if (wg2Var2 == null) {
                                throw wi0.e("no value for specified key");
                            }
                            l41 l41Var2 = wg2Var2.c;
                            rg2 rg2Var4 = wg2Var2.d;
                            iArr2 = iArr3;
                            int i29 = wg2Var2.f;
                            jArr2 = jArr3;
                            mj1 mj1Var3 = rg2Var4.h;
                            i4 = i21;
                            Object[] objArr = mj1Var3.b;
                            Object[] objArr2 = mj1Var3.c;
                            long[] jArr4 = mj1Var3.a;
                            i2 = i26;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                l41 l41Var3 = l41Var2;
                                i3 = i25;
                                int i30 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i30];
                                    wg2 wg2Var3 = wg2Var2;
                                    int i31 = i30;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                int i35 = length4;
                                                Object obj2 = objArr2[i34];
                                                rg2Var2 = rg2Var3;
                                                ch2 ch2Var5 = (ch2) obj;
                                                j = j4;
                                                ch2 ch2Var6 = ah2.v;
                                                if (uz0.g(ch2Var5, ch2Var6) || uz0.g(ch2Var5, ah2.w)) {
                                                    int size2 = arrayList7.size();
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 >= size2) {
                                                            vd2Var = null;
                                                            break;
                                                        }
                                                        int i37 = size2;
                                                        if (((vd2) arrayList7.get(i36)).h == i27) {
                                                            vd2Var = (vd2) arrayList7.get(i36);
                                                            break;
                                                        } else {
                                                            i36++;
                                                            size2 = i37;
                                                        }
                                                    }
                                                    if (vd2Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        vd2Var = new vd2(arrayList6, i27);
                                                        z4 = true;
                                                    }
                                                    arrayList6.add(vd2Var);
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    ch2Var = ah2.d;
                                                    if (uz0.g(ch2Var5, ch2Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        if (mj1Var2.c(ch2Var)) {
                                                            a7Var.A(str3, i27, i28);
                                                        }
                                                    } else {
                                                        i11 = i28;
                                                        if (uz0.g(ch2Var5, ah2.b)) {
                                                            z(a7Var, a7Var.v(i27), 2048, num7, i11);
                                                            z(a7Var, a7Var.v(i27), 2048, num8, i11);
                                                        } else if (uz0.g(ch2Var5, ah2.L)) {
                                                            z(a7Var, a7Var.v(i27), 2048, 8192, 8);
                                                            z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                        } else if (uz0.g(ch2Var5, ah2.O)) {
                                                            z(a7Var, a7Var.v(i27), 2048, 3072, 8);
                                                        } else if (uz0.g(ch2Var5, ah2.c)) {
                                                            z(a7Var, a7Var.v(i27), 2048, num7, 8);
                                                            z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                        } else {
                                                            ch2Var2 = ah2.K;
                                                            arrayList7 = arrayList7;
                                                            if (uz0.g(ch2Var5, ch2Var2)) {
                                                                objG6 = mj1Var3.g(ah2.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                ba2Var = (ba2) objG6;
                                                                if (ba2Var == null && ba2Var.a == 4) {
                                                                    Object objG7 = mj1Var3.g(ch2Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (uz0.g(objG7, Boolean.TRUE)) {
                                                                        AccessibilityEvent accessibilityEventJ = a7Var.j(a7Var.v(i27), 4);
                                                                        wg2Var3 = wg2Var3;
                                                                        l41Var3 = l41Var3;
                                                                        wg2 wg2Var4 = new wg2(wg2Var3.a, true, l41Var3, rg2Var4);
                                                                        Object objG8 = wg2Var4.k().h.g(ah2.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list = (List) objG8;
                                                                        i9 = i32;
                                                                        String strA = list != null ? gb1.a(list, ",", null, 62) : null;
                                                                        Object objG9 = wg2Var4.k().h.g(ah2.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        List list2 = (List) objG9;
                                                                        arrayList5 = arrayList6;
                                                                        String strA2 = list2 != null ? gb1.a(list2, ",", null, 62) : null;
                                                                        if (strA != null) {
                                                                            accessibilityEventJ.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventJ.getText().add(strA2);
                                                                        }
                                                                        a7Var.x(accessibilityEventJ);
                                                                    } else {
                                                                        arrayList5 = arrayList6;
                                                                        l41Var3 = l41Var3;
                                                                        wg2Var3 = wg2Var3;
                                                                        i9 = i32;
                                                                        z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    arrayList5 = arrayList6;
                                                                    l41Var3 = l41Var3;
                                                                    wg2Var3 = wg2Var3;
                                                                    i9 = i32;
                                                                    z(a7Var, a7Var.v(i27), 2048, num7, 8);
                                                                    z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                                }
                                                            } else {
                                                                arrayList5 = arrayList6;
                                                                l41Var3 = l41Var3;
                                                                wg2Var3 = wg2Var3;
                                                                i9 = i32;
                                                                if (uz0.g(ch2Var5, ah2.a)) {
                                                                    int iV = a7Var.v(i27);
                                                                    obj2.getClass();
                                                                    a7Var.y(iV, 2048, 4, (List) obj2);
                                                                } else {
                                                                    ch2Var3 = ah2.G;
                                                                    str = "";
                                                                    if (uz0.g(ch2Var5, ch2Var3)) {
                                                                        if (mj1Var3.c(qg2.k)) {
                                                                            objG4 = mj1Var2.g(ch2Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            odVar2 = (od) objG4;
                                                                            if (odVar2 == null) {
                                                                                odVar2 = "";
                                                                            }
                                                                            objG5 = mj1Var3.g(ch2Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (od) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceK = K(charSequence);
                                                                            length = odVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i14 = length2;
                                                                            } else {
                                                                                i14 = length;
                                                                            }
                                                                            num6 = num8;
                                                                            i15 = 0;
                                                                            while (true) {
                                                                                num7 = num7;
                                                                                if (i15 < i14) {
                                                                                    i16 = length;
                                                                                    break;
                                                                                }
                                                                                i16 = length;
                                                                                if (odVar2.charAt(i15) == charSequence.charAt(i15)) {
                                                                                    break;
                                                                                }
                                                                                i15++;
                                                                                length = i16;
                                                                                num7 = num7;
                                                                            }
                                                                            i17 = 0;
                                                                            while (true) {
                                                                                if (i17 < i14 - i15) {
                                                                                    i18 = i17;
                                                                                    break;
                                                                                }
                                                                                i18 = i17;
                                                                                if (odVar2.charAt((i16 - 1) - i17) == charSequence.charAt((length2 - 1) - i18)) {
                                                                                    break;
                                                                                } else {
                                                                                    i17 = i18 + 1;
                                                                                }
                                                                            }
                                                                            int i38 = (i16 - i18) - i15;
                                                                            int i39 = (length2 - i18) - i15;
                                                                            ch2 ch2Var7 = ah2.N;
                                                                            boolean zC2 = mj1Var2.c(ch2Var7);
                                                                            boolean zC3 = mj1Var3.c(ch2Var7);
                                                                            zC = mj1Var2.c(ah2.G);
                                                                            if (zC || zC2 || !zC3) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = true;
                                                                            }
                                                                            if (zC || !zC2 || zC3) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = true;
                                                                            }
                                                                            if (!z6 || z7) {
                                                                                i10 = i27;
                                                                                num8 = num6;
                                                                                accessibilityEventK = a7Var.k(a7Var.v(i27), num8, num6, Integer.valueOf(length2), charSequenceK);
                                                                            } else {
                                                                                accessibilityEventK = a7Var.j(a7Var.v(i27), 16);
                                                                                accessibilityEventK.setFromIndex(i15);
                                                                                accessibilityEventK.setRemovedCount(i38);
                                                                                accessibilityEventK.setAddedCount(i39);
                                                                                accessibilityEventK.setBeforeText(odVar2);
                                                                                accessibilityEventK.getText().add(charSequenceK);
                                                                                i10 = i27;
                                                                                num8 = num6;
                                                                            }
                                                                            accessibilityEventK.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                v6.a(wg2Var3, accessibilityEventK);
                                                                            }
                                                                            a7Var.x(accessibilityEventK);
                                                                            if (z6 || z7) {
                                                                                long j5 = ((qw2) rg2Var4.b(ah2.H)).a;
                                                                                accessibilityEventK.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventK.setToIndex((int) (j5 & 4294967295L));
                                                                                a7Var.x(accessibilityEventK);
                                                                            }
                                                                        } else {
                                                                            i10 = i27;
                                                                            mj1Var2 = mj1Var2;
                                                                            num7 = num7;
                                                                            z(a7Var, a7Var.v(i10), 2048, Integer.valueOf(i22), 8);
                                                                        }
                                                                        num5 = num8;
                                                                        arrayList6 = arrayList5;
                                                                        i8 = i35;
                                                                    } else {
                                                                        i10 = i27;
                                                                        mj1Var2 = mj1Var2;
                                                                        num7 = num7;
                                                                        i8 = i35;
                                                                        ch2Var4 = ah2.H;
                                                                        if (uz0.g(ch2Var5, ch2Var4)) {
                                                                            objG3 = mj1Var3.g(ch2Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            odVar = (od) objG3;
                                                                            if (odVar != null && (str2 = odVar.i) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((qw2) rg2Var4.b(ch2Var4)).a;
                                                                            num5 = num8;
                                                                            a7Var = this;
                                                                            a7Var.x(a7Var.k(a7Var.v(i10), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                            a7Var.B(i29);
                                                                        } else {
                                                                            num5 = num8;
                                                                            if (!uz0.g(ch2Var5, ch2Var6) || uz0.g(ch2Var5, ah2.w)) {
                                                                                a7Var.r(l41Var3);
                                                                                size = arrayList5.size();
                                                                                i12 = 0;
                                                                                while (true) {
                                                                                    arrayList6 = arrayList5;
                                                                                    if (i12 < size) {
                                                                                        vd2Var2 = null;
                                                                                        break;
                                                                                    } else if (((vd2) arrayList6.get(i12)).h == i10) {
                                                                                        vd2Var2 = (vd2) arrayList6.get(i12);
                                                                                        break;
                                                                                    } else {
                                                                                        i12++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                vd2Var2.getClass();
                                                                                objG = mj1Var3.g(ch2Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                vd2Var2.l = (md2) objG;
                                                                                objG2 = mj1Var3.g(ah2.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                vd2Var2.m = (md2) objG2;
                                                                                if (vd2Var2.i.contains(vd2Var2)) {
                                                                                    a7Var.k.getSnapshotObserver().a.d(vd2Var2, a7Var.T, new h6((Object) vd2Var2, (Object) a7Var, (byte) 1));
                                                                                }
                                                                            } else if (uz0.g(ch2Var5, ah2.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i13 = 8;
                                                                                    a7Var.x(a7Var.j(a7Var.v(i29), 8));
                                                                                } else {
                                                                                    i13 = 8;
                                                                                }
                                                                                z(a7Var, a7Var.v(i29), 2048, num5, i13);
                                                                            } else {
                                                                                ch2 ch2Var8 = qg2.x;
                                                                                if (uz0.g(ch2Var5, ch2Var8)) {
                                                                                    List list3 = (List) rg2Var4.b(ch2Var8);
                                                                                    Object objG10 = mj1Var2.g(ch2Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        nj1 nj1Var = cd2.a;
                                                                                        nj1 nj1Var2 = new nj1();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            li1.c();
                                                                                            return;
                                                                                        }
                                                                                        nj1 nj1Var3 = new nj1();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            li1.c();
                                                                                            return;
                                                                                        } else if (z2 || !nj1Var2.equals(nj1Var3)) {
                                                                                            z5 = true;
                                                                                        } else {
                                                                                            z5 = false;
                                                                                        }
                                                                                    } else if (z2 || !list3.isEmpty()) {
                                                                                        z5 = true;
                                                                                    } else {
                                                                                        z5 = false;
                                                                                    }
                                                                                    z2 = z5;
                                                                                } else if (z2 || !(obj2 instanceof m1)) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    m1 m1Var = (m1) obj2;
                                                                                    Object objG11 = mj1Var2.g(ch2Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (m1Var != objG11) {
                                                                                        if (objG11 instanceof m1) {
                                                                                            String str4 = m1Var.a;
                                                                                            m1 m1Var2 = (m1) objG11;
                                                                                            hq0 hq0Var = m1Var2.b;
                                                                                            if (!uz0.g(str4, m1Var2.a) || (m1Var.b != null ? hq0Var == null : hq0Var != null)) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                    }
                                                                                    z2 = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        arrayList6 = arrayList5;
                                                                    }
                                                                }
                                                            }
                                                            num5 = num8;
                                                            i10 = i27;
                                                            mj1Var2 = mj1Var2;
                                                            num7 = num7;
                                                            arrayList6 = arrayList5;
                                                            i8 = i35;
                                                        }
                                                    }
                                                    i8 = i35;
                                                } else {
                                                    Object objG12 = mj1Var2.g(ch2Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!uz0.g(obj2, objG12)) {
                                                        ch2Var = ah2.d;
                                                        if (uz0.g(ch2Var5, ch2Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            if (mj1Var2.c(ch2Var)) {
                                                                a7Var.A(str3, i27, i28);
                                                            }
                                                        } else {
                                                            i11 = i28;
                                                            if (uz0.g(ch2Var5, ah2.b)) {
                                                                z(a7Var, a7Var.v(i27), 2048, num7, i11);
                                                                z(a7Var, a7Var.v(i27), 2048, num8, i11);
                                                            } else if (uz0.g(ch2Var5, ah2.L)) {
                                                                z(a7Var, a7Var.v(i27), 2048, 8192, 8);
                                                                z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                            } else if (uz0.g(ch2Var5, ah2.O)) {
                                                                z(a7Var, a7Var.v(i27), 2048, 3072, 8);
                                                            } else if (uz0.g(ch2Var5, ah2.c)) {
                                                                z(a7Var, a7Var.v(i27), 2048, num7, 8);
                                                                z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                            } else {
                                                                ch2Var2 = ah2.K;
                                                                arrayList7 = arrayList7;
                                                                if (uz0.g(ch2Var5, ch2Var2)) {
                                                                    objG6 = mj1Var3.g(ah2.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    ba2Var = (ba2) objG6;
                                                                    if (ba2Var == null) {
                                                                        arrayList5 = arrayList6;
                                                                        l41Var3 = l41Var3;
                                                                        wg2Var3 = wg2Var3;
                                                                        i9 = i32;
                                                                        z(a7Var, a7Var.v(i27), 2048, num7, 8);
                                                                        z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                                    } else {
                                                                        arrayList5 = arrayList6;
                                                                        l41Var3 = l41Var3;
                                                                        wg2Var3 = wg2Var3;
                                                                        i9 = i32;
                                                                        z(a7Var, a7Var.v(i27), 2048, num7, 8);
                                                                        z(a7Var, a7Var.v(i27), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    arrayList5 = arrayList6;
                                                                    l41Var3 = l41Var3;
                                                                    wg2Var3 = wg2Var3;
                                                                    i9 = i32;
                                                                    if (uz0.g(ch2Var5, ah2.a)) {
                                                                        int iV2 = a7Var.v(i27);
                                                                        obj2.getClass();
                                                                        a7Var.y(iV2, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        ch2Var3 = ah2.G;
                                                                        str = "";
                                                                        if (uz0.g(ch2Var5, ch2Var3)) {
                                                                            if (mj1Var3.c(qg2.k)) {
                                                                                objG4 = mj1Var2.g(ch2Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                odVar2 = (od) objG4;
                                                                                if (odVar2 == null) {
                                                                                    odVar2 = "";
                                                                                }
                                                                                objG5 = mj1Var3.g(ch2Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (od) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceK = K(charSequence);
                                                                                length = odVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i14 = length2;
                                                                                } else {
                                                                                    i14 = length;
                                                                                }
                                                                                num6 = num8;
                                                                                i15 = 0;
                                                                                while (true) {
                                                                                    num7 = num7;
                                                                                    if (i15 < i14) {
                                                                                        i16 = length;
                                                                                        break;
                                                                                    }
                                                                                    i16 = length;
                                                                                    if (odVar2.charAt(i15) == charSequence.charAt(i15)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i15++;
                                                                                        length = i16;
                                                                                        num7 = num7;
                                                                                    }
                                                                                }
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 < i14 - i15) {
                                                                                        i18 = i17;
                                                                                        break;
                                                                                    }
                                                                                    i18 = i17;
                                                                                    if (odVar2.charAt((i16 - 1) - i17) == charSequence.charAt((length2 - 1) - i18)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i17 = i18 + 1;
                                                                                }
                                                                                int i310 = (i16 - i18) - i15;
                                                                                int i311 = (length2 - i18) - i15;
                                                                                ch2 ch2Var9 = ah2.N;
                                                                                boolean zC4 = mj1Var2.c(ch2Var9);
                                                                                boolean zC5 = mj1Var3.c(ch2Var9);
                                                                                zC = mj1Var2.c(ah2.G);
                                                                                if (zC) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z7 = false;
                                                                                } else {
                                                                                    z7 = false;
                                                                                }
                                                                                if (z6) {
                                                                                    i10 = i27;
                                                                                    num8 = num6;
                                                                                    accessibilityEventK = a7Var.k(a7Var.v(i27), num8, num6, Integer.valueOf(length2), charSequenceK);
                                                                                } else {
                                                                                    i10 = i27;
                                                                                    num8 = num6;
                                                                                    accessibilityEventK = a7Var.k(a7Var.v(i27), num8, num6, Integer.valueOf(length2), charSequenceK);
                                                                                }
                                                                                accessibilityEventK.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    v6.a(wg2Var3, accessibilityEventK);
                                                                                }
                                                                                a7Var.x(accessibilityEventK);
                                                                                if (z6) {
                                                                                    long j7 = ((qw2) rg2Var4.b(ah2.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j7 & 4294967295L));
                                                                                    a7Var.x(accessibilityEventK);
                                                                                } else {
                                                                                    long j8 = ((qw2) rg2Var4.b(ah2.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j8 & 4294967295L));
                                                                                    a7Var.x(accessibilityEventK);
                                                                                }
                                                                            } else {
                                                                                i10 = i27;
                                                                                mj1Var2 = mj1Var2;
                                                                                num7 = num7;
                                                                                z(a7Var, a7Var.v(i10), 2048, Integer.valueOf(i22), 8);
                                                                            }
                                                                            num5 = num8;
                                                                            arrayList6 = arrayList5;
                                                                            i8 = i35;
                                                                        } else {
                                                                            i10 = i27;
                                                                            mj1Var2 = mj1Var2;
                                                                            num7 = num7;
                                                                            i8 = i35;
                                                                            ch2Var4 = ah2.H;
                                                                            if (uz0.g(ch2Var5, ch2Var4)) {
                                                                                objG3 = mj1Var3.g(ch2Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                odVar = (od) objG3;
                                                                                if (odVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((qw2) rg2Var4.b(ch2Var4)).a;
                                                                                num5 = num8;
                                                                                a7Var = this;
                                                                                a7Var.x(a7Var.k(a7Var.v(i10), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                                a7Var.B(i29);
                                                                            } else {
                                                                                num5 = num8;
                                                                                if (uz0.g(ch2Var5, ch2Var6)) {
                                                                                }
                                                                                a7Var.r(l41Var3);
                                                                                size = arrayList5.size();
                                                                                i12 = 0;
                                                                                while (true) {
                                                                                    arrayList6 = arrayList5;
                                                                                    if (i12 < size) {
                                                                                        vd2Var2 = null;
                                                                                        break;
                                                                                    } else if (((vd2) arrayList6.get(i12)).h == i10) {
                                                                                        vd2Var2 = (vd2) arrayList6.get(i12);
                                                                                        break;
                                                                                    } else {
                                                                                        i12++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                vd2Var2.getClass();
                                                                                objG = mj1Var3.g(ch2Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                vd2Var2.l = (md2) objG;
                                                                                objG2 = mj1Var3.g(ah2.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                vd2Var2.m = (md2) objG2;
                                                                                if (vd2Var2.i.contains(vd2Var2)) {
                                                                                    a7Var.k.getSnapshotObserver().a.d(vd2Var2, a7Var.T, new h6((Object) vd2Var2, (Object) a7Var, (byte) 1));
                                                                                }
                                                                            }
                                                                            arrayList6 = arrayList5;
                                                                        }
                                                                    }
                                                                }
                                                                num5 = num8;
                                                                i10 = i27;
                                                                mj1Var2 = mj1Var2;
                                                                num7 = num7;
                                                                arrayList6 = arrayList5;
                                                                i8 = i35;
                                                            }
                                                        }
                                                    }
                                                    i8 = i35;
                                                }
                                                i28 = 8;
                                                mj1Var2 = mj1Var2;
                                                l41Var3 = l41Var3;
                                                i32 = i9;
                                                i33++;
                                                i27 = i10;
                                                wg2Var3 = wg2Var3;
                                                j4 = j >> 8;
                                                arrayList6 = arrayList6;
                                                length4 = i8;
                                                num8 = num5;
                                                rg2Var3 = rg2Var2;
                                                arrayList7 = arrayList7;
                                                num7 = num7;
                                            } else {
                                                rg2Var2 = rg2Var3;
                                                j = j4;
                                                i33 = i33;
                                                i8 = length4;
                                            }
                                            num5 = num8;
                                            i10 = i27;
                                            i9 = i32;
                                            mj1Var2 = mj1Var2;
                                            i28 = 8;
                                            mj1Var2 = mj1Var2;
                                            l41Var3 = l41Var3;
                                            i32 = i9;
                                            i33++;
                                            i27 = i10;
                                            wg2Var3 = wg2Var3;
                                            j4 = j >> 8;
                                            arrayList6 = arrayList6;
                                            length4 = i8;
                                            num8 = num5;
                                            rg2Var3 = rg2Var2;
                                            arrayList7 = arrayList7;
                                            num7 = num7;
                                        }
                                        rg2Var = rg2Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        l41Var = l41Var3;
                                        wg2Var = wg2Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i27;
                                        int i40 = i32;
                                        mj1Var = mj1Var2;
                                        if (i40 != i28) {
                                            break;
                                        }
                                    } else {
                                        rg2Var = rg2Var3;
                                        mj1Var = mj1Var2;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        l41Var = l41Var3;
                                        wg2Var = wg2Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i27;
                                    }
                                    if (i31 == i7) {
                                        break;
                                    }
                                    num8 = num4;
                                    i27 = i6;
                                    mj1Var2 = mj1Var;
                                    l41Var3 = l41Var;
                                    arrayList7 = arrayList3;
                                    i28 = 8;
                                    i30 = i31 + 1;
                                    arrayList6 = arrayList4;
                                    length4 = i7;
                                    wg2Var2 = wg2Var;
                                    rg2Var3 = rg2Var;
                                    num7 = num3;
                                }
                            } else {
                                rg2Var = rg2Var3;
                                num3 = num7;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList6;
                                i3 = i25;
                                wg2Var = wg2Var2;
                                z = true;
                                num4 = num8;
                                i6 = i27;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = rg2Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!wg2Var.k().h.c((ch2) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i5 = 8;
                                z(a7Var, a7Var.v(i6), 2048, num4, 8);
                            } else {
                                i5 = 8;
                            }
                        } else {
                            i2 = i26;
                            num3 = num7;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList6;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i25;
                            i4 = i21;
                            num4 = num8;
                            i5 = i24;
                        }
                    } else {
                        i2 = i26;
                        num3 = num7;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList6;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i25;
                        i4 = i21;
                        num4 = num8;
                        i5 = i24;
                    }
                    j3 >>= i5;
                    i26 = i2 + 1;
                    ly0Var2 = ly0Var;
                    arrayList6 = arrayList4;
                    num8 = num4;
                    i24 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i4;
                    i25 = i3;
                    arrayList7 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i21;
                num2 = num8;
                if (i25 != i24) {
                    return;
                } else {
                    i = i41;
                }
            } else {
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num8;
                i = i21;
            }
            if (i == i23) {
                return;
            }
            i21 = i + 1;
            ly0Var2 = ly0Var;
            length3 = i23;
            arrayList6 = arrayList2;
            num8 = num2;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList7 = arrayList;
            num7 = num;
            i20 = 0;
        }
    }

    public final void D(l41 l41Var, ti1 ti1Var) {
        rg2 rg2VarW;
        if (!l41Var.I() || this.k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(l41Var)) {
            return;
        }
        l41 l41Var2 = null;
        if (!l41Var.L.c(8)) {
            l41Var = l41Var.u();
            while (true) {
                if (l41Var == null) {
                    l41Var = null;
                    break;
                } else if (l41Var.L.c(8)) {
                    break;
                } else {
                    l41Var = l41Var.u();
                }
            }
        }
        if (l41Var == null || (rg2VarW = l41Var.w()) == null) {
            return;
        }
        if (!rg2VarW.j) {
            for (l41 l41VarU = l41Var.u(); l41VarU != null; l41VarU = l41VarU.u()) {
                rg2 rg2VarW2 = l41VarU.w();
                if (rg2VarW2 != null && rg2VarW2.j) {
                    l41Var2 = l41VarU;
                    break;
                }
            }
            if (l41Var2 != null) {
                l41Var = l41Var2;
            }
        }
        int i = l41Var.i;
        if (ti1Var.a(i)) {
            z(this, v(i), 2048, 1, 8);
        }
    }

    public final void E(l41 l41Var) {
        if (!l41Var.I() || this.k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(l41Var)) {
            return;
        }
        int i = l41Var.i;
        md2 md2Var = (md2) this.w.b(i);
        md2 md2Var2 = (md2) this.x.b(i);
        if (md2Var == null && md2Var2 == null) {
            return;
        }
        AccessibilityEvent accessibilityEventJ = j(i, 4096);
        if (md2Var != null) {
            accessibilityEventJ.setScrollX((int) ((Number) md2Var.a.a()).floatValue());
            accessibilityEventJ.setMaxScrollX((int) ((Number) md2Var.b.a()).floatValue());
        }
        if (md2Var2 != null) {
            accessibilityEventJ.setScrollY((int) ((Number) md2Var2.a.a()).floatValue());
            accessibilityEventJ.setMaxScrollY((int) ((Number) md2Var2.b.a()).floatValue());
        }
        x(accessibilityEventJ);
    }

    public final boolean F(wg2 wg2Var, int i, int i2, boolean z) {
        String strO;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        rg2 rg2Var = wg2Var.d;
        int i3 = wg2Var.f;
        ch2 ch2Var = qg2.j;
        if (rg2Var.h.c(ch2Var) && s60.l(wg2Var)) {
            aq0 aq0Var = (aq0) ((m1) wg2Var.d.b(ch2Var)).b;
            if (aq0Var != null) {
                return ((Boolean) aq0Var.c(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.A) && (strO = o(wg2Var)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.A = i;
            boolean z2 = strO.length() > 0;
            int iV = v(i3);
            if (z2) {
                numValueOf = Integer.valueOf(this.A);
                numValueOf2 = Integer.valueOf(this.A);
                numValueOf3 = Integer.valueOf(strO.length());
            } else {
                numValueOf = null;
                numValueOf2 = null;
                numValueOf3 = null;
            }
            x(k(iV, numValueOf, numValueOf2, numValueOf3, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        t6 t6Var = this.k;
        long jR = t6Var.r(jFloatToRawIntBits);
        long jR2 = t6Var.r((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        int i = (int) (jR >> 32);
        int i2 = (int) (jR2 >> 32);
        int i3 = (int) (jR & 4294967295L);
        int i4 = (int) (jR2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec A[EDGE_INSN: B:102:0x01ec->B:84:0x01ec BREAK  A[LOOP:6: B:67:0x0189->B:83:0x01e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9 A[LOOP:6: B:67:0x0189->B:83:0x01e9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        xg2 xg2Var;
        ti1 ti1Var = new ti1();
        ti1 ti1Var2 = this.H;
        int[] iArr = ti1Var2.b;
        long[] jArr3 = ti1Var2.a;
        int length = jArr3.length - 2;
        si1 si1Var = this.N;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            yg2 yg2Var = (yg2) n().b(i6);
                            Object obj = null;
                            wg2 wg2Var = yg2Var != null ? yg2Var.a : null;
                            if (wg2Var != null) {
                                if (!wg2Var.d.h.c(ah2.d)) {
                                    ti1Var.a(i6);
                                    xg2Var = (xg2) si1Var.b(i6);
                                    if (xg2Var != null) {
                                        Object objG = xg2Var.a.h.g(ah2.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    A(obj, i6, 32);
                                }
                            } else {
                                ti1Var.a(i6);
                                xg2Var = (xg2) si1Var.b(i6);
                                if (xg2Var != null) {
                                    Object objG2 = xg2Var.a.h.g(ah2.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                A(obj, i6, 32);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = ti1Var.b;
        long[] jArr4 = ti1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = ti1Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = ti1Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                for (long j9 = (j8 - 72340172838076673L) & (~j8) & j3; j9 != 0; j9 &= j9 - 1) {
                                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i14) & i18;
                                    if (ti1Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                }
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i18;
                                i13 = i18;
                                jArr4 = jArr2;
                                j6 = j4;
                            }
                            if (iNumberOfTrailingZeros >= 0) {
                                ti1Var2.f(iNumberOfTrailingZeros);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        si1Var.c();
        ly0 ly0VarN = n();
        int[] iArr3 = ly0VarN.b;
        Object[] objArr = ly0VarN.c;
        long[] jArr6 = ly0VarN.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i19 = 0;
            while (true) {
                long j10 = jArr6[i19];
                if ((((~j10) << c) & j10 & j3) == j3) {
                    if (i19 != length3) {
                        break;
                        break;
                    }
                    i19++;
                } else {
                    int i20 = 8 - ((~(i19 - length3)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j10 & j2) < j) {
                            int i22 = (i19 << 3) + i21;
                            int i23 = iArr3[i22];
                            wg2 wg2Var2 = ((yg2) objArr[i22]).a;
                            rg2 rg2Var = wg2Var2.d;
                            ch2 ch2Var = ah2.d;
                            if (rg2Var.h.c(ch2Var) && ti1Var2.a(i23)) {
                                A((String) wg2Var2.d.b(ch2Var), i23, 16);
                            }
                            si1Var.h(i23, new xg2(wg2Var2, n()));
                        }
                        j10 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    } else if (i19 != length3) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        this.O = new xg2(this.k.getSemanticsOwner().a(), n());
    }

    @Override // defpackage.p1
    public final g2 a(View view) {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0151  */
    /* JADX WARN: Code duplicated, block: B:49:0x0165  */
    public final void e(int i, e2 e2Var, String str, Bundle bundle) {
        wg2 wg2Var;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = e2Var.a;
        yg2 yg2Var = (yg2) n().b(i);
        if (yg2Var == null || (wg2Var = yg2Var.a) == null) {
            return;
        }
        l41 l41Var = wg2Var.c;
        rg2 rg2Var = wg2Var.d;
        mj1 mj1Var = rg2Var.h;
        String strO = o(wg2Var);
        if (uz0.g(str, this.K)) {
            int iD = this.I.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (uz0.g(str, this.L)) {
            int iD2 = this.J.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = mj1Var.c(qg2.a);
        t6 t6Var = this.k;
        int i3 = 0;
        if (zC && bundle != null && uz0.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 <= 0 || i4 < 0) {
                return;
            }
            if (i4 < (strO != null ? strO.length() : Integer.MAX_VALUE)) {
                jw2 jw2VarS = pz1.s(rg2Var);
                if (jw2VarS != null) {
                    gx0 gx0Var = l41Var.L.c;
                    if (!gx0Var.i0.u) {
                        gx0Var = null;
                    }
                    if (gx0Var != null) {
                        long jS = gx0Var.S(0L);
                        r72 r72VarG = wg2Var.g();
                        RectF[] rectFArr2 = new RectF[i5];
                        while (i3 < i5) {
                            int i6 = i4 + i3;
                            if (i6 < jw2VarS.a.a.i.length()) {
                                r72 r72VarI = jw2VarS.b(i6).i(jS);
                                r72 r72VarE = r72VarI.g(r72VarG) ? r72VarI.e(r72VarG) : null;
                                if (r72VarE != null) {
                                    i2 = i3;
                                    long jR = t6Var.r((((long) Float.floatToRawIntBits(r72VarE.a)) << 32) | (((long) Float.floatToRawIntBits(r72VarE.b)) & 4294967295L));
                                    long jR2 = t6Var.r((((long) Float.floatToRawIntBits(r72VarE.c)) << 32) | (((long) Float.floatToRawIntBits(r72VarE.d)) & 4294967295L));
                                    int i7 = (int) (jR >> 32);
                                    int i8 = (int) (jR2 >> 32);
                                    int i9 = (int) (jR & 4294967295L);
                                    int i10 = (int) (jR2 & 4294967295L);
                                    rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = i3;
                            }
                            i3 = i2 + 1;
                            jw2VarS = jw2VarS;
                            i5 = i5;
                            r72VarG = r72VarG;
                            i4 = i4;
                        }
                        rectFArr = rectFArr2;
                    } else {
                        rectFArr = null;
                    }
                } else {
                    rectFArr = null;
                }
                if (rectFArr != null) {
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
                return;
            }
            return;
        }
        ch2 ch2Var = ah2.A;
        if (mj1Var.c(ch2Var) && bundle != null && uz0.g(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = mj1Var.g(ch2Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (uz0.g(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, wg2Var.f);
            return;
        }
        if (uz0.g(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = mj1Var.g(ah2.S);
            hi2 hi2Var = (hi2) (objG2 == null ? null : objG2);
            if (hi2Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                r72 r72VarP = p(wg2Var, rect, hi2Var);
                float f = r72VarP.b;
                float f2 = r72VarP.a;
                ou ouVarA = hi2Var.a(r72VarP.c(), l41Var.F, t6Var.getDensity());
                if (ouVarA instanceof ns1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(ouVarA, f2, f));
                    return;
                } else if (ouVarA instanceof os1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(ouVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(ouVarA));
                    return;
                } else if (!(ouVarA instanceof ms1)) {
                    wg.n();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", J(ouVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (uz0.g(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = mj1Var.g(ah2.S);
            hi2 hi2Var2 = (hi2) (objG3 == null ? null : objG3);
            if (hi2Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                r72 r72VarP2 = p(wg2Var, rect2, hi2Var2);
                Rect rectG = G(hi2Var2.a(r72VarP2.c(), l41Var.F, t6Var.getDensity()), r72VarP2.a, r72VarP2.b);
                if (rectG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                    return;
                }
                return;
            }
            return;
        }
        if (uz0.g(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = mj1Var.g(ah2.S);
            hi2 hi2Var3 = (hi2) (objG4 == null ? null : objG4);
            if (hi2Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrI = I(hi2Var3.a(p(wg2Var, rect3, hi2Var3).c(), l41Var.F, t6Var.getDensity()));
                if (fArrI != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
                    return;
                }
                return;
            }
            return;
        }
        if (uz0.g(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = mj1Var.g(ah2.S);
            hi2 hi2Var4 = (hi2) (objG5 == null ? null : objG5);
            if (hi2Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                r72 r72VarP3 = p(wg2Var, rect4, hi2Var4);
                Region regionJ = J(hi2Var4.a(r72VarP3.c(), l41Var.F, t6Var.getDensity()), r72VarP3.a, r72VarP3.b);
                if (regionJ != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionJ);
                }
            }
        }
    }

    public final Rect f(yg2 yg2Var) {
        ry0 ry0Var = yg2Var.b;
        return H(ry0Var.a, ry0Var.b, ry0Var.c, ry0Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:13:0x0030, B:22:0x0057, B:25:0x0067, B:27:0x006f, B:29:0x0078, B:18:0x0041, B:21:0x0048), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:13:0x0030, B:22:0x0057, B:25:0x0067, B:27:0x006f, B:29:0x0078, B:18:0x0041, B:21:0x0048), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: all -> 0x00df, LOOP:0: B:31:0x0081->B:32:0x0083, LOOP_END, TryCatch #3 {all -> 0x00df, blocks: (B:30:0x007d, B:32:0x0083, B:34:0x0094, B:36:0x009c), top: B:70:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #3 {all -> 0x00df, blocks: (B:30:0x007d, B:32:0x0083, B:34:0x0094, B:36:0x009c), top: B:70:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (defpackage.lt.r(r4, r2) == r7) goto L54;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0100 -> B:55:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.n10 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a7.g(n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    public final boolean h(boolean z, int i, long j) {
        ch2 ch2Var;
        int i2;
        if (!uz0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        ly0 ly0VarN = n();
        if (up1.b(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            ch2Var = ah2.w;
        } else {
            if (z) {
                wg.n();
                return false;
            }
            ch2Var = ah2.v;
        }
        Object[] objArr = ly0VarN.c;
        long[] jArr = ly0VarN.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        yg2 yg2Var = (yg2) objArr[(i3 << 3) + i6];
                        ry0 ry0Var = yg2Var.b;
                        float f = ry0Var.a;
                        i2 = i4;
                        float f2 = ry0Var.b;
                        float f3 = ry0Var.c;
                        float f4 = ry0Var.d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2) & (fIntBitsToFloat2 < f4)) {
                            Object objG = yg2Var.a.d.h.g(ch2Var);
                            if (objG == null) {
                                objG = null;
                            }
                            md2 md2Var = (md2) objG;
                            if (md2Var != null) {
                                kp0 kp0Var = md2Var.a;
                                if (i < 0) {
                                    if (((Number) kp0Var.a()).floatValue() > 0.0f) {
                                        z2 = true;
                                    }
                                } else if (((Number) kp0Var.a()).floatValue() < ((Number) md2Var.b.a()).floatValue()) {
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    public final void i() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.k.getSemanticsOwner().a(), this.O);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        yg2 yg2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        t6 t6Var = this.k;
        accessibilityEventObtain.setPackageName(t6Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(t6Var, i);
        if (q() && (yg2Var = (yg2) n().b(i)) != null) {
            wg2 wg2Var = yg2Var.a;
            accessibilityEventObtain.setPassword(wg2Var.d.h.c(ah2.N));
            Object objG = wg2Var.d.h.g(ah2.o);
            if (objG == null) {
                objG = null;
            }
            boolean zG = uz0.g(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                q1.j(accessibilityEventObtain, zG);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int l(wg2 wg2Var) {
        rg2 rg2Var = wg2Var.d;
        if (!rg2Var.h.c(ah2.a)) {
            ch2 ch2Var = ah2.H;
            if (rg2Var.h.c(ch2Var)) {
                return (int) (((qw2) rg2Var.b(ch2Var)).a & 4294967295L);
            }
        }
        return this.A;
    }

    public final int m(wg2 wg2Var) {
        rg2 rg2Var = wg2Var.d;
        if (!rg2Var.h.c(ah2.a)) {
            ch2 ch2Var = ah2.H;
            if (rg2Var.h.c(ch2Var)) {
                return (int) (((qw2) rg2Var.b(ch2Var)).a >> 32);
            }
        }
        return this.A;
    }

    public final ly0 n() {
        if (this.E) {
            this.E = false;
            t6 t6Var = this.k;
            this.G = aa3.p(t6Var.getSemanticsOwner(), new s0((byte) 3));
            if (q()) {
                si1 si1Var = this.G;
                Resources resources = t6Var.getContext().getResources();
                qi1 qi1Var = this.I;
                qi1Var.a();
                qi1 qi1Var2 = this.J;
                qi1Var2.a();
                yg2 yg2Var = (yg2) si1Var.b(-1);
                wg2 wg2Var = yg2Var != null ? yg2Var.a : null;
                wg2Var.getClass();
                ArrayList arrayListB = fh2.b(wg2Var, new p((Object) si1Var, (byte) 6), new p((Object) resources, (byte) 7), lt.P(wg2Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((wg2) arrayListB.get(i - 1)).f;
                        int i3 = ((wg2) arrayListB.get(i)).f;
                        qi1Var.f(i2, i3);
                        qi1Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.G;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.p = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.p = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager.isEnabled()) {
            this.p = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.k.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.R);
        AccessibilityManager accessibilityManager = this.n;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[LOOP:0: B:4:0x0014->B:35:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0075 A[EDGE_INSN: B:46:0x0075->B:36:0x0075 BREAK  A[LOOP:0: B:4:0x0014->B:35:0x0072], SYNTHETIC] */
    public final r72 p(wg2 wg2Var, Rect rect, hi2 hi2Var) {
        z6 z6Var = new z6(hi2Var);
        l41 l41Var = wg2Var.c;
        qg1 qg1Var = l41Var.L.f;
        j80 j80Var = null;
        if ((qg1Var.k & 8) != 0) {
            loop0: while (qg1Var != null) {
                if ((qg1Var.j & 8) == 0) {
                    if ((qg1Var.k & 8) != 0) {
                        break;
                        break;
                    }
                    qg1Var = qg1Var.m;
                } else {
                    qg1 qg1VarR = qg1Var;
                    uj1 uj1Var = null;
                    while (qg1VarR != null) {
                        if (qg1VarR instanceof ug2) {
                            ((ug2) qg1VarR).h0(z6Var);
                            if (z6Var.h) {
                                j80Var = qg1VarR;
                                break loop0;
                            }
                        } else if ((qg1VarR.j & 8) != 0 && (qg1VarR instanceof k80)) {
                            int i = 0;
                            for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                if ((qg1Var2.j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qg1VarR = qg1Var2;
                                    } else {
                                        if (uj1Var == null) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (qg1VarR != null) {
                                            uj1Var.b(qg1VarR);
                                            qg1VarR = null;
                                        }
                                        uj1Var.b(qg1Var2);
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        qg1VarR = cu.R(uj1Var);
                    }
                    if ((qg1Var.k & 8) != 0) {
                        break;
                    }
                    qg1Var = qg1Var.m;
                }
            }
        }
        j80 j80Var2 = (ug2) j80Var;
        if (j80Var2 == null || !((qg1) j80Var2).h.u) {
            return es.s(l41Var.L.d, false);
        }
        pn1 pn1VarX = cu.X(j80Var2);
        r72 r72VarM = es.D(pn1VarX).M(pn1VarX, false);
        Rect rectH = H(r72VarM.a, r72VarM.b, r72VarM.c, r72VarM.d);
        float f = rectH.left - rect.left;
        float f2 = rectH.top - rect.top;
        return new r72(f, f2, rectH.width() + f, rectH.height() + f2);
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.n;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.p;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.p = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void r(l41 l41Var) {
        if (this.C.add(l41Var)) {
            this.D.s(j23.a);
        }
    }

    public final int v(int i) {
        if (i == this.k.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void w(wg2 wg2Var, xg2 xg2Var) {
        int[] iArr = uy0.a;
        ti1 ti1Var = new ti1();
        List listJ = wg2.j(4, wg2Var);
        l41 l41Var = wg2Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            wg2 wg2Var2 = (wg2) listJ.get(i);
            ly0 ly0VarN = n();
            int i2 = wg2Var2.f;
            if (ly0VarN.a(i2)) {
                if (!xg2Var.b.b(i2)) {
                    r(l41Var);
                    return;
                }
                ti1Var.a(i2);
            }
        }
        ti1 ti1Var2 = xg2Var.b;
        int[] iArr2 = ti1Var2.b;
        long[] jArr = ti1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ti1Var.b(iArr2[(i3 << 3) + i5])) {
                            r(l41Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = wg2.j(4, wg2Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            wg2 wg2Var3 = (wg2) listJ2.get(i6);
            xg2 xg2Var2 = (xg2) this.N.b(wg2Var3.f);
            if (xg2Var2 != null && n().a(wg2Var3.f)) {
                w(wg2Var3, xg2Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.v = true;
        }
        try {
            return ((Boolean) this.m.h(accessibilityEvent)).booleanValue();
        } finally {
            this.v = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(gb1.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
