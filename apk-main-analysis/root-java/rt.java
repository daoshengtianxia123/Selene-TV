package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class rt extends defpackage.so2 implements defpackage.pt {
    public android.view.ViewGroup F;

    @Override // defpackage.pt
    public final java.lang.Object K(defpackage.ax2 ax2Var, defpackage.qt qtVar, defpackage.ud0 ud0Var) {
        long jI = ax2Var.I(0L);
        defpackage.vl3 vl3Var = (defpackage.vl3) qtVar.invoke();
        defpackage.vl3 vl3VarI = vl3Var != null ? vl3Var.i(jI) : null;
        if (vl3VarI != null) {
            this.F.requestRectangleOnScreen(defpackage.nq1.L(vl3VarI), false);
        }
        return defpackage.as4.a;
    }
}
