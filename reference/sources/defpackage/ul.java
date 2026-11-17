package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ul extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((ul) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((ul) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((ul) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((ul) p((m10) obj2, (wu1) obj)).r(j23Var);
            default:
                return ((ul) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new ul((nn2) this.o, (ry2) obj2, m10Var, (byte) 0);
            case 1:
                ul ulVar = new ul((s01) this.o, (zp0) obj2, m10Var, (byte) 1);
                ulVar.n = obj;
                return ulVar;
            case 2:
                return new ul((ut2) this.o, (ot2) obj2, m10Var, (byte) 2);
            case 3:
                ul ulVar2 = new ul((p03) obj2, m10Var, (byte) 3);
                ulVar2.o = obj;
                return ulVar2;
            default:
                return new ul((p63) obj2, m10Var, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0301  */
    /* JADX WARN: Code duplicated, block: B:200:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x010d A[LOOP:3: B:31:0x010b->B:32:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0150 A[LOOP:4: B:34:0x014a->B:36:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x026f  */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0306, code lost:
    
        if (r3 != r6) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x035a, code lost:
    
        if (r3.f(r2, r22) == r0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03b6, code lost:
    
        if (defpackage.ls.s(r3, r0, r22) != r6) goto L174;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.p = obj;
    }
}
