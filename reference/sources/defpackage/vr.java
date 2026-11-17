package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vr implements pk0 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ vr(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0130  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.pk0
    public final Object a(qk0 qk0Var, m10 m10Var) {
        sr srVar;
        wr wrVar;
        jw1 jw1Var;
        ow1 ow1Var;
        y yVar;
        db2 db2Var;
        Throwable th;
        byte b = this.h;
        Object obj = this.i;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (m10Var instanceof sr) {
                    srVar = (sr) m10Var;
                    int i = srVar.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        srVar.l = i - Integer.MIN_VALUE;
                    } else {
                        srVar = new sr(this, m10Var);
                    }
                } else {
                    srVar = new sr(this, m10Var);
                }
                Object obj2 = srVar.k;
                int i2 = srVar.l;
                if (i2 == 0) {
                    m02.y(obj2);
                    ur urVar = new ur(qk0Var, (byte) 0);
                    srVar.l = 1;
                    if (((rl0) obj).a(urVar, srVar) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i2 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj2);
                }
                return j23Var;
            case 1:
                if (m10Var instanceof wr) {
                    wrVar = (wr) m10Var;
                    int i3 = wrVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wrVar.l = i3 - Integer.MIN_VALUE;
                    } else {
                        wrVar = new wr(this, m10Var);
                    }
                } else {
                    wrVar = new wr(this, m10Var);
                }
                Object obj3 = wrVar.k;
                int i4 = wrVar.l;
                if (i4 == 0) {
                    m02.y(obj3);
                    ur urVar2 = new ur(qk0Var, b2);
                    wrVar.l = 1;
                    if (((rl0) obj).a(urVar2, wrVar) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i4 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj3);
                }
                return j23Var;
            case 2:
                if (m10Var instanceof jw1) {
                    jw1Var = (jw1) m10Var;
                    int i5 = jw1Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jw1Var.l = i5 - Integer.MIN_VALUE;
                    } else {
                        jw1Var = new jw1(this, m10Var);
                    }
                } else {
                    jw1Var = new jw1(this, m10Var);
                }
                Object obj4 = jw1Var.k;
                int i6 = jw1Var.l;
                if (i6 == 0) {
                    m02.y(obj4);
                    ur urVar3 = new ur(qk0Var, (byte) 2);
                    jw1Var.l = 1;
                    if (((rl0) obj).a(urVar3, jw1Var) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i6 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj4);
                }
                return j23Var;
            case 3:
                if (m10Var instanceof ow1) {
                    ow1Var = (ow1) m10Var;
                    int i7 = ow1Var.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ow1Var.l = i7 - Integer.MIN_VALUE;
                    } else {
                        ow1Var = new ow1(this, m10Var);
                    }
                } else {
                    ow1Var = new ow1(this, m10Var);
                }
                Object obj5 = ow1Var.k;
                int i8 = ow1Var.l;
                if (i8 == 0) {
                    m02.y(obj5);
                    ur urVar4 = new ur(qk0Var, (byte) 3);
                    ow1Var.l = 1;
                    if (((rl0) obj).a(urVar4, ow1Var) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i8 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj5);
                }
                return j23Var;
            default:
                if (m10Var instanceof y) {
                    yVar = (y) m10Var;
                    int i9 = yVar.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yVar.n = i9 - Integer.MIN_VALUE;
                    } else {
                        yVar = new y(this, m10Var);
                    }
                } else {
                    yVar = new y(this, m10Var);
                }
                Object obj6 = yVar.l;
                int i10 = yVar.n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    db2Var = yVar.k;
                    try {
                        m02.y(obj6);
                        db2Var.s();
                        return j23Var;
                    } catch (Throwable th2) {
                        th = th2;
                        db2Var.s();
                        throw th;
                    }
                }
                m02.y(obj6);
                o20 o20Var = yVar.i;
                o20Var.getClass();
                db2 db2Var2 = new db2(qk0Var, o20Var);
                try {
                    yVar.k = db2Var2;
                    yVar.n = 1;
                    Object objF = ((zp0) obj).f(db2Var2, yVar);
                    if (objF != y20Var) {
                        objF = j23Var;
                    }
                    if (objF == y20Var) {
                        return y20Var;
                    }
                    db2Var = db2Var2;
                    db2Var.s();
                    return j23Var;
                } catch (Throwable th3) {
                    db2Var = db2Var2;
                    th = th3;
                    db2Var.s();
                    throw th;
                }
        }
    }
}
