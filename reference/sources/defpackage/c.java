package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o53 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.o53
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.m = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.o53
    public final void b() {
        this.a = true;
    }

    @Override // defpackage.o53
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
