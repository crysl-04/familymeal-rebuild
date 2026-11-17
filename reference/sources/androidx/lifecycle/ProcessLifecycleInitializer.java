package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ag0;
import defpackage.eg;
import defpackage.li1;
import defpackage.n32;
import defpackage.o32;
import defpackage.tw0;
import defpackage.w81;
import defpackage.y81;
import defpackage.z81;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements tw0 {
    @Override // defpackage.tw0
    public final List a() {
        return ag0.h;
    }

    @Override // defpackage.tw0
    public final Object b(Context context) {
        context.getClass();
        eg egVarN = eg.n(context);
        egVarN.getClass();
        if (!((HashSet) egVarN.j).contains(ProcessLifecycleInitializer.class)) {
            li1.g("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!z81.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new y81());
        }
        o32 o32Var = o32.o;
        o32Var.getClass();
        o32Var.l = new Handler();
        o32Var.m.d(w81.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new n32(o32Var));
        return o32Var;
    }
}
