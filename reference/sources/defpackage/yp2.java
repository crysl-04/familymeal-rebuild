package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public yp2(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:79:0x021b  */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlResourceParser xmlResourceParser2;
        ColorStateList colorStateList;
        int resourceId;
        xp2 xp2Var = new xp2(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = xp2Var.a;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            xp2Var.b = 0;
                            xp2Var.c = 0;
                            xp2Var.d = 0;
                            xp2Var.e = 0;
                            xp2Var.f = true;
                            xp2Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!xp2Var.h) {
                                mf1 mf1Var = xp2Var.z;
                                if (mf1Var == null || !mf1Var.a.hasSubMenu()) {
                                    xp2Var.h = true;
                                    xp2Var.b(menu2.add(xp2Var.b, xp2Var.i, xp2Var.j, xp2Var.k));
                                } else {
                                    xp2Var.h = true;
                                    xp2Var.b(menu2.addSubMenu(xp2Var.b, xp2Var.i, xp2Var.j, xp2Var.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z = true;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                    }
                } else {
                    xmlResourceParser2 = xmlResourceParser;
                }
            } else if (z2) {
                xmlResourceParser2 = xmlResourceParser;
            } else {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.p);
                    xp2Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    xp2Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    xp2Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    xp2Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    xp2Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    xp2Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f52.q);
                    xp2Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    xp2Var.j = (typedArrayObtainStyledAttributes2.getInt(5, xp2Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, xp2Var.d) & 65535);
                    xp2Var.k = typedArrayObtainStyledAttributes2.getText(7);
                    xp2Var.l = typedArrayObtainStyledAttributes2.getText(8);
                    xp2Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    xp2Var.n = string == null ? (char) 0 : string.charAt(0);
                    xp2Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    xp2Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                    xp2Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        xp2Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        xp2Var.r = xp2Var.e;
                    }
                    xp2Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    xp2Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, xp2Var.f);
                    xp2Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, xp2Var.g);
                    xp2Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    xp2Var.y = typedArrayObtainStyledAttributes2.getString(12);
                    xp2Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    xp2Var.x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    if (string3 != null && xp2Var.w == 0 && xp2Var.x == null) {
                        xp2Var.z = (mf1) xp2Var.a(string3, f, this.b);
                    } else {
                        xp2Var.z = null;
                    }
                    xp2Var.A = typedArrayObtainStyledAttributes2.getText(17);
                    xp2Var.B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        xp2Var.D = zd0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), xp2Var.D);
                    } else {
                        xp2Var.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        } else {
                            int i2 = df.a;
                            colorStateList = context.getColorStateList(resourceId);
                            if (colorStateList == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                        }
                        xp2Var.C = colorStateList;
                    } else {
                        xp2Var.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    xp2Var.h = false;
                } else if (name3.equals("menu")) {
                    xp2Var.h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(xp2Var.b, xp2Var.i, xp2Var.j, xp2Var.k);
                    xp2Var.b(subMenuAddSubMenu.getItem());
                    xmlResourceParser2 = xmlResourceParser;
                    b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlResourceParser2 = xmlResourceParser;
                    str = name3;
                    z2 = true;
                }
                xmlResourceParser2 = xmlResourceParser;
            }
            eventType = xmlResourceParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof if1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                b(layout, Xml.asAttributeSet(layout), menu);
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
