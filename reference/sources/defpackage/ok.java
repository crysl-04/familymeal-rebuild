package defpackage;

import android.content.Context;
import com.familymeal.app.data.db.AppDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ok {
    public final Context a;
    public final AppDatabase b;

    public ok(Context context, AppDatabase appDatabase) {
        appDatabase.getClass();
        this.a = context;
        this.b = appDatabase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, LocalDate localDate, n10 n10Var) {
        jk jkVar;
        fk fkVar;
        File file;
        File file2;
        if (n10Var instanceof jk) {
            jkVar = (jk) n10Var;
            int i = jkVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkVar.p = i - Integer.MIN_VALUE;
            } else {
                jkVar = new jk(this, n10Var);
            }
        } else {
            jkVar = new jk(this, n10Var);
        }
        Object objC = jkVar.n;
        int i2 = jkVar.p;
        if (i2 == 0) {
            m02.y(objC);
            Context context = this.a;
            File[] fileArrListFiles = new File(context.getCacheDir(), "backup").listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    file3.delete();
                }
            }
            File file4 = new File(context.getCacheDir(), "backup");
            file4.mkdirs();
            File file5 = new File(file4, "家庭食谱备份_" + localDate + ".json");
            fk fkVar2 = fk.a;
            jkVar.k = file5;
            jkVar.l = file5;
            jkVar.m = fkVar2;
            jkVar.p = 1;
            objC = ia2.C(this.b, new lk(this, z, null), jkVar);
            y20 y20Var = y20.h;
            if (objC == y20Var) {
                return y20Var;
            }
            fkVar = fkVar2;
            file = file5;
            file2 = file;
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fkVar = jkVar.m;
            file = jkVar.l;
            file2 = jkVar.k;
            m02.y(objC);
        }
        fkVar.getClass();
        String strB = fk.b((gk) objC);
        Charset charset = ws.a;
        file.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            dt.X(fileOutputStream, strB, charset);
            fileOutputStream.close();
            return file2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vs.s(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final eg b() {
        return new eg(new File(this.a.getNoBackupFilesDir(), "restore_undo.json"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(gk gkVar, n10 n10Var) throws Exception {
        kk kkVar;
        gk gkVar2;
        fk fkVar;
        String strB;
        FileOutputStream fileOutputStreamI;
        if (n10Var instanceof kk) {
            kkVar = (kk) n10Var;
            int i = kkVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkVar.o = i - Integer.MIN_VALUE;
            } else {
                kkVar = new kk(this, n10Var);
            }
        } else {
            kkVar = new kk(this, n10Var);
        }
        Object obj = kkVar.m;
        int i2 = kkVar.o;
        j23 j23Var = j23.a;
        AppDatabase appDatabase = this.b;
        y20 y20Var = y20.h;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            fkVar = kkVar.l;
                            gkVar2 = kkVar.k;
                            m02.y(obj);
                        } else {
                            if (i2 != 2) {
                                li1.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            m02.y(obj);
                        }
                    }
                    m02.y(obj);
                    fk fkVar2 = fk.a;
                    kkVar.k = gkVar;
                    kkVar.l = fkVar2;
                    kkVar.o = 1;
                    Object objC = ia2.C(appDatabase, new lk(this, true, null), kkVar);
                    if (objC != y20Var) {
                        gkVar2 = gkVar;
                        fkVar = fkVar2;
                        obj = objC;
                    }
                    fileOutputStreamI.getFD().sync();
                } catch (IOException unused) {
                }
                fileOutputStreamI.close();
            } catch (IOException unused2) {
            }
            byte[] bytes = strB.getBytes(ws.a);
            bytes.getClass();
            fileOutputStreamI.write(bytes);
            eg egVarB = b();
            eg.B((File) egVarB.j, (File) egVarB.i);
            kkVar.k = null;
            kkVar.l = null;
            kkVar.o = 2;
            Object objC2 = ia2.C(appDatabase, new ik(this, gkVar2, null), kkVar);
            if (objC2 != y20Var) {
                objC2 = j23Var;
            }
            return objC2 == y20Var ? y20Var : j23Var;
        } catch (Exception e) {
            File file = (File) b().j;
            try {
                fileOutputStreamI.getFD().sync();
            } catch (IOException unused3) {
            }
            try {
                fileOutputStreamI.close();
            } catch (IOException unused4) {
            }
            if (file.delete()) {
                throw e;
            }
            Objects.toString(file);
            throw e;
        }
        fkVar.getClass();
        strB = fk.b((gk) obj);
        fileOutputStreamI = b().I();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LocalDate localDate, n10 n10Var) {
        mk mkVar;
        if (n10Var instanceof mk) {
            mkVar = (mk) n10Var;
            int i = mkVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkVar.m = i - Integer.MIN_VALUE;
            } else {
                mkVar = new mk(this, n10Var);
            }
        } else {
            mkVar = new mk(this, n10Var);
        }
        Object obj = mkVar.k;
        int i2 = mkVar.m;
        j23 j23Var = j23.a;
        if (i2 == 0) {
            m02.y(obj);
            String str = new String(b().z(), ws.a);
            fk fkVar = fk.a;
            gk gkVarA = fk.a(str, localDate);
            mkVar.m = 1;
            Object objC = ia2.C(this.b, new ik(this, gkVarA, null), mkVar);
            y20 y20Var = y20.h;
            if (objC != y20Var) {
                objC = j23Var;
            }
            if (objC == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        eg egVarB = b();
        ((File) egVarB.i).delete();
        ((File) egVarB.j).delete();
        ((File) egVarB.k).delete();
        return j23Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(hk hkVar, n10 n10Var) {
        nk nkVar;
        if (n10Var instanceof nk) {
            nkVar = (nk) n10Var;
            int i = nkVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkVar.n = i - Integer.MIN_VALUE;
            } else {
                nkVar = new nk(this, n10Var);
            }
        } else {
            nkVar = new nk(this, n10Var);
        }
        Object objB = nkVar.l;
        int i2 = nkVar.n;
        if (i2 == 0) {
            m02.y(objB);
            sx1 sx1VarO = this.b.o();
            nkVar.k = hkVar;
            nkVar.n = 1;
            objB = sx1VarO.b(nkVar);
            y20 y20Var = y20.h;
            if (objB == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hkVar = nkVar.k;
            m02.y(objB);
        }
        Iterable iterable = (Iterable) objB;
        ArrayList arrayList = new ArrayList(ev.o0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((by1) it.next()).a);
        }
        Set setU0 = dv.U0(arrayList);
        List list = hkVar.a.e;
        int i3 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (setU0.contains(((dy1) it2.next()).a) && (i3 = i3 + 1) < 0) {
                    lt.g0();
                    throw null;
                }
            }
        }
        gk gkVar = hkVar.a;
        int i4 = hkVar.b;
        int i5 = hkVar.c;
        int i6 = hkVar.d;
        int i7 = hkVar.e;
        OffsetDateTime offsetDateTime = hkVar.f;
        boolean z = hkVar.g;
        offsetDateTime.getClass();
        return new hk(gkVar, i4, i5, i6, i7, offsetDateTime, z, i3);
    }
}
