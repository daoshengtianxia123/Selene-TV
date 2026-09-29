package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public abstract class ph0 {
    public static final defpackage.vw1 a = defpackage.ss1.a(new defpackage.wi(9));
    public static final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.Map c = defpackage.ij2.K(new defpackage.h33((char) 19968, 1), new defpackage.h33((char) 20108, 2), new defpackage.h33((char) 19977, 3), new defpackage.h33((char) 22235, 4), new defpackage.h33((char) 20116, 5), new defpackage.h33((char) 20845, 6), new defpackage.h33((char) 19971, 7), new defpackage.h33((char) 20843, 8), new defpackage.h33((char) 20061, 9), new defpackage.h33((char) 21313, 10), new defpackage.h33((char) 22777, 1), new defpackage.h33((char) 36144, 2), new defpackage.h33((char) 21441, 3), new defpackage.h33((char) 32902, 4), new defpackage.h33((char) 20237, 5), new defpackage.h33((char) 38470, 6), new defpackage.h33((char) 26578, 7), new defpackage.h33((char) 25420, 8), new defpackage.h33((char) 29590, 9), new defpackage.h33((char) 25342, 10));
    public static final java.util.List d = defpackage.pp4.M(new defpackage.h33(new defpackage.ro3("(?:S|Season)\\s*(\\d+)", 0), new defpackage.wi(10)), new defpackage.h33(new defpackage.ro3("第\\s*([一二三四五六七八九十壹贰叁肆伍陆柒捌玖拾\\d])\\s*[季部幕]"), new defpackage.wi(11)), new defpackage.h33(new defpackage.ro3("([一二三四五六七八九十壹贰叁肆伍陆柒捌玖拾])\\s*之\\s*章"), new defpackage.wi(12)), new defpackage.h33(new defpackage.ro3("\\s+([Ⅰ-Ⅻ])(?=\\s|$)"), new defpackage.wi(13)), new defpackage.h33(new defpackage.ro3("\\s+([IVXLCDM]+)\\b", 0), new defpackage.wi(14)), new defpackage.h33(new defpackage.ro3("[^\\d](\\d{1,2})\\s*$"), new defpackage.wi(15)));
    public static final defpackage.ro3 e = new defpackage.ro3("特典|预告|广告|菜单|花絮|特辑|速看|资讯|彩蛋|直拍|直播回顾|片头|片尾|幕后|映像|番外篇|纪录片|访谈|番外|短片|加更|走心|解忧|纯享|解读|揭秘|赏析|抢先看|超前看|名场面|解说|有声剧|广播剧|单集|PV");
    public static final defpackage.ro3 f = new defpackage.ro3("\\b(NCOP|NCED|NC|OP|ED|SP|OVA|OAD|PV|MV|Menu|Bonus|Recap|Teaser|Trailer|Preview|Sample|EDPV|SongSpot|BDSpot)\\b", 0);
    public static final java.util.concurrent.ConcurrentHashMap g = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String a(java.lang.String str) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("[《》「」『』\\[\\]()（）·•・:：·\\-—_~!！?？,，.。\\s]");
        patternCompile.getClass();
        str.getClass();
        java.lang.String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        java.lang.String lowerCase = strReplaceAll.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static java.util.List b(java.lang.String str, java.util.List list) {
        str.getClass();
        list.getClass();
        if (list.isEmpty() || a(str).length() == 0) {
            return defpackage.m01.f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str2 = ((org.moontechlab.selenetv.service.danmaku.DanmakuMedia) obj).c;
            defpackage.ro3 ro3Var = e;
            ro3Var.getClass();
            str2.getClass();
            if (!ro3Var.f.matcher(str2).find()) {
                defpackage.ro3 ro3Var2 = f;
                ro3Var2.getClass();
                if (!ro3Var2.f.matcher(str2).find()) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, arrayList));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            org.moontechlab.selenetv.service.danmaku.DanmakuMedia danmakuMedia = (org.moontechlab.selenetv.service.danmaku.DanmakuMedia) it.next();
            java.lang.String str3 = danmakuMedia.b;
            java.lang.String str4 = danmakuMedia.c;
            java.lang.String strA = a(str);
            java.lang.String strA2 = a(str4);
            int iC = 0;
            if (strA.length() != 0 && strA2.length() != 0) {
                if (strA.equals(strA2)) {
                    iC = io.netty.handler.codec.http2.Http2CodecUtil.DEFAULT_MAX_QUEUED_CONTROL_FRAMES;
                } else {
                    java.lang.String strF = f(strA);
                    java.lang.String strF2 = f(strA2);
                    boolean z = d(str) == d(str4);
                    if (strF.length() <= 0 || !strF.equals(strF2)) {
                        java.lang.String str5 = strF.length() <= strF2.length() ? strF : strF2;
                        java.lang.String str6 = strF.length() <= strF2.length() ? strF2 : strF;
                        if (str5.length() >= 4 && defpackage.cb4.d0(str6, str5, false) && z) {
                            iC = c(strF, strF2) + 3000;
                        } else {
                            int iC2 = c(strF, strF2);
                            if (iC2 >= 85 && z) {
                                iC = iC2;
                            }
                        }
                    } else if (z) {
                        iC = c(strA, strA2) + 5000;
                    }
                }
            }
            arrayList2.add(new defpackage.lh0(str3, str4, iC));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            if (((defpackage.lh0) next).c > 0) {
                arrayList3.add(next);
            }
        }
        return defpackage.y30.U0(3, defpackage.y30.T0(arrayList3, new defpackage.eb1(7)));
    }

    public static int c(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0 && str2.length() == 0) {
            return 100;
        }
        if (str.length() == 0 || str2.length() == 0) {
            return 0;
        }
        int length = str2.length() + 1;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        int length2 = str.length();
        if (1 <= length2) {
            int i2 = 1;
            while (true) {
                int iMin = iArr[0];
                iArr[0] = i2;
                int length3 = str2.length();
                if (1 <= length3) {
                    int i3 = 1;
                    while (true) {
                        int i4 = iArr[i3];
                        int i5 = i3 - 1;
                        if (str.charAt(i2 - 1) != str2.charAt(i5)) {
                            iMin = java.lang.Math.min(iMin, java.lang.Math.min(iArr[i3], iArr[i5])) + 1;
                        }
                        iArr[i3] = iMin;
                        if (i3 == length3) {
                            break;
                        }
                        i3++;
                        iMin = i4;
                    }
                }
                if (i2 == length2) {
                    break;
                }
                i2++;
            }
        }
        return (int) java.lang.Math.round((1.0d - (iArr[str2.length()] / java.lang.Math.max(str.length(), str2.length()))) * 100.0d);
    }

    public static int d(java.lang.String str) {
        java.lang.Integer num;
        str.getClass();
        if (defpackage.va4.t0(str)) {
            return 1;
        }
        for (defpackage.h33 h33Var : d) {
            defpackage.ro3 ro3Var = (defpackage.ro3) h33Var.f;
            defpackage.jd1 jd1Var = (defpackage.jd1) h33Var.i;
            defpackage.tj2 tj2VarA = defpackage.ro3.a(ro3Var, str);
            if (tj2VarA != null && (num = (java.lang.Integer) jd1Var.invoke(tj2VarA)) != null) {
                return num.intValue();
            }
        }
        return 1;
    }

    public static defpackage.qh0 e(defpackage.oi0 oi0Var) {
        java.lang.String str = oi0Var.a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b;
        java.lang.Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            defpackage.qh0 qh0Var = (defpackage.qh0) oi0Var.c.invoke();
            java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, qh0Var);
            obj = objPutIfAbsent == null ? qh0Var : objPutIfAbsent;
        }
        obj.getClass();
        return (defpackage.qh0) obj;
    }

    public static java.lang.String f(java.lang.String str) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("第[一二三四五六七八九十壹贰叁肆伍陆柒捌玖拾\\d]+[季部幕]");
        patternCompile.getClass();
        java.lang.String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("[一二三四五六七八九十]之章");
        patternCompile2.getClass();
        java.lang.String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        strReplaceAll2.getClass();
        java.util.regex.Pattern patternCompile3 = java.util.regex.Pattern.compile("season\\d+", 66);
        patternCompile3.getClass();
        java.lang.String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("");
        strReplaceAll3.getClass();
        java.lang.String strD = new defpackage.ro3("^(.*[^\\d])\\d{1,2}$").d(strReplaceAll3, new defpackage.wi(8));
        return strD.length() == 0 ? str : strD;
    }
}
