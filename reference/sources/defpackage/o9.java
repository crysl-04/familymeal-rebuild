package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.familymeal.app.data.db.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o9 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ o9(zo zoVar, long j) {
        this.h = (byte) 3;
        this.i = zoVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x021a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Cloneable, java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.kp0
    public final Object a() {
        int i;
        d93 d93Var;
        oz ozVar;
        byte b = this.h;
        Context context = null;
        j23 j23Var = j23.a;
        Object obj = this.i;
        switch (b) {
            case 0:
                vs.q(((r9) obj).j, null);
                return j23Var;
            case 1:
                dt.H((ga) obj);
                return j23Var;
            case 2:
                return ((gt2) obj).s0();
            case 3:
                return ((ap) ((zo) obj)).c;
            case 4:
                return j23Var;
            case 5:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new z(objArr);
            case 6:
                ?? r0 = {"application/json", "text/plain", "application/octet-stream"};
                t3 t3Var = ((rd1) obj).b0.a;
                if (t3Var != null) {
                    ex exVar = t3Var.b0;
                    ArrayList arrayList = exVar.d;
                    LinkedHashMap linkedHashMap = exVar.b;
                    String str = t3Var.c0;
                    Object obj2 = linkedHashMap.get(str);
                    t03 t03Var = t3Var.d0;
                    if (obj2 != null) {
                        int iIntValue = ((Number) obj2).intValue();
                        arrayList.add(str);
                        try {
                            exVar.b(iIntValue, t03Var, r0);
                        } catch (Exception e) {
                            arrayList.remove(str);
                            throw e;
                        }
                    } else {
                        li1.j("Attempting to launch an unregistered ActivityResultLauncher with contract ", t03Var, " and input ", r0, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    }
                    break;
                } else {
                    li1.g("Launcher has not been initialized");
                }
                return j23Var;
            case 7:
                ((qk) obj).v.getClass();
                throw new ClassCastException();
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return (r72) obj;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                View view = ((wy) obj).a;
                if (!vy0.a(0L, 0L)) {
                    return new l90(0L, tz0.c(view.getContext()).x(ou.G(0L)));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        j90 j90VarC = tz0.c(context2);
                        long jB = ou.b(configuration.screenWidthDp, configuration.screenHeightDp);
                        long jC0 = j90VarC.c0(jB);
                        return new l90((((long) ((int) Float.intBitsToFloat((int) (jC0 >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jC0 & 4294967295L)))) & 4294967295L), jB);
                    }
                    b93.a.getClass();
                    a93 a93Var = a93.a;
                    c93 c93Var = a93.b;
                    c93Var.getClass();
                    i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        d93Var = g90.i;
                    } else if (i >= 30) {
                        d93Var = co.i;
                    } else {
                        d93Var = vz1.A;
                    }
                    z83 z83VarH = d93Var.h(context, c93Var.b);
                    long jWidth = (((long) z83VarH.a().width()) << 32) | (((long) z83VarH.a().height()) & 4294967295L);
                    return new l90(jWidth, tz0.c(context).x(ou.G(jWidth)));
                }
                if (context != null) {
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    j90 j90VarC2 = tz0.c(context2);
                    long jB2 = ou.b(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    long jC1 = j90VarC2.c0(jB2);
                    return new l90((((long) ((int) Float.intBitsToFloat((int) (jC1 >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jC1 & 4294967295L)))) & 4294967295L), jB2);
                }
                b93.a.getClass();
                a93 a93Var2 = a93.a;
                c93 c93Var2 = a93.b;
                c93Var2.getClass();
                i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    d93Var = g90.i;
                } else if (i >= 30) {
                    d93Var = co.i;
                } else {
                    d93Var = vz1.A;
                }
                z83 z83VarH2 = d93Var.h(context, c93Var2.b);
                long jWidth2 = (((long) z83VarH2.a().width()) << 32) | (((long) z83VarH2.a().height()) & 4294967295L);
                return new l90(jWidth2, tz0.c(context).x(ou.G(jWidth2)));
            case 10:
                return ((p81) obj).d();
            case 11:
                return new bv2((ks1) obj, 0.0f);
            case 12:
                ((fl) obj).close();
                return j23Var;
            case 13:
                ((lm0) obj).L0();
                return j23Var;
            case 14:
                return Float.valueOf(cy1.v(((x20) obj).f()));
            case 15:
                Object systemService = ((View) ((eg) obj).i).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                Object systemService2 = ((View) ((ix0) obj).i).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case 17:
                AppDatabase_Impl appDatabase_Impl = ((f01) obj).a;
                return Boolean.valueOf(!appDatabase_Impl.i() || appDatabase_Impl.k());
            case 18:
                p41 p41Var = ((l41) obj).M;
                p41Var.p.G = true;
                gd1 gd1Var = p41Var.q;
                if (gd1Var != null) {
                    gd1Var.A = true;
                }
                return j23Var;
            case 19:
                r41 r41Var = (r41) obj;
                if (!((Boolean) r41Var.g.getValue()).booleanValue() && (ozVar = r41Var.c) != null) {
                    ozVar.l();
                }
                return j23Var;
            case 20:
                return Integer.valueOf(((t51) ((c61) obj).e.getValue()).m);
            case 21:
                return new BaseInputConnection(((q81) obj).a, false);
            case 22:
                sd1 sd1Var = (sd1) ((k91) obj).a.i;
                if (!sd1Var.i) {
                    if (sd1Var.j) {
                        x12.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    sd1Var.a();
                    sd1Var.j = true;
                }
                return j23Var;
            case 23:
                sg1 sg1Var = (sg1) obj;
                sg1Var.f = false;
                HashSet hashSet = new HashSet();
                fj1 fj1Var = sg1Var.d;
                if (fj1Var != null) {
                    Object[] objArr2 = fj1Var.a;
                    int i2 = fj1Var.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        l41 l41Var = (l41) objArr2[i3];
                        fj1 fj1Var2 = sg1Var.e;
                        if (fj1Var2 == null) {
                            fj1Var2 = new fj1();
                            sg1Var.e = fj1Var2;
                        }
                        h42 h42Var = (h42) fj1Var2.g(i3);
                        qg1 qg1Var = l41Var.L.f;
                        if (qg1Var.u) {
                            sg1.b(qg1Var, h42Var);
                        }
                    }
                    fj1Var.d();
                    fj1 fj1Var3 = sg1Var.e;
                    if (fj1Var3 != null) {
                        fj1Var3.d();
                    }
                }
                fj1 fj1Var4 = sg1Var.b;
                if (fj1Var4 != null) {
                    Object[] objArr3 = fj1Var4.a;
                    int i4 = fj1Var4.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        qk qkVar = (qk) objArr3[i5];
                        fj1 fj1Var5 = sg1Var.c;
                        if (fj1Var5 == null) {
                            fj1Var5 = new fj1();
                            sg1Var.c = fj1Var5;
                        }
                        h42 h42Var2 = (h42) fj1Var5.g(i5);
                        if (qkVar.u) {
                            sg1.b(qkVar, h42Var2);
                        }
                    }
                    fj1Var4.d();
                    fj1 fj1Var6 = sg1Var.c;
                    if (fj1Var6 != null) {
                        fj1Var6.d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((qk) it.next()).L0();
                }
                return j23Var;
            case 24:
                return new bl1((String) obj);
            case 25:
                return ys.q((Context) obj);
            case 26:
                return (x20) ((wk) obj).l;
            case 27:
                return ((bn1) obj).J0();
            case 28:
                return new iq1((kq1) obj);
            default:
                return new cc0(ls.R(24.0f, 16.0f, ((pu2) obj).a()));
        }
    }

    public /* synthetic */ o9(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }
}
