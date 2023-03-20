package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0718g;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements C0718g {

    /* renamed from: d */
    private static int f818d;

    /* renamed from: e */
    private static Field f819e;

    /* renamed from: f */
    private static Field f820f;

    /* renamed from: g */
    private static Field f821g;

    /* renamed from: c */
    private Activity f822c;

    ImmLeaksCleaner(Activity activity) {
        this.f822c = activity;
    }

    /* renamed from: a */
    private static void m1252a() {
        try {
            f818d = 2;
            f820f = InputMethodManager.class.getDeclaredField("mServedView");
            f820f.setAccessible(true);
            f821g = InputMethodManager.class.getDeclaredField("mNextServedView");
            f821g.setAccessible(true);
            f819e = InputMethodManager.class.getDeclaredField("mH");
            f819e.setAccessible(true);
            f818d = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1149a(androidx.lifecycle.C0720i r3, androidx.lifecycle.C0715f.C0716a r4) {
        /*
            r2 = this;
            androidx.lifecycle.f$a r3 = androidx.lifecycle.C0715f.C0716a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f818d
            if (r3 != 0) goto L_0x000c
            m1252a()
        L_0x000c:
            int r3 = f818d
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f822c
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f819e     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f820f     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f821g     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo1149a(androidx.lifecycle.i, androidx.lifecycle.f$a):void");
    }
}
