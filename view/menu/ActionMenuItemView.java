package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0416g;
import androidx.appcompat.view.menu.C0434o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0512h0;
import androidx.appcompat.widget.C0584y0;
import androidx.appcompat.widget.C0585z;
import p000a.p001a.C0009j;

public class ActionMenuItemView extends C0585z implements C0434o.C0435a, View.OnClickListener, ActionMenuView.C0449a {

    /* renamed from: g */
    C0421j f1134g;

    /* renamed from: h */
    private CharSequence f1135h;

    /* renamed from: i */
    private Drawable f1136i;

    /* renamed from: j */
    C0416g.C0418b f1137j;

    /* renamed from: k */
    private C0512h0 f1138k;

    /* renamed from: l */
    C0403b f1139l;

    /* renamed from: m */
    private boolean f1140m;

    /* renamed from: n */
    private boolean f1141n;

    /* renamed from: o */
    private int f1142o;

    /* renamed from: p */
    private int f1143p;

    /* renamed from: q */
    private int f1144q;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0402a extends C0512h0 {
        public C0402a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0437q mo1416a() {
            C0403b bVar = ActionMenuItemView.this.f1139l;
            if (bVar != null) {
                return bVar.mo1418a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo1416a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1417b() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f1137j
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.j r0 = r0.f1134g
                boolean r0 = r1.mo1420a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.q r0 = r3.mo1416a()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo1498c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0402a.mo1417b():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0403b {
        /* renamed from: a */
        public abstract C0437q mo1418a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1140m = m1614e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionMenuItemView, i, 0);
        this.f1142o = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1144q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1143p = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m1614e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m1615f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1135h);
        if (this.f1136i != null && (!this.f1134g.mo1644n() || (!this.f1140m && !this.f1141n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1135h : null);
        CharSequence contentDescription = this.f1134g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1134g.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1134g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1134g.getTitle();
            }
            C0584y0.m2533a(this, charSequence);
            return;
        }
        C0584y0.m2533a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo1397a(C0421j jVar, int i) {
        this.f1134g = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo1607a((C0434o.C0435a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1138k == null) {
            this.f1138k = new C0402a();
        }
    }

    /* renamed from: a */
    public boolean mo1398a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo1399b() {
        return mo1401d();
    }

    /* renamed from: c */
    public boolean mo1400c() {
        return mo1401d() && this.f1134g.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo1401d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0421j getItemData() {
        return this.f1134g;
    }

    public void onClick(View view) {
        C0416g.C0418b bVar = this.f1137j;
        if (bVar != null) {
            bVar.mo1420a(this.f1134g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1140m = m1614e();
        m1615f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d = mo1401d();
        if (d && (i3 = this.f1143p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1142o) : this.f1142o;
        if (mode != 1073741824 && this.f1142o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f1136i != null) {
            super.setPadding((getMeasuredWidth() - this.f1136i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0512h0 h0Var;
        if (!this.f1134g.hasSubMenu() || (h0Var = this.f1138k) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1141n != z) {
            this.f1141n = z;
            C0421j jVar = this.f1134g;
            if (jVar != null) {
                jVar.mo1611b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1136i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1144q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f1144q;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m1615f();
    }

    public void setItemInvoker(C0416g.C0418b bVar) {
        this.f1137j = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1143p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0403b bVar) {
        this.f1139l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1135h = charSequence;
        m1615f();
    }
}
