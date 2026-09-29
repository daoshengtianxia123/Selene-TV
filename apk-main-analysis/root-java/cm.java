package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class cm extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public int i;
    public final /* synthetic */ java.lang.Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(java.lang.Object obj, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.t = obj;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        int i = this.f;
        java.lang.Object obj2 = this.t;
        switch (i) {
            case 0:
                return new defpackage.cm((defpackage.fm) obj2, sd0Var, 0);
            case 1:
                return new defpackage.cm((defpackage.uv0) obj2, sd0Var, 1);
            case 2:
                return new defpackage.cm((defpackage.hb1) obj2, sd0Var, 2);
            case 3:
                return new defpackage.cm((org.moontechlab.selenetv.MainActivity) obj2, sd0Var, 3);
            default:
                return new defpackage.cm((defpackage.x92) obj2, sd0Var, 4);
        }
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.nf0 nf0Var = (defpackage.nf0) obj;
        defpackage.sd0 sd0Var = (defpackage.sd0) obj2;
        switch (i) {
        }
        return ((defpackage.cm) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    @Override // defpackage.up
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
