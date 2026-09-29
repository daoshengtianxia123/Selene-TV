package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class c93 extends defpackage.yl3 {
    public java.util.List c = new java.util.ArrayList();
    public final /* synthetic */ defpackage.o93 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ defpackage.o93 f;

    public c93(defpackage.o93 o93Var, int i) {
        this.e = i;
        this.f = o93Var;
        this.d = o93Var;
    }

    @Override // defpackage.yl3
    public final int a() {
        if (this.c.isEmpty()) {
            return 0;
        }
        return this.c.size() + 1;
    }

    @Override // defpackage.yl3
    public /* bridge */ /* synthetic */ void b(defpackage.rm3 rm3Var, int i) {
        switch (this.e) {
            case 1:
                f((defpackage.k93) rm3Var, i);
                break;
            default:
                f((defpackage.k93) rm3Var, i);
                break;
        }
    }

    @Override // defpackage.yl3
    public final defpackage.rm3 c(android.view.ViewGroup viewGroup) {
        return new defpackage.k93(android.view.LayoutInflater.from(this.d.getContext()).inflate(dev.jdtech.mpv.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean d(defpackage.sn0 sn0Var) {
        for (int i = 0; i < this.c.size(); i++) {
            if (sn0Var.q.containsKey(((defpackage.l93) this.c.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void e(java.util.List list) {
        defpackage.o93 o93Var = this.f;
        android.widget.ImageView imageView = o93Var.N;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((defpackage.to3) list).u) {
                break;
            }
            defpackage.l93 l93Var = (defpackage.l93) ((defpackage.to3) list).get(i);
            if (l93Var.a.e[l93Var.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? o93Var.s0 : o93Var.t0);
            imageView.setContentDescription(z ? o93Var.u0 : o93Var.v0);
        }
        this.c = list;
    }

    public void f(defpackage.k93 k93Var, int i) {
        switch (this.e) {
            case 1:
                g(k93Var, i);
                if (i > 0) {
                    defpackage.l93 l93Var = (defpackage.l93) this.c.get(i - 1);
                    k93Var.u.setVisibility(l93Var.a.e[l93Var.b] ? 0 : 4);
                    break;
                }
                break;
            default:
                g(k93Var, i);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.k93 r8, int r9) {
        /*
            r7 = this;
            o93 r0 = r7.d
            z83 r0 = r0.A0
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 4
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L7a
            int r9 = r7.e
            switch(r9) {
                case 0: goto L4d;
                default: goto L11;
            }
        L11:
            android.widget.TextView r9 = r8.t
            r0 = 2131492923(0x7f0c003b, float:1.8609312E38)
            r9.setText(r0)
            r9 = r2
        L1a:
            java.util.List r0 = r7.c
            int r0 = r0.size()
            if (r9 >= r0) goto L39
            java.util.List r0 = r7.c
            java.lang.Object r0 = r0.get(r9)
            l93 r0 = (defpackage.l93) r0
            zl4 r4 = r0.a
            int r0 = r0.b
            boolean[] r4 = r4.e
            boolean r0 = r4[r0]
            if (r0 == 0) goto L36
            r3 = r2
            goto L39
        L36:
            int r9 = r9 + 1
            goto L1a
        L39:
            android.view.View r9 = r8.u
            if (r3 == 0) goto L3e
            r1 = r2
        L3e:
            r9.setVisibility(r1)
            android.view.View r8 = r8.a
            a93 r9 = new a93
            r0 = 3
            r9.<init>(r0, r7)
            r8.setOnClickListener(r9)
            goto L79
        L4d:
            android.widget.TextView r9 = r8.t
            r0 = 2131492922(0x7f0c003a, float:1.860931E38)
            r9.setText(r0)
            o93 r9 = r7.f
            z83 r9 = r9.A0
            r9.getClass()
            m41 r9 = (defpackage.m41) r9
            sn0 r9 = r9.r()
            boolean r9 = r7.d(r9)
            android.view.View r0 = r8.u
            if (r9 == 0) goto L6b
            goto L6c
        L6b:
            r1 = r2
        L6c:
            r0.setVisibility(r1)
            android.view.View r8 = r8.a
            a93 r9 = new a93
            r9.<init>(r3, r7)
            r8.setOnClickListener(r9)
        L79:
            return
        L7a:
            java.util.List r4 = r7.c
            int r9 = r9 - r3
            java.lang.Object r9 = r4.get(r9)
            l93 r9 = (defpackage.l93) r9
            zl4 r4 = r9.a
            kl4 r4 = r4.b
            r5 = r0
            m41 r5 = (defpackage.m41) r5
            sn0 r5 = r5.r()
            yo3 r5 = r5.q
            java.lang.Object r5 = r5.get(r4)
            if (r5 == 0) goto La1
            zl4 r5 = r9.a
            int r6 = r9.b
            boolean[] r5 = r5.e
            boolean r5 = r5[r6]
            if (r5 == 0) goto La1
            goto La2
        La1:
            r3 = r2
        La2:
            android.widget.TextView r5 = r8.t
            java.lang.String r6 = r9.c
            r5.setText(r6)
            android.view.View r5 = r8.u
            if (r3 == 0) goto Lae
            r1 = r2
        Lae:
            r5.setVisibility(r1)
            android.view.View r8 = r8.a
            m93 r1 = new m93
            r1.<init>()
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c93.g(k93, int):void");
    }

    private final void h(java.lang.String str) {
    }
}
