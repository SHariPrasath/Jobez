package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.widget.C0529k0;
import androidx.appcompat.widget.C0531l0;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p013d.p023k.C0155d;
import p000a.p013d.p023k.C0187u;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0407d extends C0429l implements C0432n, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: D */
    private static final int f1196D = C0006g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    ViewTreeObserver f1197A;

    /* renamed from: B */
    private PopupWindow.OnDismissListener f1198B;

    /* renamed from: C */
    boolean f1199C;

    /* renamed from: d */
    private final Context f1200d;

    /* renamed from: e */
    private final int f1201e;

    /* renamed from: f */
    private final int f1202f;

    /* renamed from: g */
    private final int f1203g;

    /* renamed from: h */
    private final boolean f1204h;

    /* renamed from: i */
    final Handler f1205i;

    /* renamed from: j */
    private final List<C0416g> f1206j = new ArrayList();

    /* renamed from: k */
    final List<C0412d> f1207k = new ArrayList();

    /* renamed from: l */
    final ViewTreeObserver.OnGlobalLayoutListener f1208l = new C0408a();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1209m = new C0409b();

    /* renamed from: n */
    private final C0529k0 f1210n = new C0410c();

    /* renamed from: o */
    private int f1211o = 0;

    /* renamed from: p */
    private int f1212p = 0;

    /* renamed from: q */
    private View f1213q;

    /* renamed from: r */
    View f1214r;

    /* renamed from: s */
    private int f1215s;

    /* renamed from: t */
    private boolean f1216t;

    /* renamed from: u */
    private boolean f1217u;

    /* renamed from: v */
    private int f1218v;

    /* renamed from: w */
    private int f1219w;

    /* renamed from: x */
    private boolean f1220x;

    /* renamed from: y */
    private boolean f1221y;

    /* renamed from: z */
    private C0432n.C0433a f1222z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0408a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0408a() {
        }

        public void onGlobalLayout() {
            if (C0407d.this.mo1498c() && C0407d.this.f1207k.size() > 0 && !C0407d.this.f1207k.get(0).f1230a.mo2346l()) {
                View view = C0407d.this.f1214r;
                if (view == null || !view.isShown()) {
                    C0407d.this.dismiss();
                    return;
                }
                for (C0412d dVar : C0407d.this.f1207k) {
                    dVar.f1230a.mo1488a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0409b implements View.OnAttachStateChangeListener {
        C0409b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0407d.this.f1197A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0407d.this.f1197A = view.getViewTreeObserver();
                }
                C0407d dVar = C0407d.this;
                dVar.f1197A.removeGlobalOnLayoutListener(dVar.f1208l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0410c implements C0529k0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0411a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C0412d f1226c;

            /* renamed from: d */
            final /* synthetic */ MenuItem f1227d;

            /* renamed from: e */
            final /* synthetic */ C0416g f1228e;

            C0411a(C0412d dVar, MenuItem menuItem, C0416g gVar) {
                this.f1226c = dVar;
                this.f1227d = menuItem;
                this.f1228e = gVar;
            }

            public void run() {
                C0412d dVar = this.f1226c;
                if (dVar != null) {
                    C0407d.this.f1199C = true;
                    dVar.f1231b.mo1542a(false);
                    C0407d.this.f1199C = false;
                }
                if (this.f1227d.isEnabled() && this.f1227d.hasSubMenu()) {
                    this.f1228e.mo1543a(this.f1227d, 4);
                }
            }
        }

        C0410c() {
        }

        /* renamed from: a */
        public void mo1507a(C0416g gVar, MenuItem menuItem) {
            C0412d dVar = null;
            C0407d.this.f1205i.removeCallbacksAndMessages((Object) null);
            int size = C0407d.this.f1207k.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0407d.this.f1207k.get(i).f1231b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0407d.this.f1207k.size()) {
                    dVar = C0407d.this.f1207k.get(i2);
                }
                C0407d.this.f1205i.postAtTime(new C0411a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo1508b(C0416g gVar, MenuItem menuItem) {
            C0407d.this.f1205i.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0412d {

        /* renamed from: a */
        public final C0531l0 f1230a;

        /* renamed from: b */
        public final C0416g f1231b;

        /* renamed from: c */
        public final int f1232c;

        public C0412d(C0531l0 l0Var, C0416g gVar, int i) {
            this.f1230a = l0Var;
            this.f1231b = gVar;
            this.f1232c = i;
        }

        /* renamed from: a */
        public ListView mo1510a() {
            return this.f1230a.mo1501e();
        }
    }

    public C0407d(Context context, View view, int i, int i2, boolean z) {
        this.f1200d = context;
        this.f1213q = view;
        this.f1202f = i;
        this.f1203g = i2;
        this.f1204h = z;
        this.f1220x = false;
        this.f1215s = m1664h();
        Resources resources = context.getResources();
        this.f1201e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
        this.f1205i = new Handler();
    }

    /* renamed from: a */
    private MenuItem m1658a(C0416g gVar, C0416g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m1659a(C0412d dVar, C0416g gVar) {
        int i;
        C0415f fVar;
        int firstVisiblePosition;
        MenuItem a = m1658a(dVar.f1231b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo1510a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0415f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0415f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m1660c(C0416g gVar) {
        int size = this.f1207k.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f1207k.get(i).f1231b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m1661d(int i) {
        List<C0412d> list = this.f1207k;
        ListView a = list.get(list.size() - 1).mo1510a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1214r.getWindowVisibleDisplayFrame(rect);
        return this.f1215s == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m1662d(C0416g gVar) {
        View view;
        C0412d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1200d);
        C0415f fVar = new C0415f(gVar, from, this.f1204h, f1196D);
        if (!mo1498c() && this.f1220x) {
            fVar.mo1521a(true);
        } else if (mo1498c()) {
            fVar.mo1521a(C0429l.m1801b(gVar));
        }
        int a = C0429l.m1799a(fVar, (ViewGroup) null, this.f1200d, this.f1201e);
        C0531l0 g = m1663g();
        g.mo2327a((ListAdapter) fVar);
        g.mo2335e(a);
        g.mo2337f(this.f1212p);
        if (this.f1207k.size() > 0) {
            List<C0412d> list = this.f1207k;
            dVar = list.get(list.size() - 1);
            view = m1659a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            g.mo2369c(false);
            g.mo2367a((Object) null);
            int d = m1661d(a);
            boolean z = d == 1;
            this.f1215s = d;
            if (Build.VERSION.SDK_INT >= 26) {
                g.mo2325a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1213q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1212p & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1213q.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1212p & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                g.mo2332c(i3);
                g.mo2331b(true);
                g.mo2322a(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                g.mo2332c(i3);
                g.mo2331b(true);
                g.mo2322a(i2);
            }
            i3 = i + a;
            g.mo2332c(i3);
            g.mo2331b(true);
            g.mo2322a(i2);
        } else {
            if (this.f1216t) {
                g.mo2332c(this.f1218v);
            }
            if (this.f1217u) {
                g.mo2322a(this.f1219w);
            }
            g.mo2323a(mo1723f());
        }
        this.f1207k.add(new C0412d(g, gVar, this.f1215s));
        g.mo1488a();
        ListView e = g.mo1501e();
        e.setOnKeyListener(this);
        if (dVar == null && this.f1221y && gVar.mo1578h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0006g.abc_popup_menu_header_item_layout, e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo1578h());
            e.addHeaderView(frameLayout, (Object) null, false);
            g.mo1488a();
        }
    }

    /* renamed from: g */
    private C0531l0 m1663g() {
        C0531l0 l0Var = new C0531l0(this.f1200d, (AttributeSet) null, this.f1202f, this.f1203g);
        l0Var.mo2366a(this.f1210n);
        l0Var.mo2326a((AdapterView.OnItemClickListener) this);
        l0Var.mo2328a((PopupWindow.OnDismissListener) this);
        l0Var.mo2325a(this.f1213q);
        l0Var.mo2337f(this.f1212p);
        l0Var.mo2329a(true);
        l0Var.mo2338g(2);
        return l0Var;
    }

    /* renamed from: h */
    private int m1664h() {
        return C0187u.m715i(this.f1213q) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo1488a() {
        if (!mo1498c()) {
            for (C0416g d : this.f1206j) {
                m1662d(d);
            }
            this.f1206j.clear();
            this.f1214r = this.f1213q;
            if (this.f1214r != null) {
                boolean z = this.f1197A == null;
                this.f1197A = this.f1214r.getViewTreeObserver();
                if (z) {
                    this.f1197A.addOnGlobalLayoutListener(this.f1208l);
                }
                this.f1214r.addOnAttachStateChangeListener(this.f1209m);
            }
        }
    }

    /* renamed from: a */
    public void mo1489a(int i) {
        if (this.f1211o != i) {
            this.f1211o = i;
            this.f1212p = C0155d.m588a(i, C0187u.m715i(this.f1213q));
        }
    }

    /* renamed from: a */
    public void mo1490a(View view) {
        if (this.f1213q != view) {
            this.f1213q = view;
            this.f1212p = C0155d.m588a(this.f1211o, C0187u.m715i(this.f1213q));
        }
    }

    /* renamed from: a */
    public void mo1491a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1198B = onDismissListener;
    }

    /* renamed from: a */
    public void mo1492a(C0416g gVar) {
        gVar.mo1540a((C0432n) this, this.f1200d);
        if (mo1498c()) {
            m1662d(gVar);
        } else {
            this.f1206j.add(gVar);
        }
    }

    /* renamed from: a */
    public void mo1473a(C0416g gVar, boolean z) {
        int c = m1660c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f1207k.size()) {
                this.f1207k.get(i).f1231b.mo1542a(false);
            }
            C0412d remove = this.f1207k.remove(c);
            remove.f1231b.mo1559b((C0432n) this);
            if (this.f1199C) {
                remove.f1230a.mo2368b((Object) null);
                remove.f1230a.mo2334d(0);
            }
            remove.f1230a.dismiss();
            int size = this.f1207k.size();
            this.f1215s = size > 0 ? this.f1207k.get(size - 1).f1232c : m1664h();
            if (size == 0) {
                dismiss();
                C0432n.C0433a aVar = this.f1222z;
                if (aVar != null) {
                    aVar.mo1345a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1197A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1197A.removeGlobalOnLayoutListener(this.f1208l);
                    }
                    this.f1197A = null;
                }
                this.f1214r.removeOnAttachStateChangeListener(this.f1209m);
                this.f1198B.onDismiss();
            } else if (z) {
                this.f1207k.get(0).f1231b.mo1542a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo1475a(C0432n.C0433a aVar) {
        this.f1222z = aVar;
    }

    /* renamed from: a */
    public void mo1476a(boolean z) {
        for (C0412d a : this.f1207k) {
            C0429l.m1800a(a.mo1510a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo1480a(C0441s sVar) {
        for (C0412d next : this.f1207k) {
            if (sVar == next.f1231b) {
                next.mo1510a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        mo1492a((C0416g) sVar);
        C0432n.C0433a aVar = this.f1222z;
        if (aVar != null) {
            aVar.mo1346a(sVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo1493b(int i) {
        this.f1216t = true;
        this.f1218v = i;
    }

    /* renamed from: b */
    public void mo1494b(boolean z) {
        this.f1220x = z;
    }

    /* renamed from: b */
    public boolean mo1495b() {
        return false;
    }

    /* renamed from: c */
    public void mo1496c(int i) {
        this.f1217u = true;
        this.f1219w = i;
    }

    /* renamed from: c */
    public void mo1497c(boolean z) {
        this.f1221y = z;
    }

    /* renamed from: c */
    public boolean mo1498c() {
        return this.f1207k.size() > 0 && this.f1207k.get(0).f1230a.mo1498c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1499d() {
        return false;
    }

    public void dismiss() {
        int size = this.f1207k.size();
        if (size > 0) {
            C0412d[] dVarArr = (C0412d[]) this.f1207k.toArray(new C0412d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0412d dVar = dVarArr[i];
                if (dVar.f1230a.mo1498c()) {
                    dVar.f1230a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public ListView mo1501e() {
        if (this.f1207k.isEmpty()) {
            return null;
        }
        List<C0412d> list = this.f1207k;
        return list.get(list.size() - 1).mo1510a();
    }

    public void onDismiss() {
        C0412d dVar;
        int size = this.f1207k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1207k.get(i);
            if (!dVar.f1230a.mo1498c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1231b.mo1542a(false);
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
