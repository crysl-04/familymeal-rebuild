package defpackage;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fn {
    public final Cipher b;
    public final Signature a = null;
    public final Mac c = null;
    public final IdentityCredential d = null;

    public fn(Cipher cipher) {
        this.b = cipher;
    }
}
