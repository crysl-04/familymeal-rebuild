package defpackage;

import android.os.Bundle;
import android.view.WindowInsetsAnimation;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k42 implements ci1, hc2, rf2 {
    public final /* synthetic */ byte h;
    public Object i;
    public Object j;

    public k42(byte b) {
        this.h = b;
        switch (b) {
            case 6:
                break;
            case 7:
                this.i = new jy1((byte) 23);
                this.j = new hd1(16);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
            default:
                this.i = new LinkedHashMap();
                this.j = new LinkedHashMap();
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                this.i = new uj1(new Reference[16]);
                this.j = new ReferenceQueue();
                break;
        }
    }

    @Override // defpackage.hc2
    public final Object a(nb2 nb2Var, Object obj) {
        return ((zp0) this.i).f(nb2Var, obj);
    }

    @Override // defpackage.rf2
    public final int b(int i) {
        do {
            i = ((rf) this.j).l(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i)));
        return i;
    }

    public final Bundle c(String str) {
        Bundle bundle;
        cc2 cc2Var = (cc2) this.i;
        if (!cc2Var.g) {
            li1.g("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = cc2Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                r02.y(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            cc2Var.f = null;
        }
        return bundle;
    }

    public final bc2 d(String str) {
        bc2 bc2Var;
        cc2 cc2Var = (cc2) this.i;
        synchronized (cc2Var.c) {
            bc2Var = (bc2) cc2Var.d.g(str);
        }
        return bc2Var;
    }

    @Override // defpackage.rf2
    public final int e(int i) {
        do {
            i = ((rf) this.j).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    public final void f(Bundle bundle) {
        cc2 cc2Var = (cc2) this.i;
        dc2 dc2Var = cc2Var.a;
        if (!cc2Var.e) {
            cc2Var.a();
        }
        if (dc2Var.g().h.compareTo(x81.k) >= 0) {
            li1.f(dc2Var.g().h, "performRestore cannot be called when owner is ");
            return;
        }
        if (cc2Var.g) {
            li1.g("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                r02.y("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        cc2Var.f = bundle2;
        cc2Var.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[LOOP:0: B:10:0x002b->B:20:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[EDGE_INSN: B:32:0x0073->B:21:0x0073 BREAK  A[LOOP:0: B:10:0x002b->B:20:0x0070], SYNTHETIC] */
    public final void g(Bundle bundle) {
        cc2 cc2Var = (cc2) this.i;
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        Bundle bundle2 = cc2Var.f;
        if (bundle2 != null) {
            bundleL.putAll(bundle2);
        }
        synchronized (cc2Var.c) {
            mj1 mj1Var = cc2Var.d;
            Object[] objArr = mj1Var.b;
            Object[] objArr2 = mj1Var.c;
            long[] jArr = mj1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                String str = (String) objArr[i4];
                                Bundle bundleA = ((bc2) objArr2[i4]).a();
                                str.getClass();
                                bundleA.getClass();
                                bundleL.putBundle(str, bundleA);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (bundleL.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleL);
    }

    public final void h(String str, bc2 bc2Var) {
        cc2 cc2Var = (cc2) this.i;
        synchronized (cc2Var.c) {
            if (cc2Var.d.b(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            cc2Var.d.n(str, bc2Var);
        }
    }

    @Override // defpackage.rf2
    public final int i(int i) {
        CharSequence charSequence = (CharSequence) this.i;
        do {
            i = ((rf) this.j).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.ci1
    public final Comparable j(q22 q22Var) {
        j4 j4Var = (j4) this.j;
        ix0 ix0Var = j4Var.j;
        vc2 vc2VarK = (vc2) ix0Var.i;
        if (vc2VarK == null) {
            vc2VarK = ((fy1) ix0Var.j).h().k();
        }
        return (Comparable) ((vc2) ((vc2) vc2VarK.i0(j4Var.i.r0(q22Var))).i0(((g2) this.i).j(q22Var))).get();
    }

    @Override // defpackage.rf2
    public final int k(int i) {
        do {
            i = ((rf) this.j).l(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    public final void l() {
        if (!((cc2) this.i).h) {
            li1.g("Can not perform this action after onSaveInstanceState");
            return;
        }
        p72 p72Var = (p72) this.j;
        if (p72Var == null) {
            p72Var = new p72(this);
        }
        this.j = p72Var;
        try {
            o81.class.getDeclaredConstructor(null);
            p72 p72Var2 = (p72) this.j;
            if (p72Var2 != null) {
                p72Var2.a.add(o81.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + o81.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final String toString() {
        switch (this.h) {
            case 10:
                return "Bounds{lower=" + ((ox0) this.i) + " upper=" + ((ox0) this.j) + "}";
            default:
                return super.toString();
        }
    }

    public k42(cc2 cc2Var, byte b) {
        this.h = b;
        switch (b) {
            case 3:
                this.i = cc2Var;
                this.j = new k42(cc2Var, (byte) 2);
                break;
            default:
                this.i = cc2Var;
                break;
        }
    }

    public k42(j4 j4Var, g2 g2Var) {
        this.h = (byte) 0;
        this.j = j4Var;
        this.i = g2Var;
        if (((int) j4Var.i.B1()) == Math.toIntExact(((re1) g2Var.i).count())) {
            return;
        }
        wg.m("Must have the same arity!");
        throw null;
    }

    public /* synthetic */ k42(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    public k42(WindowInsetsAnimation.Bounds bounds) {
        this.h = (byte) 10;
        this.i = ox0.c(bounds.getLowerBound());
        this.j = ox0.c(bounds.getUpperBound());
    }
}
