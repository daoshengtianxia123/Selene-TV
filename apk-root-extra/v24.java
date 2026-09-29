package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public abstract class v24 {
    public static final java.util.List a = defpackage.pp4.M(new defpackage.v61("all", "全部"), new defpackage.v61("recent", "最近热门"));
    public static final java.util.List b = defpackage.pp4.M(new defpackage.v61("all", "全部"), new defpackage.v61("domestic", "国内"), new defpackage.v61("foreign", "国外"));
    public static final java.util.List c = defpackage.pp4.M(new defpackage.cz3("all", "全部"), new defpackage.cz3("reality", "真人秀"), new defpackage.cz3("talkshow", "脱口秀"), new defpackage.cz3("music", "音乐"), new defpackage.cz3("musical", "歌舞"));
    public static final java.util.List d = defpackage.pp4.M(new defpackage.cz3("all", "全部"), new defpackage.cz3("chinese", "华语"), new defpackage.cz3("western", "欧美"), new defpackage.cz3("foreign", "国外"), new defpackage.cz3("korean", "韩国"), new defpackage.cz3("japanese", "日本"), new defpackage.cz3("mainland_china", "中国大陆"), new defpackage.cz3("hong_kong", "中国香港"), new defpackage.cz3("usa", "美国"), new defpackage.cz3("uk", "英国"), new defpackage.cz3("thailand", "泰国"), new defpackage.cz3("taiwan", "中国台湾"), new defpackage.cz3("italy", "意大利"), new defpackage.cz3("france", "法国"), new defpackage.cz3("germany", "德国"), new defpackage.cz3("spain", "西班牙"), new defpackage.cz3("russia", "俄罗斯"), new defpackage.cz3("sweden", "瑞典"), new defpackage.cz3("brazil", "巴西"), new defpackage.cz3("denmark", "丹麦"), new defpackage.cz3("india", "印度"), new defpackage.cz3("canada", "加拿大"), new defpackage.cz3("ireland", "爱尔兰"), new defpackage.cz3("australia", "澳大利亚"));
    public static final java.util.List e = defpackage.pp4.M(new defpackage.cz3("all", "全部"), new defpackage.cz3("2020s", "2020年代"), new defpackage.cz3("2026", "2026"), new defpackage.cz3("2025", "2025"), new defpackage.cz3("2024", "2024"), new defpackage.cz3("2023", "2023"), new defpackage.cz3("2022", "2022"), new defpackage.cz3("2021", "2021"), new defpackage.cz3("2020", "2020"), new defpackage.cz3("2019", "2019"), new defpackage.cz3("2010s", "2010年代"), new defpackage.cz3("2000s", "2000年代"), new defpackage.cz3("1990s", "90年代"), new defpackage.cz3("1980s", "80年代"), new defpackage.cz3("1970s", "70年代"), new defpackage.cz3("1960s", "60年代"), new defpackage.cz3("earlier", "更早"));
    public static final java.util.List f = defpackage.pp4.M(new defpackage.cz3("all", "全部"), new defpackage.cz3("tencent", "腾讯视频"), new defpackage.cz3("iqiyi", "爱奇艺"), new defpackage.cz3("youku", "优酷"), new defpackage.cz3("hunan_tv", "湖南卫视"), new defpackage.cz3("netflix", "Netflix"), new defpackage.cz3("hbo", "HBO"), new defpackage.cz3("bbc", "BBC"), new defpackage.cz3("nhk", "NHK"), new defpackage.cz3("cbs", "CBS"), new defpackage.cz3("nbc", "NBC"), new defpackage.cz3("tvn", "tvN"));
    public static final java.util.List g = defpackage.pp4.M(new defpackage.cz3("T", "综合排序"), new defpackage.cz3("U", "近期热度"), new defpackage.cz3("R", "首播时间"), new defpackage.cz3("S", "高分优先"));

    public static final void a(defpackage.r24 r24Var, defpackage.jd1 jd1Var, java.lang.String str, defpackage.jd1 jd1Var2, defpackage.hd1 hd1Var, defpackage.jd1 jd1Var3, defpackage.ta1 ta1Var, defpackage.ta1 ta1Var2, defpackage.hd1 hd1Var2, defpackage.k80 k80Var, int i) {
        k80Var.d0(-1845219379);
        int i2 = i | (k80Var.f(r24Var) ? 4 : 2) | (k80Var.f(str) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var.f(ta1Var) ? 1048576 : 524288);
        if (k80Var.S(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean zEquals = r24Var.a.equals("all");
            defpackage.to2 to2VarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.d.c(defpackage.qo2.f, 1.0f), 0.0f, 11.0f, 0.0f, 18.0f, 5);
            defpackage.v40 v40VarA = defpackage.t40.a(new defpackage.yj(14.0f, new defpackage.qj(1)), defpackage.d6.E, k80Var, 6);
            long j = k80Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarH);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(j90Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, v40VarA);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var, i3, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            defpackage.xr1.a("分类", defpackage.q8.n0(-5618669, new defpackage.vg(r24Var, ta1Var2, jd1Var, ta1Var, 3), k80Var), k80Var, 54);
            if (zEquals) {
                k80Var.b0(-1961583508);
                defpackage.xr1.a("筛选", defpackage.q8.n0(874543982, new defpackage.wg(str, jd1Var2, hd1Var, jd1Var3, ta1Var2, ta1Var, hd1Var2, r24Var, 2), k80Var), k80Var, 54);
                k80Var.p(false);
            } else {
                k80Var.b0(-1958751813);
                defpackage.xr1.a("地区", defpackage.q8.n0(-1723790153, new defpackage.ze(r24Var, ta1Var, hd1Var2, jd1Var, ta1Var2, 5), k80Var), k80Var, 54);
                k80Var.p(false);
            }
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xg(r24Var, jd1Var, str, jd1Var2, hd1Var, jd1Var3, ta1Var, ta1Var2, hd1Var2, i, 2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ta1 r38, defpackage.iv3 r39, defpackage.jd1 r40, defpackage.k80 r41, int r42) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.b(ta1, iv3, jd1, k80, int):void");
    }

    public static final void c(defpackage.nf0 nf0Var, defpackage.ls2 ls2Var, defpackage.cw0 cw0Var, defpackage.ls2 ls2Var2, boolean z) {
        if (((defpackage.w24) ls2Var.getValue()).b) {
            return;
        }
        if (z || ((defpackage.w24) ls2Var.getValue()).e) {
            defpackage.u22.C(nf0Var, null, new defpackage.cq2(z, cw0Var, ls2Var, ls2Var2, null, 1), 3);
        }
    }

    public static final java.lang.Object d(defpackage.cw0 cw0Var, defpackage.r24 r24Var, int i, defpackage.cq2 cq2Var) {
        java.lang.String str = (java.lang.String) defpackage.ij2.K(new defpackage.h33("all", "show"), new defpackage.h33("domestic", "show_domestic"), new defpackage.h33("foreign", "show_foreign")).get(r24Var.b);
        return cw0Var.c(defpackage.wv0.i, "最近热门", str == null ? "show" : str, 25, i, defpackage.vv0.f, cq2Var);
    }

    public static final java.lang.Object e(defpackage.cw0 cw0Var, defpackage.r24 r24Var, int i, defpackage.sd4 sd4Var) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.util.Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (defpackage.ct1.g(((defpackage.cz3) next).a, r24Var.c)) {
                break;
            }
        }
        defpackage.cz3 cz3Var = (defpackage.cz3) next;
        java.lang.String str = cz3Var != null ? cz3Var.b : null;
        java.util.Iterator it2 = d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (defpackage.ct1.g(((defpackage.cz3) next2).a, r24Var.d)) {
                break;
            }
        }
        defpackage.cz3 cz3Var2 = (defpackage.cz3) next2;
        java.lang.String str2 = cz3Var2 != null ? cz3Var2.b : null;
        java.util.Iterator it3 = e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (defpackage.ct1.g(((defpackage.cz3) next3).a, r24Var.e)) {
                break;
            }
        }
        defpackage.cz3 cz3Var3 = (defpackage.cz3) next3;
        java.lang.String str3 = cz3Var3 != null ? cz3Var3.b : null;
        java.util.Iterator it4 = f.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (defpackage.ct1.g(((defpackage.cz3) next4).a, r24Var.f)) {
                break;
            }
        }
        defpackage.cz3 cz3Var4 = (defpackage.cz3) next4;
        java.lang.String str4 = cz3Var4 != null ? cz3Var4.b : null;
        return cw0Var.a(new org.moontechlab.selenetv.model.DoubanRecommendsParams("tv", r24Var.c.equals("all") ? "all" : str == null ? "" : str, "综艺", r24Var.d.equals("all") ? "all" : str2 == null ? "" : str2, r24Var.e.equals("all") ? "all" : str3 == null ? "" : str3, r24Var.f.equals("all") ? "all" : str4 == null ? "" : str4, r24Var.g, null, i, 1152), sd4Var);
    }
}
