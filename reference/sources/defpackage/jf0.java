package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jf0 implements m70 {
    public final /* synthetic */ h91 h;

    public jf0(EmojiCompatInitializer emojiCompatInitializer, h91 h91Var) {
        this.h = h91Var;
    }

    @Override // defpackage.m70
    public final void c(e91 e91Var) {
        yz.a(Looper.getMainLooper()).postDelayed(new lq(), 500L);
        this.h.f(this);
    }
}
