package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class ke2 implements defpackage.xd1 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ defpackage.ta1 t;
    public final /* synthetic */ defpackage.ta1 u;
    public final /* synthetic */ defpackage.hd1 v;
    public final /* synthetic */ java.util.List w;
    public final /* synthetic */ java.lang.String x;
    public final /* synthetic */ defpackage.jd1 y;
    public final /* synthetic */ defpackage.ta1 z;

    public /* synthetic */ ke2(defpackage.ta1 ta1Var, boolean z, defpackage.ta1 ta1Var2, defpackage.hd1 hd1Var, java.util.List list, java.lang.String str, defpackage.jd1 jd1Var, defpackage.ta1 ta1Var3) {
        this.t = ta1Var;
        this.i = z;
        this.u = ta1Var2;
        this.v = hd1Var;
        this.w = list;
        this.x = str;
        this.y = jd1Var;
        this.z = ta1Var3;
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.cj cjVar = defpackage.z70.a;
        defpackage.to2 to2VarA = defpackage.qo2.f;
        defpackage.hd1 hd1Var = this.v;
        defpackage.ta1 ta1Var = this.u;
        defpackage.ta1 ta1Var2 = this.t;
        boolean z = this.i;
        switch (i) {
            case 0:
                defpackage.k80 k80Var = (defpackage.k80) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (!k80Var.S(1 & iIntValue, (iIntValue & 3) != 2)) {
                    k80Var.V();
                    break;
                } else {
                    defpackage.to2 to2VarA2 = androidx.compose.ui.focus.a.a(to2VarA, ta1Var2);
                    boolean zG = k80Var.g(z) | k80Var.f(ta1Var) | k80Var.f(hd1Var);
                    java.lang.Object objP = k80Var.P();
                    if (zG || objP == cjVar) {
                        objP = new defpackage.xe2(z, ta1Var, hd1Var, 0);
                        k80Var.l0(objP);
                    }
                    defpackage.pp4.d(this.w, this.x, this.y, androidx.compose.ui.input.key.a.b(to2VarA2, (defpackage.jd1) objP), this.z, k80Var, 0);
                    break;
                }
            default:
                defpackage.k80 k80Var2 = (defpackage.k80) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (!k80Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k80Var2.V();
                    break;
                } else {
                    if (!z) {
                        to2VarA = androidx.compose.ui.focus.a.a(to2VarA, ta1Var2);
                    }
                    boolean zG2 = k80Var2.g(z) | k80Var2.f(ta1Var) | k80Var2.f(hd1Var);
                    java.lang.Object objP2 = k80Var2.P();
                    if (zG2 || objP2 == cjVar) {
                        objP2 = new defpackage.xe2(z, ta1Var, hd1Var, 1);
                        k80Var2.l0(objP2);
                    }
                    defpackage.pp4.d(this.w, this.x, this.y, androidx.compose.ui.input.key.a.b(to2VarA, (defpackage.jd1) objP2), this.z, k80Var2, 0);
                    break;
                }
        }
        return as4Var;
    }

    public /* synthetic */ ke2(boolean z, defpackage.ta1 ta1Var, defpackage.ta1 ta1Var2, defpackage.hd1 hd1Var, java.util.List list, java.lang.String str, defpackage.jd1 jd1Var, defpackage.ta1 ta1Var3) {
        this.i = z;
        this.t = ta1Var;
        this.u = ta1Var2;
        this.v = hd1Var;
        this.w = list;
        this.x = str;
        this.y = jd1Var;
        this.z = ta1Var3;
    }
}
