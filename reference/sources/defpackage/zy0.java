package defpackage;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends nr0 {
    public static final sk r = new sk(2);
    public static final wo1 s = wo1.G(8);
    public volatile gs1 f;
    public oi1 g;
    public final ConcurrentHashMap h;
    public final ix0 i;
    public final wo1 j;
    public final ii0 k;
    public final u30 l;
    public final wk m;
    public volatile boolean n;
    public volatile boolean o;
    public final int p;
    public final ng1 q;

    public zy0(ii0 ii0Var) {
        super(ii0Var.a);
        this.f = null;
        this.g = null;
        this.h = new ConcurrentHashMap();
        this.i = new ix0((byte) 22);
        this.m = new wk((byte) 5);
        this.n = false;
        this.o = false;
        ii0Var.F();
        ii0Var.D();
        ii0 ii0Var2 = new ii0(ii0Var, true, true);
        this.k = ii0Var2;
        int i = ii0Var2.i;
        this.p = i;
        this.l = new u30(i);
        bz0 bz0Var = this.a.k;
        bz0Var.getClass();
        this.q = new ng1(ii0Var2, bz0Var);
        this.j = bz0Var.b();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // defpackage.nr0
    public final defpackage.gs1 h(defpackage.gs1 r46) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.h(gs1):gs1");
    }

    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: do1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: do1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean m(defpackage.un1 r21, defpackage.do1 r22, defpackage.ng1 r23) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.m(un1, do1, ng1):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[SYNTHETIC] */
    public final un1 n(un1 un1Var, do1 do1Var, gs1 gs1Var, double d, ng1 ng1Var) {
        int i;
        double d2;
        double dB;
        double dAbs;
        double dFloor;
        un1 un1VarL;
        double dFloor2;
        double d3 = this.f.n;
        double d4 = this.p == 2 ? d3 - d : d - d3;
        if (d4 <= h32.a) {
            return un1Var;
        }
        int length = ng1Var.b.length;
        int i2 = 0;
        un1 un1Var2 = un1Var;
        while (i2 < length) {
            int i3 = un1Var2.o[i2];
            double d5 = i3 != Integer.MIN_VALUE ? i3 : Double.NEGATIVE_INFINITY;
            int i4 = un1Var2.q[i2];
            double d6 = i4 != Integer.MAX_VALUE ? i4 : Double.POSITIVE_INFINITY;
            if (d5 >= d6) {
                i = length;
                d2 = d4;
            } else {
                int i5 = ng1Var.b[i2];
                double dA = gs1Var.l.A(i5);
                i = length;
                if (do1Var.e == null || do1Var.d == null) {
                    d2 = d4;
                } else {
                    hs1 hs1VarI = do1Var.i();
                    d2 = d4;
                    u23 u23Var = hs1VarI instanceof u23 ? (u23) hs1VarI : null;
                    ii0 ii0Var = do1Var.c;
                    int iD = do1Var.h().d(ii0Var, ii0Var.k(i5));
                    if (u23Var != null && iD >= 0) {
                        dB = u23Var.b(iD);
                    }
                    dAbs = Math.abs(dB);
                    if (dAbs <= h32.a) {
                        if (Math.abs(dA - d5) < 0.5d) {
                            dFloor2 = Math.floor(d2 / dAbs);
                            if (dFloor2 >= d6 - d5) {
                                un1VarL = un1Var2.m(i2, d5 + dFloor2);
                                if (un1Var2 != un1VarL) {
                                    if (un1Var2 != un1Var) {
                                        un1Var2.e();
                                    }
                                    un1VarL.f(do1Var, i2, ng1Var);
                                }
                                un1Var2 = un1VarL;
                            }
                        } else if (Math.abs(dA - d6) < 0.5d) {
                            dFloor = Math.floor(d2 / dAbs);
                            if (dFloor >= d6 - d5) {
                                un1VarL = un1Var2.l(i2, d6 - dFloor);
                                if (un1Var2 != un1VarL) {
                                    if (un1Var2 != un1Var) {
                                        un1Var2.e();
                                    }
                                    un1VarL.f(do1Var, i2, ng1Var);
                                }
                                un1Var2 = un1VarL;
                            }
                        }
                    }
                }
                dB = h32.a;
                dAbs = Math.abs(dB);
                if (dAbs <= h32.a) {
                    if (Math.abs(dA - d5) < 0.5d) {
                        dFloor2 = Math.floor(d2 / dAbs);
                        if (dFloor2 >= d6 - d5) {
                            un1VarL = un1Var2.m(i2, d5 + dFloor2);
                            if (un1Var2 != un1VarL) {
                                if (un1Var2 != un1Var) {
                                    un1Var2.e();
                                }
                                un1VarL.f(do1Var, i2, ng1Var);
                            }
                            un1Var2 = un1VarL;
                        }
                    } else if (Math.abs(dA - d6) < 0.5d) {
                        dFloor = Math.floor(d2 / dAbs);
                        if (dFloor >= d6 - d5) {
                            un1VarL = un1Var2.l(i2, d6 - dFloor);
                            if (un1Var2 != un1VarL) {
                                if (un1Var2 != un1Var) {
                                    un1Var2.e();
                                }
                                un1VarL.f(do1Var, i2, ng1Var);
                            }
                            un1Var2 = un1VarL;
                        }
                    }
                }
            }
            i2++;
            length = i;
            d4 = d2;
        }
        return un1Var2;
    }

    public final gs1 o() {
        gs1 gs1Var = this.f;
        if (gs1Var != null) {
            return gs1Var;
        }
        return new gs1(is1.INVALID, this.p == 2 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY, new z93(l52.q, this.k.o.size(), 1L));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    public final int p(gs1 gs1Var, ng1 ng1Var) {
        double d = h32.a;
        int length = ng1Var.b.length;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (i3 < length) {
            double dA = gs1Var.l.A(ng1Var.b[i3]);
            double dFloor = dA - Math.floor(dA);
            double d2 = h32.b;
            int i4 = i2;
            double d3 = d2 - dFloor;
            double d4 = d;
            if (wo1.D(Math.min(dFloor, d3), ng1Var.f.c().j)) {
                i2 = i4;
            } else if (un1.i(dA)) {
                boolean z = this.f != null;
                int i5 = ng1Var.i[i3];
                int i6 = ng1Var.l[i3];
                boolean z2 = Math.min(i6, i5) >= 2;
                double d5 = dFloor * d3;
                double d6 = ng1Var.j[i3];
                double d7 = ng1Var.m[i3];
                if (d7 <= 1.0E-9d) {
                    d7 = 1.0E-9d;
                }
                if (d6 <= 1.0E-9d) {
                    d6 = 1.0E-9d;
                }
                double d8 = d6 * dFloor * d7 * d3;
                if (z2 && z) {
                    double dMin = z2 ? d2 - h32.h : Math.min(d2, ((double) (i6 + i5)) / (h32.c * 2.0d));
                    d8 = ((d2 - dMin) * d5) + (d8 * dMin);
                }
                if (d8 > d4) {
                    i = i3;
                    i2 = i4;
                    d4 = d8;
                } else {
                    i2 = i4;
                }
            } else {
                i2 = i3;
            }
            i3++;
            d = d4;
        }
        return i >= 0 ? i : i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0062 A[EDGE_INSN: B:51:0x0062->B:24:0x0062 BREAK  A[LOOP:0: B:16:0x003f->B:54:0x003f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if ((r3.e == 1 ? r13 - r15 : r15 - r13) >= (r5 - r3.f(r1))) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            r19 = this;
            r0 = r19
            gs1 r1 = r0.f
            if (r1 == 0) goto Lc2
            oi1 r2 = r0.g
            int r3 = r0.p
            r4 = 2
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            if (r3 == r4) goto L16
            r17 = r7
            r7 = r5
            r5 = r17
        L16:
            if (r2 == 0) goto L62
            java.util.concurrent.PriorityBlockingQueue r2 = r2.a
            java.lang.Object r2 = r2.peek()
            un1 r2 = (defpackage.un1) r2
            if (r2 == 0) goto L35
            double r9 = r2.k
            boolean r2 = java.lang.Double.isFinite(r9)
            if (r2 == 0) goto L62
            if (r3 != r4) goto L31
            double r5 = java.lang.Math.min(r5, r9)
            goto L35
        L31:
            double r5 = java.lang.Math.max(r5, r9)
        L35:
            java.util.concurrent.ConcurrentHashMap r2 = r0.h
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L61
            java.lang.Object r9 = r2.next()
            java.lang.Double r9 = (java.lang.Double) r9
            double r9 = r9.doubleValue()
            boolean r11 = java.lang.Double.isFinite(r9)
            if (r11 == 0) goto L62
            if (r3 != r4) goto L5c
            double r5 = java.lang.Math.min(r5, r9)
            goto L3f
        L5c:
            double r5 = java.lang.Math.max(r5, r9)
            goto L3f
        L61:
            r7 = r5
        L62:
            boolean r2 = java.lang.Double.isFinite(r7)
            if (r2 == 0) goto Lc2
            double r1 = r1.n
            ng1 r3 = r0.q
            double r5 = r3.d
            double r9 = defpackage.h32.a
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r12 = 1
            if (r11 <= 0) goto Laa
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L9e
            boolean r11 = java.lang.Double.isFinite(r7)
            if (r11 == 0) goto L9e
            boolean r11 = java.lang.Double.isFinite(r1)
            if (r11 == 0) goto L9e
            double r13 = r3.h(r7)
            double r15 = r3.i(r1)
            int r11 = r3.e
            if (r11 != r12) goto L93
            double r13 = r13 - r15
            goto L95
        L93:
            double r13 = r15 - r13
        L95:
            double r15 = r3.f(r1)
            double r5 = r5 - r15
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 < 0) goto Lc1
        L9e:
            ng1 r3 = r0.q
            double r7 = r3.h(r7)
            ng1 r3 = r0.q
            double r1 = r3.i(r1)
        Laa:
            int r3 = r0.p
            if (r3 != r4) goto Lb1
            double r3 = r1 - r7
            goto Lb3
        Lb1:
            double r3 = r7 - r1
        Lb3:
            double r3 = java.lang.Math.max(r9, r3)
            wo1 r0 = r0.j
            double r0 = r0.x(r1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc2
        Lc1:
            return r12
        Lc2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.q():boolean");
    }

    public final synchronized void r(gs1 gs1Var, ng1 ng1Var) {
        l();
        gs1 gs1Var2 = this.f;
        if (gs1Var2 == null) {
            this.f = gs1Var;
            this.e = is1.FEASIBLE;
        } else {
            int i = this.p;
            double d = gs1Var.n;
            if (i == 2) {
                if (d < gs1Var2.n) {
                    this.f = gs1Var;
                }
            } else if (d > gs1Var2.n) {
                this.f = gs1Var;
            }
        }
        ng1Var.getClass();
        double dI = this.f.n;
        double dMax = Math.max(Math.ulp(dI), 1.0E-12d);
        if (ng1Var.d > h32.a) {
            dI = ng1Var.i(dI);
            dMax = (h32.b - 1.0E-6d) * ng1Var.d;
        }
        if (this.p != 1) {
            double d2 = dI - dMax;
            if (Double.isFinite(d2)) {
                this.k.y(null, BigDecimal.valueOf(d2));
            }
        } else {
            double d3 = dI + dMax;
            if (Double.isFinite(d3)) {
                this.k.y(BigDecimal.valueOf(d3), null);
            }
        }
    }

    public final void s(un1 un1Var, gs1 gs1Var, ng1 ng1Var) {
        a1 a1Var = gs1Var.l;
        int iCount = (int) a1Var.count();
        int length = ng1Var.b.length;
        BigDecimal[] bigDecimalArr = new BigDecimal[iCount];
        int i = 0;
        while (i < length) {
            int i2 = ng1Var.b[i];
            double dA = a1Var.A(i2);
            int i3 = un1Var.o[i];
            double d = i3 != Integer.MIN_VALUE ? i3 : Double.NEGATIVE_INFINITY;
            int i4 = un1Var.q[i];
            int i5 = i;
            double dMin = Math.min(i4 != Integer.MAX_VALUE ? i4 : Double.POSITIVE_INFINITY, Math.max(d, Math.rint(dA)));
            if (Math.abs(dMin - dA) > h32.g) {
                return;
            }
            bigDecimalArr[i2] = new BigDecimal(dMin);
            i = i5 + 1;
        }
        if (iCount > length) {
            for (int i6 = 0; i6 < iCount; i6++) {
                if (bigDecimalArr[i6] == null) {
                    double dA2 = a1Var.A(i6);
                    if (!Double.isFinite(dA2)) {
                        return;
                    } else {
                        bigDecimalArr[i6] = BigDecimal.valueOf(dA2);
                    }
                }
            }
        }
        gs1 gs1VarA1 = gs1Var.a1(new x0(bigDecimalArr));
        ii0 ii0Var = this.k;
        if (ii0Var.H(gs1VarA1)) {
            r(new gs1(is1.FEASIBLE, ii0Var.C().N(gs1VarA1).doubleValue(), gs1VarA1), ng1Var);
        }
    }

    public final gs1 t(gs1 gs1Var, ng1 ng1Var) {
        a1 a1Var = gs1Var.l;
        al alVar = cl.c;
        ii0 ii0Var = this.k;
        wo1 wo1Var = s;
        if (!ii0Var.I(gs1Var, wo1Var, alVar)) {
            return null;
        }
        int iCount = (int) a1Var.count();
        BigDecimal[] bigDecimalArr = new BigDecimal[iCount];
        int length = ng1Var.b.length;
        for (int i = 0; i < length; i++) {
            int i2 = ng1Var.b[i];
            bigDecimalArr[i2] = new BigDecimal(Math.rint(a1Var.A(i2)));
        }
        for (int i3 = 0; i3 < iCount; i3++) {
            if (bigDecimalArr[i3] == null) {
                bigDecimalArr[i3] = BigDecimal.valueOf(a1Var.A(i3));
            }
        }
        gs1 gs1VarA1 = gs1Var.a1(new x0(bigDecimalArr));
        return ii0Var.I(gs1VarA1, wo1Var, cl.c) ? gs1VarA1 : gs1Var;
    }

    public final String toString() {
        return pz1.m("Solutions={} Nodes/Iterations={} {}", Integer.valueOf(((LongAdder) this.m.l).intValue()), Integer.valueOf(this.c.get()), o());
    }
}
