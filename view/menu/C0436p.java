package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p013d.p017f.p018a.C0111a;

/* renamed from: androidx.appcompat.view.menu.p */
public class C0436p extends C0406c implements Menu {

    /* renamed from: d */
    private final C0111a f1337d;

    public C0436p(Context context, C0111a aVar) {
        super(context);
        if (aVar != null) {
            this.f1337d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo1483a(this.f1337d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1483a(this.f1337d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1483a(this.f1337d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1483a(this.f1337d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f1337d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo1483a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo1484a(this.f1337d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1484a(this.f1337d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1484a(this.f1337d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo1484a(this.f1337d.addSubMenu(charSequence));
    }

    public void clear() {
        mo1486b();
        this.f1337d.clear();
    }

    public void close() {
        this.f1337d.close();
    }

    public MenuItem findItem(int i) {
        return mo1483a(this.f1337d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo1483a(this.f1337d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f1337d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1337d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1337d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1337d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo1485a(i);
        this.f1337d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo1487b(i);
        this.f1337d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1337d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1337d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1337d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f1337d.setQwertyMode(z);
    }

    public int size() {
        return this.f1337d.size();
    }
}
