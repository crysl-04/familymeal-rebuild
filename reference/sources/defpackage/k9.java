package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k9 implements au1 {
    public final String h;
    public final xw2 i;
    public final List j;
    public final List k;
    public final sm0 l;
    public final e90 m;
    public final db n;
    public final CharSequence o;
    public final z31 p;
    public eg q;
    public final boolean r;
    public final byte s;
    public final int t;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public k9(java.lang.String r39, defpackage.xw2 r40, java.util.List r41, java.util.List r42, defpackage.sm0 r43, defpackage.e90 r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9.<init>(java.lang.String, xw2, java.util.List, java.util.List, sm0, e90, boolean):void");
    }

    public final boolean a() {
        eg egVar = this.q;
        if (egVar != null ? egVar.t() : false) {
            return true;
        }
        if (!this.r && dt.C(this.i)) {
            g2 g2Var = mf0.a;
            g2 g2Var2 = mf0.a;
            kn2 kn2VarF = (kn2) g2Var2.i;
            if (kn2VarF == null) {
                if (if0.d()) {
                    kn2VarF = g2Var2.F();
                    g2Var2.i = kn2VarF;
                } else {
                    kn2VarF = s60.v;
                }
            }
            if (((Boolean) kn2VarF.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float b() {
        z31 z31Var = this.p;
        float f = z31Var.e;
        TextPaint textPaint = z31Var.b;
        if (!Float.isNaN(f)) {
            return z31Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = z31Var.a;
        lineInstance.setText(new ts(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, tz0.Y);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new qy0(i, next, 1));
            } else {
                qy0 qy0Var = (qy0) priorityQueue.peek();
                if (qy0Var != null && qy0Var.i - qy0Var.h < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new qy0(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                wg.p();
                return 0.0f;
            }
            qy0 qy0Var2 = (qy0) it.next();
            desiredWidth = Layout.getDesiredWidth(z31Var.b(), qy0Var2.h, qy0Var2.i, textPaint);
            while (it.hasNext()) {
                qy0 qy0Var3 = (qy0) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(z31Var.b(), qy0Var3.h, qy0Var3.i, textPaint));
            }
        }
        z31Var.e = desiredWidth;
        return desiredWidth;
    }
}
