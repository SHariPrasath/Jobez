package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0488b1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0590a;
import androidx.core.app.C0603e;
import androidx.core.app.C0616m;
import androidx.fragment.app.C0655d;
import p000a.p001a.p007n.C0030b;

/* renamed from: androidx.appcompat.app.d */
public class C0362d extends C0655d implements C0363e, C0616m.C0617a, C0359b {

    /* renamed from: s */
    private C0364f f958s;

    /* renamed from: t */
    private Resources f959t;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1350a(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0362d.m1350a(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public C0030b mo1244a(C0030b.C0031a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1245a(C0030b bVar) {
    }

    /* renamed from: a */
    public void mo1246a(Intent intent) {
        C0603e.m2568a((Activity) this, intent);
    }

    /* renamed from: a */
    public void mo1247a(Toolbar toolbar) {
        mo1263j().mo1291a(toolbar);
    }

    /* renamed from: a */
    public void mo1248a(C0616m mVar) {
        mVar.mo2754a((Activity) this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1263j().mo1290a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo1263j().mo1286a(context);
    }

    /* renamed from: b */
    public void mo1251b(C0030b bVar) {
    }

    /* renamed from: b */
    public void mo1252b(C0616m mVar) {
    }

    /* renamed from: b */
    public boolean mo1253b(Intent intent) {
        return C0603e.m2571b((Activity) this, intent);
    }

    /* renamed from: c */
    public Intent mo1254c() {
        return C0603e.m2566a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1255c(int i) {
    }

    public void closeOptionsMenu() {
        C0355a k = mo1264k();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (k == null || !k.mo1218e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0355a k = mo1264k();
        if (keyCode != 82 || k == null || !k.mo1213a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo1263j().mo1285a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo1263j().mo1293b();
    }

    public Resources getResources() {
        if (this.f959t == null && C0488b1.m2088b()) {
            this.f959t = new C0488b1(this, super.getResources());
        }
        Resources resources = this.f959t;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public void mo1261h() {
        mo1263j().mo1302e();
    }

    public void invalidateOptionsMenu() {
        mo1263j().mo1302e();
    }

    /* renamed from: j */
    public C0364f mo1263j() {
        if (this.f958s == null) {
            this.f958s = C0364f.m1369a((Activity) this, (C0363e) this);
        }
        return this.f958s;
    }

    /* renamed from: k */
    public C0355a mo1264k() {
        return mo1263j().mo1297c();
    }

    @Deprecated
    /* renamed from: l */
    public void mo1265l() {
    }

    /* renamed from: m */
    public boolean mo1266m() {
        Intent c = mo1254c();
        if (c == null) {
            return false;
        }
        if (mo1253b(c)) {
            C0616m a = C0616m.m2629a((Context) this);
            mo1248a(a);
            mo1252b(a);
            a.mo2758b();
            try {
                C0590a.m2546a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo1246a(c);
            return true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f959t != null) {
            this.f959t.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo1263j().mo1287a(configuration);
    }

    public void onContentChanged() {
        mo1265l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0364f j = mo1263j();
        j.mo1300d();
        j.mo1288a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1263j().mo1303f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1350a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0355a k = mo1264k();
        if (menuItem.getItemId() != 16908332 || k == null || (k.mo1220g() & 4) == 0) {
            return false;
        }
        return mo1266m();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo1263j().mo1294b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo1263j().mo1304g();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1263j().mo1299c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo1263j().mo1305h();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1263j().mo1306i();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo1263j().mo1292a(charSequence);
    }

    public void openOptionsMenu() {
        C0355a k = mo1264k();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (k == null || !k.mo1224k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo1263j().mo1298c(i);
    }

    public void setContentView(View view) {
        mo1263j().mo1289a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1263j().mo1295b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo1263j().mo1301d(i);
    }
}
