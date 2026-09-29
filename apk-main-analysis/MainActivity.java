package org.moontechlab.selenetv;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/moontechlab/selenetv/MainActivity;", "Li60;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = io.netty.handler.ssl.OpenSslSessionTicketKey.TICKET_KEY_SIZE)
/* loaded from: classes.dex */
public final class MainActivity extends defpackage.i60 {
    public static final /* synthetic */ int L = 0;
    public final android.os.Handler J = new android.os.Handler(android.os.Looper.getMainLooper());
    public final defpackage.rd0 K;

    public MainActivity() {
        defpackage.cv0 cv0Var = defpackage.cv0.a;
        this.K = defpackage.u22.d(defpackage.ri2.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:68:0x011a, B:23:0x0051, B:56:0x00e5, B:59:0x00ef, B:61:0x00f5, B:70:0x0131, B:26:0x005e, B:50:0x00c1, B:53:0x00c7, B:29:0x0065, B:43:0x00a2, B:46:0x00a7, B:30:0x0069, B:36:0x0084, B:39:0x0089, B:33:0x0070), top: B:74:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:68:0x011a, B:23:0x0051, B:56:0x00e5, B:59:0x00ef, B:61:0x00f5, B:70:0x0131, B:26:0x005e, B:50:0x00c1, B:53:0x00c7, B:29:0x0065, B:43:0x00a2, B:46:0x00a7, B:30:0x0069, B:36:0x0084, B:39:0x0089, B:33:0x0070), top: B:74:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(org.moontechlab.selenetv.MainActivity r19, defpackage.ud0 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.moontechlab.selenetv.MainActivity.i(org.moontechlab.selenetv.MainActivity, ud0):java.lang.Object");
    }

    @Override // defpackage.h60, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            b().b();
        }
        return true;
    }

    @Override // defpackage.i60, defpackage.h60, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = (i < i2 ? i2 : i) / 1080.0f;
        float f2 = (displayMetrics.scaledDensity / displayMetrics.density) * f;
        int i3 = (int) (160.0f * f);
        android.util.Log.d("MainActivity", "Screen: " + i + "x" + i2);
        android.util.Log.d("MainActivity", "Original density: " + displayMetrics.density + ", dpi: " + displayMetrics.densityDpi);
        android.util.Log.d("MainActivity", "Target density: " + f + ", dpi: " + i3);
        displayMetrics.density = f;
        displayMetrics.scaledDensity = f2;
        displayMetrics.densityDpi = i3;
        android.content.res.Configuration configuration = getResources().getConfiguration();
        configuration.densityDpi = i3;
        getResources().updateConfiguration(configuration, displayMetrics);
        super.onCreate(bundle);
        defpackage.sd0 sd0Var = null;
        getWindow().setBackgroundDrawable(null);
        android.content.SharedPreferences sharedPreferences = defpackage.lj.a;
        if (!defpackage.lj.b) {
            defpackage.u22.C(this.K, null, new defpackage.cm(this, sd0Var, 3), 3);
        }
        defpackage.nq1.c = new defpackage.pi2(0, this);
        defpackage.nq1.d = new defpackage.pi2(1, this);
        defpackage.q60 q60Var = defpackage.uj2.f;
        android.view.ViewGroup.LayoutParams layoutParams = defpackage.j60.a;
        android.view.View childAt = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        defpackage.x70 x70Var = childAt instanceof defpackage.x70 ? (defpackage.x70) childAt : null;
        if (x70Var != null) {
            x70Var.setParentCompositionContext(null);
            x70Var.setContent(q60Var);
            return;
        }
        defpackage.x70 x70Var2 = new defpackage.x70(this);
        x70Var2.setParentCompositionContext(null);
        x70Var2.setContent(q60Var);
        android.view.View decorView = getWindow().getDecorView();
        if (defpackage.nq1.u(decorView) == null) {
            decorView.setTag(dev.jdtech.mpv.R.id.view_tree_lifecycle_owner, this);
        }
        if (defpackage.xr1.P(decorView) == null) {
            decorView.setTag(dev.jdtech.mpv.R.id.view_tree_view_model_store_owner, this);
        }
        if (defpackage.or1.s(decorView) == null) {
            decorView.setTag(dev.jdtech.mpv.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(x70Var2, defpackage.j60.a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            defpackage.nq1.c = null;
            defpackage.nq1.d = null;
        }
        defpackage.u22.l(this.K, null);
    }
}
