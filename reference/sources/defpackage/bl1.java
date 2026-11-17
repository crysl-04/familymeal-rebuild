package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 {
    public static final b82 m = new b82("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final b82 n = new b82("\\{(.+?)\\}");
    public static final b82 o = new b82("http[s]?://");
    public static final b82 p = new b82(".*");
    public static final b82 q = new b82("([^/]*?|)");
    public static final b82 r = new b82("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final yq2 d;
    public final yq2 e;
    public final d51 f;
    public boolean g;
    public final d51 h;
    public final d51 i;
    public final d51 j;
    public final yq2 k;
    public final boolean l;

    public bl1(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final byte b = z ? (byte) 1 : (byte) 0;
        this.d = new yq2(new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b2 = b;
                bl1 bl1Var = this.i;
                switch (b2) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b2 = 1;
        this.e = new yq2(new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b3 = b2;
                bl1 bl1Var = this.i;
                switch (b3) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b3 = 2;
        kp0 kp0Var = new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b4 = b3;
                bl1 bl1Var = this.i;
                switch (b4) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        g81 g81Var = g81.i;
        this.f = vs.N(g81Var, kp0Var);
        final byte b4 = 3;
        this.h = vs.N(g81Var, new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b5 = b4;
                bl1 bl1Var = this.i;
                switch (b5) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b5 = 4;
        this.i = vs.N(g81Var, new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b6 = b5;
                bl1 bl1Var = this.i;
                switch (b6) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b6 = 5;
        this.j = vs.N(g81Var, new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b7 = b6;
                bl1 bl1Var = this.i;
                switch (b7) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b7 = 6;
        this.k = new yq2(new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b8 = b7;
                bl1 bl1Var = this.i;
                switch (b8) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b8 = 7;
        new yq2(new kp0(this) { // from class: yk1
            public final /* synthetic */ bl1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                List list;
                byte b9 = b8;
                bl1 bl1Var = this.i;
                switch (b9) {
                    case 0:
                        String str2 = bl1Var.c;
                        if (str2 != null) {
                            return new b82(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(bl1.r.b(bl1Var.a));
                    case 2:
                        String str3 = bl1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) bl1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    li1.e(jp1.k("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) dv.y0(queryParameters);
                                if (str5 == null) {
                                    bl1Var.g = true;
                                    str5 = str4;
                                }
                                b82 b82Var = bl1.n;
                                b82Var.getClass();
                                str5.getClass();
                                Matcher matcher = b82Var.h.matcher(str5);
                                matcher.getClass();
                                al1 al1Var = new al1();
                                int i = 0;
                                for (eg egVarL = pz1.l(matcher, 0, str5); egVarL != null; egVarL = egVarL.v()) {
                                    fe1 fe1VarB = ((ge1) egVarL.k).b(1);
                                    fe1VarB.getClass();
                                    al1Var.b.add(fe1VarB.a);
                                    if (egVarL.p().h > i) {
                                        String strQuote = Pattern.quote(str5.substring(i, egVarL.p().h));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = egVarL.p().i + 1;
                                }
                                if (i < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                al1Var.a = bl1.g(sb.toString());
                                linkedHashMap.put(str4, al1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = bl1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        bl1.a(fragment, arrayList2, sb2);
                        return new wt1(arrayList2, sb2.toString());
                    case 4:
                        wt1 wt1Var = (wt1) bl1Var.h.getValue();
                        return (wt1Var == null || (list = (List) wt1Var.h) == null) ? new ArrayList() : list;
                    case 5:
                        wt1 wt1Var2 = (wt1) bl1Var.h.getValue();
                        if (wt1Var2 != null) {
                            return (String) wt1Var2.i;
                        }
                        return null;
                    case 6:
                        String str7 = (String) bl1Var.j.getValue();
                        if (str7 != null) {
                            return new b82(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.h.matcher(str).find()) {
            String strPattern = o.h.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        eg egVarL = pz1.l(matcher, 0, str);
        if (egVarL != null) {
            a(str.substring(0, egVarL.p().h), arrayList, sb);
            if (!p.h.matcher(sb).find() && !q.h.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = g(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        b82 b82Var = n;
        b82Var.getClass();
        Matcher matcher = b82Var.h.matcher(str);
        matcher.getClass();
        int i = 0;
        for (eg egVarL = pz1.l(matcher, 0, str); egVarL != null; egVarL = egVarL.v()) {
            fe1 fe1VarB = ((ge1) egVarL.k).b(1);
            fe1VarB.getClass();
            arrayList.add(fe1VarB.a);
            if (egVarL.p().h > i) {
                String strQuote = Pattern.quote(str.substring(i, egVarL.p().h));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.h.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = egVarL.p().i + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static String g(String str) {
        if (co2.Q(str, "\\Q", false) && co2.Q(str, "\\E", false)) {
            return jo2.M(str, ".*", "\\E.*\\Q");
        }
        return co2.Q(str, "\\.\\*", false) ? jo2.M(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        return dv.B0(pathSegments, uri2.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            iv.q0(((al1) it.next()).b, arrayList);
        }
        return dv.I0(dv.I0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        eg egVarA;
        eg egVarA2;
        String strDecode;
        uri.getClass();
        b82 b82Var = (b82) this.d.getValue();
        if (b82Var != null && (egVarA = b82Var.a(uri.toString())) != null) {
            Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
            if (e(egVarA, bundleL, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleL, linkedHashMap))) {
                String fragment = uri.getFragment();
                b82 b82Var2 = (b82) this.k.getValue();
                if (b82Var2 != null && (egVarA2 = b82Var2.a(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(ev.o0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            lt.h0();
                            throw null;
                        }
                        String str = (String) obj;
                        fe1 fe1VarB = ((ge1) egVarA2.k).b(i2);
                        if (fe1VarB != null) {
                            strDecode = Uri.decode(fe1VarB.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        if (linkedHashMap.get(str) != null) {
                            li1.c();
                            return null;
                        }
                        try {
                            str.getClass();
                            bundleL.putString(str, strDecode);
                            arrayList.add(j23.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (cu.N(linkedHashMap, new zk1(bundleL, (byte) 0)).isEmpty()) {
                    return bundleL;
                }
            }
        }
        return null;
    }

    public final boolean e(eg egVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(ev.o0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            String str = (String) obj;
            fe1 fe1VarB = ((ge1) egVar.k).b(i3);
            if (fe1VarB != null) {
                strDecode = Uri.decode(fe1VarB.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            if (linkedHashMap.get(str) != null) {
                li1.c();
                return false;
            }
            try {
                str.getClass();
                bundle.putString(str, strDecode);
                arrayList2.add(j23.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bl1)) {
            return false;
        }
        return this.a.equals(((bl1) obj).a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        eg egVar;
        Object objValueOf;
        String query;
        for (Map.Entry entry : ((Map) this.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            al1 al1Var = (al1) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = lt.P(query);
            }
            j23 j23Var = j23.a;
            boolean z = false;
            Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
            ArrayList arrayList = al1Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (linkedHashMap.get((String) obj) != null) {
                    li1.c();
                    return false;
                }
            }
            for (String str2 : queryParameters) {
                String str3 = al1Var.a;
                if (str3 != null) {
                    Pattern patternCompile = Pattern.compile(str3);
                    patternCompile.getClass();
                    str2.getClass();
                    Matcher matcher = patternCompile.matcher(str2);
                    matcher.getClass();
                    if (matcher.matches()) {
                        egVar = new eg(matcher, str2);
                    } else {
                        egVar = null;
                    }
                } else {
                    egVar = null;
                }
                if (egVar == null) {
                    return z;
                }
                ArrayList arrayList2 = al1Var.b;
                ArrayList arrayList3 = new ArrayList(ev.o0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i2 = z;
                int i3 = i2;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    boolean z2 = z;
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        lt.h0();
                        throw null;
                    }
                    String str4 = (String) obj2;
                    fe1 fe1VarB = ((ge1) egVar.k).b(i4);
                    String str5 = fe1VarB != null ? fe1VarB.a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (linkedHashMap.get(str4) != null) {
                        li1.c();
                        return z2;
                    }
                    try {
                        str4.getClass();
                        if (bundleL.containsKey(str4)) {
                            objValueOf = Boolean.valueOf(!bundleL.containsKey(str4));
                        } else {
                            bundleL.putString(str4, str5);
                            objValueOf = j23Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    i3 = i4;
                    z = z2;
                }
            }
            bundle.putAll(bundleL);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
