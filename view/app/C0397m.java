package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0355a;
import androidx.appcompat.view.menu.C0416g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0500d0;
import androidx.appcompat.widget.C0546p0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.C0029a;
import p000a.p001a.p007n.C0030b;
import p000a.p001a.p007n.C0037g;
import p000a.p001a.p007n.C0040h;
import p000a.p013d.p023k.C0139a0;
import p000a.p013d.p023k.C0143b0;
import p000a.p013d.p023k.C0187u;
import p000a.p013d.p023k.C0199y;
import p000a.p013d.p023k.C0203z;

/* renamed from: androidx.appcompat.app.m */
public class C0397m extends C0355a implements ActionBarOverlayLayout.C0447d {

    /* renamed from: B */
    private static final Interpolator f1097B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f1098C = new DecelerateInterpolator();

    /* renamed from: A */
    final C0143b0 f1099A = new C0400c();

    /* renamed from: a */
    Context f1100a;

    /* renamed from: b */
    private Context f1101b;

    /* renamed from: c */
    ActionBarOverlayLayout f1102c;

    /* renamed from: d */
    ActionBarContainer f1103d;

    /* renamed from: e */
    C0500d0 f1104e;

    /* renamed from: f */
    ActionBarContextView f1105f;

    /* renamed from: g */
    View f1106g;

    /* renamed from: h */
    C0546p0 f1107h;

    /* renamed from: i */
    private boolean f1108i;

    /* renamed from: j */
    C0401d f1109j;

    /* renamed from: k */
    C0030b f1110k;

    /* renamed from: l */
    C0030b.C0031a f1111l;

    /* renamed from: m */
    private boolean f1112m;

    /* renamed from: n */
    private ArrayList<C0355a.C0357b> f1113n = new ArrayList<>();

    /* renamed from: o */
    private boolean f1114o;

    /* renamed from: p */
    private int f1115p = 0;

    /* renamed from: q */
    boolean f1116q = true;

    /* renamed from: r */
    boolean f1117r;

    /* renamed from: s */
    boolean f1118s;

    /* renamed from: t */
    private boolean f1119t;

    /* renamed from: u */
    private boolean f1120u = true;

    /* renamed from: v */
    C0040h f1121v;

    /* renamed from: w */
    private boolean f1122w;

    /* renamed from: x */
    boolean f1123x;

    /* renamed from: y */
    final C0203z f1124y = new C0398a();

    /* renamed from: z */
    final C0203z f1125z = new C0399b();

    /* renamed from: androidx.appcompat.app.m$a */
    class C0398a extends C0139a0 {
        C0398a() {
        }

        /* renamed from: b */
        public void mo203b(View view) {
            View view2;
            C0397m mVar = C0397m.this;
            if (mVar.f1116q && (view2 = mVar.f1106g) != null) {
                view2.setTranslationY(0.0f);
                C0397m.this.f1103d.setTranslationY(0.0f);
            }
            C0397m.this.f1103d.setVisibility(8);
            C0397m.this.f1103d.setTransitioning(false);
            C0397m mVar2 = C0397m.this;
            mVar2.f1121v = null;
            mVar2.mo1394l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0397m.this.f1102c;
            if (actionBarOverlayLayout != null) {
                C0187u.m726t(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    class C0399b extends C0139a0 {
        C0399b() {
        }

        /* renamed from: b */
        public void mo203b(View view) {
            C0397m mVar = C0397m.this;
            mVar.f1121v = null;
            mVar.f1103d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    class C0400c implements C0143b0 {
        C0400c() {
        }

        /* renamed from: a */
        public void mo587a(View view) {
            ((View) C0397m.this.f1103d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    public class C0401d extends C0030b implements C0416g.C0417a {

        /* renamed from: e */
        private final Context f1129e;

        /* renamed from: f */
        private final C0416g f1130f;

        /* renamed from: g */
        private C0030b.C0031a f1131g;

        /* renamed from: h */
        private WeakReference<View> f1132h;

        public C0401d(Context context, C0030b.C0031a aVar) {
            this.f1129e = context;
            this.f1131g = aVar;
            C0416g gVar = new C0416g(context);
            gVar.mo1562c(1);
            this.f1130f = gVar;
            this.f1130f.mo1538a((C0416g.C0417a) this);
        }

        /* renamed from: a */
        public void mo134a() {
            C0397m mVar = C0397m.this;
            if (mVar.f1109j == this) {
                if (!C0397m.m1560a(mVar.f1117r, mVar.f1118s, false)) {
                    C0397m mVar2 = C0397m.this;
                    mVar2.f1110k = this;
                    mVar2.f1111l = this.f1131g;
                } else {
                    this.f1131g.mo151a(this);
                }
                this.f1131g = null;
                C0397m.this.mo1388f(false);
                C0397m.this.f1105f.mo1803a();
                C0397m.this.f1104e.mo2186i().sendAccessibilityEvent(32);
                C0397m mVar3 = C0397m.this;
                mVar3.f1102c.setHideOnContentScrollEnabled(mVar3.f1123x);
                C0397m.this.f1109j = null;
            }
        }

        /* renamed from: a */
        public void mo135a(int i) {
            mo137a((CharSequence) C0397m.this.f1100a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo136a(View view) {
            C0397m.this.f1105f.setCustomView(view);
            this.f1132h = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo165a(C0416g gVar) {
            if (this.f1131g != null) {
                mo149i();
                C0397m.this.f1105f.mo1807d();
            }
        }

        /* renamed from: a */
        public void mo137a(CharSequence charSequence) {
            C0397m.this.f1105f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo139a(boolean z) {
            super.mo139a(z);
            C0397m.this.f1105f.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo166a(C0416g gVar, MenuItem menuItem) {
            C0030b.C0031a aVar = this.f1131g;
            if (aVar != null) {
                return aVar.mo153a((C0030b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo140b() {
            WeakReference<View> weakReference = this.f1132h;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo141b(int i) {
            mo142b((CharSequence) C0397m.this.f1100a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo142b(CharSequence charSequence) {
            C0397m.this.f1105f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo143c() {
            return this.f1130f;
        }

        /* renamed from: d */
        public MenuInflater mo144d() {
            return new C0037g(this.f1129e);
        }

        /* renamed from: e */
        public CharSequence mo145e() {
            return C0397m.this.f1105f.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo147g() {
            return C0397m.this.f1105f.getTitle();
        }

        /* renamed from: i */
        public void mo149i() {
            if (C0397m.this.f1109j == this) {
                this.f1130f.mo1595s();
                try {
                    this.f1131g.mo152a((C0030b) this, (Menu) this.f1130f);
                } finally {
                    this.f1130f.mo1592r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo150j() {
            return C0397m.this.f1105f.mo1805b();
        }

        /* renamed from: k */
        public boolean mo1396k() {
            this.f1130f.mo1595s();
            try {
                return this.f1131g.mo154b(this, this.f1130f);
            } finally {
                this.f1130f.mo1592r();
            }
        }
    }

    public C0397m(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m1561b(decorView);
        if (!z) {
            this.f1106g = decorView.findViewById(16908290);
        }
    }

    public C0397m(Dialog dialog) {
        new ArrayList();
        m1561b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private C0500d0 m1559a(View view) {
        if (view instanceof C0500d0) {
            return (C0500d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m1560a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m1561b(View view) {
        this.f1102c = (ActionBarOverlayLayout) view.findViewById(C0005f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1102c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1104e = m1559a(view.findViewById(C0005f.action_bar));
        this.f1105f = (ActionBarContextView) view.findViewById(C0005f.action_context_bar);
        this.f1103d = (ActionBarContainer) view.findViewById(C0005f.action_bar_container);
        C0500d0 d0Var = this.f1104e;
        if (d0Var == null || this.f1105f == null || this.f1103d == null) {
            throw new IllegalStateException(C0397m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1100a = d0Var.mo2180d();
        boolean z = (this.f1104e.mo2188k() & 4) != 0;
        if (z) {
            this.f1108i = true;
        }
        C0029a a = C0029a.m88a(this.f1100a);
        mo1393k(a.mo127a() || z);
        m1562l(a.mo132f());
        TypedArray obtainStyledAttributes = this.f1100a.obtainStyledAttributes((AttributeSet) null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0009j.ActionBar_hideOnContentScroll, false)) {
            mo1392j(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1381a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: l */
    private void m1562l(boolean z) {
        this.f1114o = z;
        if (!this.f1114o) {
            this.f1104e.mo2171a((C0546p0) null);
            this.f1103d.setTabContainer(this.f1107h);
        } else {
            this.f1103d.setTabContainer((C0546p0) null);
            this.f1104e.mo2171a(this.f1107h);
        }
        boolean z2 = true;
        boolean z3 = mo1395m() == 2;
        C0546p0 p0Var = this.f1107h;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1102c;
                if (actionBarOverlayLayout != null) {
                    C0187u.m726t(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f1104e.mo2176b(!this.f1114o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1102c;
        if (this.f1114o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: m */
    private void m1563m(boolean z) {
        if (m1560a(this.f1117r, this.f1118s, this.f1119t)) {
            if (!this.f1120u) {
                this.f1120u = true;
                mo1390h(z);
            }
        } else if (this.f1120u) {
            this.f1120u = false;
            mo1389g(z);
        }
    }

    /* renamed from: n */
    private void m1564n() {
        if (this.f1119t) {
            this.f1119t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1102c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1563m(false);
        }
    }

    /* renamed from: o */
    private boolean m1565o() {
        return C0187u.m723q(this.f1103d);
    }

    /* renamed from: p */
    private void m1566p() {
        if (!this.f1119t) {
            this.f1119t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1102c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1563m(false);
        }
    }

    /* renamed from: a */
    public C0030b mo1209a(C0030b.C0031a aVar) {
        C0401d dVar = this.f1109j;
        if (dVar != null) {
            dVar.mo134a();
        }
        this.f1102c.setHideOnContentScrollEnabled(false);
        this.f1105f.mo1806c();
        C0401d dVar2 = new C0401d(this.f1105f.getContext(), aVar);
        if (!dVar2.mo1396k()) {
            return null;
        }
        this.f1109j = dVar2;
        dVar2.mo149i();
        this.f1105f.mo1804a(dVar2);
        mo1388f(true);
        this.f1105f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: a */
    public void mo1380a() {
        if (this.f1118s) {
            this.f1118s = false;
            m1563m(true);
        }
    }

    /* renamed from: a */
    public void mo1381a(float f) {
        C0187u.m686a((View) this.f1103d, f);
    }

    /* renamed from: a */
    public void mo1382a(int i) {
        this.f1115p = i;
    }

    /* renamed from: a */
    public void mo1383a(int i, int i2) {
        int k = this.f1104e.mo2188k();
        if ((i2 & 4) != 0) {
            this.f1108i = true;
        }
        this.f1104e.mo2175b((i & i2) | ((i2 ^ -1) & k));
    }

    /* renamed from: a */
    public void mo1210a(Configuration configuration) {
        m1562l(C0029a.m88a(this.f1100a).mo132f());
    }

    /* renamed from: a */
    public void mo1211a(CharSequence charSequence) {
        this.f1104e.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo1384a(boolean z) {
        this.f1116q = z;
    }

    /* renamed from: a */
    public boolean mo1212a(int i, KeyEvent keyEvent) {
        Menu c;
        C0401d dVar = this.f1109j;
        if (dVar == null || (c = dVar.mo143c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public void mo1385b() {
        C0040h hVar = this.f1121v;
        if (hVar != null) {
            hVar.mo199a();
            this.f1121v = null;
        }
    }

    /* renamed from: b */
    public void mo1214b(boolean z) {
        if (z != this.f1112m) {
            this.f1112m = z;
            int size = this.f1113n.size();
            for (int i = 0; i < size; i++) {
                this.f1113n.get(i).mo1225a(z);
            }
        }
    }

    /* renamed from: c */
    public void mo1386c() {
    }

    /* renamed from: c */
    public void mo1215c(boolean z) {
        if (!this.f1108i) {
            mo1391i(z);
        }
    }

    /* renamed from: d */
    public void mo1387d() {
        if (!this.f1118s) {
            this.f1118s = true;
            m1563m(true);
        }
    }

    /* renamed from: d */
    public void mo1216d(boolean z) {
        mo1383a(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public void mo1217e(boolean z) {
        C0040h hVar;
        this.f1122w = z;
        if (!z && (hVar = this.f1121v) != null) {
            hVar.mo199a();
        }
    }

    /* renamed from: f */
    public void mo1388f(boolean z) {
        C0199y yVar;
        C0199y yVar2;
        if (z) {
            m1566p();
        } else {
            m1564n();
        }
        if (m1565o()) {
            if (z) {
                yVar = this.f1104e.mo2167a(4, 100);
                yVar2 = this.f1105f.mo2116a(0, 200);
            } else {
                yVar2 = this.f1104e.mo2167a(0, 200);
                yVar = this.f1105f.mo2116a(8, 100);
            }
            C0040h hVar = new C0040h();
            hVar.mo196a(yVar, yVar2);
            hVar.mo201c();
        } else if (z) {
            this.f1104e.mo2168a(4);
            this.f1105f.setVisibility(0);
        } else {
            this.f1104e.mo2168a(0);
            this.f1105f.setVisibility(8);
        }
    }

    /* renamed from: f */
    public boolean mo1219f() {
        C0500d0 d0Var = this.f1104e;
        if (d0Var == null || !d0Var.mo2187j()) {
            return false;
        }
        this.f1104e.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo1220g() {
        return this.f1104e.mo2188k();
    }

    /* renamed from: g */
    public void mo1389g(boolean z) {
        View view;
        C0040h hVar = this.f1121v;
        if (hVar != null) {
            hVar.mo199a();
        }
        if (this.f1115p != 0 || (!this.f1122w && !z)) {
            this.f1124y.mo203b((View) null);
            return;
        }
        this.f1103d.setAlpha(1.0f);
        this.f1103d.setTransitioning(true);
        C0040h hVar2 = new C0040h();
        float f = (float) (-this.f1103d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1103d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0199y a = C0187u.m685a(this.f1103d);
        a.mo712b(f);
        a.mo707a(this.f1099A);
        hVar2.mo195a(a);
        if (this.f1116q && (view = this.f1106g) != null) {
            C0199y a2 = C0187u.m685a(view);
            a2.mo712b(f);
            hVar2.mo195a(a2);
        }
        hVar2.mo198a(f1097B);
        hVar2.mo194a(250);
        hVar2.mo197a(this.f1124y);
        this.f1121v = hVar2;
        hVar2.mo201c();
    }

    /* renamed from: h */
    public Context mo1221h() {
        if (this.f1101b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1100a.getTheme().resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1101b = new ContextThemeWrapper(this.f1100a, i);
            } else {
                this.f1101b = this.f1100a;
            }
        }
        return this.f1101b;
    }

    /* renamed from: h */
    public void mo1390h(boolean z) {
        View view;
        View view2;
        C0040h hVar = this.f1121v;
        if (hVar != null) {
            hVar.mo199a();
        }
        this.f1103d.setVisibility(0);
        if (this.f1115p != 0 || (!this.f1122w && !z)) {
            this.f1103d.setAlpha(1.0f);
            this.f1103d.setTranslationY(0.0f);
            if (this.f1116q && (view = this.f1106g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1125z.mo203b((View) null);
        } else {
            this.f1103d.setTranslationY(0.0f);
            float f = (float) (-this.f1103d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1103d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1103d.setTranslationY(f);
            C0040h hVar2 = new C0040h();
            C0199y a = C0187u.m685a(this.f1103d);
            a.mo712b(0.0f);
            a.mo707a(this.f1099A);
            hVar2.mo195a(a);
            if (this.f1116q && (view2 = this.f1106g) != null) {
                view2.setTranslationY(f);
                C0199y a2 = C0187u.m685a(this.f1106g);
                a2.mo712b(0.0f);
                hVar2.mo195a(a2);
            }
            hVar2.mo198a(f1098C);
            hVar2.mo194a(250);
            hVar2.mo197a(this.f1125z);
            this.f1121v = hVar2;
            hVar2.mo201c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1102c;
        if (actionBarOverlayLayout != null) {
            C0187u.m726t(actionBarOverlayLayout);
        }
    }

    /* renamed from: i */
    public void mo1391i(boolean z) {
        mo1383a(z ? 4 : 0, 4);
    }

    /* renamed from: j */
    public void mo1392j(boolean z) {
        if (!z || this.f1102c.mo1845i()) {
            this.f1123x = z;
            this.f1102c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: k */
    public void mo1393k(boolean z) {
        this.f1104e.mo2172a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1394l() {
        C0030b.C0031a aVar = this.f1111l;
        if (aVar != null) {
            aVar.mo151a(this.f1110k);
            this.f1110k = null;
            this.f1111l = null;
        }
    }

    /* renamed from: m */
    public int mo1395m() {
        return this.f1104e.mo2190m();
    }
}
