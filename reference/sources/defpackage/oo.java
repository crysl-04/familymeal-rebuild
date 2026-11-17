package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oo {
    public final uj1 a = new uj1(new po[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.r72 r8, defpackage.n10 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.no
            if (r0 == 0) goto L13
            r0 = r9
            no r0 = (defpackage.no) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            no r0 = new no
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.q
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.n
            int r8 = r0.m
            java.lang.Object[] r1 = r0.l
            r72 r3 = r0.k
            defpackage.m02.y(r9)
            r9 = r3
            goto L63
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            r7 = 0
            return r7
        L35:
            defpackage.m02.y(r9)
            uj1 r7 = r7.a
            java.lang.Object[] r9 = r7.h
            int r7 = r7.j
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L65
            r3 = r1[r8]
            po r3 = (defpackage.po) r3
            o9 r4 = new o9
            r5 = 8
            r4.<init>(r9, r5)
            r0.k = r9
            r0.l = r1
            r0.m = r8
            r0.n = r7
            r0.q = r2
            java.lang.Object r3 = defpackage.tz0.l(r3, r4, r0)
            y20 r4 = defpackage.y20.h
            if (r3 != r4) goto L63
            return r4
        L63:
            int r8 = r8 + r2
            goto L43
        L65:
            j23 r7 = defpackage.j23.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo.a(r72, n10):java.lang.Object");
    }
}
