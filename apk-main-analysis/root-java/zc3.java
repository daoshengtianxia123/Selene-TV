package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class zc3 extends defpackage.o0 {
    public defpackage.cd3 A;
    public java.lang.String B;
    public final android.view.View C;
    public final defpackage.wp0 D;
    public final android.view.WindowManager E;
    public final android.view.WindowManager.LayoutParams F;
    public defpackage.bd3 G;
    public defpackage.k42 H;
    public final defpackage.a43 I;
    public final defpackage.a43 J;
    public defpackage.sr1 K;
    public final defpackage.fp0 L;
    public final android.graphics.Rect M;
    public final defpackage.f64 N;
    public defpackage.ni O;
    public final defpackage.a43 P;
    public boolean Q;
    public final int[] R;
    public defpackage.hd1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc3(defpackage.hd1 hd1Var, defpackage.cd3 cd3Var, java.lang.String str, android.view.View view, defpackage.yo0 yo0Var, defpackage.bd3 bd3Var, java.util.UUID uuid) {
        super(view.getContext());
        int i = 28;
        defpackage.wp0 ad3Var = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.ad3(i) : new defpackage.wp0(i);
        this.z = hd1Var;
        this.A = cd3Var;
        this.B = str;
        this.C = view;
        this.D = ad3Var;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.E = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        defpackage.cd3 cd3Var2 = this.A;
        boolean zC = defpackage.rb.c(view);
        boolean z = cd3Var2.b;
        int i2 = cd3Var2.a;
        if (z && zC) {
            i2 |= 8192;
        } else if (z && !zC) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(dev.jdtech.mpv.R.string.default_popup_window_title));
        this.F = layoutParams;
        this.G = bd3Var;
        this.H = defpackage.k42.f;
        this.I = defpackage.or1.C(null);
        this.J = defpackage.or1.C(null);
        this.L = defpackage.or1.r(new defpackage.k3(25, this));
        this.M = new android.graphics.Rect();
        this.N = new defpackage.f64(new defpackage.nb(this, 2));
        setId(android.R.id.content);
        setTag(dev.jdtech.mpv.R.id.view_tree_lifecycle_owner, defpackage.nq1.u(view));
        setTag(dev.jdtech.mpv.R.id.view_tree_view_model_store_owner, defpackage.xr1.P(view));
        setTag(dev.jdtech.mpv.R.id.view_tree_saved_state_registry_owner, defpackage.or1.s(view));
        setTag(dev.jdtech.mpv.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(yo0Var.V(8.0f));
        setOutlineProvider(new defpackage.ku0(1));
        this.P = defpackage.or1.C(defpackage.s60.a);
        this.R = new int[2];
    }

    private final defpackage.xd1 getContent() {
        return (defpackage.xd1) this.P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.j42 getParentLayoutCoordinates() {
        return (defpackage.j42) this.J.getValue();
    }

    private final defpackage.sr1 getVisibleDisplayBounds() {
        this.D.getClass();
        android.view.View view = this.C;
        android.graphics.Rect rect = this.M;
        view.getWindowVisibleDisplayFrame(rect);
        return new defpackage.sr1(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(defpackage.xd1 xd1Var) {
        this.P.setValue(xd1Var);
    }

    private final void setParentLayoutCoordinates(defpackage.j42 j42Var) {
        this.J.setValue(j42Var);
    }

    @Override // defpackage.o0
    public final void a(defpackage.k80 k80Var, int i) {
        k80Var.d0(-857613600);
        int i2 = 4;
        int i3 = (k80Var.h(this) ? 4 : 2) | i;
        if (k80Var.S(i3 & 1, (i3 & 3) != 2)) {
            getContent().invoke(k80Var, 0);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.d9(this, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.A.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                defpackage.hd1 hd1Var = this.z;
                if (hd1Var != null) {
                    hd1Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.o0
    public final void f(int i, int i2, int i3, boolean z, int i4) {
        super.f(i, i2, i3, z, i4);
        this.A.getClass();
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        android.view.WindowManager.LayoutParams layoutParams = this.F;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.D.getClass();
        this.E.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.o0
    public final void g(int i, int i2) {
        this.A.getClass();
        defpackage.sr1 visibleDisplayBounds = getVisibleDisplayBounds();
        super.g(android.view.View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) this.L.getValue()).booleanValue();
    }

    public final android.view.WindowManager.LayoutParams getParams$ui_release() {
        return this.F;
    }

    public final defpackage.k42 getParentLayoutDirection() {
        return this.H;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final defpackage.wr1 m351getPopupContentSizebOM6tXw() {
        return (defpackage.wr1) this.I.getValue();
    }

    public final defpackage.bd3 getPositionProvider() {
        return this.G;
    }

    @Override // defpackage.o0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.Q;
    }

    public final java.lang.String getTestTag() {
        return this.B;
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
        return null;
    }

    public final void j(defpackage.z80 z80Var, defpackage.xd1 xd1Var) {
        setParentCompositionContext(z80Var);
        setContent(xd1Var);
        this.Q = true;
    }

    public final void k(defpackage.hd1 hd1Var, defpackage.cd3 cd3Var, java.lang.String str, defpackage.k42 k42Var) {
        int i;
        this.z = hd1Var;
        this.B = str;
        if (!defpackage.ct1.g(this.A, cd3Var)) {
            cd3Var.getClass();
            this.A = cd3Var;
            boolean zC = defpackage.rb.c(this.C);
            boolean z = cd3Var.b;
            int i2 = cd3Var.a;
            if (z && zC) {
                i2 |= 8192;
            } else if (z && !zC) {
                i2 &= -8193;
            }
            android.view.WindowManager.LayoutParams layoutParams = this.F;
            layoutParams.flags = i2;
            this.D.getClass();
            this.E.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = k42Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                defpackage.jc2.o();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void l() {
        defpackage.j42 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.i()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jL = parentLayoutCoordinates.l();
            long jD = parentLayoutCoordinates.d(0L);
            long jRound = (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jD >> 32))) << 32) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jD & 4294967295L))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            defpackage.sr1 sr1Var = new defpackage.sr1(i, i2, ((int) (jL >> 32)) + i, ((int) (jL & 4294967295L)) + i2);
            if (sr1Var.equals(this.K)) {
                return;
            }
            this.K = sr1Var;
            n();
        }
    }

    public final void m(defpackage.j42 j42Var) {
        setParentLayoutCoordinates(j42Var);
        l();
    }

    public final void n() {
        defpackage.wr1 wr1VarM351getPopupContentSizebOM6tXw;
        defpackage.sr1 sr1Var = this.K;
        if (sr1Var == null || (wr1VarM351getPopupContentSizebOM6tXw = m351getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = wr1VarM351getPopupContentSizebOM6tXw.a;
        defpackage.sr1 visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (visibleDisplayBounds.b() & 4294967295L) | ((visibleDisplayBounds.c - visibleDisplayBounds.a) << 32);
        defpackage.xm3 xm3Var = new defpackage.xm3();
        xm3Var.f = 0L;
        this.N.d(this, defpackage.r13.w, new defpackage.yc3(xm3Var, this, sr1Var, jB, j));
        long j2 = xm3Var.f;
        android.view.WindowManager.LayoutParams layoutParams = this.F;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.A.e;
        defpackage.wp0 wp0Var = this.D;
        if (z) {
            wp0Var.I(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        wp0Var.getClass();
        this.E.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.o0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.e();
        if (!this.A.c || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.O == null) {
            this.O = new defpackage.ni(this.z, 0);
        }
        defpackage.o4.c(this, this.O);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.f64 f64Var = this.N;
        defpackage.yn1 yn1Var = f64Var.h;
        if (yn1Var != null) {
            yn1Var.b();
        }
        f64Var.a();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.o4.d(this, this.O);
        }
        this.O = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.A.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            defpackage.hd1 hd1Var = this.z;
            if (hd1Var != null) {
                hd1Var.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        defpackage.hd1 hd1Var2 = this.z;
        if (hd1Var2 != null) {
            hd1Var2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(defpackage.k42 k42Var) {
        this.H = k42Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m352setPopupContentSizefhxjrPA(defpackage.wr1 wr1Var) {
        this.I.setValue(wr1Var);
    }

    public final void setPositionProvider(defpackage.bd3 bd3Var) {
        this.G = bd3Var;
    }

    public final void setTestTag(java.lang.String str) {
        this.B = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public defpackage.o0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
