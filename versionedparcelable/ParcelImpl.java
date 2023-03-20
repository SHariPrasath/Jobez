package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0744a();

    /* renamed from: c */
    private final C0747c f2526c;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0744a implements Parcelable.Creator<ParcelImpl> {
        C0744a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f2526c = new C0746b(parcel).mo3408j();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0746b(parcel).mo3381a(this.f2526c);
    }
}
