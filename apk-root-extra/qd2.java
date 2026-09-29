package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class qd2 {
    public final defpackage.zc2 a;
    public final org.moontechlab.selenetv.model.LiveSource b;
    public final java.util.List c;

    public qd2(defpackage.zc2 zc2Var, org.moontechlab.selenetv.model.LiveSource liveSource, java.util.List list) {
        zc2Var.getClass();
        list.getClass();
        this.a = zc2Var;
        this.b = liveSource;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qd2)) {
            return false;
        }
        defpackage.qd2 qd2Var = (defpackage.qd2) obj;
        return defpackage.ct1.g(this.a, qd2Var.a) && this.b.equals(qd2Var.b) && defpackage.ct1.g(this.c, qd2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "LiveLaunch(channel=" + this.a + ", source=" + this.b + ", groups=" + this.c + ")";
    }
}
