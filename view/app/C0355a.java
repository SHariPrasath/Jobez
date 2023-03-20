package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.C0030b;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0355a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0356a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f954a;

        public C0356a(int i, int i2) {
            super(i, i2);
            this.f954a = 0;
            this.f954a = 8388627;
        }

        public C0356a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f954a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionBarLayout);
            this.f954a = obtainStyledAttributes.getInt(C0009j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0356a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f954a = 0;
        }

        public C0356a(C0356a aVar) {
            super(aVar);
            this.f954a = 0;
            this.f954a = aVar.f954a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0357b {
        /* renamed from: a */
        void mo1225a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0358c {
        /* renamed from: a */
        public abstract CharSequence mo1226a();

        /* renamed from: b */
        public abstract View mo1227b();

        /* renamed from: c */
        public abstract Drawable mo1228c();

        /* renamed from: d */
        public abstract CharSequence mo1229d();

        /* renamed from: e */
        public abstract void mo1230e();
    }

    /* renamed from: a */
    public C0030b mo1209a(C0030b.C0031a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1210a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo1211a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo1212a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo1213a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1214b(boolean z);

    /* renamed from: c */
    public abstract void mo1215c(boolean z);

    /* renamed from: d */
    public abstract void mo1216d(boolean z);

    /* renamed from: e */
    public abstract void mo1217e(boolean z);

    /* renamed from: e */
    public boolean mo1218e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo1219f();

    /* renamed from: g */
    public abstract int mo1220g();

    /* renamed from: h */
    public abstract Context mo1221h();

    /* renamed from: i */
    public boolean mo1222i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1223j() {
    }

    /* renamed from: k */
    public boolean mo1224k() {
        return false;
    }
}
