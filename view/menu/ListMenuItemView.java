package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0434o;
import androidx.appcompat.widget.C0576w0;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0009j;
import p000a.p013d.p023k.C0187u;

public class ListMenuItemView extends LinearLayout implements C0434o.C0435a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c */
    private C0421j f1149c;

    /* renamed from: d */
    private ImageView f1150d;

    /* renamed from: e */
    private RadioButton f1151e;

    /* renamed from: f */
    private TextView f1152f;

    /* renamed from: g */
    private CheckBox f1153g;

    /* renamed from: h */
    private TextView f1154h;

    /* renamed from: i */
    private ImageView f1155i;

    /* renamed from: j */
    private ImageView f1156j;

    /* renamed from: k */
    private LinearLayout f1157k;

    /* renamed from: l */
    private Drawable f1158l;

    /* renamed from: m */
    private int f1159m;

    /* renamed from: n */
    private Context f1160n;

    /* renamed from: o */
    private boolean f1161o;

    /* renamed from: p */
    private Drawable f1162p;

    /* renamed from: q */
    private boolean f1163q;

    /* renamed from: r */
    private LayoutInflater f1164r;

    /* renamed from: s */
    private boolean f1165s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0576w0 a = C0576w0.m2441a(getContext(), attributeSet, C0009j.MenuView, i, 0);
        this.f1158l = a.mo2597b(C0009j.MenuView_android_itemBackground);
        this.f1159m = a.mo2606g(C0009j.MenuView_android_itemTextAppearance, -1);
        this.f1161o = a.mo2595a(C0009j.MenuView_preserveIconSpacing, false);
        this.f1160n = context;
        this.f1162p = a.mo2597b(C0009j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0000a.dropDownListViewStyle, 0);
        this.f1163q = obtainStyledAttributes.hasValue(0);
        a.mo2594a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m1626a(View view) {
        m1627a(view, -1);
    }

    /* renamed from: a */
    private void m1627a(View view, int i) {
        LinearLayout linearLayout = this.f1157k;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m1628b() {
        this.f1153g = (CheckBox) getInflater().inflate(C0006g.abc_list_menu_item_checkbox, this, false);
        m1626a(this.f1153g);
    }

    /* renamed from: c */
    private void m1629c() {
        this.f1150d = (ImageView) getInflater().inflate(C0006g.abc_list_menu_item_icon, this, false);
        m1627a((View) this.f1150d, 0);
    }

    /* renamed from: d */
    private void m1630d() {
        this.f1151e = (RadioButton) getInflater().inflate(C0006g.abc_list_menu_item_radio, this, false);
        m1626a(this.f1151e);
    }

    private LayoutInflater getInflater() {
        if (this.f1164r == null) {
            this.f1164r = LayoutInflater.from(getContext());
        }
        return this.f1164r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1155i;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo1397a(C0421j jVar, int i) {
        this.f1149c = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo1607a((C0434o.C0435a) this));
        setCheckable(jVar.isCheckable());
        mo1424a(jVar.mo1643m(), jVar.mo1615d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo1424a(boolean z, char c) {
        int i = (!z || !this.f1149c.mo1643m()) ? 8 : 0;
        if (i == 0) {
            this.f1154h.setText(this.f1149c.mo1617e());
        }
        if (this.f1154h.getVisibility() != i) {
            this.f1154h.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo1398a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1156j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1156j.getLayoutParams();
            rect.top += this.f1156j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C0421j getItemData() {
        return this.f1149c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0187u.m694a((View) this, this.f1158l);
        this.f1152f = (TextView) findViewById(C0005f.title);
        int i = this.f1159m;
        if (i != -1) {
            this.f1152f.setTextAppearance(this.f1160n, i);
        }
        this.f1154h = (TextView) findViewById(C0005f.shortcut);
        this.f1155i = (ImageView) findViewById(C0005f.submenuarrow);
        ImageView imageView = this.f1155i;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1162p);
        }
        this.f1156j = (ImageView) findViewById(C0005f.group_divider);
        this.f1157k = (LinearLayout) findViewById(C0005f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1150d != null && this.f1161o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1150d.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1151e != null || this.f1153g != null) {
            if (this.f1149c.mo1635i()) {
                if (this.f1151e == null) {
                    m1630d();
                }
                compoundButton2 = this.f1151e;
                compoundButton = this.f1153g;
            } else {
                if (this.f1153g == null) {
                    m1628b();
                }
                compoundButton2 = this.f1153g;
                compoundButton = this.f1151e;
            }
            if (z) {
                compoundButton2.setChecked(this.f1149c.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1153g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1151e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1149c.mo1635i()) {
            if (this.f1151e == null) {
                m1630d();
            }
            compoundButton = this.f1151e;
        } else {
            if (this.f1153g == null) {
                m1628b();
            }
            compoundButton = this.f1153g;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1165s = z;
        this.f1161o = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1156j;
        if (imageView != null) {
            imageView.setVisibility((this.f1163q || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1149c.mo1642l() || this.f1165s;
        if (!z && !this.f1161o) {
            return;
        }
        if (this.f1150d != null || drawable != null || this.f1161o) {
            if (this.f1150d == null) {
                m1629c();
            }
            if (drawable != null || this.f1161o) {
                ImageView imageView = this.f1150d;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1150d.getVisibility() != 0) {
                    this.f1150d.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1150d.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1152f.setText(charSequence);
            if (this.f1152f.getVisibility() != 0) {
                textView = this.f1152f;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1152f.getVisibility() != 8) {
                textView = this.f1152f;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
