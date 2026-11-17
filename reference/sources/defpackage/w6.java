package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w6 extends g2 {
    public final /* synthetic */ a7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(a7 a7Var) {
        super((byte) 0);
        this.j = a7Var;
    }

    @Override // defpackage.g2
    public final e2 E(int i) {
        a7 a7Var = this.j;
        if (i != 1) {
            if (i == 2) {
                return z(a7Var.r);
            }
            wg.m(jp1.h(i, "Unknown focus type: "));
            return null;
        }
        int i2 = a7Var.s;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return z(i2);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0248  */
    /* JADX WARN: Code duplicated, block: B:509:0x0728  */
    /* JADX WARN: Code duplicated, block: B:531:0x07a5  */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x019b, code lost:
    
        r1 = null;
     */
    @Override // defpackage.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6.J(int, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.g2
    public final void y(int i, e2 e2Var, String str, Bundle bundle) {
        this.j.e(i, e2Var, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0210  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:113:0x022f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0239  */
    /* JADX WARN: Code duplicated, block: B:117:0x0248  */
    /* JADX WARN: Code duplicated, block: B:119:0x0264  */
    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x0301  */
    /* JADX WARN: Code duplicated, block: B:142:0x0305  */
    /* JADX WARN: Code duplicated, block: B:143:0x0307  */
    /* JADX WARN: Code duplicated, block: B:147:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0310  */
    /* JADX WARN: Code duplicated, block: B:149:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0314  */
    /* JADX WARN: Code duplicated, block: B:151:0x0316  */
    /* JADX WARN: Code duplicated, block: B:154:0x0321  */
    /* JADX WARN: Code duplicated, block: B:156:0x0327  */
    /* JADX WARN: Code duplicated, block: B:159:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:0x033d  */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0381  */
    /* JADX WARN: Code duplicated, block: B:170:0x038c  */
    /* JADX WARN: Code duplicated, block: B:172:0x039c  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d4 A[LOOP:3: B:180:0x03c0->B:183:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:190:0x0401  */
    /* JADX WARN: Code duplicated, block: B:196:0x041f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0427  */
    /* JADX WARN: Code duplicated, block: B:201:0x043f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0459  */
    /* JADX WARN: Code duplicated, block: B:207:0x0469  */
    /* JADX WARN: Code duplicated, block: B:215:0x048e  */
    /* JADX WARN: Code duplicated, block: B:217:0x049c  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:221:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:229:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:232:0x0510  */
    /* JADX WARN: Code duplicated, block: B:234:0x051a  */
    /* JADX WARN: Code duplicated, block: B:238:0x052f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0533  */
    /* JADX WARN: Code duplicated, block: B:242:0x054d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0551  */
    /* JADX WARN: Code duplicated, block: B:245:0x0556  */
    /* JADX WARN: Code duplicated, block: B:247:0x055a  */
    /* JADX WARN: Code duplicated, block: B:250:0x0568  */
    /* JADX WARN: Code duplicated, block: B:255:0x0579  */
    /* JADX WARN: Code duplicated, block: B:256:0x057d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:261:0x058d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0597  */
    /* JADX WARN: Code duplicated, block: B:264:0x059e  */
    /* JADX WARN: Code duplicated, block: B:268:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:270:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:273:0x05c7 A[LOOP:8: B:269:0x05ae->B:273:0x05c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:276:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:279:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:285:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:287:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:290:0x0621  */
    /* JADX WARN: Code duplicated, block: B:291:0x0626  */
    /* JADX WARN: Code duplicated, block: B:294:0x0640  */
    /* JADX WARN: Code duplicated, block: B:296:0x0653  */
    /* JADX WARN: Code duplicated, block: B:298:0x065d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0664  */
    /* JADX WARN: Code duplicated, block: B:302:0x0675  */
    /* JADX WARN: Code duplicated, block: B:303:0x067d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0688  */
    /* JADX WARN: Code duplicated, block: B:309:0x0696  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:311:0x069a  */
    /* JADX WARN: Code duplicated, block: B:314:0x069f  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:320:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:325:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:327:0x06cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:330:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:333:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:337:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:340:0x0700  */
    /* JADX WARN: Code duplicated, block: B:342:0x070a  */
    /* JADX WARN: Code duplicated, block: B:345:0x0720  */
    /* JADX WARN: Code duplicated, block: B:348:0x0732  */
    /* JADX WARN: Code duplicated, block: B:350:0x073c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0752  */
    /* JADX WARN: Code duplicated, block: B:356:0x0769  */
    /* JADX WARN: Code duplicated, block: B:359:0x077f  */
    /* JADX WARN: Code duplicated, block: B:363:0x0795  */
    /* JADX WARN: Code duplicated, block: B:364:0x079c  */
    /* JADX WARN: Code duplicated, block: B:366:0x079f  */
    /* JADX WARN: Code duplicated, block: B:369:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:373:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:374:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:377:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:379:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:387:0x081b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0821  */
    /* JADX WARN: Code duplicated, block: B:396:0x0839  */
    /* JADX WARN: Code duplicated, block: B:398:0x083f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:400:0x0849  */
    /* JADX WARN: Code duplicated, block: B:402:0x0852  */
    /* JADX WARN: Code duplicated, block: B:404:0x0855  */
    /* JADX WARN: Code duplicated, block: B:407:0x086e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0889  */
    /* JADX WARN: Code duplicated, block: B:417:0x0896  */
    /* JADX WARN: Code duplicated, block: B:420:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:422:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:423:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:426:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:429:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:433:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:436:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:439:0x090f  */
    /* JADX WARN: Code duplicated, block: B:442:0x0916  */
    /* JADX WARN: Code duplicated, block: B:445:0x0921  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:450:0x0946  */
    /* JADX WARN: Code duplicated, block: B:451:0x0953  */
    /* JADX WARN: Code duplicated, block: B:453:0x0964  */
    /* JADX WARN: Code duplicated, block: B:455:0x096f  */
    /* JADX WARN: Code duplicated, block: B:457:0x0983  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:461:0x098f  */
    /* JADX WARN: Code duplicated, block: B:463:0x0995  */
    /* JADX WARN: Code duplicated, block: B:465:0x099c  */
    /* JADX WARN: Code duplicated, block: B:469:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:471:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:473:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:475:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:477:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:479:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:482:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:486:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:488:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:501:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:503:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a8b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:515:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:519:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:521:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:524:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:527:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:529:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:531:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:532:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:534:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:537:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:539:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:544:0x0b11 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:547:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:553:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:556:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:572:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:575:0x0bc2  */
    /* JADX WARN: Code duplicated, block: B:578:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:580:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:582:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:585:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:587:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:589:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:593:0x0c47  */
    /* JADX WARN: Code duplicated, block: B:595:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:597:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:599:0x0c5d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:601:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:603:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c87  */
    /* JADX WARN: Code duplicated, block: B:612:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:613:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:616:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:619:0x0cd2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:630:0x0ce7  */
    /* JADX WARN: Code duplicated, block: B:633:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:652:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0830 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0a37 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0a37 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0c34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0986 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:630:0x0ce7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [ag0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection, java.util.List] */
    @Override // defpackage.g2
    public final e2 z(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        e2 e2Var;
        int i2;
        Bundle extras;
        int i3;
        wg2 wg2VarL;
        Integer numValueOf;
        int iIntValue;
        qi1 qi1Var;
        dm2 dm2Var;
        Resources resources;
        rg2 rg2Var;
        mj1 mj1Var;
        Object objG;
        ba2 ba2Var;
        AccessibilityManager accessibilityManager;
        dm2 dm2Var2;
        boolean zI;
        List listJ;
        int size;
        boolean z;
        int i4;
        int i5;
        int i6;
        AccessibilityNodeInfo accessibilityNodeInfo;
        od odVarR;
        mj1 mj1Var2;
        a7 a7Var;
        qi1 qi1Var2;
        wg2 wg2Var;
        ba2 ba2Var2;
        Resources resources2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        ch2 ch2Var;
        mj1 mj1Var3;
        wg2 wg2Var2;
        String strQ;
        by2 by2Var;
        Boolean bool;
        ba2 ba2Var3;
        List list;
        String str;
        String str2;
        int i7;
        Boolean bool2;
        Integer num;
        int iIntValue2;
        ch2 ch2Var2;
        a7 a7Var2;
        boolean z2;
        wg2 wg2VarL2;
        lb1 lb1Var;
        m1 m1Var;
        e2 e2Var2;
        m1 m1Var2;
        m1 m1Var3;
        String strO;
        ArrayList arrayList;
        CharSequence charSequenceE;
        b42 b42Var;
        bv bvVar;
        ArrayList arrayList2;
        int size2;
        int size3;
        List listM;
        int size4;
        int i8;
        wg2 wg2Var3;
        Object objG2;
        md2 md2Var;
        md2 md2Var2;
        int iD;
        t6 t6Var;
        int iD2;
        String str3;
        e2 e2Var3;
        m1 m1Var4;
        m1 m1Var5;
        m1 m1Var6;
        ch2 ch2Var3;
        List list2;
        int size5;
        ri1 ri1Var;
        int i9;
        dm2 dm2Var3;
        bj1 bj1Var;
        int[] iArr;
        int i10;
        int[] iArrCopyOf;
        int i11;
        int i12;
        ArrayList arrayList3;
        int i13;
        Object objG3;
        Object objG4;
        Object objG5;
        boolean zU;
        u31 u31Var;
        l41 l41Var;
        z1 z1Var;
        z1 z1Var2;
        Object objG6;
        wg2 wg2VarL3;
        Object objG7;
        Object objG8;
        bv bvVar2;
        ArrayList arrayList4;
        List listJ2;
        int size6;
        int i14;
        int i15;
        boolean zW;
        int i16;
        int i17;
        Object objG9;
        wg2 wg2Var4;
        m1 m1Var7;
        ch2 ch2Var4;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        m1 m1Var8;
        String str4;
        List list3;
        l41 l41VarU;
        rg2 rg2VarW;
        boolean zG;
        Object objG10;
        rg2 rg2VarW2;
        m1 m1Var9;
        m1 m1Var10;
        m1 m1Var11;
        m1 m1Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z3;
        boolean z4;
        byte b;
        boolean z5;
        int i18;
        int iD3;
        wg2 wg2VarL4;
        boolean zBooleanValue;
        rg2 rg2Var2;
        ch2 ch2Var5;
        boolean zBooleanValue2;
        Object objG11;
        e90 density;
        eg egVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList5;
        SpannableString spannableString3;
        ?? arrayList6;
        ?? arrayList7;
        int size7;
        int i19;
        ?? arrayList8;
        int size8;
        int i20;
        int size9;
        int i21;
        nd ndVar;
        int i22;
        Object obj;
        int i23;
        ia1 ia1Var;
        WeakHashMap weakHashMap;
        Object ayVar;
        nd ndVar2;
        ha1 ha1Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size10;
        int i24;
        nd ndVar3;
        w23 w23Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size11;
        int i25;
        nd ndVar4;
        f43 f43Var;
        int i26;
        int i27;
        int size12;
        int i28;
        nd ndVar5;
        int size13;
        int i29;
        int i30;
        int i31;
        long jA;
        qn0 qn0Var;
        on0 on0Var;
        yv2 yv2Var;
        long j;
        vt2 vt2Var;
        xv2 wvVar;
        long jA2;
        SpannableString spannableString4;
        qn0 qn0Var2;
        int i32;
        int i33;
        int i34;
        boolean z6;
        boolean z7;
        int i35;
        wg2 wg2Var5;
        ly0 ly0VarN;
        int i36;
        yg2 yg2Var;
        boolean zG2;
        wg2 wg2Var6;
        byte b2;
        byte b3;
        String strD;
        Object parentForAccessibility;
        View view;
        Float fValueOf = Float.valueOf(0.0f);
        a7 a7Var3 = this.j;
        AccessibilityManager accessibilityManager2 = a7Var3.n;
        t6 t6Var2 = a7Var3.k;
        if (t6Var2.getComposeViewContext().d().g().h == x81.h) {
            if (accessibilityManager2.isEnabled()) {
                e2Var3 = null;
            } else {
                e2Var3 = new e2(AccessibilityNodeInfo.obtain());
            }
            i7 = i;
            a7Var2 = a7Var3;
        } else {
            yg2 yg2Var2 = (yg2) a7Var3.n().b(i);
            if (yg2Var2 == null) {
                if (accessibilityManager2.isEnabled()) {
                    e2Var3 = null;
                } else {
                    e2Var3 = new e2(AccessibilityNodeInfo.obtain());
                }
                i7 = i;
                a7Var2 = a7Var3;
            } else {
                wg2 wg2Var7 = yg2Var2.a;
                rg2 rg2VarK = wg2Var7.k();
                l41 l41Var2 = wg2Var7.c;
                Object objG12 = rg2VarK.h.g(ah2.o);
                if (objG12 == null) {
                    objG12 = null;
                }
                boolean zG3 = uz0.g(objG12, Boolean.TRUE);
                if (!zG3) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    e2Var = new e2(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        q1.k(accessibilityNodeInfoObtain, zG3);
                    } else {
                        extras = accessibilityNodeInfoObtain.getExtras();
                        if (extras != null) {
                            int i37 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zG3) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i37 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = t6Var2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        e2Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        wg2VarL = wg2Var7.l();
                        if (wg2VarL != null) {
                            numValueOf = Integer.valueOf(wg2VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            ax0.c("semanticsNode " + i + " has null parent");
                            wg.k();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == t6Var2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        e2Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(t6Var2, iIntValue);
                    }
                    e2Var.c = i;
                    accessibilityNodeInfoObtain.setSource(t6Var2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(a7Var3.f(yg2Var2));
                    qi1Var = a7Var3.Q;
                    dm2Var = a7Var3.z;
                    resources = t6Var2.getContext().getResources();
                    e2Var.f("android.view.View");
                    rg2Var = wg2Var7.d;
                    mj1Var = rg2Var.h;
                    if (mj1Var.c(ah2.G)) {
                        e2Var.f("android.widget.EditText");
                    }
                    if (mj1Var.c(ah2.C)) {
                        e2Var.f("android.widget.TextView");
                    }
                    objG = mj1Var.g(ah2.z);
                    if (objG == null) {
                        objG = null;
                    }
                    ba2Var = (ba2) objG;
                    if (ba2Var != null) {
                        b2 = ba2Var.a;
                        if (wg2Var7.o()) {
                            accessibilityManager = accessibilityManager2;
                            b3 = 4;
                            dm2Var2 = dm2Var;
                            if (wg2.j(4, wg2Var7).isEmpty()) {
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            b3 = 4;
                            dm2Var2 = dm2Var;
                        }
                        if (b2 == b3) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (b2 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strD = pz1.D(b2);
                            if (b2 == 5 || s60.u(wg2Var7) || rg2Var.j) {
                                e2Var.f(strD);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        dm2Var2 = dm2Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(t6Var2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(aa3.A(wg2Var7));
                    if (i2 >= 34) {
                        zI = q1.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = wg2.j(4, wg2Var7);
                    size = listJ.size();
                    z = zI;
                    i4 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        int i38 = size;
                        wg2Var5 = (wg2) listJ.get(i5);
                        List list5 = listJ;
                        ly0VarN = a7Var3.n();
                        int i39 = i5;
                        i36 = wg2Var5.f;
                        if (!ly0VarN.a(i36)) {
                            if (t6Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(wg2Var5.c) == null) {
                                li1.c();
                                return null;
                            }
                            if (i36 == -1) {
                                yg2Var = (yg2) a7Var3.n().b(i36);
                                if (yg2Var != null || (wg2Var6 = yg2Var.a) == null) {
                                    zG2 = false;
                                } else {
                                    Object objG13 = wg2Var6.k().h.g(ah2.o);
                                    if (objG13 == null) {
                                        objG13 = null;
                                    }
                                    zG2 = uz0.g(objG13, Boolean.TRUE);
                                }
                                if (z || !zG2) {
                                    accessibilityNodeInfoObtain.addChild(t6Var2, i36);
                                }
                                qi1Var.f(i36, i4);
                                i4++;
                            }
                        }
                        i5 = i39 + 1;
                        listJ = list5;
                        size = i38;
                    }
                    i6 = a7Var3.r;
                    accessibilityNodeInfo = e2Var.a;
                    if (i == i6) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        e2Var.a(z1.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        e2Var.a(z1.c);
                    }
                    odVarR = s60.r(wg2Var7);
                    if (odVarR != null) {
                        t6Var2.getFontFamilyResolver();
                        density = t6Var2.getDensity();
                        egVar = a7Var3.M;
                        String str5 = odVarR.i;
                        list4 = odVarR.h;
                        spannableString2 = new SpannableString(str5);
                        arrayList5 = odVarR.j;
                        if (arrayList5 != null) {
                            size13 = arrayList5.size();
                            i29 = 0;
                            while (i29 < size13) {
                                ArrayList arrayList9 = arrayList5;
                                nd ndVar6 = (nd) arrayList5.get(i29);
                                int i40 = size13;
                                yl2 yl2Var = (yl2) ndVar6.a;
                                int i41 = i29;
                                i30 = ndVar6.b;
                                i31 = ndVar6.c;
                                a7 a7Var4 = a7Var3;
                                qi1 qi1Var3 = qi1Var;
                                wg2 wg2Var8 = wg2Var7;
                                jA = yl2Var.a.a();
                                ba2 ba2Var4 = ba2Var;
                                Resources resources3 = resources;
                                long j2 = yl2Var.b;
                                qn0Var = yl2Var.c;
                                on0Var = yl2Var.d;
                                yv2Var = yl2Var.j;
                                ub1 ub1Var = yl2Var.k;
                                mj1 mj1Var4 = mj1Var;
                                j = yl2Var.l;
                                vt2Var = yl2Var.m;
                                wvVar = yl2Var.a;
                                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                                jA2 = wvVar.a();
                                int i42 = kv.h;
                                if (!r13.a(jA, jA2)) {
                                    if (jA != 16) {
                                        wvVar = new wv(jA);
                                    } else {
                                        wvVar = wv2.a;
                                    }
                                }
                                h12.z(spannableString2, wvVar.a(), i30, i31);
                                spannableString4 = spannableString2;
                                h12.B(spannableString4, j2, density, i30, i31);
                                if (qn0Var == null) {
                                    if (on0Var != null) {
                                        qn0Var2 = qn0.j;
                                    } else {
                                        i32 = 33;
                                    }
                                    if (vt2Var != null) {
                                        i33 = vt2Var.a;
                                        if ((i33 | 1) == i33) {
                                            spannableString4.setSpan(new UnderlineSpan(), i30, i31, i32);
                                        }
                                        if ((i33 | 2) == i33) {
                                            spannableString4.setSpan(new StrikethroughSpan(), i30, i31, i32);
                                        }
                                    }
                                    if (yv2Var != null) {
                                        spannableString4.setSpan(new ScaleXSpan(yv2Var.a), i30, i31, i32);
                                    }
                                    h12.C(spannableString4, ub1Var, i30, i31);
                                    if (j != 16) {
                                        spannableString4.setSpan(new BackgroundColorSpan(cu.c0(j)), i30, i31, i32);
                                    }
                                    i29 = i41 + 1;
                                    spannableString2 = spannableString4;
                                    arrayList5 = arrayList9;
                                    size13 = i40;
                                    a7Var3 = a7Var4;
                                    wg2Var7 = wg2Var8;
                                    qi1Var = qi1Var3;
                                    ba2Var = ba2Var4;
                                    resources = resources3;
                                    mj1Var = mj1Var4;
                                    accessibilityNodeInfo = accessibilityNodeInfo3;
                                } else {
                                    qn0Var2 = qn0Var;
                                }
                                if (on0Var != null) {
                                    i34 = on0Var.a;
                                } else {
                                    i34 = 0;
                                }
                                if (uz0.i(qn0Var2.h, qn0.i.h) >= 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (i34 == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (!z7 && z6) {
                                    i35 = 3;
                                } else if (z6) {
                                    i35 = 1;
                                } else if (z7) {
                                    i35 = 2;
                                } else {
                                    i35 = 0;
                                }
                                StyleSpan styleSpan = new StyleSpan(i35);
                                i32 = 33;
                                spannableString4.setSpan(styleSpan, i30, i31, 33);
                                if (vt2Var != null) {
                                    i33 = vt2Var.a;
                                    if ((i33 | 1) == i33) {
                                        spannableString4.setSpan(new UnderlineSpan(), i30, i31, i32);
                                    }
                                    if ((i33 | 2) == i33) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i30, i31, i32);
                                    }
                                }
                                if (yv2Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(yv2Var.a), i30, i31, i32);
                                }
                                h12.C(spannableString4, ub1Var, i30, i31);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(cu.c0(j)), i30, i31, i32);
                                }
                                i29 = i41 + 1;
                                spannableString2 = spannableString4;
                                arrayList5 = arrayList9;
                                size13 = i40;
                                a7Var3 = a7Var4;
                                wg2Var7 = wg2Var8;
                                qi1Var = qi1Var3;
                                ba2Var = ba2Var4;
                                resources = resources3;
                                mj1Var = mj1Var4;
                                accessibilityNodeInfo = accessibilityNodeInfo3;
                            }
                        }
                        mj1Var2 = mj1Var;
                        a7Var = a7Var3;
                        AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                        qi1Var2 = qi1Var;
                        wg2Var = wg2Var7;
                        spannableString3 = spannableString2;
                        ba2Var2 = ba2Var;
                        resources2 = resources;
                        int length = str5.length();
                        arrayList6 = ag0.h;
                        if (list4 != null) {
                            arrayList7 = new ArrayList(list4.size());
                            size12 = list4.size();
                            while (i28 < size12) {
                                Object obj2 = list4.get(i28);
                                ndVar5 = (nd) obj2;
                                if (!(ndVar5.a instanceof f43) && pd.b(0, length, ndVar5.b, ndVar5.c)) {
                                    arrayList7.add(obj2);
                                }
                            }
                        } else {
                            arrayList7 = arrayList6;
                        }
                        size7 = arrayList7.size();
                        while (i19 < size7) {
                            nd ndVar7 = (nd) arrayList7.get(i19);
                            f43Var = (f43) ndVar7.a;
                            i26 = ndVar7.b;
                            i27 = ndVar7.c;
                            if (f43Var instanceof f43) {
                                wg.n();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(f43Var.a).build(), i26, i27, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList8 = new ArrayList(list4.size());
                            size11 = list4.size();
                            while (i25 < size11) {
                                Object obj3 = list4.get(i25);
                                ndVar4 = (nd) obj3;
                                if (!(ndVar4.a instanceof w23) && pd.b(0, length2, ndVar4.b, ndVar4.c)) {
                                    arrayList8.add(obj3);
                                }
                            }
                        } else {
                            arrayList8 = arrayList6;
                        }
                        size8 = arrayList8.size();
                        while (i20 < size8) {
                            nd ndVar8 = (nd) arrayList8.get(i20);
                            w23Var = (w23) ndVar8.a;
                            int i43 = ndVar8.b;
                            int i44 = ndVar8.c;
                            weakHashMap3 = (WeakHashMap) egVar.i;
                            uRLSpan2 = weakHashMap3.get(w23Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(w23Var.a);
                                weakHashMap3.put(w23Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i43, i44, 33);
                        }
                        int length3 = str5.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            while (i24 < size10) {
                                Object obj4 = list4.get(i24);
                                ndVar3 = (nd) obj4;
                                if (!(ndVar3.a instanceof ia1) && pd.b(0, length3, ndVar3.b, ndVar3.c)) {
                                    arrayList6.add(obj4);
                                }
                            }
                        }
                        size9 = arrayList6.size();
                        while (i21 < size9) {
                            ndVar = (nd) arrayList6.get(i21);
                            i22 = ndVar.b;
                            obj = ndVar.a;
                            i23 = ndVar.c;
                            if (i22 != i23) {
                                ia1Var = (ia1) obj;
                                if (ia1Var instanceof ha1) {
                                    obj.getClass();
                                    ha1Var = (ha1) obj;
                                    ndVar2 = new nd(i22, i23, ha1Var);
                                    weakHashMap2 = (WeakHashMap) egVar.j;
                                    uRLSpan = weakHashMap2.get(ndVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(ha1Var.a);
                                        weakHashMap2.put(ndVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) egVar.k;
                                    ayVar = weakHashMap.get(ndVar);
                                    if (ayVar == null) {
                                        ayVar = new ay(ia1Var);
                                        weakHashMap.put(ndVar, ayVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) ayVar, i22, i23, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) a7.K(spannableString3);
                        accessibilityNodeInfo2 = accessibilityNodeInfo4;
                    } else {
                        mj1Var2 = mj1Var;
                        a7Var = a7Var3;
                        qi1Var2 = qi1Var;
                        wg2Var = wg2Var7;
                        ba2Var2 = ba2Var;
                        resources2 = resources;
                        e2Var = e2Var;
                        spannableString = null;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo2.setText(spannableString);
                    ch2Var = ah2.O;
                    mj1Var3 = mj1Var2;
                    if (mj1Var3.c(ch2Var)) {
                        accessibilityNodeInfoObtain.setContentInvalid(true);
                        objG11 = mj1Var3.g(ch2Var);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        accessibilityNodeInfoObtain.setError((CharSequence) objG11);
                    }
                    wg2Var2 = wg2Var;
                    Resources resources4 = resources2;
                    strQ = s60.q(wg2Var2, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        a2.h(accessibilityNodeInfo2, strQ);
                    } else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strQ);
                    }
                    accessibilityNodeInfoObtain.setCheckable(s60.p(wg2Var2));
                    by2Var = (by2) r02.r(rg2Var, ah2.L);
                    if (by2Var != null) {
                        if (by2Var == by2.h) {
                            accessibilityNodeInfo2.setChecked(true);
                        } else if (by2Var == by2.i) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    bool = (Boolean) r02.r(rg2Var, ah2.K);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        ba2Var3 = ba2Var2;
                        if (ba2Var2 == null && ba2Var3.a == 4) {
                            accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                        } else {
                            accessibilityNodeInfo2.setChecked(zBooleanValue2);
                        }
                    } else {
                        ba2Var3 = ba2Var2;
                    }
                    if (rg2Var.j || wg2Var2.m().isEmpty()) {
                        list = (List) r02.r(rg2Var, ah2.a);
                        if (list != null) {
                            str = (String) dv.y0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfoObtain.setContentDescription(str);
                    }
                    str2 = (String) r02.r(rg2Var, ah2.A);
                    if (str2 != null) {
                        wg2VarL4 = wg2Var2;
                        while (true) {
                            if (wg2VarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            rg2Var2 = wg2VarL4.d;
                            ch2Var5 = h7.T;
                            if (rg2Var2.h.c(ch2Var5)) {
                                zBooleanValue = ((Boolean) rg2Var2.b(ch2Var5)).booleanValue();
                                break;
                            }
                            wg2VarL4 = wg2VarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                        }
                    }
                    if (((j23) r02.r(rg2Var, ah2.h)) != null) {
                        accessibilityNodeInfo2.setHeading(true);
                    }
                    if (((j23) r02.r(rg2Var, ah2.i)) != null) {
                        accessibilityNodeInfoObtain.setTextEntryKey(true);
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = qi1Var2.d(wg2Var2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfoObtain.setDrawingOrder(iD3);
                        }
                    }
                    accessibilityNodeInfoObtain.setPassword(mj1Var3.c(ah2.N));
                    Object objR = r02.r(rg2Var, ah2.Q);
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfoObtain.setEditable(uz0.g(objR, bool2));
                    num = (Integer) r02.r(rg2Var, ah2.R);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfoObtain.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfoObtain.setEnabled(s60.l(wg2Var2));
                    ch2Var2 = ah2.l;
                    accessibilityNodeInfoObtain.setFocusable(mj1Var3.c(ch2Var2));
                    if (accessibilityNodeInfoObtain.isFocusable()) {
                        accessibilityNodeInfoObtain.setFocused(((Boolean) rg2Var.b(ch2Var2)).booleanValue());
                        if (accessibilityNodeInfoObtain.isFocused()) {
                            accessibilityNodeInfo2.addAction(2);
                            a7Var2 = a7Var;
                            a7Var2.s = i7;
                        } else {
                            a7Var2 = a7Var;
                            z2 = true;
                            accessibilityNodeInfo2.addAction(1);
                        }
                        accessibilityNodeInfo2.setVisibleToUser(aa3.z(wg2Var2) ^ z2);
                        if (wg2Var2.o()) {
                            wg2VarL2 = wg2Var2.l();
                            wg2VarL2.getClass();
                        } else {
                            wg2VarL2 = wg2Var2;
                        }
                        if (wg2VarL2.n().f()) {
                            accessibilityNodeInfo2.setVisibleToUser(false);
                        }
                        lb1Var = (lb1) r02.r(rg2Var, ah2.k);
                        if (lb1Var != null) {
                            z5 = lb1Var.a;
                            if (z5 || !z5) {
                                i18 = 1;
                            } else {
                                i18 = 2;
                            }
                            accessibilityNodeInfoObtain.setLiveRegion(i18);
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        m1Var = (m1) r02.r(rg2Var, qg2.b);
                        if (m1Var != null) {
                            boolean zG4 = uz0.g(r02.r(rg2Var, ah2.K), bool2);
                            if (ba2Var3 == null && ((b = ba2Var3.a) == 4 || b == 3)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 || (z3 && !zG4)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            accessibilityNodeInfo2.setClickable(z4);
                            if (s60.l(wg2Var2) || !accessibilityNodeInfoObtain.isClickable()) {
                                e2Var2 = e2Var;
                            } else {
                                z1 z1Var3 = new z1(16, m1Var.a);
                                e2Var2 = e2Var;
                                e2Var2.a(z1Var3);
                            }
                        } else {
                            e2Var2 = e2Var;
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        m1Var2 = (m1) r02.r(rg2Var, qg2.c);
                        if (m1Var2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (s60.l(wg2Var2)) {
                                e2Var2.a(new z1(32, m1Var2.a));
                            }
                        }
                        m1Var3 = (m1) r02.r(rg2Var, qg2.q);
                        if (m1Var3 != null) {
                            e2Var2.a(new z1(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, m1Var3.a));
                        }
                        if (s60.l(wg2Var2)) {
                            m1Var9 = (m1) r02.r(rg2Var, qg2.k);
                            if (m1Var9 != null) {
                                e2Var2.a(new z1(2097152, m1Var9.a));
                            }
                            m1Var10 = (m1) r02.r(rg2Var, qg2.p);
                            if (m1Var10 != null) {
                                e2Var2.a(new z1(android.R.id.accessibilityActionImeEnter, m1Var10.a));
                            }
                            m1Var11 = (m1) r02.r(rg2Var, qg2.r);
                            if (m1Var11 != null) {
                                e2Var2.a(new z1(65536, m1Var11.a));
                            }
                            m1Var12 = (m1) r02.r(rg2Var, qg2.s);
                            if (m1Var12 != null && accessibilityNodeInfoObtain.isFocused()) {
                                primaryClipDescription = ((ix0) t6Var2.getClipboardManager()).E().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    e2Var2.a(new z1(32768, m1Var12.a));
                                }
                            }
                        }
                        strO = a7.o(wg2Var2);
                        if (strO != null && strO.length() != 0) {
                            accessibilityNodeInfoObtain.setTextSelection(a7Var2.m(wg2Var2), a7Var2.l(wg2Var2));
                            m1Var8 = (m1) r02.r(rg2Var, qg2.j);
                            if (m1Var8 != null) {
                                str4 = m1Var8.a;
                            } else {
                                str4 = null;
                            }
                            e2Var2.a(new z1(131072, str4));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            list3 = (List) r02.r(rg2Var, ah2.a);
                            if ((list3 != null || list3.isEmpty()) && mj1Var3.c(qg2.a) && (!mj1Var3.c(ah2.G) || uz0.g(r02.r(rg2Var, ch2Var2), bool2))) {
                                l41VarU = l41Var2.u();
                                while (true) {
                                    if (l41VarU == null) {
                                        l41VarU = null;
                                        break;
                                    }
                                    rg2VarW2 = l41VarU.w();
                                    if (rg2VarW2 == null && rg2VarW2.j) {
                                        if (rg2VarW2.h.c(ah2.G)) {
                                            break;
                                        }
                                    }
                                    l41VarU = l41VarU.u();
                                }
                                if (l41VarU == null) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                } else {
                                    rg2VarW = l41VarU.w();
                                    if (rg2VarW != null) {
                                        objG10 = rg2VarW.h.g(ah2.l);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        zG = uz0.g(objG10, Boolean.TRUE);
                                    } else {
                                        zG = false;
                                    }
                                    if (zG) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = e2Var2.e();
                        if (charSequenceE != null && charSequenceE.length() != 0 && mj1Var3.c(qg2.a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (mj1Var3.c(ah2.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (mj1Var3.c(ah2.S)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfoObtain.setAvailableExtraData(arrayList);
                        b42Var = (b42) r02.r(rg2Var, ah2.c);
                        if (b42Var != null) {
                            ch2Var4 = qg2.i;
                            if (mj1Var3.c(ch2Var4)) {
                                e2Var2.f("android.widget.SeekBar");
                            } else {
                                e2Var2.f("android.widget.ProgressBar");
                            }
                            if (b42Var != b42.b) {
                                accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), fValueOf.floatValue(), 0.0f));
                            }
                            if (mj1Var3.c(ch2Var4) && s60.l(wg2Var2)) {
                                fFloatValue = fValueOf.floatValue();
                                fFloatValue2 = fValueOf.floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (0.0f < fFloatValue) {
                                    e2Var2.a(z1.e);
                                }
                                fFloatValue3 = fValueOf.floatValue();
                                fFloatValue4 = fValueOf.floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (0.0f > fFloatValue3) {
                                    e2Var2.a(z1.f);
                                }
                            }
                        }
                        if (s60.l(wg2Var2) && (m1Var7 = (m1) r02.r(rg2Var, qg2.i)) != null) {
                            e2Var2.a(new z1(android.R.id.accessibilityActionSetProgress, m1Var7.a));
                        }
                        bvVar = (bv) r02.r(wg2Var2.k(), ah2.f);
                        if (bvVar != null) {
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bvVar.a, bvVar.b, false, 0));
                        } else {
                            arrayList2 = new ArrayList();
                            if (r02.r(wg2Var2.k(), ah2.e) != null) {
                                listM = wg2Var2.m();
                                size4 = listM.size();
                                while (i8 < size4) {
                                    wg2Var3 = (wg2) listM.get(i8);
                                    if (wg2Var3.k().h.c(ah2.K)) {
                                        arrayList2.add(wg2Var3);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                if (dt.w(arrayList2)) {
                                    size3 = arrayList2.size();
                                    size2 = 1;
                                } else {
                                    size2 = arrayList2.size();
                                    size3 = 1;
                                }
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        objG2 = wg2Var2.k().h.g(ah2.g);
                        if (objG2 == null) {
                            objG2 = null;
                        }
                        if (objG2 == null) {
                            wg2VarL3 = wg2Var2.l();
                            if (wg2VarL3 != null) {
                                objG7 = wg2VarL3.k().h.g(ah2.e);
                                if (objG7 == null) {
                                    objG7 = null;
                                }
                                if (objG7 != null) {
                                    objG8 = wg2VarL3.k().h.g(ah2.f);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bvVar2 = (bv) objG8;
                                    if (bvVar2 != null || (bvVar2.a >= 0 && bvVar2.b >= 0)) {
                                        if (wg2Var2.k().h.c(ah2.K)) {
                                            arrayList4 = new ArrayList();
                                            listJ2 = wg2.j(4, wg2VarL3);
                                            size6 = listJ2.size();
                                            i15 = 0;
                                            while (i14 < size6) {
                                                wg2Var4 = (wg2) listJ2.get(i14);
                                                if (wg2Var4.k().h.c(ah2.K)) {
                                                    arrayList4.add(wg2Var4);
                                                    if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                        i15++;
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                zW = dt.w(arrayList4);
                                                if (zW) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = i15;
                                                }
                                                if (zW) {
                                                    i17 = i15;
                                                } else {
                                                    i17 = 0;
                                                }
                                                objG9 = wg2Var2.k().h.g(ah2.K);
                                                if (objG9 == null) {
                                                    objG9 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            li1.c();
                        }
                        md2Var = (md2) r02.r(rg2Var, ah2.v);
                        m1 m1Var13 = (m1) r02.r(rg2Var, qg2.d);
                        if (md2Var != null && m1Var13 != null) {
                            objG5 = wg2Var2.k().h.g(ah2.f);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (objG5 == null) {
                                objG6 = wg2Var2.k().h.g(ah2.e);
                                if (objG6 == null) {
                                    objG6 = null;
                                }
                                if (objG6 == null) {
                                    e2Var2.f("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) md2Var.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (s60.l(wg2Var2)) {
                                zU = a7.u(md2Var);
                                u31Var = u31.i;
                                if (zU) {
                                    e2Var2.a(z1.e);
                                    if (l41Var.F == u31Var) {
                                        l41Var = l41Var2;
                                        z1Var2 = z1.h;
                                    } else {
                                        l41Var = l41Var2;
                                        z1Var2 = z1.j;
                                    }
                                    e2Var2.a(z1Var2);
                                } else {
                                    l41Var = l41Var2;
                                }
                                if (a7.t(md2Var)) {
                                    e2Var2.a(z1.f);
                                    if (l41Var.F == u31Var) {
                                        z1Var = z1.j;
                                    } else {
                                        z1Var = z1.h;
                                    }
                                    e2Var2.a(z1Var);
                                }
                            }
                        }
                        md2Var2 = (md2) r02.r(rg2Var, ah2.w);
                        if (md2Var2 != null && m1Var13 != null) {
                            objG3 = wg2Var2.k().h.g(ah2.f);
                            if (objG3 == null) {
                                objG3 = null;
                            }
                            if (objG3 == null) {
                                objG4 = wg2Var2.k().h.g(ah2.e);
                                if (objG4 == null) {
                                    objG4 = null;
                                }
                                if (objG4 == null) {
                                    e2Var2.f("android.widget.ScrollView");
                                }
                            }
                            if (((Number) md2Var2.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (s60.l(wg2Var2)) {
                                if (a7.u(md2Var2)) {
                                    e2Var2.a(z1.e);
                                    e2Var2.a(z1.i);
                                }
                                if (a7.t(md2Var2)) {
                                    e2Var2.a(z1.f);
                                    e2Var2.a(z1.g);
                                }
                            }
                        }
                        h7.U(e2Var2, wg2Var2);
                        accessibilityNodeInfo2.setPaneTitle((CharSequence) r02.r(rg2Var, ah2.d));
                        if (s60.l(wg2Var2)) {
                            m1Var4 = (m1) r02.r(rg2Var, qg2.t);
                            if (m1Var4 != null) {
                                e2Var2.a(new z1(262144, m1Var4.a));
                            }
                            m1Var5 = (m1) r02.r(rg2Var, qg2.u);
                            if (m1Var5 != null) {
                                e2Var2.a(new z1(524288, m1Var5.a));
                            }
                            m1Var6 = (m1) r02.r(rg2Var, qg2.v);
                            if (m1Var6 != null) {
                                e2Var2.a(new z1(1048576, m1Var6.a));
                            }
                            ch2Var3 = qg2.x;
                            if (mj1Var3.c(ch2Var3)) {
                                list2 = (List) rg2Var.b(ch2Var3);
                                size5 = list2.size();
                                ri1Var = a7.U;
                                i9 = ri1Var.b;
                                if (size5 < i9) {
                                    li1.g(jp1.i(i9, "Can't have more than ", " custom actions for one widget"));
                                    return null;
                                }
                                dm2 dm2Var4 = new dm2(0);
                                bj1 bj1VarA = ip1.a();
                                dm2Var3 = dm2Var2;
                                if (dm2Var3.h) {
                                    aa3.o(dm2Var3);
                                }
                                if (s60.h(dm2Var3.k, i7, dm2Var3.i) >= 0) {
                                    bj1Var = (bj1) aa3.g(dm2Var3, i7);
                                    iArr = ri1Var.a;
                                    i10 = ri1Var.b;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i45 = iArr[i11];
                                        int i46 = i10;
                                        i13 = i12 + 1;
                                        int i47 = i11;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i45;
                                        i11 = i47 + 1;
                                        i12 = i13;
                                        i10 = i46;
                                    }
                                    arrayList3 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        wi0.t(list2.get(0));
                                        bj1Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList3.size() > 0) {
                                        wi0.t(arrayList3.get(0));
                                        if (i12 <= 0) {
                                            wg.i("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i48 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    wi0.t(list2.get(0));
                                    ri1Var.c(0);
                                    throw null;
                                }
                                a7Var2.y.c(i7, dm2Var4);
                                dm2Var3.c(i7, bj1VarA);
                            }
                        }
                        accessibilityNodeInfo2.setScreenReaderFocusable(s60.t(wg2Var2, resources4));
                        iD = a7Var2.I.d(i7);
                        if (iD != -1) {
                            pz1.u(t6Var2.getAndroidViewsHandler$ui(), iD);
                            t6Var = t6Var2;
                            accessibilityNodeInfo2.setTraversalBefore(t6Var, iD);
                            a7Var2.e(i7, e2Var2, a7Var2.K, null);
                        } else {
                            t6Var = t6Var2;
                        }
                        iD2 = a7Var2.J.d(i7);
                        if (iD2 != -1) {
                            pz1.u(t6Var.getAndroidViewsHandler$ui(), iD2);
                        }
                        str3 = (String) r02.r(rg2Var, h7.U);
                        if (str3 != null) {
                            e2Var2.f(str3);
                        }
                        e2Var3 = e2Var2;
                    } else {
                        a7Var2 = a7Var;
                    }
                    z2 = true;
                    accessibilityNodeInfo2.setVisibleToUser(aa3.z(wg2Var2) ^ z2);
                    if (wg2Var2.o()) {
                        wg2VarL2 = wg2Var2.l();
                        wg2VarL2.getClass();
                    } else {
                        wg2VarL2 = wg2Var2;
                    }
                    if (wg2VarL2.n().f()) {
                        accessibilityNodeInfo2.setVisibleToUser(false);
                    }
                    lb1Var = (lb1) r02.r(rg2Var, ah2.k);
                    if (lb1Var != null) {
                        z5 = lb1Var.a;
                        if (z5) {
                            i18 = 1;
                        } else {
                            i18 = 1;
                        }
                        accessibilityNodeInfoObtain.setLiveRegion(i18);
                    }
                    accessibilityNodeInfo2.setClickable(false);
                    m1Var = (m1) r02.r(rg2Var, qg2.b);
                    if (m1Var != null) {
                        boolean zG5 = uz0.g(r02.r(rg2Var, ah2.K), bool2);
                        if (ba2Var3 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo2.setClickable(z4);
                        if (s60.l(wg2Var2)) {
                            e2Var2 = e2Var;
                        } else {
                            e2Var2 = e2Var;
                        }
                    } else {
                        e2Var2 = e2Var;
                    }
                    accessibilityNodeInfo2.setLongClickable(false);
                    m1Var2 = (m1) r02.r(rg2Var, qg2.c);
                    if (m1Var2 != null) {
                        accessibilityNodeInfo2.setLongClickable(true);
                        if (s60.l(wg2Var2)) {
                            e2Var2.a(new z1(32, m1Var2.a));
                        }
                    }
                    m1Var3 = (m1) r02.r(rg2Var, qg2.q);
                    if (m1Var3 != null) {
                        e2Var2.a(new z1(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, m1Var3.a));
                    }
                    if (s60.l(wg2Var2)) {
                        m1Var9 = (m1) r02.r(rg2Var, qg2.k);
                        if (m1Var9 != null) {
                            e2Var2.a(new z1(2097152, m1Var9.a));
                        }
                        m1Var10 = (m1) r02.r(rg2Var, qg2.p);
                        if (m1Var10 != null) {
                            e2Var2.a(new z1(android.R.id.accessibilityActionImeEnter, m1Var10.a));
                        }
                        m1Var11 = (m1) r02.r(rg2Var, qg2.r);
                        if (m1Var11 != null) {
                            e2Var2.a(new z1(65536, m1Var11.a));
                        }
                        m1Var12 = (m1) r02.r(rg2Var, qg2.s);
                        if (m1Var12 != null) {
                            primaryClipDescription = ((ix0) t6Var2.getClipboardManager()).E().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                e2Var2.a(new z1(32768, m1Var12.a));
                            }
                        }
                    }
                    strO = a7.o(wg2Var2);
                    if (strO != null) {
                        accessibilityNodeInfoObtain.setTextSelection(a7Var2.m(wg2Var2), a7Var2.l(wg2Var2));
                        m1Var8 = (m1) r02.r(rg2Var, qg2.j);
                        if (m1Var8 != null) {
                            str4 = m1Var8.a;
                        } else {
                            str4 = null;
                        }
                        e2Var2.a(new z1(131072, str4));
                        accessibilityNodeInfo2.addAction(256);
                        accessibilityNodeInfo2.addAction(512);
                        accessibilityNodeInfo2.setMovementGranularities(11);
                        list3 = (List) r02.r(rg2Var, ah2.a);
                        if (list3 != null) {
                            l41VarU = l41Var2.u();
                            while (true) {
                                if (l41VarU == null) {
                                    l41VarU = null;
                                    break;
                                }
                                rg2VarW2 = l41VarU.w();
                                if (rg2VarW2 == null) {
                                }
                                l41VarU = l41VarU.u();
                            }
                            if (l41VarU == null) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                            } else {
                                rg2VarW = l41VarU.w();
                                if (rg2VarW != null) {
                                    objG10 = rg2VarW.h.g(ah2.l);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    zG = uz0.g(objG10, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            l41VarU = l41Var2.u();
                            while (true) {
                                if (l41VarU == null) {
                                    l41VarU = null;
                                    break;
                                }
                                rg2VarW2 = l41VarU.w();
                                if (rg2VarW2 == null) {
                                }
                                l41VarU = l41VarU.u();
                            }
                            if (l41VarU == null) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                            } else {
                                rg2VarW = l41VarU.w();
                                if (rg2VarW != null) {
                                    objG10 = rg2VarW.h.g(ah2.l);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    zG = uz0.g(objG10, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceE = e2Var2.e();
                    if (charSequenceE != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (mj1Var3.c(ah2.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (mj1Var3.c(ah2.S)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfoObtain.setAvailableExtraData(arrayList);
                    b42Var = (b42) r02.r(rg2Var, ah2.c);
                    if (b42Var != null) {
                        ch2Var4 = qg2.i;
                        if (mj1Var3.c(ch2Var4)) {
                            e2Var2.f("android.widget.SeekBar");
                        } else {
                            e2Var2.f("android.widget.ProgressBar");
                        }
                        if (b42Var != b42.b) {
                            accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), fValueOf.floatValue(), 0.0f));
                        }
                        if (mj1Var3.c(ch2Var4)) {
                            fFloatValue = fValueOf.floatValue();
                            fFloatValue2 = fValueOf.floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (0.0f < fFloatValue) {
                                e2Var2.a(z1.e);
                            }
                            fFloatValue3 = fValueOf.floatValue();
                            fFloatValue4 = fValueOf.floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (0.0f > fFloatValue3) {
                                e2Var2.a(z1.f);
                            }
                        }
                    }
                    if (s60.l(wg2Var2)) {
                        e2Var2.a(new z1(android.R.id.accessibilityActionSetProgress, m1Var7.a));
                    }
                    bvVar = (bv) r02.r(wg2Var2.k(), ah2.f);
                    if (bvVar != null) {
                        accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bvVar.a, bvVar.b, false, 0));
                    } else {
                        arrayList2 = new ArrayList();
                        if (r02.r(wg2Var2.k(), ah2.e) != null) {
                            listM = wg2Var2.m();
                            size4 = listM.size();
                            while (i8 < size4) {
                                wg2Var3 = (wg2) listM.get(i8);
                                if (wg2Var3.k().h.c(ah2.K)) {
                                    arrayList2.add(wg2Var3);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            if (dt.w(arrayList2)) {
                                size3 = arrayList2.size();
                                size2 = 1;
                            } else {
                                size2 = arrayList2.size();
                                size3 = 1;
                            }
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    objG2 = wg2Var2.k().h.g(ah2.g);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    if (objG2 == null) {
                        wg2VarL3 = wg2Var2.l();
                        if (wg2VarL3 != null) {
                            objG7 = wg2VarL3.k().h.g(ah2.e);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            if (objG7 != null) {
                                objG8 = wg2VarL3.k().h.g(ah2.f);
                                if (objG8 == null) {
                                    objG8 = null;
                                }
                                bvVar2 = (bv) objG8;
                                if (bvVar2 != null) {
                                    if (wg2Var2.k().h.c(ah2.K)) {
                                        arrayList4 = new ArrayList();
                                        listJ2 = wg2.j(4, wg2VarL3);
                                        size6 = listJ2.size();
                                        i15 = 0;
                                        while (i14 < size6) {
                                            wg2Var4 = (wg2) listJ2.get(i14);
                                            if (wg2Var4.k().h.c(ah2.K)) {
                                                arrayList4.add(wg2Var4);
                                                if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            zW = dt.w(arrayList4);
                                            if (zW) {
                                                i16 = 0;
                                            } else {
                                                i16 = i15;
                                            }
                                            if (zW) {
                                                i17 = i15;
                                            } else {
                                                i17 = 0;
                                            }
                                            objG9 = wg2Var2.k().h.g(ah2.K);
                                            if (objG9 == null) {
                                                objG9 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                        }
                                    }
                                } else if (wg2Var2.k().h.c(ah2.K)) {
                                    arrayList4 = new ArrayList();
                                    listJ2 = wg2.j(4, wg2VarL3);
                                    size6 = listJ2.size();
                                    i15 = 0;
                                    while (i14 < size6) {
                                        wg2Var4 = (wg2) listJ2.get(i14);
                                        if (wg2Var4.k().h.c(ah2.K)) {
                                            arrayList4.add(wg2Var4);
                                            if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                i15++;
                                            }
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        zW = dt.w(arrayList4);
                                        if (zW) {
                                            i16 = 0;
                                        } else {
                                            i16 = i15;
                                        }
                                        if (zW) {
                                            i17 = i15;
                                        } else {
                                            i17 = 0;
                                        }
                                        objG9 = wg2Var2.k().h.g(ah2.K);
                                        if (objG9 == null) {
                                            objG9 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        li1.c();
                    }
                    md2Var = (md2) r02.r(rg2Var, ah2.v);
                    m1 m1Var14 = (m1) r02.r(rg2Var, qg2.d);
                    if (md2Var != null) {
                        objG5 = wg2Var2.k().h.g(ah2.f);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (objG5 == null) {
                            objG6 = wg2Var2.k().h.g(ah2.e);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            if (objG6 == null) {
                                e2Var2.f("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) md2Var.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (s60.l(wg2Var2)) {
                            zU = a7.u(md2Var);
                            u31Var = u31.i;
                            if (zU) {
                                e2Var2.a(z1.e);
                                if (l41Var.F == u31Var) {
                                    l41Var = l41Var2;
                                    z1Var2 = z1.h;
                                } else {
                                    l41Var = l41Var2;
                                    z1Var2 = z1.j;
                                }
                                e2Var2.a(z1Var2);
                            } else {
                                l41Var = l41Var2;
                            }
                            if (a7.t(md2Var)) {
                                e2Var2.a(z1.f);
                                if (l41Var.F == u31Var) {
                                    z1Var = z1.j;
                                } else {
                                    z1Var = z1.h;
                                }
                                e2Var2.a(z1Var);
                            }
                        }
                    }
                    md2Var2 = (md2) r02.r(rg2Var, ah2.w);
                    if (md2Var2 != null) {
                        objG3 = wg2Var2.k().h.g(ah2.f);
                        if (objG3 == null) {
                            objG3 = null;
                        }
                        if (objG3 == null) {
                            objG4 = wg2Var2.k().h.g(ah2.e);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            if (objG4 == null) {
                                e2Var2.f("android.widget.ScrollView");
                            }
                        }
                        if (((Number) md2Var2.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (s60.l(wg2Var2)) {
                            if (a7.u(md2Var2)) {
                                e2Var2.a(z1.e);
                                e2Var2.a(z1.i);
                            }
                            if (a7.t(md2Var2)) {
                                e2Var2.a(z1.f);
                                e2Var2.a(z1.g);
                            }
                        }
                    }
                    h7.U(e2Var2, wg2Var2);
                    accessibilityNodeInfo2.setPaneTitle((CharSequence) r02.r(rg2Var, ah2.d));
                    if (s60.l(wg2Var2)) {
                        m1Var4 = (m1) r02.r(rg2Var, qg2.t);
                        if (m1Var4 != null) {
                            e2Var2.a(new z1(262144, m1Var4.a));
                        }
                        m1Var5 = (m1) r02.r(rg2Var, qg2.u);
                        if (m1Var5 != null) {
                            e2Var2.a(new z1(524288, m1Var5.a));
                        }
                        m1Var6 = (m1) r02.r(rg2Var, qg2.v);
                        if (m1Var6 != null) {
                            e2Var2.a(new z1(1048576, m1Var6.a));
                        }
                        ch2Var3 = qg2.x;
                        if (mj1Var3.c(ch2Var3)) {
                            list2 = (List) rg2Var.b(ch2Var3);
                            size5 = list2.size();
                            ri1Var = a7.U;
                            i9 = ri1Var.b;
                            if (size5 < i9) {
                                li1.g(jp1.i(i9, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            dm2 dm2Var5 = new dm2(0);
                            bj1 bj1VarA2 = ip1.a();
                            dm2Var3 = dm2Var2;
                            if (dm2Var3.h) {
                                aa3.o(dm2Var3);
                            }
                            if (s60.h(dm2Var3.k, i7, dm2Var3.i) >= 0) {
                                bj1Var = (bj1) aa3.g(dm2Var3, i7);
                                iArr = ri1Var.a;
                                i10 = ri1Var.b;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i49 = iArr[i11];
                                    int i410 = i10;
                                    i13 = i12 + 1;
                                    int i411 = i11;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i49;
                                    i11 = i411 + 1;
                                    i12 = i13;
                                    i10 = i410;
                                }
                                arrayList3 = new ArrayList();
                                if (list2.size() <= 0) {
                                    wi0.t(list2.get(0));
                                    bj1Var.getClass();
                                    throw null;
                                }
                                if (arrayList3.size() > 0) {
                                    wi0.t(arrayList3.get(0));
                                    if (i12 <= 0) {
                                        wg.i("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i412 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                wi0.t(list2.get(0));
                                ri1Var.c(0);
                                throw null;
                            }
                            a7Var2.y.c(i7, dm2Var5);
                            dm2Var3.c(i7, bj1VarA2);
                        }
                    }
                    accessibilityNodeInfo2.setScreenReaderFocusable(s60.t(wg2Var2, resources4));
                    iD = a7Var2.I.d(i7);
                    if (iD != -1) {
                        pz1.u(t6Var2.getAndroidViewsHandler$ui(), iD);
                        t6Var = t6Var2;
                        accessibilityNodeInfo2.setTraversalBefore(t6Var, iD);
                        a7Var2.e(i7, e2Var2, a7Var2.K, null);
                    } else {
                        t6Var = t6Var2;
                    }
                    iD2 = a7Var2.J.d(i7);
                    if (iD2 != -1) {
                        pz1.u(t6Var.getAndroidViewsHandler$ui(), iD2);
                    }
                    str3 = (String) r02.r(rg2Var, h7.U);
                    if (str3 != null) {
                        e2Var2.f(str3);
                    }
                    e2Var3 = e2Var2;
                } else if (Build.VERSION.SDK_INT >= 34 ? q1.i(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    e2Var = new e2(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        q1.k(accessibilityNodeInfoObtain, zG3);
                    } else {
                        extras = accessibilityNodeInfoObtain.getExtras();
                        if (extras != null) {
                            int i310 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zG3) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i310 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = t6Var2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        e2Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        wg2VarL = wg2Var7.l();
                        if (wg2VarL != null) {
                            numValueOf = Integer.valueOf(wg2VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            ax0.c("semanticsNode " + i + " has null parent");
                            wg.k();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == t6Var2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        e2Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(t6Var2, iIntValue);
                    }
                    e2Var.c = i;
                    accessibilityNodeInfoObtain.setSource(t6Var2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(a7Var3.f(yg2Var2));
                    qi1Var = a7Var3.Q;
                    dm2Var = a7Var3.z;
                    resources = t6Var2.getContext().getResources();
                    e2Var.f("android.view.View");
                    rg2Var = wg2Var7.d;
                    mj1Var = rg2Var.h;
                    if (mj1Var.c(ah2.G)) {
                        e2Var.f("android.widget.EditText");
                    }
                    if (mj1Var.c(ah2.C)) {
                        e2Var.f("android.widget.TextView");
                    }
                    objG = mj1Var.g(ah2.z);
                    if (objG == null) {
                        objG = null;
                    }
                    ba2Var = (ba2) objG;
                    if (ba2Var != null) {
                        b2 = ba2Var.a;
                        if (wg2Var7.o()) {
                            accessibilityManager = accessibilityManager2;
                            b3 = 4;
                            dm2Var2 = dm2Var;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            b3 = 4;
                            dm2Var2 = dm2Var;
                            if (wg2.j(4, wg2Var7).isEmpty()) {
                            }
                        }
                        if (b2 == b3) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (b2 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strD = pz1.D(b2);
                            if (b2 == 5) {
                                e2Var.f(strD);
                            } else {
                                e2Var.f(strD);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        dm2Var2 = dm2Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(t6Var2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(aa3.A(wg2Var7));
                    if (i2 >= 34) {
                        zI = q1.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = wg2.j(4, wg2Var7);
                    size = listJ.size();
                    z = zI;
                    i4 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        int i311 = size;
                        wg2Var5 = (wg2) listJ.get(i5);
                        List list6 = listJ;
                        ly0VarN = a7Var3.n();
                        int i312 = i5;
                        i36 = wg2Var5.f;
                        if (!ly0VarN.a(i36)) {
                            if (t6Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(wg2Var5.c) == null) {
                                li1.c();
                                return null;
                            }
                            if (i36 == -1) {
                                yg2Var = (yg2) a7Var3.n().b(i36);
                                if (yg2Var != null) {
                                    zG2 = false;
                                } else {
                                    zG2 = false;
                                }
                                if (z) {
                                    accessibilityNodeInfoObtain.addChild(t6Var2, i36);
                                } else {
                                    accessibilityNodeInfoObtain.addChild(t6Var2, i36);
                                }
                                qi1Var.f(i36, i4);
                                i4++;
                            }
                        }
                        i5 = i312 + 1;
                        listJ = list6;
                        size = i311;
                    }
                    i6 = a7Var3.r;
                    accessibilityNodeInfo = e2Var.a;
                    if (i == i6) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        e2Var.a(z1.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        e2Var.a(z1.c);
                    }
                    odVarR = s60.r(wg2Var7);
                    if (odVarR != null) {
                        t6Var2.getFontFamilyResolver();
                        density = t6Var2.getDensity();
                        egVar = a7Var3.M;
                        String str6 = odVarR.i;
                        list4 = odVarR.h;
                        spannableString2 = new SpannableString(str6);
                        arrayList5 = odVarR.j;
                        if (arrayList5 != null) {
                            size13 = arrayList5.size();
                            i29 = 0;
                            while (i29 < size13) {
                                ArrayList arrayList10 = arrayList5;
                                nd ndVar9 = (nd) arrayList5.get(i29);
                                int i413 = size13;
                                yl2 yl2Var2 = (yl2) ndVar9.a;
                                int i414 = i29;
                                i30 = ndVar9.b;
                                i31 = ndVar9.c;
                                a7 a7Var5 = a7Var3;
                                qi1 qi1Var4 = qi1Var;
                                wg2 wg2Var9 = wg2Var7;
                                jA = yl2Var2.a.a();
                                ba2 ba2Var5 = ba2Var;
                                Resources resources5 = resources;
                                long j3 = yl2Var2.b;
                                qn0Var = yl2Var2.c;
                                on0Var = yl2Var2.d;
                                yv2Var = yl2Var2.j;
                                ub1 ub1Var2 = yl2Var2.k;
                                mj1 mj1Var5 = mj1Var;
                                j = yl2Var2.l;
                                vt2Var = yl2Var2.m;
                                wvVar = yl2Var2.a;
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                                jA2 = wvVar.a();
                                int i415 = kv.h;
                                if (!r13.a(jA, jA2)) {
                                    if (jA != 16) {
                                        wvVar = new wv(jA);
                                    } else {
                                        wvVar = wv2.a;
                                    }
                                }
                                h12.z(spannableString2, wvVar.a(), i30, i31);
                                spannableString4 = spannableString2;
                                h12.B(spannableString4, j3, density, i30, i31);
                                if (qn0Var == null) {
                                    if (on0Var != null) {
                                        qn0Var2 = qn0.j;
                                    } else {
                                        i32 = 33;
                                    }
                                    if (vt2Var != null) {
                                        i33 = vt2Var.a;
                                        if ((i33 | 1) == i33) {
                                            spannableString4.setSpan(new UnderlineSpan(), i30, i31, i32);
                                        }
                                        if ((i33 | 2) == i33) {
                                            spannableString4.setSpan(new StrikethroughSpan(), i30, i31, i32);
                                        }
                                    }
                                    if (yv2Var != null) {
                                        spannableString4.setSpan(new ScaleXSpan(yv2Var.a), i30, i31, i32);
                                    }
                                    h12.C(spannableString4, ub1Var2, i30, i31);
                                    if (j != 16) {
                                        spannableString4.setSpan(new BackgroundColorSpan(cu.c0(j)), i30, i31, i32);
                                    }
                                    i29 = i414 + 1;
                                    spannableString2 = spannableString4;
                                    arrayList5 = arrayList10;
                                    size13 = i413;
                                    a7Var3 = a7Var5;
                                    wg2Var7 = wg2Var9;
                                    qi1Var = qi1Var4;
                                    ba2Var = ba2Var5;
                                    resources = resources5;
                                    mj1Var = mj1Var5;
                                    accessibilityNodeInfo = accessibilityNodeInfo5;
                                } else {
                                    qn0Var2 = qn0Var;
                                }
                                if (on0Var != null) {
                                    i34 = on0Var.a;
                                } else {
                                    i34 = 0;
                                }
                                if (uz0.i(qn0Var2.h, qn0.i.h) >= 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (i34 == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (!z7) {
                                    if (z6) {
                                        i35 = 1;
                                    } else if (z7) {
                                        i35 = 2;
                                    } else {
                                        i35 = 0;
                                    }
                                } else if (z6) {
                                    i35 = 1;
                                } else if (z7) {
                                    i35 = 2;
                                } else {
                                    i35 = 0;
                                }
                                StyleSpan styleSpan2 = new StyleSpan(i35);
                                i32 = 33;
                                spannableString4.setSpan(styleSpan2, i30, i31, 33);
                                if (vt2Var != null) {
                                    i33 = vt2Var.a;
                                    if ((i33 | 1) == i33) {
                                        spannableString4.setSpan(new UnderlineSpan(), i30, i31, i32);
                                    }
                                    if ((i33 | 2) == i33) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i30, i31, i32);
                                    }
                                }
                                if (yv2Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(yv2Var.a), i30, i31, i32);
                                }
                                h12.C(spannableString4, ub1Var2, i30, i31);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(cu.c0(j)), i30, i31, i32);
                                }
                                i29 = i414 + 1;
                                spannableString2 = spannableString4;
                                arrayList5 = arrayList10;
                                size13 = i413;
                                a7Var3 = a7Var5;
                                wg2Var7 = wg2Var9;
                                qi1Var = qi1Var4;
                                ba2Var = ba2Var5;
                                resources = resources5;
                                mj1Var = mj1Var5;
                                accessibilityNodeInfo = accessibilityNodeInfo5;
                            }
                        }
                        mj1Var2 = mj1Var;
                        a7Var = a7Var3;
                        AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                        qi1Var2 = qi1Var;
                        wg2Var = wg2Var7;
                        spannableString3 = spannableString2;
                        ba2Var2 = ba2Var;
                        resources2 = resources;
                        int length4 = str6.length();
                        arrayList6 = ag0.h;
                        if (list4 != null) {
                            arrayList7 = new ArrayList(list4.size());
                            size12 = list4.size();
                            for (i28 = 0; i28 < size12; i28++) {
                                Object obj5 = list4.get(i28);
                                ndVar5 = (nd) obj5;
                                if (!(ndVar5.a instanceof f43)) {
                                }
                            }
                        } else {
                            arrayList7 = arrayList6;
                        }
                        size7 = arrayList7.size();
                        for (i19 = 0; i19 < size7; i19++) {
                            nd ndVar10 = (nd) arrayList7.get(i19);
                            f43Var = (f43) ndVar10.a;
                            i26 = ndVar10.b;
                            i27 = ndVar10.c;
                            if (f43Var instanceof f43) {
                                wg.n();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(f43Var.a).build(), i26, i27, 33);
                        }
                        int length5 = str6.length();
                        if (list4 != null) {
                            arrayList8 = new ArrayList(list4.size());
                            size11 = list4.size();
                            for (i25 = 0; i25 < size11; i25++) {
                                Object obj6 = list4.get(i25);
                                ndVar4 = (nd) obj6;
                                if (!(ndVar4.a instanceof w23)) {
                                }
                            }
                        } else {
                            arrayList8 = arrayList6;
                        }
                        size8 = arrayList8.size();
                        for (i20 = 0; i20 < size8; i20++) {
                            nd ndVar11 = (nd) arrayList8.get(i20);
                            w23Var = (w23) ndVar11.a;
                            int i416 = ndVar11.b;
                            int i417 = ndVar11.c;
                            weakHashMap3 = (WeakHashMap) egVar.i;
                            uRLSpan2 = weakHashMap3.get(w23Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(w23Var.a);
                                weakHashMap3.put(w23Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i416, i417, 33);
                        }
                        int length6 = str6.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            for (i24 = 0; i24 < size10; i24++) {
                                Object obj7 = list4.get(i24);
                                ndVar3 = (nd) obj7;
                                if (!(ndVar3.a instanceof ia1)) {
                                }
                            }
                        }
                        size9 = arrayList6.size();
                        for (i21 = 0; i21 < size9; i21++) {
                            ndVar = (nd) arrayList6.get(i21);
                            i22 = ndVar.b;
                            obj = ndVar.a;
                            i23 = ndVar.c;
                            if (i22 != i23) {
                                ia1Var = (ia1) obj;
                                if (ia1Var instanceof ha1) {
                                    obj.getClass();
                                    ha1Var = (ha1) obj;
                                    ndVar2 = new nd(i22, i23, ha1Var);
                                    weakHashMap2 = (WeakHashMap) egVar.j;
                                    uRLSpan = weakHashMap2.get(ndVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(ha1Var.a);
                                        weakHashMap2.put(ndVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) egVar.k;
                                    ayVar = weakHashMap.get(ndVar);
                                    if (ayVar == null) {
                                        ayVar = new ay(ia1Var);
                                        weakHashMap.put(ndVar, ayVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) ayVar, i22, i23, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) a7.K(spannableString3);
                        accessibilityNodeInfo2 = accessibilityNodeInfo6;
                    } else {
                        mj1Var2 = mj1Var;
                        a7Var = a7Var3;
                        qi1Var2 = qi1Var;
                        wg2Var = wg2Var7;
                        ba2Var2 = ba2Var;
                        resources2 = resources;
                        e2Var = e2Var;
                        spannableString = null;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo2.setText(spannableString);
                    ch2Var = ah2.O;
                    mj1Var3 = mj1Var2;
                    if (mj1Var3.c(ch2Var)) {
                        accessibilityNodeInfoObtain.setContentInvalid(true);
                        objG11 = mj1Var3.g(ch2Var);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        accessibilityNodeInfoObtain.setError((CharSequence) objG11);
                    }
                    wg2Var2 = wg2Var;
                    Resources resources6 = resources2;
                    strQ = s60.q(wg2Var2, resources6);
                    if (Build.VERSION.SDK_INT >= 30) {
                        a2.h(accessibilityNodeInfo2, strQ);
                    } else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strQ);
                    }
                    accessibilityNodeInfoObtain.setCheckable(s60.p(wg2Var2));
                    by2Var = (by2) r02.r(rg2Var, ah2.L);
                    if (by2Var != null) {
                        if (by2Var == by2.h) {
                            accessibilityNodeInfo2.setChecked(true);
                        } else if (by2Var == by2.i) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    bool = (Boolean) r02.r(rg2Var, ah2.K);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        ba2Var3 = ba2Var2;
                        if (ba2Var2 == null) {
                            accessibilityNodeInfo2.setChecked(zBooleanValue2);
                        } else {
                            accessibilityNodeInfo2.setChecked(zBooleanValue2);
                        }
                    } else {
                        ba2Var3 = ba2Var2;
                    }
                    if (rg2Var.j) {
                        list = (List) r02.r(rg2Var, ah2.a);
                        if (list != null) {
                            str = (String) dv.y0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfoObtain.setContentDescription(str);
                    } else {
                        list = (List) r02.r(rg2Var, ah2.a);
                        if (list != null) {
                            str = (String) dv.y0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfoObtain.setContentDescription(str);
                    }
                    str2 = (String) r02.r(rg2Var, ah2.A);
                    if (str2 != null) {
                        wg2VarL4 = wg2Var2;
                        while (true) {
                            if (wg2VarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            rg2Var2 = wg2VarL4.d;
                            ch2Var5 = h7.T;
                            if (rg2Var2.h.c(ch2Var5)) {
                                zBooleanValue = ((Boolean) rg2Var2.b(ch2Var5)).booleanValue();
                                break;
                            }
                            wg2VarL4 = wg2VarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                        }
                    }
                    if (((j23) r02.r(rg2Var, ah2.h)) != null) {
                        accessibilityNodeInfo2.setHeading(true);
                    }
                    if (((j23) r02.r(rg2Var, ah2.i)) != null) {
                        accessibilityNodeInfoObtain.setTextEntryKey(true);
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = qi1Var2.d(wg2Var2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfoObtain.setDrawingOrder(iD3);
                        }
                    }
                    accessibilityNodeInfoObtain.setPassword(mj1Var3.c(ah2.N));
                    Object objR2 = r02.r(rg2Var, ah2.Q);
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfoObtain.setEditable(uz0.g(objR2, bool2));
                    num = (Integer) r02.r(rg2Var, ah2.R);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfoObtain.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfoObtain.setEnabled(s60.l(wg2Var2));
                    ch2Var2 = ah2.l;
                    accessibilityNodeInfoObtain.setFocusable(mj1Var3.c(ch2Var2));
                    if (accessibilityNodeInfoObtain.isFocusable()) {
                        accessibilityNodeInfoObtain.setFocused(((Boolean) rg2Var.b(ch2Var2)).booleanValue());
                        if (accessibilityNodeInfoObtain.isFocused()) {
                            accessibilityNodeInfo2.addAction(2);
                            a7Var2 = a7Var;
                            a7Var2.s = i7;
                        } else {
                            a7Var2 = a7Var;
                            z2 = true;
                            accessibilityNodeInfo2.addAction(1);
                        }
                        accessibilityNodeInfo2.setVisibleToUser(aa3.z(wg2Var2) ^ z2);
                        if (wg2Var2.o()) {
                            wg2VarL2 = wg2Var2.l();
                            wg2VarL2.getClass();
                        } else {
                            wg2VarL2 = wg2Var2;
                        }
                        if (wg2VarL2.n().f()) {
                            accessibilityNodeInfo2.setVisibleToUser(false);
                        }
                        lb1Var = (lb1) r02.r(rg2Var, ah2.k);
                        if (lb1Var != null) {
                            z5 = lb1Var.a;
                            if (z5) {
                                i18 = 1;
                            } else {
                                i18 = 1;
                            }
                            accessibilityNodeInfoObtain.setLiveRegion(i18);
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        m1Var = (m1) r02.r(rg2Var, qg2.b);
                        if (m1Var != null) {
                            boolean zG6 = uz0.g(r02.r(rg2Var, ah2.K), bool2);
                            if (ba2Var3 == null) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            accessibilityNodeInfo2.setClickable(z4);
                            if (s60.l(wg2Var2)) {
                                e2Var2 = e2Var;
                            } else {
                                e2Var2 = e2Var;
                            }
                        } else {
                            e2Var2 = e2Var;
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        m1Var2 = (m1) r02.r(rg2Var, qg2.c);
                        if (m1Var2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (s60.l(wg2Var2)) {
                                e2Var2.a(new z1(32, m1Var2.a));
                            }
                        }
                        m1Var3 = (m1) r02.r(rg2Var, qg2.q);
                        if (m1Var3 != null) {
                            e2Var2.a(new z1(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, m1Var3.a));
                        }
                        if (s60.l(wg2Var2)) {
                            m1Var9 = (m1) r02.r(rg2Var, qg2.k);
                            if (m1Var9 != null) {
                                e2Var2.a(new z1(2097152, m1Var9.a));
                            }
                            m1Var10 = (m1) r02.r(rg2Var, qg2.p);
                            if (m1Var10 != null) {
                                e2Var2.a(new z1(android.R.id.accessibilityActionImeEnter, m1Var10.a));
                            }
                            m1Var11 = (m1) r02.r(rg2Var, qg2.r);
                            if (m1Var11 != null) {
                                e2Var2.a(new z1(65536, m1Var11.a));
                            }
                            m1Var12 = (m1) r02.r(rg2Var, qg2.s);
                            if (m1Var12 != null) {
                                primaryClipDescription = ((ix0) t6Var2.getClipboardManager()).E().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    e2Var2.a(new z1(32768, m1Var12.a));
                                }
                            }
                        }
                        strO = a7.o(wg2Var2);
                        if (strO != null) {
                            accessibilityNodeInfoObtain.setTextSelection(a7Var2.m(wg2Var2), a7Var2.l(wg2Var2));
                            m1Var8 = (m1) r02.r(rg2Var, qg2.j);
                            if (m1Var8 != null) {
                                str4 = m1Var8.a;
                            } else {
                                str4 = null;
                            }
                            e2Var2.a(new z1(131072, str4));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            list3 = (List) r02.r(rg2Var, ah2.a);
                            if (list3 != null) {
                                l41VarU = l41Var2.u();
                                while (true) {
                                    if (l41VarU == null) {
                                        l41VarU = null;
                                        break;
                                    }
                                    rg2VarW2 = l41VarU.w();
                                    if (rg2VarW2 == null) {
                                    }
                                    l41VarU = l41VarU.u();
                                }
                                if (l41VarU == null) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                } else {
                                    rg2VarW = l41VarU.w();
                                    if (rg2VarW != null) {
                                        objG10 = rg2VarW.h.g(ah2.l);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        zG = uz0.g(objG10, Boolean.TRUE);
                                    } else {
                                        zG = false;
                                    }
                                    if (zG) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                l41VarU = l41Var2.u();
                                while (true) {
                                    if (l41VarU == null) {
                                        l41VarU = null;
                                        break;
                                    }
                                    rg2VarW2 = l41VarU.w();
                                    if (rg2VarW2 == null) {
                                    }
                                    l41VarU = l41VarU.u();
                                }
                                if (l41VarU == null) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                } else {
                                    rg2VarW = l41VarU.w();
                                    if (rg2VarW != null) {
                                        objG10 = rg2VarW.h.g(ah2.l);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        zG = uz0.g(objG10, Boolean.TRUE);
                                    } else {
                                        zG = false;
                                    }
                                    if (zG) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = e2Var2.e();
                        if (charSequenceE != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (mj1Var3.c(ah2.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (mj1Var3.c(ah2.S)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfoObtain.setAvailableExtraData(arrayList);
                        b42Var = (b42) r02.r(rg2Var, ah2.c);
                        if (b42Var != null) {
                            ch2Var4 = qg2.i;
                            if (mj1Var3.c(ch2Var4)) {
                                e2Var2.f("android.widget.SeekBar");
                            } else {
                                e2Var2.f("android.widget.ProgressBar");
                            }
                            if (b42Var != b42.b) {
                                accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), fValueOf.floatValue(), 0.0f));
                            }
                            if (mj1Var3.c(ch2Var4)) {
                                fFloatValue = fValueOf.floatValue();
                                fFloatValue2 = fValueOf.floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (0.0f < fFloatValue) {
                                    e2Var2.a(z1.e);
                                }
                                fFloatValue3 = fValueOf.floatValue();
                                fFloatValue4 = fValueOf.floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (0.0f > fFloatValue3) {
                                    e2Var2.a(z1.f);
                                }
                            }
                        }
                        if (s60.l(wg2Var2)) {
                            e2Var2.a(new z1(android.R.id.accessibilityActionSetProgress, m1Var7.a));
                        }
                        bvVar = (bv) r02.r(wg2Var2.k(), ah2.f);
                        if (bvVar != null) {
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bvVar.a, bvVar.b, false, 0));
                        } else {
                            arrayList2 = new ArrayList();
                            if (r02.r(wg2Var2.k(), ah2.e) != null) {
                                listM = wg2Var2.m();
                                size4 = listM.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    wg2Var3 = (wg2) listM.get(i8);
                                    if (wg2Var3.k().h.c(ah2.K)) {
                                        arrayList2.add(wg2Var3);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                if (dt.w(arrayList2)) {
                                    size3 = arrayList2.size();
                                    size2 = 1;
                                } else {
                                    size2 = arrayList2.size();
                                    size3 = 1;
                                }
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        objG2 = wg2Var2.k().h.g(ah2.g);
                        if (objG2 == null) {
                            objG2 = null;
                        }
                        if (objG2 == null) {
                            wg2VarL3 = wg2Var2.l();
                            if (wg2VarL3 != null) {
                                objG7 = wg2VarL3.k().h.g(ah2.e);
                                if (objG7 == null) {
                                    objG7 = null;
                                }
                                if (objG7 != null) {
                                    objG8 = wg2VarL3.k().h.g(ah2.f);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bvVar2 = (bv) objG8;
                                    if (bvVar2 != null) {
                                        if (wg2Var2.k().h.c(ah2.K)) {
                                            arrayList4 = new ArrayList();
                                            listJ2 = wg2.j(4, wg2VarL3);
                                            size6 = listJ2.size();
                                            i15 = 0;
                                            for (i14 = 0; i14 < size6; i14++) {
                                                wg2Var4 = (wg2) listJ2.get(i14);
                                                if (wg2Var4.k().h.c(ah2.K)) {
                                                    arrayList4.add(wg2Var4);
                                                    if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                        i15++;
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                zW = dt.w(arrayList4);
                                                if (zW) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = i15;
                                                }
                                                if (zW) {
                                                    i17 = i15;
                                                } else {
                                                    i17 = 0;
                                                }
                                                objG9 = wg2Var2.k().h.g(ah2.K);
                                                if (objG9 == null) {
                                                    objG9 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                            }
                                        }
                                    } else if (wg2Var2.k().h.c(ah2.K)) {
                                        arrayList4 = new ArrayList();
                                        listJ2 = wg2.j(4, wg2VarL3);
                                        size6 = listJ2.size();
                                        i15 = 0;
                                        while (i14 < size6) {
                                            wg2Var4 = (wg2) listJ2.get(i14);
                                            if (wg2Var4.k().h.c(ah2.K)) {
                                                arrayList4.add(wg2Var4);
                                                if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            zW = dt.w(arrayList4);
                                            if (zW) {
                                                i16 = 0;
                                            } else {
                                                i16 = i15;
                                            }
                                            if (zW) {
                                                i17 = i15;
                                            } else {
                                                i17 = 0;
                                            }
                                            objG9 = wg2Var2.k().h.g(ah2.K);
                                            if (objG9 == null) {
                                                objG9 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                        }
                                    }
                                }
                            }
                        } else {
                            li1.c();
                        }
                        md2Var = (md2) r02.r(rg2Var, ah2.v);
                        m1 m1Var15 = (m1) r02.r(rg2Var, qg2.d);
                        if (md2Var != null) {
                            objG5 = wg2Var2.k().h.g(ah2.f);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (objG5 == null) {
                                objG6 = wg2Var2.k().h.g(ah2.e);
                                if (objG6 == null) {
                                    objG6 = null;
                                }
                                if (objG6 == null) {
                                    e2Var2.f("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) md2Var.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (s60.l(wg2Var2)) {
                                zU = a7.u(md2Var);
                                u31Var = u31.i;
                                if (zU) {
                                    e2Var2.a(z1.e);
                                    if (l41Var.F == u31Var) {
                                        l41Var = l41Var2;
                                        z1Var2 = z1.h;
                                    } else {
                                        l41Var = l41Var2;
                                        z1Var2 = z1.j;
                                    }
                                    e2Var2.a(z1Var2);
                                } else {
                                    l41Var = l41Var2;
                                }
                                if (a7.t(md2Var)) {
                                    e2Var2.a(z1.f);
                                    if (l41Var.F == u31Var) {
                                        z1Var = z1.j;
                                    } else {
                                        z1Var = z1.h;
                                    }
                                    e2Var2.a(z1Var);
                                }
                            }
                        }
                        md2Var2 = (md2) r02.r(rg2Var, ah2.w);
                        if (md2Var2 != null) {
                            objG3 = wg2Var2.k().h.g(ah2.f);
                            if (objG3 == null) {
                                objG3 = null;
                            }
                            if (objG3 == null) {
                                objG4 = wg2Var2.k().h.g(ah2.e);
                                if (objG4 == null) {
                                    objG4 = null;
                                }
                                if (objG4 == null) {
                                    e2Var2.f("android.widget.ScrollView");
                                }
                            }
                            if (((Number) md2Var2.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (s60.l(wg2Var2)) {
                                if (a7.u(md2Var2)) {
                                    e2Var2.a(z1.e);
                                    e2Var2.a(z1.i);
                                }
                                if (a7.t(md2Var2)) {
                                    e2Var2.a(z1.f);
                                    e2Var2.a(z1.g);
                                }
                            }
                        }
                        h7.U(e2Var2, wg2Var2);
                        accessibilityNodeInfo2.setPaneTitle((CharSequence) r02.r(rg2Var, ah2.d));
                        if (s60.l(wg2Var2)) {
                            m1Var4 = (m1) r02.r(rg2Var, qg2.t);
                            if (m1Var4 != null) {
                                e2Var2.a(new z1(262144, m1Var4.a));
                            }
                            m1Var5 = (m1) r02.r(rg2Var, qg2.u);
                            if (m1Var5 != null) {
                                e2Var2.a(new z1(524288, m1Var5.a));
                            }
                            m1Var6 = (m1) r02.r(rg2Var, qg2.v);
                            if (m1Var6 != null) {
                                e2Var2.a(new z1(1048576, m1Var6.a));
                            }
                            ch2Var3 = qg2.x;
                            if (mj1Var3.c(ch2Var3)) {
                                list2 = (List) rg2Var.b(ch2Var3);
                                size5 = list2.size();
                                ri1Var = a7.U;
                                i9 = ri1Var.b;
                                if (size5 < i9) {
                                    li1.g(jp1.i(i9, "Can't have more than ", " custom actions for one widget"));
                                    return null;
                                }
                                dm2 dm2Var6 = new dm2(0);
                                bj1 bj1VarA3 = ip1.a();
                                dm2Var3 = dm2Var2;
                                if (dm2Var3.h) {
                                    aa3.o(dm2Var3);
                                }
                                if (s60.h(dm2Var3.k, i7, dm2Var3.i) >= 0) {
                                    bj1Var = (bj1) aa3.g(dm2Var3, i7);
                                    iArr = ri1Var.a;
                                    i10 = ri1Var.b;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i418 = iArr[i11];
                                        int i419 = i10;
                                        i13 = i12 + 1;
                                        int i4110 = i11;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i418;
                                        i11 = i4110 + 1;
                                        i12 = i13;
                                        i10 = i419;
                                    }
                                    arrayList3 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        wi0.t(list2.get(0));
                                        bj1Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList3.size() > 0) {
                                        wi0.t(arrayList3.get(0));
                                        if (i12 <= 0) {
                                            wg.i("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i4111 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    wi0.t(list2.get(0));
                                    ri1Var.c(0);
                                    throw null;
                                }
                                a7Var2.y.c(i7, dm2Var6);
                                dm2Var3.c(i7, bj1VarA3);
                            }
                        }
                        accessibilityNodeInfo2.setScreenReaderFocusable(s60.t(wg2Var2, resources6));
                        iD = a7Var2.I.d(i7);
                        if (iD != -1) {
                            pz1.u(t6Var2.getAndroidViewsHandler$ui(), iD);
                            t6Var = t6Var2;
                            accessibilityNodeInfo2.setTraversalBefore(t6Var, iD);
                            a7Var2.e(i7, e2Var2, a7Var2.K, null);
                        } else {
                            t6Var = t6Var2;
                        }
                        iD2 = a7Var2.J.d(i7);
                        if (iD2 != -1) {
                            pz1.u(t6Var.getAndroidViewsHandler$ui(), iD2);
                        }
                        str3 = (String) r02.r(rg2Var, h7.U);
                        if (str3 != null) {
                            e2Var2.f(str3);
                        }
                        e2Var3 = e2Var2;
                    } else {
                        a7Var2 = a7Var;
                    }
                    z2 = true;
                    accessibilityNodeInfo2.setVisibleToUser(aa3.z(wg2Var2) ^ z2);
                    if (wg2Var2.o()) {
                        wg2VarL2 = wg2Var2.l();
                        wg2VarL2.getClass();
                    } else {
                        wg2VarL2 = wg2Var2;
                    }
                    if (wg2VarL2.n().f()) {
                        accessibilityNodeInfo2.setVisibleToUser(false);
                    }
                    lb1Var = (lb1) r02.r(rg2Var, ah2.k);
                    if (lb1Var != null) {
                        z5 = lb1Var.a;
                        if (z5) {
                            i18 = 1;
                        } else {
                            i18 = 1;
                        }
                        accessibilityNodeInfoObtain.setLiveRegion(i18);
                    }
                    accessibilityNodeInfo2.setClickable(false);
                    m1Var = (m1) r02.r(rg2Var, qg2.b);
                    if (m1Var != null) {
                        boolean zG7 = uz0.g(r02.r(rg2Var, ah2.K), bool2);
                        if (ba2Var3 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo2.setClickable(z4);
                        if (s60.l(wg2Var2)) {
                            e2Var2 = e2Var;
                        } else {
                            e2Var2 = e2Var;
                        }
                    } else {
                        e2Var2 = e2Var;
                    }
                    accessibilityNodeInfo2.setLongClickable(false);
                    m1Var2 = (m1) r02.r(rg2Var, qg2.c);
                    if (m1Var2 != null) {
                        accessibilityNodeInfo2.setLongClickable(true);
                        if (s60.l(wg2Var2)) {
                            e2Var2.a(new z1(32, m1Var2.a));
                        }
                    }
                    m1Var3 = (m1) r02.r(rg2Var, qg2.q);
                    if (m1Var3 != null) {
                        e2Var2.a(new z1(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, m1Var3.a));
                    }
                    if (s60.l(wg2Var2)) {
                        m1Var9 = (m1) r02.r(rg2Var, qg2.k);
                        if (m1Var9 != null) {
                            e2Var2.a(new z1(2097152, m1Var9.a));
                        }
                        m1Var10 = (m1) r02.r(rg2Var, qg2.p);
                        if (m1Var10 != null) {
                            e2Var2.a(new z1(android.R.id.accessibilityActionImeEnter, m1Var10.a));
                        }
                        m1Var11 = (m1) r02.r(rg2Var, qg2.r);
                        if (m1Var11 != null) {
                            e2Var2.a(new z1(65536, m1Var11.a));
                        }
                        m1Var12 = (m1) r02.r(rg2Var, qg2.s);
                        if (m1Var12 != null) {
                            primaryClipDescription = ((ix0) t6Var2.getClipboardManager()).E().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                e2Var2.a(new z1(32768, m1Var12.a));
                            }
                        }
                    }
                    strO = a7.o(wg2Var2);
                    if (strO != null) {
                        accessibilityNodeInfoObtain.setTextSelection(a7Var2.m(wg2Var2), a7Var2.l(wg2Var2));
                        m1Var8 = (m1) r02.r(rg2Var, qg2.j);
                        if (m1Var8 != null) {
                            str4 = m1Var8.a;
                        } else {
                            str4 = null;
                        }
                        e2Var2.a(new z1(131072, str4));
                        accessibilityNodeInfo2.addAction(256);
                        accessibilityNodeInfo2.addAction(512);
                        accessibilityNodeInfo2.setMovementGranularities(11);
                        list3 = (List) r02.r(rg2Var, ah2.a);
                        if (list3 != null) {
                            l41VarU = l41Var2.u();
                            while (true) {
                                if (l41VarU == null) {
                                    l41VarU = null;
                                    break;
                                }
                                rg2VarW2 = l41VarU.w();
                                if (rg2VarW2 == null) {
                                }
                                l41VarU = l41VarU.u();
                            }
                            if (l41VarU == null) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                            } else {
                                rg2VarW = l41VarU.w();
                                if (rg2VarW != null) {
                                    objG10 = rg2VarW.h.g(ah2.l);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    zG = uz0.g(objG10, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            l41VarU = l41Var2.u();
                            while (true) {
                                if (l41VarU == null) {
                                    l41VarU = null;
                                    break;
                                }
                                rg2VarW2 = l41VarU.w();
                                if (rg2VarW2 == null) {
                                }
                                l41VarU = l41VarU.u();
                            }
                            if (l41VarU == null) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                            } else {
                                rg2VarW = l41VarU.w();
                                if (rg2VarW != null) {
                                    objG10 = rg2VarW.h.g(ah2.l);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    zG = uz0.g(objG10, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceE = e2Var2.e();
                    if (charSequenceE != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (mj1Var3.c(ah2.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (mj1Var3.c(ah2.S)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfoObtain.setAvailableExtraData(arrayList);
                    b42Var = (b42) r02.r(rg2Var, ah2.c);
                    if (b42Var != null) {
                        ch2Var4 = qg2.i;
                        if (mj1Var3.c(ch2Var4)) {
                            e2Var2.f("android.widget.SeekBar");
                        } else {
                            e2Var2.f("android.widget.ProgressBar");
                        }
                        if (b42Var != b42.b) {
                            accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), fValueOf.floatValue(), 0.0f));
                        }
                        if (mj1Var3.c(ch2Var4)) {
                            fFloatValue = fValueOf.floatValue();
                            fFloatValue2 = fValueOf.floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (0.0f < fFloatValue) {
                                e2Var2.a(z1.e);
                            }
                            fFloatValue3 = fValueOf.floatValue();
                            fFloatValue4 = fValueOf.floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (0.0f > fFloatValue3) {
                                e2Var2.a(z1.f);
                            }
                        }
                    }
                    if (s60.l(wg2Var2)) {
                        e2Var2.a(new z1(android.R.id.accessibilityActionSetProgress, m1Var7.a));
                    }
                    bvVar = (bv) r02.r(wg2Var2.k(), ah2.f);
                    if (bvVar != null) {
                        accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bvVar.a, bvVar.b, false, 0));
                    } else {
                        arrayList2 = new ArrayList();
                        if (r02.r(wg2Var2.k(), ah2.e) != null) {
                            listM = wg2Var2.m();
                            size4 = listM.size();
                            while (i8 < size4) {
                                wg2Var3 = (wg2) listM.get(i8);
                                if (wg2Var3.k().h.c(ah2.K)) {
                                    arrayList2.add(wg2Var3);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            if (dt.w(arrayList2)) {
                                size3 = arrayList2.size();
                                size2 = 1;
                            } else {
                                size2 = arrayList2.size();
                                size3 = 1;
                            }
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    objG2 = wg2Var2.k().h.g(ah2.g);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    if (objG2 == null) {
                        wg2VarL3 = wg2Var2.l();
                        if (wg2VarL3 != null) {
                            objG7 = wg2VarL3.k().h.g(ah2.e);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            if (objG7 != null) {
                                objG8 = wg2VarL3.k().h.g(ah2.f);
                                if (objG8 == null) {
                                    objG8 = null;
                                }
                                bvVar2 = (bv) objG8;
                                if (bvVar2 != null) {
                                    if (wg2Var2.k().h.c(ah2.K)) {
                                        arrayList4 = new ArrayList();
                                        listJ2 = wg2.j(4, wg2VarL3);
                                        size6 = listJ2.size();
                                        i15 = 0;
                                        while (i14 < size6) {
                                            wg2Var4 = (wg2) listJ2.get(i14);
                                            if (wg2Var4.k().h.c(ah2.K)) {
                                                arrayList4.add(wg2Var4);
                                                if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            zW = dt.w(arrayList4);
                                            if (zW) {
                                                i16 = 0;
                                            } else {
                                                i16 = i15;
                                            }
                                            if (zW) {
                                                i17 = i15;
                                            } else {
                                                i17 = 0;
                                            }
                                            objG9 = wg2Var2.k().h.g(ah2.K);
                                            if (objG9 == null) {
                                                objG9 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                        }
                                    }
                                } else if (wg2Var2.k().h.c(ah2.K)) {
                                    arrayList4 = new ArrayList();
                                    listJ2 = wg2.j(4, wg2VarL3);
                                    size6 = listJ2.size();
                                    i15 = 0;
                                    while (i14 < size6) {
                                        wg2Var4 = (wg2) listJ2.get(i14);
                                        if (wg2Var4.k().h.c(ah2.K)) {
                                            arrayList4.add(wg2Var4);
                                            if (wg2Var4.c.v() < wg2Var2.c.v()) {
                                                i15++;
                                            }
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        zW = dt.w(arrayList4);
                                        if (zW) {
                                            i16 = 0;
                                        } else {
                                            i16 = i15;
                                        }
                                        if (zW) {
                                            i17 = i15;
                                        } else {
                                            i17 = 0;
                                        }
                                        objG9 = wg2Var2.k().h.g(ah2.K);
                                        if (objG9 == null) {
                                            objG9 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i16, 1, i17, 1, false, ((Boolean) objG9).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        li1.c();
                    }
                    md2Var = (md2) r02.r(rg2Var, ah2.v);
                    m1 m1Var16 = (m1) r02.r(rg2Var, qg2.d);
                    if (md2Var != null) {
                        objG5 = wg2Var2.k().h.g(ah2.f);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (objG5 == null) {
                            objG6 = wg2Var2.k().h.g(ah2.e);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            if (objG6 == null) {
                                e2Var2.f("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) md2Var.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (s60.l(wg2Var2)) {
                            zU = a7.u(md2Var);
                            u31Var = u31.i;
                            if (zU) {
                                e2Var2.a(z1.e);
                                if (l41Var.F == u31Var) {
                                    l41Var = l41Var2;
                                    z1Var2 = z1.h;
                                } else {
                                    l41Var = l41Var2;
                                    z1Var2 = z1.j;
                                }
                                e2Var2.a(z1Var2);
                            } else {
                                l41Var = l41Var2;
                            }
                            if (a7.t(md2Var)) {
                                e2Var2.a(z1.f);
                                if (l41Var.F == u31Var) {
                                    z1Var = z1.j;
                                } else {
                                    z1Var = z1.h;
                                }
                                e2Var2.a(z1Var);
                            }
                        }
                    }
                    md2Var2 = (md2) r02.r(rg2Var, ah2.w);
                    if (md2Var2 != null) {
                        objG3 = wg2Var2.k().h.g(ah2.f);
                        if (objG3 == null) {
                            objG3 = null;
                        }
                        if (objG3 == null) {
                            objG4 = wg2Var2.k().h.g(ah2.e);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            if (objG4 == null) {
                                e2Var2.f("android.widget.ScrollView");
                            }
                        }
                        if (((Number) md2Var2.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (s60.l(wg2Var2)) {
                            if (a7.u(md2Var2)) {
                                e2Var2.a(z1.e);
                                e2Var2.a(z1.i);
                            }
                            if (a7.t(md2Var2)) {
                                e2Var2.a(z1.f);
                                e2Var2.a(z1.g);
                            }
                        }
                    }
                    h7.U(e2Var2, wg2Var2);
                    accessibilityNodeInfo2.setPaneTitle((CharSequence) r02.r(rg2Var, ah2.d));
                    if (s60.l(wg2Var2)) {
                        m1Var4 = (m1) r02.r(rg2Var, qg2.t);
                        if (m1Var4 != null) {
                            e2Var2.a(new z1(262144, m1Var4.a));
                        }
                        m1Var5 = (m1) r02.r(rg2Var, qg2.u);
                        if (m1Var5 != null) {
                            e2Var2.a(new z1(524288, m1Var5.a));
                        }
                        m1Var6 = (m1) r02.r(rg2Var, qg2.v);
                        if (m1Var6 != null) {
                            e2Var2.a(new z1(1048576, m1Var6.a));
                        }
                        ch2Var3 = qg2.x;
                        if (mj1Var3.c(ch2Var3)) {
                            list2 = (List) rg2Var.b(ch2Var3);
                            size5 = list2.size();
                            ri1Var = a7.U;
                            i9 = ri1Var.b;
                            if (size5 < i9) {
                                li1.g(jp1.i(i9, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            dm2 dm2Var7 = new dm2(0);
                            bj1 bj1VarA4 = ip1.a();
                            dm2Var3 = dm2Var2;
                            if (dm2Var3.h) {
                                aa3.o(dm2Var3);
                            }
                            if (s60.h(dm2Var3.k, i7, dm2Var3.i) >= 0) {
                                bj1Var = (bj1) aa3.g(dm2Var3, i7);
                                iArr = ri1Var.a;
                                i10 = ri1Var.b;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i4112 = iArr[i11];
                                    int i4113 = i10;
                                    i13 = i12 + 1;
                                    int i4114 = i11;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i4112;
                                    i11 = i4114 + 1;
                                    i12 = i13;
                                    i10 = i4113;
                                }
                                arrayList3 = new ArrayList();
                                if (list2.size() <= 0) {
                                    wi0.t(list2.get(0));
                                    bj1Var.getClass();
                                    throw null;
                                }
                                if (arrayList3.size() > 0) {
                                    wi0.t(arrayList3.get(0));
                                    if (i12 <= 0) {
                                        wg.i("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i4115 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                wi0.t(list2.get(0));
                                ri1Var.c(0);
                                throw null;
                            }
                            a7Var2.y.c(i7, dm2Var7);
                            dm2Var3.c(i7, bj1VarA4);
                        }
                    }
                    accessibilityNodeInfo2.setScreenReaderFocusable(s60.t(wg2Var2, resources6));
                    iD = a7Var2.I.d(i7);
                    if (iD != -1) {
                        pz1.u(t6Var2.getAndroidViewsHandler$ui(), iD);
                        t6Var = t6Var2;
                        accessibilityNodeInfo2.setTraversalBefore(t6Var, iD);
                        a7Var2.e(i7, e2Var2, a7Var2.K, null);
                    } else {
                        t6Var = t6Var2;
                    }
                    iD2 = a7Var2.J.d(i7);
                    if (iD2 != -1) {
                        pz1.u(t6Var.getAndroidViewsHandler$ui(), iD2);
                    }
                    str3 = (String) r02.r(rg2Var, h7.U);
                    if (str3 != null) {
                        e2Var2.f(str3);
                    }
                    e2Var3 = e2Var2;
                } else {
                    i7 = i;
                    a7Var2 = a7Var3;
                    e2Var3 = null;
                }
            }
        }
        if (a7Var2.v) {
            if (i7 == a7Var2.r) {
                a7Var2.t = e2Var3;
            }
            if (i7 == a7Var2.s) {
                a7Var2.u = e2Var3;
            }
        }
        return e2Var3;
    }
}
