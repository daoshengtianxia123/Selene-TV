package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public abstract class da1 {
    public static defpackage.df3 A() {
        return defpackage.df3.b;
    }

    public static final defpackage.di2 B(defpackage.di2 di2Var) {
        defpackage.y42 y42Var = di2Var.F.F;
        while (true) {
            defpackage.y42 y42VarV = y42Var.v();
            defpackage.y42 y42Var2 = null;
            if ((y42VarV != null ? y42VarV.y : null) == null) {
                defpackage.di2 di2VarF0 = y42Var.W.d.F0();
                di2VarF0.getClass();
                return di2VarF0;
            }
            defpackage.y42 y42VarV2 = y42Var.v();
            if (y42VarV2 != null) {
                y42Var2 = y42VarV2.y;
            }
            y42Var2.getClass();
            defpackage.y42 y42VarV3 = y42Var.v();
            y42VarV3.getClass();
            y42Var = y42VarV3.y;
            y42Var.getClass();
        }
    }

    public static final java.lang.Object C(defpackage.qx2 qx2Var, defpackage.y12 y12Var) {
        qx2Var.getClass();
        y12Var.getClass();
        return qx2Var.invoke();
    }

    public static final boolean D(defpackage.sf3 sf3Var) {
        sf3Var.getClass();
        return sf3Var.getGetter() == null;
    }

    public static final int E(android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public static final defpackage.pt2 F(java.lang.String str, defpackage.os3 os3Var) {
        str.getClass();
        defpackage.ut2 ut2Var = new defpackage.ut2();
        os3Var.invoke(ut2Var);
        defpackage.st2 st2Var = ut2Var.a;
        defpackage.nv2 nv2Var = st2Var.a;
        if (nv2Var == null) {
            nv2Var = defpackage.nv2.n;
        }
        return new defpackage.pt2(str, new defpackage.tt2(nv2Var, st2Var.b, st2Var.c));
    }

    public static final java.lang.String G(java.lang.String str) {
        str.getClass();
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("[\\s\\u3000]+");
        patternCompile.getClass();
        java.lang.String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public static final defpackage.l02 H(defpackage.td1 td1Var) throws defpackage.ot1 {
        kotlin.Metadata metadata = (kotlin.Metadata) td1Var.getClass().getAnnotation(kotlin.Metadata.class);
        if (metadata != null) {
            java.lang.String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                java.lang.String[] strArrD2 = metadata.d2();
                defpackage.x41 x41Var = defpackage.ez1.a;
                strArrD2.getClass();
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(defpackage.pr.a(strArrD1));
                defpackage.x41 x41Var2 = defpackage.ez1.a;
                defpackage.ky1 ky1VarH = defpackage.ez1.h(byteArrayInputStream, strArrD2);
                defpackage.x41 x41Var3 = defpackage.ez1.a;
                defpackage.sy1 sy1Var = defpackage.xg3.M;
                sy1Var.getClass();
                defpackage.t30 t30Var = new defpackage.t30(byteArrayInputStream);
                defpackage.j2 j2Var = (defpackage.j2) sy1Var.c(t30Var, x41Var3);
                try {
                    t30Var.a(0);
                    defpackage.sy1.a(j2Var);
                    defpackage.xg3 xg3Var = (defpackage.xg3) j2Var;
                    defpackage.jy1 jy1Var = new defpackage.jy1(metadata.mv(), (metadata.xi() & 8) != 0);
                    java.lang.Class<?> cls = td1Var.getClass();
                    defpackage.vh3 vh3Var = xg3Var.G;
                    vh3Var.getClass();
                    return new defpackage.l02(defpackage.j01.i, (defpackage.l34) defpackage.it4.g(cls, xg3Var, ky1VarH, new defpackage.zz(vh3Var), jy1Var, defpackage.io3.f));
                } catch (defpackage.ot1 e) {
                    e.f = j2Var;
                    throw e;
                }
            }
        }
        return null;
    }

    public static final defpackage.w62 I(defpackage.s5 s5Var, defpackage.hu1 hu1Var) {
        s5Var.getClass();
        hu1Var.getClass();
        return new defpackage.w62(s5Var, hu1Var, false);
    }

    public static final defpackage.sr1 J(defpackage.vl3 vl3Var) {
        return new defpackage.sr1(java.lang.Math.round(vl3Var.a), java.lang.Math.round(vl3Var.b), java.lang.Math.round(vl3Var.c), java.lang.Math.round(vl3Var.d));
    }

    public static final defpackage.q34 K(defpackage.so4 so4Var, defpackage.yo2 yo2Var, java.util.List list) {
        so4Var.getClass();
        yo2Var.getClass();
        list.getClass();
        defpackage.yo4 yo4VarM = yo2Var.m();
        yo4VarM.getClass();
        return L(so4Var, yo4VarM, list, false);
    }

    public static defpackage.q34 L(defpackage.so4 so4Var, defpackage.yo4 yo4Var, java.util.List list, boolean z) {
        defpackage.pn2 pn2VarD;
        defpackage.yo2 yo2Var;
        defpackage.pn2 pn2VarD0;
        defpackage.pn2 pn2Var;
        defpackage.pn2 pn2VarK0;
        so4Var.getClass();
        yo4Var.getClass();
        list.getClass();
        if (so4Var.isEmpty() && list.isEmpty() && !z && yo4Var.a() != null) {
            defpackage.u20 u20VarA = yo4Var.a();
            u20VarA.getClass();
            defpackage.q34 q34VarP = u20VarA.P();
            q34VarP.getClass();
            return q34VarP;
        }
        defpackage.u20 u20VarA2 = yo4Var.a();
        if (u20VarA2 instanceof defpackage.rp4) {
            pn2VarD = ((defpackage.rp4) u20VarA2).P().D();
        } else {
            if (u20VarA2 instanceof defpackage.yo2) {
                int i = defpackage.yp0.a;
                defpackage.ap2 ap2VarD = defpackage.vp0.d(u20VarA2);
                ap2VarD.getClass();
                defpackage.yp0.h(ap2VarD);
                boolean zIsEmpty = list.isEmpty();
                defpackage.y32 y32Var = defpackage.y32.a;
                if (zIsEmpty) {
                    defpackage.yo2 yo2Var2 = (defpackage.yo2) u20VarA2;
                    yo2Var = yo2Var2 instanceof defpackage.yo2 ? yo2Var2 : null;
                    if (yo2Var == null || (pn2VarK0 = yo2Var.k0(y32Var)) == null) {
                        pn2VarD = yo2Var2.j0();
                        pn2VarD.getClass();
                    } else {
                        pn2Var = pn2VarK0;
                    }
                } else {
                    defpackage.yo2 yo2Var3 = (defpackage.yo2) u20VarA2;
                    defpackage.cq4 cq4VarQ = defpackage.ap4.b.q(yo4Var, list);
                    yo2Var = yo2Var3 instanceof defpackage.yo2 ? yo2Var3 : null;
                    if (yo2Var == null || (pn2VarD0 = yo2Var.d0(cq4VarQ, y32Var)) == null) {
                        pn2VarD = yo2Var3.b0(cq4VarQ);
                        pn2VarD.getClass();
                    } else {
                        pn2Var = pn2VarD0;
                    }
                }
                return N(so4Var, yo4Var, list, z, pn2Var, new defpackage.v32(so4Var, yo4Var, list, z));
            }
            if (u20VarA2 instanceof defpackage.ar0) {
                java.lang.String str = ((defpackage.ar0) u20VarA2).getName().f;
                str.getClass();
                pn2VarD = defpackage.r21.a(4, true, str);
            } else {
                if (!(yo4Var instanceof defpackage.qs1)) {
                    defpackage.jc2.j("Unsupported classifier: ", u20VarA2, " for constructor: ", yo4Var);
                    return null;
                }
                pn2VarD = defpackage.an4.d(((defpackage.qs1) yo4Var).b, "member scope for intersection type");
            }
        }
        pn2Var = pn2VarD;
        return N(so4Var, yo4Var, list, z, pn2Var, new defpackage.v32(so4Var, yo4Var, list, z));
    }

    public static final defpackage.q34 M(defpackage.pn2 pn2Var, defpackage.so4 so4Var, defpackage.yo4 yo4Var, java.util.List list, boolean z) {
        so4Var.getClass();
        yo4Var.getClass();
        list.getClass();
        pn2Var.getClass();
        defpackage.r34 r34Var = new defpackage.r34(yo4Var, list, z, pn2Var, new defpackage.v32(pn2Var, so4Var, yo4Var, list, z));
        return so4Var.isEmpty() ? r34Var : new defpackage.t34(r34Var, so4Var);
    }

    public static final defpackage.q34 N(defpackage.so4 so4Var, defpackage.yo4 yo4Var, java.util.List list, boolean z, defpackage.pn2 pn2Var, defpackage.jd1 jd1Var) {
        so4Var.getClass();
        yo4Var.getClass();
        list.getClass();
        pn2Var.getClass();
        defpackage.r34 r34Var = new defpackage.r34(yo4Var, list, z, pn2Var, jd1Var);
        return so4Var.isEmpty() ? r34Var : new defpackage.t34(r34Var, so4Var);
    }

    public static int O(int i) {
        return (int) (java.lang.Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int P(java.lang.Object obj) {
        return O(obj == null ? 0 : obj.hashCode());
    }

    public static final void Q(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void R(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void S(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static final void T(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }

    public static final boolean U(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return G(str).equals(G(str2));
    }

    public static final defpackage.vl3 V(defpackage.sr1 sr1Var) {
        return new defpackage.vl3(sr1Var.a, sr1Var.b, sr1Var.c, sr1Var.d);
    }

    public static final void a(float f, int i, defpackage.k80 k80Var, defpackage.to2 to2Var) {
        defpackage.to2 to2Var2;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(85357495);
        int i2 = i | 6;
        if (k80Var2.S(i2 & 1, (i2 & 19) != 18)) {
            defpackage.wp1 wp1VarR = defpackage.dc1.R("moon", k80Var2);
            defpackage.c cVar = defpackage.gz0.b;
            defpackage.mo4 mo4VarX0 = defpackage.q8.x0(6000, 2, cVar);
            defpackage.zp3 zp3Var = defpackage.zp3.f;
            defpackage.up1 up1VarI = defpackage.dc1.i(wp1VarR, 0.0f, 360.0f, defpackage.q8.e0(mo4VarX0, zp3Var, 0L, 4), "rotation", k80Var2);
            defpackage.up1 up1VarI2 = defpackage.dc1.i(wp1VarR, 8.0f, 20.0f, defpackage.q8.e0(defpackage.q8.x0(3000, 6, null), defpackage.zp3.i, 0L, 4), "glow", k80Var);
            k80Var2 = k80Var;
            defpackage.up1 up1VarI3 = defpackage.dc1.i(wp1VarR, 0.0f, 360.0f, defpackage.q8.e0(defpackage.q8.x0(14000, 2, cVar), zp3Var, 0L, 4), "halo", k80Var2);
            to2Var2 = defpackage.qo2.f;
            defpackage.to2 to2VarI = androidx.compose.foundation.layout.d.i(to2Var2, f);
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
            long j = k80Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, to2VarI);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, defpackage.v70.f, fk2VarD);
            defpackage.ht1.J(k80Var2, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var2, i3, qfVar);
            }
            defpackage.ht1.J(k80Var2, defpackage.v70.d, to2VarD);
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            boolean zF = k80Var2.f(up1VarI3);
            java.lang.Object objP = k80Var2.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (zF || objP == cjVar) {
                objP = new defpackage.fl(up1VarI3, 20);
                k80Var2.l0(objP);
            }
            defpackage.to2 to2VarA = androidx.compose.ui.graphics.a.a(fillElement, (defpackage.jd1) objP);
            java.lang.Object objP2 = k80Var2.P();
            if (objP2 == cjVar) {
                objP2 = new defpackage.kw0(19);
                k80Var2.l0(objP2);
            }
            defpackage.r15.a(to2VarA, (defpackage.jd1) objP2, k80Var2, 48);
            defpackage.to2 to2VarI2 = androidx.compose.foundation.layout.d.i(to2Var2, 0.4848485f * f);
            boolean zF2 = k80Var2.f(up1VarI);
            java.lang.Object objP3 = k80Var2.P();
            if (zF2 || objP3 == cjVar) {
                objP3 = new defpackage.fl(up1VarI, 21);
                k80Var2.l0(objP3);
            }
            defpackage.to2 to2VarA2 = androidx.compose.ui.graphics.a.a(to2VarI2, (defpackage.jd1) objP3);
            boolean zF3 = k80Var2.f(up1VarI2);
            java.lang.Object objP4 = k80Var2.P();
            if (zF3 || objP4 == cjVar) {
                objP4 = new defpackage.fl(up1VarI2, 22);
                k80Var2.l0(objP4);
            }
            defpackage.r15.a(to2VarA2, (defpackage.jd1) objP4, k80Var2, 0);
            k80Var2.p(true);
        } else {
            k80Var2.V();
            to2Var2 = to2Var;
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.es0(f, i, to2Var2);
        }
    }

    public static final int b(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }

    public static final void c(defpackage.to2 to2Var, defpackage.q60 q60Var, defpackage.k80 k80Var, int i) {
        int i2;
        k80Var.d0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (k80Var.f(to2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= k80Var.h(q60Var) ? 32 : 16;
        }
        if (k80Var.S(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object objP = k80Var.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                defpackage.a43 a43Var = new defpackage.a43(null, defpackage.d6.V);
                k80Var.l0(a43Var);
                objP = a43Var;
            }
            defpackage.ls2 ls2Var = (defpackage.ls2) objP;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == cjVar) {
                objP2 = new defpackage.rc(ls2Var, 14);
                k80Var.l0(objP2);
            }
            defpackage.hd1 hd1Var = (defpackage.hd1) objP2;
            defpackage.cd3 cd3Var = defpackage.kn0.a;
            defpackage.hq hqVarY = defpackage.om2.y(defpackage.z60.b, k80Var, 6);
            defpackage.ft4.M(new defpackage.mi3[]{defpackage.hg4.b.a(defpackage.bt1.U(hd1Var, k80Var, 2)), defpackage.hg4.a.a(hqVarY)}, defpackage.q8.n0(1070596993, new defpackage.e73(to2Var, ls2Var, q60Var, hqVarY, hd1Var), k80Var), k80Var, 56);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qc(to2Var, q60Var, i, i3);
        }
    }

    public static final void d(defpackage.to2 to2Var, defpackage.q60 q60Var, defpackage.k80 k80Var, int i) {
        int i2;
        k80Var.d0(155925518);
        if ((i & 6) == 0) {
            i2 = (k80Var.f(to2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= k80Var.h(q60Var) ? 32 : 16;
        }
        int i3 = 3;
        if (k80Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = k80Var.j(defpackage.hg4.a) != null;
            boolean z2 = k80Var.j(defpackage.hg4.b) != null;
            if (z && z2) {
                k80Var.b0(-1977156178);
                defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.i, true);
                long j = k80Var.T;
                int i4 = (int) (j ^ (j >>> 32));
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
                defpackage.ht1.J(k80Var, defpackage.v70.f, fk2VarD);
                defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
                defpackage.qf qfVar = defpackage.v70.g;
                if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i4))) {
                    defpackage.ms1.G(i4, k80Var, i4, qfVar);
                }
                defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
                q60Var.invoke(k80Var, java.lang.Integer.valueOf((i2 >> 3) & 14));
                k80Var.p(true);
                k80Var.p(false);
            } else if (z) {
                k80Var.b0(-1976965962);
                defpackage.bt1.c(to2Var, q60Var, k80Var, i2 & 126);
                k80Var.p(false);
            } else if (z2) {
                k80Var.b0(-1976815178);
                defpackage.kn0.d(to2Var, q60Var, k80Var, i2 & 126);
                k80Var.p(false);
            } else {
                k80Var.b0(-1976684761);
                c(to2Var, q60Var, k80Var, i2 & 126);
                k80Var.p(false);
            }
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qc(to2Var, q60Var, i, i3);
        }
    }

    public static final boolean e(android.view.View view, android.view.View view2) {
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final android.graphics.Rect f(defpackage.la1 la1Var, android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        defpackage.bb1 bb1VarJ0 = defpackage.ft4.j0(((defpackage.na1) la1Var).c);
        defpackage.vl3 vl3VarO0 = bb1VarJ0 != null ? defpackage.ft4.o0(bb1VarJ0) : null;
        if (vl3VarO0 == null) {
            return null;
        }
        int i = (int) vl3VarO0.a;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) vl3VarO0.b;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new android.graphics.Rect((i + i2) - i3, (i4 + i5) - i6, (((int) vl3VarO0.c) + i2) - i3, (((int) vl3VarO0.d) + i5) - i6);
    }

    public static final android.view.View g(defpackage.so2 so2Var) {
        defpackage.xw4 xw4Var = defpackage.ct1.L(so2Var.f).F;
        android.view.View interopView = xw4Var != null ? xw4Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        defpackage.c.r("Could not fetch interop view");
        return null;
    }

    public static void h(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Object obj, int i, int i2) {
        for (java.lang.Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final java.util.List i(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            org.moontechlab.selenetv.model.SearchResult searchResult = (org.moontechlab.selenetv.model.SearchResult) it.next();
            searchResult.getClass();
            java.lang.Long l = searchResult.l;
            java.util.List list2 = searchResult.d;
            java.lang.String str = searchResult.g;
            int size = list2.size();
            if (size < 1) {
                size = 1;
            }
            java.lang.String str2 = size > 1 ? "tv" : "movie";
            java.lang.String str3 = G(searchResult.b) + "_" + searchResult.i + "_" + str2;
            int size2 = list2.size();
            if (size2 < 1) {
                size2 = 1;
            }
            java.lang.String str4 = size2 > 1 ? "tv" : "movie";
            java.lang.Object obj = linkedHashMap.get(str3);
            if (obj == null) {
                defpackage.c6 c6Var = new defpackage.c6(str3, searchResult.b, searchResult.i, str4, searchResult.c, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.util.ArrayList(), new java.util.ArrayList());
                linkedHashMap.put(str3, c6Var);
                obj = c6Var;
            }
            defpackage.c6 c6Var2 = (defpackage.c6) obj;
            java.util.List list3 = c6Var2.i;
            java.util.Map map = c6Var2.f;
            java.util.List list4 = c6Var2.h;
            java.util.Map map2 = c6Var2.g;
            map.put(str, java.lang.Integer.valueOf(size2));
            if (l != null) {
                long jLongValue = l.longValue();
                java.lang.Long lValueOf = java.lang.Long.valueOf(jLongValue);
                java.lang.Integer num = (java.lang.Integer) map2.get(java.lang.Long.valueOf(jLongValue));
                map2.put(lValueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
            if (!list4.contains(str)) {
                list4.add(str);
            }
            list3.add(searchResult);
            if (l != null) {
                if (c6Var2.e.length() == 0) {
                    java.lang.String str5 = searchResult.c;
                    java.lang.String str6 = c6Var2.a;
                    java.lang.String str7 = c6Var2.b;
                    java.lang.String str8 = c6Var2.c;
                    java.lang.String str9 = c6Var2.d;
                    str7.getClass();
                    str8.getClass();
                    str5.getClass();
                    linkedHashMap.put(str3, new defpackage.c6(str6, str7, str8, str9, str5, map, map2, list4, list3));
                }
            }
        }
        return defpackage.y30.a1(linkedHashMap.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tc1 j(java.lang.String r8, java.lang.Object[] r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L13
            int r1 = r9.length
            if (r1 != 0) goto L7
            goto L13
        L7:
            int r1 = r9.length
            int r1 = r1 + (-1)
            r1 = r9[r1]
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L13
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L14
        L13:
            r1 = r0
        L14:
            r2 = 0
            if (r1 == 0) goto L2e
            if (r9 == 0) goto L28
            int r3 = r9.length
            if (r3 == 0) goto L28
            int r3 = r9.length
            int r3 = r3 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            if (r3 <= 0) goto L26
            java.lang.System.arraycopy(r9, r2, r4, r2, r3)
        L26:
            r9 = r4
            goto L2e
        L28:
            java.lang.String r8 = "non-sensical empty or null argument array"
            defpackage.c.r(r8)
            return r0
        L2e:
            if (r8 != 0) goto L36
            tc1 r8 = new tc1
            r8.<init>(r0, r9, r1)
            return r8
        L36:
            if (r9 != 0) goto L3e
            tc1 r9 = new tc1
            r9.<init>(r8, r0, r0)
            return r9
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r3 = r8.length()
            int r3 = r3 + 50
            r0.<init>(r3)
            r3 = r2
        L4a:
            int r4 = r9.length
            if (r2 >= r4) goto Lb6
            java.lang.String r4 = "{}"
            int r4 = r8.indexOf(r4, r3)
            r5 = -1
            if (r4 != r5) goto L6f
            if (r3 != 0) goto L5e
            tc1 r0 = new tc1
            r0.<init>(r8, r9, r1)
            return r0
        L5e:
            int r2 = r8.length()
            r0.append(r8, r3, r2)
            tc1 r8 = new tc1
            java.lang.String r0 = r0.toString()
            r8.<init>(r0, r9, r1)
            return r8
        L6f:
            if (r4 != 0) goto L72
            goto La5
        L72:
            int r5 = r4 + (-1)
            char r6 = r8.charAt(r5)
            r7 = 92
            if (r6 != r7) goto La5
            r6 = 2
            if (r4 < r6) goto L98
            int r6 = r4 + (-2)
            char r6 = r8.charAt(r6)
            if (r6 != r7) goto L98
            r0.append(r8, r3, r5)
            r3 = r9[r2]
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            u(r0, r3, r5)
        L94:
            int r4 = r4 + 2
        L96:
            r3 = r4
            goto Lb3
        L98:
            int r2 = r2 + (-1)
            r0.append(r8, r3, r5)
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            int r4 = r4 + 1
            goto L96
        La5:
            r0.append(r8, r3, r4)
            r3 = r9[r2]
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            u(r0, r3, r5)
            goto L94
        Lb3:
            int r2 = r2 + 1
            goto L4a
        Lb6:
            int r2 = r8.length()
            r0.append(r8, r3, r2)
            tc1 r8 = new tc1
            java.lang.String r0 = r0.toString()
            r8.<init>(r0, r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da1.j(java.lang.String, java.lang.Object[]):tc1");
    }

    public static void l(int i, int i2) throws defpackage.pf1 {
        android.opengl.GLES20.glBindTexture(i, i2);
        m();
        android.opengl.GLES20.glTexParameteri(i, 10240, 9729);
        m();
        android.opengl.GLES20.glTexParameteri(i, 10241, 9729);
        m();
        android.opengl.GLES20.glTexParameteri(i, 10242, 33071);
        m();
        android.opengl.GLES20.glTexParameteri(i, 10243, 33071);
        m();
    }

    public static void m() throws defpackage.pf1 {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = android.opengl.GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            java.lang.String strGluErrorString = android.opengl.GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + java.lang.Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new defpackage.pf1(sb.toString());
        }
    }

    public static void n(java.lang.String str, boolean z) throws defpackage.pf1 {
        if (!z) {
            throw new defpackage.pf1(str);
        }
    }

    public static final defpackage.xf4 p(defpackage.lo0 lo0Var) {
        defpackage.ig4 ig4Var;
        defpackage.vf4 vf4Var = new defpackage.vf4();
        defpackage.st1.D(lo0Var, defpackage.zf4.a, new defpackage.fg4(new defpackage.fg4(0, vf4Var), new defpackage.c0(1, vf4Var, defpackage.vf4.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 3)));
        defpackage.wr2 wr2Var = new defpackage.wr2();
        defpackage.wr2 wr2Var2 = vf4Var.a;
        java.lang.Object[] objArr = wr2Var2.a;
        int i = wr2Var2.b;
        int i2 = 0;
        boolean z = true;
        defpackage.wf4 wf4Var = null;
        while (true) {
            ig4Var = defpackage.ig4.b;
            if (i2 >= i) {
                break;
            }
            defpackage.wf4 wf4Var2 = (defpackage.wf4) objArr[i2];
            if (!z || wf4Var2 != ig4Var) {
                if (wf4Var2 == ig4Var && wf4Var == ig4Var) {
                    z = false;
                    break;
                    break;
                }
                if (wf4Var2 != ig4Var) {
                    defpackage.wr2 wr2Var3 = vf4Var.b;
                    java.lang.Object[] objArr2 = wr2Var3.a;
                    int i3 = wr2Var3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((java.lang.Boolean) ((defpackage.jd1) objArr2[i4]).invoke(wf4Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                wr2Var.a(wf4Var2);
                z = false;
                wf4Var = wf4Var2;
            }
            i2++;
        }
        if (((defpackage.wf4) (wr2Var.g() ? null : wr2Var.a[wr2Var.b - 1])) == ig4Var) {
            wr2Var.j(wr2Var.b - 1);
        }
        defpackage.ur2 ur2Var = wr2Var.c;
        if (ur2Var == null) {
            ur2Var = new defpackage.ur2(wr2Var);
            wr2Var.c = ur2Var;
        }
        return new defpackage.xf4(ur2Var);
    }

    public static final defpackage.ok3 q(android.content.Context context) {
        return new defpackage.k60(context).g();
    }

    public static java.nio.FloatBuffer r(float[] fArr) {
        return (java.nio.FloatBuffer) java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final defpackage.i22 s(defpackage.c02 c02Var, java.util.List list, boolean z, java.util.List list2) {
        defpackage.u20 descriptor;
        defpackage.so4 so4Var;
        java.lang.Object e94Var;
        c02Var.getClass();
        list.getClass();
        list2.getClass();
        defpackage.d02 d02Var = c02Var instanceof defpackage.d02 ? (defpackage.d02) c02Var : null;
        if (d02Var == null || (descriptor = d02Var.getDescriptor()) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create type for an unsupported classifier: ");
            sb.append(c02Var);
            java.lang.Class<?> cls = c02Var.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new defpackage.rf0(sb.toString());
        }
        defpackage.yo4 yo4VarM = descriptor.m();
        yo4VarM.getClass();
        java.util.List parameters = yo4VarM.getParameters();
        parameters.getClass();
        if (parameters.size() != list.size()) {
            throw new java.lang.IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            defpackage.so4.i.getClass();
            so4Var = defpackage.so4.t;
        } else {
            defpackage.so4.i.getClass();
            so4Var = defpackage.so4.t;
        }
        java.util.List parameters2 = yo4VarM.getParameters();
        parameters2.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, list));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.pp4.Z();
                throw null;
            }
            defpackage.m22 m22Var = (defpackage.m22) obj;
            defpackage.i22 i22Var = (defpackage.i22) m22Var.b;
            defpackage.s32 s32Var = i22Var != null ? i22Var.f : null;
            defpackage.o22 o22Var = m22Var.a;
            int i3 = o22Var == null ? -1 : defpackage.e02.a[o22Var.ordinal()];
            if (i3 == -1) {
                java.lang.Object obj2 = parameters2.get(i);
                obj2.getClass();
                e94Var = new defpackage.e94((defpackage.rp4) obj2);
            } else if (i3 == 1) {
                s32Var.getClass();
                e94Var = new defpackage.yp4(1, s32Var);
            } else if (i3 == 2) {
                s32Var.getClass();
                e94Var = new defpackage.yp4(2, s32Var);
            } else {
                if (i3 != 3) {
                    defpackage.jc2.o();
                    return null;
                }
                s32Var.getClass();
                e94Var = new defpackage.yp4(3, s32Var);
            }
            arrayList.add(e94Var);
            i = i2;
        }
        return new defpackage.i22(L(so4Var, yo4VarM, arrayList, z), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, m01] */
    public static /* synthetic */ defpackage.i22 t(defpackage.qz1 qz1Var, java.util.ArrayList arrayList, int i) {
        int i2 = i & 1;
        ?? r0 = defpackage.m01.f;
        if (i2 != 0) {
            arrayList = r0;
        }
        return s(qz1Var, arrayList, false, r0);
    }

    public static void u(java.lang.StringBuilder sb, java.lang.Object obj, java.util.HashMap map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            try {
                sb.append(obj.toString());
                return;
            } catch (java.lang.Throwable th) {
                defpackage.ft4.C0("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
                sb.append("[FAILED toString()]");
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            sb.append('[');
            int length = zArr.length;
            while (i < length) {
                sb.append(zArr[i]);
                if (i != length - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            sb.append('[');
            int length2 = bArr.length;
            while (i < length2) {
                sb.append((int) bArr[i]);
                if (i != length2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            sb.append('[');
            int length3 = cArr.length;
            while (i < length3) {
                sb.append(cArr[i]);
                if (i != length3 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            sb.append('[');
            int length4 = sArr.length;
            while (i < length4) {
                sb.append((int) sArr[i]);
                if (i != length4 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            sb.append('[');
            int length5 = iArr.length;
            while (i < length5) {
                sb.append(iArr[i]);
                if (i != length5 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            sb.append('[');
            int length6 = jArr.length;
            while (i < length6) {
                sb.append(jArr[i]);
                if (i != length6 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            sb.append('[');
            int length7 = fArr.length;
            while (i < length7) {
                sb.append(fArr[i]);
                if (i != length7 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            sb.append('[');
            int length8 = dArr.length;
            while (i < length8) {
                sb.append(dArr[i]);
                if (i != length8 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        sb.append('[');
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length9 = objArr.length;
            while (i < length9) {
                u(sb, objArr[i], map);
                if (i != length9 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    public static boolean v(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean w(int i, int i2) {
        return i == i2;
    }

    public static int x(boolean z) {
        java.util.List supportedPerformancePoints;
        try {
            defpackage.rc1 rc1Var = new defpackage.rc1();
            rc1Var.m = defpackage.ko2.l("video/avc");
            defpackage.sc1 sc1Var = new defpackage.sc1(rc1Var);
            java.lang.String str = sc1Var.n;
            if (str != null) {
                java.util.List listE = defpackage.cl2.e(str, z, false);
                java.lang.String strB = defpackage.cl2.b(sc1Var);
                java.lang.Iterable iterableE = strB == null ? defpackage.to3.v : defpackage.cl2.e(strB, z, false);
                defpackage.wo1 wo1VarL = defpackage.ap1.l();
                wo1VarL.c(listE);
                wo1VarL.c(iterableE);
                defpackage.to3 to3VarF = wo1VarL.f();
                for (int i = 0; i < to3VarF.u; i++) {
                    if (((defpackage.rk2) to3VarF.get(i)).d != null && ((defpackage.rk2) to3VarF.get(i)).d.getVideoCapabilities() != null && (supportedPerformancePoints = ((defpackage.rk2) to3VarF.get(i)).d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        defpackage.ig1.i();
                        android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = defpackage.ig1.c();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (defpackage.ig1.e(supportedPerformancePoints.get(i2)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (defpackage.zk2 unused) {
        }
        return 0;
    }

    public static final defpackage.os4 y(defpackage.q34 q34Var, defpackage.q34 q34Var2) {
        q34Var.getClass();
        q34Var2.getClass();
        return q34Var.equals(q34Var2) ? q34Var : new defpackage.c81(q34Var, q34Var2);
    }

    public static final android.graphics.Rect z(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, android.text.style.MetricAffectingSpan.class) != i2) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    defpackage.dk dkVarK = defpackage.pp4.K(metricAffectingSpanArr);
                    while (dkVarK.hasNext()) {
                        android.text.style.MetricAffectingSpan metricAffectingSpan = (android.text.style.MetricAffectingSpan) dkVarK.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i2, rect3);
        return rect3;
    }

    public abstract java.lang.String k();
}
