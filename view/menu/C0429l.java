package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.l */
abstract class C0429l implements C0437q, C0432n, AdapterView.OnItemClickListener {

    /* renamed from: c */
    private Rect f1323c;

    C0429l() {
    }

    /* renamed from: a */
    protected static int m1799a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0415f m1800a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0415f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0415f) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m1801b(C0416g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo1489a(int i);

    /* renamed from: a */
    public void mo1471a(Context context, C0416g gVar) {
    }

    /* renamed from: a */
    public void mo1722a(Rect rect) {
        this.f1323c = rect;
    }

    /* renamed from: a */
    public abstract void mo1490a(View view);

    /* renamed from: a */
    public abstract void mo1491a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo1492a(C0416g gVar);

    /* renamed from: a */
    public boolean mo1479a(C0416g gVar, C0421j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1493b(int i);

    /* renamed from: b */
    public abstract void mo1494b(boolean z);

    /* renamed from: b */
    public boolean mo1482b(C0416g gVar, C0421j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo1496c(int i);

    /* renamed from: c */
    public abstract void mo1497c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1499d() {
        return true;
    }

    /* renamed from: f */
    public Rect mo1723f() {
        return this.f1323c;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1800a(listAdapter).f1244c.mo1544a((MenuItem) listAdapter.getItem(i), (C0432n) this, mo1499d() ? 0 : 4);
    }
}
