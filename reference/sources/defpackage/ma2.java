package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends i41 {
    public static final ma2 c = new ma2("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma2(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                bg0 bg0Var = bg0.h;
                if (size == 0) {
                    return bf1Var.g0(k00.k(j), k00.j(j), bg0Var, new z82((byte) 4));
                }
                if (size == 1) {
                    ny1 ny1VarE = ((ue1) list.get(0)).e(j);
                    return bf1Var.g0(l00.g(ny1VarE.h, j), l00.f(ny1VarE.i, j), bg0Var, new m6(ny1VarE, (byte) 8));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    ny1 ny1VarE2 = ((ue1) list.get(i)).e(j);
                    iMax = Math.max(ny1VarE2.h, iMax);
                    iMax2 = Math.max(ny1VarE2.i, iMax2);
                    arrayList.add(ny1VarE2);
                }
                return bf1Var.g0(l00.g(iMax, j), l00.f(iMax2, j), bg0Var, new b8(arrayList, (byte) 1));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
