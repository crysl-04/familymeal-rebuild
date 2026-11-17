package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class o02 implements rh2, aq {
    public final String a;
    public final kr0 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final d51 i;
    public final d51 j;
    public final d51 k;

    public o02(String str, kr0 kr0Var, int i) {
        this.a = str;
        this.b = kr0Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = bg0.h;
        kp0 kp0Var = new kp0(this) { // from class: n02
            public final /* synthetic */ o02 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b2 = b;
                o02 o02Var = this.i;
                switch (b2) {
                    case 0:
                        kr0 kr0Var2 = o02Var.b;
                        return kr0Var2 != null ? kr0Var2.b() : aa3.M;
                    case 1:
                        return t03.p(o02Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(p02.B(o02Var, (rh2[]) o02Var.j.getValue()));
                }
            }
        };
        g81 g81Var = g81.h;
        this.i = vs.N(g81Var, kp0Var);
        final byte b2 = 1;
        this.j = vs.N(g81Var, new kp0(this) { // from class: n02
            public final /* synthetic */ o02 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b3 = b2;
                o02 o02Var = this.i;
                switch (b3) {
                    case 0:
                        kr0 kr0Var2 = o02Var.b;
                        return kr0Var2 != null ? kr0Var2.b() : aa3.M;
                    case 1:
                        return t03.p(o02Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(p02.B(o02Var, (rh2[]) o02Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = vs.N(g81Var, new kp0(this) { // from class: n02
            public final /* synthetic */ o02 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b4 = b3;
                o02 o02Var = this.i;
                switch (b4) {
                    case 0:
                        kr0 kr0Var2 = o02Var.b;
                        return kr0Var2 != null ? kr0Var2.b() : aa3.M;
                    case 1:
                        return t03.p(o02Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(p02.B(o02Var, (rh2[]) o02Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.rh2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.rh2
    public final String b() {
        return this.a;
    }

    @Override // defpackage.rh2
    public final p02 c() {
        return po2.i;
    }

    @Override // defpackage.rh2
    public final int d() {
        return this.c;
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o02) {
            rh2 rh2Var = (rh2) obj;
            if (this.a.equals(rh2Var.b()) && Arrays.equals((rh2[]) this.j.getValue(), (rh2[]) ((o02) obj).j.getValue())) {
                int iD = rh2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (uz0.g(j(i2).b(), rh2Var.j(i2).b()) && uz0.g(j(i2).c(), rh2Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aq
    public final Set g() {
        return this.h.keySet();
    }

    @Override // defpackage.rh2
    public final List getAnnotations() {
        return ag0.h;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        List list = this.f[i];
        return list == null ? ag0.h : list;
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        return ((r21[]) this.i.getValue())[i].d();
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        return this.g[i];
    }

    public final void l(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public final String toString() {
        return p02.M(this);
    }
}
