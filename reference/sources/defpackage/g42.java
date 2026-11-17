package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g42 {
    public final h81 a;

    public g42(kp0 kp0Var) {
        this.a = new h81(kp0Var);
    }

    public i42 a(Object obj) {
        return new i42(this, obj, obj == null, null, null, true);
    }

    public c33 b() {
        return this.a;
    }

    public final i42 c(vp0 vp0Var) {
        return new i42(this, null, false, null, vp0Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041 A[PHI: r4
  0x0041: PHI (r4v2 c33) = (r4v6 c33), (r4v7 c33) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final c33 d(i42 i42Var, c33 c33Var) {
        wz wzVar;
        c33 c33Var2;
        tn2 tn2Var;
        je0 je0Var;
        c33 c33Var3 = null;
        c33Var3 = null;
        c33Var3 = null;
        c33Var3 = null;
        c33Var3 = null;
        c33Var3 = null;
        if (c33Var instanceof je0) {
            if (i42Var.e) {
                je0Var = (je0) c33Var;
                je0Var.a.setValue(i42Var.a());
            }
        } else if (c33Var instanceof tn2) {
            if ((i42Var.b || i42Var.f != null) && !i42Var.e) {
                tn2Var = (tn2) c33Var;
                if (uz0.g(i42Var.a(), tn2Var.a)) {
                    c33Var2 = wzVar;
                    c33Var2 = tn2Var;
                    c33Var3 = c33Var2;
                }
            }
        } else if (c33Var instanceof wz) {
            wzVar = (wz) c33Var;
            if (i42Var.d == wzVar.a) {
                c33Var2 = wzVar;
                c33Var2 = tn2Var;
                c33Var3 = c33Var2;
            }
        }
        if (c33Var3 != null) {
            c33Var3 = je0Var;
            return c33Var3;
        }
        if (!i42Var.e) {
            vp0 vp0Var = i42Var.d;
            if (vp0Var != null) {
                c33Var3 = je0Var;
                return new wz(vp0Var);
            }
            c33Var3 = je0Var;
            return new tn2(i42Var.a());
        }
        Object obj = i42Var.f;
        hl2 hl2Var = i42Var.c;
        if (hl2Var == null) {
            c33Var3 = je0Var;
            hl2Var = vz1.s;
        }
        c33Var3 = je0Var;
        return new je0(new lu1(obj, hl2Var));
    }
}
