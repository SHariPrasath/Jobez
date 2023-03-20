package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0434o;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0415f extends BaseAdapter {

    /* renamed from: c */
    C0416g f1244c;

    /* renamed from: d */
    private int f1245d = -1;

    /* renamed from: e */
    private boolean f1246e;

    /* renamed from: f */
    private final boolean f1247f;

    /* renamed from: g */
    private final LayoutInflater f1248g;

    /* renamed from: h */
    private final int f1249h;

    public C0415f(C0416g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1247f = z;
        this.f1248g = layoutInflater;
        this.f1244c = gVar;
        this.f1249h = i;
        mo1520a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1520a() {
        C0421j f = this.f1244c.mo1574f();
        if (f != null) {
            ArrayList<C0421j> j = this.f1244c.mo1582j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f1245d = i;
                    return;
                }
            }
        }
        this.f1245d = -1;
    }

    /* renamed from: a */
    public void mo1521a(boolean z) {
        this.f1246e = z;
    }

    /* renamed from: b */
    public C0416g mo1522b() {
        return this.f1244c;
    }

    public int getCount() {
        ArrayList<C0421j> j = this.f1247f ? this.f1244c.mo1582j() : this.f1244c.mo1586n();
        int i = this.f1245d;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    public C0421j getItem(int i) {
        ArrayList<C0421j> j = this.f1247f ? this.f1244c.mo1582j() : this.f1244c.mo1586n();
        int i2 = this.f1245d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1248g.inflate(this.f1249h, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1244c.mo1587o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0434o.C0435a aVar = (C0434o.C0435a) view;
        if (this.f1246e) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1397a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1520a();
        super.notifyDataSetChanged();
    }
}
