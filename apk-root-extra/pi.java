package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class pi implements java.lang.Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;
    public final /* synthetic */ java.lang.Object t;

    public /* synthetic */ pi(int i, org.moontechlab.selenetv.MainActivity mainActivity) {
        this.f = 3;
        this.i = i;
        this.t = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        java.lang.Object obj = this.t;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((java.util.function.IntConsumer) obj).accept(i2);
                break;
            case 1:
                defpackage.in inVar = ((defpackage.hn) obj).b;
                if (i2 != -3 && i2 != -2) {
                    if (i2 == -1) {
                        defpackage.j41 j41Var = inVar.c;
                        if (j41Var != null) {
                            defpackage.m41 m41Var = j41Var.f;
                            m41Var.N(-1, 2, m41Var.o());
                        }
                        inVar.a();
                        inVar.b(1);
                        break;
                    } else if (i2 == 1) {
                        inVar.b(2);
                        defpackage.j41 j41Var2 = inVar.c;
                        if (j41Var2 != null) {
                            defpackage.m41 m41Var2 = j41Var2.f;
                            m41Var2.N(1, 1, m41Var2.o());
                            break;
                        }
                    } else {
                        defpackage.nm2.s(i2, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i2 == -2) {
                    defpackage.j41 j41Var3 = inVar.c;
                    if (j41Var3 != null) {
                        defpackage.m41 m41Var3 = j41Var3.f;
                        m41Var3.N(0, 1, m41Var3.o());
                    }
                    inVar.b(3);
                    break;
                } else {
                    inVar.b(4);
                    break;
                }
                break;
            case 2:
                defpackage.s41 s41Var = (defpackage.s41) obj;
                defpackage.fk0 fk0Var = s41Var.O;
                int i3 = s41Var.f[i2].i;
                fk0Var.L(fk0Var.K(), 1033, new defpackage.ak0(1));
                break;
            default:
                org.moontechlab.selenetv.MainActivity mainActivity = (org.moontechlab.selenetv.MainActivity) obj;
                int i4 = org.moontechlab.selenetv.MainActivity.L;
                if (i2 != 4) {
                    mainActivity.dispatchKeyEvent(new android.view.KeyEvent(0, i2));
                    mainActivity.dispatchKeyEvent(new android.view.KeyEvent(1, i2));
                    break;
                } else {
                    mainActivity.b().b();
                    break;
                }
        }
    }

    public /* synthetic */ pi(int i, int i2, java.lang.Object obj) {
        this.f = i2;
        this.t = obj;
        this.i = i;
    }

    public /* synthetic */ pi(defpackage.s41 s41Var, int i, boolean z) {
        this.f = 2;
        this.t = s41Var;
        this.i = i;
    }
}
