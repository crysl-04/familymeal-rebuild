package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof xs0) {
            return this.a == ((xs0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 16) {
            return "Confirm";
        }
        if (b == 6) {
            return "ContextClick";
        }
        if (b == 13) {
            return "GestureEnd";
        }
        if (b == 23) {
            return "GestureThresholdActivate";
        }
        if (b == 3) {
            return "KeyboardTap";
        }
        if (b == 0) {
            return "LongPress";
        }
        if (b == 17) {
            return "Reject";
        }
        if (b == 27) {
            return "SegmentFrequentTick";
        }
        if (b == 26) {
            return "SegmentTick";
        }
        if (b == 9) {
            return "TextHandleMove";
        }
        if (b == 22) {
            return "ToggleOff";
        }
        if (b == 21) {
            return "ToggleOn";
        }
        return b == 1 ? "VirtualKey" : "Invalid";
    }
}
