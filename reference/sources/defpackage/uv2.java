package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uv2 {
    public static final /* synthetic */ uv2[] h = {new uv2("Filled", 0), new uv2("Outlined", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    uv2 EF5;

    public static uv2 valueOf(String str) {
        return (uv2) Enum.valueOf(uv2.class, str);
    }

    public static uv2[] values() {
        return (uv2[]) h.clone();
    }
}
