package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kl1 i;

    public /* synthetic */ lg(kl1 kl1Var, byte b) {
        this.h = b;
        this.i = kl1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        final byte b2 = 1;
        j23 j23Var = j23.a;
        final kl1 kl1Var = this.i;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                kl1.a(kl1Var, "ingredient/".concat(str));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                kl1.a(kl1Var, "recipe/".concat(str2));
                break;
            case 2:
                wl1 wl1Var = (wl1) obj;
                wl1Var.getClass();
                int i = gl1.n;
                wl1Var.d = ls.x(kl1Var.b.g()).i.b;
                wl1Var.e = true;
                wl1Var.b = true;
                wl1Var.c = true;
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                kl1.a(kl1Var, "weight/".concat(str3));
                break;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                kl1.a(kl1Var, "person/".concat(str4));
                break;
            default:
                hl1 hl1Var = (hl1) obj;
                hl1Var.getClass();
                vs.v(hl1Var, "week", ia2.b);
                final byte b3 = 4;
                vs.v(hl1Var, "recipes", new nx(-1184017262, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b4 = b3;
                        byte b5 = 3;
                        byte b6 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b7 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b4) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b8 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b8);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b7);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b6);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b5);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                final byte b4 = 5;
                vs.v(hl1Var, "ingredients", new nx(-1599344079, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b5 = b4;
                        byte b6 = 3;
                        byte b7 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b8 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b5) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b9 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b9);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b8);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b7);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b6);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                final byte b5 = 6;
                vs.v(hl1Var, "people", new nx(-2014670896, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b6 = b5;
                        byte b7 = 3;
                        byte b8 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b9 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b6) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b10 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b10);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b9);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b8);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b7);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                final byte b6 = 7;
                vs.v(hl1Var, "person/{id}", new nx(1864969583, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b7 = b6;
                        byte b8 = 3;
                        byte b9 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b10 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b7) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b11 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b11);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b10);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b9);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b8);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                final byte b7 = 0;
                vs.v(hl1Var, "weight/{id}", new nx(1449642766, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b8 = b7;
                        byte b9 = 3;
                        byte b10 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b11 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b8) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b12 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b12);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b11);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b10);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b9);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                vs.v(hl1Var, "schedule", new nx(1034315949, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b8 = b2;
                        byte b9 = 3;
                        byte b10 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b11 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b8) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b12 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b12);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b11);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b10);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b9);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                vs.v(hl1Var, "settings", ia2.c);
                final byte b8 = 2;
                vs.v(hl1Var, "recipe/{id}", new nx(203662315, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b9 = b8;
                        byte b10 = 3;
                        byte b11 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b12 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b9) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b13 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b13);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b12);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b11);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b10);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                final byte b9 = 3;
                vs.v(hl1Var, "ingredient/{id}", new nx(-211664502, true, new bq0() { // from class: jg
                    @Override // defpackage.bq0
                    public final Object o(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        byte b10 = b9;
                        byte b11 = 3;
                        byte b12 = 4;
                        String string4 = null;
                        j23 j23Var2 = j23.a;
                        yy yyVar = zy.a;
                        kl1 kl1Var2 = kl1Var;
                        byte b13 = 0;
                        pk1 pk1Var = (pk1) obj3;
                        dr0 dr0Var = (dr0) obj4;
                        ((Integer) obj5).getClass();
                        ((hc) obj2).getClass();
                        pk1Var.getClass();
                        switch (b10) {
                            case 0:
                                Bundle bundleA = pk1Var.a();
                                string4 = bundleA != null ? bundleA.getString("id") : null;
                                if (string4 == null) {
                                    string4 = "";
                                }
                                boolean zH = dr0Var.h(kl1Var2);
                                Object objK = dr0Var.K();
                                if (zH || objK == yyVar) {
                                    objK = new mg(kl1Var2, (byte) 7);
                                    dr0Var.f0(objK);
                                }
                                tz0.j(string4, (kp0) objK, dr0Var, 0);
                                break;
                            case 1:
                                boolean zH2 = dr0Var.h(kl1Var2);
                                Object objK2 = dr0Var.K();
                                if (zH2 || objK2 == yyVar) {
                                    objK2 = new mg(kl1Var2, (byte) 3);
                                    dr0Var.f0(objK2);
                                }
                                rz1.c((kp0) objK2, dr0Var, 0);
                                break;
                            case 2:
                                Bundle bundleA2 = pk1Var.a();
                                if (bundleA2 != null && (string = bundleA2.getString("id")) != null && !string.equals("new")) {
                                    string4 = string;
                                }
                                boolean zH3 = dr0Var.h(kl1Var2);
                                Object objK3 = dr0Var.K();
                                if (zH3 || objK3 == yyVar) {
                                    objK3 = new mg(kl1Var2, (byte) 2);
                                    dr0Var.f0(objK3);
                                }
                                v62.c(string4, (kp0) objK3, dr0Var, 0);
                                break;
                            case 3:
                                Bundle bundleA3 = pk1Var.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("id")) != null && !string2.equals("new")) {
                                    string4 = string2;
                                }
                                boolean zH4 = dr0Var.h(kl1Var2);
                                Object objK4 = dr0Var.K();
                                if (zH4 || objK4 == yyVar) {
                                    objK4 = new mg(kl1Var2, (byte) 8);
                                    dr0Var.f0(objK4);
                                }
                                ou.g(string4, (kp0) objK4, dr0Var, 0);
                                break;
                            case 4:
                                boolean zH5 = dr0Var.h(kl1Var2);
                                Object objK5 = dr0Var.K();
                                byte b14 = 1;
                                if (zH5 || objK5 == yyVar) {
                                    objK5 = new lg(kl1Var2, b14);
                                    dr0Var.f0(objK5);
                                }
                                vp0 vp0Var = (vp0) objK5;
                                boolean zH6 = dr0Var.h(kl1Var2);
                                Object objK6 = dr0Var.K();
                                if (zH6 || objK6 == yyVar) {
                                    objK6 = new mg(kl1Var2, (byte) 1);
                                    dr0Var.f0(objK6);
                                }
                                pz1.d(vp0Var, (kp0) objK6, dr0Var, 0);
                                break;
                            case 5:
                                boolean zH7 = dr0Var.h(kl1Var2);
                                Object objK7 = dr0Var.K();
                                if (zH7 || objK7 == yyVar) {
                                    objK7 = new lg(kl1Var2, b13);
                                    dr0Var.f0(objK7);
                                }
                                vp0 vp0Var2 = (vp0) objK7;
                                boolean zH8 = dr0Var.h(kl1Var2);
                                Object objK8 = dr0Var.K();
                                if (zH8 || objK8 == yyVar) {
                                    objK8 = new mg(kl1Var2, (byte) 0);
                                    dr0Var.f0(objK8);
                                }
                                es.c(vp0Var2, (kp0) objK8, dr0Var, 0);
                                break;
                            case 6:
                                boolean zH9 = dr0Var.h(kl1Var2);
                                Object objK9 = dr0Var.K();
                                if (zH9 || objK9 == yyVar) {
                                    objK9 = new lg(kl1Var2, b12);
                                    dr0Var.f0(objK9);
                                }
                                vp0 vp0Var3 = (vp0) objK9;
                                boolean zH10 = dr0Var.h(kl1Var2);
                                Object objK10 = dr0Var.K();
                                if (zH10 || objK10 == yyVar) {
                                    objK10 = new mg(kl1Var2, (byte) 5);
                                    dr0Var.f0(objK10);
                                }
                                kp0 kp0Var = (kp0) objK10;
                                boolean zH11 = dr0Var.h(kl1Var2);
                                Object objK11 = dr0Var.K();
                                if (zH11 || objK11 == yyVar) {
                                    objK11 = new mg(kl1Var2, (byte) 6);
                                    dr0Var.f0(objK11);
                                }
                                cu.m(vp0Var3, kp0Var, (kp0) objK11, dr0Var, 0);
                                break;
                            default:
                                Bundle bundleA4 = pk1Var.a();
                                if (bundleA4 != null && (string3 = bundleA4.getString("id")) != null && !string3.equals("new")) {
                                    string4 = string3;
                                }
                                boolean zH12 = dr0Var.h(kl1Var2);
                                Object objK12 = dr0Var.K();
                                if (zH12 || objK12 == yyVar) {
                                    objK12 = new mg(kl1Var2, (byte) 4);
                                    dr0Var.f0(objK12);
                                }
                                kp0 kp0Var2 = (kp0) objK12;
                                boolean zH13 = dr0Var.h(kl1Var2);
                                Object objK13 = dr0Var.K();
                                if (zH13 || objK13 == yyVar) {
                                    objK13 = new lg(kl1Var2, b11);
                                    dr0Var.f0(objK13);
                                }
                                h7.O(string4, kp0Var2, (vp0) objK13, dr0Var, 0);
                                break;
                        }
                        return j23Var2;
                    }
                }));
                break;
        }
        return j23Var;
    }
}
