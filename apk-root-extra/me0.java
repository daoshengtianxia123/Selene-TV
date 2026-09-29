package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class me0 implements defpackage.s81 {
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object t;
    public final /* synthetic */ java.lang.Object u;
    public final /* synthetic */ java.lang.Object v;

    public /* synthetic */ me0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.f = i;
        this.i = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    @Override // defpackage.s81
    public final java.lang.Object emit(java.lang.Object obj, defpackage.sd0 sd0Var) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        java.lang.Object obj2 = this.v;
        java.lang.Object obj3 = this.u;
        java.lang.Object obj4 = this.t;
        java.lang.Object obj5 = this.i;
        switch (i) {
            case 0:
                defpackage.nh4 nh4Var = (defpackage.nh4) obj3;
                defpackage.va2 va2Var = (defpackage.va2) obj5;
                if (((java.lang.Boolean) obj).booleanValue() && va2Var.b()) {
                    defpackage.om2.W0((defpackage.ai4) obj4, va2Var, nh4Var.m(), (defpackage.qo1) obj2, nh4Var.b);
                } else {
                    defpackage.om2.S(va2Var);
                }
                return as4Var;
            case 1:
                defpackage.cs1 cs1Var = (defpackage.cs1) obj;
                defpackage.wm3 wm3Var = (defpackage.wm3) obj3;
                defpackage.wm3 wm3Var2 = (defpackage.wm3) obj4;
                defpackage.wm3 wm3Var3 = (defpackage.wm3) obj5;
                boolean z = true;
                if (cs1Var instanceof defpackage.yd3) {
                    wm3Var3.f++;
                } else if ((cs1Var instanceof defpackage.zd3) || (cs1Var instanceof defpackage.xd3)) {
                    wm3Var3.f--;
                } else if (cs1Var instanceof defpackage.cl1) {
                    wm3Var2.f++;
                } else if (cs1Var instanceof defpackage.dl1) {
                    wm3Var2.f--;
                } else if (cs1Var instanceof defpackage.ga1) {
                    wm3Var.f++;
                } else if (cs1Var instanceof defpackage.ha1) {
                    wm3Var.f--;
                }
                boolean z2 = false;
                boolean z3 = wm3Var3.f > 0;
                boolean z4 = wm3Var2.f > 0;
                boolean z5 = wm3Var.f > 0;
                defpackage.wk0 wk0Var = (defpackage.wk0) obj2;
                if (wk0Var.G != z3) {
                    wk0Var.G = z3;
                    z2 = true;
                }
                if (wk0Var.H != z4) {
                    wk0Var.H = z4;
                    z2 = true;
                }
                if (wk0Var.I != z5) {
                    wk0Var.I = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    defpackage.ct1.A(wk0Var);
                }
                return as4Var;
            default:
                defpackage.jw3 jw3Var = (defpackage.jw3) obj;
                defpackage.ls2 ls2Var = (defpackage.ls2) obj5;
                if (jw3Var instanceof defpackage.iw3) {
                    defpackage.uw3 uw3Var = defpackage.uw3.a;
                    java.util.ArrayList arrayListH = defpackage.uw3.h(defpackage.y30.L0((java.util.List) ls2Var.getValue(), ((defpackage.iw3) jw3Var).a));
                    ls2Var.setValue(arrayListH);
                    ((defpackage.ls2) obj4).setValue(defpackage.da1.i(arrayListH));
                    return as4Var;
                }
                if (jw3Var instanceof defpackage.hw3) {
                    ((defpackage.ls2) obj3).setValue(((defpackage.hw3) jw3Var).a);
                    return as4Var;
                }
                if (jw3Var instanceof defpackage.gw3) {
                    defpackage.q8.C(android.util.Log.e("SearchTab", "搜索错误: ".concat(((defpackage.gw3) jw3Var).a)));
                    return as4Var;
                }
                if (jw3Var instanceof defpackage.fw3) {
                    ((defpackage.ls2) obj2).setValue(java.lang.Boolean.FALSE);
                    return as4Var;
                }
                defpackage.jc2.o();
                return null;
        }
    }
}
