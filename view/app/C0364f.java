package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0488b1;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000a.p012c.C0059b;

/* renamed from: androidx.appcompat.app.f */
public abstract class C0364f {

    /* renamed from: c */
    private static int f960c = -100;

    /* renamed from: d */
    private static final C0059b<WeakReference<C0364f>> f961d = new C0059b<>();

    /* renamed from: e */
    private static final Object f962e = new Object();

    C0364f() {
    }

    /* renamed from: a */
    public static C0364f m1369a(Activity activity, C0363e eVar) {
        return new C0365g(activity, eVar);
    }

    /* renamed from: a */
    public static C0364f m1370a(Dialog dialog, C0363e eVar) {
        return new C0365g(dialog, eVar);
    }

    /* renamed from: a */
    static void m1371a(C0364f fVar) {
        synchronized (f962e) {
            m1374c(fVar);
            f961d.add(new WeakReference(fVar));
        }
    }

    /* renamed from: a */
    public static void m1372a(boolean z) {
        C0488b1.m2086a(z);
    }

    /* renamed from: b */
    static void m1373b(C0364f fVar) {
        synchronized (f962e) {
            m1374c(fVar);
        }
    }

    /* renamed from: c */
    private static void m1374c(C0364f fVar) {
        synchronized (f962e) {
            Iterator<WeakReference<C0364f>> it = f961d.iterator();
            while (it.hasNext()) {
                C0364f fVar2 = (C0364f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: j */
    public static int m1375j() {
        return f960c;
    }

    /* renamed from: a */
    public int mo1284a() {
        return -100;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo1285a(int i);

    /* renamed from: a */
    public void mo1286a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo1287a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1288a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo1289a(View view);

    /* renamed from: a */
    public abstract void mo1290a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo1291a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo1292a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo1293b();

    /* renamed from: b */
    public abstract void mo1294b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo1295b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo1296b(int i);

    /* renamed from: c */
    public abstract C0355a mo1297c();

    /* renamed from: c */
    public abstract void mo1298c(int i);

    /* renamed from: c */
    public abstract void mo1299c(Bundle bundle);

    /* renamed from: d */
    public abstract void mo1300d();

    /* renamed from: d */
    public void mo1301d(int i) {
    }

    /* renamed from: e */
    public abstract void mo1302e();

    /* renamed from: f */
    public abstract void mo1303f();

    /* renamed from: g */
    public abstract void mo1304g();

    /* renamed from: h */
    public abstract void mo1305h();

    /* renamed from: i */
    public abstract void mo1306i();
}
