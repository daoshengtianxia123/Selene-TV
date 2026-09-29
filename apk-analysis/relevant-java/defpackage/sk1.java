package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class sk1 extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public int i;
    public final /* synthetic */ defpackage.cw0 t;
    public final /* synthetic */ defpackage.ls2 u;
    public final /* synthetic */ defpackage.ls2 v;
    public final /* synthetic */ defpackage.ls2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(defpackage.cw0 cw0Var, defpackage.ls2 ls2Var, defpackage.ls2 ls2Var2, defpackage.ls2 ls2Var3, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.t = cw0Var;
        this.u = ls2Var;
        this.v = ls2Var2;
        this.w = ls2Var3;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        switch (this.f) {
            case 0:
                return new defpackage.sk1(this.t, this.u, this.v, this.w, sd0Var, 0);
            case 1:
                return new defpackage.sk1(this.t, this.u, this.v, this.w, sd0Var, 1);
            default:
                return new defpackage.sk1(this.t, this.u, this.v, this.w, sd0Var, 2);
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
        return ((defpackage.sk1) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objC;
        java.lang.Object objC2;
        java.lang.Object objC3;
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.ls2 ls2Var = this.w;
        defpackage.of0 of0Var = defpackage.of0.f;
        defpackage.ls2 ls2Var2 = this.v;
        defpackage.ls2 ls2Var3 = this.u;
        switch (i) {
            case 0:
                int i2 = this.i;
                if (i2 == 0) {
                    defpackage.or1.J(obj);
                    ls2Var3.setValue(java.lang.Boolean.TRUE);
                    ls2Var2.setValue(null);
                    this.i = 1;
                    defpackage.cw0 cw0Var = this.t;
                    cw0Var.getClass();
                    objC = cw0Var.c(defpackage.wv0.f, "热门", "全部", 20, 0, defpackage.cw0.e(), this);
                    if (objC == of0Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                    objC = obj;
                }
                defpackage.vi viVar = (defpackage.vi) objC;
                if (viVar instanceof defpackage.ui) {
                    java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.ui) viVar).a;
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, iterable));
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(defpackage.q8.w0((org.moontechlab.selenetv.model.DoubanMovie) it.next()));
                    }
                    ls2Var.setValue(arrayList);
                    ls2Var2.setValue(null);
                } else if (viVar instanceof defpackage.ti) {
                    java.lang.String str = ((defpackage.ti) viVar).a;
                    ls2Var2.setValue(str);
                    defpackage.q8.C(android.util.Log.e("HomeTab", "加载热门电影失败: " + str));
                } else {
                    defpackage.jc2.o();
                }
                ls2Var3.setValue(java.lang.Boolean.FALSE);
                break;
            case 1:
                int i3 = this.i;
                if (i3 == 0) {
                    defpackage.or1.J(obj);
                    ls2Var3.setValue(java.lang.Boolean.TRUE);
                    ls2Var2.setValue(null);
                    this.i = 1;
                    defpackage.cw0 cw0Var2 = this.t;
                    cw0Var2.getClass();
                    objC2 = cw0Var2.c(defpackage.wv0.i, "show", "show", 20, 0, defpackage.cw0.e(), this);
                    if (objC2 == of0Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                    objC2 = obj;
                }
                defpackage.vi viVar2 = (defpackage.vi) objC2;
                if (viVar2 instanceof defpackage.ui) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) ((defpackage.ui) viVar2).a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, iterable2));
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(defpackage.q8.w0((org.moontechlab.selenetv.model.DoubanMovie) it2.next()));
                    }
                    ls2Var.setValue(arrayList2);
                    ls2Var2.setValue(null);
                } else if (viVar2 instanceof defpackage.ti) {
                    java.lang.String str2 = ((defpackage.ti) viVar2).a;
                    ls2Var2.setValue(str2);
                    defpackage.q8.C(android.util.Log.e("HomeTab", "加载热门综艺失败: " + str2));
                } else {
                    defpackage.jc2.o();
                }
                ls2Var3.setValue(java.lang.Boolean.FALSE);
                break;
            default:
                int i4 = this.i;
                if (i4 == 0) {
                    defpackage.or1.J(obj);
                    ls2Var3.setValue(java.lang.Boolean.TRUE);
                    ls2Var2.setValue(null);
                    this.i = 1;
                    defpackage.cw0 cw0Var3 = this.t;
                    cw0Var3.getClass();
                    objC3 = cw0Var3.c(defpackage.wv0.i, "最近热门", "tv", 20, 0, defpackage.cw0.e(), this);
                    if (objC3 == of0Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                    objC3 = obj;
                }
                defpackage.vi viVar3 = (defpackage.vi) objC3;
                if (viVar3 instanceof defpackage.ui) {
                    java.lang.Iterable iterable3 = (java.lang.Iterable) ((defpackage.ui) viVar3).a;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.z30.g0(10, iterable3));
                    java.util.Iterator it3 = iterable3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(defpackage.q8.w0((org.moontechlab.selenetv.model.DoubanMovie) it3.next()));
                    }
                    ls2Var.setValue(arrayList3);
                    ls2Var2.setValue(null);
                } else if (viVar3 instanceof defpackage.ti) {
                    java.lang.String str3 = ((defpackage.ti) viVar3).a;
                    ls2Var2.setValue(str3);
                    defpackage.q8.C(android.util.Log.e("HomeTab", "加载热门剧集失败: " + str3));
                } else {
                    defpackage.jc2.o();
                }
                ls2Var3.setValue(java.lang.Boolean.FALSE);
                break;
        }
        return null;
    }
}
