package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p013d.p017f.p018a.C0113c;

/* renamed from: androidx.appcompat.view.menu.t */
class C0442t extends C0436p implements SubMenu {

    /* renamed from: e */
    private final C0113c f1363e;

    C0442t(Context context, C0113c cVar) {
        super(context, cVar);
        this.f1363e = cVar;
    }

    public void clearHeader() {
        this.f1363e.clearHeader();
    }

    public MenuItem getItem() {
        return mo1483a(this.f1363e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1363e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1363e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1363e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1363e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1363e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1363e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1363e.setIcon(drawable);
        return this;
    }
}
