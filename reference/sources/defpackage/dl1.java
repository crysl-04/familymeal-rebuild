package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dl1 {
    public static final /* synthetic */ int l = 0;
    public final String h;
    public final fe i;
    public gl1 j;
    public final dm2 k;

    public dl1(sm1 sm1Var) {
        LinkedHashMap linkedHashMap = tm1.b;
        this.h = vs.D(sm1Var.getClass());
        this.i = new fe(this);
        this.k = new dm2(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i.e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            li1.c();
            return null;
        }
        if (bundle != null) {
            bundleL.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                li1.c();
                return null;
            }
        }
        return bundleL;
    }

    public cl1 b(eg egVar) {
        boolean zB;
        b82 b82Var;
        eg egVarA;
        fe feVar = this.i;
        LinkedHashMap linkedHashMap = (LinkedHashMap) feVar.e;
        Uri uri = (Uri) egVar.i;
        ArrayList arrayList = (ArrayList) feVar.d;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        cl1 cl1Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bl1 bl1Var = (bl1) obj;
            bl1Var.getClass();
            yq2 yq2Var = bl1Var.d;
            if (((b82) yq2Var.getValue()) == null) {
                zB = true;
            } else if (uri == null) {
                zB = false;
            } else {
                b82 b82Var2 = (b82) yq2Var.getValue();
                b82Var2.getClass();
                zB = b82Var2.b(uri.toString());
            }
            if (zB) {
                Bundle bundleD = uri != null ? bl1Var.d(uri, linkedHashMap) : null;
                int iB = bl1Var.b(uri);
                String str = (String) egVar.j;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        if (uri != null && (b82Var = (b82) yq2Var.getValue()) != null && (egVarA = b82Var.a(uri.toString())) != null) {
                            bl1Var.e(egVarA, bundleL, linkedHashMap);
                            if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                                bl1Var.f(uri, bundleL, linkedHashMap);
                            }
                        }
                        if (cu.N(linkedHashMap, new zk1(bundleL, (byte) 1)).isEmpty()) {
                        }
                    }
                }
                cl1 cl1Var2 = new cl1((dl1) feVar.c, bundleD, bl1Var.l, iB, z);
                if (cl1Var == null || cl1Var2.compareTo(cl1Var) > 0) {
                    cl1Var = cl1Var2;
                }
            }
        }
        return cl1Var;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof dl1)) {
                fe feVar = this.i;
                ArrayList arrayList = (ArrayList) feVar.d;
                dl1 dl1Var = (dl1) obj;
                dm2 dm2Var = dl1Var.k;
                fe feVar2 = dl1Var.i;
                boolean zEquals = arrayList.equals((ArrayList) feVar2.d);
                dm2 dm2Var2 = this.k;
                if (dm2Var2.d() != dm2Var.d()) {
                    z = false;
                    break;
                }
                Iterator it = ((h00) ph2.G(new em2(dm2Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!uz0.g(aa3.g(dm2Var2, iIntValue), aa3.g(dm2Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) feVar.e;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) feVar2.e;
                if (linkedHashMap.size() != linkedHashMap2.size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap2.containsKey(entry.getKey()) || !uz0.g(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (feVar.b != feVar2.b || !uz0.g((String) feVar.f, (String) feVar2.f) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        fe feVar = this.i;
        int i = feVar.b * 31;
        String str = (String) feVar.f;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) feVar.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iHashCode = (((bl1) obj).a.hashCode() + (iHashCode * 31)) * 961;
        }
        dm2 dm2Var = this.k;
        dm2Var.getClass();
        if (dm2Var.d() > 0) {
            dm2Var.e(0).getClass();
            li1.c();
            return 0;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) feVar.e;
        for (String str2 : linkedHashMap.keySet()) {
            int iF = jp1.f(str2, iHashCode * 31, 31);
            Object obj2 = linkedHashMap.get(str2);
            iHashCode = iF + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        fe feVar = this.i;
        feVar.getClass();
        sb.append(Integer.toHexString(feVar.b));
        sb.append(")");
        String str = (String) feVar.f;
        if (str != null && !co2.X(str)) {
            sb.append(" route=");
            sb.append((String) feVar.f);
        }
        return sb.toString();
    }
}
