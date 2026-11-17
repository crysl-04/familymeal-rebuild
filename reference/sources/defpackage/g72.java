package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g72 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g72(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0185 A[LOOP:0: B:59:0x0150->B:69:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kp0
    public final Object a() throws PendingIntent.CanceledException {
        long j;
        kw2 kw2VarD;
        p81 p81Var;
        od odVar;
        byte b = this.h;
        m10 m10Var = null;
        j23 j23Var = j23.a;
        Object[] objArr = 0;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                nj1 nj1Var = (nj1) obj2;
                oz ozVar = (oz) obj;
                Object[] objArr2 = nj1Var.b;
                long[] jArr = nj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j2) < 128) {
                                    ozVar.z(objArr2[(i << 3) + i3]);
                                }
                                j2 >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                return j23Var;
            case 1:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    try {
                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                        if (i4 >= 36) {
                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                        } else {
                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                        }
                        activity.send(activityOptionsMakeBasic.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Objects.toString(activity);
                        e.toString();
                    }
                    break;
                } else {
                    activity.send();
                }
                return j23Var;
            case 2:
                ie1.p((x20) obj2, null, new qv2((vp0) obj, m10Var, objArr == true ? 1 : 0), 1);
                return j23Var;
            default:
                kv2 kv2Var = (kv2) obj2;
                long j3 = ((vy0) ((sj1) obj).getValue()).a;
                up1 up1VarG = kv2Var.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (up1VarG != null) {
                    long j4 = up1VarG.a;
                    od odVarK = kv2Var.k();
                    if (odVarK != null && odVarK.i.length() != 0) {
                        os0 os0Var = (os0) kv2Var.q.getValue();
                        int i5 = os0Var == null ? -1 : nv2.a[os0Var.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1 || i5 == 2) {
                                long j5 = kv2Var.l().b;
                                int i6 = qw2.c;
                                j = j5 >> 32;
                            } else {
                                if (i5 != 3) {
                                    wg.n();
                                    return null;
                                }
                                long j6 = kv2Var.l().b;
                                int i7 = qw2.c;
                                j = j6 & 4294967295L;
                            }
                            int i8 = (int) j;
                            p81 p81Var2 = kv2Var.d;
                            if (p81Var2 != null && (kw2VarD = p81Var2.d()) != null && (p81Var = kv2Var.d) != null && (odVar = p81Var.a.a) != null) {
                                int iN = cy1.n(kv2Var.b.s(i8), 0, odVar.i.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (kw2VarD.d(j4) >> 32));
                                jw2 jw2Var = kw2VarD.a;
                                uh1 uh1Var = jw2Var.b;
                                int iD = uh1Var.d(iN);
                                float fD = jw2Var.d(iD);
                                float fE = jw2Var.e(iD);
                                float fM = cy1.m(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (vy0.a(j3, 0L) || Math.abs(fIntBitsToFloat - fM) <= ((int) (j3 >> 32)) / 2) {
                                    float f = uh1Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(((uh1Var.b(iD) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new up1(jFloatToRawIntBits);
        }
    }
}
