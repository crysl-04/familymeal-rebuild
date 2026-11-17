package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w03 extends jy1 {
    @Override // defpackage.jy1
    public final Font A(sn0 sn0Var) {
        Font fontF;
        Uri uri = sn0Var.a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = sn0Var.e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontF = v03.f(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontF;
                }
                try {
                    return new Font.Builder(fontF).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
