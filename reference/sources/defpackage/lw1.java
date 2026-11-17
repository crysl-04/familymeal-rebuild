package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lw1 extends mq2 implements vp0 {
    public int l;
    public ArrayList m;
    public ArrayList n;
    public Set o;
    public tw1 p;
    public byte q;
    public final /* synthetic */ tw1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw1(tw1 tw1Var, m10 m10Var) {
        super(1, m10Var);
        this.r = tw1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new lw1(this.r, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        int iIntValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objB;
        Object objP;
        Set set;
        ArrayList arrayList3;
        ArrayList arrayList4;
        tw1 tw1Var = this.r;
        AppDatabase appDatabase = tw1Var.a;
        byte b = this.q;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            iIntValue = ((Number) tw1Var.c.a()).intValue();
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            sx1 sx1VarO = appDatabase.o();
            this.m = arrayList;
            this.n = arrayList2;
            this.l = iIntValue;
            this.q = (byte) 1;
            objB = sx1VarO.b(this);
            if (objB != y20Var) {
            }
            return y20Var;
        }
        if (b == 1) {
            iIntValue = this.l;
            ArrayList arrayList5 = this.n;
            ArrayList arrayList6 = this.m;
            m02.y(obj);
            arrayList2 = arrayList5;
            arrayList = arrayList6;
            objB = obj;
        } else {
            if (b != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tw1Var = this.p;
            set = this.o;
            arrayList3 = this.n;
            ArrayList arrayList7 = this.m;
            m02.y(obj);
            arrayList = arrayList7;
            objP = obj;
        }
        arrayList4 = new ArrayList();
        for (Object obj2 : (Iterable) objP) {
            if (set.contains(((kd2) obj2).c)) {
                arrayList4.add(obj2);
            }
        }
        tw1Var.getClass();
        return new aw1(arrayList, tw1.f(arrayList4), arrayList3);
        Iterable iterable = (Iterable) objB;
        ArrayList arrayList8 = new ArrayList(ev.o0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList8.add(cu.j0((by1) it.next()));
        }
        int size = arrayList8.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList8.get(i);
            i++;
            dy1 dy1Var = (dy1) obj3;
            ps2 ps2VarA = rs2.a(dy1Var, iIntValue);
            String str = dy1Var.b;
            e40 e40Var = ps2VarA.a;
            if (e40Var == null) {
                arrayList2.add(str);
            } else {
                arrayList.add(new rx1(dy1Var.a, str, e40Var, dy1Var.k));
            }
        }
        ArrayList arrayList9 = new ArrayList(ev.o0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj4 = arrayList.get(i2);
            i2++;
            arrayList9.add(((rx1) obj4).a);
        }
        Set setU0 = dv.U0(arrayList9);
        fd2 fd2VarS = appDatabase.s();
        this.m = arrayList;
        this.n = arrayList2;
        this.o = setU0;
        this.p = tw1Var;
        this.l = iIntValue;
        this.q = (byte) 2;
        objP = cu.P(this, new jc2((byte) 14), fd2VarS.a, true, false);
        if (objP != y20Var) {
            set = setU0;
            arrayList3 = arrayList2;
            arrayList4 = new ArrayList();
            while (r0.hasNext()) {
                if (set.contains(((kd2) obj2).c)) {
                    arrayList4.add(obj2);
                }
            }
            tw1Var.getClass();
            return new aw1(arrayList, tw1.f(arrayList4), arrayList3);
        }
        return y20Var;
    }
}
