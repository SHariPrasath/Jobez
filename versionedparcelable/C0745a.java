package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p012c.C0057a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C0745a {

    /* renamed from: a */
    protected final C0057a<String, Method> f2527a;

    /* renamed from: b */
    protected final C0057a<String, Method> f2528b;

    /* renamed from: c */
    protected final C0057a<String, Class> f2529c;

    public C0745a(C0057a<String, Method> aVar, C0057a<String, Method> aVar2, C0057a<String, Class> aVar3) {
        this.f2527a = aVar;
        this.f2528b = aVar2;
        this.f2529c = aVar3;
    }

    /* renamed from: a */
    private Class m3375a(Class<? extends C0747c> cls) {
        Class cls2 = this.f2529c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f2529c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: b */
    private Method m3376b(Class cls) {
        Method method = this.f2528b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m3375a((Class<? extends C0747c>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, C0745a.class});
        this.f2528b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Method m3377b(String str) {
        Class<C0745a> cls = C0745a.class;
        Method method = this.f2527a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f2527a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private void m3378b(C0747c cVar) {
        try {
            mo3384a(m3375a((Class<? extends C0747c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public int mo3373a(int i, int i2) {
        return !mo3388a(i2) ? i : mo3405g();
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo3374a(T t, int i) {
        return !mo3388a(i) ? t : mo3406h();
    }

    /* renamed from: a */
    public <T extends C0747c> T mo3375a(T t, int i) {
        return !mo3388a(i) ? t : mo3408j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0747c> T mo3376a(String str, C0745a aVar) {
        try {
            return (C0747c) m3377b(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public CharSequence mo3377a(CharSequence charSequence, int i) {
        return !mo3388a(i) ? charSequence : mo3404f();
    }

    /* renamed from: a */
    public String mo3378a(String str, int i) {
        return !mo3388a(i) ? str : mo3407i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3379a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3380a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3381a(C0747c cVar) {
        if (cVar == null) {
            mo3384a((String) null);
            return;
        }
        m3378b(cVar);
        C0745a b = mo3391b();
        mo3382a(cVar, b);
        b.mo3379a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0747c> void mo3382a(T t, C0745a aVar) {
        try {
            m3376b((Class) t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3383a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3384a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3385a(boolean z);

    /* renamed from: a */
    public void mo3386a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3387a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3388a(int i);

    /* renamed from: a */
    public boolean mo3389a(boolean z, int i) {
        return !mo3388a(i) ? z : mo3402d();
    }

    /* renamed from: a */
    public byte[] mo3390a(byte[] bArr, int i) {
        return !mo3388a(i) ? bArr : mo3403e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0745a mo3391b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3392b(int i);

    /* renamed from: b */
    public void mo3393b(int i, int i2) {
        mo3392b(i2);
        mo3400c(i);
    }

    /* renamed from: b */
    public void mo3394b(Parcelable parcelable, int i) {
        mo3392b(i);
        mo3380a(parcelable);
    }

    /* renamed from: b */
    public void mo3395b(C0747c cVar, int i) {
        mo3392b(i);
        mo3381a(cVar);
    }

    /* renamed from: b */
    public void mo3396b(CharSequence charSequence, int i) {
        mo3392b(i);
        mo3383a(charSequence);
    }

    /* renamed from: b */
    public void mo3397b(String str, int i) {
        mo3392b(i);
        mo3384a(str);
    }

    /* renamed from: b */
    public void mo3398b(boolean z, int i) {
        mo3392b(i);
        mo3385a(z);
    }

    /* renamed from: b */
    public void mo3399b(byte[] bArr, int i) {
        mo3392b(i);
        mo3387a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3400c(int i);

    /* renamed from: c */
    public boolean mo3401c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo3402d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo3403e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo3404f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo3405g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo3406h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo3407i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends C0747c> T mo3408j() {
        String i = mo3407i();
        if (i == null) {
            return null;
        }
        return mo3376a(i, mo3391b());
    }
}
