package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class zc2 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;

    public zc2(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zc2)) {
            return false;
        }
        defpackage.zc2 zc2Var = (defpackage.zc2) obj;
        return this.a.equals(zc2Var.a) && this.b.equals(zc2Var.b) && this.c.equals(zc2Var.c) && this.d.equals(zc2Var.d) && this.e.equals(zc2Var.e) && defpackage.ct1.g(this.f, zc2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + defpackage.sr2.c(defpackage.sr2.c(defpackage.sr2.c(defpackage.sr2.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbG = defpackage.a44.g("LiveChannel(id=", this.a, ", tvgId=", this.b, ", name=");
        defpackage.w21.w(sbG, this.c, ", logo=", this.d, ", group=");
        sbG.append(this.e);
        sbG.append(", url=");
        sbG.append(this.f);
        sbG.append(")");
        return sbG.toString();
    }
}
