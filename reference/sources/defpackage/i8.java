package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i8 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d12 d12Var, m10 m10Var) {
        byte b = this.a;
        byte b2 = 1;
        m10 m10Var2 = null;
        Object obj = this.b;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                Object objL = ou.l(d12Var, new h8((j8) obj, m10Var2, (byte) 0), m10Var);
                return objL == y20Var ? objL : j23Var;
            case 1:
                Object objJ0 = ((tq2) d12Var).J0(new tl((v10) obj, m10Var2, b2), m10Var);
                return objJ0 == y20Var ? objJ0 : j23Var;
            case 2:
                Object objL2 = ou.l(d12Var, new eg2((ro2) obj, null), m10Var);
                return objL2 == y20Var ? objL2 : j23Var;
            case 3:
                Object objL3 = ou.l(d12Var, new h8(new i(1, (kt2) obj, kt2.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 11), m10Var2, b2), m10Var);
                if (objL3 != y20Var) {
                    objL3 = j23Var;
                }
                return objL3 == y20Var ? objL3 : j23Var;
            case 4:
                kv2 kv2Var = (kv2) obj;
                tj2 tj2Var = kv2Var.z;
                iv2 iv2Var = kv2Var.y;
                tq2 tq2Var = (tq2) d12Var;
                tq2Var.getClass();
                v43 v43Var = cu.Y(tq2Var).G;
                u8 u8Var = new u8();
                u8Var.b = v43Var;
                Object objL4 = ou.l(d12Var, new eg2(u8Var, tj2Var, iv2Var, null), m10Var);
                if (objL4 != y20Var) {
                    objL4 = j23Var;
                }
                return objL4 == y20Var ? objL4 : j23Var;
            default:
                Object objX = vs.x(new fa0(d12Var, (zt2) obj, null), m10Var);
                if (objX != y20Var) {
                    objX = j23Var;
                }
                return objX == y20Var ? objX : j23Var;
        }
    }
}
