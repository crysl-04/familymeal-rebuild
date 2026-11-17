package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b82 implements Serializable {
    public final Pattern h;

    public b82(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.h = patternCompile;
    }

    public final eg a(String str) {
        str.getClass();
        Matcher matcher = this.h.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new eg(matcher, str);
        }
        return null;
    }

    public final boolean b(CharSequence charSequence) {
        charSequence.getClass();
        return this.h.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.h.toString();
        string.getClass();
        return string;
    }

    public b82(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.h = patternCompile;
    }
}
