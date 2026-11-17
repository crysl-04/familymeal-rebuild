package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class el1 {
    public final sm1 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public el1(sm1 sm1Var, String str) {
        this.a = sm1Var;
        this.b = str;
    }

    public dl1 a() {
        dl1 dl1VarB = b();
        dl1VarB.getClass();
        fe feVar = dl1VarB.i;
        Iterator it = this.c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                li1.c();
                return null;
            }
            str.getClass();
            throw null;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final bl1 bl1Var = (bl1) obj;
            bl1Var.getClass();
            feVar.getClass();
            final byte b2 = 1;
            ArrayList arrayListN = cu.N((LinkedHashMap) feVar.e, new vp0() { // from class: fl1
                @Override // defpackage.vp0
                public final Object h(Object obj2) {
                    boolean zContains;
                    byte b3 = b2;
                    bl1 bl1Var2 = bl1Var;
                    String str2 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str2.getClass();
                            zContains = bl1Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = bl1Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListN.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + bl1Var.a + " can't be used to open destination " + ((dl1) feVar.c) + ".\nFollowing required arguments are missing: " + arrayListN).toString());
            }
            ((ArrayList) feVar.d).add(bl1Var);
        }
        Iterator it2 = this.e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            li1.c();
            return null;
        }
        String str2 = this.b;
        if (str2 != null) {
            feVar.getClass();
            if (co2.X(str2)) {
                wg.m("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final bl1 bl1Var2 = new bl1(strConcat);
            ArrayList arrayListN2 = cu.N((LinkedHashMap) feVar.e, new vp0() { // from class: fl1
                @Override // defpackage.vp0
                public final Object h(Object obj2) {
                    boolean zContains;
                    byte b3 = b;
                    bl1 bl1Var3 = bl1Var2;
                    String str3 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str3.getClass();
                            zContains = bl1Var3.c().contains(str3);
                            break;
                        default:
                            str3.getClass();
                            zContains = bl1Var3.c().contains(str3);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListN2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((dl1) feVar.c) + ". Following required arguments are missing: " + arrayListN2).toString());
            }
            feVar.g = new yq2(new o9(strConcat, (byte) 24));
            feVar.b = strConcat.hashCode();
            feVar.f = str2;
        }
        return dl1VarB;
    }

    public dl1 b() {
        return this.a.a();
    }
}
