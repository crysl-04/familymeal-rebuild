package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 extends qg1 implements pz, c41 {
    public LinkedHashMap v;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iMax;
        float f = ((cc0) vs.z(this, kz0.c)).h;
        if (f < 0.0f) {
            f = 0.0f;
        }
        ny1 ny1VarE = ue1Var.e(j);
        boolean z = this.u && !Float.isNaN(f) && cc0.a(f, 0.0f) > 0;
        int iR = !Float.isNaN(f) ? bf1Var.R(f) : 0;
        int iMax2 = ny1VarE.h;
        if (z) {
            iMax2 = Math.max(iMax2, iR);
            iMax = Math.max(ny1VarE.i, iR);
        } else {
            iMax = ny1VarE.i;
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.v;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.v = linkedHashMap;
            }
            j43 j43Var = kz0.b;
            int iRound = Math.round((iR - ny1VarE.h) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(j43Var, Integer.valueOf(iRound));
            mt0 mt0Var = kz0.a;
            int iRound2 = Math.round((iR - ny1VarE.i) / 2.0f);
            linkedHashMap.put(mt0Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.v;
        if (map == null) {
            map = bg0.h;
        }
        return bf1Var.g0(iMax2, iMax, map, new ux0(iMax2, ny1VarE, iMax));
    }
}
