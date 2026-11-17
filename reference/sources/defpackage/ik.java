package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ik extends mq2 implements vp0 {
    public a92 l;
    public List m;
    public ok n;
    public Iterator o;
    public int p;
    public byte q;
    public final /* synthetic */ ok r;
    public final /* synthetic */ gk s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(ok okVar, gk gkVar, m10 m10Var) {
        super(1, m10Var);
        this.r = okVar;
        this.s = gkVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new ik(this.r, this.s, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0305  */
    /* JADX WARN: Code duplicated, block: B:105:0x0317  */
    /* JADX WARN: Code duplicated, block: B:107:0x031f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0340 A[LOOP:4: B:103:0x0311->B:109:0x0340, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0363  */
    /* JADX WARN: Code duplicated, block: B:116:0x0366 A[PHI: r1 r28
  0x0366: PHI (r1v39 a92) = (r1v36 a92), (r1v40 a92) binds: [B:115:0x0364, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0366: PHI (r28v20 com.familymeal.app.data.db.AppDatabase) = (r28v18 com.familymeal.app.data.db.AppDatabase), (r28v21 com.familymeal.app.data.db.AppDatabase) binds: [B:115:0x0364, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0380  */
    /* JADX WARN: Code duplicated, block: B:122:0x039b  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bc A[LOOP:3: B:123:0x03b6->B:125:0x03bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x03f3 A[PHI: r1 r5 r28
  0x03f3: PHI (r1v41 a92) = (r1v39 a92), (r1v42 a92) binds: [B:129:0x03f1, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x03f3: PHI (r5v38 java.util.List) = (r5v33 java.util.List), (r5v40 java.util.List) binds: [B:129:0x03f1, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x03f3: PHI (r28v22 com.familymeal.app.data.db.AppDatabase) = (r28v20 com.familymeal.app.data.db.AppDatabase), (r28v23 com.familymeal.app.data.db.AppDatabase) binds: [B:129:0x03f1, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:134:0x040e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0411 A[PHI: r1 r28
  0x0411: PHI (r1v43 a92) = (r1v41 a92), (r1v47 a92) binds: [B:135:0x040f, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0411: PHI (r28v24 com.familymeal.app.data.db.AppDatabase) = (r28v22 com.familymeal.app.data.db.AppDatabase), (r28v25 com.familymeal.app.data.db.AppDatabase) binds: [B:135:0x040f, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0428 A[LOOP:0: B:137:0x0422->B:139:0x0428, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x045e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0461 A[PHI: r28
  0x0461: PHI (r28v26 com.familymeal.app.data.db.AppDatabase) = 
  (r28v22 com.familymeal.app.data.db.AppDatabase)
  (r28v24 com.familymeal.app.data.db.AppDatabase)
  (r28v27 com.familymeal.app.data.db.AppDatabase)
 binds: [B:131:0x03f5, B:143:0x045f, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x047d A[PHI: r28
  0x047d: PHI (r28v28 com.familymeal.app.data.db.AppDatabase) = (r28v26 com.familymeal.app.data.db.AppDatabase), (r28v29 com.familymeal.app.data.db.AppDatabase) binds: [B:145:0x047b, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x049a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0075 A[PHI: r3 r14 r27 r28
  0x0075: PHI (r3v15 java.util.List) = (r3v13 java.util.List), (r3v16 java.util.List) binds: [B:79:0x0279, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r14v18 a92) = (r14v16 a92), (r14v19 a92) binds: [B:79:0x0279, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r27v14 ok) = (r27v12 ok), (r27v15 ok) binds: [B:79:0x0279, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r28v14 com.familymeal.app.data.db.AppDatabase) = (r28v12 com.familymeal.app.data.db.AppDatabase), (r28v15 com.familymeal.app.data.db.AppDatabase) binds: [B:79:0x0279, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2 A[LOOP:10: B:29:0x00ec->B:31:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:37:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0129  */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Code duplicated, block: B:49:0x018a  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01aa A[PHI: r3 r14 r27 r28
  0x01aa: PHI (r3v7 java.util.List) = (r3v5 java.util.List), (r3v8 java.util.List) binds: [B:53:0x01a8, B:20:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r14v10 a92) = (r14v8 a92), (r14v11 a92) binds: [B:53:0x01a8, B:20:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r27v6 ok) = (r27v4 ok), (r27v7 ok) binds: [B:53:0x01a8, B:20:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r28v6 com.familymeal.app.data.db.AppDatabase) = (r28v4 com.familymeal.app.data.db.AppDatabase), (r28v7 com.familymeal.app.data.db.AppDatabase) binds: [B:53:0x01a8, B:20:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c5 A[PHI: r3 r14 r27 r28
  0x01c5: PHI (r3v9 java.util.List) = (r3v7 java.util.List), (r3v10 java.util.List) binds: [B:57:0x01c3, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r14v12 a92) = (r14v10 a92), (r14v13 a92) binds: [B:57:0x01c3, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r27v8 ok) = (r27v6 ok), (r27v9 ok) binds: [B:57:0x01c3, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r28v8 com.familymeal.app.data.db.AppDatabase) = (r28v6 com.familymeal.app.data.db.AppDatabase), (r28v9 com.familymeal.app.data.db.AppDatabase) binds: [B:57:0x01c3, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0 A[LOOP:9: B:59:0x01da->B:61:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0206  */
    /* JADX WARN: Code duplicated, block: B:66:0x0209 A[PHI: r3 r14 r27 r28
  0x0209: PHI (r3v11 java.util.List) = (r3v9 java.util.List), (r3v12 java.util.List) binds: [B:65:0x0207, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r14v14 a92) = (r14v12 a92), (r14v15 a92) binds: [B:65:0x0207, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r27v10 ok) = (r27v8 ok), (r27v11 ok) binds: [B:65:0x0207, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r28v10 com.familymeal.app.data.db.AppDatabase) = (r28v8 com.familymeal.app.data.db.AppDatabase), (r28v11 com.familymeal.app.data.db.AppDatabase) binds: [B:65:0x0207, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0224 A[LOOP:8: B:67:0x021e->B:69:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0248  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b A[PHI: r3 r14 r27 r28
  0x024b: PHI (r3v13 java.util.List) = (r3v11 java.util.List), (r3v14 java.util.List) binds: [B:73:0x0249, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r14v16 a92) = (r14v14 a92), (r14v17 a92) binds: [B:73:0x0249, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r27v12 ok) = (r27v10 ok), (r27v13 ok) binds: [B:73:0x0249, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r28v12 com.familymeal.app.data.db.AppDatabase) = (r28v10 com.familymeal.app.data.db.AppDatabase), (r28v13 com.familymeal.app.data.db.AppDatabase) binds: [B:73:0x0249, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0260 A[LOOP:7: B:75:0x025a->B:77:0x0260, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0283  */
    /* JADX WARN: Code duplicated, block: B:85:0x029b  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b5 A[LOOP:5: B:89:0x02af->B:91:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x02da  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e3  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0306, code lost:
    
        if (r4 != r6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029c, code lost:
    
        if (r1 == r6) goto L148;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.r(java.lang.Object):java.lang.Object");
    }
}
