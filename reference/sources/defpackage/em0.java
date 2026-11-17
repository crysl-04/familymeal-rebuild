package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class em0 implements bm0 {
    public final t6 a;
    public final t6 b;
    public final zl0 d;
    public yi1 f;
    public lm0 h;
    public final lm0 c = new lm0(2, null, 14);
    public final dm0 e = new dm0(this);
    public final fj1 g = new fj1(1);

    public em0(t6 t6Var, t6 t6Var2) {
        this.a = t6Var;
        this.b = t6Var2;
        this.d = new zl0(this, t6Var2);
    }

    public final boolean a(boolean z) {
        ln1 ln1Var;
        if (f() != null) {
            lm0 lm0VarF = f();
            i(null);
            if (lm0VarF != null) {
                km0 km0Var = km0.h;
                km0 km0Var2 = km0.j;
                lm0VarF.K0(km0Var, km0Var2);
                if (!lm0VarF.h.u) {
                    ax0.b("visitAncestors called on an unattached node");
                }
                qg1 qg1Var = lm0VarF.h.l;
                l41 l41VarY = cu.Y(lm0VarF);
                while (l41VarY != null) {
                    if ((l41VarY.L.f.k & 1024) != 0) {
                        while (qg1Var != null) {
                            if ((qg1Var.j & 1024) != 0) {
                                qg1 qg1VarR = qg1Var;
                                uj1 uj1Var = null;
                                while (qg1VarR != null) {
                                    if (qg1VarR instanceof lm0) {
                                        ((lm0) qg1VarR).K0(km0.i, km0Var2);
                                    } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                        int i = 0;
                                        for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                            if ((qg1Var2.j & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    qg1VarR = qg1Var2;
                                                } else {
                                                    if (uj1Var == null) {
                                                        uj1Var = new uj1(new qg1[16]);
                                                    }
                                                    if (qg1VarR != null) {
                                                        uj1Var.b(qg1VarR);
                                                        qg1VarR = null;
                                                    }
                                                    uj1Var.b(qg1Var2);
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    qg1VarR = cu.R(uj1Var);
                                }
                            }
                            qg1Var = qg1Var.l;
                        }
                    }
                    l41VarY = l41VarY.u();
                    qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = vs.O(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                wg.n();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        t6 t6Var = this.a;
        if (t6Var.isFocused() || t6Var.hasFocus()) {
            t6Var.clearFocus();
        } else if (t6Var.hasFocus()) {
            View viewFindFocus = t6Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            t6Var.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0144 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0152 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x00ca A[EDGE_INSN: B:296:0x00ca->B:68:0x00ca BREAK  A[LOOP:11: B:31:0x0061->B:299:0x0061, LOOP_LABEL: LOOP:11: B:31:0x0061->B:299:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x014e A[EDGE_INSN: B:316:0x014e->B:112:0x014e BREAK  A[LOOP:15: B:75:0x00e5->B:320:0x00e5, LOOP_LABEL: LOOP:15: B:75:0x00e5->B:320:0x00e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x014b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0136 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[ADDED_TO_REGION, LOOP:12: B:34:0x006d->B:60:0x00b7, LOOP_START, PHI: r6
  0x006d: PHI (r6v27 qg1) = (r6v22 qg1), (r6v28 qg1) binds: [B:33:0x006b, B:60:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1 A[ADDED_TO_REGION, LOOP:16: B:78:0x00f1->B:104:0x013b, LOOP_START, PHI: r12
  0x00f1: PHI (r12v13 qg1) = (r12v8 qg1), (r12v14 qg1) binds: [B:77:0x00ef, B:104:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0101 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0107 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x015a, B:119:0x0160, B:120:0x0163, B:122:0x016e, B:125:0x017a, B:129:0x0184, B:132:0x018a, B:133:0x018f, B:136:0x0197, B:138:0x019d, B:140:0x01a1, B:142:0x01a9, B:144:0x01af, B:148:0x01b7, B:150:0x01c0, B:151:0x01c4, B:152:0x01c7, B:154:0x01cc, B:155:0x01d1, B:156:0x01d4, B:158:0x01da, B:160:0x01de, B:163:0x01e5, B:165:0x01ed, B:169:0x01ff, B:171:0x0204, B:173:0x0208, B:194:0x0247, B:176:0x0212, B:178:0x0218, B:180:0x021c, B:182:0x0224, B:184:0x022a, B:188:0x0232, B:190:0x023b, B:191:0x023f, B:192:0x0242, B:195:0x024c, B:197:0x0258, B:199:0x025d, B:201:0x0261, B:222:0x029f, B:204:0x026a, B:206:0x0270, B:208:0x0274, B:210:0x027c, B:212:0x0282, B:216:0x028a, B:218:0x0293, B:219:0x0297, B:220:0x029a, B:224:0x02a6, B:226:0x02ad, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x006f, B:39:0x0079, B:41:0x007d, B:43:0x0083, B:45:0x0087, B:47:0x008f, B:49:0x0095, B:53:0x009d, B:55:0x00a6, B:56:0x00aa, B:57:0x00ad, B:59:0x00b2, B:68:0x00ca, B:70:0x00ce, B:60:0x00b7, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:71:0x00d4, B:73:0x00da, B:74:0x00dd, B:76:0x00e7, B:79:0x00f3, B:83:0x00fd, B:85:0x0101, B:87:0x0107, B:89:0x010b, B:91:0x0113, B:93:0x0119, B:97:0x0121, B:99:0x012a, B:100:0x012e, B:101:0x0131, B:103:0x0136, B:112:0x014e, B:114:0x0152, B:104:0x013b, B:105:0x013e, B:107:0x0144, B:109:0x0148), top: B:236:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [uj1] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [uj1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v24, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v28, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v29, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [uj1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [uj1] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final boolean d(KeyEvent keyEvent, kp0 kp0Var) {
        qg1 qg1Var;
        l41 l41VarY;
        ?? R;
        j80 j80Var;
        qg1 qg1Var2;
        ln1 ln1Var;
        ?? uj1Var;
        qg1 qg1Var3;
        l41 l41VarY2;
        ?? R2;
        j80 j80Var2;
        ln1 ln1Var2;
        ?? uj1Var2;
        int size;
        ln1 ln1Var3;
        boolean z;
        lm0 lm0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            } else if (j(keyEvent)) {
                lm0 lm0VarV = ys.v(lm0Var);
                if (lm0VarV != null) {
                    if (!lm0VarV.h.u) {
                        ax0.b("visitLocalDescendants called on an unattached node");
                    }
                    qg1 qg1Var4 = lm0VarV.h;
                    if ((qg1Var4.k & 9216) != 0) {
                        qg1Var2 = null;
                        while (true) {
                            qg1Var4 = qg1Var4.m;
                            if (qg1Var4 == null) {
                                break;
                            }
                            int i = qg1Var4.j;
                            if ((i & 9216) != 0) {
                                if ((i & 1024) != 0) {
                                    break;
                                }
                                qg1Var2 = qg1Var4;
                            }
                        }
                    } else {
                        qg1Var2 = null;
                    }
                    if (qg1Var2 == null) {
                        if (lm0VarV == null) {
                            if (!lm0Var.h.u) {
                                ax0.b("visitAncestors called on an unattached node");
                            }
                            qg1Var = lm0Var.h.l;
                            l41VarY = cu.Y(lm0Var);
                            loop15: while (true) {
                                if (l41VarY != null) {
                                    R = 0;
                                    break;
                                }
                                if ((l41VarY.L.f.k & 8192) != 0) {
                                    while (qg1Var != null) {
                                        if ((qg1Var.j & 8192) != 0) {
                                            R = qg1Var;
                                            uj1Var = 0;
                                            while (R != 0) {
                                                if (!(R instanceof z21)) {
                                                    break loop15;
                                                    break loop15;
                                                }
                                                if ((R.j & 8192) == 0) {
                                                }
                                                R = cu.R(uj1Var);
                                            }
                                        }
                                        qg1Var = qg1Var.l;
                                    }
                                }
                                l41VarY = l41VarY.u();
                                if (l41VarY != null) {
                                }
                            }
                            j80Var = (z21) R;
                            if (j80Var != null) {
                                qg1Var2 = ((qg1) j80Var).h;
                            } else {
                                qg1Var2 = null;
                            }
                        } else {
                            if (!lm0VarV.h.u) {
                                ax0.b("visitAncestors called on an unattached node");
                            }
                            qg1Var3 = lm0VarV.h;
                            l41VarY2 = cu.Y(lm0VarV);
                            loop11: while (true) {
                                if (l41VarY2 != null) {
                                    R2 = 0;
                                    break;
                                }
                                if ((l41VarY2.L.f.k & 8192) != 0) {
                                    while (qg1Var3 != null) {
                                        if ((qg1Var3.j & 8192) != 0) {
                                            uj1Var2 = 0;
                                            R2 = qg1Var3;
                                            while (R2 != 0) {
                                                if (!(R2 instanceof z21)) {
                                                    break loop11;
                                                    break loop11;
                                                }
                                                if ((R2.j & 8192) == 0) {
                                                }
                                                R2 = cu.R(uj1Var2);
                                            }
                                        }
                                        qg1Var3 = qg1Var3.l;
                                    }
                                }
                                l41VarY2 = l41VarY2.u();
                                if (l41VarY2 != null) {
                                }
                            }
                            j80Var2 = (z21) R2;
                            if (j80Var2 != null) {
                                qg1Var2 = ((qg1) j80Var2).h;
                            } else {
                                if (!lm0Var.h.u) {
                                    ax0.b("visitAncestors called on an unattached node");
                                }
                                qg1Var = lm0Var.h.l;
                                l41VarY = cu.Y(lm0Var);
                                loop15: while (true) {
                                    if (l41VarY != null) {
                                        R = 0;
                                        break;
                                    }
                                    if ((l41VarY.L.f.k & 8192) != 0) {
                                        while (qg1Var != null) {
                                            if ((qg1Var.j & 8192) != 0) {
                                                R = qg1Var;
                                                uj1Var = 0;
                                                while (R != 0) {
                                                    if (!(R instanceof z21)) {
                                                        break loop15;
                                                        break loop15;
                                                    }
                                                    if ((R.j & 8192) == 0) {
                                                    }
                                                    R = cu.R(uj1Var);
                                                }
                                            }
                                            qg1Var = qg1Var.l;
                                        }
                                    }
                                    l41VarY = l41VarY.u();
                                    if (l41VarY != null) {
                                    }
                                }
                                j80Var = (z21) R;
                                if (j80Var != null) {
                                    qg1Var2 = ((qg1) j80Var).h;
                                } else {
                                    qg1Var2 = null;
                                }
                            }
                        }
                    }
                } else if (lm0VarV == null) {
                    if (!lm0Var.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1Var = lm0Var.h.l;
                    l41VarY = cu.Y(lm0Var);
                    loop15: while (true) {
                        if (l41VarY != null) {
                            R = 0;
                            break;
                        }
                        if ((l41VarY.L.f.k & 8192) != 0) {
                            while (qg1Var != null) {
                                if ((qg1Var.j & 8192) != 0) {
                                    R = qg1Var;
                                    uj1Var = 0;
                                    while (R != 0) {
                                        if (!(R instanceof z21)) {
                                            break loop15;
                                        }
                                        if ((R.j & 8192) == 0 && (R instanceof k80)) {
                                            qg1 qg1Var5 = ((k80) R).w;
                                            int i2 = 0;
                                            while (qg1Var5 != null) {
                                                if ((qg1Var5.j & 8192) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        R = R;
                                                        uj1Var = uj1Var;
                                                        uj1Var = uj1Var;
                                                        R = qg1Var5;
                                                    } else {
                                                        if (uj1Var == 0) {
                                                            uj1Var = new uj1(new qg1[16]);
                                                        }
                                                        if (R != 0) {
                                                            uj1Var.b(R);
                                                            R = 0;
                                                        }
                                                        uj1Var.b(qg1Var5);
                                                    }
                                                } else {
                                                    R = R;
                                                    uj1Var = uj1Var;
                                                }
                                                qg1Var5 = qg1Var5.m;
                                                R = R;
                                                uj1Var = uj1Var;
                                            }
                                            if (i2 != 1) {
                                                R = R;
                                                uj1Var = uj1Var;
                                            } else {
                                                R = R;
                                                uj1Var = uj1Var;
                                            }
                                        }
                                        R = cu.R(uj1Var);
                                    }
                                }
                                qg1Var = qg1Var.l;
                            }
                        }
                        l41VarY = l41VarY.u();
                        qg1Var = (l41VarY != null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                    }
                    j80Var = (z21) R;
                    if (j80Var != null) {
                        qg1Var2 = ((qg1) j80Var).h;
                    } else {
                        qg1Var2 = null;
                    }
                } else {
                    if (!lm0VarV.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1Var3 = lm0VarV.h;
                    l41VarY2 = cu.Y(lm0VarV);
                    loop11: while (true) {
                        if (l41VarY2 != null) {
                            R2 = 0;
                            break;
                        }
                        if ((l41VarY2.L.f.k & 8192) != 0) {
                            while (qg1Var3 != null) {
                                if ((qg1Var3.j & 8192) != 0) {
                                    uj1Var2 = 0;
                                    R2 = qg1Var3;
                                    while (R2 != 0) {
                                        if (!(R2 instanceof z21)) {
                                            break loop11;
                                        }
                                        if ((R2.j & 8192) == 0 && (R2 instanceof k80)) {
                                            qg1 qg1Var6 = ((k80) R2).w;
                                            int i3 = 0;
                                            while (qg1Var6 != null) {
                                                if ((qg1Var6.j & 8192) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        R2 = R2;
                                                        uj1Var2 = uj1Var2;
                                                        uj1Var2 = uj1Var2;
                                                        R2 = qg1Var6;
                                                    } else {
                                                        if (uj1Var2 == 0) {
                                                            uj1Var2 = new uj1(new qg1[16]);
                                                        }
                                                        if (R2 != 0) {
                                                            uj1Var2.b(R2);
                                                            R2 = 0;
                                                        }
                                                        uj1Var2.b(qg1Var6);
                                                    }
                                                } else {
                                                    R2 = R2;
                                                    uj1Var2 = uj1Var2;
                                                }
                                                qg1Var6 = qg1Var6.m;
                                                R2 = R2;
                                                uj1Var2 = uj1Var2;
                                            }
                                            if (i3 != 1) {
                                                R2 = R2;
                                                uj1Var2 = uj1Var2;
                                            } else {
                                                R2 = R2;
                                                uj1Var2 = uj1Var2;
                                            }
                                        }
                                        R2 = cu.R(uj1Var2);
                                    }
                                }
                                qg1Var3 = qg1Var3.l;
                            }
                        }
                        l41VarY2 = l41VarY2.u();
                        qg1Var3 = (l41VarY2 != null || (ln1Var2 = l41VarY2.L) == null) ? null : ln1Var2.e;
                    }
                    j80Var2 = (z21) R2;
                    if (j80Var2 != null) {
                        qg1Var2 = ((qg1) j80Var2).h;
                    } else {
                        if (!lm0Var.h.u) {
                            ax0.b("visitAncestors called on an unattached node");
                        }
                        qg1Var = lm0Var.h.l;
                        l41VarY = cu.Y(lm0Var);
                        loop15: while (true) {
                            if (l41VarY != null) {
                                R = 0;
                                break;
                            }
                            if ((l41VarY.L.f.k & 8192) != 0) {
                                while (qg1Var != null) {
                                    if ((qg1Var.j & 8192) != 0) {
                                        R = qg1Var;
                                        uj1Var = 0;
                                        while (R != 0) {
                                            if (!(R instanceof z21)) {
                                                break loop15;
                                                break loop15;
                                            }
                                            if ((R.j & 8192) == 0) {
                                            }
                                            R = cu.R(uj1Var);
                                        }
                                    }
                                    qg1Var = qg1Var.l;
                                }
                            }
                            l41VarY = l41VarY.u();
                            if (l41VarY != null) {
                            }
                        }
                        j80Var = (z21) R;
                        if (j80Var != null) {
                            qg1Var2 = ((qg1) j80Var).h;
                        } else {
                            qg1Var2 = null;
                        }
                    }
                }
                if (qg1Var2 != null) {
                    if (!qg1Var2.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1 qg1Var7 = qg1Var2.h.l;
                    l41 l41VarY3 = cu.Y(qg1Var2);
                    ArrayList arrayList = null;
                    while (l41VarY3 != null) {
                        if ((l41VarY3.L.f.k & 8192) != 0) {
                            while (qg1Var7 != null) {
                                if ((qg1Var7.j & 8192) != 0) {
                                    qg1 qg1VarR = qg1Var7;
                                    uj1 uj1Var3 = null;
                                    while (qg1VarR != null) {
                                        if (qg1VarR instanceof z21) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(qg1VarR);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (qg1VarR.j & 8192) != 0 && (qg1VarR instanceof k80)) {
                                            int i4 = 0;
                                            for (qg1 qg1Var8 = ((k80) qg1VarR).w; qg1Var8 != null; qg1Var8 = qg1Var8.m) {
                                                if ((qg1Var8.j & 8192) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        qg1VarR = qg1Var8;
                                                    } else {
                                                        if (uj1Var3 == null) {
                                                            uj1Var3 = new uj1(new qg1[16]);
                                                        }
                                                        if (qg1VarR != null) {
                                                            uj1Var3.b(qg1VarR);
                                                            qg1VarR = null;
                                                        }
                                                        uj1Var3.b(qg1Var8);
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        qg1VarR = cu.R(uj1Var3);
                                    }
                                }
                                qg1Var7 = qg1Var7.l;
                            }
                        }
                        l41VarY3 = l41VarY3.u();
                        qg1Var7 = (l41VarY3 == null || (ln1Var3 = l41VarY3.L) == null) ? null : ln1Var3.e;
                    }
                    if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                        while (true) {
                            int i5 = size - 1;
                            if (!((z21) arrayList.get(size)).m(keyEvent)) {
                                if (i5 < 0) {
                                    break;
                                }
                                size = i5;
                            }
                            Trace.endSection();
                            return true;
                        }
                    }
                    ?? R3 = qg1Var2.h;
                    ?? uj1Var4 = 0;
                    while (R3 != 0) {
                        if (R3 instanceof z21) {
                            if (((z21) R3).m(keyEvent)) {
                                Trace.endSection();
                                return true;
                            }
                        } else if ((R3.j & 8192) != 0 && (R3 instanceof k80)) {
                            qg1 qg1Var9 = ((k80) R3).w;
                            int i6 = 0;
                            while (qg1Var9 != null) {
                                if ((qg1Var9.j & 8192) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        uj1Var4 = uj1Var4;
                                        R3 = R3;
                                        uj1Var4 = uj1Var4;
                                        R3 = qg1Var9;
                                    } else {
                                        if (uj1Var4 == 0) {
                                            uj1Var4 = new uj1(new qg1[16]);
                                        }
                                        if (R3 != 0) {
                                            uj1Var4.b(R3);
                                            R3 = 0;
                                        }
                                        uj1Var4.b(qg1Var9);
                                    }
                                } else {
                                    uj1Var4 = uj1Var4;
                                    R3 = R3;
                                }
                                qg1Var9 = qg1Var9.m;
                                uj1Var4 = uj1Var4;
                                R3 = R3;
                            }
                            if (i6 != 1) {
                                uj1Var4 = uj1Var4;
                                R3 = R3;
                            } else {
                                uj1Var4 = uj1Var4;
                                R3 = R3;
                            }
                        }
                        R3 = cu.R(uj1Var4);
                    }
                    if (!((Boolean) kp0Var.a()).booleanValue()) {
                        ?? R4 = qg1Var2.h;
                        ?? uj1Var5 = 0;
                        while (R4 != 0) {
                            if (R4 instanceof z21) {
                                if (((z21) R4).U(keyEvent)) {
                                }
                            } else if ((R4.j & 8192) != 0 && (R4 instanceof k80)) {
                                qg1 qg1Var10 = ((k80) R4).w;
                                int i7 = 0;
                                while (qg1Var10 != null) {
                                    if ((qg1Var10.j & 8192) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            R4 = R4;
                                            uj1Var5 = uj1Var5;
                                            uj1Var5 = uj1Var5;
                                            R4 = qg1Var10;
                                        } else {
                                            if (uj1Var5 == 0) {
                                                uj1Var5 = new uj1(new qg1[16]);
                                            }
                                            if (R4 != 0) {
                                                uj1Var5.b(R4);
                                                R4 = 0;
                                            }
                                            uj1Var5.b(qg1Var10);
                                        }
                                    } else {
                                        R4 = R4;
                                        uj1Var5 = uj1Var5;
                                    }
                                    qg1Var10 = qg1Var10.m;
                                    R4 = R4;
                                    uj1Var5 = uj1Var5;
                                }
                                if (i7 != 1) {
                                    R4 = R4;
                                    uj1Var5 = uj1Var5;
                                } else {
                                    R4 = R4;
                                    uj1Var5 = uj1Var5;
                                }
                            }
                            R4 = cu.R(uj1Var5);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                if (!((z21) arrayList.get(i8)).U(keyEvent)) {
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean e(int i, r72 r72Var, vp0 vp0Var) {
        lm0 lm0Var;
        ln1 ln1Var;
        boolean zO;
        lm0 lm0Var2 = this.c;
        lm0 lm0VarV = ys.v(lm0Var2);
        int i2 = 4;
        t6 t6Var = this.b;
        boolean zBooleanValue = false;
        if (lm0VarV != null) {
            u31 layoutDirection = t6Var.getLayoutDirection();
            fm0 fm0VarL0 = lm0VarV.L0();
            gm0 gm0Var = fm0VarL0.h;
            gm0 gm0Var2 = fm0VarL0.i;
            if (i == 1) {
                gm0Var = fm0VarL0.b;
            } else if (i == 2) {
                gm0Var = fm0VarL0.c;
            } else if (i == 5) {
                gm0Var = fm0VarL0.d;
            } else if (i == 6) {
                gm0Var = fm0VarL0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        wg.n();
                        return null;
                    }
                    gm0Var = gm0Var2;
                }
                if (gm0Var == gm0.b) {
                    gm0Var = null;
                }
                if (gm0Var == null) {
                    gm0Var = fm0VarL0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    gm0Var = gm0Var2;
                } else if (iOrdinal2 != 1) {
                    wg.n();
                    return null;
                }
                if (gm0Var == gm0.b) {
                    gm0Var = null;
                }
                if (gm0Var == null) {
                    gm0Var = fm0VarL0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    li1.g("invalid FocusDirection");
                    return null;
                }
                em0 em0Var = (em0) cu.Z(lm0VarV).getFocusOwner();
                lm0 lm0VarF = em0Var.f();
                if (i == 7) {
                    fm0VarL0.j.getClass();
                } else {
                    fm0VarL0.k.getClass();
                }
                gm0Var = lm0VarF != em0Var.f() ? gm0.d : gm0.b;
            }
            gm0 gm0Var3 = gm0.c;
            if (!uz0.g(gm0Var, gm0Var3)) {
                if (uz0.g(gm0Var, gm0.d)) {
                    lm0 lm0VarV2 = ys.v(lm0Var2);
                    if (lm0VarV2 != null) {
                        return (Boolean) vp0Var.h(lm0VarV2);
                    }
                } else {
                    gm0 gm0Var4 = gm0.b;
                    if (!uz0.g(gm0Var, gm0Var4)) {
                        if (gm0Var == gm0Var4) {
                            li1.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (gm0Var == gm0Var3) {
                            li1.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        uj1 uj1Var = gm0Var.a;
                        int i3 = uj1Var.j;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = uj1Var.h;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                j80 j80Var = (im0) objArr[i4];
                                if (!((qg1) j80Var).h.u) {
                                    ax0.b("visitChildren called on an unattached node");
                                }
                                uj1 uj1Var2 = new uj1(new qg1[16]);
                                qg1 qg1Var = ((qg1) j80Var).h;
                                qg1 qg1Var2 = qg1Var.m;
                                if (qg1Var2 == null) {
                                    cu.q(uj1Var2, qg1Var);
                                } else {
                                    uj1Var2.b(qg1Var2);
                                }
                                while (true) {
                                    int i5 = uj1Var2.j;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    qg1 qg1VarR = (qg1) uj1Var2.k(i5 - 1);
                                    if ((qg1VarR.k & 1024) == 0) {
                                        cu.q(uj1Var2, qg1VarR);
                                    } else {
                                        while (qg1VarR != null) {
                                            if ((qg1VarR.j & 1024) != 0) {
                                                uj1 uj1Var3 = null;
                                                while (qg1VarR != null) {
                                                    if (qg1VarR instanceof lm0) {
                                                        if (((Boolean) vp0Var.h((lm0) qg1VarR)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                                        int i6 = 0;
                                                        for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                                            if ((qg1Var3.j & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    qg1VarR = qg1Var3;
                                                                } else {
                                                                    if (uj1Var3 == null) {
                                                                        uj1Var3 = new uj1(new qg1[16]);
                                                                    }
                                                                    if (qg1VarR != null) {
                                                                        uj1Var3.b(qg1VarR);
                                                                        qg1VarR = null;
                                                                    }
                                                                    uj1Var3.b(qg1Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 != 1) {
                                                        }
                                                    }
                                                    qg1VarR = cu.R(uj1Var3);
                                                }
                                                break;
                                            }
                                            qg1VarR = qg1VarR.m;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        lm0VarV = null;
        u31 layoutDirection2 = t6Var.getLayoutDirection();
        qb qbVar = new qb((Object) lm0VarV, (Object) this, (Object) vp0Var, (byte) 8);
        if (i == 1) {
            zO = es.F(lm0Var2, qbVar);
        } else {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5 || i == 6) {
                    return cy1.R(i, qbVar, lm0Var2, r72Var);
                }
                if (i == 7) {
                    int iOrdinal3 = layoutDirection2.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            wg.n();
                            return null;
                        }
                        i2 = 3;
                    }
                    lm0 lm0VarV3 = ys.v(lm0Var2);
                    if (lm0VarV3 != null) {
                        return cy1.R(i2, qbVar, lm0VarV3, r72Var);
                    }
                    return null;
                }
                if (i != 8) {
                    throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(ul0.a(i)).toString());
                }
                lm0 lm0VarV4 = ys.v(lm0Var2);
                if (lm0VarV4 == null) {
                    lm0Var = null;
                    break;
                }
                if (!lm0VarV4.h.u) {
                    ax0.b("visitAncestors called on an unattached node");
                }
                qg1 qg1Var4 = lm0VarV4.h.l;
                l41 l41VarY = cu.Y(lm0VarV4);
                loop5: while (true) {
                    if (l41VarY == null) {
                        lm0Var = null;
                        break;
                    }
                    if ((l41VarY.L.f.k & 1024) != 0) {
                        while (qg1Var4 != null) {
                            if ((qg1Var4.j & 1024) != 0) {
                                qg1 qg1VarR2 = qg1Var4;
                                uj1 uj1Var4 = null;
                                while (qg1VarR2 != null) {
                                    if (qg1VarR2 instanceof lm0) {
                                        lm0 lm0Var3 = (lm0) qg1VarR2;
                                        if (lm0Var3.L0().a) {
                                            lm0Var = lm0Var3;
                                            break loop5;
                                        }
                                    } else if ((qg1VarR2.j & 1024) != 0 && (qg1VarR2 instanceof k80)) {
                                        int i7 = 0;
                                        for (qg1 qg1Var5 = ((k80) qg1VarR2).w; qg1Var5 != null; qg1Var5 = qg1Var5.m) {
                                            if ((qg1Var5.j & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    qg1VarR2 = qg1Var5;
                                                } else {
                                                    if (uj1Var4 == null) {
                                                        uj1Var4 = new uj1(new qg1[16]);
                                                    }
                                                    if (qg1VarR2 != null) {
                                                        uj1Var4.b(qg1VarR2);
                                                        qg1VarR2 = null;
                                                    }
                                                    uj1Var4.b(qg1Var5);
                                                }
                                            }
                                        }
                                        if (i7 != 1) {
                                        }
                                    }
                                    qg1VarR2 = cu.R(uj1Var4);
                                }
                            }
                            qg1Var4 = qg1Var4.l;
                        }
                    }
                    l41VarY = l41VarY.u();
                    qg1Var4 = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                }
                if (lm0Var != null && lm0Var != lm0Var2) {
                    zBooleanValue = ((Boolean) qbVar.h(lm0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
            if (i != 2) {
                li1.g("This function should only be used for 1-D focus search");
                return null;
            }
            zO = es.o(lm0Var2, qbVar);
        }
        return Boolean.valueOf(zO);
    }

    public final lm0 f() {
        lm0 lm0Var = this.h;
        if (lm0Var == null || !lm0Var.u) {
            return null;
        }
        return lm0Var;
    }

    public final boolean g(final int i, boolean z) {
        final x72 x72Var = new x72();
        x72Var.h = Boolean.FALSE;
        lm0 lm0VarF = f();
        Boolean boolE = e(i, this.a.getEmbeddedViewFocusRect(), new vp0() { // from class: cm0
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                boolean zR0 = ((lm0) obj).R0(i);
                x72Var.h = Boolean.valueOf(zR0);
                return Boolean.valueOf(zR0);
            }
        });
        if (!uz0.g(boolE, Boolean.TRUE) || lm0VarF == f()) {
            if (boolE != null && x72Var.h != null) {
                if (!boolE.booleanValue() || !((Boolean) x72Var.h).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new j6(i, (byte) 3));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new j6(i, (byte) 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(lm0 lm0Var) {
        lm0 lm0Var2 = this.h;
        this.h = lm0Var;
        fj1 fj1Var = this.g;
        Object[] objArr = fj1Var.a;
        int i = fj1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((am0) objArr[i2]).d(lm0Var2, lm0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x020d  */
    /* JADX WARN: Code duplicated, block: B:48:0x021c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        long[] jArr2;
        int i;
        long[] jArr3;
        long[] jArr4;
        int i2;
        int i3;
        long[] jArr5;
        long[] jArr6;
        int i4;
        long jF = ys.F(keyEvent);
        int iG = ys.G(keyEvent);
        int i5 = -862048943;
        long j2 = 0;
        int i6 = 0;
        boolean z2 = true;
        if (iG != 2) {
            if (iG != 1) {
                return true;
            }
            yi1 yi1Var = this.f;
            if (yi1Var == null || !yi1Var.a(jF)) {
                return false;
            }
            yi1 yi1Var2 = this.f;
            if (yi1Var2 != null) {
                int iHashCode = Long.hashCode(jF) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int i8 = i7 & 127;
                int i9 = yi1Var2.c;
                int i10 = i7 >>> 7;
                loop5: while (true) {
                    int i11 = i10 & i9;
                    long[] jArr7 = yi1Var2.a;
                    int i12 = i11 >> 3;
                    int i13 = (i11 & 7) << 3;
                    long j3 = (jArr7[i12] >>> i13) | ((jArr7[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                    long j4 = (((long) i8) * 72340172838076673L) ^ j3;
                    for (long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i11) & i9;
                        if (yi1Var2.b[iNumberOfTrailingZeros] == jF) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i6 += 8;
                    i10 = i11 + i6;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    yi1Var2.d--;
                    long[] jArr8 = yi1Var2.a;
                    int i14 = yi1Var2.c;
                    int i15 = iNumberOfTrailingZeros >> 3;
                    int i16 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr8[i15] & (~(255 << i16))) | (254 << i16);
                    jArr8[i15] = j6;
                    jArr8[(((iNumberOfTrailingZeros - 7) & i14) + (i14 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        yi1 yi1Var3 = this.f;
        if (yi1Var3 == null) {
            yi1Var3 = new yi1(3);
            this.f = yi1Var3;
        }
        yi1 yi1Var4 = yi1Var3;
        int iHashCode2 = Long.hashCode(jF) * (-862048943);
        int i17 = iHashCode2 ^ (iHashCode2 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = yi1Var4.c;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr9 = yi1Var4.a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j7 = (jArr9[i23] >>> i24) | ((jArr9[i23 + 1] << (64 - i24)) & ((-i24) >> 63));
            int i25 = i5;
            long j8 = i19;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            for (long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L); j10 != j2; j10 &= j10 - 1) {
                iNumberOfTrailingZeros2 = (i21 + (Long.numberOfTrailingZeros(j10) >> 3)) & i20;
                if (yi1Var4.b[iNumberOfTrailingZeros2] == jF) {
                    z = true;
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j2) {
                int iB = yi1Var4.b(i18);
                if (yi1Var4.e != 0 || ((yi1Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i26 = yi1Var4.c;
                    if (i26 > 8) {
                        ?? r14 = '\b';
                        if (Long.compareUnsigned(((long) yi1Var4.d) << 5, ((long) i26) * 25) <= 0) {
                            long[] jArr10 = yi1Var4.a;
                            int i27 = yi1Var4.c;
                            long[] jArr11 = yi1Var4.b;
                            int i28 = (i27 + 7) >> 3;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j11 = jArr10[i29] & (-9187201950435737472L);
                                jArr10[i29] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i29++;
                                r14 = r14 == true ? 1 : 0;
                                j2 = j2;
                            }
                            long j12 = j2;
                            j = 128;
                            int iY = gi.Y(jArr10);
                            int i30 = iY - 1;
                            long j13 = 72057594037927935L;
                            jArr10[i30] = (jArr10[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr10[iY] = jArr10[0];
                            int i31 = 0;
                            while (i31 != i27) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j14 = (jArr10[i32] >> i33) & 255;
                                if (j14 == 128 || j14 != 254) {
                                    i31++;
                                } else {
                                    int iHashCode3 = Long.hashCode(jArr11[i31]) * i25;
                                    int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i35 = i34 >>> 7;
                                    int iB2 = yi1Var4.b(i35);
                                    int i36 = i35 & i27;
                                    long j15 = j13;
                                    if (((iB2 - i36) & i27) / 8 == ((i31 - i36) & i27) / 8) {
                                        jArr10[i32] = (jArr10[i32] & (~(255 << i33))) | (((long) (i34 & 127)) << i33);
                                        jArr10[jArr10.length - 1] = (jArr10[0] & j15) | Long.MIN_VALUE;
                                        i31++;
                                        j13 = j15;
                                        z2 = z2;
                                    } else {
                                        boolean z3 = z2;
                                        int i37 = i31;
                                        int i38 = iB2 >> 3;
                                        long j16 = jArr10[i38];
                                        int i39 = (iB2 & 7) << 3;
                                        if (((j16 >> i39) & 255) == 128) {
                                            jArr6 = jArr11;
                                            jArr10[i38] = (j16 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                            jArr10[i32] = (jArr10[i32] & (~(255 << i33))) | (128 << i33);
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j12;
                                            i4 = i37;
                                        } else {
                                            jArr6 = jArr11;
                                            jArr10[i38] = (j16 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                            long j17 = jArr6[iB2];
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j17;
                                            i4 = i37 - 1;
                                        }
                                        jArr10[jArr10.length - 1] = (jArr10[0] & j15) | Long.MIN_VALUE;
                                        i31 = i4 + 1;
                                        i27 = i27;
                                        j13 = j15;
                                        z2 = z3;
                                        jArr11 = jArr6;
                                    }
                                }
                            }
                            z = z2;
                            yi1Var4.e = bd2.a(yi1Var4.c) - yi1Var4.d;
                        } else {
                            z = true;
                            j = 128;
                            int iB3 = bd2.b(yi1Var4.c);
                            jArr = yi1Var4.a;
                            jArr2 = yi1Var4.b;
                            i = yi1Var4.c;
                            yi1Var4.c(iB3);
                            jArr3 = yi1Var4.a;
                            jArr4 = yi1Var4.b;
                            i2 = yi1Var4.c;
                            i3 = 0;
                            while (i3 < i) {
                                if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                                    long j18 = jArr2[i3];
                                    int iHashCode4 = Long.hashCode(j18) * i25;
                                    int i40 = iHashCode4 ^ (iHashCode4 << 16);
                                    jArr5 = jArr3;
                                    int iB4 = yi1Var4.b(i40 >>> 7);
                                    long j19 = i40 & 127;
                                    int i41 = iB4 >> 3;
                                    int i42 = (iB4 & 7) << 3;
                                    long j20 = (jArr5[i41] & (~(255 << i42))) | (j19 << i42);
                                    jArr5[i41] = j20;
                                    jArr5[(((iB4 - 7) & i2) + (i2 & 7)) >> 3] = j20;
                                    jArr4[iB4] = j18;
                                } else {
                                    jArr5 = jArr3;
                                }
                                i3++;
                                jArr3 = jArr5;
                                jArr = jArr;
                                jArr2 = jArr2;
                            }
                        }
                    } else {
                        z = true;
                        j = 128;
                        int iB5 = bd2.b(yi1Var4.c);
                        jArr = yi1Var4.a;
                        jArr2 = yi1Var4.b;
                        i = yi1Var4.c;
                        yi1Var4.c(iB5);
                        jArr3 = yi1Var4.a;
                        jArr4 = yi1Var4.b;
                        i2 = yi1Var4.c;
                        i3 = 0;
                        while (i3 < i) {
                            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                                long j110 = jArr2[i3];
                                int iHashCode5 = Long.hashCode(j110) * i25;
                                int i43 = iHashCode5 ^ (iHashCode5 << 16);
                                jArr5 = jArr3;
                                int iB6 = yi1Var4.b(i43 >>> 7);
                                long j111 = i43 & 127;
                                int i44 = iB6 >> 3;
                                int i45 = (iB6 & 7) << 3;
                                long j21 = (jArr5[i44] & (~(255 << i45))) | (j111 << i45);
                                jArr5[i44] = j21;
                                jArr5[(((iB6 - 7) & i2) + (i2 & 7)) >> 3] = j21;
                                jArr4[iB6] = j110;
                            } else {
                                jArr5 = jArr3;
                            }
                            i3++;
                            jArr3 = jArr5;
                            jArr = jArr;
                            jArr2 = jArr2;
                        }
                    }
                    iB = yi1Var4.b(i18);
                }
                iNumberOfTrailingZeros2 = iB;
                yi1Var4.d++;
                int i46 = yi1Var4.e;
                long[] jArr12 = yi1Var4.a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr12[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                yi1Var4.e = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = yi1Var4.c;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr12[i47] = j23;
                jArr12[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i5 = i25;
            j2 = j2;
        }
        yi1Var4.b[iNumberOfTrailingZeros2] = jF;
        return z;
    }
}
