package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zf2 {
    public static final zf2 h;
    public static final /* synthetic */ zf2[] i;

    static {
        zf2 zf2Var = new zf2("EditableText", 0);
        h = zf2Var;
        i = new zf2[]{zf2Var, new zf2("StaticText", 1)};
    }

    public static zf2 valueOf(String str) {
        return (zf2) Enum.valueOf(zf2.class, str);
    }

    public static zf2[] values() {
        return (zf2[]) i.clone();
    }
}
