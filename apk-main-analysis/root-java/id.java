package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class id extends defpackage.c42 implements defpackage.jd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ defpackage.xw4 i;
    public final /* synthetic */ defpackage.y42 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id(defpackage.xw4 xw4Var, defpackage.y42 y42Var, int i) {
        super(1);
        this.f = i;
        this.i = xw4Var;
        this.t = y42Var;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.WindowInsets windowInsetsB;
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.y42 y42Var = this.t;
        defpackage.xw4 xw4Var = this.i;
        switch (i) {
            case 0:
                defpackage.q23 q23Var = (defpackage.q23) obj;
                defpackage.z7 z7Var = q23Var instanceof defpackage.z7 ? (defpackage.z7) q23Var : null;
                if (z7Var != null) {
                    z7Var.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(xw4Var, y42Var);
                    z7Var.getAndroidViewsHandler$ui_release().addView(xw4Var);
                    z7Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(y42Var, xw4Var);
                    xw4Var.setImportantForAccessibility(1);
                    defpackage.qw4.b(xw4Var, new defpackage.m7(z7Var, y42Var, z7Var));
                }
                if (xw4Var.getView().getParent() != xw4Var) {
                    xw4Var.addView(xw4Var.getView());
                    break;
                }
                break;
            case 1:
                defpackage.r15.c(xw4Var, y42Var);
                break;
            default:
                defpackage.r15.c(xw4Var, y42Var);
                ((defpackage.z7) xw4Var.t).R = true;
                int[] iArr = xw4Var.E;
                int i2 = iArr[0];
                int i3 = iArr[1];
                xw4Var.getView().getLocationOnScreen(iArr);
                long j = xw4Var.F;
                long jL = ((defpackage.j42) obj).l();
                xw4Var.F = jL;
                defpackage.c05 c05Var = xw4Var.G;
                if (c05Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !defpackage.wr1.a(j, jL)) && (windowInsetsB = xw4Var.g(c05Var).b()) != null)) {
                    xw4Var.getView().dispatchApplyWindowInsets(windowInsetsB);
                    break;
                }
                break;
        }
        return as4Var;
    }
}
