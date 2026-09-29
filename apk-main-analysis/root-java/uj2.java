package defpackage;

/* loaded from: classes.dex */
public abstract class uj2 {
    public static final defpackage.yd4 h;
    public static final defpackage.yd4 i;
    public static final defpackage.yd4 j;
    public static final defpackage.yd4 k;
    public static final defpackage.yd4 l;
    public static final defpackage.yd4 q;
    public static final defpackage.yd4 r;
    public static final defpackage.yd4 s;
    public static final defpackage.cj a = new defpackage.cj(7);
    public static final defpackage.cj b = new defpackage.cj(5);
    public static final defpackage.cj c = new defpackage.cj(8);
    public static final defpackage.cj d = new defpackage.cj(4);
    public static final defpackage.cj e = new defpackage.cj(6);
    public static final defpackage.q60 f = new defpackage.q60(false, 2080443068, new defpackage.qj(2));
    public static final java.lang.Class[] g = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};
    public static final defpackage.e01 m = new defpackage.e01(false);
    public static final defpackage.e01 n = new defpackage.e01(true);
    public static final java.lang.StackTraceElement[] o = new java.lang.StackTraceElement[0];
    public static final defpackage.fb1 p = new defpackage.fb1(17);

    static {
        int i2 = 0;
        h = new defpackage.yd4(i2, "COMPLETING_ALREADY");
        i = new defpackage.yd4(i2, "COMPLETING_WAITING_CHILDREN");
        j = new defpackage.yd4(i2, "COMPLETING_RETRY");
        k = new defpackage.yd4(i2, "TOO_LATE_TO_CANCEL");
        l = new defpackage.yd4(i2, "SEALED");
        q = new defpackage.yd4(i2, "NO_VALUE");
        r = new defpackage.yd4(i2, "NONE");
        s = new defpackage.yd4(i2, "PENDING");
    }

    public static final int[] A(int i2, java.util.List list) {
        int i3;
        int i4 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = defpackage.q8.t0(((defpackage.g40) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((defpackage.g40) list.get(i4)).a;
            if (defpackage.g40.e(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = defpackage.q8.t0(defpackage.g40.c(0.0f, ((defpackage.g40) list.get(1)).a));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = defpackage.q8.t0(defpackage.g40.c(0.0f, ((defpackage.g40) list.get(i4 - 1)).a));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = defpackage.q8.t0(defpackage.g40.c(0.0f, ((defpackage.g40) list.get(i4 - 1)).a));
                    i5 += 2;
                    iArr2[i6] = defpackage.q8.t0(defpackage.g40.c(0.0f, ((defpackage.g40) list.get(i4 + 1)).a));
                }
                i5 = i3;
            } else {
                iArr2[i5] = defpackage.q8.t0(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] B(int i2, java.util.List list, java.util.List list2) {
        if (i2 == 0) {
            if (list != null) {
                return defpackage.y30.Y0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((java.lang.Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((defpackage.g40) list2.get(i4)).a;
            float fFloatValue = list != null ? ((java.lang.Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (defpackage.g40.e(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((java.lang.Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static final defpackage.to2 C(defpackage.k80 k80Var, defpackage.to2 to2Var) {
        if (to2Var.h(defpackage.d5.C)) {
            return to2Var;
        }
        k80Var.c0(1219399079);
        defpackage.to2 to2Var2 = (defpackage.to2) to2Var.j(defpackage.qo2.f, new defpackage.n0(3, k80Var));
        k80Var.p(false);
        return to2Var2;
    }

    public static final defpackage.to2 D(defpackage.k80 k80Var, defpackage.to2 to2Var) {
        k80Var.b0(439770924);
        defpackage.to2 to2VarC = C(k80Var, to2Var);
        k80Var.p(false);
        return to2VarC;
    }

    public static defpackage.df0 E(defpackage.vd0 vd0Var, defpackage.cf0 cf0Var) {
        cf0Var.getClass();
        if (cf0Var instanceof defpackage.ef0) {
            defpackage.ef0 ef0Var = (defpackage.ef0) cf0Var;
            defpackage.cf0 key = vd0Var.getKey();
            key.getClass();
            if ((key != ef0Var && ef0Var.i != key) || ((defpackage.bf0) ef0Var.f.invoke(vd0Var)) == null) {
                return vd0Var;
            }
        } else if (defpackage.d6.J != cf0Var) {
            return vd0Var;
        }
        return defpackage.k01.f;
    }

    public static void F(android.content.pm.PackageInfo packageInfo, java.io.File file) throws java.io.IOException {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException unused) {
        }
    }

    public static final long G(java.lang.String str) {
        char cCharAt;
        int length = str.length();
        int i2 = (length <= 0 || !defpackage.va4.i0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            int i3 = i2;
            while (true) {
                if (i2 < length) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '0') {
                        if (i3 == i2) {
                            i3++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i2++;
                } else if (length - i3 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!defpackage.cb4.d0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? java.lang.Long.parseLong(str) : java.lang.Long.parseLong(defpackage.va4.j0(1, str));
    }

    public static void H(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = java.lang.Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = java.lang.Math.round(f2);
            f2 += i8;
        }
    }

    public static void I(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / java.lang.Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = java.lang.Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = java.lang.Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static final boolean J(android.view.View view, java.lang.Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof defpackage.z7) {
            return ((defpackage.z7) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            android.view.View viewFindNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static int K(double d2) {
        if (java.lang.Double.isNaN(d2)) {
            defpackage.c.n("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d2);
    }

    public static int L(float f2) {
        if (!java.lang.Float.isNaN(f2)) {
            return java.lang.Math.round(f2);
        }
        defpackage.c.n("Cannot round NaN value.");
        return 0;
    }

    public static long M(double d2) {
        if (!java.lang.Double.isNaN(d2)) {
            return java.lang.Math.round(d2);
        }
        defpackage.c.n("Cannot round NaN value.");
        return 0L;
    }

    public static final void N(defpackage.sd0 sd0Var, defpackage.v0 v0Var) {
        try {
            defpackage.u22.H(defpackage.ht1.C(sd0Var), defpackage.as4.a);
        } catch (java.lang.Throwable th) {
            v0Var.resumeWith(new defpackage.zq3(th));
            throw th;
        }
    }

    public static void O(defpackage.xd1 xd1Var, defpackage.v0 v0Var, defpackage.v0 v0Var2) {
        try {
            defpackage.u22.H(defpackage.ht1.C(defpackage.ht1.n(v0Var, v0Var2, xd1Var)), defpackage.as4.a);
        } catch (java.lang.Throwable th) {
            v0Var2.resumeWith(new defpackage.zq3(th));
            throw th;
        }
    }

    public static final android.graphics.BlendMode P(int i2) {
        return i2 == 0 ? android.graphics.BlendMode.CLEAR : i2 == 1 ? android.graphics.BlendMode.SRC : i2 == 2 ? android.graphics.BlendMode.DST : i2 == 3 ? android.graphics.BlendMode.SRC_OVER : i2 == 4 ? android.graphics.BlendMode.DST_OVER : i2 == 5 ? android.graphics.BlendMode.SRC_IN : i2 == 6 ? android.graphics.BlendMode.DST_IN : i2 == 7 ? android.graphics.BlendMode.SRC_OUT : i2 == 8 ? android.graphics.BlendMode.DST_OUT : i2 == 9 ? android.graphics.BlendMode.SRC_ATOP : i2 == 10 ? android.graphics.BlendMode.DST_ATOP : i2 == 11 ? android.graphics.BlendMode.XOR : i2 == 12 ? android.graphics.BlendMode.PLUS : i2 == 13 ? android.graphics.BlendMode.MODULATE : i2 == 14 ? android.graphics.BlendMode.SCREEN : i2 == 15 ? android.graphics.BlendMode.OVERLAY : i2 == 16 ? android.graphics.BlendMode.DARKEN : i2 == 17 ? android.graphics.BlendMode.LIGHTEN : i2 == 18 ? android.graphics.BlendMode.COLOR_DODGE : i2 == 19 ? android.graphics.BlendMode.COLOR_BURN : i2 == 20 ? android.graphics.BlendMode.HARD_LIGHT : i2 == 21 ? android.graphics.BlendMode.SOFT_LIGHT : i2 == 22 ? android.graphics.BlendMode.DIFFERENCE : i2 == 23 ? android.graphics.BlendMode.EXCLUSION : i2 == 24 ? android.graphics.BlendMode.MULTIPLY : i2 == 25 ? android.graphics.BlendMode.HUE : i2 == 26 ? android.graphics.BlendMode.SATURATION : i2 == 27 ? android.graphics.BlendMode.COLOR : i2 == 28 ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final java.lang.Integer Q(int i2) {
        if (i2 == 5) {
            return 33;
        }
        if (i2 == 6) {
            return 130;
        }
        if (i2 == 3) {
            return 17;
        }
        if (i2 == 4) {
            return 66;
        }
        if (i2 == 1) {
            return 2;
        }
        return i2 == 2 ? 1 : null;
    }

    public static final long R(long j2, defpackage.ty0 ty0Var) {
        java.util.concurrent.TimeUnit timeUnit = ty0Var.f;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j2 || j2 > jConvert) {
            return v(defpackage.xr1.J(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jConvert2 = timeUnit2.convert(j2, timeUnit) << 1;
        int i2 = defpackage.qy0.u;
        int i3 = defpackage.ry0.a;
        return jConvert2;
    }

    public static final defpackage.w91 S(int i2) {
        if (i2 == 1) {
            return new defpackage.w91(2);
        }
        if (i2 == 2) {
            return new defpackage.w91(1);
        }
        if (i2 == 17) {
            return new defpackage.w91(3);
        }
        if (i2 == 33) {
            return new defpackage.w91(5);
        }
        if (i2 == 66) {
            return new defpackage.w91(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new defpackage.w91(6);
    }

    public static final android.graphics.PorterDuff.Mode T(int i2) {
        return i2 == 0 ? android.graphics.PorterDuff.Mode.CLEAR : i2 == 1 ? android.graphics.PorterDuff.Mode.SRC : i2 == 2 ? android.graphics.PorterDuff.Mode.DST : i2 == 3 ? android.graphics.PorterDuff.Mode.SRC_OVER : i2 == 4 ? android.graphics.PorterDuff.Mode.DST_OVER : i2 == 5 ? android.graphics.PorterDuff.Mode.SRC_IN : i2 == 6 ? android.graphics.PorterDuff.Mode.DST_IN : i2 == 7 ? android.graphics.PorterDuff.Mode.SRC_OUT : i2 == 8 ? android.graphics.PorterDuff.Mode.DST_OUT : i2 == 9 ? android.graphics.PorterDuff.Mode.SRC_ATOP : i2 == 10 ? android.graphics.PorterDuff.Mode.DST_ATOP : i2 == 11 ? android.graphics.PorterDuff.Mode.XOR : i2 == 12 ? android.graphics.PorterDuff.Mode.ADD : i2 == 14 ? android.graphics.PorterDuff.Mode.SCREEN : i2 == 15 ? android.graphics.PorterDuff.Mode.OVERLAY : i2 == 16 ? android.graphics.PorterDuff.Mode.DARKEN : i2 == 17 ? android.graphics.PorterDuff.Mode.LIGHTEN : i2 == 13 ? android.graphics.PorterDuff.Mode.MULTIPLY : android.graphics.PorterDuff.Mode.SRC_OVER;
    }

    public static java.lang.String U(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final java.lang.Object V(java.lang.Object obj) {
        defpackage.ip1 ip1Var;
        defpackage.jp1 jp1Var = obj instanceof defpackage.jp1 ? (defpackage.jp1) obj : null;
        return (jp1Var == null || (ip1Var = jp1Var.a) == null) ? obj : ip1Var;
    }

    public static final void W(java.util.List list, java.util.List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            defpackage.c.n("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            defpackage.c.n("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void X(android.content.Context r16, java.util.concurrent.Executor r17, defpackage.xe3 r18, boolean r19) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r1 = r16
            r5 = r18
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 0
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            java.io.File r10 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r11 = 1
            if (r19 != 0) goto L89
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r10, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L40
        L3e:
            r0 = r8
            goto L6d
        L40:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3e
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3e
            r12.<init>(r0)     // Catch: java.io.IOException -> L3e
            r7.<init>(r12)     // Catch: java.io.IOException -> L3e
            long r12 = r7.readLong()     // Catch: java.lang.Throwable -> L62
            r7.close()     // Catch: java.io.IOException -> L3e
            long r14 = r9.lastUpdateTime
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = r11
            goto L5a
        L59:
            r0 = r8
        L5a:
            if (r0 == 0) goto L6d
            r7 = 2
            r12 = 0
            r5.e(r7, r12)
            goto L6d
        L62:
            r0 = move-exception
            r12 = r0
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch: java.io.IOException -> L3e
        L6c:
            throw r12     // Catch: java.io.IOException -> L3e
        L6d:
            if (r0 != 0) goto L70
            goto L89
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            defpackage.cf3.c(r1, r8)
            goto Ld4
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            wt0 r2 = new wt0
            r3 = r4
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r0 = r2.a()
            if (r0 != 0) goto Lbc
            r0 = r8
            goto Lcc
        Lbc:
            wt0 r0 = r2.c()
            r0.e()
            boolean r0 = r0.f()
            if (r0 == 0) goto Lcc
            F(r9, r10)
        Lcc:
            if (r0 == 0) goto Ld1
            if (r19 == 0) goto Ld1
            r8 = r11
        Ld1:
            defpackage.cf3.c(r1, r8)
        Ld4:
            return
        Ld5:
            r0 = move-exception
            r2 = 7
            r5.e(r2, r0)
            defpackage.cf3.c(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj2.X(android.content.Context, java.util.concurrent.Executor, xe3, boolean):void");
    }

    public static final void a(defpackage.k80 k80Var, int i2) {
        defpackage.k80 k80Var2 = k80Var;
        java.lang.Object obj = defpackage.z70.a;
        k80Var2.d0(-260692182);
        int i3 = 0;
        if (k80Var2.S(i2 & 1, i2 != 0)) {
            android.content.Context context = (android.content.Context) k80Var2.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(new defpackage.pv2[0], 0);
            int i4 = 11;
            defpackage.mw mwVar = new defpackage.mw(defpackage.qf.A, new defpackage.s7(i4, context));
            boolean zH = k80Var2.h(context);
            java.lang.Object objP = k80Var2.P();
            if (zH || objP == obj) {
                objP = new defpackage.wc(i4, context);
                k80Var2.l0(objP);
            }
            defpackage.vu2 vu2Var = (defpackage.vu2) defpackage.st1.B(objArrCopyOf, mwVar, (defpackage.hd1) objP, k80Var2, 0, 4);
            java.lang.Object objP2 = k80Var2.P();
            if (objP2 == obj) {
                objP2 = (defpackage.lj.g() || defpackage.lj.b) ? defpackage.xj1.INSTANCE : defpackage.rg2.INSTANCE;
                k80Var2.l0(objP2);
            }
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.i, false);
            long j2 = k80Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            defpackage.y53 y53VarL = k80Var2.l();
            defpackage.to2 to2VarD = D(k80Var2, fillElement);
            defpackage.w70.b.getClass();
            defpackage.j90 j90Var = defpackage.v70.b;
            k80Var2.f0();
            if (k80Var2.S) {
                k80Var2.k(j90Var);
            } else {
                k80Var2.o0();
            }
            defpackage.ht1.J(k80Var2, defpackage.v70.f, fk2VarD);
            defpackage.ht1.J(k80Var2, defpackage.v70.e, y53VarL);
            defpackage.qf qfVar = defpackage.v70.g;
            if (k80Var2.S || !defpackage.ct1.g(k80Var2.P(), java.lang.Integer.valueOf(i5))) {
                defpackage.ms1.G(i5, k80Var2, i5, qfVar);
            }
            defpackage.ht1.J(k80Var2, defpackage.v70.d, to2VarD);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.a;
            boolean zH2 = k80Var2.h(vu2Var);
            java.lang.Object objP3 = k80Var2.P();
            if (zH2 || objP3 == obj) {
                objP3 = new defpackage.pj(i3, vu2Var);
                k80Var2.l0(objP3);
            }
            defpackage.xr1.m(vu2Var, objP2, null, null, null, null, null, null, null, (defpackage.jd1) objP3, k80Var, 0);
            k80Var2 = k80Var;
            defpackage.xr1.s(k80Var2, 0);
            defpackage.or1.c(androidx.compose.foundation.layout.c.h(aVar.a(qo2Var, defpackage.d6.z), 0.0f, 0.0f, 0.0f, 64.0f, 7), k80Var2, 0);
            k80Var2.p(true);
        } else {
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.qj(i2, i3);
        }
    }

    public static final void b(boolean z, defpackage.hd1 hd1Var, defpackage.k80 k80Var, int i2, int i3) {
        int i4;
        k80Var.d0(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (k80Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= k80Var.f(hd1Var) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && k80Var.E()) {
            k80Var.V();
        } else {
            int i6 = 1;
            if (i5 != 0) {
                z = true;
            }
            defpackage.ls2 ls2VarE = defpackage.or1.E(hd1Var, k80Var);
            k80Var.c0(-3687241);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj = defpackage.z70.a;
            if (objP == obj) {
                objP = new defpackage.ep(ls2VarE, z);
                k80Var.l0(objP);
            }
            k80Var.p(false);
            defpackage.ep epVar = (defpackage.ep) objP;
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(z);
            k80Var.c0(-3686552);
            boolean zF = k80Var.f(objValueOf) | k80Var.f(epVar);
            java.lang.Object objP2 = k80Var.P();
            if (zF || objP2 == obj) {
                objP2 = new defpackage.cp(epVar, z);
                k80Var.l0(objP2);
            }
            k80Var.p(false);
            defpackage.ft4.Y((defpackage.hd1) objP2, k80Var);
            defpackage.vz2 vz2VarA = defpackage.rf2.a(k80Var);
            if (vz2VarA == null) {
                defpackage.c.r("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            } else {
                defpackage.tz2 tz2VarB = vz2VarA.b();
                defpackage.ib2 ib2Var = (defpackage.ib2) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                defpackage.ft4.Q(ib2Var, tz2VarB, new defpackage.fe(i6, tz2VarB, ib2Var, epVar), k80Var);
            }
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT == null) {
            return;
        }
        ll3VarT.d = new defpackage.dp(z, hd1Var, i2, i3);
    }

    public static final void c(defpackage.iu0 iu0Var, defpackage.k80 k80Var, int i2) {
        defpackage.b64 b64Var;
        defpackage.iu0 iu0Var2 = iu0Var;
        k80Var.d0(294589392);
        int i3 = 4;
        int i4 = i2 | (k80Var.f(iu0Var2) ? 4 : 2);
        if ((i4 & 3) == 2 && k80Var.E()) {
            k80Var.V();
        } else {
            defpackage.pt3 pt3VarD = defpackage.or1.D(k80Var);
            defpackage.ls2 ls2VarL = defpackage.or1.l(iu0Var2.b().e, k80Var);
            java.util.List list = (java.util.List) ls2VarL.getValue();
            boolean zBooleanValue = ((java.lang.Boolean) k80Var.j(defpackage.cr1.a)).booleanValue();
            boolean zF = k80Var.f(list);
            java.lang.Object objP = k80Var.P();
            java.lang.Object obj = defpackage.z70.a;
            java.lang.Object obj2 = objP;
            if (zF || objP == obj) {
                defpackage.b64 b64Var2 = new defpackage.b64();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    defpackage.yt2 yt2Var = (defpackage.yt2) obj3;
                    if (zBooleanValue || yt2Var.y.e.compareTo(defpackage.db2.u) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                b64Var2.addAll(arrayList);
                k80Var.l0(b64Var2);
                obj2 = b64Var2;
            }
            defpackage.b64 b64Var3 = (defpackage.b64) obj2;
            j(b64Var3, (java.util.List) ls2VarL.getValue(), k80Var, 0);
            defpackage.ls2 ls2VarL2 = defpackage.or1.l(iu0Var2.b().f, k80Var);
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == obj) {
                objP2 = new defpackage.b64();
                k80Var.l0(objP2);
            }
            defpackage.b64 b64Var4 = (defpackage.b64) objP2;
            k80Var.b0(1361037007);
            java.util.ListIterator listIterator = b64Var3.listIterator();
            while (true) {
                defpackage.q94 q94Var = (defpackage.q94) listIterator;
                if (!q94Var.hasNext()) {
                    break;
                }
                defpackage.yt2 yt2Var2 = (defpackage.yt2) q94Var.next();
                defpackage.pu2 pu2Var = yt2Var2.i;
                pu2Var.getClass();
                defpackage.hu0 hu0Var = (defpackage.hu0) pu2Var;
                boolean zH = ((i4 & 14) == 4) | k80Var.h(yt2Var2);
                java.lang.Object objP3 = k80Var.P();
                if (zH || objP3 == obj) {
                    objP3 = new defpackage.o7(iu0Var2, 7, yt2Var2);
                    k80Var.l0(objP3);
                }
                defpackage.rs.a((defpackage.hd1) objP3, hu0Var.f(), defpackage.q8.n0(1129586364, new defpackage.bu0(yt2Var2, iu0Var2, pt3VarD, b64Var4, hu0Var), k80Var), k80Var, 384);
                iu0Var2 = iu0Var;
            }
            k80Var.p(false);
            java.util.Set set = (java.util.Set) ls2VarL2.getValue();
            boolean zF2 = k80Var.f(ls2VarL2) | ((i4 & 14) == 4);
            java.lang.Object objP4 = k80Var.P();
            if (zF2 || objP4 == obj) {
                b64Var = b64Var4;
                iu0Var2 = iu0Var;
                java.lang.Object cu0Var = new defpackage.cu0(ls2VarL2, iu0Var2, b64Var, null, 0);
                k80Var.l0(cu0Var);
                objP4 = cu0Var;
            } else {
                iu0Var2 = iu0Var;
                b64Var = b64Var4;
            }
            defpackage.ft4.U(set, b64Var, (defpackage.xd1) objP4, k80Var);
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.n0(i2, i3, iu0Var2);
        }
    }

    public static final void d(final int i2, defpackage.k80 k80Var, final defpackage.hd1 hd1Var, final defpackage.jd1 jd1Var, final java.lang.String str, final java.lang.String str2, final java.util.List list, final boolean z) {
        defpackage.ls2 ls2Var;
        defpackage.ls2 ls2Var2;
        list.getClass();
        str2.getClass();
        jd1Var.getClass();
        hd1Var.getClass();
        k80Var.d0(2010768567);
        int i3 = (k80Var.g(z) ? 4 : 2) | i2 | (k80Var.f(str) ? 32 : 16) | (k80Var.h(list) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var.f(str2) ? 2048 : 1024);
        if (k80Var.S(i3 & 1, (74899 & i3) != 74898)) {
            java.lang.Object objP = k80Var.P();
            defpackage.cj cjVar = defpackage.z70.a;
            if (objP == cjVar) {
                objP = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP);
            }
            defpackage.ls2 ls2Var3 = (defpackage.ls2) objP;
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == cjVar) {
                objP2 = defpackage.or1.C(java.lang.Boolean.FALSE);
                k80Var.l0(objP2);
            }
            defpackage.ls2 ls2Var4 = (defpackage.ls2) objP2;
            java.lang.Object objP3 = k80Var.P();
            if (objP3 == cjVar) {
                objP3 = defpackage.or1.C(null);
                k80Var.l0(objP3);
            }
            final defpackage.ls2 ls2Var5 = (defpackage.ls2) objP3;
            java.lang.Object objP4 = k80Var.P();
            if (objP4 == cjVar) {
                objP4 = defpackage.ft4.e0(k80Var);
                k80Var.l0(objP4);
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean z2 = (i3 & 14) == 4;
            java.lang.Object objP5 = k80Var.P();
            if (z2 || objP5 == cjVar) {
                ls2Var = ls2Var3;
                ls2Var2 = ls2Var4;
                defpackage.bh bhVar = new defpackage.bh(z, ls2Var, ls2Var2, ls2Var5, jd1Var, (defpackage.sd0) null);
                k80Var.l0(bhVar);
                objP5 = bhVar;
            } else {
                ls2Var = ls2Var3;
                ls2Var2 = ls2Var4;
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP5, boolValueOf);
            if (((java.lang.Boolean) ls2Var.getValue()).booleanValue()) {
                k80Var.b0(898479059);
                final defpackage.ls2 ls2Var6 = ls2Var2;
                defpackage.rb.b(null, hd1Var, new defpackage.cd3(false, 8), defpackage.q8.n0(988583183, new defpackage.xd1() { // from class: q61
                    @Override // defpackage.xd1
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.k80 k80Var2 = (defpackage.k80) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        if (k80Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            boolean zBooleanValue = ((java.lang.Boolean) ls2Var6.getValue()).booleanValue();
                            defpackage.hd1 hd1Var2 = hd1Var;
                            boolean zF = k80Var2.f(hd1Var2);
                            java.lang.Object objP6 = k80Var2.P();
                            if (zF || objP6 == defpackage.z70.a) {
                                objP6 = new defpackage.fz(hd1Var2, ls2Var5, 1);
                                k80Var2.l0(objP6);
                            }
                            defpackage.uj2.e(0, k80Var2, hd1Var2, (defpackage.jd1) objP6, str, str2, list, zBooleanValue);
                        } else {
                            k80Var2.V();
                        }
                        return defpackage.as4.a;
                    }
                }, k80Var), k80Var, 28032);
            } else {
                k80Var.b0(895689803);
            }
            k80Var.p(false);
        } else {
            k80Var.V();
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.xd1(i2, hd1Var, jd1Var, str, str2, list, z) { // from class: s61
                public final /* synthetic */ boolean f;
                public final /* synthetic */ java.lang.String i;
                public final /* synthetic */ java.util.List t;
                public final /* synthetic */ java.lang.String u;
                public final /* synthetic */ defpackage.jd1 v;
                public final /* synthetic */ defpackage.hd1 w;

                {
                    this.f = z;
                    this.i = str;
                    this.t = list;
                    this.u = str2;
                    this.v = jd1Var;
                    this.w = hd1Var;
                }

                @Override // defpackage.xd1
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.uj2.d(defpackage.st1.G(221185), (defpackage.k80) obj, this.w, this.v, this.i, this.u, this.t, this.f);
                    return defpackage.as4.a;
                }
            };
        }
    }

    public static final void e(int i2, defpackage.k80 k80Var, defpackage.hd1 hd1Var, final defpackage.jd1 jd1Var, java.lang.String str, final java.lang.String str2, final java.util.List list, boolean z) {
        defpackage.iv3 iv3Var;
        java.lang.Object obj;
        defpackage.l94 l94Var;
        int i3;
        java.lang.Boolean bool;
        int i4;
        java.util.Map map;
        final defpackage.w33 w33Var;
        defpackage.hd1 hd1Var2;
        defpackage.qf qfVar;
        defpackage.k80 k80Var2 = k80Var;
        k80Var2.d0(931143186);
        int i5 = i2 | (k80Var2.f(str) ? 4 : 2) | (k80Var2.h(list) ? 32 : 16) | (k80Var2.f(str2) ? 256 : io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE) | (k80Var2.g(z) ? 2048 : 1024) | (k80Var2.h(jd1Var) ? 16384 : 8192) | (k80Var.h(hd1Var) ? 131072 : 65536);
        if (k80Var2.S(i5 & 1, (74899 & i5) != 74898)) {
            int i6 = 458752 & i5;
            boolean z2 = i6 == 131072;
            java.lang.Object objP = k80Var2.P();
            java.lang.Object obj2 = defpackage.z70.a;
            if (z2 || objP == obj2) {
                objP = new defpackage.cz(hd1Var, 3);
                k80Var2.l0(objP);
            }
            b(true, (defpackage.hd1) objP, k80Var2, 6, 0);
            defpackage.j84 j84VarS0 = defpackage.q8.s0(0.8f, 400.0f, null, 4);
            defpackage.j84 j84VarS02 = defpackage.q8.s0(0.9f, 500.0f, null, 4);
            defpackage.l94 l94VarB = defpackage.ae.b(z ? 1.0f : 0.8f, z ? j84VarS0 : j84VarS02, "dialog_scale", k80Var2, 3072, 20);
            defpackage.l94 l94VarB2 = defpackage.ae.b(z ? 1.0f : 0.0f, z ? j84VarS0 : j84VarS02, "dialog_opacity", k80Var, 3072, 20);
            float f2 = z ? 1.0f : 0.0f;
            if (!z) {
                j84VarS0 = j84VarS02;
            }
            defpackage.l94 l94VarB3 = defpackage.ae.b(f2, j84VarS0, "overlay_opacity", k80Var, 3072, 20);
            android.content.res.Configuration configuration = (android.content.res.Configuration) k80Var.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a);
            float f3 = configuration.screenWidthDp;
            float f4 = configuration.screenHeightDp;
            float f5 = f3 * 0.7f;
            float f6 = 0.4f * f4;
            float f7 = f4 * 0.8f;
            defpackage.iv3 iv3VarI = defpackage.ht1.I(k80Var);
            java.lang.Object objP2 = k80Var.P();
            if (objP2 == obj2) {
                objP2 = defpackage.ft4.e0(k80Var);
                k80Var.l0(objP2);
            }
            final defpackage.nf0 nf0Var = (defpackage.nf0) objP2;
            boolean zF = k80Var.f(list);
            java.lang.Object objP3 = k80Var.P();
            if (zF || objP3 == obj2) {
                int iJ = defpackage.ij2.J(defpackage.z30.g0(10, list));
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iJ >= 16 ? iJ : 16);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((defpackage.cz3) it.next()).a, new defpackage.ta1());
                    iv3VarI = iv3VarI;
                }
                iv3Var = iv3VarI;
                k80Var.l0(linkedHashMap);
                obj = linkedHashMap;
            } else {
                iv3Var = iv3VarI;
                obj = objP3;
            }
            java.util.Map map2 = (java.util.Map) obj;
            java.lang.Object objP4 = k80Var.P();
            if (objP4 == obj2) {
                objP4 = new defpackage.d64();
                k80Var.l0(objP4);
            }
            final defpackage.d64 d64Var = (defpackage.d64) objP4;
            java.lang.Object objP5 = k80Var.P();
            if (objP5 == obj2) {
                objP5 = new defpackage.d64();
                k80Var.l0(objP5);
            }
            final defpackage.d64 d64Var2 = (defpackage.d64) objP5;
            java.lang.Object objP6 = k80Var.P();
            if (objP6 == obj2) {
                objP6 = new defpackage.w33(0.0f);
                k80Var.l0(objP6);
            }
            defpackage.w33 w33Var2 = (defpackage.w33) objP6;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zH = ((i5 & 7168) == 2048) | k80Var.h(list) | ((i5 & 896) == 256) | k80Var.h(map2);
            java.lang.Object objP7 = k80Var.P();
            if (zH || objP7 == obj2) {
                l94Var = l94VarB2;
                i3 = i5;
                bool = boolValueOf;
                i4 = 131072;
                java.lang.Object rs0Var = new defpackage.rs0(z, list, str2, map2, null, 2);
                map = map2;
                k80Var.l0(rs0Var);
                objP7 = rs0Var;
            } else {
                map = map2;
                l94Var = l94VarB2;
                i3 = i5;
                i4 = 131072;
                bool = boolValueOf;
            }
            defpackage.ft4.T(k80Var, (defpackage.xd1) objP7, bool);
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.d.c;
            boolean zF2 = k80Var.f(l94VarB3);
            java.lang.Object objP8 = k80Var.P();
            if (zF2 || objP8 == obj2) {
                objP8 = new defpackage.fl(l94VarB3, 15);
                k80Var.l0(objP8);
            }
            defpackage.to2 to2VarB = androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(fillElement, (defpackage.jd1) objP8), defpackage.g40.c(0.7f, defpackage.g40.b), defpackage.pp4.f);
            boolean z3 = i6 == i4;
            java.lang.Object objP9 = k80Var.P();
            if (z3 || objP9 == obj2) {
                objP9 = new defpackage.lz(hd1Var, 1);
                k80Var.l0(objP9);
            }
            defpackage.to2 to2VarA = androidx.compose.ui.input.key.a.a(to2VarB, (defpackage.jd1) objP9);
            defpackage.fk2 fk2VarD = defpackage.ys.d(defpackage.d6.w, false);
            int iS = defpackage.ms1.s(k80Var.T);
            defpackage.y53 y53VarL = k80Var.l();
            defpackage.to2 to2VarD = D(k80Var, to2VarA);
            defpackage.w70.b.getClass();
            defpackage.hd1 hd1Var3 = defpackage.v70.b;
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var3);
            } else {
                k80Var.o0();
            }
            defpackage.qf qfVar2 = defpackage.v70.f;
            defpackage.ht1.J(k80Var, qfVar2, fk2VarD);
            defpackage.qf qfVar3 = defpackage.v70.e;
            defpackage.ht1.J(k80Var, qfVar3, y53VarL);
            defpackage.qf qfVar4 = defpackage.v70.g;
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(iS))) {
                defpackage.ms1.G(iS, k80Var, iS, qfVar4);
            }
            defpackage.qf qfVar5 = defpackage.v70.d;
            defpackage.ht1.J(k80Var, qfVar5, to2VarD);
            defpackage.qo2 qo2Var = defpackage.qo2.f;
            defpackage.to2 to2VarF = androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.l(qo2Var, f5), f6, f7);
            defpackage.l94 l94Var2 = l94Var;
            boolean zF3 = k80Var.f(l94VarB) | k80Var.f(l94Var2);
            java.lang.Object objP10 = k80Var.P();
            if (zF3 || objP10 == obj2) {
                objP10 = new defpackage.dz(l94VarB, l94Var2, 1);
                k80Var.l0(objP10);
            }
            defpackage.to2 to2VarD2 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(to2VarF, (defpackage.jd1) objP10), defpackage.q8.s(4279900698L), defpackage.hs3.a(12.0f)), 24.0f);
            defpackage.dr drVar = defpackage.d6.i;
            defpackage.fk2 fk2VarD2 = defpackage.ys.d(drVar, false);
            int iS2 = defpackage.ms1.s(k80Var.T);
            defpackage.y53 y53VarL2 = k80Var.l();
            defpackage.to2 to2VarD3 = D(k80Var, to2VarD2);
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var3);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, qfVar2, fk2VarD2);
            defpackage.ht1.J(k80Var, qfVar3, y53VarL2);
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(iS2))) {
                defpackage.ms1.G(iS2, k80Var, iS2, qfVar4);
            }
            defpackage.ht1.J(k80Var, qfVar5, to2VarD3);
            defpackage.br brVar = defpackage.d6.E;
            defpackage.cj cjVar = c;
            defpackage.v40 v40VarA = defpackage.t40.a(cjVar, brVar, k80Var, 0);
            int iS3 = defpackage.ms1.s(k80Var.T);
            defpackage.y53 y53VarL3 = k80Var.l();
            defpackage.to2 to2VarD4 = D(k80Var, qo2Var);
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var3);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, qfVar2, v40VarA);
            defpackage.ht1.J(k80Var, qfVar3, y53VarL3);
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(iS3))) {
                defpackage.ms1.G(iS3, k80Var, iS3, qfVar4);
            }
            defpackage.ht1.J(k80Var, qfVar5, to2VarD4);
            final defpackage.iv3 iv3Var2 = iv3Var;
            defpackage.ii4.a(str, androidx.compose.foundation.layout.c.h(qo2Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), defpackage.g40.c, defpackage.nq1.A(18), defpackage.jc1.t, 0L, null, 0L, 0, false, 0, 0, null, null, k80Var, (i3 & 14) | 200112, 0, 131024);
            androidx.compose.foundation.layout.LayoutWeightElement layoutWeightElement = new androidx.compose.foundation.layout.LayoutWeightElement(1.0f, false);
            java.lang.Object objP11 = k80Var.P();
            if (objP11 == obj2) {
                w33Var = w33Var2;
                objP11 = new defpackage.k0(13, w33Var);
                k80Var.l0(objP11);
            } else {
                w33Var = w33Var2;
            }
            defpackage.to2 to2VarB2 = androidx.compose.ui.layout.a.b(layoutWeightElement, (defpackage.jd1) objP11);
            defpackage.fk2 fk2VarD3 = defpackage.ys.d(drVar, false);
            int iS4 = defpackage.ms1.s(k80Var.T);
            defpackage.y53 y53VarL4 = k80Var.l();
            defpackage.to2 to2VarD5 = D(k80Var, to2VarB2);
            k80Var.f0();
            if (k80Var.S) {
                hd1Var2 = hd1Var3;
                k80Var.k(hd1Var2);
            } else {
                hd1Var2 = hd1Var3;
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, qfVar2, fk2VarD3);
            defpackage.ht1.J(k80Var, qfVar3, y53VarL4);
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(iS4))) {
                qfVar = qfVar4;
                defpackage.ms1.G(iS4, k80Var, iS4, qfVar);
            } else {
                qfVar = qfVar4;
            }
            defpackage.ht1.J(k80Var, qfVar5, to2VarD5);
            defpackage.to2 to2VarT = defpackage.ht1.T(qo2Var, iv3Var2);
            defpackage.v40 v40VarA2 = defpackage.t40.a(cjVar, brVar, k80Var, 0);
            int iS5 = defpackage.ms1.s(k80Var.T);
            defpackage.y53 y53VarL5 = k80Var.l();
            defpackage.to2 to2VarD6 = D(k80Var, to2VarT);
            k80Var.f0();
            if (k80Var.S) {
                k80Var.k(hd1Var2);
            } else {
                k80Var.o0();
            }
            defpackage.ht1.J(k80Var, qfVar2, v40VarA2);
            defpackage.ht1.J(k80Var, qfVar3, y53VarL5);
            if (k80Var.S || !defpackage.ct1.g(k80Var.P(), java.lang.Integer.valueOf(iS5))) {
                defpackage.ms1.G(iS5, k80Var, iS5, qfVar);
            }
            defpackage.ht1.J(k80Var, qfVar5, to2VarD6);
            int i7 = 1;
            final java.util.Map map3 = map;
            defpackage.n91.b(null, new defpackage.yj(10.0f, new defpackage.qj(i7)), new defpackage.yj(10.0f, new defpackage.qj(i7)), null, 0, 0, defpackage.q8.n0(608049679, new defpackage.yd1() { // from class: t61
                @Override // defpackage.yd1
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    defpackage.k80 k80Var3 = (defpackage.k80) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    ((defpackage.t91) obj3).getClass();
                    if (k80Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        for (defpackage.cz3 cz3Var : list) {
                            boolean zG = defpackage.ct1.g(cz3Var.a, str2);
                            java.lang.Object obj6 = map3.get(cz3Var.a);
                            obj6.getClass();
                            defpackage.ta1 ta1Var = (defpackage.ta1) obj6;
                            java.lang.Object obj7 = jd1Var;
                            boolean zF4 = k80Var3.f(obj7) | k80Var3.f(cz3Var);
                            java.lang.Object objP12 = k80Var3.P();
                            java.lang.Object obj8 = defpackage.z70.a;
                            if (zF4 || objP12 == obj8) {
                                objP12 = new defpackage.jc(obj7, 13, cz3Var);
                                k80Var3.l0(objP12);
                            }
                            defpackage.hd1 hd1Var4 = (defpackage.hd1) objP12;
                            boolean zF5 = k80Var3.f(cz3Var);
                            java.lang.Object objP13 = k80Var3.P();
                            defpackage.d64 d64Var3 = d64Var;
                            defpackage.d64 d64Var4 = d64Var2;
                            if (zF5 || objP13 == obj8) {
                                objP13 = new defpackage.lt(7, d64Var3, cz3Var, d64Var4);
                                k80Var3.l0(objP13);
                            }
                            defpackage.xd1 xd1Var = (defpackage.xd1) objP13;
                            java.lang.Object obj9 = iv3Var2;
                            boolean zF6 = k80Var3.f(obj9);
                            java.lang.Object obj10 = nf0Var;
                            boolean zH2 = zF6 | k80Var3.h(obj10);
                            java.lang.Object objP14 = k80Var3.P();
                            if (zH2 || objP14 == obj8) {
                                objP14 = new defpackage.ma(d64Var3, d64Var4, obj9, obj10, w33Var, 1);
                                k80Var3.l0(objP14);
                            }
                            defpackage.uj2.f(cz3Var, zG, ta1Var, hd1Var4, xd1Var, (defpackage.jd1) objP14, k80Var3, 0);
                        }
                    } else {
                        k80Var3.V();
                    }
                    return defpackage.as4.a;
                }
            }, k80Var), k80Var, 1573296);
            k80Var2 = k80Var;
            k80Var2.p(true);
            k80Var2.p(true);
            k80Var2.p(true);
            k80Var2.p(true);
            k80Var2.p(true);
        } else {
            k80Var2.V();
        }
        defpackage.ll3 ll3VarT = k80Var2.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.r61(i2, hd1Var, jd1Var, str, str2, list, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.cz3 r30, boolean r31, defpackage.ta1 r32, defpackage.hd1 r33, defpackage.xd1 r34, defpackage.jd1 r35, defpackage.k80 r36, int r37) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj2.f(cz3, boolean, ta1, hd1, xd1, jd1, k80, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.vu2 r44, defpackage.k80 r45, int r46) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj2.g(vu2, k80, int):void");
    }

    public static defpackage.j24 h(int i2, int i3, defpackage.nu nuVar) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i5 = i3 & 4;
        defpackage.nu nuVar2 = defpackage.nu.f;
        if (i5 != 0) {
            nuVar = nuVar2;
        }
        if (i2 < 0) {
            defpackage.jc2.f(defpackage.ms1.y(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i4 <= 0 && i2 <= 0 && nuVar != nuVar2) {
            defpackage.jc2.w(nuVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i6 = i2 + i4;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new defpackage.j24(i4, i6, nuVar);
    }

    public static final defpackage.o94 i(java.lang.Object obj) {
        if (obj == null) {
            obj = defpackage.u22.q;
        }
        return new defpackage.o94(obj);
    }

    public static final void j(java.util.List list, java.util.Collection collection, defpackage.k80 k80Var, int i2) {
        k80Var.d0(1537894851);
        if ((((k80Var.h(list) ? 4 : 2) | i2 | (k80Var.h(collection) ? 32 : 16)) & 19) == 18 && k80Var.E()) {
            k80Var.V();
        } else {
            boolean zBooleanValue = ((java.lang.Boolean) k80Var.j(defpackage.cr1.a)).booleanValue();
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                defpackage.yt2 yt2Var = (defpackage.yt2) it.next();
                defpackage.kb2 kb2Var = yt2Var.y;
                boolean zG = k80Var.g(zBooleanValue) | k80Var.h(list) | k80Var.h(yt2Var);
                java.lang.Object objP = k80Var.P();
                if (zG || objP == defpackage.z70.a) {
                    objP = new defpackage.fu0(yt2Var, list, zBooleanValue);
                    k80Var.l0(objP);
                }
                defpackage.ft4.P(kb2Var, (defpackage.jd1) objP, k80Var);
            }
        }
        defpackage.ll3 ll3VarT = k80Var.t();
        if (ll3VarT != null) {
            ll3VarT.d = new defpackage.c9(list, collection, i2);
        }
    }

    public static final long k(java.lang.String str) throws java.lang.NumberFormatException {
        long jW;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            defpackage.c.n("The string is empty");
            return 0L;
        }
        int i2 = defpackage.qy0.u;
        char cCharAt2 = str.charAt(0);
        int i3 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i3 > 0 && defpackage.va4.K0(str, '-');
        if (length <= i3) {
            defpackage.c.n("No components");
            return 0L;
        }
        if (str.charAt(i3) != 'P') {
            defpackage.jc2.s();
            return 0L;
        }
        int i4 = i3 + 1;
        if (i4 == length) {
            defpackage.jc2.s();
            return 0L;
        }
        defpackage.ty0 ty0Var = null;
        long jE = 0;
        boolean z2 = false;
        while (i4 < length) {
            if (str.charAt(i4) != 'T') {
                int i5 = i4;
                while (i5 < str.length() && (('0' <= (cCharAt = str.charAt(i5)) && cCharAt < ':') || defpackage.va4.i0("+-.", cCharAt))) {
                    i5++;
                }
                java.lang.String strSubstring = str.substring(i4, i5);
                if (strSubstring.length() == 0) {
                    defpackage.jc2.s();
                    return 0L;
                }
                int length2 = strSubstring.length() + i4;
                if (length2 < 0 || length2 >= str.length()) {
                    defpackage.c.n("Missing unit for value ".concat(strSubstring));
                    return 0L;
                }
                char cCharAt3 = str.charAt(length2);
                int i6 = length2 + 1;
                defpackage.ty0 ty0VarC = defpackage.wq4.C(cCharAt3, z2);
                if (ty0Var != null && ty0Var.compareTo(ty0VarC) <= 0) {
                    defpackage.c.n("Unexpected order of duration components");
                    return 0L;
                }
                int iQ0 = defpackage.va4.q0(strSubstring, '.', 0, 6);
                if (ty0VarC != defpackage.ty0.SECONDS || iQ0 <= 0) {
                    jE = defpackage.qy0.e(jE, R(G(strSubstring), ty0VarC));
                } else {
                    long jE2 = defpackage.qy0.e(jE, R(G(strSubstring.substring(0, iQ0)), ty0VarC));
                    double d2 = java.lang.Double.parseDouble(strSubstring.substring(iQ0));
                    double dV = defpackage.wq4.v(d2, ty0VarC, defpackage.ty0.NANOSECONDS);
                    if (java.lang.Double.isNaN(dV)) {
                        defpackage.c.n("Duration value cannot be NaN.");
                        jW = 0;
                    } else {
                        long jM = M(dV);
                        if (-4611686018426999999L > jM || jM >= 4611686018427000000L) {
                            jW = w(M(defpackage.wq4.v(d2, ty0VarC, defpackage.ty0.MILLISECONDS)));
                        } else {
                            jW = jM << 1;
                            int i7 = defpackage.qy0.u;
                            int i8 = defpackage.ry0.a;
                        }
                    }
                    jE = defpackage.qy0.e(jE2, jW);
                }
                ty0Var = ty0VarC;
                i4 = i6;
            } else {
                if (z2 || (i4 = i4 + 1) == length) {
                    defpackage.jc2.s();
                    return 0L;
                }
                z2 = true;
            }
        }
        return z ? defpackage.qy0.g(jE) : jE;
    }

    public static final void l(java.lang.Object[] objArr, long j2, java.lang.Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final defpackage.vl3 m(android.view.View view, defpackage.z7 z7Var) {
        int[] iArr = defpackage.f03.m;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        z7Var.getLocationInWindow(iArr);
        float f2 = i2 - iArr[0];
        float f3 = i3 - iArr[1];
        return new defpackage.vl3(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static final boolean n(java.lang.Object obj) {
        if (obj instanceof defpackage.w54) {
            defpackage.w54 w54Var = (defpackage.w54) obj;
            if (w54Var.b() == defpackage.d6.V || w54Var.b() == defpackage.d6.e0 || w54Var.b() == defpackage.d6.Z) {
                java.lang.Object value = w54Var.getValue();
                if (value == null) {
                    return true;
                }
                return n(value);
            }
        } else if (!(obj instanceof defpackage.td1) || !(obj instanceof java.io.Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (g[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void o(defpackage.bl3 bl3Var, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionP = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (cancellationExceptionP == null) {
            cancellationExceptionP = defpackage.q8.p("Channel was consumed, consumer had failed", th);
        }
        bl3Var.cancel(cancellationExceptionP);
    }

    public static final java.util.List p(java.util.ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return defpackage.m01.f;
        }
        if (size == 1) {
            return defpackage.pp4.L(defpackage.y30.v0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static int q(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static defpackage.to2 r(defpackage.to2 to2Var, defpackage.yd1 yd1Var) {
        return to2Var.f(new defpackage.y70(yd1Var));
    }

    public static final int s(java.util.List list) {
        int i2 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i3 = 1; i3 < size; i3++) {
            if (defpackage.g40.e(((defpackage.g40) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static final void t(defpackage.e61 e61Var, defpackage.p43 p43Var) throws java.io.IOException {
        try {
            java.io.IOException iOException = null;
            for (defpackage.p43 p43Var2 : e61Var.g(p43Var)) {
                try {
                    if (e61Var.h(p43Var2).b) {
                        t(e61Var, p43Var2);
                    }
                    e61Var.d(p43Var2);
                } catch (java.io.IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    public static final void u(defpackage.wx0 wx0Var, defpackage.dg1 dg1Var) {
        boolean z;
        boolean z2;
        android.graphics.Canvas canvas;
        boolean z3;
        float f2;
        defpackage.jy jyVarT = wx0Var.W().t();
        defpackage.dg1 dg1Var2 = (defpackage.dg1) wx0Var.W().t;
        defpackage.eg1 eg1Var = dg1Var.a;
        if (dg1Var.s) {
            return;
        }
        dg1Var.a();
        if (!eg1Var.p()) {
            try {
                dg1Var.a.l(dg1Var.b, dg1Var.c, dg1Var, dg1Var.e);
            } catch (java.lang.Throwable unused) {
            }
        }
        boolean z4 = eg1Var.K() > 0.0f;
        if (z4) {
            jyVarT.t();
        }
        android.graphics.Canvas canvasA = defpackage.b7.a(jyVarT);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = dg1Var.t;
            float f3 = (int) (j2 >> 32);
            float f4 = (int) (j2 & 4294967295L);
            long j3 = dg1Var.u;
            float f5 = ((int) (j3 >> 32)) + f3;
            float f6 = ((int) (j3 & 4294967295L)) + f4;
            float fA = eg1Var.a();
            defpackage.zr zrVarK = eg1Var.k();
            int iM = eg1Var.M();
            if (fA < 1.0f || iM != 3 || zrVarK != null || eg1Var.j() == 1) {
                defpackage.ua uaVarG = dg1Var.p;
                if (uaVarG == null) {
                    uaVarG = defpackage.u22.g();
                    dg1Var.p = uaVarG;
                }
                uaVarG.c(fA);
                uaVarG.d(iM);
                uaVarG.f(zrVarK);
                canvasA = canvasA;
                f2 = f3;
                canvasA.saveLayer(f2, f4, f5, f6, uaVarG.a);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f2 = f3;
            }
            canvasA.translate(f2, f4);
            canvasA.concat(eg1Var.I());
        }
        boolean z5 = !zIsHardwareAccelerated && dg1Var.w;
        if (z5) {
            jyVarT.g();
            defpackage.or1 or1VarD = dg1Var.d();
            if (or1VarD instanceof defpackage.f23) {
                jyVarT.r(((defpackage.f23) or1VarD).c);
            } else if (or1VarD instanceof defpackage.g23) {
                defpackage.bb bbVarA = dg1Var.m;
                if (bbVarA != null) {
                    bbVarA.a.rewind();
                } else {
                    bbVarA = defpackage.db.a();
                    dg1Var.m = bbVarA;
                }
                defpackage.sr2.b(bbVarA, ((defpackage.g23) or1VarD).c);
                jyVarT.m(bbVarA);
            } else {
                if (!(or1VarD instanceof defpackage.e23)) {
                    defpackage.jc2.o();
                    return;
                }
                jyVarT.m(((defpackage.e23) or1VarD).c);
            }
        }
        if (dg1Var2 != null) {
            defpackage.q10 q10Var = dg1Var2.r;
            if (!q10Var.a) {
                defpackage.fq1.a("Only add dependencies during a tracking");
            }
            defpackage.fs2 fs2Var = (defpackage.fs2) q10Var.d;
            if (fs2Var != null) {
                fs2Var.a(dg1Var);
            } else if (((defpackage.dg1) q10Var.b) != null) {
                defpackage.fs2 fs2Var2 = defpackage.ou3.a;
                defpackage.fs2 fs2Var3 = new defpackage.fs2();
                defpackage.dg1 dg1Var3 = (defpackage.dg1) q10Var.b;
                dg1Var3.getClass();
                fs2Var3.a(dg1Var3);
                fs2Var3.a(dg1Var);
                q10Var.d = fs2Var3;
                q10Var.b = null;
            } else {
                q10Var.b = dg1Var;
            }
            defpackage.fs2 fs2Var4 = (defpackage.fs2) q10Var.e;
            if (fs2Var4 != null) {
                z3 = !fs2Var4.l(dg1Var);
            } else if (((defpackage.dg1) q10Var.c) != dg1Var) {
                z3 = true;
            } else {
                q10Var.c = null;
                z3 = false;
            }
            if (z3) {
                dg1Var.q++;
            }
        }
        if (((defpackage.a7) jyVarT).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasA;
            eg1Var.i(jyVarT);
        } else {
            defpackage.ly lyVar = dg1Var.o;
            if (lyVar == null) {
                lyVar = new defpackage.ly();
                dg1Var.o = lyVar;
            }
            defpackage.oj ojVar = lyVar.i;
            defpackage.yo0 yo0Var = dg1Var.b;
            defpackage.k42 k42Var = dg1Var.c;
            long jF0 = defpackage.xr1.f0(dg1Var.u);
            defpackage.yo0 yo0VarV = ojVar.v();
            defpackage.k42 k42VarX = ojVar.x();
            defpackage.jy jyVarT2 = ojVar.t();
            z2 = z5;
            canvas = canvasA;
            long jY = ojVar.y();
            z = z4;
            defpackage.dg1 dg1Var4 = (defpackage.dg1) ojVar.t;
            ojVar.E(yo0Var);
            ojVar.F(k42Var);
            ojVar.D(jyVarT);
            ojVar.G(jF0);
            ojVar.t = dg1Var;
            jyVarT.g();
            try {
                dg1Var.c(lyVar);
            } finally {
                jyVarT.q();
                ojVar.E(yo0VarV);
                ojVar.F(k42VarX);
                ojVar.D(jyVarT2);
                ojVar.G(jY);
                ojVar.t = dg1Var4;
            }
        }
        if (z2) {
            jyVarT.q();
        }
        if (z) {
            jyVarT.j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final long v(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = defpackage.qy0.u;
        int i3 = defpackage.ry0.a;
        return j3;
    }

    public static final long w(long j2) {
        if (-4611686018426L > j2 || j2 >= 4611686018427L) {
            return v(defpackage.xr1.J(j2, -4611686018427387903L, 4611686018427387903L));
        }
        long j3 = (j2 * 1000000) << 1;
        int i2 = defpackage.qy0.u;
        int i3 = defpackage.ry0.a;
        return j3;
    }

    public static final defpackage.r81 x(defpackage.g24 g24Var, defpackage.df0 df0Var, int i2, defpackage.nu nuVar) {
        return ((i2 == 0 || i2 == -3) && nuVar == defpackage.nu.f) ? g24Var : new defpackage.k00(g24Var, df0Var, i2, nuVar);
    }

    public static defpackage.bf0 y(defpackage.vd0 vd0Var, defpackage.cf0 cf0Var) {
        defpackage.bf0 bf0Var;
        cf0Var.getClass();
        if (!(cf0Var instanceof defpackage.ef0)) {
            if (defpackage.d6.J == cf0Var) {
                return vd0Var;
            }
            return null;
        }
        defpackage.ef0 ef0Var = (defpackage.ef0) cf0Var;
        defpackage.cf0 key = vd0Var.getKey();
        key.getClass();
        if ((key == ef0Var || ef0Var.i == key) && (bf0Var = (defpackage.bf0) ef0Var.f.invoke(vd0Var)) != null) {
            return bf0Var;
        }
        return null;
    }

    public static final kotlinx.serialization.KSerializer z(kotlinx.serialization.KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().c() ? kSerializer : new defpackage.iy2(kSerializer);
    }
}
