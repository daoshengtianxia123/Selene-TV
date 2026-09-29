package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class l15 implements defpackage.qh0 {
    public final defpackage.xg0 a = new defpackage.xg0();
    public final java.lang.String b = "24679788";
    public final java.util.Map c = defpackage.ij2.K(new defpackage.h33("User-Agent", "Mozilla/5.0"), new defpackage.h33("Referer", "https://v.youku.com"));
    public final java.util.Map d = defpackage.ij2.K(new defpackage.h33("User-Agent", "Mozilla/5.0"), new defpackage.h33("Referer", "https://v.youku.com"), new defpackage.h33("Content-Type", io.netty.handler.codec.http.HttpHeaders.Values.APPLICATION_X_WWW_FORM_URLENCODED));

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    @Override // defpackage.qh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(int r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.a(int, int, java.lang.String):java.util.ArrayList");
    }

    @Override // defpackage.qh0
    public final java.util.ArrayList b(java.lang.String str) {
        str.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject(this.a.e("https://openapi.youku.com/v2/shows/videos.json?client_id=53e6cc67237fc59a&package=com.huawei.hwvplayer.youku&ext=show&show_id=".concat(str), this.c)).optJSONArray("videos");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("duration");
                        strOptString.getClass();
                        java.lang.Double dS = defpackage.bb4.S(strOptString);
                        int iCeil = (int) java.lang.Math.ceil(dS != null ? dS.doubleValue() : 0.0d);
                        java.lang.String strOptString2 = jSONObjectOptJSONObject.optString(io.netty.handler.codec.rtsp.RtspHeaders.Values.SEQ);
                        if (strOptString2.length() == 0) {
                            strOptString2 = jSONObjectOptJSONObject.optString("stage");
                        }
                        strOptString2.getClass();
                        java.lang.Integer numF0 = defpackage.cb4.f0(strOptString2);
                        int iIntValue = numF0 != null ? numF0.intValue() : 0;
                        java.lang.String str2 = jSONObjectOptJSONObject.optString("id") + "|" + iCeil;
                        java.lang.String strOptString3 = jSONObjectOptJSONObject.optString(io.ktor.http.LinkHeader.Parameters.Title);
                        if (strOptString3.length() == 0) {
                            strOptString3 = "第" + jSONObjectOptJSONObject.optString("stage") + "集";
                        }
                        arrayList.add(new org.moontechlab.selenetv.service.danmaku.DanmakuEpisode("youku", iIntValue, str2, strOptString3));
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return arrayList;
    }

    @Override // defpackage.qh0
    public final java.util.ArrayList c(java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        java.lang.String strOptString;
        java.lang.String str2;
        str.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            defpackage.xg0 xg0Var = this.a;
            defpackage.xg0.Companion.getClass();
            org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject(xg0Var.e("https://search.youku.com/api/search?keyword=".concat(defpackage.vg0.a(str)), this.c)).optJSONArray("pageComponentList");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("commonData")) != null && jSONObjectOptJSONObject.optInt("isYouku") == 1) {
                        java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("feature");
                        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("(\\d{4})");
                        patternCompile.getClass();
                        strOptString2.getClass();
                        java.util.regex.Matcher matcher = patternCompile.matcher(strOptString2);
                        matcher.getClass();
                        defpackage.tj2 tj2VarH = defpackage.ht1.h(matcher, 0, strOptString2);
                        java.lang.Integer numF0 = (tj2VarH == null || (str2 = (java.lang.String) ((defpackage.rj2) tj2VarH.a()).get(1)) == null) ? null : defpackage.cb4.f0(str2);
                        java.lang.String strOptString3 = jSONObjectOptJSONObject.optString("realShowId");
                        if (strOptString3.length() == 0) {
                            strOptString3 = jSONObjectOptJSONObject.optString("showId");
                        }
                        java.lang.String str3 = strOptString3;
                        str3.getClass();
                        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("titleDTO");
                        if (jSONObjectOptJSONObject3 == null || (strOptString = jSONObjectOptJSONObject3.optString("displayName")) == null) {
                            strOptString = "";
                        }
                        arrayList.add(new org.moontechlab.selenetv.service.danmaku.DanmakuMedia("youku", str3, strOptString, defpackage.va4.h0(strOptString2, "电影", false) ? "movie" : "tv", numF0, null, 80));
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return arrayList;
    }

    public final org.json.JSONArray d(java.lang.String str, int i, java.lang.String str2, boolean z) {
        java.lang.Object zq3Var;
        java.lang.String strOptString;
        java.lang.Object zq3Var2;
        java.lang.String strOptString2;
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String string = new org.json.JSONObject().put("vid", str).put("mat", i).toString();
        string.getClass();
        defpackage.vg0 vg0Var = defpackage.xg0.Companion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append("&");
        sb.append(strValueOf);
        sb.append("&");
        java.lang.String str3 = this.b;
        sb.append(str3);
        sb.append("&");
        sb.append(string);
        java.lang.String string2 = sb.toString();
        vg0Var.getClass();
        try {
            zq3Var = new org.json.JSONObject(this.a.h(defpackage.ms1.E(defpackage.a44.g("https://acs.youku.com/h5/mopen.youku.danmu.list/1.0/?jsv=2.7.0&appKey=", str3, "&t=", strValueOf, "&sign="), defpackage.vg0.c(string2), "&api=mopen.youku.danmu.list&v=1.0&type=originaljson&dataType=jsonp&timeout=20000"), "data=".concat(defpackage.vg0.a(string)), this.d));
        } catch (java.lang.Throwable th) {
            zq3Var = new defpackage.zq3(th);
        }
        if (zq3Var instanceof defpackage.zq3) {
            zq3Var = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) zq3Var;
        if (jSONObject == null) {
            return new org.json.JSONArray();
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ret");
        if (jSONArrayOptJSONArray == null || (strOptString = jSONArrayOptJSONArray.optString(0)) == null) {
            strOptString = "";
        }
        if (!defpackage.va4.h0(strOptString, "SUCCESS", false)) {
            return (z || !defpackage.va4.h0(strOptString, "TOKEN", false)) ? new org.json.JSONArray() : d(str, i, e(), true);
        }
        try {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("result")) == null) {
                strOptString2 = "{}";
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = new org.json.JSONObject(strOptString2).optJSONObject("data");
            zq3Var2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("result") : null;
        } catch (java.lang.Throwable th2) {
            zq3Var2 = new defpackage.zq3(th2);
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) (zq3Var2 instanceof defpackage.zq3 ? null : zq3Var2);
        return jSONArray == null ? new org.json.JSONArray() : jSONArray;
    }

    public final java.lang.String e() {
        java.lang.String strA = defpackage.ms1.A("https://acs.youku.com/h5/mtop.com.youku.aplatform.weakget/1.0/?jsv=2.5.1&appKey=", this.b);
        java.util.Map map = this.c;
        defpackage.xg0 xg0Var = this.a;
        xg0Var.e(strA, map);
        java.lang.String strD = xg0Var.d();
        return strD.length() > 0 ? (java.lang.String) defpackage.va4.J0(strD, new java.lang.String[]{"_"}, 0, 6).get(0) : "";
    }
}
