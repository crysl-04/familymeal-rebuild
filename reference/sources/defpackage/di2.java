package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class di2 extends CharacterStyle implements UpdateAppearance {
    public final ap h;
    public final float i;
    public final lu1 j = rz1.x(new wj2(9205357640488583168L));
    public final o90 k = il2.b(new xu1(this, 11));

    public di2(ap apVar, float f) {
        this.h = apVar;
        this.i = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        tz0.G(textPaint, this.i);
        textPaint.setShader((Shader) this.k.getValue());
    }
}
