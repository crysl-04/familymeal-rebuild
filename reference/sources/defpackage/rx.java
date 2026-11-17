package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx implements bq0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ rx(byte b) {
        this.h = b;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((Integer) obj4).intValue();
                ((hc) obj).getClass();
                ((pk1) obj2).getClass();
                m63.h(0, (dr0) obj3);
                return j23Var;
            case 1:
                ((Integer) obj4).getClass();
                ((hc) obj).getClass();
                ((pk1) obj2).getClass();
                h7.F(null, (dr0) obj3, 0);
                return j23Var;
            case 2:
                ((Integer) obj4).getClass();
                return j23Var;
            default:
                return new d02((o20) obj, (Context) obj2, (zf2) obj3, (ub1) obj4);
        }
    }
}
