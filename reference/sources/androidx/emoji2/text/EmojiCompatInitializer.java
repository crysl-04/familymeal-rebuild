package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.cn0;
import defpackage.e91;
import defpackage.eg;
import defpackage.h91;
import defpackage.if0;
import defpackage.jf0;
import defpackage.lf0;
import defpackage.tw0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements tw0 {
    @Override // defpackage.tw0
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.tw0
    public final Object b(Context context) {
        Object objE;
        cn0 cn0Var = new cn0(new lf0(context, (byte) 0));
        cn0Var.b = true;
        if (if0.k == null) {
            synchronized (if0.j) {
                if (if0.k == null) {
                    if0.k = new if0(cn0Var);
                }
            }
        }
        eg egVarN = eg.n(context);
        egVarN.getClass();
        synchronized (eg.m) {
            objE = ((HashMap) egVarN.i).get(ProcessLifecycleInitializer.class);
            if (objE == null) {
                objE = egVarN.e(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        h91 h91VarG = ((e91) objE).g();
        h91VarG.a(new jf0(this, h91VarG));
        return Boolean.TRUE;
    }
}
