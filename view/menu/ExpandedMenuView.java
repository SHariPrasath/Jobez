package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0416g;
import androidx.appcompat.widget.C0576w0;

public final class ExpandedMenuView extends ListView implements C0416g.C0418b, C0434o, AdapterView.OnItemClickListener {

    /* renamed from: e */
    private static final int[] f1146e = {16842964, 16843049};

    /* renamed from: c */
    private C0416g f1147c;

    /* renamed from: d */
    private int f1148d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0576w0 a = C0576w0.m2441a(context, attributeSet, f1146e, i, 0);
        if (a.mo2607g(0)) {
            setBackgroundDrawable(a.mo2597b(0));
        }
        if (a.mo2607g(1)) {
            setDivider(a.mo2597b(1));
        }
        a.mo2594a();
    }

    /* renamed from: a */
    public void mo1419a(C0416g gVar) {
        this.f1147c = gVar;
    }

    /* renamed from: a */
    public boolean mo1420a(C0421j jVar) {
        return this.f1147c.mo1543a((MenuItem) jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1148d;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1420a((C0421j) getAdapter().getItem(i));
    }
}
