package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qd {
    public static final qd h;
    public static final qd i;
    public static final qd j;
    public static final qd k;
    public static final qd l;
    public static final qd m;
    public static final qd n;
    public static final /* synthetic */ qd[] o;

    static {
        qd qdVar = new qd("Paragraph", 0);
        h = qdVar;
        qd qdVar2 = new qd("Span", 1);
        i = qdVar2;
        qd qdVar3 = new qd("VerbatimTts", 2);
        j = qdVar3;
        qd qdVar4 = new qd("Url", 3);
        k = qdVar4;
        qd qdVar5 = new qd("Link", 4);
        l = qdVar5;
        qd qdVar6 = new qd("Clickable", 5);
        m = qdVar6;
        qd qdVar7 = new qd("String", 6);
        n = qdVar7;
        o = new qd[]{qdVar, qdVar2, qdVar3, qdVar4, qdVar5, qdVar6, qdVar7};
    }

    public static qd valueOf(String str) {
        return (qd) Enum.valueOf(qd.class, str);
    }

    public static qd[] values() {
        return (qd[]) o.clone();
    }
}
