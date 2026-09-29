package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class s7 extends defpackage.c42 implements defpackage.jd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(defpackage.at2 at2Var, defpackage.zs2 zs2Var) {
        super(1);
        this.f = 9;
        this.i = at2Var;
    }

    @Override // defpackage.jd1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.f;
        boolean z = true;
        int i2 = 0;
        defpackage.as4 as4Var = defpackage.as4.a;
        java.lang.Object obj2 = this.i;
        switch (i) {
            case 0:
                return java.lang.Boolean.valueOf(((defpackage.bb1) obj).B0(((defpackage.w91) obj2).a));
            case 1:
                android.content.res.Configuration configuration = new android.content.res.Configuration((android.content.res.Configuration) obj);
                defpackage.n90 n90Var = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a;
                ((defpackage.ls2) obj2).setValue(configuration);
                return as4Var;
            case 2:
                return new defpackage.s8(i2, (defpackage.lv0) obj2);
            case 3:
                defpackage.v63 v63Var = (defpackage.v63) obj;
                java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    v63Var.g((defpackage.w63) arrayList.get(i3), 0, 0, 0.0f);
                }
                return as4Var;
            case 4:
                if (defpackage.wf1.b.compareAndSet(false, true)) {
                    ((defpackage.ru) obj2).mo0trySendJP2dKIU(as4Var);
                }
                return as4Var;
            case 5:
                defpackage.wx0 wx0Var = (defpackage.wx0) obj;
                defpackage.dg1 dg1Var = (defpackage.dg1) obj2;
                defpackage.bb bbVar = dg1Var.l;
                if (dg1Var.n && dg1Var.w && bbVar != null) {
                    defpackage.oj ojVarW = wx0Var.W();
                    long jY = ojVarW.y();
                    ojVarW.t().g();
                    try {
                        ((defpackage.oj) ((defpackage.p5) ojVarW.i).i).t().m(bbVar);
                        dg1Var.c(wx0Var);
                    } finally {
                        ojVarW.t().q();
                        ojVarW.G(jY);
                    }
                } else {
                    dg1Var.c(wx0Var);
                }
                return as4Var;
            case 6:
                defpackage.wx0 wx0Var2 = (defpackage.wx0) obj;
                defpackage.jy jyVarT = wx0Var2.W().t();
                defpackage.xd1 xd1Var = ((defpackage.fg1) obj2).u;
                if (xd1Var != null) {
                    xd1Var.invoke(jyVarT, (defpackage.dg1) wx0Var2.W().t);
                }
                return as4Var;
            case 7:
                defpackage.mt4 mt4Var = (defpackage.mt4) obj;
                defpackage.rg1 rg1Var = (defpackage.rg1) obj2;
                rg1Var.g(mt4Var);
                defpackage.jd1 jd1Var = rg1Var.i;
                if (jd1Var != null) {
                    jd1Var.invoke(mt4Var);
                }
                return as4Var;
            case 8:
                defpackage.fz3 fz3Var = (defpackage.fz3) obj;
                defpackage.y12[] y12VarArr = defpackage.pz3.a;
                fz3Var.f(defpackage.nz3.a, defpackage.pp4.L((java.lang.String) obj2));
                defpackage.pz3.b(fz3Var);
                return as4Var;
            case 9:
                defpackage.at2 at2Var = (defpackage.at2) obj2;
                defpackage.at2.h.set(at2Var, null);
                at2Var.g(null);
                return as4Var;
            case 10:
                ((java.lang.String) obj).getClass();
                return java.lang.Boolean.valueOf(!((defpackage.nu2) obj2).c().contains(r12));
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                defpackage.vu2 vu2VarG = defpackage.or1.g((android.content.Context) obj2);
                java.util.LinkedHashMap linkedHashMap = vu2VarG.n;
                if (bundle != null) {
                    bundle.setClassLoader(vu2VarG.a.getClassLoader());
                    vu2VarG.d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    vu2VarG.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            vu2VarG.m.put(java.lang.Integer.valueOf(intArray[i4]), stringArrayList.get(i5));
                            i4++;
                            i5++;
                        }
                    }
                    java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (java.lang.String str : stringArrayList2) {
                            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                            if (parcelableArray != null) {
                                str.getClass();
                                defpackage.ck ckVar = new defpackage.ck(parcelableArray.length);
                                int i6 = 0;
                                while (i6 < parcelableArray.length) {
                                    int i7 = i6 + 1;
                                    try {
                                        android.os.Parcelable parcelable = parcelableArray[i6];
                                        parcelable.getClass();
                                        ckVar.addLast((defpackage.bu2) parcelable);
                                        i6 = i7;
                                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                                        defpackage.c.u(e.getMessage());
                                        return null;
                                    }
                                }
                                linkedHashMap.put(str, ckVar);
                            }
                        }
                    }
                    vu2VarG.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return vu2VarG;
            case 12:
                java.lang.Object obj3 = (defpackage.fn4) obj;
                if (((defpackage.so2) obj3).f.E) {
                    ((defpackage.ym3) obj2).f = obj3;
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 13:
                ((defpackage.os2) obj2).b((defpackage.ro2) obj);
                return java.lang.Boolean.TRUE;
            case 14:
                ((java.util.List) obj).add((java.lang.Float) ((defpackage.e92) obj2).invoke());
                return true;
            case 15:
                ((defpackage.vz3) obj2).c();
                return as4Var;
            case 16:
                defpackage.hr3 hr3Var = (defpackage.hr3) obj;
                androidx.compose.ui.draw.ShadowGraphicsLayerElement shadowGraphicsLayerElement = (androidx.compose.ui.draw.ShadowGraphicsLayerElement) obj2;
                hr3Var.k(hr3Var.H.b() * shadowGraphicsLayerElement.f);
                hr3Var.l(shadowGraphicsLayerElement.i);
                hr3Var.d(shadowGraphicsLayerElement.t);
                hr3Var.c(shadowGraphicsLayerElement.u);
                hr3Var.m(shadowGraphicsLayerElement.v);
                return as4Var;
            default:
                defpackage.hr3 hr3Var2 = (defpackage.hr3) obj;
                defpackage.m34 m34Var = (defpackage.m34) obj2;
                hr3Var2.i(m34Var.F);
                hr3Var2.j(m34Var.G);
                hr3Var2.a(m34Var.H);
                hr3Var2.o(0.0f);
                hr3Var2.p(0.0f);
                hr3Var2.k(0.0f);
                hr3Var2.g(0.0f);
                float f = m34Var.I;
                if (hr3Var2.B != f) {
                    hr3Var2.f |= 2048;
                    hr3Var2.B = f;
                }
                hr3Var2.n(m34Var.J);
                hr3Var2.l(m34Var.K);
                hr3Var2.d(m34Var.L);
                hr3Var2.c(m34Var.M);
                hr3Var2.m(m34Var.N);
                hr3Var2.e(0);
                int i8 = m34Var.O;
                if (hr3Var2.J != i8) {
                    hr3Var2.f |= 524288;
                    hr3Var2.J = i8;
                }
                return as4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(int i, java.lang.Object obj) {
        super(1);
        this.f = i;
        this.i = obj;
    }
}
