package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final tc1 e = new tc1();
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public up1 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j = this.a;
                    this.a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.f && source == this.g) {
                return;
            }
            this.f = toolType;
            this.g = source;
            this.c.clear();
            this.b.clear();
        }
    }

    public final ix0 c(MotionEvent motionEvent, t6 t6Var) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(d(t6Var, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.h = false;
                    this.i = false;
                    this.j = null;
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.j = new up1((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                this.j = new up1((((long) Float.floatToRawIntBits((motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f)) & 4294967295L));
            }
            arrayList.add(d(t6Var, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new ix0(arrayList, motionEvent, (byte) 29, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    public final b12 d(t6 t6Var, MotionEvent motionEvent, up1 up1Var, int i, boolean z) {
        long jValueAt;
        long jFloatToRawIntBits;
        long jF;
        int i2;
        char c;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j = this.a;
            this.a = 1 + j;
            sparseLongArray.put(pointerId, j);
            jValueAt = j;
        }
        float pressure = motionEvent.getPressure(i);
        char c2 = ' ';
        long j2 = 4294967295L;
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L);
        if (i == 0) {
            if (up1Var != null) {
                jFloatToRawIntBits = up1Var.a;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L);
            }
            jF = t6Var.F(jFloatToRawIntBits);
        } else {
            if (up1Var != null) {
                jFloatToRawIntBits = up1Var.a;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
            }
            jF = t6Var.F(jFloatToRawIntBits);
        }
        long j3 = jFloatToRawIntBits;
        long j4 = jF;
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            int i3 = 2;
            if (toolType == 1) {
                i2 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.h || this.i)) ? i3 : 1;
            } else if (toolType != 2) {
                if (toolType != 3) {
                    i3 = 4;
                    if (toolType != 4) {
                        i2 = 0;
                    }
                }
            } else {
                i2 = 3;
            }
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i4 = 0;
        while (true) {
            c = c2;
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i4 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i, i4);
            float historicalY = motionEvent.getHistoricalY(i, i4);
            long j5 = j2;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(historicalX)) << c) | (((long) Float.floatToRawIntBits(historicalY)) & j5);
                long historicalEventTime = motionEvent.getHistoricalEventTime(i4);
                float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i4);
                Float fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                if (motionEvent.getClassification() == 3) {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i4))) << c) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i4))) & j5);
                }
                arrayList.add(new ft0(historicalEventTime, jFloatToRawIntBits5, fFloatValue2, jFloatToRawIntBits2, jFloatToRawIntBits5));
            }
            i4++;
            c2 = c;
            j2 = j5;
        }
        long j6 = j2;
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j6);
        } else {
            jFloatToRawIntBits3 = 0;
        }
        if (motionEvent.getClassification() == 5) {
            float axisValue = motionEvent.getAxisValue(52, i);
            Float fValueOf2 = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        float f = fFloatValue;
        if (motionEvent.getClassification() == 3) {
            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j6);
        }
        return new b12(jValueAt, motionEvent.getEventTime(), j3, j4, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits3, f, jFloatToRawIntBits2, jFloatToRawIntBits4);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
