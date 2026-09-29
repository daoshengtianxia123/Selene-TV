package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class h8 extends defpackage.z3 {
    public static final defpackage.jr2 Q;
    public boolean A;
    public defpackage.e8 B;
    public defpackage.kr2 C;
    public final defpackage.lr2 D;
    public final defpackage.ir2 E;
    public final defpackage.ir2 F;
    public final java.lang.String G;
    public final java.lang.String H;
    public final defpackage.oj I;
    public final defpackage.kr2 J;
    public defpackage.kz3 K;
    public boolean L;
    public final defpackage.ir2 M;
    public final defpackage.g7 N;
    public final java.util.ArrayList O;
    public final defpackage.g8 P;
    public final defpackage.z7 d;
    public int e = Integer.MIN_VALUE;
    public final defpackage.g8 f;
    public final android.view.accessibility.AccessibilityManager g;
    public long h;
    public final defpackage.a8 i;
    public final defpackage.b8 j;
    public java.util.List k;
    public final android.os.Handler l;
    public final defpackage.d8 m;
    public int n;
    public int o;
    public defpackage.q4 p;
    public defpackage.q4 q;
    public boolean r;
    public final defpackage.kr2 s;
    public final defpackage.kr2 t;
    public final defpackage.b74 u;
    public final defpackage.b74 v;
    public int w;
    public java.lang.Integer x;
    public final defpackage.qk y;
    public final defpackage.ru z;

    static {
        int[] iArr = {dev.jdtech.mpv.R.id.accessibility_custom_action_0, dev.jdtech.mpv.R.id.accessibility_custom_action_1, dev.jdtech.mpv.R.id.accessibility_custom_action_2, dev.jdtech.mpv.R.id.accessibility_custom_action_3, dev.jdtech.mpv.R.id.accessibility_custom_action_4, dev.jdtech.mpv.R.id.accessibility_custom_action_5, dev.jdtech.mpv.R.id.accessibility_custom_action_6, dev.jdtech.mpv.R.id.accessibility_custom_action_7, dev.jdtech.mpv.R.id.accessibility_custom_action_8, dev.jdtech.mpv.R.id.accessibility_custom_action_9, dev.jdtech.mpv.R.id.accessibility_custom_action_10, dev.jdtech.mpv.R.id.accessibility_custom_action_11, dev.jdtech.mpv.R.id.accessibility_custom_action_12, dev.jdtech.mpv.R.id.accessibility_custom_action_13, dev.jdtech.mpv.R.id.accessibility_custom_action_14, dev.jdtech.mpv.R.id.accessibility_custom_action_15, dev.jdtech.mpv.R.id.accessibility_custom_action_16, dev.jdtech.mpv.R.id.accessibility_custom_action_17, dev.jdtech.mpv.R.id.accessibility_custom_action_18, dev.jdtech.mpv.R.id.accessibility_custom_action_19, dev.jdtech.mpv.R.id.accessibility_custom_action_20, dev.jdtech.mpv.R.id.accessibility_custom_action_21, dev.jdtech.mpv.R.id.accessibility_custom_action_22, dev.jdtech.mpv.R.id.accessibility_custom_action_23, dev.jdtech.mpv.R.id.accessibility_custom_action_24, dev.jdtech.mpv.R.id.accessibility_custom_action_25, dev.jdtech.mpv.R.id.accessibility_custom_action_26, dev.jdtech.mpv.R.id.accessibility_custom_action_27, dev.jdtech.mpv.R.id.accessibility_custom_action_28, dev.jdtech.mpv.R.id.accessibility_custom_action_29, dev.jdtech.mpv.R.id.accessibility_custom_action_30, dev.jdtech.mpv.R.id.accessibility_custom_action_31};
        defpackage.jr2 jr2Var = defpackage.jr1.a;
        defpackage.jr2 jr2Var2 = new defpackage.jr2(32);
        int i = jr2Var2.b;
        if (i < 0) {
            defpackage.da1.S("");
            throw null;
        }
        int i2 = i + 32;
        int[] iArr2 = jr2Var2.a;
        if (iArr2.length < i2) {
            jr2Var2.a = java.util.Arrays.copyOf(iArr2, java.lang.Math.max(i2, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = jr2Var2.a;
        int i3 = jr2Var2.b;
        if (i != i3) {
            defpackage.sk.H0(iArr3, i2, iArr3, i, i3);
        }
        defpackage.sk.K0(iArr, i, iArr3, 0, 12);
        jr2Var2.b += 32;
        Q = jr2Var2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [a8] */
    /* JADX WARN: Type inference failed for: r3v3, types: [b8] */
    public h8(defpackage.z7 z7Var) {
        this.d = z7Var;
        int i = 0;
        this.f = new defpackage.g8(this, i);
        java.lang.Object systemService = z7Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: a8
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                defpackage.h8 h8Var = this.a;
                h8Var.k = z ? h8Var.g.getEnabledAccessibilityServiceList(-1) : defpackage.m01.f;
            }
        };
        this.j = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: b8
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                defpackage.h8 h8Var = this.a;
                h8Var.k = h8Var.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new android.os.Handler(android.os.Looper.getMainLooper());
        this.m = new defpackage.d8(this);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new defpackage.kr2();
        this.t = new defpackage.kr2();
        this.u = new defpackage.b74(0);
        this.v = new defpackage.b74(0);
        this.w = -1;
        this.y = new defpackage.qk();
        this.z = defpackage.u22.c(1, 6, null);
        this.A = true;
        defpackage.kr2 kr2Var = defpackage.mr1.a;
        kr2Var.getClass();
        this.C = kr2Var;
        this.D = new defpackage.lr2();
        this.E = new defpackage.ir2();
        this.F = new defpackage.ir2();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new defpackage.oj(11);
        this.J = new defpackage.kr2();
        this.K = new defpackage.kz3(z7Var.getSemanticsOwner().a(), kr2Var);
        int i2 = defpackage.gr1.a;
        this.M = new defpackage.ir2();
        z7Var.addOnAttachStateChangeListener(new defpackage.c8(i, this));
        this.N = new defpackage.g7(2, this);
        this.O = new java.util.ArrayList();
        this.P = new defpackage.g8(this, 1);
    }

    public static /* synthetic */ void E(defpackage.h8 h8Var, int i, int i2, java.lang.Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        h8Var.D(i, i2, num, null);
    }

    public static android.graphics.Rect L(defpackage.or1 or1Var) {
        if (!(or1Var instanceof defpackage.f23) && !(or1Var instanceof defpackage.g23)) {
            return null;
        }
        defpackage.vl3 vl3VarT = or1Var.t();
        return new android.graphics.Rect((int) vl3VarT.a, (int) vl3VarT.b, (int) vl3VarT.c, (int) vl3VarT.d);
    }

    public static float[] M(defpackage.or1 or1Var) {
        if (!(or1Var instanceof defpackage.g23)) {
            return null;
        }
        defpackage.fs3 fs3Var = ((defpackage.g23) or1Var).c;
        long j = fs3Var.h;
        long j2 = fs3Var.g;
        long j3 = fs3Var.f;
        long j4 = fs3Var.e;
        return new float[]{java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static android.graphics.Region N(defpackage.or1 or1Var) {
        if (or1Var instanceof defpackage.e23) {
            defpackage.e23 e23Var = (defpackage.e23) or1Var;
            defpackage.vl3 vl3VarT = e23Var.t();
            android.graphics.Region region = new android.graphics.Region(new android.graphics.Rect((int) vl3VarT.a, (int) vl3VarT.b, (int) vl3VarT.c, (int) vl3VarT.d));
            android.graphics.Region region2 = new android.graphics.Region();
            defpackage.bb bbVar = e23Var.c;
            if (bbVar instanceof defpackage.bb) {
                region2.setPath(bbVar.a, region);
                return region2;
            }
            defpackage.c.y("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static java.lang.CharSequence O(java.lang.CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (java.lang.Character.isHighSurrogate(charSequence.charAt(99999)) && java.lang.Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static java.lang.String u(defpackage.jz3 jz3Var) {
        defpackage.kh khVar;
        if (jz3Var != null) {
            defpackage.fz3 fz3Var = jz3Var.d;
            defpackage.es2 es2Var = fz3Var.f;
            defpackage.qz3 qz3Var = defpackage.nz3.a;
            if (es2Var.c(qz3Var)) {
                return defpackage.oc2.a((java.util.List) fz3Var.c(qz3Var), ",", null, 62);
            }
            defpackage.qz3 qz3Var2 = defpackage.nz3.D;
            if (es2Var.c(qz3Var2)) {
                java.lang.Object objG = es2Var.g(qz3Var2);
                if (objG == null) {
                    objG = null;
                }
                defpackage.kh khVar2 = (defpackage.kh) objG;
                if (khVar2 != null) {
                    return khVar2.i;
                }
            } else {
                java.lang.Object objG2 = es2Var.g(defpackage.nz3.z);
                if (objG2 == null) {
                    objG2 = null;
                }
                java.util.List list = (java.util.List) objG2;
                if (list != null && (khVar = (defpackage.kh) defpackage.y30.x0(list)) != null) {
                    return khVar.i;
                }
            }
        }
        return null;
    }

    public static final boolean x(defpackage.vu3 vu3Var, float f) {
        defpackage.hd1 hd1Var = vu3Var.a;
        if (f >= 0.0f || ((java.lang.Number) hd1Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((java.lang.Number) hd1Var.invoke()).floatValue() < ((java.lang.Number) vu3Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(defpackage.vu3 vu3Var) {
        defpackage.hd1 hd1Var = vu3Var.a;
        if (((java.lang.Number) hd1Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((java.lang.Number) hd1Var.invoke()).floatValue();
        ((java.lang.Number) vu3Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(defpackage.vu3 vu3Var) {
        defpackage.hd1 hd1Var = vu3Var.a;
        if (((java.lang.Number) hd1Var.invoke()).floatValue() < ((java.lang.Number) vu3Var.b.invoke()).floatValue()) {
            return true;
        }
        ((java.lang.Number) hd1Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.jz3 r20, defpackage.kz3 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.vr1.a
            lr2 r3 = new lr2
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.jz3.j(r4, r1)
            y42 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            jz3 r10 = (defpackage.jz3) r10
            lr1 r11 = r0.t()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            lr2 r11 = r2.b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.w(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            lr2 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.w(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = defpackage.jz3.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            jz3 r3 = (defpackage.jz3) r3
            kr2 r4 = r0.J
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            kz3 r4 = (defpackage.kz3) r4
            if (r4 == 0) goto Lb6
            lr1 r5 = r0.t()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.B(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.B(jz3, kz3):void");
    }

    public final boolean C(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((java.lang.Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean D(int i, int i2, java.lang.Integer num, java.util.List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(defpackage.oc2.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        defpackage.e8 e8Var = this.B;
        if (e8Var != null) {
            if (i != e8Var.d().g) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - e8Var.f() <= 1000) {
                android.view.accessibility.AccessibilityEvent accessibilityEventO = o(A(e8Var.d().g), 131072);
                accessibilityEventO.setFromIndex(e8Var.b());
                accessibilityEventO.setToIndex(e8Var.e());
                accessibilityEventO.setAction(e8Var.a());
                accessibilityEventO.setMovementGranularity(e8Var.c());
                accessibilityEventO.getText().add(u(e8Var.d()));
                C(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.lr1 r59) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.H(lr1):void");
    }

    public final void I(defpackage.y42 y42Var, defpackage.lr2 lr2Var) {
        defpackage.fz3 fz3VarX;
        defpackage.y42 y42VarF;
        if (y42Var.I() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(y42Var)) {
            if (!y42Var.W.d(8)) {
                y42Var = defpackage.wq4.f(y42Var, defpackage.r7.u);
            }
            if (y42Var == null || (fz3VarX = y42Var.x()) == null) {
                return;
            }
            if (!fz3VarX.t && (y42VarF = defpackage.wq4.f(y42Var, defpackage.r7.t)) != null) {
                y42Var = y42VarF;
            }
            int i = y42Var.i;
            if (lr2Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(defpackage.y42 y42Var) {
        if (y42Var.I() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(y42Var)) {
            int i = y42Var.i;
            defpackage.vu3 vu3Var = (defpackage.vu3) this.s.b(i);
            defpackage.vu3 vu3Var2 = (defpackage.vu3) this.t.b(i);
            if (vu3Var == null && vu3Var2 == null) {
                return;
            }
            android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (vu3Var != null) {
                accessibilityEventO.setScrollX((int) ((java.lang.Number) vu3Var.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((java.lang.Number) vu3Var.b.invoke()).floatValue());
            }
            if (vu3Var2 != null) {
                accessibilityEventO.setScrollY((int) ((java.lang.Number) vu3Var2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((java.lang.Number) vu3Var2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(defpackage.jz3 jz3Var, int i, int i2, boolean z) {
        java.lang.String strU;
        defpackage.fz3 fz3Var = jz3Var.d;
        int i3 = jz3Var.g;
        defpackage.qz3 qz3Var = defpackage.ez3.i;
        if (fz3Var.f.c(qz3Var) && defpackage.wq4.d(jz3Var)) {
            defpackage.yd1 yd1Var = (defpackage.yd1) ((defpackage.w3) fz3Var.c(qz3Var)).b;
            if (yd1Var != null) {
                return ((java.lang.Boolean) yd1Var.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strU = u(jz3Var)) != null) {
            if (i < 0 || i != i2 || i2 > strU.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strU.length() > 0;
            C(q(A(i3), z2 ? java.lang.Integer.valueOf(this.w) : null, z2 ? java.lang.Integer.valueOf(this.w) : null, z2 ? java.lang.Integer.valueOf(strU.length()) : null, strU));
            G(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.P():void");
    }

    @Override // defpackage.z3
    public final defpackage.p5 b(android.view.View view) {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, defpackage.q4 q4Var, java.lang.String str, android.os.Bundle bundle) {
        defpackage.jz3 jz3VarB;
        android.graphics.Region regionN;
        float[] fArrM;
        android.graphics.Rect rectL;
        android.graphics.RectF rectF;
        defpackage.lz3 lz3Var = (defpackage.lz3) t().b(i);
        if (lz3Var == null || (jz3VarB = lz3Var.b()) == null) {
            return;
        }
        defpackage.fz3 fz3Var = jz3VarB.d;
        defpackage.es2 es2Var = fz3Var.f;
        java.lang.String strU = u(jz3VarB);
        if (defpackage.ct1.g(str, this.G)) {
            int iD = this.E.d(i);
            if (iD != -1) {
                q4Var.j().putInt(str, iD);
                return;
            }
            return;
        }
        if (defpackage.ct1.g(str, this.H)) {
            int iD2 = this.F.d(i);
            if (iD2 != -1) {
                q4Var.j().putInt(str, iD2);
                return;
            }
            return;
        }
        defpackage.ax2 ax2Var = null;
        if (es2Var.c(defpackage.ez3.a) && bundle != null && defpackage.ct1.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strU != null ? strU.length() : Integer.MAX_VALUE)) {
                    defpackage.li4 li4VarF = defpackage.p6.F(fz3Var);
                    if (li4VarF == null) {
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= li4VarF.a.a.i.length()) {
                            arrayList.add(ax2Var);
                        } else {
                            defpackage.vl3 vl3VarB = li4VarF.b(i5);
                            defpackage.ax2 ax2VarD = jz3VarB.d();
                            long jI = 0;
                            if (ax2VarD != null) {
                                if (!ax2VarD.H0().E) {
                                    ax2VarD = ax2Var;
                                }
                                if (ax2VarD != null) {
                                    jI = ax2VarD.I(0L);
                                }
                            }
                            defpackage.vl3 vl3VarI = vl3VarB.i(jI);
                            defpackage.vl3 vl3VarG = jz3VarB.g();
                            if ((vl3VarI.g(vl3VarG) ? vl3VarI.e(vl3VarG) : ax2Var) != 0) {
                                defpackage.z7 z7Var = this.d;
                                long jY = z7Var.y((java.lang.Float.floatToRawIntBits(r9.b) & 4294967295L) | (java.lang.Float.floatToRawIntBits(r9.a) << 32));
                                long jY2 = z7Var.y((java.lang.Float.floatToRawIntBits(r9.c) << 32) | (java.lang.Float.floatToRawIntBits(r9.d) & 4294967295L));
                                int i6 = (int) (jY >> 32);
                                int i7 = (int) (jY2 >> 32);
                                int i8 = (int) (jY & 4294967295L);
                                int i9 = (int) (jY2 & 4294967295L);
                                rectF = new android.graphics.RectF(java.lang.Math.min(java.lang.Float.intBitsToFloat(i6), java.lang.Float.intBitsToFloat(i7)), java.lang.Math.min(java.lang.Float.intBitsToFloat(i8), java.lang.Float.intBitsToFloat(i9)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i6), java.lang.Float.intBitsToFloat(i7)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i8), java.lang.Float.intBitsToFloat(i9)));
                            } else {
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        ax2Var = null;
                    }
                    q4Var.j().putParcelableArray(str, (android.os.Parcelable[]) arrayList.toArray(new android.graphics.RectF[0]));
                    return;
                }
            }
            android.util.Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        defpackage.qz3 qz3Var = defpackage.nz3.x;
        if (es2Var.c(qz3Var) && bundle != null && defpackage.ct1.g(str, "androidx.compose.ui.semantics.testTag")) {
            java.lang.Object objG = es2Var.g(qz3Var);
            java.lang.String str2 = (java.lang.String) (objG == null ? null : objG);
            if (str2 != null) {
                q4Var.j().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (defpackage.ct1.g(str, "androidx.compose.ui.semantics.id")) {
            q4Var.j().putInt(str, jz3VarB.g);
            return;
        }
        if (defpackage.ct1.g(str, "androidx.compose.ui.semantics.shapeType")) {
            java.lang.Object objG2 = es2Var.g(defpackage.nz3.N);
            if (objG2 == null) {
                objG2 = null;
            }
            defpackage.y14 y14Var = (defpackage.y14) objG2;
            if (y14Var != null) {
                defpackage.or1 or1VarP = p(y14Var, jz3VarB);
                if (or1VarP instanceof defpackage.f23) {
                    q4Var.j().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    q4Var.j().putParcelable("androidx.compose.ui.semantics.shapeRect", L(or1VarP));
                    return;
                } else if (or1VarP instanceof defpackage.g23) {
                    q4Var.j().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    q4Var.j().putParcelable("androidx.compose.ui.semantics.shapeRect", L(or1VarP));
                    q4Var.j().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(or1VarP));
                    return;
                } else if (!(or1VarP instanceof defpackage.e23)) {
                    defpackage.jc2.o();
                    return;
                } else {
                    q4Var.j().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    q4Var.j().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(or1VarP));
                    return;
                }
            }
            return;
        }
        if (defpackage.ct1.g(str, "androidx.compose.ui.semantics.shapeRect")) {
            java.lang.Object objG3 = es2Var.g(defpackage.nz3.N);
            if (objG3 == null) {
                objG3 = null;
            }
            defpackage.y14 y14Var2 = (defpackage.y14) objG3;
            if (y14Var2 == null || (rectL = L(p(y14Var2, jz3VarB))) == null) {
                return;
            }
            q4Var.j().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
            return;
        }
        if (defpackage.ct1.g(str, "androidx.compose.ui.semantics.shapeCorners")) {
            java.lang.Object objG4 = es2Var.g(defpackage.nz3.N);
            defpackage.y14 y14Var3 = (defpackage.y14) (objG4 == null ? null : objG4);
            if (y14Var3 == null || (fArrM = M(p(y14Var3, jz3VarB))) == null) {
                return;
            }
            q4Var.j().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM);
            return;
        }
        if (defpackage.ct1.g(str, "androidx.compose.ui.semantics.shapeRegion")) {
            java.lang.Object objG5 = es2Var.g(defpackage.nz3.N);
            defpackage.y14 y14Var4 = (defpackage.y14) (objG5 == null ? null : objG5);
            if (y14Var4 == null || (regionN = N(p(y14Var4, jz3VarB))) == null) {
                return;
            }
            q4Var.j().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionN);
        }
    }

    public final android.graphics.Rect k(defpackage.lz3 lz3Var) {
        defpackage.sr1 sr1VarA = lz3Var.a();
        float fC = sr1VarA.c();
        float fE = sr1VarA.e();
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
        defpackage.z7 z7Var = this.d;
        long jY = z7Var.y((java.lang.Float.floatToRawIntBits(fE) & 4294967295L) | (jFloatToRawIntBits << 32));
        float fD = sr1VarA.d();
        float fA = sr1VarA.a();
        long jY2 = z7Var.y((java.lang.Float.floatToRawIntBits(fD) << 32) | (java.lang.Float.floatToRawIntBits(fA) & 4294967295L));
        int i = (int) (jY >> 32);
        int i2 = (int) (jY2 >> 32);
        int i3 = (int) (jY & 4294967295L);
        int i4 = (int) (jY2 & 4294967295L);
        return new android.graphics.Rect((int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2))), (int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (defpackage.q8.M(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f1 -> B:50:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ud0 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.l(ud0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.m(int, long, boolean):boolean");
    }

    public final void n() {
        android.os.Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.K);
            }
            android.os.Trace.endSection();
            android.os.Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(t());
                android.os.Trace.endSection();
                android.os.Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final android.view.accessibility.AccessibilityEvent o(int i, int i2) {
        defpackage.lz3 lz3Var;
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        defpackage.z7 z7Var = this.d;
        accessibilityEventObtain.setPackageName(z7Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(z7Var, i);
        if (v() && (lz3Var = (defpackage.lz3) t().b(i)) != null) {
            accessibilityEventObtain.setPassword(lz3Var.b().d.f.c(defpackage.nz3.I));
            java.lang.Object objG = lz3Var.b().d.f.g(defpackage.nz3.m);
            if (objG == null) {
                objG = null;
            }
            defpackage.rs.V(accessibilityEventObtain, defpackage.ct1.g(objG, java.lang.Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    public final defpackage.or1 p(defpackage.y14 y14Var, defpackage.jz3 jz3Var) {
        defpackage.ax2 ax2VarD = jz3Var.d();
        return y14Var.a(defpackage.xr1.f0(ax2VarD != null ? ax2VarD.t : 0L), jz3Var.c.Q, this.d.getDensity());
    }

    public final android.view.accessibility.AccessibilityEvent q(int i, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.CharSequence charSequence) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int r(defpackage.jz3 jz3Var) {
        defpackage.fz3 fz3Var = jz3Var.d;
        if (!fz3Var.f.c(defpackage.nz3.a)) {
            defpackage.qz3 qz3Var = defpackage.nz3.E;
            if (fz3Var.f.c(qz3Var)) {
                return (int) (((defpackage.xi4) fz3Var.c(qz3Var)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int s(defpackage.jz3 jz3Var) {
        defpackage.fz3 fz3Var = jz3Var.d;
        if (!fz3Var.f.c(defpackage.nz3.a)) {
            defpackage.qz3 qz3Var = defpackage.nz3.E;
            if (fz3Var.f.c(qz3Var)) {
                return (int) (((defpackage.xi4) fz3Var.c(qz3Var)).a >> 32);
            }
        }
        return this.w;
    }

    public final defpackage.lr1 t() {
        if (this.A) {
            this.A = false;
            defpackage.z7 z7Var = this.d;
            this.C = defpackage.bt1.G(z7Var.getSemanticsOwner());
            if (v()) {
                defpackage.wq4.m(this.C, this.E, this.F, z7Var.getContext().getResources());
            }
        }
        return this.C;
    }

    public final boolean v() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void w(defpackage.y42 y42Var) {
        if (this.y.add(y42Var)) {
            this.z.mo0trySendJP2dKIU(defpackage.as4.a);
        }
    }
}
