package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fg {
    public static final fg h;
    public static final fg i;
    public static final fg j;
    public static final /* synthetic */ fg[] k;

    static {
        fg fgVar = new fg("READY", 0);
        h = fgVar;
        fg fgVar2 = new fg("NO_SCREEN_LOCK", 1);
        i = fgVar2;
        fg fgVar3 = new fg("UNAVAILABLE", 2);
        j = fgVar3;
        k = new fg[]{fgVar, fgVar2, fgVar3};
    }

    public static fg valueOf(String str) {
        return (fg) Enum.valueOf(fg.class, str);
    }

    public static fg[] values() {
        return (fg[]) k.clone();
    }
}
