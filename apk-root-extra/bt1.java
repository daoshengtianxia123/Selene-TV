package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public abstract class bt1 implements defpackage.ly0 {
    public static final int[] f = {1, 2, 3, 6};
    public static final int[] i = {48000, 44100, 32000};
    public static final int[] t = {24000, 22050, 16000};
    public static final int[] u = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] v = {32, 40, 48, 56, 64, 80, 96, 112, io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] w = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final float[][] x = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] y = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] z = {95.047f, 100.0f, 108.883f};
    public static final float[][] A = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final defpackage.ro1 B = new defpackage.ro1(false);
    public static final defpackage.yd4 C = new defpackage.yd4(0, "CONDITION_FALSE");
    public static final java.lang.StackTraceElement[] D = new java.lang.StackTraceElement[0];
    public static final defpackage.vl3 E = new defpackage.vl3(0.0f, 0.0f, 10.0f, 10.0f);
    public static final java.lang.Object F = new java.lang.Object();

    public static final defpackage.yo2 A(defpackage.ap2 ap2Var, defpackage.h20 h20Var) {
        ap2Var.getClass();
        h20Var.getClass();
        defpackage.u20 u20VarB = B(ap2Var, h20Var);
        if (u20VarB instanceof defpackage.yo2) {
            return (defpackage.yo2) u20VarB;
        }
        return null;
    }

    public static final defpackage.u20 B(defpackage.ap2 ap2Var, defpackage.h20 h20Var) {
        ap2Var.getClass();
        h20Var.getClass();
        if (ap2Var.k(defpackage.rs.m) != null) {
            defpackage.jc2.a();
            return null;
        }
        defpackage.zc1 zc1VarG = h20Var.g();
        zc1VarG.getClass();
        defpackage.ca2 ca2VarT = ap2Var.T(zc1VarG);
        java.util.List listE = h20Var.h().a.e();
        defpackage.fa2 fa2Var = ca2VarT.x;
        java.lang.Object objV0 = defpackage.y30.v0(listE);
        objV0.getClass();
        defpackage.u20 u20VarE = fa2Var.e((defpackage.lt2) objV0, 18);
        if (u20VarE != null) {
            for (defpackage.lt2 lt2Var : listE.subList(1, listE.size())) {
                if (u20VarE instanceof defpackage.yo2) {
                    defpackage.pn2 pn2VarI0 = ((defpackage.yo2) u20VarE).i0();
                    lt2Var.getClass();
                    defpackage.u20 u20VarE2 = pn2VarI0.e(lt2Var, 18);
                    u20VarE = u20VarE2 instanceof defpackage.yo2 ? (defpackage.yo2) u20VarE2 : null;
                    if (u20VarE != null) {
                    }
                }
            }
            return u20VarE;
        }
        return null;
    }

    public static final defpackage.yo2 C(defpackage.ap2 ap2Var, defpackage.h20 h20Var, defpackage.yi3 yi3Var) {
        ap2Var.getClass();
        h20Var.getClass();
        yi3Var.getClass();
        defpackage.yo2 yo2VarA = A(ap2Var, h20Var);
        return yo2VarA != null ? yo2VarA : yi3Var.n(h20Var, defpackage.e04.Q(defpackage.e04.O(defpackage.e04.M(defpackage.f71.f, h20Var), defpackage.sp0.y)));
    }

    public static int F(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = i[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + w[i4]) * 2;
        }
        int i6 = v[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final defpackage.kr2 G(defpackage.mz3 mz3Var) {
        android.os.Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            defpackage.jz3 jz3VarA = mz3Var.a();
            defpackage.y42 y42Var = jz3VarA.c;
            if (y42Var.J() && y42Var.I()) {
                defpackage.kr2 kr2Var = new defpackage.kr2(48);
                defpackage.z22 z22Var = new defpackage.z22(21);
                defpackage.sr1 sr1VarJ = defpackage.da1.J(jz3VarA.g());
                ((android.graphics.Region) z22Var.i).set(sr1VarJ.a, sr1VarJ.b, sr1VarJ.c, sr1VarJ.d);
                H(z22Var, jz3VarA, kr2Var, jz3VarA, new defpackage.z22(21));
                return kr2Var;
            }
            defpackage.kr2 kr2Var2 = defpackage.mr1.a;
            kr2Var2.getClass();
            return kr2Var2;
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static final void H(defpackage.z22 z22Var, defpackage.jz3 jz3Var, defpackage.kr2 kr2Var, defpackage.jz3 jz3Var2, defpackage.z22 z22Var2) {
        defpackage.vl3 vl3VarD1;
        defpackage.y42 y42Var;
        int i2 = jz3Var.g;
        android.graphics.Region region = (android.graphics.Region) z22Var2.i;
        defpackage.y42 y42Var2 = jz3Var2.c;
        int i3 = jz3Var2.g;
        boolean z2 = (y42Var2.J() && y42Var2.I()) ? false : true;
        android.graphics.Region region2 = (android.graphics.Region) z22Var.i;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || jz3Var2.e) {
                java.lang.Object objF = jz3Var2.f();
                if (objF == null) {
                    vl3VarD1 = y42Var2.W.c.d1();
                } else {
                    defpackage.so2 so2Var = ((defpackage.so2) objF).f;
                    java.lang.Object objG = jz3Var2.d.f.g(defpackage.ez3.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z3 = objG != null;
                    if (!so2Var.f.E) {
                        vl3VarD1 = defpackage.vl3.e;
                    } else if (z3) {
                        vl3VarD1 = defpackage.ct1.J(so2Var, 8).d1();
                    } else {
                        defpackage.ax2 ax2VarJ = defpackage.ct1.J(so2Var, 8);
                        vl3VarD1 = defpackage.xr1.N(ax2VarJ).H(ax2VarJ, true);
                    }
                }
                defpackage.sr1 sr1VarJ = defpackage.da1.J(vl3VarD1);
                region.set(sr1VarJ.a, sr1VarJ.b, sr1VarJ.c, sr1VarJ.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, android.graphics.Region.Op.INTERSECT)) {
                    if (jz3Var2.e) {
                        defpackage.jz3 jz3VarL = jz3Var2.l();
                        kr2Var.h(i3, new defpackage.lz3(jz3Var2, defpackage.da1.J((jz3VarL == null || (y42Var = jz3VarL.c) == null || !y42Var.J()) ? E : jz3VarL.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            android.graphics.Rect bounds = region.getBounds();
                            kr2Var.h(i3, new defpackage.lz3(jz3Var2, new defpackage.sr1(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                android.graphics.Rect bounds2 = region.getBounds();
                kr2Var.h(i3, new defpackage.lz3(jz3Var2, new defpackage.sr1(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                java.util.List listJ = defpackage.jz3.j(4, jz3Var2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((defpackage.jz3) listJ.get(size)).k().f.c(defpackage.nz3.y)) {
                        H(z22Var, jz3Var, kr2Var, (defpackage.jz3) listJ.get(size), z22Var2);
                    }
                }
                if (O(jz3Var2)) {
                    region2.op(sr1VarJ.a, sr1VarJ.b, sr1VarJ.c, sr1VarJ.d, android.graphics.Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static defpackage.vt4 I(defpackage.lt2 lt2Var, defpackage.yo2 yo2Var) {
        if (lt2Var == null) {
            a(19);
            throw null;
        }
        if (yo2Var == null) {
            a(20);
            throw null;
        }
        java.util.Collection collectionT = yo2Var.t();
        if (collectionT.size() != 1) {
            return null;
        }
        for (defpackage.vt4 vt4Var : ((defpackage.x10) collectionT.iterator().next()).E()) {
            if (vt4Var.getName().equals(lt2Var)) {
                return vt4Var;
            }
        }
        return null;
    }

    public static defpackage.c4 J() {
        if (defpackage.c4.g == null) {
            defpackage.c4.g = new defpackage.c4(2);
        }
        defpackage.c4 c4Var = defpackage.c4.g;
        c4Var.getClass();
        return c4Var;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [la] */
    public static int[] K(defpackage.ji4 ji4Var, android.graphics.RectF rectF, int i2, final defpackage.wa waVar) {
        android.text.SegmentFinder segmentFinderK;
        if (i2 == 1) {
            segmentFinderK = new defpackage.qi(new defpackage.q43(ji4Var.f.getText(), 25, ji4Var.j()));
        } else {
            defpackage.ka.n();
            segmentFinderK = defpackage.ka.k(defpackage.ka.j(ji4Var.f.getText(), ji4Var.a));
        }
        return ji4Var.f.getRangeForRect(rectF, segmentFinderK, new android.text.Layout.TextInclusionStrategy() { // from class: la
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                return ((java.lang.Boolean) waVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static final boolean L(defpackage.jz3 jz3Var) {
        java.lang.Object objG = jz3Var.k().f.g(defpackage.nz3.f);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            return true;
        }
        java.lang.Object objG2 = jz3Var.k().f.g(defpackage.nz3.e);
        return (objG2 != null ? objG2 : null) != null;
    }

    public static int M(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = z;
        return defpackage.s40.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean N(defpackage.jz3 jz3Var) {
        defpackage.ax2 ax2VarD = jz3Var.d();
        defpackage.es2 es2Var = jz3Var.d.f;
        return (ax2VarD != null ? ax2VarD.P0() : false) || es2Var.c(defpackage.nz3.o) || es2Var.c(defpackage.nz3.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean O(defpackage.jz3 r14) {
        /*
            boolean r0 = N(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            fz3 r14 = r14.d
            boolean r0 = r14.t
            if (r0 != 0) goto L59
            es2 r14 = r14.f
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            qz3 r11 = (defpackage.qz3) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.O(jz3):boolean");
    }

    public static float P(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) java.lang.Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List Q(defpackage.ym1 r35, defpackage.di1 r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.Q(ym1, di1):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long R(int r13, java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.R(int, java.lang.String):long");
    }

    public static defpackage.c34 S(java.lang.String str, defpackage.hb0 hb0Var) {
        defpackage.j34 j34Var = defpackage.qa0.a;
        return defpackage.o34.a(new defpackage.tp4(15), str, hb0Var).i;
    }

    public static final void T(defpackage.v6 v6Var, android.util.SparseArray sparseArray) {
        if (((defpackage.mo) v6Var.b).a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            android.view.autofill.AutofillValue autofillValueF = defpackage.h4.f(sparseArray.get(iKeyAt));
            if (autofillValueF.isText()) {
                defpackage.mo moVar = (defpackage.mo) v6Var.b;
                autofillValueF.getTextValue().toString();
                if (moVar.a.get(java.lang.Integer.valueOf(iKeyAt)) != null) {
                    defpackage.jc2.a();
                    return;
                }
            } else {
                if (autofillValueF.isDate()) {
                    throw new defpackage.rf0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueF.isList()) {
                    throw new defpackage.rf0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueF.isToggle()) {
                    throw new defpackage.rf0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final defpackage.pc U(defpackage.hd1 hd1Var, defpackage.k80 k80Var, int i2) {
        android.view.View view = (android.view.View) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f);
        boolean zF = k80Var.f(view);
        java.lang.Object objP = k80Var.P();
        java.lang.Object obj = defpackage.z70.a;
        if (zF || objP == obj) {
            objP = new defpackage.pc(view, null, hd1Var);
            k80Var.l0(objP);
        }
        defpackage.pc pcVar = (defpackage.pc) objP;
        boolean zH = k80Var.h(pcVar);
        java.lang.Object objP2 = k80Var.P();
        if (zH || objP2 == obj) {
            objP2 = new defpackage.fc(pcVar, 3);
            k80Var.l0(objP2);
        }
        defpackage.ft4.P(pcVar, (defpackage.jd1) objP2, k80Var);
        return pcVar;
    }

    public static final void V(defpackage.v6 v6Var, android.view.ViewStructure viewStructure) {
        defpackage.mo moVar = (defpackage.mo) v6Var.b;
        if (moVar.a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(moVar.a.size());
        java.util.Iterator it = moVar.a.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                defpackage.jc2.a();
                return;
            }
            android.view.ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId((android.view.autofill.AutofillId) v6Var.d, iIntValue);
            viewStructureNewChild.setId(iIntValue, ((defpackage.z7) v6Var.a).getContext().getPackageName(), null, null);
            viewStructureNewChild.setAutofillType(1);
            throw null;
        }
    }

    public static java.util.LinkedHashSet Y(defpackage.lt2 lt2Var, java.util.Collection collection, java.util.Collection collection2, defpackage.yo2 yo2Var, defpackage.l21 l21Var, defpackage.k23 k23Var, boolean z2) {
        if (lt2Var == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (yo2Var == null) {
            a(15);
            throw null;
        }
        if (l21Var == null) {
            a(16);
            throw null;
        }
        if (k23Var == null) {
            a(17);
            throw null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        k23Var.h(lt2Var, collection, collection2, yo2Var, new defpackage.up0(l21Var, linkedHashSet, z2));
        return linkedHashSet;
    }

    public static java.util.LinkedHashSet Z(defpackage.l21 l21Var, defpackage.yo2 yo2Var, defpackage.lt2 lt2Var, defpackage.k23 k23Var, java.util.AbstractCollection abstractCollection, java.util.Collection collection) {
        if (lt2Var == null) {
            a(0);
            throw null;
        }
        if (yo2Var == null) {
            a(3);
            throw null;
        }
        if (l21Var == null) {
            a(4);
            throw null;
        }
        if (k23Var != null) {
            return Y(lt2Var, abstractCollection, collection, yo2Var, l21Var, k23Var, false);
        }
        a(5);
        throw null;
    }

    public static /* synthetic */ void a(int i2) {
        java.lang.String str = i2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i2 != 18 ? 3 : 2];
        switch (i2) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = io.ktor.http.ContentDisposition.Parameters.Name;
                break;
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_AUDIO_RECONFIG /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_AUDIO_RECONFIG /* 18 */:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i2 == 18) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static java.util.LinkedHashSet a0(defpackage.l21 l21Var, defpackage.yo2 yo2Var, defpackage.lt2 lt2Var, defpackage.k23 k23Var, java.util.AbstractCollection abstractCollection, java.util.Collection collection) {
        if (lt2Var == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (yo2Var == null) {
            a(9);
            throw null;
        }
        if (l21Var == null) {
            a(10);
            throw null;
        }
        if (k23Var != null) {
            return Y(lt2Var, collection, abstractCollection, yo2Var, l21Var, k23Var, true);
        }
        a(11);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.sr0 r34, final defpackage.gi1 r35, defpackage.q60 r36, defpackage.to2 r37, final java.lang.String r38, final defpackage.ta1 r39, final defpackage.hd1 r40, defpackage.k80 r41, final int r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.b(sr0, gi1, q60, to2, java.lang.String, ta1, hd1, k80, int):void");
    }

    public static final java.lang.Object b0(defpackage.df0 df0Var, defpackage.xd1 xd1Var) throws java.lang.Throwable {
        defpackage.v21 v21VarA;
        defpackage.df0 df0VarT;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        defpackage.cf0 cf0Var = defpackage.d6.J;
        defpackage.vd0 vd0Var = (defpackage.vd0) df0Var.get(cf0Var);
        defpackage.k01 k01Var = defpackage.k01.f;
        if (vd0Var == null) {
            v21VarA = defpackage.kj4.a();
            df0VarT = defpackage.ct1.t(k01Var, df0Var.plus(v21VarA), true);
            defpackage.an0 an0Var = defpackage.cv0.b;
            if (df0VarT != an0Var && df0VarT.get(cf0Var) == null) {
                df0VarT = df0VarT.plus(an0Var);
            }
        } else {
            v21VarA = (defpackage.v21) defpackage.kj4.a.get();
            df0VarT = defpackage.ct1.t(k01Var, df0Var, true);
            defpackage.an0 an0Var2 = defpackage.cv0.b;
            if (df0VarT != an0Var2 && df0VarT.get(cf0Var) == null) {
                df0VarT = df0VarT.plus(an0Var2);
            }
        }
        defpackage.bs bsVar = new defpackage.bs(df0VarT, threadCurrentThread, v21VarA);
        bsVar.V(defpackage.qf0.f, bsVar, xd1Var);
        defpackage.v21 v21Var = bsVar.v;
        if (v21Var != null) {
            int i2 = defpackage.v21.u;
            v21Var.A(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long jB = v21Var != null ? v21Var.B() : Long.MAX_VALUE;
                if (bsVar.isCompleted()) {
                    if (v21Var != null) {
                        int i3 = defpackage.v21.u;
                        v21Var.t(false);
                    }
                    java.lang.Object objV = defpackage.uj2.V(bsVar.A());
                    defpackage.x50 x50Var = objV instanceof defpackage.x50 ? (defpackage.x50) objV : null;
                    if (x50Var == null) {
                        return objV;
                    }
                    throw x50Var.a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(bsVar, jB);
            } catch (java.lang.Throwable th) {
                if (v21Var != null) {
                    int i4 = defpackage.v21.u;
                    v21Var.t(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        bsVar.o(interruptedException);
        throw interruptedException;
    }

    public static final void c(defpackage.to2 to2Var, defpackage.q60 q60Var, defpackage.k80 k80Var, int i2) {
        int i3;
        k80Var.d0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (k80Var.f(to2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= k80Var.h(q60Var) ? 32 : 16;
        }
        int i4 = 0;
        if (k80Var.S(i3 & 1, (i3 & 19) != 18)) {
            e(to2Var, q60Var, k80Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qc(to2Var, q60Var, i2, i4);
        }
    }

    public static java.lang.Object c0(defpackage.xd1 xd1Var) {
        return b0(defpackage.k01.f, xd1Var);
    }

    public static final void d0(defpackage.q4 q4Var, defpackage.jz3 jz3Var) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = q4Var.a;
        java.lang.Object objG = jz3Var.k().f.g(defpackage.nz3.f);
        if (objG == null) {
            objG = null;
        }
        defpackage.u30 u30Var = (defpackage.u30) objG;
        if (u30Var != null) {
            accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(u30Var.a, u30Var.b, false, 0));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object objG2 = jz3Var.k().f.g(defpackage.nz3.e);
        if ((objG2 != null ? objG2 : null) != null) {
            java.util.List listJ = defpackage.jz3.j(4, jz3Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.jz3 jz3Var2 = (defpackage.jz3) listJ.get(i2);
                if (jz3Var2.k().f.c(defpackage.nz3.G)) {
                    arrayList.add(jz3Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zL = l(arrayList);
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(zL ? 1 : arrayList.size(), zL ? arrayList.size() : 1, false, 0));
    }

    public static final void e(defpackage.to2 to2Var, defpackage.q60 q60Var, defpackage.k80 k80Var, int i2) {
        int i3;
        k80Var.d0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (k80Var.f(to2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= k80Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= k80Var.h(q60Var) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        }
        int i4 = 0;
        int i5 = 1;
        if (k80Var.S(i3 & 1, (i3 & 147) != 146)) {
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
                objP2 = new defpackage.rc(ls2Var, i4);
                k80Var.l0(objP2);
            }
            defpackage.ft4.L(defpackage.hg4.b.a(U((defpackage.hd1) objP2, k80Var, 0)), defpackage.q8.n0(-291176396, new defpackage.tc(to2Var, ls2Var, q60Var), k80Var), k80Var, 56);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qc(to2Var, q60Var, i2, i5);
        }
    }

    public static final void e0(defpackage.q4 q4Var, defpackage.jz3 jz3Var) {
        java.lang.Object objG = jz3Var.k().f.g(defpackage.nz3.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            defpackage.jc2.a();
            return;
        }
        defpackage.jz3 jz3VarL = jz3Var.l();
        if (jz3VarL == null) {
            return;
        }
        java.lang.Object objG2 = jz3VarL.k().f.g(defpackage.nz3.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            java.lang.Object objG3 = jz3VarL.k().f.g(defpackage.nz3.f);
            defpackage.u30 u30Var = (defpackage.u30) (objG3 != null ? objG3 : null);
            if (u30Var == null || (u30Var.a >= 0 && u30Var.b >= 0)) {
                if (jz3Var.k().f.c(defpackage.nz3.G)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.List listJ = defpackage.jz3.j(4, jz3VarL);
                    int size = listJ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        defpackage.jz3 jz3Var2 = (defpackage.jz3) listJ.get(i3);
                        if (jz3Var2.k().f.c(defpackage.nz3.G)) {
                            arrayList.add(jz3Var2);
                            if (jz3Var2.c.w() < jz3Var.c.w()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zL = l(arrayList);
                    int i4 = zL ? 0 : i2;
                    int i5 = zL ? i2 : 0;
                    java.lang.Object objG4 = jz3Var.k().f.g(defpackage.nz3.G);
                    if (objG4 == null) {
                        objG4 = java.lang.Boolean.FALSE;
                    }
                    q4Var.a.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((java.lang.Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static void f0(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            defpackage.n4.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            defpackage.n4.f(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            h0(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            h0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            h0(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = java.lang.Math.min(charSequence.length() - i3, i9 - java.lang.Math.min(i5, (int) (i9 * 0.8d)));
        int iMin2 = java.lang.Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (java.lang.Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (java.lang.Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        h0(editorInfo, i8 != i7 ? android.text.TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g0(android.view.inputmethod.EditorInfo r3, boolean r4) {
        /*
            int r0 = defpackage.wu.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L32
            r1 = 34
            if (r0 < r1) goto L35
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1a
            goto L35
        L1a:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.lang.String r2 = "VanillaIceCream"
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L35
        L32:
            defpackage.mz0.a(r3, r4)
        L35:
            android.os.Bundle r0 = r3.extras
            if (r0 != 0) goto L40
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3.extras = r0
        L40:
            android.os.Bundle r3 = r3.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r3.putBoolean(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.g0(android.view.inputmethod.EditorInfo, boolean):void");
    }

    public static final boolean h(defpackage.vw0 vw0Var, long j) {
        if (!vw0Var.f.E) {
            return false;
        }
        defpackage.qq1 qq1Var = defpackage.ct1.L(vw0Var).W.c;
        if (!qq1Var.g0.E) {
            return false;
        }
        long jI = qq1Var.I(0L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jI & 4294967295L));
        long j2 = vw0Var.H;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static void h0(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final void i(defpackage.vw0 vw0Var, defpackage.m5 m5Var) {
        vw0Var.y0();
        vw0Var.A0(m5Var);
    }

    public static final defpackage.tg0 i0(org.moontechlab.selenetv.model.DanmakuComment danmakuComment) {
        danmakuComment.getClass();
        long jHashCode = (danmakuComment.a * 31) + danmakuComment.d.hashCode();
        long j = danmakuComment.a;
        java.lang.String str = danmakuComment.d;
        int i2 = danmakuComment.b;
        return new defpackage.tg0(jHashCode, j, str, i2 != 4 ? i2 != 5 ? defpackage.ug0.f : defpackage.ug0.i : defpackage.ug0.t, (int) (danmakuComment.c & 16777215));
    }

    public static final void j(defpackage.fn4 fn4Var, defpackage.jd1 jd1Var) {
        if (jd1Var.invoke(fn4Var) != defpackage.en4.f) {
            return;
        }
        defpackage.st1.F(fn4Var, jd1Var);
    }

    public static defpackage.cq4 j0(defpackage.cq4 cq4Var) {
        int i2 = 0;
        if (!(cq4Var instanceof defpackage.op1)) {
            return new defpackage.ty(cq4Var, i2);
        }
        defpackage.op1 op1Var = (defpackage.op1) cq4Var;
        defpackage.rp4[] rp4VarArr = op1Var.b;
        defpackage.xp4[] xp4VarArr = op1Var.c;
        xp4VarArr.getClass();
        rp4VarArr.getClass();
        int iMin = java.lang.Math.min(xp4VarArr.length, rp4VarArr.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(iMin);
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList.add(new defpackage.h33(xp4VarArr[i3], rp4VarArr[i3]));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, arrayList));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            defpackage.h33 h33Var = (defpackage.h33) it.next();
            arrayList2.add(w((defpackage.xp4) h33Var.f, (defpackage.rp4) h33Var.i));
        }
        return new defpackage.op1(rp4VarArr, (defpackage.xp4[]) arrayList2.toArray(new defpackage.xp4[0]), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object k(java.util.List list, defpackage.sd4 sd4Var) {
        if (list.isEmpty()) {
            return defpackage.m01.f;
        }
        defpackage.co0[] co0VarArr = (defpackage.co0[]) list.toArray(new defpackage.co0[0]);
        defpackage.yo yoVar = new defpackage.yo(co0VarArr);
        defpackage.gy gyVar = new defpackage.gy(1, defpackage.ht1.C(sd4Var));
        gyVar.s();
        int length = co0VarArr.length;
        defpackage.wo[] woVarArr = new defpackage.wo[length];
        for (int i2 = 0; i2 < length; i2++) {
            io.ktor.utils.io.ChannelJob channelJob = co0VarArr[i2];
            ((defpackage.bw1) channelJob).start();
            defpackage.wo woVar = new defpackage.wo(yoVar, gyVar);
            woVar.w = defpackage.nq1.C(channelJob, false, woVar, 3);
            woVarArr[i2] = woVar;
        }
        defpackage.xo xoVar = new defpackage.xo(woVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            defpackage.wo woVar2 = woVarArr[i3];
            woVar2.getClass();
            defpackage.wo.y.set(woVar2, xoVar);
        }
        if (defpackage.gy.x.get(gyVar) instanceof defpackage.mx2) {
            gyVar.u(xoVar);
        } else {
            xoVar.b();
        }
        return gyVar.r();
    }

    public static float k0() {
        return ((float) java.lang.Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final boolean l(java.util.ArrayList arrayList) {
        java.util.List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = defpackage.m01.f;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    java.lang.Object obj2 = arrayList.get(i2);
                    defpackage.jz3 jz3Var = (defpackage.jz3) obj2;
                    defpackage.jz3 jz3Var2 = (defpackage.jz3) obj;
                    float fAbs = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jz3Var2.g().b() >> 32)) - java.lang.Float.intBitsToFloat((int) (jz3Var.g().b() >> 32)));
                    float fAbs2 = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jz3Var2.g().b() & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (jz3Var.g().b() & 4294967295L)));
                    arrayList2.add(new defpackage.qy2((java.lang.Float.floatToRawIntBits(fAbs) << 32) | (java.lang.Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((defpackage.qy2) defpackage.y30.v0(list)).a;
            } else {
                if (list.isEmpty()) {
                    defpackage.oc2.b("Empty collection can't be reduced.");
                }
                java.lang.Object objV0 = defpackage.y30.v0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objV0 = new defpackage.qy2(defpackage.qy2.e(((defpackage.qy2) objV0).a, ((defpackage.qy2) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j = ((defpackage.qy2) objV0).a;
            }
            if (java.lang.Float.intBitsToFloat((int) (4294967295L & j)) >= java.lang.Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void o(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static boolean p(android.graphics.Canvas canvas, android.graphics.Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean q(android.graphics.Canvas canvas, float f2, float f3, float f4, float f5) {
        return canvas.clipOutRect(f2, f3, f4, f5);
    }

    public static boolean r(android.graphics.Canvas canvas, int i2, int i3, int i4, int i5) {
        return canvas.clipOutRect(i2, i3, i4, i5);
    }

    public static boolean t(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean u(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final defpackage.w32 v(defpackage.w32 w32Var, java.util.HashSet hashSet) {
        defpackage.q34 q34VarD;
        defpackage.w32 w32VarV;
        defpackage.tf2 tf2Var = defpackage.tf2.Q;
        defpackage.yo4 yo4VarO0 = tf2Var.o0(w32Var);
        if (hashSet.add(yo4VarO0)) {
            defpackage.rp4 rp4VarD0 = defpackage.om2.d0(yo4VarO0);
            if (rp4VarD0 != null) {
                defpackage.w32 w32VarG = defpackage.tk4.g(rp4VarD0);
                defpackage.w32 w32VarV2 = v(w32VarG, hashSet);
                if (w32VarV2 != null) {
                    return ((w32VarV2 instanceof defpackage.s34) && defpackage.om2.w0((defpackage.s34) w32VarV2) && defpackage.om2.v0(w32Var) && (defpackage.om2.q0(tf2Var.o0(w32VarG)) || ((w32VarG instanceof defpackage.s34) && defpackage.om2.w0((defpackage.s34) w32VarG)))) ? tf2Var.K0(w32VarG) : (!defpackage.om2.v0(w32VarV2) && (w32Var instanceof defpackage.s34) && defpackage.om2.t0((defpackage.s34) w32Var)) ? tf2Var.K0(w32VarV2) : w32VarV2;
                }
            } else {
                if (!defpackage.om2.q0(yo4VarO0)) {
                    return w32Var;
                }
                w32Var.getClass();
                if (w32Var instanceof defpackage.s32) {
                    q34VarD = defpackage.lq1.d((defpackage.s32) w32Var);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(w32Var);
                    sb.append(", ");
                    defpackage.jc2.f(defpackage.sr2.h(defpackage.lo3.a, w32Var.getClass(), sb));
                    q34VarD = null;
                }
                if (q34VarD != null && (w32VarV = v(q34VarD, hashSet)) != null) {
                    return !defpackage.om2.v0(w32Var) ? w32VarV : defpackage.om2.v0(w32VarV) ? w32Var : ((w32VarV instanceof defpackage.s34) && defpackage.om2.w0((defpackage.s34) w32VarV)) ? w32Var : tf2Var.K0(w32VarV);
                }
            }
        }
        return null;
    }

    public static final defpackage.xp4 w(defpackage.xp4 xp4Var, defpackage.rp4 rp4Var) {
        if (rp4Var == null || xp4Var.a() == 1) {
            return xp4Var;
        }
        if (rp4Var.y() != xp4Var.a()) {
            defpackage.sy syVar = new defpackage.sy(xp4Var);
            defpackage.so4.i.getClass();
            return new defpackage.yp4(1, new defpackage.py(xp4Var, syVar, false, defpackage.so4.t));
        }
        if (!xp4Var.c()) {
            return new defpackage.yp4(xp4Var.b());
        }
        defpackage.bg2 bg2Var = defpackage.kg2.e;
        bg2Var.getClass();
        return new defpackage.yp4(1, new defpackage.oa2(bg2Var, new defpackage.k3(4, xp4Var)));
    }

    public static defpackage.xo4 y(boolean z2, defpackage.x32 x32Var, int i2) {
        defpackage.tf2 tf2Var = defpackage.tf2.Q;
        if ((i2 & 8) != 0) {
            x32Var = defpackage.x32.a;
        }
        return new defpackage.xo4(z2, true, tf2Var, x32Var, defpackage.y32.a);
    }

    public static int z(java.lang.String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public abstract defpackage.d1 D(defpackage.m1 m1Var);

    public abstract defpackage.l1 E(defpackage.m1 m1Var);

    public abstract void W(defpackage.l1 l1Var, defpackage.l1 l1Var2);

    public abstract void X(defpackage.l1 l1Var, java.lang.Thread thread);

    public abstract boolean m(defpackage.m1 m1Var, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean n(defpackage.m1 m1Var, defpackage.l1 l1Var, defpackage.l1 l1Var2);
}
