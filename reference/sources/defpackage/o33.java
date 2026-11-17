package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface o33 {
    boolean a();

    long b(id idVar, id idVar2, id idVar3);

    id l(long j, id idVar, id idVar2, id idVar3);

    id p(long j, id idVar, id idVar2, id idVar3);

    default id q(id idVar, id idVar2, id idVar3) {
        return l(b(idVar, idVar2, idVar3), idVar, idVar2, idVar3);
    }
}
