package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0355a;
import androidx.appcompat.view.menu.C0416g;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.widget.C0500d0;
import androidx.appcompat.widget.C0578x0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p000a.p001a.p007n.C0042i;
import p000a.p013d.p023k.C0187u;

/* renamed from: androidx.appcompat.app.j */
class C0388j extends C0355a {

    /* renamed from: a */
    C0500d0 f1069a;

    /* renamed from: b */
    boolean f1070b;

    /* renamed from: c */
    Window.Callback f1071c;

    /* renamed from: d */
    private boolean f1072d;

    /* renamed from: e */
    private boolean f1073e;

    /* renamed from: f */
    private ArrayList<C0355a.C0357b> f1074f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f1075g = new C0389a();

    /* renamed from: h */
    private final Toolbar.C0478f f1076h = new C0390b();

    /* renamed from: androidx.appcompat.app.j$a */
    class C0389a implements Runnable {
        C0389a() {
        }

        public void run() {
            C0388j.this.mo1375m();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    class C0390b implements Toolbar.C0478f {
        C0390b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0388j.this.f1071c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    private final class C0391c implements C0432n.C0433a {

        /* renamed from: c */
        private boolean f1079c;

        C0391c() {
        }

        /* renamed from: a */
        public void mo1345a(C0416g gVar, boolean z) {
            if (!this.f1079c) {
                this.f1079c = true;
                C0388j.this.f1069a.mo2185h();
                Window.Callback callback = C0388j.this.f1071c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f1079c = false;
            }
        }

        /* renamed from: a */
        public boolean mo1346a(C0416g gVar) {
            Window.Callback callback = C0388j.this.f1071c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    private final class C0392d implements C0416g.C0417a {
        C0392d() {
        }

        /* renamed from: a */
        public void mo165a(C0416g gVar) {
            C0388j jVar = C0388j.this;
            if (jVar.f1071c == null) {
                return;
            }
            if (jVar.f1069a.mo2173a()) {
                C0388j.this.f1071c.onPanelClosed(108, gVar);
            } else if (C0388j.this.f1071c.onPreparePanel(0, (View) null, gVar)) {
                C0388j.this.f1071c.onMenuOpened(108, gVar);
            }
        }

        /* renamed from: a */
        public boolean mo166a(C0416g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    private class C0393e extends C0042i {
        public C0393e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0388j.this.f1069a.mo2180d()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0388j jVar = C0388j.this;
                if (!jVar.f1070b) {
                    jVar.f1069a.mo2174b();
                    C0388j.this.f1070b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0388j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1069a = new C0578x0(toolbar, false);
        this.f1071c = new C0393e(callback);
        this.f1069a.setWindowCallback(this.f1071c);
        toolbar.setOnMenuItemClickListener(this.f1076h);
        this.f1069a.setWindowTitle(charSequence);
    }

    /* renamed from: n */
    private Menu m1528n() {
        if (!this.f1072d) {
            this.f1069a.mo2170a((C0432n.C0433a) new C0391c(), (C0416g.C0417a) new C0392d());
            this.f1072d = true;
        }
        return this.f1069a.mo2189l();
    }

    /* renamed from: a */
    public void mo1373a(int i, int i2) {
        this.f1069a.mo2175b((i & i2) | ((i2 ^ -1) & this.f1069a.mo2188k()));
    }

    /* renamed from: a */
    public void mo1210a(Configuration configuration) {
        super.mo1210a(configuration);
    }

    /* renamed from: a */
    public void mo1211a(CharSequence charSequence) {
        this.f1069a.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public boolean mo1212a(int i, KeyEvent keyEvent) {
        Menu n = m1528n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo1213a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1224k();
        }
        return true;
    }

    /* renamed from: b */
    public void mo1214b(boolean z) {
        if (z != this.f1073e) {
            this.f1073e = z;
            int size = this.f1074f.size();
            for (int i = 0; i < size; i++) {
                this.f1074f.get(i).mo1225a(z);
            }
        }
    }

    /* renamed from: c */
    public void mo1215c(boolean z) {
    }

    /* renamed from: d */
    public void mo1216d(boolean z) {
        mo1373a(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public void mo1217e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo1218e() {
        return this.f1069a.mo2181e();
    }

    /* renamed from: f */
    public boolean mo1219f() {
        if (!this.f1069a.mo2187j()) {
            return false;
        }
        this.f1069a.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo1220g() {
        return this.f1069a.mo2188k();
    }

    /* renamed from: h */
    public Context mo1221h() {
        return this.f1069a.mo2180d();
    }

    /* renamed from: i */
    public boolean mo1222i() {
        this.f1069a.mo2186i().removeCallbacks(this.f1075g);
        C0187u.m695a((View) this.f1069a.mo2186i(), this.f1075g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1223j() {
        this.f1069a.mo2186i().removeCallbacks(this.f1075g);
    }

    /* renamed from: k */
    public boolean mo1224k() {
        return this.f1069a.mo2182f();
    }

    /* renamed from: l */
    public Window.Callback mo1374l() {
        return this.f1071c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1375m() {
        Menu n = m1528n();
        C0416g gVar = n instanceof C0416g ? (C0416g) n : null;
        if (gVar != null) {
            gVar.mo1595s();
        }
        try {
            n.clear();
            if (!this.f1071c.onCreatePanelMenu(0, n) || !this.f1071c.onPreparePanel(0, (View) null, n)) {
                n.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo1592r();
            }
        }
    }
}
