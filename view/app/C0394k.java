package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.k */
class C0394k {

    /* renamed from: d */
    private static C0394k f1083d;

    /* renamed from: a */
    public long f1084a;

    /* renamed from: b */
    public long f1085b;

    /* renamed from: c */
    public int f1086c;

    C0394k() {
    }

    /* renamed from: a */
    static C0394k m1551a() {
        if (f1083d == null) {
            f1083d = new C0394k();
        }
        return f1083d;
    }

    /* renamed from: a */
    public void mo1378a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 9.0E-4f);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(round);
        double sin2 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.f1086c = 1;
        } else if (sin3 <= -1.0d) {
            this.f1086c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f1084a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            this.f1085b = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            if (this.f1085b >= j || this.f1084a <= j) {
                this.f1086c = 1;
                return;
            } else {
                this.f1086c = 0;
                return;
            }
        }
        this.f1084a = -1;
        this.f1085b = -1;
    }
}
