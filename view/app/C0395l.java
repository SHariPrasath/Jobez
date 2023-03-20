package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p013d.p014d.C0079c;

/* renamed from: androidx.appcompat.app.l */
class C0395l {

    /* renamed from: d */
    private static C0395l f1087d;

    /* renamed from: a */
    private final Context f1088a;

    /* renamed from: b */
    private final LocationManager f1089b;

    /* renamed from: c */
    private final C0396a f1090c = new C0396a();

    /* renamed from: androidx.appcompat.app.l$a */
    private static class C0396a {

        /* renamed from: a */
        boolean f1091a;

        /* renamed from: b */
        long f1092b;

        /* renamed from: c */
        long f1093c;

        /* renamed from: d */
        long f1094d;

        /* renamed from: e */
        long f1095e;

        /* renamed from: f */
        long f1096f;

        C0396a() {
        }
    }

    C0395l(Context context, LocationManager locationManager) {
        this.f1088a = context;
        this.f1089b = locationManager;
    }

    /* renamed from: a */
    private Location m1553a(String str) {
        try {
            if (this.f1089b.isProviderEnabled(str)) {
                return this.f1089b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0395l m1554a(Context context) {
        if (f1087d == null) {
            Context applicationContext = context.getApplicationContext();
            f1087d = new C0395l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1087d;
    }

    /* renamed from: a */
    private void m1555a(Location location) {
        long j;
        C0396a aVar = this.f1090c;
        long currentTimeMillis = System.currentTimeMillis();
        C0394k a = C0394k.m1551a();
        C0394k kVar = a;
        kVar.mo1378a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1084a;
        kVar.mo1378a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1086c == 1;
        long j3 = a.f1085b;
        long j4 = j2;
        long j5 = a.f1084a;
        long j6 = j3;
        boolean z2 = z;
        a.mo1378a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f1085b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f1091a = z2;
        aVar.f1092b = j4;
        aVar.f1093c = j6;
        aVar.f1094d = j5;
        aVar.f1095e = j7;
        aVar.f1096f = j;
    }

    /* renamed from: b */
    private Location m1556b() {
        Location location = null;
        Location a = C0079c.m314a(this.f1088a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1553a("network") : null;
        if (C0079c.m314a(this.f1088a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1553a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m1557c() {
        return this.f1090c.f1096f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1379a() {
        C0396a aVar = this.f1090c;
        if (m1557c()) {
            return aVar.f1091a;
        }
        Location b = m1556b();
        if (b != null) {
            m1555a(b);
            return aVar.f1091a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
