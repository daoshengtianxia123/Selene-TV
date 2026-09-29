package defpackage;

/* compiled from: r8-map-id-9aab431e8ea16d2cf69658f8e3a582e2f60904597ed6ac9951ec20b137c1f3da */
/* loaded from: classes2.dex */
public final class w93 implements defpackage.x83 {
    public final /* synthetic */ defpackage.x93 a;

    public w93(defpackage.x93 x93Var) {
        this.a = x93Var;
    }

    @Override // defpackage.x83
    public final void F(boolean z) {
        this.a.e.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.x83
    public final void k(int i) {
        boolean z = i == 2;
        defpackage.x93 x93Var = this.a;
        x93Var.f.setValue(java.lang.Boolean.valueOf(z));
        if (i == 3) {
            x93Var.h.setValue(java.lang.Boolean.TRUE);
            long jN = x93Var.a.n();
            if (jN > 0) {
                x93Var.c.k(jN);
            }
        }
        if (i == 4) {
            x93Var.i.invoke();
        }
    }

    @Override // defpackage.x83
    public final void p(defpackage.f83 f83Var) {
        java.lang.String str;
        f83Var.getClass();
        int i = f83Var.f;
        if (i == -100) {
            str = "ERROR_CODE_DISCONNECTED";
        } else if (i == -6) {
            str = "ERROR_CODE_NOT_SUPPORTED";
        } else if (i == -4) {
            str = "ERROR_CODE_PERMISSION_DENIED";
        } else if (i == -3) {
            str = "ERROR_CODE_BAD_VALUE";
        } else if (i == -2) {
            str = "ERROR_CODE_INVALID_STATE";
        } else if (i == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i != 7001) {
            switch (i) {
                case -110:
                    str = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                    break;
                case -109:
                    str = "ERROR_CODE_END_OF_PLAYLIST";
                    break;
                case -108:
                    str = "ERROR_CODE_SETUP_REQUIRED";
                    break;
                case -107:
                    str = "ERROR_CODE_SKIP_LIMIT_REACHED";
                    break;
                case -106:
                    str = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                    break;
                case -105:
                    str = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                    break;
                case -104:
                    str = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                    break;
                case -103:
                    str = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                    break;
                case -102:
                    str = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                    break;
                default:
                    switch (i) {
                        case 1000:
                            str = "ERROR_CODE_UNSPECIFIED";
                            break;
                        case 1001:
                            str = "ERROR_CODE_REMOTE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            break;
                        case 1003:
                            str = "ERROR_CODE_TIMEOUT";
                            break;
                        case 1004:
                            str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            break;
                        default:
                            switch (i) {
                                case 2000:
                                    str = "ERROR_CODE_IO_UNSPECIFIED";
                                    break;
                                case 2001:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    break;
                                case 2002:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    break;
                                case 2003:
                                    str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    break;
                                case 2004:
                                    str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    break;
                                case 2005:
                                    str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    break;
                                case 2006:
                                    str = "ERROR_CODE_IO_NO_PERMISSION";
                                    break;
                                case 2007:
                                    str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    break;
                                case 2008:
                                    str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    break;
                                default:
                                    switch (i) {
                                        case 3001:
                                            str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            break;
                                        case 3002:
                                            str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            break;
                                        case 3003:
                                            str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            break;
                                        case 3004:
                                            str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 4001:
                                                    str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                    break;
                                                case 4002:
                                                    str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    break;
                                                case 4003:
                                                    str = "ERROR_CODE_DECODING_FAILED";
                                                    break;
                                                case 4004:
                                                    str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    break;
                                                case 4005:
                                                    str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    break;
                                                case 4006:
                                                    str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 5001:
                                                            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                            break;
                                                        case 5002:
                                                            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                            break;
                                                        case 5003:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                            break;
                                                        case 5004:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 6000:
                                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                    break;
                                                                case 6001:
                                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                    break;
                                                                case 6002:
                                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                    break;
                                                                case 6003:
                                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                    break;
                                                                case 6004:
                                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                    break;
                                                                case 6005:
                                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                    break;
                                                                case 6006:
                                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                    break;
                                                                case 6007:
                                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                    break;
                                                                case 6008:
                                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                    break;
                                                                default:
                                                                    if (i < 1000000) {
                                                                        str = "invalid error code";
                                                                        break;
                                                                    } else {
                                                                        str = "custom error code";
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        this.a.g.setValue(str);
    }

    @Override // defpackage.x83
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void A(defpackage.h83 h83Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void B(defpackage.v83 v83Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void C(defpackage.do2 do2Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void b(defpackage.w83 w83Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void e(defpackage.ew4 ew4Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void f(defpackage.ul4 ul4Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void o(defpackage.eg0 eg0Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void q(defpackage.am4 am4Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void r(defpackage.f83 f83Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void t(int i) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void u(defpackage.em2 em2Var) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void y(java.util.List list) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void D(defpackage.am2 am2Var, int i) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void E(int i, int i2) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void i(int i, boolean z) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void z(int i, boolean z) {
    }

    @Override // defpackage.x83
    public final /* synthetic */ void s(int i, defpackage.y83 y83Var, defpackage.y83 y83Var2) {
    }
}
