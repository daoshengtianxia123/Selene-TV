package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class qa implements defpackage.a83 {
    public defpackage.pa2 a;
    public defpackage.w84 b;
    public defpackage.wa2 c;
    public defpackage.j24 d;

    @Override // defpackage.a83
    public final void a(defpackage.th4 th4Var, defpackage.qo1 qo1Var, defpackage.de0 de0Var, defpackage.le0 le0Var) {
        j(new defpackage.ma(th4Var, this, qo1Var, de0Var, le0Var, 0));
    }

    @Override // defpackage.a83
    public final void b() {
        j(null);
    }

    @Override // defpackage.a83
    public final void c() {
        defpackage.j64 j64Var;
        defpackage.pa2 pa2Var = this.a;
        if (pa2Var == null || (j64Var = (defpackage.j64) defpackage.pp4.x(pa2Var, defpackage.k90.p)) == null) {
            return;
        }
        ((defpackage.qo0) j64Var).b();
    }

    @Override // defpackage.a83
    public final void d() {
        defpackage.w84 w84Var = this.b;
        if (w84Var != null) {
            w84Var.cancel((java.util.concurrent.CancellationException) null);
        }
        this.b = null;
        defpackage.is2 is2VarI = i();
        if (is2VarI != null) {
            defpackage.j24 j24Var = (defpackage.j24) is2VarI;
            synchronized (j24Var) {
                j24Var.s(j24Var.m() + j24Var.B, j24Var.A, j24Var.m() + j24Var.B, j24Var.m() + j24Var.B + j24Var.C);
            }
        }
    }

    @Override // defpackage.a83
    public final void e(defpackage.th4 th4Var, defpackage.th4 th4Var2) {
        defpackage.wa2 wa2Var = this.c;
        if (wa2Var != null) {
            boolean z = (defpackage.xi4.b(wa2Var.h.b, th4Var2.b) && defpackage.ct1.g(wa2Var.h.c, th4Var2.c)) ? false : true;
            wa2Var.h = th4Var2;
            int size = wa2Var.j.size();
            for (int i = 0; i < size; i++) {
                defpackage.sl3 sl3Var = (defpackage.sl3) ((java.lang.ref.WeakReference) wa2Var.j.get(i)).get();
                if (sl3Var != null) {
                    sl3Var.g = th4Var2;
                }
            }
            defpackage.qa2 qa2Var = wa2Var.m;
            synchronized (qa2Var.c) {
                qa2Var.j = null;
                qa2Var.l = null;
                qa2Var.k = null;
                qa2Var.m = null;
                qa2Var.n = null;
            }
            if (defpackage.ct1.g(th4Var, th4Var2)) {
                if (z) {
                    defpackage.sq1 sq1Var = wa2Var.b;
                    int iF = defpackage.xi4.f(th4Var2.b);
                    int iE = defpackage.xi4.e(th4Var2.b);
                    defpackage.xi4 xi4Var = wa2Var.h.c;
                    int iF2 = xi4Var != null ? defpackage.xi4.f(xi4Var.a) : -1;
                    defpackage.xi4 xi4Var2 = wa2Var.h.c;
                    sq1Var.M0().updateSelection((android.view.View) sq1Var.i, iF, iE, iF2, xi4Var2 != null ? defpackage.xi4.e(xi4Var2.a) : -1);
                    return;
                }
                return;
            }
            if (th4Var != null && (!defpackage.ct1.g(th4Var.a.i, th4Var2.a.i) || (defpackage.xi4.b(th4Var.b, th4Var2.b) && !defpackage.ct1.g(th4Var.c, th4Var2.c)))) {
                defpackage.sq1 sq1Var2 = wa2Var.b;
                sq1Var2.M0().restartInput((android.view.View) sq1Var2.i);
                return;
            }
            int size2 = wa2Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                defpackage.sl3 sl3Var2 = (defpackage.sl3) ((java.lang.ref.WeakReference) wa2Var.j.get(i2)).get();
                if (sl3Var2 != null) {
                    defpackage.th4 th4Var3 = wa2Var.h;
                    defpackage.sq1 sq1Var3 = wa2Var.b;
                    if (sl3Var2.k) {
                        sl3Var2.g = th4Var3;
                        if (sl3Var2.i) {
                            sq1Var3.M0().updateExtractedText((android.view.View) sq1Var3.i, sl3Var2.h, defpackage.cb1.D(th4Var3));
                        }
                        defpackage.xi4 xi4Var3 = th4Var3.c;
                        long j = th4Var3.b;
                        int iF3 = xi4Var3 != null ? defpackage.xi4.f(xi4Var3.a) : -1;
                        defpackage.xi4 xi4Var4 = th4Var3.c;
                        sq1Var3.M0().updateSelection((android.view.View) sq1Var3.i, defpackage.xi4.f(j), defpackage.xi4.e(j), iF3, xi4Var4 != null ? defpackage.xi4.e(xi4Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.a83
    public final void f() {
        defpackage.j64 j64Var;
        defpackage.pa2 pa2Var = this.a;
        if (pa2Var == null || (j64Var = (defpackage.j64) defpackage.pp4.x(pa2Var, defpackage.k90.p)) == null) {
            return;
        }
        ((defpackage.qo0) j64Var).a();
    }

    @Override // defpackage.a83
    public final void g(defpackage.vl3 vl3Var) {
        android.graphics.Rect rect;
        defpackage.wa2 wa2Var = this.c;
        if (wa2Var != null) {
            wa2Var.l = new android.graphics.Rect(defpackage.uj2.L(vl3Var.a), defpackage.uj2.L(vl3Var.b), defpackage.uj2.L(vl3Var.c), defpackage.uj2.L(vl3Var.d));
            if (!wa2Var.j.isEmpty() || (rect = wa2Var.l) == null) {
                return;
            }
            wa2Var.a.requestRectangleOnScreen(new android.graphics.Rect(rect));
        }
    }

    @Override // defpackage.a83
    public final void h(defpackage.th4 th4Var, defpackage.sy2 sy2Var, defpackage.li4 li4Var, defpackage.w wVar, defpackage.vl3 vl3Var, defpackage.vl3 vl3Var2) {
        defpackage.wa2 wa2Var = this.c;
        if (wa2Var != null) {
            defpackage.qa2 qa2Var = wa2Var.m;
            synchronized (qa2Var.c) {
                try {
                    qa2Var.j = th4Var;
                    qa2Var.l = sy2Var;
                    qa2Var.k = li4Var;
                    qa2Var.m = vl3Var;
                    qa2Var.n = vl3Var2;
                    if (qa2Var.e || qa2Var.d) {
                        qa2Var.a();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final defpackage.is2 i() {
        defpackage.j24 j24Var = this.d;
        if (j24Var != null) {
            return j24Var;
        }
        if (!defpackage.hb4.a) {
            return null;
        }
        defpackage.j24 j24VarH = defpackage.uj2.h(0, 2, defpackage.nu.t);
        this.d = j24VarH;
        return j24VarH;
    }

    public final void j(defpackage.ma maVar) {
        defpackage.pa2 pa2Var = this.a;
        if (pa2Var == null) {
            return;
        }
        this.b = pa2Var.E ? defpackage.u22.C(pa2Var.j0(), null, new defpackage.b0(pa2Var, new defpackage.pa(maVar, this, pa2Var, w84Var, 0), w84Var, 9), 1) : null;
    }

    public final void k(defpackage.pa2 pa2Var) {
        if (!(this.a == pa2Var)) {
            defpackage.jq1.c("Expected textInputModifierNode to be " + pa2Var + " but was " + this.a);
        }
        this.a = null;
    }
}
