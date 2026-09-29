package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae2 extends defpackage.te1 implements defpackage.jd1 {
    public final /* synthetic */ defpackage.yv4 f;
    public final /* synthetic */ defpackage.ls2 i;
    public final /* synthetic */ defpackage.ls2 t;
    public final /* synthetic */ defpackage.ls2 u;
    public final /* synthetic */ defpackage.ls2 v;
    public final /* synthetic */ defpackage.x33 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae2(defpackage.yv4 yv4Var, defpackage.ls2 ls2Var, defpackage.ls2 ls2Var2, defpackage.ls2 ls2Var3, defpackage.ls2 ls2Var4, defpackage.x33 x33Var) {
        super(1, defpackage.bt1.class, "pickChannel", "LivePlayerScreen$pickChannel(Lorg/moontechlab/selenetv/screen/player/VideoPlayer;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lorg/moontechlab/selenetv/model/LiveChannel;)V", 0);
        this.f = yv4Var;
        this.i = ls2Var;
        this.t = ls2Var2;
        this.u = ls2Var3;
        this.v = ls2Var4;
        this.w = x33Var;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.zc2 zc2Var = (defpackage.zc2) obj;
        zc2Var.getClass();
        this.i.setValue(zc2Var);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.t.setValue(bool);
        this.f.g(0L, zc2Var.f);
        this.u.setValue(bool);
        defpackage.fe2.d(this.v, true);
        defpackage.x33 x33Var = this.w;
        x33Var.k(x33Var.j() + 1);
        return defpackage.as4.a;
    }
}
