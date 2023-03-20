package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.i */
class C0387i {

    /* renamed from: a */
    private static Field f1061a;

    /* renamed from: b */
    private static boolean f1062b;

    /* renamed from: c */
    private static Class<?> f1063c;

    /* renamed from: d */
    private static boolean f1064d;

    /* renamed from: e */
    private static Field f1065e;

    /* renamed from: f */
    private static boolean f1066f;

    /* renamed from: g */
    private static Field f1067g;

    /* renamed from: h */
    private static boolean f1068h;

    /* renamed from: a */
    static void m1523a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1527d(resources);
            } else if (i >= 23) {
                m1526c(resources);
            } else if (i >= 21) {
                m1525b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m1524a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1064d) {
            try {
                f1063c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1064d = true;
        }
        Class<?> cls = f1063c;
        if (cls != null) {
            if (!f1066f) {
                try {
                    f1065e = cls.getDeclaredField("mUnthemedEntries");
                    f1065e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1066f = true;
            }
            Field field = f1065e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m1525b(Resources resources) {
        Map map;
        if (!f1062b) {
            try {
                f1061a = Resources.class.getDeclaredField("mDrawableCache");
                f1061a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1062b = true;
        }
        Field field = f1061a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1526c(Resources resources) {
        if (!f1062b) {
            try {
                f1061a = Resources.class.getDeclaredField("mDrawableCache");
                f1061a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1062b = true;
        }
        Object obj = null;
        Field field = f1061a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m1524a(obj);
        }
    }

    /* renamed from: d */
    private static void m1527d(Resources resources) {
        Object obj;
        if (!f1068h) {
            try {
                f1067g = Resources.class.getDeclaredField("mResourcesImpl");
                f1067g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1068h = true;
        }
        Field field = f1067g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f1062b) {
                    try {
                        f1061a = obj.getClass().getDeclaredField("mDrawableCache");
                        f1061a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1062b = true;
                }
                Field field2 = f1061a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m1524a(obj2);
                }
            }
        }
    }
}
