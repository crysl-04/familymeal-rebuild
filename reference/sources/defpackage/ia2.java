package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import com.familymeal.app.MealPlannerApp;
import java.io.File;
import java.lang.annotation.Annotation;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ia2 {
    public static final qv A;
    public static final qv B;
    public static final qv C;
    public static final qv D;
    public static final qv E;
    public static final qv F;
    public static final qv G;
    public static final qv H;
    public static final qv I;
    public static final qv J;
    public static final qv K;
    public static final qv L;
    public static final qv M;
    public static final qv N;
    public static final qv O;
    public static final qv P;
    public static final qv Q;
    public static final qv R;
    public static final qv S;
    public static final qv T;
    public static final qv U;
    public static final qv V;
    public static final qv W;
    public static final qv X;
    public static final qv Y;
    public static final StackTraceElement[] Z;
    public static final qf0 a;
    public static final c52 a0;
    public static final nx b;
    public static final b52 b0;
    public static final nx c;
    public static final b52 c0;
    public static final nx d;
    public static final c52 d0;
    public static final nx e;
    public static final b52 e0;
    public static final nx f;
    public static final c52 f0;
    public static final Object g0;
    public static final nx h;
    public static final ss2 h0;
    public static final h33 i0;
    public static final h33 j0;
    public static final yy s;
    public static final eg t;
    public static eg u;
    public static final qv v;
    public static final ji2 w;
    public static final qv x;
    public static final qv y;
    public static final qv z;
    public static final nx g = new nx(-1283296398, false, new wx(7));
    public static final nx i = new nx(-1314162433, false, new wx(9));
    public static final nx j = new nx(402824937, false, new wx(10));
    public static final k02 k = new k02(null, new xz1());
    public static final qv l = qv.q;
    public static final float m = 1.0f;
    public static final qv n = qv.s;
    public static final float o = 6.0f;
    public static final float p = 6.0f;
    public static final float q = 8.0f;
    public static final float r = 6.0f;

    /* JADX WARN: Type inference failed for: r0v20, types: [c52] */
    /* JADX WARN: Type inference failed for: r0v21, types: [b52] */
    /* JADX WARN: Type inference failed for: r0v22, types: [b52] */
    /* JADX WARN: Type inference failed for: r0v23, types: [c52] */
    /* JADX WARN: Type inference failed for: r0v24, types: [b52] */
    /* JADX WARN: Type inference failed for: r0v25, types: [c52] */
    static {
        final byte b2 = 1;
        a = new qf0("RESUME_TOKEN", b2);
        final byte b3 = 0;
        b = new nx(-678235991, false, new rx(b3));
        c = new nx(618989132, false, new rx(b2));
        byte b4 = 17;
        d = new nx(-1207765312, false, new tx(b4));
        final byte b5 = 3;
        e = new nx(111511353, false, new yx(b5));
        final byte b6 = 6;
        f = new nx(-203941560, false, new wx(b6));
        final byte b7 = 8;
        h = new nx(821720769, false, new wx(b7));
        Object obj = null;
        s = new yy(b6);
        t = new eg(obj, obj, obj, (byte) 14);
        qv qvVar = qv.r;
        v = qvVar;
        w = ji2.i;
        qv qvVar2 = qv.n;
        x = qvVar2;
        y = qvVar2;
        z = qvVar2;
        A = qvVar2;
        B = qvVar2;
        C = qvVar2;
        qv qvVar3 = qv.h;
        D = qvVar3;
        E = qvVar2;
        F = qvVar3;
        qv qvVar4 = qv.o;
        G = qvVar4;
        H = qvVar3;
        I = qvVar3;
        J = qvVar3;
        K = qvVar2;
        L = qvVar;
        M = qvVar4;
        N = qvVar;
        O = qvVar4;
        P = qvVar4;
        Q = qvVar2;
        R = qvVar4;
        S = qvVar4;
        T = qvVar4;
        U = qvVar4;
        V = qvVar4;
        W = qv.p;
        X = qvVar4;
        Y = qvVar4;
        Z = new StackTraceElement[0];
        a0 = new tm() { // from class: c52
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                u42 u42Var = (u42) comparable;
                u42 u42Var2 = (u42) comparable2;
                switch (b3) {
                    case 0:
                        return u42Var.i0(u42Var2);
                    case 1:
                        return u42Var.R(u42Var2);
                    case 2:
                        u42Var.getClass();
                        return u42Var.i(u42Var2.X1());
                    case 3:
                        return u42Var.compareTo(u42Var2) <= 0 ? u42Var2 : u42Var;
                    case 4:
                        return u42Var.compareTo(u42Var2) >= 0 ? u42Var2 : u42Var;
                    default:
                        return u42Var.i(u42Var2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((u42) a(new u42(d2), new u42(d3))).m;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((u42) a(new u42(f2), new u42(f3))).m;
            }
        };
        b0 = new c23() { // from class: b52
            @Override // defpackage.c23
            public final double a(double d2) {
                return ((u42) b(new u42(d2))).m;
            }

            @Override // defpackage.c23
            public final Comparable b(Comparable comparable) {
                switch (b6) {
                    case 0:
                        return new u42(((u42) comparable).a1());
                    case 1:
                        u42 u42Var = (u42) comparable;
                        b52 b52Var = ia2.e0;
                        u42 u42VarI = u42Var.i(u42Var);
                        double d2 = h32.b;
                        boolean zK2 = u42VarI.k2();
                        double d3 = u42VarI.m;
                        u42 u42VarI0 = u42Var.i0((u42) b52Var.b(zK2 ? new u42(d3 - d2) : new u42(d3 - d2, u42VarI.h, u42VarI.i, u42VarI.j)));
                        double dA1 = u42VarI0.a1();
                        double[] dArrQ2 = u42VarI0.q2();
                        e32 e32Var = h32.r;
                        double d4 = u42VarI0.m / dA1;
                        e32Var.getClass();
                        double dAcos = Math.acos(d4);
                        h32.y.getClass();
                        return new u42(Math.log(dA1), dArrQ2[0] * dAcos, dArrQ2[1] * dAcos, dArrQ2[2] * dAcos);
                    case 2:
                        u42 u42Var2 = (u42) comparable;
                        b52 b52Var2 = ia2.c0;
                        return ((u42) b52Var2.b(u42Var2)).R((u42) b52Var2.b(u42Var2.o2())).u1(h32.c);
                    case 3:
                        u42 u42Var3 = (u42) comparable;
                        double dA2 = u42Var3.a1();
                        double[] dArrQ3 = u42Var3.q2();
                        e32 e32Var2 = h32.r;
                        double d5 = u42Var3.m / dA2;
                        e32Var2.getClass();
                        double dAcos2 = Math.acos(d5);
                        h32.y.getClass();
                        u42 u42VarU1 = new u42(Math.log(dA2), dArrQ3[0] * dAcos2, dArrQ3[1] * dAcos2, dArrQ3[2] * dAcos2).u1(2.0d);
                        boolean zK3 = u42VarU1.k2();
                        double d6 = u42VarU1.m;
                        if (zK3) {
                            h32.w.getClass();
                            return new u42(Math.exp(d6));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d6), u42VarU1.q2(), u42VarU1.h2());
                    case 4:
                        u42 u42Var4 = (u42) comparable;
                        b52 b52Var3 = ia2.c0;
                        u42 u42Var5 = (u42) b52Var3.b(u42Var4);
                        u42 u42Var6 = (u42) b52Var3.b(u42Var4.o2());
                        u42 u42VarR = u42Var5.R(u42Var6);
                        u42 u42VarI1 = u42Var5.i0(u42Var6);
                        if (u42VarR.equals(u42VarI1)) {
                            return u42.r;
                        }
                        return u42VarR.equals(u42VarI1.o2()) ? u42.r.o2() : u42VarR.i(u42VarI1.X1());
                    case 5:
                        u42 u42Var7 = (u42) comparable;
                        u42 u42Var8 = u42.o;
                        u42 u42VarI2 = u42Var8.i0(u42Var7).i(u42Var8.R(u42Var7).X1());
                        double dA3 = u42VarI2.a1();
                        double[] dArrQ4 = u42VarI2.q2();
                        e32 e32Var3 = h32.r;
                        double d7 = u42VarI2.m / dA3;
                        e32Var3.getClass();
                        double dAcos3 = Math.acos(d7);
                        h32.y.getClass();
                        return new u42(Math.log(dA3), dArrQ4[0] * dAcos3, dArrQ4[1] * dAcos3, dArrQ4[2] * dAcos3).i(u42Var8).u1(h32.c);
                    case 6:
                        return ((u42) comparable).T0();
                    case 7:
                        u42 u42Var9 = (u42) comparable;
                        b52 b52Var4 = ia2.c0;
                        return ((u42) b52Var4.b(u42Var9)).i0((u42) b52Var4.b(u42Var9.o2())).u1(h32.c);
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        u42 u42Var10 = (u42) comparable;
                        boolean zK4 = u42Var10.k2();
                        double d8 = u42Var10.m;
                        if (zK4) {
                            h32.w.getClass();
                            return new u42(Math.exp(d8));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d8), u42Var10.q2(), u42Var10.h2());
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        u42 u42Var11 = (u42) comparable;
                        double dA4 = u42Var11.a1();
                        double[] dArrQ5 = u42Var11.q2();
                        e32 e32Var4 = h32.r;
                        double d9 = u42Var11.m / dA4;
                        e32Var4.getClass();
                        double dAcos4 = Math.acos(d9);
                        h32.y.getClass();
                        return new u42(Math.log(dA4), dArrQ5[0] * dAcos4, dArrQ5[1] * dAcos4, dArrQ5[2] * dAcos4);
                    default:
                        return ((u42) comparable).o2();
                }
            }

            @Override // defpackage.c23
            public final float c(float f2) {
                return (float) ((u42) b(new u42(f2))).m;
            }
        };
        c0 = new c23() { // from class: b52
            @Override // defpackage.c23
            public final double a(double d2) {
                return ((u42) b(new u42(d2))).m;
            }

            @Override // defpackage.c23
            public final Comparable b(Comparable comparable) {
                switch (b7) {
                    case 0:
                        return new u42(((u42) comparable).a1());
                    case 1:
                        u42 u42Var = (u42) comparable;
                        b52 b52Var = ia2.e0;
                        u42 u42VarI = u42Var.i(u42Var);
                        double d2 = h32.b;
                        boolean zK2 = u42VarI.k2();
                        double d3 = u42VarI.m;
                        u42 u42VarI0 = u42Var.i0((u42) b52Var.b(zK2 ? new u42(d3 - d2) : new u42(d3 - d2, u42VarI.h, u42VarI.i, u42VarI.j)));
                        double dA1 = u42VarI0.a1();
                        double[] dArrQ2 = u42VarI0.q2();
                        e32 e32Var = h32.r;
                        double d4 = u42VarI0.m / dA1;
                        e32Var.getClass();
                        double dAcos = Math.acos(d4);
                        h32.y.getClass();
                        return new u42(Math.log(dA1), dArrQ2[0] * dAcos, dArrQ2[1] * dAcos, dArrQ2[2] * dAcos);
                    case 2:
                        u42 u42Var2 = (u42) comparable;
                        b52 b52Var2 = ia2.c0;
                        return ((u42) b52Var2.b(u42Var2)).R((u42) b52Var2.b(u42Var2.o2())).u1(h32.c);
                    case 3:
                        u42 u42Var3 = (u42) comparable;
                        double dA2 = u42Var3.a1();
                        double[] dArrQ3 = u42Var3.q2();
                        e32 e32Var2 = h32.r;
                        double d5 = u42Var3.m / dA2;
                        e32Var2.getClass();
                        double dAcos2 = Math.acos(d5);
                        h32.y.getClass();
                        u42 u42VarU1 = new u42(Math.log(dA2), dArrQ3[0] * dAcos2, dArrQ3[1] * dAcos2, dArrQ3[2] * dAcos2).u1(2.0d);
                        boolean zK3 = u42VarU1.k2();
                        double d6 = u42VarU1.m;
                        if (zK3) {
                            h32.w.getClass();
                            return new u42(Math.exp(d6));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d6), u42VarU1.q2(), u42VarU1.h2());
                    case 4:
                        u42 u42Var4 = (u42) comparable;
                        b52 b52Var3 = ia2.c0;
                        u42 u42Var5 = (u42) b52Var3.b(u42Var4);
                        u42 u42Var6 = (u42) b52Var3.b(u42Var4.o2());
                        u42 u42VarR = u42Var5.R(u42Var6);
                        u42 u42VarI1 = u42Var5.i0(u42Var6);
                        if (u42VarR.equals(u42VarI1)) {
                            return u42.r;
                        }
                        return u42VarR.equals(u42VarI1.o2()) ? u42.r.o2() : u42VarR.i(u42VarI1.X1());
                    case 5:
                        u42 u42Var7 = (u42) comparable;
                        u42 u42Var8 = u42.o;
                        u42 u42VarI2 = u42Var8.i0(u42Var7).i(u42Var8.R(u42Var7).X1());
                        double dA3 = u42VarI2.a1();
                        double[] dArrQ4 = u42VarI2.q2();
                        e32 e32Var3 = h32.r;
                        double d7 = u42VarI2.m / dA3;
                        e32Var3.getClass();
                        double dAcos3 = Math.acos(d7);
                        h32.y.getClass();
                        return new u42(Math.log(dA3), dArrQ4[0] * dAcos3, dArrQ4[1] * dAcos3, dArrQ4[2] * dAcos3).i(u42Var8).u1(h32.c);
                    case 6:
                        return ((u42) comparable).T0();
                    case 7:
                        u42 u42Var9 = (u42) comparable;
                        b52 b52Var4 = ia2.c0;
                        return ((u42) b52Var4.b(u42Var9)).i0((u42) b52Var4.b(u42Var9.o2())).u1(h32.c);
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        u42 u42Var10 = (u42) comparable;
                        boolean zK4 = u42Var10.k2();
                        double d8 = u42Var10.m;
                        if (zK4) {
                            h32.w.getClass();
                            return new u42(Math.exp(d8));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d8), u42Var10.q2(), u42Var10.h2());
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        u42 u42Var11 = (u42) comparable;
                        double dA4 = u42Var11.a1();
                        double[] dArrQ5 = u42Var11.q2();
                        e32 e32Var4 = h32.r;
                        double d9 = u42Var11.m / dA4;
                        e32Var4.getClass();
                        double dAcos4 = Math.acos(d9);
                        h32.y.getClass();
                        return new u42(Math.log(dA4), dArrQ5[0] * dAcos4, dArrQ5[1] * dAcos4, dArrQ5[2] * dAcos4);
                    default:
                        return ((u42) comparable).o2();
                }
            }

            @Override // defpackage.c23
            public final float c(float f2) {
                return (float) ((u42) b(new u42(f2))).m;
            }
        };
        final byte b8 = 5;
        d0 = new tm() { // from class: c52
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                u42 u42Var = (u42) comparable;
                u42 u42Var2 = (u42) comparable2;
                switch (b8) {
                    case 0:
                        return u42Var.i0(u42Var2);
                    case 1:
                        return u42Var.R(u42Var2);
                    case 2:
                        u42Var.getClass();
                        return u42Var.i(u42Var2.X1());
                    case 3:
                        return u42Var.compareTo(u42Var2) <= 0 ? u42Var2 : u42Var;
                    case 4:
                        return u42Var.compareTo(u42Var2) >= 0 ? u42Var2 : u42Var;
                    default:
                        return u42Var.i(u42Var2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((u42) a(new u42(d2), new u42(d3))).m;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((u42) a(new u42(f2), new u42(f3))).m;
            }
        };
        e0 = new c23() { // from class: b52
            @Override // defpackage.c23
            public final double a(double d2) {
                return ((u42) b(new u42(d2))).m;
            }

            @Override // defpackage.c23
            public final Comparable b(Comparable comparable) {
                switch (b5) {
                    case 0:
                        return new u42(((u42) comparable).a1());
                    case 1:
                        u42 u42Var = (u42) comparable;
                        b52 b52Var = ia2.e0;
                        u42 u42VarI = u42Var.i(u42Var);
                        double d2 = h32.b;
                        boolean zK2 = u42VarI.k2();
                        double d3 = u42VarI.m;
                        u42 u42VarI0 = u42Var.i0((u42) b52Var.b(zK2 ? new u42(d3 - d2) : new u42(d3 - d2, u42VarI.h, u42VarI.i, u42VarI.j)));
                        double dA1 = u42VarI0.a1();
                        double[] dArrQ2 = u42VarI0.q2();
                        e32 e32Var = h32.r;
                        double d4 = u42VarI0.m / dA1;
                        e32Var.getClass();
                        double dAcos = Math.acos(d4);
                        h32.y.getClass();
                        return new u42(Math.log(dA1), dArrQ2[0] * dAcos, dArrQ2[1] * dAcos, dArrQ2[2] * dAcos);
                    case 2:
                        u42 u42Var2 = (u42) comparable;
                        b52 b52Var2 = ia2.c0;
                        return ((u42) b52Var2.b(u42Var2)).R((u42) b52Var2.b(u42Var2.o2())).u1(h32.c);
                    case 3:
                        u42 u42Var3 = (u42) comparable;
                        double dA2 = u42Var3.a1();
                        double[] dArrQ3 = u42Var3.q2();
                        e32 e32Var2 = h32.r;
                        double d5 = u42Var3.m / dA2;
                        e32Var2.getClass();
                        double dAcos2 = Math.acos(d5);
                        h32.y.getClass();
                        u42 u42VarU1 = new u42(Math.log(dA2), dArrQ3[0] * dAcos2, dArrQ3[1] * dAcos2, dArrQ3[2] * dAcos2).u1(2.0d);
                        boolean zK3 = u42VarU1.k2();
                        double d6 = u42VarU1.m;
                        if (zK3) {
                            h32.w.getClass();
                            return new u42(Math.exp(d6));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d6), u42VarU1.q2(), u42VarU1.h2());
                    case 4:
                        u42 u42Var4 = (u42) comparable;
                        b52 b52Var3 = ia2.c0;
                        u42 u42Var5 = (u42) b52Var3.b(u42Var4);
                        u42 u42Var6 = (u42) b52Var3.b(u42Var4.o2());
                        u42 u42VarR = u42Var5.R(u42Var6);
                        u42 u42VarI1 = u42Var5.i0(u42Var6);
                        if (u42VarR.equals(u42VarI1)) {
                            return u42.r;
                        }
                        return u42VarR.equals(u42VarI1.o2()) ? u42.r.o2() : u42VarR.i(u42VarI1.X1());
                    case 5:
                        u42 u42Var7 = (u42) comparable;
                        u42 u42Var8 = u42.o;
                        u42 u42VarI2 = u42Var8.i0(u42Var7).i(u42Var8.R(u42Var7).X1());
                        double dA3 = u42VarI2.a1();
                        double[] dArrQ4 = u42VarI2.q2();
                        e32 e32Var3 = h32.r;
                        double d7 = u42VarI2.m / dA3;
                        e32Var3.getClass();
                        double dAcos3 = Math.acos(d7);
                        h32.y.getClass();
                        return new u42(Math.log(dA3), dArrQ4[0] * dAcos3, dArrQ4[1] * dAcos3, dArrQ4[2] * dAcos3).i(u42Var8).u1(h32.c);
                    case 6:
                        return ((u42) comparable).T0();
                    case 7:
                        u42 u42Var9 = (u42) comparable;
                        b52 b52Var4 = ia2.c0;
                        return ((u42) b52Var4.b(u42Var9)).i0((u42) b52Var4.b(u42Var9.o2())).u1(h32.c);
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        u42 u42Var10 = (u42) comparable;
                        boolean zK4 = u42Var10.k2();
                        double d8 = u42Var10.m;
                        if (zK4) {
                            h32.w.getClass();
                            return new u42(Math.exp(d8));
                        }
                        h32.w.getClass();
                        return u42.l2(Math.exp(d8), u42Var10.q2(), u42Var10.h2());
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        u42 u42Var11 = (u42) comparable;
                        double dA4 = u42Var11.a1();
                        double[] dArrQ5 = u42Var11.q2();
                        e32 e32Var4 = h32.r;
                        double d9 = u42Var11.m / dA4;
                        e32Var4.getClass();
                        double dAcos4 = Math.acos(d9);
                        h32.y.getClass();
                        return new u42(Math.log(dA4), dArrQ5[0] * dAcos4, dArrQ5[1] * dAcos4, dArrQ5[2] * dAcos4);
                    default:
                        return ((u42) comparable).o2();
                }
            }

            @Override // defpackage.c23
            public final float c(float f2) {
                return (float) ((u42) b(new u42(f2))).m;
            }
        };
        f0 = new tm() { // from class: c52
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                u42 u42Var = (u42) comparable;
                u42 u42Var2 = (u42) comparable2;
                switch (b2) {
                    case 0:
                        return u42Var.i0(u42Var2);
                    case 1:
                        return u42Var.R(u42Var2);
                    case 2:
                        u42Var.getClass();
                        return u42Var.i(u42Var2.X1());
                    case 3:
                        return u42Var.compareTo(u42Var2) <= 0 ? u42Var2 : u42Var;
                    case 4:
                        return u42Var.compareTo(u42Var2) >= 0 ? u42Var2 : u42Var;
                    default:
                        return u42Var.i(u42Var2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((u42) a(new u42(d2), new u42(d3))).m;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((u42) a(new u42(f2), new u42(f3))).m;
            }
        };
        g0 = new Object();
        h0 = new ss2(b3);
        i0 = new h33((byte) 16);
        j0 = new h33(b4);
    }

    public static final CharSequence A(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? co2.e0(4999, charSequence) : co2.e0(5000, charSequence);
    }

    public static final void B(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            wg.i(wi0.g("index (", i2, ") is out of bound of [0, ", i3, ")"));
        }
    }

    public static final Object C(ga2 ga2Var, vp0 vp0Var, m10 m10Var) {
        return D(ga2Var, new ya(ga2Var, vp0Var, null, (byte) 3), m10Var);
    }

    public static final Object D(ga2 ga2Var, vp0 vp0Var, m10 m10Var) {
        ha2 ha2Var = new ha2(vp0Var, null, (byte) 0);
        az2 az2Var = (az2) m10Var.e().m(az2.i);
        q20 q20Var = az2Var != null ? az2Var.h : null;
        if (q20Var != null) {
            return ie1.G(q20Var, ha2Var, m10Var);
        }
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        try {
            bz2 bz2Var = ga2Var.d;
            if (bz2Var != null) {
                bz2Var.execute(new r82(rqVar, ga2Var, ha2Var));
                return rqVar.t();
            }
            uz0.A("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            rqVar.l(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    public static final int E(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void a(ab0 ab0Var, rg1 rg1Var, vp0 vp0Var, dm dmVar, String str, vp0 vp0Var2, nx nxVar, dr0 dr0Var, int i2) {
        dm dmVar2;
        vp0 vp0Var3;
        dr0Var.W(1501828832);
        int i3 = i2 | (dr0Var.f(ab0Var) ? 4 : 2) | (dr0Var.f(rg1Var) ? 32 : 16) | (dr0Var.h(vp0Var) ? 256 : 128) | 199680;
        if (dr0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            dm dmVar3 = c5.i;
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = wb.j;
                dr0Var.f0(objK);
            }
            vp0Var3 = (vp0) objK;
            b(t03.S(ab0Var, str, dr0Var, (i3 & 14) | 48, 0), rg1Var, vp0Var, dmVar3, vp0Var3, nxVar, dr0Var, (i3 & 8176) | 221184);
            dmVar2 = dmVar3;
        } else {
            dr0Var.Q();
            dmVar2 = dmVar;
            vp0Var3 = vp0Var2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new dc(ab0Var, rg1Var, vp0Var, dmVar2, str, vp0Var3, nxVar, i2);
        }
    }

    public static final void b(qz2 qz2Var, rg1 rg1Var, vp0 vp0Var, dm dmVar, vp0 vp0Var2, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(511725103);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(qz2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(vp0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var.f(dmVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var.h(vp0Var2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= dr0Var.h(nxVar) ? 131072 : 65536;
        }
        if (dr0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = wb.k;
                dr0Var.f0(objK);
            }
            c(qz2Var, rg1Var, vp0Var, dmVar, vp0Var2, (vp0) objK, nxVar, dr0Var, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new xb(qz2Var, rg1Var, vp0Var, dmVar, vp0Var2, nxVar, i2);
        }
    }

    public static final void c(qz2 qz2Var, rg1 rg1Var, vp0 vp0Var, dm dmVar, vp0 vp0Var2, vp0 vp0Var3, nx nxVar, dr0 dr0Var, int i2) {
        dr0 dr0Var2;
        lu1 lu1Var;
        mj1 mj1Var;
        ll2 ll2Var;
        ll2 ll2Var2;
        lz2 lz2VarQ;
        dr0 dr0Var3;
        int i3;
        int i4;
        dr0Var.W(1935038908);
        int i5 = (i2 & 6) == 0 ? (dr0Var.f(qz2Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= dr0Var.h(vp0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= dr0Var.f(dmVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= dr0Var.h(vp0Var2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= dr0Var.h(vp0Var3) ? 131072 : 65536;
        }
        nx nxVar2 = nxVar;
        if ((1572864 & i2) == 0) {
            i5 |= dr0Var.h(nxVar2) ? 1048576 : 524288;
        }
        if (dr0Var.N(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z2 || objK == yyVar) {
                objK = new oc(qz2Var, dmVar);
                dr0Var.f0(objK);
            }
            oc ocVar = (oc) objK;
            boolean z3 = i6 == 4;
            Object objK2 = dr0Var.K();
            Object obj = objK2;
            if (z3 || objK2 == yyVar) {
                Object[] objArr = {qz2Var.a.g()};
                ll2 ll2Var3 = new ll2();
                ll2Var3.addAll(gi.b0(objArr));
                dr0Var.f0(ll2Var3);
                obj = ll2Var3;
            }
            ll2 ll2Var4 = (ll2) obj;
            lu1 lu1Var2 = qz2Var.e;
            lu1 lu1Var3 = qz2Var.d;
            int i7 = i5;
            qy qyVar = qz2Var.a;
            boolean zF = (i6 == 4) | dr0Var.f(lu1Var2.getValue());
            Object objK3 = dr0Var.K();
            if (zF || objK3 == yyVar) {
                long[] jArr = bd2.a;
                objK3 = new mj1();
                dr0Var.f0(objK3);
            }
            mj1 mj1Var2 = (mj1) objK3;
            if (!ll2Var4.contains(qyVar.g())) {
                ll2Var4.clear();
                ll2Var4.add(qyVar.g());
            }
            if (uz0.g(qyVar.g(), lu1Var3.getValue()) && lu1Var2.getValue() == null) {
                if (ll2Var4.size() != 1 || !uz0.g(ll2Var4.get(0), qyVar.g())) {
                    ll2Var4.clear();
                    ll2Var4.add(qyVar.g());
                }
                if (mj1Var2.e != 1 || mj1Var2.c(qyVar.g())) {
                    mj1Var2.a();
                }
                ocVar.b = dmVar;
            }
            Object value = lu1Var2.getValue();
            if (value == null || value.equals(qyVar.g())) {
                lu1Var = lu1Var3;
            } else {
                ListIterator listIterator = ll2Var4.listIterator();
                int i8 = 0;
                while (true) {
                    ht0 ht0Var = (ht0) listIterator;
                    if (!ht0Var.hasNext()) {
                        lu1Var = lu1Var3;
                        i4 = -1;
                        break;
                    }
                    lu1Var = lu1Var3;
                    if (uz0.g(vp0Var2.h(ht0Var.next()), vp0Var2.h(value))) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                        lu1Var3 = lu1Var;
                    }
                }
                if (i4 == -1) {
                    ll2Var4.add(value);
                } else if (!uz0.g(ll2Var4.get(i4), value)) {
                    ll2Var4.set(i4, value);
                }
            }
            if (!uz0.g(qyVar.g(), lu1Var.getValue())) {
                ListIterator listIterator2 = ll2Var4.listIterator();
                int i9 = 0;
                while (true) {
                    ht0 ht0Var2 = (ht0) listIterator2;
                    if (!ht0Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (uz0.g(vp0Var2.h(ht0Var2.next()), vp0Var2.h(lu1Var.getValue()))) {
                            i3 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == -1) {
                    ll2Var4.add(lu1Var.getValue());
                } else if (!uz0.g(ll2Var4.get(i3), lu1Var.getValue()) || i3 != ll2Var4.size() - 1) {
                    uz0.g(lu1Var.getValue(), ll2Var4.get(i3));
                    ll2Var4.remove(i3);
                    ll2Var4.add(lu1Var.getValue());
                }
            }
            Object value2 = lu1Var2.getValue();
            boolean zF2 = dr0Var.f(value2);
            Object objK4 = dr0Var.K();
            if (zF2 || objK4 == yyVar) {
                objK4 = value2 != null ? new zv1(ocVar, lu1Var.getValue(), value2) : null;
                dr0Var.f0(objK4);
            }
            zv1 zv1Var = (zv1) objK4;
            boolean zF3 = dr0Var.f(zv1Var) | ((i7 & 458752) == 131072);
            Object objK5 = dr0Var.K();
            if (zF3 || objK5 == yyVar) {
                if (zv1Var != null && vp0Var3.h(zv1Var) != null) {
                    li1.c();
                    return;
                } else {
                    objK5 = null;
                    dr0Var.f0(null);
                }
            }
            if (objK5 != null) {
                li1.c();
                return;
            }
            if (mj1Var2.b(lu1Var.getValue()) && mj1Var2.b(qyVar.g()) && (value2 == null || mj1Var2.b(value2))) {
                dr0Var.V(-297322234);
                dr0Var.p(false);
                mj1Var = mj1Var2;
                ll2Var = ll2Var4;
            } else {
                dr0Var.V(-302069574);
                mj1Var2.a();
                int size = ll2Var4.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    Object obj2 = ll2Var4.get(i10);
                    mj1 mj1Var3 = mj1Var2;
                    mj1Var3.n(obj2, dt.N(427839334, new dc(obj2, qz2Var, zv1Var, vp0Var, ocVar, ll2Var4, nxVar2), dr0Var));
                    i10++;
                    ll2Var4 = ll2Var4;
                    mj1Var2 = mj1Var3;
                    size = i11;
                    nxVar2 = nxVar;
                }
                mj1Var = mj1Var2;
                ll2Var = ll2Var4;
                dr0Var.p(false);
            }
            boolean zF4 = dr0Var.f(ocVar) | dr0Var.f(qz2Var.f()) | dr0Var.f(lu1Var2.getValue());
            Object objK6 = dr0Var.K();
            if (zF4 || objK6 == yyVar) {
                objK6 = (z00) vp0Var.h(ocVar);
                dr0Var.f0(objK6);
            }
            z00 z00Var = (z00) objK6;
            qz2 qz2Var2 = ocVar.a;
            boolean zF5 = dr0Var.f(ocVar);
            Object objK7 = dr0Var.K();
            if (zF5 || objK7 == yyVar) {
                objK7 = rz1.x(Boolean.FALSE);
                dr0Var.f0(objK7);
            }
            sj1 sj1Var = (sj1) objK7;
            sj1 sj1VarC = rz1.C(z00Var.d, dr0Var);
            if (uz0.g(qz2Var2.a.g(), qz2Var2.d.getValue())) {
                sj1Var.setValue(Boolean.FALSE);
            } else if (sj1VarC.getValue() != null) {
                sj1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) sj1Var.getValue()).booleanValue();
            rg1 rg1Var2 = og1.h;
            if (zBooleanValue) {
                dr0Var.V(1353077497);
                ll2Var2 = ll2Var;
                dr0 dr0Var4 = dr0Var;
                lz2VarQ = t03.q(ocVar.a, aa3.X, null, dr0Var4, 0, 2);
                boolean zF6 = dr0Var4.f(lz2VarQ);
                Object objK8 = dr0Var4.K();
                if (zF6 || objK8 == yyVar) {
                    objK8 = ou.p(rg1Var2);
                    dr0Var4.f0(objK8);
                }
                rg1Var2 = (rg1) objK8;
                dr0Var4.p(false);
                dr0Var3 = dr0Var4;
            } else {
                dr0 dr0Var5 = dr0Var;
                ll2Var2 = ll2Var;
                dr0Var5.V(1353343539);
                dr0Var5.p(false);
                lz2VarQ = null;
                dr0Var3 = dr0Var5;
            }
            rg1 rg1VarC = rg1Var.c(rg1Var2.c(new kc(lz2VarQ, sj1VarC, ocVar)));
            Object objK9 = dr0Var3.K();
            if (objK9 == yyVar) {
                objK9 = new gc(ocVar);
                dr0Var3.f0(objK9);
            }
            gc gcVar = (gc) objK9;
            int iHashCode = Long.hashCode(dr0Var3.T);
            dx1 dx1VarL = dr0Var3.l();
            rg1 rg1VarU = ls.U(dr0Var3, rg1VarC);
            sy.f.getClass();
            dr0Var3.Y();
            if (dr0Var3.S) {
                dr0Var3.k(l41.W);
            } else {
                dr0Var3.i0();
            }
            h12.y(c5.F, dr0Var3, gcVar);
            h12.y(c5.E, dr0Var3, dx1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yx yxVar = c5.G;
            if (dr0Var3.S) {
                dr0Var3.b(yxVar, numValueOf);
            }
            h12.t(dr0Var3);
            h12.y(c5.D, dr0Var3, rg1VarU);
            dr0Var3.V(758586195);
            int size2 = ll2Var2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj3 = ll2Var2.get(i12);
                dr0Var3.R(1420119555, 0, vp0Var2.h(obj3), null);
                zp0 zp0Var = (zp0) mj1Var.g(obj3);
                if (zp0Var == null) {
                    dr0Var3.V(1074069702);
                } else {
                    dr0Var3.V(1420120731);
                    zp0Var.f(dr0Var3, 0);
                }
                dr0Var3.p(false);
                dr0Var3.p(false);
            }
            dr0Var3.p(false);
            dr0Var3.p(true);
            dr0Var2 = dr0Var3;
        } else {
            vp0Var = vp0Var;
            dr0 dr0Var6 = dr0Var;
            dr0Var6.Q();
            dr0Var2 = dr0Var6;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new yb(qz2Var, rg1Var, vp0Var, dmVar, vp0Var2, vp0Var3, nxVar, i2);
        }
    }

    public static final void d(int i2, dr0 dr0Var) {
        ex exVar;
        p3 p3Var;
        yy yyVar;
        sj1 sj1Var;
        final MealPlannerApp mealPlannerApp;
        sj1 sj1Var2;
        boolean z2;
        sj1 sj1Var3;
        final sj1 sj1Var4;
        yy yyVar2;
        sj1 sj1Var5;
        byte b2;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(774266163);
        byte b3 = 0;
        byte b4 = 1;
        byte b5 = 2;
        if (dr0Var2.N(i2 & 1, i2 != 0)) {
            ie0 ie0Var = i7.b;
            Context context = (Context) dr0Var2.j(ie0Var);
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp2 = (MealPlannerApp) applicationContext;
            Object objK = dr0Var2.K();
            yy yyVar3 = zy.a;
            if (objK == yyVar3) {
                objK = h7.Y(dr0Var2);
                dr0Var2.f0(objK);
            }
            final x20 x20Var = (x20) objK;
            Object[] objArr = new Object[0];
            Object objK2 = dr0Var2.K();
            if (objK2 == yyVar3) {
                objK2 = new r3((byte) 15);
                dr0Var2.f0(objK2);
            }
            final sj1 sj1Var6 = (sj1) rz1.z(objArr, (kp0) objK2, dr0Var2, 48);
            Object objK3 = dr0Var2.K();
            if (objK3 == yyVar3) {
                objK3 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK3);
            }
            final sj1 sj1Var7 = (sj1) objK3;
            Object objK4 = dr0Var2.K();
            if (objK4 == yyVar3) {
                objK4 = rz1.x(null);
                dr0Var2.f0(objK4);
            }
            sj1 sj1Var8 = (sj1) objK4;
            Object objK5 = dr0Var2.K();
            if (objK5 == yyVar3) {
                objK5 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK5);
            }
            final sj1 sj1Var9 = (sj1) objK5;
            Object objK6 = dr0Var2.K();
            if (objK6 == yyVar3) {
                objK6 = rz1.x(null);
                dr0Var2.f0(objK6);
            }
            final sj1 sj1Var10 = (sj1) objK6;
            Object objK7 = dr0Var2.K();
            if (objK7 == yyVar3) {
                objK7 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK7);
            }
            final sj1 sj1Var11 = (sj1) objK7;
            Object objK8 = dr0Var2.K();
            if (objK8 == yyVar3) {
                objK8 = rz1.x(Boolean.valueOf(((File) mealPlannerApp2.a().b().i).exists()));
                dr0Var2.f0(objK8);
            }
            final sj1 sj1Var12 = (sj1) objK8;
            p3 p3Var2 = new p3(b3);
            boolean zH = dr0Var2.h(x20Var) | dr0Var2.h(context) | dr0Var2.h(mealPlannerApp2);
            Object objK9 = dr0Var2.K();
            if (zH || objK9 == yyVar3) {
                objK9 = new lj(x20Var, sj1Var11, context, mealPlannerApp2, sj1Var8, sj1Var10);
                dr0Var2.f0(objK9);
            }
            rz1.C(p3Var2, dr0Var2);
            sj1 sj1VarC = rz1.C((vp0) objK9, dr0Var2);
            Object[] objArr2 = new Object[0];
            Object objK10 = dr0Var2.K();
            if (objK10 == yyVar3) {
                objK10 = new r3(b4);
                dr0Var2.f0(objK10);
            }
            String str = (String) rz1.z(objArr2, (kp0) objK10, dr0Var2, 48);
            x3 x3Var = (x3) dr0Var2.j(nb1.a);
            if (x3Var == null) {
                dr0Var2.V(1213380307);
                Context baseContext = (Context) dr0Var2.j(ie0Var);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof x3) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                x3Var = (x3) baseContext;
            } else {
                dr0Var2.V(1213379439);
            }
            dr0Var2.p(false);
            if (x3Var == null) {
                li1.g("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
                return;
            }
            ex exVarE = x3Var.e();
            Object objK11 = dr0Var2.K();
            if (objK11 == yyVar3) {
                objK11 = new q3();
                dr0Var2.f0(objK11);
            }
            q3 q3Var = (q3) objK11;
            Object objK12 = dr0Var2.K();
            if (objK12 == yyVar3) {
                objK12 = new rd1(q3Var);
                dr0Var2.f0(objK12);
            }
            final rd1 rd1Var = (rd1) objK12;
            boolean zH2 = dr0Var2.h(q3Var) | dr0Var2.h(exVarE) | dr0Var2.f(str) | dr0Var2.h(p3Var2) | dr0Var2.f(sj1VarC);
            Object objK13 = dr0Var2.K();
            if (zH2 || objK13 == yyVar3) {
                objK13 = new u3(q3Var, exVarE, str, p3Var2, sj1VarC, (byte) 0);
                exVar = exVarE;
                p3Var = p3Var2;
                dr0Var2.f0(objK13);
            } else {
                exVar = exVarE;
                p3Var = p3Var2;
            }
            vp0 vp0Var = (vp0) objK13;
            boolean zF = dr0Var2.f(exVar) | dr0Var2.f(str) | dr0Var2.f(p3Var);
            Object objK14 = dr0Var2.K();
            if (zF || objK14 == yyVar3) {
                objK14 = new fb0(vp0Var);
                dr0Var2.f0(objK14);
            }
            t03.d(yj2.a, null, null, null, dt.N(836986533, new aq0() { // from class: mj
                @Override // defpackage.aq0
                public final Object c(Object obj, Object obj2, Object obj3) {
                    byte b6;
                    boolean z3;
                    dr0 dr0Var3 = (dr0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((bw) obj).getClass();
                    if (dr0Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        rg1 rg1VarG = t03.G(og1.h, 16.0f);
                        ah ahVar = new ah(8.0f, new wg((byte) 0));
                        bm bmVar = c5.u;
                        aw awVarA = yv.a(ahVar, bmVar, dr0Var3, 6);
                        int iHashCode = Long.hashCode(dr0Var3.T);
                        dx1 dx1VarL = dr0Var3.l();
                        rg1 rg1VarU = ls.U(dr0Var3, rg1VarG);
                        sy.f.getClass();
                        dr0Var3.Y();
                        boolean z4 = dr0Var3.S;
                        jw0 jw0Var = l41.W;
                        if (z4) {
                            dr0Var3.k(jw0Var);
                        } else {
                            dr0Var3.i0();
                        }
                        yx yxVar = c5.F;
                        h12.y(yxVar, dr0Var3, awVarA);
                        yx yxVar2 = c5.E;
                        h12.y(yxVar2, dr0Var3, dx1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        yx yxVar3 = c5.G;
                        h12.y(yxVar3, dr0Var3, numValueOf);
                        h12.t(dr0Var3);
                        yx yxVar4 = c5.D;
                        h12.y(yxVar4, dr0Var3, rg1VarU);
                        ie0 ie0Var2 = e13.a;
                        gw2.b("备份与恢复", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var3.j(ie0Var2)).h, dr0Var3, 6, 0, 131070);
                        gw2.b("备份包含食材、菜谱、家人、时间表和体重记录，不包含已生成的食谱。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var3.j(ie0Var2)).l, dr0Var3, 6, 0, 131070);
                        cm cmVar = c5.s;
                        yi0 yi0Var = yj2.a;
                        ua2 ua2VarA = ta2.a(uz0.e, cmVar, dr0Var3, 48);
                        int iHashCode2 = Long.hashCode(dr0Var3.T);
                        dx1 dx1VarL2 = dr0Var3.l();
                        rg1 rg1VarU2 = ls.U(dr0Var3, yi0Var);
                        dr0Var3.Y();
                        if (dr0Var3.S) {
                            dr0Var3.k(jw0Var);
                        } else {
                            dr0Var3.i0();
                        }
                        h12.y(yxVar, dr0Var3, ua2VarA);
                        h12.y(yxVar2, dr0Var3, dx1VarL2);
                        wi0.p(iHashCode2, dr0Var3, yxVar3, dr0Var3);
                        h12.y(yxVar4, dr0Var3, rg1VarU2);
                        b51 b51Var = new b51(1.0f, true);
                        aw awVarA2 = yv.a(uz0.g, bmVar, dr0Var3, 0);
                        int iHashCode3 = Long.hashCode(dr0Var3.T);
                        dx1 dx1VarL3 = dr0Var3.l();
                        rg1 rg1VarU3 = ls.U(dr0Var3, b51Var);
                        dr0Var3.Y();
                        if (dr0Var3.S) {
                            dr0Var3.k(jw0Var);
                        } else {
                            dr0Var3.i0();
                        }
                        h12.y(yxVar, dr0Var3, awVarA2);
                        h12.y(yxVar2, dr0Var3, dx1VarL3);
                        wi0.p(iHashCode3, dr0Var3, yxVar3, dr0Var3);
                        h12.y(yxVar4, dr0Var3, rg1VarU3);
                        gw2.b("不包含身体数据", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262142);
                        gw2.b("出生年份、身高、体重、目标体重和体重记录都不导出", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var3.j(ie0Var2)).l, dr0Var3, 6, 0, 131070);
                        dr0Var3.p(true);
                        sj1 sj1Var13 = sj1Var6;
                        boolean zBooleanValue = ((Boolean) sj1Var13.getValue()).booleanValue();
                        boolean zF2 = dr0Var3.f(sj1Var13);
                        Object objK15 = dr0Var3.K();
                        yy yyVar4 = zy.a;
                        if (zF2 || objK15 == yyVar4) {
                            objK15 = new cb(sj1Var13, (byte) 1);
                            dr0Var3.f0(objK15);
                        }
                        xq2.a(zBooleanValue, (vp0) objK15, null, false, null, dr0Var3, 0);
                        dr0Var3.p(true);
                        sj1 sj1Var14 = sj1Var11;
                        boolean z5 = !((Boolean) sj1Var14.getValue()).booleanValue();
                        Object objK16 = dr0Var3.K();
                        if (objK16 == yyVar4) {
                            b6 = 6;
                            objK16 = new bb(sj1Var7, b6);
                            dr0Var3.f0(objK16);
                        } else {
                            b6 = 6;
                        }
                        byte b7 = b6;
                        aa3.a((kp0) objK16, yi0Var, z5, null, null, null, null, null, t03.c, dr0Var3, 805306422, 504);
                        boolean z6 = !((Boolean) sj1Var14.getValue()).booleanValue();
                        rd1 rd1Var2 = rd1Var;
                        boolean zH3 = dr0Var3.h(rd1Var2);
                        Object objK17 = dr0Var3.K();
                        if (zH3 || objK17 == yyVar4) {
                            objK17 = new o9(rd1Var2, b7);
                            dr0Var3.f0(objK17);
                        }
                        aa3.c((kp0) objK17, yi0Var, z6, null, null, null, null, t03.d, dr0Var3, 805306416, 504);
                        dr0 dr0Var4 = dr0Var3;
                        if (((Boolean) sj1Var12.getValue()).booleanValue()) {
                            dr0Var4.V(-466736789);
                            Object objK18 = dr0Var4.K();
                            if (objK18 == yyVar4) {
                                objK18 = new bb(sj1Var9, (byte) 7);
                                dr0Var4.f0(objK18);
                            }
                            aa3.e((kp0) objK18, null, !((Boolean) sj1Var14.getValue()).booleanValue(), null, null, null, t03.e, dr0Var4, 805306374, 506);
                            dr0Var4 = dr0Var4;
                            z3 = false;
                        } else {
                            z3 = false;
                            dr0Var4.V(-1583861689);
                        }
                        dr0Var4.p(z3);
                        String str2 = (String) sj1Var10.getValue();
                        if (str2 == null) {
                            dr0Var4.V(-1583838006);
                        } else {
                            dr0Var4.V(-1583838005);
                            dr0 dr0Var5 = dr0Var4;
                            gw2.b(str2, null, ((pv) dr0Var4.j(rv.a)).j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 0, 0, 262138);
                            dr0Var4 = dr0Var5;
                            z3 = false;
                        }
                        dr0Var4.p(z3);
                        dr0Var4.p(true);
                    } else {
                        dr0Var3.Q();
                    }
                    return j23.a;
                }
            }, dr0Var2), dr0Var2, 196614);
            byte b6 = 3;
            if (((Boolean) sj1Var7.getValue()).booleanValue()) {
                dr0Var2.V(-2103260006);
                Object objK15 = dr0Var2.K();
                if (objK15 == yyVar3) {
                    objK15 = new bb(sj1Var7, b5);
                    dr0Var2.f0(objK15);
                }
                sj1Var2 = sj1Var11;
                mealPlannerApp = mealPlannerApp2;
                yyVar = yyVar3;
                sj1Var = sj1Var8;
                z2 = false;
                uz0.a((kp0) objK15, dt.N(-350569530, new nj(x20Var, sj1Var6, sj1Var7, sj1Var11, sj1Var10, context, mealPlannerApp2), dr0Var2), null, dt.N(-1969544444, new y7(sj1Var7, b5), dr0Var2), t03.h, dt.N(-103039519, new y7(sj1Var6, b6), dr0Var2), null, 0L, 0L, 0L, 0L, null, dr0Var, 1772598, 16276);
                dr0Var2 = dr0Var;
                dr0Var2.p(false);
            } else {
                yyVar = yyVar3;
                sj1Var = sj1Var8;
                mealPlannerApp = mealPlannerApp2;
                sj1Var2 = sj1Var11;
                z2 = false;
                dr0Var2.V(-2101548465);
                dr0Var2.p(false);
            }
            hk hkVar = (hk) sj1Var.getValue();
            if (hkVar == null) {
                dr0Var2.V(-2101479553);
                dr0Var2.p(z2);
                sj1Var4 = sj1Var10;
                yyVar2 = yyVar;
            } else {
                dr0Var2.V(-2101479552);
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                Object objK16 = dr0Var2.K();
                yy yyVar4 = yyVar;
                if (objK16 == yyVar4) {
                    sj1Var3 = sj1Var;
                    objK16 = new bb(sj1Var3, (byte) 3);
                    dr0Var2.f0(objK16);
                } else {
                    sj1Var3 = sj1Var;
                }
                MealPlannerApp mealPlannerApp3 = mealPlannerApp;
                nj njVar = new nj(hkVar, x20Var, sj1Var3, sj1Var2, sj1Var12, r16, mealPlannerApp3);
                sj1Var4 = r16;
                mealPlannerApp = mealPlannerApp3;
                yyVar2 = yyVar4;
                uz0.a((kp0) objK16, dt.N(-1675341042, njVar, dr0Var2), null, dt.N(483743052, new y7(sj1Var3, (byte) 4), dr0Var2), t03.k, dt.N(-572598103, new j7(hkVar, dateTimeFormatterOfPattern, (byte) 2), dr0Var2), null, 0L, 0L, 0L, 0L, null, dr0Var, 1772598, 16276);
                dr0Var2 = dr0Var;
                dr0Var2.p(z2);
            }
            if (((Boolean) sj1Var9.getValue()).booleanValue()) {
                dr0Var2.V(-2099752542);
                Object objK17 = dr0Var2.K();
                if (objK17 == yyVar2) {
                    sj1Var5 = sj1Var9;
                    b2 = 1;
                    objK17 = new bb(sj1Var5, b2);
                    dr0Var2.f0(objK17);
                } else {
                    sj1Var5 = sj1Var9;
                    b2 = 1;
                }
                final sj1 sj1Var13 = sj1Var5;
                final sj1 sj1Var14 = sj1Var2;
                uz0.a((kp0) objK17, dt.N(-956700483, new zp0() { // from class: kj
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        dr0 dr0Var3 = (dr0) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (dr0Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x20 x20Var2 = x20Var;
                            boolean zH3 = dr0Var3.h(x20Var2);
                            MealPlannerApp mealPlannerApp4 = mealPlannerApp;
                            boolean zH4 = zH3 | dr0Var3.h(mealPlannerApp4);
                            Object objK18 = dr0Var3.K();
                            if (zH4 || objK18 == zy.a) {
                                jj jjVar = new jj(x20Var2, sj1Var13, sj1Var14, sj1Var12, sj1Var4, mealPlannerApp4);
                                dr0Var3.f0(jjVar);
                                objK18 = jjVar;
                            }
                            aa3.e((kp0) objK18, null, false, null, null, null, t03.l, dr0Var3, 805306368, 510);
                        } else {
                            dr0Var3.Q();
                        }
                        return j23.a;
                    }
                }, dr0Var2), null, dt.N(-2013431685, new y7(sj1Var5, b2), dr0Var2), t03.n, t03.o, null, 0L, 0L, 0L, 0L, null, dr0Var, 1772598, 16276);
                dr0Var2 = dr0Var;
                dr0Var2.p(z2);
            } else {
                dr0Var2.V(-2098848241);
                dr0Var2.p(z2);
            }
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new ig(i2, (byte) 2);
        }
    }

    public static final void e(sj1 sj1Var, boolean z2) {
        sj1Var.setValue(Boolean.valueOf(z2));
    }

    public static final void f(rg1 rg1Var, vp0 vp0Var, dr0 dr0Var, int i2) {
        dr0Var.W(-932836462);
        int i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2 | (dr0Var.h(vp0Var) ? 32 : 16);
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            y02.d(dr0Var, aa3.h(rg1Var, vp0Var));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 3, i2, rg1Var, vp0Var);
        }
    }

    public static final boolean g(pn2 pn2Var, int i2, h0 h0Var, boolean z2) {
        boolean z3;
        synchronized (g0) {
            int i3 = pn2Var.d;
            if (i3 == i2) {
                pn2Var.c = h0Var;
                z3 = true;
                if (z2) {
                    pn2Var.e++;
                }
                pn2Var.d = i3 + 1;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public static final Object h(ga2 ga2Var, vp0 vp0Var, m10 m10Var) {
        if (ga2Var.i() && ga2Var.k() && ga2Var.j()) {
            return vp0Var.h(m10Var);
        }
        return m10Var.e().m(vq.j) == null ? vp0Var.h(m10Var) : D(ga2Var, vp0Var, m10Var);
    }

    public static final id i(id idVar) {
        id idVarC = idVar.c();
        int iB = idVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            idVarC.e(i2, idVar.a(i2));
        }
        return idVarC;
    }

    public static final rg1 j(rg1 rg1Var, boolean z2, ui1 ui1Var) {
        return rg1Var.c(z2 ? new nm0(ui1Var) : og1.h);
    }

    public static final int k(rh2 rh2Var, c11 c11Var, String str) {
        rh2Var.getClass();
        str.getClass();
        s(c11Var, rh2Var);
        int iA = rh2Var.a(str);
        if (iA != -3 || !c11Var.a.f) {
            return iA;
        }
        rh2Var.getClass();
        g2 g2Var = c11Var.c;
        h6 h6Var = new h6((Object) rh2Var, (Object) c11Var, (byte) 19);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g2Var.i;
        Map map = (Map) concurrentHashMap.get(rh2Var);
        yy yyVar = s;
        Object obj = map != null ? map.get(yyVar) : null;
        Object objA = obj != null ? obj : null;
        if (objA == null) {
            objA = h6Var.a();
            Object concurrentHashMap2 = concurrentHashMap.get(rh2Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(rh2Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(yyVar, objA);
        }
        Integer num = (Integer) ((Map) objA).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final r21 l(r21 r21Var) {
        return r21Var.d().h() ? r21Var : new uo1(r21Var);
    }

    public static final pn2 m(ll2 ll2Var) {
        pn2 pn2Var = ll2Var.h;
        pn2Var.getClass();
        return (pn2) bl2.s(pn2Var, ll2Var);
    }

    public static final int n(ll2 ll2Var) {
        pn2 pn2Var = ll2Var.h;
        pn2Var.getClass();
        return ((pn2) bl2.f(pn2Var)).e;
    }

    public static final boolean o(c11 c11Var, rh2 rh2Var) {
        rh2Var.getClass();
        if (c11Var.a.a) {
            return true;
        }
        List annotations = rh2Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof s11) {
                return true;
            }
        }
        return false;
    }

    public static final rg1 p(rg1 rg1Var) {
        return rg1Var.c(new br2(j0));
    }

    public static final rg1 q(rg1 rg1Var, p61 p61Var) {
        return rg1Var.c(new db0(p61Var));
    }

    public static final boolean r(ll2 ll2Var, vp0 vp0Var) {
        int i2;
        h0 h0Var;
        Object objH;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (g0) {
                pn2 pn2Var = ll2Var.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i2 = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            ox1 ox1VarE = h0Var.e();
            objH = vp0Var.h(ox1VarE);
            h0 h0VarC = ox1VarE.c();
            if (uz0.g(h0VarC, h0Var)) {
                break;
            }
            pn2 pn2Var3 = ll2Var.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = g((pn2) bl2.w(pn2Var3, ll2Var, uk2VarH), i2, h0VarC, true);
            }
            bl2.l(uk2VarH, ll2Var);
        } while (!zG);
        return ((Boolean) objH).booleanValue();
    }

    public static final void s(c11 c11Var, rh2 rh2Var) {
        rh2Var.getClass();
        uz0.g(rh2Var.c(), po2.i);
    }

    public static final rg1 t(rg1 rg1Var, boolean z2, ui1 ui1Var, aa2 aa2Var, boolean z3, ba2 ba2Var, kp0 kp0Var) {
        rg1 rg1VarC;
        if (aa2Var != null) {
            rg1VarC = new wf2(z2, ui1Var, aa2Var, z3, ba2Var, kp0Var);
        } else if (aa2Var == null) {
            rg1VarC = new wf2(z2, ui1Var, null, z3, ba2Var, kp0Var);
        } else {
            og1 og1Var = og1.h;
            rg1VarC = ui1Var != null ? av0.a(og1Var, ui1Var, aa2Var).c(new wf2(z2, ui1Var, null, z3, ba2Var, kp0Var)) : ls.t(og1Var, new xf2(aa2Var, z2, z3, ba2Var, kp0Var));
        }
        return rg1Var.c(rg1VarC);
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final rg1 v(rg1 rg1Var) {
        return rg1Var.c(new br2(i0));
    }

    public static final BlendMode w(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final z00 x(ah0 ah0Var, wh0 wh0Var) {
        return new z00(ah0Var, wh0Var, (ak2) null, 12);
    }

    public static final rg1 y(boolean z2, ui1 ui1Var, boolean z3, ba2 ba2Var, vp0 vp0Var) {
        return hg1.h.c(new yx2(z2, ui1Var, z3, ba2Var, vp0Var));
    }

    public static final rg1 z(kp0 kp0Var, aa2 aa2Var, ba2 ba2Var, by2 by2Var, boolean z2) {
        if (aa2Var != null) {
            return new b03(by2Var, null, aa2Var, z2, ba2Var, kp0Var);
        }
        if (aa2Var == null) {
            return new b03(by2Var, null, null, z2, ba2Var, kp0Var);
        }
        return ls.t(og1.h, new zx2(kp0Var, aa2Var, ba2Var, by2Var, z2));
    }
}
