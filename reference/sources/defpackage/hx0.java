package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 {
    public final /* synthetic */ byte a;
    public final pt0 b;
    public final pt0 c;
    public final pt0 d;
    public final pt0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public hx0(hx0[] hx0VarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = hx0VarArr;
        int length = hx0VarArr.length;
        final pt0[] pt0VarArr = new pt0[length];
        for (int i = 0; i < length; i++) {
            pt0VarArr[i] = ((hx0[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new pt0(new zp0() { // from class: k43
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                float fV;
                byte b3 = b2;
                pt0[] pt0VarArr2 = pt0VarArr;
                my1 my1Var = (my1) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fV = rz1.v(my1Var, false, pt0VarArr2, fFloatValue);
                        break;
                    default:
                        fV = rz1.v(my1Var, true, pt0VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fV);
            }
        }, (byte) 1);
        int length2 = ((hx0[]) this.f).length;
        final pt0[] pt0VarArr2 = new pt0[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            pt0VarArr2[i2] = ((hx0[]) this.f)[i2].d();
        }
        this.c = new pt0(new zp0() { // from class: ot0
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                float fV;
                byte b3 = b2;
                pt0[] pt0VarArr3 = pt0VarArr2;
                my1 my1Var = (my1) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fV = rz1.v(my1Var, false, pt0VarArr3, fFloatValue);
                        break;
                    default:
                        fV = rz1.v(my1Var, true, pt0VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fV);
            }
        }, (byte) 0);
        int length3 = ((hx0[]) this.f).length;
        final pt0[] pt0VarArr3 = new pt0[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            pt0VarArr3[i3] = ((hx0[]) this.f)[i3].c();
        }
        this.d = new pt0(new zp0() { // from class: k43
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                float fV;
                byte b3 = b;
                pt0[] pt0VarArr4 = pt0VarArr3;
                my1 my1Var = (my1) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fV = rz1.v(my1Var, false, pt0VarArr4, fFloatValue);
                        break;
                    default:
                        fV = rz1.v(my1Var, true, pt0VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fV);
            }
        }, (byte) 1);
        int length4 = ((hx0[]) this.f).length;
        final pt0[] pt0VarArr4 = new pt0[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            pt0VarArr4[i4] = ((hx0[]) this.f)[i4].a();
        }
        this.e = new pt0(new zp0() { // from class: ot0
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                float fV;
                byte b3 = b;
                pt0[] pt0VarArr5 = pt0VarArr4;
                my1 my1Var = (my1) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fV = rz1.v(my1Var, false, pt0VarArr5, fFloatValue);
                        break;
                    default:
                        fV = rz1.v(my1Var, true, pt0VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fV);
            }
        }, (byte) 0);
    }

    public final pt0 a() {
        byte b = this.a;
        return this.e;
    }

    public final pt0 b() {
        byte b = this.a;
        return this.b;
    }

    public final pt0 c() {
        byte b = this.a;
        return this.d;
    }

    public final pt0 d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (hx0 hx0Var : (hx0[]) obj) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    y02.f(sb, hx0Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return wi0.h("RectRulers(", (String) obj, ")");
        }
    }

    public hx0(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new pt0(null, (byte) 1);
        this.c = new pt0(null, (byte) 0);
        this.d = new pt0(null, (byte) 1);
        this.e = new pt0(null, (byte) 0);
    }
}
