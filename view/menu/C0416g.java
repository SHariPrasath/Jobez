package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p013d.p014d.C0075a;
import p000a.p013d.p017f.p018a.C0111a;
import p000a.p013d.p023k.C0196v;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0416g implements C0111a {

    /* renamed from: A */
    private static final int[] f1250A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1251a;

    /* renamed from: b */
    private final Resources f1252b;

    /* renamed from: c */
    private boolean f1253c;

    /* renamed from: d */
    private boolean f1254d;

    /* renamed from: e */
    private C0417a f1255e;

    /* renamed from: f */
    private ArrayList<C0421j> f1256f;

    /* renamed from: g */
    private ArrayList<C0421j> f1257g;

    /* renamed from: h */
    private boolean f1258h;

    /* renamed from: i */
    private ArrayList<C0421j> f1259i;

    /* renamed from: j */
    private ArrayList<C0421j> f1260j;

    /* renamed from: k */
    private boolean f1261k;

    /* renamed from: l */
    private int f1262l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1263m;

    /* renamed from: n */
    CharSequence f1264n;

    /* renamed from: o */
    Drawable f1265o;

    /* renamed from: p */
    View f1266p;

    /* renamed from: q */
    private boolean f1267q = false;

    /* renamed from: r */
    private boolean f1268r = false;

    /* renamed from: s */
    private boolean f1269s = false;

    /* renamed from: t */
    private boolean f1270t = false;

    /* renamed from: u */
    private boolean f1271u = false;

    /* renamed from: v */
    private ArrayList<C0421j> f1272v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0432n>> f1273w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0421j f1274x;

    /* renamed from: y */
    private boolean f1275y = false;

    /* renamed from: z */
    private boolean f1276z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0417a {
        /* renamed from: a */
        void mo165a(C0416g gVar);

        /* renamed from: a */
        boolean mo166a(C0416g gVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0418b {
        /* renamed from: a */
        boolean mo1420a(C0421j jVar);
    }

    public C0416g(Context context) {
        this.f1251a = context;
        this.f1252b = context.getResources();
        this.f1256f = new ArrayList<>();
        this.f1257g = new ArrayList<>();
        this.f1258h = true;
        this.f1259i = new ArrayList<>();
        this.f1260j = new ArrayList<>();
        this.f1261k = true;
        m1705e(true);
    }

    /* renamed from: a */
    private static int m1699a(ArrayList<C0421j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1613c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0421j m1700a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0421j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m1701a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo1584l();
        if (view != null) {
            this.f1266p = view;
            this.f1264n = null;
            this.f1265o = null;
        } else {
            if (i > 0) {
                this.f1264n = l.getText(i);
            } else if (charSequence != null) {
                this.f1264n = charSequence;
            }
            if (i2 > 0) {
                this.f1265o = C0075a.m301c(mo1572e(), i2);
            } else if (drawable != null) {
                this.f1265o = drawable;
            }
            this.f1266p = null;
        }
        mo1560b(false);
    }

    /* renamed from: a */
    private void m1702a(int i, boolean z) {
        if (i >= 0 && i < this.f1256f.size()) {
            this.f1256f.remove(i);
            if (z) {
                mo1560b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m1703a(C0441s sVar, C0432n nVar) {
        boolean z = false;
        if (this.f1273w.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.mo1480a(sVar);
        }
        Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0432n nVar2 = (C0432n) next.get();
            if (nVar2 == null) {
                this.f1273w.remove(next);
            } else if (!z) {
                z = nVar2.mo1480a(sVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m1704d(boolean z) {
        if (!this.f1273w.isEmpty()) {
            mo1595s();
            Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0432n nVar = (C0432n) next.get();
                if (nVar == null) {
                    this.f1273w.remove(next);
                } else {
                    nVar.mo1476a(z);
                }
            }
            mo1592r();
        }
    }

    /* renamed from: e */
    private void m1705e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1252b.getConfiguration().keyboard == 1 || !C0196v.m750a(ViewConfiguration.get(this.f1251a), this.f1251a)) {
            z2 = false;
        }
        this.f1254d = z2;
    }

    /* renamed from: f */
    private static int m1706f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1250A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int mo1528a(int i) {
        return mo1529a(i, 0);
    }

    /* renamed from: a */
    public int mo1529a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1256f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1530a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m1706f(i3);
        C0421j a = m1700a(i, i2, i3, f, charSequence, this.f1262l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1263m;
        if (contextMenuInfo != null) {
            a.mo1608a(contextMenuInfo);
        }
        ArrayList<C0421j> arrayList = this.f1256f;
        arrayList.add(m1699a(arrayList, f), a);
        mo1560b(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0416g mo1531a(Drawable drawable) {
        m1701a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0416g mo1532a(View view) {
        m1701a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0416g mo1533a(CharSequence charSequence) {
        m1701a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0421j mo1534a(int i, KeyEvent keyEvent) {
        ArrayList<C0421j> arrayList = this.f1272v;
        arrayList.clear();
        mo1541a((List<C0421j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p = mo1588p();
        for (int i2 = 0; i2 < size; i2++) {
            C0421j jVar = arrayList.get(i2);
            char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1535a() {
        C0417a aVar = this.f1255e;
        if (aVar != null) {
            aVar.mo165a(this);
        }
    }

    /* renamed from: a */
    public void mo1536a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1570d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0441s) item.getSubMenu()).mo1536a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1537a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1256f.size();
        mo1595s();
        for (int i = 0; i < size; i++) {
            C0421j jVar = this.f1256f.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo1635i() && jVar.isCheckable()) {
                jVar.mo1612b(jVar == menuItem);
            }
        }
        mo1592r();
    }

    /* renamed from: a */
    public void mo1538a(C0417a aVar) {
        this.f1255e = aVar;
    }

    /* renamed from: a */
    public void mo1539a(C0432n nVar) {
        mo1540a(nVar, this.f1251a);
    }

    /* renamed from: a */
    public void mo1540a(C0432n nVar, Context context) {
        this.f1273w.add(new WeakReference(nVar));
        nVar.mo1471a(context, this);
        this.f1261k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1541a(List<C0421j> list, int i, KeyEvent keyEvent) {
        boolean p = mo1588p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1256f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0421j jVar = this.f1256f.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0416g) jVar.getSubMenu()).mo1541a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1542a(boolean z) {
        if (!this.f1271u) {
            this.f1271u = true;
            Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0432n nVar = (C0432n) next.get();
                if (nVar == null) {
                    this.f1273w.remove(next);
                } else {
                    nVar.mo1473a(this, z);
                }
            }
            this.f1271u = false;
        }
    }

    /* renamed from: a */
    public boolean mo1543a(MenuItem menuItem, int i) {
        return mo1544a(menuItem, (C0432n) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1544a(android.view.MenuItem r7, androidx.appcompat.view.menu.C0432n r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.C0421j) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo1620g()
            a.d.k.b r2 = r7.mo478a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo580a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo1619f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo1542a((boolean) r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo1542a((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r0 = r6.mo1572e()
            r9.<init>(r0, r6, r7)
            r7.mo1609a((androidx.appcompat.view.menu.C0441s) r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.s r7 = (androidx.appcompat.view.menu.C0441s) r7
            if (r4 == 0) goto L_0x0063
            r2.mo579a((android.view.SubMenu) r7)
        L_0x0063:
            boolean r7 = r6.m1703a((androidx.appcompat.view.menu.C0441s) r7, (androidx.appcompat.view.menu.C0432n) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0416g.mo1544a(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1545a(C0416g gVar, MenuItem menuItem) {
        C0417a aVar = this.f1255e;
        return aVar != null && aVar.mo166a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo1546a(C0421j jVar) {
        boolean z = false;
        if (!this.f1273w.isEmpty() && this.f1274x == jVar) {
            mo1595s();
            Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0432n nVar = (C0432n) next.get();
                if (nVar == null) {
                    this.f1273w.remove(next);
                } else {
                    z = nVar.mo1479a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1592r();
            if (z) {
                this.f1274x = null;
            }
        }
        return z;
    }

    public MenuItem add(int i) {
        return mo1530a(0, 0, 0, this.f1252b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1530a(i, i2, i3, this.f1252b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1530a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1530a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1251a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1252b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1252b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0421j jVar = (C0421j) mo1530a(i, i2, i3, charSequence);
        C0441s sVar = new C0441s(this.f1251a, this, jVar);
        jVar.mo1609a(sVar);
        return sVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo1556b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1256f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo1557b() {
        ArrayList<C0421j> n = mo1586n();
        if (this.f1261k) {
            Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0432n nVar = (C0432n) next.get();
                if (nVar == null) {
                    this.f1273w.remove(next);
                } else {
                    z |= nVar.mo1495b();
                }
            }
            if (z) {
                this.f1259i.clear();
                this.f1260j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0421j jVar = n.get(i);
                    (jVar.mo1633h() ? this.f1259i : this.f1260j).add(jVar);
                }
            } else {
                this.f1259i.clear();
                this.f1260j.clear();
                this.f1260j.addAll(mo1586n());
            }
            this.f1261k = false;
        }
    }

    /* renamed from: b */
    public void mo1558b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0441s) item.getSubMenu()).mo1558b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1570d(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo1559b(C0432n nVar) {
        Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0432n nVar2 = (C0432n) next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f1273w.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void mo1560b(boolean z) {
        if (!this.f1267q) {
            if (z) {
                this.f1258h = true;
                this.f1261k = true;
            }
            m1704d(z);
            return;
        }
        this.f1268r = true;
        if (z) {
            this.f1269s = true;
        }
    }

    /* renamed from: b */
    public boolean mo1561b(C0421j jVar) {
        boolean z = false;
        if (this.f1273w.isEmpty()) {
            return false;
        }
        mo1595s();
        Iterator<WeakReference<C0432n>> it = this.f1273w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0432n nVar = (C0432n) next.get();
            if (nVar == null) {
                this.f1273w.remove(next);
            } else {
                z = nVar.mo1482b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo1592r();
        if (z) {
            this.f1274x = jVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0416g mo1562c(int i) {
        this.f1262l = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0421j> mo1563c() {
        mo1557b();
        return this.f1259i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1564c(C0421j jVar) {
        this.f1261k = true;
        mo1560b(true);
    }

    /* renamed from: c */
    public void mo1565c(boolean z) {
        this.f1276z = z;
    }

    public void clear() {
        C0421j jVar = this.f1274x;
        if (jVar != null) {
            mo1546a(jVar);
        }
        this.f1256f.clear();
        mo1560b(true);
    }

    public void clearHeader() {
        this.f1265o = null;
        this.f1264n = null;
        this.f1266p = null;
        mo1560b(false);
    }

    public void close() {
        mo1542a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0416g mo1569d(int i) {
        m1701a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo1570d() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1571d(C0421j jVar) {
        this.f1258h = true;
        mo1560b(true);
    }

    /* renamed from: e */
    public Context mo1572e() {
        return this.f1251a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0416g mo1573e(int i) {
        m1701a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public C0421j mo1574f() {
        return this.f1274x;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0421j jVar = this.f1256f.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo1576g() {
        return this.f1265o;
    }

    public MenuItem getItem(int i) {
        return this.f1256f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo1578h() {
        return this.f1264n;
    }

    public boolean hasVisibleItems() {
        if (this.f1276z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1256f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo1580i() {
        return this.f1266p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1534a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0421j> mo1582j() {
        mo1557b();
        return this.f1260j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo1583k() {
        return this.f1270t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Resources mo1584l() {
        return this.f1252b;
    }

    /* renamed from: m */
    public C0416g mo1585m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0421j> mo1586n() {
        if (!this.f1258h) {
            return this.f1257g;
        }
        this.f1257g.clear();
        int size = this.f1256f.size();
        for (int i = 0; i < size; i++) {
            C0421j jVar = this.f1256f.get(i);
            if (jVar.isVisible()) {
                this.f1257g.add(jVar);
            }
        }
        this.f1258h = false;
        this.f1261k = true;
        return this.f1257g;
    }

    /* renamed from: o */
    public boolean mo1587o() {
        return this.f1275y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo1588p() {
        return this.f1253c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1543a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0421j a = mo1534a(i, keyEvent);
        boolean a2 = a != null ? mo1543a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo1542a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo1591q() {
        return this.f1254d;
    }

    /* renamed from: r */
    public void mo1592r() {
        this.f1267q = false;
        if (this.f1268r) {
            this.f1268r = false;
            mo1560b(this.f1269s);
        }
    }

    public void removeGroup(int i) {
        int a = mo1528a(i);
        if (a >= 0) {
            int size = this.f1256f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1256f.get(a).getGroupId() != i) {
                    mo1560b(true);
                } else {
                    m1702a(a, false);
                    i2 = i3;
                }
            }
            mo1560b(true);
        }
    }

    public void removeItem(int i) {
        m1702a(mo1556b(i), true);
    }

    /* renamed from: s */
    public void mo1595s() {
        if (!this.f1267q) {
            this.f1267q = true;
            this.f1268r = false;
            this.f1269s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1256f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0421j jVar = this.f1256f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo1614c(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1275y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1256f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0421j jVar = this.f1256f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1256f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0421j jVar = this.f1256f.get(i2);
            if (jVar.getGroupId() == i && jVar.mo1618e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1560b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1253c = z;
        mo1560b(false);
    }

    public int size() {
        return this.f1256f.size();
    }
}
