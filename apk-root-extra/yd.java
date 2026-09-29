package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class yd extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public int i;
    public /* synthetic */ java.lang.Object t;
    public final /* synthetic */ java.lang.Object u;
    public final /* synthetic */ java.lang.Object v;
    public final /* synthetic */ java.lang.Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(defpackage.rp rpVar, defpackage.ls2 ls2Var, defpackage.ls2 ls2Var2, defpackage.ls2 ls2Var3, defpackage.sd0 sd0Var) {
        super(2, sd0Var);
        this.f = 5;
        this.t = rpVar;
        this.v = ls2Var;
        this.w = ls2Var2;
        this.u = ls2Var3;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        int i = this.f;
        java.lang.Object obj2 = this.w;
        java.lang.Object obj3 = this.v;
        java.lang.Object obj4 = this.u;
        switch (i) {
            case 0:
                return new defpackage.yd(this.t, (defpackage.wd) obj4, (defpackage.ls2) obj3, (defpackage.ls2) obj2, sd0Var, 0);
            case 1:
                defpackage.yd ydVar = new defpackage.yd((defpackage.ad0) obj4, (defpackage.qs4) obj3, (defpackage.bu) obj2, sd0Var, 1);
                ydVar.t = obj;
                return ydVar;
            case 2:
                defpackage.yd ydVar2 = new defpackage.yd((defpackage.r81) obj4, (defpackage.o94) obj3, (java.lang.Float) obj2, sd0Var, 2);
                ydVar2.t = obj;
                return ydVar2;
            case 3:
                return new defpackage.yd((defpackage.k94) this.t, (defpackage.r81) obj4, (defpackage.o94) obj3, (java.lang.Float) obj2, sd0Var, 3);
            case 4:
                return new defpackage.yd((defpackage.hd1) this.t, (defpackage.ta1) obj4, (defpackage.ls2) obj3, (defpackage.ls2) obj2, sd0Var, 4);
            case 5:
                return new defpackage.yd((defpackage.rp) this.t, (defpackage.ls2) obj3, (defpackage.ls2) obj2, (defpackage.ls2) obj4, sd0Var);
            case 6:
                defpackage.yd ydVar3 = new defpackage.yd((defpackage.dy3) obj4, (defpackage.yt2) obj3, (defpackage.rm4) obj2, sd0Var, 6);
                ydVar3.t = obj;
                return ydVar3;
            default:
                return new defpackage.yd((java.lang.String) this.t, (defpackage.jd1) obj4, (defpackage.ls2) obj3, (defpackage.ls2) obj2, sd0Var, 7);
        }
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        switch (i) {
        }
        return ((defpackage.yd) create((defpackage.nf0) obj, (defpackage.sd0) obj2)).invokeSuspend(as4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objD;
        java.lang.Object objA;
        int i = this.f;
        boolean z = false;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        int i2 = 2;
        java.lang.Object obj2 = defpackage.as4.a;
        java.lang.Object obj3 = defpackage.of0.f;
        java.lang.Object obj4 = this.v;
        java.lang.Object obj5 = this.w;
        java.lang.Object obj6 = this.u;
        java.util.concurrent.CancellationException cancellationException = null;
        switch (i) {
            case 0:
                defpackage.wd wdVar = (defpackage.wd) obj6;
                int i3 = this.i;
                if (i3 == 0) {
                    defpackage.or1.J(obj);
                    if (defpackage.ct1.g(this.t, wdVar.e.getValue())) {
                        return obj2;
                    }
                    java.lang.Object obj7 = this.t;
                    defpackage.j84 j84Var = defpackage.ae.a;
                    defpackage.yf yfVar = (defpackage.yf) ((defpackage.ls2) obj4).getValue();
                    this.i = 1;
                    if (defpackage.wd.c((defpackage.wd) obj6, obj7, yfVar, null, this, 12) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.or1.J(obj);
                }
                defpackage.j84 j84Var2 = defpackage.ae.a;
                defpackage.jd1 jd1Var = (defpackage.jd1) ((defpackage.ls2) obj5).getValue();
                if (jd1Var == null) {
                    return obj2;
                }
                jd1Var.invoke(wdVar.d());
                return obj2;
            case 1:
                defpackage.ad0 ad0Var = (defpackage.ad0) obj6;
                defpackage.st stVar = ad0Var.I;
                int i4 = this.i;
                try {
                    try {
                        if (i4 == 0) {
                            defpackage.or1.J(obj);
                            defpackage.ov1 ov1VarX = defpackage.nq1.x(((defpackage.nf0) this.t).getCoroutineContext());
                            ad0Var.N = true;
                            defpackage.bw3 bw3Var = ad0Var.G;
                            defpackage.qs2 qs2Var = defpackage.qs2.f;
                            defpackage.zc0 zc0Var = new defpackage.zc0((defpackage.qs4) obj4, ad0Var, (defpackage.bu) obj5, ov1VarX, (defpackage.sd0) null, 0);
                            this.i = 1;
                            if (bw3Var.f(qs2Var, zc0Var, this) == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i4 != 1) {
                                defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.or1.J(obj);
                        }
                        stVar.b();
                        return obj2;
                    } catch (java.util.concurrent.CancellationException e) {
                        cancellationException = e;
                        throw cancellationException;
                    }
                } finally {
                    ad0Var.N = false;
                    stVar.a(cancellationException);
                    ad0Var.K = false;
                }
            case 2:
                defpackage.o94 o94Var = (defpackage.o94) obj4;
                int i5 = this.i;
                if (i5 != 0) {
                    if (i5 == 1) {
                        defpackage.or1.J(obj);
                        return obj2;
                    }
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.or1.J(obj);
                int iOrdinal = ((defpackage.l24) this.t).ordinal();
                if (iOrdinal == 0) {
                    this.i = 1;
                    return ((defpackage.r81) obj6).collect(o94Var, this) == obj3 ? obj3 : obj2;
                }
                if (iOrdinal != 2) {
                    return obj2;
                }
                java.lang.Float f = (java.lang.Float) obj5;
                if (f == defpackage.uj2.q) {
                    throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                o94Var.h(null, f);
                return obj2;
            case 3:
                defpackage.r81 r81Var = (defpackage.r81) obj6;
                defpackage.o94 o94Var2 = (defpackage.o94) obj4;
                int i6 = this.i;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            defpackage.or1.J(obj);
                        } else if (i6 != 3 && i6 != 4) {
                            defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    defpackage.or1.J(obj);
                    return obj2;
                }
                defpackage.or1.J(obj);
                defpackage.k94 k94Var = (defpackage.k94) this.t;
                if (k94Var == defpackage.m24.a) {
                    this.i = 1;
                    if (r81Var.collect(o94Var2, this) != obj3) {
                        return obj2;
                    }
                } else if (k94Var == defpackage.m24.b) {
                    defpackage.xb4 xb4VarF = o94Var2.f();
                    defpackage.j91 j91Var = new defpackage.j91(objArr == true ? 1 : 0);
                    this.i = 2;
                    if (defpackage.ft4.m0(xb4VarF, j91Var, this) != obj3) {
                    }
                } else {
                    defpackage.xb4 xb4VarF2 = o94Var2.f();
                    defpackage.j94 j94Var = new defpackage.j94(k94Var, null);
                    int i7 = defpackage.c91.a;
                    defpackage.r81 r81VarH0 = defpackage.ft4.h0(defpackage.ft4.h0(new defpackage.z81(new defpackage.o00(j94Var, xb4VarF2, defpackage.k01.f, -2, defpackage.nu.f), new defpackage.nl3(2, null, 1))));
                    defpackage.yd ydVar = new defpackage.yd(r81Var, o94Var2, (java.lang.Float) obj5, (defpackage.sd0) null, 2);
                    this.i = 4;
                    if (defpackage.ft4.c0(r81VarH0, ydVar, this) != obj3) {
                        return obj2;
                    }
                }
                return obj3;
                this.i = 3;
                if (r81Var.collect(o94Var2, this) != obj3) {
                    return obj2;
                }
                return obj3;
            case 4:
                defpackage.ls2 ls2Var = (defpackage.ls2) obj5;
                int i8 = this.i;
                if (i8 == 0) {
                    defpackage.or1.J(obj);
                    if (((defpackage.qd2) ((defpackage.ls2) obj4).getValue()) != null) {
                        ls2Var.setValue(java.lang.Boolean.TRUE);
                        return obj2;
                    }
                    if (!((java.lang.Boolean) ls2Var.getValue()).booleanValue()) {
                        return obj2;
                    }
                    ls2Var.setValue(java.lang.Boolean.FALSE);
                    this.i = 1;
                    if (defpackage.q8.M(300L, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i8 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.or1.J(obj);
                }
                try {
                    try {
                        ((defpackage.hd1) this.t).invoke();
                        return obj2;
                    } catch (java.lang.Exception unused) {
                        return obj2;
                    }
                } catch (java.lang.Exception unused2) {
                    defpackage.ta1.b((defpackage.ta1) obj6);
                    return obj2;
                }
            case 5:
                defpackage.ls2 ls2Var2 = (defpackage.ls2) obj4;
                defpackage.ls2 ls2Var3 = (defpackage.ls2) obj5;
                int i9 = this.i;
                if (i9 == 0) {
                    defpackage.or1.J(obj);
                    ls2Var2.setValue(java.lang.Boolean.TRUE);
                    ls2Var3.setValue(null);
                    defpackage.rp rpVar = (defpackage.rp) this.t;
                    this.i = 1;
                    rpVar.getClass();
                    objD = rpVar.d(java.util.Calendar.getInstance().get(7) != 1 ? r1.get(7) - 1 : 7, this);
                    if (objD == obj3) {
                        return obj3;
                    }
                } else {
                    if (i9 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.or1.J(obj);
                    objD = obj;
                }
                defpackage.vi viVar = (defpackage.vi) objD;
                if (viVar instanceof defpackage.ui) {
                    defpackage.ls2 ls2Var4 = (defpackage.ls2) obj6;
                    java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.ui) viVar).a;
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, iterable));
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(defpackage.pp4.c0((org.moontechlab.selenetv.model.BangumiItem) it.next()));
                    }
                    ls2Var4.setValue(arrayList);
                    ls2Var3.setValue(null);
                } else {
                    if (!(viVar instanceof defpackage.ti)) {
                        defpackage.jc2.o();
                        return null;
                    }
                    java.lang.String str = ((defpackage.ti) viVar).a;
                    ls2Var3.setValue(str);
                    defpackage.q8.C(android.util.Log.e("HomeTab", "加载新番放送失败: " + str));
                }
                ls2Var2.setValue(java.lang.Boolean.FALSE);
                return obj2;
            case 6:
                defpackage.yt2 yt2Var = (defpackage.yt2) obj4;
                defpackage.dy3 dy3Var = (defpackage.dy3) obj6;
                int i10 = this.i;
                if (i10 != 0) {
                    if (i10 == 1 || i10 == 2) {
                        defpackage.or1.J(obj);
                        return obj2;
                    }
                    defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.or1.J(obj);
                defpackage.nf0 nf0Var = (defpackage.nf0) this.t;
                defpackage.a43 a43Var = dy3Var.c;
                defpackage.w33 w33Var = dy3Var.h;
                if (defpackage.ct1.g(a43Var.getValue(), yt2Var)) {
                    long jLongValue = ((java.lang.Number) ((defpackage.rm4) obj5).l.getValue()).longValue() / 1000000;
                    float fJ = w33Var.j();
                    defpackage.mo4 mo4VarX0 = defpackage.q8.x0((int) (w33Var.j() * jLongValue), 6, null);
                    defpackage.t8 t8Var = new defpackage.t8(i2, nf0Var, dy3Var, yt2Var);
                    this.i = 2;
                    if (defpackage.ss1.l(fJ, 0.0f, mo4VarX0, t8Var, this, 4) != obj3) {
                        return obj2;
                    }
                } else {
                    this.i = 1;
                    defpackage.rm4 rm4Var = dy3Var.e;
                    if (rm4Var == null || (objA = defpackage.xs2.a(dy3Var.k, new defpackage.xx3(rm4Var, dy3Var, yt2Var, (defpackage.sd0) null), this)) != obj3) {
                        objA = obj2;
                    }
                    if (objA != obj3) {
                        return obj2;
                    }
                }
                return obj3;
            default:
                java.lang.String str2 = (java.lang.String) this.t;
                defpackage.ls2 ls2Var5 = (defpackage.ls2) obj5;
                defpackage.ls2 ls2Var6 = (defpackage.ls2) obj4;
                int i11 = this.i;
                if (i11 == 0) {
                    defpackage.or1.J(obj);
                    if (((java.lang.String) ls2Var6.getValue()) == null || defpackage.ct1.g((java.lang.String) ls2Var6.getValue(), str2)) {
                        ls2Var5.setValue(java.lang.Boolean.FALSE);
                        return obj2;
                    }
                    ls2Var5.setValue(java.lang.Boolean.TRUE);
                    this.i = 1;
                    if (defpackage.q8.M(600L, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i11 != 1) {
                        defpackage.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.or1.J(obj);
                }
                if (((java.lang.String) ls2Var6.getValue()) != null && !defpackage.ct1.g((java.lang.String) ls2Var6.getValue(), str2)) {
                    java.lang.String str3 = (java.lang.String) ls2Var6.getValue();
                    str3.getClass();
                    ((defpackage.jd1) obj6).invoke(str3);
                }
                ls2Var5.setValue(java.lang.Boolean.FALSE);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
    }
}
