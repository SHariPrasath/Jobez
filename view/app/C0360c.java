package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p000a.p001a.C0000a;

/* renamed from: androidx.appcompat.app.c */
public class C0360c extends C0385h implements DialogInterface {

    /* renamed from: e */
    final AlertController f955e = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0361a {

        /* renamed from: a */
        private final AlertController.C0346f f956a;

        /* renamed from: b */
        private final int f957b;

        public C0361a(Context context) {
            this(context, C0360c.m1340a(context, 0));
        }

        public C0361a(Context context, int i) {
            this.f956a = new AlertController.C0346f(new ContextThemeWrapper(context, C0360c.m1340a(context, i)));
            this.f957b = i;
        }

        /* renamed from: a */
        public C0361a mo1236a(DialogInterface.OnKeyListener onKeyListener) {
            this.f956a.f926u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0361a mo1237a(Drawable drawable) {
            this.f956a.f909d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0361a mo1238a(View view) {
            this.f956a.f912g = view;
            return this;
        }

        /* renamed from: a */
        public C0361a mo1239a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0346f fVar = this.f956a;
            fVar.f928w = listAdapter;
            fVar.f929x = onClickListener;
            fVar.f899I = i;
            fVar.f898H = true;
            return this;
        }

        /* renamed from: a */
        public C0361a mo1240a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0346f fVar = this.f956a;
            fVar.f928w = listAdapter;
            fVar.f929x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0361a mo1241a(CharSequence charSequence) {
            this.f956a.f911f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0360c mo1242a() {
            C0360c cVar = new C0360c(this.f956a.f906a, this.f957b);
            this.f956a.mo1182a(cVar.f955e);
            cVar.setCancelable(this.f956a.f923r);
            if (this.f956a.f923r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f956a.f924s);
            cVar.setOnDismissListener(this.f956a.f925t);
            DialogInterface.OnKeyListener onKeyListener = this.f956a.f926u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        /* renamed from: b */
        public Context mo1243b() {
            return this.f956a.f906a;
        }
    }

    protected C0360c(Context context, int i) {
        super(context, m1340a(context, i));
    }

    /* renamed from: a */
    static int m1340a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView mo1231b() {
        return this.f955e.mo1162a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f955e.mo1169b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f955e.mo1168a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f955e.mo1173b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f955e.mo1172b(charSequence);
    }
}
