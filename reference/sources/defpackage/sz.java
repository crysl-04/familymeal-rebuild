package defpackage;

import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz implements kp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ sz(byte b) {
        this.h = b;
    }

    @Override // defpackage.kp0
    public final Object a() {
        switch (this.h) {
            case 0:
                uz.b("LocalWindowInfo");
                throw null;
            case 1:
                return new tz();
            case 2:
                return null;
            case 3:
                uz.b("LocalAutofillTree");
                throw null;
            case 4:
                uz.b("LocalAutofillManager");
                throw null;
            case 5:
                uz.b("LocalClipboardManager");
                throw null;
            case 6:
                uz.b("LocalClipboard");
                throw null;
            case 7:
                uz.b("LocalGraphicsContext");
                throw null;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                uz.b("LocalFontFamilyResolver");
                throw null;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                uz.b("LocalDensity");
                throw null;
            case 10:
                uz.b("LocalFocusManager");
                throw null;
            case 11:
                uz.b("LocalFontLoader");
                throw null;
            case 12:
                uz.b("LocalHapticFeedback");
                throw null;
            case 13:
                uz.b("LocalInputManager");
                throw null;
            case 14:
                uz.b("LocalLayoutDirection");
                throw null;
            case 15:
                uz.b("LocalProvidableLocaleList");
                throw null;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
            case 17:
                return null;
            case 18:
                uz.b("LocalTextToolbar");
                throw null;
            case 19:
                uz.b("LocalUriHandler");
                throw null;
            case 20:
                ez.b("Unexpected call to default provider");
                throw new a42((byte) 3);
            case 21:
                return rz1.x(new vv2((String) null, 0L, 7));
            case 22:
                return rz1.x(Boolean.FALSE);
            case 23:
            case 24:
                return Float.valueOf(0.0f);
            case 25:
                return Float.valueOf(1.0f);
            case 26:
                return Boolean.TRUE;
            case 27:
                return Boolean.FALSE;
            case 28:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            default:
                ie0 ie0Var = av0.a;
                return a70.a;
        }
    }
}
