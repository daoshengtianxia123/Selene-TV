package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class vd2 implements defpackage.jd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ android.view.View i;
    public final /* synthetic */ boolean t;

    public /* synthetic */ vd2(android.view.View view, int i, boolean z) {
        this.f = i;
        this.i = view;
        this.t = z;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.f;
        boolean z = this.t;
        android.view.View view = this.i;
        defpackage.iv0 iv0Var = (defpackage.iv0) obj;
        switch (i) {
            case 0:
                iv0Var.getClass();
                view.setKeepScreenOn(z);
                return new defpackage.ee2(view, 0);
            default:
                iv0Var.getClass();
                view.setKeepScreenOn(z);
                return new defpackage.ee2(view, 1);
        }
    }
}
