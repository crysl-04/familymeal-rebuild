package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l11 extends wh2 {
    public final String h;

    public l11(String str, String str2) {
        this(str.concat((str2 == null || co2.X(str2)) ? "" : "\n".concat(str2)));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.h;
    }

    public l11(String str) {
        super(str);
        this.h = str;
    }
}
