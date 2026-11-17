package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pe extends r1 {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ te d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(te teVar, Context context) {
        super(teVar);
        this.d = teVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.r1
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // defpackage.r1
    public final int f() {
        Location lastKnownLocation;
        boolean z;
        long j;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return !((PowerManager) obj).isPowerSaveMode() ? 1 : 2;
            default:
                eg egVar = (eg) obj;
                ea eaVar = (ea) egVar.j;
                LocationManager locationManager = (LocationManager) egVar.i;
                if (eaVar.b > System.currentTimeMillis()) {
                    z = eaVar.a;
                } else {
                    Context context = (Context) egVar.k;
                    Location lastKnownLocation2 = null;
                    if (ou.n(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (ou.n(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 != null && (lastKnownLocation == null || lastKnownLocation2.getTime() > lastKnownLocation.getTime())) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        r03 r03Var = r03.d;
                        if (r03Var == null) {
                            r03Var = new r03();
                            r03.d = r03Var;
                        }
                        r03 r03Var2 = r03Var;
                        r03Var2.a(jCurrentTimeMillis - 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        r03Var2.a(jCurrentTimeMillis, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        z = r03Var2.c;
                        long j2 = r03Var2.b;
                        long j3 = r03Var2.a;
                        r03Var2.a(jCurrentTimeMillis + 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        long j4 = r03Var2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        eaVar.a = z;
                        eaVar.b = j;
                    } else {
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return !z ? 1 : 2;
        }
    }

    @Override // defpackage.r1
    public final void j() {
        byte b = this.c;
        te teVar = this.d;
        switch (b) {
            case 0:
                teVar.e(true);
                break;
            default:
                teVar.e(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(te teVar, eg egVar) {
        super(teVar);
        this.d = teVar;
        this.e = egVar;
    }
}
