package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class tf2 implements defpackage.zs4, defpackage.g64, defpackage.qb4, defpackage.f73, defpackage.l21, defpackage.t20 {
    public static final defpackage.wk2 N;
    public static final defpackage.tf2 O;
    public static final defpackage.tf2 T;
    public static final defpackage.wk2 U;
    public final /* synthetic */ int f;
    public static final defpackage.tf2 i = new defpackage.tf2(0);
    public static final defpackage.tf2 t = new defpackage.tf2(1);
    public static final defpackage.tf2 u = new defpackage.tf2(2);
    public static final defpackage.tf2 v = new defpackage.tf2(3);
    public static final /* synthetic */ defpackage.tf2 w = new defpackage.tf2(4);
    public static final defpackage.tf2 x = new defpackage.tf2(5);
    public static final defpackage.tf2 y = new defpackage.tf2(6);
    public static final defpackage.tf2 z = new defpackage.tf2(7);
    public static final defpackage.tf2 A = new defpackage.tf2(8);
    public static final /* synthetic */ defpackage.tf2 B = new defpackage.tf2(9);
    public static final defpackage.rv0 C = new defpackage.rv0("PackageViewDescriptorFactory", 3);
    public static final defpackage.tf2 D = new defpackage.tf2(10);
    public static final defpackage.tf2 E = new defpackage.tf2(11);
    public static final defpackage.tf2 F = new defpackage.tf2(12);
    public static final defpackage.tf2 G = new defpackage.tf2(16);
    public static final defpackage.tf2 H = new defpackage.tf2(17);
    public static final defpackage.tf2 I = new defpackage.tf2(18);
    public static final defpackage.tf2 J = new defpackage.tf2(19);
    public static final defpackage.wk2 K = new defpackage.wk2(18);
    public static final defpackage.wk2 L = new defpackage.wk2(19);
    public static final defpackage.wk2 M = new defpackage.wk2(20);
    public static final defpackage.tf2 P = new defpackage.tf2(23);
    public static final defpackage.tf2 Q = new defpackage.tf2(24);
    public static final defpackage.tf2 R = new defpackage.tf2(25);
    public static final defpackage.tf2 S = new defpackage.tf2(26);
    public static final defpackage.wk2 V = new defpackage.wk2(28);
    public static final defpackage.tf2 W = new defpackage.tf2(29);

    static {
        int i2 = 21;
        N = new defpackage.wk2(i2);
        O = new defpackage.tf2(i2);
        int i3 = 27;
        T = new defpackage.tf2(i3);
        U = new defpackage.wk2(i3);
    }

    public /* synthetic */ tf2(int i2) {
        this.f = i2;
    }

    public static java.util.LinkedHashSet H0(java.lang.String str, java.lang.String... strArr) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static java.util.LinkedHashSet I0(java.lang.String str, java.lang.String... strArr) {
        return H0("java/lang/".concat(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static java.util.LinkedHashSet J0(java.lang.String str, java.lang.String... strArr) {
        return H0("java/util/".concat(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static int L0(defpackage.zg3 zg3Var) {
        int i2 = zg3Var == null ? -1 : defpackage.hi3.a[zg3Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            if (i2 == 3) {
                return 4;
            }
            if (i2 == 4) {
                return 2;
            }
        }
        return 1;
    }

    public static void M0(int i2, int i3, boolean z2, defpackage.aj3[][] aj3VarArr) {
        defpackage.aj3[] aj3VarArr2 = aj3VarArr[i2];
        defpackage.aj3 aj3Var = aj3VarArr2[i3];
        if (aj3Var != null) {
            aj3Var.a = z2;
        } else {
            aj3VarArr2[i3] = new defpackage.aj3(z2, i2, i3, aj3VarArr.length, null, 0, 0, null, 112);
        }
    }

    public static void N0(int i2, int i3, defpackage.aj3[][] aj3VarArr) {
        int i4;
        int length = aj3VarArr.length;
        defpackage.zi3 zi3Var = defpackage.zi3.B;
        defpackage.cj3 cj3Var = defpackage.cj3.f;
        defpackage.aj3 aj3Var = new defpackage.aj3(false, i2, i3, length, new defpackage.bj3(cj3Var, zi3Var), 7, 7, null, io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE);
        int i5 = -1;
        while (true) {
            int i6 = -1;
            while (true) {
                int i7 = i5 + i2;
                if (i7 >= 0 && i7 < length && (i4 = i6 + i3) >= 0 && i4 < length) {
                    boolean z2 = (i6 >= 0 && i6 < 7 && (i5 == 0 || i5 == 6)) || (i5 >= 0 && i5 < 7 && (i6 == 0 || i6 == 6)) || (2 <= i5 && i5 < 5 && 2 <= i6 && i6 <= 4);
                    defpackage.zi3 zi3Var2 = defpackage.zi3.A;
                    if (i5 == 0) {
                        if (i6 == 0) {
                            zi3Var2 = defpackage.zi3.f;
                        } else if (i6 == 6) {
                            zi3Var2 = defpackage.zi3.i;
                        } else if (i6 != 7) {
                            zi3Var2 = defpackage.zi3.t;
                        }
                    } else if (i5 == 6) {
                        if (i6 == 0) {
                            zi3Var2 = defpackage.zi3.x;
                        } else if (i6 == 6) {
                            zi3Var2 = defpackage.zi3.y;
                        } else if (i6 != 7) {
                            zi3Var2 = defpackage.zi3.z;
                        }
                    } else if (i5 != 7) {
                        if (i6 == 0) {
                            zi3Var2 = defpackage.zi3.u;
                        } else if (i6 == 6) {
                            zi3Var2 = defpackage.zi3.v;
                        } else if (i6 != 7) {
                            zi3Var2 = defpackage.zi3.w;
                        }
                    }
                    defpackage.aj3 aj3Var2 = aj3Var;
                    aj3Var = aj3Var2;
                    aj3VarArr[i7][i4] = new defpackage.aj3(z2, i7, i4, length, new defpackage.bj3(cj3Var, zi3Var2), 0, 0, aj3Var2, 96);
                }
                if (i6 == 7) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i5 == 7) {
                return;
            } else {
                i5++;
            }
        }
    }

    public static defpackage.xs3 O0(defpackage.pu1 pu1Var) {
        pu1Var.getClass();
        return new defpackage.xs3((defpackage.sn3) pu1Var);
    }

    public static java.lang.String[] l0(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static defpackage.yv4 u0(android.content.Context context, java.lang.String str) {
        context.getClass();
        android.content.SharedPreferences sharedPreferences = defpackage.lj.a;
        android.content.SharedPreferences sharedPreferences2 = defpackage.lj.a;
        if (sharedPreferences2 == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        java.lang.String string = sharedPreferences2.getString("decode_mode", "hardware");
        java.lang.String str2 = string != null ? string : "hardware";
        defpackage.bj.t.getClass();
        defpackage.bj bjVarJ = defpackage.tp4.j(str2);
        android.content.SharedPreferences sharedPreferences3 = defpackage.lj.a;
        if (sharedPreferences3 == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        java.lang.String string2 = sharedPreferences3.getString("player_type", "exoplayer");
        java.lang.String str3 = string2 != null ? string2 : "exoplayer";
        defpackage.fj.t.getClass();
        defpackage.fj fjVarK = defpackage.tp4.k(str3);
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (fjVarK == defpackage.fj.v && i2 < 26) {
            fjVarK = defpackage.fj.u;
        }
        int iOrdinal = fjVarK.ordinal();
        if (iOrdinal == 0) {
            return z0(bjVarJ, context, str);
        }
        if (iOrdinal != 1) {
            defpackage.jc2.o();
            return null;
        }
        try {
            return new defpackage.uq2(bjVarJ, context, str);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("PlayerFactory", "MPV 初始化失败，回退 ExoPlayer", th);
            return z0(bjVarJ, context, str);
        }
    }

    public static final defpackage.x93 z0(defpackage.bj bjVar, android.content.Context context, java.lang.String str) {
        defpackage.wi0 wi0Var;
        if (str != null) {
            defpackage.ez2 ez2Var = new defpackage.ez2(defpackage.sl2.a());
            if (defpackage.va4.t0(str)) {
                str = "AptvPlayer/1.4.10";
            }
            ez2Var.c = str;
            wi0Var = ez2Var;
        } else {
            wi0Var = (defpackage.wi0) defpackage.sl2.b.getValue();
        }
        return new defpackage.x93(context, wi0Var, bjVar);
    }

    @Override // defpackage.t20
    public int A(defpackage.uy uyVar) {
        return defpackage.om2.A(uyVar);
    }

    @Override // defpackage.zs4
    public void B(java.lang.String str) {
        str.getClass();
        java.util.List listD = defpackage.uf2.d();
        listD.getClass();
        java.lang.String string = defpackage.va4.X0(str).toString();
        if (string.length() != 0) {
            java.util.List listL = defpackage.pp4.L(string);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listD) {
                if (!defpackage.ct1.g((java.lang.String) obj, string)) {
                    arrayList.add(obj);
                }
            }
            listD = defpackage.y30.U0(20, defpackage.y30.L0(listL, arrayList));
        }
        android.content.SharedPreferences sharedPreferences = defpackage.uf2.a;
        if (sharedPreferences == null) {
            defpackage.ct1.R("prefs");
            throw null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        defpackage.vw1 vw1Var = defpackage.uf2.b;
        vw1Var.getClass();
        editorEdit.putString("search_history", vw1Var.c(new defpackage.fk(defpackage.ta4.a), listD)).apply();
    }

    @Override // defpackage.t20
    public defpackage.os4 B0(defpackage.s34 s34Var, defpackage.s34 s34Var2) {
        return defpackage.om2.F(this, s34Var, s34Var2);
    }

    @Override // defpackage.t20
    public defpackage.q34 C(defpackage.ho0 ho0Var) {
        return ho0Var.i;
    }

    @Override // defpackage.t20
    public defpackage.w32 C0(defpackage.w32 w32Var) {
        return defpackage.om2.k1(this, w32Var);
    }

    @Override // defpackage.t20
    public boolean D(defpackage.w32 w32Var) {
        w32Var.getClass();
        defpackage.q34 q34VarW = defpackage.om2.w(w32Var);
        return (q34VarW != null ? defpackage.om2.u(q34VarW) : null) != null;
    }

    @Override // defpackage.t20
    public defpackage.ho0 D0(defpackage.s34 s34Var) {
        return defpackage.om2.u(s34Var);
    }

    @Override // defpackage.t20
    public void E(defpackage.s34 s34Var) {
        defpackage.om2.z0(s34Var);
    }

    public defpackage.n91 E0(defpackage.sc1 sc1Var) {
        int i2;
        int i3;
        java.lang.String str = sc1Var.n;
        if (str != null) {
            i2 = 1;
            i3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new defpackage.nj(i3);
                case "application/x-icy":
                    return new defpackage.kn1();
                case "application/id3":
                    return new defpackage.pn1(null);
                case "application/x-emsg":
                    return new defpackage.nj(i2);
                case "application/x-scte35":
                    return new defpackage.z74();
            }
        }
        defpackage.c.n(defpackage.ms1.A("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.t20
    public defpackage.s20 F(defpackage.s34 s34Var) {
        return defpackage.om2.Z0(this, s34Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Type inference failed for: r0v2, types: [zq3] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List F0() throws defpackage.si, java.io.IOException {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf2.F0():java.util.List");
    }

    @Override // defpackage.zs4
    public void G(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        java.lang.String str3 = str + "+" + str2;
        java.util.List listB = defpackage.uf2.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listB) {
            org.moontechlab.selenetv.model.FavoriteItem favoriteItem = (org.moontechlab.selenetv.model.FavoriteItem) obj;
            if (!(favoriteItem.b + "+" + favoriteItem.a).equals(str3)) {
                arrayList.add(obj);
            }
        }
        defpackage.uf2.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zq3] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    public java.util.List G0() throws defpackage.si, java.io.IOException {
        defpackage.m01 zq3Var;
        switch (this.f) {
            case 0:
                android.content.SharedPreferences sharedPreferences = defpackage.uf2.a;
                android.content.SharedPreferences sharedPreferences2 = defpackage.uf2.a;
                if (sharedPreferences2 == null) {
                    defpackage.ct1.R("prefs");
                    throw null;
                }
                java.lang.String string = sharedPreferences2.getString("search_sources", null);
                defpackage.m01 m01Var = defpackage.m01.f;
                if (string == null) {
                    return m01Var;
                }
                try {
                    defpackage.vw1 vw1Var = defpackage.uf2.b;
                    vw1Var.getClass();
                    zq3Var = (java.util.List) vw1Var.b(string, new defpackage.fk(org.moontechlab.selenetv.model.SearchResource.INSTANCE.serializer()));
                } catch (java.lang.Throwable th) {
                    zq3Var = new defpackage.zq3(th);
                }
                java.lang.Throwable thA = defpackage.ar3.a(zq3Var);
                if (thA == null) {
                    m01Var = zq3Var;
                } else {
                    android.util.Log.w("LocalStore", "搜索源 解析失败: " + thA.getMessage());
                }
                return m01Var;
            default:
                java.net.HttpURLConnection httpURLConnectionC = defpackage.xi.c(defpackage.xi.a, defpackage.xi.b("/api/search/resources"), "GET");
                int responseCode = httpURLConnectionC.getResponseCode();
                if (responseCode == 401) {
                    throw new defpackage.si("登录状态失效，请重新登录");
                }
                if (responseCode >= 200) {
                    try {
                        if (responseCode < 300) {
                            try {
                                java.io.InputStream inputStream = httpURLConnectionC.getInputStream();
                                inputStream.getClass();
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, defpackage.g10.a), 8192);
                                try {
                                    java.lang.String strH = defpackage.ht1.H(bufferedReader);
                                    bufferedReader.close();
                                    defpackage.vw1 vw1Var2 = defpackage.xi.b;
                                    vw1Var2.getClass();
                                    return (java.util.List) vw1Var2.b(strH, new defpackage.fk(org.moontechlab.selenetv.model.SearchResource.INSTANCE.serializer()));
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (java.lang.Throwable th3) {
                                        defpackage.u22.p(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            } catch (java.lang.Exception e) {
                                throw new defpackage.si("响应数据解析失败: " + e.getMessage());
                            }
                        }
                    } finally {
                        httpURLConnectionC.disconnect();
                    }
                }
                throw new defpackage.si(defpackage.sr2.g(responseCode, "网络请求失败 (", ")"));
        }
    }

    @Override // defpackage.qb4
    public boolean H(java.lang.Object obj, java.lang.Object obj2) {
        return false;
    }

    @Override // defpackage.t20
    public defpackage.q34 I(defpackage.s34 s34Var, boolean z2) {
        return defpackage.om2.l1(s34Var, z2);
    }

    @Override // defpackage.t20
    public int J(defpackage.xp4 xp4Var) {
        return defpackage.om2.e0(xp4Var);
    }

    @Override // defpackage.zs4
    public java.util.List K() {
        return defpackage.uf2.d();
    }

    public defpackage.w32 K0(defpackage.w32 w32Var) {
        defpackage.q34 q34VarL1;
        w32Var.getClass();
        defpackage.q34 q34VarW = defpackage.om2.w(w32Var);
        return (q34VarW == null || (q34VarL1 = defpackage.om2.l1(q34VarW, true)) == null) ? w32Var : q34VarL1;
    }

    @Override // defpackage.l21
    public void L(defpackage.zw zwVar) {
        zwVar.getClass();
        throw new java.lang.IllegalStateException("Cannot infer visibility for " + zwVar);
    }

    @Override // defpackage.zs4
    public java.util.Map M() {
        return defpackage.uf2.c();
    }

    @Override // defpackage.zs4
    public void N(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        str.getClass();
        str2.getClass();
        java.lang.Object obj = map.get(io.ktor.http.LinkHeader.Parameters.Title);
        java.lang.String str6 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.Object obj2 = map.get("source_name");
        java.lang.String str8 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str9 = str8 == null ? "" : str8;
        java.lang.Object obj3 = map.get("year");
        java.lang.String str10 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str11 = str10 == null ? "" : str10;
        java.lang.Object obj4 = map.get("cover");
        java.lang.String str12 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str13 = str12 == null ? "" : str12;
        java.lang.Object obj5 = map.get("total_episodes");
        java.lang.Number number = obj5 instanceof java.lang.Number ? (java.lang.Number) obj5 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        java.lang.Object obj6 = map.get("save_time");
        java.lang.Number number2 = obj6 instanceof java.lang.Number ? (java.lang.Number) obj6 : null;
        long jLongValue = number2 != null ? number2.longValue() : 0L;
        java.lang.Object obj7 = map.get("origin");
        java.lang.String str14 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        if (str14 == null) {
            str3 = "";
            str5 = str;
            str4 = str2;
        } else {
            str3 = str14;
            str4 = str2;
            str5 = str;
        }
        org.moontechlab.selenetv.model.FavoriteItem favoriteItem = new org.moontechlab.selenetv.model.FavoriteItem(str4, str5, str7, str9, str11, str13, iIntValue, jLongValue, str3);
        java.util.List listB = defpackage.uf2.b();
        java.lang.String strB = defpackage.ms1.B(str5, "+", str4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj8 : listB) {
            org.moontechlab.selenetv.model.FavoriteItem favoriteItem2 = (org.moontechlab.selenetv.model.FavoriteItem) obj8;
            if (!(favoriteItem2.b + "+" + favoriteItem2.a).equals(strB)) {
                arrayList.add(obj8);
            }
        }
        defpackage.uf2.f(defpackage.y30.L0(defpackage.pp4.L(favoriteItem), arrayList));
    }

    @Override // defpackage.t20
    public boolean O(defpackage.s34 s34Var) {
        s34Var.getClass();
        return defpackage.om2.r0(defpackage.om2.e1(s34Var));
    }

    @Override // defpackage.t20
    public defpackage.os4 P(defpackage.w32 w32Var) {
        return defpackage.om2.E0(w32Var);
    }

    public boolean P0(defpackage.sc1 sc1Var) {
        java.lang.String str = sc1Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.t20
    public defpackage.q34 Q(defpackage.s34 s34Var) {
        return defpackage.om2.z(s34Var);
    }

    @Override // defpackage.t20
    public defpackage.os4 R(defpackage.xp4 xp4Var) {
        return defpackage.om2.c0(xp4Var);
    }

    @Override // defpackage.zs4
    public void S(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        defpackage.uf2.g(defpackage.ij2.L(str + "+" + str2, defpackage.uf2.c()));
    }

    @Override // defpackage.t20
    public int T(defpackage.zo4 zo4Var) {
        return defpackage.om2.H0(zo4Var);
    }

    @Override // defpackage.t20
    public boolean U(defpackage.rp4 rp4Var, defpackage.zo4 zo4Var) {
        return defpackage.om2.h0(rp4Var, zo4Var);
    }

    @Override // defpackage.t20
    public defpackage.q34 V(defpackage.w32 w32Var) {
        defpackage.q34 q34VarH1;
        w32Var.getClass();
        defpackage.b81 b81VarV = defpackage.om2.v(w32Var);
        if (b81VarV != null && (q34VarH1 = defpackage.om2.h1(b81VarV)) != null) {
            return q34VarH1;
        }
        defpackage.q34 q34VarW = defpackage.om2.w(w32Var);
        q34VarW.getClass();
        return q34VarW;
    }

    @Override // defpackage.t20
    public defpackage.yo4 W(defpackage.s34 s34Var) {
        return defpackage.om2.e1(s34Var);
    }

    @Override // defpackage.t20
    public boolean X(defpackage.s34 s34Var) {
        s34Var.getClass();
        defpackage.q34 q34VarW = defpackage.om2.w(s34Var);
        return (q34VarW != null ? defpackage.om2.t(this, q34VarW) : null) != null;
    }

    @Override // defpackage.t20
    public defpackage.uy Y(defpackage.s34 s34Var) {
        return defpackage.om2.t(this, s34Var);
    }

    @Override // defpackage.t20
    public boolean Z(defpackage.s34 s34Var) {
        s34Var.getClass();
        return defpackage.om2.u0(o0(s34Var)) && !defpackage.om2.v0(s34Var);
    }

    @Override // defpackage.t20
    public int a(defpackage.w32 w32Var) {
        return defpackage.om2.r(w32Var);
    }

    @Override // defpackage.t20
    public defpackage.os4 a0(java.util.ArrayList arrayList) {
        defpackage.q34 q34Var;
        int size = arrayList.size();
        if (size == 0) {
            defpackage.c.r("Expected some types");
            return null;
        }
        if (size == 1) {
            return (defpackage.os4) defpackage.y30.P0(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, arrayList));
        java.util.Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            defpackage.os4 os4Var = (defpackage.os4) it.next();
            z2 = z2 || defpackage.cb1.a0(os4Var);
            if (os4Var instanceof defpackage.q34) {
                q34Var = (defpackage.q34) os4Var;
            } else {
                if (!(os4Var instanceof defpackage.b81)) {
                    defpackage.jc2.o();
                    return null;
                }
                q34Var = ((defpackage.b81) os4Var).i;
                z3 = true;
            }
            arrayList2.add(q34Var);
        }
        if (z2) {
            return defpackage.r21.c(defpackage.q21.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        defpackage.op4 op4Var = defpackage.op4.a;
        if (!z3) {
            return op4Var.b(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.z30.g0(10, arrayList));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(defpackage.wq4.c0((defpackage.os4) it2.next()));
        }
        return defpackage.da1.y(op4Var.b(arrayList2), op4Var.b(arrayList3));
    }

    @Override // defpackage.t20
    public boolean b(defpackage.uy uyVar) {
        return uyVar instanceof defpackage.py;
    }

    @Override // defpackage.zs4
    public void b0(org.moontechlab.selenetv.model.PlayRecord playRecord) {
        java.util.Map mapC = defpackage.uf2.c();
        mapC.getClass();
        java.lang.String strB = defpackage.ms1.B(playRecord.b, "+", playRecord.a);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(mapC);
        linkedHashMap.put(strB, playRecord);
        defpackage.uf2.g(linkedHashMap);
    }

    @Override // defpackage.qb4
    public void c(defpackage.pb4 pb4Var) {
        pb4Var.clear();
    }

    @Override // defpackage.t20
    public defpackage.yp4 c0(defpackage.w32 w32Var) {
        return defpackage.om2.x(w32Var);
    }

    @Override // defpackage.t20
    public int d(defpackage.ro4 ro4Var) {
        ro4Var.getClass();
        if (ro4Var instanceof defpackage.s34) {
            return defpackage.om2.r((defpackage.w32) ro4Var);
        }
        if (ro4Var instanceof defpackage.wj) {
            return ((defpackage.wj) ro4Var).size();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown type argument list type: ");
        sb.append(ro4Var);
        defpackage.ky0.j(sb, ", ", defpackage.lo3.a.b(ro4Var.getClass()));
        return 0;
    }

    public void d0(android.graphics.drawable.Drawable drawable, defpackage.k80 k80Var, int i2) {
        k80Var.d0(257732500);
        int i3 = (k80Var.h(drawable) ? 4 : 2) | i2;
        if (k80Var.S(i3 & 1, (i3 & 3) != 2)) {
            defpackage.to2 to2VarI = androidx.compose.foundation.layout.d.i(defpackage.qo2.f, defpackage.nd0.e);
            boolean zH = k80Var.h(drawable);
            java.lang.Object objP = k80Var.P();
            if (zH || objP == defpackage.z70.a) {
                objP = new defpackage.k0(29, drawable);
                k80Var.l0(objP);
            }
            defpackage.ys.a(androidx.compose.ui.draw.a.a(to2VarI, (defpackage.jd1) objP), k80Var, 0);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.kt(i2, 14, this, drawable);
        }
    }

    @Override // defpackage.t20
    public defpackage.ro4 e(defpackage.s34 s34Var) {
        return defpackage.om2.s(s34Var);
    }

    @Override // defpackage.t20
    public defpackage.rp4 e0(defpackage.zo4 zo4Var, int i2) {
        return defpackage.om2.a0(zo4Var, i2);
    }

    @Override // defpackage.t20
    public void f(defpackage.w32 w32Var) {
        w32Var.getClass();
        defpackage.om2.v(w32Var);
    }

    public void f0(final android.graphics.drawable.Icon icon, defpackage.k80 k80Var, final int i2) {
        defpackage.ll3 ll3VarT;
        defpackage.xd1 xd1Var;
        k80Var.d0(2116504409);
        int i3 = (k80Var.h(icon) ? 4 : 2) | i2;
        final int i4 = 0;
        final int i5 = 1;
        if (k80Var.S(i3 & 1, (i3 & 19) != 18)) {
            android.content.Context context = (android.content.Context) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            boolean zF = k80Var.f(icon) | k80Var.f(context);
            java.lang.Object objP = k80Var.P();
            if (zF || objP == defpackage.z70.a) {
                objP = icon.loadDrawable(context);
                k80Var.l0(objP);
            }
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) objP;
            if (drawable == null) {
                ll3VarT = k80Var.t();
                if (ll3VarT != null) {
                    xd1Var = new defpackage.xd1(this, icon, i2, i5) { // from class: cg4
                        public final /* synthetic */ int f;
                        public final /* synthetic */ defpackage.tf2 i;
                        public final /* synthetic */ android.graphics.drawable.Icon t;

                        {
                            this.f = i5;
                            this.i = this;
                        }

                        @Override // defpackage.xd1
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            int i6 = this.f;
                            defpackage.as4 as4Var = defpackage.as4.a;
                            android.graphics.drawable.Icon icon2 = this.t;
                            defpackage.tf2 tf2Var = this.i;
                            defpackage.k80 k80Var2 = (defpackage.k80) obj;
                            ((java.lang.Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    tf2Var.f0(icon2, k80Var2, defpackage.st1.G(49));
                                    break;
                                default:
                                    tf2Var.f0(icon2, k80Var2, defpackage.st1.G(49));
                                    break;
                            }
                            return as4Var;
                        }
                    };
                    ll3VarT.d = xd1Var;
                }
                return;
            }
            d0(drawable, k80Var, 48);
        } else {
            k80Var.V();
        }
        ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            xd1Var = new defpackage.xd1(this, icon, i2, i4) { // from class: cg4
                public final /* synthetic */ int f;
                public final /* synthetic */ defpackage.tf2 i;
                public final /* synthetic */ android.graphics.drawable.Icon t;

                {
                    this.f = i4;
                    this.i = this;
                }

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    int i6 = this.f;
                    defpackage.as4 as4Var = defpackage.as4.a;
                    android.graphics.drawable.Icon icon2 = this.t;
                    defpackage.tf2 tf2Var = this.i;
                    defpackage.k80 k80Var2 = (defpackage.k80) obj;
                    ((java.lang.Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            tf2Var.f0(icon2, k80Var2, defpackage.st1.G(49));
                            break;
                        default:
                            tf2Var.f0(icon2, k80Var2, defpackage.st1.G(49));
                            break;
                    }
                    return as4Var;
                }
            };
            ll3VarT.d = xd1Var;
        }
    }

    @Override // defpackage.t20
    public boolean g(defpackage.zo4 zo4Var) {
        return defpackage.om2.s0(zo4Var);
    }

    @Override // defpackage.t20
    public boolean g0(defpackage.zo4 zo4Var, defpackage.zo4 zo4Var2) {
        return defpackage.om2.q(zo4Var, zo4Var2);
    }

    @Override // defpackage.t20
    public void h(defpackage.s34 s34Var) {
        defpackage.om2.A0(s34Var);
    }

    @Override // defpackage.t20
    public boolean h0(defpackage.s34 s34Var, defpackage.s34 s34Var2) {
        return defpackage.om2.j0(s34Var, s34Var2);
    }

    @Override // defpackage.t20
    public defpackage.lw2 i(defpackage.uy uyVar) {
        return defpackage.om2.d1(uyVar);
    }

    @Override // defpackage.t20
    public boolean i0(defpackage.w32 w32Var) {
        w32Var.getClass();
        return w32Var instanceof defpackage.sx2;
    }

    @Override // defpackage.l21
    public void j(defpackage.yo2 yo2Var, java.util.ArrayList arrayList) {
        throw new java.lang.IllegalStateException("Incomplete hierarchy for class " + yo2Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.t20
    public boolean j0(defpackage.s34 s34Var) {
        return defpackage.om2.t0(s34Var);
    }

    @Override // defpackage.t20
    public int k(defpackage.rp4 rp4Var) {
        rp4Var.getClass();
        int iY = rp4Var.y();
        if (iY != 0) {
            return defpackage.uo4.e(iY);
        }
        throw null;
    }

    @Override // defpackage.t20
    public defpackage.xp4 k0(defpackage.s34 s34Var, int i2) {
        s34Var.getClass();
        if (i2 < 0 || i2 >= defpackage.om2.r(s34Var)) {
            return null;
        }
        return defpackage.om2.X(s34Var, i2);
    }

    @Override // defpackage.t20
    public boolean l(defpackage.s34 s34Var) {
        s34Var.getClass();
        return defpackage.om2.m0(defpackage.om2.e1(s34Var));
    }

    @Override // defpackage.t20
    public defpackage.q34 m(defpackage.w32 w32Var) {
        return defpackage.om2.w(w32Var);
    }

    @Override // defpackage.t20
    public boolean m0(defpackage.xp4 xp4Var) {
        return defpackage.om2.y0(xp4Var);
    }

    @Override // defpackage.t20
    public defpackage.xp4 n(defpackage.ry ryVar) {
        return defpackage.om2.M0(ryVar);
    }

    @Override // defpackage.t20
    public defpackage.b81 n0(defpackage.w32 w32Var) {
        return defpackage.om2.v(w32Var);
    }

    @Override // defpackage.t20
    public boolean o(defpackage.zo4 zo4Var) {
        return defpackage.om2.m0(zo4Var);
    }

    @Override // defpackage.t20
    public defpackage.yo4 o0(defpackage.w32 w32Var) {
        w32Var.getClass();
        defpackage.q34 q34VarW = defpackage.om2.w(w32Var);
        if (q34VarW == null) {
            q34VarW = r(w32Var);
        }
        return defpackage.om2.e1(q34VarW);
    }

    @Override // defpackage.t20
    public boolean p(defpackage.os4 os4Var) {
        os4Var.getClass();
        return defpackage.om2.t0(r(os4Var)) != defpackage.om2.t0(V(os4Var));
    }

    @Override // defpackage.t20
    public boolean p0(defpackage.zo4 zo4Var) {
        return defpackage.om2.r0(zo4Var);
    }

    @Override // defpackage.t20
    public defpackage.q34 q(defpackage.b81 b81Var) {
        return defpackage.om2.h1(b81Var);
    }

    @Override // defpackage.t20
    public boolean q0(defpackage.zo4 zo4Var) {
        return defpackage.om2.k0(zo4Var);
    }

    @Override // defpackage.t20
    public defpackage.q34 r(defpackage.w32 w32Var) {
        defpackage.q34 q34VarC0;
        w32Var.getClass();
        defpackage.b81 b81VarV = defpackage.om2.v(w32Var);
        if (b81VarV != null && (q34VarC0 = defpackage.om2.C0(b81VarV)) != null) {
            return q34VarC0;
        }
        defpackage.q34 q34VarW = defpackage.om2.w(w32Var);
        q34VarW.getClass();
        return q34VarW;
    }

    @Override // defpackage.t20
    public boolean r0(defpackage.uy uyVar) {
        return defpackage.om2.x0(uyVar);
    }

    @Override // defpackage.t20
    public defpackage.os4 s(defpackage.uy uyVar) {
        return defpackage.om2.D0(uyVar);
    }

    @Override // defpackage.t20
    public boolean s0(defpackage.zo4 zo4Var) {
        return defpackage.om2.u0(zo4Var);
    }

    @Override // defpackage.zs4
    public java.util.List t() {
        return defpackage.uf2.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t20
    public defpackage.xp4 t0(defpackage.ro4 ro4Var, int i2) {
        ro4Var.getClass();
        if (ro4Var instanceof defpackage.s34) {
            return defpackage.om2.X((defpackage.w32) ro4Var, i2);
        }
        if (ro4Var instanceof defpackage.wj) {
            E e = ((defpackage.wj) ro4Var).get(i2);
            e.getClass();
            return (defpackage.xp4) e;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown type argument list type: ");
        sb.append(ro4Var);
        defpackage.ky0.j(sb, ", ", defpackage.lo3.a.b(ro4Var.getClass()));
        return null;
    }

    @Override // defpackage.t20
    public java.util.Collection u(defpackage.zo4 zo4Var) {
        return defpackage.om2.a1(zo4Var);
    }

    @Override // defpackage.t20
    public boolean v(defpackage.zo4 zo4Var) {
        return defpackage.om2.o0(zo4Var);
    }

    @Override // defpackage.t20
    public defpackage.q34 w(defpackage.b81 b81Var) {
        return defpackage.om2.C0(b81Var);
    }

    @Override // defpackage.t20
    public boolean w0(defpackage.zo4 zo4Var) {
        return defpackage.om2.n0(zo4Var);
    }

    @Override // defpackage.t20
    public java.util.Collection x(defpackage.s34 s34Var) {
        return defpackage.om2.L0(this, s34Var);
    }

    @Override // defpackage.t20
    public defpackage.s34 x0(defpackage.s34 s34Var) {
        defpackage.q34 q34Var;
        s34Var.getClass();
        defpackage.ho0 ho0VarU = defpackage.om2.u(s34Var);
        return (ho0VarU == null || (q34Var = ho0VarU.i) == null) ? s34Var : q34Var;
    }

    @Override // defpackage.t20
    public boolean y(defpackage.s34 s34Var) {
        return defpackage.om2.p0(s34Var);
    }

    @Override // defpackage.t20
    public defpackage.xp4 y0(defpackage.w32 w32Var, int i2) {
        return defpackage.om2.X(w32Var, i2);
    }

    @Override // defpackage.f73
    public boolean z(defpackage.yo2 yo2Var, defpackage.zq0 zq0Var) {
        int i2 = this.f;
        yo2Var.getClass();
        switch (i2) {
            case 10:
                return true;
            default:
                return !zq0Var.getAnnotations().e(defpackage.g73.a);
        }
    }

    @Override // defpackage.t20
    public void A0(defpackage.s34 s34Var, defpackage.zo4 zo4Var) {
    }
}
