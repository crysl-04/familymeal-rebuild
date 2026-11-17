package androidx.sqlite;

import defpackage.mo1;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface SQLiteConnection extends AutoCloseable {
    default boolean inTransaction() {
        throw new mo1(this + " does not implement inTransaction().");
    }

    SQLiteStatement prepare(String str);
}
