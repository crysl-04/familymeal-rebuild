package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public final /* synthetic */ kv2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv2(kv2 kv2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = kv2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                long j = ((up1) obj).a;
                return new cv2(this.n, (m10) obj2, (byte) 0).r(j23Var);
            default:
                return ((cv2) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        kv2 kv2Var = this.n;
        switch (b) {
            case 0:
                return new cv2(kv2Var, m10Var, (byte) 0);
            default:
                return new cv2(kv2Var, m10Var, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01a5  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object nuVar;
        Object odVar;
        CharSequence text;
        int i;
        od odVar2;
        byte b = this.l;
        y20 y20Var = y20.h;
        byte b2 = 1;
        kv2 kv2Var = this.n;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                byte b3 = this.m;
                if (b3 != 0) {
                    if (b3 == 1) {
                        m02.y(obj);
                    } else {
                        if (b3 != 2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    return j23Var;
                }
                m02.y(obj);
                this.m = (byte) 1;
                if (kv2Var.t(this) == y20Var) {
                    return y20Var;
                }
                wt1 wt1VarF = kv2Var.f();
                if (wt1VarF != null) {
                    String str = (String) wt1VarF.h;
                    long j = ((qw2) wt1VarF.i).a;
                    d02 d02Var = kv2Var.i;
                    if (d02Var != null) {
                        this.m = (byte) 2;
                        Object objG = (str.length() == 0 || qw2.c(j)) ? j23Var : ie1.G(d02Var.a, new hd0(d02Var, new b02(d02Var, str, j, (m10) null), (m10) null), this);
                        if (objG != y20Var) {
                            objG = j23Var;
                        }
                        if (objG == y20Var) {
                            return y20Var;
                        }
                    }
                }
                return j23Var;
            default:
                byte b4 = this.m;
                if (b4 == 0) {
                    m02.y(obj);
                    pu puVar = kv2Var.g;
                    if (puVar != null) {
                        this.m = (byte) 1;
                        ClipData primaryClip = ((c6) puVar).a.E().getPrimaryClip();
                        nuVar = primaryClip != null ? new nu(primaryClip) : null;
                        if (nuVar == y20Var) {
                            return y20Var;
                        }
                    }
                    return j23Var;
                }
                if (b4 == 1) {
                    m02.y(obj);
                    nuVar = obj;
                } else {
                    if (b4 != 2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                    odVar = obj;
                }
                odVar2 = (od) odVar;
                if (odVar2 != null && kv2Var.h()) {
                    md mdVar = new md(pz1.r(kv2Var.l(), kv2Var.l().a.i.length()));
                    mdVar.a(odVar2);
                    od odVarB = mdVar.b();
                    od odVarQ = pz1.q(kv2Var.l(), kv2Var.l().a.i.length());
                    md mdVar2 = new md(odVarB);
                    mdVar2.a(odVarQ);
                    od odVarB2 = mdVar2.b();
                    int length = odVar2.i.length() + qw2.f(kv2Var.l().b);
                    kv2Var.c.h(kv2.b(odVarB2, m02.a(length, length)));
                    kv2Var.r(qs0.h);
                    kv2Var.a.e = true;
                }
                return j23Var;
                nu nuVar2 = (nu) nuVar;
                if (nuVar2 != null) {
                    this.m = (byte) 2;
                    int i2 = 0;
                    ClipData.Item itemAt = nuVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        odVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i3 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i3];
                                if (uz0.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i2);
                                    parcelObtain.unmarshall(bArrDecode, i2, bArrDecode.length);
                                    parcelObtain.setDataPosition(i2);
                                    long j2 = kv.g;
                                    long j3 = j2;
                                    long jZ = ax2.c;
                                    long jZ2 = jZ;
                                    qn0 qn0Var = null;
                                    on0 on0Var = null;
                                    pn0 pn0Var = null;
                                    String string = null;
                                    uk ukVar = null;
                                    yv2 yv2Var = null;
                                    vt2 vt2Var = null;
                                    ei2 ei2Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > b2) {
                                            byte b5 = parcelObtain.readByte();
                                            if (b5 != b2) {
                                                i2 = i2;
                                                spanned = spanned;
                                                if (b5 == 2) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b6 = parcelObtain.readByte();
                                                        long j4 = b6 == b2 ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                        jZ = bx2.a(j4, 0L) ? ax2.c : r02.z(parcelObtain.readFloat(), j4);
                                                        b2 = 1;
                                                    }
                                                } else if (b5 == 3) {
                                                    if (parcelObtain.dataAvail() >= 4) {
                                                        qn0Var = new qn0(parcelObtain.readInt());
                                                        b2 = 1;
                                                        i2 = i2;
                                                    }
                                                } else if (b5 == 4) {
                                                    b2 = 1;
                                                    if (parcelObtain.dataAvail() >= 1) {
                                                        byte b7 = parcelObtain.readByte();
                                                        on0 on0Var2 = new on0((b7 == 0 || b7 != 1) ? i2 : 1);
                                                        i2 = i2;
                                                        on0Var = on0Var2;
                                                        spanned = spanned;
                                                    }
                                                } else if (b5 != 5) {
                                                    if (b5 == 6) {
                                                        string = parcelObtain.readString();
                                                    } else if (b5 == 7) {
                                                        if (parcelObtain.dataAvail() >= 5) {
                                                            byte b8 = parcelObtain.readByte();
                                                            long j5 = b8 == 1 ? 4294967296L : b8 == 2 ? 8589934592L : 0L;
                                                            jZ2 = bx2.a(j5, 0L) ? ax2.c : r02.z(parcelObtain.readFloat(), j5);
                                                        }
                                                    } else if (b5 == 8) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            ukVar = new uk(parcelObtain.readFloat());
                                                            b2 = 1;
                                                            spanned = spanned;
                                                        }
                                                    } else if (b5 == 9) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            yv2Var = new yv2(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                            b2 = 1;
                                                            i2 = i2;
                                                        }
                                                    } else if (b5 == 10) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            int i4 = kv.h;
                                                            long j6 = parcelObtain.readLong();
                                                            long j7 = j6 & 63;
                                                            if (j7 >= 16) {
                                                                j6 = (j6 & (-64)) | (j7 + 1);
                                                            }
                                                            j3 = j6;
                                                        }
                                                    } else if (b5 != 11) {
                                                        if (b5 == 12) {
                                                            if (parcelObtain.dataAvail() >= 20) {
                                                                int i5 = kv.h;
                                                                long j8 = parcelObtain.readLong();
                                                                long j9 = j8 & 63;
                                                                if (j9 >= 16) {
                                                                    j8 = (j8 & (-64)) | (j9 + 1);
                                                                }
                                                                ei2Var = new ei2(parcelObtain.readFloat(), j8, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L));
                                                            }
                                                        }
                                                        b2 = 1;
                                                    } else if (parcelObtain.dataAvail() >= 4) {
                                                        int i6 = parcelObtain.readInt();
                                                        int i7 = (i6 & 2) != 0 ? 1 : i2;
                                                        int i8 = (i6 & 1) != 0 ? 1 : i2;
                                                        vt2 vt2Var2 = vt2.c;
                                                        if (i7 != 0) {
                                                            vt2 vt2Var3 = vt2.d;
                                                            if (i8 != 0) {
                                                                List listQ = lt.Q(vt2Var3, vt2Var2);
                                                                Integer numValueOf = Integer.valueOf(i2);
                                                                int size = listQ.size();
                                                                for (int i9 = i2; i9 < size; i9++) {
                                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((vt2) listQ.get(i9)).a);
                                                                }
                                                                vt2Var2 = new vt2(numValueOf.intValue());
                                                            } else {
                                                                vt2Var = vt2Var3;
                                                            }
                                                        } else {
                                                            vt2Var = i8 == 0 ? vt2.b : vt2Var2;
                                                        }
                                                    }
                                                    b2 = 1;
                                                } else if (parcelObtain.dataAvail() >= 1) {
                                                    byte b9 = parcelObtain.readByte();
                                                    if (b9 == 0) {
                                                        i = i2;
                                                    } else if (b9 == 1) {
                                                        i = 65535;
                                                    } else if (b9 == 3) {
                                                        i = 2;
                                                    } else if (b9 == 2) {
                                                        i = 1;
                                                    } else {
                                                        i = i2;
                                                    }
                                                    pn0Var = new pn0(i);
                                                    b2 = 1;
                                                    spanned = spanned;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i10 = kv.h;
                                                long j10 = parcelObtain.readLong();
                                                long j11 = j10 & 63;
                                                if (j11 >= 16) {
                                                    j10 = (j10 & (-64)) | (j11 + 1);
                                                }
                                                j2 = j10;
                                            }
                                        }
                                        i2 = i2;
                                        spanned = spanned;
                                    }
                                    arrayList.add(new nd(spanStart, spanEnd, new yl2(j2, jZ, qn0Var, on0Var, pn0Var, (ar2) null, string, jZ2, ukVar, yv2Var, (ub1) null, j3, vt2Var, ei2Var, 49152)));
                                } else {
                                    i2 = i2;
                                    spanned = spanned;
                                }
                                if (i3 != length2) {
                                    i3++;
                                    i2 = i2;
                                    spanned = spanned;
                                    b2 = 1;
                                }
                            }
                        }
                        String string2 = text.toString();
                        od odVar3 = pd.a;
                        odVar = new od(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        odVar = new od(text.toString());
                    }
                    if (odVar == y20Var) {
                        return y20Var;
                    }
                    odVar2 = (od) odVar;
                    if (odVar2 != null) {
                        md mdVar3 = new md(pz1.r(kv2Var.l(), kv2Var.l().a.i.length()));
                        mdVar3.a(odVar2);
                        od odVarB3 = mdVar3.b();
                        od odVarQ2 = pz1.q(kv2Var.l(), kv2Var.l().a.i.length());
                        md mdVar4 = new md(odVarB3);
                        mdVar4.a(odVarQ2);
                        od odVarB4 = mdVar4.b();
                        int length3 = odVar2.i.length() + qw2.f(kv2Var.l().b);
                        kv2Var.c.h(kv2.b(odVarB4, m02.a(length3, length3)));
                        kv2Var.r(qs0.h);
                        kv2Var.a.e = true;
                    }
                }
                return j23Var;
        }
    }
}
