package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv extends iv {
    public static int A0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                lt.h0();
                throw null;
            }
            if (uz0.g(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet B0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionR0 = iterable2 instanceof Collection ? (Collection) iterable2 : R0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionR0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void C0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vp0 vp0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            y02.f(sb, obj, vp0Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void D0(List list, StringBuilder sb, p pVar, int i) {
        if ((i & 64) != 0) {
            pVar = null;
        }
        C0(list, sb, "\n", "", "", "...", pVar);
    }

    public static String E0(Iterable iterable, String str, String str2, String str3, vp0 vp0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            vp0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        C0(iterable, sb, str4, str5, str6, "...", vp0Var);
        return sb.toString();
    }

    public static Object F0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        li1.m("List is empty.");
        return null;
    }

    public static Object G0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable H0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList I0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            iv.q0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList J0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List K0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return R0(iterable);
        }
        List listT0 = T0(iterable);
        Collections.reverse(listT0);
        return listT0;
    }

    public static List L0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listT0 = T0(iterable);
            if (((ArrayList) listT0).size() > 1) {
                Collections.sort(listT0);
            }
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List M0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listT0 = T0(iterable);
            hv.p0(listT0, comparator);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List N0(Iterable iterable, int i) {
        iterable.getClass();
        Object next = null;
        if (i < 0) {
            li1.e(jp1.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ag0.h;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return R0(iterable);
            }
            if (i == 1) {
                iterable.getClass();
                if (iterable instanceof List) {
                    next = x0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        li1.m("Collection is empty.");
                    }
                }
                return lt.P(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return lt.V(arrayList);
    }

    public static List O0(int i, List list) {
        if (i < 0) {
            li1.e(jp1.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ag0.h;
        }
        int size = list.size();
        if (i >= size) {
            return R0(list);
        }
        if (i == 1) {
            return lt.P(F0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void P0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Q0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List R0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return lt.V(T0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ag0.h;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return lt.P(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList S0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        P0(iterable, arrayList);
        return arrayList;
    }

    public static Set U0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return r02.C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(ee1.K(collection.size()));
                P0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            P0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : r02.C(linkedHashSet2.iterator().next());
            }
        }
        return gg0.h;
    }

    public static double u0(ArrayList arrayList) {
        int size = arrayList.size();
        double dDoubleValue = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dDoubleValue += ((Number) obj).doubleValue();
            i++;
            if (i < 0) {
                lt.g0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    public static boolean v0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return A0(iterable, obj) >= 0;
    }

    public static List w0(Iterable iterable) {
        LinkedHashSet linkedHashSet;
        iterable.getClass();
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            P0(iterable, linkedHashSet);
        }
        return R0(linkedHashSet);
    }

    public static Object x0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        li1.m("List is empty.");
        return null;
    }

    public static Object y0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object z0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
