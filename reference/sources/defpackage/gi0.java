package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gi0 implements Comparable {
    public final int h;
    public final UUID i = UUID.randomUUID();

    public gi0(int i) {
        this.h = i;
    }

    public abstract boolean a(mg1 mg1Var);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.h, ((gi0) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gi0)) {
            return false;
        }
        UUID uuid = ((gi0) obj).i;
        UUID uuid2 = this.i;
        if (uuid2 == null) {
            if (uuid != null) {
                return false;
            }
        } else if (!uuid2.equals(uuid)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UUID uuid = this.i;
        return 31 + (uuid == null ? 0 : uuid.hashCode());
    }
}
