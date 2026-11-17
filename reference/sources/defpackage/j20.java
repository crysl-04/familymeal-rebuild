package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j20 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ k20 i;

    public /* synthetic */ j20(k20 k20Var, dh2 dh2Var) {
        this.h = (byte) 3;
        this.i = k20Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c5  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        StringBuilder sb = null;
        boolean z = true;
        k20 k20Var = this.i;
        switch (b) {
            case 0:
                lu1 lu1Var = k20Var.z.t;
                Boolean bool = Boolean.TRUE;
                lu1Var.setValue(bool);
                k20Var.z.s.setValue(bool);
                p81 p81Var = k20Var.z;
                AutofillValue autofillValue = ((m8) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                k20.M0(p81Var, (String) textValue, k20Var.A);
                return bool;
            case 1:
                List list = (List) obj;
                if (k20Var.z.d() != null) {
                    kw2 kw2VarD = k20Var.z.d();
                    kw2VarD.getClass();
                    list.add(kw2VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                k20.M0(k20Var.z, ((od) obj).i, k20Var.A);
                return Boolean.TRUE;
            default:
                od odVar = (od) obj;
                if (k20Var.A) {
                    dw2 dw2Var = k20Var.z.e;
                    if (dw2Var != null) {
                        List listQ = lt.Q(new nj0(), new fw(odVar, 1));
                        p81 p81Var2 = k20Var.z;
                        ix0 ix0Var = p81Var2.d;
                        v10 v10Var = p81Var2.v;
                        vv2 vv2VarN = ix0Var.n(listQ);
                        dw2Var.a(null, vv2VarN);
                        v10Var.h(vv2VarN);
                    } else {
                        vv2 vv2Var = k20Var.y;
                        String str = vv2Var.a.i;
                        long j = vv2Var.b;
                        int i = qw2.c;
                        int i2 = (int) (j >> 32);
                        int i3 = (int) (j & 4294967295L);
                        str.getClass();
                        odVar.getClass();
                        if (i3 >= i2) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i2);
                            sb.append((CharSequence) odVar);
                            sb.append((CharSequence) str, i3, str.length());
                        } else {
                            wg.i(wi0.g("End index (", i3, ") is less than start index (", i2, ")."));
                        }
                        String string = sb.toString();
                        int length = odVar.i.length() + ((int) (k20Var.y.b >> 32));
                        k20Var.z.v.h(new vv2(string, m02.a(length, length), 4));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ j20(k20 k20Var, byte b) {
        this.h = b;
        this.i = k20Var;
    }
}
