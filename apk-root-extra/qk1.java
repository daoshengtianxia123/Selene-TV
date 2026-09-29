package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class qk1 extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public int i;
    public final /* synthetic */ java.util.List t;
    public final /* synthetic */ org.moontechlab.selenetv.model.VideoInfo u;
    public final /* synthetic */ defpackage.ls2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk1(java.util.List list, org.moontechlab.selenetv.model.VideoInfo videoInfo, defpackage.ls2 ls2Var, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.t = list;
        this.u = videoInfo;
        this.v = ls2Var;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        switch (this.f) {
            case 0:
                return new defpackage.qk1(this.t, this.u, this.v, sd0Var, 0);
            case 1:
                return new defpackage.qk1(this.t, this.u, this.v, sd0Var, 1);
            default:
                return new defpackage.qk1(this.t, this.u, this.v, sd0Var, 2);
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
        return ((defpackage.qk1) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.f;
        java.lang.Object obj2 = defpackage.as4.a;
        java.util.List list = this.t;
        defpackage.ls2 ls2Var = this.v;
        org.moontechlab.selenetv.model.VideoInfo videoInfo = this.u;
        java.lang.Object obj3 = defpackage.of0.f;
        int i2 = 1;
        defpackage.sd0 sd0Var = null;
        switch (i) {
            case 0:
                int i3 = this.i;
                try {
                    if (i3 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var = defpackage.cv0.d;
                        defpackage.pk1 pk1Var = new defpackage.pk1(videoInfo, sd0Var, 0);
                        this.i = 1;
                        if (defpackage.u22.Q(vl0Var, pk1Var, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else if (i3 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                    }
                    break;
                } catch (java.lang.Exception e) {
                    ls2Var.setValue(list);
                    android.util.Log.e("HomeTab", "添加收藏失败: " + e.getMessage());
                    return obj2;
                }
            case 1:
                int i4 = this.i;
                try {
                    if (i4 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var2 = defpackage.cv0.d;
                        defpackage.pk1 pk1Var2 = new defpackage.pk1(videoInfo, sd0Var, i2);
                        this.i = 1;
                        if (defpackage.u22.Q(vl0Var2, pk1Var2, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else if (i4 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                    }
                    break;
                } catch (java.lang.Exception e2) {
                    ls2Var.setValue(list);
                    android.util.Log.e("HomeTab", "删除播放记录失败: " + e2.getMessage());
                    return obj2;
                }
            default:
                int i5 = this.i;
                try {
                    if (i5 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var3 = defpackage.cv0.d;
                        defpackage.pk1 pk1Var3 = new defpackage.pk1(videoInfo, sd0Var, 2);
                        this.i = 1;
                        if (defpackage.u22.Q(vl0Var3, pk1Var3, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else if (i5 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                    }
                    break;
                } catch (java.lang.Exception e3) {
                    ls2Var.setValue(list);
                    android.util.Log.e("HomeTab", "取消收藏失败: " + e3.getMessage());
                    return obj2;
                }
        }
        return obj2;
    }
}
