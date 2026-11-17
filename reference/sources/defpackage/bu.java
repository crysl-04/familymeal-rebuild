package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bu {
    public static final bu h;
    public static final bu i;
    public static final bu j;
    public static final /* synthetic */ bu[] k;

    static {
        bu buVar = new bu("NONE", 0);
        h = buVar;
        bu buVar2 = new bu("ALL_JSON_OBJECTS", 1);
        i = buVar2;
        bu buVar3 = new bu("POLYMORPHIC", 2);
        j = buVar3;
        k = new bu[]{buVar, buVar2, buVar3};
    }

    public static bu valueOf(String str) {
        return (bu) Enum.valueOf(bu.class, str);
    }

    public static bu[] values() {
        return (bu[]) k.clone();
    }
}
