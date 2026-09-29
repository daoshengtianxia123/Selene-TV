package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public abstract class i60 extends defpackage.h60 implements defpackage.lx4, defpackage.xh1, defpackage.du3, defpackage.vz2 {
    public final defpackage.gd1 A;
    public final defpackage.c60 B;
    public final java.util.concurrent.CopyOnWriteArrayList C;
    public final java.util.concurrent.CopyOnWriteArrayList D;
    public final java.util.concurrent.CopyOnWriteArrayList E;
    public final java.util.concurrent.CopyOnWriteArrayList F;
    public final java.util.concurrent.CopyOnWriteArrayList G;
    public boolean H;
    public boolean I;
    public final defpackage.hd0 i;
    public final defpackage.p5 t;
    public final defpackage.kb2 u;
    public final defpackage.mw v;
    public defpackage.kx4 w;
    public defpackage.eu3 x;
    public defpackage.tz2 y;
    public final defpackage.g60 z;

    public i60() {
        defpackage.hd0 hd0Var = new defpackage.hd0();
        this.i = hd0Var;
        this.t = new defpackage.p5(new defpackage.g7(4, this));
        defpackage.kb2 kb2Var = new defpackage.kb2(this, true);
        this.u = kb2Var;
        defpackage.cu3 cu3Var = new defpackage.cu3(this, new defpackage.uk(13, this));
        defpackage.mw mwVar = new defpackage.mw(cu3Var, 11);
        this.v = mwVar;
        this.y = null;
        defpackage.g60 g60Var = new defpackage.g60(this);
        this.z = g60Var;
        this.A = new defpackage.gd1(g60Var, new defpackage.uk(4, this));
        new java.util.concurrent.atomic.AtomicInteger();
        this.B = new defpackage.c60();
        this.C = new java.util.concurrent.CopyOnWriteArrayList();
        this.D = new java.util.concurrent.CopyOnWriteArrayList();
        this.E = new java.util.concurrent.CopyOnWriteArrayList();
        this.F = new java.util.concurrent.CopyOnWriteArrayList();
        this.G = new java.util.concurrent.CopyOnWriteArrayList();
        this.H = false;
        this.I = false;
        kb2Var.i(new defpackage.d60(this, 0));
        kb2Var.i(new defpackage.d60(this, 1));
        kb2Var.i(new defpackage.d60(this, 2));
        cu3Var.a();
        defpackage.q8.P(this);
        if (android.os.Build.VERSION.SDK_INT <= 23) {
            kb2Var.i(new defpackage.q80(1, this));
        }
        ((defpackage.mw) mwVar.i).n("android:support:activity-result", new defpackage.a60(0, this));
        defpackage.b60 b60Var = new defpackage.b60(this);
        if (hd0Var.b != null) {
            b60Var.a();
        }
        hd0Var.a.add(b60Var);
    }

    @Override // defpackage.xh1
    public final defpackage.ix4 a() {
        if (this.x == null) {
            this.x = new defpackage.eu3(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.x;
    }

    @Override // android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        this.z.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vz2
    public final defpackage.tz2 b() {
        if (this.y == null) {
            this.y = new defpackage.tz2(new defpackage.x7(1, this));
            this.u.i(new defpackage.d60(this, 3));
        }
        return this.y;
    }

    @Override // defpackage.xh1
    public final defpackage.hr2 c() {
        defpackage.hr2 hr2Var = new defpackage.hr2();
        android.app.Application application = getApplication();
        java.util.LinkedHashMap linkedHashMap = hr2Var.a;
        if (application != null) {
            linkedHashMap.put(defpackage.hx4.w, getApplication());
        }
        linkedHashMap.put(defpackage.q8.h, this);
        linkedHashMap.put(defpackage.q8.i, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(defpackage.q8.j, getIntent().getExtras());
        }
        return hr2Var;
    }

    @Override // defpackage.lx4
    public final defpackage.kx4 d() {
        if (getApplication() == null) {
            defpackage.c.r("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.w == null) {
            defpackage.f60 f60Var = (defpackage.f60) getLastNonConfigurationInstance();
            if (f60Var != null) {
                this.w = f60Var.a;
            }
            if (this.w == null) {
                this.w = new defpackage.kx4();
            }
        }
        return this.w;
    }

    @Override // defpackage.du3
    public final defpackage.mw f() {
        return (defpackage.mw) this.v.i;
    }

    @Override // defpackage.ib2
    public final defpackage.or1 g() {
        return this.u;
    }

    public final void h() {
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(dev.jdtech.mpv.R.id.view_tree_lifecycle_owner, this);
        android.view.View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(dev.jdtech.mpv.R.id.view_tree_view_model_store_owner, this);
        android.view.View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(dev.jdtech.mpv.R.id.view_tree_saved_state_registry_owner, this);
        android.view.View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(dev.jdtech.mpv.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(dev.jdtech.mpv.R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.B.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((defpackage.oc0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.h60, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.v.l(bundle);
        defpackage.hd0 hd0Var = this.i;
        hd0Var.getClass();
        hd0Var.b = this;
        java.util.Iterator it = hd0Var.a.iterator();
        while (it.hasNext()) {
            ((defpackage.b60) it.next()).a();
        }
        super.onCreate(bundle);
        int i = defpackage.fq3.i;
        defpackage.dq3.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.t.i).iterator();
        if (!it.hasNext()) {
            return true;
        }
        defpackage.h5.k(it.next());
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.t.i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        defpackage.h5.k(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        this.H = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.H = false;
            java.util.Iterator it = this.F.iterator();
            while (it.hasNext()) {
                ((defpackage.oc0) it.next()).accept(new defpackage.wp0(configuration, 22));
            }
        } catch (java.lang.Throwable th) {
            this.H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.util.Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((defpackage.oc0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.t.i).iterator();
        if (it.hasNext()) {
            defpackage.h5.k(it.next());
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        this.I = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.I = false;
            java.util.Iterator it = this.G.iterator();
            while (it.hasNext()) {
                ((defpackage.oc0) it.next()).accept(new defpackage.wp0(configuration, 26));
            }
        } catch (java.lang.Throwable th) {
            this.I = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.t.i).iterator();
        if (!it.hasNext()) {
            return true;
        }
        defpackage.h5.k(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (this.B.a(i, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        defpackage.f60 f60Var;
        defpackage.kx4 kx4Var = this.w;
        if (kx4Var == null && (f60Var = (defpackage.f60) getLastNonConfigurationInstance()) != null) {
            kx4Var = f60Var.a;
        }
        if (kx4Var == null) {
            return null;
        }
        defpackage.f60 f60Var2 = new defpackage.f60();
        f60Var2.a = kx4Var;
        return f60Var2;
    }

    @Override // defpackage.h60, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        defpackage.kb2 kb2Var = this.u;
        if (defpackage.ms1.J(kb2Var)) {
            kb2Var.O("setCurrentState");
            kb2Var.Q(defpackage.db2.t);
        }
        super.onSaveInstanceState(bundle);
        this.v.m(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((defpackage.oc0) it.next()).accept(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (defpackage.ss1.S()) {
                defpackage.ss1.r("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            defpackage.gd1 gd1Var = this.A;
            synchronized (gd1Var.b) {
                try {
                    gd1Var.a = true;
                    java.util.Iterator it = ((java.util.ArrayList) gd1Var.c).iterator();
                    while (it.hasNext()) {
                        ((defpackage.hd1) it.next()).invoke();
                    }
                    ((java.util.ArrayList) gd1Var.c).clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        h();
        this.z.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View view) {
        h();
        this.z.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        this.z.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.H) {
            return;
        }
        java.util.Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((defpackage.oc0) it.next()).accept(new defpackage.wp0(22));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.I) {
            return;
        }
        java.util.Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((defpackage.oc0) it.next()).accept(new defpackage.wp0(26));
        }
    }
}
