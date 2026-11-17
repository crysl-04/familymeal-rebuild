package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u00 {
    public final qo a;
    public final rq b;

    public u00(qo qoVar, rq rqVar) {
        this.a = qoVar;
        this.b = rqVar;
    }

    public final String toString() {
        rq rqVar = this.b;
        String str = ((t20) rqVar.l.m(t20.i)) != null ? "Room Invalidation Tracker Refresh" : null;
        int iHashCode = hashCode();
        vs.r(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? wi0.h("[", str, "](") : "(") + "currentBounds()=" + this.a.a() + ", continuation=" + rqVar + ")";
    }
}
