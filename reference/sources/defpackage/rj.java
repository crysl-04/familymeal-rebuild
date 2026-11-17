package defpackage;

import android.content.Context;
import android.net.Uri;
import com.familymeal.app.MealPlannerApp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rj extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.m = obj;
        this.n = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) throws Throwable {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((rj) p((m10) obj2, (ru1) obj)).r(j23Var);
            case 4:
                ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
                return j23Var;
            case 5:
                ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
                return j23Var;
            case 6:
                ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
                return j23Var;
            case 7:
                return ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((rj) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new rj((MealPlannerApp) this.m, (String) obj2, m10Var, (byte) 0);
            case 1:
                return new rj((Context) this.m, (Uri) obj2, m10Var, (byte) 1);
            case 2:
                rj rjVar = new rj((q30) obj2, m10Var, (byte) 2);
                rjVar.m = obj;
                return rjVar;
            case 3:
                rj rjVar2 = new rj(m10Var, (vp0) obj2);
                rjVar2.m = obj;
                return rjVar2;
            case 4:
                return new rj((lw0) this.m, (kp0) obj2, m10Var, (byte) 4);
            case 5:
                return new rj((ay1) this.m, (kp0) obj2, m10Var, (byte) 5);
            case 6:
                return new rj((x62) this.m, (kp0) obj2, m10Var, (byte) 6);
            case 7:
                rj rjVar3 = new rj((zp0) obj2, m10Var, (byte) 7);
                rjVar3.m = obj;
                return rjVar3;
            default:
                return new rj((bz1) this.m, (ez1) obj2, m10Var, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0158 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #0 {all -> 0x01a3, blocks: (B:50:0x0146, B:52:0x014a, B:54:0x0152, B:57:0x0158, B:66:0x0197, B:67:0x01a2), top: B:79:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #0 {all -> 0x01a3, blocks: (B:50:0x0146, B:52:0x014a, B:54:0x0152, B:57:0x0158, B:66:0x0197, B:67:0x01a2), top: B:79:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        String string;
        byte b = this.l;
        int i = 0;
        boolean z = false;
        j23 j23Var = j23.a;
        m10 m10Var = null;
        byte b2 = 1;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                m02.y(obj);
                ok okVarA = ((MealPlannerApp) this.m).a();
                String str = (String) obj2;
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                okVarA.getClass();
                str.getClass();
                fk fkVar = fk.a;
                gk gkVarA = fk.a(str, localDateNow);
                return new hk(gkVarA, gkVarA.c.size(), gkVarA.d.size(), gkVarA.e.size(), gkVarA.f.size(), gkVarA.a, gkVarA.b, 0);
            case 1:
                m02.y(obj);
                InputStream inputStreamOpenInputStream = ((Context) this.m).getContentResolver().openInputStream((Uri) obj2);
                if (inputStreamOpenInputStream == null) {
                    throw new g40(lt.P("无法打开文件"));
                }
                try {
                    byte[] bArr = new byte[5242881];
                    while (i < 5242881) {
                        int i2 = inputStreamOpenInputStream.read(bArr, i, 5242881 - i);
                        if (i2 < 0) {
                            if (i <= 5242880) {
                                throw new g40(lt.P("文件太大（超过 5 MB），不是有效的备份"));
                            }
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
                            inputStreamOpenInputStream.close();
                            CharsetDecoder charsetDecoderNewDecoder = ws.a.newDecoder();
                            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                            try {
                                string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrCopyOf)).toString();
                                string.getClass();
                                if (string.startsWith("\ufeff")) {
                                    return string.substring(1);
                                }
                                return string;
                            } catch (CharacterCodingException unused) {
                                throw new g40(lt.P("文件不是 UTF-8 文本，不是有效的备份"));
                            }
                        }
                        i += i2;
                    }
                    if (i <= 5242880) {
                        throw new g40(lt.P("文件太大（超过 5 MB），不是有效的备份"));
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArr, i);
                    inputStreamOpenInputStream.close();
                    CharsetDecoder charsetDecoderNewDecoder2 = ws.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                    string = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(bArrCopyOf2)).toString();
                    string.getClass();
                    if (string.startsWith("\ufeff")) {
                        return string.substring(1);
                    }
                    return string;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vs.s(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            case 2:
                m02.y(obj);
                x20 x20Var = (x20) this.m;
                q30 q30Var = (q30) obj2;
                s01 s01Var = (s01) q30Var.b.getAndSet(null);
                AtomicReference atomicReference = q30Var.b;
                dn2 dn2VarP = ie1.p(x20Var, null, new y8(s01Var, q30Var, m10Var, b2), 3);
                while (!atomicReference.compareAndSet(null, dn2VarP)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 3:
                m02.y(obj);
                ru1 ru1Var = (ru1) this.m;
                ru1Var.getClass();
                return ((vp0) obj2).h(ru1Var.a());
            case 4:
                m02.y(obj);
                if (((Boolean) ((lw0) this.m).o.getValue()).booleanValue()) {
                    ((kp0) obj2).a();
                }
                return j23Var;
            case 5:
                m02.y(obj);
                if (((Boolean) ((ay1) this.m).u.getValue()).booleanValue()) {
                    ((kp0) obj2).a();
                }
                return j23Var;
            case 6:
                m02.y(obj);
                if (((Boolean) ((x62) this.m).r.getValue()).booleanValue()) {
                    ((kp0) obj2).a();
                }
                return j23Var;
            case 7:
                m02.y(obj);
                o20 o20VarF = ((x20) this.m).f();
                c5 c5Var = c5.L;
                m20 m20VarM = o20VarF.m(c5Var);
                m20VarM.getClass();
                q20 q20Var = (q20) m20VarM;
                jw jwVar = new jw(true);
                jwVar.Q(null);
                j jVar = new j(jwVar, (zp0) obj2, m10Var, (byte) 12);
                o20 o20VarV = ou.v(xf0.h, q20Var, true);
                r70 r70Var = ya0.a;
                if (o20VarV != r70Var && o20VarV.m(c5Var) == null) {
                    o20VarV = o20VarV.i(r70Var);
                }
                v dn2Var = new dn2(o20VarV, true);
                dn2Var.i0(a30.k, dn2Var, jVar);
                while (jwVar.N() instanceof tu0) {
                    try {
                        return uz0.w(q20Var, new qj(jwVar, m10Var, (byte) 8));
                    } catch (InterruptedException unused2) {
                    }
                }
                Object objN = jwVar.N();
                if (objN instanceof tu0) {
                    li1.g("This job has not completed yet");
                    return m10Var;
                }
                if (objN instanceof mw) {
                    throw ((mw) objN).a;
                }
                return ie1.D(objN);
            default:
                m02.y(obj);
                return new xl1((bz1) this.m).t(((ez1) obj2).b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(m10 m10Var, vp0 vp0Var) {
        super(2, m10Var);
        this.l = (byte) 3;
        this.n = vp0Var;
    }
}
