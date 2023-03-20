package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0416g;

/* renamed from: androidx.appcompat.view.menu.s */
public class C0441s extends C0416g implements SubMenu {

    /* renamed from: B */
    private C0416g f1361B;

    /* renamed from: C */
    private C0421j f1362C;

    public C0441s(Context context, C0416g gVar, C0421j jVar) {
        super(context);
        this.f1361B = gVar;
        this.f1362C = jVar;
    }

    /* renamed from: a */
    public void mo1538a(C0416g.C0417a aVar) {
        this.f1361B.mo1538a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1545a(C0416g gVar, MenuItem menuItem) {
        return super.mo1545a(gVar, menuItem) || this.f1361B.mo1545a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo1546a(C0421j jVar) {
        return this.f1361B.mo1546a(jVar);
    }

    /* renamed from: b */
    public boolean mo1561b(C0421j jVar) {
        return this.f1361B.mo1561b(jVar);
    }

    /* renamed from: d */
    public String mo1570d() {
        C0421j jVar = this.f1362C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1570d() + ":" + itemId;
    }

    public MenuItem getItem() {
        return this.f1362C;
    }

    /* renamed from: m */
    public C0416g mo1585m() {
        return this.f1361B.mo1585m();
    }

    /* renamed from: o */
    public boolean mo1587o() {
        return this.f1361B.mo1587o();
    }

    /* renamed from: p */
    public boolean mo1588p() {
        return this.f1361B.mo1588p();
    }

    /* renamed from: q */
    public boolean mo1591q() {
        return this.f1361B.mo1591q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1361B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo1569d(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo1531a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo1573e(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo1533a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo1532a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1362C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1362C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1361B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo1775t() {
        return this.f1361B;
    }
}
