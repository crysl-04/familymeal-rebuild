package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o61 implements Comparator {
    public final /* synthetic */ byte h;
    public final /* synthetic */ u8 i;

    public /* synthetic */ o61(u8 u8Var, byte b) {
        this.h = b;
        this.i = u8Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.h;
        u8 u8Var = this.i;
        switch (b) {
            case 0:
                return Integer.valueOf(u8Var.d(((w61) obj).getKey())).compareTo(Integer.valueOf(u8Var.d(((w61) obj2).getKey())));
            case 1:
                return Integer.valueOf(u8Var.d(((w61) obj).getKey())).compareTo(Integer.valueOf(u8Var.d(((w61) obj2).getKey())));
            case 2:
                return Integer.valueOf(u8Var.d(((w61) obj2).getKey())).compareTo(Integer.valueOf(u8Var.d(((w61) obj).getKey())));
            default:
                return Integer.valueOf(u8Var.d(((w61) obj2).getKey())).compareTo(Integer.valueOf(u8Var.d(((w61) obj).getKey())));
        }
    }
}
