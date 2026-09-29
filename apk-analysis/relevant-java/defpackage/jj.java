package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class jj extends defpackage.sd4 implements defpackage.xd1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(boolean z, defpackage.sd0 sd0Var, int i) {
        super(2, sd0Var);
        this.f = i;
        this.i = z;
    }

    @Override // defpackage.up
    public final defpackage.sd0 create(java.lang.Object obj, defpackage.sd0 sd0Var) {
        switch (this.f) {
            case 0:
                return new defpackage.jj(this.i, sd0Var, 0);
            default:
                return new defpackage.jj(this.i, sd0Var, 1);
        }
    }

    @Override // defpackage.xd1
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        int i = this.f;
        defpackage.as4 as4Var = defpackage.as4.a;
        defpackage.nf0 nf0Var = (defpackage.nf0) obj;
        defpackage.sd0 sd0Var = (defpackage.sd0) obj2;
        switch (i) {
            case 0:
                ((defpackage.jj) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
                return as4Var;
            default:
                return ((defpackage.jj) create(nf0Var, sd0Var)).invokeSuspend(as4Var);
        }
    }

    @Override // defpackage.up
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Exception {
        java.util.List list;
        defpackage.ge2 ge2Var;
        switch (this.f) {
            case 0:
                defpackage.or1.J(obj);
                android.content.SharedPreferences sharedPreferences = defpackage.lj.a;
                if (sharedPreferences == null) {
                    defpackage.ct1.R("prefs");
                    throw null;
                }
                sharedPreferences.edit().putBoolean("is_local_mode", this.i).apply();
                defpackage.lj.b = this.i;
                return defpackage.as4.a;
            default:
                defpackage.or1.J(obj);
                defpackage.ro3 ro3Var = defpackage.he2.a;
                if (!this.i && (ge2Var = defpackage.he2.e) != null && java.lang.System.currentTimeMillis() - ge2Var.b <= 7200000) {
                    return (java.util.List) ge2Var.a;
                }
                try {
                    android.content.SharedPreferences sharedPreferences2 = defpackage.lj.a;
                    java.util.List listF0 = (defpackage.lj.b ? defpackage.tf2.i : defpackage.tf2.O).F0();
                    defpackage.he2.e = new defpackage.ge2(listF0);
                    return listF0;
                } catch (java.lang.Exception e) {
                    android.util.Log.e("LiveService", "获取直播源失败: " + e.getMessage());
                    defpackage.ge2 ge2Var2 = defpackage.he2.e;
                    if (ge2Var2 == null || (list = (java.util.List) ge2Var2.a) == null) {
                        throw e;
                    }
                    return list;
                }
        }
    }
}
