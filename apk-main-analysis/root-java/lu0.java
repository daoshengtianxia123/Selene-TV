package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class lu0 extends android.app.Dialog implements defpackage.ib2, defpackage.vz2, defpackage.du3 {
    public defpackage.kb2 f;
    public final defpackage.mw i;
    public final defpackage.tz2 t;
    public defpackage.hd1 u;
    public defpackage.ju0 v;
    public final android.view.View w;
    public final defpackage.gu0 x;
    public boolean y;

    public lu0(defpackage.hd1 hd1Var, defpackage.ju0 ju0Var, android.view.View view, defpackage.k42 k42Var, defpackage.yo0 yo0Var, java.util.UUID uuid) {
        super(new android.view.ContextThemeWrapper(view.getContext(), ju0Var.e ? dev.jdtech.mpv.R.style.DialogWindowTheme : dev.jdtech.mpv.R.style.FloatingDialogWindowTheme), 0);
        this.i = new defpackage.mw(new defpackage.cu3(this, new defpackage.uk(13, this)), 11);
        defpackage.tz2 tz2Var = new defpackage.tz2(new defpackage.tm(2, this));
        this.t = tz2Var;
        this.u = hd1Var;
        this.v = ju0Var;
        this.w = view;
        android.view.Window window = getWindow();
        if (window == null) {
            defpackage.c.r("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        boolean z = this.v.e;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            defpackage.n4.e(window, z);
        } else if (i >= 30) {
            defpackage.n4.d(window, z);
        } else {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
        window.setGravity(17);
        if (!this.v.e) {
            window.addFlags(65792);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (i >= 28) {
                defpackage.ji.a.a(attributes);
            }
            if (i >= 30) {
                defpackage.ki kiVar = defpackage.ki.a;
                kiVar.a(attributes, 0);
                kiVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        defpackage.gu0 gu0Var = new defpackage.gu0(getContext(), window);
        setTitle(this.v.f);
        gu0Var.setTag(dev.jdtech.mpv.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        gu0Var.setClipChildren(false);
        gu0Var.setElevation(yo0Var.V(8.0f));
        gu0Var.setOutlineProvider(new defpackage.ku0(0));
        this.x = gu0Var;
        android.view.View decorView2 = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView2 : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(gu0Var);
        gu0Var.setTag(dev.jdtech.mpv.R.id.view_tree_lifecycle_owner, defpackage.nq1.u(view));
        gu0Var.setTag(dev.jdtech.mpv.R.id.view_tree_view_model_store_owner, defpackage.xr1.P(view));
        gu0Var.setTag(dev.jdtech.mpv.R.id.view_tree_saved_state_registry_owner, defpackage.or1.s(view));
        h(this.u, this.v, k42Var);
        tz2Var.a(this, new defpackage.uz2(new defpackage.q9(this, 1)));
    }

    public static void a(defpackage.lu0 lu0Var) {
        super.onBackPressed();
    }

    public static final void c(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof defpackage.gu0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vz2
    public final defpackage.tz2 b() {
        return this.t;
    }

    public final defpackage.kb2 d() {
        defpackage.kb2 kb2Var = this.f;
        if (kb2Var != null) {
            return kb2Var;
        }
        defpackage.kb2 kb2Var2 = new defpackage.kb2(this, true);
        this.f = kb2Var2;
        return kb2Var2;
    }

    public final void e() {
        android.view.Window window = getWindow();
        window.getClass();
        android.view.View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(dev.jdtech.mpv.R.id.view_tree_lifecycle_owner, this);
        android.view.Window window2 = getWindow();
        window2.getClass();
        android.view.View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(dev.jdtech.mpv.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.Window window3 = getWindow();
        window3.getClass();
        android.view.View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(dev.jdtech.mpv.R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.du3
    public final defpackage.mw f() {
        return (defpackage.mw) this.i.i;
    }

    @Override // defpackage.ib2
    public final defpackage.or1 g() {
        return d();
    }

    public final void h(defpackage.hd1 hd1Var, defpackage.ju0 ju0Var, defpackage.k42 k42Var) {
        int i;
        this.u = hd1Var;
        this.v = ju0Var;
        defpackage.qx3 qx3Var = ju0Var.c;
        boolean zC = defpackage.rb.c(this.w);
        int iOrdinal = qx3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    defpackage.jc2.o();
                    return;
                }
                zC = false;
            }
        }
        android.view.Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = k42Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                defpackage.jc2.o();
                return;
            }
            i = 1;
        }
        defpackage.gu0 gu0Var = this.x;
        gu0Var.setLayoutDirection(i);
        boolean z = ju0Var.e;
        boolean z2 = ju0Var.d;
        android.view.Window window2 = gu0Var.z;
        boolean z3 = (gu0Var.D && z2 == gu0Var.B && z == gu0Var.C) ? false : true;
        gu0Var.B = z2;
        gu0Var.C = z;
        if (z3) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !gu0Var.D) {
                window2.setLayout(i2, -2);
                gu0Var.D = true;
            }
        }
        setCanceledOnTouchOutside(ju0Var.b);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : android.os.Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.t.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            defpackage.tz2 tz2Var = this.t;
            tz2Var.getClass();
            tz2Var.e = onBackInvokedDispatcher;
            tz2Var.c(tz2Var.g);
        }
        this.i.l(bundle);
        d().P(defpackage.cb2.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (!this.v.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.u.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.i.m(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().P(defpackage.cb2.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d().P(defpackage.cb2.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            ju0 r1 = r9.v
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            gu0 r1 = r9.x
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.uj2.L(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = defpackage.uj2.L(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.y = r3
            return r0
        L7c:
            boolean r10 = r9.y
            if (r10 == 0) goto L95
            hd1 r10 = r9.u
            r10.invoke()
            r9.y = r3
            return r4
        L88:
            r9.y = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.y = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
