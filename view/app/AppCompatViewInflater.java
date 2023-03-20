package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0487b0;
import androidx.appcompat.widget.C0499d;
import androidx.appcompat.widget.C0504f;
import androidx.appcompat.widget.C0508g;
import androidx.appcompat.widget.C0511h;
import androidx.appcompat.widget.C0528k;
import androidx.appcompat.widget.C0533m;
import androidx.appcompat.widget.C0543o;
import androidx.appcompat.widget.C0545p;
import androidx.appcompat.widget.C0556s;
import androidx.appcompat.widget.C0558t;
import androidx.appcompat.widget.C0559t0;
import androidx.appcompat.widget.C0560u;
import androidx.appcompat.widget.C0564w;
import androidx.appcompat.widget.C0585z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.C0033d;
import p000a.p012c.C0057a;
import p000a.p013d.p023k.C0187u;

public class AppCompatViewInflater {

    /* renamed from: b */
    private static final Class<?>[] f945b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f946c = {16843375};

    /* renamed from: d */
    private static final String[] f947d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final Map<String, Constructor<? extends View>> f948e = new C0057a();

    /* renamed from: a */
    private final Object[] f949a = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    private static class C0354a implements View.OnClickListener {

        /* renamed from: c */
        private final View f950c;

        /* renamed from: d */
        private final String f951d;

        /* renamed from: e */
        private Method f952e;

        /* renamed from: f */
        private Context f953f;

        public C0354a(View view, String str) {
            this.f950c = view;
            this.f951d = str;
        }

        /* renamed from: a */
        private void m1317a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f951d, new Class[]{View.class})) != null) {
                        this.f952e = method;
                        this.f953f = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f950c.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f950c.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f951d + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f950c.getClass() + str2);
        }

        public void onClick(View view) {
            if (this.f952e == null) {
                m1317a(this.f950c.getContext(), this.f951d);
            }
            try {
                this.f952e.invoke(this.f953f, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m1296a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0009j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0009j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0033d) || ((C0033d) context).mo157a() != resourceId) ? new C0033d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m1297a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = f948e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f945b);
            f948e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f949a);
    }

    /* renamed from: a */
    private void m1298a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0187u.m719m(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f946c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0354a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m1299a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* renamed from: b */
    private View m1300b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f949a[0] = context;
            this.f949a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f947d) {
                    View a2 = m1297a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f949a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m1297a(context, str, (String) null);
            Object[] objArr2 = this.f949a;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f949a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo1192a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo1193a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1296a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0559t0.m2394b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo1206m(context2, attributeSet);
                break;
            case 1:
                view2 = mo1200g(context2, attributeSet);
                break;
            case 2:
                view2 = mo1195b(context2, attributeSet);
                break;
            case 3:
                view2 = mo1198e(context2, attributeSet);
                break;
            case 4:
                view2 = mo1205l(context2, attributeSet);
                break;
            case 5:
                view2 = mo1199f(context2, attributeSet);
                break;
            case 6:
                view2 = mo1196c(context2, attributeSet);
                break;
            case 7:
                view2 = mo1202i(context2, attributeSet);
                break;
            case 8:
                view2 = mo1197d(context2, attributeSet);
                break;
            case 9:
                view2 = mo1194a(context2, attributeSet);
                break;
            case 10:
                view2 = mo1201h(context2, attributeSet);
                break;
            case 11:
                view2 = mo1203j(context2, attributeSet);
                break;
            case 12:
                view2 = mo1204k(context2, attributeSet);
                break;
            case 13:
                view2 = mo1207n(context2, attributeSet);
                break;
            default:
                view2 = mo1192a(context2, str, attributeSet);
                break;
        }
        m1299a(view2, str);
        if (view2 == null && context != context2) {
            view2 = m1300b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m1298a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0499d mo1194a(Context context, AttributeSet attributeSet) {
        return new C0499d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0504f mo1195b(Context context, AttributeSet attributeSet) {
        return new C0504f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0508g mo1196c(Context context, AttributeSet attributeSet) {
        return new C0508g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0511h mo1197d(Context context, AttributeSet attributeSet) {
        return new C0511h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0528k mo1198e(Context context, AttributeSet attributeSet) {
        return new C0528k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0533m mo1199f(Context context, AttributeSet attributeSet) {
        return new C0533m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0543o mo1200g(Context context, AttributeSet attributeSet) {
        return new C0543o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0545p mo1201h(Context context, AttributeSet attributeSet) {
        return new C0545p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0556s mo1202i(Context context, AttributeSet attributeSet) {
        return new C0556s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0558t mo1203j(Context context, AttributeSet attributeSet) {
        return new C0558t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0560u mo1204k(Context context, AttributeSet attributeSet) {
        return new C0560u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0564w mo1205l(Context context, AttributeSet attributeSet) {
        return new C0564w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0585z mo1206m(Context context, AttributeSet attributeSet) {
        return new C0585z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0487b0 mo1207n(Context context, AttributeSet attributeSet) {
        return new C0487b0(context, attributeSet);
    }
}
