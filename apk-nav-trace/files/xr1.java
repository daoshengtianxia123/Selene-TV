package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public abstract class xr1 {
    public static defpackage.lo1 a;
    public static defpackage.lo1 b;

    public static final defpackage.vl3 A(defpackage.j42 j42Var) {
        defpackage.j42 j42VarV = j42Var.v();
        return j42VarV != null ? j42VarV.H(j42Var, true) : new defpackage.vl3(0.0f, 0.0f, (int) (j42Var.l() >> 32), (int) (j42Var.l() & 4294967295L));
    }

    public static final defpackage.vl3 B(defpackage.j42 j42Var) {
        defpackage.j42 j42VarN = N(j42Var);
        float fL = (int) (j42VarN.l() >> 32);
        float fL2 = (int) (j42VarN.l() & 4294967295L);
        defpackage.vl3 vl3VarH = j42VarN.H(j42Var, true);
        float f = vl3VarH.a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fL) {
            f = fL;
        }
        float f2 = vl3VarH.b;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fL2) {
            f2 = fL2;
        }
        float f3 = vl3VarH.c;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= fL) {
            fL = f3;
        }
        float f4 = vl3VarH.d;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= fL2) {
            fL2 = f5;
        }
        if (f == fL || f2 == fL2) {
            return defpackage.vl3.e;
        }
        long jD = j42VarN.d((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        long jD2 = j42VarN.d((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fL) << 32));
        long jD3 = j42VarN.d((java.lang.Float.floatToRawIntBits(fL) << 32) | (java.lang.Float.floatToRawIntBits(fL2) & 4294967295L));
        long jD4 = j42VarN.d((java.lang.Float.floatToRawIntBits(fL2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jD2 >> 32));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jD4 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jD3 >> 32));
        float fMin = java.lang.Math.min(fIntBitsToFloat, java.lang.Math.min(fIntBitsToFloat2, java.lang.Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = java.lang.Math.max(fIntBitsToFloat, java.lang.Math.max(fIntBitsToFloat2, java.lang.Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (jD & 4294967295L));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (jD2 & 4294967295L));
        float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (jD4 & 4294967295L));
        float fIntBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (4294967295L & jD3));
        return new defpackage.vl3(fMin, java.lang.Math.min(fIntBitsToFloat5, java.lang.Math.min(fIntBitsToFloat6, java.lang.Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, java.lang.Math.max(fIntBitsToFloat5, java.lang.Math.max(fIntBitsToFloat6, java.lang.Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final java.util.List C(defpackage.l82 l82Var, defpackage.t82 t82Var, defpackage.st stVar) {
        defpackage.rr1 rr1Var;
        defpackage.os2 os2Var = stVar.a;
        if (!(os2Var.t != 0) && t82Var.f.isEmpty()) {
            return defpackage.m01.f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stVar.a.t != 0) {
            int i = os2Var.t;
            if (i == 0) {
                defpackage.c.u("MutableVector is empty.");
                return null;
            }
            java.lang.Object[] objArr = os2Var.f;
            int i2 = ((defpackage.u72) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((defpackage.u72) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                defpackage.jq1.a("negative minIndex");
            }
            int i5 = os2Var.t;
            if (i5 == 0) {
                defpackage.c.u("MutableVector is empty.");
                return null;
            }
            java.lang.Object[] objArr2 = os2Var.f;
            int i6 = ((defpackage.u72) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((defpackage.u72) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            rr1Var = new defpackage.rr1(i2, java.lang.Math.min(i6, l82Var.a() - 1), 1);
        } else {
            rr1Var = defpackage.rr1.u;
        }
        int size = t82Var.f.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.r82 r82Var = (defpackage.r82) t82Var.get(i9);
            int iK = defpackage.st1.k(r82Var.c, l82Var, r82Var.a);
            int i10 = rr1Var.f;
            if ((iK > rr1Var.i || i10 > iK) && iK >= 0 && iK < l82Var.a()) {
                arrayList.add(java.lang.Integer.valueOf(iK));
            }
        }
        int i11 = rr1Var.f;
        int i12 = rr1Var.i;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(java.lang.Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final int D(float f) {
        return java.lang.Math.round((float) java.lang.Math.ceil(f));
    }

    public static final void E(int i) {
        if (i >= 1) {
            return;
        }
        defpackage.jc2.f(defpackage.ms1.y(i, "Expected positive parallelism level, but got "));
    }

    public static long F(long j) {
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public static double G(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float H(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int I(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long J(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        java.lang.StringBuilder sbL = defpackage.sr2.l(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbL.append(j2);
        sbL.append('.');
        throw new java.lang.IllegalArgumentException(sbL.toString());
    }

    public static final defpackage.ls2 K(defpackage.mr2 mr2Var, defpackage.k80 k80Var) {
        java.lang.Object objP = k80Var.P();
        defpackage.cj cjVar = defpackage.z70.a;
        if (objP == cjVar) {
            objP = defpackage.or1.C(java.lang.Boolean.FALSE);
            k80Var.l0(objP);
        }
        defpackage.ls2 ls2Var = (defpackage.ls2) objP;
        boolean zF = k80Var.f(mr2Var);
        java.lang.Object objP2 = k80Var.P();
        if (zF || objP2 == cjVar) {
            objP2 = new defpackage.ja1(mr2Var, ls2Var, null, 1);
            k80Var.l0(objP2);
        }
        defpackage.ft4.T(k80Var, (defpackage.xd1) objP2, mr2Var);
        return ls2Var;
    }

    public static void L(defpackage.a52 a52Var, defpackage.or1 or1Var, defpackage.q8 q8Var, float f, defpackage.u22 u22Var, int i) {
        defpackage.u22 u22Var2 = (i & 8) != 0 ? defpackage.o61.x : u22Var;
        if (or1Var instanceof defpackage.f23) {
            defpackage.vl3 vl3Var = ((defpackage.f23) or1Var).c;
            float f2 = vl3Var.a;
            a52Var.x(q8Var, (java.lang.Float.floatToRawIntBits(vl3Var.b) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f2) << 32), b0(vl3Var), f, u22Var2);
            return;
        }
        if (!(or1Var instanceof defpackage.g23)) {
            if (or1Var instanceof defpackage.e23) {
                a52Var.R(((defpackage.e23) or1Var).c, q8Var, f, u22Var2, 3);
                return;
            } else {
                defpackage.jc2.o();
                return;
            }
        }
        defpackage.g23 g23Var = (defpackage.g23) or1Var;
        defpackage.bb bbVar = g23Var.d;
        if (bbVar != null) {
            a52Var.R(bbVar, q8Var, f, u22Var2, 3);
            return;
        }
        defpackage.fs3 fs3Var = g23Var.c;
        float f3 = fs3Var.b;
        float f4 = fs3Var.a;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (fs3Var.h >> 32));
        a52Var.d(q8Var, (java.lang.Float.floatToRawIntBits(f4) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L), (java.lang.Float.floatToRawIntBits(fs3Var.c - f4) << 32) | (java.lang.Float.floatToRawIntBits(fs3Var.d - f3) & 4294967295L), (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), f, u22Var2);
    }

    public static final boolean M(long j, long j2) {
        return j == j2;
    }

    public static final defpackage.j42 N(defpackage.j42 j42Var) {
        defpackage.j42 j42Var2;
        defpackage.j42 j42VarV = j42Var.v();
        while (true) {
            defpackage.j42 j42Var3 = j42VarV;
            j42Var2 = j42Var;
            j42Var = j42Var3;
            if (j42Var == null) {
                break;
            }
            j42VarV = j42Var.v();
        }
        defpackage.ax2 ax2Var = j42Var2 instanceof defpackage.ax2 ? (defpackage.ax2) j42Var2 : null;
        if (ax2Var == null) {
            return j42Var2;
        }
        defpackage.ax2 ax2Var2 = ax2Var.H;
        while (true) {
            defpackage.ax2 ax2Var3 = ax2Var2;
            defpackage.ax2 ax2Var4 = ax2Var;
            ax2Var = ax2Var3;
            if (ax2Var == null) {
                return ax2Var4;
            }
            ax2Var2 = ax2Var.H;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static defpackage.kk4 O(java.lang.String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals(io.netty.handler.ssl.SslProtocols.TLS_v1_1)) {
                            return defpackage.kk4.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals(io.netty.handler.ssl.SslProtocols.TLS_v1_2)) {
                            return defpackage.kk4.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals(io.netty.handler.ssl.SslProtocols.TLS_v1_3)) {
                            return defpackage.kk4.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals(io.netty.handler.ssl.SslProtocols.TLS_v1)) {
                return defpackage.kk4.TLS_1_0;
            }
        } else if (str.equals(io.netty.handler.ssl.SslProtocols.SSL_v3)) {
            return defpackage.kk4.SSL_3_0;
        }
        defpackage.c.n("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final defpackage.lx4 P(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(dev.jdtech.mpv.R.id.view_tree_view_model_store_owner);
            defpackage.lx4 lx4Var = tag instanceof defpackage.lx4 ? (defpackage.lx4) tag : null;
            if (lx4Var != null) {
                return lx4Var;
            }
            java.lang.Object objP = defpackage.st1.p(view);
            view = objP instanceof android.view.View ? (android.view.View) objP : null;
        }
        return null;
    }

    public static final long Q(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (java.lang.Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final defpackage.lo1 R() {
        defpackage.lo1 lo1Var = b;
        if (lo1Var != null) {
            return lo1Var;
        }
        defpackage.ko1 ko1Var = new defpackage.ko1("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = defpackage.nu4.a;
        defpackage.m64 m64Var = new defpackage.m64(defpackage.g40.b);
        defpackage.ci1 ci1Var = new defpackage.ci1(1);
        ci1Var.l(21.0f, 3.0f);
        ci1Var.j(3.0f, 3.0f);
        ci1Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        ci1Var.p(12.0f);
        ci1Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ci1Var.i(5.0f);
        ci1Var.p(2.0f);
        ci1Var.i(8.0f);
        ci1Var.p(-2.0f);
        ci1Var.i(5.0f);
        ci1Var.g(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        ci1Var.j(23.0f, 5.0f);
        ci1Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ci1Var.e();
        ci1Var.l(21.0f, 17.0f);
        ci1Var.j(3.0f, 17.0f);
        ci1Var.j(3.0f, 5.0f);
        ci1Var.i(18.0f);
        ci1Var.p(12.0f);
        ci1Var.e();
        defpackage.ko1.a(ko1Var, ci1Var.a, m64Var);
        defpackage.lo1 lo1VarB = ko1Var.b();
        b = lo1VarB;
        return lo1VarB;
    }

    public static final void S(defpackage.ra4 ra4Var, java.lang.String str) {
        ra4Var.l(ra4Var.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean T(defpackage.s92 s92Var) {
        return s92Var.c() >= 0 && s92Var.b() <= 0;
    }

    public static final java.lang.CharSequence U(java.lang.CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                java.lang.String str = i2 <= 0 ? "" : ".....";
                java.lang.String str2 = i3 >= charSequence.length() ? "" : ".....";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V(defpackage.so2 so2Var, defpackage.hd1 hd1Var) {
        defpackage.py2 py2Var = so2Var.x;
        if (py2Var == null) {
            py2Var = new defpackage.py2((defpackage.oy2) so2Var);
            so2Var.x = py2Var;
        }
        ((defpackage.z7) defpackage.ct1.M(so2Var)).getSnapshotObserver().a(py2Var, defpackage.d5.T, hd1Var);
    }

    public static final kotlinx.serialization.KSerializer W(defpackage.qz1 qz1Var, java.util.ArrayList arrayList, defpackage.hd1 hd1Var) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        kotlinx.serialization.KSerializer fkVar;
        kotlinx.serialization.KSerializer zm3Var;
        qz1Var.getClass();
        defpackage.mo3 mo3Var = defpackage.lo3.a;
        if (qz1Var.equals(mo3Var.b(java.util.Collection.class)) || qz1Var.equals(mo3Var.b(java.util.List.class)) || qz1Var.equals(mo3Var.b(java.util.List.class)) || qz1Var.equals(mo3Var.b(java.util.ArrayList.class))) {
            fkVar = new defpackage.fk((kotlinx.serialization.KSerializer) arrayList.get(0));
        } else if (qz1Var.equals(mo3Var.b(java.util.HashSet.class))) {
            fkVar = new defpackage.ai1((kotlinx.serialization.KSerializer) arrayList.get(0), 0);
        } else if (qz1Var.equals(mo3Var.b(java.util.Set.class)) || qz1Var.equals(mo3Var.b(java.util.Set.class)) || qz1Var.equals(mo3Var.b(java.util.LinkedHashSet.class))) {
            fkVar = new defpackage.ai1((kotlinx.serialization.KSerializer) arrayList.get(0), 1);
        } else if (qz1Var.equals(mo3Var.b(java.util.HashMap.class))) {
            fkVar = new defpackage.zh1((kotlinx.serialization.KSerializer) arrayList.get(0), (kotlinx.serialization.KSerializer) arrayList.get(1));
        } else if (qz1Var.equals(mo3Var.b(java.util.Map.class)) || qz1Var.equals(mo3Var.b(java.util.Map.class)) || qz1Var.equals(mo3Var.b(java.util.LinkedHashMap.class))) {
            fkVar = new defpackage.gc2((kotlinx.serialization.KSerializer) arrayList.get(0), (kotlinx.serialization.KSerializer) arrayList.get(1));
        } else {
            if (qz1Var.equals(mo3Var.b(java.util.Map.Entry.class))) {
                kotlinx.serialization.KSerializer kSerializer = (kotlinx.serialization.KSerializer) arrayList.get(0);
                kotlinx.serialization.KSerializer kSerializer2 = (kotlinx.serialization.KSerializer) arrayList.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                zm3Var = new defpackage.bj2(kSerializer, kSerializer2, 0);
            } else if (qz1Var.equals(mo3Var.b(defpackage.h33.class))) {
                kotlinx.serialization.KSerializer kSerializer3 = (kotlinx.serialization.KSerializer) arrayList.get(0);
                kotlinx.serialization.KSerializer kSerializer4 = (kotlinx.serialization.KSerializer) arrayList.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                zm3Var = new defpackage.bj2(kSerializer3, kSerializer4, 1);
            } else if (qz1Var.equals(mo3Var.b(defpackage.pn4.class))) {
                kotlinx.serialization.KSerializer kSerializer5 = (kotlinx.serialization.KSerializer) arrayList.get(0);
                kotlinx.serialization.KSerializer kSerializer6 = (kotlinx.serialization.KSerializer) arrayList.get(1);
                kotlinx.serialization.KSerializer kSerializer7 = (kotlinx.serialization.KSerializer) arrayList.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                fkVar = new defpackage.qn4(kSerializer5, kSerializer6, kSerializer7);
            } else if (defpackage.ht1.z(qz1Var).isArray()) {
                java.lang.Object objInvoke = hd1Var.invoke();
                objInvoke.getClass();
                kotlinx.serialization.KSerializer kSerializer8 = (kotlinx.serialization.KSerializer) arrayList.get(0);
                kSerializer8.getClass();
                zm3Var = new defpackage.zm3((defpackage.qz1) objInvoke, kSerializer8);
            } else {
                fkVar = null;
            }
            fkVar = zm3Var;
        }
        if (fkVar != null) {
            return fkVar;
        }
        kotlinx.serialization.KSerializer[] kSerializerArr = (kotlinx.serialization.KSerializer[]) arrayList.toArray(new kotlinx.serialization.KSerializer[0]);
        return defpackage.nq1.q(qz1Var, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final kotlinx.serialization.KSerializer X(defpackage.qz1 qz1Var) {
        qz1Var.getClass();
        kotlinx.serialization.KSerializer kSerializerY = Y(qz1Var);
        if (kSerializerY != null) {
            return kSerializerY;
        }
        defpackage.q8.q0(qz1Var);
        throw null;
    }

    public static final kotlinx.serialization.KSerializer Y(defpackage.qz1 qz1Var) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        qz1Var.getClass();
        kotlinx.serialization.KSerializer kSerializerQ = defpackage.nq1.q(qz1Var, new kotlinx.serialization.KSerializer[0]);
        return kSerializerQ == null ? defpackage.je3.a(qz1Var) : kSerializerQ;
    }

    public static final kotlinx.serialization.KSerializer Z(defpackage.l04 l04Var, defpackage.g22 g22Var) {
        l04Var.getClass();
        g22Var.getClass();
        return defpackage.ss1.b0(l04Var, g22Var, false);
    }

    public static final void a(java.lang.String str, defpackage.q60 q60Var, defpackage.k80 k80Var, int i) {
        defpackage.q60 q60Var2;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(1529349492);
        int i2 = 1;
        if (k80Var2.S(i & 1, (i & 19) != 18)) {
            defpackage.ts3 ts3VarA = defpackage.ss3.a(new defpackage.yj(5.0f, new defpackage.qj(i2)), defpackage.d6.C, k80Var2, 54);
            long j = k80Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, qo2Var);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var2, qfVar, ts3VarA);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var2, i3, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD);
            defpackage.to2 to2VarL = androidx.compose.foundation.layout.d.l(qo2Var, 36.0f);
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.v, false);
            long j2 = k80Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            defpackage.y53 y53VarL2 = k80Var2.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarL);
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i4))) {
                defpackage.ms1.G(i4, k80Var2, i4, qfVar3);
            }
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD2);
            defpackage.ii4.a(str, null, defpackage.g40.c, defpackage.nq1.A(11), defpackage.jc1.z, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var2, 200070, 0, 131026);
            k80Var2 = k80Var2;
            k80Var2.p(true);
            q60Var2 = q60Var;
            q60Var2.invoke(k80Var2, 6);
            k80Var2.p(true);
        } else {
            q60Var2 = q60Var;
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.l80(str, q60Var2, i);
        }
    }

    public static final java.util.ArrayList a0(defpackage.l04 l04Var, java.util.List list, boolean z) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        l04Var.getClass();
        list.getClass();
        if (!z) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.z30.g0(10, list));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlinx.serialization.KSerializer kSerializerZ = Z(l04Var, (defpackage.g22) it.next());
                if (kSerializerZ == null) {
                    return null;
                }
                arrayList.add(kSerializerZ);
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.z30.g0(10, list));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            defpackage.g22 g22Var = (defpackage.g22) it2.next();
            g22Var.getClass();
            kotlinx.serialization.KSerializer kSerializerB0 = defpackage.ss1.b0(l04Var, g22Var, true);
            if (kSerializerB0 == null) {
                defpackage.q8.q0(defpackage.q8.f0(g22Var));
                throw null;
            }
            arrayList2.add(kSerializerB0);
        }
        return arrayList2;
    }

    public static final defpackage.nw1 b(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return f(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) U(str2, -1)));
    }

    public static final long b0(defpackage.vl3 vl3Var) {
        float f = vl3Var.c - vl3Var.a;
        float f2 = vl3Var.d - vl3Var.b;
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final defpackage.tw1 c(java.lang.Number number, java.lang.String str) {
        return new defpackage.tw1("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) U(str, -1)));
    }

    public static defpackage.pr1 c0(defpackage.rr1 rr1Var, int i) {
        rr1Var.getClass();
        boolean z = i > 0;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!z) {
            defpackage.jc2.g(numValueOf, 46, "Step must be positive, was: ");
            return null;
        }
        int i2 = rr1Var.f;
        int i3 = rr1Var.i;
        if (rr1Var.t <= 0) {
            i = -i;
        }
        return new defpackage.pr1(i2, i3, i);
    }

    public static final defpackage.tw1 d(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return new defpackage.tw1("Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.g() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void d0(defpackage.ra4 ra4Var, java.lang.Number number) {
        defpackage.ra4.m(ra4Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final defpackage.nw1 e(int i, java.lang.CharSequence charSequence, java.lang.String str) {
        charSequence.getClass();
        return f(i, str + "\nJSON input: " + ((java.lang.Object) U(charSequence, i)));
    }

    public static final long e0(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) * java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final defpackage.nw1 f(int i, java.lang.String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new defpackage.nw1(str);
    }

    public static final long f0(long j) {
        return (java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final void g(defpackage.k80 k80Var, int i) {
        k80Var.d0(1404333951);
        if (k80Var.S(i & 1, i != 0)) {
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarL = androidx.compose.foundation.layout.d.l(qo2Var, 120.0f);
            defpackage.v40 v40VarA = defpackage.t40.a(defpackage.uj2.c, defpackage.d6.F, k80Var, 48);
            long j = k80Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2VarL);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(j90Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, v40VarA);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i2))) {
                defpackage.ms1.G(i2, k80Var, i2, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            defpackage.to2 to2VarK = defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.l(qo2Var, 120.0f), 180.0f), defpackage.hs3.a(6.0f));
            long j2 = defpackage.g40.c;
            long jC = defpackage.g40.c(0.45f, j2);
            defpackage.zk1 zk1Var = defpackage.pp4.f;
            defpackage.ys.a(androidx.compose.foundation.a.b(to2VarK, jC, zk1Var), k80Var, 0);
            p(k80Var, androidx.compose.foundation.layout.d.e(qo2Var, 4.0f));
            defpackage.ys.a(androidx.compose.foundation.a.b(defpackage.ct1.k(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.l(qo2Var, 60.0f), 14.0f), defpackage.hs3.a(2.0f)), defpackage.g40.c(0.315f, j2), zk1Var), k80Var, 0);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qj(i, 5);
        }
    }

    public static defpackage.rr1 g0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new defpackage.rr1(i, i2 - 1, 1);
        }
        defpackage.rr1 rr1Var = defpackage.rr1.u;
        return defpackage.rr1.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.util.List r36, final int r37, final boolean r38, final java.lang.String r39, final defpackage.hd1 r40, final int r41, final defpackage.jd1 r42, final defpackage.jd1 r43, final defpackage.jd1 r44, final defpackage.jd1 r45, final defpackage.jd1 r46, final defpackage.ta1 r47, final defpackage.hd1 r48, defpackage.k80 r49, final int r50) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.h(java.util.List, int, boolean, java.lang.String, hd1, int, jd1, jd1, jd1, jd1, jd1, ta1, hd1, k80, int):void");
    }

    public static final void i(java.lang.String str, defpackage.hd1 hd1Var, defpackage.k80 k80Var, int i) {
        int i2;
        int i3;
        defpackage.ls2 ls2Var;
        defpackage.hd1 hd1Var2 = hd1Var;
        defpackage.k80 k80Var2 = k80Var;
        str.getClass();
        hd1Var2.getClass();
        k80Var2.d0(-1851168150);
        if ((i & 48) == 0) {
            i2 = i | (k80Var2.h(hd1Var2) ? 32 : 16);
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (k80Var2.S(i2 & 1, (i2 & 17) != 16)) {
            java.lang.Object objP = k80Var2.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                objP = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var2.l0(objP);
            }
            defpackage.ls2 ls2Var2 = (defpackage.ls2) objP;
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarE = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(qo2Var, 1.0f), 300.0f);
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
            int iS = defpackage.ms1.s(k80Var2.T);
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var2, to2VarE);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.qf qfVar = defpackage.v70.f;
            defpackage.ht1.J(k80Var2, qfVar, fk2VarD);
            defpackage.qf qfVar2 = defpackage.v70.e;
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL);
            defpackage.qf qfVar3 = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(iS))) {
                defpackage.ms1.G(iS, k80Var2, iS, qfVar3);
            }
            defpackage.qf qfVar4 = defpackage.v70.d;
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD);
            defpackage.v40 v40VarA = defpackage.t40.a(new defpackage.yj(16.0f, new defpackage.qj(i4)), defpackage.d6.F, k80Var2, 54);
            int iS2 = defpackage.ms1.s(k80Var2.T);
            defpackage.y53 y53VarL2 = k80Var2.l();
            defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, qo2Var);
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, qfVar, v40VarA);
            defpackage.ht1.J(k80Var2, qfVar2, y53VarL2);
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(iS2))) {
                defpackage.ms1.G(iS2, k80Var2, iS2, qfVar3);
            }
            defpackage.ht1.J(k80Var2, qfVar4, to2VarD2);
            defpackage.ii4.a("加载失败", null, defpackage.g40.c(0.6f, defpackage.g40.c), defpackage.nq1.A(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var, 3462, 0, 131058);
            defpackage.gs3 gs3VarA = defpackage.hs3.a(8.0f);
            defpackage.c30 c30Var = new defpackage.c30(gs3VarA, gs3VarA, gs3VarA, gs3VarA, gs3VarA);
            defpackage.b30 b30VarH = defpackage.d6.h(1.05f);
            defpackage.z20 z20VarE = defpackage.d6.e(defpackage.q8.r(352321535), defpackage.q8.s(4283215696L), 0L, 0L, k80Var, 390, 250);
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == cjVar) {
                ls2Var = ls2Var2;
                objP2 = new defpackage.nl2(ls2Var, 0);
                k80Var.l0(objP2);
            } else {
                ls2Var = ls2Var2;
            }
            hd1Var2 = hd1Var;
            q(hd1Var2, androidx.compose.ui.focus.a.c(qo2Var, (defpackage.jd1) objP2), null, false, c30Var, z20VarE, b30VarH, null, null, defpackage.q8.n0(-1664717683, new defpackage.ci0(ls2Var, 4), k80Var), k80Var, (i2 >> 3) & 14, 1820);
            k80Var2 = k80Var;
            i3 = 1;
            k80Var2.p(true);
            k80Var2.p(true);
        } else {
            i3 = 1;
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.pe2(str, hd1Var2, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final java.util.List r32, final int r33, final boolean r34, final boolean r35, final int r36, final defpackage.jd1 r37, final defpackage.jd1 r38, final defpackage.jd1 r39, final defpackage.jd1 r40, final defpackage.jd1 r41, defpackage.hd1 r42, defpackage.k80 r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.j(java.util.List, int, boolean, boolean, int, jd1, jd1, jd1, jd1, jd1, hd1, k80, int, int, int):void");
    }

    public static final void k(final java.util.List list, final boolean z, final java.lang.String str, final defpackage.iv3 iv3Var, final float f, final float f2, final defpackage.ta1 ta1Var, final java.lang.Object obj, final defpackage.jd1 jd1Var, final defpackage.jd1 jd1Var2, final defpackage.jd1 jd1Var3, final defpackage.hd1 hd1Var, final defpackage.hd1 hd1Var2, final defpackage.hd1 hd1Var3, final defpackage.q60 q60Var, defpackage.k80 k80Var, final int i) {
        int i2;
        defpackage.iv3 iv3Var2;
        float f3;
        defpackage.ta1 ta1Var2;
        float f4;
        list.getClass();
        iv3Var.getClass();
        ta1Var.getClass();
        jd1Var.getClass();
        jd1Var2.getClass();
        jd1Var3.getClass();
        hd1Var.getClass();
        hd1Var2.getClass();
        hd1Var3.getClass();
        k80Var.d0(678352415);
        if ((i & 6) == 0) {
            i2 = (k80Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= k80Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= k80Var.f(str) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        }
        if ((i & 3072) == 0) {
            iv3Var2 = iv3Var;
            i2 |= k80Var.f(iv3Var2) ? 2048 : 1024;
        } else {
            iv3Var2 = iv3Var;
        }
        if ((i & 24576) == 0) {
            f3 = f;
            i2 |= k80Var.c(f3) ? 16384 : 8192;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            ta1Var2 = ta1Var;
            i2 |= k80Var.f(ta1Var2) ? 1048576 : 524288;
        } else {
            ta1Var2 = ta1Var;
        }
        if ((i & 12582912) == 0) {
            i2 |= k80Var.h(obj) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= k80Var.h(jd1Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= k80Var.h(jd1Var2) ? 536870912 : 268435456;
        }
        if (k80Var.S(i2 & 1, ((i2 & 306717843) == 306717842 && ((((27648 | (k80Var.h(jd1Var3) ? (char) 4 : (char) 2)) | (k80Var.h(hd1Var) ? 32 : 16)) | (k80Var.h(hd1Var2) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE)) & 9363) == 9362) ? false : true)) {
            defpackage.yo0 yo0Var = (defpackage.yo0) k80Var.j(defpackage.k90.h);
            java.lang.Object objP = k80Var.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                objP = defpackage.ft4.e0(k80Var);
                k80Var.l0(objP);
            }
            final defpackage.nf0 nf0Var = (defpackage.nf0) objP;
            float f5 = ((android.content.res.Configuration) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            final float fV = yo0Var.V(f5);
            float f6 = (f5 / 2.0f) - 67.5f;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == cjVar) {
                f4 = f6;
                objP2 = new defpackage.x33(0);
                k80Var.l0(objP2);
            } else {
                f4 = f6;
            }
            final defpackage.x33 x33Var = (defpackage.x33) objP2;
            java.lang.Object objP3 = k80Var.P();
            if (objP3 == cjVar) {
                objP3 = new defpackage.x33(0);
                k80Var.l0(objP3);
            }
            final defpackage.x33 x33Var2 = (defpackage.x33) objP3;
            boolean zF = k80Var.f(list);
            java.lang.Object objP4 = k80Var.P();
            if (zF || objP4 == cjVar) {
                objP4 = defpackage.y30.p0(6, list);
                k80Var.l0(objP4);
            }
            final java.util.List list2 = (java.util.List) objP4;
            final float fV2 = yo0Var.V(202.0f);
            final float fV3 = yo0Var.V(28.0f);
            final float fV4 = yo0Var.V(64.0f);
            java.lang.Object objP5 = k80Var.P();
            if (objP5 == cjVar) {
                objP5 = new defpackage.sv0(x33Var, null, 1);
                k80Var.l0(objP5);
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP5, obj);
            java.lang.Object objP6 = k80Var.P();
            if (objP6 == cjVar) {
                objP6 = new defpackage.rl2();
                k80Var.l0(objP6);
            }
            defpackage.rl2 rl2Var = (defpackage.rl2) objP6;
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.i, false);
            long j = k80Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, fillElement);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(j90Var);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, defpackage.v70.f, fk2VarD);
            defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i3))) {
                defpackage.ms1.G(i3, k80Var, i3, qfVar);
            }
            defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
            final defpackage.ta1 ta1Var3 = ta1Var2;
            final defpackage.iv3 iv3Var3 = iv3Var2;
            final float f7 = f3;
            final float f8 = f4;
            defpackage.ft4.L(defpackage.du.a.a(rl2Var), defpackage.q8.n0(-2069541607, new defpackage.xd1() { // from class: il2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    java.util.List list3;
                    defpackage.k80 k80Var2 = (defpackage.k80) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    if (k80Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.foundation.layout.FillElement fillElement2 = androidx.compose.foundation.layout.d.c;
                        defpackage.iv3 iv3Var4 = iv3Var3;
                        defpackage.to2 to2VarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.a.d(defpackage.ht1.T(fillElement2, iv3Var4)), f7, 0.0f, 2), 0.0f, 0.0f, 0.0f, f8, 7);
                        defpackage.v40 v40VarA = defpackage.t40.a(defpackage.uj2.c, defpackage.d6.E, k80Var2, 0);
                        long j2 = k80Var2.T;
                        int i4 = (int) (j2 ^ (j2 >>> 32));
                        defpackage.y53 y53VarL2 = k80Var2.l();
                        defpackage.to2 to2VarD2 = defpackage.uj2.D(k80Var2, to2VarH);
                        defpackage.w70.b.getClass();
                        defpackage.j90 j90Var2 = defpackage.v70.b;
                        k80Var2.f0();
                        if (k80Var2.S) {
                            k80Var2.k(j90Var2);
                        } else {
                            k80Var2.o0();
                        }
                        defpackage.qf qfVar2 = defpackage.v70.f;
                        defpackage.ht1.J(k80Var2, qfVar2, v40VarA);
                        defpackage.qf qfVar3 = defpackage.v70.e;
                        defpackage.ht1.J(k80Var2, qfVar3, y53VarL2);
                        defpackage.qf qfVar4 = defpackage.v70.g;
                        if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i4))) {
                            defpackage.ms1.G(i4, k80Var2, i4, qfVar4);
                        }
                        defpackage.qf qfVar5 = defpackage.v70.d;
                        defpackage.ht1.J(k80Var2, qfVar5, to2VarD2);
                        defpackage.qo2 qo2Var = defpackage.qo2.f;
                        defpackage.xr1.p(k80Var2, androidx.compose.foundation.layout.d.e(qo2Var, 64.0f));
                        java.lang.Object objP7 = k80Var2.P();
                        defpackage.x33 x33Var3 = x33Var2;
                        defpackage.cj cjVar2 = defpackage.z70.a;
                        if (objP7 == cjVar2) {
                            objP7 = new defpackage.pj(11, x33Var3);
                            k80Var2.l0(objP7);
                        }
                        defpackage.to2 to2VarB = androidx.compose.ui.layout.a.b(qo2Var, (defpackage.jd1) objP7);
                        defpackage.fk2 fk2VarD2 = defpackage.ys.d(defpackage.d6.i, false);
                        long j3 = k80Var2.T;
                        int i5 = (int) (j3 ^ (j3 >>> 32));
                        defpackage.y53 y53VarL3 = k80Var2.l();
                        defpackage.to2 to2VarD3 = defpackage.uj2.D(k80Var2, to2VarB);
                        k80Var2.f0();
                        if (k80Var2.S) {
                            k80Var2.k(j90Var2);
                        } else {
                            k80Var2.o0();
                        }
                        defpackage.ht1.J(k80Var2, qfVar2, fk2VarD2);
                        defpackage.ht1.J(k80Var2, qfVar3, y53VarL3);
                        if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i5))) {
                            defpackage.ms1.G(i5, k80Var2, i5, qfVar4);
                        }
                        defpackage.ht1.J(k80Var2, qfVar5, to2VarD3);
                        q60Var.invoke(k80Var2, 0);
                        k80Var2.p(true);
                        defpackage.xr1.p(k80Var2, androidx.compose.foundation.layout.d.e(qo2Var, 14.0f));
                        defpackage.x33 x33Var4 = x33Var;
                        int iJ = x33Var4.j();
                        java.util.List list4 = list2;
                        int size = list4.size();
                        boolean zH = k80Var2.h(list4);
                        float f9 = fV4;
                        boolean zC = zH | k80Var2.c(f9);
                        float f10 = fV2;
                        boolean zC2 = zC | k80Var2.c(f10);
                        float f11 = fV3;
                        boolean zC3 = zC2 | k80Var2.c(f11);
                        float f12 = fV;
                        boolean zC4 = zC3 | k80Var2.c(f12);
                        defpackage.nf0 nf0Var2 = nf0Var;
                        boolean zH2 = zC4 | k80Var2.h(nf0Var2) | k80Var2.f(iv3Var4);
                        java.lang.Object objP8 = k80Var2.P();
                        if (zH2 || objP8 == cjVar2) {
                            objP8 = new defpackage.pl2(list4, nf0Var2, f9, f10, f11, f12, x33Var3, iv3Var4);
                            list3 = list4;
                            k80Var2.l0(objP8);
                        } else {
                            list3 = list4;
                        }
                        defpackage.jd1 jd1Var4 = (defpackage.jd1) ((defpackage.j02) objP8);
                        boolean zH3 = k80Var2.h(list3);
                        boolean z2 = z;
                        boolean zG = zH3 | k80Var2.g(z2);
                        defpackage.hd1 hd1Var4 = hd1Var2;
                        boolean zF2 = zG | k80Var2.f(hd1Var4);
                        java.lang.Object objP9 = k80Var2.P();
                        if (zF2 || objP9 == cjVar2) {
                            objP9 = new defpackage.ql2(list3, z2, hd1Var4, x33Var4);
                            k80Var2.l0(objP9);
                        }
                        defpackage.xr1.h(list3, iJ, z2, str, hd1Var, size, jd1Var, jd1Var2, jd1Var4, (defpackage.jd1) ((defpackage.j02) objP9), jd1Var3, ta1Var3, hd1Var3, k80Var2, 0);
                        k80Var2.p(true);
                    } else {
                        k80Var2.V();
                    }
                    return defpackage.as4.a;
                }
            }, k80Var), k80Var, 56);
            k80Var.p(true);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1() { // from class: ll2
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int iG = defpackage.st1.G(i | 1);
                    defpackage.xr1.k(list, z, str, iv3Var, f, f2, ta1Var, obj, jd1Var, jd1Var2, jd1Var3, hd1Var, hd1Var2, hd1Var3, q60Var, (defpackage.k80) obj2, iG);
                    return defpackage.as4.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0423 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.vu2 r38, defpackage.su2 r39, defpackage.to2 r40, defpackage.e6 r41, defpackage.jd1 r42, defpackage.jd1 r43, defpackage.jd1 r44, defpackage.jd1 r45, defpackage.k80 r46, int r47) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.l(vu2, su2, to2, e6, jd1, jd1, jd1, jd1, k80, int):void");
    }

    public static final void m(defpackage.vu2 vu2Var, java.lang.Object obj, defpackage.to2 to2Var, defpackage.e6 e6Var, java.util.Map map, defpackage.jd1 jd1Var, defpackage.jd1 jd1Var2, defpackage.jd1 jd1Var3, defpackage.jd1 jd1Var4, defpackage.jd1 jd1Var5, defpackage.k80 k80Var, int i) {
        defpackage.e6 e6Var2;
        defpackage.jd1 jd1Var6;
        defpackage.jd1 jd1Var7;
        defpackage.to2 to2Var2;
        int i2;
        defpackage.jd1 jd1Var8;
        java.util.Map map2;
        defpackage.jd1 jd1Var9;
        defpackage.jd1 jd1Var10;
        defpackage.jd1 jd1Var11;
        defpackage.jd1 jd1Var12;
        defpackage.jd1 jd1Var13;
        java.util.Map map3;
        defpackage.e6 e6Var3;
        defpackage.to2 to2Var3;
        k80Var.d0(-1476019057);
        int i3 = i | (k80Var.h(vu2Var) ? 4 : 2) | (k80Var.h(obj) ? 32 : 16) | 316370304;
        int i4 = 6 | (k80Var.h(jd1Var5) ? ' ' : (char) 16);
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && k80Var.E()) {
            k80Var.V();
            to2Var3 = to2Var;
            e6Var3 = e6Var;
            map3 = map;
            jd1Var12 = jd1Var;
            jd1Var13 = jd1Var2;
            jd1Var10 = jd1Var3;
            jd1Var11 = jd1Var4;
        } else {
            k80Var.X();
            if ((i & 1) == 0 || k80Var.B()) {
                e6Var2 = defpackage.d6.i;
                jd1Var6 = defpackage.d5.O;
                jd1Var7 = defpackage.d5.P;
                to2Var2 = defpackage.qo2.f;
                i2 = i3 & (-2113929217);
                jd1Var8 = jd1Var6;
                map2 = defpackage.n01.f;
                jd1Var9 = jd1Var7;
            } else {
                k80Var.V();
                to2Var2 = to2Var;
                e6Var2 = e6Var;
                map2 = map;
                jd1Var6 = jd1Var;
                jd1Var7 = jd1Var2;
                jd1Var9 = jd1Var4;
                i2 = i3 & (-2113929217);
                jd1Var8 = jd1Var3;
            }
            k80Var.q();
            boolean zF = ((i4 & 112) == 32) | k80Var.f(null) | k80Var.f(obj);
            java.lang.Object objP = k80Var.P();
            if (zF || objP == defpackage.z70.a) {
                defpackage.tu2 tu2Var = new defpackage.tu2(vu2Var.v, obj, map2);
                jd1Var5.invoke(tu2Var);
                objP = tu2Var.c();
                k80Var.l0(objP);
            }
            defpackage.jd1 jd1Var14 = jd1Var6;
            defpackage.jd1 jd1Var15 = jd1Var8;
            defpackage.jd1 jd1Var16 = jd1Var9;
            defpackage.to2 to2Var4 = to2Var2;
            defpackage.jd1 jd1Var17 = jd1Var7;
            l(vu2Var, (defpackage.su2) objP, to2Var4, e6Var2, jd1Var14, jd1Var17, jd1Var15, jd1Var16, k80Var, (i2 & 8078) | 100884480);
            jd1Var10 = jd1Var15;
            jd1Var11 = jd1Var16;
            jd1Var12 = jd1Var14;
            jd1Var13 = jd1Var17;
            map3 = map2;
            e6Var3 = e6Var2;
            to2Var3 = to2Var4;
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.wu2(vu2Var, obj, to2Var3, e6Var3, map3, jd1Var12, jd1Var13, jd1Var10, jd1Var11, jd1Var5, i);
        }
    }

    public static final boolean n(defpackage.ls2 ls2Var) {
        return ((java.lang.Boolean) ls2Var.getValue()).booleanValue();
    }

    public static final long o(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final void p(defpackage.k80 k80Var, defpackage.to2 to2Var) {
        defpackage.ul ulVar = defpackage.ul.f;
        long j = k80Var.T;
        int i = (int) (j ^ (j >>> 32));
        defpackage.to2 to2VarD = defpackage.uj2.D(k80Var, to2Var);
        defpackage.y53 y53VarL = k80Var.l();
        defpackage.w70.b.getClass();
        defpackage.j90 j90Var = defpackage.v70.b;
        k80Var.f0();
        if (k80Var.S) {
            k80Var.k(j90Var);
        } else {
            k80Var.o0();
        }
        defpackage.ht1.J(k80Var, defpackage.v70.f, ulVar);
        defpackage.ht1.J(k80Var, defpackage.v70.e, y53VarL);
        defpackage.ht1.J(k80Var, defpackage.v70.d, to2VarD);
        defpackage.qf qfVar = defpackage.v70.g;
        if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(i))) {
            defpackage.ms1.G(i, k80Var, i, qfVar);
        }
        k80Var.p(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.hd1 r23, defpackage.to2 r24, defpackage.hd1 r25, boolean r26, defpackage.c30 r27, defpackage.z20 r28, defpackage.b30 r29, defpackage.y20 r30, defpackage.a30 r31, defpackage.q60 r32, defpackage.k80 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.q(hd1, to2, hd1, boolean, c30, z20, b30, y20, a30, q60, k80, int, int):void");
    }

    public static final void r(final defpackage.us4 us4Var, boolean z, defpackage.hd1 hd1Var, final defpackage.hd1 hd1Var2, final defpackage.hd1 hd1Var3, defpackage.k80 k80Var, int i) {
        int i2;
        hd1Var.getClass();
        hd1Var2.getClass();
        hd1Var3.getClass();
        k80Var.d0(2126527507);
        int i3 = i | (k80Var.f(us4Var) ? 4 : 2) | (k80Var.g(z) ? 32 : 16) | (k80Var.h(hd1Var3) ? 16384 : 8192);
        if (k80Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            final android.content.Context context = (android.content.Context) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            java.lang.Object objP = k80Var.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                objP = defpackage.ft4.e0(k80Var);
                k80Var.l0(objP);
            }
            final defpackage.nf0 nf0Var = (defpackage.nf0) objP;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == cjVar) {
                objP2 = defpackage.vs4.b(context);
                k80Var.l0(objP2);
            }
            final java.lang.String str = (java.lang.String) objP2;
            java.lang.Object objP3 = k80Var.P();
            if (objP3 == cjVar) {
                objP3 = defpackage.or1.C(defpackage.r63.f);
                k80Var.l0(objP3);
            }
            final defpackage.ls2 ls2Var = (defpackage.ls2) objP3;
            java.lang.Object objP4 = k80Var.P();
            if (objP4 == cjVar) {
                objP4 = new defpackage.w33(0.0f);
                k80Var.l0(objP4);
            }
            final defpackage.w33 w33Var = (defpackage.w33) objP4;
            java.lang.Object objP5 = k80Var.P();
            if (objP5 == cjVar) {
                objP5 = defpackage.or1.C(null);
                k80Var.l0(objP5);
            }
            final defpackage.ls2 ls2Var2 = (defpackage.ls2) objP5;
            java.lang.Object objP6 = k80Var.P();
            if (objP6 == cjVar) {
                objP6 = defpackage.or1.C("");
                k80Var.l0(objP6);
            }
            final defpackage.ls2 ls2Var3 = (defpackage.ls2) objP6;
            java.lang.Object objP7 = k80Var.P();
            if (objP7 == cjVar) {
                objP7 = defpackage.or1.C(null);
                k80Var.l0(objP7);
            }
            final defpackage.ls2 ls2Var4 = (defpackage.ls2) objP7;
            java.lang.Object objP8 = k80Var.P();
            if (objP8 == cjVar) {
                objP8 = defpackage.ms1.t(k80Var);
            }
            final defpackage.ta1 ta1Var = (defpackage.ta1) objP8;
            java.lang.Object objP9 = k80Var.P();
            if (objP9 == cjVar) {
                objP9 = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP9);
            }
            final defpackage.ls2 ls2Var5 = (defpackage.ls2) objP9;
            defpackage.r63 r63Var = (defpackage.r63) ls2Var.getValue();
            java.lang.Object objP10 = k80Var.P();
            if (objP10 == cjVar) {
                i2 = i3;
                objP10 = new defpackage.s14(ls2Var5, ta1Var, (defpackage.sd0) null);
                k80Var.l0(objP10);
            } else {
                i2 = i3;
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP10, r63Var);
            java.lang.Object objP11 = k80Var.P();
            int i4 = 3;
            if (objP11 == cjVar) {
                objP11 = new defpackage.sd2(hd1Var, ls2Var, i4);
                k80Var.l0(objP11);
            }
            defpackage.f24.a(z, (defpackage.hd1) objP11, null, defpackage.q8.n0(-1761864856, new defpackage.yd1() { // from class: ts4
                /* JADX WARN: Removed duplicated region for block: B:101:0x0440  */
                /* JADX WARN: Removed duplicated region for block: B:102:0x0444  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x045f  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x049c  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x04b6  */
                @Override // defpackage.yd1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
                    /*
                        Method dump skipped, instructions count: 2183
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ts4.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k80Var), k80Var, ((i2 >> 3) & 14) | 3072, 4);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.cl(us4Var, z, hd1Var, hd1Var2, hd1Var3, i);
        }
    }

    public static final void s(defpackage.k80 k80Var, int i) {
        defpackage.k80 k80Var2;
        k80Var.d0(1194362041);
        if (k80Var.S(i & 1, i != 0)) {
            android.content.Context context = (android.content.Context) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj = defpackage.z70.a;
            if (objP == obj) {
                objP = defpackage.or1.C(null);
                k80Var.l0(objP);
            }
            defpackage.ls2 ls2Var = (defpackage.ls2) objP;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == obj) {
                objP2 = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP2);
            }
            defpackage.ls2 ls2Var2 = (defpackage.ls2) objP2;
            boolean zH = k80Var.h(context);
            java.lang.Object objP3 = k80Var.P();
            if (zH || objP3 == obj) {
                objP3 = new defpackage.lf(context, ls2Var, ls2Var2, (defpackage.sd0) null);
                k80Var.l0(objP3);
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP3, defpackage.as4.a);
            defpackage.us4 us4Var = (defpackage.us4) ls2Var.getValue();
            if (us4Var == null) {
                k80Var.b0(1731439718);
                k80Var.p(false);
                k80Var2 = k80Var;
            } else {
                k80Var.b0(1731439719);
                boolean zBooleanValue = ((java.lang.Boolean) ls2Var2.getValue()).booleanValue();
                java.lang.Object objP4 = k80Var.P();
                if (objP4 == obj) {
                    objP4 = new defpackage.ng(ls2Var2, 14);
                    k80Var.l0(objP4);
                }
                defpackage.hd1 hd1Var = (defpackage.hd1) objP4;
                java.lang.Object objP5 = k80Var.P();
                if (objP5 == obj) {
                    objP5 = new defpackage.dz3(4);
                    k80Var.l0(objP5);
                }
                defpackage.hd1 hd1Var2 = (defpackage.hd1) objP5;
                boolean zF = k80Var.f(us4Var);
                java.lang.Object objP6 = k80Var.P();
                if (zF || objP6 == obj) {
                    objP6 = new defpackage.uk(22, us4Var);
                    k80Var.l0(objP6);
                }
                k80Var2 = k80Var;
                r(us4Var, zBooleanValue, hd1Var, hd1Var2, (defpackage.hd1) objP6, k80Var2, 3456);
                k80Var2.p(false);
            }
        } else {
            k80Var2 = k80Var;
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.gv3(i);
        }
    }

    public static final void t(final org.moontechlab.selenetv.model.VideoInfo videoInfo, final defpackage.lv4 lv4Var, final defpackage.hd1 hd1Var, final defpackage.to2 to2Var, boolean z, defpackage.mv4 mv4Var, defpackage.hd1 hd1Var2, java.lang.String str, defpackage.v64 v64Var, boolean z2, defpackage.k80 k80Var, final int i, final int i2) {
        final boolean z3;
        int i3;
        defpackage.hd1 hd1Var3;
        int i4;
        java.lang.String str2;
        int i5;
        java.lang.Integer num;
        int i6;
        int i7;
        int i8;
        final defpackage.mv4 mv4Var2;
        final defpackage.v64 v64Var2;
        final boolean z4;
        final java.lang.String str3;
        final defpackage.hd1 hd1Var4;
        defpackage.mv4 mv4Var3;
        java.lang.Object zq3Var;
        java.lang.String str4;
        float fH;
        java.lang.Object jv4Var;
        java.lang.Boolean bool;
        defpackage.hd1 hd1Var5;
        defpackage.mv4 mv4Var4;
        float f;
        defpackage.hd1 hd1Var6;
        java.lang.Object obj;
        float f2;
        int i9;
        defpackage.ls2 ls2Var;
        defpackage.ls2 ls2Var2;
        int i10;
        java.lang.Object obj2;
        defpackage.ls2 ls2Var3;
        defpackage.wd wdVar;
        defpackage.l94 l94Var;
        java.lang.String strB;
        defpackage.hd1 hd1Var7;
        org.moontechlab.selenetv.model.VideoInfo videoInfo2 = videoInfo;
        videoInfo2.getClass();
        java.lang.String str5 = videoInfo2.a;
        lv4Var.getClass();
        hd1Var.getClass();
        k80Var.d0(-40069167);
        int i11 = i | (k80Var.h(videoInfo2) ? 4 : 2);
        if ((i & 48) == 0) {
            i11 |= k80Var.d(lv4Var.ordinal()) ? 32 : 16;
        }
        int i12 = i11 | (k80Var.h(hd1Var) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var.f(to2Var) ? 2048 : 1024);
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 = i12 | 24576;
            z3 = z;
        } else {
            z3 = z;
            i3 = i12 | (k80Var.g(z3) ? 16384 : 8192);
        }
        int i14 = i2 & 32;
        int i15 = 196608;
        if (i14 != 0) {
            i3 |= i15;
        } else if ((i & 196608) == 0) {
            i15 = k80Var.d(mv4Var == null ? -1 : mv4Var.ordinal()) ? 131072 : 65536;
            i3 |= i15;
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i4 = i3 | 1572864;
            hd1Var3 = hd1Var2;
        } else {
            hd1Var3 = hd1Var2;
            i4 = i3 | (k80Var.h(hd1Var3) ? 1048576 : 524288);
        }
        int i17 = i2 & io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE;
        if (i17 != 0) {
            i5 = i4 | 12582912;
            str2 = str;
        } else {
            str2 = str;
            i5 = i4 | (k80Var.f(str2) ? 8388608 : 4194304);
        }
        int i18 = i2 & 256;
        if (i18 != 0) {
            i6 = i5 | 100663296;
            num = 0;
        } else {
            num = 0;
            i6 = i5 | (k80Var.f(v64Var) ? 67108864 : 33554432);
        }
        int i19 = i2 & 512;
        if (i19 != 0) {
            i8 = i6 | 805306368;
            i7 = i19;
        } else {
            i7 = i19;
            i8 = i6 | (k80Var.g(z2) ? 536870912 : 268435456);
        }
        int i20 = i8;
        if (k80Var.S(i20 & 1, (i8 & 306783379) != 306783378)) {
            boolean z5 = i13 != 0 ? false : z3;
            defpackage.mv4 mv4Var5 = i14 != 0 ? defpackage.mv4.LARGE : mv4Var;
            if (i16 != 0) {
                hd1Var3 = null;
            }
            java.lang.String str6 = i17 != 0 ? "" : str2;
            defpackage.v64 v64Var3 = i18 != 0 ? null : v64Var;
            boolean z6 = i7 != 0 ? false : z2;
            final float f3 = mv4Var5.f;
            float f4 = mv4Var5.i;
            float f5 = mv4Var5.t;
            final float f6 = f5 * 0.67f;
            final long jA = defpackage.nq1.A(mv4Var5.v);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj3 = defpackage.z70.a;
            if (objP == obj3) {
                objP = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP);
            }
            defpackage.ls2 ls2Var4 = (defpackage.ls2) objP;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == obj3) {
                objP2 = defpackage.or1.C(num);
                k80Var.l0(objP2);
            }
            defpackage.ls2 ls2Var5 = (defpackage.ls2) objP2;
            java.lang.Object objP3 = k80Var.P();
            if (objP3 == obj3) {
                objP3 = defpackage.or1.C(num);
                k80Var.l0(objP3);
            }
            defpackage.ls2 ls2Var6 = (defpackage.ls2) objP3;
            java.lang.Object objP4 = k80Var.P();
            if (objP4 == obj3) {
                objP4 = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP4);
            }
            defpackage.ls2 ls2Var7 = (defpackage.ls2) objP4;
            k80Var.b0(148271833);
            try {
                zq3Var = (defpackage.ri4) k80Var.j(defpackage.si4.a);
                mv4Var3 = mv4Var5;
            } catch (java.lang.Throwable th) {
                mv4Var3 = mv4Var5;
                zq3Var = new defpackage.zq3(th);
            }
            k80Var.p(false);
            if (zq3Var instanceof defpackage.zq3) {
                zq3Var = null;
            }
            defpackage.ri4 ri4Var = (defpackage.ri4) zq3Var;
            int iB0 = ((defpackage.yo0) k80Var.j(defpackage.k90.h)).b0(30.0f);
            long j = videoInfo2.j;
            if (j > 0) {
                str4 = str5;
                fH = H(videoInfo2.i / j, 0.0f, 1.0f);
            } else {
                str4 = str5;
                fH = 0.0f;
            }
            defpackage.l94 l94VarB = defpackage.ae.b(((java.lang.Boolean) ls2Var4.getValue()).booleanValue() ? 1.1f : 1.0f, defpackage.q8.s0(0.6f, 400.0f, null, 4), "video_card_scale", k80Var, 3120, 20);
            java.lang.Object objP5 = k80Var.P();
            if (objP5 == obj3) {
                objP5 = defpackage.u22.a(0.0f);
                k80Var.l0(objP5);
            }
            defpackage.wd wdVar2 = (defpackage.wd) objP5;
            boolean zD = k80Var.d(((java.lang.Number) ls2Var5.getValue()).intValue()) | k80Var.g(((java.lang.Boolean) ls2Var4.getValue()).booleanValue()) | k80Var.g(((java.lang.Boolean) ls2Var7.getValue()).booleanValue()) | k80Var.d(((java.lang.Number) ls2Var6.getValue()).intValue());
            java.lang.Object objP6 = k80Var.P();
            if (zD || objP6 == obj3) {
                objP6 = defpackage.or1.r(new defpackage.gk1(ls2Var4, ls2Var7, ls2Var5, ls2Var6));
                k80Var.l0(objP6);
            }
            defpackage.l94 l94Var2 = (defpackage.l94) objP6;
            java.lang.Boolean bool2 = (java.lang.Boolean) ls2Var4.getValue();
            bool2.getClass();
            java.lang.Boolean bool3 = (java.lang.Boolean) ls2Var7.getValue();
            bool3.getClass();
            boolean zH = ((i20 & 458752) == 131072) | k80Var.h(ri4Var) | k80Var.h(videoInfo2);
            java.lang.Object objP7 = k80Var.P();
            if (zH || objP7 == obj3) {
                bool = bool3;
                hd1Var5 = hd1Var3;
                mv4Var4 = mv4Var3;
                f = f5;
                hd1Var6 = null;
                obj = obj3;
                f2 = f4;
                i9 = i20;
                ls2Var = ls2Var5;
                ls2Var2 = ls2Var6;
                i10 = iB0;
                jv4Var = new defpackage.jv4(ri4Var, videoInfo, mv4Var4, ls2Var4, ls2Var7, ls2Var, null);
                obj2 = ri4Var;
                ls2Var3 = ls2Var4;
                videoInfo2 = videoInfo;
                k80Var.l0(jv4Var);
            } else {
                obj2 = ri4Var;
                jv4Var = objP7;
                bool = bool3;
                ls2Var3 = ls2Var4;
                hd1Var5 = hd1Var3;
                mv4Var4 = mv4Var3;
                f = f5;
                hd1Var6 = null;
                obj = obj3;
                f2 = f4;
                i9 = i20;
                ls2Var = ls2Var5;
                ls2Var2 = ls2Var6;
                i10 = iB0;
            }
            defpackage.ft4.U(bool2, bool, (defpackage.xd1) jv4Var, k80Var);
            boolean zH2 = k80Var.h(obj2) | k80Var.h(videoInfo2);
            java.lang.Object objP8 = k80Var.P();
            if (zH2 || objP8 == obj) {
                objP8 = new defpackage.ye(obj2, 15, videoInfo2);
                k80Var.l0(objP8);
            }
            java.lang.String str7 = str4;
            defpackage.ft4.P(str7, (defpackage.jd1) objP8, k80Var);
            java.lang.Boolean bool4 = (java.lang.Boolean) l94Var2.getValue();
            bool4.getClass();
            boolean zF = k80Var.f(l94Var2) | k80Var.d(i10) | k80Var.h(wdVar2);
            java.lang.Object objP9 = k80Var.P();
            if (zF || objP9 == obj) {
                objP9 = new defpackage.kv4(i10, wdVar2, l94Var2, ls2Var, null);
                wdVar = wdVar2;
                l94Var = l94Var2;
                k80Var.l0(objP9);
            } else {
                l94Var = l94Var2;
                wdVar = wdVar2;
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP9, bool4);
            defpackage.wr0 wr0Var = (defpackage.wr0) k80Var.j(defpackage.vr0.a);
            java.lang.String str8 = videoInfo2.b;
            str6.getClass();
            str8.getClass();
            str7.getClass();
            if (str6.length() > 0) {
                strB = str6 + "|" + str8 + "+" + str7;
            } else {
                strB = defpackage.ms1.B(str8, "+", str7);
            }
            if (hd1Var5 == null) {
                k80Var.b0(304441728);
                k80Var.p(false);
                hd1Var7 = hd1Var5;
            } else {
                k80Var.b0(304441729);
                hd1Var7 = hd1Var5;
                boolean zF2 = k80Var.f(hd1Var7);
                java.lang.Object objP10 = k80Var.P();
                if (zF2 || objP10 == obj) {
                    objP10 = new defpackage.uk(23, hd1Var7);
                    k80Var.l0(objP10);
                }
                k80Var.p(false);
                hd1Var6 = (defpackage.hd1) objP10;
            }
            defpackage.to2 to2VarA = defpackage.qo2.f;
            if (wr0Var != null && wr0Var.a(strB)) {
                to2VarA = androidx.compose.ui.focus.a.a(to2VarA, wr0Var.b);
            }
            defpackage.to2 to2VarL = androidx.compose.foundation.layout.d.l(to2Var.f(to2VarA), f3);
            boolean zH3 = k80Var.h(wr0Var) | k80Var.f(strB);
            java.lang.Object objP11 = k80Var.P();
            final defpackage.mv4 mv4Var6 = mv4Var4;
            int i21 = 3;
            if (zH3 || objP11 == obj) {
                objP11 = new defpackage.yc0(i21, wr0Var, strB, ls2Var3);
                k80Var.l0(objP11);
            }
            defpackage.to2 to2VarC = androidx.compose.ui.focus.a.c(to2VarL, (defpackage.jd1) objP11);
            boolean zF3 = k80Var.f(l94VarB);
            java.lang.Object objP12 = k80Var.P();
            if (zF3 || objP12 == obj) {
                objP12 = new defpackage.w61(l94VarB, 3);
                k80Var.l0(objP12);
            }
            defpackage.to2 to2VarA2 = androidx.compose.ui.graphics.a.a(to2VarC, (defpackage.jd1) objP12);
            defpackage.b30 b30VarH = defpackage.d6.h(1.0f);
            defpackage.gs3 gs3Var = defpackage.hs3.a;
            final float f7 = f;
            final defpackage.ls2 ls2Var8 = ls2Var3;
            final defpackage.wd wdVar3 = wdVar;
            defpackage.gs3 gs3Var2 = new defpackage.gs3(new defpackage.pw0(f7), new defpackage.pw0(f7), new defpackage.pw0(0.0f), new defpackage.pw0(0.0f));
            defpackage.c30 c30Var = new defpackage.c30(gs3Var2, gs3Var2, gs3Var2, gs3Var2, gs3Var2);
            long j2 = defpackage.g40.f;
            java.lang.Object obj4 = obj;
            java.lang.String str9 = str6;
            defpackage.hd1 hd1Var8 = hd1Var7;
            defpackage.z20 z20VarE = defpackage.d6.e(j2, j2, 0L, 0L, k80Var, 390, 250);
            boolean zH4 = k80Var.h(wr0Var) | k80Var.f(strB) | ((i9 & 896) == 256);
            java.lang.Object objP13 = k80Var.P();
            if (zH4 || objP13 == obj4) {
                objP13 = new defpackage.wt(5, wr0Var, strB, hd1Var);
                k80Var.l0(objP13);
            }
            defpackage.hd1 hd1Var9 = (defpackage.hd1) objP13;
            final defpackage.l94 l94Var3 = l94Var;
            final boolean z7 = z6;
            final defpackage.ls2 ls2Var9 = ls2Var2;
            final boolean z8 = z5;
            final defpackage.v64 v64Var4 = v64Var3;
            final float f8 = f2;
            final float f9 = fH;
            q(hd1Var9, to2VarA2, hd1Var6, false, c30Var, z20VarE, b30VarH, null, null, defpackage.q8.n0(756702034, new defpackage.yd1() { // from class: hv4
                /* JADX WARN: Removed duplicated region for block: B:125:0x059b A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:131:0x05a6  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x05b1  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x05ba  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x05c5  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x05e4  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x060c A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:167:0x06ef  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x076a  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x0772  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0782  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x0790  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x07c0  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x07c8  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x081a  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x082a  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:226:0x0903  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x0938  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
                /* JADX WARN: Removed duplicated region for block: B:282:0x0ba1  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0132  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x01b3  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x01ba  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01d0  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x020f  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0325  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0345  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0448  */
                @Override // defpackage.yd1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r75, java.lang.Object r76, java.lang.Object r77) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 2987
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hv4.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k80Var), k80Var, 0, 1816);
            z3 = z8;
            v64Var2 = v64Var4;
            z4 = z7;
            mv4Var2 = mv4Var6;
            hd1Var4 = hd1Var8;
            str3 = str9;
        } else {
            k80Var.V();
            mv4Var2 = mv4Var;
            v64Var2 = v64Var;
            z4 = z2;
            str3 = str2;
            hd1Var4 = hd1Var3;
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1() { // from class: iv4
                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    ((java.lang.Integer) obj6).getClass();
                    defpackage.xr1.t(videoInfo, lv4Var, hd1Var, to2Var, z3, mv4Var2, hd1Var4, str3, v64Var2, z4, (defpackage.k80) obj5, defpackage.st1.G(i | 1), i2);
                    return defpackage.as4.a;
                }
            };
        }
    }

    public static final int u(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    public static final boolean v(long j) {
        return !defpackage.nr1.b(j, 9223372034707292159L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:34|35)|(1:(14:45|47|(1:49)(1:50)|51|(1:53)(1:54)|55|56|86|57|58|93|59|(8:62|18|90|63|64|88|30|(4:32|34|35|(0)(3:37|38|(1:41))))|81)(1:46))(0)|40|47|(0)(0)|51|(0)(0)|55|56|86|57|58|93|59|(0)|81) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: xt1 -> 0x016f, TryCatch #1 {xt1 -> 0x016f, blocks: (B:30:0x00a8, B:32:0x00ac, B:34:0x00b6, B:47:0x00dd, B:51:0x010e, B:55:0x0117), top: B:88:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0153 -> B:18:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.s92 r29, int r30, defpackage.yo0 r31, defpackage.ud0 r32) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.w(s92, int, yo0, ud0):java.lang.Object");
    }

    public static final boolean x(boolean z, defpackage.s92 s92Var) {
        if (z) {
            if (s92Var.b() > 0) {
                return true;
            }
            return s92Var.b() == 0 && ((defpackage.x33) s92Var.b.e.c).j() > 0;
        }
        if (s92Var.b() < 0) {
            return true;
        }
        return s92Var.b() == 0 && ((defpackage.x33) s92Var.b.e.c).j() < 0;
    }

    public static final void y(defpackage.ih ihVar, java.lang.String str) {
        int i = 0;
        while (i < str.length()) {
            int iR0 = defpackage.va4.r0(str, "**", i, false, 4);
            java.util.List listM = defpackage.pp4.M(java.lang.Integer.valueOf(iR0), java.lang.Integer.valueOf(defpackage.va4.r0(str, "`", i, false, 4)));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listM) {
                if (((java.lang.Number) obj).intValue() >= 0) {
                    arrayList.add(obj);
                }
            }
            java.lang.Integer num = (java.lang.Integer) defpackage.y30.H0(arrayList);
            if (num == null) {
                ihVar.b(str.substring(i));
                return;
            }
            ihVar.b(str.substring(i, num.intValue()));
            if (num.intValue() == iR0) {
                int iR02 = defpackage.va4.r0(str, "**", num.intValue() + 2, false, 4);
                if (iR02 < 0) {
                    ihVar.b(str.substring(num.intValue()));
                    return;
                }
                int iD = ihVar.d(new defpackage.w64(defpackage.g40.c, 0L, defpackage.jc1.z, (defpackage.hc1) null, (defpackage.ic1) null, (defpackage.il0) null, (java.lang.String) null, 0L, (defpackage.cq) null, (defpackage.xh4) null, (defpackage.xf2) null, 0L, (defpackage.mg4) null, (defpackage.w14) null, 65530));
                try {
                    ihVar.b(str.substring(num.intValue() + 2, iR02));
                    ihVar.c(iD);
                    i = iR02 + 2;
                } catch (java.lang.Throwable th) {
                    ihVar.c(iD);
                    throw th;
                }
            } else {
                int iR03 = defpackage.va4.r0(str, "`", num.intValue() + 1, false, 4);
                if (iR03 < 0) {
                    ihVar.b(str.substring(num.intValue()));
                    return;
                } else {
                    ihVar.b(str.substring(num.intValue() + 1, iR03));
                    i = iR03 + 1;
                }
            }
        }
    }

    public static float z(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }
}
