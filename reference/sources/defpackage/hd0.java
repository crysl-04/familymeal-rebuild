package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hd0 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public Object n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(jn2 jn2Var, pk0 pk0Var, nn2 nn2Var, Float f, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 1;
        this.n = jn2Var;
        this.o = pk0Var;
        this.p = nn2Var;
        this.q = f;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) throws Throwable {
        byte b = this.l;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
                return y20Var;
            case 3:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 4:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 6:
                return ((hd0) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                ((hd0) p((m10) obj2, (qk0) obj)).r(j23Var);
                return y20Var;
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                hd0 hd0Var = new hd0(obj2, m10Var, (byte) 0);
                hd0Var.p = obj;
                return hd0Var;
            case 1:
                return new hd0((jn2) this.n, (pk0) this.o, (nn2) this.p, (Float) obj2, m10Var);
            case 2:
                hd0 hd0Var2 = new hd0((sj1) this.o, (tv0) obj2, m10Var);
                hd0Var2.p = obj;
                return hd0Var2;
            case 3:
                hd0 hd0Var3 = new hd0(this.n, this.o, obj2, m10Var, (byte) 3);
                hd0Var3.p = obj;
                return hd0Var3;
            case 4:
                return new hd0((d02) this.p, (zp0) obj2, m10Var);
            case 5:
                hd0 hd0Var4 = new hd0(this.n, this.o, obj2, m10Var, (byte) 5);
                hd0Var4.p = obj;
                return hd0Var4;
            case 6:
                hd0 hd0Var5 = new hd0(obj2, m10Var, (byte) 6);
                hd0Var5.p = obj;
                return hd0Var5;
            default:
                hd0 hd0Var6 = new hd0(this.n, this.o, obj2, m10Var, (byte) 7);
                hd0Var6.p = obj;
                return hd0Var6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:234:0x04bc A[PHI: r10
  0x04bc: PHI (r10v11 x20) = (r10v3 x20), (r10v3 x20), (r10v3 x20), (r10v9 x20), (r10v14 x20) binds: [B:259:0x0536, B:261:0x0543, B:256:0x0531, B:268:0x0557, B:233:0x04bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:238:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:240:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:245:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:247:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:250:0x051a A[Catch: CancellationException -> 0x0548, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0548, blocks: (B:248:0x04fb, B:250:0x051a, B:228:0x048f), top: B:282:0x048f }] */
    /* JADX WARN: Code duplicated, block: B:252:0x051e A[PHI: r5 r6
  0x051e: PHI (r5v14 x72) = (r5v9 x72), (r5v22 x72) binds: [B:228:0x048f, B:251:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051e: PHI (r6v10 x20) = (r6v7 x20), (r6v12 x20) binds: [B:228:0x048f, B:251:0x051c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:258:0x0534 A[Catch: CancellationException -> 0x0546, TryCatch #10 {CancellationException -> 0x0546, blocks: (B:253:0x051f, B:255:0x0525, B:258:0x0534, B:260:0x0538), top: B:292:0x051f }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0538 A[Catch: CancellationException -> 0x0546, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x0546, blocks: (B:253:0x051f, B:255:0x0525, B:258:0x0534, B:260:0x0538), top: B:292:0x051f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x03a7 -> B:180:0x0372). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03c1 -> B:180:0x0372). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x0531 -> B:234:0x04bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x0536 -> B:234:0x04bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x0543 -> B:234:0x04bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:266:0x0553 -> B:233:0x04bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x0557 -> B:234:0x04bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x016e -> B:74:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(d02 d02Var, zp0 zp0Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 4;
        this.p = d02Var;
        this.q = zp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(sj1 sj1Var, tv0 tv0Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 2;
        this.o = sj1Var;
        this.q = tv0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd0(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.q = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd0(Object obj, Object obj2, Object obj3, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
        this.q = obj3;
    }
}
