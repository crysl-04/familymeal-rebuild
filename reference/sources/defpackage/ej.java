package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ej implements vo0 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final yo0 q;
    public boolean r;
    public int s;

    public ej(yo0 yo0Var) {
        yo0Var.H();
        lo0 lo0Var = yo0Var.w;
        if (lo0Var != null) {
            lo0Var.m.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = yo0Var;
    }

    @Override // defpackage.vo0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (yo0.J(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(hp0 hp0Var) {
        this.a.add(hp0Var);
        hp0Var.d = this.b;
        hp0Var.e = this.c;
        hp0Var.f = this.d;
        hp0Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (yo0.J(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                hp0 hp0Var = (hp0) arrayList.get(i2);
                jo0 jo0Var = hp0Var.b;
                if (jo0Var != null) {
                    jo0Var.z += i;
                    if (yo0.J(2)) {
                        Objects.toString(hp0Var.b);
                        int i3 = hp0Var.b.z;
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            hp0 hp0Var = (hp0) arrayList.get(size);
            if (hp0Var.c) {
                if (hp0Var.a == 8) {
                    hp0Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = hp0Var.b.F;
                    hp0Var.a = 2;
                    hp0Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        hp0 hp0Var2 = (hp0) arrayList.get(i2);
                        if (hp0Var2.c && hp0Var2.b.F == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (this.r) {
            li1.g("commit already called");
            return 0;
        }
        if (yo0.J(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new dc1());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z3 = this.g;
        yo0 yo0Var = this.q;
        if (z3) {
            this.s = yo0Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z2) {
            yo0Var.y(this, z);
        }
        return this.s;
    }

    public final void f(int i, jo0 jo0Var, String str) {
        String str2 = jo0Var.S;
        if (str2 != null) {
            gp0.c(jo0Var, str2);
        }
        Class<?> cls = jo0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = jo0Var.G;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(jo0Var);
                String str4 = jo0Var.G;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            jo0Var.G = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + jo0Var + " with tag " + str + " to container view with no id");
            }
            int i2 = jo0Var.E;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(jo0Var);
                int i3 = jo0Var.E;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            jo0Var.E = i;
            jo0Var.F = i;
        }
        b(new hp0(1, jo0Var));
        jo0Var.A = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hp0 hp0Var = (hp0) arrayList.get(i);
            switch (hp0Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case DatabaseUtils.STATEMENT_DDL /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + hp0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(hp0Var.b);
            if (z) {
                if (hp0Var.d != 0 || hp0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(hp0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(hp0Var.e));
                }
                if (hp0Var.f != 0 || hp0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(hp0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(hp0Var.g));
                }
            }
        }
    }

    public final void h(jo0 jo0Var) {
        yo0 yo0Var = jo0Var.A;
        if (yo0Var == null || yo0Var == this.q) {
            b(new hp0(3, jo0Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + jo0Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
