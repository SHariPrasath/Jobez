package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0434o;
import androidx.core.graphics.drawable.C0618a;
import p000a.p001a.C0007h;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p013d.p017f.p018a.C0112b;
import p000a.p013d.p023k.C0140b;

/* renamed from: androidx.appcompat.view.menu.j */
public final class C0421j implements C0112b {

    /* renamed from: A */
    private View f1281A;

    /* renamed from: B */
    private C0140b f1282B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1283C;

    /* renamed from: D */
    private boolean f1284D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1285E;

    /* renamed from: a */
    private final int f1286a;

    /* renamed from: b */
    private final int f1287b;

    /* renamed from: c */
    private final int f1288c;

    /* renamed from: d */
    private final int f1289d;

    /* renamed from: e */
    private CharSequence f1290e;

    /* renamed from: f */
    private CharSequence f1291f;

    /* renamed from: g */
    private Intent f1292g;

    /* renamed from: h */
    private char f1293h;

    /* renamed from: i */
    private int f1294i = 4096;

    /* renamed from: j */
    private char f1295j;

    /* renamed from: k */
    private int f1296k = 4096;

    /* renamed from: l */
    private Drawable f1297l;

    /* renamed from: m */
    private int f1298m = 0;

    /* renamed from: n */
    C0416g f1299n;

    /* renamed from: o */
    private C0441s f1300o;

    /* renamed from: p */
    private Runnable f1301p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1302q;

    /* renamed from: r */
    private CharSequence f1303r;

    /* renamed from: s */
    private CharSequence f1304s;

    /* renamed from: t */
    private ColorStateList f1305t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1306u = null;

    /* renamed from: v */
    private boolean f1307v = false;

    /* renamed from: w */
    private boolean f1308w = false;

    /* renamed from: x */
    private boolean f1309x = false;

    /* renamed from: y */
    private int f1310y = 16;

    /* renamed from: z */
    private int f1311z = 0;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    class C0422a implements C0140b.C0142b {
        C0422a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0421j jVar = C0421j.this;
            jVar.f1299n.mo1571d(jVar);
        }
    }

    C0421j(C0416g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1299n = gVar;
        this.f1286a = i2;
        this.f1287b = i;
        this.f1288c = i3;
        this.f1289d = i4;
        this.f1290e = charSequence;
        this.f1311z = i5;
    }

    /* renamed from: a */
    private Drawable m1762a(Drawable drawable) {
        if (drawable != null && this.f1309x && (this.f1307v || this.f1308w)) {
            drawable = C0618a.m2667g(drawable).mutate();
            if (this.f1307v) {
                C0618a.m2654a(drawable, this.f1305t);
            }
            if (this.f1308w) {
                C0618a.m2657a(drawable, this.f1306u);
            }
            this.f1309x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m1763a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0112b mo477a(C0140b bVar) {
        C0140b bVar2 = this.f1282B;
        if (bVar2 != null) {
            bVar2.mo585f();
        }
        this.f1281A = null;
        this.f1282B = bVar;
        this.f1299n.mo1560b(true);
        C0140b bVar3 = this.f1282B;
        if (bVar3 != null) {
            bVar3.mo578a((C0140b.C0142b) new C0422a());
        }
        return this;
    }

    /* renamed from: a */
    public C0140b mo478a() {
        return this.f1282B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo1607a(C0434o.C0435a aVar) {
        return (aVar == null || !aVar.mo1398a()) ? getTitle() : getTitleCondensed();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1608a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1285E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo1609a(C0441s sVar) {
        this.f1300o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void mo1610a(boolean z) {
        this.f1284D = z;
        this.f1299n.mo1560b(false);
    }

    /* renamed from: b */
    public void mo1611b() {
        this.f1299n.mo1564c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1612b(boolean z) {
        int i = this.f1310y;
        this.f1310y = (z ? 2 : 0) | (i & -3);
        if (i != this.f1310y) {
            this.f1299n.mo1560b(false);
        }
    }

    /* renamed from: c */
    public int mo1613c() {
        return this.f1289d;
    }

    /* renamed from: c */
    public void mo1614c(boolean z) {
        this.f1310y = (z ? 4 : 0) | (this.f1310y & -5);
    }

    public boolean collapseActionView() {
        if ((this.f1311z & 8) == 0) {
            return false;
        }
        if (this.f1281A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1283C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1299n.mo1546a(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo1615d() {
        return this.f1299n.mo1588p() ? this.f1295j : this.f1293h;
    }

    /* renamed from: d */
    public void mo1616d(boolean z) {
        this.f1310y = z ? this.f1310y | 32 : this.f1310y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo1617e() {
        int i;
        char d = mo1615d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f1299n.mo1572e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1299n.mo1572e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0007h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1299n.mo1588p() ? this.f1296k : this.f1294i;
        m1763a(sb, i2, 65536, resources.getString(C0007h.abc_menu_meta_shortcut_label));
        m1763a(sb, i2, 4096, resources.getString(C0007h.abc_menu_ctrl_shortcut_label));
        m1763a(sb, i2, 2, resources.getString(C0007h.abc_menu_alt_shortcut_label));
        m1763a(sb, i2, 1, resources.getString(C0007h.abc_menu_shift_shortcut_label));
        m1763a(sb, i2, 4, resources.getString(C0007h.abc_menu_sym_shortcut_label));
        m1763a(sb, i2, 8, resources.getString(C0007h.abc_menu_function_shortcut_label));
        if (d == 8) {
            i = C0007h.abc_menu_delete_shortcut_label;
        } else if (d == 10) {
            i = C0007h.abc_menu_enter_shortcut_label;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            i = C0007h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1618e(boolean z) {
        int i = this.f1310y;
        this.f1310y = (z ? 0 : 8) | (i & -9);
        return i != this.f1310y;
    }

    public boolean expandActionView() {
        if (!mo1619f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1283C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1299n.mo1561b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo1619f() {
        C0140b bVar;
        if ((this.f1311z & 8) == 0) {
            return false;
        }
        if (this.f1281A == null && (bVar = this.f1282B) != null) {
            this.f1281A = bVar.mo576a((MenuItem) this);
        }
        return this.f1281A != null;
    }

    /* renamed from: g */
    public boolean mo1620g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1302q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0416g gVar = this.f1299n;
        if (gVar.mo1545a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f1301p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1292g != null) {
            try {
                this.f1299n.mo1572e().startActivity(this.f1292g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0140b bVar = this.f1282B;
        return bVar != null && bVar.mo583d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1281A;
        if (view != null) {
            return view;
        }
        C0140b bVar = this.f1282B;
        if (bVar == null) {
            return null;
        }
        this.f1281A = bVar.mo576a((MenuItem) this);
        return this.f1281A;
    }

    public int getAlphabeticModifiers() {
        return this.f1296k;
    }

    public char getAlphabeticShortcut() {
        return this.f1295j;
    }

    public CharSequence getContentDescription() {
        return this.f1303r;
    }

    public int getGroupId() {
        return this.f1287b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1297l;
        if (drawable != null) {
            return m1762a(drawable);
        }
        if (this.f1298m == 0) {
            return null;
        }
        Drawable c = C0010a.m4c(this.f1299n.mo1572e(), this.f1298m);
        this.f1298m = 0;
        this.f1297l = c;
        return m1762a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f1305t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1306u;
    }

    public Intent getIntent() {
        return this.f1292g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1286a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1285E;
    }

    public int getNumericModifiers() {
        return this.f1294i;
    }

    public char getNumericShortcut() {
        return this.f1293h;
    }

    public int getOrder() {
        return this.f1288c;
    }

    public SubMenu getSubMenu() {
        return this.f1300o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1290e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1291f;
        if (charSequence == null) {
            charSequence = this.f1290e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1304s;
    }

    /* renamed from: h */
    public boolean mo1633h() {
        return (this.f1310y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f1300o != null;
    }

    /* renamed from: i */
    public boolean mo1635i() {
        return (this.f1310y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f1284D;
    }

    public boolean isCheckable() {
        return (this.f1310y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1310y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1310y & 16) != 0;
    }

    public boolean isVisible() {
        C0140b bVar = this.f1282B;
        return (bVar == null || !bVar.mo584e()) ? (this.f1310y & 8) == 0 : (this.f1310y & 8) == 0 && this.f1282B.mo581b();
    }

    /* renamed from: j */
    public boolean mo1640j() {
        return (this.f1311z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo1641k() {
        return (this.f1311z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo1642l() {
        return this.f1299n.mo1583k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo1643m() {
        return this.f1299n.mo1591q() && mo1615d() != 0;
    }

    /* renamed from: n */
    public boolean mo1644n() {
        return (this.f1311z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public C0112b setActionView(int i) {
        Context e = this.f1299n.mo1572e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C0112b setActionView(View view) {
        int i;
        this.f1281A = view;
        this.f1282B = null;
        if (view != null && view.getId() == -1 && (i = this.f1286a) > 0) {
            view.setId(i);
        }
        this.f1299n.mo1564c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1295j == c) {
            return this;
        }
        this.f1295j = Character.toLowerCase(c);
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1295j == c && this.f1296k == i) {
            return this;
        }
        this.f1295j = Character.toLowerCase(c);
        this.f1296k = KeyEvent.normalizeMetaState(i);
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1310y;
        this.f1310y = z | (i & true) ? 1 : 0;
        if (i != this.f1310y) {
            this.f1299n.mo1560b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1310y & 4) != 0) {
            this.f1299n.mo1537a((MenuItem) this);
        } else {
            mo1612b(z);
        }
        return this;
    }

    public C0112b setContentDescription(CharSequence charSequence) {
        this.f1303r = charSequence;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1310y = z ? this.f1310y | 16 : this.f1310y & -17;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1297l = null;
        this.f1298m = i;
        this.f1309x = true;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1298m = 0;
        this.f1297l = drawable;
        this.f1309x = true;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1305t = colorStateList;
        this.f1307v = true;
        this.f1309x = true;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1306u = mode;
        this.f1308w = true;
        this.f1309x = true;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1292g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1293h == c) {
            return this;
        }
        this.f1293h = c;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1293h == c && this.f1294i == i) {
            return this;
        }
        this.f1293h = c;
        this.f1294i = KeyEvent.normalizeMetaState(i);
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1283C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1302q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1293h = c;
        this.f1295j = Character.toLowerCase(c2);
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1293h = c;
        this.f1294i = KeyEvent.normalizeMetaState(i);
        this.f1295j = Character.toLowerCase(c2);
        this.f1296k = KeyEvent.normalizeMetaState(i2);
        this.f1299n.mo1560b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1311z = i;
            this.f1299n.mo1564c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public C0112b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f1299n.mo1572e().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1290e = charSequence;
        this.f1299n.mo1560b(false);
        C0441s sVar = this.f1300o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1291f = charSequence;
        this.f1299n.mo1560b(false);
        return this;
    }

    public C0112b setTooltipText(CharSequence charSequence) {
        this.f1304s = charSequence;
        this.f1299n.mo1560b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1618e(z)) {
            this.f1299n.mo1571d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1290e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
