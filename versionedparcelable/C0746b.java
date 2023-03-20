package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p000a.p012c.C0057a;

/* renamed from: androidx.versionedparcelable.b */
class C0746b extends C0745a {

    /* renamed from: d */
    private final SparseIntArray f2530d;

    /* renamed from: e */
    private final Parcel f2531e;

    /* renamed from: f */
    private final int f2532f;

    /* renamed from: g */
    private final int f2533g;

    /* renamed from: h */
    private final String f2534h;

    /* renamed from: i */
    private int f2535i;

    /* renamed from: j */
    private int f2536j;

    /* renamed from: k */
    private int f2537k;

    C0746b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0057a(), new C0057a(), new C0057a());
    }

    private C0746b(Parcel parcel, int i, int i2, String str, C0057a<String, Method> aVar, C0057a<String, Method> aVar2, C0057a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2530d = new SparseIntArray();
        this.f2535i = -1;
        this.f2536j = 0;
        this.f2537k = -1;
        this.f2531e = parcel;
        this.f2532f = i;
        this.f2533g = i2;
        this.f2536j = this.f2532f;
        this.f2534h = str;
    }

    /* renamed from: a */
    public void mo3379a() {
        int i = this.f2535i;
        if (i >= 0) {
            int i2 = this.f2530d.get(i);
            int dataPosition = this.f2531e.dataPosition();
            this.f2531e.setDataPosition(i2);
            this.f2531e.writeInt(dataPosition - i2);
            this.f2531e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo3380a(Parcelable parcelable) {
        this.f2531e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3383a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2531e, 0);
    }

    /* renamed from: a */
    public void mo3384a(String str) {
        this.f2531e.writeString(str);
    }

    /* renamed from: a */
    public void mo3385a(boolean z) {
        this.f2531e.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo3387a(byte[] bArr) {
        if (bArr != null) {
            this.f2531e.writeInt(bArr.length);
            this.f2531e.writeByteArray(bArr);
            return;
        }
        this.f2531e.writeInt(-1);
    }

    /* renamed from: a */
    public boolean mo3388a(int i) {
        while (this.f2536j < this.f2533g) {
            int i2 = this.f2537k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2531e.setDataPosition(this.f2536j);
            int readInt = this.f2531e.readInt();
            this.f2537k = this.f2531e.readInt();
            this.f2536j += readInt;
        }
        return this.f2537k == i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0745a mo3391b() {
        Parcel parcel = this.f2531e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2536j;
        if (i == this.f2532f) {
            i = this.f2533g;
        }
        int i2 = i;
        return new C0746b(parcel, dataPosition, i2, this.f2534h + "  ", this.f2527a, this.f2528b, this.f2529c);
    }

    /* renamed from: b */
    public void mo3392b(int i) {
        mo3379a();
        this.f2535i = i;
        this.f2530d.put(i, this.f2531e.dataPosition());
        mo3400c(0);
        mo3400c(i);
    }

    /* renamed from: c */
    public void mo3400c(int i) {
        this.f2531e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo3402d() {
        return this.f2531e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo3403e() {
        int readInt = this.f2531e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2531e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo3404f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2531e);
    }

    /* renamed from: g */
    public int mo3405g() {
        return this.f2531e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo3406h() {
        return this.f2531e.readParcelable(C0746b.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo3407i() {
        return this.f2531e.readString();
    }
}
