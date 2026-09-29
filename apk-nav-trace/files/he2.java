package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public abstract class he2 {
    public static final defpackage.ro3 a;
    public static final defpackage.ro3 b;
    public static final defpackage.ro3 c;
    public static final defpackage.ro3 d;
    public static volatile defpackage.ge2 e;
    public static final java.util.concurrent.ConcurrentHashMap f;

    static {
        java.util.regex.Pattern.compile("(?:x-tvg-url|url-tvg)=\"([^\"]*)\"").getClass();
        a = new defpackage.ro3("tvg-id=\"([^\"]*)\"");
        b = new defpackage.ro3("tvg-name=\"([^\"]*)\"");
        c = new defpackage.ro3("tvg-logo=\"([^\"]*)\"");
        d = new defpackage.ro3("group-title=\"([^\"]*)\"");
        f = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:7:0x002e, B:11:0x003a, B:23:0x0067, B:24:0x0078, B:26:0x007e, B:28:0x0083, B:29:0x0087, B:30:0x0096, B:31:0x0097, B:32:0x009e, B:35:0x00af, B:37:0x00b7, B:40:0x00c2, B:41:0x00d8, B:13:0x003e, B:17:0x0049), top: B:44:0x002e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(org.moontechlab.selenetv.model.LiveSource r7) throws java.io.IOException {
        /*
            java.lang.String r0 = r7.c
            r1 = 0
            r2 = r1
        L4:
            java.net.URL r3 = new java.net.URL
            r3.<init>(r0)
            java.net.URLConnection r3 = r3.openConnection()
            r3.getClass()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r4 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r4)
            r3.setReadTimeout(r4)
            java.lang.String r4 = r7.d
            int r5 = r4.length()
            if (r5 != 0) goto L29
            java.lang.String r4 = "AptvPlayer/1.4.10"
        L29:
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L60
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L3e
            r5 = 308(0x134, float:4.32E-43)
            if (r4 == r5) goto L3e
            switch(r4) {
                case 301: goto L3e;
                case 302: goto L3e;
                case 303: goto L3e;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L60
        L3d:
            goto L63
        L3e:
            java.lang.String r5 = "Location"
            java.lang.String r5 = r3.getHeaderField(r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L63
            r6 = 5
            if (r2 >= r6) goto L63
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L60
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> L60
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L60
            r0.getClass()     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + 1
            r3.disconnect()
            goto L4
        L60:
            r7 = move-exception
            goto Ld9
        L63:
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 != r7) goto Lc2
            java.io.InputStream r7 = r3.getInputStream()     // Catch: java.lang.Throwable -> L60
            r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L60
            r4 = r1
        L78:
            int r5 = r7.read(r2)     // Catch: java.lang.Throwable -> L60
            if (r5 < 0) goto L97
            int r4 = r4 + r5
            r6 = 10485760(0xa00000, float:1.469368E-38)
            if (r4 > r6) goto L87
            r0.write(r2, r1, r5)     // Catch: java.lang.Throwable -> L60
            goto L78
        L87:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "M3U 内容过大（超过 "
            java.lang.String r1 = "MB）"
            r2 = 10
            java.lang.String r0 = defpackage.sr2.g(r2, r0, r1)     // Catch: java.lang.Throwable -> L60
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        L97:
            byte[] r7 = r0.toByteArray()     // Catch: java.lang.Throwable -> L60
            r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            java.nio.charset.Charset r1 = defpackage.g10.a     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            r1 = 65533(0xfffd, float:9.1831E-41)
            boolean r1 = defpackage.va4.i0(r0, r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            if (r1 != 0) goto Laf
            goto Lbe
        Laf:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            java.nio.charset.Charset r1 = defpackage.g10.b     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> Lb7
            goto Lbe
        Lb7:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L60
            java.nio.charset.Charset r1 = defpackage.g10.b     // Catch: java.lang.Throwable -> L60
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L60
        Lbe:
            r3.disconnect()
            return r0
        Lc2:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "请求失败: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L60
            r0.append(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L60
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        Ld9:
            r3.disconnect()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he2.a(org.moontechlab.selenetv.model.LiveSource):java.lang.String");
    }

    public static java.util.ArrayList b(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.zc2 zc2Var = (defpackage.zc2) it.next();
            java.lang.String str = zc2Var.e;
            if (str.length() == 0) {
                str = "未分组";
            }
            java.lang.Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((java.util.List) arrayList).add(zc2Var);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new defpackage.ad2((java.lang.String) entry.getKey(), (java.util.List) entry.getValue()));
        }
        return arrayList2;
    }

    public static java.util.ArrayList c(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listI0 = defpackage.va4.I0(str2, new char[]{'\n'});
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, listI0));
        java.util.Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList2.add(defpackage.va4.X0((java.lang.String) it.next()).toString());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        int i = 0;
        int i2 = 0;
        while (i < arrayList3.size()) {
            java.lang.String str7 = (java.lang.String) arrayList3.get(i);
            if (!defpackage.cb4.d0(str7, "#EXTM3U", false)) {
                if (defpackage.cb4.d0(str7, "#EXTINF:", false)) {
                    defpackage.tj2 tj2VarA = defpackage.ro3.a(a, str7);
                    java.lang.String string = "";
                    java.lang.String str8 = (tj2VarA == null || (str6 = (java.lang.String) ((defpackage.rj2) tj2VarA.a()).get(1)) == null) ? "" : str6;
                    defpackage.tj2 tj2VarA2 = defpackage.ro3.a(b, str7);
                    if (tj2VarA2 == null || (str3 = (java.lang.String) ((defpackage.rj2) tj2VarA2.a()).get(1)) == null) {
                        str3 = "";
                    }
                    defpackage.tj2 tj2VarA3 = defpackage.ro3.a(c, str7);
                    java.lang.String str9 = (tj2VarA3 == null || (str5 = (java.lang.String) ((defpackage.rj2) tj2VarA3.a()).get(1)) == null) ? "" : str5;
                    defpackage.tj2 tj2VarA4 = defpackage.ro3.a(d, str7);
                    if (tj2VarA4 == null || (str4 = (java.lang.String) ((defpackage.rj2) tj2VarA4.a()).get(1)) == null) {
                        str4 = "未分组";
                    }
                    java.lang.String str10 = str4;
                    int iW0 = defpackage.va4.w0(str7, io.netty.util.internal.StringUtil.COMMA, 0, 6);
                    if (iW0 != -1 && iW0 < str7.length() - 1) {
                        string = defpackage.va4.X0(str7.substring(iW0 + 1)).toString();
                    }
                    java.lang.String str11 = string.length() == 0 ? str3 : string;
                    int i3 = i + 1;
                    if (i3 < arrayList3.size() && !defpackage.cb4.d0((java.lang.String) arrayList3.get(i3), "#", false)) {
                        java.lang.String str12 = (java.lang.String) arrayList3.get(i3);
                        if (str11.length() <= 0 || str12.length() <= 0) {
                            i += 2;
                        } else {
                            try {
                                new java.net.URL(str12);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                try {
                                    sb.append(str);
                                    sb.append("-");
                                    sb.append(i2);
                                    arrayList.add(new defpackage.zc2(sb.toString(), str8, str11, str9, str10, str12));
                                    i2++;
                                } catch (java.lang.Exception unused) {
                                }
                            } catch (java.lang.Exception unused2) {
                            }
                            i += 2;
                        }
                    }
                }
            }
            i++;
        }
        return arrayList;
    }
}
