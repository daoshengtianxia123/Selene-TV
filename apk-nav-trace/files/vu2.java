package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes.dex */
public final class vu2 {
    public int A;
    public final java.util.ArrayList B;
    public final defpackage.j24 C;
    public final defpackage.wj3 D;
    public final android.content.Context a;
    public final android.app.Activity b;
    public defpackage.su2 c;
    public android.os.Bundle d;
    public android.os.Parcelable[] e;
    public boolean f;
    public final defpackage.ck g;
    public final defpackage.o94 h;
    public final defpackage.o94 i;
    public final defpackage.yj3 j;
    public final java.util.LinkedHashMap k;
    public final java.util.LinkedHashMap l;
    public final java.util.LinkedHashMap m;
    public final java.util.LinkedHashMap n;
    public defpackage.ib2 o;
    public defpackage.ju2 p;
    public final java.util.concurrent.CopyOnWriteArrayList q;
    public defpackage.db2 r;
    public final defpackage.cu2 s;
    public final defpackage.hu2 t;
    public final boolean u;
    public final defpackage.qv2 v;
    public final java.util.LinkedHashMap w;
    public defpackage.jd1 x;
    public defpackage.eu2 y;
    public final java.util.LinkedHashMap z;

    public vu2(android.content.Context context) {
        java.lang.Object next;
        context.getClass();
        this.a = context;
        java.util.Iterator it = defpackage.e04.M(defpackage.d5.M, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((android.content.Context) next) instanceof android.app.Activity) {
                    break;
                }
            }
        }
        this.b = (android.app.Activity) next;
        this.g = new defpackage.ck();
        defpackage.m01 m01Var = defpackage.m01.f;
        this.h = defpackage.uj2.i(m01Var);
        defpackage.o94 o94VarI = defpackage.uj2.i(m01Var);
        this.i = o94VarI;
        this.j = new defpackage.yj3(o94VarI, null);
        this.k = new java.util.LinkedHashMap();
        this.l = new java.util.LinkedHashMap();
        this.m = new java.util.LinkedHashMap();
        this.n = new java.util.LinkedHashMap();
        this.q = new java.util.concurrent.CopyOnWriteArrayList();
        this.r = defpackage.db2.i;
        this.s = new defpackage.cu2(0, this);
        this.t = new defpackage.hu2(this);
        this.u = true;
        defpackage.qv2 qv2Var = new defpackage.qv2();
        this.v = qv2Var;
        this.w = new java.util.LinkedHashMap();
        this.z = new java.util.LinkedHashMap();
        qv2Var.a(new defpackage.uu2(qv2Var));
        qv2Var.a(new defpackage.e5(this.a));
        this.B = new java.util.ArrayList();
        new defpackage.zd4(new defpackage.wc(9, this));
        defpackage.j24 j24VarH = defpackage.uj2.h(0, 2, defpackage.nu.i);
        this.C = j24VarH;
        this.D = new defpackage.wj3(j24VarH);
    }

    public static defpackage.pu2 e(defpackage.pu2 pu2Var, int i, boolean z, defpackage.pu2 pu2Var2) {
        defpackage.su2 su2Var;
        if (pu2Var.w == i && (pu2Var2 == null || (pu2Var.equals(pu2Var2) && defpackage.ct1.g(pu2Var.i, pu2Var2.i)))) {
            return pu2Var;
        }
        if (pu2Var instanceof defpackage.su2) {
            su2Var = (defpackage.su2) pu2Var;
        } else {
            su2Var = pu2Var.i;
            su2Var.getClass();
        }
        return su2Var.g(i, su2Var, z, pu2Var2);
    }

    public static void l(defpackage.vu2 vu2Var, java.lang.Object obj, defpackage.gv2 gv2Var, int i) {
        if ((i & 2) != 0) {
            gv2Var = null;
        }
        vu2Var.getClass();
        obj.getClass();
        java.lang.String strF = vu2Var.f(obj);
        if (vu2Var.c == null) {
            defpackage.jc2.k("Cannot navigate to ", strF, ". Navigation graph has not been set for NavController ", vu2Var, 46);
            return;
        }
        defpackage.su2 su2VarI = vu2Var.i(vu2Var.g);
        defpackage.ou2 ou2VarI = su2VarI.i(strF, true, su2VarI);
        if (ou2VarI == null) {
            defpackage.c.i(defpackage.sr2.m("Navigation destination that matches route ", strF, " cannot be found in the navigation graph "), vu2Var.c);
            return;
        }
        defpackage.pu2 pu2Var = ou2VarI.f;
        android.os.Bundle bundleA = pu2Var.a(ou2VarI.i);
        if (bundleA == null) {
            bundleA = new android.os.Bundle();
        }
        android.content.Intent intent = new android.content.Intent();
        int i2 = defpackage.pu2.z;
        java.lang.String str = pu2Var.x;
        android.net.Uri uri = android.net.Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        uri.getClass();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        vu2Var.k(pu2Var, bundleA, gv2Var);
    }

    public static /* synthetic */ void p(defpackage.vu2 vu2Var, defpackage.yt2 yt2Var) {
        vu2Var.o(yt2Var, false, new defpackage.ck());
    }

    public final void a(defpackage.pu2 pu2Var, android.os.Bundle bundle, defpackage.yt2 yt2Var, java.util.List list) {
        java.lang.Object objPrevious;
        java.lang.Object objPrevious2;
        defpackage.pu2 pu2Var2 = yt2Var.i;
        boolean z = pu2Var2 instanceof defpackage.q81;
        defpackage.ck ckVar = this.g;
        if (!z) {
            while (!ckVar.isEmpty() && (((defpackage.yt2) ckVar.last()).i instanceof defpackage.q81) && n(((defpackage.yt2) ckVar.last()).i.w, true, false)) {
            }
        }
        defpackage.ck ckVar2 = new defpackage.ck();
        boolean z2 = pu2Var instanceof defpackage.su2;
        android.content.Context context = this.a;
        java.lang.Object obj = null;
        if (z2) {
            defpackage.pu2 pu2Var3 = pu2Var2;
            do {
                pu2Var3.getClass();
                pu2Var3 = pu2Var3.i;
                if (pu2Var3 != null) {
                    java.util.ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (defpackage.ct1.g(((defpackage.yt2) objPrevious2).i, pu2Var3)) {
                                break;
                            }
                        }
                    }
                    defpackage.yt2 yt2VarM = (defpackage.yt2) objPrevious2;
                    if (yt2VarM == null) {
                        yt2VarM = defpackage.fb1.m(context, pu2Var3, bundle, h(), this.p);
                    }
                    ckVar2.addFirst(yt2VarM);
                    if (!ckVar.isEmpty() && ((defpackage.yt2) ckVar.last()).i == pu2Var3) {
                        p(this, (defpackage.yt2) ckVar.last());
                    }
                }
                if (pu2Var3 == null) {
                    break;
                }
            } while (pu2Var3 != pu2Var);
        }
        defpackage.pu2 pu2Var4 = ckVar2.isEmpty() ? pu2Var2 : ((defpackage.yt2) ckVar2.first()).i;
        while (pu2Var4 != null && d(pu2Var4.w, pu2Var4) != pu2Var4) {
            pu2Var4 = pu2Var4.i;
            if (pu2Var4 != null) {
                android.os.Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                java.util.ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        if (defpackage.ct1.g(((defpackage.yt2) objPrevious).i, pu2Var4)) {
                            break;
                        }
                    }
                }
                defpackage.yt2 yt2VarM2 = (defpackage.yt2) objPrevious;
                if (yt2VarM2 == null) {
                    yt2VarM2 = defpackage.fb1.m(context, pu2Var4, pu2Var4.a(bundle2), h(), this.p);
                }
                ckVar2.addFirst(yt2VarM2);
            }
        }
        if (!ckVar2.isEmpty()) {
            pu2Var2 = ((defpackage.yt2) ckVar2.first()).i;
        }
        while (!ckVar.isEmpty() && (((defpackage.yt2) ckVar.last()).i instanceof defpackage.su2)) {
            defpackage.pu2 pu2Var5 = ((defpackage.yt2) ckVar.last()).i;
            pu2Var5.getClass();
            if (((defpackage.su2) pu2Var5).A.c(pu2Var2.w) != null) {
                break;
            } else {
                p(this, (defpackage.yt2) ckVar.last());
            }
        }
        defpackage.yt2 yt2Var2 = (defpackage.yt2) ckVar.g();
        if (yt2Var2 == null) {
            yt2Var2 = (defpackage.yt2) ckVar2.g();
        }
        if (!defpackage.ct1.g(yt2Var2 != null ? yt2Var2.i : null, this.c)) {
            java.util.ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                java.lang.Object objPrevious3 = listIterator3.previous();
                defpackage.pu2 pu2Var6 = ((defpackage.yt2) objPrevious3).i;
                defpackage.su2 su2Var = this.c;
                su2Var.getClass();
                if (defpackage.ct1.g(pu2Var6, su2Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            defpackage.yt2 yt2VarM3 = (defpackage.yt2) obj;
            if (yt2VarM3 == null) {
                defpackage.su2 su2Var2 = this.c;
                su2Var2.getClass();
                defpackage.su2 su2Var3 = this.c;
                su2Var3.getClass();
                yt2VarM3 = defpackage.fb1.m(context, su2Var2, su2Var3.a(bundle), h(), this.p);
            }
            ckVar2.addFirst(yt2VarM3);
        }
        java.util.Iterator it = ckVar2.iterator();
        while (it.hasNext()) {
            defpackage.yt2 yt2Var3 = (defpackage.yt2) it.next();
            java.lang.Object obj2 = this.w.get(this.v.b(yt2Var3.i.f));
            if (obj2 == null) {
                defpackage.jc2.p(defpackage.ms1.E(new java.lang.StringBuilder("NavigatorBackStack for "), pu2Var.f, " should already be created"));
                return;
            }
            ((defpackage.du2) obj2).a(yt2Var3);
        }
        ckVar.addAll(ckVar2);
        ckVar.addLast(yt2Var);
        java.util.Iterator it2 = defpackage.y30.M0(ckVar2, yt2Var).iterator();
        while (it2.hasNext()) {
            defpackage.yt2 yt2Var4 = (defpackage.yt2) it2.next();
            defpackage.su2 su2Var4 = yt2Var4.i.i;
            if (su2Var4 != null) {
                j(yt2Var4, g(su2Var4.w));
            }
        }
    }

    public final boolean b() {
        defpackage.ck ckVar;
        while (true) {
            ckVar = this.g;
            if (ckVar.isEmpty() || !(((defpackage.yt2) ckVar.last()).i instanceof defpackage.su2)) {
                break;
            }
            p(this, (defpackage.yt2) ckVar.last());
        }
        defpackage.yt2 yt2Var = (defpackage.yt2) ckVar.i();
        java.util.ArrayList arrayList = this.B;
        if (yt2Var != null) {
            arrayList.add(yt2Var);
        }
        this.A++;
        t();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            java.util.ArrayList arrayListC1 = defpackage.y30.c1(arrayList);
            arrayList.clear();
            java.util.Iterator it = arrayListC1.iterator();
            while (it.hasNext()) {
                defpackage.yt2 yt2Var2 = (defpackage.yt2) it.next();
                java.util.Iterator it2 = this.q.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        defpackage.jc2.a();
                        return false;
                    }
                    defpackage.pu2 pu2Var = yt2Var2.i;
                    yt2Var2.e();
                    throw null;
                }
                this.C.o(yt2Var2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ckVar);
            defpackage.o94 o94Var = this.h;
            o94Var.getClass();
            o94Var.h(null, arrayList2);
            java.util.ArrayList arrayListQ = q();
            defpackage.o94 o94Var2 = this.i;
            o94Var2.getClass();
            o94Var2.h(null, arrayListQ);
        }
        return yt2Var != null;
    }

    public final boolean c(java.util.ArrayList arrayList, defpackage.pu2 pu2Var, boolean z, boolean z2) {
        defpackage.vu2 vu2Var;
        boolean z3;
        defpackage.um3 um3Var = new defpackage.um3();
        defpackage.ck ckVar = new defpackage.ck();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                vu2Var = this;
                z3 = z2;
                break;
            }
            defpackage.pv2 pv2Var = (defpackage.pv2) it.next();
            defpackage.um3 um3Var2 = new defpackage.um3();
            defpackage.yt2 yt2Var = (defpackage.yt2) this.g.last();
            vu2Var = this;
            z3 = z2;
            vu2Var.y = new defpackage.eu2(um3Var2, um3Var, vu2Var, z3, ckVar);
            pv2Var.e(yt2Var, z3);
            vu2Var.y = null;
            if (!um3Var2.f) {
                break;
            }
            this = vu2Var;
            z2 = z3;
        }
        if (z3) {
            java.util.LinkedHashMap linkedHashMap = vu2Var.m;
            if (!z) {
                java.util.Iterator it2 = new defpackage.l61(defpackage.e04.M(defpackage.sp0.R, pu2Var), new defpackage.fu2(vu2Var, 0)).iterator();
                while (true) {
                    defpackage.z71 z71Var = (defpackage.z71) it2;
                    if (!z71Var.hasNext()) {
                        break;
                    }
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(((defpackage.pu2) z71Var.next()).w);
                    defpackage.bu2 bu2Var = (defpackage.bu2) ckVar.g();
                    linkedHashMap.put(numValueOf, bu2Var != null ? bu2Var.f : null);
                }
            }
            if (!ckVar.isEmpty()) {
                defpackage.bu2 bu2Var2 = (defpackage.bu2) ckVar.first();
                int i = bu2Var2.i;
                java.lang.String str = bu2Var2.f;
                java.util.Iterator it3 = new defpackage.l61(defpackage.e04.M(defpackage.sp0.S, vu2Var.d(i, null)), new defpackage.fu2(vu2Var, 1)).iterator();
                while (true) {
                    defpackage.z71 z71Var2 = (defpackage.z71) it3;
                    if (!z71Var2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(java.lang.Integer.valueOf(((defpackage.pu2) z71Var2.next()).w), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    vu2Var.n.put(str, ckVar);
                }
            }
        }
        vu2Var.u();
        return um3Var.f;
    }

    public final defpackage.pu2 d(int i, defpackage.pu2 pu2Var) {
        defpackage.pu2 pu2Var2;
        defpackage.su2 su2Var = this.c;
        if (su2Var == null) {
            return null;
        }
        if (su2Var.w == i) {
            if (pu2Var == null) {
                return su2Var;
            }
            if (defpackage.ct1.g(su2Var, pu2Var) && pu2Var.i == null) {
                return this.c;
            }
        }
        defpackage.yt2 yt2Var = (defpackage.yt2) this.g.i();
        if (yt2Var == null || (pu2Var2 = yt2Var.i) == null) {
            pu2Var2 = this.c;
            pu2Var2.getClass();
        }
        return e(pu2Var2, i, false, pu2Var);
    }

    public final java.lang.String f(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        defpackage.mo3 mo3Var = defpackage.lo3.a;
        int iW = defpackage.ht1.w(defpackage.xr1.X(mo3Var.b(cls)));
        defpackage.su2 su2Var = this.c;
        if (su2Var == null) {
            defpackage.c.r("You must call setGraph() before calling getGraph()");
            return null;
        }
        defpackage.pu2 pu2VarE = e(su2Var, iW, true, null);
        if (pu2VarE == null) {
            defpackage.jc2.u("Destination with route ", mo3Var.b(obj.getClass()).e(), " cannot be found in navigation graph ", this.c);
            return null;
        }
        java.util.Map mapR = defpackage.ij2.R(pu2VarE.v);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.ij2.J(mapR.size()));
        for (java.util.Map.Entry entry : mapR.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((defpackage.tt2) entry.getValue()).a());
        }
        return defpackage.ht1.x(obj, linkedHashMap);
    }

    public final defpackage.yt2 g(int i) {
        java.lang.Object objPrevious;
        defpackage.ck ckVar = this.g;
        java.util.ListIterator listIterator = ckVar.listIterator(ckVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((defpackage.yt2) objPrevious).i.w == i) {
                break;
            }
        }
        defpackage.yt2 yt2Var = (defpackage.yt2) objPrevious;
        if (yt2Var != null) {
            return yt2Var;
        }
        java.lang.StringBuilder sbK = defpackage.sr2.k(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        defpackage.yt2 yt2Var2 = (defpackage.yt2) ckVar.i();
        sbK.append(yt2Var2 != null ? yt2Var2.i : null);
        throw new java.lang.IllegalArgumentException(sbK.toString().toString());
    }

    public final defpackage.db2 h() {
        return this.o == null ? defpackage.db2.t : this.r;
    }

    public final defpackage.su2 i(defpackage.ck ckVar) {
        defpackage.pu2 pu2Var;
        defpackage.yt2 yt2Var = (defpackage.yt2) ckVar.i();
        if (yt2Var == null || (pu2Var = yt2Var.i) == null) {
            pu2Var = this.c;
            pu2Var.getClass();
        }
        if (pu2Var instanceof defpackage.su2) {
            return (defpackage.su2) pu2Var;
        }
        defpackage.su2 su2Var = pu2Var.i;
        su2Var.getClass();
        return su2Var;
    }

    public final void j(defpackage.yt2 yt2Var, defpackage.yt2 yt2Var2) {
        this.k.put(yt2Var, yt2Var2);
        java.util.LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(yt2Var2) == null) {
            linkedHashMap.put(yt2Var2, new java.util.concurrent.atomic.AtomicInteger(0));
        }
        java.lang.Object obj = linkedHashMap.get(yt2Var2);
        obj.getClass();
        ((java.util.concurrent.atomic.AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0368 A[LOOP:1: B:150:0x0362->B:152:0x0368, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0125 A[EDGE_INSN: B:183:0x0125->B:61:0x0125 BREAK  A[LOOP:8: B:15:0x005e->B:59:0x011a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[PHI: r15
      0x0096: PHI (r15v13 java.util.ListIterator) = 
      (r15v3 java.util.ListIterator)
      (r15v3 java.util.ListIterator)
      (r15v3 java.util.ListIterator)
      (r15v4 java.util.ListIterator)
     binds: [B:26:0x0094, B:30:0x009d, B:31:0x009f, B:185:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a A[LOOP:8: B:15:0x005e->B:59:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.pu2 r29, android.os.Bundle r30, defpackage.gv2 r31) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.k(pu2, android.os.Bundle, gv2):void");
    }

    public final void m() {
        defpackage.ck ckVar = this.g;
        if (ckVar.isEmpty()) {
            return;
        }
        defpackage.yt2 yt2Var = (defpackage.yt2) ckVar.i();
        defpackage.pu2 pu2Var = yt2Var != null ? yt2Var.i : null;
        pu2Var.getClass();
        if (n(pu2Var.w, true, false)) {
            b();
        }
    }

    public final boolean n(int i, boolean z, boolean z2) {
        defpackage.pu2 pu2Var;
        defpackage.ck ckVar = this.g;
        if (ckVar.isEmpty()) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = defpackage.y30.N0(ckVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                pu2Var = null;
                break;
            }
            pu2Var = ((defpackage.yt2) it.next()).i;
            defpackage.pv2 pv2VarB = this.v.b(pu2Var.f);
            if (z || pu2Var.w != i) {
                arrayList.add(pv2VarB);
            }
            if (pu2Var.w == i) {
                break;
            }
        }
        if (pu2Var != null) {
            return c(arrayList, pu2Var, z, z2);
        }
        int i2 = defpackage.pu2.z;
        android.util.Log.i("NavController", "Ignoring popBackStack to destination " + defpackage.nq1.w(this.a, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(defpackage.yt2 yt2Var, boolean z, defpackage.ck ckVar) {
        defpackage.ju2 ju2Var;
        defpackage.yj3 yj3Var;
        java.util.Set set;
        defpackage.ck ckVar2 = this.g;
        defpackage.yt2 yt2Var2 = (defpackage.yt2) ckVar2.last();
        if (!defpackage.ct1.g(yt2Var2, yt2Var)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to pop ");
            sb.append(yt2Var.i);
            defpackage.pu2 pu2Var = yt2Var2.i;
            sb.append(", which is not the top of the back stack (");
            sb.append(pu2Var);
            sb.append(')');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        defpackage.e40.l0(ckVar2);
        defpackage.du2 du2Var = (defpackage.du2) this.w.get(this.v.b(yt2Var2.i.f));
        boolean z2 = true;
        if ((du2Var == null || (yj3Var = du2Var.f) == null || (set = (java.util.Set) yj3Var.f.getValue()) == null || !set.contains(yt2Var2)) && !this.l.containsKey(yt2Var2)) {
            z2 = false;
        }
        defpackage.db2 db2Var = yt2Var2.y.e;
        defpackage.db2 db2Var2 = defpackage.db2.t;
        if (db2Var.compareTo(db2Var2) >= 0) {
            if (z) {
                yt2Var2.B = db2Var2;
                yt2Var2.h();
                ckVar.addFirst(new defpackage.bu2(yt2Var2));
            }
            if (z2) {
                yt2Var2.B = db2Var2;
                yt2Var2.h();
            } else {
                yt2Var2.B = defpackage.db2.f;
                yt2Var2.h();
                s(yt2Var2);
            }
        }
        if (z || z2 || (ju2Var = this.p) == null) {
            return;
        }
        java.lang.String str = yt2Var2.w;
        str.getClass();
        defpackage.kx4 kx4Var = (defpackage.kx4) ju2Var.b.remove(str);
        if (kx4Var != null) {
            kx4Var.a();
        }
    }

    public final java.util.ArrayList q() {
        defpackage.db2 db2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            db2Var = defpackage.db2.u;
            if (!zHasNext) {
                break;
            }
            java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.du2) it.next()).f.f.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : iterable) {
                defpackage.yt2 yt2Var = (defpackage.yt2) obj;
                if (!arrayList.contains(yt2Var) && yt2Var.B.compareTo(db2Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            defpackage.e40.j0(arrayList, arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            defpackage.yt2 yt2Var2 = (defpackage.yt2) next;
            if (!arrayList.contains(yt2Var2) && yt2Var2.B.compareTo(db2Var) >= 0) {
                arrayList3.add(next);
            }
        }
        defpackage.e40.j0(arrayList, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            java.lang.Object next2 = it3.next();
            if (!(((defpackage.yt2) next2).i instanceof defpackage.su2)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i, android.os.Bundle bundle, defpackage.gv2 gv2Var) {
        defpackage.pu2 pu2Var;
        defpackage.yt2 yt2Var;
        defpackage.pu2 pu2Var2;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.util.LinkedHashMap linkedHashMap = this.m;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        java.lang.String str = (java.lang.String) linkedHashMap.get(java.lang.Integer.valueOf(i));
        java.util.Collection collectionValues = linkedHashMap.values();
        defpackage.iu2 iu2Var = new defpackage.iu2(str, i2);
        collectionValues.getClass();
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((java.lang.Boolean) iu2Var.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
        defpackage.ck ckVar = (defpackage.ck) defpackage.pp4.m(this.n).remove(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.yt2 yt2Var2 = (defpackage.yt2) this.g.i();
        if ((yt2Var2 == null || (pu2Var = yt2Var2.i) == null) && (pu2Var = this.c) == null) {
            defpackage.c.r("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (ckVar != null) {
            java.util.Iterator it2 = ckVar.iterator();
            while (it2.hasNext()) {
                defpackage.bu2 bu2Var = (defpackage.bu2) it2.next();
                defpackage.pu2 pu2VarE = e(pu2Var, bu2Var.i, true, null);
                android.content.Context context = this.a;
                if (pu2VarE == null) {
                    int i3 = defpackage.pu2.z;
                    defpackage.jc2.r("Restore State failed: destination ", defpackage.nq1.w(context, bu2Var.i), " cannot be found from the current destination ", pu2Var);
                    return false;
                }
                arrayList.add(bu2Var.a(context, pu2VarE, h(), this.p));
                pu2Var = pu2VarE;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            java.lang.Object next = it3.next();
            if (!(((defpackage.yt2) next).i instanceof defpackage.su2)) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            defpackage.yt2 yt2Var3 = (defpackage.yt2) it4.next();
            java.util.List list = (java.util.List) defpackage.y30.F0(arrayList2);
            if (defpackage.ct1.g((list == null || (yt2Var = (defpackage.yt2) defpackage.y30.E0(list)) == null || (pu2Var2 = yt2Var.i) == null) ? null : pu2Var2.f, yt2Var3.i.f)) {
                list.add(yt2Var3);
            } else {
                arrayList2.add(defpackage.pp4.O(yt2Var3));
            }
        }
        defpackage.um3 um3Var = new defpackage.um3();
        java.util.Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            java.util.List list2 = (java.util.List) it5.next();
            defpackage.pv2 pv2VarB = this.v.b(((defpackage.yt2) defpackage.y30.v0(list2)).i.f);
            this.x = new defpackage.kb(um3Var, arrayList, new defpackage.wm3(), this, bundle, 1);
            pv2VarB.d(list2, gv2Var);
            this.x = null;
        }
        return um3Var.f;
    }

    public final void s(defpackage.yt2 yt2Var) {
        yt2Var.getClass();
        defpackage.yt2 yt2Var2 = (defpackage.yt2) this.k.remove(yt2Var);
        if (yt2Var2 == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = this.l;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) linkedHashMap.get(yt2Var2);
        java.lang.Integer numValueOf = atomicInteger != null ? java.lang.Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            defpackage.du2 du2Var = (defpackage.du2) this.w.get(this.v.b(yt2Var2.i.f));
            if (du2Var != null) {
                du2Var.b(yt2Var2);
            }
            linkedHashMap.remove(yt2Var2);
        }
    }

    public final void t() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        defpackage.yj3 yj3Var;
        java.util.Set set;
        java.util.ArrayList arrayListC1 = defpackage.y30.c1(this.g);
        if (arrayListC1.isEmpty()) {
            return;
        }
        defpackage.pu2 pu2Var = ((defpackage.yt2) defpackage.y30.E0(arrayListC1)).i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pu2Var instanceof defpackage.q81) {
            java.util.Iterator it = defpackage.y30.N0(arrayListC1).iterator();
            while (it.hasNext()) {
                defpackage.pu2 pu2Var2 = ((defpackage.yt2) it.next()).i;
                arrayList.add(pu2Var2);
                if (!(pu2Var2 instanceof defpackage.q81) && !(pu2Var2 instanceof defpackage.su2)) {
                    break;
                }
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        for (defpackage.yt2 yt2Var : defpackage.y30.N0(arrayListC1)) {
            defpackage.db2 db2Var = yt2Var.B;
            defpackage.pu2 pu2Var3 = yt2Var.i;
            defpackage.db2 db2Var2 = defpackage.db2.v;
            defpackage.db2 db2Var3 = defpackage.db2.u;
            if (pu2Var != null && pu2Var3.w == pu2Var.w) {
                if (db2Var != db2Var2) {
                    defpackage.du2 du2Var = (defpackage.du2) this.w.get(this.v.b(pu2Var3.f));
                    if (defpackage.ct1.g((du2Var == null || (yj3Var = du2Var.f) == null || (set = (java.util.Set) yj3Var.f.getValue()) == null) ? null : java.lang.Boolean.valueOf(set.contains(yt2Var)), java.lang.Boolean.TRUE) || ((atomicInteger = (java.util.concurrent.atomic.AtomicInteger) this.l.get(yt2Var)) != null && atomicInteger.get() == 0)) {
                        map.put(yt2Var, db2Var3);
                    } else {
                        map.put(yt2Var, db2Var2);
                    }
                }
                defpackage.pu2 pu2Var4 = (defpackage.pu2) defpackage.y30.x0(arrayList);
                if (pu2Var4 != null && pu2Var4.w == pu2Var3.w) {
                    if (arrayList.isEmpty()) {
                        defpackage.c.u("List is empty.");
                        return;
                    }
                    arrayList.remove(0);
                }
                pu2Var = pu2Var.i;
            } else if (arrayList.isEmpty() || pu2Var3.w != ((defpackage.pu2) defpackage.y30.v0(arrayList)).w) {
                yt2Var.B = defpackage.db2.t;
                yt2Var.h();
            } else {
                if (arrayList.isEmpty()) {
                    defpackage.c.u("List is empty.");
                    return;
                }
                defpackage.pu2 pu2Var5 = (defpackage.pu2) arrayList.remove(0);
                if (db2Var == db2Var2) {
                    yt2Var.B = db2Var3;
                    yt2Var.h();
                } else if (db2Var != db2Var3) {
                    map.put(yt2Var, db2Var3);
                }
                defpackage.su2 su2Var = pu2Var5.i;
                if (su2Var != null && !arrayList.contains(su2Var)) {
                    arrayList.add(su2Var);
                }
            }
        }
        java.util.Iterator it2 = arrayListC1.iterator();
        while (it2.hasNext()) {
            defpackage.yt2 yt2Var2 = (defpackage.yt2) it2.next();
            defpackage.db2 db2Var4 = (defpackage.db2) map.get(yt2Var2);
            if (db2Var4 != null) {
                yt2Var2.getClass();
                yt2Var2.B = db2Var4;
                yt2Var2.h();
            } else {
                yt2Var2.h();
            }
        }
    }

    public final void u() {
        int i;
        boolean z = false;
        if (this.u) {
            defpackage.ck ckVar = this.g;
            if (ckVar == null || !ckVar.isEmpty()) {
                java.util.Iterator it = ckVar.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((defpackage.yt2) it.next()).i instanceof defpackage.su2) && (i = i + 1) < 0) {
                        throw new java.lang.ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        defpackage.hu2 hu2Var = this.t;
        hu2Var.a = z;
        defpackage.hd1 hd1Var = hu2Var.c;
        if (hd1Var != null) {
            hd1Var.invoke();
        }
    }
}
