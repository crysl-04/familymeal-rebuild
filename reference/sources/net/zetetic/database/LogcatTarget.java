package net.zetetic.database;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class LogcatTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public boolean isLoggable(String str, int i) {
        return Log.isLoggable(str, i);
    }

    @Override // net.zetetic.database.LogTarget
    public void log(int i, String str, String str2, Throwable th) {
    }
}
