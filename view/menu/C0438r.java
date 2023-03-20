package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.widget.C0531l0;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p013d.p023k.C0187u;

/* renamed from: androidx.appcompat.view.menu.r */
final class C0438r extends C0429l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0432n, View.OnKeyListener {

    /* renamed from: x */
    private static final int f1338x = C0006g.abc_popup_menu_item_layout;

    /* renamed from: d */
    private final Context f1339d;

    /* renamed from: e */
    private final C0416g f1340e;

    /* renamed from: f */
    private final C0415f f1341f;

    /* renamed from: g */
    private final boolean f1342g;

    /* renamed from: h */
    private final int f1343h;

    /* renamed from: i */
    private final int f1344i;

    /* renamed from: j */
    private final int f1345j;

    /* renamed from: k */
    final C0531l0 f1346k;

    /* renamed from: l */
    final ViewTreeObserver.OnGlobalLayoutListener f1347l = new C0439a();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1348m = new C0440b();

    /* renamed from: n */
    private PopupWindow.OnDismissListener f1349n;

    /* renamed from: o */
    private View f1350o;

    /* renamed from: p */
    View f1351p;

    /* renamed from: q */
    private C0432n.C0433a f1352q;

    /* renamed from: r */
    ViewTreeObserver f1353r;

    /* renamed from: s */
    private boolean f1354s;

    /* renamed from: t */
    private boolean f1355t;

    /* renamed from: u */
    private int f1356u;

    /* renamed from: v */
    private int f1357v = 0;

    /* renamed from: w */
    private boolean f1358w;

    /* renamed from: androidx.appcompat.view.menu.r$a */
    class C0439a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0439a() {
        }

        public void onGlobalLayout() {
            if (C0438r.this.mo1498c() && !C0438r.this.f1346k.mo2346l()) {
                View view = C0438r.this.f1351p;
                if (view == null || !view.isShown()) {
                    C0438r.this.dismiss();
                } else {
                    C0438r.this.f1346k.mo1488a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.r$b */
    class C0440b implements View.OnAttachStateChangeListener {
        C0440b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0438r.this.f1353r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0438r.this.f1353r = view.getViewTreeObserver();
                }
                C0438r rVar = C0438r.this;
                rVar.f1353r.removeGlobalOnLayoutListener(rVar.f1347l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0438r(Context context, C0416g gVar, View view, int i, int i2, boolean z) {
        this.f1339d = context;
        this.f1340e = gVar;
        this.f1342g = z;
        this.f1341f = new C0415f(gVar, LayoutInflater.from(context), this.f1342g, f1338x);
        this.f1344i = i;
        this.f1345j = i2;
        Resources resources = context.getResources();
        this.f1343h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
        this.f1350o = view;
        this.f1346k = new C0531l0(this.f1339d, (AttributeSet) null, this.f1344i, this.f1345j);
        gVar.mo1540a((C0432n) this, context);
    }

    /* renamed from: g */
    private boolean m1846g() {
        View view;
        if (mo1498c()) {
            return true;
        }
        if (this.f1354s || (view = this.f1350o) == null) {
            return false;
        }
        this.f1351p = view;
        this.f1346k.mo2328a((PopupWindow.OnDismissListener) this);
        this.f1346k.mo2326a((AdapterView.OnItemClickListener) this);
        this.f1346k.mo2329a(true);
        View view2 = this.f1351p;
        boolean z = this.f1353r == null;
        this.f1353r = view2.getViewTreeObserver();
        if (z) {
            this.f1353r.addOnGlobalLayoutListener(this.f1347l);
        }
        view2.addOnAttachStateChangeListener(this.f1348m);
        this.f1346k.mo2325a(view2);
        this.f1346k.mo2337f(this.f1357v);
        if (!this.f1355t) {
            this.f1356u = C0429l.m1799a(this.f1341f, (ViewGroup) null, this.f1339d, this.f1343h);
            this.f1355t = true;
        }
        this.f1346k.mo2335e(this.f1356u);
        this.f1346k.mo2338g(2);
        this.f1346k.mo2323a(mo1723f());
        this.f1346k.mo1488a();
        ListView e = this.f1346k.mo1501e();
        e.setOnKeyListener(this);
        if (this.f1358w && this.f1340e.mo1578h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1339d).inflate(C0006g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1340e.mo1578h());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1346k.mo2327a((ListAdapter) this.f1341f);
        this.f1346k.mo1488a();
        return true;
    }

    /* renamed from: a */
    public void mo1488a() {
        if (!m1846g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo1489a(int i) {
        this.f1357v = i;
    }

    /* renamed from: a */
    public void mo1490a(View view) {
        this.f1350o = view;
    }

    /* renamed from: a */
    public void mo1491a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1349n = onDismissListener;
    }

    /* renamed from: a */
    public void mo1492a(C0416g gVar) {
    }

    /* renamed from: a */
    public void mo1473a(C0416g gVar, boolean z) {
        if (gVar == this.f1340e) {
            dismiss();
            C0432n.C0433a aVar = this.f1352q;
            if (aVar != null) {
                aVar.mo1345a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo1475a(C0432n.C0433a aVar) {
        this.f1352q = aVar;
    }

    /* renamed from: a */
    public void mo1476a(boolean z) {
        this.f1355t = false;
        C0415f fVar = this.f1341f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo1480a(C0441s sVar) {
        if (sVar.hasVisibleItems()) {
            C0430m mVar = new C0430m(this.f1339d, sVar, this.f1351p, this.f1342g, this.f1344i, this.f1345j);
            mVar.mo1729a(this.f1352q);
            mVar.mo1730a(C0429l.m1801b((C0416g) sVar));
            mVar.mo1728a(this.f1349n);
            this.f1349n = null;
            this.f1340e.mo1542a(false);
            int b = this.f1346k.mo2330b();
            int f = this.f1346k.mo2336f();
            if ((Gravity.getAbsoluteGravity(this.f1357v, C0187u.m715i(this.f1350o)) & 7) == 5) {
                b += this.f1350o.getWidth();
            }
            if (mVar.mo1731a(b, f)) {
                C0432n.C0433a aVar = this.f1352q;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1346a(sVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo1493b(int i) {
        this.f1346k.mo2332c(i);
    }

    /* renamed from: b */
    public void mo1494b(boolean z) {
        this.f1341f.mo1521a(z);
    }

    /* renamed from: b */
    public boolean mo1495b() {
        return false;
    }

    /* renamed from: c */
    public void mo1496c(int i) {
        this.f1346k.mo2322a(i);
    }

    /* renamed from: c */
    public void mo1497c(boolean z) {
        this.f1358w = z;
    }

    /* renamed from: c */
    public boolean mo1498c() {
        return !this.f1354s && this.f1346k.mo1498c();
    }

    public void dismiss() {
        if (mo1498c()) {
            this.f1346k.dismiss();
        }
    }

    /* renamed from: e */
    public ListView mo1501e() {
        return this.f1346k.mo1501e();
    }

    public void onDismiss() {
        this.f1354s = true;
        this.f1340e.close();
        ViewTreeObserver viewTreeObserver = this.f1353r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1353r = this.f1351p.getViewTreeObserver();
            }
            this.f1353r.removeGlobalOnLayoutListener(this.f1347l);
            this.f1353r = null;
        }
        this.f1351p.removeOnAttachStateChangeListener(this.f1348m);
        PopupWindow.OnDismissListener onDismissListener = this.f1349n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
