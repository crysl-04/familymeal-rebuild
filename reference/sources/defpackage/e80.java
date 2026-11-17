package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e80 {
    public static final p12 a;

    static {
        a = new p12(0, (30 & 1) == 0, true);
    }

    public static final void a(fl flVar, ft2 ft2Var, dr0 dr0Var, int i) {
        dr0 dr0Var2;
        dr0Var.W(1904307118);
        int i2 = (dr0Var.f(flVar) ? 4 : 2) | i | (dr0Var.h(ft2Var) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            dr0Var.V(-1009482584);
            Context context = (Context) dr0Var.j(i7.b);
            dr0Var.p(false);
            boolean zH = dr0Var.h(ft2Var) | ((i2 & 14) == 4) | dr0Var.h(context);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new qb((Object) ft2Var, (Object) context, (Object) flVar, (byte) 6);
                dr0Var.f0(objK);
            }
            dr0Var2 = dr0Var;
            j10.b(null, null, (vp0) objK, dr0Var2, 0, 3);
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 11, i, flVar, ft2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242  */
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x024a  */
    /* JADX WARN: Code duplicated, block: B:109:0x024e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0251  */
    /* JADX WARN: Code duplicated, block: B:111:0x0256  */
    /* JADX WARN: Code duplicated, block: B:112:0x0259  */
    /* JADX WARN: Code duplicated, block: B:113:0x025c  */
    /* JADX WARN: Code duplicated, block: B:114:0x025f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0287  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:142:0x033c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0342  */
    /* JADX WARN: Code duplicated, block: B:146:0x034d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0354  */
    /* JADX WARN: Code duplicated, block: B:170:0x0403  */
    /* JADX WARN: Code duplicated, block: B:172:0x040b  */
    /* JADX WARN: Code duplicated, block: B:174:0x040f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0415  */
    /* JADX WARN: Code duplicated, block: B:178:0x042b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0438  */
    /* JADX WARN: Code duplicated, block: B:182:0x043c  */
    /* JADX WARN: Code duplicated, block: B:185:0x044c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0451  */
    /* JADX WARN: Code duplicated, block: B:190:0x0471  */
    /* JADX WARN: Code duplicated, block: B:191:0x0473  */
    /* JADX WARN: Code duplicated, block: B:194:0x0483  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:198:0x0489  */
    /* JADX WARN: Code duplicated, block: B:199:0x048c  */
    /* JADX WARN: Code duplicated, block: B:200:0x048f  */
    /* JADX WARN: Code duplicated, block: B:203:0x049d  */
    /* JADX WARN: Code duplicated, block: B:204:0x049f  */
    /* JADX WARN: Code duplicated, block: B:207:0x04af  */
    /* JADX WARN: Code duplicated, block: B:209:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:212:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:213:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:217:0x0502  */
    /* JADX WARN: Code duplicated, block: B:220:0x051b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0523 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x0525  */
    /* JADX WARN: Code duplicated, block: B:223:0x0531  */
    /* JADX WARN: Code duplicated, block: B:226:0x053b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0545  */
    /* JADX WARN: Code duplicated, block: B:229:0x0551  */
    /* JADX WARN: Code duplicated, block: B:231:0x0555  */
    /* JADX WARN: Code duplicated, block: B:232:0x0558  */
    /* JADX WARN: Code duplicated, block: B:235:0x055e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0587  */
    /* JADX WARN: Code duplicated, block: B:241:0x058f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0593  */
    /* JADX WARN: Code duplicated, block: B:244:0x0599  */
    /* JADX WARN: Code duplicated, block: B:247:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:249:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:254:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:257:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:314:0x0607 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x05fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x05fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x05fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x021e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229  */
    public static final void b(final int i, final long j, dr0 dr0Var, final int i2) {
        final int i3;
        int i4;
        long j2;
        TypedValue typedValue;
        int i5;
        boolean z;
        Object obj;
        Object t8Var;
        tt1 knVar;
        Object lnVar;
        XmlResourceParser xmlResourceParser;
        long jB;
        long j3;
        int i6;
        int i7;
        hu0 hu0Var;
        int i8;
        List listA;
        XmlResourceParser xmlResourceParser2;
        y3 y3Var;
        int eventType;
        int i9;
        String name;
        int iHashCode;
        int[] iArr;
        int i10;
        TypedArray typedArrayObtainStyledAttributes;
        String string;
        String str;
        String string2;
        int[] iArr2;
        int i11;
        TypedArray typedArrayObtainStyledAttributes2;
        String string3;
        String str2;
        String string4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Shader shader;
        int i17;
        zo rl2Var;
        Shader shader2;
        int i18;
        zo rl2Var2;
        int i19;
        int i20;
        ColorStateList colorStateListA;
        dr0Var.W(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (dr0Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.e(j) ? 32 : 16;
        }
        if (dr0Var.N(i4 & 1, (i4 & 19) != 18)) {
            g42 g42Var = i7.b;
            Context context = (Context) dr0Var.j(g42Var);
            boolean zF = dr0Var.f(context) | ((i4 & 14) == 4);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                dr0Var.f0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                e72 e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    final byte b = 1;
                    e72VarR.d = new zp0() { // from class: d80
                        @Override // defpackage.zp0
                        public final Object f(Object obj2, Object obj3) {
                            byte b2 = b;
                            j23 j23Var = j23.a;
                            int i21 = i2;
                            long j4 = j;
                            int i22 = i3;
                            dr0 dr0Var2 = (dr0) obj2;
                            ((Integer) obj3).getClass();
                            int i23 = i21 | 1;
                            switch (b2) {
                                case 0:
                                    e80.b(i22, j4, dr0Var2, m02.A(i23));
                                    break;
                                default:
                                    e80.b(i22, j4, dr0Var2, m02.A(i23));
                                    break;
                            }
                            return j23Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) dr0Var.j(g42Var);
            Resources resources = (Resources) dr0Var.j(i7.c);
            v82 v82Var = (v82) dr0Var.j(i7.e);
            synchronized (v82Var) {
                typedValue = (TypedValue) v82Var.a.b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    si1 si1Var = v82Var.a;
                    int iD = si1Var.d(iIntValue);
                    Object[] objArr = si1Var.c;
                    Object obj2 = objArr[iD];
                    si1Var.b[iD] = iIntValue;
                    objArr[iD] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !co2.S(charSequence, ".xml")) {
                i5 = i4;
                z = true;
                dr0Var.V(-1771643000);
                boolean zF2 = dr0Var.f(charSequence) | dr0Var.d(iIntValue) | dr0Var.f(context2.getTheme());
                Object objK2 = dr0Var.K();
                if (zF2 || objK2 == zy.a) {
                    obj = null;
                    try {
                        Drawable drawable = resources.getDrawable(iIntValue, null);
                        drawable.getClass();
                        t8Var = new t8(((BitmapDrawable) drawable).getBitmap());
                        dr0Var.f0(t8Var);
                    } catch (Exception e) {
                        throw new a42("Error attempting to load resource: " + ((Object) charSequence), e, (byte) 5);
                    }
                } else {
                    t8Var = objK2;
                    obj = null;
                }
                knVar = new kn((t8) t8Var);
                dr0Var.p(false);
            } else {
                dr0Var.V(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i21 = typedValue.changingConfigurations;
                lu0 lu0Var = (lu0) dr0Var.j(i7.d);
                ku0 ku0Var = new ku0(theme, iIntValue);
                WeakReference weakReference = (WeakReference) lu0Var.a.get(ku0Var);
                ju0 ju0Var = weakReference != null ? (ju0) weakReference.get() : null;
                if (ju0Var == null) {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    for (int next = xml.next(); next != 2; next = xml.next()) {
                        if (next == 1) {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                    if (!uz0.g(xml.getName(), "vector")) {
                        wg.m("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    lb lbVar = new lb();
                    lbVar.d = xml;
                    lbVar.a = 0;
                    y3 y3Var2 = new y3();
                    y3Var2.b = new float[64];
                    lbVar.e = y3Var2;
                    int[] iArr3 = uz0.a;
                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                    lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
                    lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    float fC = lbVar.c(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
                    float fC2 = lbVar.c(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
                    if (fC <= 0.0f) {
                        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (fC2 <= 0.0f) {
                        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
                    lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
                    lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    if (typedArrayObtainAttributes.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            xmlResourceParser = xml;
                            j3 = kv.g;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                typedArrayObtainAttributes.getValue(1, typedValue3);
                                int i22 = typedValue3.type;
                                if (i22 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i22 < 28 || i22 > 31) {
                                    Resources resources2 = typedArrayObtainAttributes.getResources();
                                    xmlResourceParser = xml;
                                    int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                                    ThreadLocal threadLocal = vv.a;
                                    try {
                                        colorStateListA = vv.a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception unused) {
                                        colorStateListA = null;
                                    }
                                } else {
                                    colorStateListA = ColorStateList.valueOf(typedValue3.data);
                                    xmlResourceParser = xml;
                                }
                                lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                                if (colorStateListA != null) {
                                    jB = cu.b(colorStateListA.getDefaultColor());
                                } else {
                                    jB = kv.g;
                                }
                            } else {
                                xmlResourceParser = xml;
                            }
                            colorStateListA = null;
                            lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                            if (colorStateListA != null) {
                                jB = cu.b(colorStateListA.getDefaultColor());
                            } else {
                                jB = kv.g;
                            }
                        }
                        i6 = typedArrayObtainAttributes.getInt(6, -1);
                        lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                        if (i6 == -1) {
                            i7 = 5;
                        } else if (i6 != 3) {
                            i7 = 3;
                        } else if (i6 == 5) {
                            i7 = 5;
                        } else if (i6 != 9) {
                            switch (i6) {
                                case 14:
                                    i7 = 13;
                                    break;
                                case 15:
                                    i7 = 14;
                                    break;
                                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                                    i7 = 12;
                                    break;
                                default:
                                    i7 = 5;
                                    break;
                            }
                        } else {
                            i7 = 9;
                        }
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArrayObtainAttributes.recycle();
                        hu0Var = new hu0(null, f, f2, fC, fC2, j3, i7, z2, 1);
                        i8 = 0;
                        while (true) {
                            if (xmlResourceParser.getEventType() == 1) {
                                z = true;
                            } else if (xmlResourceParser.getDepth() < 1 || xmlResourceParser.getEventType() != 3) {
                                listA = ag0.h;
                                xmlResourceParser2 = (XmlResourceParser) lbVar.d;
                                int i23 = i4;
                                y3Var = (y3) lbVar.e;
                                int i24 = i21;
                                eventType = xmlResourceParser2.getEventType();
                                i9 = i8;
                                if (eventType != 2) {
                                    name = xmlResourceParser2.getName();
                                    if (name != null) {
                                        continue;
                                    } else {
                                        iHashCode = name.hashCode();
                                        if (iHashCode != -1649314686) {
                                            if (iHashCode != 3433509) {
                                                if (iHashCode != 98629247 && name.equals("group")) {
                                                    int[] iArr4 = uz0.b;
                                                    TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr4) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                                    lbVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                    float fC3 = lbVar.c(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                                    float f3 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                                    lbVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                    float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                                    lbVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                    float fC4 = lbVar.c(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                                    float fC5 = lbVar.c(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                                    float fC6 = lbVar.c(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                                    float fC7 = lbVar.c(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                                    String string5 = typedArrayObtainAttributes2.getString(0);
                                                    lbVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                    String str3 = string5 == null ? "" : string5;
                                                    typedArrayObtainAttributes2.recycle();
                                                    int i25 = k33.a;
                                                    if (hu0Var.k) {
                                                        ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    hu0Var.i.add(new gu0(str3, fC3, f3, f4, fC4, fC5, fC6, fC7, listA, 512));
                                                    int[] iArrCopyOf = lbVar.b;
                                                    if (iArrCopyOf == null) {
                                                        iArrCopyOf = new int[4];
                                                        lbVar.b = iArrCopyOf;
                                                    } else if (lbVar.c >= iArrCopyOf.length) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
                                                        lbVar.b = iArrCopyOf;
                                                    }
                                                    int i26 = lbVar.c;
                                                    lbVar.c = i26 + 1;
                                                    iArrCopyOf[i26] = i9;
                                                    i9 = 0;
                                                }
                                            } else if (name.equals("path")) {
                                                iArr2 = uz0.c;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                    i11 = 0;
                                                } else {
                                                    i11 = 0;
                                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                                }
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                    wg.m("No path data available");
                                                    return;
                                                }
                                                string3 = typedArrayObtainStyledAttributes2.getString(i11);
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (string3 == null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = string3;
                                                }
                                                string4 = typedArrayObtainStyledAttributes2.getString(2);
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (string4 == null) {
                                                    int i27 = k33.a;
                                                } else {
                                                    listA = y3.a(y3Var, string4);
                                                }
                                                List list = listA;
                                                p4 p4VarB = lbVar.b(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                                float fC8 = lbVar.c(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                if (rz1.r((XmlResourceParser) lbVar.d, "strokeLineCap")) {
                                                    i12 = typedArrayObtainStyledAttributes2.getInt(8, -1);
                                                } else {
                                                    i12 = -1;
                                                }
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i12 == 0) {
                                                    i13 = 0;
                                                } else if (i12 != 1) {
                                                    i13 = 1;
                                                } else if (i12 == 2) {
                                                    i13 = 2;
                                                } else {
                                                    i13 = 0;
                                                }
                                                if (rz1.r((XmlResourceParser) lbVar.d, "strokeLineJoin")) {
                                                    i14 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                } else {
                                                    i14 = -1;
                                                }
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i14 == 0) {
                                                    i15 = 0;
                                                } else if (i14 != 1) {
                                                    i15 = 1;
                                                } else if (i14 == 2) {
                                                    i15 = 2;
                                                } else {
                                                    i15 = 0;
                                                }
                                                float fC9 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                p4 p4VarB2 = lbVar.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fC10 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fC11 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fC12 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fC13 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fC14 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (rz1.r((XmlResourceParser) lbVar.d, "fillType")) {
                                                    i16 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                } else {
                                                    i16 = 0;
                                                }
                                                lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                shader = (Shader) p4VarB.c;
                                                i17 = p4VarB.b;
                                                if (shader != null) {
                                                    rl2Var = new ap(shader);
                                                } else if (i17 != 0) {
                                                    rl2Var = new rl2(cu.b(i17));
                                                } else {
                                                    rl2Var = null;
                                                }
                                                shader2 = (Shader) p4VarB2.c;
                                                i18 = p4VarB2.b;
                                                if (shader2 != null) {
                                                    rl2Var2 = new ap(shader2);
                                                } else if (i18 != 0) {
                                                    rl2Var2 = new rl2(cu.b(i18));
                                                } else {
                                                    rl2Var2 = null;
                                                }
                                                if (i16 == 0) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 1;
                                                }
                                                if (hu0Var.k) {
                                                    ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                ArrayList arrayList = hu0Var.i;
                                                ((gu0) arrayList.get(arrayList.size() - 1)).j.add(new n33(str2, list, i19, rl2Var, fC8, rl2Var2, fC10, fC11, i13, i15, fC9, fC14, fC12, fC13));
                                            } else {
                                                continue;
                                            }
                                        } else if (name.equals("clip-path")) {
                                            iArr = uz0.d;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                                                i10 = 0;
                                            } else {
                                                i10 = 0;
                                                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                                            }
                                            lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            string = typedArrayObtainStyledAttributes.getString(i10);
                                            lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            if (string == null) {
                                                str = "";
                                            } else {
                                                str = string;
                                            }
                                            string2 = typedArrayObtainStyledAttributes.getString(1);
                                            lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                            if (string2 == null) {
                                                int i28 = k33.a;
                                            } else {
                                                listA = y3.a(y3Var, string2);
                                            }
                                            List list2 = listA;
                                            typedArrayObtainStyledAttributes.recycle();
                                            if (hu0Var.k) {
                                                ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            hu0Var.i.add(new gu0(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                            i9++;
                                        }
                                    }
                                } else if (eventType != 3 && "group".equals(xmlResourceParser2.getName())) {
                                    int i29 = i9 + 1;
                                    for (int i30 = 0; i30 < i29; i30++) {
                                        ArrayList arrayList2 = hu0Var.i;
                                        if (hu0Var.k) {
                                            ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        gu0 gu0Var = (gu0) arrayList2.remove(arrayList2.size() - 1);
                                        ((gu0) arrayList2.get(arrayList2.size() - 1)).j.add(new j33(gu0Var.a, gu0Var.b, gu0Var.c, gu0Var.d, gu0Var.e, gu0Var.f, gu0Var.g, gu0Var.h, gu0Var.i, gu0Var.j));
                                    }
                                    int[] iArr5 = lbVar.b;
                                    if (iArr5 == null || (i20 = lbVar.c) == 0) {
                                        i9 = 0;
                                    } else {
                                        int i31 = i20 - 1;
                                        lbVar.c = i31;
                                        i9 = iArr5[i31];
                                    }
                                }
                                xmlResourceParser.next();
                                i4 = i23;
                                i21 = i24;
                                i8 = i9;
                            } else {
                                z = true;
                            }
                        }
                        i5 = i4;
                        ju0Var = new ju0(hu0Var.b(), i21 | lbVar.a);
                        lu0Var.a.put(ku0Var, new WeakReference(ju0Var));
                    } else {
                        xmlResourceParser = xml;
                        jB = kv.g;
                    }
                    j3 = jB;
                    i6 = typedArrayObtainAttributes.getInt(6, -1);
                    lbVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    if (i6 == -1) {
                        i7 = 5;
                    } else if (i6 != 3) {
                        i7 = 3;
                    } else if (i6 == 5) {
                        i7 = 5;
                    } else if (i6 != 9) {
                        switch (i6) {
                            case 14:
                                i7 = 13;
                                break;
                            case 15:
                                i7 = 14;
                                break;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                                i7 = 12;
                                break;
                            default:
                                i7 = 5;
                                break;
                        }
                    } else {
                        i7 = 9;
                    }
                    float f5 = dimension / resources.getDisplayMetrics().density;
                    float f6 = dimension2 / resources.getDisplayMetrics().density;
                    typedArrayObtainAttributes.recycle();
                    hu0Var = new hu0(null, f5, f6, fC, fC2, j3, i7, z2, 1);
                    i8 = 0;
                    while (true) {
                        if (xmlResourceParser.getEventType() == 1) {
                            if (xmlResourceParser.getDepth() < 1) {
                            }
                            listA = ag0.h;
                            xmlResourceParser2 = (XmlResourceParser) lbVar.d;
                            int i210 = i4;
                            y3Var = (y3) lbVar.e;
                            int i211 = i21;
                            eventType = xmlResourceParser2.getEventType();
                            i9 = i8;
                            if (eventType != 2) {
                                name = xmlResourceParser2.getName();
                                if (name != null) {
                                    iHashCode = name.hashCode();
                                    if (iHashCode != -1649314686) {
                                        if (iHashCode != 3433509) {
                                            if (iHashCode != 98629247) {
                                            }
                                        } else if (name.equals("path")) {
                                            iArr2 = uz0.c;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                i11 = 0;
                                            } else {
                                                i11 = 0;
                                                typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                            }
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                wg.m("No path data available");
                                                return;
                                            }
                                            string3 = typedArrayObtainStyledAttributes2.getString(i11);
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string3 == null) {
                                                str2 = "";
                                            } else {
                                                str2 = string3;
                                            }
                                            string4 = typedArrayObtainStyledAttributes2.getString(2);
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string4 == null) {
                                                int i212 = k33.a;
                                            } else {
                                                listA = y3.a(y3Var, string4);
                                            }
                                            List list3 = listA;
                                            p4 p4VarB3 = lbVar.b(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                            float fC15 = lbVar.c(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            if (rz1.r((XmlResourceParser) lbVar.d, "strokeLineCap")) {
                                                i12 = -1;
                                            } else {
                                                i12 = typedArrayObtainStyledAttributes2.getInt(8, -1);
                                            }
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i12 == 0) {
                                                i13 = 0;
                                            } else if (i12 != 1) {
                                                i13 = 1;
                                            } else if (i12 == 2) {
                                                i13 = 2;
                                            } else {
                                                i13 = 0;
                                            }
                                            if (rz1.r((XmlResourceParser) lbVar.d, "strokeLineJoin")) {
                                                i14 = -1;
                                            } else {
                                                i14 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                            }
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i14 == 0) {
                                                i15 = 0;
                                            } else if (i14 != 1) {
                                                i15 = 1;
                                            } else if (i14 == 2) {
                                                i15 = 2;
                                            } else {
                                                i15 = 0;
                                            }
                                            float fC16 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            p4 p4VarB4 = lbVar.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                            float fC17 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float fC18 = lbVar.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float fC19 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float fC110 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float fC111 = lbVar.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            if (rz1.r((XmlResourceParser) lbVar.d, "fillType")) {
                                                i16 = 0;
                                            } else {
                                                i16 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                            }
                                            lbVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            typedArrayObtainStyledAttributes2.recycle();
                                            shader = (Shader) p4VarB3.c;
                                            i17 = p4VarB3.b;
                                            if (shader != null) {
                                                rl2Var = new ap(shader);
                                            } else if (i17 != 0) {
                                                rl2Var = new rl2(cu.b(i17));
                                            } else {
                                                rl2Var = null;
                                            }
                                            shader2 = (Shader) p4VarB4.c;
                                            i18 = p4VarB4.b;
                                            if (shader2 != null) {
                                                rl2Var2 = new ap(shader2);
                                            } else if (i18 != 0) {
                                                rl2Var2 = new rl2(cu.b(i18));
                                            } else {
                                                rl2Var2 = null;
                                            }
                                            if (i16 == 0) {
                                                i19 = 0;
                                            } else {
                                                i19 = 1;
                                            }
                                            if (hu0Var.k) {
                                                ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            ArrayList arrayList3 = hu0Var.i;
                                            ((gu0) arrayList3.get(arrayList3.size() - 1)).j.add(new n33(str2, list3, i19, rl2Var, fC15, rl2Var2, fC17, fC18, i13, i15, fC16, fC111, fC19, fC110));
                                        } else {
                                            continue;
                                        }
                                    } else if (name.equals("clip-path")) {
                                        iArr = uz0.d;
                                        if (theme == null) {
                                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                                            i10 = 0;
                                        } else {
                                            i10 = 0;
                                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                                        }
                                        lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                        string = typedArrayObtainStyledAttributes.getString(i10);
                                        lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                        if (string == null) {
                                            str = "";
                                        } else {
                                            str = string;
                                        }
                                        string2 = typedArrayObtainStyledAttributes.getString(1);
                                        lbVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                        if (string2 == null) {
                                            int i213 = k33.a;
                                        } else {
                                            listA = y3.a(y3Var, string2);
                                        }
                                        List list4 = listA;
                                        typedArrayObtainStyledAttributes.recycle();
                                        if (hu0Var.k) {
                                            ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        hu0Var.i.add(new gu0(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list4, 512));
                                        i9++;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (eventType != 3) {
                            }
                            xmlResourceParser.next();
                            i4 = i210;
                            i21 = i211;
                            i8 = i9;
                        } else {
                            z = true;
                        }
                    }
                    i5 = i4;
                    ju0Var = new ju0(hu0Var.b(), i21 | lbVar.a);
                    lu0Var.a.put(ku0Var, new WeakReference(ju0Var));
                } else {
                    i5 = i4;
                    z = true;
                }
                m33 m33VarW = m02.w(ju0Var.a, dr0Var);
                dr0Var.p(false);
                knVar = m33VarW;
                obj = null;
            }
            boolean z3 = (i5 & 112) == 32 ? z : false;
            Object objK3 = dr0Var.K();
            if (z3 || objK3 == zy.a) {
                if (j == 16) {
                    j2 = j;
                    lnVar = obj;
                } else {
                    j2 = j;
                    lnVar = new ln(5, j2);
                }
                dr0Var.f0(lnVar);
            } else {
                lnVar = objK3;
                j2 = j;
            }
            ho.a(aa3.F(yj2.i(og1.h, g10.e), knVar, (ln) lnVar), dr0Var, 0);
        } else {
            j2 = j;
            dr0Var.Q();
        }
        e72 e72VarR2 = dr0Var.r();
        if (e72VarR2 != null) {
            final byte b2 = 0;
            final long j4 = j2;
            e72VarR2.d = new zp0() { // from class: d80
                @Override // defpackage.zp0
                public final Object f(Object obj3, Object obj4) {
                    byte b3 = b2;
                    j23 j23Var = j23.a;
                    int i214 = i2;
                    long j5 = j4;
                    int i215 = i;
                    dr0 dr0Var2 = (dr0) obj3;
                    ((Integer) obj4).getClass();
                    int i216 = i214 | 1;
                    switch (b3) {
                        case 0:
                            e80.b(i215, j5, dr0Var2, m02.A(i216));
                            break;
                        default:
                            e80.b(i215, j5, dr0Var2, m02.A(i216));
                            break;
                    }
                    return j23Var;
                }
            };
        }
    }

    public static final void c(fl flVar, gt2 gt2Var, kp0 kp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dr0Var.f(flVar) : dr0Var.h(flVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dr0Var.f(gt2Var) : dr0Var.h(gt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 256 : 128;
        }
        boolean z = false;
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && dr0Var.f(gt2Var));
            Object objK = dr0Var.K();
            byte b = 12;
            yy yyVar = zy.a;
            if (z2 || objK == yyVar) {
                objK = new qd1(new g2(new h6(gt2Var, kp0Var, b), (byte) 8));
                dr0Var.f0(objK);
            }
            qd1 qd1Var = (qd1) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && dr0Var.h(flVar))) {
                z = true;
            }
            Object objK2 = dr0Var.K();
            if (z || objK2 == yyVar) {
                objK2 = new o9(flVar, (byte) 12);
                dr0Var.f0(objK2);
            }
            ca.a(qd1Var, (kp0) objK2, a, dt.N(1315155414, new j7(gt2Var, flVar, (byte) 10), dr0Var), dr0Var, 3456, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) flVar, (Object) gt2Var, (hq0) kp0Var, i, (byte) 5);
        }
    }

    public static final void d(rg1 rg1Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(1392105195);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(nxVar) ? 32 : 16;
        }
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            h7.P(rg1Var, pt2.a, nxVar, dr0Var, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ab(rg1Var, nxVar, i, b);
        }
    }
}
