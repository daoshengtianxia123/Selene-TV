package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class ci4 implements defpackage.a83 {
    public final android.view.View a;
    public final defpackage.oj b;
    public final defpackage.di4 c;
    public boolean d;
    public defpackage.jd1 e;
    public defpackage.jd1 f;
    public defpackage.th4 g;
    public defpackage.qo1 h;
    public final java.util.ArrayList i;
    public final defpackage.q52 j;
    public android.graphics.Rect k;
    public final defpackage.ig0 l;
    public final defpackage.os2 m;
    public defpackage.tm n;

    public ci4(android.view.View view, defpackage.z7 z7Var) {
        defpackage.oj ojVar = new defpackage.oj(view);
        defpackage.di4 di4Var = new defpackage.di4(android.view.Choreographer.getInstance());
        this.a = view;
        this.b = ojVar;
        this.c = di4Var;
        this.e = defpackage.s23.y;
        this.f = defpackage.s23.z;
        this.g = new defpackage.th4(4, defpackage.xi4.b, "");
        this.h = defpackage.qo1.g;
        this.i = new java.util.ArrayList();
        this.j = defpackage.or1.A(defpackage.la2.i, new defpackage.wc(19, this));
        this.l = new defpackage.ig0(z7Var, ojVar);
        this.m = new defpackage.os2(new defpackage.bi4[16]);
    }

    @Override // defpackage.a83
    public final void a(defpackage.th4 th4Var, defpackage.qo1 qo1Var, defpackage.de0 de0Var, defpackage.le0 le0Var) {
        this.d = true;
        this.g = th4Var;
        this.h = qo1Var;
        this.e = de0Var;
        this.f = le0Var;
        i(defpackage.bi4.f);
    }

    @Override // defpackage.a83
    public final void b() {
        i(defpackage.bi4.f);
    }

    @Override // defpackage.a83
    public final void c() {
        i(defpackage.bi4.t);
    }

    @Override // defpackage.a83
    public final void d() {
        this.d = false;
        this.e = defpackage.r13.T;
        this.f = defpackage.r13.U;
        this.k = null;
        i(defpackage.bi4.i);
    }

    @Override // defpackage.a83
    public final void e(defpackage.th4 th4Var, defpackage.th4 th4Var2) {
        boolean z = (defpackage.xi4.b(this.g.b, th4Var2.b) && defpackage.ct1.g(this.g.c, th4Var2.c)) ? false : true;
        this.g = th4Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            defpackage.rl3 rl3Var = (defpackage.rl3) ((java.lang.ref.WeakReference) this.i.get(i)).get();
            if (rl3Var != null) {
                rl3Var.d(th4Var2);
            }
        }
        defpackage.ig0 ig0Var = this.l;
        synchronized (ig0Var.c) {
            ig0Var.j = null;
            ig0Var.l = null;
            ig0Var.k = null;
            ig0Var.m = defpackage.r7.S;
            ig0Var.n = null;
            ig0Var.o = null;
        }
        if (defpackage.ct1.g(th4Var, th4Var2)) {
            if (z) {
                defpackage.oj ojVar = this.b;
                int iF = defpackage.xi4.f(th4Var2.b);
                int iE = defpackage.xi4.e(th4Var2.b);
                defpackage.xi4 xi4Var = this.g.c;
                int iF2 = xi4Var != null ? defpackage.xi4.f(xi4Var.a) : -1;
                defpackage.xi4 xi4Var2 = this.g.c;
                ((android.view.inputmethod.InputMethodManager) ((defpackage.q52) ojVar.t).getValue()).updateSelection((android.view.View) ojVar.i, iF, iE, iF2, xi4Var2 != null ? defpackage.xi4.e(xi4Var2.a) : -1);
                return;
            }
            return;
        }
        if (th4Var != null && (!defpackage.ct1.g(th4Var.a.i, th4Var2.a.i) || (defpackage.xi4.b(th4Var.b, th4Var2.b) && !defpackage.ct1.g(th4Var.c, th4Var2.c)))) {
            defpackage.oj ojVar2 = this.b;
            ((android.view.inputmethod.InputMethodManager) ((defpackage.q52) ojVar2.t).getValue()).restartInput((android.view.View) ojVar2.i);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.rl3 rl3Var2 = (defpackage.rl3) ((java.lang.ref.WeakReference) this.i.get(i2)).get();
            if (rl3Var2 != null) {
                rl3Var2.e(this.g, this.b);
            }
        }
    }

    @Override // defpackage.a83
    public final void f() {
        i(defpackage.bi4.u);
    }

    @Override // defpackage.a83
    public final void g(defpackage.vl3 vl3Var) {
        android.graphics.Rect rect;
        this.k = new android.graphics.Rect(defpackage.uj2.L(vl3Var.a), defpackage.uj2.L(vl3Var.b), defpackage.uj2.L(vl3Var.c), defpackage.uj2.L(vl3Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new android.graphics.Rect(rect));
    }

    @Override // defpackage.a83
    public final void h(defpackage.th4 th4Var, defpackage.sy2 sy2Var, defpackage.li4 li4Var, defpackage.w wVar, defpackage.vl3 vl3Var, defpackage.vl3 vl3Var2) {
        defpackage.ig0 ig0Var = this.l;
        synchronized (ig0Var.c) {
            try {
                ig0Var.j = th4Var;
                ig0Var.l = sy2Var;
                ig0Var.k = li4Var;
                ig0Var.m = wVar;
                ig0Var.n = vl3Var;
                ig0Var.o = vl3Var2;
                if (ig0Var.e || ig0Var.d) {
                    ig0Var.a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void i(defpackage.bi4 bi4Var) {
        this.m.b(bi4Var);
        if (this.n == null) {
            defpackage.tm tmVar = new defpackage.tm(17, this);
            this.c.execute(tmVar);
            this.n = tmVar;
        }
    }
}
