package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class kc3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final java.util.ArrayList i;
    public final long j;
    public final long k;

    public kc3(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean a() {
        return this.e;
    }

    public final java.util.List b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.k;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kc3)) {
            return false;
        }
        defpackage.kc3 kc3Var = (defpackage.kc3) obj;
        return defpackage.xr1.M(this.a, kc3Var.a) && this.b == kc3Var.b && defpackage.qy2.b(this.c, kc3Var.c) && defpackage.qy2.b(this.d, kc3Var.d) && this.e == kc3Var.e && java.lang.Float.compare(this.f, kc3Var.f) == 0 && this.g == kc3Var.g && this.h == kc3Var.h && this.i.equals(kc3Var.i) && defpackage.qy2.b(this.j, kc3Var.j) && defpackage.qy2.b(this.k, kc3Var.k);
    }

    public final long f() {
        return this.c;
    }

    public final float g() {
        return this.f;
    }

    public final long h() {
        return this.j;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return defpackage.ms1.s(this.k) + ((defpackage.ms1.s(this.j) + ((this.i.hashCode() + ((((defpackage.w21.u((((defpackage.ms1.s(this.d) + ((defpackage.ms1.s(this.c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31, this.f, 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final int i() {
        return this.g;
    }

    public final long j() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputEventData(id=");
        sb.append((java.lang.Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((java.lang.Object) defpackage.qy2.g(this.c));
        sb.append(", position=");
        sb.append((java.lang.Object) defpackage.qy2.g(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((java.lang.Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((java.lang.Object) defpackage.qy2.g(this.j));
        sb.append(", originalEventPosition=");
        sb.append((java.lang.Object) defpackage.qy2.g(this.k));
        sb.append(')');
        return sb.toString();
    }
}
