package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class ww implements defpackage.uw {
    public final android.graphics.Matrix a = new android.graphics.Matrix();
    public final int[] b = new int[2];

    @Override // defpackage.uw
    public void a(android.view.View view, float[] fArr) {
        android.graphics.Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        defpackage.ct1.P(matrix, fArr);
    }
}
