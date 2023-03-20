package androidx.activity;

import androidx.lifecycle.C0715f;
import androidx.lifecycle.C0718g;
import androidx.lifecycle.C0720i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f823a;

    /* renamed from: b */
    final ArrayDeque<C0339b> f824b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0718g, C0338a {

        /* renamed from: c */
        private final C0715f f825c;

        /* renamed from: d */
        private final C0339b f826d;

        /* renamed from: e */
        private C0338a f827e;

        LifecycleOnBackPressedCancellable(C0715f fVar, C0339b bVar) {
            this.f825c = fVar;
            this.f826d = bVar;
            fVar.mo3323a(this);
        }

        /* renamed from: a */
        public void mo1149a(C0720i iVar, C0715f.C0716a aVar) {
            if (aVar == C0715f.C0716a.ON_START) {
                this.f827e = OnBackPressedDispatcher.this.mo1151a(this.f826d);
            } else if (aVar == C0715f.C0716a.ON_STOP) {
                C0338a aVar2 = this.f827e;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0715f.C0716a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f825c.mo3324b(this);
            this.f826d.mo1158b(this);
            C0338a aVar = this.f827e;
            if (aVar != null) {
                aVar.cancel();
                this.f827e = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0337a implements C0338a {

        /* renamed from: c */
        private final C0339b f829c;

        C0337a(C0339b bVar) {
            this.f829c = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f824b.remove(this.f829c);
            this.f829c.mo1158b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f823a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0338a mo1151a(C0339b bVar) {
        this.f824b.add(bVar);
        C0337a aVar = new C0337a(bVar);
        bVar.mo1156a((C0338a) aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo1152a() {
        Iterator<C0339b> descendingIterator = this.f824b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0339b next = descendingIterator.next();
            if (next.mo1159b()) {
                next.mo1155a();
                return;
            }
        }
        Runnable runnable = this.f823a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo1153a(C0720i iVar, C0339b bVar) {
        C0715f a = iVar.mo1140a();
        if (a.mo3322a() != C0715f.C0717b.DESTROYED) {
            bVar.mo1156a((C0338a) new LifecycleOnBackPressedCancellable(a, bVar));
        }
    }
}
