package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class ee2 implements defpackage.hv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.View b;

    public /* synthetic */ ee2(android.view.View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.hv0
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.setKeepScreenOn(false);
                break;
            default:
                this.b.setKeepScreenOn(false);
                break;
        }
    }
}
