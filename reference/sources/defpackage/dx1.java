package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends ex1 implements rz {
    public static final dx1 k = new dx1(e03.e, 0);

    public final dx1 b(g42 g42Var, c33 c33Var) {
        az azVarU = this.h.u(g42Var.hashCode(), 0, g42Var, c33Var);
        return azVarU == null ? this : new dx1((e03) azVarU.b, this.i + (azVarU.a ? 1 : 0));
    }

    @Override // defpackage.ex1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof g42) {
            return super.containsKey((g42) obj);
        }
        return false;
    }

    @Override // defpackage.ex1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c33) {
            return super.containsValue((c33) obj);
        }
        return false;
    }

    @Override // defpackage.ex1, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof g42) {
            return (c33) super.get((g42) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof g42) ? obj2 : (c33) super.getOrDefault((g42) obj, (c33) obj2);
    }
}
