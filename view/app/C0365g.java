package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0413e;
import androidx.appcompat.view.menu.C0416g;
import androidx.appcompat.view.menu.C0432n;
import androidx.appcompat.view.menu.C0434o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0488b1;
import androidx.appcompat.widget.C0497c0;
import androidx.appcompat.widget.C0498c1;
import androidx.appcompat.widget.C0509g0;
import androidx.appcompat.widget.C0518j;
import androidx.appcompat.widget.C0576w0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0590a;
import androidx.core.app.C0603e;
import androidx.lifecycle.C0715f;
import androidx.lifecycle.C0720i;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.C0000a;
import p000a.p001a.C0002c;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0008i;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p007n.C0030b;
import p000a.p001a.p007n.C0033d;
import p000a.p001a.p007n.C0035f;
import p000a.p001a.p007n.C0037g;
import p000a.p001a.p007n.C0042i;
import p000a.p012c.C0057a;
import p000a.p013d.p023k.C0139a0;
import p000a.p013d.p023k.C0145c0;
import p000a.p013d.p023k.C0170e;
import p000a.p013d.p023k.C0172f;
import p000a.p013d.p023k.C0183q;
import p000a.p013d.p023k.C0187u;
import p000a.p013d.p023k.C0199y;
import p000a.p013d.p023k.C0203z;

/* renamed from: androidx.appcompat.app.g */
class C0365g extends C0364f implements C0416g.C0417a, LayoutInflater.Factory2 {

    /* renamed from: c0 */
    private static final Map<Class<?>, Integer> f963c0 = new C0057a();

    /* renamed from: d0 */
    private static final boolean f964d0 = (Build.VERSION.SDK_INT < 21);

    /* renamed from: e0 */
    private static final int[] f965e0 = {16842836};

    /* renamed from: f0 */
    private static boolean f966f0 = true;

    /* renamed from: g0 */
    private static final boolean f967g0;

    /* renamed from: A */
    private boolean f968A;

    /* renamed from: B */
    private boolean f969B;

    /* renamed from: C */
    boolean f970C;

    /* renamed from: D */
    boolean f971D;

    /* renamed from: E */
    boolean f972E;

    /* renamed from: F */
    boolean f973F;

    /* renamed from: G */
    boolean f974G;

    /* renamed from: H */
    private boolean f975H;

    /* renamed from: I */
    private C0383o[] f976I;

    /* renamed from: J */
    private C0383o f977J;

    /* renamed from: K */
    private boolean f978K;

    /* renamed from: L */
    private boolean f979L;

    /* renamed from: M */
    private boolean f980M;

    /* renamed from: N */
    private boolean f981N;

    /* renamed from: O */
    boolean f982O;

    /* renamed from: P */
    private int f983P;

    /* renamed from: Q */
    private int f984Q;

    /* renamed from: R */
    private boolean f985R;

    /* renamed from: S */
    private boolean f986S;

    /* renamed from: T */
    private C0379l f987T;

    /* renamed from: U */
    private C0379l f988U;

    /* renamed from: V */
    boolean f989V;

    /* renamed from: W */
    int f990W;

    /* renamed from: X */
    private final Runnable f991X;

    /* renamed from: Y */
    private boolean f992Y;

    /* renamed from: Z */
    private Rect f993Z;

    /* renamed from: a0 */
    private Rect f994a0;

    /* renamed from: b0 */
    private AppCompatViewInflater f995b0;

    /* renamed from: f */
    final Object f996f;

    /* renamed from: g */
    final Context f997g;

    /* renamed from: h */
    Window f998h;

    /* renamed from: i */
    private C0377j f999i;

    /* renamed from: j */
    final C0363e f1000j;

    /* renamed from: k */
    C0355a f1001k;

    /* renamed from: l */
    MenuInflater f1002l;

    /* renamed from: m */
    private CharSequence f1003m;

    /* renamed from: n */
    private C0497c0 f1004n;

    /* renamed from: o */
    private C0374h f1005o;

    /* renamed from: p */
    private C0384p f1006p;

    /* renamed from: q */
    C0030b f1007q;

    /* renamed from: r */
    ActionBarContextView f1008r;

    /* renamed from: s */
    PopupWindow f1009s;

    /* renamed from: t */
    Runnable f1010t;

    /* renamed from: u */
    C0199y f1011u;

    /* renamed from: v */
    private boolean f1012v;

    /* renamed from: w */
    private boolean f1013w;

    /* renamed from: x */
    private ViewGroup f1014x;

    /* renamed from: y */
    private TextView f1015y;

    /* renamed from: z */
    private View f1016z;

    /* renamed from: androidx.appcompat.app.g$a */
    static class C0366a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1017a;

        C0366a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1017a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1481a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1481a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f1017a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f1017a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    class C0367b implements Runnable {
        C0367b() {
        }

        public void run() {
            C0365g gVar = C0365g.this;
            if ((gVar.f990W & 1) != 0) {
                gVar.mo1321f(0);
            }
            C0365g gVar2 = C0365g.this;
            if ((gVar2.f990W & 4096) != 0) {
                gVar2.mo1321f(108);
            }
            C0365g gVar3 = C0365g.this;
            gVar3.f989V = false;
            gVar3.f990W = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    class C0368c implements C0183q {
        C0368c() {
        }

        /* renamed from: a */
        public C0145c0 mo687a(View view, C0145c0 c0Var) {
            int g = c0Var.mo599g();
            int j = C0365g.this.mo1325j(g);
            if (g != j) {
                c0Var = c0Var.mo592a(c0Var.mo596e(), j, c0Var.mo598f(), c0Var.mo595d());
            }
            return C0187u.m683a(view, c0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    class C0369d implements C0509g0.C0510a {
        C0369d() {
        }

        /* renamed from: a */
        public void mo1341a(Rect rect) {
            rect.top = C0365g.this.mo1325j(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    class C0370e implements ContentFrameLayout.C0454a {
        C0370e() {
        }

        /* renamed from: a */
        public void mo1342a() {
        }

        public void onDetachedFromWindow() {
            C0365g.this.mo1327l();
        }
    }

    /* renamed from: androidx.appcompat.app.g$f */
    class C0371f implements Runnable {

        /* renamed from: androidx.appcompat.app.g$f$a */
        class C0372a extends C0139a0 {
            C0372a() {
            }

            /* renamed from: b */
            public void mo203b(View view) {
                C0365g.this.f1008r.setAlpha(1.0f);
                C0365g.this.f1011u.mo708a((C0203z) null);
                C0365g.this.f1011u = null;
            }

            /* renamed from: c */
            public void mo204c(View view) {
                C0365g.this.f1008r.setVisibility(0);
            }
        }

        C0371f() {
        }

        public void run() {
            C0365g gVar = C0365g.this;
            gVar.f1009s.showAtLocation(gVar.f1008r, 55, 0, 0);
            C0365g.this.mo1328m();
            if (C0365g.this.mo1338u()) {
                C0365g.this.f1008r.setAlpha(0.0f);
                C0365g gVar2 = C0365g.this;
                C0199y a = C0187u.m685a(gVar2.f1008r);
                a.mo705a(1.0f);
                gVar2.f1011u = a;
                C0365g.this.f1011u.mo708a((C0203z) new C0372a());
                return;
            }
            C0365g.this.f1008r.setAlpha(1.0f);
            C0365g.this.f1008r.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    class C0373g extends C0139a0 {
        C0373g() {
        }

        /* renamed from: b */
        public void mo203b(View view) {
            C0365g.this.f1008r.setAlpha(1.0f);
            C0365g.this.f1011u.mo708a((C0203z) null);
            C0365g.this.f1011u = null;
        }

        /* renamed from: c */
        public void mo204c(View view) {
            C0365g.this.f1008r.setVisibility(0);
            C0365g.this.f1008r.sendAccessibilityEvent(32);
            if (C0365g.this.f1008r.getParent() instanceof View) {
                C0187u.m726t((View) C0365g.this.f1008r.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$h */
    private final class C0374h implements C0432n.C0433a {
        C0374h() {
        }

        /* renamed from: a */
        public void mo1345a(C0416g gVar, boolean z) {
            C0365g.this.mo1317b(gVar);
        }

        /* renamed from: a */
        public boolean mo1346a(C0416g gVar) {
            Window.Callback q = C0365g.this.mo1334q();
            if (q == null) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.g$i */
    class C0375i implements C0030b.C0031a {

        /* renamed from: a */
        private C0030b.C0031a f1026a;

        /* renamed from: androidx.appcompat.app.g$i$a */
        class C0376a extends C0139a0 {
            C0376a() {
            }

            /* renamed from: b */
            public void mo203b(View view) {
                C0365g.this.f1008r.setVisibility(8);
                C0365g gVar = C0365g.this;
                PopupWindow popupWindow = gVar.f1009s;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f1008r.getParent() instanceof View) {
                    C0187u.m726t((View) C0365g.this.f1008r.getParent());
                }
                C0365g.this.f1008r.removeAllViews();
                C0365g.this.f1011u.mo708a((C0203z) null);
                C0365g.this.f1011u = null;
            }
        }

        public C0375i(C0030b.C0031a aVar) {
            this.f1026a = aVar;
        }

        /* renamed from: a */
        public void mo151a(C0030b bVar) {
            this.f1026a.mo151a(bVar);
            C0365g gVar = C0365g.this;
            if (gVar.f1009s != null) {
                gVar.f998h.getDecorView().removeCallbacks(C0365g.this.f1010t);
            }
            C0365g gVar2 = C0365g.this;
            if (gVar2.f1008r != null) {
                gVar2.mo1328m();
                C0365g gVar3 = C0365g.this;
                C0199y a = C0187u.m685a(gVar3.f1008r);
                a.mo705a(0.0f);
                gVar3.f1011u = a;
                C0365g.this.f1011u.mo708a((C0203z) new C0376a());
            }
            C0365g gVar4 = C0365g.this;
            C0363e eVar = gVar4.f1000j;
            if (eVar != null) {
                eVar.mo1251b(gVar4.f1007q);
            }
            C0365g.this.f1007q = null;
        }

        /* renamed from: a */
        public boolean mo152a(C0030b bVar, Menu menu) {
            return this.f1026a.mo152a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo153a(C0030b bVar, MenuItem menuItem) {
            return this.f1026a.mo153a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo154b(C0030b bVar, Menu menu) {
            return this.f1026a.mo154b(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.g$j */
    class C0377j extends C0042i {
        C0377j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo1347a(ActionMode.Callback callback) {
            C0035f.C0036a aVar = new C0035f.C0036a(C0365g.this.f997g, callback);
            C0030b a = C0365g.this.mo1307a((C0030b.C0031a) aVar);
            if (a != null) {
                return aVar.mo184b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0365g.this.mo1315a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0365g.this.mo1318b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0416g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0365g.this.mo1323h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0365g.this.mo1324i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0416g gVar = menu instanceof C0416g ? (C0416g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo1565c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo1565c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0416g gVar;
            C0383o a = C0365g.this.mo1309a(0, true);
            if (a == null || (gVar = a.f1047j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0365g.this.mo1335r() ? mo1347a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0365g.this.mo1335r() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo1347a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.g$k */
    private class C0378k extends C0379l {

        /* renamed from: c */
        private final PowerManager f1030c;

        C0378k(Context context) {
            super();
            this.f1030c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo1348b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1349c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f1030c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo1350d() {
            C0365g.this.mo1326k();
        }
    }

    /* renamed from: androidx.appcompat.app.g$l */
    abstract class C0379l {

        /* renamed from: a */
        private BroadcastReceiver f1032a;

        /* renamed from: androidx.appcompat.app.g$l$a */
        class C0380a extends BroadcastReceiver {
            C0380a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0379l.this.mo1350d();
            }
        }

        C0379l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1351a() {
            BroadcastReceiver broadcastReceiver = this.f1032a;
            if (broadcastReceiver != null) {
                try {
                    C0365g.this.f997g.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1032a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo1348b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo1349c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo1350d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo1352e() {
            mo1351a();
            IntentFilter b = mo1348b();
            if (b != null && b.countActions() != 0) {
                if (this.f1032a == null) {
                    this.f1032a = new C0380a();
                }
                C0365g.this.f997g.registerReceiver(this.f1032a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$m */
    private class C0381m extends C0379l {

        /* renamed from: c */
        private final C0395l f1035c;

        C0381m(C0395l lVar) {
            super();
            this.f1035c = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo1348b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1349c() {
            return this.f1035c.mo1379a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo1350d() {
            C0365g.this.mo1326k();
        }
    }

    /* renamed from: androidx.appcompat.app.g$n */
    private class C0382n extends ContentFrameLayout {
        public C0382n(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m1508a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0365g.this.mo1315a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1508a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0365g.this.mo1320e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0010a.m4c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.g$o */
    protected static final class C0383o {

        /* renamed from: a */
        int f1038a;

        /* renamed from: b */
        int f1039b;

        /* renamed from: c */
        int f1040c;

        /* renamed from: d */
        int f1041d;

        /* renamed from: e */
        int f1042e;

        /* renamed from: f */
        int f1043f;

        /* renamed from: g */
        ViewGroup f1044g;

        /* renamed from: h */
        View f1045h;

        /* renamed from: i */
        View f1046i;

        /* renamed from: j */
        C0416g f1047j;

        /* renamed from: k */
        C0413e f1048k;

        /* renamed from: l */
        Context f1049l;

        /* renamed from: m */
        boolean f1050m;

        /* renamed from: n */
        boolean f1051n;

        /* renamed from: o */
        boolean f1052o;

        /* renamed from: p */
        public boolean f1053p;

        /* renamed from: q */
        boolean f1054q = false;

        /* renamed from: r */
        boolean f1055r;

        /* renamed from: s */
        Bundle f1056s;

        C0383o(int i) {
            this.f1038a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0434o mo1357a(C0432n.C0433a aVar) {
            if (this.f1047j == null) {
                return null;
            }
            if (this.f1048k == null) {
                this.f1048k = new C0413e(this.f1049l, C0006g.abc_list_menu_item_layout);
                this.f1048k.mo1475a(aVar);
                this.f1047j.mo1539a((C0432n) this.f1048k);
            }
            return this.f1048k.mo1512a(this.f1044g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1358a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0000a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0000a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0008i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0033d dVar = new C0033d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1049l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0009j.AppCompatTheme);
            this.f1039b = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_panelBackground, 0);
            this.f1043f = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1359a(C0416g gVar) {
            C0413e eVar;
            C0416g gVar2 = this.f1047j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo1559b((C0432n) this.f1048k);
                }
                this.f1047j = gVar;
                if (gVar != null && (eVar = this.f1048k) != null) {
                    gVar.mo1539a((C0432n) eVar);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1360a() {
            if (this.f1045h == null) {
                return false;
            }
            return this.f1046i != null || this.f1048k.mo1511a().getCount() > 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$p */
    private final class C0384p implements C0432n.C0433a {
        C0384p() {
        }

        /* renamed from: a */
        public void mo1345a(C0416g gVar, boolean z) {
            C0416g m = gVar.mo1585m();
            boolean z2 = m != gVar;
            C0365g gVar2 = C0365g.this;
            if (z2) {
                gVar = m;
            }
            C0383o a = gVar2.mo1310a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0365g.this.mo1311a(a.f1038a, a, m);
                C0365g.this.mo1313a(a, true);
                return;
            }
            C0365g.this.mo1313a(a, z);
        }

        /* renamed from: a */
        public boolean mo1346a(C0416g gVar) {
            Window.Callback q;
            if (gVar != null) {
                return true;
            }
            C0365g gVar2 = C0365g.this;
            if (!gVar2.f970C || (q = gVar2.mo1334q()) == null || C0365g.this.f982O) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f967g0 = z;
        if (f964d0 && !f966f0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0366a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0365g(Activity activity, C0363e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    C0365g(Dialog dialog, C0363e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private C0365g(Context context, Window window, C0363e eVar, Object obj) {
        Integer num;
        C0362d F;
        this.f1011u = null;
        this.f1012v = true;
        this.f983P = -100;
        this.f991X = new C0367b();
        this.f997g = context;
        this.f1000j = eVar;
        this.f996f = obj;
        if (this.f983P == -100 && (this.f996f instanceof Dialog) && (F = m1404F()) != null) {
            this.f983P = F.mo1263j().mo1284a();
        }
        if (this.f983P == -100 && (num = f963c0.get(this.f996f.getClass())) != null) {
            this.f983P = num.intValue();
            f963c0.remove(this.f996f.getClass());
        }
        if (window != null) {
            m1405a(window);
        }
        C0518j.m2236c();
    }

    /* renamed from: A */
    private void m1399A() {
        if (this.f998h == null) {
            Object obj = this.f996f;
            if (obj instanceof Activity) {
                m1405a(((Activity) obj).getWindow());
            }
        }
        if (this.f998h == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    private C0379l m1400B() {
        if (this.f988U == null) {
            this.f988U = new C0378k(this.f997g);
        }
        return this.f988U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1401C() {
        /*
            r3 = this;
            r3.m1425z()
            boolean r0 = r3.f970C
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.f1001k
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.lang.Object r0 = r3.f996f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.m r1 = new androidx.appcompat.app.m
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f971D
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f1001k = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.m r1 = new androidx.appcompat.app.m
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.f1001k
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f992Y
            r0.mo1215c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0365g.m1401C():void");
    }

    /* renamed from: D */
    private boolean m1402D() {
        if (!this.f986S && (this.f996f instanceof Activity)) {
            PackageManager packageManager = this.f997g.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f997g, this.f996f.getClass()), 0);
                this.f985R = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f985R = false;
            }
        }
        this.f986S = true;
        return this.f985R;
    }

    /* renamed from: E */
    private void m1403E() {
        if (this.f1013w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: F */
    private C0362d m1404F() {
        Context context = this.f997g;
        while (context != null) {
            if (!(context instanceof C0362d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0362d) context;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1405a(Window window) {
        if (this.f998h == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0377j)) {
                this.f999i = new C0377j(callback);
                window.setCallback(this.f999i);
                C0576w0 a = C0576w0.m2440a(this.f997g, (AttributeSet) null, f965e0);
                Drawable c = a.mo2599c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo2594a();
                this.f998h = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    private void m1406a(C0383o oVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.f1052o && !this.f982O) {
            if (oVar.f1038a == 0) {
                if ((this.f997g.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback q = mo1334q();
            if (q == null || q.onMenuOpened(oVar.f1038a, oVar.f1047j)) {
                WindowManager windowManager = (WindowManager) this.f997g.getSystemService("window");
                if (windowManager != null && m1413b(oVar, keyEvent)) {
                    if (oVar.f1044g == null || oVar.f1054q) {
                        ViewGroup viewGroup = oVar.f1044g;
                        if (viewGroup == null) {
                            if (!m1412b(oVar) || oVar.f1044g == null) {
                                return;
                            }
                        } else if (oVar.f1054q && viewGroup.getChildCount() > 0) {
                            oVar.f1044g.removeAllViews();
                        }
                        if (m1409a(oVar) && oVar.mo1360a()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.f1045h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.f1044g.setBackgroundResource(oVar.f1039b);
                            ViewParent parent = oVar.f1045h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f1045h);
                            }
                            oVar.f1044g.addView(oVar.f1045h, layoutParams2);
                            if (!oVar.f1045h.hasFocus()) {
                                oVar.f1045h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.f1046i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            oVar.f1051n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, oVar.f1041d, oVar.f1042e, 1002, 8519680, -3);
                            layoutParams3.gravity = oVar.f1040c;
                            layoutParams3.windowAnimations = oVar.f1043f;
                            windowManager.addView(oVar.f1044g, layoutParams3);
                            oVar.f1052o = true;
                            return;
                        }
                    }
                    i = -2;
                    oVar.f1051n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, oVar.f1041d, oVar.f1042e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.f1040c;
                    layoutParams32.windowAnimations = oVar.f1043f;
                    windowManager.addView(oVar.f1044g, layoutParams32);
                    oVar.f1052o = true;
                    return;
                }
                return;
            }
            mo1313a(oVar, true);
        }
    }

    /* renamed from: a */
    private void m1407a(C0416g gVar, boolean z) {
        C0497c0 c0Var = this.f1004n;
        if (c0Var == null || !c0Var.mo1837g() || (ViewConfiguration.get(this.f997g).hasPermanentMenuKey() && !this.f1004n.mo1830c())) {
            C0383o a = mo1309a(0, true);
            a.f1054q = true;
            mo1313a(a, false);
            m1406a(a, (KeyEvent) null);
            return;
        }
        Window.Callback q = mo1334q();
        if (this.f1004n.mo1828a() && z) {
            this.f1004n.mo1834e();
            if (!this.f982O) {
                q.onPanelClosed(108, mo1309a(0, true).f1047j);
            }
        } else if (q != null && !this.f982O) {
            if (this.f989V && (this.f990W & 1) != 0) {
                this.f998h.getDecorView().removeCallbacks(this.f991X);
                this.f991X.run();
            }
            C0383o a2 = mo1309a(0, true);
            C0416g gVar2 = a2.f1047j;
            if (gVar2 != null && !a2.f1055r && q.onPreparePanel(0, a2.f1046i, gVar2)) {
                q.onMenuOpened(108, a2.f1047j);
                this.f1004n.mo1835f();
            }
        }
    }

    /* renamed from: a */
    private boolean m1408a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f998h.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0187u.m722p((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m1409a(C0383o oVar) {
        View view = oVar.f1046i;
        if (view != null) {
            oVar.f1045h = view;
            return true;
        } else if (oVar.f1047j == null) {
            return false;
        } else {
            if (this.f1006p == null) {
                this.f1006p = new C0384p();
            }
            oVar.f1045h = (View) oVar.mo1357a((C0432n.C0433a) this.f1006p);
            return oVar.f1045h != null;
        }
    }

    /* renamed from: a */
    private boolean m1410a(C0383o oVar, int i, KeyEvent keyEvent, int i2) {
        C0416g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f1050m || m1413b(oVar, keyEvent)) && (gVar = oVar.f1047j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1004n == null) {
            mo1313a(oVar, true);
        }
        return z;
    }

    /* renamed from: b */
    private boolean m1411b(int i, boolean z) {
        int i2 = this.f997g.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean D = m1402D();
        boolean z3 = false;
        if ((f967g0 || i3 != i2) && !D && Build.VERSION.SDK_INT >= 17 && !this.f979L && (this.f996f instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f996f).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f997g.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !D && this.f979L && (Build.VERSION.SDK_INT >= 17 || this.f980M)) {
            Object obj = this.f996f;
            if (obj instanceof Activity) {
                C0590a.m2550b((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m1415c(i3, D);
        }
        if (z2) {
            Object obj2 = this.f996f;
            if (obj2 instanceof C0362d) {
                ((C0362d) obj2).mo1255c(i);
            }
        }
        return z2;
    }

    /* renamed from: b */
    private boolean m1412b(C0383o oVar) {
        oVar.mo1358a(mo1329n());
        oVar.f1044g = new C0382n(oVar.f1049l);
        oVar.f1040c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m1413b(C0383o oVar, KeyEvent keyEvent) {
        C0497c0 c0Var;
        C0497c0 c0Var2;
        C0497c0 c0Var3;
        if (this.f982O) {
            return false;
        }
        if (oVar.f1050m) {
            return true;
        }
        C0383o oVar2 = this.f977J;
        if (!(oVar2 == null || oVar2 == oVar)) {
            mo1313a(oVar2, false);
        }
        Window.Callback q = mo1334q();
        if (q != null) {
            oVar.f1046i = q.onCreatePanelView(oVar.f1038a);
        }
        int i = oVar.f1038a;
        boolean z = i == 0 || i == 108;
        if (z && (c0Var3 = this.f1004n) != null) {
            c0Var3.mo1829b();
        }
        if (oVar.f1046i == null && (!z || !(mo1337t() instanceof C0388j))) {
            if (oVar.f1047j == null || oVar.f1055r) {
                if (oVar.f1047j == null && (!m1416c(oVar) || oVar.f1047j == null)) {
                    return false;
                }
                if (z && this.f1004n != null) {
                    if (this.f1005o == null) {
                        this.f1005o = new C0374h();
                    }
                    this.f1004n.mo1827a(oVar.f1047j, this.f1005o);
                }
                oVar.f1047j.mo1595s();
                if (!q.onCreatePanelMenu(oVar.f1038a, oVar.f1047j)) {
                    oVar.mo1359a((C0416g) null);
                    if (z && (c0Var2 = this.f1004n) != null) {
                        c0Var2.mo1827a((Menu) null, this.f1005o);
                    }
                    return false;
                }
                oVar.f1055r = false;
            }
            oVar.f1047j.mo1595s();
            Bundle bundle = oVar.f1056s;
            if (bundle != null) {
                oVar.f1047j.mo1536a(bundle);
                oVar.f1056s = null;
            }
            if (!q.onPreparePanel(0, oVar.f1046i, oVar.f1047j)) {
                if (z && (c0Var = this.f1004n) != null) {
                    c0Var.mo1827a((Menu) null, this.f1005o);
                }
                oVar.f1047j.mo1592r();
                return false;
            }
            oVar.f1053p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f1047j.setQwertyMode(oVar.f1053p);
            oVar.f1047j.mo1592r();
        }
        oVar.f1050m = true;
        oVar.f1051n = false;
        this.f977J = oVar;
        return true;
    }

    /* renamed from: b */
    private boolean m1414b(boolean z) {
        if (this.f982O) {
            return false;
        }
        int w = m1422w();
        boolean b = m1411b(mo1322g(w), z);
        if (w == 0) {
            mo1330o().mo1352e();
        } else {
            C0379l lVar = this.f987T;
            if (lVar != null) {
                lVar.mo1351a();
            }
        }
        if (w == 3) {
            m1400B().mo1352e();
        } else {
            C0379l lVar2 = this.f988U;
            if (lVar2 != null) {
                lVar2.mo1351a();
            }
        }
        return b;
    }

    /* renamed from: c */
    private void m1415c(int i, boolean z) {
        Resources resources = this.f997g.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0387i.m1523a(resources);
        }
        int i2 = this.f984Q;
        if (i2 != 0) {
            this.f997g.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f997g.getTheme().applyStyle(this.f984Q, true);
            }
        }
        if (z) {
            Object obj = this.f996f;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0720i) {
                    if (!((C0720i) activity).mo1140a().mo3322a().mo3325a(C0715f.C0717b.STARTED)) {
                        return;
                    }
                } else if (!this.f981N) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: c */
    private boolean m1416c(C0383o oVar) {
        Context context = this.f997g;
        int i = oVar.f1038a;
        if ((i == 0 || i == 108) && this.f1004n != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0000a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0033d dVar = new C0033d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0416g gVar = new C0416g(context);
        gVar.mo1538a((C0416g.C0417a) this);
        oVar.mo1359a(gVar);
        return true;
    }

    /* renamed from: d */
    private boolean m1417d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0383o a = mo1309a(i, true);
        if (!a.f1052o) {
            return m1413b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1418e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            a.a.n.b r0 = r3.f1007q
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.g$o r2 = r3.mo1309a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r4 = r3.f1004n
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo1837g()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f997g
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r4 = r3.f1004n
            boolean r4 = r4.mo1828a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f982O
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m1413b((androidx.appcompat.app.C0365g.C0383o) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.c0 r4 = r3.f1004n
            boolean r4 = r4.mo1835f()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.c0 r4 = r3.f1004n
            boolean r4 = r4.mo1834e()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f1052o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f1051n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f1050m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f1055r
            if (r4 == 0) goto L_0x005b
            r2.f1050m = r1
            boolean r4 = r3.m1413b((androidx.appcompat.app.C0365g.C0383o) r2, (android.view.KeyEvent) r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m1406a((androidx.appcompat.app.C0365g.C0383o) r2, (android.view.KeyEvent) r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f1052o
            r3.mo1313a((androidx.appcompat.app.C0365g.C0383o) r2, (boolean) r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f997g
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0365g.m1418e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: k */
    private void m1419k(int i) {
        this.f990W = (1 << i) | this.f990W;
        if (!this.f989V) {
            C0187u.m695a(this.f998h.getDecorView(), this.f991X);
            this.f989V = true;
        }
    }

    /* renamed from: l */
    private int m1420l(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: v */
    private void m1421v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1014x.findViewById(16908290);
        View decorView = this.f998h.getDecorView();
        contentFrameLayout.mo1903a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f997g.obtainStyledAttributes(C0009j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private int m1422w() {
        int i = this.f983P;
        return i != -100 ? i : C0364f.m1375j();
    }

    /* renamed from: x */
    private void m1423x() {
        C0379l lVar = this.f987T;
        if (lVar != null) {
            lVar.mo1351a();
        }
        C0379l lVar2 = this.f988U;
        if (lVar2 != null) {
            lVar2.mo1351a();
        }
    }

    /* renamed from: y */
    private ViewGroup m1424y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f997g.obtainStyledAttributes(C0009j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowNoTitle, false)) {
                mo1296b(1);
            } else if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBar, false)) {
                mo1296b(108);
            }
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1296b(109);
            }
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1296b(10);
            }
            this.f973F = obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m1399A();
            this.f998h.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f997g);
            if (this.f974G) {
                viewGroup = (ViewGroup) from.inflate(this.f972E ? C0006g.abc_screen_simple_overlay_action_mode : C0006g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    C0187u.m690a((View) viewGroup, (C0183q) new C0368c());
                } else {
                    ((C0509g0) viewGroup).setOnFitSystemWindowsListener(new C0369d());
                }
            } else if (this.f973F) {
                viewGroup = (ViewGroup) from.inflate(C0006g.abc_dialog_title_material, (ViewGroup) null);
                this.f971D = false;
                this.f970C = false;
            } else if (this.f970C) {
                TypedValue typedValue = new TypedValue();
                this.f997g.getTheme().resolveAttribute(C0000a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i != 0 ? new C0033d(this.f997g, i) : this.f997g).inflate(C0006g.abc_screen_toolbar, (ViewGroup) null);
                this.f1004n = (C0497c0) viewGroup.findViewById(C0005f.decor_content_parent);
                this.f1004n.setWindowCallback(mo1334q());
                if (this.f971D) {
                    this.f1004n.mo1826a(109);
                }
                if (this.f968A) {
                    this.f1004n.mo1826a(2);
                }
                if (this.f969B) {
                    this.f1004n.mo1826a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f1004n == null) {
                    this.f1015y = (TextView) viewGroup.findViewById(C0005f.title);
                }
                C0498c1.m2140b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0005f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f998h.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f998h.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0370e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f970C + ", windowActionBarOverlay: " + this.f971D + ", android:windowIsFloating: " + this.f973F + ", windowActionModeOverlay: " + this.f972E + ", windowNoTitle: " + this.f974G + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m1425z() {
        if (!this.f1013w) {
            this.f1014x = m1424y();
            CharSequence p = mo1333p();
            if (!TextUtils.isEmpty(p)) {
                C0497c0 c0Var = this.f1004n;
                if (c0Var != null) {
                    c0Var.setWindowTitle(p);
                } else if (mo1337t() != null) {
                    mo1337t().mo1211a(p);
                } else {
                    TextView textView = this.f1015y;
                    if (textView != null) {
                        textView.setText(p);
                    }
                }
            }
            m1421v();
            mo1312a(this.f1014x);
            this.f1013w = true;
            C0383o a = mo1309a(0, false);
            if (this.f982O) {
                return;
            }
            if (a == null || a.f1047j == null) {
                m1419k(108);
            }
        }
    }

    /* renamed from: a */
    public int mo1284a() {
        return this.f983P;
    }

    /* renamed from: a */
    public C0030b mo1307a(C0030b.C0031a aVar) {
        C0363e eVar;
        if (aVar != null) {
            C0030b bVar = this.f1007q;
            if (bVar != null) {
                bVar.mo134a();
            }
            C0375i iVar = new C0375i(aVar);
            C0355a c = mo1297c();
            if (c != null) {
                this.f1007q = c.mo1209a((C0030b.C0031a) iVar);
                C0030b bVar2 = this.f1007q;
                if (!(bVar2 == null || (eVar = this.f1000j) == null)) {
                    eVar.mo1245a(bVar2);
                }
            }
            if (this.f1007q == null) {
                this.f1007q = mo1316b((C0030b.C0031a) iVar);
            }
            return this.f1007q;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: a */
    public <T extends View> T mo1285a(int i) {
        m1425z();
        return this.f998h.findViewById(i);
    }

    /* renamed from: a */
    public View mo1308a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f995b0 == null) {
            String string = this.f997g.obtainStyledAttributes(C0009j.AppCompatTheme).getString(C0009j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f995b0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f995b0 = appCompatViewInflater;
        }
        if (f964d0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1408a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f995b0.mo1193a(view, str, context, attributeSet, z, f964d0, true, C0488b1.m2088b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0383o mo1309a(int i, boolean z) {
        C0383o[] oVarArr = this.f976I;
        if (oVarArr == null || oVarArr.length <= i) {
            C0383o[] oVarArr2 = new C0383o[(i + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f976I = oVarArr2;
            oVarArr = oVarArr2;
        }
        C0383o oVar = oVarArr[i];
        if (oVar != null) {
            return oVar;
        }
        C0383o oVar2 = new C0383o(i);
        oVarArr[i] = oVar2;
        return oVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0383o mo1310a(Menu menu) {
        C0383o[] oVarArr = this.f976I;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0383o oVar = oVarArr[i];
            if (oVar != null && oVar.f1047j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1311a(int i, C0383o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i >= 0) {
                C0383o[] oVarArr = this.f976I;
                if (i < oVarArr.length) {
                    oVar = oVarArr[i];
                }
            }
            if (oVar != null) {
                menu = oVar.f1047j;
            }
        }
        if ((oVar == null || oVar.f1052o) && !this.f982O) {
            this.f999i.mo205a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo1286a(Context context) {
        m1414b(false);
        this.f979L = true;
    }

    /* renamed from: a */
    public void mo1287a(Configuration configuration) {
        C0355a c;
        if (this.f970C && this.f1013w && (c = mo1297c()) != null) {
            c.mo1210a(configuration);
        }
        C0518j.m2235b().mo2314a(this.f997g);
        m1414b(false);
    }

    /* renamed from: a */
    public void mo1288a(Bundle bundle) {
        this.f979L = true;
        m1414b(false);
        m1399A();
        Object obj = this.f996f;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0603e.m2569b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0355a t = mo1337t();
                if (t == null) {
                    this.f992Y = true;
                } else {
                    t.mo1215c(true);
                }
            }
        }
        this.f980M = true;
    }

    /* renamed from: a */
    public void mo1289a(View view) {
        m1425z();
        ViewGroup viewGroup = (ViewGroup) this.f1014x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f999i.mo205a().onContentChanged();
    }

    /* renamed from: a */
    public void mo1290a(View view, ViewGroup.LayoutParams layoutParams) {
        m1425z();
        ((ViewGroup) this.f1014x.findViewById(16908290)).addView(view, layoutParams);
        this.f999i.mo205a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1312a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1313a(C0383o oVar, boolean z) {
        ViewGroup viewGroup;
        C0497c0 c0Var;
        if (!z || oVar.f1038a != 0 || (c0Var = this.f1004n) == null || !c0Var.mo1828a()) {
            WindowManager windowManager = (WindowManager) this.f997g.getSystemService("window");
            if (!(windowManager == null || !oVar.f1052o || (viewGroup = oVar.f1044g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1311a(oVar.f1038a, oVar, (Menu) null);
                }
            }
            oVar.f1050m = false;
            oVar.f1051n = false;
            oVar.f1052o = false;
            oVar.f1045h = null;
            oVar.f1054q = true;
            if (this.f977J == oVar) {
                this.f977J = null;
                return;
            }
            return;
        }
        mo1317b(oVar.f1047j);
    }

    /* renamed from: a */
    public void mo165a(C0416g gVar) {
        m1407a(gVar, true);
    }

    /* renamed from: a */
    public void mo1291a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f996f instanceof Activity) {
            C0355a c = mo1297c();
            if (!(c instanceof C0397m)) {
                this.f1002l = null;
                if (c != null) {
                    c.mo1223j();
                }
                if (toolbar != null) {
                    C0388j jVar = new C0388j(toolbar, mo1333p(), this.f999i);
                    this.f1001k = jVar;
                    window = this.f998h;
                    callback = jVar.mo1374l();
                } else {
                    this.f1001k = null;
                    window = this.f998h;
                    callback = this.f999i;
                }
                window.setCallback(callback);
                mo1302e();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo1292a(CharSequence charSequence) {
        this.f1003m = charSequence;
        C0497c0 c0Var = this.f1004n;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (mo1337t() != null) {
            mo1337t().mo1211a(charSequence);
        } else {
            TextView textView = this.f1015y;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1314a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f978K = z;
        } else if (i == 82) {
            m1417d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1315a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f996f;
        boolean z = true;
        if (((obj instanceof C0170e.C0171a) || (obj instanceof C0385h)) && (decorView = this.f998h.getDecorView()) != null && C0170e.m643a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f999i.mo205a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo1314a(keyCode, keyEvent) : mo1319c(keyCode, keyEvent);
    }

    /* renamed from: a */
    public boolean mo166a(C0416g gVar, MenuItem menuItem) {
        C0383o a;
        Window.Callback q = mo1334q();
        if (q == null || this.f982O || (a = mo1310a((Menu) gVar.mo1585m())) == null) {
            return false;
        }
        return q.onMenuItemSelected(a.f1038a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000a.p001a.p007n.C0030b mo1316b(p000a.p001a.p007n.C0030b.C0031a r8) {
        /*
            r7 = this;
            r7.mo1328m()
            a.a.n.b r0 = r7.f1007q
            if (r0 == 0) goto L_0x000a
            r0.mo134a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0365g.C0375i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.g$i r0 = new androidx.appcompat.app.g$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f1000j
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f982O
            if (r2 != 0) goto L_0x0022
            a.a.n.b r0 = r0.mo1244a((p000a.p001a.p007n.C0030b.C0031a) r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1007q = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1008r
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f973F
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f997g
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p000a.p001a.C0000a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f997g
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            a.a.n.d r4 = new a.a.n.d
            android.content.Context r6 = r7.f997g
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f997g
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1008r = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p000a.p001a.C0000a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1009s = r5
            android.widget.PopupWindow r5 = r7.f1009s
            r6 = 2
            androidx.core.widget.C0637h.m2773a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f1009s
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f1008r
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1009s
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p000a.p001a.C0000a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1008r
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1009s
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.g$f r0 = new androidx.appcompat.app.g$f
            r0.<init>()
            r7.f1010t = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f1014x
            int r4 = p000a.p001a.C0005f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo1329n()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2101a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f1008r = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1008r
            if (r0 == 0) goto L_0x0165
            r7.mo1328m()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1008r
            r0.mo1806c()
            a.a.n.e r0 = new a.a.n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1008r
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f1008r
            android.widget.PopupWindow r6 = r7.f1009s
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo143c()
            boolean r8 = r8.mo154b(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo149i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            r8.mo1804a(r0)
            r7.f1007q = r0
            boolean r8 = r7.mo1338u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            a.d.k.y r8 = p000a.p013d.p023k.C0187u.m685a(r8)
            r8.mo705a((float) r0)
            r7.f1011u = r8
            a.d.k.y r8 = r7.f1011u
            androidx.appcompat.app.g$g r0 = new androidx.appcompat.app.g$g
            r0.<init>()
            r8.mo708a((p000a.p013d.p023k.C0203z) r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1008r
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p000a.p013d.p023k.C0187u.m726t(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f1009s
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f998h
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1010t
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f1007q = r1
        L_0x0165:
            a.a.n.b r8 = r7.f1007q
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.e r0 = r7.f1000j
            if (r0 == 0) goto L_0x0170
            r0.mo1245a((p000a.p001a.p007n.C0030b) r8)
        L_0x0170:
            a.a.n.b r8 = r7.f1007q
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0365g.mo1316b(a.a.n.b$a):a.a.n.b");
    }

    /* renamed from: b */
    public MenuInflater mo1293b() {
        if (this.f1002l == null) {
            m1401C();
            C0355a aVar = this.f1001k;
            this.f1002l = new C0037g(aVar != null ? aVar.mo1221h() : this.f997g);
        }
        return this.f1002l;
    }

    /* renamed from: b */
    public void mo1294b(Bundle bundle) {
        m1425z();
    }

    /* renamed from: b */
    public void mo1295b(View view, ViewGroup.LayoutParams layoutParams) {
        m1425z();
        ViewGroup viewGroup = (ViewGroup) this.f1014x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f999i.mo205a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1317b(C0416g gVar) {
        if (!this.f975H) {
            this.f975H = true;
            this.f1004n.mo1844h();
            Window.Callback q = mo1334q();
            if (q != null && !this.f982O) {
                q.onPanelClosed(108, gVar);
            }
            this.f975H = false;
        }
    }

    /* renamed from: b */
    public boolean mo1296b(int i) {
        int l = m1420l(i);
        if (this.f974G && l == 108) {
            return false;
        }
        if (this.f970C && l == 1) {
            this.f970C = false;
        }
        if (l == 1) {
            m1403E();
            this.f974G = true;
            return true;
        } else if (l == 2) {
            m1403E();
            this.f968A = true;
            return true;
        } else if (l == 5) {
            m1403E();
            this.f969B = true;
            return true;
        } else if (l == 10) {
            m1403E();
            this.f972E = true;
            return true;
        } else if (l == 108) {
            m1403E();
            this.f970C = true;
            return true;
        } else if (l != 109) {
            return this.f998h.requestFeature(l);
        } else {
            m1403E();
            this.f971D = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1318b(int i, KeyEvent keyEvent) {
        C0355a c = mo1297c();
        if (c != null && c.mo1212a(i, keyEvent)) {
            return true;
        }
        C0383o oVar = this.f977J;
        if (oVar == null || !m1410a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f977J == null) {
                C0383o a = mo1309a(0, true);
                m1413b(a, keyEvent);
                boolean a2 = m1410a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f1050m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0383o oVar2 = this.f977J;
        if (oVar2 != null) {
            oVar2.f1051n = true;
        }
        return true;
    }

    /* renamed from: c */
    public C0355a mo1297c() {
        m1401C();
        return this.f1001k;
    }

    /* renamed from: c */
    public void mo1298c(int i) {
        m1425z();
        ViewGroup viewGroup = (ViewGroup) this.f1014x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f997g).inflate(i, viewGroup);
        this.f999i.mo205a().onContentChanged();
    }

    /* renamed from: c */
    public void mo1299c(Bundle bundle) {
        if (this.f983P != -100) {
            f963c0.put(this.f996f.getClass(), Integer.valueOf(this.f983P));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1319c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f978K;
            this.f978K = false;
            C0383o a = mo1309a(0, false);
            if (a != null && a.f1052o) {
                if (!z) {
                    mo1313a(a, true);
                }
                return true;
            } else if (mo1336s()) {
                return true;
            }
        } else if (i == 82) {
            m1418e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo1300d() {
        LayoutInflater from = LayoutInflater.from(this.f997g);
        if (from.getFactory() == null) {
            C0172f.m646b(from, this);
        } else if (!(from.getFactory2() instanceof C0365g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: d */
    public void mo1301d(int i) {
        this.f984Q = i;
    }

    /* renamed from: e */
    public void mo1302e() {
        C0355a c = mo1297c();
        if (c == null || !c.mo1222i()) {
            m1419k(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1320e(int i) {
        mo1313a(mo1309a(i, true), true);
    }

    /* renamed from: f */
    public void mo1303f() {
        C0364f.m1373b((C0364f) this);
        if (this.f989V) {
            this.f998h.getDecorView().removeCallbacks(this.f991X);
        }
        this.f981N = false;
        this.f982O = true;
        C0355a aVar = this.f1001k;
        if (aVar != null) {
            aVar.mo1223j();
        }
        m1423x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1321f(int i) {
        C0383o a;
        C0383o a2 = mo1309a(i, true);
        if (a2.f1047j != null) {
            Bundle bundle = new Bundle();
            a2.f1047j.mo1558b(bundle);
            if (bundle.size() > 0) {
                a2.f1056s = bundle;
            }
            a2.f1047j.mo1595s();
            a2.f1047j.clear();
        }
        a2.f1055r = true;
        a2.f1054q = true;
        if ((i == 108 || i == 0) && this.f1004n != null && (a = mo1309a(0, false)) != null) {
            a.f1050m = false;
            m1413b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1322g(int i) {
        C0379l o;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        o = m1400B();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f997g.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                o = mo1330o();
            }
            return o.mo1349c();
        }
        return i;
    }

    /* renamed from: g */
    public void mo1304g() {
        C0355a c = mo1297c();
        if (c != null) {
            c.mo1217e(true);
        }
    }

    /* renamed from: h */
    public void mo1305h() {
        this.f981N = true;
        mo1326k();
        C0364f.m1371a((C0364f) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1323h(int i) {
        C0355a c;
        if (i == 108 && (c = mo1297c()) != null) {
            c.mo1214b(true);
        }
    }

    /* renamed from: i */
    public void mo1306i() {
        this.f981N = false;
        C0364f.m1373b((C0364f) this);
        C0355a c = mo1297c();
        if (c != null) {
            c.mo1217e(false);
        }
        if (this.f996f instanceof Dialog) {
            m1423x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1324i(int i) {
        if (i == 108) {
            C0355a c = mo1297c();
            if (c != null) {
                c.mo1214b(false);
            }
        } else if (i == 0) {
            C0383o a = mo1309a(i, true);
            if (a.f1052o) {
                mo1313a(a, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo1325j(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f1008r;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1008r.getLayoutParams();
            z = true;
            if (this.f1008r.isShown()) {
                if (this.f993Z == null) {
                    this.f993Z = new Rect();
                    this.f994a0 = new Rect();
                }
                Rect rect = this.f993Z;
                Rect rect2 = this.f994a0;
                rect.set(0, i, 0, 0);
                C0498c1.m2138a(this.f1014x, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1016z;
                    if (view == null) {
                        this.f1016z = new View(this.f997g);
                        this.f1016z.setBackgroundColor(this.f997g.getResources().getColor(C0002c.abc_input_method_navigation_guard));
                        this.f1014x.addView(this.f1016z, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1016z.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1016z == null) {
                    z = false;
                }
                if (!this.f972E && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f1008r.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f1016z;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: k */
    public boolean mo1326k() {
        return m1414b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1327l() {
        C0416g gVar;
        C0497c0 c0Var = this.f1004n;
        if (c0Var != null) {
            c0Var.mo1844h();
        }
        if (this.f1009s != null) {
            this.f998h.getDecorView().removeCallbacks(this.f1010t);
            if (this.f1009s.isShowing()) {
                try {
                    this.f1009s.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1009s = null;
        }
        mo1328m();
        C0383o a = mo1309a(0, false);
        if (a != null && (gVar = a.f1047j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1328m() {
        C0199y yVar = this.f1011u;
        if (yVar != null) {
            yVar.mo710a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Context mo1329n() {
        C0355a c = mo1297c();
        Context h = c != null ? c.mo1221h() : null;
        return h == null ? this.f997g : h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C0379l mo1330o() {
        if (this.f987T == null) {
            this.f987T = new C0381m(C0395l.m1554a(this.f997g));
        }
        return this.f987T;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1308a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final CharSequence mo1333p() {
        Object obj = this.f996f;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1003m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Window.Callback mo1334q() {
        return this.f998h.getCallback();
    }

    /* renamed from: r */
    public boolean mo1335r() {
        return this.f1012v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo1336s() {
        C0030b bVar = this.f1007q;
        if (bVar != null) {
            bVar.mo134a();
            return true;
        }
        C0355a c = mo1297c();
        return c != null && c.mo1219f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C0355a mo1337t() {
        return this.f1001k;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1014x;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1338u() {
        /*
            r1 = this;
            boolean r0 = r1.f1013w
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1014x
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000a.p013d.p023k.C0187u.m723q(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0365g.mo1338u():boolean");
    }
}
