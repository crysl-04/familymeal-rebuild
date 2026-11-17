package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ll0 {
    public static final ll0 h;
    public static final /* synthetic */ ll0[] i;

    /* JADX INFO: Fake field, exist only in values array */
    ll0 EF0;

    static {
        ll0 ll0Var = new ll0("Visible", 0);
        ll0 ll0Var2 = new ll0("Clip", 1);
        h = ll0Var2;
        i = new ll0[]{ll0Var, ll0Var2, new ll0("ExpandIndicator", 2), new ll0("ExpandOrCollapseIndicator", 3)};
    }

    public static ll0 valueOf(String str) {
        return (ll0) Enum.valueOf(ll0.class, str);
    }

    public static ll0[] values() {
        return (ll0[]) i.clone();
    }
}
