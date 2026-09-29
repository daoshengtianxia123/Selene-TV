package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class ad2 {
    public final java.lang.String a;
    public final java.util.List b;

    public ad2(java.lang.String str, java.util.List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ad2)) {
            return false;
        }
        defpackage.ad2 ad2Var = (defpackage.ad2) obj;
        return defpackage.ct1.g(this.a, ad2Var.a) && defpackage.ct1.g(this.b, ad2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "LiveChannelGroup(name=" + this.a + ", channels=" + this.b + ")";
    }
}
