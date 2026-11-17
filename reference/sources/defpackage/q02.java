package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q02 {
    public final List a;
    public final ix0 b;
    public final int c;
    public final int d;
    public final int e;
    public byte f;

    /* JADX WARN: Code duplicated, block: B:47:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public q02(List list, ix0 ix0Var) {
        this.a = list;
        this.b = ix0Var;
        MotionEvent motionEventA = a();
        int i = 0;
        byte b = 0;
        this.c = motionEventA != null ? motionEventA.getClassification() : 0;
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int i2 = Build.VERSION.SDK_INT;
            Object[] objArr = i2 >= 34 && motionEventA4.getClassification() == 3;
            Object[] objArr2 = i2 >= 34 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (objArr == true) {
                                    b = 10;
                                } else if (objArr2 == true) {
                                    b = 7;
                                } else if (objArr2 != true) {
                                    b = 1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case 6:
                                if (objArr == true) {
                                    b = 12;
                                } else if (objArr2 == true) {
                                    b = 9;
                                } else if (objArr2 != true) {
                                    b = 2;
                                } else {
                                    b = 8;
                                }
                                break;
                            case 7:
                                if (objArr == true) {
                                    b = 11;
                                } else if (objArr2 != true) {
                                    b = 3;
                                } else {
                                    b = 8;
                                }
                                break;
                            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                                b = 6;
                                break;
                            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                                b = 4;
                                break;
                            case 10:
                                b = 5;
                                break;
                        }
                    } else if (objArr == true) {
                        b = 11;
                    } else if (objArr2 != true) {
                        b = 8;
                    } else {
                        b = 3;
                    }
                } else if (objArr == true) {
                    b = 12;
                } else if (!objArr2 == true || objArr2 == true) {
                    b = 2;
                } else {
                    b = 9;
                }
            } else if (objArr == true) {
                b = 10;
            } else if (!objArr2 == true || objArr2 == true) {
                b = 1;
            } else {
                b = 7;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    z02 z02Var = (z02) list.get(i);
                    if (r02.m(z02Var)) {
                        b = 2;
                    } else if (r02.k(z02Var)) {
                        b = 1;
                    } else {
                        i++;
                    }
                } else {
                    b = 3;
                }
            }
        }
        this.f = b;
    }

    public final MotionEvent a() {
        ix0 ix0Var = this.b;
        if (ix0Var != null) {
            return (MotionEvent) ((ix0) ix0Var.j).j;
        }
        return null;
    }
}
