package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class no0 implements LayoutInflater.Factory2 {
    public final yo0 h;

    public no0(yo0 yo0Var) {
        this.h = yo0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ep0 ep0VarH;
        boolean zEquals = mo0.class.getName().equals(str);
        yo0 yo0Var = this.h;
        if (zEquals) {
            return new mo0(context, attributeSet, yo0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e52.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = jo0.class.isAssignableFrom(so0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    jo0 jo0VarC = resourceId != -1 ? yo0Var.C(resourceId) : null;
                    if (jo0VarC == null && string != null) {
                        jo0VarC = yo0Var.D(string);
                    }
                    if (jo0VarC == null && id != -1) {
                        jo0VarC = yo0Var.C(id);
                    }
                    if (jo0VarC == null) {
                        so0 so0VarH = yo0Var.H();
                        context.getClassLoader();
                        jo0VarC = so0VarH.a(attributeValue);
                        jo0VarC.u = true;
                        if (resourceId == 0) {
                            resourceId = id;
                        }
                        jo0VarC.E = resourceId;
                        jo0VarC.F = id;
                        jo0VarC.G = string;
                        jo0VarC.v = true;
                        jo0VarC.A = yo0Var;
                        lo0 lo0Var = yo0Var.w;
                        jo0VarC.B = lo0Var;
                        MainActivity mainActivity = lo0Var.m;
                        jo0VarC.L = true;
                        if ((lo0Var == null ? null : lo0Var.l) != null) {
                            jo0VarC.L = true;
                        }
                        ep0VarH = yo0Var.a(jo0VarC);
                        if (yo0.J(2)) {
                            jo0VarC.toString();
                        }
                    } else {
                        if (jo0VarC.v) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        jo0VarC.v = true;
                        jo0VarC.A = yo0Var;
                        lo0 lo0Var2 = yo0Var.w;
                        jo0VarC.B = lo0Var2;
                        MainActivity mainActivity2 = lo0Var2.m;
                        jo0VarC.L = true;
                        if ((lo0Var2 == null ? null : lo0Var2.l) != null) {
                            jo0VarC.L = true;
                        }
                        ep0VarH = yo0Var.h(jo0VarC);
                        if (yo0.J(2)) {
                            jo0VarC.toString();
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    fp0 fp0Var = gp0.a;
                    gp0.b(new cp0(jo0VarC, "Attempting to use <fragment> tag to add fragment " + jo0VarC + " to container " + viewGroup));
                    gp0.a(jo0VarC).getClass();
                    jo0VarC.M = viewGroup;
                    ep0VarH.j();
                    ep0VarH.i();
                    li1.g(wi0.h("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
