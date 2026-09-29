package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public abstract class uf2 {
    public static android.content.SharedPreferences a;
    public static final defpackage.vw1 b = defpackage.ss1.a(new defpackage.pg(24));
    public static volatile java.util.List c;

    public static void a() {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        sharedPreferences.edit().remove("subscription_url").remove("search_sources").remove("live_sources").remove("play_records").remove("favorites").remove("search_history").apply();
        c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [zq3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    public static java.util.List b() {
        ?? zq3Var;
        java.util.List list = defpackage.m01.f;
        java.util.List list2 = c;
        if (list2 != null) {
            return list2;
        }
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        java.lang.String string = sharedPreferences.getString("favorites", null);
        if (string != null && !defpackage.va4.t0(string)) {
            try {
                defpackage.vw1 vw1Var = b;
                vw1Var.getClass();
                java.util.List listT0 = defpackage.y30.T0(((java.util.Map) vw1Var.b(string, new defpackage.gc2(defpackage.ta4.a, org.moontechlab.selenetv.model.FavoriteItem.INSTANCE.serializer()))).values(), new defpackage.eb1(17));
                zq3Var = new java.util.ArrayList();
                for (java.lang.Object obj : listT0) {
                    if (!defpackage.ct1.g(((org.moontechlab.selenetv.model.FavoriteItem) obj).i, "live")) {
                        zq3Var.add(obj);
                    }
                }
            } catch (java.lang.Throwable th) {
                zq3Var = new defpackage.zq3(th);
            }
            java.lang.Throwable thA = defpackage.ar3.a(zq3Var);
            if (thA == null) {
                list = zq3Var;
            } else {
                android.util.Log.w("LocalStore", "收藏夹 解析失败: " + thA.getMessage());
            }
            list = list;
        }
        c = list;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [zq3] */
    public static java.util.Map c() {
        defpackage.n01 zq3Var;
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        java.lang.String string = sharedPreferences.getString("play_records", null);
        defpackage.n01 n01Var = defpackage.n01.f;
        if (string == null) {
            return n01Var;
        }
        try {
            defpackage.vw1 vw1Var = b;
            vw1Var.getClass();
            zq3Var = (java.util.Map) vw1Var.b(string, new defpackage.gc2(defpackage.ta4.a, org.moontechlab.selenetv.model.PlayRecord.INSTANCE.serializer()));
        } catch (java.lang.Throwable th) {
            zq3Var = new defpackage.zq3(th);
        }
        java.lang.Throwable thA = defpackage.ar3.a(zq3Var);
        if (thA == null) {
            n01Var = zq3Var;
        } else {
            android.util.Log.w("LocalStore", "播放记录 解析失败: " + thA.getMessage());
        }
        return n01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [zq3] */
    public static java.util.List d() {
        defpackage.m01 zq3Var;
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        java.lang.String string = sharedPreferences.getString("search_history", null);
        defpackage.m01 m01Var = defpackage.m01.f;
        if (string == null) {
            return m01Var;
        }
        try {
            defpackage.vw1 vw1Var = b;
            vw1Var.getClass();
            zq3Var = (java.util.List) vw1Var.b(string, new defpackage.fk(defpackage.ta4.a));
        } catch (java.lang.Throwable th) {
            zq3Var = new defpackage.zq3(th);
        }
        java.lang.Throwable thA = defpackage.ar3.a(zq3Var);
        if (thA == null) {
            m01Var = zq3Var;
        } else {
            android.util.Log.w("LocalStore", "搜索历史 解析失败: " + thA.getMessage());
        }
        return m01Var;
    }

    public static java.lang.String e() {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("subscription_url", null);
        }
        defpackage.ct1.R("prefs");
        throw null;
    }

    public static void f(java.util.ArrayList arrayList) {
        int iJ = defpackage.ij2.J(defpackage.z30.g0(10, arrayList));
        if (iJ < 16) {
            iJ = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iJ);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            org.moontechlab.selenetv.model.FavoriteItem favoriteItem = (org.moontechlab.selenetv.model.FavoriteItem) next;
            linkedHashMap.put(favoriteItem.b + "+" + favoriteItem.a, next);
        }
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        defpackage.vw1 vw1Var = b;
        vw1Var.getClass();
        editorEdit.putString("favorites", vw1Var.c(new defpackage.gc2(defpackage.ta4.a, org.moontechlab.selenetv.model.FavoriteItem.INSTANCE.serializer()), linkedHashMap)).apply();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            java.lang.Object next2 = it2.next();
            if (!defpackage.ct1.g(((org.moontechlab.selenetv.model.FavoriteItem) next2).i, "live")) {
                arrayList2.add(next2);
            }
        }
        c = defpackage.y30.T0(arrayList2, new defpackage.eb1(18));
    }

    public static void g(java.util.Map map) {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        defpackage.vw1 vw1Var = b;
        vw1Var.getClass();
        editorEdit.putString("play_records", vw1Var.c(new defpackage.gc2(defpackage.ta4.a, org.moontechlab.selenetv.model.PlayRecord.INSTANCE.serializer()), map)).apply();
    }

    public static void h(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.content.SharedPreferences sharedPreferences = a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        defpackage.vw1 vw1Var = b;
        vw1Var.getClass();
        editorEdit.putString("search_sources", vw1Var.c(new defpackage.fk(org.moontechlab.selenetv.model.SearchResource.INSTANCE.serializer()), arrayList)).putString("live_sources", vw1Var.c(new defpackage.fk(org.moontechlab.selenetv.model.LiveSource.INSTANCE.serializer()), arrayList2)).apply();
    }
}
