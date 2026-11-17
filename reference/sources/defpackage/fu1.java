package defpackage;

import java.util.Objects;
import java.util.function.IntSupplier;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 implements IntSupplier {
    public static final fu1 i;
    public static final fu1 j;
    public static final /* synthetic */ fu1[] k;
    public final IntSupplier h;

    static {
        final byte b = 0;
        fu1 fu1Var = new fu1("THREADS", 0, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        });
        i = fu1Var;
        final byte b2 = 1;
        fu1 fu1Var2 = new fu1("CORES", 1, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b2) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        });
        j = fu1Var2;
        final byte b3 = 2;
        final byte b4 = 3;
        final byte b5 = 4;
        final byte b6 = 5;
        final byte b7 = 6;
        final byte b8 = 7;
        final byte b9 = 8;
        k = new fu1[]{fu1Var, fu1Var2, new fu1("UNITS", 2, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b3) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("EIGHT", 3, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b4) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("SIX", 4, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b5) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("FOUR", 5, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b6) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("THREE", 6, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b7) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("TWO", 7, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b8) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        }), new fu1("ONE", 8, new IntSupplier() { // from class: eu1
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                switch (b9) {
                    case 0:
                        return aq1.a.i;
                    case 1:
                        return aq1.a.l;
                    case 2:
                        return aq1.a.m;
                    case 3:
                        return 8;
                    case 4:
                        return 6;
                    case 5:
                        return 4;
                    case 6:
                        return 3;
                    case 7:
                        return 2;
                    default:
                        return 1;
                }
            }
        })};
    }

    public fu1(String str, int i2, IntSupplier intSupplier) {
        super(str, i2);
        this.h = intSupplier;
    }

    public static fu1 valueOf(String str) {
        return (fu1) Enum.valueOf(fu1.class, str);
    }

    public static fu1[] values() {
        return (fu1[]) k.clone();
    }

    public final u8 a() {
        d40 d40Var = t32.b.a;
        u8 u8Var = new u8();
        u8Var.a = 128;
        Objects.requireNonNull(d40Var);
        u8Var.b = d40Var;
        u8Var.c = this;
        return u8Var;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        return this.h.getAsInt();
    }
}
