package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class o93 extends android.widget.FrameLayout {
    public static final float[] Q0;
    public final defpackage.m5 A;
    public defpackage.z83 A0;
    public final android.widget.PopupWindow B;
    public boolean B0;
    public final int C;
    public boolean C0;
    public final android.widget.ImageView D;
    public boolean D0;
    public final android.widget.ImageView E;
    public boolean E0;
    public final android.widget.ImageView F;
    public boolean F0;
    public final android.view.View G;
    public boolean G0;
    public final android.view.View H;
    public int H0;
    public final android.widget.TextView I;
    public int I0;
    public final android.widget.TextView J;
    public int J0;
    public final android.widget.ImageView K;
    public long[] K0;
    public final android.widget.ImageView L;
    public boolean[] L0;
    public final android.widget.ImageView M;
    public final long[] M0;
    public final android.widget.ImageView N;
    public final boolean[] N0;
    public final android.widget.ImageView O;
    public long O0;
    public final android.widget.ImageView P;
    public boolean P0;
    public final android.view.View Q;
    public final android.view.View R;
    public final android.view.View S;
    public final android.widget.TextView T;
    public final android.widget.TextView U;
    public final defpackage.ln0 V;
    public final java.lang.StringBuilder W;
    public final java.util.Formatter a0;
    public final defpackage.bk4 b0;
    public final defpackage.ck4 c0;
    public final defpackage.tm d0;
    public final android.graphics.drawable.Drawable e0;
    public final defpackage.t93 f;
    public final android.graphics.drawable.Drawable f0;
    public final android.graphics.drawable.Drawable g0;
    public final android.graphics.drawable.Drawable h0;
    public final android.content.res.Resources i;
    public final android.graphics.drawable.Drawable i0;
    public final java.lang.String j0;
    public final java.lang.String k0;
    public final java.lang.String l0;
    public final android.graphics.drawable.Drawable m0;
    public final android.graphics.drawable.Drawable n0;
    public final float o0;
    public final float p0;
    public final java.lang.String q0;
    public final java.lang.String r0;
    public final android.graphics.drawable.Drawable s0;
    public final defpackage.d93 t;
    public final android.graphics.drawable.Drawable t0;
    public final java.util.concurrent.CopyOnWriteArrayList u;
    public final java.lang.String u0;
    public final androidx.recyclerview.widget.RecyclerView v;
    public final java.lang.String v0;
    public final defpackage.j93 w;
    public final android.graphics.drawable.Drawable w0;
    public final defpackage.g93 x;
    public final android.graphics.drawable.Drawable x0;
    public final defpackage.c93 y;
    public final java.lang.String y0;
    public final defpackage.c93 z;
    public final java.lang.String z0;

    static {
        defpackage.bm2.a("media3.ui");
        Q0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o93(android.content.Context r37, android.util.AttributeSet r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o93.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static boolean b(defpackage.z83 z83Var, defpackage.ck4 ck4Var) {
        defpackage.dk4 dk4VarK;
        int iO;
        defpackage.m41 m41Var = (defpackage.m41) z83Var;
        if (!m41Var.s(17) || (iO = (dk4VarK = m41Var.k()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (dk4VarK.m(i, ck4Var, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        defpackage.z83 z83Var = this.A0;
        if (z83Var == null || !((defpackage.m41) z83Var).s(13)) {
            return;
        }
        defpackage.m41 m41Var = (defpackage.m41) this.A0;
        m41Var.Q();
        m41Var.I(new defpackage.h83(f, m41Var.g0.o.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o93.c(android.view.KeyEvent):boolean");
    }

    public final void d(defpackage.yl3 yl3Var, android.view.View view) {
        this.v.setAdapter(yl3Var);
        q();
        this.P0 = false;
        android.widget.PopupWindow popupWindow = this.B;
        popupWindow.dismiss();
        this.P0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.C;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final defpackage.to3 e(defpackage.am4 am4Var, int i) {
        defpackage.d34.k(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        defpackage.ap1 ap1Var = am4Var.a;
        int i2 = 0;
        for (int i3 = 0; i3 < ap1Var.size(); i3++) {
            defpackage.zl4 zl4Var = (defpackage.zl4) ap1Var.get(i3);
            if (zl4Var.b.c == i) {
                for (int i4 = 0; i4 < zl4Var.a; i4++) {
                    if (zl4Var.a(i4)) {
                        defpackage.sc1 sc1Var = zl4Var.b.d[i4];
                        if ((sc1Var.e & 2) == 0) {
                            defpackage.l93 l93Var = new defpackage.l93(am4Var, i3, i4, this.A.I(sc1Var));
                            int i5 = i2 + 1;
                            int iE = defpackage.so1.e(objArrCopyOf.length, i5);
                            if (iE > objArrCopyOf.length) {
                                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iE);
                            }
                            objArrCopyOf[i2] = l93Var;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return defpackage.ap1.i(i2, objArrCopyOf);
    }

    public final void f() {
        defpackage.t93 t93Var = this.f;
        int i = t93Var.z;
        if (i == 3 || i == 2) {
            return;
        }
        t93Var.f();
        if (!t93Var.C) {
            t93Var.i(2);
        } else if (t93Var.z == 1) {
            t93Var.m.start();
        } else {
            t93Var.n.start();
        }
    }

    public final boolean g() {
        defpackage.t93 t93Var = this.f;
        return t93Var.z == 0 && t93Var.a.h();
    }

    public defpackage.z83 getPlayer() {
        return this.A0;
    }

    public int getRepeatToggleModes() {
        return this.J0;
    }

    public boolean getShowShuffleButton() {
        return this.f.b(this.L);
    }

    public boolean getShowSubtitleButton() {
        return this.f.b(this.N);
    }

    public int getShowTimeoutMs() {
        return this.H0;
    }

    public boolean getShowVrButton() {
        return this.f.b(this.M);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void j(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.o0 : this.p0);
    }

    public final void k(boolean z) {
        if (this.B0 == z) {
            return;
        }
        this.B0 = z;
        java.lang.String str = this.z0;
        android.graphics.drawable.Drawable drawable = this.x0;
        java.lang.String str2 = this.y0;
        android.graphics.drawable.Drawable drawable2 = this.w0;
        android.widget.ImageView imageView = this.O;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        android.widget.ImageView imageView2 = this.P;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public final void l() {
        boolean zS;
        boolean zS2;
        boolean zS3;
        boolean zS4;
        boolean zS5;
        long j;
        long j2;
        if (h() && this.C0) {
            defpackage.z83 z83Var = this.A0;
            if (z83Var != null) {
                zS2 = (this.D0 && b(z83Var, this.c0)) ? ((defpackage.m41) z83Var).s(10) : ((defpackage.m41) z83Var).s(5);
                defpackage.m41 m41Var = (defpackage.m41) z83Var;
                zS3 = m41Var.s(7);
                zS4 = m41Var.s(11);
                zS5 = m41Var.s(12);
                zS = m41Var.s(9);
            } else {
                zS = false;
                zS2 = false;
                zS3 = false;
                zS4 = false;
                zS5 = false;
            }
            android.content.res.Resources resources = this.i;
            android.view.View view = this.H;
            if (zS4) {
                defpackage.z83 z83Var2 = this.A0;
                if (z83Var2 != null) {
                    defpackage.m41 m41Var2 = (defpackage.m41) z83Var2;
                    m41Var2.Q();
                    j2 = m41Var2.u;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                android.widget.TextView textView = this.J;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(dev.jdtech.mpv.R.plurals.exo_controls_rewind_by_amount_description, i, java.lang.Integer.valueOf(i)));
                }
            }
            android.view.View view2 = this.G;
            if (zS5) {
                defpackage.z83 z83Var3 = this.A0;
                if (z83Var3 != null) {
                    defpackage.m41 m41Var3 = (defpackage.m41) z83Var3;
                    m41Var3.Q();
                    j = m41Var3.v;
                } else {
                    j = io.netty.handler.traffic.AbstractTrafficShapingHandler.DEFAULT_MAX_TIME;
                }
                int i2 = (int) (j / 1000);
                android.widget.TextView textView2 = this.I;
                if (textView2 != null) {
                    textView2.setText(java.lang.String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(dev.jdtech.mpv.R.plurals.exo_controls_fastforward_by_amount_description, i2, java.lang.Integer.valueOf(i2)));
                }
            }
            j(this.D, zS3);
            j(view, zS4);
            j(view2, zS5);
            j(this.E, zS);
            defpackage.ln0 ln0Var = this.V;
            if (ln0Var != null) {
                ln0Var.setEnabled(zS2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r4 = this;
            boolean r0 = r4.h()
            if (r0 == 0) goto L5f
            boolean r0 = r4.C0
            if (r0 != 0) goto Lb
            goto L5f
        Lb:
            android.widget.ImageView r0 = r4.F
            if (r0 == 0) goto L5f
            z83 r1 = r4.A0
            boolean r2 = r4.E0
            boolean r1 = defpackage.gt4.R(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r4.e0
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r4.f0
        L1e:
            if (r1 == 0) goto L24
            r1 = 2131492890(0x7f0c001a, float:1.8609245E38)
            goto L27
        L24:
            r1 = 2131492889(0x7f0c0019, float:1.8609243E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.i
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            z83 r1 = r4.A0
            if (r1 == 0) goto L5b
            m41 r1 = (defpackage.m41) r1
            r2 = 1
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L5b
            z83 r1 = r4.A0
            r3 = 17
            m41 r1 = (defpackage.m41) r1
            boolean r1 = r1.s(r3)
            if (r1 == 0) goto L5c
            z83 r1 = r4.A0
            m41 r1 = (defpackage.m41) r1
            dk4 r1 = r1.k()
            boolean r1 = r1.p()
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r2 = 0
        L5c:
            r4.j(r0, r2)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o93.m():void");
    }

    public final void n() {
        defpackage.g93 g93Var;
        defpackage.z83 z83Var = this.A0;
        if (z83Var == null) {
            return;
        }
        defpackage.m41 m41Var = (defpackage.m41) z83Var;
        m41Var.Q();
        float f = m41Var.g0.o.a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            g93Var = this.x;
            float[] fArr = g93Var.d;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = java.lang.Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        g93Var.e = i2;
        java.lang.String str = g93Var.c[i2];
        defpackage.j93 j93Var = this.w;
        j93Var.d[0] = str;
        j(this.Q, j93Var.d(1) || j93Var.d(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r15 = this;
            boolean r0 = r15.h()
            if (r0 == 0) goto Lb2
            boolean r0 = r15.C0
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            z83 r0 = r15.A0
            if (r0 == 0) goto L2f
            r1 = r0
            m41 r1 = (defpackage.m41) r1
            r2 = 16
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L2f
            long r2 = r15.O0
            r1.Q()
            g83 r4 = r1.g0
            long r4 = r1.e(r4)
            long r4 = r4 + r2
            long r2 = r15.O0
            long r6 = r1.d()
            long r6 = r6 + r2
            goto L32
        L2f:
            r4 = 0
            r6 = r4
        L32:
            android.widget.TextView r1 = r15.U
            if (r1 == 0) goto L45
            boolean r2 = r15.G0
            if (r2 != 0) goto L45
            java.lang.StringBuilder r2 = r15.W
            java.util.Formatter r3 = r15.a0
            java.lang.String r2 = defpackage.gt4.y(r2, r3, r4)
            r1.setText(r2)
        L45:
            ln0 r1 = r15.V
            if (r1 == 0) goto L4f
            r1.setPosition(r4)
            r1.setBufferedPosition(r6)
        L4f:
            tm r2 = r15.d0
            r15.removeCallbacks(r2)
            r3 = 1
            if (r0 != 0) goto L59
            r6 = r3
            goto L60
        L59:
            r6 = r0
            m41 r6 = (defpackage.m41) r6
            int r6 = r6.p()
        L60:
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto Laa
            m41 r0 = (defpackage.m41) r0
            int r9 = r0.p()
            r10 = 3
            if (r9 != r10) goto Laa
            boolean r9 = r0.o()
            if (r9 == 0) goto Laa
            r0.Q()
            g83 r9 = r0.g0
            int r9 = r9.n
            if (r9 != 0) goto Laa
            if (r1 == 0) goto L83
            long r9 = r1.getPreferredUpdateDelay()
            goto L84
        L83:
            r9 = r7
        L84:
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r3 = java.lang.Math.min(r9, r4)
            r0.Q()
            g83 r0 = r0.g0
            h83 r0 = r0.o
            float r0 = r0.a
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L9c
            float r1 = (float) r3
            float r1 = r1 / r0
            long r7 = (long) r1
        L9c:
            r9 = r7
            int r0 = r15.I0
            long r11 = (long) r0
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = defpackage.gt4.i(r9, r11, r13)
            r15.postDelayed(r2, r0)
            return
        Laa:
            r0 = 4
            if (r6 == r0) goto Lb2
            if (r6 == r3) goto Lb2
            r15.postDelayed(r2, r7)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o93.o():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.t93 t93Var = this.f;
        t93Var.a.addOnLayoutChangeListener(t93Var.x);
        this.C0 = true;
        if (g()) {
            t93Var.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.t93 t93Var = this.f;
        t93Var.a.removeOnLayoutChangeListener(t93Var.x);
        this.C0 = false;
        removeCallbacks(this.d0);
        t93Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.view.View view = this.f.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        android.widget.ImageView imageView;
        if (h() && this.C0 && (imageView = this.K) != null) {
            if (this.J0 == 0) {
                j(imageView, false);
                return;
            }
            defpackage.z83 z83Var = this.A0;
            java.lang.String str = this.j0;
            android.graphics.drawable.Drawable drawable = this.g0;
            if (z83Var != null) {
                defpackage.m41 m41Var = (defpackage.m41) z83Var;
                if (m41Var.s(15)) {
                    j(imageView, true);
                    m41Var.Q();
                    int i = m41Var.F;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.h0);
                        imageView.setContentDescription(this.k0);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.i0);
                        imageView.setContentDescription(this.l0);
                        return;
                    }
                }
            }
            j(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void q() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.v;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.C;
        int iMin = java.lang.Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        android.widget.PopupWindow popupWindow = this.B;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(java.lang.Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        android.widget.ImageView imageView;
        if (h() && this.C0 && (imageView = this.L) != null) {
            defpackage.z83 z83Var = this.A0;
            if (!this.f.b(imageView)) {
                j(imageView, false);
                return;
            }
            java.lang.String str = this.r0;
            android.graphics.drawable.Drawable drawable = this.n0;
            if (z83Var != null) {
                defpackage.m41 m41Var = (defpackage.m41) z83Var;
                if (m41Var.s(14)) {
                    j(imageView, true);
                    m41Var.Q();
                    if (m41Var.G) {
                        drawable = this.m0;
                    }
                    imageView.setImageDrawable(drawable);
                    m41Var.Q();
                    if (m41Var.G) {
                        str = this.q0;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            j(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z;
        long j;
        long J;
        int i;
        long jT;
        int i2;
        defpackage.dk4 dk4Var;
        boolean z2;
        boolean[] zArr;
        boolean z3;
        defpackage.z83 z83Var = this.A0;
        if (z83Var == null) {
            return;
        }
        boolean z4 = this.D0;
        defpackage.ck4 ck4Var = this.c0;
        boolean z5 = false;
        boolean z6 = true;
        this.F0 = z4 && b(z83Var, ck4Var);
        long j2 = 0;
        this.O0 = 0L;
        defpackage.m41 m41Var = (defpackage.m41) z83Var;
        defpackage.dk4 dk4VarK = m41Var.s(17) ? m41Var.k() : defpackage.dk4.a;
        if (dk4VarK.p()) {
            z = true;
            if (m41Var.s(16)) {
                defpackage.dk4 dk4VarK2 = m41Var.k();
                if (dk4VarK2.p()) {
                    jT = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jT = defpackage.gt4.T(dk4VarK2.m(m41Var.h(), m41Var.a, 0L).l);
                }
                if (jT != -9223372036854775807L) {
                    J = defpackage.gt4.J(jT);
                }
                i = 0;
            } else {
                j = 0;
            }
            J = j;
            i = 0;
        } else {
            int iH = m41Var.h();
            boolean z7 = this.F0;
            int i3 = z7 ? 0 : iH;
            int iO = z7 ? dk4VarK.o() - 1 : iH;
            i = 0;
            long j3 = 0;
            defpackage.dk4 dk4Var2 = dk4VarK;
            while (true) {
                if (i3 > iO) {
                    break;
                }
                long j4 = -9223372036854775807L;
                if (i3 == iH) {
                    this.O0 = defpackage.gt4.T(j3);
                }
                dk4Var2.n(i3, ck4Var);
                if (ck4Var.l == -9223372036854775807L) {
                    defpackage.rs.q(this.F0 ^ z6);
                    break;
                }
                int i4 = ck4Var.m;
                defpackage.dk4 dk4Var3 = dk4Var2;
                boolean z8 = z5;
                while (i4 <= ck4Var.n) {
                    defpackage.bk4 bk4Var = this.b0;
                    dk4Var3.f(i4, bk4Var, z8);
                    long j5 = j4;
                    defpackage.o5 o5Var = bk4Var.g;
                    o5Var.getClass();
                    int i5 = o5Var.a;
                    defpackage.dk4 dk4Var4 = dk4Var3;
                    for (int i6 = z8; i6 < i5; i6++) {
                        bk4Var.d(i6);
                        long j6 = j2;
                        long j7 = bk4Var.e;
                        if (j7 >= j6) {
                            long[] jArr = this.K0;
                            i2 = iH;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.K0 = java.util.Arrays.copyOf(jArr, length);
                                this.L0 = java.util.Arrays.copyOf(this.L0, length);
                            }
                            this.K0[i] = defpackage.gt4.T(j7 + j3);
                            boolean[] zArr2 = this.L0;
                            defpackage.n5 n5VarA = bk4Var.g.a(i6);
                            int i7 = n5VarA.a;
                            if (i7 == -1) {
                                zArr = zArr2;
                                dk4Var = dk4Var4;
                                z2 = true;
                                z3 = true;
                            } else {
                                int i8 = 0;
                                defpackage.dk4 dk4Var5 = dk4Var4;
                                while (i8 < i7) {
                                    zArr = zArr2;
                                    int i9 = n5VarA.e[i8];
                                    dk4Var = dk4Var5;
                                    z2 = true;
                                    if (i9 == 0 || i9 == 1) {
                                        z3 = true;
                                        break;
                                    } else {
                                        i8++;
                                        zArr2 = zArr;
                                        dk4Var5 = dk4Var;
                                    }
                                }
                                zArr = zArr2;
                                dk4Var = dk4Var5;
                                z2 = true;
                                z3 = false;
                            }
                            zArr[i] = !z3;
                            i++;
                        } else {
                            i2 = iH;
                            dk4Var = dk4Var4;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        iH = i2;
                        dk4Var4 = dk4Var;
                    }
                    i4++;
                    j4 = j5;
                    dk4Var3 = dk4Var4;
                    z8 = false;
                }
                j3 += ck4Var.l;
                i3++;
                z6 = z6;
                dk4Var2 = dk4Var3;
                z5 = false;
            }
            z = z6;
            J = j3;
        }
        long jT2 = defpackage.gt4.T(J);
        android.widget.TextView textView = this.T;
        if (textView != null) {
            textView.setText(defpackage.gt4.y(this.W, this.a0, jT2));
        }
        defpackage.ln0 ln0Var = this.V;
        if (ln0Var != null) {
            ln0Var.setDuration(jT2);
            long[] jArr2 = this.M0;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.K0;
            if (i10 > jArr3.length) {
                this.K0 = java.util.Arrays.copyOf(jArr3, i10);
                this.L0 = java.util.Arrays.copyOf(this.L0, i10);
            }
            java.lang.System.arraycopy(jArr2, 0, this.K0, i, length2);
            java.lang.System.arraycopy(this.N0, 0, this.L0, i, length2);
            long[] jArr4 = this.K0;
            boolean[] zArr3 = this.L0;
            if (i10 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            defpackage.rs.m(z);
            ln0Var.g0 = i10;
            ln0Var.h0 = jArr4;
            ln0Var.i0 = zArr3;
            ln0Var.e();
        }
        o();
    }

    public void setAnimationEnabled(boolean z) {
        this.f.C = z;
    }

    @java.lang.Deprecated
    public void setOnFullScreenModeChangedListener(defpackage.e93 e93Var) {
        boolean z = e93Var != null;
        android.widget.ImageView imageView = this.O;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = e93Var != null;
        android.widget.ImageView imageView2 = this.P;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(defpackage.z83 z83Var) {
        defpackage.rs.q(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        defpackage.rs.m(z83Var == null || ((defpackage.m41) z83Var).s == android.os.Looper.getMainLooper());
        defpackage.z83 z83Var2 = this.A0;
        if (z83Var2 == z83Var) {
            return;
        }
        defpackage.d93 d93Var = this.t;
        if (z83Var2 != null) {
            ((defpackage.m41) z83Var2).z(d93Var);
        }
        this.A0 = z83Var;
        if (z83Var != null) {
            defpackage.tc2 tc2Var = ((defpackage.m41) z83Var).l;
            d93Var.getClass();
            tc2Var.a(d93Var);
        }
        i();
    }

    public void setRepeatToggleModes(int i) {
        this.J0 = i;
        defpackage.z83 z83Var = this.A0;
        if (z83Var != null && ((defpackage.m41) z83Var).s(15)) {
            defpackage.m41 m41Var = (defpackage.m41) this.A0;
            m41Var.Q();
            int i2 = m41Var.F;
            if (i == 0 && i2 != 0) {
                ((defpackage.m41) this.A0).J(0);
            } else if (i == 1 && i2 == 2) {
                ((defpackage.m41) this.A0).J(1);
            } else if (i == 2 && i2 == 1) {
                ((defpackage.m41) this.A0).J(2);
            }
        }
        this.f.h(this.K, i != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f.h(this.G, z);
        l();
    }

    @java.lang.Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.D0 = z;
        s();
    }

    public void setShowNextButton(boolean z) {
        this.f.h(this.E, z);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.E0 = z;
        m();
    }

    public void setShowPreviousButton(boolean z) {
        this.f.h(this.D, z);
        l();
    }

    public void setShowRewindButton(boolean z) {
        this.f.h(this.H, z);
        l();
    }

    public void setShowShuffleButton(boolean z) {
        this.f.h(this.L, z);
        r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f.h(this.N, z);
    }

    public void setShowTimeoutMs(int i) {
        this.H0 = i;
        if (g()) {
            this.f.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f.h(this.M, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.I0 = defpackage.gt4.h(i, 16, 1000);
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public final void t() {
        defpackage.c93 c93Var = this.y;
        c93Var.getClass();
        java.util.List list = java.util.Collections.EMPTY_LIST;
        c93Var.c = list;
        defpackage.c93 c93Var2 = this.z;
        c93Var2.getClass();
        c93Var2.c = list;
        defpackage.z83 z83Var = this.A0;
        android.widget.ImageView imageView = this.N;
        if (z83Var != null && ((defpackage.m41) z83Var).s(30) && ((defpackage.m41) this.A0).s(29)) {
            defpackage.am4 am4VarL = ((defpackage.m41) this.A0).l();
            defpackage.to3 to3VarE = e(am4VarL, 1);
            c93Var2.c = to3VarE;
            defpackage.o93 o93Var = c93Var2.f;
            defpackage.z83 z83Var2 = o93Var.A0;
            defpackage.j93 j93Var = o93Var.w;
            z83Var2.getClass();
            defpackage.sn0 sn0VarR = ((defpackage.m41) z83Var2).r();
            if (!to3VarE.isEmpty()) {
                if (c93Var2.d(sn0VarR)) {
                    int i = 0;
                    while (true) {
                        if (i >= to3VarE.u) {
                            break;
                        }
                        defpackage.l93 l93Var = (defpackage.l93) to3VarE.get(i);
                        if (l93Var.a.e[l93Var.b]) {
                            j93Var.d[1] = l93Var.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    j93Var.d[1] = o93Var.getResources().getString(dev.jdtech.mpv.R.string.exo_track_selection_auto);
                }
            } else {
                j93Var.d[1] = o93Var.getResources().getString(dev.jdtech.mpv.R.string.exo_track_selection_none);
            }
            if (this.f.b(imageView)) {
                c93Var.e(e(am4VarL, 3));
            } else {
                c93Var.e(defpackage.to3.v);
            }
        }
        j(imageView, c93Var.a() > 0);
        defpackage.j93 j93Var2 = this.w;
        j(this.Q, j93Var2.d(1) || j93Var2.d(0));
    }

    public void setProgressUpdateListener(defpackage.h93 h93Var) {
    }
}
