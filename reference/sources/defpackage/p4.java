package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p4 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public p4(Context context) {
        this.a = (byte) 0;
        int iC = q4.c(context, 0);
        this.c = new l4(new ContextThemeWrapper(context, q4.c(context, iC)));
        this.b = iC;
    }

    public static p4 d(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i2;
        int color;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        int i3;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                String name = xml.getName();
                name.getClass();
                if (!name.equals("gradient")) {
                    if (name.equals("selector")) {
                        return new p4((Shader) null, vv.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor());
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
                String name2 = xml.getName();
                if (!name2.equals("gradient")) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                }
                int[] iArr = d52.e;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
                float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
                float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
                float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
                float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
                float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
                int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
                int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
                boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
                int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
                    i2 = 0;
                    color = typedArrayObtainAttributes.getColor(1, 0);
                } else {
                    i2 = 0;
                    color = 0;
                }
                int i5 = 1;
                int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, i2) : 0;
                float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
                typedArrayObtainAttributes.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                float f10 = f9;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    f = f3;
                    if (next2 == i5) {
                        f2 = f4;
                        break;
                    }
                    int depth2 = xml.getDepth();
                    f2 = f4;
                    if (depth2 < depth && next2 == 3) {
                        break;
                    }
                    if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                        int[] iArr2 = d52.f;
                        if (theme == null) {
                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                            i3 = 0;
                        } else {
                            i3 = 0;
                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                        }
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
                        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                        if (!zHasValue || !zHasValue2) {
                            throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                        }
                        int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                        float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                        typedArrayObtainStyledAttributes.recycle();
                        arrayList2.add(Integer.valueOf(color4));
                        arrayList.add(Float.valueOf(f11));
                    }
                    f3 = f;
                    f4 = f2;
                    i5 = 1;
                }
                ix0 ix0Var = arrayList2.size() > 0 ? new ix0(arrayList2, arrayList) : null;
                if (ix0Var == null) {
                    ix0Var = z ? new ix0(color2, color3, color) : new ix0(color2, color);
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        int[] iArr3 = (int[]) ix0Var.i;
                        float[] fArr = (float[]) ix0Var.j;
                        if (i6 != 1) {
                            tileMode2 = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                        } else {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                        radialGradient = new LinearGradient(f, f2, f5, f6, iArr3, fArr, tileMode2);
                    } else {
                        radialGradient = new SweepGradient(f7, f8, (int[]) ix0Var.i, (float[]) ix0Var.j);
                    }
                } else {
                    if (f10 <= 0.0f) {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    int[] iArr4 = (int[]) ix0Var.i;
                    float[] fArr2 = (float[]) ix0Var.j;
                    if (i6 != 1) {
                        tileMode = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                    } else {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                    radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
                }
                return new p4(radialGradient, 0);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public final void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.b;
        long[] jArrCopyOf = (long[]) this.c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length << 1));
            this.c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public final boolean b(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final q4 c() {
        l4 l4Var = (l4) this.c;
        ContextThemeWrapper contextThemeWrapper = l4Var.a;
        q4 q4Var = new q4(contextThemeWrapper, this.b);
        View view = l4Var.e;
        o4 o4Var = q4Var.j;
        if (view != null) {
            o4Var.r = view;
        } else {
            CharSequence charSequence = l4Var.d;
            if (charSequence != null) {
                o4Var.d = charSequence;
                TextView textView = o4Var.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = l4Var.c;
            if (drawable != null) {
                o4Var.n = drawable;
                ImageView imageView = o4Var.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    o4Var.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = l4Var.f;
        if (charSequence2 != null) {
            in inVar = l4Var.g;
            o4Var.getClass();
            Message messageObtainMessage = inVar != null ? o4Var.z.obtainMessage(-2, inVar) : null;
            o4Var.j = charSequence2;
            o4Var.k = messageObtainMessage;
        }
        if (l4Var.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) l4Var.b.inflate(o4Var.v, (ViewGroup) null);
            int i = l4Var.l ? o4Var.w : o4Var.x;
            ListAdapter n4Var = l4Var.i;
            if (n4Var == null) {
                n4Var = new n4(contextThemeWrapper, i, R.id.text1, null);
            }
            o4Var.s = n4Var;
            o4Var.t = l4Var.m;
            if (l4Var.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new k4(l4Var, o4Var));
            }
            if (l4Var.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            o4Var.e = alertController$RecycleListView;
        }
        View view2 = l4Var.k;
        if (view2 != null) {
            o4Var.f = view2;
            o4Var.g = false;
        }
        q4Var.setCancelable(true);
        q4Var.setCanceledOnTouchOutside(true);
        q4Var.setOnCancelListener(null);
        q4Var.setOnDismissListener(null);
        jf1 jf1Var = l4Var.h;
        if (jf1Var != null) {
            q4Var.setOnKeyListener(jf1Var);
        }
        return q4Var;
    }

    public final void e(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i << 1;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:81:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:2: B:9:0x002e->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0082 A[SYNTHETIC] */
    public final void f(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        wt1 wt1Var;
        Iterable iterable;
        Iterator it;
        boolean z;
        int iIntValue;
        supportSQLiteDatabase.getClass();
        ea2 ea2Var = (ea2) this.c;
        aq2 aq2Var = new aq2(supportSQLiteDatabase);
        ja2 ja2Var = ea2Var.J;
        h40 h40Var = ea2Var.I;
        LinkedHashMap linkedHashMap = h40Var.c.a;
        if (i == i2) {
            iterable = ag0.h;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            wt1Var = new wt1(treeMap, treeMap.descendingKeySet());
                        } else {
                            wt1Var = null;
                        }
                        if (wt1Var != null) {
                            Map map = (Map) wt1Var.h;
                            it = ((Iterable) wt1Var.i).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                    if (treeMap2 == null) {
                        wt1Var = null;
                    } else {
                        wt1Var = new wt1(treeMap2, treeMap2.keySet());
                    }
                    if (wt1Var != null) {
                        Map map2 = (Map) wt1Var.h;
                        it = ((Iterable) wt1Var.i).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable == null) {
            h40Var.getClass();
            if (!h40Var.h.contains(Integer.valueOf(i))) {
                throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
            ja2Var.b(aq2Var);
            Iterator it2 = ea2Var.K.iterator();
            while (it2.hasNext()) {
                ((da2) it2.next()).getClass();
                if (aq2Var instanceof aq2) {
                    aq2Var.h.getClass();
                }
            }
            ja2Var.a(aq2Var);
            return;
        }
        ja2Var.f(aq2Var);
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            switch (((bg) it3.next()).c) {
                case 0:
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `person` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `gender` TEXT NOT NULL, `birth_year` INTEGER NOT NULL, `height_cm` REAL, `weight_kg` REAL, `activity` TEXT NOT NULL, `goal` TEXT NOT NULL, `target_weight_kg` REAL, `pace` TEXT NOT NULL, `excluded` TEXT NOT NULL, `position` INTEGER NOT NULL, `m_kcal_min` REAL, `m_kcal_max` REAL, `m_protein_min` REAL, `m_fat_min` REAL, `m_fat_max` REAL, `m_carb_min` REAL, `m_carb_max` REAL, `m_fiber_min` REAL, PRIMARY KEY(`id`))");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `schedule_slot` (`day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, PRIMARY KEY(`day`, `meal`, `person_id`), FOREIGN KEY(`person_id`) REFERENCES `person`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    pz1.k(aq2Var, "CREATE INDEX IF NOT EXISTS `index_schedule_slot_person_id` ON `schedule_slot` (`person_id`)");
                    break;
                case 1:
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `plan` (`id` TEXT NOT NULL, `week_start` TEXT NOT NULL, `month` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `status` TEXT NOT NULL, `objective` REAL, `note` TEXT NOT NULL, PRIMARY KEY(`id`))");
                    pz1.k(aq2Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_plan_week_start` ON `plan` (`week_start`)");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `plan_dish` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `recipe_id` TEXT NOT NULL, `recipe_name` TEXT NOT NULL, `locked` INTEGER NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `recipe_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `plan_diner` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `person_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `plan_portion` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, `recipe_id` TEXT NOT NULL, `servings` REAL NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `person_id`, `recipe_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `shopping_check` (`plan_id` TEXT NOT NULL, `ingredient_id` TEXT NOT NULL, PRIMARY KEY(`plan_id`, `ingredient_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    break;
                case 2:
                    pz1.k(aq2Var, "ALTER TABLE `person` ADD COLUMN `kcal_offset` REAL NOT NULL DEFAULT 0");
                    pz1.k(aq2Var, "ALTER TABLE `person` ADD COLUMN `last_adjusted` TEXT DEFAULT NULL");
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `weight_entry` (`person_id` TEXT NOT NULL, `date` TEXT NOT NULL, `weight_kg` REAL NOT NULL, PRIMARY KEY(`person_id`, `date`), FOREIGN KEY(`person_id`) REFERENCES `person`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    break;
                default:
                    pz1.k(aq2Var, "CREATE TABLE IF NOT EXISTS `_new_person` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `gender` TEXT NOT NULL, `birth_year` INTEGER, `height_cm` REAL, `weight_kg` REAL, `activity` TEXT NOT NULL, `goal` TEXT NOT NULL, `target_weight_kg` REAL, `pace` TEXT NOT NULL, `excluded` TEXT NOT NULL, `position` INTEGER NOT NULL, `m_kcal_min` REAL, `m_kcal_max` REAL, `m_protein_min` REAL, `m_fat_min` REAL, `m_fat_max` REAL, `m_carb_min` REAL, `m_carb_max` REAL, `m_fiber_min` REAL, `kcal_offset` REAL NOT NULL DEFAULT 0, `last_adjusted` TEXT, PRIMARY KEY(`id`))");
                    pz1.k(aq2Var, "INSERT INTO `_new_person` (`id`,`name`,`gender`,`birth_year`,`height_cm`,`weight_kg`,`activity`,`goal`,`target_weight_kg`,`pace`,`excluded`,`position`,`m_kcal_min`,`m_kcal_max`,`m_protein_min`,`m_fat_min`,`m_fat_max`,`m_carb_min`,`m_carb_max`,`m_fiber_min`,`kcal_offset`,`last_adjusted`) SELECT `id`,`name`,`gender`,`birth_year`,`height_cm`,`weight_kg`,`activity`,`goal`,`target_weight_kg`,`pace`,`excluded`,`position`,`m_kcal_min`,`m_kcal_max`,`m_protein_min`,`m_fat_min`,`m_fat_max`,`m_carb_min`,`m_carb_max`,`m_fiber_min`,`kcal_offset`,`last_adjusted` FROM `person`");
                    pz1.k(aq2Var, "DROP TABLE `person`");
                    pz1.k(aq2Var, "ALTER TABLE `_new_person` RENAME TO `person`");
                    break;
            }
        }
        az azVarG = ja2Var.g(aq2Var);
        if (azVarG.a) {
            ja2Var.e(aq2Var);
            ea2Var.R(aq2Var);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + ((String) azVarG.b)).toString());
        }
    }

    public final void g() {
        qs qsVar = qs.c;
        char[] cArr = (char[]) this.c;
        qsVar.getClass();
        cArr.getClass();
        synchronized (qsVar) {
            int i = qsVar.b;
            if (cArr.length + i < th.a) {
                qsVar.b = i + cArr.length;
                qsVar.a.addLast(cArr);
            }
        }
    }

    public final void h(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public final void i(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public p4(int i, List list) {
        this.a = (byte) 3;
        this.b = i;
        this.c = list;
    }

    public p4(Shader shader, int i) {
        this.a = (byte) 1;
        this.c = shader;
        this.b = i;
    }

    public p4(ea2 ea2Var, int i) {
        this.a = (byte) 6;
        this.c = ea2Var;
        this.a = (byte) 6;
        this.b = i;
    }
}
