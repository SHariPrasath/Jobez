package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0516i0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p013d.p023k.C0187u;

class AlertController {

    /* renamed from: A */
    NestedScrollView f833A;

    /* renamed from: B */
    private int f834B = 0;

    /* renamed from: C */
    private Drawable f835C;

    /* renamed from: D */
    private ImageView f836D;

    /* renamed from: E */
    private TextView f837E;

    /* renamed from: F */
    private TextView f838F;

    /* renamed from: G */
    private View f839G;

    /* renamed from: H */
    ListAdapter f840H;

    /* renamed from: I */
    int f841I = -1;

    /* renamed from: J */
    private int f842J;

    /* renamed from: K */
    private int f843K;

    /* renamed from: L */
    int f844L;

    /* renamed from: M */
    int f845M;

    /* renamed from: N */
    int f846N;

    /* renamed from: O */
    int f847O;

    /* renamed from: P */
    private boolean f848P;

    /* renamed from: Q */
    private int f849Q = 0;

    /* renamed from: R */
    Handler f850R;

    /* renamed from: S */
    private final View.OnClickListener f851S = new C0341a();

    /* renamed from: a */
    private final Context f852a;

    /* renamed from: b */
    final C0385h f853b;

    /* renamed from: c */
    private final Window f854c;

    /* renamed from: d */
    private final int f855d;

    /* renamed from: e */
    private CharSequence f856e;

    /* renamed from: f */
    private CharSequence f857f;

    /* renamed from: g */
    ListView f858g;

    /* renamed from: h */
    private View f859h;

    /* renamed from: i */
    private int f860i;

    /* renamed from: j */
    private int f861j;

    /* renamed from: k */
    private int f862k;

    /* renamed from: l */
    private int f863l;

    /* renamed from: m */
    private int f864m;

    /* renamed from: n */
    private boolean f865n = false;

    /* renamed from: o */
    Button f866o;

    /* renamed from: p */
    private CharSequence f867p;

    /* renamed from: q */
    Message f868q;

    /* renamed from: r */
    private Drawable f869r;

    /* renamed from: s */
    Button f870s;

    /* renamed from: t */
    private CharSequence f871t;

    /* renamed from: u */
    Message f872u;

    /* renamed from: v */
    private Drawable f873v;

    /* renamed from: w */
    Button f874w;

    /* renamed from: x */
    private CharSequence f875x;

    /* renamed from: y */
    Message f876y;

    /* renamed from: z */
    private Drawable f877z;

    public static class RecycleListView extends ListView {

        /* renamed from: c */
        private final int f878c;

        /* renamed from: d */
        private final int f879d;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.RecycleListView);
            this.f879d = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingBottomNoButtons, -1);
            this.f878c = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo1175a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f878c, getPaddingRight(), z2 ? getPaddingBottom() : this.f879d);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0341a implements View.OnClickListener {
        C0341a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            r3 = r0.f876y;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f866o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f868q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f870s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f872u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f874w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f876y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f850R
                r1 = 1
                androidx.appcompat.app.h r3 = r3.f853b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0341a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0342b implements NestedScrollView.C0625b {

        /* renamed from: a */
        final /* synthetic */ View f881a;

        /* renamed from: b */
        final /* synthetic */ View f882b;

        C0342b(AlertController alertController, View view, View view2) {
            this.f881a = view;
            this.f882b = view2;
        }

        /* renamed from: a */
        public void mo1177a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1266a(nestedScrollView, this.f881a, this.f882b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0343c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f883c;

        /* renamed from: d */
        final /* synthetic */ View f884d;

        C0343c(View view, View view2) {
            this.f883c = view;
            this.f884d = view2;
        }

        public void run() {
            AlertController.m1266a(AlertController.this.f833A, this.f883c, this.f884d);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0344d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f886a;

        /* renamed from: b */
        final /* synthetic */ View f887b;

        C0344d(AlertController alertController, View view, View view2) {
            this.f886a = view;
            this.f887b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1266a(absListView, this.f886a, this.f887b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0345e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f888c;

        /* renamed from: d */
        final /* synthetic */ View f889d;

        C0345e(View view, View view2) {
            this.f888c = view;
            this.f889d = view2;
        }

        public void run() {
            AlertController.m1266a(AlertController.this.f858g, this.f888c, this.f889d);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0346f {

        /* renamed from: A */
        public int f891A;

        /* renamed from: B */
        public int f892B;

        /* renamed from: C */
        public int f893C;

        /* renamed from: D */
        public int f894D;

        /* renamed from: E */
        public boolean f895E = false;

        /* renamed from: F */
        public boolean[] f896F;

        /* renamed from: G */
        public boolean f897G;

        /* renamed from: H */
        public boolean f898H;

        /* renamed from: I */
        public int f899I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f900J;

        /* renamed from: K */
        public Cursor f901K;

        /* renamed from: L */
        public String f902L;

        /* renamed from: M */
        public String f903M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f904N;

        /* renamed from: O */
        public C0351e f905O;

        /* renamed from: a */
        public final Context f906a;

        /* renamed from: b */
        public final LayoutInflater f907b;

        /* renamed from: c */
        public int f908c = 0;

        /* renamed from: d */
        public Drawable f909d;

        /* renamed from: e */
        public int f910e = 0;

        /* renamed from: f */
        public CharSequence f911f;

        /* renamed from: g */
        public View f912g;

        /* renamed from: h */
        public CharSequence f913h;

        /* renamed from: i */
        public CharSequence f914i;

        /* renamed from: j */
        public Drawable f915j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f916k;

        /* renamed from: l */
        public CharSequence f917l;

        /* renamed from: m */
        public Drawable f918m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f919n;

        /* renamed from: o */
        public CharSequence f920o;

        /* renamed from: p */
        public Drawable f921p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f922q;

        /* renamed from: r */
        public boolean f923r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f924s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f925t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f926u;

        /* renamed from: v */
        public CharSequence[] f927v;

        /* renamed from: w */
        public ListAdapter f928w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f929x;

        /* renamed from: y */
        public int f930y;

        /* renamed from: z */
        public View f931z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0347a extends ArrayAdapter<CharSequence> {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f932c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0347a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f932c = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0346f.this.f896F;
                if (zArr != null && zArr[i]) {
                    this.f932c.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0348b extends CursorAdapter {

            /* renamed from: c */
            private final int f934c;

            /* renamed from: d */
            private final int f935d;

            /* renamed from: e */
            final /* synthetic */ RecycleListView f936e;

            /* renamed from: f */
            final /* synthetic */ AlertController f937f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0348b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f936e = recycleListView;
                this.f937f = alertController;
                Cursor cursor2 = getCursor();
                this.f934c = cursor2.getColumnIndexOrThrow(C0346f.this.f902L);
                this.f935d = cursor2.getColumnIndexOrThrow(C0346f.this.f903M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f934c));
                RecycleListView recycleListView = this.f936e;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f935d) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0346f.this.f907b.inflate(this.f937f.f845M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0349c implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ AlertController f939c;

            C0349c(AlertController alertController) {
                this.f939c = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0346f.this.f929x.onClick(this.f939c.f853b, i);
                if (!C0346f.this.f898H) {
                    this.f939c.f853b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0350d implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f941c;

            /* renamed from: d */
            final /* synthetic */ AlertController f942d;

            C0350d(RecycleListView recycleListView, AlertController alertController) {
                this.f941c = recycleListView;
                this.f942d = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0346f.this.f896F;
                if (zArr != null) {
                    zArr[i] = this.f941c.isItemChecked(i);
                }
                C0346f.this.f900J.onClick(this.f942d.f853b, i, this.f941c.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0351e {
            /* renamed from: a */
            void mo1188a(ListView listView);
        }

        public C0346f(Context context) {
            this.f906a = context;
            this.f923r = true;
            this.f907b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v21, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1293b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f907b
                int r1 = r12.f844L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f897G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f901K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f906a
                int r4 = r12.f845M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f927v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f906a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f898H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f846N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f847O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f901K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f906a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f902L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f928w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f906a
                java.lang.CharSequence[] r3 = r11.f927v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f905O
                if (r1 == 0) goto L_0x006e
                r1.mo1188a(r0)
            L_0x006e:
                r12.f840H = r9
                int r1 = r11.f899I
                r12.f841I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f929x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f900J
                if (r1 == 0) goto L_0x008b
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f904N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f898H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f897G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f858g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0346f.m1293b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo1182a(AlertController alertController) {
            View view = this.f912g;
            if (view != null) {
                alertController.mo1165a(view);
            } else {
                CharSequence charSequence = this.f911f;
                if (charSequence != null) {
                    alertController.mo1172b(charSequence);
                }
                Drawable drawable = this.f909d;
                if (drawable != null) {
                    alertController.mo1164a(drawable);
                }
                int i = this.f908c;
                if (i != 0) {
                    alertController.mo1170b(i);
                }
                int i2 = this.f910e;
                if (i2 != 0) {
                    alertController.mo1170b(alertController.mo1161a(i2));
                }
            }
            CharSequence charSequence2 = this.f913h;
            if (charSequence2 != null) {
                alertController.mo1167a(charSequence2);
            }
            if (!(this.f914i == null && this.f915j == null)) {
                alertController.mo1163a(-1, this.f914i, this.f916k, (Message) null, this.f915j);
            }
            if (!(this.f917l == null && this.f918m == null)) {
                alertController.mo1163a(-2, this.f917l, this.f919n, (Message) null, this.f918m);
            }
            if (!(this.f920o == null && this.f921p == null)) {
                alertController.mo1163a(-3, this.f920o, this.f922q, (Message) null, this.f921p);
            }
            if (!(this.f927v == null && this.f901K == null && this.f928w == null)) {
                m1293b(alertController);
            }
            View view2 = this.f931z;
            if (view2 == null) {
                int i3 = this.f930y;
                if (i3 != 0) {
                    alertController.mo1174c(i3);
                }
            } else if (this.f895E) {
                alertController.mo1166a(view2, this.f891A, this.f892B, this.f893C, this.f894D);
            } else {
                alertController.mo1171b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0352g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f944a;

        public C0352g(DialogInterface dialogInterface) {
            this.f944a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f944a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0353h extends ArrayAdapter<CharSequence> {
        public C0353h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0385h hVar, Window window) {
        this.f852a = context;
        this.f853b = hVar;
        this.f854c = window;
        this.f850R = new C0352g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0009j.AlertDialog, C0000a.alertDialogStyle, 0);
        this.f842J = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_android_layout, 0);
        this.f843K = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_buttonPanelSideLayout, 0);
        this.f844L = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listLayout, 0);
        this.f845M = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_multiChoiceItemLayout, 0);
        this.f846N = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_singleChoiceItemLayout, 0);
        this.f847O = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listItemLayout, 0);
        this.f848P = obtainStyledAttributes.getBoolean(C0009j.AlertDialog_showTitle, true);
        this.f855d = obtainStyledAttributes.getDimensionPixelSize(C0009j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        hVar.mo1362a(1);
    }

    /* renamed from: a */
    private ViewGroup m1265a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m1266a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m1267a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f866o = (Button) viewGroup.findViewById(16908313);
        this.f866o.setOnClickListener(this.f851S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f867p) || this.f869r != null) {
            this.f866o.setText(this.f867p);
            Drawable drawable = this.f869r;
            if (drawable != null) {
                int i = this.f855d;
                drawable.setBounds(0, 0, i, i);
                this.f866o.setCompoundDrawables(this.f869r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f866o.setVisibility(0);
            z = true;
        } else {
            this.f866o.setVisibility(8);
            z = false;
        }
        this.f870s = (Button) viewGroup.findViewById(16908314);
        this.f870s.setOnClickListener(this.f851S);
        if (!TextUtils.isEmpty(this.f871t) || this.f873v != null) {
            this.f870s.setText(this.f871t);
            Drawable drawable2 = this.f873v;
            if (drawable2 != null) {
                int i2 = this.f855d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f870s.setCompoundDrawables(this.f873v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f870s.setVisibility(0);
            z |= true;
        } else {
            this.f870s.setVisibility(8);
        }
        this.f874w = (Button) viewGroup.findViewById(16908315);
        this.f874w.setOnClickListener(this.f851S);
        if (!TextUtils.isEmpty(this.f875x) || this.f877z != null) {
            this.f874w.setText(this.f875x);
            Drawable drawable3 = this.f869r;
            if (drawable3 != null) {
                int i3 = this.f855d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f866o.setCompoundDrawables(this.f869r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f874w.setVisibility(0);
            z |= true;
        } else {
            this.f874w.setVisibility(8);
        }
        if (m1270a(this.f852a)) {
            if (z) {
                button = this.f866o;
            } else if (z) {
                button = this.f870s;
            } else if (z) {
                button = this.f874w;
            }
            m1269a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1268a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f854c.findViewById(C0005f.scrollIndicatorUp);
        View findViewById2 = this.f854c.findViewById(C0005f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0187u.m688a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f857f != null) {
                this.f833A.setOnScrollChangeListener(new C0342b(this, findViewById, view2));
                this.f833A.post(new C0343c(findViewById, view2));
                return;
            }
            ListView listView = this.f858g;
            if (listView != null) {
                listView.setOnScrollListener(new C0344d(this, findViewById, view2));
                this.f858g.post(new C0345e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m1269a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m1270a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    private void m1271b(ViewGroup viewGroup) {
        this.f833A = (NestedScrollView) this.f854c.findViewById(C0005f.scrollView);
        this.f833A.setFocusable(false);
        this.f833A.setNestedScrollingEnabled(false);
        this.f838F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f838F;
        if (textView != null) {
            CharSequence charSequence = this.f857f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f833A.removeView(this.f838F);
            if (this.f858g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f833A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f833A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f858g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    private int m1272c() {
        int i = this.f843K;
        return i == 0 ? this.f842J : this.f849Q == 1 ? i : this.f842J;
    }

    /* renamed from: c */
    private void m1273c(ViewGroup viewGroup) {
        View view = this.f859h;
        boolean z = false;
        if (view == null) {
            view = this.f860i != 0 ? LayoutInflater.from(this.f852a).inflate(this.f860i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1274c(view)) {
            this.f854c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f854c.findViewById(C0005f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f865n) {
                frameLayout.setPadding(this.f861j, this.f862k, this.f863l, this.f864m);
            }
            if (this.f858g != null) {
                ((C0516i0.C0517a) viewGroup.getLayoutParams()).f1711a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    static boolean m1274c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1274c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m1275d() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f854c.findViewById(C0005f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0005f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0005f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0005f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0005f.customPanel);
        m1273c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0005f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0005f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0005f.buttonPanel);
        ViewGroup a = m1265a(findViewById7, findViewById4);
        ViewGroup a2 = m1265a(findViewById8, findViewById5);
        ViewGroup a3 = m1265a(findViewById9, findViewById6);
        m1271b(a2);
        m1267a(a3);
        m1276d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0005f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f833A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f857f == null && this.f858g == null)) {
                view = a.findViewById(C0005f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0005f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f858g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo1175a(z2, z3);
        }
        if (!z) {
            View view2 = this.f858g;
            if (view2 == null) {
                view2 = this.f833A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m1268a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f858g;
        if (listView2 != null && (listAdapter = this.f840H) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f841I;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: d */
    private void m1276d(ViewGroup viewGroup) {
        if (this.f839G != null) {
            viewGroup.addView(this.f839G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f854c.findViewById(C0005f.title_template).setVisibility(8);
            return;
        }
        this.f836D = (ImageView) this.f854c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f856e)) || !this.f848P) {
            this.f854c.findViewById(C0005f.title_template).setVisibility(8);
            this.f836D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f837E = (TextView) this.f854c.findViewById(C0005f.alertTitle);
        this.f837E.setText(this.f856e);
        int i = this.f834B;
        if (i != 0) {
            this.f836D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f835C;
        if (drawable != null) {
            this.f836D.setImageDrawable(drawable);
            return;
        }
        this.f837E.setPadding(this.f836D.getPaddingLeft(), this.f836D.getPaddingTop(), this.f836D.getPaddingRight(), this.f836D.getPaddingBottom());
        this.f836D.setVisibility(8);
    }

    /* renamed from: a */
    public int mo1161a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f852a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo1162a() {
        return this.f858g;
    }

    /* renamed from: a */
    public void mo1163a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f850R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f875x = charSequence;
            this.f876y = message;
            this.f877z = drawable;
        } else if (i == -2) {
            this.f871t = charSequence;
            this.f872u = message;
            this.f873v = drawable;
        } else if (i == -1) {
            this.f867p = charSequence;
            this.f868q = message;
            this.f869r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo1164a(Drawable drawable) {
        this.f835C = drawable;
        this.f834B = 0;
        ImageView imageView = this.f836D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f836D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo1165a(View view) {
        this.f839G = view;
    }

    /* renamed from: a */
    public void mo1166a(View view, int i, int i2, int i3, int i4) {
        this.f859h = view;
        this.f860i = 0;
        this.f865n = true;
        this.f861j = i;
        this.f862k = i2;
        this.f863l = i3;
        this.f864m = i4;
    }

    /* renamed from: a */
    public void mo1167a(CharSequence charSequence) {
        this.f857f = charSequence;
        TextView textView = this.f838F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo1168a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f833A;
        return nestedScrollView != null && nestedScrollView.mo2818a(keyEvent);
    }

    /* renamed from: b */
    public void mo1169b() {
        this.f853b.setContentView(m1272c());
        m1275d();
    }

    /* renamed from: b */
    public void mo1170b(int i) {
        this.f835C = null;
        this.f834B = i;
        ImageView imageView = this.f836D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f836D.setImageResource(this.f834B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo1171b(View view) {
        this.f859h = view;
        this.f860i = 0;
        this.f865n = false;
    }

    /* renamed from: b */
    public void mo1172b(CharSequence charSequence) {
        this.f856e = charSequence;
        TextView textView = this.f837E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo1173b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f833A;
        return nestedScrollView != null && nestedScrollView.mo2818a(keyEvent);
    }

    /* renamed from: c */
    public void mo1174c(int i) {
        this.f859h = null;
        this.f860i = i;
        this.f865n = false;
    }
}
