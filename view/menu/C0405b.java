package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.view.menu.C0434o;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0405b implements C0432n {

    /* renamed from: c */
    protected Context f1185c;

    /* renamed from: d */
    protected Context f1186d;

    /* renamed from: e */
    protected C0416g f1187e;

    /* renamed from: f */
    protected LayoutInflater f1188f;

    /* renamed from: g */
    private C0432n.C0433a f1189g;

    /* renamed from: h */
    private int f1190h;

    /* renamed from: i */
    private int f1191i;

    /* renamed from: j */
    protected C0434o f1192j;

    public C0405b(Context context, int i, int i2) {
        this.f1185c = context;
        this.f1188f = LayoutInflater.from(context);
        this.f1190h = i;
        this.f1191i = i2;
    }

    /* renamed from: a */
    public View mo1467a(C0421j jVar, View view, ViewGroup viewGroup) {
        C0434o.C0435a a = view instanceof C0434o.C0435a ? (C0434o.C0435a) view : mo1469a(viewGroup);
        mo1474a(jVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public C0432n.C0433a mo1468a() {
        return this.f1189g;
    }

    /* renamed from: a */
    public C0434o.C0435a mo1469a(ViewGroup viewGroup) {
        return (C0434o.C0435a) this.f1188f.inflate(this.f1191i, viewGroup, false);
    }

    /* renamed from: a */
    public void mo1470a(int i) {
    }

    /* renamed from: a */
    public void mo1471a(Context context, C0416g gVar) {
        this.f1186d = context;
        LayoutInflater.from(this.f1186d);
        this.f1187e = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1472a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1192j).addView(view, i);
    }

    /* renamed from: a */
    public void mo1473a(C0416g gVar, boolean z) {
        C0432n.C0433a aVar = this.f1189g;
        if (aVar != null) {
            aVar.mo1345a(gVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo1474a(C0421j jVar, C0434o.C0435a aVar);

    /* renamed from: a */
    public void mo1475a(C0432n.C0433a aVar) {
        this.f1189g = aVar;
    }

    /* renamed from: a */
    public void mo1476a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1192j;
        if (viewGroup != null) {
            C0416g gVar = this.f1187e;
            int i = 0;
            if (gVar != null) {
                gVar.mo1557b();
                ArrayList<C0421j> n = this.f1187e.mo1586n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0421j jVar = n.get(i3);
                    if (mo1477a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0421j itemData = childAt instanceof C0434o.C0435a ? ((C0434o.C0435a) childAt).getItemData() : null;
                        View a = mo1467a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo1472a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1478a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo1477a(int i, C0421j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1478a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo1479a(C0416g gVar, C0421j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1480a(C0441s sVar) {
        C0432n.C0433a aVar = this.f1189g;
        if (aVar != null) {
            return aVar.mo1346a(sVar);
        }
        return false;
    }

    /* renamed from: b */
    public C0434o mo1481b(ViewGroup viewGroup) {
        if (this.f1192j == null) {
            this.f1192j = (C0434o) this.f1188f.inflate(this.f1190h, viewGroup, false);
            this.f1192j.mo1419a(this.f1187e);
            mo1476a(true);
        }
        return this.f1192j;
    }

    /* renamed from: b */
    public boolean mo1482b(C0416g gVar, C0421j jVar) {
        return false;
    }
}
