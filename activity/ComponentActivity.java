package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0602d;
import androidx.lifecycle.C0715f;
import androidx.lifecycle.C0718g;
import androidx.lifecycle.C0720i;
import androidx.lifecycle.C0721j;
import androidx.lifecycle.C0730q;
import androidx.lifecycle.C0737t;
import androidx.lifecycle.C0738u;
import androidx.savedstate.C0742a;
import androidx.savedstate.C0743b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0602d implements C0720i, C0738u, C0743b, C0340c {

    /* renamed from: d */
    private final C0721j f809d = new C0721j(this);

    /* renamed from: e */
    private final C0742a f810e = C0742a.m3370a((C0743b) this);

    /* renamed from: f */
    private C0737t f811f;

    /* renamed from: g */
    private final OnBackPressedDispatcher f812g = new OnBackPressedDispatcher(new C0335a());

    /* renamed from: h */
    private int f813h;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0335a implements Runnable {
        C0335a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0336b {

        /* renamed from: a */
        C0737t f817a;

        C0336b() {
        }
    }

    public ComponentActivity() {
        if (mo1140a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo1140a().mo3323a(new C0718g() {
                    /* renamed from: a */
                    public void mo1149a(C0720i iVar, C0715f.C0716a aVar) {
                        if (aVar == C0715f.C0716a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo1140a().mo3323a(new C0718g() {
                /* renamed from: a */
                public void mo1149a(C0720i iVar, C0715f.C0716a aVar) {
                    if (aVar == C0715f.C0716a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo1141b().mo3359a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                mo1140a().mo3323a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    public C0715f mo1140a() {
        return this.f809d;
    }

    /* renamed from: b */
    public C0737t mo1141b() {
        if (getApplication() != null) {
            if (this.f811f == null) {
                C0336b bVar = (C0336b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f811f = bVar.f817a;
                }
                if (this.f811f == null) {
                    this.f811f = new C0737t();
                }
            }
            return this.f811f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    /* renamed from: d */
    public Object mo1142d() {
        return null;
    }

    /* renamed from: g */
    public final OnBackPressedDispatcher mo1143g() {
        return this.f812g;
    }

    /* renamed from: i */
    public final SavedStateRegistry mo1144i() {
        return this.f810e.mo3366a();
    }

    public void onBackPressed() {
        this.f812g.mo1152a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f810e.mo3367a(bundle);
        C0730q.m3341a((Activity) this);
        int i = this.f813h;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0336b bVar;
        Object d = mo1142d();
        C0737t tVar = this.f811f;
        if (tVar == null && (bVar = (C0336b) getLastNonConfigurationInstance()) != null) {
            tVar = bVar.f817a;
        }
        if (tVar == null && d == null) {
            return null;
        }
        C0336b bVar2 = new C0336b();
        bVar2.f817a = tVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0715f a = mo1140a();
        if (a instanceof C0721j) {
            ((C0721j) a).mo3328b(C0715f.C0717b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f810e.mo3368b(bundle);
    }
}
