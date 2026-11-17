package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yc {
    public static final yc h;
    public static final yc i;
    public static final /* synthetic */ yc[] j;

    static {
        yc ycVar = new yc("BoundReached", 0);
        h = ycVar;
        yc ycVar2 = new yc("Finished", 1);
        i = ycVar2;
        j = new yc[]{ycVar, ycVar2};
    }

    public static yc valueOf(String str) {
        return (yc) Enum.valueOf(yc.class, str);
    }

    public static yc[] values() {
        return (yc[]) j.clone();
    }
}
