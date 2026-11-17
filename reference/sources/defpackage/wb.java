package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wb extends m31 implements vp0 {
    public static final wb j;
    public static final wb k;
    public static final wb l;
    public static final wb m;
    public static final wb n;
    public static final wb o;
    public static final wb p;
    public static final wb q;
    public static final wb r;
    public static final wb s;
    public static final wb t;
    public final /* synthetic */ byte i;

    static {
        int i = 1;
        j = new wb(i, (byte) 0);
        k = new wb(i, (byte) 1);
        l = new wb(i, (byte) 2);
        m = new wb(i, (byte) 3);
        n = new wb(i, (byte) 4);
        o = new wb(i, (byte) 5);
        p = new wb(i, (byte) 6);
        q = new wb(i, (byte) 7);
        r = new wb(i, (byte) 8);
        s = new wb(i, (byte) 9);
        t = new wb(i, (byte) 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb(int i, byte b) {
        super(i);
        this.i = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        switch (this.i) {
            case 0:
                return obj;
            case 1:
                return null;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                long jA = kv.a(((kv) obj).a, uv.x);
                return new hd(kv.c(jA), kv.g(jA), kv.f(jA), kv.d(jA));
            case 4:
                long j2 = ((ez2) obj).a;
                return new fd(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 5:
                fd fdVar = (fd) obj;
                float f = fdVar.a;
                float f2 = fdVar.b;
                return new ez2((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            case 6:
                return uz0.y(0.0f, 0.0f, null, 7);
            case 7:
                long j3 = ((vy0) obj).a;
                return new ny0(0L);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                vy0 vy0Var = (vy0) obj;
                long j4 = vy0Var.a;
                return vy0Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return vg0.d;
            case 10:
                return j23.a;
            case 11:
                return new vy0((((long) 0) << 32) | (((long) ((int) (((vy0) obj).a & 4294967295L))) & 4294967295L));
            case 12:
                return new vy0((((long) ((int) (((vy0) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 13:
                return new vy0((((long) 0) << 32) | (((long) ((int) (((vy0) obj).a & 4294967295L))) & 4294967295L));
            default:
                return new vy0((((long) ((int) (((vy0) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
