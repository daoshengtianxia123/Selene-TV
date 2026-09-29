package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class z7 extends android.view.ViewGroup implements defpackage.q23, defpackage.yr3, defpackage.wj2, defpackage.hm0, defpackage.d23 {
    public static java.lang.Class Y0;
    public static java.lang.reflect.Method Z0;
    public static java.lang.reflect.Method a1;
    public static final defpackage.wr2 b1 = new defpackage.wr2();
    public static defpackage.k7 c1;
    public static java.lang.reflect.Method d1;
    public final defpackage.na2 A;
    public final defpackage.qo0 A0;
    public final defpackage.my B;
    public final defpackage.d6 B0;
    public final defpackage.gd C;
    public final defpackage.a43 C0;
    public final defpackage.zq1 D;
    public int D0;
    public final defpackage.y42 E;
    public final defpackage.a43 E0;
    public final defpackage.kr2 F;
    public final defpackage.h73 F0;
    public final defpackage.wl3 G;
    public final defpackage.wq1 G0;
    public final defpackage.z7 H;
    public final defpackage.uo2 H0;
    public final defpackage.mz3 I;
    public final defpackage.xc I0;
    public final defpackage.h8 J;
    public android.view.MotionEvent J0;
    public defpackage.e9 K;
    public long K0;
    public final defpackage.t6 L;
    public final defpackage.mw L0;
    public final defpackage.ia M;
    public final defpackage.wr2 M0;
    public final defpackage.mo N;
    public float N0;
    public final java.util.ArrayList O;
    public float O0;
    public java.util.ArrayList P;
    public final defpackage.x7 P0;
    public boolean Q;
    public final defpackage.g7 Q0;
    public boolean R;
    public boolean R0;
    public final defpackage.lp2 S;
    public final defpackage.w7 S0;
    public final defpackage.q10 T;
    public final defpackage.uw T0;
    public defpackage.jd1 U;
    public boolean U0;
    public final defpackage.v6 V;
    public final defpackage.p5 V0;
    public final defpackage.y6 W;
    public android.view.View W0;
    public final defpackage.u7 X0;
    public boolean a0;
    public final defpackage.e7 b0;
    public final defpackage.d7 c0;
    public final defpackage.t23 d0;
    public boolean e0;
    public long f;
    public defpackage.rd f0;
    public defpackage.fc0 g0;
    public boolean h0;
    public final boolean i;
    public final defpackage.ck2 i0;
    public long j0;
    public final int[] k0;
    public final float[] l0;
    public final float[] m0;
    public final float[] n0;
    public long o0;
    public boolean p0;
    public long q0;
    public final defpackage.a43 r0;
    public final defpackage.fp0 s0;
    public final defpackage.a52 t;
    public defpackage.jd1 t0;
    public final defpackage.a43 u;
    public final defpackage.h7 u0;
    public final android.view.View v;
    public final defpackage.i7 v0;
    public final boolean w;
    public final defpackage.j7 w0;
    public final defpackage.na1 x;
    public final defpackage.ci4 x0;
    public defpackage.df0 y;
    public final defpackage.ai4 y0;
    public final defpackage.x9 z;
    public final java.util.concurrent.atomic.AtomicReference z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v32, types: [h7] */
    /* JADX WARN: Type inference failed for: r1v33, types: [i7] */
    /* JADX WARN: Type inference failed for: r1v34, types: [j7] */
    public z7(android.content.Context context, defpackage.df0 df0Var) {
        defpackage.v6 v6Var;
        defpackage.y6 y6Var;
        super(context);
        final defpackage.z7 z7Var = this;
        z7Var.f = 9205357640488583168L;
        int i = 1;
        z7Var.i = true;
        z7Var.t = new defpackage.a52();
        defpackage.ap0 ap0VarN = defpackage.ft4.N(context);
        defpackage.d6 d6Var = defpackage.d6.Z;
        z7Var.u = new defpackage.a43(ap0VarN, d6Var);
        int i2 = android.os.Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        z7Var.w = z;
        defpackage.q01 q01Var = new defpackage.q01();
        androidx.compose.ui.semantics.EmptySemanticsElement emptySemanticsElement = new androidx.compose.ui.semantics.EmptySemanticsElement(q01Var);
        defpackage.xo2 xo2Var = new defpackage.xo2() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(java.lang.Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f.hashCode();
            }

            @Override // defpackage.xo2
            public final defpackage.so2 k() {
                defpackage.rt rtVar = new defpackage.rt();
                rtVar.F = this.f;
                return rtVar;
            }

            @Override // defpackage.xo2
            public final void l(defpackage.so2 so2Var) {
                ((defpackage.rt) so2Var).F = this.f;
            }
        };
        z7Var.x = new defpackage.na1(z7Var, z7Var);
        z7Var.y = df0Var;
        z7Var.z = new defpackage.x9();
        z7Var.A = new defpackage.na2();
        defpackage.to2 to2VarA = androidx.compose.ui.input.key.a.a(defpackage.qo2.f, new defpackage.t7(z7Var, i3));
        defpackage.to2 to2VarA2 = androidx.compose.ui.input.rotary.a.a();
        z7Var.B = new defpackage.my();
        z7Var.C = new defpackage.gd(android.view.ViewConfiguration.get(context));
        defpackage.zq1 zq1Var = new defpackage.zq1();
        z7Var.D = zq1Var;
        defpackage.y42 y42Var = new defpackage.y42(3);
        y42Var.d0(defpackage.zr3.c);
        y42Var.a0(z7Var.getDensity());
        y42Var.f0(z7Var.getViewConfiguration());
        y42Var.e0(defpackage.ms1.d((defpackage.xo2) androidx.compose.ui.layout.c.b(zq1Var), emptySemanticsElement).f(to2VarA2).f(to2VarA).f(((defpackage.na1) z7Var.getFocusOwner()).e).f(z7Var.getDragAndDropManager().c).f(xo2Var));
        z7Var.E = y42Var;
        defpackage.kr2 kr2Var = defpackage.mr1.a;
        z7Var.F = new defpackage.kr2();
        z7Var.m349getLayoutNodes();
        z7Var.G = new defpackage.wl3();
        z7Var.H = z7Var;
        z7Var.I = new defpackage.mz3(z7Var.getRoot(), q01Var, z7Var.m349getLayoutNodes());
        defpackage.h8 h8Var = new defpackage.h8(z7Var);
        z7Var.J = h8Var;
        z7Var.K = new defpackage.e9(z7Var, new defpackage.n7(0, z7Var, defpackage.q8.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        defpackage.t6 t6Var = new defpackage.t6();
        java.lang.Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        z7Var.L = t6Var;
        z7Var.M = new defpackage.ia(z7Var);
        z7Var.N = new defpackage.mo();
        z7Var.O = new java.util.ArrayList();
        z7Var.S = new defpackage.lp2();
        defpackage.y42 root = z7Var.getRoot();
        defpackage.q10 q10Var = new defpackage.q10();
        q10Var.b = root;
        q10Var.c = new defpackage.ni1(root.W.c);
        q10Var.d = new defpackage.p5(19);
        q10Var.e = new defpackage.qi1();
        z7Var.T = q10Var;
        z7Var.U = defpackage.d5.t;
        if (h()) {
            defpackage.mo autofillTree = z7Var.getAutofillTree();
            v6Var = new defpackage.v6();
            v6Var.a = z7Var;
            v6Var.b = autofillTree;
            android.view.autofill.AutofillManager autofillManagerH = defpackage.u6.h(z7Var.getContext().getSystemService(defpackage.u6.i()));
            if (autofillManagerH == null) {
                defpackage.c.r("Autofill service could not be located.");
                throw null;
            }
            v6Var.c = autofillManagerH;
            z7Var.setImportantForAutofill(1);
            defpackage.p5 p5VarF = defpackage.ss1.F(z7Var);
            android.view.autofill.AutofillId autofillIdF = p5VarF != null ? defpackage.u6.f(p5VarF.i) : null;
            if (autofillIdF == null) {
                throw defpackage.ms1.u("Required value was null.");
            }
            v6Var.d = autofillIdF;
        } else {
            v6Var = null;
        }
        z7Var.V = v6Var;
        if (h()) {
            android.view.autofill.AutofillManager autofillManagerH2 = defpackage.u6.h(context.getSystemService(defpackage.u6.i()));
            if (autofillManagerH2 == null) {
                throw defpackage.ms1.u("Autofill service could not be located.");
            }
            z7Var = this;
            y6Var = new defpackage.y6(new defpackage.p5(17, autofillManagerH2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            y6Var = null;
        }
        z7Var.W = y6Var;
        z7Var.b0 = new defpackage.e7(context);
        z7Var.c0 = new defpackage.d7(z7Var.m347getClipboardManager());
        z7Var.d0 = new defpackage.t23(new defpackage.t7(z7Var, i));
        z7Var.i0 = new defpackage.ck2(z7Var.getRoot());
        z7Var.j0 = 9223372034707292159L;
        z7Var.k0 = new int[]{0, 0};
        float[] fArrA = defpackage.vj2.a();
        z7Var.l0 = fArrA;
        z7Var.m0 = defpackage.vj2.a();
        z7Var.n0 = defpackage.vj2.a();
        z7Var.o0 = -1L;
        z7Var.q0 = 9187343241974906880L;
        z7Var.r0 = defpackage.or1.C(null);
        z7Var.s0 = defpackage.or1.r(new defpackage.w7(z7Var, i));
        z7Var.u0 = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: h7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.O();
            }
        };
        z7Var.v0 = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: i7
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.O();
            }
        };
        z7Var.w0 = new android.view.ViewTreeObserver.OnTouchModeChangeListener() { // from class: j7
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                this.a.G0.a.setValue(new defpackage.uq1(z2 ? 1 : 2));
            }
        };
        defpackage.ci4 ci4Var = new defpackage.ci4(z7Var.getView(), z7Var);
        z7Var.x0 = ci4Var;
        z7Var.y0 = new defpackage.ai4(ci4Var);
        z7Var.z0 = new java.util.concurrent.atomic.AtomicReference(null);
        z7Var.A0 = new defpackage.qo0(z7Var.getTextInputService());
        z7Var.B0 = new defpackage.d6(26);
        z7Var.C0 = new defpackage.a43(defpackage.q8.K(context), d6Var);
        z7Var.D0 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        defpackage.k42 k42Var = defpackage.k42.f;
        defpackage.k42 k42Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : defpackage.k42.i : k42Var;
        z7Var.E0 = defpackage.or1.C(k42Var2 != null ? k42Var2 : k42Var);
        z7Var.F0 = new defpackage.h73(z7Var);
        z7Var.G0 = new defpackage.wq1(z7Var.isInTouchMode() ? 1 : 2);
        defpackage.uo2 uo2Var = new defpackage.uo2();
        new defpackage.os2(new defpackage.hp[16]);
        new defpackage.os2(new defpackage.st1[16]);
        new defpackage.os2(new defpackage.y42[16]);
        new defpackage.os2(new defpackage.st1[16]);
        z7Var.H0 = uo2Var;
        defpackage.xc xcVar = new defpackage.xc();
        new defpackage.l04(new defpackage.wc(i3, xcVar));
        z7Var.I0 = xcVar;
        z7Var.L0 = new defpackage.mw(16);
        z7Var.M0 = new defpackage.wr2();
        z7Var.P0 = new defpackage.x7(i3, z7Var);
        z7Var.Q0 = new defpackage.g7(i, z7Var);
        z7Var.S0 = new defpackage.w7(z7Var, i3);
        z7Var.T0 = i2 < 29 ? new defpackage.vw(fArrA) : new defpackage.ww();
        z7Var.addOnAttachStateChangeListener(z7Var.K);
        z7Var.setWillNotDraw(false);
        z7Var.setFocusable(true);
        if (i2 >= 26) {
            defpackage.p8.a.a(z7Var, 1, false);
        }
        z7Var.setFocusableInTouchMode(true);
        z7Var.setClipChildren(false);
        defpackage.qw4.b(z7Var, h8Var);
        z7Var.setOnDragListener(z7Var.getDragAndDropManager());
        z7Var.getRoot().d(z7Var);
        if (i2 >= 29) {
            defpackage.j8.a.a(z7Var);
        }
        if (z) {
            android.view.View view = new android.view.View(context);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
            view.setTag(dev.jdtech.mpv.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
            z7Var.v = view;
            z7Var.addView(view, -1);
        }
        z7Var.V0 = i2 >= 31 ? new defpackage.p5(25) : null;
        z7Var.X0 = new defpackage.u7(z7Var);
    }

    public static final void a(defpackage.z7 z7Var, int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        int iD;
        defpackage.h8 h8Var = z7Var.J;
        if (defpackage.ct1.g(str, h8Var.G)) {
            int iD2 = h8Var.E.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!defpackage.ct1.g(str, h8Var.H) || (iD = h8Var.F.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.l7 get_viewTreeOwners() {
        return (defpackage.l7) this.r0.getValue();
    }

    public static boolean h() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static void i(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof defpackage.z7) {
                ((defpackage.z7) childAt).B();
            } else if (childAt instanceof android.view.ViewGroup) {
                i((android.view.ViewGroup) childAt);
            }
        }
    }

    public static long l(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        defpackage.c.s();
        return 0L;
    }

    public static android.view.View n(android.view.View view, int i) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (defpackage.ct1.g(declaredMethod.invoke(view, null), java.lang.Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View viewN = n(viewGroup.getChildAt(i2), i);
                    if (viewN != null) {
                        return viewN;
                    }
                }
            }
        }
        return null;
    }

    public static void r(defpackage.y42 y42Var) {
        y42Var.D();
        defpackage.os2 os2VarZ = y42Var.z();
        java.lang.Object[] objArr = os2VarZ.f;
        int i = os2VarZ.t;
        for (int i2 = 0; i2 < i; i2++) {
            r((defpackage.y42) objArr[i2]);
        }
    }

    private void setDensity(defpackage.yo0 yo0Var) {
        this.u.setValue(yo0Var);
    }

    private void setFontFamilyResolver(defpackage.kb1 kb1Var) {
        this.C0.setValue(kb1Var);
    }

    private void setLayoutDirection(defpackage.k42 k42Var) {
        this.E0.setValue(k42Var);
    }

    private final void set_viewTreeOwners(defpackage.l7 l7Var) {
        this.r0.setValue(l7Var);
    }

    public static boolean u(android.view.MotionEvent motionEvent) {
        boolean z = (java.lang.Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (java.lang.Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (android.os.Build.VERSION.SDK_INT >= 29 && !defpackage.mp2.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public final void A(defpackage.y42 y42Var, long j) {
        defpackage.ck2 ck2Var = this.i0;
        android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ck2Var.k(y42Var, j);
            if (!ck2Var.b.A()) {
                ck2Var.a(false);
                if (this.R) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.R = false;
                }
            }
            getRectManager().b();
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        r4.k(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r10 = this;
            boolean r0 = r10.a0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L48
            t23 r0 = r10.getSnapshotObserver()
            f64 r0 = r0.a
            java.lang.Object r3 = r0.g
            monitor-enter(r3)
            os2 r0 = r0.f     // Catch: java.lang.Throwable -> L36
            int r4 = r0.t     // Catch: java.lang.Throwable -> L36
            r5 = r2
            r6 = r5
        L15:
            java.lang.Object[] r7 = r0.f
            if (r5 >= r4) goto L3b
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L36
            e64 r7 = (defpackage.e64) r7     // Catch: java.lang.Throwable -> L36
            r7.e()     // Catch: java.lang.Throwable -> L36
            es2 r7 = r7.f     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.j()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L2b
            int r6 = r6 + 1
            goto L38
        L2b:
            if (r6 <= 0) goto L38
            java.lang.Object[] r7 = r0.f     // Catch: java.lang.Throwable -> L36
            int r8 = r5 - r6
            r9 = r7[r5]     // Catch: java.lang.Throwable -> L36
            r7[r8] = r9     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r10 = move-exception
            goto L46
        L38:
            int r5 = r5 + 1
            goto L15
        L3b:
            int r5 = r4 - r6
            java.util.Arrays.fill(r7, r5, r4, r1)     // Catch: java.lang.Throwable -> L36
            r0.t = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            r10.a0 = r2
            goto L48
        L46:
            monitor-exit(r3)
            throw r10
        L48:
            rd r0 = r10.f0
            if (r0 == 0) goto L4f
            i(r0)
        L4f:
            boolean r0 = h()
            if (r0 == 0) goto L75
            y6 r0 = r10.W
            if (r0 == 0) goto L75
            lr2 r3 = r0.h
            int r4 = r3.d
            if (r4 != 0) goto L6e
            boolean r4 = r0.i
            if (r4 == 0) goto L6e
            p5 r4 = r0.a
            java.lang.Object r4 = r4.i
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            defpackage.d73.u(r4)
            r0.i = r2
        L6e:
            int r3 = r3.d
            if (r3 == 0) goto L75
            r3 = 1
            r0.i = r3
        L75:
            wr2 r0 = r10.M0
            boolean r0 = r0.h()
            if (r0 == 0) goto Lb2
            wr2 r0 = r10.M0
            java.lang.Object r0 = r0.e(r2)
            if (r0 == 0) goto Lb2
            wr2 r0 = r10.M0
            int r0 = r0.b
            r3 = r2
        L8a:
            wr2 r4 = r10.M0
            if (r3 >= r0) goto Lae
            java.lang.Object r4 = r4.e(r3)
            hd1 r4 = (defpackage.hd1) r4
            wr2 r5 = r10.M0
            if (r3 < 0) goto Laa
            int r6 = r5.b
            if (r3 >= r6) goto Laa
            java.lang.Object[] r5 = r5.a
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La7
            r4.invoke()
        La7:
            int r3 = r3 + 1
            goto L8a
        Laa:
            r5.m(r3)
            throw r1
        Lae:
            r4.k(r2, r0)
            goto L75
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.B():void");
    }

    public final void C(defpackage.y42 y42Var) {
        defpackage.h8 h8Var = this.J;
        h8Var.A = true;
        if (h8Var.v()) {
            h8Var.w(y42Var);
        }
        defpackage.e9 e9Var = this.K;
        e9Var.x = true;
        if (e9Var.h()) {
            e9Var.y.mo0trySendJP2dKIU(defpackage.as4.a);
        }
    }

    public final void D(defpackage.y42 y42Var, boolean z, boolean z2, boolean z3) {
        defpackage.y42 y42VarV;
        defpackage.y42 y42VarV2;
        defpackage.ck2 ck2Var = this.i0;
        if (!z) {
            if (ck2Var.p(y42Var, z2) && z3) {
                J(y42Var);
                return;
            }
            return;
        }
        defpackage.oj ojVar = ck2Var.b;
        defpackage.y42 y42Var2 = y42Var.y;
        defpackage.c52 c52Var = y42Var.X;
        if (y42Var2 == null) {
            defpackage.gq1.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = c52Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    defpackage.jc2.o();
                    return;
                }
                if (!c52Var.e || z2) {
                    c52Var.e = true;
                    c52Var.p.L = true;
                    if (y42Var.h0) {
                        return;
                    }
                    if ((defpackage.ct1.g(y42Var.K(), java.lang.Boolean.TRUE) || defpackage.ck2.h(y42Var)) && ((y42VarV = y42Var.v()) == null || !y42VarV.X.e)) {
                        ojVar.b(y42Var, defpackage.pt1.f);
                    } else if ((y42Var.J() || defpackage.ck2.i(y42Var)) && ((y42VarV2 = y42Var.v()) == null || !y42VarV2.q())) {
                        ojVar.b(y42Var, defpackage.pt1.t);
                    }
                    if (ck2Var.d || !z3) {
                        return;
                    }
                    J(y42Var);
                    return;
                }
                return;
            }
        }
        ck2Var.h.b(new defpackage.bk2(y42Var, true, z2));
    }

    public final void E(defpackage.y42 y42Var, boolean z, boolean z2) {
        defpackage.c52 c52Var = y42Var.X;
        defpackage.pt1 pt1Var = defpackage.pt1.u;
        defpackage.ck2 ck2Var = this.i0;
        if (!z) {
            ck2Var.getClass();
            int iOrdinal = c52Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                defpackage.jc2.o();
                return;
            }
            defpackage.y42 y42VarV = y42Var.v();
            boolean z3 = y42VarV == null || y42VarV.J();
            if (!z2) {
                if (y42Var.q()) {
                    return;
                }
                if (y42Var.p() && y42Var.J() == z3 && y42Var.J() == c52Var.p.K) {
                    return;
                }
            }
            defpackage.ek2 ek2Var = c52Var.p;
            ek2Var.M = true;
            ek2Var.N = true;
            if (!y42Var.h0 && ek2Var.K && z3) {
                if ((y42VarV == null || !y42VarV.p()) && (y42VarV == null || !y42VarV.q())) {
                    ck2Var.b.b(y42Var, pt1Var);
                }
                if (ck2Var.d) {
                    return;
                }
                J(null);
                return;
            }
            return;
        }
        defpackage.oj ojVar = ck2Var.b;
        int iOrdinal2 = c52Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    defpackage.jc2.o();
                    return;
                }
            }
        }
        if ((c52Var.e || c52Var.f) && !z2) {
            return;
        }
        c52Var.f = true;
        c52Var.g = true;
        defpackage.ek2 ek2Var2 = c52Var.p;
        ek2Var2.M = true;
        ek2Var2.N = true;
        if (y42Var.h0) {
            return;
        }
        defpackage.y42 y42VarV2 = y42Var.v();
        if (defpackage.ct1.g(y42Var.K(), java.lang.Boolean.TRUE) && ((y42VarV2 == null || !y42VarV2.X.e) && (y42VarV2 == null || !y42VarV2.X.f))) {
            ojVar.b(y42Var, defpackage.pt1.i);
        } else if (y42Var.J() && ((y42VarV2 == null || !y42VarV2.p()) && (y42VarV2 == null || !y42VarV2.q()))) {
            ojVar.b(y42Var, pt1Var);
        }
        if (ck2Var.d) {
            return;
        }
        J(null);
    }

    public final void F() {
        defpackage.h8 h8Var = this.J;
        h8Var.A = true;
        if (h8Var.v() && !h8Var.L) {
            h8Var.L = true;
            h8Var.l.post(h8Var.N);
        }
        defpackage.e9 e9Var = this.K;
        e9Var.x = true;
        if (!e9Var.h() || e9Var.E) {
            return;
        }
        e9Var.E = true;
        e9Var.z.post(e9Var.F);
    }

    public final void G() {
        if (this.p0) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.o0) {
            this.o0 = jCurrentAnimationTimeMillis;
            defpackage.uw uwVar = this.T0;
            float[] fArr = this.m0;
            uwVar.a(this, fArr);
            defpackage.st1.w(fArr, this.n0);
            android.view.ViewParent parent = getParent();
            android.view.View view = this;
            while (parent instanceof android.view.ViewGroup) {
                view = (android.view.View) parent;
                parent = ((android.view.ViewGroup) view).getParent();
            }
            int[] iArr = this.k0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.q0 = (java.lang.Float.floatToRawIntBits(f - f3) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void H(android.view.MotionEvent motionEvent) {
        this.o0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        defpackage.uw uwVar = this.T0;
        float[] fArr = this.m0;
        uwVar.a(this, fArr);
        defpackage.st1.w(fArr, this.n0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = defpackage.vj2.b((java.lang.Float.floatToRawIntBits(x) << 32) | (java.lang.Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - java.lang.Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - java.lang.Float.intBitsToFloat((int) (jB & 4294967295L));
        this.q0 = (java.lang.Float.floatToRawIntBits(rawX) << 32) | (java.lang.Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean I() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void J(defpackage.y42 y42Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (y42Var != null) {
            while (y42Var != null && y42Var.s() == defpackage.w42.f) {
                if (!this.h0) {
                    defpackage.y42 y42VarV = y42Var.v();
                    if (y42VarV == null) {
                        break;
                    }
                    long j = y42VarV.W.c.u;
                    if (defpackage.fc0.f(j) && defpackage.fc0.e(j)) {
                        break;
                    }
                }
                y42Var = y42Var.v();
            }
            if (y42Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long K(long j) {
        G();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (this.q0 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (this.q0 & 4294967295L));
        return defpackage.vj2.b((java.lang.Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.n0);
    }

    public final int L(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        if (this.U0) {
            this.U0 = false;
            int metaState = motionEvent.getMetaState();
            this.A.getClass();
            defpackage.fz4.a.setValue(new defpackage.rc3(metaState));
        }
        defpackage.lp2 lp2Var = this.S;
        defpackage.q43 q43VarA = lp2Var.a(this, motionEvent);
        defpackage.q10 q10Var = this.T;
        if (q43VarA == null) {
            if (!q10Var.a) {
                ((defpackage.uh2) ((defpackage.p5) q10Var.d).i).b();
                ((defpackage.ni1) q10Var.c).c();
            }
            return defpackage.da1.b(false, false, false);
        }
        java.util.List listO = q43VarA.O();
        int size = listO.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = listO.get(size);
                if (((defpackage.kc3) obj).a()) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        defpackage.kc3 kc3Var = (defpackage.kc3) obj;
        if (kc3Var != null) {
            this.f = kc3Var.e();
        }
        int iB = q10Var.b(q43VarA, this, v(motionEvent));
        q43VarA.Z();
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iB & 1) != 0) {
            return iB;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        lp2Var.c.delete(pointerId);
        lp2Var.b.delete(pointerId);
        return iB;
    }

    public final void M(android.view.MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new android.view.MotionEvent.PointerProperties();
        }
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new android.view.MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jY = y((java.lang.Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = java.lang.Float.intBitsToFloat((int) (jY >> 32));
            pointerCoords.y = java.lang.Float.intBitsToFloat((int) (jY & 4294967295L));
            i4++;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        defpackage.q43 q43VarA = this.S.a(this, motionEventObtain);
        q43VarA.getClass();
        this.T.b(q43VarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(defpackage.xd1 r8, defpackage.ud0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.y7
            if (r0 == 0) goto L13
            r0 = r9
            y7 r0 = (defpackage.y7) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            y7 r0 = new y7
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.t
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.r(r7)
            return
        L27:
            defpackage.or1.J(r9)
            goto L4b
        L2b:
            defpackage.or1.J(r9)
            r9 = r2
            v r2 = new v
            r1 = 7
            r2.<init>(r1, r7)
            r0.t = r9
            pa r1 = new pa
            r5 = 0
            r6 = 15
            java.util.concurrent.atomic.AtomicReference r3 = r7.z0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.u22.t(r1, r0)
            of0 r8 = defpackage.of0.f
            if (r7 != r8) goto L4b
            return
        L4b:
            defpackage.c.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.N(xd1, ud0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.k0
            r0.getLocationOnScreen(r1)
            long r2 = r0.j0
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.o0
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.j0 = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L44
            if (r2 == r1) goto L44
            y42 r1 = r0.getRoot()
            c52 r1 = r1.X
            ek2 r1 = r1.p
            r1.j0()
            r1 = r9
            goto L45
        L44:
            r1 = r3
        L45:
            r0.G()
            android.view.View r2 = r0.W0
            if (r2 != 0) goto L52
            android.view.View r2 = r0.getRootView()
            r0.W0 = r2
        L52:
            wl3 r5 = r0.getRectManager()
            long r10 = r0.j0
            long r12 = r0.q0
            long r12 = defpackage.or1.H(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.m0
            int r15 = defpackage.xr1.u(r14)
            rj4 r3 = r5.b
            r15 = r15 & 2
            if (r15 != 0) goto L78
        L75:
            r16 = r6
            goto L7a
        L78:
            r14 = 0
            goto L75
        L7a:
            long r6 = r3.c
            boolean r6 = defpackage.nr1.b(r12, r6)
            if (r6 != 0) goto L86
            r3.c = r12
            r6 = r9
            goto L87
        L86:
            r6 = 0
        L87:
            long r12 = r3.d
            boolean r7 = defpackage.nr1.b(r10, r12)
            if (r7 != 0) goto L92
            r3.d = r10
            r6 = r9
        L92:
            if (r14 == 0) goto L95
            r6 = r9
        L95:
            long r7 = (long) r8
            long r7 = r7 << r4
            long r10 = (long) r2
            long r10 = r10 & r16
            long r7 = r7 | r10
            long r10 = r3.e
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto La4
            r3.e = r7
            r6 = r9
        La4:
            if (r6 != 0) goto Lad
            boolean r2 = r5.e
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r3 = 0
            goto Lae
        Lad:
            r3 = r9
        Lae:
            r5.e = r3
            ck2 r2 = r0.i0
            r2.a(r1)
            wl3 r0 = r0.getRectManager()
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.O():void");
    }

    public final void P(float f) {
        if (this.w) {
            if (f > 0.0f) {
                if (java.lang.Float.isNaN(this.N0) || f > this.N0) {
                    this.N0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (java.lang.Float.isNaN(this.O0) || f < this.O0) {
                    this.O0 = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        view.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(android.util.SparseArray sparseArray) {
        defpackage.fz3 fz3VarX;
        defpackage.jd1 jd1Var;
        if (h()) {
            defpackage.y6 y6Var = this.W;
            if (y6Var != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    android.view.autofill.AutofillValue autofillValueF = defpackage.h4.f(sparseArray.get(iKeyAt));
                    if (defpackage.i3.E(autofillValueF)) {
                        defpackage.y42 y42Var = (defpackage.y42) y6Var.b.c.b(iKeyAt);
                        if (y42Var != null && (fz3VarX = y42Var.x()) != null) {
                            java.lang.Object objG = fz3VarX.f.g(defpackage.ez3.g);
                            if (objG == null) {
                                objG = null;
                            }
                            defpackage.w3 w3Var = (defpackage.w3) objG;
                            if (w3Var != null && (jd1Var = (defpackage.jd1) w3Var.b) != null) {
                            }
                        }
                    } else if (defpackage.i3.A(autofillValueF)) {
                        android.util.Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (defpackage.i3.B(autofillValueF)) {
                        android.util.Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (defpackage.i3.F(autofillValueF)) {
                        android.util.Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            defpackage.v6 v6Var = this.V;
            if (v6Var != null) {
                defpackage.bt1.T(v6Var, sparseArray);
            }
        }
    }

    @Override // defpackage.hm0
    public final void c(defpackage.ib2 ib2Var) {
        ib2Var.getClass();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.J.m(i, this.f, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.J.m(i, this.f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            r(getRoot());
        }
        z(true);
        defpackage.r54.k().m();
        this.Q = true;
        defpackage.my myVar = this.B;
        defpackage.a7 a7Var = myVar.a;
        android.graphics.Canvas canvas2 = a7Var.a;
        a7Var.a = canvas;
        getRoot().i(a7Var, null);
        myVar.a.a = canvas2;
        java.util.ArrayList arrayList = this.O;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.fg1) ((defpackage.p23) arrayList.get(i))).g();
            }
        }
        int i2 = defpackage.bx4.f;
        arrayList.clear();
        this.Q = false;
        java.util.ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.w) {
            defpackage.ri.a(this, this.N0);
            android.view.View view = this.v;
            if (view == null) {
                defpackage.ct1.R("frameRateCategoryView");
                throw null;
            }
            defpackage.ri.a(view, this.O0);
            if (!java.lang.Float.isNaN(this.O0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.N0 = Float.NaN;
            this.O0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        defpackage.ww2 ww2Var;
        defpackage.ds3 ds3Var;
        int size;
        defpackage.ww2 ww2Var2;
        defpackage.so2 so2VarF;
        defpackage.ww2 ww2Var3;
        if (this.R0) {
            defpackage.g7 g7Var = this.Q0;
            removeCallbacks(g7Var);
            if (motionEvent.getActionMasked() == 8) {
                this.R0 = false;
            } else {
                g7Var.run();
            }
        }
        if (u(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i = 1;
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                java.lang.Float.floatToRawIntBits(x);
                java.lang.Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                defpackage.na1 na1Var = (defpackage.na1) getFocusOwner();
                if (na1Var.d.e) {
                    java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    defpackage.bb1 bb1VarJ0 = defpackage.ft4.j0(na1Var.c);
                    if (bb1VarJ0 != null) {
                        if (!bb1VarJ0.f.E) {
                            defpackage.gq1.b("visitAncestors called on an unattached node");
                        }
                        defpackage.so2 so2Var = bb1VarJ0.f;
                        defpackage.y42 y42VarL = defpackage.ct1.L(bb1VarJ0);
                        while (y42VarL != null) {
                            if ((y42VarL.W.f.u & 2097152) != 0) {
                                while (so2Var != null) {
                                    if ((so2Var.t & 2097152) != 0) {
                                        defpackage.so2 so2VarF2 = so2Var;
                                        defpackage.os2 os2Var = null;
                                        while (so2VarF2 != null) {
                                            if ((so2VarF2.t & 2097152) != 0 && (so2VarF2 instanceof defpackage.no0)) {
                                                int i2 = 0;
                                                for (defpackage.so2 so2Var2 = ((defpackage.no0) so2VarF2).G; so2Var2 != null; so2Var2 = so2Var2.w) {
                                                    if ((so2Var2.t & 2097152) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            so2VarF2 = so2Var2;
                                                        } else {
                                                            if (os2Var == null) {
                                                                os2Var = new defpackage.os2(new defpackage.so2[16]);
                                                            }
                                                            if (so2VarF2 != null) {
                                                                os2Var.b(so2VarF2);
                                                                so2VarF2 = null;
                                                            }
                                                            os2Var.b(so2Var2);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            so2VarF2 = defpackage.ct1.f(os2Var);
                                        }
                                    }
                                    so2Var = so2Var.v;
                                }
                            }
                            y42VarL = y42VarL.v();
                            so2Var = (y42VarL == null || (ww2Var = y42VarL.W) == null) ? null : ww2Var.e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (p(motionEvent) & 1) != 0;
        }
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        defpackage.ww4.c(viewConfiguration, getContext());
        defpackage.ww4.b(viewConfiguration, getContext());
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        defpackage.la1 focusOwner = getFocusOwner();
        defpackage.o7 o7Var = new defpackage.o7(this, i, motionEvent);
        defpackage.na1 na1Var2 = (defpackage.na1) focusOwner;
        if (na1Var2.d.e) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        defpackage.bb1 bb1VarJ02 = defpackage.ft4.j0(na1Var2.c);
        if (bb1VarJ02 != null) {
            if (!bb1VarJ02.f.E) {
                defpackage.gq1.b("visitAncestors called on an unattached node");
            }
            defpackage.so2 so2Var3 = bb1VarJ02.f;
            defpackage.y42 y42VarL2 = defpackage.ct1.L(bb1VarJ02);
            loop0: while (true) {
                if (y42VarL2 == null) {
                    so2VarF = null;
                    break;
                }
                if ((y42VarL2.W.f.u & 16384) != 0) {
                    while (so2Var3 != null) {
                        if ((so2Var3.t & 16384) != 0) {
                            so2VarF = so2Var3;
                            defpackage.os2 os2Var2 = null;
                            while (so2VarF != null) {
                                if (so2VarF instanceof defpackage.ds3) {
                                    break loop0;
                                }
                                if ((so2VarF.t & 16384) != 0 && (so2VarF instanceof defpackage.no0)) {
                                    int i3 = 0;
                                    for (defpackage.so2 so2Var4 = ((defpackage.no0) so2VarF).G; so2Var4 != null; so2Var4 = so2Var4.w) {
                                        if ((so2Var4.t & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                so2VarF = so2Var4;
                                            } else {
                                                if (os2Var2 == null) {
                                                    os2Var2 = new defpackage.os2(new defpackage.so2[16]);
                                                }
                                                if (so2VarF != null) {
                                                    os2Var2.b(so2VarF);
                                                    so2VarF = null;
                                                }
                                                os2Var2.b(so2Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                so2VarF = defpackage.ct1.f(os2Var2);
                            }
                        }
                        so2Var3 = so2Var3.v;
                    }
                }
                y42VarL2 = y42VarL2.v();
                so2Var3 = (y42VarL2 == null || (ww2Var3 = y42VarL2.W) == null) ? null : ww2Var3.e;
            }
            ds3Var = (defpackage.ds3) so2VarF;
        } else {
            ds3Var = null;
        }
        if (ds3Var != null) {
            if (!ds3Var.f.E) {
                defpackage.gq1.b("visitAncestors called on an unattached node");
            }
            defpackage.so2 so2Var5 = ds3Var.f.v;
            defpackage.y42 y42VarL3 = defpackage.ct1.L(ds3Var);
            java.util.ArrayList arrayList = null;
            while (y42VarL3 != null) {
                if ((y42VarL3.W.f.u & 16384) != 0) {
                    while (so2Var5 != null) {
                        if ((so2Var5.t & 16384) != 0) {
                            defpackage.so2 so2VarF3 = so2Var5;
                            defpackage.os2 os2Var3 = null;
                            while (so2VarF3 != null) {
                                if (so2VarF3 instanceof defpackage.ds3) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(so2VarF3);
                                } else if ((so2VarF3.t & 16384) != 0 && (so2VarF3 instanceof defpackage.no0)) {
                                    int i4 = 0;
                                    for (defpackage.so2 so2Var6 = ((defpackage.no0) so2VarF3).G; so2Var6 != null; so2Var6 = so2Var6.w) {
                                        if ((so2Var6.t & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                so2VarF3 = so2Var6;
                                            } else {
                                                if (os2Var3 == null) {
                                                    os2Var3 = new defpackage.os2(new defpackage.so2[16]);
                                                }
                                                if (so2VarF3 != null) {
                                                    os2Var3.b(so2VarF3);
                                                    so2VarF3 = null;
                                                }
                                                os2Var3.b(so2Var6);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                so2VarF3 = defpackage.ct1.f(os2Var3);
                            }
                        }
                        so2Var5 = so2Var5.v;
                    }
                }
                y42VarL3 = y42VarL3.v();
                so2Var5 = (y42VarL3 == null || (ww2Var2 = y42VarL3.W) == null) ? null : ww2Var2.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((defpackage.ds3) arrayList.get(size)).getClass();
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            defpackage.so2 so2VarF4 = ds3Var.f;
            defpackage.os2 os2Var4 = null;
            while (so2VarF4 != null) {
                if (!(so2VarF4 instanceof defpackage.ds3) && (so2VarF4.t & 16384) != 0 && (so2VarF4 instanceof defpackage.no0)) {
                    int i6 = 0;
                    for (defpackage.so2 so2Var7 = ((defpackage.no0) so2VarF4).G; so2Var7 != null; so2Var7 = so2Var7.w) {
                        if ((so2Var7.t & 16384) != 0) {
                            i6++;
                            if (i6 == 1) {
                                so2VarF4 = so2Var7;
                            } else {
                                if (os2Var4 == null) {
                                    os2Var4 = new defpackage.os2(new defpackage.so2[16]);
                                }
                                if (so2VarF4 != null) {
                                    os2Var4.b(so2VarF4);
                                    so2VarF4 = null;
                                }
                                os2Var4.b(so2Var7);
                            }
                        }
                    }
                    if (i6 == 1) {
                    }
                }
                so2VarF4 = defpackage.ct1.f(os2Var4);
            }
            if (!((java.lang.Boolean) o7Var.invoke()).booleanValue()) {
                defpackage.so2 so2VarF5 = ds3Var.f;
                defpackage.os2 os2Var5 = null;
                while (so2VarF5 != null) {
                    if (!(so2VarF5 instanceof defpackage.ds3) && (so2VarF5.t & 16384) != 0 && (so2VarF5 instanceof defpackage.no0)) {
                        int i7 = 0;
                        for (defpackage.so2 so2Var8 = ((defpackage.no0) so2VarF5).G; so2Var8 != null; so2Var8 = so2Var8.w) {
                            if ((so2Var8.t & 16384) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    so2VarF5 = so2Var8;
                                } else {
                                    if (os2Var5 == null) {
                                        os2Var5 = new defpackage.os2(new defpackage.so2[16]);
                                    }
                                    if (so2VarF5 != null) {
                                        os2Var5.b(so2VarF5);
                                        so2VarF5 = null;
                                    }
                                    os2Var5.b(so2Var8);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    so2VarF5 = defpackage.ct1.f(os2Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        defpackage.d5 d5Var = ((defpackage.ds3) arrayList.get(i8)).F;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((defpackage.na1) getFocusOwner()).d(keyEvent, new defpackage.o7(this, i, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.A.getClass();
        defpackage.fz4.a.setValue(new defpackage.rc3(metaState));
        return ((defpackage.na1) getFocusOwner()).d(keyEvent, defpackage.j90.v) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        defpackage.ww2 ww2Var;
        if (isFocused()) {
            defpackage.na1 na1Var = (defpackage.na1) getFocusOwner();
            if (na1Var.d.e) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                defpackage.bb1 bb1VarJ0 = defpackage.ft4.j0(na1Var.c);
                if (bb1VarJ0 != null) {
                    if (!bb1VarJ0.f.E) {
                        defpackage.gq1.b("visitAncestors called on an unattached node");
                    }
                    defpackage.so2 so2Var = bb1VarJ0.f;
                    defpackage.y42 y42VarL = defpackage.ct1.L(bb1VarJ0);
                    while (y42VarL != null) {
                        if ((y42VarL.W.f.u & 131072) != 0) {
                            while (so2Var != null) {
                                if ((so2Var.t & 131072) != 0) {
                                    defpackage.so2 so2VarF = so2Var;
                                    defpackage.os2 os2Var = null;
                                    while (so2VarF != null) {
                                        if ((so2VarF.t & 131072) != 0 && (so2VarF instanceof defpackage.no0)) {
                                            int i = 0;
                                            for (defpackage.so2 so2Var2 = ((defpackage.no0) so2VarF).G; so2Var2 != null; so2Var2 = so2Var2.w) {
                                                if ((so2Var2.t & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        so2VarF = so2Var2;
                                                    } else {
                                                        if (os2Var == null) {
                                                            os2Var = new defpackage.os2(new defpackage.so2[16]);
                                                        }
                                                        if (so2VarF != null) {
                                                            os2Var.b(so2VarF);
                                                            so2VarF = null;
                                                        }
                                                        os2Var.b(so2Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        so2VarF = defpackage.ct1.f(os2Var);
                                    }
                                }
                                so2Var = so2Var.v;
                            }
                        }
                        y42VarL = y42VarL.v();
                        so2Var = (y42VarL == null || (ww2Var = y42VarL.W) == null) ? null : ww2Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(android.view.ViewStructure viewStructure) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            defpackage.i8.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.R0) {
            defpackage.g7 g7Var = this.Q0;
            removeCallbacks(g7Var);
            android.view.MotionEvent motionEvent2 = this.J0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.R0 = false;
            } else {
                g7Var.run();
            }
        }
        if (!u(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || w(motionEvent))) {
            int iP = p(motionEvent);
            if ((iP & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iP & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int i) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        try {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                return n(this, i);
            }
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(i));
            if (objInvoke instanceof android.view.View) {
                return (android.view.View) objInvoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i) {
        defpackage.vl3 vl3VarM;
        if (view == null || this.i0.c) {
            return super.focusSearch(view, i);
        }
        defpackage.f51 f51Var = defpackage.aa1.f;
        android.view.View viewB = defpackage.y91.F().b(this, view, i);
        if (view == this) {
            defpackage.bb1 bb1VarJ0 = defpackage.ft4.j0(((defpackage.na1) getFocusOwner()).c);
            vl3VarM = bb1VarJ0 != null ? defpackage.ft4.o0(bb1VarJ0) : null;
            if (vl3VarM == null) {
                vl3VarM = defpackage.uj2.m(view, this);
            }
        } else {
            vl3VarM = defpackage.uj2.m(view, this);
        }
        defpackage.w91 w91VarS = defpackage.uj2.S(i);
        int i2 = w91VarS != null ? w91VarS.a : 6;
        defpackage.ym3 ym3Var = new defpackage.ym3();
        if (((defpackage.na1) getFocusOwner()).e(i2, vl3VarM, new defpackage.q7(ym3Var, 0)) != null) {
            java.lang.Object obj = ym3Var.f;
            if (obj != null) {
                if (viewB != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (defpackage.ss1.P(defpackage.ft4.o0((defpackage.bb1) obj), defpackage.uj2.m(viewB, this), vl3VarM, i2)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    public final defpackage.rd getAndroidViewsHandler$ui_release() {
        if (this.f0 == null) {
            defpackage.rd rdVar = new defpackage.rd(getContext());
            this.f0 = rdVar;
            addView(rdVar, -1);
            requestLayout();
        }
        defpackage.rd rdVar2 = this.f0;
        rdVar2.getClass();
        return rdVar2;
    }

    public defpackage.fo getAutofill() {
        return this.V;
    }

    public defpackage.lo getAutofillManager() {
        return this.W;
    }

    public defpackage.mo getAutofillTree() {
        return this.N;
    }

    public final defpackage.jd1 getConfigurationChangeObserver() {
        return this.U;
    }

    public final defpackage.e9 getContentCaptureManager$ui_release() {
        return this.K;
    }

    public defpackage.df0 getCoroutineContext() {
        return this.y;
    }

    public defpackage.yo0 getDensity() {
        return (defpackage.yo0) this.u.getValue();
    }

    public defpackage.vl3 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            defpackage.bb1 bb1VarJ0 = defpackage.ft4.j0(((defpackage.na1) getFocusOwner()).c);
            if (bb1VarJ0 != null) {
                return defpackage.ft4.o0(bb1VarJ0);
            }
            return null;
        }
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return defpackage.uj2.m(viewFindFocus, this);
        }
        return null;
    }

    public defpackage.la1 getFocusOwner() {
        return this.x;
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        defpackage.vl3 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = java.lang.Math.round(embeddedViewFocusRect.a);
            rect.top = java.lang.Math.round(embeddedViewFocusRect.b);
            rect.right = java.lang.Math.round(embeddedViewFocusRect.c);
            rect.bottom = java.lang.Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (defpackage.ct1.g(((defpackage.na1) getFocusOwner()).e(6, null, defpackage.r7.i), java.lang.Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public defpackage.kb1 getFontFamilyResolver() {
        return (defpackage.kb1) this.C0.getValue();
    }

    public defpackage.jb1 getFontLoader() {
        return this.B0;
    }

    public defpackage.cg1 getGraphicsContext() {
        return this.M;
    }

    public defpackage.vh1 getHapticFeedBack() {
        return this.F0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.i0.b.A();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public defpackage.vq1 getInputModeManager() {
        return this.G0;
    }

    public final defpackage.zq1 getInsetsListener() {
        return this.D;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.o0;
    }

    @Override // android.view.View, android.view.ViewParent
    public defpackage.k42 getLayoutDirection() {
        return (defpackage.k42) this.E0.getValue();
    }

    public long getMeasureIteration() {
        defpackage.ck2 ck2Var = this.i0;
        if (!ck2Var.c) {
            defpackage.gq1.a("measureIteration should be only used during the measure/layout pass");
        }
        return ck2Var.g;
    }

    public defpackage.uo2 getModifierLocalManager() {
        return this.H0;
    }

    public defpackage.z7 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public defpackage.v63 getPlacementScope() {
        int i = defpackage.x63.b;
        return new defpackage.ci2(1, this);
    }

    public defpackage.hc3 getPointerIconService() {
        return this.X0;
    }

    public defpackage.wl3 getRectManager() {
        return this.G;
    }

    public defpackage.y42 getRoot() {
        return this.E;
    }

    public defpackage.yr3 getRootForTest() {
        return this.H;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        defpackage.p5 p5Var;
        if (android.os.Build.VERSION.SDK_INT < 31 || (p5Var = this.V0) == null) {
            return false;
        }
        return ((java.lang.Boolean) ((defpackage.a43) p5Var.i).getValue()).booleanValue();
    }

    public defpackage.mz3 getSemanticsOwner() {
        return this.I;
    }

    public defpackage.a52 getSharedDrawScope() {
        return this.t;
    }

    public boolean getShowLayoutBounds() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.li.a.a(this) : this.e0;
    }

    public defpackage.t23 getSnapshotObserver() {
        return this.d0;
    }

    public defpackage.j64 getSoftwareKeyboardController() {
        return this.A0;
    }

    public defpackage.ai4 getTextInputService() {
        return this.y0;
    }

    public defpackage.gj4 getTextToolbar() {
        return this.I0;
    }

    public final defpackage.xr3 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public defpackage.uw4 getViewConfiguration() {
        return this.C;
    }

    public final defpackage.l7 getViewTreeOwners() {
        return (defpackage.l7) this.s0.getValue();
    }

    public defpackage.ez4 getWindowInfo() {
        return this.A;
    }

    public final defpackage.y6 get_autofillManager$ui_release() {
        return this.W;
    }

    public final defpackage.p23 m(defpackage.xd1 xd1Var, defpackage.xw2 xw2Var, defpackage.dg1 dg1Var) {
        defpackage.os2 os2Var;
        java.lang.ref.Reference referencePoll;
        java.lang.Object obj;
        if (dg1Var != null) {
            return new defpackage.fg1(dg1Var, null, this, xd1Var, xw2Var);
        }
        do {
            defpackage.mw mwVar = this.L0;
            java.lang.ref.ReferenceQueue referenceQueue = (java.lang.ref.ReferenceQueue) mwVar.i;
            os2Var = (defpackage.os2) mwVar.f;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                os2Var.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i = os2Var.t;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((java.lang.ref.Reference) os2Var.k(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        defpackage.p23 p23Var = (defpackage.p23) obj;
        if (p23Var == null) {
            return new defpackage.fg1(getGraphicsContext().b(), getGraphicsContext(), this, xd1Var, xw2Var);
        }
        defpackage.fg1 fg1Var = (defpackage.fg1) p23Var;
        defpackage.cg1 cg1Var = fg1Var.i;
        if (cg1Var == null) {
            throw defpackage.ms1.u("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!fg1Var.f.s) {
            defpackage.gq1.a("layer should have been released before reuse");
        }
        fg1Var.f = cg1Var.b();
        fg1Var.x = false;
        fg1Var.u = xd1Var;
        fg1Var.v = xw2Var;
        fg1Var.H = false;
        fg1Var.I = false;
        fg1Var.J = true;
        defpackage.vj2.d(fg1Var.y);
        float[] fArr = fg1Var.z;
        if (fArr != null) {
            defpackage.vj2.d(fArr);
        }
        fg1Var.F = defpackage.cm4.b;
        fg1Var.K = false;
        fg1Var.w = 9223372034707292159L;
        fg1Var.G = null;
        fg1Var.E = 0;
        return p23Var;
    }

    public final void o(defpackage.y42 y42Var, boolean z) {
        this.i0.f(y42Var, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        defpackage.or1 or1VarG;
        defpackage.ib2 ib2Var;
        defpackage.v6 v6Var;
        super.onAttachedToWindow();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(defpackage.pp4.E());
        }
        this.D.onViewAttachedToWindow(this);
        if (i > 28) {
            if (c1 == null) {
                defpackage.k7 k7Var = new defpackage.k7();
                c1 = k7Var;
                android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
                try {
                    if (Y0 == null) {
                        Y0 = java.lang.Class.forName("android.os.SystemProperties");
                    }
                    if (a1 == null) {
                        android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                        java.lang.Class cls = Y0;
                        a1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", java.lang.Runnable.class) : null;
                    }
                    java.lang.reflect.Method method = a1;
                    if (method != null) {
                        method.invoke(null, k7Var);
                    }
                } catch (java.lang.Throwable unused) {
                }
                android.os.StrictMode.setVmPolicy(vmPolicy);
            }
            defpackage.wr2 wr2Var = b1;
            synchronized (wr2Var) {
                wr2Var.a(this);
            }
        }
        this.A.a.setValue(java.lang.Boolean.valueOf(hasWindowFocus()));
        this.A.getClass();
        this.A.getClass();
        s(getRoot());
        r(getRoot());
        getSnapshotObserver().a.e();
        if (h() && (v6Var = this.V) != null) {
            defpackage.io ioVar = defpackage.io.a;
            ioVar.getClass();
            ((android.view.autofill.AutofillManager) v6Var.c).registerCallback(defpackage.u6.g(ioVar));
        }
        defpackage.ib2 ib2VarU = defpackage.nq1.u(this);
        defpackage.du3 du3VarS = defpackage.or1.s(this);
        defpackage.l7 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (ib2VarU != null && du3VarS != null && (ib2VarU != (ib2Var = viewTreeOwners.a) || du3VarS != ib2Var))) {
            if (ib2VarU == null) {
                defpackage.c.r("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (du3VarS == null) {
                defpackage.c.r("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (or1VarG = viewTreeOwners.a.g()) != null) {
                or1VarG.G(this);
            }
            ib2VarU.g().i(this);
            defpackage.l7 l7Var = new defpackage.l7(ib2VarU, du3VarS);
            set_viewTreeOwners(l7Var);
            defpackage.jd1 jd1Var = this.t0;
            if (jd1Var != null) {
                jd1Var.invoke(l7Var);
            }
            this.t0 = null;
        }
        this.G0.a.setValue(new defpackage.uq1(isInTouchMode() ? 1 : 2));
        defpackage.l7 viewTreeOwners2 = getViewTreeOwners();
        defpackage.or1 or1VarG2 = viewTreeOwners2 != null ? viewTreeOwners2.a.g() : null;
        if (or1VarG2 == null) {
            throw defpackage.ms1.u("No lifecycle owner exists");
        }
        or1VarG2.i(this);
        or1VarG2.i(this.K);
        getViewTreeObserver().addOnGlobalLayoutListener(this.u0);
        getViewTreeObserver().addOnScrollChangedListener(this.v0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.w0);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.n8.a.b(this);
        }
        defpackage.y6 y6Var = this.W;
        if (y6Var != null) {
            ((defpackage.na1) getFocusOwner()).g.a(y6Var);
            getSemanticsOwner().d.a(y6Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        defpackage.q04 q04Var = (defpackage.q04) this.z0.get();
        defpackage.hb hbVar = (defpackage.hb) (q04Var != null ? q04Var.b : null);
        if (hbVar == null) {
            return this.x0.d;
        }
        defpackage.q04 q04Var2 = (defpackage.q04) hbVar.u.get();
        defpackage.tq1 tq1Var = (defpackage.tq1) (q04Var2 != null ? q04Var2.b : null);
        return tq1Var != null && tq1Var.b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(defpackage.ft4.N(getContext()));
        this.A.getClass();
        int i = android.os.Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.D0) {
            this.D0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(defpackage.q8.K(getContext()));
        }
        this.U.invoke(configuration);
    }

    @Override // android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        int i;
        defpackage.q04 q04Var = (defpackage.q04) this.z0.get();
        defpackage.hb hbVar = (defpackage.hb) (q04Var != null ? q04Var.b : null);
        if (hbVar == null) {
            defpackage.ci4 ci4Var = this.x0;
            if (ci4Var.d) {
                defpackage.qo1 qo1Var = ci4Var.h;
                defpackage.th4 th4Var = ci4Var.g;
                int i2 = qo1Var.e;
                boolean z = qo1Var.a;
                if (i2 == 1) {
                    i = z ? 6 : 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        defpackage.c.r("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = qo1Var.d;
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        defpackage.c.r("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z) {
                    int i4 = editorInfo.inputType;
                    if ((i4 & 1) == 1) {
                        editorInfo.inputType = i4 | 131072;
                        if (i2 == 1) {
                            editorInfo.imeOptions |= io.netty.util.internal.shaded.org.jctools.util.Pow2.MAX_POW2;
                        }
                    }
                }
                int i5 = editorInfo.inputType;
                if ((i5 & 1) == 1) {
                    int i6 = qo1Var.b;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (qo1Var.c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = th4Var.b;
                int i7 = defpackage.xi4.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                defpackage.bt1.f0(editorInfo, th4Var.a.i);
                editorInfo.imeOptions |= 33554432;
                if (defpackage.tz0.d()) {
                    defpackage.tz0.a().g(editorInfo);
                }
                defpackage.rl3 rl3Var = new defpackage.rl3(ci4Var.g, new defpackage.z22(28, ci4Var), ci4Var.h.c);
                ci4Var.i.add(new java.lang.ref.WeakReference(rl3Var));
                return rl3Var;
            }
        } else {
            defpackage.q04 q04Var2 = (defpackage.q04) hbVar.u.get();
            defpackage.tq1 tq1Var = (defpackage.tq1) (q04Var2 != null ? q04Var2.b : null);
            if (tq1Var != null) {
                return tq1Var.a(editorInfo);
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, java.util.function.Consumer consumer) {
        defpackage.e9 e9Var = this.K;
        e9Var.getClass();
        defpackage.r15.D(e9Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        defpackage.v6 v6Var;
        super.onDetachedFromWindow();
        this.D.onViewDetachedFromWindow(this);
        if (this.w) {
            android.view.View view = this.v;
            if (view == null) {
                defpackage.ct1.R("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (i > 28) {
            defpackage.wr2 wr2Var = b1;
            synchronized (wr2Var) {
                wr2Var.i(this);
            }
        }
        defpackage.f64 f64Var = getSnapshotObserver().a;
        defpackage.yn1 yn1Var = f64Var.h;
        if (yn1Var != null) {
            yn1Var.b();
        }
        f64Var.a();
        this.A.getClass();
        defpackage.l7 viewTreeOwners = getViewTreeOwners();
        defpackage.or1 or1VarG = viewTreeOwners != null ? viewTreeOwners.a.g() : null;
        if (or1VarG == null) {
            throw defpackage.ms1.u("No lifecycle owner exists");
        }
        or1VarG.G(this.K);
        or1VarG.G(this);
        if (h() && (v6Var = this.V) != null) {
            defpackage.io ioVar = defpackage.io.a;
            ioVar.getClass();
            ((android.view.autofill.AutofillManager) v6Var.c).unregisterCallback(defpackage.u6.g(ioVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.u0);
        getViewTreeObserver().removeOnScrollChangedListener(this.v0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.w0);
        if (i >= 31) {
            defpackage.n8.a.a(this);
        }
        defpackage.y6 y6Var = this.W;
        if (y6Var != null) {
            getSemanticsOwner().d.i(y6Var);
            ((defpackage.na1) getFocusOwner()).g.i(y6Var);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        defpackage.pp4.u(((defpackage.na1) getFocusOwner()).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.o0 = 0L;
        this.i0.j(this.S0);
        this.g0 = null;
        O();
        if (this.f0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        defpackage.ck2 ck2Var = this.i0;
        android.os.Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s(getRoot());
            }
            long jL = l(i);
            long jL2 = l(i2);
            long jR = defpackage.ct1.r((int) (jL >>> 32), (int) (jL & 4294967295L), (int) (jL2 >>> 32), (int) (4294967295L & jL2));
            defpackage.fc0 fc0Var = this.g0;
            if (fc0Var == null) {
                this.g0 = new defpackage.fc0(jR);
                this.h0 = false;
            } else if (!defpackage.fc0.b(fc0Var.a, jR)) {
                this.h0 = true;
            }
            ck2Var.q(jR);
            ck2Var.l();
            setMeasuredDimension(getRoot().X.p.f, getRoot().X.p.i);
            if (this.f0 != null) {
                getAndroidViewsHandler$ui_release().measure(android.view.View.MeasureSpec.makeMeasureSpec(getRoot().X.p.f, io.netty.util.internal.shaded.org.jctools.util.Pow2.MAX_POW2), android.view.View.MeasureSpec.makeMeasureSpec(getRoot().X.p.i, io.netty.util.internal.shaded.org.jctools.util.Pow2.MAX_POW2));
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r11, int r12) {
        /*
            r10 = this;
            boolean r12 = h()
            if (r12 == 0) goto Laf
            if (r11 == 0) goto Laf
            y6 r12 = r10.W
            if (r12 == 0) goto La8
            mz3 r0 = r12.b
            y42 r0 = r0.a
            android.view.autofill.AutofillId r1 = r12.g
            java.lang.String r2 = r12.e
            wl3 r3 = r12.d
            defpackage.n91.K(r11, r0, r1, r2, r3)
            java.lang.Object[] r1 = defpackage.ky2.a
            wr2 r1 = new wr2
            r4 = 2
            r1.<init>(r4)
            r1.a(r0)
            r1.a(r11)
        L27:
            boolean r0 = r1.h()
            if (r0 == 0) goto La8
            int r0 = r1.b
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.j(r0)
            r0.getClass()
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            int r4 = r1.b
            int r4 = r4 + (-1)
            java.lang.Object r4 = r1.j(r4)
            r4.getClass()
            y42 r4 = (defpackage.y42) r4
            java.util.List r4 = r4.n()
            ns2 r4 = (defpackage.ns2) r4
            os2 r5 = r4.f
            int r5 = r5.t
            r6 = 0
        L52:
            if (r6 >= r5) goto L27
            java.lang.Object r7 = r4.get(r6)
            y42 r7 = (defpackage.y42) r7
            boolean r8 = r7.h0
            if (r8 != 0) goto La5
            boolean r8 = r7.I()
            if (r8 == 0) goto La5
            boolean r8 = r7.J()
            if (r8 != 0) goto L6b
            goto La5
        L6b:
            fz3 r8 = r7.x()
            if (r8 == 0) goto L9f
            es2 r8 = r8.f
            qz3 r9 = defpackage.ez3.g
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8b
            qz3 r9 = defpackage.nz3.p
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8b
            qz3 r9 = defpackage.nz3.q
            boolean r8 = r8.b(r9)
            if (r8 == 0) goto L9f
        L8b:
            int r8 = defpackage.i3.i(r0)
            android.view.ViewStructure r8 = defpackage.i3.H(r0, r8)
            android.view.autofill.AutofillId r9 = r12.g
            defpackage.n91.K(r8, r7, r9, r2, r3)
            r1.a(r7)
            r1.a(r8)
            goto La5
        L9f:
            r1.a(r7)
            r1.a(r0)
        La5:
            int r6 = r6 + 1
            goto L52
        La8:
            v6 r10 = r10.V
            if (r10 == 0) goto Laf
            defpackage.bt1.V(r10, r11)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i) {
        defpackage.gc3 gc3Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (gc3Var = ((defpackage.u7) getPointerIconService()).a) == null) ? super.onResolvePointerIcon(motionEvent, i) : defpackage.o8.b(getContext(), gc3Var);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.i) {
            defpackage.k42 k42Var = defpackage.k42.f;
            defpackage.k42 k42Var2 = i != 0 ? i != 1 ? null : defpackage.k42.i : k42Var;
            if (k42Var2 != null) {
                k42Var = k42Var2;
            }
            setLayoutDirection(k42Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, android.graphics.Point point, java.util.function.Consumer consumer) {
        defpackage.p5 p5Var;
        if (android.os.Build.VERSION.SDK_INT < 31 || (p5Var = this.V0) == null) {
            return;
        }
        defpackage.mz3 semanticsOwner = getSemanticsOwner();
        defpackage.df0 coroutineContext = getCoroutineContext();
        defpackage.os2 os2Var = new defpackage.os2(new defpackage.xu3[16]);
        defpackage.n91.V(semanticsOwner.a(), 0, new defpackage.wu3(os2Var));
        java.util.Arrays.sort(os2Var.f, 0, os2Var.t, new defpackage.p50(new defpackage.jd1[]{defpackage.r13.J, defpackage.r13.K}));
        int i = os2Var.t;
        defpackage.xu3 xu3Var = (defpackage.xu3) (i == 0 ? null : os2Var.f[i - 1]);
        if (xu3Var == null) {
            return;
        }
        defpackage.r70 r70Var = new defpackage.r70(xu3Var.b(), xu3Var.c(), defpackage.u22.d(coroutineContext), p5Var, this);
        defpackage.j42 j42VarA = xu3Var.a();
        defpackage.vl3 vl3VarH = defpackage.xr1.N(j42VarA).H(j42VarA, true);
        long jF = xu3Var.c().f();
        android.view.ScrollCaptureTarget scrollCaptureTargetL = defpackage.gm2.l(this, defpackage.nq1.K(defpackage.da1.J(vl3VarH)), new android.graphics.Point((int) (jF >> 32), (int) (jF & 4294967295L)), r70Var);
        scrollCaptureTargetL.setScrollBounds(defpackage.nq1.K(xu3Var.c()));
        consumer.accept(scrollCaptureTargetL);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray longSparseArray) {
        defpackage.e9 e9Var = this.K;
        e9Var.getClass();
        defpackage.r15.F(e9Var, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zE;
        this.A.a.setValue(java.lang.Boolean.valueOf(z));
        this.U0 = true;
        super.onWindowFocusChanged(z);
        if (!z || android.os.Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zE = defpackage.pp4.E())) {
            return;
        }
        setShowLayoutBounds(zE);
        r(getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.p(android.view.MotionEvent):int");
    }

    @Override // defpackage.hm0
    public final void q(defpackage.ib2 ib2Var) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(defpackage.pp4.E());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((defpackage.na1) getFocusOwner()).c.z0().a()) {
            return super.requestFocus(i, rect);
        }
        defpackage.w91 w91VarS = defpackage.uj2.S(i);
        int i2 = w91VarS != null ? w91VarS.a : 7;
        return defpackage.ct1.g(((defpackage.na1) getFocusOwner()).e(i2, rect != null ? defpackage.nq1.N(rect) : null, new defpackage.v7(i2)), java.lang.Boolean.TRUE);
    }

    public final void s(defpackage.y42 y42Var) {
        this.i0.p(y42Var, false);
        defpackage.os2 os2VarZ = y42Var.z();
        java.lang.Object[] objArr = os2VarZ.f;
        int i = os2VarZ.t;
        for (int i2 = 0; i2 < i; i2++) {
            s((defpackage.y42) objArr[i2]);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.J.h = j;
    }

    public final void setConfigurationChangeObserver(defpackage.jd1 jd1Var) {
        this.U = jd1Var;
    }

    public final void setContentCaptureManager$ui_release(defpackage.e9 e9Var) {
        this.K = e9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [so2] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [so2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [os2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [os2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(defpackage.df0 df0Var) {
        this.y = df0Var;
        defpackage.so2 so2Var = getRoot().W.f;
        if (so2Var instanceof defpackage.xd4) {
            ((defpackage.xd4) so2Var).z0();
        }
        if (!so2Var.f.E) {
            defpackage.gq1.b("visitSubtreeIf called on an unattached node");
        }
        defpackage.os2 os2Var = new defpackage.os2(new defpackage.so2[16]);
        defpackage.so2 so2Var2 = so2Var.f;
        defpackage.so2 so2Var3 = so2Var2.w;
        if (so2Var3 == null) {
            defpackage.ct1.d(os2Var, so2Var2);
        } else {
            os2Var.b(so2Var3);
        }
        while (true) {
            int i = os2Var.t;
            if (i == 0) {
                return;
            }
            defpackage.so2 so2Var4 = (defpackage.so2) os2Var.k(i - 1);
            if ((so2Var4.u & 16) != 0) {
                for (defpackage.so2 so2Var5 = so2Var4; so2Var5 != null; so2Var5 = so2Var5.w) {
                    if ((so2Var5.t & 16) != 0) {
                        defpackage.no0 no0VarF = so2Var5;
                        ?? os2Var2 = 0;
                        while (no0VarF != 0) {
                            if (no0VarF instanceof defpackage.mc3) {
                                defpackage.mc3 mc3Var = (defpackage.mc3) no0VarF;
                                if (mc3Var instanceof defpackage.xd4) {
                                    ((defpackage.xd4) mc3Var).z0();
                                }
                            } else if ((no0VarF.t & 16) != 0 && (no0VarF instanceof defpackage.no0)) {
                                defpackage.so2 so2Var6 = no0VarF.G;
                                int i2 = 0;
                                no0VarF = no0VarF;
                                os2Var2 = os2Var2;
                                while (so2Var6 != null) {
                                    if ((so2Var6.t & 16) != 0) {
                                        i2++;
                                        os2Var2 = os2Var2;
                                        if (i2 == 1) {
                                            no0VarF = so2Var6;
                                        } else {
                                            if (os2Var2 == 0) {
                                                os2Var2 = new defpackage.os2(new defpackage.so2[16]);
                                            }
                                            if (no0VarF != 0) {
                                                os2Var2.b(no0VarF);
                                                no0VarF = 0;
                                            }
                                            os2Var2.b(so2Var6);
                                        }
                                    }
                                    so2Var6 = so2Var6.w;
                                    no0VarF = no0VarF;
                                    os2Var2 = os2Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            no0VarF = defpackage.ct1.f(os2Var2);
                        }
                    }
                }
            }
            defpackage.ct1.d(os2Var, so2Var4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.o0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(defpackage.jd1 jd1Var) {
        defpackage.l7 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            jd1Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.t0 = jd1Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.e0 = z;
    }

    public void setUncaughtExceptionHandler(defpackage.xr3 xr3Var) {
        this.i0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.hm0
    public final void t(defpackage.ib2 ib2Var) {
        ib2Var.getClass();
    }

    public final boolean v(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean w(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.J0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void x(float[] fArr) {
        G();
        defpackage.vj2.e(fArr, this.m0);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.q0 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.q0 & 4294967295L));
        float[] fArr2 = this.l0;
        defpackage.vj2.d(fArr2);
        defpackage.vj2.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        defpackage.q8.l0(fArr, fArr2);
    }

    public final long y(long j) {
        G();
        long jB = defpackage.vj2.b(j, this.m0);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.q0 >> 32)) + java.lang.Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.q0 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (jB & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public final void z(boolean z) {
        defpackage.w7 w7Var;
        defpackage.ck2 ck2Var = this.i0;
        if (ck2Var.b.A() || ((defpackage.os2) ck2Var.e.f).t != 0) {
            android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    w7Var = this.S0;
                } finally {
                    android.os.Trace.endSection();
                }
            } else {
                w7Var = null;
            }
            if (ck2Var.j(w7Var)) {
                requestLayout();
            }
            ck2Var.a(false);
            if (this.R) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.R = false;
            }
        }
    }

    public defpackage.t6 getAccessibilityManager() {
        return this.L;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public defpackage.d7 m346getClipboard() {
        return this.c0;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public defpackage.e7 m347getClipboardManager() {
        return this.b0;
    }

    public defpackage.x9 getDragAndDropManager() {
        return this.z;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public defpackage.kr2 m349getLayoutNodes() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @defpackage.bp0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @defpackage.bp0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public android.view.View getView() {
        return this;
    }

    @Override // defpackage.hm0
    public final void b(defpackage.ib2 ib2Var) {
    }

    @Override // defpackage.hm0
    public final void j(defpackage.ib2 ib2Var) {
    }

    @Override // defpackage.hm0
    public final void k(defpackage.ib2 ib2Var) {
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(defpackage.xr3 xr3Var) {
    }
}
