package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p001a.p007n.C0032c;
import p000a.p013d.p017f.p018a.C0112b;
import p000a.p013d.p023k.C0140b;

/* renamed from: androidx.appcompat.view.menu.k */
public class C0423k extends C0406c implements MenuItem {

    /* renamed from: d */
    private final C0112b f1313d;

    /* renamed from: e */
    private Method f1314e;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    private class C0424a extends C0140b {

        /* renamed from: b */
        final ActionProvider f1315b;

        C0424a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1315b = actionProvider;
        }

        /* renamed from: a */
        public void mo579a(SubMenu subMenu) {
            this.f1315b.onPrepareSubMenu(C0423k.this.mo1484a(subMenu));
        }

        /* renamed from: a */
        public boolean mo580a() {
            return this.f1315b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo582c() {
            return this.f1315b.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo583d() {
            return this.f1315b.onPerformDefaultAction();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    private class C0425b extends C0424a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private C0140b.C0142b f1317d;

        C0425b(C0423k kVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo576a(MenuItem menuItem) {
            return this.f1315b.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo578a(C0140b.C0142b bVar) {
            this.f1317d = bVar;
            this.f1315b.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo581b() {
            return this.f1315b.isVisible();
        }

        /* renamed from: e */
        public boolean mo584e() {
            return this.f1315b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0140b.C0142b bVar = this.f1317d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    static class C0426c extends FrameLayout implements C0032c {

        /* renamed from: c */
        final CollapsibleActionView f1318c;

        C0426c(View view) {
            super(view.getContext());
            this.f1318c = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo155a() {
            this.f1318c.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo156b() {
            this.f1318c.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo1718c() {
            return (View) this.f1318c;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    private class C0427d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1319a;

        C0427d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1319a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1319a.onMenuItemActionCollapse(C0423k.this.mo1483a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1319a.onMenuItemActionExpand(C0423k.this.mo1483a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$e */
    private class C0428e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1321a;

        C0428e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1321a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1321a.onMenuItemClick(C0423k.this.mo1483a(menuItem));
        }
    }

    public C0423k(Context context, C0112b bVar) {
        super(context);
        if (bVar != null) {
            this.f1313d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo1662a(boolean z) {
        try {
            if (this.f1314e == null) {
                this.f1314e = this.f1313d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1314e.invoke(this.f1313d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f1313d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1313d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0140b a = this.f1313d.mo478a();
        if (a instanceof C0424a) {
            return ((C0424a) a).f1315b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1313d.getActionView();
        return actionView instanceof C0426c ? ((C0426c) actionView).mo1718c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1313d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1313d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1313d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1313d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1313d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1313d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1313d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1313d.getIntent();
    }

    public int getItemId() {
        return this.f1313d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1313d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1313d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1313d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1313d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1484a(this.f1313d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1313d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1313d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1313d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1313d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1313d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1313d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1313d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1313d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1313d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0140b bVar = Build.VERSION.SDK_INT >= 16 ? new C0425b(this, this.f1193a, actionProvider) : new C0424a(this.f1193a, actionProvider);
        C0112b bVar2 = this.f1313d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo477a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1313d.setActionView(i);
        View actionView = this.f1313d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1313d.setActionView((View) new C0426c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0426c(view);
        }
        this.f1313d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1313d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1313d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1313d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1313d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1313d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1313d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1313d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1313d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1313d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1313d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1313d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1313d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1313d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1313d.setOnActionExpandListener(onActionExpandListener != null ? new C0427d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1313d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0428e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1313d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1313d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1313d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1313d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1313d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1313d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1313d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1313d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1313d.setVisible(z);
    }
}
