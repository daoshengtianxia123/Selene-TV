package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class cf2 extends defpackage.sd4 implements defpackage.xd1 {
    public int f;
    public final /* synthetic */ defpackage.ls2 i;
    public final /* synthetic */ defpackage.ls2 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ defpackage.ls2 v;
    public final /* synthetic */ defpackage.ls2 w;
    public final /* synthetic */ defpackage.nf0 x;
    public final /* synthetic */ defpackage.ls2 y;
    public final /* synthetic */ defpackage.ls2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf2(defpackage.ls2 ls2Var, defpackage.ls2 ls2Var2, boolean z, defpackage.ls2 ls2Var3, defpackage.ls2 ls2Var4, defpackage.nf0 nf0Var, defpackage.ls2 ls2Var5, defpackage.ls2 ls2Var6, defpackage.sd0 sd0Var) {
        super(2, sd0Var);
        this.i = ls2Var;
        this.t = ls2Var2;
        this.u = z;
        this.v = ls2Var3;
        this.w = ls2Var4;
        this.x = nf0Var;
        this.y = ls2Var5;
        this.z = ls2Var6;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        return new defpackage.cf2(this.i, this.t, this.u, this.v, this.w, this.x, this.y, this.z, sd0Var);
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.cf2) create((defpackage.nf0) obj, (defpackage.sd0) obj2)).invokeSuspend(defpackage.as4.a);
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objQ;
        org.moontechlab.selenetv.model.LiveSource liveSource;
        java.lang.Object next;
        defpackage.ls2 ls2Var = this.w;
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.sd0 sd0Var = null;
        defpackage.ls2 ls2Var2 = this.t;
        defpackage.ls2 ls2Var3 = this.i;
        int i2 = 1;
        try {
            if (i == 0) {
                defpackage.or1.J(obj);
                ls2Var3.setValue(java.lang.Boolean.TRUE);
                ls2Var2.setValue(null);
                defpackage.vl0 vl0Var = defpackage.cv0.d;
                defpackage.jj jjVar = new defpackage.jj(this.u, sd0Var, i2);
                this.f = 1;
                objQ = defpackage.u22.Q(vl0Var, jjVar, this);
                defpackage.of0 of0Var = defpackage.of0.f;
                if (objQ == of0Var) {
                    return of0Var;
                }
            } else {
                if (i != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.or1.J(obj);
                objQ = obj;
            }
            java.util.List list = (java.util.List) objQ;
            if (list.isEmpty()) {
                ls2Var2.setValue("暂无直播源");
                ls2Var3.setValue(java.lang.Boolean.FALSE);
                return as4Var;
            }
            this.v.setValue(list);
            org.moontechlab.selenetv.model.LiveSource liveSource2 = (org.moontechlab.selenetv.model.LiveSource) ls2Var.getValue();
            if (liveSource2 != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (defpackage.ct1.g(((org.moontechlab.selenetv.model.LiveSource) next).a, liveSource2.a)) {
                        break;
                    }
                }
                liveSource = (org.moontechlab.selenetv.model.LiveSource) next;
                if (liveSource == null) {
                    liveSource = (org.moontechlab.selenetv.model.LiveSource) defpackage.y30.v0(list);
                }
            } else {
                liveSource = (org.moontechlab.selenetv.model.LiveSource) defpackage.y30.v0(list);
            }
            org.moontechlab.selenetv.model.LiveSource liveSource3 = liveSource;
            ls2Var.setValue(liveSource3);
            defpackage.u22.C(this.x, null, new defpackage.oa(this.y, this.z, this.i, this.t, liveSource3, null, 6), 3);
            return as4Var;
        } catch (java.lang.Exception e) {
            ls2Var2.setValue("加载直播源失败: " + e.getMessage());
            ls2Var3.setValue(java.lang.Boolean.FALSE);
            android.util.Log.e("LiveTab", "加载直播源失败", e);
            return as4Var;
        }
    }
}
