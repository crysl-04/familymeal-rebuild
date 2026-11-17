package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dt implements sh {
    public static iu0 h;

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object A(vr vrVar, n10 n10Var) {
        el0 el0Var;
        x72 x72Var;
        a e;
        x8 x8Var;
        qf0 qf0Var = s60.r0;
        if (n10Var instanceof el0) {
            el0Var = (el0) n10Var;
            int i = el0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                el0Var.n = i - Integer.MIN_VALUE;
            } else {
                el0Var = new el0(n10Var);
            }
        } else {
            el0Var = new el0(n10Var);
        }
        Object obj = el0Var.m;
        int i2 = el0Var.n;
        byte b = 1;
        if (i2 == 0) {
            m02.y(obj);
            x72 x72Var2 = new x72();
            x72Var2.h = qf0Var;
            x8 x8Var2 = new x8(x72Var2, b);
            try {
                el0Var.k = x72Var2;
                el0Var.l = x8Var2;
                el0Var.n = 1;
                Object objA = vrVar.a(x8Var2, el0Var);
                Object obj2 = y20.h;
                if (objA == obj2) {
                    return obj2;
                }
                x72Var = x72Var2;
            } catch (a e2) {
                x72Var = x72Var2;
                e = e2;
                x8Var = x8Var2;
                if (e.h != x8Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x8Var = el0Var.l;
            x72Var = el0Var.k;
            try {
                m02.y(obj);
            } catch (a e3) {
                e = e3;
                if (e.h != x8Var) {
                    throw e;
                }
            }
        }
        Object obj3 = x72Var.h;
        if (obj3 != qf0Var) {
            return obj3;
        }
        li1.m("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [zp0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pk0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, zp0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object B(pk0 pk0Var, zp0 zp0Var, n10 n10Var) {
        fl0 fl0Var;
        ?? r1;
        x72 x72Var;
        a e;
        pb0 pb0Var;
        ?? r2;
        qf0 qf0Var = s60.r0;
        if (n10Var instanceof fl0) {
            fl0Var = (fl0) n10Var;
            int i = fl0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl0Var.o = i - Integer.MIN_VALUE;
            } else {
                fl0Var = new fl0(n10Var);
            }
        } else {
            fl0Var = new fl0(n10Var);
        }
        Object obj = fl0Var.n;
        int i2 = fl0Var.o;
        byte b = 1;
        if (i2 == 0) {
            m02.y(obj);
            x72 x72Var2 = new x72();
            x72Var2.h = qf0Var;
            pb0 pb0Var2 = new pb0((Object) zp0Var, x72Var2, b);
            try {
                fl0Var.k = (mq2) zp0Var;
                fl0Var.l = x72Var2;
                fl0Var.m = pb0Var2;
                fl0Var.o = 1;
                Object objA = pk0Var.a(pb0Var2, fl0Var);
                y20 y20Var = y20.h;
                if (objA == y20Var) {
                    return y20Var;
                }
                r2 = zp0Var;
                x72Var = x72Var2;
            } catch (a e2) {
                r1 = zp0Var;
                x72Var = x72Var2;
                e = e2;
                pb0Var = pb0Var2;
                r2 = r1;
                if (e.h != pb0Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pb0Var = fl0Var.m;
            x72Var = fl0Var.l;
            r1 = (zp0) fl0Var.k;
            try {
                m02.y(obj);
                r2 = r1;
            } catch (a e3) {
                e = e3;
                r2 = r1;
                if (e.h != pb0Var) {
                    throw e;
                }
            }
        }
        Object obj2 = x72Var.h;
        if (obj2 != qf0Var) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r2);
    }

    public static final boolean C(xw2 xw2Var) {
        xz1 xz1Var;
        k02 k02Var = xw2Var.c;
        sf0 sf0Var = (k02Var == null || (xz1Var = k02Var.b) == null) ? null : new sf0(xz1Var.b);
        boolean z = false;
        if (sf0Var != null && sf0Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final Object D(ue1 ue1Var) {
        Object objL = ue1Var.l();
        y31 y31Var = objL instanceof y31 ? (y31) objL : null;
        if (y31Var != null) {
            return y31Var.v;
        }
        return null;
    }

    public static final int E(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final cd1 F(cd1 cd1Var) {
        l41 l41Var = cd1Var.B.B;
        while (true) {
            l41 l41VarU = l41Var.u();
            l41 l41Var2 = null;
            if ((l41VarU != null ? l41VarU.o : null) == null) {
                cd1 cd1VarT0 = l41Var.L.d.T0();
                cd1VarT0.getClass();
                return cd1VarT0;
            }
            l41 l41VarU2 = l41Var.u();
            if (l41VarU2 != null) {
                l41Var2 = l41VarU2.o;
            }
            l41Var2.getClass();
            l41 l41VarU3 = l41Var.u();
            l41VarU3.getClass();
            l41Var = l41VarU3.o;
            l41Var.getClass();
        }
    }

    public static oa2 G(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        wg.m(jp1.h(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new oa2(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(sd0 sd0Var) {
        if (((qg1) sd0Var).h.u) {
            cu.W(sd0Var, 1).d1();
        }
    }

    public static final void I(p81 p81Var, vv2 vv2Var, xp1 xp1Var) {
        dw2 dw2Var;
        t31 t31VarC;
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            kw2 kw2VarD = p81Var.d();
            if (kw2VarD != null && (dw2Var = p81Var.e) != null && (t31VarC = p81Var.c()) != null) {
                p02.D(vv2Var, p81Var.a, kw2VarD.a, t31VarC, dw2Var, p81Var.b(), xp1Var);
            }
        } finally {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        }
    }

    public static dg1 L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    dg1 dg1Var = new dg1();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    dg1Var.k = byteBufferDuplicate;
                    dg1Var.h = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    dg1Var.i = i6;
                    dg1Var.j = ((ByteBuffer) dg1Var.k).getShort(i6);
                    return dg1Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final Object M(dx1 dx1Var, g42 g42Var) {
        g42Var.getClass();
        Object objB = dx1Var.get(g42Var);
        if (objB == null) {
            objB = g42Var.b();
        }
        return ((c33) objB).a(dx1Var);
    }

    public static final nx N(int i, hq0 hq0Var, dr0 dr0Var) {
        Object objK = dr0Var.K();
        if (objK == zy.a) {
            objK = new nx(i, true, hq0Var);
            dr0Var.f0(objK);
        }
        nx nxVar = (nx) objK;
        if (!uz0.g(nxVar.j, hq0Var)) {
            boolean z = nxVar.j == null;
            nxVar.j = hq0Var;
            if (!z && nxVar.i) {
                e72 e72Var = nxVar.k;
                if (e72Var != null) {
                    oz ozVar = e72Var.a;
                    if (ozVar != null) {
                        ozVar.s(e72Var, null);
                    }
                    nxVar.k = null;
                }
                ArrayList arrayList = nxVar.l;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        e72 e72Var2 = (e72) arrayList.get(i2);
                        oz ozVar2 = e72Var2.a;
                        if (ozVar2 != null) {
                            ozVar2.s(e72Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return nxVar;
    }

    public static final un2 O(boolean z, kp0 kp0Var, dr0 dr0Var, int i) {
        vo voVar = (vo) dr0Var.j(xo.a);
        u31 u31Var = (u31) dr0Var.j(uz.n);
        boolean zD = ((((i & 896) ^ 384) > 256 && dr0Var.f(kp0Var)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && dr0Var.g(false)) || (i & 6) == 4) | dr0Var.d(u31Var.ordinal()) | dr0Var.f(voVar) | ((((i & 112) ^ 48) > 32 && dr0Var.g(z)) || (i & 48) == 32);
        Object objK = dr0Var.K();
        if (zD || objK == zy.a) {
            objK = new un2(kp0Var, u31Var, z, voVar);
            dr0Var.f0(objK);
        }
        return (un2) objK;
    }

    public static final void P(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void Q(bs1 bs1Var, int i, Object obj) {
        bs1Var.l[(bs1Var.m - bs1Var.h[bs1Var.i - 1].b) + i] = obj;
    }

    public static final void R(bs1 bs1Var, int i, Object obj, int i2, Object obj2) {
        int i3 = bs1Var.m - bs1Var.h[bs1Var.i - 1].b;
        Object[] objArr = bs1Var.l;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void S(aw2 aw2Var, p81 p81Var, vv2 vv2Var, nu0 nu0Var, xp1 xp1Var) {
        ix0 ix0Var = p81Var.d;
        v10 v10Var = p81Var.v;
        v10 v10Var2 = p81Var.w;
        x72 x72Var = new x72();
        qb qbVar = new qb((Object) ix0Var, (Object) v10Var, (Object) x72Var, (byte) 17);
        j02 j02Var = aw2Var.a;
        j02Var.h(vv2Var, nu0Var, qbVar, v10Var2);
        dw2 dw2Var = new dw2(aw2Var, j02Var);
        aw2Var.b.set(dw2Var);
        x72Var.h = dw2Var;
        p81Var.e = dw2Var;
        I(p81Var, vv2Var, xp1Var);
    }

    public static final String T(Object[] objArr, int i, int i2, e0 e0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == e0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int U(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final dx1 V(i42[] i42VarArr, dx1 dx1Var, dx1 dx1Var2) {
        cx1 cx1Var = new cx1(dx1.k);
        for (i42 i42Var : i42VarArr) {
            g42 g42Var = i42Var.a;
            if (i42Var.g || !dx1Var.containsKey(g42Var)) {
                cx1Var.put(g42Var, g42Var.d(i42Var, (c33) dx1Var2.get(g42Var)));
            }
        }
        return cx1Var.a();
    }

    public static BiometricPrompt.CryptoObject W(fn fnVar) {
        IdentityCredential identityCredential;
        if (fnVar == null) {
            return null;
        }
        Cipher cipher = fnVar.b;
        if (cipher != null) {
            return j30.b(cipher);
        }
        Signature signature = fnVar.a;
        if (signature != null) {
            return j30.a(signature);
        }
        Mac mac = fnVar.c;
        if (mac != null) {
            return j30.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = fnVar.d) == null) {
            return null;
        }
        return k30.a(identityCredential);
    }

    public static final void X(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())) << 13);
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                li1.g("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    public static final void f(final boolean z, rg1 rg1Var, boolean z2, zs zsVar, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        final boolean z3;
        final zs zsVar2;
        zs zsVarK;
        rg1 rg1Var3;
        boolean z4;
        dr0Var.W(-1406741137);
        int i2 = i | (dr0Var.g(z) ? 4 : 2) | 208256;
        if (dr0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                zsVarK = c5.k(dr0Var);
                rg1Var3 = og1.h;
                z4 = true;
            } else {
                dr0Var.Q();
                rg1Var3 = rg1Var;
                z4 = z2;
                zsVarK = zsVar;
            }
            dr0Var.q();
            float fFloor = (float) Math.floor(((e90) dr0Var.j(uz.h)).A(2.0f));
            by2 by2Var = z ? by2.h : by2.i;
            dr0Var.V(2066218639);
            dr0Var.p(false);
            r(by2Var, null, new ko2(fFloor, 0.0f, 2, 0, 26), new ko2(fFloor, 0.0f, 0, 0, 30), rg1Var3, z4, zsVarK, dr0Var, 12804096);
            rg1Var2 = rg1Var3;
            z3 = z4;
            zsVar2 = zsVarK;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z3 = z2;
            zsVar2 = zsVar;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(z, rg1Var2, z3, zsVar2, i) { // from class: at
                public final /* synthetic */ boolean h;
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ zs k;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(49);
                    dt.f(this.h, this.i, this.j, this.k, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01da  */
    /* JADX WARN: Code duplicated, block: B:115:0x01de  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:123:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:131:0x0212  */
    /* JADX WARN: Code duplicated, block: B:133:0x0228  */
    /* JADX WARN: Code duplicated, block: B:135:0x022e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:139:0x0234  */
    /* JADX WARN: Code duplicated, block: B:141:0x0238  */
    /* JADX WARN: Code duplicated, block: B:142:0x023b  */
    /* JADX WARN: Code duplicated, block: B:143:0x023e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0244  */
    /* JADX WARN: Code duplicated, block: B:147:0x0247  */
    /* JADX WARN: Code duplicated, block: B:149:0x024a  */
    /* JADX WARN: Code duplicated, block: B:150:0x024d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0251  */
    /* JADX WARN: Code duplicated, block: B:153:0x0254  */
    /* JADX WARN: Code duplicated, block: B:155:0x0258  */
    /* JADX WARN: Code duplicated, block: B:157:0x026c  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        if (r14 == 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
    
        if (r15 != 2) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(boolean r25, defpackage.by2 r26, defpackage.rg1 r27, defpackage.zs r28, final defpackage.ko2 r29, final defpackage.ko2 r30, defpackage.dr0 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.g(boolean, by2, rg1, zs, ko2, ko2, dr0, int):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v15 i81
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void h(final defpackage.vv2 r63, defpackage.vp0 r64, defpackage.rg1 r65, final defpackage.xw2 r66, final defpackage.w53 r67, defpackage.vp0 r68, final defpackage.ui1 r69, defpackage.rl2 r70, final boolean r71, final int r72, final int r73, defpackage.nu0 r74, defpackage.b31 r75, final boolean r76, final defpackage.nx r77, defpackage.dr0 r78, int r79, int r80) {
        /*
            Method dump skipped, instruction units count: 2463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.h(vv2, vp0, rg1, xw2, w53, vp0, ui1, rl2, boolean, int, int, nu0, b31, boolean, nx, dr0, int, int):void");
    }

    public static final void i(rg1 rg1Var, kv2 kv2Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(2036174316);
        int i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i | (dr0Var.h(kv2Var) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ze1 ze1VarC = ho.c(c5.i, true);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1VarC);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            vs.a(kv2Var, nxVar, dr0Var, (i2 >> 3) & 126);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(rg1Var, kv2Var, nxVar, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x0226  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:0x023e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0244  */
    /* JADX WARN: Code duplicated, block: B:166:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0255  */
    /* JADX WARN: Code duplicated, block: B:170:0x0265  */
    /* JADX WARN: Code duplicated, block: B:173:0x0286  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:186:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:194:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:200:0x0302  */
    /* JADX WARN: Code duplicated, block: B:202:0x0308  */
    /* JADX WARN: Code duplicated, block: B:208:0x031f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0325  */
    /* JADX WARN: Code duplicated, block: B:216:0x0336  */
    /* JADX WARN: Code duplicated, block: B:218:0x033c  */
    /* JADX WARN: Code duplicated, block: B:224:0x034d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0353  */
    /* JADX WARN: Code duplicated, block: B:232:0x0364  */
    /* JADX WARN: Code duplicated, block: B:234:0x036a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0383 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:242:0x0394  */
    /* JADX WARN: Code duplicated, block: B:245:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:246:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:252:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:259:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:265:0x040d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0410  */
    /* JADX WARN: Code duplicated, block: B:269:0x0417 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x0419  */
    /* JADX WARN: Code duplicated, block: B:272:0x0466  */
    /* JADX WARN: Code duplicated, block: B:275:0x0474  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x015d, please report this as an issue */
    public static final void l(final rg1 rg1Var, b81 b81Var, final rt1 rt1Var, final boolean z, final tj0 tj0Var, final boolean z2, final j8 j8Var, bm bmVar, bh bhVar, cm cmVar, zg zgVar, final vp0 vp0Var, dr0 dr0Var, final int i, final int i2, final int i3) {
        int i4;
        bm bmVar2;
        final bh bhVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        b81 b81Var2;
        final cm cmVar2;
        e72 e72VarR;
        int i9;
        cm cmVar3;
        cm cmVar4;
        bh bhVar3;
        bm bmVar3;
        int i10;
        sj1 sj1VarC;
        boolean z4;
        Object objK;
        yy yyVar;
        p21 p21Var;
        boolean z5;
        Object objK2;
        Object objK3;
        x20 x20Var;
        bs0 bs0Var;
        jy1 jy1Var;
        int i11;
        boolean zD;
        Object t71Var;
        b81 b81Var3;
        int i12;
        p21 p21Var2;
        ks1 ks1Var;
        Object obj;
        boolean z6;
        rg1 rg1VarQ;
        boolean z7;
        Object objK4;
        boolean zD2;
        Object objK5;
        dr0Var.W(924924659);
        if ((i & 6) == 0) {
            i4 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= dr0Var.f(b81Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= dr0Var.f(rt1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= dr0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= dr0Var.g(z) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= dr0Var.f(tj0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= dr0Var.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= dr0Var.f(j8Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i13 = i3 & 512;
        if (i13 != 0) {
            i4 |= 805306368;
            bmVar2 = bmVar;
        } else {
            bmVar2 = bmVar;
            if ((i & 805306368) == 0) {
                i4 |= dr0Var.f(bmVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
            }
        }
        int i14 = i3 & 1024;
        if (i14 != 0) {
            bhVar2 = bhVar;
            i5 = i2 | 6;
        } else {
            bhVar2 = bhVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (dr0Var.f(bhVar2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i15 = i4;
        int i16 = i3 & 2048;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                i5 |= dr0Var.f(cmVar) ? 32 : 16;
            }
            i6 = i5;
            i7 = i3 & 4096;
            if (i7 != 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                if (dr0Var.f(zgVar)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i6 |= i8;
            }
            if ((i2 & 3072) == 0) {
                i6 |= dr0Var.h(vp0Var) ? 2048 : 1024;
            }
            if ((i15 & 306783379) == 306783378 || (i6 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dr0Var.N(i15 & 1, z3)) {
                dr0Var.S();
                if ((i & 1) != 0 || dr0Var.x()) {
                    i9 = i15 & (-234881025);
                    if (i13 != 0) {
                        bmVar2 = null;
                    }
                    if (i14 != 0) {
                        bhVar2 = null;
                    }
                    if (i16 != 0) {
                        cmVar3 = null;
                    } else {
                        cmVar3 = cmVar;
                    }
                    if (i7 != 0) {
                        cmVar4 = cmVar3;
                        bhVar3 = bhVar2;
                        bmVar3 = bmVar2;
                        zgVar = null;
                    } else {
                        cmVar4 = cmVar3;
                    }
                    dr0Var.q();
                    i10 = i9 >> 3;
                    int i17 = i10 & 14;
                    int i18 = ((i6 >> 6) & 112) | i17;
                    int i19 = i9;
                    sj1VarC = rz1.C(vp0Var, dr0Var);
                    int i20 = i6;
                    z4 = (((i18 & 14) ^ 6) <= 4 && dr0Var.f(b81Var)) || (i18 & 6) == 4;
                    objK = dr0Var.K();
                    yyVar = zy.a;
                    if (z4 || objK == yyVar) {
                        g61 g61Var = new g61();
                        g61Var.a = new iu1(Integer.MAX_VALUE);
                        g61Var.b = new iu1(Integer.MAX_VALUE);
                        vz1 vz1Var = vz1.k;
                        bb bbVar = new bb(sj1VarC, (byte) 17);
                        eg egVar = il2.a;
                        objK = new m51(new o90(new zi((Object) new o90(bbVar, vz1Var), (Object) b81Var, (Object) g61Var, (byte) 5), vz1Var), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                        dr0Var.f0(objK);
                    }
                    p21Var = (p21) objK;
                    int i21 = i19 >> 9;
                    int i22 = i17 | (i21 & 112);
                    z5 = ((((i22 & 14) ^ 6) <= 4 && dr0Var.f(b81Var)) || (i22 & 6) == 4) | ((((i22 & 112) ^ 48) <= 32 && dr0Var.g(z)) || (i22 & 48) == 32);
                    objK2 = dr0Var.K();
                    if (z5 || objK2 == yyVar) {
                        objK2 = new i71(b81Var, z);
                        dr0Var.f0(objK2);
                    }
                    h71 h71Var = (h71) objK2;
                    objK3 = dr0Var.K();
                    if (objK3 == yyVar) {
                        objK3 = h7.Y(dr0Var);
                        dr0Var.f0(objK3);
                    }
                    x20Var = (x20) objK3;
                    bs0Var = (bs0) dr0Var.j(uz.g);
                    jy1Var = ((Boolean) dr0Var.j(uz.x)).booleanValue() ? null : vn2.a;
                    i11 = i19 & 112;
                    int i23 = i20 << 18;
                    int i24 = (i19 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i20 << 27) & 1879048192);
                    zD = ((((i24 & 112) ^ 48) <= 32 && dr0Var.f(b81Var)) || (i24 & 48) == 32) | ((((i24 & 896) ^ 384) <= 256 && dr0Var.f(rt1Var)) || (i24 & 384) == 256) | ((((i24 & 7168) ^ 3072) <= 2048 && dr0Var.g(false)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) <= 16384 && dr0Var.g(z)) || (i24 & 24576) == 16384) | dr0Var.d(0) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && dr0Var.f(bmVar3)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && dr0Var.f(cmVar4)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && dr0Var.f(zgVar)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && dr0Var.f(bhVar3)) || (i24 & 805306368) == 536870912) | dr0Var.f(bs0Var) | dr0Var.f(jy1Var);
                    Object objK6 = dr0Var.K();
                    if (!zD || objK6 == yyVar) {
                        b81Var3 = b81Var;
                        i12 = 4;
                        t71Var = new t71(b81Var3, z, rt1Var, p21Var, bhVar3, zgVar, x20Var, bs0Var, jy1Var, bmVar3, cmVar4);
                        p21Var2 = p21Var;
                        dr0Var.f0(t71Var);
                    } else {
                        b81Var3 = b81Var;
                        t71Var = objK6;
                        i12 = 4;
                        p21Var2 = p21Var;
                    }
                    u61 u61Var = (u61) t71Var;
                    if (r4 != 0) {
                        ks1Var = ks1.h;
                    } else {
                        ks1Var = ks1.i;
                    }
                    if (z2) {
                        dr0Var.V(-2077147368);
                        zD2 = ((((i10 & 14) ^ 6) <= i12 && dr0Var.f(b81Var3)) || (i10 & 6) == i12) | dr0Var.d(0);
                        objK5 = dr0Var.K();
                        obj = yyVar;
                        if (zD2 || objK5 == obj) {
                            objK5 = new n71(b81Var3);
                            dr0Var.f0(objK5);
                        }
                        rg1VarQ = ie1.q((n71) objK5, b81Var3.p, ks1Var);
                        z6 = false;
                        dr0Var.p(false);
                    } else {
                        obj = yyVar;
                        z6 = false;
                        dr0Var.V(-2076718545);
                        dr0Var.p(false);
                        rg1VarQ = og1.h;
                    }
                    if (i11 == 32) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    objK4 = dr0Var.K();
                    if (z7 || objK4 == obj) {
                        objK4 = new i50(b81Var3, (byte) 2);
                        dr0Var.f0(objK4);
                    }
                    b81Var2 = b81Var3;
                    es.h(p21Var2, ie1.z(ia2.q(aa3.C(rg1Var.c(b81Var3.m).c(b81Var3.n), p21Var2, h71Var, ks1Var, z2).c(rg1VarQ), b81Var3.o), b81Var3, ks1Var, j8Var, z2, tj0Var, b81Var3.g, O(z, (kp0) objK4, dr0Var, i21 & 126)), b81Var2.q, u61Var, dr0Var, 0);
                    bhVar2 = bhVar3;
                    bmVar2 = bmVar3;
                    cmVar2 = cmVar4;
                } else {
                    dr0Var.Q();
                    i9 = i15 & (-234881025);
                    cmVar4 = cmVar;
                }
                bhVar3 = bhVar2;
                bmVar3 = bmVar2;
                dr0Var.q();
                i10 = i9 >> 3;
                int i110 = i10 & 14;
                int i111 = ((i6 >> 6) & 112) | i110;
                int i112 = i9;
                sj1VarC = rz1.C(vp0Var, dr0Var);
                int i25 = i6;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objK = dr0Var.K();
                yyVar = zy.a;
                if (z4) {
                    g61 g61Var2 = new g61();
                    g61Var2.a = new iu1(Integer.MAX_VALUE);
                    g61Var2.b = new iu1(Integer.MAX_VALUE);
                    vz1 vz1Var2 = vz1.k;
                    bb bbVar2 = new bb(sj1VarC, (byte) 17);
                    eg egVar2 = il2.a;
                    objK = new m51(new o90(new zi((Object) new o90(bbVar2, vz1Var2), (Object) b81Var, (Object) g61Var2, (byte) 5), vz1Var2), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                    dr0Var.f0(objK);
                } else {
                    g61 g61Var3 = new g61();
                    g61Var3.a = new iu1(Integer.MAX_VALUE);
                    g61Var3.b = new iu1(Integer.MAX_VALUE);
                    vz1 vz1Var3 = vz1.k;
                    bb bbVar3 = new bb(sj1VarC, (byte) 17);
                    eg egVar3 = il2.a;
                    objK = new m51(new o90(new zi((Object) new o90(bbVar3, vz1Var3), (Object) b81Var, (Object) g61Var3, (byte) 5), vz1Var3), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                    dr0Var.f0(objK);
                }
                p21Var = (p21) objK;
                int i26 = i112 >> 9;
                int i27 = i110 | (i26 & 112);
                z5 = ((((i27 & 14) ^ 6) <= 4 && dr0Var.f(b81Var)) || (i27 & 6) == 4) | ((((i27 & 112) ^ 48) <= 32 && dr0Var.g(z)) || (i27 & 48) == 32);
                objK2 = dr0Var.K();
                if (z5) {
                    objK2 = new i71(b81Var, z);
                    dr0Var.f0(objK2);
                } else {
                    objK2 = new i71(b81Var, z);
                    dr0Var.f0(objK2);
                }
                h71 h71Var2 = (h71) objK2;
                objK3 = dr0Var.K();
                if (objK3 == yyVar) {
                    objK3 = h7.Y(dr0Var);
                    dr0Var.f0(objK3);
                }
                x20Var = (x20) objK3;
                bs0Var = (bs0) dr0Var.j(uz.g);
                jy1Var = ((Boolean) dr0Var.j(uz.x)).booleanValue() ? null : vn2.a;
                i11 = i112 & 112;
                int i28 = i25 << 18;
                int i29 = (i112 & 65520) | (i26 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | ((i25 << 27) & 1879048192);
                zD = ((((i29 & 112) ^ 48) <= 32 && dr0Var.f(b81Var)) || (i29 & 48) == 32) | ((((i29 & 896) ^ 384) <= 256 && dr0Var.f(rt1Var)) || (i29 & 384) == 256) | ((((i29 & 7168) ^ 3072) <= 2048 && dr0Var.g(false)) || (i29 & 3072) == 2048) | ((((57344 & i29) ^ 24576) <= 16384 && dr0Var.g(z)) || (i29 & 24576) == 16384) | dr0Var.d(0) | ((((i29 & 3670016) ^ 1572864) <= 1048576 && dr0Var.f(bmVar3)) || (i29 & 1572864) == 1048576) | ((((i29 & 29360128) ^ 12582912) <= 8388608 && dr0Var.f(cmVar4)) || (i29 & 12582912) == 8388608) | ((((i29 & 234881024) ^ 100663296) <= 67108864 && dr0Var.f(zgVar)) || (i29 & 100663296) == 67108864) | ((((i29 & 1879048192) ^ 805306368) <= 536870912 && dr0Var.f(bhVar3)) || (i29 & 805306368) == 536870912) | dr0Var.f(bs0Var) | dr0Var.f(jy1Var);
                Object objK7 = dr0Var.K();
                if (zD) {
                    b81Var3 = b81Var;
                    i12 = 4;
                    t71Var = new t71(b81Var3, z, rt1Var, p21Var, bhVar3, zgVar, x20Var, bs0Var, jy1Var, bmVar3, cmVar4);
                    p21Var2 = p21Var;
                    dr0Var.f0(t71Var);
                } else {
                    b81Var3 = b81Var;
                    i12 = 4;
                    t71Var = new t71(b81Var3, z, rt1Var, p21Var, bhVar3, zgVar, x20Var, bs0Var, jy1Var, bmVar3, cmVar4);
                    p21Var2 = p21Var;
                    dr0Var.f0(t71Var);
                }
                u61 u61Var2 = (u61) t71Var;
                if (r4 != 0) {
                    ks1Var = ks1.h;
                } else {
                    ks1Var = ks1.i;
                }
                if (z2) {
                    dr0Var.V(-2077147368);
                    zD2 = ((((i10 & 14) ^ 6) <= i12 && dr0Var.f(b81Var3)) || (i10 & 6) == i12) | dr0Var.d(0);
                    objK5 = dr0Var.K();
                    obj = yyVar;
                    if (zD2) {
                        objK5 = new n71(b81Var3);
                        dr0Var.f0(objK5);
                    } else {
                        objK5 = new n71(b81Var3);
                        dr0Var.f0(objK5);
                    }
                    rg1VarQ = ie1.q((n71) objK5, b81Var3.p, ks1Var);
                    z6 = false;
                    dr0Var.p(false);
                } else {
                    obj = yyVar;
                    z6 = false;
                    dr0Var.V(-2076718545);
                    dr0Var.p(false);
                    rg1VarQ = og1.h;
                }
                if (i11 == 32) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                objK4 = dr0Var.K();
                if (z7) {
                    objK4 = new i50(b81Var3, (byte) 2);
                    dr0Var.f0(objK4);
                } else {
                    objK4 = new i50(b81Var3, (byte) 2);
                    dr0Var.f0(objK4);
                }
                b81Var2 = b81Var3;
                es.h(p21Var2, ie1.z(ia2.q(aa3.C(rg1Var.c(b81Var3.m).c(b81Var3.n), p21Var2, h71Var2, ks1Var, z2).c(rg1VarQ), b81Var3.o), b81Var3, ks1Var, j8Var, z2, tj0Var, b81Var3.g, O(z, (kp0) objK4, dr0Var, i26 & 126)), b81Var2.q, u61Var2, dr0Var, 0);
                bhVar2 = bhVar3;
                bmVar2 = bmVar3;
                cmVar2 = cmVar4;
            } else {
                b81Var2 = b81Var;
                dr0Var.Q();
                cmVar2 = cmVar;
                zgVar = zgVar;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                final b81 b81Var4 = b81Var2;
                final bm bmVar4 = bmVar2;
                final zg zgVar2 = zgVar;
                e72VarR.d = new zp0() { // from class: r71
                    @Override // defpackage.zp0
                    public final Object f(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = m02.A(i | 1);
                        int iA2 = m02.A(i2);
                        dt.l(rg1Var, b81Var4, rt1Var, z, tj0Var, z2, j8Var, bmVar4, bhVar2, cmVar2, zgVar2, vp0Var, (dr0) obj2, iA, iA2, i3);
                        return j23.a;
                    }
                };
            }
        }
        i5 |= 48;
        i6 = i5;
        i7 = i3 & 4096;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i2 & 384) == 0) {
            if (dr0Var.f(zgVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i2 & 3072) == 0) {
            i6 |= dr0Var.h(vp0Var) ? 2048 : 1024;
        }
        if ((i15 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (dr0Var.N(i15 & 1, z3)) {
            dr0Var.S();
            if ((i & 1) != 0) {
                i9 = i15 & (-234881025);
                if (i13 != 0) {
                    bmVar2 = null;
                }
                if (i14 != 0) {
                    bhVar2 = null;
                }
                if (i16 != 0) {
                    cmVar3 = null;
                } else {
                    cmVar3 = cmVar;
                }
                if (i7 != 0) {
                    cmVar4 = cmVar3;
                    bhVar3 = bhVar2;
                    bmVar3 = bmVar2;
                    zgVar = null;
                } else {
                    cmVar4 = cmVar3;
                    bhVar3 = bhVar2;
                    bmVar3 = bmVar2;
                }
            } else {
                i9 = i15 & (-234881025);
                if (i13 != 0) {
                    bmVar2 = null;
                }
                if (i14 != 0) {
                    bhVar2 = null;
                }
                if (i16 != 0) {
                    cmVar3 = null;
                } else {
                    cmVar3 = cmVar;
                }
                if (i7 != 0) {
                    cmVar4 = cmVar3;
                    bhVar3 = bhVar2;
                    bmVar3 = bmVar2;
                    zgVar = null;
                } else {
                    cmVar4 = cmVar3;
                    bhVar3 = bhVar2;
                    bmVar3 = bmVar2;
                }
            }
            dr0Var.q();
            i10 = i9 >> 3;
            int i113 = i10 & 14;
            int i114 = ((i6 >> 6) & 112) | i113;
            int i115 = i9;
            sj1VarC = rz1.C(vp0Var, dr0Var);
            int i210 = i6;
            if (((i114 & 14) ^ 6) <= 4) {
            }
            objK = dr0Var.K();
            yyVar = zy.a;
            if (z4) {
                g61 g61Var4 = new g61();
                g61Var4.a = new iu1(Integer.MAX_VALUE);
                g61Var4.b = new iu1(Integer.MAX_VALUE);
                vz1 vz1Var4 = vz1.k;
                bb bbVar4 = new bb(sj1VarC, (byte) 17);
                eg egVar4 = il2.a;
                objK = new m51(new o90(new zi((Object) new o90(bbVar4, vz1Var4), (Object) b81Var, (Object) g61Var4, (byte) 5), vz1Var4), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                dr0Var.f0(objK);
            } else {
                g61 g61Var5 = new g61();
                g61Var5.a = new iu1(Integer.MAX_VALUE);
                g61Var5.b = new iu1(Integer.MAX_VALUE);
                vz1 vz1Var5 = vz1.k;
                bb bbVar5 = new bb(sj1VarC, (byte) 17);
                eg egVar5 = il2.a;
                objK = new m51(new o90(new zi((Object) new o90(bbVar5, vz1Var5), (Object) b81Var, (Object) g61Var5, (byte) 5), vz1Var5), kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                dr0Var.f0(objK);
            }
            p21Var = (p21) objK;
            int i211 = i115 >> 9;
            int i212 = i113 | (i211 & 112);
            z5 = ((((i212 & 14) ^ 6) <= 4 && dr0Var.f(b81Var)) || (i212 & 6) == 4) | ((((i212 & 112) ^ 48) <= 32 && dr0Var.g(z)) || (i212 & 48) == 32);
            objK2 = dr0Var.K();
            if (z5) {
                objK2 = new i71(b81Var, z);
                dr0Var.f0(objK2);
            } else {
                objK2 = new i71(b81Var, z);
                dr0Var.f0(objK2);
            }
            h71 h71Var3 = (h71) objK2;
            objK3 = dr0Var.K();
            if (objK3 == yyVar) {
                objK3 = h7.Y(dr0Var);
                dr0Var.f0(objK3);
            }
            x20Var = (x20) objK3;
            bs0Var = (bs0) dr0Var.j(uz.g);
            jy1Var = ((Boolean) dr0Var.j(uz.x)).booleanValue() ? null : vn2.a;
            i11 = i115 & 112;
            int i213 = i210 << 18;
            int i214 = (i115 & 65520) | (i211 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | ((i210 << 27) & 1879048192);
            zD = ((((i214 & 112) ^ 48) <= 32 && dr0Var.f(b81Var)) || (i214 & 48) == 32) | ((((i214 & 896) ^ 384) <= 256 && dr0Var.f(rt1Var)) || (i214 & 384) == 256) | ((((i214 & 7168) ^ 3072) <= 2048 && dr0Var.g(false)) || (i214 & 3072) == 2048) | ((((57344 & i214) ^ 24576) <= 16384 && dr0Var.g(z)) || (i214 & 24576) == 16384) | dr0Var.d(0) | ((((i214 & 3670016) ^ 1572864) <= 1048576 && dr0Var.f(bmVar3)) || (i214 & 1572864) == 1048576) | ((((i214 & 29360128) ^ 12582912) <= 8388608 && dr0Var.f(cmVar4)) || (i214 & 12582912) == 8388608) | ((((i214 & 234881024) ^ 100663296) <= 67108864 && dr0Var.f(zgVar)) || (i214 & 100663296) == 67108864) | ((((i214 & 1879048192) ^ 805306368) <= 536870912 && dr0Var.f(bhVar3)) || (i214 & 805306368) == 536870912) | dr0Var.f(bs0Var) | dr0Var.f(jy1Var);
            Object objK8 = dr0Var.K();
            if (zD) {
                b81Var3 = b81Var;
                i12 = 4;
                t71Var = new t71(b81Var3, z, rt1Var, p21Var, bhVar3, zgVar, x20Var, bs0Var, jy1Var, bmVar3, cmVar4);
                p21Var2 = p21Var;
                dr0Var.f0(t71Var);
            } else {
                b81Var3 = b81Var;
                i12 = 4;
                t71Var = new t71(b81Var3, z, rt1Var, p21Var, bhVar3, zgVar, x20Var, bs0Var, jy1Var, bmVar3, cmVar4);
                p21Var2 = p21Var;
                dr0Var.f0(t71Var);
            }
            u61 u61Var3 = (u61) t71Var;
            if (r4 != 0) {
                ks1Var = ks1.h;
            } else {
                ks1Var = ks1.i;
            }
            if (z2) {
                dr0Var.V(-2077147368);
                zD2 = ((((i10 & 14) ^ 6) <= i12 && dr0Var.f(b81Var3)) || (i10 & 6) == i12) | dr0Var.d(0);
                objK5 = dr0Var.K();
                obj = yyVar;
                if (zD2) {
                    objK5 = new n71(b81Var3);
                    dr0Var.f0(objK5);
                } else {
                    objK5 = new n71(b81Var3);
                    dr0Var.f0(objK5);
                }
                rg1VarQ = ie1.q((n71) objK5, b81Var3.p, ks1Var);
                z6 = false;
                dr0Var.p(false);
            } else {
                obj = yyVar;
                z6 = false;
                dr0Var.V(-2076718545);
                dr0Var.p(false);
                rg1VarQ = og1.h;
            }
            if (i11 == 32) {
                z7 = true;
            } else {
                z7 = z6;
            }
            objK4 = dr0Var.K();
            if (z7) {
                objK4 = new i50(b81Var3, (byte) 2);
                dr0Var.f0(objK4);
            } else {
                objK4 = new i50(b81Var3, (byte) 2);
                dr0Var.f0(objK4);
            }
            b81Var2 = b81Var3;
            es.h(p21Var2, ie1.z(ia2.q(aa3.C(rg1Var.c(b81Var3.m).c(b81Var3.n), p21Var2, h71Var3, ks1Var, z2).c(rg1VarQ), b81Var3.o), b81Var3, ks1Var, j8Var, z2, tj0Var, b81Var3.g, O(z, (kp0) objK4, dr0Var, i211 & 126)), b81Var2.q, u61Var3, dr0Var, 0);
            bhVar2 = bhVar3;
            bmVar2 = bmVar3;
            cmVar2 = cmVar4;
        } else {
            b81Var2 = b81Var;
            dr0Var.Q();
            cmVar2 = cmVar;
            zgVar = zgVar;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final b81 b81Var5 = b81Var2;
            final bm bmVar5 = bmVar2;
            final zg zgVar3 = zgVar;
            e72VarR.d = new zp0() { // from class: r71
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = m02.A(i | 1);
                    int iA2 = m02.A(i2);
                    dt.l(rg1Var, b81Var5, rt1Var, z, tj0Var, z2, j8Var, bmVar5, bhVar2, cmVar2, zgVar3, vp0Var, (dr0) obj2, iA, iA2, i3);
                    return j23.a;
                }
            };
        }
    }

    public static final void m(final kl1 kl1Var, final rg1 rg1Var, dm dmVar, rt rtVar, rt rtVar2, rt rtVar3, rt rtVar4, yx yxVar, yx yxVar2, final vp0 vp0Var, dr0 dr0Var, final int i) {
        final dm dmVar2;
        final rt rtVar5;
        final rt rtVar6;
        final rt rtVar7;
        final rt rtVar8;
        final yx yxVar3;
        final yx yxVar4;
        dm dmVar3;
        rt rtVar9;
        rt rtVar10;
        int i2;
        yx yxVar5;
        dr0Var.W(621695386);
        int i3 = i | (dr0Var.h(kl1Var) ? 4 : 2) | (dr0Var.f(rg1Var) ? 256 : 128) | 844852224;
        int i4 = '6' | (dr0Var.h(vp0Var) ? (char) 256 : (char) 128);
        if (dr0Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                dmVar3 = c5.i;
                rtVar9 = ie1.v;
                rtVar10 = ie1.w;
                i2 = i3 & (-264241153);
                yx yxVar6 = ie1.x;
                yxVar5 = ie1.y;
                rtVar8 = rtVar10;
                yxVar3 = yxVar6;
                rtVar7 = rtVar9;
            } else {
                dr0Var.Q();
                i2 = i3 & (-264241153);
                dmVar3 = dmVar;
                rtVar9 = rtVar;
                rtVar10 = rtVar2;
                rtVar7 = rtVar3;
                yxVar5 = yxVar2;
                rtVar8 = rtVar4;
                yxVar3 = yxVar;
            }
            dr0Var.q();
            boolean z = (i4 & 896) == 256;
            Object objK = dr0Var.K();
            if (z || objK == zy.a) {
                hl1 hl1Var = new hl1(kl1Var.b.s);
                vp0Var.h(hl1Var);
                objK = hl1Var.c();
                dr0Var.f0(objK);
            }
            rtVar6 = rtVar10;
            dmVar2 = dmVar3;
            rtVar5 = rtVar9;
            yxVar4 = yxVar5;
            o(kl1Var, (gl1) objK, rg1Var, dmVar2, rtVar5, rtVar6, rtVar7, rtVar8, yxVar3, yxVar4, dr0Var, (i2 & 8078) | 906190848, 6);
        } else {
            dr0Var.Q();
            dmVar2 = dmVar;
            rtVar5 = rtVar;
            rtVar6 = rtVar2;
            rtVar7 = rtVar3;
            rtVar8 = rtVar4;
            yxVar3 = yxVar;
            yxVar4 = yxVar2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var, dmVar2, rtVar5, rtVar6, rtVar7, rtVar8, yxVar3, yxVar4, vp0Var, i) { // from class: nl1
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ dm j;
                public final /* synthetic */ rt k;
                public final /* synthetic */ rt l;
                public final /* synthetic */ rt m;
                public final /* synthetic */ rt n;
                public final /* synthetic */ yx o;
                public final /* synthetic */ yx p;
                public final /* synthetic */ vp0 q;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(49);
                    dt.m(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31071. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void o(defpackage.kl1 r45, defpackage.gl1 r46, defpackage.rg1 r47, defpackage.dm r48, defpackage.rt r49, defpackage.rt r50, defpackage.rt r51, defpackage.rt r52, defpackage.yx r53, defpackage.yx r54, defpackage.dr0 r55, int r56, int r57) {
        /*
            Method dump skipped, instruction units count: 3107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.o(kl1, gl1, rg1, dm, rt, rt, rt, rt, yx, yx, dr0, int, int):void");
    }

    public static final void p(kv2 kv2Var, boolean z, dr0 dr0Var, int i) {
        kw2 kw2VarD;
        dr0Var.W(626339208);
        int i2 = (dr0Var.h(kv2Var) ? 4 : 2) | i | (dr0Var.g(z) ? 32 : 16);
        if (!dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            dr0Var.Q();
        } else if (z) {
            dr0Var.V(1530097388);
            p81 p81Var = kv2Var.d;
            jw2 jw2Var = null;
            if (p81Var != null && (kw2VarD = p81Var.d()) != null) {
                jw2 jw2Var2 = kw2VarD.a;
                p81 p81Var2 = kv2Var.d;
                if (!(p81Var2 != null ? p81Var2.p : true)) {
                    jw2Var = jw2Var2;
                }
            }
            if (jw2Var == null) {
                dr0Var.V(1530097387);
                dr0Var.p(false);
            } else {
                dr0Var.V(1530097388);
                if (qw2.c(kv2Var.l().b)) {
                    dr0Var.V(2110860558);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(2109807302);
                    int iS = kv2Var.b.s((int) (kv2Var.l().b >> 32));
                    int iS2 = kv2Var.b.s((int) (kv2Var.l().b & 4294967295L));
                    u82 u82VarA = jw2Var.a(iS);
                    u82 u82VarA2 = jw2Var.a(Math.max(iS2 - 1, 0));
                    p81 p81Var3 = kv2Var.d;
                    if (p81Var3 == null || !((Boolean) p81Var3.m.getValue()).booleanValue()) {
                        dr0Var.V(2110490542);
                        dr0Var.p(false);
                    } else {
                        dr0Var.V(2110225306);
                        cy1.c(true, u82VarA, kv2Var, dr0Var, ((i2 << 6) & 896) | 6);
                        dr0Var.p(false);
                    }
                    p81 p81Var4 = kv2Var.d;
                    if (p81Var4 == null || !((Boolean) p81Var4.n.getValue()).booleanValue()) {
                        dr0Var.V(2110838734);
                        dr0Var.p(false);
                    } else {
                        dr0Var.V(2110574459);
                        cy1.c(false, u82VarA2, kv2Var, dr0Var, ((i2 << 6) & 896) | 6);
                        dr0Var.p(false);
                    }
                    dr0Var.p(false);
                }
                p81 p81Var5 = kv2Var.d;
                if (p81Var5 != null) {
                    lu1 lu1Var = p81Var5.l;
                    if (!uz0.g(kv2Var.t.a.i, kv2Var.l().a.i)) {
                        lu1Var.setValue(Boolean.FALSE);
                    }
                    if (p81Var5.b()) {
                        if (((Boolean) lu1Var.getValue()).booleanValue()) {
                            kv2Var.s();
                        } else {
                            kv2Var.m();
                        }
                    }
                }
                dr0Var.p(false);
            }
            dr0Var.p(false);
        } else {
            dr0Var.V(1989076778);
            dr0Var.p(false);
            kv2Var.m();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new t7(kv2Var, z, i);
        }
    }

    public static final void q(kv2 kv2Var, dr0 dr0Var, int i) {
        od odVarK;
        dr0Var.W(-1436003720);
        byte b = 2;
        int i2 = (dr0Var.h(kv2Var) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            p81 p81Var = kv2Var.d;
            if (p81Var == null || !((Boolean) p81Var.o.getValue()).booleanValue() || (odVarK = kv2Var.k()) == null || odVarK.i.length() <= 0) {
                dr0Var.V(-2111042550);
                dr0Var.p(false);
            } else {
                dr0Var.V(-2112351432);
                boolean zF = dr0Var.f(kv2Var);
                Object objK = dr0Var.K();
                Object obj = zy.a;
                if (zF || objK == obj) {
                    objK = new gv2(kv2Var);
                    dr0Var.f0(objK);
                }
                zt2 zt2Var = (zt2) objK;
                e90 e90Var = (e90) dr0Var.j(uz.h);
                xp1 xp1Var = kv2Var.b;
                long j = kv2Var.l().b;
                int i3 = qw2.c;
                int iS = xp1Var.s((int) (j >> 32));
                p81 p81Var2 = kv2Var.d;
                kw2 kw2VarD = p81Var2 != null ? p81Var2.d() : null;
                kw2VarD.getClass();
                jw2 jw2Var = kw2VarD.a;
                r72 r72VarC = jw2Var.c(cy1.n(iS, 0, jw2Var.a.a.i.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((e90Var.A(2.0f) / 2.0f) + r72VarC.a)) << 32) | (((long) Float.floatToRawIntBits(r72VarC.d)) & 4294967295L);
                boolean zE = dr0Var.e(jFloatToRawIntBits);
                Object objK2 = dr0Var.K();
                if (zE || objK2 == obj) {
                    objK2 = new d20(jFloatToRawIntBits);
                    dr0Var.f0(objK2);
                }
                yp1 yp1Var = (yp1) objK2;
                boolean zH = dr0Var.h(zt2Var) | dr0Var.h(kv2Var);
                Object objK3 = dr0Var.K();
                if (zH || objK3 == obj) {
                    objK3 = new g20(zt2Var, kv2Var);
                    dr0Var.f0(objK3);
                }
                rg1 rg1VarA = oq2.a(og1.h, zt2Var, (PointerInputEventHandler) objK3);
                boolean zE2 = dr0Var.e(jFloatToRawIntBits);
                Object objK4 = dr0Var.K();
                if (zE2 || objK4 == obj) {
                    objK4 = new u7(jFloatToRawIntBits, b);
                    dr0Var.f0(objK4);
                }
                w7.a(yp1Var, tg2.a(rg1VarA, false, (vp0) objK4), 0L, dr0Var, 0);
                dr0Var.p(false);
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(kv2Var, i, (byte) 6);
        }
    }

    public static final void r(by2 by2Var, kp0 kp0Var, ko2 ko2Var, ko2 ko2Var2, rg1 rg1Var, boolean z, zs zsVar, dr0 dr0Var, int i) {
        int i2;
        by2 by2Var2;
        rg1 rg1VarZ;
        rg1 rg1Var2;
        dr0Var.W(-406243761);
        if ((i & 6) == 0) {
            i2 = (dr0Var.d(by2Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(ko2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(ko2Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.f(rg1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dr0Var.f(zsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dr0Var.f(null) ? 8388608 : 4194304;
        }
        if (dr0Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            dr0Var.S();
            if ((i & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            if (kp0Var != null) {
                by2Var2 = by2Var;
                rg1VarZ = ia2.z(kp0Var, y92.a(et.d / 2.0f, 4, 0L, false), new ba2(1), by2Var2, z);
                mt0 mt0Var = kz0.a;
                rg1Var2 = hg1.h;
            } else {
                by2Var2 = by2Var;
                rg1VarZ = og1.h;
                rg1Var2 = rg1VarZ;
            }
            rg1 rg1VarG = t03.G(rg1Var.c(rg1Var2).c(rg1VarZ), 2.0f);
            int i3 = ((i2 >> 15) & 14) | ((i2 << 3) & 112) | ((i2 >> 9) & 7168);
            int i4 = i2 << 6;
            g(z, by2Var2, rg1VarG, zsVar, ko2Var, ko2Var2, dr0Var, i3 | (57344 & i4) | (i4 & 458752));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new bt(by2Var, kp0Var, ko2Var, ko2Var2, rg1Var, z, zsVar, i);
        }
    }

    public static final xq0 s(xq0 xq0Var) {
        if (xq0Var == null) {
            xq0Var = null;
        }
        if (xq0Var != null) {
            return xq0Var;
        }
        ez.b("Inconsistent composition");
        wg.k();
        return null;
    }

    public static final a t(v60 v60Var) {
        v60Var.getClass();
        a aVar = v60Var instanceof a ? (a) v60Var : null;
        if (aVar != null) {
            return aVar;
        }
        wg.o(z72.a(v60Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void u(b bVar) {
        bVar.getClass();
        if ((bVar instanceof b ? bVar : null) != null) {
            return;
        }
        wg.o(z72.a(bVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final int v(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final boolean w(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ag0.h;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    wg2 wg2Var = (wg2) obj2;
                    wg2 wg2Var2 = (wg2) obj;
                    arrayList2.add(new up1((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wg2Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (wg2Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wg2Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (wg2Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((up1) dv.x0(list)).a;
            } else {
                if (list.isEmpty()) {
                    gb1.c("Empty collection can't be reduced.");
                }
                Object objX0 = dv.x0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objX0 = new up1(up1.e(((up1) objX0).a, ((up1) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((up1) objX0).a;
            }
            if (Float.intBitsToFloat((int) (j & 4294967295L)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static cn0 x(Context context) {
        ProviderInfo providerInfo;
        an0 an0Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        m02.c(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (android.content.pm.Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                an0Var = new an0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException unused) {
                an0Var = null;
            }
        } else {
            an0Var = null;
        }
        if (an0Var != null) {
            return new cn0(new bn0(context, an0Var));
        }
        return null;
    }

    public static final tm0 y(Context context) {
        vz1 vz1Var = new vz1((byte) 19);
        context.getApplicationContext();
        return new tm0(vz1Var, new p8(Build.VERSION.SDK_INT >= 31 ? rn0.a.a(context) : 0));
    }

    public static final void z(p81 p81Var) {
        dw2 dw2Var = p81Var.e;
        if (dw2Var != null) {
            p81Var.v.h(vv2.a((vv2) p81Var.d.i, null, 0L, 3));
            aw2 aw2Var = dw2Var.a;
            AtomicReference atomicReference = aw2Var.b;
            while (!atomicReference.compareAndSet(dw2Var, null)) {
                if (atomicReference.get() != dw2Var) {
                }
            }
            aw2Var.a.f();
        }
        p81Var.e = null;
    }

    public abstract void J(Throwable th);

    public abstract void K(wk wkVar);
}
