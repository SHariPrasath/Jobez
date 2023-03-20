package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0360c;
import androidx.appcompat.view.menu.C0432n;
import p000a.p001a.C0006g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0419h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0432n.C0433a {

    /* renamed from: c */
    private C0416g f1277c;

    /* renamed from: d */
    private C0360c f1278d;

    /* renamed from: e */
    C0413e f1279e;

    /* renamed from: f */
    private C0432n.C0433a f1280f;

    public C0419h(C0416g gVar) {
        this.f1277c = gVar;
    }

    /* renamed from: a */
    public void mo1602a() {
        C0360c cVar = this.f1278d;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo1603a(IBinder iBinder) {
        C0416g gVar = this.f1277c;
        C0360c.C0361a aVar = new C0360c.C0361a(gVar.mo1572e());
        this.f1279e = new C0413e(aVar.mo1243b(), C0006g.abc_list_menu_item_layout);
        this.f1279e.mo1475a((C0432n.C0433a) this);
        this.f1277c.mo1539a((C0432n) this.f1279e);
        aVar.mo1240a(this.f1279e.mo1511a(), this);
        View i = gVar.mo1580i();
        if (i != null) {
            aVar.mo1238a(i);
        } else {
            aVar.mo1237a(gVar.mo1576g());
            aVar.mo1241a(gVar.mo1578h());
        }
        aVar.mo1236a((DialogInterface.OnKeyListener) this);
        this.f1278d = aVar.mo1242a();
        this.f1278d.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1278d.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1278d.show();
    }

    /* renamed from: a */
    public void mo1345a(C0416g gVar, boolean z) {
        if (z || gVar == this.f1277c) {
            mo1602a();
        }
        C0432n.C0433a aVar = this.f1280f;
        if (aVar != null) {
            aVar.mo1345a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo1346a(C0416g gVar) {
        C0432n.C0433a aVar = this.f1280f;
        if (aVar != null) {
            return aVar.mo1346a(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1277c.mo1543a((MenuItem) (C0421j) this.f1279e.mo1511a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1279e.mo1473a(this.f1277c, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1278d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1278d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1277c.mo1542a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1277c.performShortcut(i, keyEvent, 0);
    }
}
