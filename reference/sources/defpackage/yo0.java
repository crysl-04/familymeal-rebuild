package defpackage;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.familymeal.app.MainActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 {
    public final so0 A;
    public final yy B;
    public t3 C;
    public t3 D;
    public t3 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public ap0 O;
    public final q6 P;
    public boolean b;
    public ArrayList e;
    public kq1 g;
    public final qo0 j;
    public final ArrayList n;
    public final ix0 o;
    public final CopyOnWriteArrayList p;
    public final oo0 q;
    public final oo0 r;
    public final oo0 s;
    public final oo0 t;
    public final ro0 u;
    public int v;
    public lo0 w;
    public es x;
    public jo0 y;
    public jo0 z;
    public final ArrayList a = new ArrayList();
    public final wk c = new wk((byte) 4);
    public ArrayList d = new ArrayList();
    public final no0 f = new no0(this);
    public ej h = null;
    public boolean i = false;
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [oo0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [oo0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [oo0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [oo0] */
    public yo0() {
        final byte b = 0;
        this.j = new qo0(this, b);
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new ix0(this);
        this.p = new CopyOnWriteArrayList();
        this.q = new p00(this) { // from class: oo0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b2 = b;
                yo0 yo0Var = this.b;
                switch (b2) {
                    case 0:
                        if (yo0Var.L()) {
                            yo0Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (yo0Var.L() && num.intValue() == 80) {
                            yo0Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        bi1 bi1Var = (bi1) obj;
                        if (yo0Var.L()) {
                            boolean z = bi1Var.a;
                            yo0Var.o(false);
                        }
                        break;
                    default:
                        hy1 hy1Var = (hy1) obj;
                        if (yo0Var.L()) {
                            boolean z2 = hy1Var.a;
                            yo0Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.r = new p00(this) { // from class: oo0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b3 = b2;
                yo0 yo0Var = this.b;
                switch (b3) {
                    case 0:
                        if (yo0Var.L()) {
                            yo0Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (yo0Var.L() && num.intValue() == 80) {
                            yo0Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        bi1 bi1Var = (bi1) obj;
                        if (yo0Var.L()) {
                            boolean z = bi1Var.a;
                            yo0Var.o(false);
                        }
                        break;
                    default:
                        hy1 hy1Var = (hy1) obj;
                        if (yo0Var.L()) {
                            boolean z2 = hy1Var.a;
                            yo0Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.s = new p00(this) { // from class: oo0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b4 = b3;
                yo0 yo0Var = this.b;
                switch (b4) {
                    case 0:
                        if (yo0Var.L()) {
                            yo0Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (yo0Var.L() && num.intValue() == 80) {
                            yo0Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        bi1 bi1Var = (bi1) obj;
                        if (yo0Var.L()) {
                            boolean z = bi1Var.a;
                            yo0Var.o(false);
                        }
                        break;
                    default:
                        hy1 hy1Var = (hy1) obj;
                        if (yo0Var.L()) {
                            boolean z2 = hy1Var.a;
                            yo0Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.t = new p00(this) { // from class: oo0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b5 = b4;
                yo0 yo0Var = this.b;
                switch (b5) {
                    case 0:
                        if (yo0Var.L()) {
                            yo0Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (yo0Var.L() && num.intValue() == 80) {
                            yo0Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        bi1 bi1Var = (bi1) obj;
                        if (yo0Var.L()) {
                            boolean z = bi1Var.a;
                            yo0Var.o(false);
                        }
                        break;
                    default:
                        hy1 hy1Var = (hy1) obj;
                        if (yo0Var.L()) {
                            boolean z2 = hy1Var.a;
                            yo0Var.t(false);
                        }
                        break;
                }
            }
        };
        this.u = new ro0(this);
        this.v = -1;
        this.A = new so0(this);
        this.B = new yy((byte) 14);
        this.F = new ArrayDeque();
        this.P = new q6(this, (byte) 7);
    }

    public static HashSet F(ej ejVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < ejVar.a.size(); i++) {
            jo0 jo0Var = ((hp0) ejVar.a.get(i)).b;
            if (jo0Var != null && ejVar.g) {
                hashSet.add(jo0Var);
            }
        }
        return hashSet;
    }

    public static boolean J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean K(jo0 jo0Var) {
        ArrayList arrayListT = jo0Var.C.c.t();
        int size = arrayListT.size();
        boolean zK = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListT.get(i);
            i++;
            jo0 jo0Var2 = (jo0) obj;
            if (jo0Var2 != null) {
                zK = K(jo0Var2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(jo0 jo0Var) {
        if (jo0Var == null) {
            return true;
        }
        if (jo0Var.K) {
            return jo0Var.A == null || M(jo0Var.D);
        }
        return false;
    }

    public static boolean N(jo0 jo0Var) {
        if (jo0Var == null) {
            return true;
        }
        yo0 yo0Var = jo0Var.A;
        return jo0Var == yo0Var.z && N(yo0Var.y);
    }

    public final boolean A(boolean z) {
        boolean zA;
        ej ejVar;
        z(z);
        if (!this.i && (ejVar = this.h) != null) {
            ejVar.r = false;
            ejVar.d();
            if (J(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList = this.h.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jo0 jo0Var = ((hp0) obj).b;
                if (jo0Var != null) {
                    jo0Var.t = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        zA = false;
                        for (int i2 = 0; i2 < size2; i2++) {
                            zA |= ((vo0) this.a.get(i2)).a(arrayList2, arrayList3);
                        }
                        this.a.clear();
                        this.w.n.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.n.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                V(this.L, this.M);
                e();
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        ((HashMap) this.c.j).values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0215 A[PHI: r15
  0x0215: PHI (r15v21 char) = (r15v20 char), (r15v23 char) binds: [B:100:0x0202, B:104:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        String str;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        wk wkVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((ej) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(wkVar.v());
        jo0 jo0Var = this.z;
        int i5 = i;
        boolean z5 = false;
        while (i5 < i2) {
            ej ejVar = (ej) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (zBooleanValue) {
                z = z4;
                i3 = i5;
                z2 = z5;
                int i6 = 1;
                ArrayList arrayList6 = ejVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    hp0 hp0Var = (hp0) arrayList6.get(size);
                    int i7 = hp0Var.a;
                    if (i7 == i6) {
                        arrayList5.remove(hp0Var.b);
                    } else if (i7 != 3) {
                        switch (i7) {
                            case 6:
                                arrayList5.add(hp0Var.b);
                                break;
                            case 7:
                                arrayList5.remove(hp0Var.b);
                                break;
                            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                                jo0Var = null;
                                break;
                            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                                jo0Var = hp0Var.b;
                                break;
                            case 10:
                                hp0Var.i = hp0Var.h;
                                break;
                        }
                    } else {
                        arrayList5.add(hp0Var.b);
                    }
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = ejVar.a;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    hp0 hp0Var2 = (hp0) arrayList7.get(i8);
                    boolean z6 = z4;
                    int i9 = hp0Var2.a;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 == 1) {
                        z3 = z5;
                        arrayList5.add(hp0Var2.b);
                    } else if (i9 != 2) {
                        if (i9 == 3 || i9 == 6) {
                            z3 = z5;
                            arrayList5.remove(hp0Var2.b);
                            jo0 jo0Var2 = hp0Var2.b;
                            if (jo0Var2 == jo0Var) {
                                arrayList7.add(i8, new hp0(9, jo0Var2));
                                i8++;
                                jo0Var = null;
                            }
                        } else if (i9 == 7) {
                            i11 = 1;
                            z3 = z5;
                            arrayList5.add(hp0Var2.b);
                        } else if (i9 != 8) {
                            z3 = z5;
                        } else {
                            z3 = z5;
                            arrayList7.add(i8, new hp0(9, jo0Var, 0));
                            hp0Var2.c = true;
                            i8++;
                            jo0Var = hp0Var2.b;
                        }
                        i11 = 1;
                    } else {
                        z3 = z5;
                        jo0 jo0Var3 = hp0Var2.b;
                        int i12 = jo0Var3.F;
                        int size2 = arrayList5.size() - 1;
                        boolean z7 = false;
                        while (size2 >= 0) {
                            int i13 = size2;
                            jo0 jo0Var4 = (jo0) arrayList5.get(size2);
                            if (jo0Var4.F != i12) {
                                i12 = i12;
                            } else if (jo0Var4 == jo0Var3) {
                                i12 = i12;
                                z7 = true;
                            } else {
                                if (jo0Var4 == jo0Var) {
                                    arrayList7.add(i8, new hp0(9, jo0Var4, 0));
                                    i8++;
                                    i4 = 0;
                                    jo0Var = null;
                                } else {
                                    i4 = 0;
                                }
                                hp0 hp0Var3 = new hp0(3, jo0Var4, i4);
                                hp0Var3.d = hp0Var2.d;
                                hp0Var3.f = hp0Var2.f;
                                hp0Var3.e = hp0Var2.e;
                                hp0Var3.g = hp0Var2.g;
                                arrayList7.add(i8, hp0Var3);
                                arrayList5.remove(jo0Var4);
                                i8++;
                                jo0Var = jo0Var;
                            }
                            size2 = i13 - 1;
                            i12 = i12;
                        }
                        i11 = 1;
                        if (z7) {
                            arrayList7.remove(i8);
                            i8--;
                        } else {
                            hp0Var2.a = 1;
                            hp0Var2.c = true;
                            arrayList5.add(jo0Var3);
                        }
                    }
                    i8 += i11;
                    z4 = z6;
                    i5 = i10;
                    z5 = z3;
                }
                z = z4;
                i3 = i5;
                z2 = z5;
            }
            z5 = z2 || ejVar.g;
            i5 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((ej) arrayList.get(i14)).a;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    jo0 jo0Var5 = ((hp0) obj).b;
                    if (jo0Var5 != null && jo0Var5.A != null) {
                        wkVar.A(h(jo0Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            ej ejVar2 = (ej) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                ejVar2.c(-1);
                yo0 yo0Var = ejVar2.q;
                ArrayList arrayList9 = ejVar2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    hp0 hp0Var4 = (hp0) arrayList9.get(size4);
                    jo0 jo0Var6 = hp0Var4.b;
                    if (jo0Var6 != null) {
                        if (jo0Var6.P != null) {
                            jo0Var6.e().a = z10;
                        }
                        int i17 = ejVar2.f;
                        char c = 8194;
                        char c2 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                c = 4100;
                                if (i17 != 8197) {
                                    c2 = 4099;
                                    if (i17 != 4099) {
                                        c = i17 != 4100 ? (char) 0 : (char) 8197;
                                    } else {
                                        c = c2;
                                    }
                                }
                            } else {
                                c = c2;
                            }
                        }
                        if (jo0Var6.P != null || c != 0) {
                            jo0Var6.e();
                            jo0Var6.P.getClass();
                        }
                        jo0Var6.e();
                        jo0Var6.P.getClass();
                    }
                    switch (hp0Var4.a) {
                        case 1:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            z10 = true;
                            yo0Var.Z(jo0Var6, true);
                            yo0Var.U(jo0Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + hp0Var4.a);
                        case 3:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            yo0Var.a(jo0Var6);
                            z10 = true;
                            break;
                        case 4:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            if (J(2)) {
                                Objects.toString(jo0Var6);
                            }
                            if (jo0Var6.H) {
                                jo0Var6.H = false;
                                jo0Var6.Q = !jo0Var6.Q;
                            }
                            z10 = true;
                            break;
                        case 5:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            yo0Var.Z(jo0Var6, true);
                            if (J(2)) {
                                Objects.toString(jo0Var6);
                            }
                            if (!jo0Var6.H) {
                                jo0Var6.H = true;
                                jo0Var6.Q = !jo0Var6.Q;
                                yo0Var.c0(jo0Var6);
                            }
                            z10 = true;
                            break;
                        case 6:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            yo0Var.c(jo0Var6);
                            z10 = true;
                            break;
                        case 7:
                            jo0Var6.G(hp0Var4.d, hp0Var4.e, hp0Var4.f, hp0Var4.g);
                            yo0Var.Z(jo0Var6, true);
                            yo0Var.i(jo0Var6);
                            z10 = true;
                            break;
                        case DatabaseUtils.STATEMENT_DDL /* 8 */:
                            yo0Var.b0(null);
                            z10 = true;
                            break;
                        case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                            yo0Var.b0(jo0Var6);
                            z10 = true;
                            break;
                        case 10:
                            hp0Var4.i = jo0Var6.T;
                            yo0Var.a0(jo0Var6, hp0Var4.h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                ejVar2.c(1);
                yo0 yo0Var2 = ejVar2.q;
                ArrayList arrayList10 = ejVar2.a;
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    hp0 hp0Var5 = (hp0) arrayList10.get(i18);
                    jo0 jo0Var7 = hp0Var5.b;
                    if (jo0Var7 != null) {
                        if (jo0Var7.P != null) {
                            jo0Var7.e().a = false;
                        }
                        int i19 = ejVar2.f;
                        if (jo0Var7.P != null || i19 != 0) {
                            jo0Var7.e();
                            jo0Var7.P.getClass();
                        }
                        jo0Var7.e();
                        jo0Var7.P.getClass();
                    }
                    switch (hp0Var5.a) {
                        case 1:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            yo0Var2.Z(jo0Var7, false);
                            yo0Var2.a(jo0Var7);
                            i18++;
                            str2 = str;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + hp0Var5.a);
                        case 3:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            yo0Var2.U(jo0Var7);
                            i18++;
                            str2 = str;
                            break;
                        case 4:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            if (J(2)) {
                                Objects.toString(jo0Var7);
                            }
                            if (!jo0Var7.H) {
                                jo0Var7.H = true;
                                jo0Var7.Q = !jo0Var7.Q;
                                yo0Var2.c0(jo0Var7);
                            }
                            i18++;
                            str2 = str;
                            break;
                        case 5:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            yo0Var2.Z(jo0Var7, false);
                            if (J(2)) {
                                Objects.toString(jo0Var7);
                            }
                            if (jo0Var7.H) {
                                jo0Var7.H = false;
                                jo0Var7.Q = !jo0Var7.Q;
                            }
                            i18++;
                            str2 = str;
                            break;
                        case 6:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            yo0Var2.i(jo0Var7);
                            i18++;
                            str2 = str;
                            break;
                        case 7:
                            str = str2;
                            jo0Var7.G(hp0Var5.d, hp0Var5.e, hp0Var5.f, hp0Var5.g);
                            yo0Var2.Z(jo0Var7, false);
                            yo0Var2.c(jo0Var7);
                            i18++;
                            str2 = str;
                            break;
                        case DatabaseUtils.STATEMENT_DDL /* 8 */:
                            yo0Var2.b0(jo0Var7);
                            str = str2;
                            i18++;
                            str2 = str;
                            break;
                        case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                            yo0Var2.b0(null);
                            str = str2;
                            i18++;
                            str2 = str;
                            break;
                        case 10:
                            hp0Var5.h = jo0Var7.T;
                            yo0Var2.a0(jo0Var7, hp0Var5.i);
                            str = str2;
                            i18++;
                            str2 = str;
                            break;
                    }
                }
            }
            i16++;
            str2 = str2;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i20 = 0;
            while (i20 < size6) {
                Object obj2 = arrayList.get(i20);
                i20++;
                linkedHashSet.addAll(F((ej) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i21 = 0;
                while (i21 < size7) {
                    Object obj3 = arrayList3.get(i21);
                    i21++;
                    if (obj3 != null) {
                        li1.c();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i22 = 0;
                while (i22 < size8) {
                    Object obj4 = arrayList3.get(i22);
                    i22++;
                    if (obj4 != null) {
                        li1.c();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i23 = i; i23 < i2; i23++) {
            ej ejVar3 = (ej) arrayList.get(i23);
            if (zBooleanValue2) {
                for (int size9 = ejVar3.a.size() - 1; size9 >= 0; size9--) {
                    jo0 jo0Var8 = ((hp0) ejVar3.a.get(size9)).b;
                    if (jo0Var8 != null) {
                        h(jo0Var8).j();
                    }
                }
            } else {
                ArrayList arrayList11 = ejVar3.a;
                int size10 = arrayList11.size();
                int i24 = 0;
                while (i24 < size10) {
                    Object obj5 = arrayList11.get(i24);
                    i24++;
                    jo0 jo0Var9 = ((hp0) obj5).b;
                    if (jo0Var9 != null) {
                        h(jo0Var9).j();
                    }
                }
            }
        }
        P(this.v, true);
        int i25 = i;
        for (z70 z70Var : g(arrayList, i25, i2)) {
            z70Var.e = zBooleanValue2;
            synchronized (z70Var.b) {
                z70Var.d();
                ArrayList arrayList12 = z70Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    throw null;
                }
            }
            if (z70Var.a.isAttachedToWindow()) {
                synchronized (z70Var.b) {
                    ArrayList arrayList13 = new ArrayList(z70Var.c);
                    z70Var.c.clear();
                    int size11 = arrayList13.size();
                    int i26 = 0;
                    while (i26 < size11) {
                        Object obj6 = arrayList13.get(i26);
                        i26++;
                        wm2 wm2Var = (wm2) obj6;
                        if (!z70Var.b.isEmpty()) {
                            throw null;
                        }
                        wm2Var.getClass();
                    }
                    int size12 = arrayList13.size();
                    int i27 = 0;
                    while (i27 < size12) {
                        Object obj7 = arrayList13.get(i27);
                        i27++;
                        wm2 wm2Var2 = (wm2) obj7;
                        if (z70Var.d) {
                            if (J(2)) {
                                Objects.toString(wm2Var2);
                            }
                            wm2Var2.b();
                            throw null;
                        }
                        if (J(2)) {
                            Objects.toString(wm2Var2);
                        }
                        wm2Var2.a(z70Var.a);
                        z70Var.d = false;
                        z70Var.c.add(wm2Var2);
                    }
                    if (!z70Var.b.isEmpty()) {
                        z70Var.d();
                        ArrayList arrayList14 = new ArrayList(z70Var.b);
                        if (!arrayList14.isEmpty()) {
                            z70Var.b.clear();
                            z70Var.c.addAll(arrayList14);
                            z70Var.a(arrayList14, z70Var.e);
                            throw null;
                        }
                    }
                }
            } else {
                z70Var.b();
                z70Var.e = false;
            }
        }
        while (i25 < i2) {
            ej ejVar4 = (ej) arrayList.get(i25);
            if (((Boolean) arrayList2.get(i25)).booleanValue() && ejVar4.s >= 0) {
                ejVar4.s = -1;
            }
            if (ejVar4.p != null) {
                for (int i28 = 0; i28 < ejVar4.p.size(); i28++) {
                    ((Runnable) ejVar4.p.get(i28)).run();
                }
                ejVar4.p = null;
            }
            i25++;
        }
        if (!z9 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        li1.c();
    }

    public final jo0 C(int i) {
        wk wkVar = this.c;
        ArrayList arrayList = (ArrayList) wkVar.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jo0 jo0Var = (jo0) arrayList.get(size);
            if (jo0Var != null && jo0Var.E == i) {
                return jo0Var;
            }
        }
        for (ep0 ep0Var : ((HashMap) wkVar.j).values()) {
            if (ep0Var != null) {
                jo0 jo0Var2 = ep0Var.c;
                if (jo0Var2.E == i) {
                    return jo0Var2;
                }
            }
        }
        return null;
    }

    public final jo0 D(String str) {
        wk wkVar = this.c;
        ArrayList arrayList = (ArrayList) wkVar.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jo0 jo0Var = (jo0) arrayList.get(size);
            if (jo0Var != null && str.equals(jo0Var.G)) {
                return jo0Var;
            }
        }
        for (ep0 ep0Var : ((HashMap) wkVar.j).values()) {
            if (ep0Var != null) {
                jo0 jo0Var2 = ep0Var.c;
                if (str.equals(jo0Var2.G)) {
                    return jo0Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((z70) it.next()).getClass();
        }
    }

    public final ViewGroup G(jo0 jo0Var) {
        ViewGroup viewGroup = jo0Var.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (jo0Var.F <= 0 || !this.x.X()) {
            return null;
        }
        View viewW = this.x.W(jo0Var.F);
        if (viewW instanceof ViewGroup) {
            return (ViewGroup) viewW;
        }
        return null;
    }

    public final so0 H() {
        jo0 jo0Var = this.y;
        return jo0Var != null ? jo0Var.A.H() : this.A;
    }

    public final yy I() {
        jo0 jo0Var = this.y;
        return jo0Var != null ? jo0Var.A.I() : this.B;
    }

    public final boolean L() {
        jo0 jo0Var = this.y;
        if (jo0Var == null) {
            return true;
        }
        return jo0Var.p() && this.y.l().L();
    }

    public final boolean O() {
        return this.H || this.I;
    }

    public final void P(int i, boolean z) {
        lo0 lo0Var;
        if (this.w == null && i != -1) {
            li1.g("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            wk wkVar = this.c;
            HashMap map = (HashMap) wkVar.j;
            ArrayList arrayList = (ArrayList) wkVar.i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ep0 ep0Var = (ep0) map.get(((jo0) obj).l);
                if (ep0Var != null) {
                    ep0Var.j();
                }
            }
            for (ep0 ep0Var2 : map.values()) {
                if (ep0Var2 != null) {
                    ep0Var2.j();
                    jo0 jo0Var = ep0Var2.c;
                    if (jo0Var.s && !jo0Var.r()) {
                        wkVar.B(ep0Var2);
                    }
                }
            }
            d0();
            if (this.G && (lo0Var = this.w) != null && this.v == 7) {
                lo0Var.p.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (jo0 jo0Var : this.c.v()) {
                if (jo0Var != null) {
                    jo0Var.C.Q();
                }
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i, int i2) {
        A(false);
        z(true);
        jo0 jo0Var = this.z;
        if (jo0Var != null && i < 0 && jo0Var.i().R()) {
            return true;
        }
        boolean zT = T(this.L, this.M, i, i2);
        if (zT) {
            this.b = true;
            try {
                V(this.L, this.M);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        ((HashMap) this.c.j).values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i >= 0) {
                int size2 = this.d.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        size = size2;
                        break;
                    }
                    ej ejVar = (ej) this.d.get(size2);
                    if (i >= 0 && i == ejVar.s) {
                        if (!z) {
                            if (size2 == this.d.size() - 1) {
                                break;
                            }
                            size = size2 + 1;
                            break;
                        }
                        size = size2;
                        while (size > 0) {
                            ej ejVar2 = (ej) this.d.get(size - 1);
                            if (i < 0 || i != ejVar2.s) {
                                break;
                            }
                            size--;
                        }
                        break;
                    }
                    size2--;
                }
            } else {
                size = z ? 0 : this.d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((ej) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(jo0 jo0Var) {
        if (J(2)) {
            Objects.toString(jo0Var);
        }
        boolean zR = jo0Var.r();
        if (jo0Var.I && zR) {
            return;
        }
        wk wkVar = this.c;
        synchronized (((ArrayList) wkVar.i)) {
            ((ArrayList) wkVar.i).remove(jo0Var);
        }
        jo0Var.r = false;
        if (K(jo0Var)) {
            this.G = true;
        }
        jo0Var.s = true;
        c0(jo0Var);
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            li1.g("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((ej) arrayList.get(i)).o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ej) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void W(Bundle bundle) {
        ix0 ix0Var;
        int i;
        int i2;
        ep0 ep0Var;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.m.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.m.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        wk wkVar = this.c;
        HashMap map2 = (HashMap) wkVar.k;
        HashMap map3 = (HashMap) wkVar.j;
        map2.clear();
        map2.putAll(map);
        zo0 zo0Var = (zo0) bundle.getParcelable("state");
        if (zo0Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = zo0Var.h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            ix0Var = this.o;
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle bundleF = wkVar.F((String) obj, null);
            if (bundleF != null) {
                jo0 jo0Var = (jo0) this.O.b.get(((dp0) bundleF.getParcelable("state")).i);
                if (jo0Var != null) {
                    if (J(2)) {
                        jo0Var.toString();
                    }
                    ep0Var = new ep0(ix0Var, wkVar, jo0Var, bundleF);
                    bundle2 = bundleF;
                } else {
                    ep0Var = new ep0(this.o, this.c, this.w.m.getClassLoader(), H(), bundleF);
                    bundle2 = bundleF;
                }
                jo0 jo0Var2 = ep0Var.c;
                jo0Var2.i = bundle2;
                jo0Var2.A = this;
                if (J(2)) {
                    jo0Var2.toString();
                }
                ep0Var.l(this.w.m.getClassLoader());
                wkVar.A(ep0Var);
                ep0Var.e = this.v;
            }
        }
        ap0 ap0Var = this.O;
        ap0Var.getClass();
        ArrayList arrayList2 = new ArrayList(ap0Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            jo0 jo0Var3 = (jo0) obj2;
            if (map3.get(jo0Var3.l) == null) {
                if (J(2)) {
                    jo0Var3.toString();
                    Objects.toString(zo0Var.h);
                }
                this.O.f(jo0Var3);
                jo0Var3.A = this;
                ep0 ep0Var2 = new ep0(ix0Var, wkVar, jo0Var3);
                ep0Var2.e = 1;
                ep0Var2.j();
                jo0Var3.s = true;
                ep0Var2.j();
            }
        }
        ArrayList arrayList3 = zo0Var.i;
        ((ArrayList) wkVar.i).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                jo0 jo0VarM = wkVar.m(str3);
                if (jo0VarM == null) {
                    li1.g(wi0.h("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (J(2)) {
                        jo0VarM.toString();
                    }
                    wkVar.c(jo0VarM);
                }
            }
        }
        if (zo0Var.j != null) {
            this.d = new ArrayList(zo0Var.j.length);
            int i6 = 0;
            while (true) {
                fj[] fjVarArr = zo0Var.j;
                if (i6 >= fjVarArr.length) {
                    break;
                }
                fj fjVar = fjVarArr[i6];
                ArrayList arrayList4 = fjVar.i;
                ej ejVar = new ej(this);
                int[] iArr = fjVar.h;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    hp0 hp0Var = new hp0();
                    int i9 = i7 + 1;
                    hp0Var.a = iArr[i7];
                    if (J(i)) {
                        Objects.toString(ejVar);
                        int i10 = iArr[i9];
                    }
                    int i11 = i;
                    hp0Var.h = x81.values()[fjVar.j[i8]];
                    hp0Var.i = x81.values()[fjVar.k[i8]];
                    int i12 = i7 + 2;
                    hp0Var.c = iArr[i9] != 0;
                    int i13 = iArr[i12];
                    hp0Var.d = i13;
                    int i14 = iArr[i7 + 3];
                    hp0Var.e = i14;
                    int i15 = i7 + 5;
                    int i16 = iArr[i7 + 4];
                    hp0Var.f = i16;
                    i7 += 6;
                    int i17 = iArr[i15];
                    hp0Var.g = i17;
                    ejVar.b = i13;
                    ejVar.c = i14;
                    ejVar.d = i16;
                    ejVar.e = i17;
                    ejVar.b(hp0Var);
                    i8++;
                    i = i11;
                }
                int i18 = i;
                ejVar.f = fjVar.l;
                ejVar.h = fjVar.m;
                ejVar.g = true;
                ejVar.i = fjVar.o;
                ejVar.j = fjVar.p;
                ejVar.k = fjVar.q;
                ejVar.l = fjVar.r;
                ejVar.m = fjVar.s;
                ejVar.n = fjVar.t;
                ejVar.o = fjVar.u;
                ejVar.s = fjVar.n;
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    String str4 = (String) arrayList4.get(i19);
                    if (str4 != null) {
                        ((hp0) ejVar.a.get(i19)).b = wkVar.m(str4);
                    }
                }
                ejVar.c(1);
                if (J(i18)) {
                    ejVar.toString();
                    PrintWriter printWriter = new PrintWriter(new dc1());
                    ejVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(ejVar);
                i6++;
                i = i18;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(zo0Var.k);
        String str5 = zo0Var.l;
        if (str5 != null) {
            jo0 jo0VarM2 = wkVar.m(str5);
            this.z = jo0VarM2;
            s(jo0VarM2);
        }
        ArrayList arrayList5 = zo0Var.m;
        if (arrayList5 != null) {
            while (i2 < arrayList5.size()) {
                this.l.put((String) arrayList5.get(i2), (gj) zo0Var.n.get(i2));
                i2++;
            }
        }
        this.F = new ArrayDeque(zo0Var.o);
    }

    public final Bundle X() {
        int i;
        ArrayList arrayList;
        fj[] fjVarArr;
        int i2;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        byte b = 1;
        A(true);
        this.H = true;
        this.O.g = true;
        wk wkVar = this.c;
        wkVar.getClass();
        HashMap map = (HashMap) wkVar.j;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ep0 ep0Var = (ep0) it.next();
            if (ep0Var != null) {
                jo0 jo0Var = ep0Var.c;
                String str = jo0Var.l;
                Bundle bundle3 = new Bundle();
                jo0 jo0Var2 = ep0Var.c;
                if (jo0Var2.h == -1 && (bundle = jo0Var2.i) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new dp0(jo0Var2));
                if (jo0Var2.h > 0) {
                    Bundle bundle4 = new Bundle();
                    i2 = 2;
                    jo0Var2.a0.O("Fragment#onSaveInstanceState", new fo0(jo0Var2, bundle4, b));
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    ep0Var.a.A(jo0Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    jo0Var2.Z.g(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleX = jo0Var2.C.X();
                    if (!bundleX.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleX);
                    }
                    SparseArray<? extends Parcelable> sparseArray = jo0Var2.j;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = jo0Var2.k;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                } else {
                    i2 = 2;
                }
                Bundle bundle7 = jo0Var2.m;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                wkVar.F(str, bundle3);
                arrayList2.add(jo0Var.l);
                if (J(i2)) {
                    jo0Var.toString();
                    Objects.toString(jo0Var.i);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.k;
        if (!map2.isEmpty()) {
            wk wkVar2 = this.c;
            synchronized (((ArrayList) wkVar2.i)) {
                if (((ArrayList) wkVar2.i).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) wkVar2.i).size());
                    ArrayList arrayList3 = (ArrayList) wkVar2.i;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        jo0 jo0Var3 = (jo0) obj;
                        arrayList.add(jo0Var3.l);
                        if (J(2)) {
                            jo0Var3.toString();
                        }
                    }
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                fjVarArr = new fj[size2];
                for (i = 0; i < size2; i++) {
                    fjVarArr[i] = new fj((ej) this.d.get(i));
                    if (J(2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                fjVarArr = null;
            }
            zo0 zo0Var = new zo0();
            zo0Var.l = null;
            ArrayList arrayList4 = new ArrayList();
            zo0Var.m = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            zo0Var.n = arrayList5;
            zo0Var.h = arrayList2;
            zo0Var.i = arrayList;
            zo0Var.j = fjVarArr;
            zo0Var.k = this.k.get();
            jo0 jo0Var4 = this.z;
            if (jo0Var4 != null) {
                zo0Var.l = jo0Var4.l;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            zo0Var.o = new ArrayList(this.F);
            bundle2.putParcelable("state", zo0Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(jp1.j("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(jp1.j("fragment_", str3), (Bundle) map2.get(str3));
            }
        }
        return bundle2;
    }

    public final void Y() {
        synchronized (this.a) {
            if (this.a.size() == 1) {
                this.w.n.removeCallbacks(this.P);
                this.w.n.post(this.P);
                f0();
            }
        }
    }

    public final void Z(jo0 jo0Var, boolean z) {
        ViewGroup viewGroupG = G(jo0Var);
        if (viewGroupG == null || !(viewGroupG instanceof mo0)) {
            return;
        }
        ((mo0) viewGroupG).setDrawDisappearingViewsLast(!z);
    }

    public final ep0 a(jo0 jo0Var) {
        String str = jo0Var.S;
        if (str != null) {
            gp0.c(jo0Var, str);
        }
        if (J(2)) {
            jo0Var.toString();
        }
        ep0 ep0VarH = h(jo0Var);
        jo0Var.A = this;
        wk wkVar = this.c;
        wkVar.A(ep0VarH);
        if (!jo0Var.I) {
            wkVar.c(jo0Var);
            jo0Var.s = false;
            jo0Var.Q = false;
            if (K(jo0Var)) {
                this.G = true;
            }
        }
        return ep0VarH;
    }

    public final void a0(jo0 jo0Var, x81 x81Var) {
        if (jo0Var == this.c.m(jo0Var.l) && (jo0Var.B == null || jo0Var.A == this)) {
            jo0Var.T = x81Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + jo0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(lo0 lo0Var, es esVar, jo0 jo0Var) {
        ap0 ap0Var;
        if (this.w != null) {
            li1.g("Already attached");
            return;
        }
        this.w = lo0Var;
        this.x = esVar;
        this.y = jo0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (jo0Var != null) {
            copyOnWriteArrayList.add(new to0(jo0Var));
        } else if (lo0Var != null) {
            copyOnWriteArrayList.add(lo0Var);
        }
        if (this.y != null) {
            f0();
        }
        if (lo0Var != null) {
            kq1 kq1VarH = lo0Var.p.h();
            this.g = kq1VarH;
            kq1VarH.a(this.j, jo0Var != null ? jo0Var : lo0Var);
        }
        byte b = 0;
        if (jo0Var != null) {
            ap0 ap0Var2 = jo0Var.A.O;
            HashMap map = ap0Var2.c;
            ap0Var = (ap0) map.get(jo0Var.l);
            if (ap0Var == null) {
                ap0Var = new ap0(ap0Var2.e);
                map.put(jo0Var.l, ap0Var);
            }
            this.O = ap0Var;
        } else if (lo0Var != null) {
            g53 g53VarF = lo0Var.p.f();
            c30 c30Var = c30.b;
            c30Var.getClass();
            wk wkVar = new wk(g53VarF, ap0.h, c30Var);
            du duVarA = z72.a(ap0.class);
            String strB = duVarA.b();
            if (strB == null) {
                wg.m("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                ap0Var = (ap0) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                this.O = ap0Var;
            }
        } else {
            ap0Var = new ap0(false);
            this.O = ap0Var;
        }
        ap0Var.g = O();
        this.c.l = this.O;
        lo0 lo0Var2 = this.w;
        byte b2 = 1;
        if (lo0Var2 != null && jo0Var == null) {
            k42 k42VarB = lo0Var2.b();
            k42VarB.h("android:support:fragments", new lb0(this, b2));
            Bundle bundleC = k42VarB.c("android:support:fragments");
            if (bundleC != null) {
                W(bundleC);
            }
        }
        lo0 lo0Var3 = this.w;
        if (lo0Var3 != null) {
            ex exVar = lo0Var3.p.o;
            String strConcat = "FragmentManager:".concat(jo0Var != null ? wi0.i(new StringBuilder(), jo0Var.l, ":") : "");
            byte b3 = 2;
            this.C = exVar.c(strConcat.concat("StartActivityForResult"), new p3(b3), new po0(this, b2));
            this.D = exVar.c(strConcat.concat("StartIntentSenderForResult"), new p3((byte) 3), new po0(this, b3));
            this.E = exVar.c(strConcat.concat("RequestPermissions"), new p3(b2), new po0(this, b));
        }
        lo0 lo0Var4 = this.w;
        if (lo0Var4 != null) {
            MainActivity mainActivity = lo0Var4.p;
            oo0 oo0Var = this.q;
            oo0Var.getClass();
            mainActivity.p.add(oo0Var);
        }
        lo0 lo0Var5 = this.w;
        if (lo0Var5 != null) {
            MainActivity mainActivity2 = lo0Var5.p;
            oo0 oo0Var2 = this.r;
            oo0Var2.getClass();
            mainActivity2.q.add(oo0Var2);
        }
        lo0 lo0Var6 = this.w;
        if (lo0Var6 != null) {
            MainActivity mainActivity3 = lo0Var6.p;
            oo0 oo0Var3 = this.s;
            oo0Var3.getClass();
            mainActivity3.s.add(oo0Var3);
        }
        lo0 lo0Var7 = this.w;
        if (lo0Var7 != null) {
            MainActivity mainActivity4 = lo0Var7.p;
            oo0 oo0Var4 = this.t;
            oo0Var4.getClass();
            mainActivity4.t.add(oo0Var4);
        }
        lo0 lo0Var8 = this.w;
        if (lo0Var8 == null || jo0Var != null) {
            return;
        }
        MainActivity mainActivity5 = lo0Var8.p;
        ro0 ro0Var = this.u;
        ro0Var.getClass();
        eg egVar = mainActivity5.j;
        ((CopyOnWriteArrayList) egVar.k).add(ro0Var);
        ((vw) egVar.j).run();
    }

    public final void b0(jo0 jo0Var) {
        if (jo0Var != null) {
            if (jo0Var != this.c.m(jo0Var.l) || (jo0Var.B != null && jo0Var.A != this)) {
                throw new IllegalArgumentException("Fragment " + jo0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        jo0 jo0Var2 = this.z;
        this.z = jo0Var;
        s(jo0Var2);
        s(this.z);
    }

    public final void c(jo0 jo0Var) {
        if (J(2)) {
            Objects.toString(jo0Var);
        }
        if (jo0Var.I) {
            jo0Var.I = false;
            if (jo0Var.r) {
                return;
            }
            this.c.c(jo0Var);
            if (J(2)) {
                jo0Var.toString();
            }
            if (K(jo0Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(jo0 jo0Var) {
        ViewGroup viewGroupG = G(jo0Var);
        if (viewGroupG != null) {
            io0 io0Var = jo0Var.P;
            if ((io0Var == null ? 0 : io0Var.e) + (io0Var == null ? 0 : io0Var.d) + (io0Var == null ? 0 : io0Var.c) + (io0Var == null ? 0 : io0Var.b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, jo0Var);
                }
                jo0 jo0Var2 = (jo0) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                io0 io0Var2 = jo0Var.P;
                boolean z = io0Var2 != null ? io0Var2.a : false;
                if (jo0Var2.P != null) {
                    jo0Var2.e().a = z;
                }
            }
        }
    }

    public final void d() {
        if (J(3)) {
            Objects.toString(this.h);
        }
        ej ejVar = this.h;
        if (ejVar != null) {
            ejVar.r = false;
            ejVar.d();
            ej ejVar2 = this.h;
            t tVar = new t(this, (byte) 8);
            ArrayList arrayList = ejVar2.p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                ejVar2.p = arrayList;
            }
            arrayList.add(tVar);
            this.h.e(false, true);
            this.i = true;
            A(true);
            E();
            this.i = false;
            this.h = null;
        }
    }

    public final void d0() {
        ArrayList arrayListS = this.c.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            ep0 ep0Var = (ep0) obj;
            jo0 jo0Var = ep0Var.c;
            if (jo0Var.N) {
                if (this.b) {
                    this.K = true;
                } else {
                    jo0Var.N = false;
                    ep0Var.j();
                }
            }
        }
    }

    public final void e() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void e0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new dc1());
        lo0 lo0Var = this.w;
        try {
            if (lo0Var != null) {
                lo0Var.p.dump("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final HashSet f() {
        z70 z70Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayListS = this.c.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            ViewGroup viewGroup = ((ep0) obj).c.M;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof z70) {
                    z70Var = (z70) tag;
                } else {
                    z70Var = new z70(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, z70Var);
                }
                hashSet.add(z70Var);
            }
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                this.j.d(true);
                if (J(3)) {
                    toString();
                }
            } else {
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && N(this.y);
                if (J(3)) {
                    toString();
                }
                this.j.d(z);
            }
        }
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        z70 z70Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((ej) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                jo0 jo0Var = ((hp0) obj).b;
                if (jo0Var != null && (viewGroup = jo0Var.M) != null) {
                    I().getClass();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof z70) {
                        z70Var = (z70) tag;
                    } else {
                        z70Var = new z70(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, z70Var);
                    }
                    hashSet.add(z70Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final ep0 h(jo0 jo0Var) {
        String str = jo0Var.l;
        wk wkVar = this.c;
        ep0 ep0Var = (ep0) ((HashMap) wkVar.j).get(str);
        if (ep0Var != null) {
            return ep0Var;
        }
        ep0 ep0Var2 = new ep0(this.o, wkVar, jo0Var);
        ep0Var2.l(this.w.m.getClassLoader());
        ep0Var2.e = this.v;
        return ep0Var2;
    }

    public final void i(jo0 jo0Var) {
        if (J(2)) {
            Objects.toString(jo0Var);
        }
        if (jo0Var.I) {
            return;
        }
        jo0Var.I = true;
        if (jo0Var.r) {
            if (J(2)) {
                jo0Var.toString();
            }
            wk wkVar = this.c;
            synchronized (((ArrayList) wkVar.i)) {
                ((ArrayList) wkVar.i).remove(jo0Var);
            }
            jo0Var.r = false;
            if (K(jo0Var)) {
                this.G = true;
            }
            c0(jo0Var);
        }
    }

    public final void j(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null) {
                jo0Var.L = true;
                if (z) {
                    jo0Var.C.j(true);
                }
            }
        }
    }

    public final boolean k() {
        if (this.v >= 1) {
            for (jo0 jo0Var : this.c.v()) {
                if (jo0Var != null) {
                    if (!jo0Var.H ? jo0Var.C.k() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean l() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null && M(jo0Var)) {
                if (!jo0Var.H ? jo0Var.C.l() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(jo0Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                jo0 jo0Var2 = (jo0) this.e.get(i);
                if (arrayList == null || !arrayList.contains(jo0Var2)) {
                    jo0Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void m() {
        boolean zIsTerminated;
        this.J = true;
        A(true);
        x();
        lo0 lo0Var = this.w;
        wk wkVar = this.c;
        int i = 0;
        if (lo0Var != null ? ((ap0) wkVar.l).f : !lo0Var.m.isChangingConfigurations()) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((gj) it.next()).h;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((ap0) wkVar.l).e((String) obj, false);
                }
            }
        }
        v(-1);
        lo0 lo0Var2 = this.w;
        if (lo0Var2 != null) {
            MainActivity mainActivity = lo0Var2.p;
            oo0 oo0Var = this.r;
            oo0Var.getClass();
            mainActivity.q.remove(oo0Var);
        }
        lo0 lo0Var3 = this.w;
        if (lo0Var3 != null) {
            MainActivity mainActivity2 = lo0Var3.p;
            oo0 oo0Var2 = this.q;
            oo0Var2.getClass();
            mainActivity2.p.remove(oo0Var2);
        }
        lo0 lo0Var4 = this.w;
        if (lo0Var4 != null) {
            MainActivity mainActivity3 = lo0Var4.p;
            oo0 oo0Var3 = this.s;
            oo0Var3.getClass();
            mainActivity3.s.remove(oo0Var3);
        }
        lo0 lo0Var5 = this.w;
        if (lo0Var5 != null) {
            MainActivity mainActivity4 = lo0Var5.p;
            oo0 oo0Var4 = this.t;
            oo0Var4.getClass();
            mainActivity4.t.remove(oo0Var4);
        }
        lo0 lo0Var6 = this.w;
        if (lo0Var6 != null && this.y == null) {
            MainActivity mainActivity5 = lo0Var6.p;
            ro0 ro0Var = this.u;
            ro0Var.getClass();
            eg egVar = mainActivity5.j;
            ((CopyOnWriteArrayList) egVar.k).remove(ro0Var);
            if (((HashMap) egVar.i).remove(ro0Var) == null) {
                ((vw) egVar.j).run();
            } else {
                li1.c();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            qo0 qo0Var = this.j;
            ArrayList arrayList2 = qo0Var.a;
            CopyOnWriteArrayList copyOnWriteArrayList = qo0Var.c;
            Iterator it2 = copyOnWriteArrayList.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    if (!(autoCloseable instanceof TypedArray)) {
                        wg.f();
                        return;
                    }
                    ((TypedArray) autoCloseable).recycle();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((fq1) obj2).e();
            }
            arrayList2.clear();
            this.g = null;
        }
        t3 t3Var = this.C;
        if (t3Var != null) {
            t3Var.K();
            this.D.K();
            this.E.K();
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null) {
                jo0Var.L = true;
                if (z) {
                    jo0Var.C.n(true);
                }
            }
        }
    }

    public final void o(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null && z) {
                jo0Var.C.o(true);
            }
        }
    }

    public final void p() {
        ArrayList arrayListT = this.c.t();
        int size = arrayListT.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListT.get(i);
            i++;
            jo0 jo0Var = (jo0) obj;
            if (jo0Var != null) {
                jo0Var.q();
                jo0Var.C.p();
            }
        }
    }

    public final boolean q() {
        if (this.v >= 1) {
            for (jo0 jo0Var : this.c.v()) {
                if (jo0Var != null) {
                    if (!jo0Var.H ? jo0Var.C.q() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void r() {
        if (this.v >= 1) {
            for (jo0 jo0Var : this.c.v()) {
                if (jo0Var != null && !jo0Var.H) {
                    jo0Var.C.r();
                }
            }
        }
    }

    public final void s(jo0 jo0Var) {
        if (jo0Var != null) {
            if (jo0Var == this.c.m(jo0Var.l)) {
                jo0Var.A.getClass();
                boolean zN = N(jo0Var);
                Boolean bool = jo0Var.q;
                if (bool == null || bool.booleanValue() != zN) {
                    jo0Var.q = Boolean.valueOf(zN);
                    yo0 yo0Var = jo0Var.C;
                    yo0Var.f0();
                    yo0Var.s(yo0Var.z);
                }
            }
        }
    }

    public final void t(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null && z) {
                jo0Var.C.t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        jo0 jo0Var = this.y;
        if (jo0Var != null) {
            sb.append(jo0Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            lo0 lo0Var = this.w;
            if (lo0Var != null) {
                sb.append(lo0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (jo0 jo0Var : this.c.v()) {
            if (jo0Var != null && M(jo0Var)) {
                if (!jo0Var.H ? jo0Var.C.u() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (ep0 ep0Var : ((HashMap) this.c.j).values()) {
                if (ep0Var != null) {
                    ep0Var.e = i;
                }
            }
            P(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((z70) it.next()).b();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String str3 = str + "    ";
        wk wkVar = this.c;
        ArrayList arrayList = (ArrayList) wkVar.i;
        String str4 = str + "    ";
        HashMap map = (HashMap) wkVar.j;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ep0 ep0Var : map.values()) {
                printWriter.print(str);
                if (ep0Var != null) {
                    jo0 jo0Var = ep0Var.c;
                    printWriter.println(jo0Var);
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(jo0Var.E));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(jo0Var.F));
                    printWriter.print(" mTag=");
                    printWriter.println(jo0Var.G);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(jo0Var.h);
                    printWriter.print(" mWho=");
                    printWriter.print(jo0Var.l);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(jo0Var.z);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(jo0Var.r);
                    printWriter.print(" mRemoving=");
                    printWriter.print(jo0Var.s);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(jo0Var.u);
                    printWriter.print(" mInLayout=");
                    printWriter.println(jo0Var.v);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(jo0Var.H);
                    printWriter.print(" mDetached=");
                    printWriter.print(jo0Var.I);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(jo0Var.K);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(jo0Var.J);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(jo0Var.O);
                    if (jo0Var.A != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(jo0Var.A);
                    }
                    if (jo0Var.B != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(jo0Var.B);
                    }
                    if (jo0Var.D != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(jo0Var.D);
                    }
                    if (jo0Var.m != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(jo0Var.m);
                    }
                    if (jo0Var.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(jo0Var.i);
                    }
                    if (jo0Var.j != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(jo0Var.j);
                    }
                    if (jo0Var.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(jo0Var.k);
                    }
                    Object objM = jo0Var.n;
                    if (objM == null) {
                        yo0 yo0Var = jo0Var.A;
                        objM = (yo0Var == null || (str2 = jo0Var.o) == null) ? null : yo0Var.c.m(str2);
                    }
                    if (objM != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(jo0Var.p);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    io0 io0Var = jo0Var.P;
                    printWriter.println(io0Var == null ? false : io0Var.a);
                    io0 io0Var2 = jo0Var.P;
                    if ((io0Var2 == null ? 0 : io0Var2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        io0 io0Var3 = jo0Var.P;
                        printWriter.println(io0Var3 == null ? 0 : io0Var3.b);
                    }
                    io0 io0Var4 = jo0Var.P;
                    if ((io0Var4 == null ? 0 : io0Var4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        io0 io0Var5 = jo0Var.P;
                        printWriter.println(io0Var5 == null ? 0 : io0Var5.c);
                    }
                    io0 io0Var6 = jo0Var.P;
                    if ((io0Var6 == null ? 0 : io0Var6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        io0 io0Var7 = jo0Var.P;
                        printWriter.println(io0Var7 == null ? 0 : io0Var7.d);
                    }
                    io0 io0Var8 = jo0Var.P;
                    if ((io0Var8 == null ? 0 : io0Var8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        io0 io0Var9 = jo0Var.P;
                        printWriter.println(io0Var9 == null ? 0 : io0Var9.e);
                    }
                    if (jo0Var.M != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(jo0Var.M);
                    }
                    if (jo0Var.j() != null) {
                        g53 g53VarF = jo0Var.f();
                        g80 g80Var = mb1.c;
                        g53VarF.getClass();
                        c30 c30Var = c30.b;
                        c30Var.getClass();
                        wk wkVar2 = new wk(g53VarF, g80Var, c30Var);
                        du duVarA = z72.a(mb1.class);
                        String strB = duVarA.b();
                        if (strB == null) {
                            wg.m("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        dm2 dm2Var = ((mb1) wkVar2.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                        if (dm2Var.d() > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (dm2Var.d() > 0) {
                                if (dm2Var.e(0) != null) {
                                    li1.c();
                                    return;
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(dm2Var.b(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + jo0Var.C + ":");
                    jo0Var.C.w(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                jo0 jo0Var2 = (jo0) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(jo0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                jo0 jo0Var3 = (jo0) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(jo0Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                ej ejVar = (ej) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ejVar.toString());
                ejVar.g(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (vo0) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((z70) it.next()).b();
        }
    }

    public final void y(vo0 vo0Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    li1.g("FragmentManager has been destroyed");
                    return;
                } else {
                    li1.g("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (O()) {
                li1.g("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            if (this.w == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(vo0Var);
                Y();
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            li1.g("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                li1.g("FragmentManager has been destroyed");
                return;
            } else {
                li1.g("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.n.getLooper()) {
            li1.g("Must be called from main thread of fragment host");
            return;
        }
        if (!z && O()) {
            li1.g("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
