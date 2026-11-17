package defpackage;

import android.graphics.PathMeasure;
import java.time.Year;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jw0 implements kp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ jw0(byte b) {
        this.h = b;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return rz1.x(Boolean.FALSE);
            case 1:
                return rz1.x("");
            case 2:
            case 12:
                return null;
            case 3:
                return new cc0(48.0f);
            case 4:
            case 5:
                return j23Var;
            case 6:
                return g21.b;
            case 7:
                return y11.b;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return v11.b;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return c21.b;
            case 10:
                return g11.b;
            case 11:
                return new l41(3);
            case 13:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 14:
                ie0 ie0Var = qb1.a;
                return c5.X;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return fh1.a;
            case 17:
                return new fc2();
            case 18:
                vw0 vw0Var = new vw0((byte) 0);
                vw0Var.a(z72.a(ec2.class), new de1((byte) 2));
                return vw0Var.b();
            case 19:
                float f = hm1.a;
                return q70.a;
            case 20:
                k10 k10VarB = vs.b(xf0.h);
                vs.q(k10VarB, null);
                return k10VarB;
            case 21:
                po2 po2Var = po2.l;
                rh2[] rh2VarArr = new rh2[0];
                boolean z = false;
                if (co2.X("kotlin.Unit")) {
                    wg.m("Blank serial names are prohibited");
                } else {
                    if (po2Var == po2.i) {
                        z = true;
                    }
                    if (!z) {
                        eu euVar = new eu("kotlin.Unit");
                        return new th2("kotlin.Unit", po2Var, euVar.b.size(), gi.b0(rh2VarArr), euVar);
                    }
                    wg.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 22:
                return new bt1();
            case 23:
                return new m9(new PathMeasure());
            case 24:
                return Integer.valueOf(Year.now().getValue());
            case 25:
                return new lh(bo2.a);
            case 26:
                return rz1.x(Boolean.FALSE);
            case 27:
                return null;
            case 28:
                r70 r70Var = ya0.a;
                return j70.j;
            default:
                return null;
        }
    }

    public /* synthetic */ jw0(Object obj, byte b) {
        this.h = b;
    }
}
