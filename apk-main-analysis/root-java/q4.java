package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class q4 {
    public static int d;
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public q4(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static defpackage.q4 e0(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return new defpackage.q4(accessibilityNodeInfo);
    }

    public static java.lang.String g(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case io.ktor.util.collections.ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case io.netty.handler.codec.http.HttpObjectDecoder.DEFAULT_INITIAL_BUFFER_SIZE /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case android.R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static android.text.style.ClickableSpan[] i(java.lang.CharSequence charSequence) {
        if (charSequence instanceof android.text.Spanned) {
            return (android.text.style.ClickableSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.ClickableSpan.class);
        }
        return null;
    }

    public static defpackage.q4 p() {
        return new defpackage.q4(android.view.accessibility.AccessibilityNodeInfo.obtain());
    }

    public final void A() {
        this.a.setContentInvalid(true);
    }

    public final void B(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.a.setDrawingOrder(i);
        }
    }

    public final void C(boolean z) {
        this.a.setEditable(z);
    }

    public final void D(boolean z) {
        this.a.setEnabled(z);
    }

    public final void E(java.lang.CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public final void F(boolean z) {
        this.a.setFocusable(z);
    }

    public final void G(boolean z) {
        this.a.setFocused(z);
    }

    public final void H(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            t(2, z);
        }
    }

    public final void I(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.a.setImportantForAccessibility(z);
        }
    }

    public final void J(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void K(int i) {
        this.a.setMaxTextLength(i);
    }

    public final void L(int i) {
        this.a.setMovementGranularities(i);
    }

    public final void M(java.lang.String str) {
        this.a.setPackageName(str);
    }

    public final void N(java.lang.CharSequence charSequence) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void O(android.view.View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void P(android.view.View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public final void Q(boolean z) {
        this.a.setPassword(z);
    }

    public final void R(defpackage.p4 p4Var) {
        this.a.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) p4Var.a);
    }

    public final void S(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            t(1, z);
        }
    }

    public final void T() {
        this.a.setScrollable(true);
    }

    public final void U(android.view.View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public final void V(java.lang.CharSequence charSequence) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 30) {
            defpackage.n4.g(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void W(android.text.SpannableString spannableString) {
        this.a.setText(spannableString);
    }

    public final void X(int i, int i2) {
        this.a.setTextSelection(i, i2);
    }

    public final void Y(defpackage.od odVar) {
        this.a.setTraversalAfter(odVar);
    }

    public final void Z(defpackage.od odVar) {
        this.a.setTraversalBefore(odVar);
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void a0(android.view.View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public final void b(defpackage.m4 m4Var) {
        this.a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) m4Var.a);
    }

    public final void b0(java.lang.String str) {
        this.a.setViewIdResourceName(str);
    }

    public final void c(defpackage.od odVar) {
        this.a.addChild(odVar);
    }

    public final void c0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final void d(android.view.View view, int i) {
        this.a.addChild(view, i);
    }

    public final android.view.accessibility.AccessibilityNodeInfo d0() {
        return this.a;
    }

    public final void e(java.lang.CharSequence charSequence, android.view.View view) {
        int iKeyAt;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(dev.jdtech.mpv.R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < sparseArray.size(); i++) {
                    if (((java.lang.ref.WeakReference) sparseArray.valueAt(i)).get() == null) {
                        arrayList.add(java.lang.Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArray.remove(((java.lang.Integer) arrayList.get(i2)).intValue());
                }
            }
            android.text.style.ClickableSpan[] clickableSpanArrI = i(charSequence);
            if (clickableSpanArrI == null || clickableSpanArrI.length <= 0) {
                return;
            }
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", dev.jdtech.mpv.R.id.accessibility_action_clickable_span);
            android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(dev.jdtech.mpv.R.id.tag_accessibility_clickable_spans);
            if (sparseArray2 == null) {
                sparseArray2 = new android.util.SparseArray();
                view.setTag(dev.jdtech.mpv.R.id.tag_accessibility_clickable_spans, sparseArray2);
            }
            for (int i3 = 0; i3 < clickableSpanArrI.length; i3++) {
                android.text.style.ClickableSpan clickableSpan = clickableSpanArrI[i3];
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseArray2.size()) {
                        iKeyAt = d;
                        d = iKeyAt + 1;
                        break;
                    } else {
                        if (clickableSpan.equals((android.text.style.ClickableSpan) ((java.lang.ref.WeakReference) sparseArray2.valueAt(i4)).get())) {
                            iKeyAt = sparseArray2.keyAt(i4);
                            break;
                        }
                        i4++;
                    }
                }
                sparseArray2.put(iKeyAt, new java.lang.ref.WeakReference(clickableSpanArrI[i3]));
                android.text.style.ClickableSpan clickableSpan2 = clickableSpanArrI[i3];
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(iKeyAt));
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.q4)) {
            return false;
        }
        defpackage.q4 q4Var = (defpackage.q4) obj;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = q4Var.a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.c == q4Var.c && this.b == q4Var.b;
    }

    public final java.util.ArrayList f(java.lang.String str) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        java.util.ArrayList<java.lang.Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean h(int i) {
        android.os.Bundle extras = this.a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final int hashCode() {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final android.os.Bundle j() {
        return this.a.getExtras();
    }

    public final int k() {
        return this.a.getMovementGranularities();
    }

    public final java.lang.CharSequence l() {
        boolean zIsEmpty = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        java.util.ArrayList arrayListF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        java.util.ArrayList arrayListF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        java.util.ArrayList arrayListF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        java.util.ArrayList arrayListF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListF.size(); i++) {
            spannableString.setSpan(new defpackage.x3(((java.lang.Integer) arrayListF4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((java.lang.Integer) arrayListF.get(i)).intValue(), ((java.lang.Integer) arrayListF2.get(i)).intValue(), ((java.lang.Integer) arrayListF3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean m() {
        return this.a.isClickable();
    }

    public final boolean n() {
        return this.a.isFocusable();
    }

    public final boolean o() {
        return this.a.isFocused();
    }

    public final void q(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.a4.g(this.a, z);
        } else {
            t(64, z);
        }
    }

    public final void r(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void s(java.util.ArrayList arrayList) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.a.setAvailableExtraData(arrayList);
        }
    }

    public final void t(int i, boolean z) {
        android.os.Bundle extras = this.a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34) {
            defpackage.a4.b(accessibilityNodeInfo, rect);
        } else {
            android.graphics.Rect rect2 = (android.graphics.Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(l());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? defpackage.n4.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? defpackage.o4.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? defpackage.a4.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(h(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? defpackage.o4.b(accessibilityNodeInfo) : h(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? defpackage.a4.d(accessibilityNodeInfo) : h(64));
        sb.append("; [");
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.m4(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            defpackage.m4 m4Var = (defpackage.m4) arrayList.get(i3);
            int iA = m4Var.a();
            java.lang.Object obj = m4Var.a;
            java.lang.String strG = g(iA);
            if (strG.equals("ACTION_UNKNOWN") && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strG = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(strG);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(android.graphics.Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void v(boolean z) {
        this.a.setCheckable(z);
    }

    public final void w(boolean z) {
        this.a.setChecked(z);
    }

    public final void x(java.lang.String str) {
        this.a.setClassName(str);
    }

    public final void y(boolean z) {
        this.a.setClickable(z);
    }

    public final void z(java.lang.String str) {
        this.a.setContentDescription(str);
    }
}
