package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class lx3 extends defpackage.te1 implements defpackage.jd1 {
    public final /* synthetic */ java.util.List f;
    public final /* synthetic */ defpackage.nf0 i;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;
    public final /* synthetic */ defpackage.yo0 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;
    public final /* synthetic */ defpackage.iv3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx3(java.util.List list, defpackage.nf0 nf0Var, float f, float f2, defpackage.yo0 yo0Var, float f3, float f4, float f5, defpackage.iv3 iv3Var) {
        super(1, defpackage.bt1.class, "handleVerticalScroll", "SearchTab$handleVerticalScroll(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;FFLandroidx/compose/ui/unit/Density;FFFLandroidx/compose/foundation/ScrollState;I)V", 0);
        this.f = list;
        this.i = nf0Var;
        this.t = f;
        this.u = f2;
        this.v = yo0Var;
        this.w = f3;
        this.x = f4;
        this.y = f5;
        this.z = iv3Var;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        if (iIntValue >= 0 && iIntValue < this.f.size()) {
            float fB = (this.v.b() * 24.0f) + this.t + this.u;
            float f = this.w;
            int i = (int) (((f / 2.0f) + (((this.x + f) * iIntValue) + fB)) - (this.y / 2.0f));
            if (i < 0) {
                i = 0;
            }
            defpackage.u22.C(this.i, null, new defpackage.u61(this.z, i, null, 3), 3);
        }
        return defpackage.as4.a;
    }
}
