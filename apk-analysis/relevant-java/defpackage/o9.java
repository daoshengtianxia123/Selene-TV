package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class o9 extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(java.lang.Object obj, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.i = obj;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        int i = 2;
        switch (this.f) {
            case 0:
                return new defpackage.o9((defpackage.lu0) this.i, sd0Var, 0);
            case 1:
                return new defpackage.o9((defpackage.dh0) this.i, sd0Var, 1);
            case 2:
                return new defpackage.o9((defpackage.xu0) this.i, sd0Var, i);
            case 3:
                return new defpackage.o9((defpackage.uv0) this.i, sd0Var, 3);
            case 4:
                return new defpackage.o9((org.moontechlab.selenetv.model.LiveSource) this.i, sd0Var, 4);
            case 5:
                return new defpackage.o9((defpackage.u73) this.i, sd0Var, 5);
            case 6:
                return new defpackage.o9((defpackage.x33) this.i, sd0Var, 6);
            default:
                defpackage.o9 o9Var = new defpackage.o9(i, sd0Var);
                o9Var.i = obj;
                return o9Var;
        }
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.nf0 nf0Var = (defpackage.nf0) obj;
        defpackage.sd0 sd0Var = (defpackage.sd0) obj2;
        switch (i) {
            case 0:
                ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
                return as4Var;
            case 1:
                ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
                return as4Var;
            case 2:
                return ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
            case 3:
                return ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
            case 4:
                return ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
            case 5:
                return ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
            case 6:
                ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
                return as4Var;
            default:
                return ((defpackage.o9) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
        }
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Exception {
        java.io.File file;
        java.io.File[] fileArrListFiles;
        java.util.List list;
        java.lang.String str;
        java.lang.Object zq3Var;
        boolean z = true;
        switch (this.f) {
            case 0:
                defpackage.or1.J(obj);
                ((defpackage.lu0) this.i).show();
                return defpackage.as4.a;
            case 1:
                defpackage.or1.J(obj);
                android.content.SharedPreferences sharedPreferences = defpackage.lj.a;
                if (sharedPreferences == null) {
                    defpackage.ct1.R("prefs");
                    throw null;
                }
                sharedPreferences.edit().putFloat("danmaku_opacity", ((defpackage.dh0) this.i).a).putFloat("danmaku_speed", ((defpackage.dh0) this.i).b).putFloat("danmaku_font_scale", ((defpackage.dh0) this.i).c).putInt("danmaku_density_pct", ((defpackage.dh0) this.i).d).putBoolean("danmaku_anti_overlap", ((defpackage.dh0) this.i).e).apply();
                defpackage.lj.g = (defpackage.dh0) this.i;
                return defpackage.as4.a;
            case 2:
                defpackage.or1.J(obj);
                defpackage.xu0 xu0Var = (defpackage.xu0) this.i;
                synchronized (xu0Var) {
                    if (!xu0Var.C || xu0Var.D) {
                        return defpackage.as4.a;
                    }
                    try {
                        xu0Var.C();
                    } catch (java.io.IOException unused) {
                        xu0Var.E = true;
                    }
                    try {
                        if ((xu0Var.z >= 2000 ? 1 : 0) != 0) {
                            xu0Var.E();
                        }
                    } catch (java.io.IOException unused2) {
                        xu0Var.F = true;
                        xu0Var.A = new defpackage.zj3(new defpackage.yr());
                    }
                    return defpackage.as4.a;
                }
            case 3:
                defpackage.as4 as4Var = defpackage.as4.a;
                defpackage.uv0 uv0Var = (defpackage.uv0) this.i;
                defpackage.or1.J(obj);
                try {
                    uv0Var.b.clear();
                    file = uv0Var.c;
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                if (file == null) {
                    return null;
                }
                if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                    int length = fileArrListFiles.length;
                    while (i < length) {
                        java.io.File file2 = fileArrListFiles[i];
                        if (file2.isFile()) {
                            file2.delete();
                        }
                        i++;
                    }
                }
                return as4Var;
            case 4:
                defpackage.or1.J(obj);
                defpackage.ro3 ro3Var = defpackage.he2.a;
                org.moontechlab.selenetv.model.LiveSource liveSource = (org.moontechlab.selenetv.model.LiveSource) this.i;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.he2.f;
                liveSource.getClass();
                java.lang.String str2 = liveSource.a;
                defpackage.ge2 ge2Var = (defpackage.ge2) concurrentHashMap.get(str2);
                if (ge2Var != null && java.lang.System.currentTimeMillis() - ge2Var.b <= 7200000) {
                    return (java.util.List) ge2Var.a;
                }
                try {
                    java.util.ArrayList arrayListC = defpackage.he2.c(str2, defpackage.he2.a(liveSource));
                    concurrentHashMap.put(str2, new defpackage.ge2(arrayListC));
                    return arrayListC;
                } catch (java.lang.Exception e2) {
                    android.util.Log.e("LiveService", "获取直播频道失败: " + e2.getMessage());
                    defpackage.ge2 ge2Var2 = (defpackage.ge2) concurrentHashMap.get(str2);
                    if (ge2Var2 == null || (list = (java.util.List) ge2Var2.a) == null) {
                        throw e2;
                    }
                    return list;
                }
            case 5:
                defpackage.or1.J(obj);
                defpackage.u73 u73Var = (defpackage.u73) this.i;
                android.content.Context context = u73Var.b;
                defpackage.oy3 oy3Var = u73Var.c;
                android.view.textclassifier.TextClassificationManager textClassificationManagerJ = defpackage.d73.j(context.getSystemService(defpackage.d73.o()));
                int iOrdinal = oy3Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        defpackage.jc2.o();
                        return null;
                    }
                    str = "textview";
                }
                defpackage.g4.D();
                android.view.textclassifier.TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerJ.createTextClassificationSession(defpackage.g4.g(context.getPackageName(), str).build());
                u73Var.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 6:
                defpackage.or1.J(obj);
                defpackage.cb1.q((defpackage.x33) this.i, 0);
                return defpackage.as4.a;
            default:
                defpackage.or1.J(obj);
                java.lang.String strE = defpackage.uf2.e();
                if (strE == null) {
                    return java.lang.Boolean.FALSE;
                }
                try {
                    zq3Var = defpackage.ac4.a(strE);
                } catch (java.lang.Throwable th) {
                    zq3Var = new defpackage.zq3(th);
                }
                java.lang.Throwable thA = defpackage.ar3.a(zq3Var);
                if (thA != null) {
                    android.util.Log.w("SubscriptionService", "刷新订阅失败: " + defpackage.lo3.a.b(thA.getClass()).e() + ": " + thA.getMessage());
                    return java.lang.Boolean.FALSE;
                }
                defpackage.yb4 yb4Var = (defpackage.yb4) zq3Var;
                if (defpackage.ct1.g(defpackage.uf2.e(), strE)) {
                    defpackage.uf2.h(yb4Var.a, yb4Var.b);
                    defpackage.ro3 ro3Var2 = defpackage.he2.a;
                    defpackage.he2.e = null;
                    defpackage.he2.f.clear();
                } else {
                    android.util.Log.w("SubscriptionService", "刷新期间订阅 URL 已变更，丢弃旧拉取结果");
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(int i, defpackage.sd0 sd0Var) {
        super(i, sd0Var);
        this.f = 7;
    }
}
