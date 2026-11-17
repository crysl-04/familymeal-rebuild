package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView h;

    public a(SearchView searchView) {
        this.h = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.h;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.w;
        if (view == searchView.A) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.S;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.C) {
            searchView.k();
            return;
        }
        if (view == searchView.B) {
            searchView.o();
            return;
        }
        if (view != searchView.D) {
            if (view == searchAutoComplete) {
                searchAutoComplete.refreshAutoCompleteResults();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.i0;
        if (searchableInfo != null) {
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.j(searchView.P, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.O);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
