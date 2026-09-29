package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final /* synthetic */ class a9 implements java.lang.Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object t;

    public /* synthetic */ a9(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f = i;
        this.i = obj;
        this.t = obj2;
    }

    private final void a() {
        defpackage.rn rnVar = (defpackage.rn) this.i;
        synchronized (((defpackage.rj0) this.t)) {
        }
        defpackage.j41 j41Var = rnVar.c;
        int i = defpackage.gt4.a;
        defpackage.fk0 fk0Var = j41Var.f.r;
        fk0Var.L(fk0Var.H((defpackage.qm2) fk0Var.d.v), 1013, new defpackage.ak0(5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection;
        int i = 2;
        boolean z2 = true;
        switch (this.f) {
            case 0:
                defpackage.r15.o((defpackage.e9) this.i, (android.util.LongSparseArray) this.t);
                break;
            case 1:
                a();
                break;
            case 2:
                defpackage.z22 z22Var = (defpackage.z22) this.i;
                defpackage.u3 u3Var = (defpackage.u3) this.t;
                defpackage.rn rnVar = ((defpackage.pk2) z22Var.i).U0;
                android.os.Handler handler = rnVar.b;
                if (handler != null) {
                    handler.post(new defpackage.pn(rnVar, u3Var, i));
                    break;
                }
                break;
            case 3:
                defpackage.nl0 nl0Var = (defpackage.nl0) this.i;
                android.net.Uri uri = (android.net.Uri) this.t;
                nl0Var.z = false;
                nl0Var.f(uri);
                break;
            case 4:
                defpackage.m41 m41Var = (defpackage.m41) this.i;
                defpackage.p41 p41Var = (defpackage.p41) this.t;
                int i2 = m41Var.H - p41Var.b;
                m41Var.H = i2;
                if (p41Var.e) {
                    m41Var.I = p41Var.c;
                    m41Var.J = true;
                }
                if (i2 == 0) {
                    defpackage.dk4 dk4Var = ((defpackage.g83) p41Var.f).a;
                    if (!m41Var.g0.a.p() && dk4Var.p()) {
                        m41Var.h0 = -1;
                        m41Var.i0 = 0L;
                    }
                    if (!dk4Var.p()) {
                        java.util.List listAsList = java.util.Arrays.asList(((defpackage.zb3) dk4Var).h);
                        defpackage.rs.q(listAsList.size() == m41Var.o.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((defpackage.l41) m41Var.o.get(i3)).b = (defpackage.dk4) listAsList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (m41Var.J) {
                        if (((defpackage.g83) p41Var.f).b.equals(m41Var.g0.b) && ((defpackage.g83) p41Var.f).d == m41Var.g0.s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (dk4Var.p() || ((defpackage.g83) p41Var.f).b.b()) {
                                j = ((defpackage.g83) p41Var.f).d;
                            } else {
                                defpackage.g83 g83Var = (defpackage.g83) p41Var.f;
                                defpackage.qm2 qm2Var = g83Var.b;
                                long j2 = g83Var.d;
                                java.lang.Object obj = qm2Var.a;
                                defpackage.bk4 bk4Var = m41Var.n;
                                dk4Var.g(obj, bk4Var);
                                j = j2 + bk4Var.e;
                            }
                        }
                        z = z2;
                    } else {
                        z = false;
                    }
                    long j3 = j;
                    m41Var.J = false;
                    m41Var.O((defpackage.g83) p41Var.f, 1, z, m41Var.I, j3, -1, false);
                    break;
                }
                break;
            case 5:
                ((defpackage.nl0) ((defpackage.zi1) ((defpackage.uj1) this.i).t.i).i.u.get(((defpackage.yi1) this.t).m)).e(true);
                break;
            case 6:
                java.lang.String str = (java.lang.String) this.i;
                org.moontechlab.selenetv.MainActivity mainActivity = (org.moontechlab.selenetv.MainActivity) this.t;
                int i4 = org.moontechlab.selenetv.MainActivity.L;
                defpackage.nl2 nl2Var = defpackage.cb1.t;
                if (nl2Var != null) {
                    nl2Var.invoke(str);
                    break;
                } else {
                    android.view.View currentFocus = mainActivity.getCurrentFocus();
                    if (currentFocus != null && (inputConnectionOnCreateInputConnection = currentFocus.onCreateInputConnection(new android.view.inputmethod.EditorInfo())) != null) {
                        inputConnectionOnCreateInputConnection.commitText(str, 1);
                        break;
                    }
                }
                break;
            case 7:
                ((defpackage.nc0) this.i).accept((defpackage.vm2) this.t);
                break;
            case 8:
                io.ktor.server.netty.http2.NettyHttp2ApplicationResponse.push$lambda$2((io.ktor.server.netty.http2.NettyHttp2ApplicationResponse) this.i, (io.ktor.server.response.ResponsePushBuilder) this.t);
                break;
            case 9:
                ((defpackage.pk0) this.t).a(((defpackage.jw2) this.i).d());
                break;
            case 10:
                androidx.media3.ui.PlayerView.a((androidx.media3.ui.PlayerView) this.i, (android.graphics.Bitmap) this.t);
                break;
            case dev.jdtech.mpv.MPVLib.MpvEvent.MPV_EVENT_IDLE /* 11 */:
                ((defpackage.jf3) this.i).D((defpackage.sx3) this.t);
                break;
            case 12:
                defpackage.x74 x74Var = (defpackage.x74) this.i;
                android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) this.t;
                android.graphics.SurfaceTexture surfaceTexture2 = x74Var.x;
                android.view.Surface surface = x74Var.y;
                android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
                x74Var.x = surfaceTexture;
                x74Var.y = surface2;
                java.util.Iterator it = x74Var.f.iterator();
                while (it.hasNext()) {
                    ((defpackage.j41) it.next()).f.L(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    break;
                }
                break;
            case 13:
                defpackage.rn rnVar2 = (defpackage.rn) this.i;
                defpackage.ew4 ew4Var = (defpackage.ew4) this.t;
                defpackage.j41 j41Var = rnVar2.c;
                int i5 = defpackage.gt4.a;
                defpackage.m41 m41Var2 = j41Var.f;
                m41Var2.e0 = ew4Var;
                m41Var2.l.e(25, new defpackage.ck0(ew4Var));
                break;
            default:
                defpackage.rn rnVar3 = (defpackage.rn) this.i;
                defpackage.rj0 rj0Var = (defpackage.rj0) this.t;
                synchronized (rj0Var) {
                }
                defpackage.j41 j41Var2 = rnVar3.c;
                int i6 = defpackage.gt4.a;
                defpackage.fk0 fk0Var = j41Var2.f.r;
                defpackage.n6 n6VarH = fk0Var.H((defpackage.qm2) fk0Var.d.v);
                fk0Var.L(n6VarH, 1020, new defpackage.vz(n6VarH, (java.lang.Object) rj0Var, i));
                break;
        }
    }
}
