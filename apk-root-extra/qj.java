package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements defpackage.xd1 {
    public final /* synthetic */ int f;

    public /* synthetic */ qj(int i) {
        this.f = i;
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.zh zhVar;
        java.lang.Object objA;
        int i2 = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        int i3 = 0;
        switch (i2) {
            case 0:
                ((java.lang.Integer) obj2).getClass();
                defpackage.uj2.a((defpackage.k80) obj, defpackage.st1.G(1));
                return as4Var;
            case 1:
                return java.lang.Integer.valueOf(java.lang.Math.round((1.0f + (((defpackage.k42) obj2) == defpackage.k42.f ? -1.0f : 1.0f)) * (((java.lang.Integer) obj).intValue() / 2.0f)));
            case 2:
                defpackage.k80 k80Var = (defpackage.k80) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (k80Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    defpackage.uj2.a(k80Var, 0);
                } else {
                    k80Var.V();
                }
                return as4Var;
            case 3:
                defpackage.x92 x92Var = (defpackage.x92) obj2;
                return defpackage.pp4.M(java.lang.Integer.valueOf(((defpackage.x33) x92Var.e.b).j()), java.lang.Integer.valueOf(((defpackage.x33) x92Var.e.c).j()));
            case 4:
                java.util.Map mapD = ((defpackage.da2) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 5:
                ((java.lang.Integer) obj2).getClass();
                defpackage.xr1.g((defpackage.k80) obj, defpackage.st1.G(1));
                return as4Var;
            case 6:
                int i4 = 8;
                defpackage.pt3 pt3Var = (defpackage.pt3) obj2;
                java.util.Map map = pt3Var.f;
                defpackage.es2 es2Var = pt3Var.i;
                java.lang.Object[] objArr = es2Var.b;
                java.lang.Object[] objArr2 = es2Var.c;
                long[] jArr = es2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    java.lang.Object obj3 = objArr[i8];
                                    java.util.Map mapD2 = ((defpackage.rt3) objArr2[i8]).d();
                                    if (mapD2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD2);
                                    }
                                }
                                j >>= i4;
                            }
                            i = i4;
                            if (i6 == i) {
                            }
                        } else {
                            i = i4;
                        }
                        if (i5 != length) {
                            i5++;
                            i4 = i;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 7:
                return obj2;
            case 8:
                defpackage.kh khVar = (defpackage.kh) obj2;
                return defpackage.pp4.j(khVar.i, defpackage.ju3.a(khVar.f, defpackage.ju3.a, (defpackage.nt3) obj));
            case 9:
                return java.lang.Integer.valueOf(((defpackage.mg4) obj2).a);
            case 10:
                defpackage.xh4 xh4Var = (defpackage.xh4) obj2;
                return defpackage.pp4.j(java.lang.Float.valueOf(xh4Var.a), java.lang.Float.valueOf(xh4Var.b));
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                defpackage.nt3 nt3Var = (defpackage.nt3) obj;
                defpackage.yh4 yh4Var = (defpackage.yh4) obj2;
                defpackage.ij4 ij4Var = new defpackage.ij4(yh4Var.a);
                defpackage.iu3 iu3Var = defpackage.ju3.q;
                return defpackage.pp4.j(defpackage.ju3.a(ij4Var, iu3Var, nt3Var), defpackage.ju3.a(new defpackage.ij4(yh4Var.b), iu3Var, nt3Var));
            case 12:
                return java.lang.Integer.valueOf(((defpackage.jc1) obj2).f);
            case 13:
                defpackage.cc2 cc2Var = (defpackage.cc2) obj2;
                return defpackage.pp4.j(cc2Var.b(), defpackage.ju3.a(cc2Var.a(), defpackage.ju3.i, (defpackage.nt3) obj));
            case 14:
                return java.lang.Float.valueOf(((defpackage.cq) obj2).a);
            case 15:
                defpackage.nt3 nt3Var2 = (defpackage.nt3) obj;
                java.util.List list = (java.util.List) obj2;
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    arrayList.add(defpackage.ju3.a((defpackage.jh) list.get(i3), defpackage.ju3.b, nt3Var2));
                    i3++;
                }
                return arrayList;
            case 16:
                defpackage.xi4 xi4Var = (defpackage.xi4) obj2;
                return defpackage.pp4.j(java.lang.Integer.valueOf((int) (xi4Var.a >> 32)), java.lang.Integer.valueOf((int) (4294967295L & xi4Var.a)));
            case 17:
                defpackage.nt3 nt3Var3 = (defpackage.nt3) obj;
                defpackage.w14 w14Var = (defpackage.w14) obj2;
                return defpackage.pp4.j(defpackage.ju3.a(new defpackage.g40(w14Var.a), defpackage.ju3.p, nt3Var3), defpackage.ju3.a(new defpackage.qy2(w14Var.b), defpackage.ju3.r, nt3Var3), java.lang.Float.valueOf(w14Var.c));
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_AUDIO_RECONFIG /* 18 */:
                defpackage.ij4 ij4Var2 = (defpackage.ij4) obj2;
                return ij4Var2 == null ? false : defpackage.ij4.a(ij4Var2.a, defpackage.ij4.c) ? java.lang.Boolean.FALSE : defpackage.pp4.j(java.lang.Float.valueOf(defpackage.ij4.c(ij4Var2.a)), new defpackage.jj4(defpackage.ij4.b(ij4Var2.a)));
            case 19:
                defpackage.qy2 qy2Var = (defpackage.qy2) obj2;
                return qy2Var == null ? false : defpackage.qy2.b(qy2Var.a, 9205357640488583168L) ? java.lang.Boolean.FALSE : defpackage.pp4.j(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (qy2Var.a >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & qy2Var.a))));
            case 20:
                defpackage.nt3 nt3Var4 = (defpackage.nt3) obj;
                java.util.List list2 = ((defpackage.xf2) obj2).f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                int size2 = list2.size();
                while (i3 < size2) {
                    arrayList2.add(defpackage.ju3.a((defpackage.wf2) list2.get(i3), defpackage.ju3.t, nt3Var4));
                    i3++;
                }
                return arrayList2;
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_PLAYBACK_RESTART /* 21 */:
                return defpackage.cb1.T(((defpackage.wf2) obj2).a);
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_PROPERTY_CHANGE /* 22 */:
                defpackage.tb2 tb2Var = (defpackage.tb2) obj2;
                return defpackage.pp4.j(defpackage.qb2.a(tb2Var.a), defpackage.sb2.a(tb2Var.b), defpackage.rb2.a(tb2Var.c));
            case 23:
                defpackage.nt3 nt3Var5 = (defpackage.nt3) obj;
                defpackage.jh jhVar = (defpackage.jh) obj2;
                java.lang.Object obj4 = jhVar.a;
                if (obj4 instanceof defpackage.o33) {
                    zhVar = defpackage.zh.f;
                } else if (obj4 instanceof defpackage.w64) {
                    zhVar = defpackage.zh.i;
                } else if (obj4 instanceof defpackage.zu4) {
                    zhVar = defpackage.zh.t;
                } else if (obj4 instanceof defpackage.xs4) {
                    zhVar = defpackage.zh.u;
                } else if (obj4 instanceof defpackage.cc2) {
                    zhVar = defpackage.zh.v;
                } else if (obj4 instanceof defpackage.bc2) {
                    zhVar = defpackage.zh.w;
                } else {
                    if (!(obj4 instanceof defpackage.qa4)) {
                        defpackage.c.p();
                        return null;
                    }
                    zhVar = defpackage.zh.x;
                }
                switch (zhVar.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.o33) obj4, defpackage.ju3.g, nt3Var5);
                        break;
                    case 1:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.w64) obj4, defpackage.ju3.h, nt3Var5);
                        break;
                    case 2:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.zu4) obj4, defpackage.ju3.c, nt3Var5);
                        break;
                    case 3:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.xs4) obj4, defpackage.ju3.d, nt3Var5);
                        break;
                    case 4:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.cc2) obj4, defpackage.ju3.e, nt3Var5);
                        break;
                    case 5:
                        obj4.getClass();
                        objA = defpackage.ju3.a((defpackage.bc2) obj4, defpackage.ju3.f, nt3Var5);
                        break;
                    case 6:
                        obj4.getClass();
                        objA = ((defpackage.qa4) obj4).b();
                        break;
                    default:
                        defpackage.jc2.o();
                        return null;
                }
                return defpackage.pp4.j(zhVar, objA, java.lang.Integer.valueOf(jhVar.b), java.lang.Integer.valueOf(jhVar.c), jhVar.d);
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_QUEUE_OVERFLOW /* 24 */:
                defpackage.bc2 bc2Var = (defpackage.bc2) obj2;
                return defpackage.pp4.j(bc2Var.b(), defpackage.ju3.a(bc2Var.a(), defpackage.ju3.i, (defpackage.nt3) obj));
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_HOOK /* 25 */:
                return ((defpackage.zu4) obj2).a();
            case 26:
                return ((defpackage.xs4) obj2).a();
            case 27:
                defpackage.nt3 nt3Var6 = (defpackage.nt3) obj;
                defpackage.o33 o33Var = (defpackage.o33) obj2;
                defpackage.mf4 mf4Var = new defpackage.mf4(o33Var.a);
                defpackage.pg4 pg4Var = new defpackage.pg4(o33Var.b);
                java.lang.Object objA2 = defpackage.ju3.a(new defpackage.ij4(o33Var.c), defpackage.ju3.q, nt3Var6);
                defpackage.yh4 yh4Var2 = o33Var.d;
                defpackage.yh4 yh4Var3 = defpackage.yh4.c;
                java.lang.Object objA3 = defpackage.ju3.a(yh4Var2, defpackage.ju3.l, nt3Var6);
                java.lang.Object objA4 = defpackage.ju3.a(o33Var.e, defpackage.d34.L, nt3Var6);
                defpackage.tb2 tb2Var2 = o33Var.f;
                defpackage.tb2 tb2Var3 = defpackage.tb2.d;
                return defpackage.pp4.j(mf4Var, pg4Var, objA2, objA3, objA4, defpackage.ju3.a(tb2Var2, defpackage.ju3.u, nt3Var6), defpackage.ju3.a(new defpackage.ob2(o33Var.g), defpackage.d34.M, nt3Var6), new defpackage.cn1(o33Var.h), defpackage.ju3.a(o33Var.i, defpackage.d34.N, nt3Var6));
            case 28:
                defpackage.nt3 nt3Var7 = (defpackage.nt3) obj;
                defpackage.w64 w64Var = (defpackage.w64) obj2;
                defpackage.g40 g40Var = new defpackage.g40(w64Var.a.b());
                defpackage.iu3 iu3Var2 = defpackage.ju3.p;
                java.lang.Object objA5 = defpackage.ju3.a(g40Var, iu3Var2, nt3Var7);
                defpackage.ij4 ij4Var3 = new defpackage.ij4(w64Var.b);
                defpackage.iu3 iu3Var3 = defpackage.ju3.q;
                java.lang.Object objA6 = defpackage.ju3.a(ij4Var3, iu3Var3, nt3Var7);
                defpackage.jc1 jc1Var = w64Var.c;
                defpackage.jc1 jc1Var2 = defpackage.jc1.i;
                java.lang.Object objA7 = defpackage.ju3.a(jc1Var, defpackage.ju3.m, nt3Var7);
                defpackage.hc1 hc1Var = w64Var.d;
                defpackage.ic1 ic1Var = w64Var.e;
                java.lang.String str = w64Var.g;
                java.lang.Object objA8 = defpackage.ju3.a(new defpackage.ij4(w64Var.h), iu3Var3, nt3Var7);
                java.lang.Object objA9 = defpackage.ju3.a(w64Var.i, defpackage.ju3.n, nt3Var7);
                java.lang.Object objA10 = defpackage.ju3.a(w64Var.j, defpackage.ju3.k, nt3Var7);
                defpackage.xf2 xf2Var = w64Var.k;
                defpackage.xf2 xf2Var2 = defpackage.xf2.t;
                java.lang.Object objA11 = defpackage.ju3.a(xf2Var, defpackage.ju3.s, nt3Var7);
                java.lang.Object objA12 = defpackage.ju3.a(new defpackage.g40(w64Var.l), iu3Var2, nt3Var7);
                java.lang.Object objA13 = defpackage.ju3.a(w64Var.m, defpackage.ju3.j, nt3Var7);
                defpackage.w14 w14Var2 = w64Var.n;
                defpackage.w14 w14Var3 = defpackage.w14.d;
                return defpackage.pp4.j(objA5, objA6, objA7, hc1Var, ic1Var, -1, str, objA8, objA9, objA10, objA11, objA12, objA13, defpackage.ju3.a(w14Var2, defpackage.ju3.o, nt3Var7));
            default:
                defpackage.nt3 nt3Var8 = (defpackage.nt3) obj;
                defpackage.qi4 qi4Var = (defpackage.qi4) obj2;
                defpackage.w64 w64VarD = qi4Var.d();
                defpackage.mw mwVar = defpackage.ju3.h;
                return defpackage.pp4.j(defpackage.ju3.a(w64VarD, mwVar, nt3Var8), defpackage.ju3.a(qi4Var.a(), mwVar, nt3Var8), defpackage.ju3.a(qi4Var.b(), mwVar, nt3Var8), defpackage.ju3.a(qi4Var.c(), mwVar, nt3Var8));
        }
    }

    public /* synthetic */ qj(int i, int i2) {
        this.f = i2;
    }
}
