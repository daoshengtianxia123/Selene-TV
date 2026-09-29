package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class cl4 implements defpackage.b51 {
    public java.lang.Object f;

    public /* synthetic */ cl4(java.lang.Object obj) {
        this.f = obj;
    }

    public static defpackage.cl4 i(android.view.ViewStructure viewStructure) {
        return new defpackage.cl4(viewStructure);
    }

    public android.os.Bundle a() {
        return ((android.view.ViewStructure) this.f).getExtras();
    }

    public void b(java.lang.String str) {
        ((android.view.ViewStructure) this.f).setClassName(str);
    }

    public void c(java.lang.String str) {
        ((android.view.ViewStructure) this.f).setContentDescription(str);
    }

    public void d(int i, int i2, int i3, int i4) {
        ((android.view.ViewStructure) this.f).setDimens(i, i2, 0, 0, i3, i4);
    }

    public void e(int i, java.lang.String str) {
        ((android.view.ViewStructure) this.f).setId(i, null, null, str);
    }

    public void f(java.lang.CharSequence charSequence) {
        ((android.view.ViewStructure) this.f).setText(charSequence);
    }

    public void g(float f) {
        ((android.view.ViewStructure) this.f).setTextStyle(f, 0, 0, 0);
    }

    public android.view.ViewStructure h() {
        return (android.view.ViewStructure) this.f;
    }

    @Override // defpackage.b51
    public defpackage.pl4 w(int i, int i2) {
        return new defpackage.xn4(i2 == 2 ? (defpackage.en0) this.f : null);
    }

    @Override // defpackage.b51
    public void y(defpackage.sx3 sx3Var) {
        sx3Var.getClass();
    }

    @Override // defpackage.b51
    public void q() {
    }
}
