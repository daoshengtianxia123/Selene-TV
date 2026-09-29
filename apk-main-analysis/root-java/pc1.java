package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public abstract class pc1 {
    public static defpackage.ja a = null;
    public static defpackage.a7 b = null;
    public static defpackage.ly c = null;
    public static boolean d = false;
    public static java.lang.reflect.Method e;

    public static final boolean A(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0141, code lost:
    
        return !defpackage.i32.y(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0(defpackage.yo2 r12, defpackage.zw r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.A0(yo2, zw):boolean");
    }

    public static final boolean B(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static int B0(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final boolean C(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static final boolean C0(defpackage.cc3 cc3Var) {
        java.util.List list = cc3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.ic3) list.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final void D(defpackage.ls2 ls2Var, boolean z) {
        ls2Var.setValue(java.lang.Boolean.valueOf(z));
    }

    public static java.lang.String D0(java.lang.String str, java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            java.lang.Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (java.lang.Exception e2) {
                    java.lang.String str2 = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for ".concat(str2), (java.lang.Throwable) e2);
                    java.lang.StringBuilder sbM = defpackage.sr2.m("<", str2, " threw ");
                    sbM.append(e2.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i2] = string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((java.lang.CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final boolean E(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static final defpackage.g54 E0(java.util.ArrayList arrayList) {
        defpackage.g54 g54Var = new defpackage.g54();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.pn2 pn2Var = (defpackage.pn2) next;
            if (pn2Var != null && pn2Var != defpackage.on2.b) {
                g54Var.add(next);
            }
        }
        return g54Var;
    }

    public static final int F(defpackage.x33 x33Var) {
        return x33Var.j();
    }

    public static void F0(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final int G(defpackage.x33 x33Var) {
        return x33Var.j();
    }

    public static int G0(defpackage.tz tzVar, int i, int i2, int i3) {
        defpackage.rs.m(java.lang.Math.max(java.lang.Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        defpackage.p6.k(defpackage.p6.k(i4, i5), 1 << i3);
        if (tzVar.b() < i) {
            return -1;
        }
        int i6 = tzVar.i(i);
        if (i6 == i4) {
            if (tzVar.b() < i2) {
                return -1;
            }
            int i7 = tzVar.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (tzVar.b() < i3) {
                    return -1;
                }
                return tzVar.i(i3) + i6;
            }
        }
        return i6;
    }

    public static final void H(defpackage.aa3 aa3Var, defpackage.nf0 nf0Var, defpackage.ls2 ls2Var, defpackage.yv4 yv4Var, int i, long j) {
        java.lang.Object next;
        java.util.List list;
        java.lang.String str;
        java.util.Iterator it = aa3Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (defpackage.wq4.Y((org.moontechlab.selenetv.model.SearchResult) next).equals((java.lang.String) ls2Var.getValue())) {
                    break;
                }
            }
        }
        org.moontechlab.selenetv.model.SearchResult searchResultD = (org.moontechlab.selenetv.model.SearchResult) next;
        if (searchResultD == null) {
            searchResultD = aa3Var.d();
        }
        if (searchResultD == null || (list = searchResultD.d) == null || (str = (java.lang.String) defpackage.y30.y0(i, list)) == null) {
            return;
        }
        defpackage.u22.C(nf0Var, null, new defpackage.qb3(yv4Var, str, j, (defpackage.sd0) null), 3);
    }

    public static int H0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void I(defpackage.yv4 yv4Var, defpackage.aa3 aa3Var, defpackage.ls2 ls2Var, defpackage.e83 e83Var, defpackage.x33 x33Var, boolean z) {
        java.lang.Object next;
        if (yv4Var.l()) {
            java.util.Iterator it = aa3Var.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (defpackage.wq4.Y((org.moontechlab.selenetv.model.SearchResult) next).equals((java.lang.String) ls2Var.getValue())) {
                        break;
                    }
                }
            }
            org.moontechlab.selenetv.model.SearchResult searchResultD = (org.moontechlab.selenetv.model.SearchResult) next;
            if (searchResultD == null) {
                searchResultD = aa3Var.d();
            }
            long jA = yv4Var.a() > 0 ? yv4Var.a() : aa3Var.g;
            if (searchResultD != null) {
                java.lang.String str = aa3Var.a;
                int iJ = x33Var.j();
                long jE = yv4Var.e();
                e83Var.getClass();
                str.getClass();
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long j = e83Var.b;
                long j2 = jA;
                long j3 = jCurrentTimeMillis - e83Var.c;
                if (jE < 1000) {
                    return;
                }
                if (!z && (j3 < 10000 || jE == j)) {
                    return;
                }
                e83Var.b = jE;
                e83Var.c = jCurrentTimeMillis;
                java.lang.String str2 = searchResultD.a;
                java.lang.String str3 = searchResultD.f;
                java.lang.String str4 = searchResultD.g;
                java.lang.String str5 = searchResultD.i;
                java.lang.String str6 = searchResultD.c;
                int i = iJ + 1;
                int size = searchResultD.d.size();
                defpackage.u22.C(e83Var.a, null, new defpackage.ct0(new org.moontechlab.selenetv.model.PlayRecord(str2, str3, str, str4, str5, str6, i, size >= 1 ? size : 1, jE / 1000, j2 / 1000, jCurrentTimeMillis, str), null, 2), 3);
            }
        }
    }

    public static void I0(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(defpackage.ms1.y(i, "csd-"), java.nio.ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final void J(defpackage.ls2 ls2Var, defpackage.x33 x33Var) {
        D(ls2Var, true);
        x33Var.k(x33Var.j() + 1);
    }

    public static final java.lang.Object J0(defpackage.hk4 hk4Var, defpackage.xd1 xd1Var) throws java.lang.Throwable {
        java.lang.Object x50Var;
        java.lang.Object objH;
        defpackage.nq1.C(hk4Var, false, new defpackage.nv0(0, defpackage.q8.c0(hk4Var.u.getContext()).e(hk4Var.v, hk4Var, hk4Var.t)), 3);
        try {
            if (xd1Var instanceof defpackage.up) {
                defpackage.pp4.o(2, xd1Var);
                x50Var = xd1Var.invoke(hk4Var, hk4Var);
            } else {
                x50Var = defpackage.ht1.U(xd1Var, hk4Var, hk4Var);
            }
        } catch (java.lang.Throwable th) {
            x50Var = new defpackage.x50(th, false);
        }
        defpackage.of0 of0Var = defpackage.of0.f;
        if (x50Var == of0Var || (objH = hk4Var.H(x50Var)) == defpackage.uj2.i) {
            return of0Var;
        }
        if (objH instanceof defpackage.x50) {
            java.lang.Throwable th2 = ((defpackage.x50) objH).a;
            if (!(th2 instanceof defpackage.gk4) || ((defpackage.gk4) th2).f != hk4Var) {
                throw th2;
            }
            if (x50Var instanceof defpackage.x50) {
                throw ((defpackage.x50) x50Var).a;
            }
        } else {
            x50Var = defpackage.uj2.V(objH);
        }
        return x50Var;
    }

    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [e6, mr2] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public static final void K(final long j, final long j2, final boolean z, final defpackage.jd1 jd1Var, final defpackage.hd1 hd1Var, final defpackage.hd1 hd1Var2, final defpackage.hd1 hd1Var3, final defpackage.hd1 hd1Var4, final defpackage.ta1 ta1Var, final defpackage.ta1 ta1Var2, defpackage.to2 to2Var, final boolean z2, defpackage.k80 k80Var, final int i) {
        defpackage.k80 k80Var2;
        final defpackage.to2 to2Var2;
        int i2;
        defpackage.l94 l94Var;
        defpackage.l94 l94Var2;
        ?? r12;
        defpackage.to2 to2Var3;
        k80Var.d0(-737847113);
        int i3 = i | (k80Var.e(j) ? 4 : 2) | (k80Var.e(j2) ? 32 : 16) | (k80Var.g(z) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var.h(jd1Var) ? 2048 : 1024) | (k80Var.h(hd1Var) ? 16384 : 8192);
        if (k80Var.S(i3 & 1, ((i3 & 306783379) == 306783378 && (((k80Var.g(z2) ? ' ' : (char) 16) | 6) & 19) == 18) ? false : true)) {
            k80Var.X();
            if ((i & 1) == 0 || k80Var.B()) {
                to2Var2 = defpackage.qo2.f;
            } else {
                k80Var.V();
                to2Var2 = to2Var;
            }
            k80Var.q();
            java.lang.Object objP = k80Var.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                objP = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP);
            }
            defpackage.ls2 ls2Var = (defpackage.ls2) objP;
            boolean z3 = ((java.lang.Boolean) ls2Var.getValue()).booleanValue() && z && !z2;
            float fH = j2 > 0 ? defpackage.xr1.H(j / j2, 0.0f, 1.0f) : 0.0f;
            defpackage.l94 l94VarA = defpackage.ae.a(z3 ? 6.0f : 4.0f, defpackage.q8.x0(160, 6, null), "track_h", k80Var);
            final defpackage.l94 l94VarA2 = defpackage.ae.a(z3 ? 18.0f : 0.0f, defpackage.q8.s0(0.55f, 420.0f, null, 4), "knob", k80Var);
            defpackage.l94 l94VarB = defpackage.ae.b(z3 ? 1.0f : 0.0f, defpackage.q8.x0(180, 6, null), "glow", k80Var, 3120, 20);
            k80Var2 = k80Var;
            defpackage.to2 to2VarA = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(to2Var2, 1.0f), 28.0f), ta1Var);
            java.lang.Object objP2 = k80Var2.P();
            if (objP2 == cjVar) {
                i2 = 4;
                objP2 = new defpackage.fz(hd1Var4, ls2Var, i2);
                k80Var2.l0(objP2);
            } else {
                i2 = 4;
            }
            defpackage.to2 to2VarC = androidx.compose.ui.focus.a.c(to2VarA, (defpackage.jd1) objP2);
            java.lang.Object objP3 = k80Var2.P();
            if (objP3 == cjVar) {
                objP3 = new defpackage.gr0(ta1Var2, i2);
                k80Var2.l0(objP3);
            }
            defpackage.to2 to2VarB = androidx.compose.ui.focus.b.b(to2VarC, (defpackage.jd1) objP3);
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            java.lang.Object objP4 = k80Var2.P();
            if (z4 || objP4 == cjVar) {
                l94Var = l94VarB;
                l94Var2 = l94VarA;
                r12 = 0;
                to2Var3 = to2VarB;
                defpackage.sb3 sb3Var = new defpackage.sb3(z, hd1Var2, jd1Var, j, j2, hd1Var, hd1Var3);
                k80Var2.l0(sb3Var);
                objP4 = sb3Var;
            } else {
                l94Var = l94VarB;
                l94Var2 = l94VarA;
                r12 = 0;
                to2Var3 = to2VarB;
            }
            defpackage.to2 to2VarF = androidx.compose.foundation.a.f(androidx.compose.ui.input.key.a.a(to2Var3, (defpackage.jd1) objP4), r12, 3);
            final defpackage.l94 l94Var3 = l94Var;
            final defpackage.l94 l94Var4 = l94Var2;
            final boolean z5 = z3;
            final float f = fH;
            defpackage.d34.b(to2VarF, r12, defpackage.q8.n0(2113693729, new defpackage.yd1() { // from class: eb3
                @Override // defpackage.yd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.qo2 qo2Var;
                    defpackage.qo2 qo2Var2;
                    boolean z6;
                    defpackage.nt ntVar = (defpackage.nt) obj;
                    defpackage.k80 k80Var3 = (defpackage.k80) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    ntVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= k80Var3.f(ntVar) ? 4 : 2;
                    }
                    if (k80Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                        defpackage.yo0 yo0Var = ntVar.a;
                        long j3 = ntVar.b;
                        float fL = defpackage.fc0.d(j3) ? yo0Var.L(defpackage.fc0.h(j3)) : Float.POSITIVE_INFINITY;
                        defpackage.qo2 qo2Var3 = defpackage.qo2.f;
                        defpackage.to2 to2VarC2 = androidx.compose.foundation.layout.d.c(qo2Var3, 1.0f);
                        defpackage.l94 l94Var5 = l94Var4;
                        defpackage.to2 to2VarE = androidx.compose.foundation.layout.d.e(to2VarC2, ((defpackage.ow0) l94Var5.getValue()).f);
                        defpackage.dr drVar = defpackage.d6.w;
                        androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.a;
                        defpackage.to2 to2VarA2 = aVar.a(to2VarE, drVar);
                        defpackage.gs3 gs3Var = defpackage.hs3.a;
                        defpackage.to2 to2VarK = defpackage.ct1.k(to2VarA2, gs3Var);
                        long j4 = defpackage.g40.c;
                        long jC = defpackage.g40.c(0.25f, j4);
                        defpackage.zk1 zk1Var = defpackage.pp4.f;
                        defpackage.ys.a(androidx.compose.foundation.a.b(to2VarK, jC, zk1Var), k80Var3, 0);
                        float f2 = fL * f;
                        defpackage.to2 to2VarE2 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.l(qo2Var3, f2), ((defpackage.ow0) l94Var5.getValue()).f);
                        defpackage.dr drVar2 = defpackage.d6.v;
                        defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(aVar.a(to2VarE2, drVar2), gs3Var), j4, zk1Var), k80Var3, 0);
                        defpackage.l94 l94Var6 = l94Var3;
                        if (((java.lang.Number) l94Var6.getValue()).floatValue() > 0.0f) {
                            k80Var3.b0(534695202);
                            qo2Var = qo2Var3;
                            defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.c.c(aVar.a(qo2Var3, drVar2), f2 - 14.0f, 0.0f), 28.0f), gs3Var), defpackage.g40.c(((java.lang.Number) l94Var6.getValue()).floatValue() * 0.25f, j4), zk1Var), k80Var3, 0);
                        } else {
                            qo2Var = qo2Var3;
                            k80Var3.b0(478799009);
                        }
                        k80Var3.p(false);
                        defpackage.l94 l94Var7 = l94VarA2;
                        if (java.lang.Float.compare(((defpackage.ow0) l94Var7.getValue()).f, 0.0f) > 0) {
                            k80Var3.b0(534909691);
                            qo2Var2 = qo2Var;
                            defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.c.c(aVar.a(qo2Var2, drVar2), f2 - (((defpackage.ow0) l94Var7.getValue()).f / 2.0f), 0.0f), ((defpackage.ow0) l94Var7.getValue()).f), gs3Var), j4, zk1Var), k80Var3, 0);
                        } else {
                            qo2Var2 = qo2Var;
                            k80Var3.b0(478799009);
                        }
                        k80Var3.p(false);
                        if (z5) {
                            k80Var3.b0(535105611);
                            defpackage.to2 to2VarB2 = androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.c.c(aVar.a(qo2Var2, drVar2), f2 - 30.0f, -26.0f), defpackage.hs3.a(7.0f)), j4, zk1Var);
                            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.i, false);
                            long j5 = k80Var3.T;
                            int i4 = (int) (j5 ^ (j5 >>> 32));
                            defpackage.y53 y53VarL = k80Var3.l();
                            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var3, to2VarB2);
                            defpackage.w70.b.getClass();
                            defpackage.j90 j90Var = defpackage.v70.b;
                            k80Var3.f0();
                            if (k80Var3.S) {
                                k80Var3.k(j90Var);
                            } else {
                                k80Var3.o0();
                            }
                            defpackage.ht1.J(k80Var3, defpackage.v70.f, fk2VarD);
                            defpackage.ht1.J(k80Var3, defpackage.v70.e, y53VarL);
                            defpackage.qf qfVar = defpackage.v70.g;
                            if (k80Var3.S || !defpackage.ct1.g(k80Var3.P(), java.lang.Integer.valueOf(i4))) {
                                defpackage.ms1.G(i4, k80Var3, i4, qfVar);
                            }
                            defpackage.ht1.J(k80Var3, defpackage.v70.d, to2VarD);
                            z6 = false;
                            defpackage.ii4.a(defpackage.pc1.m0(j), androidx.compose.foundation.layout.c.e(qo2Var2, 9.0f, 3.0f), defpackage.q8.s(4278848010L), defpackage.nq1.A(12), defpackage.jc1.u, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var3, 200112, 0, 131024);
                            k80Var3 = k80Var3;
                            k80Var3.p(true);
                        } else {
                            z6 = false;
                            k80Var3.b0(478799009);
                        }
                        k80Var3.p(z6);
                    } else {
                        k80Var3.V();
                    }
                    return defpackage.as4.a;
                }
            }, k80Var2), k80Var2, 3072);
        } else {
            k80Var2 = k80Var;
            k80Var2.V();
            to2Var2 = to2Var;
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1(j, j2, z, jd1Var, hd1Var, hd1Var2, hd1Var3, hd1Var4, ta1Var, ta1Var2, to2Var2, z2, i) { // from class: fb3
                public final /* synthetic */ defpackage.ta1 A;
                public final /* synthetic */ defpackage.to2 B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ long f;
                public final /* synthetic */ long i;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ defpackage.jd1 u;
                public final /* synthetic */ defpackage.hd1 v;
                public final /* synthetic */ defpackage.hd1 w;
                public final /* synthetic */ defpackage.hd1 x;
                public final /* synthetic */ defpackage.hd1 y;
                public final /* synthetic */ defpackage.ta1 z;

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iG = defpackage.st1.G(920322049);
                    defpackage.pc1.K(this.f, this.i, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (defpackage.k80) obj, iG);
                    return defpackage.as4.a;
                }
            };
        }
    }

    public static void K0(defpackage.tz tzVar) {
        tzVar.t(3);
        tzVar.t(8);
        boolean zH = tzVar.h();
        boolean zH2 = tzVar.h();
        if (zH) {
            tzVar.t(5);
        }
        if (zH2) {
            tzVar.t(6);
        }
    }

    public static final void L(defpackage.to2 to2Var, defpackage.q60 q60Var, defpackage.k80 k80Var, int i) {
        k80Var.d0(-1854833411);
        int i2 = (k80Var.f(to2Var) ? 4 : 2) | i;
        if (k80Var.S(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object objP = k80Var.P();
            if (objP == defpackage.z70.a) {
                objP = defpackage.u9.f;
                k80Var.l0(objP);
            }
            defpackage.fk2 fk2Var = (defpackage.fk2) objP;
            long j = k80Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2Var);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(j90Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, fk2Var);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var, i3, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            q60Var.invoke(k80Var, 6);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.kt(i, 13, to2Var, q60Var);
        }
    }

    public static void L0(defpackage.tz tzVar) {
        int i;
        int i2 = tzVar.i(2);
        if (i2 == 0) {
            tzVar.t(6);
            return;
        }
        int iG0 = G0(tzVar, 5, 8, 16) + 1;
        if (i2 == 1) {
            tzVar.t(iG0 * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = tzVar.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iG0) {
                if (tzVar.h()) {
                    tzVar.t(7);
                    i = 0;
                } else {
                    if (tzVar.i(2) == 3 && tzVar.i(i4) * i3 != 0) {
                        tzVar.s();
                    }
                    i = tzVar.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        tzVar.s();
                    }
                    tzVar.s();
                }
                if (i != 0 && i != 180 && tzVar.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static int[] M0(java.util.Collection collection) {
        if (collection instanceof defpackage.nt1) {
            defpackage.nt1 nt1Var = (defpackage.nt1) collection;
            return java.util.Arrays.copyOfRange(nt1Var.f, nt1Var.i, nt1Var.t);
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            obj.getClass();
            iArr[i] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    public static final java.lang.Object N(defpackage.yv4 yv4Var, defpackage.x33 x33Var, defpackage.ls2 ls2Var, defpackage.d64 d64Var, android.content.Context context, defpackage.sd4 sd4Var) {
        int iJ = x33Var.j() + 1;
        defpackage.vw1 vw1Var = defpackage.ph0.a;
        int iE = (int) (yv4Var.e() / 1000);
        java.lang.Object objT = defpackage.u22.t(new defpackage.nb3(ls2Var, d64Var, context, iJ, iE <= 0 ? 0 : iE / 300, null), sd4Var);
        return objT == defpackage.of0.f ? objT : defpackage.as4.a;
    }

    public static final java.lang.Class N0(defpackage.hj0 hj0Var) {
        if (!(hj0Var instanceof defpackage.yo2) || !defpackage.lq1.a(hj0Var)) {
            return null;
        }
        defpackage.yo2 yo2Var = (defpackage.yo2) hj0Var;
        java.lang.Class clsL = defpackage.it4.l(yo2Var);
        if (clsL != null) {
            return clsL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class object for the class ");
        sb.append(yo2Var.getName());
        defpackage.h20 h20VarF = defpackage.yp0.f((defpackage.u20) hj0Var);
        sb.append(" cannot be found (classId=");
        sb.append(h20VarF);
        sb.append(')');
        throw new defpackage.rf0(sb.toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:89|47|48|95|49|50|91|51|52|(2:54|104)(11:55|56|57|66|(0)|69|(0)(0)|84|85|87|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        r4 = r20;
        r9 = r22;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
    
        r15 = r1;
        r1 = r5;
        r5 = r11;
        r11 = r2;
        r2 = r8;
        r8 = r12;
        r12 = r4;
        r4 = r10;
        r10 = r14;
        r14 = r9;
        r9 = r13;
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0167, code lost:
    
        r3 = new defpackage.zq3(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0132 -> B:56:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01e4 -> B:85:0x01e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.d64 r19, defpackage.yv4 r20, java.util.Map r21, java.util.Map r22, defpackage.d64 r23, defpackage.ls2 r24, android.content.Context r25, defpackage.x33 r26, java.lang.String r27, defpackage.ud0 r28) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.O(d64, yv4, java.util.Map, java.util.Map, d64, ls2, android.content.Context, x33, java.lang.String, ud0):java.lang.Object");
    }

    public static final java.lang.Class O0(defpackage.s32 s32Var) {
        defpackage.q34 q34VarD;
        s32Var.getClass();
        java.lang.Class clsN0 = N0(s32Var.f0().a());
        if (clsN0 == null) {
            return null;
        }
        if (defpackage.gq4.e(s32Var) && ((q34VarD = defpackage.lq1.d(s32Var)) == null || defpackage.gq4.e(q34VarD) || defpackage.i32.E(q34VarD))) {
            return null;
        }
        return clsN0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.wd4 r6, defpackage.up r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ty3
            if (r0 == 0) goto L13
            r0 = r7
            ty3 r0 = (defpackage.ty3) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            ty3 r0 = new ty3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            int r1 = r0.t
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            wd4 r6 = r0.f
            defpackage.or1.J(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.r(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.or1.J(r7)
        L31:
            r0.f = r6
            r0.t = r2
            dc3 r7 = defpackage.dc3.i
            java.lang.Object r7 = r6.c(r7, r0)
            of0 r1 = defpackage.of0.f
            if (r7 != r1) goto L40
            return r1
        L40:
            cc3 r7 = (defpackage.cc3) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            ic3 r5 = (defpackage.ic3) r5
            boolean r5 = defpackage.y91.l(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.P(wd4, up):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer P0(java.lang.String r13) {
        /*
            r13.getClass()
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r13 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r13.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r2 = r13.length()
            if (r0 != r2) goto L1e
            goto La
        L1e:
            int r2 = r0 + 1
            char r3 = r13.charAt(r0)
            r4 = -1
            r5 = 128(0x80, float:1.794E-43)
            if (r3 >= r5) goto L2e
            byte[] r6 = defpackage.wh2.a
            r3 = r6[r3]
            goto L31
        L2e:
            byte[] r3 = defpackage.wh2.a
            r3 = r4
        L31:
            if (r3 < 0) goto La
            r6 = 10
            if (r3 < r6) goto L38
            goto La
        L38:
            int r3 = -r3
            long r7 = (long) r3
        L3a:
            int r3 = r13.length()
            r9 = -9223372036854775808
            if (r2 >= r3) goto L6d
            int r3 = r2 + 1
            char r2 = r13.charAt(r2)
            if (r2 >= r5) goto L4f
            byte[] r11 = defpackage.wh2.a
            r2 = r11[r2]
            goto L52
        L4f:
            byte[] r2 = defpackage.wh2.a
            r2 = r4
        L52:
            if (r2 < 0) goto La
            if (r2 >= r6) goto La
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L60
            goto La
        L60:
            r11 = 10
            long r7 = r7 * r11
            long r11 = (long) r2
            long r9 = r9 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto La
        L6a:
            long r7 = r7 - r11
            r2 = r3
            goto L3a
        L6d:
            if (r0 == 0) goto L74
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            goto L7e
        L74:
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L79
            goto La
        L79:
            long r2 = -r7
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L7e:
            if (r13 == 0) goto L97
            long r2 = r13.longValue()
            int r0 = r13.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            return r13
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.P0(java.lang.String):java.lang.Integer");
    }

    public static final int Q(defpackage.bi2 bi2Var, defpackage.tk1 tk1Var) {
        defpackage.bi2 bi2VarL0 = bi2Var.l0();
        if (bi2VarL0 == null) {
            defpackage.gq1.b("Child of " + bi2Var + " cannot be null when calculating alignment line");
        }
        if (bi2Var.p0().a().containsKey(tk1Var)) {
            java.lang.Integer num = (java.lang.Integer) bi2Var.p0().a().get(tk1Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iK0 = bi2VarL0.k0(tk1Var);
            if (iK0 != Integer.MIN_VALUE) {
                bi2VarL0.A = true;
                bi2Var.B = true;
                bi2Var.v0();
                bi2VarL0.A = false;
                bi2Var.B = false;
                return iK0 + ((int) (tk1Var instanceof defpackage.tk1 ? bi2VarL0.r0() & 4294967295L : bi2VarL0.r0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void Q0(defpackage.mw mwVar, defpackage.or1 or1Var) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        defpackage.db2 db2VarU = or1Var.u();
        if (db2VarU == defpackage.db2.i || db2VarU.compareTo(defpackage.db2.u) >= 0) {
            mwVar.p();
        } else {
            or1Var.i(new defpackage.ua2(mwVar, or1Var));
        }
    }

    public static final boolean R(int i, android.view.KeyEvent keyEvent) {
        return ((int) (defpackage.u22.v(keyEvent) >> 32)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R0(long r6, defpackage.xd1 r8, defpackage.ud0 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.ik4
            if (r0 == 0) goto L13
            r0 = r9
            ik4 r0 = (defpackage.ik4) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            ik4 r0 = new ik4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ym3 r6 = r0.f
            defpackage.or1.J(r9)     // Catch: defpackage.gk4 -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.r(r6)
            return r2
        L30:
            defpackage.or1.J(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            ym3 r9 = new ym3
            r9.<init>()
            r0.f = r9     // Catch: defpackage.gk4 -> L54
            r0.t = r3     // Catch: defpackage.gk4 -> L54
            hk4 r1 = new hk4     // Catch: defpackage.gk4 -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.gk4 -> L54
            r9.f = r1     // Catch: defpackage.gk4 -> L54
            java.lang.Object r6 = J0(r1, r8)     // Catch: defpackage.gk4 -> L54
            of0 r7 = defpackage.of0.f
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            ov1 r8 = r7.f
            java.lang.Object r6 = r6.f
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.R0(long, xd1, ud0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(defpackage.wd4 r17, defpackage.zm r18, defpackage.e30 r19, defpackage.cc3 r20, defpackage.up r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.S(wd4, zm, e30, cc3, up):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r15 == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(defpackage.wd4 r12, defpackage.qg4 r13, defpackage.cc3 r14, defpackage.up r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.T(wd4, qg4, cc3, up):java.lang.Object");
    }

    public static java.util.List U(int... iArr) {
        return iArr.length == 0 ? java.util.Collections.EMPTY_LIST : new defpackage.nt1(0, iArr.length, iArr);
    }

    public static final void V(defpackage.fx4 fx4Var, defpackage.mw mwVar, defpackage.or1 or1Var) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        java.lang.AutoCloseable autoCloseable;
        mwVar.getClass();
        or1Var.getClass();
        defpackage.gx4 gx4Var = fx4Var.a;
        if (gx4Var != null) {
            synchronized (gx4Var.a) {
                autoCloseable = (java.lang.AutoCloseable) gx4Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        defpackage.wt3 wt3Var = (defpackage.wt3) autoCloseable;
        if (wt3Var == null || wt3Var.t) {
            return;
        }
        wt3Var.u(mwVar, or1Var);
        Q0(mwVar, or1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.wd4 r7, defpackage.dc3 r8, defpackage.up r9) {
        /*
            boolean r0 = r9 instanceof defpackage.nc1
            if (r0 == 0) goto L13
            r0 = r9
            nc1 r0 = (defpackage.nc1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            nc1 r0 = new nc1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            dc3 r7 = r0.i
            wd4 r8 = r0.f
            defpackage.or1.J(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.r(r7)
            r7 = 0
            return r7
        L34:
            defpackage.or1.J(r9)
            xd4 r9 = r7.w
            cc3 r9 = r9.J
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            ic3 r5 = (defpackage.ic3) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.f = r7
            r0.i = r8
            r0.u = r3
            java.lang.Object r9 = r7.c(r8, r0)
            of0 r1 = defpackage.of0.f
            if (r9 != r1) goto L5d
            return r1
        L5d:
            cc3 r9 = (defpackage.cc3) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            ic3 r5 = (defpackage.ic3) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            as4 r7 = defpackage.as4.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.W(wd4, dc3, up):java.lang.Object");
    }

    public static final java.lang.Object X(defpackage.nc3 nc3Var, defpackage.xd1 xd1Var, defpackage.sd0 sd0Var) {
        java.lang.Object objX0 = ((defpackage.xd4) nc3Var).x0(new defpackage.oc1(sd0Var.getContext(), xd1Var, null, 0), sd0Var);
        return objX0 == defpackage.of0.f ? objX0 : defpackage.as4.a;
    }

    public static defpackage.mv1 Y() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        java.lang.String property = java.lang.System.getProperty("java.specification.version", "unknown");
        try {
            property.getClass();
        } catch (java.lang.NumberFormatException unused) {
        }
        if (java.lang.Integer.parseInt(property) < 9) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("l", true, null);
                java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                java.lang.Class<?> cls3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                java.lang.Class<?> cls4 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                java.lang.reflect.Method method = cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2);
                java.lang.reflect.Method method2 = cls.getMethod("get", javax.net.ssl.SSLSocket.class);
                java.lang.reflect.Method method3 = cls.getMethod("remove", javax.net.ssl.SSLSocket.class);
                method.getClass();
                method2.getClass();
                method3.getClass();
                cls3.getClass();
                cls4.getClass();
                return new defpackage.mv1(method, method2, method3, cls3, cls4);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
            }
        }
        return null;
    }

    public static java.util.ArrayList Z(byte[] bArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final void a(final boolean z, final defpackage.to2 to2Var, defpackage.k80 k80Var, final int i) {
        final int i2;
        defpackage.ll3 ll3VarT;
        defpackage.xd1 xd1Var;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(1299217185);
        int i3 = (k80Var2.g(z) ? 4 : 2) | i | (k80Var2.f(to2Var) ? 32 : 16);
        final int i4 = 0;
        if (k80Var2.S(i3 & 1, (i3 & 19) != 18)) {
            defpackage.l94 l94VarB = defpackage.ae.b(z ? 1.0f : 0.0f, defpackage.q8.x0(180, 6, null), "back_exit_hint", k80Var2, 3120, 20);
            if (((java.lang.Number) l94VarB.getValue()).floatValue() <= 0.0f) {
                ll3VarT = k80Var2.t();
                if (ll3VarT != null) {
                    xd1Var = new defpackage.xd1(z, to2Var, i, i4) { // from class: db3
                        public final /* synthetic */ int f;
                        public final /* synthetic */ boolean i;
                        public final /* synthetic */ defpackage.to2 t;

                        {
                            this.f = i4;
                        }

                        @Override // defpackage.xd1
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            int i5 = this.f;
                            defpackage.as4 as4Var = defpackage.as4.a;
                            defpackage.to2 to2Var2 = this.t;
                            boolean z2 = this.i;
                            defpackage.k80 k80Var3 = (defpackage.k80) obj;
                            ((java.lang.Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    defpackage.pc1.a(z2, to2Var2, k80Var3, defpackage.st1.G(1));
                                    break;
                                default:
                                    defpackage.pc1.a(z2, to2Var2, k80Var3, defpackage.st1.G(1));
                                    break;
                            }
                            return as4Var;
                        }
                    };
                    ll3VarT.d = xd1Var;
                }
                return;
            }
            boolean zF = k80Var2.f(l94VarB);
            java.lang.Object objP = k80Var2.P();
            if (zF || objP == defpackage.z70.a) {
                objP = new defpackage.fl(l94VarB, 27);
                k80Var2.l0(objP);
            }
            defpackage.to2 to2VarA = androidx.compose.ui.graphics.a.a(to2Var, (defpackage.jd1) objP);
            defpackage.dr drVar = defpackage.d6.i;
            defpackage.fk2 fk2VarD = defpackage.ys.d(drVar, false);
            long j = k80Var2.T;
            int i5 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, to2VarA);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i5))) {
                defpackage.ms1.G(i5, k80Var2, i5, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD);
            defpackage.to2 to2VarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.a.b(defpackage.ct1.k(defpackage.qo2.f, defpackage.hs3.a(999.0f)), defpackage.q8.s(3858759680L), defpackage.pp4.f), 22.0f, 12.0f);
            defpackage.fk2 fk2VarD2 = defpackage.ys.d(drVar, false);
            long j2 = k80Var2.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            defpackage.y53 y53VarL2 = k80Var2.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarE);
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, qfVar, fk2VarD2);
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i6))) {
                defpackage.ms1.G(i6, k80Var2, i6, qfVar3);
            }
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD2);
            i2 = 1;
            defpackage.ii4.a("再按一次返回键退出", null, defpackage.g40.c, defpackage.nq1.A(14), defpackage.jc1.t, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var, 200070, 0, 131026);
            k80Var2 = k80Var;
            k80Var2.p(true);
            k80Var2.p(true);
        } else {
            i2 = 1;
            k80Var2.V();
        }
        ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            xd1Var = new defpackage.xd1(z, to2Var, i, i2) { // from class: db3
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ defpackage.to2 t;

                {
                    this.f = i2;
                }

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    int i52 = this.f;
                    defpackage.as4 as4Var = defpackage.as4.a;
                    defpackage.to2 to2Var2 = this.t;
                    boolean z2 = this.i;
                    defpackage.k80 k80Var3 = (defpackage.k80) obj;
                    ((java.lang.Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            defpackage.pc1.a(z2, to2Var2, k80Var3, defpackage.st1.G(1));
                            break;
                        default:
                            defpackage.pc1.a(z2, to2Var2, k80Var3, defpackage.st1.G(1));
                            break;
                    }
                    return as4Var;
                }
            };
            ll3VarT.d = xd1Var;
        }
    }

    public static int a0(long j) {
        int i = (int) j;
        defpackage.y91.o(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static final void b(final defpackage.zc2 zc2Var, final float f, final java.lang.String str, final defpackage.hd1 hd1Var, final defpackage.to2 to2Var, defpackage.k80 k80Var, final int i) {
        int i2;
        float f2;
        final java.lang.String str2;
        k80Var.d0(758485002);
        if ((i & 6) == 0) {
            i2 = (k80Var.f(zc2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= k80Var.c(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= k80Var.f(str2) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= k80Var.h(hd1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= k80Var.f(to2Var) ? 16384 : 8192;
        }
        if (k80Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            final android.content.Context context = (android.content.Context) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj = defpackage.z70.a;
            if (objP == obj) {
                objP = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP);
            }
            final defpackage.ls2 ls2Var = (defpackage.ls2) objP;
            defpackage.l94 l94VarB = defpackage.ae.b(((java.lang.Boolean) ls2Var.getValue()).booleanValue() ? 1.1f : 1.0f, defpackage.q8.s0(0.6f, 400.0f, null, 4), "channel_card_scale", k80Var, 3120, 20);
            defpackage.wr0 wr0Var = (defpackage.wr0) k80Var.j(defpackage.vr0.a);
            java.lang.String strConcat = "live|".concat(zc2Var.a);
            defpackage.to2 to2VarA = defpackage.qo2.f;
            if (wr0Var != null && wr0Var.a(strConcat)) {
                to2VarA = androidx.compose.ui.focus.a.a(to2VarA, wr0Var.b);
            }
            defpackage.to2 to2VarF = to2Var.f(to2VarA);
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == obj) {
                objP2 = new defpackage.sc(ls2Var, 24);
                k80Var.l0(objP2);
            }
            defpackage.to2 to2VarC = androidx.compose.ui.focus.a.c(to2VarF, (defpackage.jd1) objP2);
            boolean zF = k80Var.f(l94VarB);
            java.lang.Object objP3 = k80Var.P();
            if (zF || objP3 == obj) {
                objP3 = new defpackage.fl(l94VarB, 19);
                k80Var.l0(objP3);
            }
            defpackage.to2 to2VarA2 = androidx.compose.ui.graphics.a.a(to2VarC, (defpackage.jd1) objP3);
            defpackage.b30 b30VarH = defpackage.d6.h(1.0f);
            defpackage.gs3 gs3VarA = defpackage.hs3.a(12.0f);
            defpackage.c30 c30Var = new defpackage.c30(gs3VarA, gs3VarA, gs3VarA, gs3VarA, gs3VarA);
            long j = defpackage.g40.f;
            defpackage.z20 z20VarE = defpackage.d6.e(j, j, 0L, 0L, k80Var, 390, 250);
            boolean zH = k80Var.h(wr0Var) | k80Var.f(strConcat) | ((i2 & 7168) == 2048);
            java.lang.Object objP4 = k80Var.P();
            if (zH || objP4 == obj) {
                objP4 = new defpackage.e80(4, wr0Var, strConcat, hd1Var);
                k80Var.l0(objP4);
            }
            final float f3 = f2;
            defpackage.xr1.q((defpackage.hd1) objP4, to2VarA2, null, false, c30Var, z20VarE, b30VarH, null, null, defpackage.q8.n0(806406795, new defpackage.yd1() { // from class: qe2
                @Override // defpackage.yd1
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.ls2 ls2Var2;
                    defpackage.to2 to2VarQ;
                    java.lang.String str3;
                    defpackage.k80 k80Var2 = (defpackage.k80) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    ((defpackage.jt) obj2).getClass();
                    if (k80Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        defpackage.v40 v40VarA = defpackage.t40.a(defpackage.uj2.c, defpackage.d6.F, k80Var2, 48);
                        long j2 = k80Var2.T;
                        int i3 = (int) (j2 ^ (j2 >>> 32));
                        defpackage.y53 y53VarL = k80Var2.l();
                        defpackage.qo2 qo2Var = defpackage.qo2.f;
                        defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, qo2Var);
                        defpackage.w70.b.getClass();
                        defpackage.j90 j90Var = defpackage.v70.b;
                        k80Var2.f0();
                        if (k80Var2.S) {
                            k80Var2.k(j90Var);
                        } else {
                            k80Var2.o0();
                        }
                        defpackage.qf qfVar = defpackage.v70.f;
                        defpackage.ht1.J(k80Var2, qfVar, v40VarA);
                        defpackage.qf qfVar2 = defpackage.v70.e;
                        defpackage.ht1.J(k80Var2, qfVar2, y53VarL);
                        defpackage.qf qfVar3 = defpackage.v70.g;
                        if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i3))) {
                            defpackage.ms1.G(i3, k80Var2, i3, qfVar3);
                        }
                        defpackage.qf qfVar4 = defpackage.v70.d;
                        defpackage.ht1.J(k80Var2, qfVar4, to2VarD);
                        defpackage.to2 to2VarB = androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), f3), defpackage.hs3.a(12.0f)), defpackage.q8.s(4280163870L), defpackage.pp4.f);
                        defpackage.ls2 ls2Var3 = ls2Var;
                        if (((java.lang.Boolean) ls2Var3.getValue()).booleanValue()) {
                            ls2Var2 = ls2Var3;
                            to2VarQ = defpackage.pp4.q(qo2Var, 3.0f, defpackage.g40.c, defpackage.hs3.a(12.0f));
                        } else {
                            ls2Var2 = ls2Var3;
                            to2VarQ = qo2Var;
                        }
                        defpackage.to2 to2VarF2 = to2VarB.f(to2VarQ);
                        defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
                        long j3 = k80Var2.T;
                        int i4 = (int) (j3 ^ (j3 >>> 32));
                        defpackage.y53 y53VarL2 = k80Var2.l();
                        defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarF2);
                        k80Var2.f0();
                        if (k80Var2.S) {
                            k80Var2.k(j90Var);
                        } else {
                            k80Var2.o0();
                        }
                        defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
                        defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
                        if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i4))) {
                            defpackage.ms1.G(i4, k80Var2, i4, qfVar3);
                        }
                        defpackage.ht1.J(k80Var2, qfVar4, to2VarD2);
                        defpackage.zc2 zc2Var2 = zc2Var;
                        java.lang.String str4 = zc2Var2.d;
                        java.lang.String str5 = zc2Var2.c;
                        if (str4.length() > 0) {
                            k80Var2.b0(-93144942);
                            defpackage.eo1 eo1Var = new defpackage.eo1(context);
                            eo1Var.c = zc2Var2.d;
                            defpackage.ci1 ci1Var = new defpackage.ci1(0);
                            eo1Var.h = ci1Var;
                            ci1Var.a("User-Agent", str2);
                            eo1Var.g = new defpackage.yf0(100);
                            defpackage.or1.a(eo1Var.a(), str5, androidx.compose.foundation.layout.c.d(defpackage.ct1.k(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.d.c, ((java.lang.Boolean) ls2Var2.getValue()).booleanValue() ? 3.0f : 0.0f), defpackage.hs3.a(((java.lang.Boolean) ls2Var2.getValue()).booleanValue() ? 8.04f : 12.0f)), 16.0f), null, defpackage.cd0.b, k80Var2, 1572864, 4024);
                            str3 = str5;
                            k80Var2.p(false);
                        } else {
                            str3 = str5;
                            k80Var2.b0(-92268293);
                            defpackage.in1.a(defpackage.xr1.R(), null, androidx.compose.foundation.layout.d.i(qo2Var, 48.0f), defpackage.q8.s(4283782485L), k80Var2, 3504);
                            k80Var2.p(false);
                        }
                        k80Var2.p(true);
                        defpackage.xr1.p(k80Var2, androidx.compose.foundation.layout.d.e(qo2Var, 8.0f));
                        defpackage.ii4.a(str3, androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), ((java.lang.Boolean) ls2Var2.getValue()).booleanValue() ? defpackage.q8.s(4283215696L) : defpackage.g40.c, defpackage.nq1.A(13), defpackage.jc1.i, 0L, new defpackage.mf4(3), 0L, 2, false, 1, 0, null, null, k80Var2, 199728, 3120, 120272);
                        k80Var2.p(true);
                    } else {
                        k80Var2.V();
                    }
                    return defpackage.as4.a;
                }
            }, k80Var), k80Var, 0, 1820);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1() { // from class: re2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    defpackage.pc1.b(zc2Var, f, str, hd1Var, to2Var, (defpackage.k80) obj2, defpackage.st1.G(i | 1));
                    return defpackage.as4.a;
                }
            };
        }
    }

    public static final java.lang.Object b0(java.lang.Object obj, defpackage.zw zwVar) {
        defpackage.s32 s32VarS0;
        java.lang.Class clsO0;
        return (((zwVar instanceof defpackage.sf3) && defpackage.lq1.c((defpackage.xt4) zwVar)) || (s32VarS0 = s0(zwVar)) == null || (clsO0 = O0(s32VarS0)) == null) ? obj : z0(clsO0, zwVar).invoke(obj, null);
    }

    public static final void c(final float f, final int i, defpackage.k80 k80Var, final defpackage.to2 to2Var) {
        int i2;
        k80Var.d0(-95110809);
        if ((i & 6) == 0) {
            i2 = (k80Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= k80Var.f(to2Var) ? 32 : 16;
        }
        if (k80Var.S(i2 & 1, (i2 & 19) != 18)) {
            defpackage.v40 v40VarA = defpackage.t40.a(defpackage.uj2.c, defpackage.d6.F, k80Var, 48);
            long j = k80Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2Var);
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
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarK = defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), f), defpackage.hs3.a(12.0f));
            long j2 = defpackage.g40.c;
            long jC = defpackage.g40.c(0.45f, j2);
            defpackage.zk1 zk1Var = defpackage.pp4.f;
            defpackage.ys.a(androidx.compose.foundation.a.b(to2VarK, jC, zk1Var), k80Var, 0);
            defpackage.xr1.p(k80Var, androidx.compose.foundation.layout.d.e(qo2Var, 8.0f));
            defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.l(qo2Var, 80.0f), 14.0f), defpackage.hs3.a(2.0f)), defpackage.g40.c(0.315f, j2), zk1Var), k80Var, 0);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1() { // from class: se2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iG = defpackage.st1.G(i | 1);
                    defpackage.pc1.c(f, iG, (defpackage.k80) obj, to2Var);
                    return defpackage.as4.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c0(defpackage.oe1 r5, int r6) {
        /*
            b70 r0 = defpackage.b70.t
            r1 = r6 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            r6 = r6 & 2
            if (r6 == 0) goto L10
            r2 = r3
        L10:
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r2 == 0) goto L32
            boolean r2 = r5 instanceof defpackage.mc0
            if (r2 == 0) goto L21
            java.lang.String r2 = "<init>"
            goto L2f
        L21:
            r2 = r5
            ij0 r2 = (defpackage.ij0) r2
            lt2 r2 = r2.getName()
            java.lang.String r2 = r2.b()
            r2.getClass()
        L2f:
            r6.append(r2)
        L32:
            java.lang.String r2 = "("
            r6.append(r2)
            r52 r2 = r5.L()
            if (r2 == 0) goto L4f
            s32 r2 = r2.getType()
            r2.getClass()
            qp4 r3 = defpackage.qp4.k
            java.lang.Object r2 = defpackage.rs.O(r2, r3, r0)
            jz1 r2 = (defpackage.jz1) r2
            r6.append(r2)
        L4f:
            java.util.List r2 = r5.E()
            java.util.Iterator r2 = r2.iterator()
        L57:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r2.next()
            vt4 r3 = (defpackage.vt4) r3
            s32 r3 = r3.getType()
            r3.getClass()
            qp4 r4 = defpackage.qp4.k
            java.lang.Object r3 = defpackage.rs.O(r3, r4, r0)
            jz1 r3 = (defpackage.jz1) r3
            r6.append(r3)
            goto L57
        L76:
            java.lang.String r2 = ")"
            r6.append(r2)
            if (r1 == 0) goto Lbc
            boolean r1 = r5 instanceof defpackage.mc0
            if (r1 == 0) goto L82
            goto La4
        L82:
            s32 r1 = r5.getReturnType()
            r1.getClass()
            lt2 r2 = defpackage.i32.e
            ad1 r2 = defpackage.b94.d
            boolean r1 = defpackage.i32.C(r1, r2)
            if (r1 == 0) goto Laa
            s32 r1 = r5.getReturnType()
            r1.getClass()
            boolean r1 = defpackage.gq4.e(r1)
            if (r1 != 0) goto Laa
            boolean r1 = r5 instanceof defpackage.vf3
            if (r1 != 0) goto Laa
        La4:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lbc
        Laa:
            s32 r5 = r5.getReturnType()
            r5.getClass()
            qp4 r1 = defpackage.qp4.k
            java.lang.Object r5 = defpackage.rs.O(r5, r1, r0)
            jz1 r5 = (defpackage.jz1) r5
            r6.append(r5)
        Lbc:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.c0(oe1, int):java.lang.String");
    }

    public static final void d(final java.util.List list, final int i, final boolean z, final boolean z2, final float f, float f2, final java.lang.String str, final int i2, final defpackage.jd1 jd1Var, final defpackage.jd1 jd1Var2, final defpackage.jd1 jd1Var3, defpackage.hd1 hd1Var, defpackage.k80 k80Var, final int i3, final int i4, final int i5) {
        float f3;
        defpackage.k80 k80Var2;
        final defpackage.hd1 hd1Var2;
        defpackage.xd1 xd1Var;
        defpackage.ll3 ll3Var;
        final defpackage.hd1 hd1Var3;
        defpackage.hd1 hd1Var4;
        boolean z3;
        boolean z4;
        defpackage.to2 to2Var;
        int i6;
        java.lang.Object obj;
        defpackage.hd1 hd1Var5;
        final int i7 = i;
        final float f4 = f2;
        k80Var.d0(-673123273);
        int i8 = (i3 & 6) == 0 ? (k80Var.h(list) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i8 |= k80Var.d(i7) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i8 |= k80Var.g(z) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        }
        if ((i3 & 3072) == 0) {
            i8 |= k80Var.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= k80Var.c(f) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i8 |= k80Var.c(f4) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i8 |= k80Var.f(str) ? 1048576 : 524288;
        }
        int i9 = 32;
        if ((i3 & 12582912) == 0) {
            i8 |= k80Var.d(i2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i8 |= k80Var.h(jd1Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i8 |= k80Var.h(jd1Var2) ? 536870912 : 268435456;
        }
        int i10 = (i4 & 6) == 0 ? i4 | (k80Var.h(jd1Var3) ? 4 : 2) : i4;
        int i11 = i5 & 2048;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            i10 |= k80Var.h(hd1Var) ? 32 : 16;
        }
        if (k80Var.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
            java.lang.Object obj2 = defpackage.z70.a;
            if (i11 != 0) {
                java.lang.Object objP = k80Var.P();
                if (objP == obj2) {
                    objP = new defpackage.lp(23);
                    k80Var.l0(objP);
                }
                hd1Var3 = (defpackage.hd1) objP;
            } else {
                hd1Var3 = hd1Var;
            }
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            if (!z && !list.isEmpty()) {
                k80Var.b0(187297087);
                defpackage.xr1.p(k80Var, androidx.compose.foundation.layout.d.e(qo2Var, f));
                k80Var.p(false);
                defpackage.ll3 ll3VarT = k80Var.t();
                if (ll3VarT != null) {
                    final int i12 = 0;
                    xd1Var = new defpackage.xd1() { // from class: me2
                        @Override // defpackage.xd1
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            int i13 = i12;
                            defpackage.as4 as4Var = defpackage.as4.a;
                            int i14 = i4;
                            int i15 = i3;
                            switch (i13) {
                                case 0:
                                    ((java.lang.Integer) obj4).getClass();
                                    int iG = defpackage.st1.G(i15 | 1);
                                    int iG2 = defpackage.st1.G(i14);
                                    defpackage.pc1.d(list, i7, z, z2, f, f4, str, i2, jd1Var, jd1Var2, jd1Var3, hd1Var3, (defpackage.k80) obj3, iG, iG2, i5);
                                    break;
                                default:
                                    ((java.lang.Integer) obj4).getClass();
                                    int iG3 = defpackage.st1.G(i15 | 1);
                                    int iG4 = defpackage.st1.G(i14);
                                    defpackage.pc1.d(list, i7, z, z2, f, f4, str, i2, jd1Var, jd1Var2, jd1Var3, hd1Var3, (defpackage.k80) obj3, iG3, iG4, i5);
                                    break;
                            }
                            return as4Var;
                        }
                    };
                    ll3Var = ll3VarT;
                    ll3Var.d = xd1Var;
                }
                return;
            }
            f3 = f;
            k80Var.b0(165815947);
            k80Var.p(false);
            defpackage.yj yjVar = new defpackage.yj(24.0f, new defpackage.qj(1));
            defpackage.to2 to2VarE = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), f3);
            defpackage.ts3 ts3VarA = defpackage.ss3.a(yjVar, defpackage.d6.B, k80Var, 6);
            long j = k80Var.T;
            int i13 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarE);
            defpackage.w70.b.getClass();
            defpackage.hd1 hd1Var6 = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var6);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, ts3VarA);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i13))) {
                defpackage.ms1.G(i13, k80Var, i13, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            if (list.isEmpty()) {
                f4 = f2;
                k80Var2 = k80Var;
                hd1Var4 = hd1Var3;
                if (z2) {
                    k80Var2.b0(-1440681543);
                    for (int i14 = 0; i14 < 4; i14++) {
                        c(f4, (i8 >> 15) & 14, k80Var2, defpackage.nm2.D());
                    }
                    z3 = false;
                } else {
                    z3 = false;
                    k80Var2.b0(-1464417561);
                }
                k80Var2.p(z3);
            } else {
                k80Var.b0(-1442596165);
                k80Var.b0(-877818865);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    defpackage.zc2 zc2Var = (defpackage.zc2) it.next();
                    boolean zF = ((i10 & 14) == 4) | k80Var.f(zc2Var);
                    java.lang.Object objP2 = k80Var.P();
                    if (zF || objP2 == obj2) {
                        objP2 = new defpackage.jc(jd1Var3, 16, zc2Var);
                        k80Var.l0(objP2);
                    }
                    defpackage.hd1 hd1Var7 = (defpackage.hd1) objP2;
                    defpackage.to2 to2VarD2 = defpackage.nm2.D();
                    int i15 = i8 & 112;
                    boolean z5 = ((1879048192 & i8) == 536870912) | (i15 == i9);
                    java.lang.Object objP3 = k80Var.P();
                    if (z5 || objP3 == obj2) {
                        objP3 = new defpackage.ne2(jd1Var2, i7, 0);
                        k80Var.l0(objP3);
                    }
                    defpackage.to2 to2VarC = androidx.compose.ui.focus.a.c(to2VarD2, (defpackage.jd1) objP3);
                    boolean z6 = (i15 == 32) | ((i10 & 112) == 32) | ((234881024 & i8) == 67108864) | ((29360128 & i8) == 8388608);
                    java.lang.Object objP4 = k80Var.P();
                    if (z6 || objP4 == obj2) {
                        defpackage.hd1 hd1Var8 = hd1Var3;
                        to2Var = to2VarC;
                        i6 = 32;
                        obj = obj2;
                        java.lang.Object we2Var = new defpackage.we2(i7, hd1Var8, jd1Var, i2, 0);
                        hd1Var5 = hd1Var8;
                        k80Var.l0(we2Var);
                        objP4 = we2Var;
                    } else {
                        obj = obj2;
                        i6 = 32;
                        hd1Var5 = hd1Var3;
                        to2Var = to2VarC;
                    }
                    b(zc2Var, f2, str, hd1Var7, androidx.compose.ui.input.key.a.b(to2Var, (defpackage.jd1) objP4), k80Var, (i8 >> 12) & 1008);
                    i7 = i;
                    obj2 = obj;
                    i9 = i6;
                    hd1Var3 = hd1Var5;
                }
                f4 = f2;
                k80Var2 = k80Var;
                hd1Var4 = hd1Var3;
                k80Var2.p(false);
                if (list.size() < 4) {
                    k80Var2.b0(-1440855143);
                    int size = 4 - list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        defpackage.xr1.p(k80Var2, defpackage.nm2.D());
                    }
                    z4 = false;
                } else {
                    z4 = false;
                    k80Var2.b0(-1464417561);
                }
                k80Var2.p(z4);
                k80Var2.p(z4);
            }
            k80Var2.p(true);
            hd1Var2 = hd1Var4;
        } else {
            f3 = f;
            k80Var2 = k80Var;
            k80Var2.V();
            hd1Var2 = hd1Var;
        }
        defpackage.ll3 ll3VarT2 = k80Var2.t();
        if (ll3VarT2 != null) {
            final int i17 = 1;
            final float f5 = f3;
            xd1Var = new defpackage.xd1() { // from class: me2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    int i132 = i17;
                    defpackage.as4 as4Var = defpackage.as4.a;
                    int i142 = i4;
                    int i152 = i3;
                    switch (i132) {
                        case 0:
                            ((java.lang.Integer) obj4).getClass();
                            int iG = defpackage.st1.G(i152 | 1);
                            int iG2 = defpackage.st1.G(i142);
                            defpackage.pc1.d(list, i, z, z2, f5, f4, str, i2, jd1Var, jd1Var2, jd1Var3, hd1Var2, (defpackage.k80) obj3, iG, iG2, i5);
                            break;
                        default:
                            ((java.lang.Integer) obj4).getClass();
                            int iG3 = defpackage.st1.G(i152 | 1);
                            int iG4 = defpackage.st1.G(i142);
                            defpackage.pc1.d(list, i, z, z2, f5, f4, str, i2, jd1Var, jd1Var2, jd1Var3, hd1Var2, (defpackage.k80) obj3, iG3, iG4, i5);
                            break;
                    }
                    return as4Var;
                }
            };
            ll3Var = ll3VarT2;
            ll3Var.d = xd1Var;
        }
    }

    public static final java.lang.String d0(defpackage.xw xwVar) {
        xwVar.getClass();
        if (!defpackage.vp0.o(xwVar)) {
            defpackage.hj0 hj0VarE = xwVar.e();
            defpackage.yo2 yo2Var = hj0VarE instanceof defpackage.yo2 ? (defpackage.yo2) hj0VarE : null;
            if (yo2Var != null && !yo2Var.getName().i) {
                defpackage.xw xwVarA = xwVar.b0();
                defpackage.l34 l34Var = xwVarA instanceof defpackage.l34 ? (defpackage.l34) xwVarA : null;
                if (l34Var != null) {
                    return defpackage.dc1.V(yo2Var, c0(l34Var, 3));
                }
            }
        }
        return null;
    }

    public static final long e(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final java.util.Collection e0(java.util.Collection collection, java.util.Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final defpackage.wt3 f0(defpackage.mw mwVar, defpackage.or1 or1Var, java.lang.String str, android.os.Bundle bundle) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        defpackage.vt3 vt3Var;
        mwVar.getClass();
        or1Var.getClass();
        android.os.Bundle bundleF = mwVar.f(str);
        if (bundleF != null) {
            bundle = bundleF;
        }
        if (bundle == null) {
            vt3Var = new defpackage.vt3();
        } else {
            java.lang.ClassLoader classLoader = defpackage.vt3.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            defpackage.vi2 vi2Var = new defpackage.vi2(bundle.size());
            for (java.lang.String str2 : bundle.keySet()) {
                str2.getClass();
                vi2Var.put(str2, bundle.get(str2));
            }
            vt3Var = new defpackage.vt3(vi2Var.b());
        }
        defpackage.wt3 wt3Var = new defpackage.wt3(str, vt3Var);
        wt3Var.u(mwVar, or1Var);
        Q0(mwVar, or1Var);
        return wt3Var;
    }

    public static final void g(defpackage.k80 k80Var, int i) {
        k80Var.d0(-755861130);
        int i2 = 1;
        if (k80Var.S(i & 1, i != 0)) {
            long jC = defpackage.g40.c(0.08f, defpackage.g40.c);
            defpackage.gs3 gs3VarA = defpackage.hs3.a(19.0f);
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.a.b(qo2Var, jC, gs3VarA), 4.2f, 2.2f);
            defpackage.ts3 ts3VarA = defpackage.ss3.a(new defpackage.yj(5.0f, new defpackage.qj(i2)), defpackage.d6.C, k80Var, 54);
            long j = k80Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarE);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(j90Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, ts3VarA);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var, i3, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            k80Var.b0(-830289108);
            java.util.Iterator it = defpackage.pp4.M(new defpackage.ow0(40.0f), new defpackage.ow0(56.0f), new defpackage.ow0(48.0f)).iterator();
            while (it.hasNext()) {
                defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.l(qo2Var, ((defpackage.ow0) it.next()).f), 30.0f), defpackage.hs3.a(16.0f)), defpackage.g40.c(0.29f, defpackage.g40.c), defpackage.pp4.f), k80Var, 0);
            }
            k80Var.p(false);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.b50(i, 8);
        }
    }

    public static defpackage.kq3 g0(android.os.Handler handler) {
        return new defpackage.kq3(handler);
    }

    public static final void h(final java.util.List list, final defpackage.jd1 jd1Var, final boolean z, final java.lang.String str, final defpackage.hd1 hd1Var, final float f, final float f2, final float f3, final java.lang.String str2, final int i, final defpackage.jd1 jd1Var2, final defpackage.jd1 jd1Var3, final defpackage.jd1 jd1Var4, final defpackage.ta1 ta1Var, final defpackage.hd1 hd1Var2, defpackage.k80 k80Var, final int i2) {
        defpackage.k80 k80Var2;
        defpackage.ta1 ta1Var2;
        boolean z2;
        defpackage.k80 k80Var3 = k80Var;
        k80Var3.d0(-1798574373);
        int i3 = i2 | (k80Var3.h(list) ? 4 : 2);
        boolean zG = k80Var3.g(z);
        int i4 = io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        float f4 = f2;
        java.lang.String str3 = str2;
        int i5 = i3 | (zG ? 256 : 128) | (k80Var3.f(str) ? 2048 : 1024) | (k80Var3.h(hd1Var) ? 16384 : 8192) | (k80Var3.c(f4) ? 1048576 : 524288) | (k80Var3.c(f3) ? 8388608 : 4194304) | (k80Var3.f(str3) ? 67108864 : 33554432) | (k80Var3.d(i) ? 536870912 : 268435456);
        int i6 = (k80Var3.h(jd1Var2) ? 4 : 2) | 27696;
        if (k80Var3.h(jd1Var4)) {
            i4 = 256;
        }
        int i7 = i6 | i4;
        if (k80Var3.S(i5 & 1, ((306717843 & i5) == 306717842 && (i7 & 9363) == 9362) ? false : true)) {
            defpackage.wr0 wr0Var = (defpackage.wr0) k80Var3.j(defpackage.vr0.a);
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarA = androidx.compose.ui.focus.a.a(qo2Var, ta1Var);
            boolean zH = k80Var3.h(wr0Var);
            java.lang.Object objP = k80Var3.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (zH || objP == cjVar) {
                objP = new defpackage.ic(13, wr0Var);
                k80Var3.l0(objP);
            }
            defpackage.hd1 hd1Var3 = (defpackage.hd1) objP;
            if (hd1Var3 == null || (ta1Var2 = (defpackage.ta1) hd1Var3.invoke()) == null) {
                ta1Var2 = defpackage.ta1.b;
            }
            defpackage.to2 to2VarD = androidx.compose.foundation.a.d(androidx.compose.ui.focus.a.b(to2VarA, ta1Var2));
            defpackage.v40 v40VarA = defpackage.t40.a(new defpackage.yj(28.0f, new defpackage.qj(1)), defpackage.d6.E, k80Var3, 6);
            long j = k80Var3.T;
            int i8 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var3.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var3, to2VarD);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var3.f0();
            boolean z3 = 6;
            if (k80Var3.S) {
                k80Var3.k(j90Var);
            } else {
                k80Var3.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var3, qfVar, v40VarA);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var3, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            int i9 = i7;
            if (k80Var3.S || !defpackage.ct1.g(k80Var3.P(), java.lang.Integer.valueOf(i8))) {
                defpackage.ms1.G(i8, k80Var3, i8, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var3, qfVar4, to2VarD2);
            if (!z && str != null && list.isEmpty()) {
                k80Var3.b0(357025292);
                i(str, hd1Var, k80Var3, (i5 >> 9) & 126);
                k80Var3.p(false);
                k80Var2 = k80Var3;
                z2 = true;
            } else if (z && list.isEmpty()) {
                k80Var3.b0(357158654);
                int i10 = 0;
                while (i10 < 3) {
                    java.lang.Object objP2 = k80Var3.P();
                    int i11 = 23;
                    if (objP2 == cjVar) {
                        objP2 = new defpackage.pg(i11);
                        k80Var3.l0(objP2);
                    }
                    defpackage.jd1 jd1Var5 = (defpackage.jd1) objP2;
                    java.lang.Object objP3 = k80Var3.P();
                    if (objP3 == cjVar) {
                        objP3 = new defpackage.pg(i11);
                        k80Var3.l0(objP3);
                    }
                    defpackage.jd1 jd1Var6 = (defpackage.jd1) objP3;
                    java.lang.Object objP4 = k80Var3.P();
                    if (objP4 == cjVar) {
                        objP4 = new defpackage.kw0(16);
                        k80Var3.l0(objP4);
                    }
                    defpackage.k80 k80Var4 = k80Var3;
                    d(defpackage.m01.f, i10, true, true, f3, f4, str3, 0, jd1Var5, jd1Var6, (defpackage.jd1) objP4, null, k80Var4, ((i5 >> 9) & 57344) | 918556038 | ((i5 >> 3) & 458752) | ((i5 >> 6) & 3670016), 6, 2048);
                    i10++;
                    f4 = f2;
                    str3 = str2;
                    cjVar = cjVar;
                    k80Var3 = k80Var4;
                    z3 = z3;
                }
                k80Var2 = k80Var3;
                k80Var2.p(false);
                z2 = true;
            } else {
                k80Var2 = k80Var3;
                z2 = true;
                if (z || !list.isEmpty()) {
                    k80Var2.b0(358135588);
                    int i12 = 0;
                    for (java.lang.Object obj : list) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            defpackage.pp4.Z();
                            throw null;
                        }
                        int i14 = i5 >> 6;
                        defpackage.k80 k80Var5 = k80Var2;
                        d((java.util.List) obj, i12, ((java.lang.Boolean) jd1Var.invoke(java.lang.Integer.valueOf(i12))).booleanValue(), false, f3, f2, str2, i, jd1Var2, jd1Var3, jd1Var4, hd1Var2, k80Var5, ((i5 >> 9) & 57344) | 3072 | ((i5 >> 3) & 458752) | (i14 & 3670016) | (i14 & 29360128) | ((i9 << 24) & 234881024) | 805306368, ((i9 >> 6) & 14) | 48, 0);
                        i9 = i9;
                        k80Var2 = k80Var5;
                        i12 = i13;
                    }
                    k80Var2.p(false);
                } else {
                    k80Var2.b0(357732278);
                    defpackage.to2 to2VarE = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), 300.0f);
                    defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
                    long j2 = k80Var2.T;
                    int i15 = (int) (j2 ^ (j2 >>> 32));
                    defpackage.y53 y53VarL2 = k80Var2.l();
                    defpackage.to2 to2VarD3 = defpackage.uj2.D(k80Var2, to2VarE);
                    k80Var2.f0();
                    if (k80Var2.S) {
                        k80Var2.k(j90Var);
                    } else {
                        k80Var2.o0();
                    }
                    defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
                    defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
                    if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i15))) {
                        defpackage.ms1.G(i15, k80Var2, i15, qfVar3);
                    }
                    defpackage.ht1.J(k80Var2, qfVar4, to2VarD3);
                    defpackage.ii4.a("暂无频道", null, defpackage.g40.c(0.6f, defpackage.g40.c), defpackage.nq1.A(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var, 3462, 0, 131058);
                    k80Var2 = k80Var;
                    k80Var2.p(true);
                    k80Var2.p(false);
                }
            }
            k80Var2.p(z2);
        } else {
            k80Var2 = k80Var3;
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1(list, jd1Var, z, str, hd1Var, f, f2, f3, str2, i, jd1Var2, jd1Var3, jd1Var4, ta1Var, hd1Var2, i2) { // from class: ue2
                public final /* synthetic */ int A;
                public final /* synthetic */ defpackage.jd1 B;
                public final /* synthetic */ defpackage.jd1 C;
                public final /* synthetic */ defpackage.jd1 D;
                public final /* synthetic */ defpackage.ta1 E;
                public final /* synthetic */ defpackage.hd1 F;
                public final /* synthetic */ java.util.List f;
                public final /* synthetic */ defpackage.jd1 i;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ java.lang.String u;
                public final /* synthetic */ defpackage.hd1 v;
                public final /* synthetic */ float w;
                public final /* synthetic */ float x;
                public final /* synthetic */ float y;
                public final /* synthetic */ java.lang.String z;

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int iG = defpackage.st1.G(49);
                    defpackage.pc1.h(this.f, this.i, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (defpackage.k80) obj2, iG);
                    return defpackage.as4.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ex h0(defpackage.zw r2, defpackage.ex r3, boolean r4) {
        /*
            r2.getClass()
            int r0 = defpackage.lq1.a
            boolean r0 = r2 instanceof defpackage.vf3
            if (r0 == 0) goto L1a
            r0 = r2
            vf3 r0 = (defpackage.vf3) r0
            sf3 r0 = r0.d0()
            r0.getClass()
            boolean r0 = defpackage.lq1.c(r0)
            if (r0 == 0) goto L1a
            goto L64
        L1a:
            java.util.List r0 = r2.E()
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L28
            goto L46
        L28:
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            vt4 r1 = (defpackage.vt4) r1
            s32 r1 = r1.getType()
            r1.getClass()
            boolean r1 = defpackage.lq1.b(r1)
            if (r1 == 0) goto L2c
            goto L64
        L46:
            s32 r0 = r2.getReturnType()
            r1 = 1
            if (r0 == 0) goto L54
            boolean r0 = defpackage.lq1.b(r0)
            if (r0 != r1) goto L54
            goto L64
        L54:
            boolean r0 = r3 instanceof defpackage.vs
            if (r0 != 0) goto L6a
            s32 r0 = s0(r2)
            if (r0 == 0) goto L6a
            boolean r0 = defpackage.lq1.b(r0)
            if (r0 != r1) goto L6a
        L64:
            bq1 r0 = new bq1
            r0.<init>(r2, r3, r4)
            return r0
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.h0(zw, ex, boolean):ex");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r31, defpackage.hd1 r32, defpackage.k80 r33, int r34) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.i(java.lang.String, hd1, k80, int):void");
    }

    public static defpackage.fx4 i0(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.RuntimeException(defpackage.sr2.i(cls, "Cannot create an instance of "));
            }
            try {
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (defpackage.fx4) objNewInstance;
            } catch (java.lang.IllegalAccessException e2) {
                defpackage.jc2.l(defpackage.sr2.i(cls, "Cannot create an instance of "), e2);
                return null;
            } catch (java.lang.InstantiationException e3) {
                defpackage.jc2.l(defpackage.sr2.i(cls, "Cannot create an instance of "), e3);
                return null;
            }
        } catch (java.lang.NoSuchMethodException e4) {
            defpackage.jc2.l(defpackage.sr2.i(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    public static final void j(java.lang.String str, defpackage.q60 q60Var, defpackage.k80 k80Var, int i) {
        defpackage.xd1 xd1Var;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(1959822904);
        int i2 = 1;
        if (k80Var2.S(i & 1, (i & 19) != 18)) {
            defpackage.ts3 ts3VarA = defpackage.ss3.a(new defpackage.yj(5.0f, new defpackage.qj(i2)), defpackage.d6.C, k80Var2, 54);
            long j = k80Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, qo2Var);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var2, qfVar, ts3VarA);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var2, i3, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD);
            defpackage.to2 to2VarL = androidx.compose.foundation.layout.d.l(qo2Var, 48.0f);
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.v, false);
            long j2 = k80Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            defpackage.y53 y53VarL2 = k80Var2.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarL);
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i4))) {
                defpackage.ms1.G(i4, k80Var2, i4, qfVar3);
            }
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD2);
            defpackage.ii4.a(str, null, defpackage.g40.c, defpackage.nq1.A(11), defpackage.jc1.z, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var2, 200070, 0, 131026);
            k80Var2 = k80Var2;
            k80Var2.p(true);
            xd1Var = q60Var;
            xd1Var.invoke(k80Var2, 6);
            k80Var2.p(true);
        } else {
            xd1Var = q60Var;
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.kt(i, 7, str, xd1Var);
        }
    }

    public static final java.lang.String j0(long j) {
        java.lang.String str = new java.text.SimpleDateFormat("H:mm", java.util.Locale.getDefault()).format(new java.util.Date(java.lang.System.currentTimeMillis() + j));
        str.getClass();
        return str;
    }

    public static final void k(final java.util.List list, final java.util.List list2, final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, final boolean z3, final defpackage.jd1 jd1Var, final defpackage.jd1 jd1Var2, final defpackage.ta1 ta1Var, final defpackage.ta1 ta1Var2, final defpackage.ta1 ta1Var3, final defpackage.hd1 hd1Var, defpackage.k80 k80Var, final int i) {
        boolean z4;
        k80Var.d0(1255251537);
        int i2 = i | (k80Var.h(list) ? 4 : 2) | (k80Var.h(list2) ? 32 : 16) | (k80Var.f(str) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var.f(str2) ? 2048 : 1024) | (k80Var.g(z) ? 16384 : 8192) | (k80Var.g(z2) ? 131072 : 65536) | (k80Var.g(z3) ? 1048576 : 524288) | (k80Var.h(jd1Var) ? 8388608 : 4194304) | (k80Var.h(jd1Var2) ? 67108864 : 33554432);
        int i3 = 1;
        if (k80Var.S(i2 & 1, ((306783379 & i2) == 306783378 && (((k80Var.f(ta1Var3) ? ' ' : (char) 16) | 390) & 147) == 146) ? false : true)) {
            defpackage.to2 to2VarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.d.c(defpackage.qo2.f, 1.0f), 0.0f, 11.0f, 0.0f, 18.0f, 5);
            defpackage.v40 v40VarA = defpackage.t40.a(new defpackage.yj(14.0f, new defpackage.qj(i3)), defpackage.d6.E, k80Var, 6);
            long j = k80Var.T;
            int i4 = (int) (j ^ (j >>> 32));
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
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i4))) {
                defpackage.ms1.G(i4, k80Var, i4, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            if (z) {
                k80Var.b0(866819084);
                j("直播源", defpackage.q8.n0(1745063308, new defpackage.ke2(ta1Var3, z2, ta1Var2, hd1Var, list, str, jd1Var, ta1Var), k80Var), k80Var, 54);
                z4 = false;
            } else {
                z4 = false;
                k80Var.b0(852925659);
            }
            k80Var.p(z4);
            if (z2) {
                k80Var.b0(867804295);
                j("分组", defpackage.q8.n0(1971736067, new defpackage.ke2(z, ta1Var3, ta1Var, hd1Var, list2, str2, jd1Var2, ta1Var2), k80Var), k80Var, 54);
                k80Var.p(z4);
            } else {
                if (z3) {
                    k80Var.b0(869333246);
                    j("分组", defpackage.f03.l, k80Var, 54);
                } else {
                    k80Var.b0(852925659);
                }
                k80Var.p(z4);
            }
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1(list, list2, str, str2, z, z2, z3, jd1Var, jd1Var2, ta1Var, ta1Var2, ta1Var3, hd1Var, i) { // from class: le2
                public final /* synthetic */ defpackage.ta1 A;
                public final /* synthetic */ defpackage.ta1 B;
                public final /* synthetic */ defpackage.ta1 C;
                public final /* synthetic */ defpackage.hd1 D;
                public final /* synthetic */ java.util.List f;
                public final /* synthetic */ java.util.List i;
                public final /* synthetic */ java.lang.String t;
                public final /* synthetic */ java.lang.String u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ defpackage.jd1 y;
                public final /* synthetic */ defpackage.jd1 z;

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iG = defpackage.st1.G(805306369);
                    defpackage.pc1.k(this.f, this.i, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (defpackage.k80) obj, iG);
                    return defpackage.as4.a;
                }
            };
        }
    }

    public static final boolean k0(int i, int i2) {
        return i == i2;
    }

    public static final void l(final defpackage.ta1 ta1Var, final defpackage.iv3 iv3Var, final defpackage.jd1 jd1Var, defpackage.k80 k80Var, int i) {
        java.lang.Object next;
        java.util.List list;
        java.lang.Object obj;
        java.lang.Object ye2Var;
        defpackage.ls2 ls2Var;
        defpackage.x33 x33Var;
        java.lang.String str;
        defpackage.ls2 ls2Var2;
        defpackage.ta1 ta1Var2;
        float f;
        k80Var.d0(1626773618);
        int i2 = i | (k80Var.f(iv3Var) ? 32 : 16);
        if (k80Var.S(i2 & 1, (i2 & 147) != 146)) {
            k80Var.X();
            if ((i & 1) != 0 && !k80Var.B()) {
                k80Var.V();
            }
            k80Var.q();
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj2 = defpackage.z70.a;
            if (objP == obj2) {
                objP = defpackage.ft4.e0(k80Var);
                k80Var.l0(objP);
            }
            final defpackage.nf0 nf0Var = (defpackage.nf0) objP;
            defpackage.yo0 yo0Var = (defpackage.yo0) k80Var.j(defpackage.k90.h);
            java.lang.Object objP2 = k80Var.P();
            java.util.List arrayList = defpackage.m01.f;
            if (objP2 == obj2) {
                objP2 = defpackage.or1.C(arrayList);
                k80Var.l0(objP2);
            }
            final defpackage.ls2 ls2Var3 = (defpackage.ls2) objP2;
            java.lang.Object objP3 = k80Var.P();
            if (objP3 == obj2) {
                objP3 = defpackage.or1.C(arrayList);
                k80Var.l0(objP3);
            }
            final defpackage.ls2 ls2Var4 = (defpackage.ls2) objP3;
            java.lang.Object objP4 = k80Var.P();
            if (objP4 == obj2) {
                objP4 = defpackage.or1.C(null);
                k80Var.l0(objP4);
            }
            final defpackage.ls2 ls2Var5 = (defpackage.ls2) objP4;
            java.lang.Object objP5 = k80Var.P();
            if (objP5 == obj2) {
                objP5 = defpackage.or1.C("all");
                k80Var.l0(objP5);
            }
            final defpackage.ls2 ls2Var6 = (defpackage.ls2) objP5;
            java.lang.Object objP6 = k80Var.P();
            if (objP6 == obj2) {
                objP6 = defpackage.or1.C(java.lang.Boolean.TRUE);
                k80Var.l0(objP6);
            }
            defpackage.ls2 ls2Var7 = (defpackage.ls2) objP6;
            java.lang.Object objP7 = k80Var.P();
            if (objP7 == obj2) {
                objP7 = defpackage.or1.C(null);
                k80Var.l0(objP7);
            }
            defpackage.ls2 ls2Var8 = (defpackage.ls2) objP7;
            java.lang.Object objP8 = k80Var.P();
            if (objP8 == obj2) {
                objP8 = new defpackage.x33(0);
                k80Var.l0(objP8);
            }
            final defpackage.x33 x33Var2 = (defpackage.x33) objP8;
            java.lang.Object objP9 = k80Var.P();
            if (objP9 == obj2) {
                objP9 = defpackage.ms1.t(k80Var);
            }
            final defpackage.ta1 ta1Var3 = (defpackage.ta1) objP9;
            java.lang.Object objP10 = k80Var.P();
            if (objP10 == obj2) {
                objP10 = defpackage.ms1.t(k80Var);
            }
            final defpackage.ta1 ta1Var4 = (defpackage.ta1) objP10;
            java.lang.Object objP11 = k80Var.P();
            if (objP11 == obj2) {
                objP11 = defpackage.ms1.t(k80Var);
            }
            defpackage.ta1 ta1Var5 = (defpackage.ta1) objP11;
            android.content.res.Configuration configuration = (android.content.res.Configuration) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a);
            float f2 = configuration.screenWidthDp;
            float f3 = configuration.screenHeightDp;
            final float fV = yo0Var.V(f3);
            final float f4 = ((f2 - 116.0f) - 72.0f) / 4.0f;
            final float f5 = f4 / 2.0f;
            float f6 = f5 + 8.0f + 18.0f + 10.0f;
            final float f7 = (f3 / 2.0f) - 67.5f;
            boolean zF = k80Var.f((java.lang.String) ls2Var6.getValue()) | k80Var.f((java.util.List) ls2Var4.getValue());
            java.lang.Object objP12 = k80Var.P();
            if (zF || objP12 == obj2) {
                if (defpackage.ct1.g((java.lang.String) ls2Var6.getValue(), "all")) {
                    java.util.List list2 = (java.util.List) ls2Var4.getValue();
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        defpackage.e40.j0(arrayList, ((defpackage.ad2) it.next()).b);
                    }
                } else {
                    java.util.Iterator it2 = ((java.util.List) ls2Var4.getValue()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        java.util.Iterator it3 = it2;
                        if (defpackage.ct1.g(((defpackage.ad2) next).a, (java.lang.String) ls2Var6.getValue())) {
                            break;
                        } else {
                            it2 = it3;
                        }
                    }
                    defpackage.ad2 ad2Var = (defpackage.ad2) next;
                    if (ad2Var != null && (list = ad2Var.b) != null) {
                        arrayList = list;
                    }
                }
                k80Var.l0(arrayList);
                objP12 = arrayList;
            }
            java.util.List list3 = (java.util.List) objP12;
            boolean zF2 = k80Var.f(list3);
            java.lang.Object objP13 = k80Var.P();
            if (zF2 || objP13 == obj2) {
                objP13 = defpackage.y30.p0(4, list3);
                k80Var.l0(objP13);
            }
            final java.util.List list4 = (java.util.List) objP13;
            java.lang.Object objP14 = k80Var.P();
            if (objP14 == obj2) {
                objP14 = new defpackage.x33(0);
                k80Var.l0(objP14);
            }
            defpackage.x33 x33Var3 = (defpackage.x33) objP14;
            final float fV2 = yo0Var.V(f6);
            final float fV3 = yo0Var.V(28.0f);
            final float fV4 = yo0Var.V(64.0f);
            java.lang.Object objP15 = k80Var.P();
            if (objP15 == obj2) {
                objP15 = new defpackage.bf2();
                k80Var.l0(objP15);
            }
            java.lang.Object obj3 = (defpackage.bf2) objP15;
            boolean zH = k80Var.h(nf0Var);
            java.lang.Object objP16 = k80Var.P();
            if (zH || objP16 == obj2) {
                obj = obj3;
                ls2Var = ls2Var7;
                x33Var = x33Var3;
                str = "all";
                ls2Var2 = ls2Var8;
                ye2Var = new defpackage.ye2(nf0Var, ls2Var, ls2Var2, ls2Var3, ls2Var5, ls2Var4, ls2Var6, null);
                k80Var.l0(ye2Var);
            } else {
                ye2Var = objP16;
                obj = obj3;
                ls2Var = ls2Var7;
                x33Var = x33Var3;
                str = "all";
                ls2Var2 = ls2Var8;
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) ye2Var, defpackage.as4.a);
            boolean zF3 = k80Var.f((java.util.List) ls2Var4.getValue());
            java.lang.Object objP17 = k80Var.P();
            if (zF3 || objP17 == obj2) {
                java.util.List listL = defpackage.pp4.L(new defpackage.v61(str, "全部"));
                java.util.List list5 = (java.util.List) ls2Var4.getValue();
                ta1Var2 = ta1Var5;
                f = f6;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, list5));
                java.util.Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    java.lang.String str2 = ((defpackage.ad2) it4.next()).a;
                    arrayList2.add(new defpackage.v61(str2, str2));
                }
                objP17 = defpackage.y30.L0(listL, arrayList2);
                k80Var.l0(objP17);
            } else {
                ta1Var2 = ta1Var5;
                f = f6;
            }
            final java.util.List list6 = (java.util.List) objP17;
            boolean zF4 = k80Var.f((java.util.List) ls2Var3.getValue());
            java.lang.Object objP18 = k80Var.P();
            java.lang.Object obj4 = objP18;
            if (zF4 || objP18 == obj2) {
                java.util.List<org.moontechlab.selenetv.model.LiveSource> list7 = (java.util.List) ls2Var3.getValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.z30.g0(10, list7));
                for (org.moontechlab.selenetv.model.LiveSource liveSource : list7) {
                    arrayList3.add(new defpackage.v61(liveSource.a, liveSource.b));
                }
                k80Var.l0(arrayList3);
                obj4 = arrayList3;
            }
            final java.util.List list8 = (java.util.List) obj4;
            defpackage.ki3 ki3Var = defpackage.du.a;
            final defpackage.bu buVar = (defpackage.bu) k80Var.j(ki3Var);
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.i, false);
            long j = k80Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, fillElement);
            defpackage.w70.b.getClass();
            defpackage.hd1 hd1Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, fk2VarD);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var, i3, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            final defpackage.x33 x33Var4 = x33Var;
            final defpackage.ta1 ta1Var6 = ta1Var2;
            final defpackage.ls2 ls2Var9 = ls2Var;
            final defpackage.ls2 ls2Var10 = ls2Var2;
            final float f8 = f;
            defpackage.ft4.L(ki3Var.a(obj), defpackage.q8.n0(-565306568, new defpackage.xd1() { // from class: te2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    defpackage.x33 x33Var5;
                    java.lang.Object af2Var;
                    boolean z;
                    defpackage.ls2 ls2Var11;
                    defpackage.ls2 ls2Var12;
                    defpackage.ta1 ta1Var7;
                    defpackage.x33 x33Var6;
                    java.lang.String str3;
                    defpackage.k80 k80Var2 = (defpackage.k80) obj5;
                    int iIntValue = ((java.lang.Integer) obj6).intValue();
                    if (k80Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.foundation.layout.FillElement fillElement2 = androidx.compose.foundation.layout.d.c;
                        final defpackage.iv3 iv3Var2 = iv3Var;
                        defpackage.to2 to2VarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.a.d(defpackage.ht1.T(fillElement2, iv3Var2)), 58.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f7, 7);
                        defpackage.v40 v40VarA = defpackage.t40.a(defpackage.uj2.c, defpackage.d6.E, k80Var2, 0);
                        long j2 = k80Var2.T;
                        int i4 = (int) (j2 ^ (j2 >>> 32));
                        defpackage.y53 y53VarL2 = k80Var2.l();
                        defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarH);
                        defpackage.w70.b.getClass();
                        defpackage.hd1 hd1Var2 = defpackage.v70.b;
                        k80Var2.f0();
                        if (k80Var2.S) {
                            k80Var2.k(hd1Var2);
                        } else {
                            k80Var2.o0();
                        }
                        defpackage.ht1.J(k80Var2, defpackage.v70.f, v40VarA);
                        defpackage.ht1.J(k80Var2, defpackage.v70.e, y53VarL2);
                        defpackage.qf qfVar2 = defpackage.v70.g;
                        if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i4))) {
                            defpackage.ms1.G(i4, k80Var2, i4, qfVar2);
                        }
                        defpackage.ht1.J(k80Var2, defpackage.v70.d, to2VarD2);
                        defpackage.qo2 qo2Var = defpackage.qo2.f;
                        defpackage.xr1.p(k80Var2, androidx.compose.foundation.layout.d.e(qo2Var, 64.0f));
                        defpackage.mi3 mi3VarA = defpackage.du.a.a(buVar);
                        final defpackage.x33 x33Var7 = x33Var4;
                        final java.util.List list9 = list8;
                        final java.util.List list10 = list6;
                        final defpackage.nf0 nf0Var2 = nf0Var;
                        final defpackage.ta1 ta1Var8 = ta1Var3;
                        final defpackage.ta1 ta1Var9 = ta1Var4;
                        final defpackage.ta1 ta1Var10 = ta1Var;
                        final defpackage.ls2 ls2Var13 = ls2Var5;
                        final defpackage.ls2 ls2Var14 = ls2Var6;
                        final defpackage.ls2 ls2Var15 = ls2Var3;
                        final defpackage.ls2 ls2Var16 = ls2Var4;
                        final defpackage.ls2 ls2Var17 = ls2Var9;
                        final defpackage.x33 x33Var8 = x33Var2;
                        final defpackage.ls2 ls2Var18 = ls2Var10;
                        final defpackage.ta1 ta1Var11 = ta1Var6;
                        defpackage.ft4.L(mi3VarA, defpackage.q8.n0(-1390615442, new defpackage.xd1() { // from class: ie2
                            @Override // defpackage.xd1
                            public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                java.lang.String str4;
                                final defpackage.x33 x33Var9;
                                final defpackage.ls2 ls2Var19;
                                defpackage.nf0 nf0Var3;
                                defpackage.k80 k80Var3 = (defpackage.k80) obj7;
                                int iIntValue2 = ((java.lang.Integer) obj8).intValue();
                                if (k80Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    java.lang.Object objP19 = k80Var3.P();
                                    defpackage.cj cjVar = defpackage.z70.a;
                                    if (objP19 == cjVar) {
                                        objP19 = new defpackage.k0(18, x33Var7);
                                        k80Var3.l0(objP19);
                                    }
                                    defpackage.to2 to2VarB = androidx.compose.ui.layout.a.b(defpackage.qo2.f, (defpackage.jd1) objP19);
                                    defpackage.fk2 fk2VarD2 = defpackage.ys.d(defpackage.d6.i, false);
                                    long j3 = k80Var3.T;
                                    int i5 = (int) (j3 ^ (j3 >>> 32));
                                    defpackage.y53 y53VarL3 = k80Var3.l();
                                    defpackage.to2 to2VarD3 = defpackage.uj2.D(k80Var3, to2VarB);
                                    defpackage.w70.b.getClass();
                                    defpackage.j90 j90Var = defpackage.v70.b;
                                    k80Var3.f0();
                                    if (k80Var3.S) {
                                        k80Var3.k(j90Var);
                                    } else {
                                        k80Var3.o0();
                                    }
                                    defpackage.ht1.J(k80Var3, defpackage.v70.f, fk2VarD2);
                                    defpackage.ht1.J(k80Var3, defpackage.v70.e, y53VarL3);
                                    defpackage.qf qfVar3 = defpackage.v70.g;
                                    if (k80Var3.S || !defpackage.ct1.g(k80Var3.P(), java.lang.Integer.valueOf(i5))) {
                                        defpackage.ms1.G(i5, k80Var3, i5, qfVar3);
                                    }
                                    defpackage.ht1.J(k80Var3, defpackage.v70.d, to2VarD3);
                                    final defpackage.ls2 ls2Var20 = ls2Var13;
                                    org.moontechlab.selenetv.model.LiveSource liveSource2 = (org.moontechlab.selenetv.model.LiveSource) ls2Var20.getValue();
                                    if (liveSource2 == null || (str4 = liveSource2.a) == null) {
                                        str4 = "";
                                    }
                                    defpackage.ls2 ls2Var21 = ls2Var14;
                                    java.lang.String str5 = (java.lang.String) ls2Var21.getValue();
                                    final defpackage.ls2 ls2Var22 = ls2Var15;
                                    boolean z2 = ((java.util.List) ls2Var22.getValue()).size() > 1;
                                    final defpackage.ls2 ls2Var23 = ls2Var16;
                                    boolean zIsEmpty = ((java.util.List) ls2Var23.getValue()).isEmpty();
                                    final defpackage.ls2 ls2Var24 = ls2Var17;
                                    boolean z3 = (zIsEmpty || ((java.lang.Boolean) ls2Var24.getValue()).booleanValue()) ? false : true;
                                    boolean zBooleanValue = ((java.lang.Boolean) ls2Var24.getValue()).booleanValue();
                                    final defpackage.nf0 nf0Var4 = nf0Var2;
                                    boolean zH2 = k80Var3.h(nf0Var4);
                                    java.lang.Object objP20 = k80Var3.P();
                                    defpackage.x33 x33Var10 = x33Var8;
                                    if (zH2 || objP20 == cjVar) {
                                        final defpackage.ls2 ls2Var25 = ls2Var18;
                                        x33Var9 = x33Var10;
                                        ls2Var19 = ls2Var21;
                                        objP20 = new defpackage.jd1() { // from class: ve2
                                            @Override // defpackage.jd1
                                            public final java.lang.Object invoke(java.lang.Object obj9) {
                                                java.lang.Object next2;
                                                java.lang.String str6 = (java.lang.String) obj9;
                                                str6.getClass();
                                                java.util.Iterator it5 = ((java.util.List) ls2Var22.getValue()).iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        next2 = null;
                                                        break;
                                                    }
                                                    next2 = it5.next();
                                                    if (defpackage.ct1.g(((org.moontechlab.selenetv.model.LiveSource) next2).a, str6)) {
                                                        break;
                                                    }
                                                }
                                                org.moontechlab.selenetv.model.LiveSource liveSource3 = (org.moontechlab.selenetv.model.LiveSource) next2;
                                                if (liveSource3 != null) {
                                                    java.lang.String str7 = liveSource3.a;
                                                    defpackage.ls2 ls2Var26 = ls2Var20;
                                                    org.moontechlab.selenetv.model.LiveSource liveSource4 = (org.moontechlab.selenetv.model.LiveSource) ls2Var26.getValue();
                                                    if (!defpackage.ct1.g(str7, liveSource4 != null ? liveSource4.a : null)) {
                                                        ls2Var26.setValue(liveSource3);
                                                        x33Var9.k(0);
                                                        defpackage.u22.C(nf0Var4, null, new defpackage.oa(ls2Var23, ls2Var19, ls2Var24, ls2Var25, liveSource3, null, 6), 3);
                                                    }
                                                }
                                                return defpackage.as4.a;
                                            }
                                        };
                                        nf0Var3 = nf0Var4;
                                        k80Var3.l0(objP20);
                                    } else {
                                        x33Var9 = x33Var10;
                                        ls2Var19 = ls2Var21;
                                        nf0Var3 = nf0Var4;
                                    }
                                    defpackage.jd1 jd1Var2 = (defpackage.jd1) objP20;
                                    boolean zH3 = k80Var3.h(nf0Var3);
                                    defpackage.iv3 iv3Var3 = iv3Var2;
                                    boolean zF5 = zH3 | k80Var3.f(iv3Var3);
                                    java.lang.Object objP21 = k80Var3.P();
                                    if (zF5 || objP21 == cjVar) {
                                        defpackage.ge0 ge0Var = new defpackage.ge0(nf0Var3, ls2Var19, x33Var9, iv3Var3, 6);
                                        k80Var3.l0(ge0Var);
                                        objP21 = ge0Var;
                                    }
                                    defpackage.jd1 jd1Var3 = (defpackage.jd1) objP21;
                                    java.lang.Object objP22 = k80Var3.P();
                                    if (objP22 == cjVar) {
                                        objP22 = new defpackage.je2(ta1Var11, 0);
                                        k80Var3.l0(objP22);
                                    }
                                    defpackage.pc1.k(list9, list10, str4, str5, z2, z3, zBooleanValue, jd1Var2, jd1Var3, ta1Var8, ta1Var9, ta1Var10, (defpackage.hd1) objP22, k80Var3, 805306368);
                                    k80Var3.p(true);
                                } else {
                                    k80Var3.V();
                                }
                                return defpackage.as4.a;
                            }
                        }, k80Var2), k80Var2, 56);
                        defpackage.xr1.p(k80Var2, androidx.compose.foundation.layout.d.e(qo2Var, 14.0f));
                        java.lang.Object objP19 = k80Var2.P();
                        java.lang.Object obj7 = defpackage.z70.a;
                        if (objP19 == obj7) {
                            objP19 = new defpackage.ze2(x33Var8, 0);
                            k80Var2.l0(objP19);
                        }
                        defpackage.jd1 jd1Var2 = (defpackage.jd1) ((defpackage.j02) objP19);
                        boolean zBooleanValue = ((java.lang.Boolean) ls2Var17.getValue()).booleanValue();
                        java.lang.String str4 = (java.lang.String) ls2Var18.getValue();
                        boolean zH2 = k80Var2.h(nf0Var2);
                        java.lang.Object objP20 = k80Var2.P();
                        if (zH2 || objP20 == obj7) {
                            objP20 = new defpackage.oe2(nf0Var2, ls2Var17, ls2Var18, ls2Var15, ls2Var13, ls2Var16, ls2Var14, x33Var8);
                            x33Var5 = x33Var8;
                            k80Var2.l0(objP20);
                        } else {
                            x33Var5 = x33Var8;
                        }
                        defpackage.hd1 hd1Var3 = (defpackage.hd1) objP20;
                        org.moontechlab.selenetv.model.LiveSource liveSource2 = (org.moontechlab.selenetv.model.LiveSource) ls2Var13.getValue();
                        java.lang.String str5 = "AptvPlayer/1.4.10";
                        if (liveSource2 != null && (str3 = liveSource2.d) != null && str3.length() != 0) {
                            str5 = str3;
                        }
                        java.lang.String str6 = str5;
                        java.util.List list11 = list4;
                        int size = list11.size();
                        boolean zH3 = k80Var2.h(list11);
                        float f9 = fV4;
                        boolean zC = zH3 | k80Var2.c(f9);
                        float f10 = fV2;
                        boolean zC2 = zC | k80Var2.c(f10);
                        float f11 = fV3;
                        boolean zC3 = zC2 | k80Var2.c(f11);
                        float f12 = fV;
                        boolean zC4 = zC3 | k80Var2.c(f12) | k80Var2.h(nf0Var2) | k80Var2.f(iv3Var2);
                        java.lang.Object objP21 = k80Var2.P();
                        if (zC4 || objP21 == obj7) {
                            z = zBooleanValue;
                            ls2Var11 = ls2Var13;
                            ls2Var12 = ls2Var16;
                            ta1Var7 = ta1Var8;
                            x33Var6 = x33Var5;
                            af2Var = new defpackage.af2(list11, nf0Var2, f9, f10, f11, f12, x33Var7, iv3Var2);
                            k80Var2.l0(af2Var);
                        } else {
                            af2Var = objP21;
                            z = zBooleanValue;
                            ls2Var11 = ls2Var13;
                            ls2Var12 = ls2Var16;
                            ta1Var7 = ta1Var8;
                            x33Var6 = x33Var5;
                        }
                        defpackage.jd1 jd1Var3 = (defpackage.jd1) ((defpackage.j02) af2Var);
                        java.lang.Object objP22 = k80Var2.P();
                        if (objP22 == obj7) {
                            objP22 = new defpackage.ze2(x33Var6, 1);
                            k80Var2.l0(objP22);
                        }
                        defpackage.jd1 jd1Var4 = (defpackage.jd1) ((defpackage.j02) objP22);
                        defpackage.jd1 jd1Var5 = jd1Var;
                        boolean zF5 = k80Var2.f(jd1Var5);
                        java.lang.Object objP23 = k80Var2.P();
                        if (zF5 || objP23 == obj7) {
                            objP23 = new defpackage.jq(ls2Var11, jd1Var5, ls2Var12);
                            k80Var2.l0(objP23);
                        }
                        defpackage.jd1 jd1Var6 = (defpackage.jd1) objP23;
                        java.lang.Object objP24 = k80Var2.P();
                        if (objP24 == obj7) {
                            objP24 = new defpackage.xp1(ta1Var9, ta1Var7, ls2Var12, ls2Var15, 1);
                            k80Var2.l0(objP24);
                        }
                        defpackage.pc1.h(list11, jd1Var2, z, str4, hd1Var3, f4, f5, f8, str6, size, jd1Var3, jd1Var4, jd1Var6, ta1Var11, (defpackage.hd1) objP24, k80Var2, 48);
                        k80Var2.p(true);
                    } else {
                        k80Var2.V();
                    }
                    return defpackage.as4.a;
                }
            }, k80Var), k80Var, 56);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.lt(ta1Var, iv3Var, jd1Var, i, 9);
        }
    }

    public static final defpackage.dn3 l0(java.lang.annotation.Annotation[] annotationArr, defpackage.zc1 zc1Var) {
        java.lang.annotation.Annotation annotation;
        annotationArr.getClass();
        zc1Var.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (defpackage.cn3.a(defpackage.ht1.z(defpackage.ht1.y(annotation))).b().equals(zc1Var)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new defpackage.dn3(annotation);
        }
        return null;
    }

    public static final defpackage.e90 m(defpackage.oj ojVar, defpackage.z80 z80Var) {
        return new defpackage.e90(ojVar, z80Var);
    }

    public static final java.lang.String m0(long j) {
        long j2 = j / 1000;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        return j3 > 0 ? java.lang.String.format("%d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 3)) : java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 2));
    }

    public static final void n(boolean z, boolean z2, defpackage.k80 k80Var, int i) {
        defpackage.ll3 ll3VarT;
        defpackage.bi0 bi0Var;
        defpackage.lo1 lo1VarB;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(1728212530);
        int i2 = (k80Var2.g(z) ? 4 : 2) | i | (k80Var2.g(z2) ? 32 : 16);
        int i3 = 1;
        if (k80Var2.S(i2 & 1, (i2 & 19) != 18)) {
            defpackage.l94 l94VarB = defpackage.ae.b(z ? 1.0f : 0.0f, defpackage.q8.x0(z ? 120 : 420, 6, null), "flash_a", k80Var2, 3072, 20);
            defpackage.l94 l94VarB2 = defpackage.ae.b(z ? 1.0f : 0.7f, defpackage.q8.x0(z ? 160 : 420, 6, null), "flash_s", k80Var, 3072, 20);
            if (((java.lang.Number) l94VarB.getValue()).floatValue() <= 0.0f) {
                ll3VarT = k80Var.t();
                if (ll3VarT != null) {
                    bi0Var = new defpackage.bi0(i, i3, z, z2);
                    ll3VarT.d = bi0Var;
                }
                return;
            }
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            boolean zF = k80Var.f(l94VarB);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj = defpackage.z70.a;
            if (zF || objP == obj) {
                objP = new defpackage.fl(l94VarB, 28);
                k80Var.l0(objP);
            }
            defpackage.to2 to2VarA = androidx.compose.ui.graphics.a.a(fillElement, (defpackage.jd1) objP);
            defpackage.dr drVar = defpackage.d6.w;
            defpackage.fk2 fk2VarD = defpackage.ys.d(drVar, false);
            long j = k80Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarA);
            defpackage.w70.b.getClass();
            defpackage.hd1 hd1Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var);
            } else {
                k80Var.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var, qfVar, fk2VarD);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i4))) {
                defpackage.ms1.G(i4, k80Var, i4, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var, qfVar4, to2VarD);
            boolean zF2 = k80Var.f(l94VarB2);
            java.lang.Object objP2 = k80Var.P();
            if (zF2 || objP2 == obj) {
                objP2 = new defpackage.fl(l94VarB2, 29);
                k80Var.l0(objP2);
            }
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarK = defpackage.ct1.k(androidx.compose.foundation.layout.d.i(androidx.compose.ui.graphics.a.a(qo2Var, (defpackage.jd1) objP2), 96.0f), defpackage.hs3.a);
            long j2 = defpackage.g40.b;
            defpackage.to2 to2VarB = androidx.compose.foundation.a.b(to2VarK, defpackage.g40.c(0.45f, j2), defpackage.pp4.f);
            defpackage.fk2 fk2VarD2 = defpackage.ys.d(drVar, false);
            long j3 = k80Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            defpackage.y53 y53VarL2 = k80Var.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var, to2VarB);
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, qfVar, fk2VarD2);
            defpackage.ht1.J(k80Var, qfVar2, y53VarL2);
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i5))) {
                defpackage.ms1.G(i5, k80Var, i5, qfVar3);
            }
            defpackage.ht1.J(k80Var, qfVar4, to2VarD2);
            if (z2) {
                lo1VarB = defpackage.dc1.D();
            } else {
                lo1VarB = defpackage.n91.b;
                if (lo1VarB == null) {
                    defpackage.ko1 ko1Var = new defpackage.ko1("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i6 = defpackage.nu4.a;
                    defpackage.m64 m64Var = new defpackage.m64(j2);
                    defpackage.ci1 ci1Var = new defpackage.ci1(1);
                    ci1Var.l(6.0f, 19.0f);
                    ci1Var.i(4.0f);
                    ci1Var.j(10.0f, 5.0f);
                    ci1Var.j(6.0f, 5.0f);
                    ci1Var.p(14.0f);
                    ci1Var.e();
                    ci1Var.l(14.0f, 5.0f);
                    ci1Var.p(14.0f);
                    ci1Var.i(4.0f);
                    ci1Var.j(18.0f, 5.0f);
                    ci1Var.i(-4.0f);
                    ci1Var.e();
                    defpackage.ko1.a(ko1Var, ci1Var.a, m64Var);
                    lo1VarB = ko1Var.b();
                    defpackage.n91.b = lo1VarB;
                }
            }
            defpackage.in1.a(lo1VarB, null, androidx.compose.foundation.layout.d.i(qo2Var, 44.0f), defpackage.g40.c, k80Var, 3504);
            k80Var2 = k80Var;
            k80Var2.p(true);
            k80Var2.p(true);
        } else {
            k80Var2.V();
        }
        ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            bi0Var = new defpackage.bi0(i, 2, z, z2);
            ll3VarT.d = bi0Var;
        }
    }

    public static int n0(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        defpackage.c.n(D0("array too small: %s < %s", java.lang.Integer.valueOf(length), 4));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:515:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x11fb  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1246  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1399  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x164c  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x1671  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x1674  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x16c7  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x16d8  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x172f  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x1770  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x17bf  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x17f3  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1814  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x21c4  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x21cc  */
    /* JADX WARN: Type inference failed for: r100v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r100v1 */
    /* JADX WARN: Type inference failed for: r100v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r100v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r154v0, types: [k80] */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.aa3 r151, defpackage.hd1 r152, defpackage.to2 r153, defpackage.k80 r154, int r155) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 8690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.o(aa3, hd1, to2, k80, int):void");
    }

    public static defpackage.i34 o0(defpackage.j34 j34Var, java.util.Set set) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            if (key instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) key;
                int iLastIndexOf = str.lastIndexOf(46);
                java.lang.String strSubstring = iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
                int iLastIndexOf2 = str.lastIndexOf(46);
                java.lang.String strSubstring2 = iLastIndexOf2 < 0 ? null : str.substring(0, iLastIndexOf2);
                defpackage.o43 o43Var = new defpackage.o43(strSubstring, null);
                while (strSubstring2 != null) {
                    int iLastIndexOf3 = strSubstring2.lastIndexOf(46);
                    java.lang.String strSubstring3 = iLastIndexOf3 < 0 ? strSubstring2 : strSubstring2.substring(iLastIndexOf3 + 1);
                    int iLastIndexOf4 = strSubstring2.lastIndexOf(46);
                    strSubstring2 = iLastIndexOf4 < 0 ? null : strSubstring2.substring(0, iLastIndexOf4);
                    o43Var = new defpackage.o43(strSubstring3, o43Var);
                }
                map.put(o43Var, entry.getValue());
            }
        }
        return p0(j34Var, map, true);
    }

    public static final void p(defpackage.nf0 nf0Var, defpackage.ls2 ls2Var, defpackage.ls2 ls2Var2, defpackage.ls2 ls2Var3, defpackage.x33 x33Var, defpackage.x33 x33Var2, defpackage.e83 e83Var, defpackage.aa3 aa3Var, defpackage.yv4 yv4Var, boolean z) {
        if (z) {
            I(yv4Var, aa3Var, ls2Var, e83Var, x33Var, true);
            e83Var.b = -1L;
            e83Var.c = 0L;
            x33Var.k(x33Var.j() + 1);
            s(ls2Var2, false);
            H(aa3Var, nf0Var, ls2Var, yv4Var, x33Var.j(), 0L);
            J(ls2Var3, x33Var2);
        }
    }

    public static defpackage.i34 p0(defpackage.j34 j34Var, java.util.HashMap map, boolean z) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (defpackage.o43 o43Var : map.keySet()) {
            hashSet2.add(o43Var);
            for (defpackage.o43 o43VarD = o43Var.d(); o43VarD != null; o43VarD = o43VarD.d()) {
                hashSet.add(o43VarD);
            }
        }
        if (z) {
            hashSet2.removeAll(hashSet);
        } else {
            java.util.Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                defpackage.o43 o43Var2 = (defpackage.o43) it.next();
                if (hashSet.contains(o43Var2)) {
                    throw new defpackage.ea0("In the map, path '" + o43Var2.e() + "' occurs as both the parent object of a value and as a value. Because Map has no defined ordering, this is a broken situation.", null);
                }
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            map3.put((defpackage.o43) it2.next(), new java.util.HashMap());
        }
        java.util.Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            defpackage.o43 o43Var3 = (defpackage.o43) it3.next();
            defpackage.o43 o43VarD2 = o43Var3.d();
            java.util.Map map4 = o43VarD2 != null ? (java.util.Map) map3.get(o43VarD2) : map2;
            defpackage.o43 o43Var4 = o43Var3;
            while (true) {
                defpackage.o43 o43Var5 = o43Var4.b;
                if (o43Var5 == null) {
                    break;
                }
                o43Var4 = o43Var5;
            }
            java.lang.String str = o43Var4.a;
            java.lang.Object obj = map.get(o43Var3);
            defpackage.ta0 kb0Var = z ? obj instanceof java.lang.String ? new defpackage.kb0(j34Var, (java.lang.String) obj) : null : defpackage.qa0.b(map.get(o43Var3), j34Var);
            if (kb0Var != null) {
                map4.put(str, kb0Var);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hashSet);
        java.util.Collections.sort(arrayList, new defpackage.eb1(19));
        java.util.Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            defpackage.o43 o43Var6 = (defpackage.o43) it4.next();
            java.util.Map map5 = (java.util.Map) map3.get(o43Var6);
            defpackage.o43 o43VarD3 = o43Var6.d();
            java.util.Map map6 = o43VarD3 != null ? (java.util.Map) map3.get(o43VarD3) : map2;
            defpackage.i34 i34Var = new defpackage.i34(j34Var, map5, 2, false);
            while (true) {
                defpackage.o43 o43Var7 = o43Var6.b;
                if (o43Var7 != null) {
                    o43Var6 = o43Var7;
                }
            }
            map6.put(o43Var6.a, i34Var);
        }
        return new defpackage.i34(j34Var, map2, 2, false);
    }

    public static final java.lang.String q(defpackage.ls2 ls2Var) {
        return (java.lang.String) ls2Var.getValue();
    }

    public static final java.util.ArrayList q0(java.lang.annotation.Annotation[] annotationArr) {
        annotationArr.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(annotationArr.length);
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            arrayList.add(new defpackage.dn3(annotation));
        }
        return arrayList;
    }

    public static final boolean r(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static defpackage.z22 r0(defpackage.tj2 tj2Var) {
        return new defpackage.z22(5, tj2Var);
    }

    public static final void s(defpackage.ls2 ls2Var, boolean z) {
        ls2Var.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final defpackage.s32 s0(defpackage.zw zwVar) {
        defpackage.r52 r52VarL = zwVar.L();
        defpackage.r52 r52VarI = zwVar.I();
        if (r52VarL != null) {
            return r52VarL.getType();
        }
        if (r52VarI != null) {
            if (zwVar instanceof defpackage.mc0) {
                return r52VarI.getType();
            }
            defpackage.hj0 hj0VarE = zwVar.e();
            defpackage.yo2 yo2Var = hj0VarE instanceof defpackage.yo2 ? (defpackage.yo2) hj0VarE : null;
            if (yo2Var != null) {
                return yo2Var.P();
            }
        }
        return null;
    }

    public static final java.lang.String t(defpackage.ls2 ls2Var) {
        return (java.lang.String) ls2Var.getValue();
    }

    public static final java.lang.String t0(defpackage.oe1 oe1Var) {
        defpackage.lt2 lt2Var;
        defpackage.zw zwVarU0 = defpackage.i32.y(oe1Var) ? u0(oe1Var) : null;
        if (zwVarU0 != null) {
            defpackage.zw zwVarI = defpackage.yp0.i(zwVarU0);
            if (zwVarI instanceof defpackage.sf3) {
                defpackage.i32.y(zwVarI);
                defpackage.zw zwVarB = defpackage.yp0.b(defpackage.yp0.i(zwVarI), defpackage.r7.P);
                if (zwVarB != null && (lt2Var = (defpackage.lt2) defpackage.lv.a.get(defpackage.yp0.g(zwVarB))) != null) {
                    return lt2Var.b();
                }
            } else if (zwVarI instanceof defpackage.l34) {
                int i = defpackage.jv.l;
                java.util.LinkedHashMap linkedHashMap = defpackage.g74.i;
                java.lang.String strD0 = d0((defpackage.l34) zwVarI);
                defpackage.lt2 lt2Var2 = strD0 == null ? null : (defpackage.lt2) linkedHashMap.get(strD0);
                if (lt2Var2 != null) {
                    return lt2Var2.b();
                }
            }
        }
        return null;
    }

    public static final defpackage.j33 u(defpackage.ls2 ls2Var) {
        return (defpackage.j33) ls2Var.getValue();
    }

    public static final defpackage.zw u0(defpackage.zw zwVar) {
        zwVar.getClass();
        if (!defpackage.g74.j.contains(zwVar.getName()) && !defpackage.lv.d.contains(defpackage.yp0.i(zwVar).getName())) {
            return null;
        }
        if (zwVar instanceof defpackage.sf3 ? true : zwVar instanceof defpackage.qf3) {
            return defpackage.yp0.b(zwVar, defpackage.r13.Q);
        }
        if (zwVar instanceof defpackage.l34) {
            return defpackage.yp0.b(zwVar, defpackage.r13.R);
        }
        return null;
    }

    public static final int v(defpackage.x33 x33Var) {
        return x33Var.j();
    }

    public static final defpackage.zw v0(defpackage.zw zwVar) {
        zwVar.getClass();
        defpackage.zw zwVarU0 = u0(zwVar);
        if (zwVarU0 != null) {
            return zwVarU0;
        }
        int i = defpackage.kv.l;
        defpackage.lt2 name = zwVar.getName();
        name.getClass();
        if (defpackage.g74.e.contains(name)) {
            return defpackage.yp0.b(zwVar, defpackage.r13.S);
        }
        return null;
    }

    public static final int w(defpackage.x33 x33Var) {
        return x33Var.j();
    }

    public static long w0(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? io.netty.handler.codec.http2.Http2CodecUtil.DEFAULT_MAX_QUEUED_CONTROL_FRAMES << (i4 & 1) : (i4 & 3) == 3 ? 60000 : io.netty.handler.codec.http2.Http2CodecUtil.DEFAULT_MAX_QUEUED_CONTROL_FRAMES << r6);
    }

    public static final boolean x(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static android.content.Intent x0(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String strY0 = y0(context, componentName);
        if (strY0 == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), strY0);
        return y0(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static final java.util.List y(defpackage.ls2 ls2Var) {
        return (java.util.List) ls2Var.getValue();
    }

    public static java.lang.String y0(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String string;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final java.util.Map z(defpackage.ls2 ls2Var) {
        return (java.util.Map) ls2Var.getValue();
    }

    public static final java.lang.reflect.Method z0(java.lang.Class cls, defpackage.zw zwVar) {
        zwVar.getClass();
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new defpackage.rf0("No unbox method found in inline class: " + cls + " (calling " + zwVar + ')');
        }
    }
}
