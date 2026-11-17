package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mi2 {
    public static final ie0 a = new ie0(new n62((byte) 13), (byte) 1);

    public static final hi2 a(ji2 ji2Var, dr0 dr0Var) {
        li2 li2Var = (li2) dr0Var.j(a);
        switch (ji2Var.ordinal()) {
            case 0:
                return li2Var.h;
            case 1:
                return li2Var.e;
            case 2:
                return li2Var.g;
            case 3:
                return b(li2Var.e);
            case 4:
                return li2Var.a;
            case 5:
                return b(li2Var.a);
            case 6:
                return qa2.a;
            case 7:
                return li2Var.d;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                pa2 pa2Var = li2Var.d;
                dc0 dc0Var = ii2.i;
                return pa2.b(pa2Var, dc0Var, null, null, dc0Var, 6);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return li2Var.f;
            case 10:
                pa2 pa2Var2 = li2Var.d;
                dc0 dc0Var2 = ii2.i;
                return pa2.b(pa2Var2, null, dc0Var2, dc0Var2, null, 9);
            case 11:
                return b(li2Var.d);
            case 12:
                return li2Var.c;
            case 13:
                return t03.A;
            case 14:
                return li2Var.b;
            default:
                wg.n();
                return null;
        }
    }

    public static pa2 b(pa2 pa2Var) {
        dc0 dc0Var = ii2.i;
        return pa2.b(pa2Var, null, null, dc0Var, dc0Var, 3);
    }
}
