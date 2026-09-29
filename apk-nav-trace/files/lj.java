package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public abstract class lj {
    public static android.content.SharedPreferences a = null;
    public static volatile boolean b = false;
    public static volatile java.lang.String c = "third";
    public static volatile java.lang.String d = "third";
    public static volatile java.lang.String e = "off";
    public static volatile java.util.Set f = defpackage.pi0.c;
    public static volatile defpackage.dh0 g = new defpackage.dh0(1.0f, 1.0f, 1.0f, 100, true);
    public static volatile boolean h;

    public static java.lang.String a() {
        return c;
    }

    public static java.lang.String b() {
        return d;
    }

    public static defpackage.dh0 c() {
        return g;
    }

    public static java.util.Set d() {
        return f;
    }

    public static java.lang.String e() {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("server_url", null);
        }
        defpackage.ct1.R("prefs");
        throw null;
    }

    public static boolean f() {
        return b;
    }

    public static boolean g() {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("has_login", false);
        }
        defpackage.ct1.R("prefs");
        throw null;
    }

    public static java.lang.Object h(java.lang.String str, defpackage.sd4 sd4Var) throws java.lang.Throwable {
        java.lang.Object objQ = defpackage.u22.Q(defpackage.cv0.d, new defpackage.ij(str, null, 9), sd4Var);
        return objQ == defpackage.of0.f ? objQ : defpackage.as4.a;
    }
}
