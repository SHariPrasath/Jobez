package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0339b {

    /* renamed from: a */
    private boolean f831a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0338a> f832b = new CopyOnWriteArrayList<>();

    public C0339b(boolean z) {
        this.f831a = z;
    }

    /* renamed from: a */
    public abstract void mo1155a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1156a(C0338a aVar) {
        this.f832b.add(aVar);
    }

    /* renamed from: a */
    public final void mo1157a(boolean z) {
        this.f831a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1158b(C0338a aVar) {
        this.f832b.remove(aVar);
    }

    /* renamed from: b */
    public final boolean mo1159b() {
        return this.f831a;
    }

    /* renamed from: c */
    public final void mo1160c() {
        Iterator<C0338a> it = this.f832b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
