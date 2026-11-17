package com.familymeal.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.res.AssetManager;
import android.security.keystore.StrongBoxUnavailableException;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.familymeal.app.MealPlannerApp;
import com.familymeal.app.data.db.AppDatabase;
import defpackage.kp0;
import defpackage.ok;
import defpackage.tw1;
import defpackage.yq2;
import defpackage.yr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import javax.crypto.SecretKey;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class MealPlannerApp extends Application {
    public static final /* synthetic */ int n = 0;
    public final yq2 h;
    public final yq2 i;
    public final yq2 j;
    public final yq2 k;
    public final yq2 l;
    public final yq2 m;

    public MealPlannerApp() {
        final byte b = 0;
        this.h = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar2 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar2.j, (File) egVar2.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar3 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar3.j, (File) egVar3.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b2 = bgVar.a;
                                        byte b3 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b2));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b3));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b3))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b3)));
                                            }
                                            treeMap2.put(Integer.valueOf(b3), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
        final byte b2 = 1;
        this.i = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b2) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar3 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar3.j, (File) egVar3.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar4 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar4.j, (File) egVar4.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b3 = bgVar.a;
                                        byte b4 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b3))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b3));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b4));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b4))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b4)));
                                            }
                                            treeMap2.put(Integer.valueOf(b4), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
        final byte b3 = 2;
        this.j = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b3) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar4 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar4.j, (File) egVar4.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar5 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar5.j, (File) egVar5.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b4 = bgVar.a;
                                        byte b5 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b4))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b4));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b5));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b5))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b5)));
                                            }
                                            treeMap2.put(Integer.valueOf(b5), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
        final byte b4 = 3;
        this.k = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b4) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar5 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar5.j, (File) egVar5.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar6 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar6.j, (File) egVar6.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b5 = bgVar.a;
                                        byte b6 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b5))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b5));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b6));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b6))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b6)));
                                            }
                                            treeMap2.put(Integer.valueOf(b6), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
        final byte b5 = 4;
        this.l = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b5) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar6 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar6.j, (File) egVar6.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar7 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar7.j, (File) egVar7.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b6 = bgVar.a;
                                        byte b7 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b6))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b6));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b7));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b7))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b7)));
                                            }
                                            treeMap2.put(Integer.valueOf(b7), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
        final byte b6 = 5;
        this.m = new yq2(new kp0(this) { // from class: se1
            public final /* synthetic */ MealPlannerApp i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[Catch: all -> 0x04dd, TRY_LEAVE, TryCatch #10 {, blocks: (B:14:0x0073, B:16:0x0089, B:20:0x0091, B:22:0x009b, B:23:0x00b0, B:25:0x00b5, B:26:0x00b9, B:28:0x00c5, B:32:0x00d3, B:33:0x00e3, B:34:0x00ec, B:35:0x00f3, B:36:0x00f6, B:190:0x04c1, B:191:0x04c7, B:192:0x04ce, B:193:0x04d1, B:195:0x04d7, B:196:0x04da), top: B:221:0x0073, inners: #0, #8 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // defpackage.kp0
            public final Object a() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper;
                byte[] bArrC;
                FileOutputStream fileOutputStreamI;
                String name;
                ja2 ja2VarD;
                boolean zContainsKey;
                boolean z;
                switch (b6) {
                    case 0:
                        MealPlannerApp mealPlannerApp = this.i;
                        int i = MealPlannerApp.n;
                        return new i40(mealPlannerApp);
                    case 1:
                        MealPlannerApp mealPlannerApp2 = this.i;
                        int i2 = MealPlannerApp.n;
                        i40 i40Var = (i40) mealPlannerApp2.h.getValue();
                        synchronized (i40Var) {
                            eg egVar = i40Var.a;
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            supportSQLiteOpenHelper = null;
                            keyStore.load(null);
                            Key key = keyStore.getKey("meal_db_kek_v1", null);
                            SecretKey secretKeyA = key instanceof SecretKey ? (SecretKey) key : null;
                            if (secretKeyA == null) {
                                if (((File) egVar.i).exists()) {
                                    ((File) egVar.i).delete();
                                    ((File) egVar.j).delete();
                                    ((File) egVar.k).delete();
                                }
                                try {
                                    secretKeyA = i40.a(true);
                                } catch (StrongBoxUnavailableException unused) {
                                    secretKeyA = i40.a(false);
                                }
                                if (((File) i40Var.a.i).exists()) {
                                    bArrC = i40.c(secretKeyA, i40Var.a.z());
                                } else {
                                    bArrC = new byte[32];
                                    new SecureRandom().nextBytes(bArrC);
                                    fileOutputStreamI = i40Var.a.I();
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar7 = i40Var.a;
                                    fileOutputStreamI.getFD().sync();
                                    fileOutputStreamI.close();
                                    eg.B((File) egVar7.j, (File) egVar7.i);
                                }
                                break;
                            } else if (((File) i40Var.a.i).exists()) {
                                bArrC = i40.c(secretKeyA, i40Var.a.z());
                            } else {
                                bArrC = new byte[32];
                                new SecureRandom().nextBytes(bArrC);
                                fileOutputStreamI = i40Var.a.I();
                                try {
                                    fileOutputStreamI.write(i40.d(secretKeyA, bArrC));
                                    eg egVar8 = i40Var.a;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    eg.B((File) egVar8.j, (File) egVar8.i);
                                } catch (Exception e) {
                                    File file = (File) i40Var.a.j;
                                    try {
                                        fileOutputStreamI.getFD().sync();
                                        break;
                                    } catch (IOException unused4) {
                                    }
                                    try {
                                        fileOutputStreamI.close();
                                        break;
                                    } catch (IOException unused5) {
                                    }
                                    if (file.delete()) {
                                        throw e;
                                    }
                                    Objects.toString(file);
                                    throw e;
                                }
                            }
                            throw th;
                        }
                        System.loadLibrary("sqlcipher");
                        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(Arrays.copyOf(bArrC, bArrC.length));
                        Arrays.fill(bArrC, 0, bArrC.length, (byte) 0);
                        if (co2.X("family_meal.db")) {
                            wg.m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        vw0 vw0Var = new vw0((byte) 2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList3 = new ArrayList();
                        du duVarA = z72.a(AppDatabase.class);
                        ug ugVar = vg.e;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                    li1.e(jp1.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                                    return null;
                                }
                            }
                        }
                        boolean z2 = true;
                        Object systemService = mealPlannerApp2.getSystemService("activity");
                        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                        h40 h40Var = new h40(mealPlannerApp2, supportOpenHelperFactory, vw0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? fa2.h : fa2.i, ugVar, ugVar, linkedHashSet, arrayList2, arrayList3);
                        Class clsA = duVarA.a();
                        clsA.getClass();
                        Package r4 = clsA.getPackage();
                        if (r4 == null || (name = r4.getName()) == null) {
                            name = "";
                        }
                        String canonicalName = clsA.getCanonicalName();
                        canonicalName.getClass();
                        if (name.length() != 0) {
                            canonicalName = canonicalName.substring(name.length() + 1);
                        }
                        String strReplace = canonicalName.replace('.', '_');
                        strReplace.getClass();
                        String strConcat = strReplace.concat("_Impl");
                        try {
                            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                            cls.getClass();
                            ga2 ga2Var = (ga2) cls.getDeclaredConstructor(null).newInstance(null);
                            ga2Var.getClass();
                            ga2Var.j = true;
                            try {
                                ja2VarD = ga2Var.d();
                                ja2VarD.getClass();
                            } catch (mo1 unused6) {
                                ja2VarD = null;
                            }
                            if (ja2VarD == null) {
                                new ea2(h40Var, new z82(ga2Var), new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                                throw null;
                            }
                            ga2Var.e = new ea2(h40Var, ja2VarD, new om0(2, ga2Var, ia2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
                            ga2Var.f = ga2Var.c();
                            vw0 vw0Var2 = h40Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set setG = ga2Var.g();
                            List list = h40Var.j;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it2 = setG.iterator();
                            while (true) {
                                int i3 = -1;
                                if (!it2.hasNext()) {
                                    boolean z3 = z2;
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (size2 >= size || !zArr[size2]) {
                                                wg.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                                return null;
                                            }
                                            if (i4 >= 0) {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    for (bg bgVar : ga2Var.b(linkedHashMap)) {
                                        byte b7 = bgVar.a;
                                        byte b8 = bgVar.b;
                                        LinkedHashMap linkedHashMap2 = vw0Var2.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(b7))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b7));
                                            if (map == null) {
                                                map = bg0.h;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(b8));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (!zContainsKey) {
                                            Integer numValueOf = Integer.valueOf(bgVar.a);
                                            Object treeMap = linkedHashMap2.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap2.put(numValueOf, treeMap);
                                            }
                                            TreeMap treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(b8))) {
                                                Objects.toString(treeMap2.get(Integer.valueOf(b8)));
                                            }
                                            treeMap2.put(Integer.valueOf(b8), bgVar);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = ga2Var.h();
                                    List list2 = h40Var.i;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        du duVar = (du) entry.getKey();
                                        for (du duVar2 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i5 = size3 - 1;
                                                    if (duVar2.d(list2.get(size3))) {
                                                        zArr2[size3] = z3;
                                                    } else if (i5 >= 0) {
                                                        size3 = i5;
                                                    } else {
                                                        size3 = -1;
                                                    }
                                                }
                                            } else {
                                                size3 = -1;
                                            }
                                            if (size3 < 0) {
                                                li1.o("A required type converter (", duVar2.b(), ") for ", duVar.b(), " is missing in the database configuration.");
                                                return null;
                                            }
                                            Object obj = list2.get(size3);
                                            duVar2.getClass();
                                            obj.getClass();
                                            ga2Var.i.put(duVar2, obj);
                                        }
                                    }
                                    int size4 = list2.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            if (!zArr2[size4]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 >= 0) {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                    ga2Var.c = h40Var.f;
                                    ga2Var.d = new bz2(h40Var.g);
                                    Executor executor = ga2Var.c;
                                    if (executor == null) {
                                        uz0.A("internalQueryExecutor");
                                        throw null;
                                    }
                                    k10 k10VarB = vs.b(cu.Q(new vh0(executor), new up2(null)));
                                    ga2Var.a = k10VarB;
                                    o20 o20Var = k10VarB.h;
                                    bz2 bz2Var = ga2Var.d;
                                    if (bz2Var == null) {
                                        uz0.A("internalTransactionExecutor");
                                        throw null;
                                    }
                                    ga2Var.b = o20Var.i(new vh0(bz2Var));
                                    ea2 ea2Var = ga2Var.e;
                                    if (ea2Var == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA = ea2Var.M;
                                    if (supportSQLiteOpenHelperA != null) {
                                        while (!(supportSQLiteOpenHelperA instanceof s12)) {
                                            if (supportSQLiteOpenHelperA instanceof l80) {
                                                supportSQLiteOpenHelperA = ((l80) supportSQLiteOpenHelperA).a();
                                            } else {
                                                supportSQLiteOpenHelperA = null;
                                            }
                                        }
                                    } else {
                                        supportSQLiteOpenHelperA = null;
                                    }
                                    ea2 ea2Var2 = ga2Var.e;
                                    if (ea2Var2 == null) {
                                        uz0.A("connectionManager");
                                        throw null;
                                    }
                                    SupportSQLiteOpenHelper supportSQLiteOpenHelperA2 = ea2Var2.M;
                                    if (supportSQLiteOpenHelperA2 != null) {
                                        while (!(supportSQLiteOpenHelperA2 instanceof pi)) {
                                            if (supportSQLiteOpenHelperA2 instanceof l80) {
                                                supportSQLiteOpenHelperA2 = ((l80) supportSQLiteOpenHelperA2).a();
                                            }
                                        }
                                        supportSQLiteOpenHelper = supportSQLiteOpenHelperA2;
                                    }
                                    return (AppDatabase) ga2Var;
                                }
                                du duVar3 = (du) it2.next();
                                int size5 = list.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        z = z2;
                                        if (duVar3.d(list.get(size5))) {
                                            zArr[size5] = z;
                                            i3 = size5;
                                        } else if (i7 >= 0) {
                                            z2 = z;
                                            size5 = i7;
                                        }
                                    }
                                } else {
                                    z = z2;
                                }
                                if (i3 < 0) {
                                    li1.h("A required auto migration spec (", duVar3.b(), ") is missing in the database configuration.");
                                    return null;
                                }
                                linkedHashMap.put(duVar3, list.get(i3));
                                z2 = z;
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e4);
                        }
                        break;
                        break;
                    case 2:
                        MealPlannerApp mealPlannerApp3 = this.i;
                        int i8 = MealPlannerApp.n;
                        AppDatabase appDatabase = (AppDatabase) mealPlannerApp3.i.getValue();
                        AssetManager assets = mealPlannerApp3.getAssets();
                        assets.getClass();
                        return new yr(appDatabase, assets);
                    case 3:
                        MealPlannerApp mealPlannerApp4 = this.i;
                        int i9 = MealPlannerApp.n;
                        AppDatabase appDatabase2 = (AppDatabase) mealPlannerApp4.i.getValue();
                        AssetManager assets2 = mealPlannerApp4.getAssets();
                        assets2.getClass();
                        return new tw1(appDatabase2, assets2);
                    case 4:
                        MealPlannerApp mealPlannerApp5 = this.i;
                        int i10 = MealPlannerApp.n;
                        return new kz1((AppDatabase) mealPlannerApp5.i.getValue(), mealPlannerApp5.b(), mealPlannerApp5.c());
                    default:
                        MealPlannerApp mealPlannerApp6 = this.i;
                        int i11 = MealPlannerApp.n;
                        return new ok(mealPlannerApp6, (AppDatabase) mealPlannerApp6.i.getValue());
                }
            }
        });
    }

    public final ok a() {
        return (ok) this.m.getValue();
    }

    public final yr b() {
        return (yr) this.j.getValue();
    }

    public final tw1 c() {
        return (tw1) this.k.getValue();
    }
}
