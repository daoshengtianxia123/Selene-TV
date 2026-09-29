package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class af2 extends defpackage.te1 implements defpackage.jd1 {
    public final /* synthetic */ java.util.List f;
    public final /* synthetic */ defpackage.nf0 i;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ defpackage.x33 x;
    public final /* synthetic */ defpackage.iv3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(java.util.List list, defpackage.nf0 nf0Var, float f, float f2, float f3, float f4, defpackage.x33 x33Var, defpackage.iv3 iv3Var) {
        super(1, defpackage.bt1.class, "handleVerticalScroll", "LiveTab$handleVerticalScroll(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;FFFFLandroidx/compose/runtime/MutableIntState;Landroidx/compose/foundation/ScrollState;I)V", 0);
        this.f = list;
        this.i = nf0Var;
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.w = f4;
        this.x = x33Var;
        this.y = iv3Var;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        if (iIntValue >= 0 && iIntValue < this.f.size()) {
            float fJ = this.t + this.x.j();
            float f = this.u;
            int i = (int) (((f / 2.0f) + (((this.v + f) * iIntValue) + fJ)) - (this.w / 2.0f));
            if (i < 0) {
                i = 0;
            }
            defpackage.u22.C(this.i, null, new defpackage.u61(this.y, i, null, 1), 3);
        }
        return defpackage.as4.a;
    }
}
