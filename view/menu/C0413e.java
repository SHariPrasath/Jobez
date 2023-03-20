package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.view.menu.C0434o;
import java.util.ArrayList;
import p000a.p001a.C0006g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0413e implements C0432n, AdapterView.OnItemClickListener {

    /* renamed from: c */
    Context f1233c;

    /* renamed from: d */
    LayoutInflater f1234d;

    /* renamed from: e */
    C0416g f1235e;

    /* renamed from: f */
    ExpandedMenuView f1236f;

    /* renamed from: g */
    int f1237g;

    /* renamed from: h */
    int f1238h;

    /* renamed from: i */
    int f1239i;

    /* renamed from: j */
    private C0432n.C0433a f1240j;

    /* renamed from: k */
    C0414a f1241k;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0414a extends BaseAdapter {

        /* renamed from: c */
        private int f1242c = -1;

        public C0414a() {
            mo1514a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1514a() {
            C0421j f = C0413e.this.f1235e.mo1574f();
            if (f != null) {
                ArrayList<C0421j> j = C0413e.this.f1235e.mo1582j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f1242c = i;
                        return;
                    }
                }
            }
            this.f1242c = -1;
        }

        public int getCount() {
            int size = C0413e.this.f1235e.mo1582j().size() - C0413e.this.f1237g;
            return this.f1242c < 0 ? size : size - 1;
        }

        public C0421j getItem(int i) {
            ArrayList<C0421j> j = C0413e.this.f1235e.mo1582j();
            int i2 = i + C0413e.this.f1237g;
            int i3 = this.f1242c;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0413e eVar = C0413e.this;
                view = eVar.f1234d.inflate(eVar.f1239i, viewGroup, false);
            }
            ((C0434o.C0435a) view).mo1397a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1514a();
            super.notifyDataSetChanged();
        }
    }

    public C0413e(int i, int i2) {
        this.f1239i = i;
        this.f1238h = i2;
    }

    public C0413e(Context context, int i) {
        this(i, 0);
        this.f1233c = context;
        this.f1234d = LayoutInflater.from(this.f1233c);
    }

    /* renamed from: a */
    public ListAdapter mo1511a() {
        if (this.f1241k == null) {
            this.f1241k = new C0414a();
        }
        return this.f1241k;
    }

    /* renamed from: a */
    public C0434o mo1512a(ViewGroup viewGroup) {
        if (this.f1236f == null) {
            this.f1236f = (ExpandedMenuView) this.f1234d.inflate(C0006g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1241k == null) {
                this.f1241k = new C0414a();
            }
            this.f1236f.setAdapter(this.f1241k);
            this.f1236f.setOnItemClickListener(this);
        }
        return this.f1236f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f1234d == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1471a(android.content.Context r3, androidx.appcompat.view.menu.C0416g r4) {
        /*
            r2 = this;
            int r0 = r2.f1238h
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1233c = r1
        L_0x000b:
            android.content.Context r3 = r2.f1233c
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1234d = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f1233c
            if (r0 == 0) goto L_0x001f
            r2.f1233c = r3
            android.view.LayoutInflater r3 = r2.f1234d
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f1235e = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f1241k
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0413e.mo1471a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: a */
    public void mo1473a(C0416g gVar, boolean z) {
        C0432n.C0433a aVar = this.f1240j;
        if (aVar != null) {
            aVar.mo1345a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo1475a(C0432n.C0433a aVar) {
        this.f1240j = aVar;
    }

    /* renamed from: a */
    public void mo1476a(boolean z) {
        C0414a aVar = this.f1241k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo1479a(C0416g gVar, C0421j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1480a(C0441s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new C0419h(sVar).mo1603a((IBinder) null);
        C0432n.C0433a aVar = this.f1240j;
        if (aVar == null) {
            return true;
        }
        aVar.mo1346a(sVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo1495b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1482b(C0416g gVar, C0421j jVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1235e.mo1544a((MenuItem) this.f1241k.getItem(i), (C0432n) this, 0);
    }
}
