package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.C0618a;
import p000a.p013d.p014d.C0075a;
import p000a.p013d.p017f.p018a.C0112b;
import p000a.p013d.p023k.C0140b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0404a implements C0112b {

    /* renamed from: a */
    private final int f1166a;

    /* renamed from: b */
    private final int f1167b;

    /* renamed from: c */
    private final int f1168c;

    /* renamed from: d */
    private CharSequence f1169d;

    /* renamed from: e */
    private CharSequence f1170e;

    /* renamed from: f */
    private Intent f1171f;

    /* renamed from: g */
    private char f1172g;

    /* renamed from: h */
    private int f1173h = 4096;

    /* renamed from: i */
    private char f1174i;

    /* renamed from: j */
    private int f1175j = 4096;

    /* renamed from: k */
    private Drawable f1176k;

    /* renamed from: l */
    private Context f1177l;

    /* renamed from: m */
    private CharSequence f1178m;

    /* renamed from: n */
    private CharSequence f1179n;

    /* renamed from: o */
    private ColorStateList f1180o = null;

    /* renamed from: p */
    private PorterDuff.Mode f1181p = null;

    /* renamed from: q */
    private boolean f1182q = false;

    /* renamed from: r */
    private boolean f1183r = false;

    /* renamed from: s */
    private int f1184s = 16;

    public C0404a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1177l = context;
        this.f1166a = i2;
        this.f1167b = i;
        this.f1168c = i4;
        this.f1169d = charSequence;
    }

    /* renamed from: b */
    private void m1634b() {
        if (this.f1176k == null) {
            return;
        }
        if (this.f1182q || this.f1183r) {
            this.f1176k = C0618a.m2667g(this.f1176k);
            this.f1176k = this.f1176k.mutate();
            if (this.f1182q) {
                C0618a.m2654a(this.f1176k, this.f1180o);
            }
            if (this.f1183r) {
                C0618a.m2657a(this.f1176k, this.f1181p);
            }
        }
    }

    /* renamed from: a */
    public C0112b mo477a(C0140b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0140b mo478a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1175j;
    }

    public char getAlphabeticShortcut() {
        return this.f1174i;
    }

    public CharSequence getContentDescription() {
        return this.f1178m;
    }

    public int getGroupId() {
        return this.f1167b;
    }

    public Drawable getIcon() {
        return this.f1176k;
    }

    public ColorStateList getIconTintList() {
        return this.f1180o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1181p;
    }

    public Intent getIntent() {
        return this.f1171f;
    }

    public int getItemId() {
        return this.f1166a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1173h;
    }

    public char getNumericShortcut() {
        return this.f1172g;
    }

    public int getOrder() {
        return this.f1168c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1169d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1170e;
        return charSequence != null ? charSequence : this.f1169d;
    }

    public CharSequence getTooltipText() {
        return this.f1179n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1184s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1184s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1184s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1184s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public C0112b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public C0112b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1174i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1174i = Character.toLowerCase(c);
        this.f1175j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1184s = z | (this.f1184s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1184s = (z ? 2 : 0) | (this.f1184s & -3);
        return this;
    }

    public C0112b setContentDescription(CharSequence charSequence) {
        this.f1178m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1184s = (z ? 16 : 0) | (this.f1184s & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1176k = C0075a.m301c(this.f1177l, i);
        m1634b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1176k = drawable;
        m1634b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1180o = colorStateList;
        this.f1182q = true;
        m1634b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1181p = mode;
        this.f1183r = true;
        m1634b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1171f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1172g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1172g = c;
        this.f1173h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1172g = c;
        this.f1174i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1172g = c;
        this.f1173h = KeyEvent.normalizeMetaState(i);
        this.f1174i = Character.toLowerCase(c2);
        this.f1175j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public C0112b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1169d = this.f1177l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1169d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1170e = charSequence;
        return this;
    }

    public C0112b setTooltipText(CharSequence charSequence) {
        this.f1179n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1184s & 8;
        if (z) {
            i = 0;
        }
        this.f1184s = i2 | i;
        return this;
    }
}
