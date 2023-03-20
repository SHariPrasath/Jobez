package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p012c.C0057a;
import p000a.p013d.p017f.p018a.C0112b;
import p000a.p013d.p017f.p018a.C0113c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0406c {

    /* renamed from: a */
    final Context f1193a;

    /* renamed from: b */
    private Map<C0112b, MenuItem> f1194b;

    /* renamed from: c */
    private Map<C0113c, SubMenu> f1195c;

    C0406c(Context context) {
        this.f1193a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo1483a(MenuItem menuItem) {
        if (!(menuItem instanceof C0112b)) {
            return menuItem;
        }
        C0112b bVar = (C0112b) menuItem;
        if (this.f1194b == null) {
            this.f1194b = new C0057a();
        }
        MenuItem menuItem2 = this.f1194b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0423k kVar = new C0423k(this.f1193a, bVar);
        this.f1194b.put(bVar, kVar);
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo1484a(SubMenu subMenu) {
        if (!(subMenu instanceof C0113c)) {
            return subMenu;
        }
        C0113c cVar = (C0113c) subMenu;
        if (this.f1195c == null) {
            this.f1195c = new C0057a();
        }
        SubMenu subMenu2 = this.f1195c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0442t tVar = new C0442t(this.f1193a, cVar);
        this.f1195c.put(cVar, tVar);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1485a(int i) {
        Map<C0112b, MenuItem> map = this.f1194b;
        if (map != null) {
            Iterator<C0112b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1486b() {
        Map<C0112b, MenuItem> map = this.f1194b;
        if (map != null) {
            map.clear();
        }
        Map<C0113c, SubMenu> map2 = this.f1195c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1487b(int i) {
        Map<C0112b, MenuItem> map = this.f1194b;
        if (map != null) {
            Iterator<C0112b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
