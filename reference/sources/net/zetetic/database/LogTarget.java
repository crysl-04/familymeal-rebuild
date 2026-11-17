package net.zetetic.database;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface LogTarget {
    boolean isLoggable(String str, int i);

    void log(int i, String str, String str2, Throwable th);
}
