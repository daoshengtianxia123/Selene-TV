package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final /* synthetic */ class pi2 implements defpackage.jd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ org.moontechlab.selenetv.MainActivity i;

    public /* synthetic */ pi2(int i, org.moontechlab.selenetv.MainActivity mainActivity) {
        this.f = i;
        this.i = mainActivity;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        org.moontechlab.selenetv.MainActivity mainActivity = this.i;
        switch (i) {
            case 0:
                mainActivity.J.post(new defpackage.pi(((java.lang.Integer) obj).intValue(), mainActivity));
                break;
            default:
                java.lang.String str = (java.lang.String) obj;
                int i2 = org.moontechlab.selenetv.MainActivity.L;
                str.getClass();
                mainActivity.J.post(new defpackage.a9(str, 6, mainActivity));
                break;
        }
        return as4Var;
    }
}
