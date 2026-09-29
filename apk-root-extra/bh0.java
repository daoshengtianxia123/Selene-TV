package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class bh0 extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public int i;
    public final /* synthetic */ defpackage.ls2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(int i, defpackage.ls2 ls2Var, defpackage.sd0 sd0Var) {
        super(2, sd0Var);
        this.f = 0;
        this.i = i;
        this.t = ls2Var;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        int i = this.f;
        defpackage.ls2 ls2Var = this.t;
        switch (i) {
            case 0:
                return new defpackage.bh0(this.i, ls2Var, sd0Var);
            case 1:
                return new defpackage.bh0(ls2Var, sd0Var, 1);
            case 2:
                return new defpackage.bh0(ls2Var, sd0Var, 2);
            case 3:
                return new defpackage.bh0(ls2Var, sd0Var, 3);
            case 4:
                return new defpackage.bh0(ls2Var, sd0Var, 4);
            case 5:
                return new defpackage.bh0(ls2Var, sd0Var, 5);
            default:
                return new defpackage.bh0(ls2Var, sd0Var, 6);
        }
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.nf0 nf0Var = (defpackage.nf0) obj;
        defpackage.sd0 sd0Var = (defpackage.sd0) obj2;
        switch (i) {
            case 0:
                ((defpackage.bh0) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
                break;
        }
        return ((defpackage.bh0) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.si0 si0Var;
        defpackage.hh0 hh0Var;
        java.lang.Object objQ;
        java.lang.Object objQ2;
        java.lang.Object objQ3;
        java.lang.Object objQ4;
        int i = this.f;
        int i2 = 2;
        defpackage.of0 of0Var = defpackage.of0.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.ls2 ls2Var = this.t;
        defpackage.sd0 sd0Var = null;
        switch (i) {
            case 0:
                defpackage.or1.J(obj);
                if (this.i > 0 && (si0Var = (defpackage.si0) ls2Var.getValue()) != null && (hh0Var = si0Var.i) != null) {
                    hh0Var.b(new defpackage.ic(6, si0Var));
                    hh0Var.b(new defpackage.eh0(hh0Var, 1));
                    break;
                }
                break;
            case 1:
                int i3 = this.i;
                try {
                    if (i3 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var = defpackage.cv0.d;
                        defpackage.yc ycVar = new defpackage.yc(i2, sd0Var, 13);
                        this.i = 1;
                        objQ = defpackage.u22.Q(vl0Var, ycVar, this);
                        if (objQ == of0Var) {
                            break;
                        }
                    } else if (i3 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                        objQ = obj;
                    }
                    ls2Var.setValue(defpackage.tt0.a((defpackage.tt0) ls2Var.getValue(), null, null, false, null, null, null, null, (java.util.Map) objQ, null, false, null, null, null, false, 65023));
                } catch (java.lang.Exception e) {
                    android.util.Log.w("DetailScreen", "播放记录加载失败", e);
                }
                break;
            case 2:
                int i4 = this.i;
                try {
                    if (i4 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var2 = defpackage.cv0.d;
                        defpackage.yc ycVar2 = new defpackage.yc(i2, sd0Var, 14);
                        this.i = 1;
                        objQ2 = defpackage.u22.Q(vl0Var2, ycVar2, this);
                        if (objQ2 == of0Var) {
                            break;
                        }
                    } else if (i4 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                        objQ2 = obj;
                    }
                    java.util.List<org.moontechlab.selenetv.model.FavoriteItem> list = (java.util.List) objQ2;
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, list));
                    for (org.moontechlab.selenetv.model.FavoriteItem favoriteItem : list) {
                        arrayList.add(favoriteItem.b + "+" + favoriteItem.a);
                    }
                    ls2Var.setValue(defpackage.tt0.a((defpackage.tt0) ls2Var.getValue(), null, null, false, null, null, null, null, null, defpackage.y30.f1(arrayList), false, null, null, null, false, 64511));
                } catch (java.lang.Exception e2) {
                    android.util.Log.w("DetailScreen", "收藏列表加载失败", e2);
                }
                break;
            case 3:
                int i5 = this.i;
                if (i5 == 0) {
                    defpackage.or1.J(obj);
                    int i6 = defpackage.fe2.b;
                    if (((java.lang.Boolean) ls2Var.getValue()).booleanValue()) {
                        this.i = 1;
                        if (defpackage.q8.M(2000L, this) == of0Var) {
                        }
                    }
                    break;
                } else if (i5 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                }
                int i7 = defpackage.fe2.b;
                ls2Var.setValue(java.lang.Boolean.FALSE);
                break;
            case 4:
                int i8 = this.i;
                if (i8 == 0) {
                    defpackage.or1.J(obj);
                    if (((java.lang.Boolean) ls2Var.getValue()).booleanValue()) {
                        this.i = 1;
                        if (defpackage.q8.M(2000L, this) == of0Var) {
                        }
                    }
                    break;
                } else if (i8 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                }
                ls2Var.setValue(java.lang.Boolean.FALSE);
                break;
            case 5:
                int i9 = this.i;
                try {
                    if (i9 == 0) {
                        defpackage.or1.J(obj);
                        defpackage.vl0 vl0Var3 = defpackage.cv0.d;
                        defpackage.yc ycVar3 = new defpackage.yc(i2, sd0Var, 18);
                        this.i = 1;
                        objQ3 = defpackage.u22.Q(vl0Var3, ycVar3, this);
                        if (objQ3 == of0Var) {
                            break;
                        }
                    } else if (i9 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        defpackage.or1.J(obj);
                        objQ3 = obj;
                    }
                    ls2Var.setValue((java.util.List) objQ3);
                } catch (java.lang.Exception e3) {
                    android.util.Log.e("SearchTab", "加载搜索历史失败: " + e3.getMessage());
                }
                break;
            default:
                int i10 = this.i;
                if (i10 == 0) {
                    defpackage.or1.J(obj);
                    defpackage.vw1 vw1Var = defpackage.ac4.a;
                    this.i = 1;
                    objQ4 = defpackage.u22.Q(defpackage.cv0.d, new defpackage.o9(i2, sd0Var), this);
                    if (objQ4 == of0Var) {
                    }
                } else if (i10 != 1) {
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.or1.J(obj);
                    objQ4 = obj;
                }
                boolean zBooleanValue = ((java.lang.Boolean) objQ4).booleanValue();
                int i11 = defpackage.t14.k;
                ls2Var.setValue(java.lang.Boolean.FALSE);
                defpackage.a43 a43Var = defpackage.gp2.a;
                defpackage.gp2.a(zBooleanValue ? "订阅已刷新" : "订阅刷新失败");
                break;
        }
        return as4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(defpackage.ls2 ls2Var, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.t = ls2Var;
    }
}
