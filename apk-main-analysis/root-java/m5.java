package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public class m5 implements defpackage.vg1, defpackage.k44, defpackage.vn1, defpackage.bd3, defpackage.nk2, defpackage.p34, defpackage.nl4, defpackage.z10, defpackage.eb4, defpackage.ne1, defpackage.qb1, defpackage.c04, defpackage.pg0 {
    public final /* synthetic */ int f;
    public final java.lang.Object i;

    public m5(int i) {
        this.f = i;
        switch (i) {
            case 7:
                this.i = new defpackage.ky0(7);
                break;
            case 12:
                this.i = new java.util.HashSet();
                break;
            case 26:
                this.i = new defpackage.fd1(5, 1.0f, false);
                break;
            default:
                this.i = new java.util.concurrent.CopyOnWriteArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String C(defpackage.sc1 r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L35
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L35
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            int r2 = defpackage.gt4.a
            r4 = 24
            if (r2 < r4) goto L27
            defpackage.an3.h()
            java.util.Locale r2 = defpackage.an3.i()
            goto L2b
        L27:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L2b:
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L37
        L35:
            r0 = r3
            goto L58
        L37:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L58
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L58
        L58:
            java.lang.String r8 = r7.D(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r7 = r7.J(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L72
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L71
            r1 = r3
        L71:
            r7 = r1
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.C(sc1):java.lang.String");
    }

    public java.lang.String D(defpackage.sc1 sc1Var) {
        android.content.res.Resources resources = (android.content.res.Resources) this.i;
        int i = sc1Var.f;
        int i2 = sc1Var.f;
        java.lang.String string = (i & 2) != 0 ? resources.getString(dev.jdtech.mpv.R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = J(string, resources.getString(dev.jdtech.mpv.R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = J(string, resources.getString(dev.jdtech.mpv.R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? J(string, resources.getString(dev.jdtech.mpv.R.string.exo_track_role_closed_captions)) : string;
    }

    public defpackage.ed1 E() {
        return null;
    }

    public defpackage.gy0 F() {
        return (defpackage.gy0) this.i;
    }

    public java.util.UUID G() {
        return defpackage.yv.a;
    }

    public int H() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String I(defpackage.sc1 r19) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.I(sc1):java.lang.String");
    }

    public java.lang.String J(java.lang.String... strArr) {
        java.lang.String string = "";
        for (java.lang.String str : strArr) {
            if (str.length() > 0) {
                string = android.text.TextUtils.isEmpty(string) ? str : ((android.content.res.Resources) this.i).getString(dev.jdtech.mpv.R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void K() {
        defpackage.zi1 zi1Var = (defpackage.zi1) this.i;
        int i = zi1Var.I - 1;
        zi1Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (defpackage.uj1 uj1Var : zi1Var.K) {
            uj1Var.t();
            i2 += uj1Var.Z.a;
        }
        defpackage.kl4[] kl4VarArr = new defpackage.kl4[i2];
        int i3 = 0;
        for (defpackage.uj1 uj1Var2 : zi1Var.K) {
            uj1Var2.t();
            int i4 = uj1Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                uj1Var2.t();
                kl4VarArr[i3] = uj1Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        zi1Var.J = new defpackage.ml4(kl4VarArr);
        zi1Var.H.c(zi1Var);
    }

    public defpackage.yo2 M(defpackage.nn3 nn3Var) {
        nn3Var.getClass();
        defpackage.zc1 zc1VarD = nn3Var.d();
        java.lang.Class cls = nn3Var.a;
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        defpackage.nn3 nn3Var2 = declaringClass != null ? new defpackage.nn3(declaringClass) : null;
        if (nn3Var2 != null) {
            defpackage.yo2 yo2VarM = M(nn3Var2);
            defpackage.pn2 pn2VarI0 = yo2VarM != null ? yo2VarM.i0() : null;
            defpackage.u20 u20VarE = pn2VarI0 != null ? pn2VarI0.e(defpackage.lt2.e(cls.getSimpleName()), 19) : null;
            if (u20VarE instanceof defpackage.yo2) {
                return (defpackage.yo2) u20VarE;
            }
        } else {
            defpackage.e72 e72Var = (defpackage.e72) defpackage.y30.x0(defpackage.pp4.L(((defpackage.f72) this.i).c(zc1VarD.e())));
            if (e72Var != null) {
                defpackage.k72 k72Var = e72Var.A.d;
                k72Var.getClass();
                return k72Var.v(defpackage.lt2.e(cls.getSimpleName()), nn3Var);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r6 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r6 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int N(defpackage.sc1 r6) {
        /*
            r5 = this;
            java.lang.String r5 = r6.n
            r0 = 0
            if (r5 == 0) goto L82
            boolean r5 = defpackage.ko2.i(r5)
            if (r5 != 0) goto Ld
            goto L82
        Ld:
            java.lang.String r5 = r6.n
            int r6 = defpackage.gt4.a
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r1) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r1 = "image/png"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r1 = "image/bmp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r1 = "image/webp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r1 = "image/jpeg"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r1 = "image/heif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r1 = "image/heic"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r1 = "image/avif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            switch(r4) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                default: goto L6e;
            }
        L6e:
            goto L7d
        L6f:
            r5 = 26
            if (r6 < r5) goto L7d
            goto L78
        L74:
            r5 = 34
            if (r6 < r5) goto L7d
        L78:
            int r5 = defpackage.nm2.k(r2, r0, r0, r0)
            return r5
        L7d:
            int r5 = defpackage.nm2.k(r3, r0, r0, r0)
            return r5
        L82:
            int r5 = defpackage.nm2.k(r0, r0, r0, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.N(sc1):int");
    }

    public java.lang.Object O(defpackage.yo2 yo2Var, java.lang.Object obj) throws java.io.IOException {
        defpackage.x10 x10VarL0;
        java.lang.String str;
        switch (this.f) {
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                return null;
            default:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) obj;
                defpackage.op0 op0Var = (defpackage.op0) this.i;
                defpackage.tp0 tp0Var = op0Var.a;
                boolean z = yo2Var.X() == 4;
                int i = 2;
                if (!op0Var.o()) {
                    op0Var.v(sb, yo2Var, null);
                    java.util.List listW = yo2Var.W();
                    listW.getClass();
                    op0Var.z(sb, listW);
                    if (!z) {
                        defpackage.zp0 visibility = yo2Var.getVisibility();
                        visibility.getClass();
                        op0Var.d0(visibility, sb);
                    }
                    if ((yo2Var.X() != 2 || yo2Var.n() != 4) && (!defpackage.h5.a(yo2Var.X()) || yo2Var.n() != 1)) {
                        int iN = yo2Var.n();
                        if (iN == 0) {
                            throw null;
                        }
                        op0Var.I(sb, iN, defpackage.op0.s(yo2Var));
                    }
                    op0Var.H(yo2Var, sb);
                    op0Var.K(sb, op0Var.n().contains(defpackage.pp0.INNER) && yo2Var.x(), "inner");
                    op0Var.K(sb, op0Var.n().contains(defpackage.pp0.DATA) && yo2Var.o0(), "data");
                    op0Var.K(sb, op0Var.n().contains(defpackage.pp0.INLINE) && yo2Var.isInline(), "inline");
                    op0Var.K(sb, op0Var.n().contains(defpackage.pp0.VALUE) && yo2Var.q0(), "value");
                    op0Var.K(sb, op0Var.n().contains(defpackage.pp0.FUN) && yo2Var.p0(), "fun");
                    if (yo2Var.n0()) {
                        str = "companion object";
                    } else {
                        int iL = defpackage.ms1.L(yo2Var.X());
                        if (iL == 0) {
                            str = "class";
                        } else if (iL == 1) {
                            str = "interface";
                        } else if (iL == 2) {
                            str = "enum class";
                        } else if (iL == 3) {
                            str = "enum entry";
                        } else if (iL == 4) {
                            str = "annotation class";
                        } else {
                            if (iL != 5) {
                                defpackage.jc2.o();
                                return null;
                            }
                            str = "object";
                        }
                    }
                    sb.append(op0Var.F(str));
                }
                if (defpackage.vp0.l(yo2Var)) {
                    if (((java.lang.Boolean) tp0Var.F.getValue(tp0Var, defpackage.tp0.W[30])).booleanValue()) {
                        if (op0Var.o()) {
                            sb.append("companion object");
                        }
                        defpackage.op0.T(sb);
                        defpackage.hj0 hj0VarE = yo2Var.e();
                        if (hj0VarE != null) {
                            sb.append("of ");
                            defpackage.lt2 name = hj0VarE.getName();
                            name.getClass();
                            sb.append(op0Var.L(name, false));
                        }
                    }
                    if (op0Var.r() || !defpackage.ct1.g(yo2Var.getName(), defpackage.i74.b)) {
                        if (!op0Var.o()) {
                            defpackage.op0.T(sb);
                        }
                        defpackage.lt2 name2 = yo2Var.getName();
                        name2.getClass();
                        sb.append(op0Var.L(name2, true));
                    }
                } else {
                    if (!op0Var.o()) {
                        defpackage.op0.T(sb);
                    }
                    op0Var.M(yo2Var, sb, true);
                }
                if (!z) {
                    java.util.List listC0 = yo2Var.c0();
                    listC0.getClass();
                    op0Var.Z(sb, listC0, false);
                    op0Var.x(yo2Var, sb);
                    if (!defpackage.h5.a(yo2Var.X()) && ((java.lang.Boolean) tp0Var.i.getValue(tp0Var, defpackage.tp0.W[7])).booleanValue() && (x10VarL0 = yo2Var.l0()) != null) {
                        sb.append(" ");
                        op0Var.v(sb, x10VarL0, null);
                        defpackage.zp0 visibility2 = x10VarL0.getVisibility();
                        visibility2.getClass();
                        op0Var.d0(visibility2, sb);
                        sb.append(op0Var.F("constructor"));
                        java.util.List listE = x10VarL0.E();
                        listE.getClass();
                        op0Var.c0(sb, listE, x10VarL0.r());
                    }
                    if (!((java.lang.Boolean) tp0Var.w.getValue(tp0Var, defpackage.tp0.W[21])).booleanValue() && !defpackage.i32.D(yo2Var.P())) {
                        java.util.Collection collectionB = yo2Var.m().b();
                        collectionB.getClass();
                        if (!collectionB.isEmpty() && (collectionB.size() != 1 || !defpackage.i32.w((defpackage.s32) collectionB.iterator().next()))) {
                            defpackage.op0.T(sb);
                            sb.append(": ");
                            defpackage.y30.B0(collectionB, sb, ", ", null, null, new defpackage.np0(op0Var, i), 60);
                        }
                    }
                    op0Var.e0(sb, listC0);
                }
                return defpackage.as4.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P(defpackage.x10 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.P(x10, java.lang.Object):java.lang.Object");
    }

    public java.lang.Object Q(defpackage.oe1 oe1Var, java.lang.Object obj) {
        switch (this.f) {
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                return new defpackage.l02((defpackage.i02) this.i, oe1Var);
            default:
                R(oe1Var, (java.lang.StringBuilder) obj);
                return defpackage.as4.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(defpackage.oe1 r10, java.lang.StringBuilder r11) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.R(oe1, java.lang.StringBuilder):void");
    }

    @Override // defpackage.nk2
    public defpackage.ok2 S(defpackage.hr hrVar) {
        android.content.Context context;
        int i = defpackage.gt4.a;
        if (i < 23 || (i < 31 && ((context = (android.content.Context) this.i) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new defpackage.qi3(15).S(hrVar);
        }
        int iG = defpackage.ko2.g(((defpackage.sc1) hrVar.t).n);
        defpackage.om2.i0("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(defpackage.gt4.A(iG)));
        return new defpackage.sq1(iG).S(hrVar);
    }

    public void T(defpackage.qf3 qf3Var, java.lang.StringBuilder sb, java.lang.String str) {
        defpackage.op0 op0Var = (defpackage.op0) this.i;
        defpackage.tp0 tp0Var = op0Var.a;
        int iOrdinal = ((defpackage.rf3) tp0Var.G.getValue(tp0Var, defpackage.tp0.W[31])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            R(qf3Var, sb);
        } else {
            op0Var.H(qf3Var, sb);
            sb.append(str.concat(" for "));
            defpackage.sf3 sf3VarD0 = qf3Var.d0();
            sf3VarD0.getClass();
            defpackage.op0.l(op0Var, sf3VarD0, sb);
        }
    }

    public java.lang.Object U(defpackage.uf3 uf3Var, java.lang.Object obj) {
        int i = this.f;
        java.lang.Object obj2 = this.i;
        switch (i) {
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                defpackage.i02 i02Var = (defpackage.i02) obj2;
                uf3Var.getClass();
                int i2 = (uf3Var.K != null ? 1 : 0) + (uf3Var.L != null ? 1 : 0);
                if (uf3Var.w) {
                    if (i2 == 0) {
                        return new defpackage.t02(i02Var, uf3Var);
                    }
                    if (i2 == 1) {
                        return new defpackage.x02(i02Var, uf3Var);
                    }
                    if (i2 == 2) {
                        return new defpackage.z02(i02Var, uf3Var);
                    }
                } else {
                    if (i2 == 0) {
                        return new defpackage.p12(i02Var, uf3Var);
                    }
                    if (i2 == 1) {
                        return new defpackage.u12(i02Var, uf3Var);
                    }
                    if (i2 == 2) {
                        return new defpackage.x12(i02Var, uf3Var);
                    }
                }
                defpackage.ek0.o(uf3Var, "Unsupported property: ");
                return null;
            default:
                uf3Var.getClass();
                defpackage.op0.l((defpackage.op0) obj2, uf3Var, (java.lang.StringBuilder) obj);
                return defpackage.as4.a;
        }
    }

    @Override // defpackage.vg1
    public java.lang.Object b(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
    }

    @Override // defpackage.ne1
    public defpackage.oe1 build() {
        return (defpackage.h21) this.i;
    }

    @Override // defpackage.qb1
    public void close() {
        android.content.ContentProviderClient contentProviderClient = (android.content.ContentProviderClient) this.i;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.ne1
    public defpackage.ne1 d(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.pg0
    public java.lang.Iterable e(java.lang.Object obj) {
        defpackage.wx1 wx1Var = (defpackage.wx1) this.i;
        java.util.Collection collectionB = ((defpackage.yo2) obj).m().b();
        collectionB.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            defpackage.u20 u20VarA = ((defpackage.s32) it.next()).f0().a();
            defpackage.u20 u20VarB0 = u20VarA != null ? u20VarA.b0() : null;
            defpackage.yo2 yo2Var = u20VarB0 instanceof defpackage.yo2 ? (defpackage.yo2) u20VarB0 : null;
            defpackage.y62 y62VarA = yo2Var != null ? wx1Var.a(yo2Var) : null;
            if (y62VarA != null) {
                arrayList.add(y62VarA);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 j(defpackage.fi fiVar) {
        fiVar.getClass();
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 k(defpackage.zp0 zp0Var) {
        zp0Var.getClass();
        return this;
    }

    @Override // defpackage.z10
    public defpackage.y10 l0(defpackage.h20 h20Var) {
        defpackage.y10 y10VarL0;
        h20Var.getClass();
        defpackage.x23 x23Var = (defpackage.x23) this.i;
        defpackage.zc1 zc1VarG = h20Var.g();
        zc1VarG.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        x23Var.b(zc1VarG, arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            defpackage.u23 u23Var = (defpackage.u23) it.next();
            if ((u23Var instanceof defpackage.gv) && (y10VarL0 = ((defpackage.gv) u23Var).z.l0(h20Var)) != null) {
                return y10VarL0;
            }
        }
        return null;
    }

    @Override // defpackage.p34
    public void lock() {
        ((java.util.concurrent.locks.ReentrantLock) this.i).lock();
    }

    @Override // defpackage.c04
    public void m(defpackage.d04 d04Var) {
        defpackage.zi1 zi1Var = (defpackage.zi1) this.i;
        zi1Var.H.m(zi1Var);
    }

    @Override // defpackage.qb1
    public android.database.Cursor n(android.net.Uri uri, java.lang.String[] strArr, java.lang.String[] strArr2) {
        android.content.ContentProviderClient contentProviderClient = (android.content.ContentProviderClient) this.i;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.eb4
    public void o(defpackage.tn2 tn2Var, android.graphics.Bitmap bitmap, java.util.Map map) {
        ((defpackage.lc1) this.i).e(tn2Var, bitmap, map, defpackage.ct1.u(bitmap));
    }

    @Override // defpackage.bd3
    public long p(defpackage.sr1 sr1Var, long j, defpackage.k42 k42Var, long j2) {
        return (defpackage.rs.e(sr1Var.b + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (defpackage.rs.e(sr1Var.a + ((int) (((defpackage.nr1) ((defpackage.hd1) this.i).invoke()).a >> 32)), (int) (j2 >> 32), (int) (j >> 32), k42Var == defpackage.k42.f) << 32);
    }

    @Override // defpackage.k44
    public java.lang.Object q(defpackage.nk3 nk3Var) {
        return defpackage.ft4.l0(new defpackage.em(0, ((defpackage.fm) this.i).w), nk3Var);
    }

    @Override // defpackage.ne1
    public defpackage.ne1 s(defpackage.s32 s32Var) {
        s32Var.getClass();
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 u(defpackage.hj0 hj0Var) {
        hj0Var.getClass();
        return this;
    }

    @Override // defpackage.p34
    public void unlock() {
        ((java.util.concurrent.locks.ReentrantLock) this.i).unlock();
    }

    @Override // defpackage.eb4
    public defpackage.un2 v(defpackage.tn2 tn2Var) {
        return null;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 w(defpackage.lt2 lt2Var) {
        lt2Var.getClass();
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 y(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.vg1
    public java.util.Iterator z() {
        return ((java.lang.Iterable) this.i).iterator();
    }

    @Override // defpackage.ne1
    public defpackage.ne1 A() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 g() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 h() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 i() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 l() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 r() {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 t() {
        return this;
    }

    public void B(defpackage.iy0 iy0Var) {
    }

    public void L(defpackage.iy0 iy0Var) {
    }

    @Override // defpackage.ne1
    public defpackage.ne1 a(java.util.List list) {
        return this;
    }

    @Override // defpackage.ne1
    public defpackage.ne1 f(defpackage.r52 r52Var) {
        return this;
    }

    @Override // defpackage.eb4
    public void x(int i) {
    }

    public m5(android.content.res.Resources resources) {
        this.f = 18;
        resources.getClass();
        this.i = resources;
    }

    public m5(defpackage.xm xmVar) {
        this.f = 4;
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = defpackage.gt4.a;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.i = usage.build();
    }

    public /* synthetic */ m5(int i, java.lang.Object obj) {
        this.f = i;
        this.i = obj;
    }

    public m5(android.content.Context context, android.net.Uri uri) {
        this.f = 25;
        this.i = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
