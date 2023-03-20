package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0000a;
import p000a.p001a.p007n.C0030b;
import p000a.p013d.p023k.C0170e;

/* renamed from: androidx.appcompat.app.h */
public class C0385h extends Dialog implements C0363e {

    /* renamed from: c */
    private C0364f f1058c;

    /* renamed from: d */
    private final C0170e.C0171a f1059d = new C0386a();

    /* renamed from: androidx.appcompat.app.h$a */
    class C0386a implements C0170e.C0171a {
        C0386a() {
        }

        /* renamed from: a */
        public boolean mo658a(KeyEvent keyEvent) {
            return C0385h.this.mo1363a(keyEvent);
        }
    }

    public C0385h(Context context, int i) {
        super(context, m1515a(context, i));
        C0364f a = mo1361a();
        a.mo1301d(m1515a(context, i));
        a.mo1288a((Bundle) null);
    }

    /* renamed from: a */
    private static int m1515a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0030b mo1244a(C0030b.C0031a aVar) {
        return null;
    }

    /* renamed from: a */
    public C0364f mo1361a() {
        if (this.f1058c == null) {
            this.f1058c = C0364f.m1370a((Dialog) this, (C0363e) this);
        }
        return this.f1058c;
    }

    /* renamed from: a */
    public void mo1245a(C0030b bVar) {
    }

    /* renamed from: a */
    public boolean mo1362a(int i) {
        return mo1361a().mo1296b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1363a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1361a().mo1290a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo1251b(C0030b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0170e.m639a(this.f1059d, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo1361a().mo1285a(i);
    }

    public void invalidateOptionsMenu() {
        mo1361a().mo1302e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo1361a().mo1300d();
        super.onCreate(bundle);
        mo1361a().mo1288a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1361a().mo1306i();
    }

    public void setContentView(int i) {
        mo1361a().mo1298c(i);
    }

    public void setContentView(View view) {
        mo1361a().mo1289a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1361a().mo1295b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1361a().mo1292a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1361a().mo1292a(charSequence);
    }
}
