package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0432n;
import p000a.p013d.p023k.C0155d;
import p000a.p013d.p023k.C0187u;

/* renamed from: androidx.appcompat.view.menu.m */
public class C0430m implements C0420i {

    /* renamed from: a */
    private final Context f1324a;

    /* renamed from: b */
    private final C0416g f1325b;

    /* renamed from: c */
    private final boolean f1326c;

    /* renamed from: d */
    private final int f1327d;

    /* renamed from: e */
    private final int f1328e;

    /* renamed from: f */
    private View f1329f;

    /* renamed from: g */
    private int f1330g;

    /* renamed from: h */
    private boolean f1331h;

    /* renamed from: i */
    private C0432n.C0433a f1332i;

    /* renamed from: j */
    private C0429l f1333j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1334k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1335l;

    /* renamed from: androidx.appcompat.view.menu.m$a */
    class C0431a implements PopupWindow.OnDismissListener {
        C0431a() {
        }

        public void onDismiss() {
            C0430m.this.mo1734d();
        }
    }

    public C0430m(Context context, C0416g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0430m(Context context, C0416g gVar, View view, boolean z, int i, int i2) {
        this.f1330g = 8388611;
        this.f1335l = new C0431a();
        this.f1324a = context;
        this.f1325b = gVar;
        this.f1329f = view;
        this.f1326c = z;
        this.f1327d = i;
        this.f1328e = i2;
    }

    /* renamed from: a */
    private void m1816a(int i, int i2, boolean z, boolean z2) {
        C0429l b = mo1732b();
        b.mo1497c(z2);
        if (z) {
            if ((C0155d.m588a(this.f1330g, C0187u.m715i(this.f1329f)) & 7) == 5) {
                i -= this.f1329f.getWidth();
            }
            b.mo1493b(i);
            b.mo1496c(i2);
            int i3 = (int) ((this.f1324a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo1722a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo1488a();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0429l m1817g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1324a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1324a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p000a.p001a.C0003d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1324a
            android.view.View r3 = r14.f1329f
            int r4 = r14.f1327d
            int r5 = r14.f1328e
            boolean r6 = r14.f1326c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.r r0 = new androidx.appcompat.view.menu.r
            android.content.Context r8 = r14.f1324a
            androidx.appcompat.view.menu.g r9 = r14.f1325b
            android.view.View r10 = r14.f1329f
            int r11 = r14.f1327d
            int r12 = r14.f1328e
            boolean r13 = r14.f1326c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1325b
            r0.mo1492a((androidx.appcompat.view.menu.C0416g) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1335l
            r0.mo1491a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f1329f
            r0.mo1490a((android.view.View) r1)
            androidx.appcompat.view.menu.n$a r1 = r14.f1332i
            r0.mo1475a((androidx.appcompat.view.menu.C0432n.C0433a) r1)
            boolean r1 = r14.f1331h
            r0.mo1494b((boolean) r1)
            int r1 = r14.f1330g
            r0.mo1489a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0430m.m1817g():androidx.appcompat.view.menu.l");
    }

    /* renamed from: a */
    public void mo1725a() {
        if (mo1733c()) {
            this.f1333j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo1726a(int i) {
        this.f1330g = i;
    }

    /* renamed from: a */
    public void mo1727a(View view) {
        this.f1329f = view;
    }

    /* renamed from: a */
    public void mo1728a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1334k = onDismissListener;
    }

    /* renamed from: a */
    public void mo1729a(C0432n.C0433a aVar) {
        this.f1332i = aVar;
        C0429l lVar = this.f1333j;
        if (lVar != null) {
            lVar.mo1475a(aVar);
        }
    }

    /* renamed from: a */
    public void mo1730a(boolean z) {
        this.f1331h = z;
        C0429l lVar = this.f1333j;
        if (lVar != null) {
            lVar.mo1494b(z);
        }
    }

    /* renamed from: a */
    public boolean mo1731a(int i, int i2) {
        if (mo1733c()) {
            return true;
        }
        if (this.f1329f == null) {
            return false;
        }
        m1816a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0429l mo1732b() {
        if (this.f1333j == null) {
            this.f1333j = m1817g();
        }
        return this.f1333j;
    }

    /* renamed from: c */
    public boolean mo1733c() {
        C0429l lVar = this.f1333j;
        return lVar != null && lVar.mo1498c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1734d() {
        this.f1333j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1334k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo1735e() {
        if (!mo1736f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo1736f() {
        if (mo1733c()) {
            return true;
        }
        if (this.f1329f == null) {
            return false;
        }
        m1816a(0, 0, false, false);
        return true;
    }
}
