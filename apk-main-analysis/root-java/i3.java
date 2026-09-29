package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class i3 implements defpackage.x5, defpackage.ix4, defpackage.pg0, defpackage.p34, defpackage.g64, defpackage.cf0 {
    public static final defpackage.i3 G;
    public static final defpackage.i3 H;
    public static defpackage.du1 K;
    public final /* synthetic */ int f;
    public static final defpackage.i3 i = new defpackage.i3(0);
    public static final defpackage.i3 t = new defpackage.i3(1);
    public static final defpackage.ei u = new defpackage.ei();
    public static final defpackage.f9 v = new defpackage.f9();
    public static final defpackage.i3 w = new defpackage.i3(7);
    public static final defpackage.i3 x = new defpackage.i3(8);
    public static final defpackage.i3 y = new defpackage.i3(9);
    public static final defpackage.i3 z = new defpackage.i3(10);
    public static final defpackage.i3 A = new defpackage.i3(11);
    public static final defpackage.i3 B = new defpackage.i3(12);
    public static final defpackage.i3 C = new defpackage.i3(13);
    public static final defpackage.i3 D = new defpackage.i3(14);
    public static final defpackage.i3 E = new defpackage.i3(15);
    public static final /* synthetic */ defpackage.i3 F = new defpackage.i3(16);
    public static final /* synthetic */ defpackage.i3 I = new defpackage.i3(18);
    public static final defpackage.i3 J = new defpackage.i3(19);
    public static final defpackage.i3 L = new defpackage.i3(20);
    public static final defpackage.i3 M = new defpackage.i3(21);
    public static final defpackage.i3 N = new defpackage.i3(22);
    public static final defpackage.i3 O = new defpackage.i3(23);
    public static final defpackage.i3 P = new defpackage.i3(24);
    public static final defpackage.i3 Q = new defpackage.i3(26);
    public static final defpackage.i3 R = new defpackage.i3(28);

    static {
        int i2 = 17;
        G = new defpackage.i3(i2);
        H = new defpackage.i3(i2);
    }

    public /* synthetic */ i3(int i2) {
        this.f = i2;
    }

    public static boolean A(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public static boolean B(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public static boolean C(defpackage.xo4 xo4Var, defpackage.ro4 ro4Var, defpackage.s34 s34Var) {
        boolean zD;
        ro4Var.getClass();
        defpackage.t20 t20Var = xo4Var.c;
        defpackage.yo4 yo4VarW = t20Var.W(s34Var);
        int iD = t20Var.d(ro4Var);
        int iT = t20Var.T(yo4VarW);
        if (iD == iT && iD == t20Var.a(s34Var)) {
            for (int i2 = 0; i2 < iT; i2++) {
                defpackage.xp4 xp4VarY0 = t20Var.y0(s34Var, i2);
                if (!t20Var.m0(xp4VarY0)) {
                    defpackage.os4 os4VarR = t20Var.R(xp4VarY0);
                    defpackage.xp4 xp4VarT0 = t20Var.t0(ro4Var, i2);
                    t20Var.J(xp4VarT0);
                    defpackage.os4 os4VarR2 = t20Var.R(xp4VarT0);
                    int iK = t20Var.k(t20Var.e0(yo4VarW, i2));
                    int iJ = t20Var.J(xp4VarY0);
                    if (iK == 0) {
                        throw null;
                    }
                    if (iJ == 0) {
                        throw null;
                    }
                    if (iK == 3) {
                        iK = iJ;
                    } else if (iJ != 3 && iK != iJ) {
                        iK = 0;
                    }
                    if (iK == 0) {
                        return xo4Var.a;
                    }
                    if (iK == 3) {
                        G(t20Var, os4VarR2, os4VarR);
                        G(t20Var, os4VarR, os4VarR2);
                    }
                    int i3 = xo4Var.f;
                    if (i3 > 100) {
                        defpackage.c.m(os4VarR2, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    xo4Var.f = i3 + 1;
                    int iL = defpackage.ms1.L(iK);
                    defpackage.i3 i3Var = i;
                    if (iL == 0) {
                        zD = D(i3Var, xo4Var, os4VarR, os4VarR2);
                    } else if (iL == 1) {
                        zD = D(i3Var, xo4Var, os4VarR2, os4VarR);
                    } else {
                        if (iL != 2) {
                            defpackage.jc2.o();
                            return false;
                        }
                        zD = t(xo4Var, os4VarR2, os4VarR);
                    }
                    xo4Var.f--;
                    if (!zD) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a7 A[EDGE_INSN: B:350:0x02a7->B:168:0x02a7 BREAK  A[LOOP:11: B:159:0x0288->B:351:0x0288]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Type inference failed for: r2v0, types: [t20] */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean D(defpackage.i3 r23, defpackage.xo4 r24, defpackage.w32 r25, defpackage.w32 r26) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.D(i3, xo4, w32, w32):boolean");
    }

    public static boolean E(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public static boolean F(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public static void G(defpackage.t20 t20Var, defpackage.w32 w32Var, defpackage.w32 w32Var2) {
        defpackage.fh fhVarM = t20Var.m(w32Var);
        if (fhVarM instanceof defpackage.uy) {
            defpackage.uy uyVar = (defpackage.uy) fhVarM;
            if (!t20Var.b(uyVar) && t20Var.m0(t20Var.n(t20Var.i(uyVar))) && t20Var.A(uyVar) == 1) {
                t20Var.o0(w32Var2);
            }
        }
    }

    public static android.view.ViewStructure H(android.view.ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    public static defpackage.r64 I(defpackage.xw xwVar) {
        while (xwVar instanceof defpackage.zw) {
            defpackage.zw zwVar = (defpackage.zw) xwVar;
            if (zwVar.g() != 2) {
                break;
            }
            java.util.Collection collectionF = zwVar.f();
            collectionF.getClass();
            xwVar = (defpackage.zw) defpackage.y30.Q0(collectionF);
            if (xwVar == null) {
                return null;
            }
        }
        return xwVar.h();
    }

    public static java.lang.CharSequence J(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static java.lang.String K(defpackage.jz1 jz1Var) {
        jz1Var.getClass();
        if (jz1Var instanceof defpackage.gz1) {
            return "[".concat(K(((defpackage.gz1) jz1Var).i));
        }
        if (jz1Var instanceof defpackage.iz1) {
            defpackage.ny1 ny1Var = ((defpackage.iz1) jz1Var).i;
            return ny1Var != null ? ny1Var.t : "V";
        }
        if (jz1Var instanceof defpackage.hz1) {
            return defpackage.nm2.q(new java.lang.StringBuilder("L"), ((defpackage.hz1) jz1Var).i, ';');
        }
        defpackage.jc2.o();
        return null;
    }

    public static int i(android.view.ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static final boolean l(defpackage.t20 t20Var, defpackage.s34 s34Var) {
        if (t20Var.O(s34Var)) {
            return true;
        }
        if (!(s34Var instanceof defpackage.uy)) {
            return false;
        }
        defpackage.xp4 xp4VarN = t20Var.n(t20Var.i((defpackage.uy) s34Var));
        return !t20Var.m0(xp4VarN) && t20Var.O(t20Var.V(t20Var.R(xp4VarN)));
    }

    public static final boolean m(defpackage.t20 t20Var, defpackage.xo4 xo4Var, defpackage.s34 s34Var, defpackage.s34 s34Var2, boolean z2) {
        java.util.Collection<defpackage.w32> collectionX = t20Var.x(s34Var);
        if ((collectionX instanceof java.util.Collection) && collectionX.isEmpty()) {
            return false;
        }
        for (defpackage.w32 w32Var : collectionX) {
            if (defpackage.ct1.g(t20Var.o0(w32Var), t20Var.W(s34Var2))) {
                return true;
            }
            if (z2 && D(i, xo4Var, s34Var2, w32Var)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.List n(defpackage.xo4 xo4Var, defpackage.s34 s34Var, defpackage.zo4 zo4Var) {
        defpackage.tk4 tk4VarF;
        defpackage.wo4 wo4Var = defpackage.wo4.c;
        defpackage.t20 t20Var = xo4Var.c;
        t20Var.A0(s34Var, zo4Var);
        if (t20Var.o(zo4Var) || !t20Var.l(s34Var)) {
            if (!t20Var.w0(zo4Var)) {
                defpackage.g54 g54Var = new defpackage.g54();
                xo4Var.c();
                java.util.ArrayDeque arrayDeque = xo4Var.g;
                arrayDeque.getClass();
                defpackage.h54 h54Var = xo4Var.h;
                h54Var.getClass();
                arrayDeque.push(s34Var);
                while (!arrayDeque.isEmpty()) {
                    if (h54Var.i > 1000) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many supertypes for type: ");
                        sb.append(s34Var);
                        defpackage.ky0.j(sb, ". Supertypes = ", defpackage.y30.C0(h54Var, null, null, null, null, 63));
                        return null;
                    }
                    defpackage.s34 s34Var2 = (defpackage.s34) arrayDeque.pop();
                    s34Var2.getClass();
                    if (h54Var.add(s34Var2)) {
                        defpackage.q34 q34VarQ = t20Var.Q(s34Var2);
                        if (q34VarQ == null) {
                            q34VarQ = s34Var2;
                        }
                        if (t20Var.g0(t20Var.W(q34VarQ), zo4Var)) {
                            g54Var.add(q34VarQ);
                            tk4VarF = wo4Var;
                        } else {
                            tk4VarF = t20Var.a(q34VarQ) == 0 ? defpackage.wo4.b : t20Var.F(q34VarQ);
                        }
                        defpackage.tk4 tk4Var = tk4VarF.equals(wo4Var) ? null : tk4VarF;
                        if (tk4Var != null) {
                            java.util.Iterator it = t20Var.u(t20Var.W(s34Var2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(tk4Var.q(xo4Var, (defpackage.w32) it.next()));
                            }
                        }
                    }
                }
                xo4Var.a();
                return g54Var;
            }
            if (t20Var.g0(t20Var.W(s34Var), zo4Var)) {
                defpackage.q34 q34VarQ2 = t20Var.Q(s34Var);
                if (q34VarQ2 != null) {
                    s34Var = q34VarQ2;
                }
                return defpackage.pp4.L(s34Var);
            }
        }
        return defpackage.m01.f;
    }

    public static java.util.List o(defpackage.xo4 xo4Var, defpackage.s34 s34Var, defpackage.zo4 zo4Var) {
        int i2;
        java.util.List listN = n(xo4Var, s34Var, zo4Var);
        defpackage.t20 t20Var = xo4Var.c;
        if (listN.size() >= 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listN) {
                defpackage.ro4 ro4VarE = t20Var.e((defpackage.s34) obj);
                int iD = t20Var.d(ro4VarE);
                while (true) {
                    if (i2 >= iD) {
                        arrayList.add(obj);
                        break;
                    }
                    i2 = t20Var.n0(t20Var.R(t20Var.t0(ro4VarE, i2))) == null ? i2 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listN;
    }

    public static defpackage.yo2 p(defpackage.yo2 yo2Var) {
        defpackage.ad1 ad1VarG = defpackage.vp0.g(yo2Var);
        java.lang.String str = defpackage.av1.a;
        defpackage.zc1 zc1Var = (defpackage.zc1) defpackage.av1.k.get(ad1VarG);
        if (zc1Var != null) {
            return defpackage.yp0.e(yo2Var).i(zc1Var);
        }
        defpackage.ek0.i("Given class ", yo2Var, " is not a read-only collection");
        return null;
    }

    public static defpackage.rk q(java.util.List list, defpackage.ap2 ap2Var, defpackage.ie3 ie3Var) {
        java.util.List listA1 = defpackage.y30.a1(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listA1.iterator();
        while (it.hasNext()) {
            defpackage.dc0 dc0VarR = r(it.next(), null);
            if (dc0VarR != null) {
                arrayList.add(dc0VarR);
            }
        }
        return ap2Var != null ? new defpackage.jq4(arrayList, ap2Var.c().p(ie3Var)) : new defpackage.rk(arrayList, new defpackage.v(16, ie3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m01] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static defpackage.dc0 r(java.lang.Object obj, defpackage.bp2 bp2Var) {
        if (obj instanceof java.lang.Byte) {
            return new defpackage.xv(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new defpackage.q24(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new defpackage.zr1(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new defpackage.vh2(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new defpackage.f10((java.lang.Character) obj);
        }
        if (obj instanceof java.lang.Float) {
            return new defpackage.hs(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new defpackage.hs(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new defpackage.hs((java.lang.Boolean) obj);
        }
        if (obj instanceof java.lang.String) {
            return new defpackage.ua4((java.lang.String) obj);
        }
        boolean z2 = obj instanceof byte[];
        ?? L2 = defpackage.m01.f;
        int i2 = 0;
        if (z2) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    L2 = new java.util.ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i2 < length2) {
                        L2.add(java.lang.Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                } else {
                    L2 = defpackage.pp4.L(java.lang.Byte.valueOf(bArr[0]));
                }
            }
            return q(L2, bp2Var, defpackage.ie3.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    L2 = new java.util.ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i2 < length4) {
                        L2.add(java.lang.Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else {
                    L2 = defpackage.pp4.L(java.lang.Short.valueOf(sArr[0]));
                }
            }
            return q(L2, bp2Var, defpackage.ie3.SHORT);
        }
        if (obj instanceof int[]) {
            return q(defpackage.sk.h1((int[]) obj), bp2Var, defpackage.ie3.INT);
        }
        if (obj instanceof long[]) {
            return q(defpackage.sk.i1((long[]) obj), bp2Var, defpackage.ie3.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return q(defpackage.sk.g1((float[]) obj), bp2Var, defpackage.ie3.FLOAT);
            }
            if (obj instanceof double[]) {
                return q(defpackage.sk.f1((double[]) obj), bp2Var, defpackage.ie3.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return q(defpackage.sk.k1((boolean[]) obj), bp2Var, defpackage.ie3.BOOLEAN);
            }
            if (obj == null) {
                return new defpackage.zx2(null);
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length5 = cArr.length;
        if (length5 != 0) {
            if (length5 != 1) {
                L2 = new java.util.ArrayList(cArr.length);
                int length6 = cArr.length;
                while (i2 < length6) {
                    L2.add(java.lang.Character.valueOf(cArr[i2]));
                    i2++;
                }
            } else {
                L2 = defpackage.pp4.L(java.lang.Character.valueOf(cArr[0]));
            }
        }
        return q(L2, bp2Var, defpackage.ie3.CHAR);
    }

    public static defpackage.jz1 s(java.lang.String str) {
        defpackage.ny1 ny1Var;
        char cCharAt = str.charAt(0);
        defpackage.ny1[] ny1VarArrValues = defpackage.ny1.values();
        int length = ny1VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                ny1Var = null;
                break;
            }
            ny1Var = ny1VarArrValues[i2];
            if (ny1Var.t.charAt(0) == cCharAt) {
                break;
            }
            i2++;
        }
        if (ny1Var != null) {
            return new defpackage.iz1(ny1Var);
        }
        if (cCharAt == 'V') {
            return new defpackage.iz1(null);
        }
        if (cCharAt == '[') {
            return new defpackage.gz1(s(str.substring(1)));
        }
        if (cCharAt == 'L') {
            defpackage.va4.m0(str, ';');
        }
        return new defpackage.hz1(str.substring(1, str.length() - 1));
    }

    public static boolean t(defpackage.xo4 xo4Var, defpackage.w32 w32Var, defpackage.w32 w32Var2) {
        w32Var.getClass();
        w32Var2.getClass();
        defpackage.t20 t20Var = xo4Var.c;
        if (w32Var == w32Var2) {
            return true;
        }
        if (z(t20Var, w32Var) && z(t20Var, w32Var2)) {
            defpackage.os4 os4VarD = xo4Var.d(xo4Var.e(w32Var));
            defpackage.os4 os4VarD2 = xo4Var.d(xo4Var.e(w32Var2));
            defpackage.q34 q34VarR = t20Var.r(os4VarD);
            if (!t20Var.g0(t20Var.o0(os4VarD), t20Var.o0(os4VarD2))) {
                return false;
            }
            if (t20Var.a(q34VarR) == 0) {
                return t20Var.p(os4VarD) || t20Var.p(os4VarD2) || t20Var.j0(q34VarR) == t20Var.j0(t20Var.r(os4VarD2));
            }
        }
        defpackage.i3 i3Var = i;
        return D(i3Var, xo4Var, w32Var, w32Var2) && D(i3Var, xo4Var, w32Var2, w32Var);
    }

    public static android.media.AudioAttributes v(defpackage.xm xmVar, boolean z2) {
        return z2 ? new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (android.media.AudioAttributes) xmVar.a().i;
    }

    public static android.view.autofill.AutofillValue w(java.lang.String str) {
        return android.view.autofill.AutofillValue.forText(str);
    }

    public static int x(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_AUDIO_RECONFIG /* 18 */:
                        return 768000;
                    default:
                        defpackage.jc2.s();
                        return 0;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r6.e0(r6.o0(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rp4 y(defpackage.t20 r6, defpackage.w32 r7, defpackage.w32 r8) {
        /*
            int r0 = r6.a(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            xp4 r4 = r6.y0(r7, r2)
            boolean r5 = r6.m0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            os4 r3 = r6.R(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            q34 r4 = r6.r(r3)
            s34 r4 = r6.x0(r4)
            boolean r4 = r6.X(r4)
            if (r4 == 0) goto L3b
            q34 r4 = r6.r(r8)
            s34 r4 = r6.x0(r4)
            boolean r4 = r6.X(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            yo4 r4 = r6.o0(r3)
            yo4 r5 = r6.o0(r8)
            boolean r4 = defpackage.ct1.g(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            rp4 r3 = y(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            yo4 r7 = r6.o0(r7)
            rp4 r6 = r6.e0(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.y(t20, w32, w32):rp4");
    }

    public static boolean z(defpackage.t20 t20Var, defpackage.w32 w32Var) {
        if (!t20Var.v(t20Var.o0(w32Var))) {
            return false;
        }
        t20Var.f(w32Var);
        return (t20Var.D(w32Var) || t20Var.i0(w32Var) || !defpackage.ct1.g(t20Var.W(t20Var.r(w32Var)), t20Var.W(t20Var.V(w32Var)))) ? false : true;
    }

    @Override // defpackage.ix4
    public defpackage.fx4 a(java.lang.Class cls) {
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // defpackage.ix4
    public defpackage.fx4 b(java.lang.Class cls, defpackage.hr2 hr2Var) {
        a(cls);
        throw null;
    }

    @Override // defpackage.x5
    public java.util.Collection c(defpackage.yo2 yo2Var) {
        return defpackage.m01.f;
    }

    @Override // defpackage.x5
    public java.util.Collection d(defpackage.yo2 yo2Var) {
        yo2Var.getClass();
        return defpackage.m01.f;
    }

    @Override // defpackage.pg0
    public java.lang.Iterable e(java.lang.Object obj) {
        switch (this.f) {
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                int i2 = defpackage.yp0.a;
                java.util.Collection collectionF = ((defpackage.vt4) obj).f();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, collectionF));
                java.util.Iterator it = ((java.util.ArrayList) collectionF).iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.vt4) it.next()).b0());
                }
                return arrayList;
            case 26:
                defpackage.y12[] y12VarArr = defpackage.wx1.x;
                return ((defpackage.zw) obj).b0().f();
            default:
                int i3 = defpackage.q72.p;
                java.util.Collection collectionB = ((defpackage.yo2) obj).m().b();
                collectionB.getClass();
                return new defpackage.vk(1, defpackage.e04.P(new defpackage.f40(0, collectionB), defpackage.sp0.O));
        }
    }

    @Override // defpackage.ix4
    public defpackage.fx4 f(defpackage.qz1 qz1Var, defpackage.hr2 hr2Var) {
        qz1Var.getClass();
        return defpackage.pc1.i0(defpackage.ht1.z(qz1Var));
    }

    @Override // defpackage.x5
    public java.util.Collection g(defpackage.yo2 yo2Var) {
        return defpackage.m01.f;
    }

    @Override // defpackage.x5
    public java.util.Collection h(defpackage.lt2 lt2Var, defpackage.yo2 yo2Var) {
        lt2Var.getClass();
        yo2Var.getClass();
        return defpackage.m01.f;
    }

    public boolean j(defpackage.hj0 hj0Var, defpackage.hj0 hj0Var2, boolean z2) {
        if ((hj0Var instanceof defpackage.yo2) && (hj0Var2 instanceof defpackage.yo2)) {
            return defpackage.ct1.g(((defpackage.yo2) hj0Var).m(), ((defpackage.yo2) hj0Var2).m());
        }
        if ((hj0Var instanceof defpackage.rp4) && (hj0Var2 instanceof defpackage.rp4)) {
            return k((defpackage.rp4) hj0Var, (defpackage.rp4) hj0Var2, z2, defpackage.u.G);
        }
        if (!(hj0Var instanceof defpackage.xw) || !(hj0Var2 instanceof defpackage.xw)) {
            return ((hj0Var instanceof defpackage.u23) && (hj0Var2 instanceof defpackage.u23)) ? defpackage.ct1.g(((defpackage.v23) ((defpackage.u23) hj0Var)).v, ((defpackage.v23) ((defpackage.u23) hj0Var2)).v) : defpackage.ct1.g(hj0Var, hj0Var2);
        }
        defpackage.xw xwVar = (defpackage.xw) hj0Var;
        defpackage.xw xwVar2 = (defpackage.xw) hj0Var2;
        int i2 = 1;
        if (!xwVar.equals(xwVar2)) {
            if (defpackage.ct1.g(xwVar.getName(), xwVar2.getName()) && ((!(xwVar instanceof defpackage.gn2) || !(xwVar2 instanceof defpackage.gn2) || ((defpackage.gn2) xwVar).w() == ((defpackage.gn2) xwVar2).w()) && ((!defpackage.ct1.g(xwVar.e(), xwVar2.e()) || (z2 && defpackage.ct1.g(I(xwVar), I(xwVar2)))) && !defpackage.vp0.o(xwVar) && !defpackage.vp0.o(xwVar2)))) {
                defpackage.hj0 hj0VarE = xwVar.e();
                defpackage.hj0 hj0VarE2 = xwVar2.e();
                if (((hj0VarE instanceof defpackage.zw) || (hj0VarE2 instanceof defpackage.zw)) ? false : j(hj0VarE, hj0VarE2, z2)) {
                    defpackage.k23 k23Var = new defpackage.k23(new defpackage.zm(i2, xwVar, xwVar2, z2));
                    if (k23Var.m(xwVar, xwVar2, null, true).c() != 1 || k23Var.m(xwVar2, xwVar, null, true).c() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean k(defpackage.rp4 rp4Var, defpackage.rp4 rp4Var2, boolean z2, defpackage.xd1 xd1Var) {
        rp4Var.getClass();
        rp4Var2.getClass();
        if (rp4Var.equals(rp4Var2)) {
            return true;
        }
        if (defpackage.ct1.g(rp4Var.e(), rp4Var2.e())) {
            return false;
        }
        defpackage.hj0 hj0VarE = rp4Var.e();
        defpackage.hj0 hj0VarE2 = rp4Var2.e();
        return (((hj0VarE instanceof defpackage.zw) || (hj0VarE2 instanceof defpackage.zw)) ? ((java.lang.Boolean) xd1Var.invoke(hj0VarE, hj0VarE2)).booleanValue() : j(hj0VarE, hj0VarE2, z2)) && rp4Var.getIndex() == rp4Var2.getIndex();
    }

    public android.media.AudioTrack u(defpackage.u3 u3Var, defpackage.xm xmVar, int i2) throws java.lang.IllegalArgumentException {
        boolean z2 = u3Var.d;
        int i3 = u3Var.a;
        int i4 = u3Var.c;
        int i5 = u3Var.b;
        int i6 = defpackage.gt4.a;
        if (i6 < 23) {
            return new android.media.AudioTrack(v(xmVar, z2), defpackage.gt4.o(i5, i4, i3), u3Var.f, 1, i2);
        }
        android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(v(xmVar, z2)).setAudioFormat(defpackage.gt4.o(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(u3Var.f).setSessionId(i2);
        if (i6 >= 29) {
            sessionId.setOffloadedPlayback(u3Var.e);
        }
        return sessionId.build();
    }

    @Override // defpackage.p34
    public void lock() {
    }

    @Override // defpackage.p34
    public void unlock() {
    }
}
