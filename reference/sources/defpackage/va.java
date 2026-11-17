package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class va {
    public final wa a;
    public final ta b;
    public final ta c;
    public final View d;

    public va(wa waVar, ta taVar, ta taVar2, View view) {
        this.a = waVar;
        this.b = taVar;
        this.c = taVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        ft2 ft2Var = (ft2) this.b.a();
        final byte b = 0;
        if (uz0.g(ft2Var, null)) {
            return false;
        }
        menu.clear();
        List list = ft2Var.a;
        int size = list.size();
        final byte b2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            et2 et2Var = (et2) list.get(i3);
            if (et2Var instanceof mt2) {
                i = i4 + 1;
                Object obj = et2Var.a;
                if (uz0.g(obj, h7.Y)) {
                    i2 = R.id.cut;
                } else if (uz0.g(obj, h7.Z)) {
                    i2 = R.id.copy;
                } else if (uz0.g(obj, h7.a0)) {
                    i2 = R.id.paste;
                } else if (uz0.g(obj, h7.b0)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = uz0.g(obj, h7.c0) ? R.id.autofill : i4;
                }
                final mt2 mt2Var = (mt2) et2Var;
                MenuItem menuItemAdd = menu.add(i5, i2, i4, mt2Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ua
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        byte b3 = b;
                        Object obj2 = this;
                        Object obj3 = mt2Var;
                        switch (b3) {
                            case 0:
                                ((mt2) obj3).d.h(((va) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                int i6 = Build.VERSION.SDK_INT;
                                if (i6 < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                        if (i6 >= 36) {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                        } else {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                        }
                                        activity.send(activityOptionsMakeBasic.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Objects.toString(activity);
                                        e.toString();
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (et2Var instanceof st2) {
                    i = i4 + 1;
                    final Context context = this.d.getContext();
                    st2 st2Var = (st2) et2Var;
                    final TextClassification textClassification = st2Var.b;
                    int i6 = st2Var.c;
                    Drawable drawable = st2Var.d;
                    if (i6 < 0) {
                        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(drawable);
                        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ua
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                byte b3 = b2;
                                Object obj2 = textClassification;
                                Object obj3 = context;
                                switch (b3) {
                                    case 0:
                                        ((mt2) obj3).d.h(((va) obj2).a);
                                        break;
                                    default:
                                        Context context2 = (Context) obj3;
                                        TextClassification textClassification2 = (TextClassification) obj2;
                                        String text = textClassification2.getText();
                                        PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                        int i7 = Build.VERSION.SDK_INT;
                                        if (i7 < 34) {
                                            activity.send();
                                        } else {
                                            try {
                                                ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                                if (i7 >= 36) {
                                                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                                } else {
                                                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                                }
                                                activity.send(activityOptionsMakeBasic.toBundle());
                                            } catch (PendingIntent.CanceledException e) {
                                                Objects.toString(activity);
                                                e.toString();
                                            }
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                    } else {
                        byte b3 = i6 == 0 ? (byte) 1 : b;
                        final RemoteAction remoteAction = textClassification.getActions().get(i6);
                        MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i4, remoteAction.getTitle());
                        menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                        if (drawable != null) {
                            menuItemAdd3.setIcon(drawable);
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: zw2
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                PendingIntent actionIntent = remoteAction.getActionIntent();
                                int i7 = Build.VERSION.SDK_INT;
                                if (i7 < 34) {
                                    actionIntent.send();
                                    return true;
                                }
                                try {
                                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                    if (i7 >= 36) {
                                        activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                    } else {
                                        activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                    }
                                    actionIntent.send(activityOptionsMakeBasic.toBundle());
                                } catch (PendingIntent.CanceledException e) {
                                    Objects.toString(actionIntent);
                                    e.toString();
                                }
                                return true;
                            }
                        });
                    }
                } else if (et2Var instanceof qt2) {
                    i5++;
                }
                i3++;
                b = 0;
            }
            i4 = i;
            i3++;
            b = 0;
        }
        return true;
    }
}
