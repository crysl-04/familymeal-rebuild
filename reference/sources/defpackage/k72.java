package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k72 extends mq2 implements aq0 {
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public nj1 o;
    public nj1 p;
    public nj1 q;
    public dd2 r;
    public nj1 s;
    public byte t;
    public /* synthetic */ kb u;
    public final /* synthetic */ l72 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(l72 l72Var, m10 m10Var) {
        super(3, m10Var);
        this.v = l72Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[Catch: all -> 0x0102, LOOP:1: B:11:0x003c->B:21:0x0072, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: all -> 0x0102, LOOP:3: B:26:0x008a->B:36:0x00b7, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[Catch: all -> 0x0102, LOOP:5: B:40:0x00ca->B:50:0x00fa, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[EDGE_INSN: B:61:0x007d->B:23:0x007d BREAK  A[LOOP:1: B:11:0x003c->B:21:0x0072], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[EDGE_INSN: B:66:0x00ba->B:37:0x00ba BREAK  A[LOOP:3: B:26:0x008a->B:36:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[EDGE_INSN: B:71:0x00fd->B:51:0x00fd BREAK  A[LOOP:5: B:40:0x00ca->B:50:0x00fa], SYNTHETIC] */
    public static final void t(l72 l72Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, nj1 nj1Var, nj1 nj1Var2, nj1 nj1Var3, nj1 nj1Var4) {
        char c;
        long j;
        long j2;
        synchronized (l72Var.c) {
            arrayList.clear();
            arrayList2.clear();
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                oz ozVar = (oz) arrayList3.get(i);
                ozVar.a();
                l72Var.L(ozVar);
            }
            arrayList3.clear();
            Object[] objArr = nj1Var.b;
            long[] jArr = nj1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                j = 255;
                while (true) {
                    long j3 = jArr[i2];
                    c = 7;
                    j2 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j3 & 255) < 128) {
                                oz ozVar2 = (oz) objArr[(i2 << 3) + i4];
                                ozVar2.a();
                                l72Var.L(ozVar2);
                            }
                            j3 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else {
                c = 7;
                j = 255;
                j2 = -9187201950435737472L;
            }
            nj1Var.b();
            Object[] objArr2 = nj1Var2.b;
            long[] jArr2 = nj1Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << c) & j4 & j2) == j2) {
                        if (i5 != length2) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & j) < 128) {
                                ((oz) objArr2[(i5 << 3) + i7]).g();
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            nj1Var2.b();
            nj1Var3.b();
            Object[] objArr3 = nj1Var4.b;
            long[] jArr3 = nj1Var4.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j5 = jArr3[i8];
                    if ((((~j5) << c) & j5 & j2) == j2) {
                        if (i8 != length3) {
                            break;
                            break;
                        }
                        i8++;
                    } else {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j5 & j) < 128) {
                                oz ozVar3 = (oz) objArr3[(i8 << 3) + i10];
                                ozVar3.a();
                                l72Var.L(ozVar3);
                            }
                            j5 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 != length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            nj1Var4.b();
        }
    }

    public static final void u(ArrayList arrayList, l72 l72Var) {
        arrayList.clear();
        synchronized (l72Var.c) {
            ArrayList arrayList2 = l72Var.k;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((ph1) arrayList2.get(i));
            }
            l72Var.k.clear();
        }
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        k72 k72Var = new k72(this.v, (m10) obj3);
        k72Var.u = (kb) obj2;
        k72Var.r(j23.a);
        return y20.h;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d2 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x00ca, B:22:0x00d2), top: B:59:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0132 -> B:41:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01e2 -> B:12:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k72.r(java.lang.Object):java.lang.Object");
    }
}
