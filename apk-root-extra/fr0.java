package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class fr0 implements defpackage.yd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long i;

    public /* synthetic */ fr0(long j, int i) {
        this.f = i;
        this.i = j;
    }

    @Override // defpackage.yd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.qo2 qo2Var = defpackage.qo2.f;
        switch (i) {
            case 0:
                defpackage.k80 k80Var = (defpackage.k80) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                ((defpackage.jt) obj).getClass();
                if (!k80Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    k80Var.V();
                    break;
                } else {
                    defpackage.to2 to2VarF = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.d.b, 24.0f, 0.0f, 2);
                    defpackage.ts3 ts3VarA = defpackage.ss3.a(new defpackage.yj(8.0f, new defpackage.qj(1)), defpackage.d6.C, k80Var, 54);
                    long j = k80Var.T;
                    int i2 = (int) (j ^ (j >>> 32));
                    defpackage.y53 y53VarL = k80Var.l();
                    defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarF);
                    defpackage.w70.b.getClass();
                    defpackage.j90 j90Var = defpackage.v70.b;
                    k80Var.f0();
                    if (k80Var.S) {
                        k80Var.k(j90Var);
                    } else {
                        k80Var.o0();
                    }
                    defpackage.ht1.J(k80Var, defpackage.v70.f, ts3VarA);
                    defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
                    defpackage.qf qfVar = defpackage.v70.g;
                    if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i2))) {
                        defpackage.ms1.G(i2, k80Var, i2, qfVar);
                    }
                    defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
                    defpackage.lr0.e(androidx.compose.foundation.layout.d.i(qo2Var, 18.0f), 0L, k80Var, 6, 2);
                    defpackage.ii4.a("正在加载播放源", null, this.i, defpackage.nq1.A(15), defpackage.jc1.t, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var, 199686, 0, 131026);
                    k80Var.p(true);
                    break;
                }
                break;
            default:
                defpackage.k80 k80Var2 = (defpackage.k80) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.jt) obj).getClass();
                if (!k80Var2.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    k80Var2.V();
                    break;
                } else {
                    defpackage.to2 to2VarF2 = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.d.e(qo2Var, 42.0f), 28.0f, 0.0f, 2);
                    defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
                    long j2 = k80Var2.T;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    defpackage.y53 y53VarL2 = k80Var2.l();
                    defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarF2);
                    defpackage.w70.b.getClass();
                    defpackage.j90 j90Var2 = defpackage.v70.b;
                    k80Var2.f0();
                    if (k80Var2.S) {
                        k80Var2.k(j90Var2);
                    } else {
                        k80Var2.o0();
                    }
                    defpackage.ht1.J(k80Var2, defpackage.v70.f, fk2VarD);
                    defpackage.ht1.J(k80Var2, defpackage.v70.e, y53VarL2);
                    defpackage.qf qfVar2 = defpackage.v70.g;
                    if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i3))) {
                        defpackage.ms1.G(i3, k80Var2, i3, qfVar2);
                    }
                    defpackage.ht1.J(k80Var2, defpackage.v70.d, to2VarD2);
                    defpackage.ii4.a("搜索", null, this.i, defpackage.nq1.A(14), defpackage.jc1.t, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var2, 199686, 0, 131026);
                    k80Var2.p(true);
                    break;
                }
                break;
        }
        return as4Var;
    }
}
