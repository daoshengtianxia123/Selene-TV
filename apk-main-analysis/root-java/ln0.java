package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class ln0 extends android.view.View {
    public final android.graphics.Paint A;
    public final android.graphics.drawable.Drawable B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final java.lang.StringBuilder L;
    public final java.util.Formatter M;
    public final defpackage.tm N;
    public final java.util.concurrent.CopyOnWriteArraySet O;
    public final android.graphics.Point P;
    public final float Q;
    public int R;
    public long S;
    public int T;
    public android.graphics.Rect U;
    public final android.animation.ValueAnimator V;
    public float W;
    public boolean a0;
    public boolean b0;
    public long c0;
    public long d0;
    public long e0;
    public final android.graphics.Rect f;
    public long f0;
    public int g0;
    public long[] h0;
    public final android.graphics.Rect i;
    public boolean[] i0;
    public final android.graphics.Rect t;
    public final android.graphics.Rect u;
    public final android.graphics.Paint v;
    public final android.graphics.Paint w;
    public final android.graphics.Paint x;
    public final android.graphics.Paint y;
    public final android.graphics.Paint z;

    public ln0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, 0);
        this.f = new android.graphics.Rect();
        this.i = new android.graphics.Rect();
        this.t = new android.graphics.Rect();
        this.u = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.v = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.w = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.x = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.y = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.z = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.A = paint6;
        paint6.setAntiAlias(true);
        this.O = new java.util.concurrent.CopyOnWriteArraySet();
        this.P = new android.graphics.Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.Q = f;
        this.K = a(-50, f);
        int iA = a(4, f);
        int iA2 = a(26, f);
        int iA3 = a(4, f);
        int iA4 = a(12, f);
        int iA5 = a(0, f);
        int iA6 = a(16, f);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.fj3.b, 0, dev.jdtech.mpv.R.style.ExoStyledControls_TimeBar);
            try {
                android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.B = drawable;
                if (drawable != null) {
                    int i = defpackage.gt4.a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iA2 = java.lang.Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.E = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i5 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i2);
                paint6.setColor(i3);
                paint2.setColor(i4);
                paint3.setColor(i5);
                paint4.setColor(i6);
                paint5.setColor(i7);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.C = iA;
            this.D = iA2;
            this.E = 0;
            this.F = iA3;
            this.G = iA4;
            this.H = iA5;
            this.I = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.B = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.L = sb;
        this.M = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.N = new defpackage.tm(6, this);
        android.graphics.drawable.Drawable drawable2 = this.B;
        if (drawable2 != null) {
            this.J = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.J = (java.lang.Math.max(this.H, java.lang.Math.max(this.G, this.I)) + 1) / 2;
        }
        this.W = 1.0f;
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        this.V = valueAnimator;
        valueAnimator.addUpdateListener(new defpackage.q93(4, this));
        this.d0 = -9223372036854775807L;
        this.S = -9223372036854775807L;
        this.R = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.S;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.d0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.R;
    }

    private java.lang.String getProgressText() {
        return defpackage.gt4.y(this.L, this.M, this.e0);
    }

    private long getScrubberPosition() {
        if (this.i.width() <= 0 || this.d0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.u.width() * this.d0) / r0.width();
    }

    public final boolean b(long j) {
        long j2 = this.d0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.b0 ? this.c0 : this.e0;
        long jI = defpackage.gt4.i(j3 + j, 0L, j2);
        if (jI == j3) {
            return false;
        }
        if (this.b0) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.c0 = j;
        this.b0 = true;
        setPressed(true);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        java.util.Iterator it = this.O.iterator();
        while (it.hasNext()) {
            defpackage.o93 o93Var = ((defpackage.d93) it.next()).a;
            o93Var.G0 = true;
            android.widget.TextView textView = o93Var.U;
            if (textView != null) {
                textView.setText(defpackage.gt4.y(o93Var.W, o93Var.a0, j));
            }
            o93Var.f.f();
        }
    }

    public final void d(boolean z) {
        defpackage.z83 z83Var;
        removeCallbacks(this.N);
        this.b0 = false;
        setPressed(false);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        java.util.Iterator it = this.O.iterator();
        while (it.hasNext()) {
            defpackage.d93 d93Var = (defpackage.d93) it.next();
            long j = this.c0;
            defpackage.o93 o93Var = d93Var.a;
            o93Var.G0 = false;
            if (!z && (z83Var = o93Var.A0) != null) {
                if (o93Var.F0) {
                    defpackage.m41 m41Var = (defpackage.m41) z83Var;
                    if (m41Var.s(17) && m41Var.s(10)) {
                        defpackage.dk4 dk4VarK = m41Var.k();
                        int iO = dk4VarK.o();
                        int i = 0;
                        while (true) {
                            long jT = defpackage.gt4.T(dk4VarK.m(i, o93Var.c0, 0L).l);
                            if (j < jT) {
                                break;
                            }
                            if (i == iO - 1) {
                                j = jT;
                                break;
                            } else {
                                j -= jT;
                                i++;
                            }
                        }
                        m41Var.B(i, j, false);
                    }
                } else {
                    defpackage.m41 m41Var2 = (defpackage.m41) z83Var;
                    if (m41Var2.s(5)) {
                        m41Var2.C(j);
                    }
                }
                o93Var.o();
            }
            o93Var.f.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        android.graphics.Rect rect = this.t;
        android.graphics.Rect rect2 = this.i;
        rect.set(rect2);
        android.graphics.Rect rect3 = this.u;
        rect3.set(rect2);
        long j = this.b0 ? this.c0 : this.e0;
        if (this.d0 > 0) {
            rect.right = java.lang.Math.min(rect2.left + ((int) ((rect2.width() * this.f0) / this.d0)), rect2.right);
            rect3.right = java.lang.Math.min(rect2.left + ((int) ((rect2.width() * j) / this.d0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f);
    }

    public final void f(long j) {
        if (this.c0 == j) {
            return;
        }
        this.c0 = j;
        java.util.Iterator it = this.O.iterator();
        while (it.hasNext()) {
            defpackage.o93 o93Var = ((defpackage.d93) it.next()).a;
            android.widget.TextView textView = o93Var.U;
            if (textView != null) {
                textView.setText(defpackage.gt4.y(o93Var.W, o93Var.a0, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.i.width() / this.Q);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.d0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / iWidth;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        canvas.save();
        android.graphics.Rect rect = this.i;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.d0;
        android.graphics.Paint paint = this.x;
        android.graphics.Rect rect2 = this.u;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            android.graphics.Rect rect3 = this.t;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = java.lang.Math.max(java.lang.Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = java.lang.Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.w);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.v);
            }
            if (this.g0 != 0) {
                long[] jArr = this.h0;
                jArr.getClass();
                boolean[] zArr = this.i0;
                zArr.getClass();
                int i5 = this.F;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.g0) {
                    int i9 = i8;
                    canvas.drawRect(java.lang.Math.min(rect.width() - i5, java.lang.Math.max(i7, ((int) ((rect.width() * defpackage.gt4.i(jArr[i8], 0L, this.d0)) / this.d0)) - i6)) + rect.left, iCenterY, r3 + i5, i, zArr[i8] ? this.z : this.y);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.d0 > 0) {
            int iH = defpackage.gt4.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            android.graphics.drawable.Drawable drawable = this.B;
            if (drawable == null) {
                canvas2.drawCircle(iH, iCenterY2, (int) ((((this.b0 || isFocused()) ? this.I : isEnabled() ? this.G : this.H) * this.W) / 2.0f), this.A);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.W)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.W)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.b0 || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.d0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            tm r5 = r4.N
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.b0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        android.graphics.Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.a0 ? 0 : this.J;
        int i8 = this.E;
        int i9 = this.C;
        int i10 = this.D;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - java.lang.Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        android.graphics.Rect rect2 = this.f;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.i.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (defpackage.gt4.a >= 29 && ((rect = this.U) == null || rect.width() != i5 || this.U.height() != i6)) {
            android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, i5, i6);
            this.U = rect3;
            setSystemGestureExclusionRects(java.util.Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int i3 = this.D;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = java.lang.Math.min(i3, size);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), size);
        android.graphics.drawable.Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        android.graphics.drawable.Drawable drawable = this.B;
        if (drawable == null || defpackage.gt4.a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.d0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.P
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.i
            android.graphics.Rect r5 = r9.u
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.b0
            if (r10 == 0) goto La1
            int r10 = r9.K
            if (r2 >= r10) goto L52
            int r10 = r9.T
            int r0 = r0 - r10
            int r0 = r0 / r7
            int r0 = r0 + r10
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.gt4.h(r10, r0, r1)
            r5.right = r10
            goto L60
        L52:
            r9.T = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.gt4.h(r10, r0, r1)
            r5.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.b0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.gt4.h(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.d0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.y.setColor(i);
        invalidate(this.f);
    }

    public void setBufferedColor(int i) {
        this.w.setColor(i);
        invalidate(this.f);
    }

    public void setBufferedPosition(long j) {
        if (this.f0 == j) {
            return;
        }
        this.f0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.d0 == j) {
            return;
        }
        this.d0 = j;
        if (this.b0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.b0 || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        defpackage.rs.m(i > 0);
        this.R = i;
        this.S = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        defpackage.rs.m(j > 0);
        this.R = -1;
        this.S = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.z.setColor(i);
        invalidate(this.f);
    }

    public void setPlayedColor(int i) {
        this.v.setColor(i);
        invalidate(this.f);
    }

    public void setPosition(long j) {
        if (this.e0 == j) {
            return;
        }
        this.e0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.A.setColor(i);
        invalidate(this.f);
    }

    public void setUnplayedColor(int i) {
        this.x.setColor(i);
        invalidate(this.f);
    }
}
