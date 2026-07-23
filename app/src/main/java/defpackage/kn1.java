package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kn1 {
    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x01af  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x0214  */
    /* JADX WARN: Code duplicated, block: B:167:0x022d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0245  */
    /* JADX WARN: Code duplicated, block: B:171:0x024b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0264  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x01a0, please report this as an issue */
    public static final void a(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, boolean z, Function1 function1, Function2 function2, to1 to1Var, Composer composer, int i, int i2, int i3) {
        int i4;
        String str7;
        int i5;
        String str8;
        int i6;
        int i7;
        String str9;
        int i8;
        int i9;
        Integer num3;
        int i10;
        int i11;
        Integer num4;
        int i12;
        int i13;
        String str10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        Composer composer2;
        String str11;
        to1 to1Var2;
        Integer num5;
        String str12;
        String str13;
        Integer num6;
        boolean z3;
        String str14;
        String str15;
        Function2 function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String str16;
        boolean z4;
        Function2 function4;
        ViewModelStoreOwner current;
        CreationExtras defaultViewModelCreationExtras;
        Function2 function5;
        to1 to1Var3;
        int i22;
        boolean z5;
        String str17;
        int i23;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(530780197);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 == 0) {
            if ((i & 48) == 0) {
                str7 = str2;
                i4 |= composerStartRestartGroup.changed(str7) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    str8 = str3;
                    if (composerStartRestartGroup.changed(str8)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i & 3072) == 0) {
                        str9 = str4;
                        if (composerStartRestartGroup.changed(str9)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i & 24576) == 0) {
                            num3 = num;
                            if (composerStartRestartGroup.changed(num3)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            num4 = num2;
                        } else {
                            num4 = num2;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                if (composerStartRestartGroup.changed(num4)) {
                                    i12 = 131072;
                                } else {
                                    i12 = 65536;
                                }
                                i4 |= i12;
                            }
                        }
                        i13 = i3 & 64;
                        if (i13 != 0) {
                            i4 |= 1572864;
                            str10 = str5;
                        } else {
                            str10 = str5;
                            if ((i & 1572864) == 0) {
                                if (composerStartRestartGroup.changed(str10)) {
                                    i14 = 1048576;
                                } else {
                                    i14 = 524288;
                                }
                                i4 |= i14;
                            }
                        }
                        i15 = i3 & 128;
                        if (i15 != 0) {
                            if ((i & 12582912) == 0) {
                                if (composerStartRestartGroup.changed(str6)) {
                                    i16 = 8388608;
                                } else {
                                    i16 = 4194304;
                                }
                                i4 |= i16;
                            }
                            i17 = i3 & 256;
                            if (i17 != 0) {
                                if ((i & 100663296) == 0) {
                                    if (composerStartRestartGroup.changed(z)) {
                                        i18 = 67108864;
                                    } else {
                                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                                    }
                                    i4 |= i18;
                                }
                                if ((i & 805306368) == 0) {
                                    if (composerStartRestartGroup.changedInstance(function1)) {
                                        i23 = 536870912;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i4 |= i23;
                                }
                                i19 = i3 & 1024;
                                if (i19 != 0) {
                                    i20 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    if (composerStartRestartGroup.changedInstance(function2)) {
                                        i21 = 4;
                                    } else {
                                        i21 = 2;
                                    }
                                    i20 = i2 | i21;
                                } else {
                                    i20 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    i20 |= 16;
                                }
                                if ((i4 & 306783379) == 306783378 || (i20 & 19) != 18) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i24 != 0) {
                                            str7 = null;
                                        }
                                        if (i5 != 0) {
                                            str8 = null;
                                        }
                                        if (i7 != 0) {
                                            str9 = null;
                                        }
                                        if (i9 != 0) {
                                            num3 = null;
                                        }
                                        if (i11 != 0) {
                                            num4 = null;
                                        }
                                        if (i13 != 0) {
                                            str10 = null;
                                        }
                                        if (i15 != 0) {
                                            str16 = null;
                                        } else {
                                            str16 = str6;
                                        }
                                        z4 = i17 == 0 ? z : false;
                                        function4 = i19 == 0 ? function2 : null;
                                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                        if (current == null) {
                                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                            return;
                                        }
                                        if (current instanceof HasDefaultViewModelProviderFactory) {
                                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                        } else {
                                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                        }
                                        composer2 = composerStartRestartGroup;
                                        function5 = function4;
                                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                        i22 = i20 & (-113);
                                        z5 = z4;
                                        str17 = str16;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i22 = i20 & (-113);
                                        str17 = str6;
                                        z5 = z;
                                        function5 = function2;
                                        to1Var3 = to1Var;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    Integer num7 = num4;
                                    String str18 = str10;
                                    String str19 = str7;
                                    String str20 = str8;
                                    String str21 = str9;
                                    Integer num8 = num3;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                    }
                                    dn1.a(str, str19, str20, str21, num8, num7, str18, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    str12 = str19;
                                    str13 = str20;
                                    str15 = str21;
                                    num6 = num8;
                                    num5 = num7;
                                    str14 = str18;
                                    str11 = str17;
                                    z3 = z5;
                                    function3 = function5;
                                    to1Var2 = to1Var3;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    str11 = str6;
                                    to1Var2 = to1Var;
                                    num5 = num4;
                                    str12 = str7;
                                    str13 = str8;
                                    num6 = num3;
                                    z3 = z;
                                    str14 = str10;
                                    str15 = str9;
                                    function3 = function2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                                }
                            }
                            i4 |= 100663296;
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num9 = num4;
                                String str110 = str10;
                                String str111 = str7;
                                String str22 = str8;
                                String str23 = str9;
                                Integer num10 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str111, str22, str23, num10, num9, str110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str111;
                                str13 = str22;
                                str15 = str23;
                                num6 = num10;
                                num5 = num9;
                                str14 = str110;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 12582912;
                        i17 = i3 & 256;
                        if (i17 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(z)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i4 |= i18;
                            }
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num11 = num4;
                                String str112 = str10;
                                String str113 = str7;
                                String str24 = str8;
                                String str25 = str9;
                                Integer num12 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str113, str24, str25, num12, num11, str112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str113;
                                str13 = str24;
                                str15 = str25;
                                num6 = num12;
                                num5 = num11;
                                str14 = str112;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 100663296;
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num13 = num4;
                            String str114 = str10;
                            String str115 = str7;
                            String str26 = str8;
                            String str27 = str9;
                            Integer num14 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str115, str26, str27, num14, num13, str114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str115;
                            str13 = str26;
                            str15 = str27;
                            num6 = num14;
                            num5 = num13;
                            str14 = str114;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 24576;
                    num3 = num;
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        num4 = num2;
                    } else {
                        num4 = num2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(num4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        i4 |= 1572864;
                        str10 = str5;
                    } else {
                        str10 = str5;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changed(str10)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                    }
                    i15 = i3 & 128;
                    if (i15 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(str6)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i4 |= i16;
                        }
                        i17 = i3 & 256;
                        if (i17 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(z)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i4 |= i18;
                            }
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num15 = num4;
                                String str116 = str10;
                                String str117 = str7;
                                String str28 = str8;
                                String str29 = str9;
                                Integer num16 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str117, str28, str29, num16, num15, str116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str117;
                                str13 = str28;
                                str15 = str29;
                                num6 = num16;
                                num5 = num15;
                                str14 = str116;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 100663296;
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num17 = num4;
                            String str118 = str10;
                            String str119 = str7;
                            String str210 = str8;
                            String str211 = str9;
                            Integer num18 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str119, str210, str211, num18, num17, str118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str119;
                            str13 = str210;
                            str15 = str211;
                            num6 = num18;
                            num5 = num17;
                            str14 = str118;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 12582912;
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num19 = num4;
                            String str1110 = str10;
                            String str1111 = str7;
                            String str212 = str8;
                            String str213 = str9;
                            Integer num110 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1111, str212, str213, num110, num19, str1110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1111;
                            str13 = str212;
                            str15 = str213;
                            num6 = num110;
                            num5 = num19;
                            str14 = str1110;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111 = num4;
                        String str1112 = str10;
                        String str1113 = str7;
                        String str214 = str8;
                        String str215 = str9;
                        Integer num112 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1113, str214, str215, num112, num111, str1112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1113;
                        str13 = str214;
                        str15 = str215;
                        num6 = num112;
                        num5 = num111;
                        str14 = str1112;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 3072;
                str9 = str4;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i & 24576) == 0) {
                        num3 = num;
                        if (composerStartRestartGroup.changed(num3)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        num4 = num2;
                    } else {
                        num4 = num2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(num4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        i4 |= 1572864;
                        str10 = str5;
                    } else {
                        str10 = str5;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changed(str10)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                    }
                    i15 = i3 & 128;
                    if (i15 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(str6)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i4 |= i16;
                        }
                        i17 = i3 & 256;
                        if (i17 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(z)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i4 |= i18;
                            }
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num113 = num4;
                                String str1114 = str10;
                                String str1115 = str7;
                                String str216 = str8;
                                String str217 = str9;
                                Integer num114 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str1115, str216, str217, num114, num113, str1114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str1115;
                                str13 = str216;
                                str15 = str217;
                                num6 = num114;
                                num5 = num113;
                                str14 = str1114;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 100663296;
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num115 = num4;
                            String str1116 = str10;
                            String str1117 = str7;
                            String str218 = str8;
                            String str219 = str9;
                            Integer num116 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1117, str218, str219, num116, num115, str1116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1117;
                            str13 = str218;
                            str15 = str219;
                            num6 = num116;
                            num5 = num115;
                            str14 = str1116;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 12582912;
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num117 = num4;
                            String str1118 = str10;
                            String str1119 = str7;
                            String str2110 = str8;
                            String str2111 = str9;
                            Integer num118 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1119, str2110, str2111, num118, num117, str1118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1119;
                            str13 = str2110;
                            str15 = str2111;
                            num6 = num118;
                            num5 = num117;
                            str14 = str1118;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num119 = num4;
                        String str11110 = str10;
                        String str11111 = str7;
                        String str2112 = str8;
                        String str2113 = str9;
                        Integer num1110 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111, str2112, str2113, num1110, num119, str11110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111;
                        str13 = str2112;
                        str15 = str2113;
                        num6 = num1110;
                        num5 = num119;
                        str14 = str11110;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 24576;
                num3 = num;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num1111 = num4;
                            String str11112 = str10;
                            String str11113 = str7;
                            String str2114 = str8;
                            String str2115 = str9;
                            Integer num1112 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str11113, str2114, str2115, num1112, num1111, str11112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str11113;
                            str13 = str2114;
                            str15 = str2115;
                            num6 = num1112;
                            num5 = num1111;
                            str14 = str11112;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num1113 = num4;
                        String str11114 = str10;
                        String str11115 = str7;
                        String str2116 = str8;
                        String str2117 = str9;
                        Integer num1114 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11115, str2116, str2117, num1114, num1113, str11114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11115;
                        str13 = str2116;
                        str15 = str2117;
                        num6 = num1114;
                        num5 = num1113;
                        str14 = str11114;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num1115 = num4;
                        String str11116 = str10;
                        String str11117 = str7;
                        String str2118 = str8;
                        String str2119 = str9;
                        Integer num1116 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11117, str2118, str2119, num1116, num1115, str11116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11117;
                        str13 = str2118;
                        str15 = str2119;
                        num6 = num1116;
                        num5 = num1115;
                        str14 = str11116;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1117 = num4;
                    String str11118 = str10;
                    String str11119 = str7;
                    String str21110 = str8;
                    String str21111 = str9;
                    Integer num1118 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11119, str21110, str21111, num1118, num1117, str11118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11119;
                    str13 = str21110;
                    str15 = str21111;
                    num6 = num1118;
                    num5 = num1117;
                    str14 = str11118;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            str8 = str3;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    str9 = str4;
                    if (composerStartRestartGroup.changed(str9)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i & 24576) == 0) {
                        num3 = num;
                        if (composerStartRestartGroup.changed(num3)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        num4 = num2;
                    } else {
                        num4 = num2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(num4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        i4 |= 1572864;
                        str10 = str5;
                    } else {
                        str10 = str5;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changed(str10)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                    }
                    i15 = i3 & 128;
                    if (i15 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(str6)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i4 |= i16;
                        }
                        i17 = i3 & 256;
                        if (i17 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(z)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i4 |= i18;
                            }
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num1119 = num4;
                                String str111110 = str10;
                                String str111111 = str7;
                                String str21112 = str8;
                                String str21113 = str9;
                                Integer num11110 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str111111, str21112, str21113, num11110, num1119, str111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str111111;
                                str13 = str21112;
                                str15 = str21113;
                                num6 = num11110;
                                num5 = num1119;
                                str14 = str111110;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 100663296;
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11111 = num4;
                            String str111112 = str10;
                            String str111113 = str7;
                            String str21114 = str8;
                            String str21115 = str9;
                            Integer num11112 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111113, str21114, str21115, num11112, num11111, str111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111113;
                            str13 = str21114;
                            str15 = str21115;
                            num6 = num11112;
                            num5 = num11111;
                            str14 = str111112;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 12582912;
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11113 = num4;
                            String str111114 = str10;
                            String str111115 = str7;
                            String str21116 = str8;
                            String str21117 = str9;
                            Integer num11114 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111115, str21116, str21117, num11114, num11113, str111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111115;
                            str13 = str21116;
                            str15 = str21117;
                            num6 = num11114;
                            num5 = num11113;
                            str14 = str111114;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num11115 = num4;
                        String str111116 = str10;
                        String str111117 = str7;
                        String str21118 = str8;
                        String str21119 = str9;
                        Integer num11116 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str111117, str21118, str21119, num11116, num11115, str111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str111117;
                        str13 = str21118;
                        str15 = str21119;
                        num6 = num11116;
                        num5 = num11115;
                        str14 = str111116;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 24576;
                num3 = num;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11117 = num4;
                            String str111118 = str10;
                            String str111119 = str7;
                            String str211110 = str8;
                            String str211111 = str9;
                            Integer num11118 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111119, str211110, str211111, num11118, num11117, str111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111119;
                            str13 = str211110;
                            str15 = str211111;
                            num6 = num11118;
                            num5 = num11117;
                            str14 = str111118;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num11119 = num4;
                        String str1111110 = str10;
                        String str1111111 = str7;
                        String str211112 = str8;
                        String str211113 = str9;
                        Integer num111110 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111111, str211112, str211113, num111110, num11119, str1111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111111;
                        str13 = str211112;
                        str15 = str211113;
                        num6 = num111110;
                        num5 = num11119;
                        str14 = str1111110;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111 = num4;
                        String str1111112 = str10;
                        String str1111113 = str7;
                        String str211114 = str8;
                        String str211115 = str9;
                        Integer num111112 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111113, str211114, str211115, num111112, num111111, str1111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111113;
                        str13 = str211114;
                        str15 = str211115;
                        num6 = num111112;
                        num5 = num111111;
                        str14 = str1111112;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num111113 = num4;
                    String str1111114 = str10;
                    String str1111115 = str7;
                    String str211116 = str8;
                    String str211117 = str9;
                    Integer num111114 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str1111115, str211116, str211117, num111114, num111113, str1111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str1111115;
                    str13 = str211116;
                    str15 = str211117;
                    num6 = num111114;
                    num5 = num111113;
                    str14 = str1111114;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 3072;
            str9 = str4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    num3 = num;
                    if (composerStartRestartGroup.changed(num3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num111115 = num4;
                            String str1111116 = str10;
                            String str1111117 = str7;
                            String str211118 = str8;
                            String str211119 = str9;
                            Integer num111116 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1111117, str211118, str211119, num111116, num111115, str1111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1111117;
                            str13 = str211118;
                            str15 = str211119;
                            num6 = num111116;
                            num5 = num111115;
                            str14 = str1111116;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111117 = num4;
                        String str1111118 = str10;
                        String str1111119 = str7;
                        String str2111110 = str8;
                        String str2111111 = str9;
                        Integer num111118 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111119, str2111110, str2111111, num111118, num111117, str1111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111119;
                        str13 = str2111110;
                        str15 = str2111111;
                        num6 = num111118;
                        num5 = num111117;
                        str14 = str1111118;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111119 = num4;
                        String str11111110 = str10;
                        String str11111111 = str7;
                        String str2111112 = str8;
                        String str2111113 = str9;
                        Integer num1111110 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111111, str2111112, str2111113, num1111110, num111119, str11111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111111;
                        str13 = str2111112;
                        str15 = str2111113;
                        num6 = num1111110;
                        num5 = num111119;
                        str14 = str11111110;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111 = num4;
                    String str11111112 = str10;
                    String str11111113 = str7;
                    String str2111114 = str8;
                    String str2111115 = str9;
                    Integer num1111112 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111113, str2111114, str2111115, num1111112, num1111111, str11111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111113;
                    str13 = str2111114;
                    str15 = str2111115;
                    num6 = num1111112;
                    num5 = num1111111;
                    str14 = str11111112;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 24576;
            num3 = num;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(num4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                str10 = str5;
            } else {
                str10 = str5;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(str10)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 128;
            if (i15 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num1111113 = num4;
                        String str11111114 = str10;
                        String str11111115 = str7;
                        String str2111116 = str8;
                        String str2111117 = str9;
                        Integer num1111114 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111115, str2111116, str2111117, num1111114, num1111113, str11111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111115;
                        str13 = str2111116;
                        str15 = str2111117;
                        num6 = num1111114;
                        num5 = num1111113;
                        str14 = str11111114;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111115 = num4;
                    String str11111116 = str10;
                    String str11111117 = str7;
                    String str2111118 = str8;
                    String str2111119 = str9;
                    Integer num1111116 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111117, str2111118, str2111119, num1111116, num1111115, str11111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111117;
                    str13 = str2111118;
                    str15 = str2111119;
                    num6 = num1111116;
                    num5 = num1111115;
                    str14 = str11111116;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 12582912;
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i18;
                }
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111117 = num4;
                    String str11111118 = str10;
                    String str11111119 = str7;
                    String str21111110 = str8;
                    String str21111111 = str9;
                    Integer num1111118 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111119, str21111110, str21111111, num1111118, num1111117, str11111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111119;
                    str13 = str21111110;
                    str15 = str21111111;
                    num6 = num1111118;
                    num5 = num1111117;
                    str14 = str11111118;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num1111119 = num4;
                String str111111110 = str10;
                String str111111111 = str7;
                String str21111112 = str8;
                String str21111113 = str9;
                Integer num11111110 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str111111111, str21111112, str21111113, num11111110, num1111119, str111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str111111111;
                str13 = str21111112;
                str15 = str21111113;
                num6 = num11111110;
                num5 = num1111119;
                str14 = str111111110;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= 48;
        str7 = str2;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                str8 = str3;
                if (composerStartRestartGroup.changed(str8)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    str9 = str4;
                    if (composerStartRestartGroup.changed(str9)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i & 24576) == 0) {
                        num3 = num;
                        if (composerStartRestartGroup.changed(num3)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        num4 = num2;
                    } else {
                        num4 = num2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(num4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        i4 |= 1572864;
                        str10 = str5;
                    } else {
                        str10 = str5;
                        if ((i & 1572864) == 0) {
                            if (composerStartRestartGroup.changed(str10)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                    }
                    i15 = i3 & 128;
                    if (i15 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(str6)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i4 |= i16;
                        }
                        i17 = i3 & 256;
                        if (i17 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(z)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i4 |= i18;
                            }
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i4 |= i23;
                            }
                            i19 = i3 & 1024;
                            if (i19 != 0) {
                                i20 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function2)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i2 | i21;
                            } else {
                                i20 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i20 |= 16;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                } else {
                                    if (i24 != 0) {
                                        str7 = null;
                                    }
                                    if (i5 != 0) {
                                        str8 = null;
                                    }
                                    if (i7 != 0) {
                                        str9 = null;
                                    }
                                    if (i9 != 0) {
                                        num3 = null;
                                    }
                                    if (i11 != 0) {
                                        num4 = null;
                                    }
                                    if (i13 != 0) {
                                        str10 = null;
                                    }
                                    if (i15 != 0) {
                                        str16 = null;
                                    } else {
                                        str16 = str6;
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                    if (current == null) {
                                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return;
                                    }
                                    if (current instanceof HasDefaultViewModelProviderFactory) {
                                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function5 = function4;
                                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                    i22 = i20 & (-113);
                                    z5 = z4;
                                    str17 = str16;
                                }
                                Integer num11111111 = num4;
                                String str111111112 = str10;
                                String str111111113 = str7;
                                String str21111114 = str8;
                                String str21111115 = str9;
                                Integer num11111112 = num3;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                                }
                                dn1.a(str, str111111113, str21111114, str21111115, num11111112, num11111111, str111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str12 = str111111113;
                                str13 = str21111114;
                                str15 = str21111115;
                                num6 = num11111112;
                                num5 = num11111111;
                                str14 = str111111112;
                                str11 = str17;
                                z3 = z5;
                                function3 = function5;
                                to1Var2 = to1Var3;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                str11 = str6;
                                to1Var2 = to1Var;
                                num5 = num4;
                                str12 = str7;
                                str13 = str8;
                                num6 = num3;
                                z3 = z;
                                str14 = str10;
                                str15 = str9;
                                function3 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                            }
                        }
                        i4 |= 100663296;
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11111113 = num4;
                            String str111111114 = str10;
                            String str111111115 = str7;
                            String str21111116 = str8;
                            String str21111117 = str9;
                            Integer num11111114 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111111115, str21111116, str21111117, num11111114, num11111113, str111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111111115;
                            str13 = str21111116;
                            str15 = str21111117;
                            num6 = num11111114;
                            num5 = num11111113;
                            str14 = str111111114;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 12582912;
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11111115 = num4;
                            String str111111116 = str10;
                            String str111111117 = str7;
                            String str21111118 = str8;
                            String str21111119 = str9;
                            Integer num11111116 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111111117, str21111118, str21111119, num11111116, num11111115, str111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111111117;
                            str13 = str21111118;
                            str15 = str21111119;
                            num6 = num11111116;
                            num5 = num11111115;
                            str14 = str111111116;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num11111117 = num4;
                        String str111111118 = str10;
                        String str111111119 = str7;
                        String str211111110 = str8;
                        String str211111111 = str9;
                        Integer num11111118 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str111111119, str211111110, str211111111, num11111118, num11111117, str111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str111111119;
                        str13 = str211111110;
                        str15 = str211111111;
                        num6 = num11111118;
                        num5 = num11111117;
                        str14 = str111111118;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 24576;
                num3 = num;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11111119 = num4;
                            String str1111111110 = str10;
                            String str1111111111 = str7;
                            String str211111112 = str8;
                            String str211111113 = str9;
                            Integer num111111110 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1111111111, str211111112, str211111113, num111111110, num11111119, str1111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1111111111;
                            str13 = str211111112;
                            str15 = str211111113;
                            num6 = num111111110;
                            num5 = num11111119;
                            str14 = str1111111110;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111111 = num4;
                        String str1111111112 = str10;
                        String str1111111113 = str7;
                        String str211111114 = str8;
                        String str211111115 = str9;
                        Integer num111111112 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111111113, str211111114, str211111115, num111111112, num111111111, str1111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111111113;
                        str13 = str211111114;
                        str15 = str211111115;
                        num6 = num111111112;
                        num5 = num111111111;
                        str14 = str1111111112;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111113 = num4;
                        String str1111111114 = str10;
                        String str1111111115 = str7;
                        String str211111116 = str8;
                        String str211111117 = str9;
                        Integer num111111114 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111111115, str211111116, str211111117, num111111114, num111111113, str1111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111111115;
                        str13 = str211111116;
                        str15 = str211111117;
                        num6 = num111111114;
                        num5 = num111111113;
                        str14 = str1111111114;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num111111115 = num4;
                    String str1111111116 = str10;
                    String str1111111117 = str7;
                    String str211111118 = str8;
                    String str211111119 = str9;
                    Integer num111111116 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str1111111117, str211111118, str211111119, num111111116, num111111115, str1111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str1111111117;
                    str13 = str211111118;
                    str15 = str211111119;
                    num6 = num111111116;
                    num5 = num111111115;
                    str14 = str1111111116;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 3072;
            str9 = str4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    num3 = num;
                    if (composerStartRestartGroup.changed(num3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num111111117 = num4;
                            String str1111111118 = str10;
                            String str1111111119 = str7;
                            String str2111111110 = str8;
                            String str2111111111 = str9;
                            Integer num111111118 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str1111111119, str2111111110, str2111111111, num111111118, num111111117, str1111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str1111111119;
                            str13 = str2111111110;
                            str15 = str2111111111;
                            num6 = num111111118;
                            num5 = num111111117;
                            str14 = str1111111118;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111119 = num4;
                        String str11111111110 = str10;
                        String str11111111111 = str7;
                        String str2111111112 = str8;
                        String str2111111113 = str9;
                        Integer num1111111110 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111111111, str2111111112, str2111111113, num1111111110, num111111119, str11111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111111111;
                        str13 = str2111111112;
                        str15 = str2111111113;
                        num6 = num1111111110;
                        num5 = num111111119;
                        str14 = str11111111110;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num1111111111 = num4;
                        String str11111111112 = str10;
                        String str11111111113 = str7;
                        String str2111111114 = str8;
                        String str2111111115 = str9;
                        Integer num1111111112 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111111113, str2111111114, str2111111115, num1111111112, num1111111111, str11111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111111113;
                        str13 = str2111111114;
                        str15 = str2111111115;
                        num6 = num1111111112;
                        num5 = num1111111111;
                        str14 = str11111111112;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111113 = num4;
                    String str11111111114 = str10;
                    String str11111111115 = str7;
                    String str2111111116 = str8;
                    String str2111111117 = str9;
                    Integer num1111111114 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111111115, str2111111116, str2111111117, num1111111114, num1111111113, str11111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111111115;
                    str13 = str2111111116;
                    str15 = str2111111117;
                    num6 = num1111111114;
                    num5 = num1111111113;
                    str14 = str11111111114;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 24576;
            num3 = num;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(num4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                str10 = str5;
            } else {
                str10 = str5;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(str10)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 128;
            if (i15 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num1111111115 = num4;
                        String str11111111116 = str10;
                        String str11111111117 = str7;
                        String str2111111118 = str8;
                        String str2111111119 = str9;
                        Integer num1111111116 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111111117, str2111111118, str2111111119, num1111111116, num1111111115, str11111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111111117;
                        str13 = str2111111118;
                        str15 = str2111111119;
                        num6 = num1111111116;
                        num5 = num1111111115;
                        str14 = str11111111116;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111117 = num4;
                    String str11111111118 = str10;
                    String str11111111119 = str7;
                    String str21111111110 = str8;
                    String str21111111111 = str9;
                    Integer num1111111118 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111111119, str21111111110, str21111111111, num1111111118, num1111111117, str11111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111111119;
                    str13 = str21111111110;
                    str15 = str21111111111;
                    num6 = num1111111118;
                    num5 = num1111111117;
                    str14 = str11111111118;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 12582912;
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i18;
                }
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111119 = num4;
                    String str111111111110 = str10;
                    String str111111111111 = str7;
                    String str21111111112 = str8;
                    String str21111111113 = str9;
                    Integer num11111111110 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str111111111111, str21111111112, str21111111113, num11111111110, num1111111119, str111111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str111111111111;
                    str13 = str21111111112;
                    str15 = str21111111113;
                    num6 = num11111111110;
                    num5 = num1111111119;
                    str14 = str111111111110;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num11111111111 = num4;
                String str111111111112 = str10;
                String str111111111113 = str7;
                String str21111111114 = str8;
                String str21111111115 = str9;
                Integer num11111111112 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str111111111113, str21111111114, str21111111115, num11111111112, num11111111111, str111111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str111111111113;
                str13 = str21111111114;
                str15 = str21111111115;
                num6 = num11111111112;
                num5 = num11111111111;
                str14 = str111111111112;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        str8 = str3;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i & 3072) == 0) {
                str9 = str4;
                if (composerStartRestartGroup.changed(str9)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    num3 = num;
                    if (composerStartRestartGroup.changed(num3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(num4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    str10 = str5;
                } else {
                    str10 = str5;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(str10)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 128;
                if (i15 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 256;
                    if (i17 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i4 |= i23;
                        }
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i20 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i2 | i21;
                        } else {
                            i20 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i20 |= 16;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            } else {
                                if (i24 != 0) {
                                    str7 = null;
                                }
                                if (i5 != 0) {
                                    str8 = null;
                                }
                                if (i7 != 0) {
                                    str9 = null;
                                }
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i11 != 0) {
                                    num4 = null;
                                }
                                if (i13 != 0) {
                                    str10 = null;
                                }
                                if (i15 != 0) {
                                    str16 = null;
                                } else {
                                    str16 = str6;
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                                if (current == null) {
                                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return;
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                composer2 = composerStartRestartGroup;
                                function5 = function4;
                                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                i22 = i20 & (-113);
                                z5 = z4;
                                str17 = str16;
                            }
                            Integer num11111111113 = num4;
                            String str111111111114 = str10;
                            String str111111111115 = str7;
                            String str21111111116 = str8;
                            String str21111111117 = str9;
                            Integer num11111111114 = num3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                            }
                            dn1.a(str, str111111111115, str21111111116, str21111111117, num11111111114, num11111111113, str111111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str12 = str111111111115;
                            str13 = str21111111116;
                            str15 = str21111111117;
                            num6 = num11111111114;
                            num5 = num11111111113;
                            str14 = str111111111114;
                            str11 = str17;
                            z3 = z5;
                            function3 = function5;
                            to1Var2 = to1Var3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            str11 = str6;
                            to1Var2 = to1Var;
                            num5 = num4;
                            str12 = str7;
                            str13 = str8;
                            num6 = num3;
                            z3 = z;
                            str14 = str10;
                            str15 = str9;
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num11111111115 = num4;
                        String str111111111116 = str10;
                        String str111111111117 = str7;
                        String str21111111118 = str8;
                        String str21111111119 = str9;
                        Integer num11111111116 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str111111111117, str21111111118, str21111111119, num11111111116, num11111111115, str111111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str111111111117;
                        str13 = str21111111118;
                        str15 = str21111111119;
                        num6 = num11111111116;
                        num5 = num11111111115;
                        str14 = str111111111116;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num11111111117 = num4;
                        String str111111111118 = str10;
                        String str111111111119 = str7;
                        String str211111111110 = str8;
                        String str211111111111 = str9;
                        Integer num11111111118 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str111111111119, str211111111110, str211111111111, num11111111118, num11111111117, str111111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str111111111119;
                        str13 = str211111111110;
                        str15 = str211111111111;
                        num6 = num11111111118;
                        num5 = num11111111117;
                        str14 = str111111111118;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num11111111119 = num4;
                    String str1111111111110 = str10;
                    String str1111111111111 = str7;
                    String str211111111112 = str8;
                    String str211111111113 = str9;
                    Integer num111111111110 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str1111111111111, str211111111112, str211111111113, num111111111110, num11111111119, str1111111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str1111111111111;
                    str13 = str211111111112;
                    str15 = str211111111113;
                    num6 = num111111111110;
                    num5 = num11111111119;
                    str14 = str1111111111110;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 24576;
            num3 = num;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(num4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                str10 = str5;
            } else {
                str10 = str5;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(str10)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 128;
            if (i15 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111111111 = num4;
                        String str1111111111112 = str10;
                        String str1111111111113 = str7;
                        String str211111111114 = str8;
                        String str211111111115 = str9;
                        Integer num111111111112 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str1111111111113, str211111111114, str211111111115, num111111111112, num111111111111, str1111111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str1111111111113;
                        str13 = str211111111114;
                        str15 = str211111111115;
                        num6 = num111111111112;
                        num5 = num111111111111;
                        str14 = str1111111111112;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num111111111113 = num4;
                    String str1111111111114 = str10;
                    String str1111111111115 = str7;
                    String str211111111116 = str8;
                    String str211111111117 = str9;
                    Integer num111111111114 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str1111111111115, str211111111116, str211111111117, num111111111114, num111111111113, str1111111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str1111111111115;
                    str13 = str211111111116;
                    str15 = str211111111117;
                    num6 = num111111111114;
                    num5 = num111111111113;
                    str14 = str1111111111114;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 12582912;
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i18;
                }
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num111111111115 = num4;
                    String str1111111111116 = str10;
                    String str1111111111117 = str7;
                    String str211111111118 = str8;
                    String str211111111119 = str9;
                    Integer num111111111116 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str1111111111117, str211111111118, str211111111119, num111111111116, num111111111115, str1111111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str1111111111117;
                    str13 = str211111111118;
                    str15 = str211111111119;
                    num6 = num111111111116;
                    num5 = num111111111115;
                    str14 = str1111111111116;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num111111111117 = num4;
                String str1111111111118 = str10;
                String str1111111111119 = str7;
                String str2111111111110 = str8;
                String str2111111111111 = str9;
                Integer num111111111118 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str1111111111119, str2111111111110, str2111111111111, num111111111118, num111111111117, str1111111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str1111111111119;
                str13 = str2111111111110;
                str15 = str2111111111111;
                num6 = num111111111118;
                num5 = num111111111117;
                str14 = str1111111111118;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= 3072;
        str9 = str4;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i & 24576) == 0) {
                num3 = num;
                if (composerStartRestartGroup.changed(num3)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(num4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                str10 = str5;
            } else {
                str10 = str5;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(str10)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 128;
            if (i15 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i4 |= i23;
                    }
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i20 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i2 | i21;
                    } else {
                        i20 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i20 |= 16;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        } else {
                            if (i24 != 0) {
                                str7 = null;
                            }
                            if (i5 != 0) {
                                str8 = null;
                            }
                            if (i7 != 0) {
                                str9 = null;
                            }
                            if (i9 != 0) {
                                num3 = null;
                            }
                            if (i11 != 0) {
                                num4 = null;
                            }
                            if (i13 != 0) {
                                str10 = null;
                            }
                            if (i15 != 0) {
                                str16 = null;
                            } else {
                                str16 = str6;
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                            if (current == null) {
                                rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            function5 = function4;
                            to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            i22 = i20 & (-113);
                            z5 = z4;
                            str17 = str16;
                        }
                        Integer num111111111119 = num4;
                        String str11111111111110 = str10;
                        String str11111111111111 = str7;
                        String str2111111111112 = str8;
                        String str2111111111113 = str9;
                        Integer num1111111111110 = num3;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                        }
                        dn1.a(str, str11111111111111, str2111111111112, str2111111111113, num1111111111110, num111111111119, str11111111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str12 = str11111111111111;
                        str13 = str2111111111112;
                        str15 = str2111111111113;
                        num6 = num1111111111110;
                        num5 = num111111111119;
                        str14 = str11111111111110;
                        str11 = str17;
                        z3 = z5;
                        function3 = function5;
                        to1Var2 = to1Var3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        str11 = str6;
                        to1Var2 = to1Var;
                        num5 = num4;
                        str12 = str7;
                        str13 = str8;
                        num6 = num3;
                        z3 = z;
                        str14 = str10;
                        str15 = str9;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111111111 = num4;
                    String str11111111111112 = str10;
                    String str11111111111113 = str7;
                    String str2111111111114 = str8;
                    String str2111111111115 = str9;
                    Integer num1111111111112 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111111111113, str2111111111114, str2111111111115, num1111111111112, num1111111111111, str11111111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111111111113;
                    str13 = str2111111111114;
                    str15 = str2111111111115;
                    num6 = num1111111111112;
                    num5 = num1111111111111;
                    str14 = str11111111111112;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 12582912;
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i18;
                }
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111111113 = num4;
                    String str11111111111114 = str10;
                    String str11111111111115 = str7;
                    String str2111111111116 = str8;
                    String str2111111111117 = str9;
                    Integer num1111111111114 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111111111115, str2111111111116, str2111111111117, num1111111111114, num1111111111113, str11111111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111111111115;
                    str13 = str2111111111116;
                    str15 = str2111111111117;
                    num6 = num1111111111114;
                    num5 = num1111111111113;
                    str14 = str11111111111114;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num1111111111115 = num4;
                String str11111111111116 = str10;
                String str11111111111117 = str7;
                String str2111111111118 = str8;
                String str2111111111119 = str9;
                Integer num1111111111116 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str11111111111117, str2111111111118, str2111111111119, num1111111111116, num1111111111115, str11111111111116, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str11111111111117;
                str13 = str2111111111118;
                str15 = str2111111111119;
                num6 = num1111111111116;
                num5 = num1111111111115;
                str14 = str11111111111116;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= 24576;
        num3 = num;
        i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            num4 = num2;
        } else {
            num4 = num2;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(num4)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
            str10 = str5;
        } else {
            str10 = str5;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(str10)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
        }
        i15 = i3 & 128;
        if (i15 != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(str6)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i4 |= i16;
            }
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i18;
                }
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i4 |= i23;
                }
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i20 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i2 | i21;
                } else {
                    i20 = i2;
                }
                if ((i2 & 48) == 0) {
                    i20 |= 16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    } else {
                        if (i24 != 0) {
                            str7 = null;
                        }
                        if (i5 != 0) {
                            str8 = null;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        }
                        if (i11 != 0) {
                            num4 = null;
                        }
                        if (i13 != 0) {
                            str10 = null;
                        }
                        if (i15 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current == null) {
                            rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        composer2 = composerStartRestartGroup;
                        function5 = function4;
                        to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        i22 = i20 & (-113);
                        z5 = z4;
                        str17 = str16;
                    }
                    Integer num1111111111117 = num4;
                    String str11111111111118 = str10;
                    String str11111111111119 = str7;
                    String str21111111111110 = str8;
                    String str21111111111111 = str9;
                    Integer num1111111111118 = num3;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                    }
                    dn1.a(str, str11111111111119, str21111111111110, str21111111111111, num1111111111118, num1111111111117, str11111111111118, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str12 = str11111111111119;
                    str13 = str21111111111110;
                    str15 = str21111111111111;
                    num6 = num1111111111118;
                    num5 = num1111111111117;
                    str14 = str11111111111118;
                    str11 = str17;
                    z3 = z5;
                    function3 = function5;
                    to1Var2 = to1Var3;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    str11 = str6;
                    to1Var2 = to1Var;
                    num5 = num4;
                    str12 = str7;
                    str13 = str8;
                    num6 = num3;
                    z3 = z;
                    str14 = str10;
                    str15 = str9;
                    function3 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num1111111111119 = num4;
                String str111111111111110 = str10;
                String str111111111111111 = str7;
                String str21111111111112 = str8;
                String str21111111111113 = str9;
                Integer num11111111111110 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str111111111111111, str21111111111112, str21111111111113, num11111111111110, num1111111111119, str111111111111110, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str111111111111111;
                str13 = str21111111111112;
                str15 = str21111111111113;
                num6 = num11111111111110;
                num5 = num1111111111119;
                str14 = str111111111111110;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= 12582912;
        i17 = i3 & 256;
        if (i17 != 0) {
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i18 = 67108864;
                } else {
                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i18;
            }
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i4 |= i23;
            }
            i19 = i3 & 1024;
            if (i19 != 0) {
                i20 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i2 | i21;
            } else {
                i20 = i2;
            }
            if ((i2 & 48) == 0) {
                i20 |= 16;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                } else {
                    if (i24 != 0) {
                        str7 = null;
                    }
                    if (i5 != 0) {
                        str8 = null;
                    }
                    if (i7 != 0) {
                        str9 = null;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    }
                    if (i11 != 0) {
                        num4 = null;
                    }
                    if (i13 != 0) {
                        str10 = null;
                    }
                    if (i15 != 0) {
                        str16 = null;
                    } else {
                        str16 = str6;
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    function5 = function4;
                    to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i22 = i20 & (-113);
                    z5 = z4;
                    str17 = str16;
                }
                Integer num11111111111111 = num4;
                String str111111111111112 = str10;
                String str111111111111113 = str7;
                String str21111111111114 = str8;
                String str21111111111115 = str9;
                Integer num11111111111112 = num3;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
                }
                dn1.a(str, str111111111111113, str21111111111114, str21111111111115, num11111111111112, num11111111111111, str111111111111112, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str12 = str111111111111113;
                str13 = str21111111111114;
                str15 = str21111111111115;
                num6 = num11111111111112;
                num5 = num11111111111111;
                str14 = str111111111111112;
                str11 = str17;
                z3 = z5;
                function3 = function5;
                to1Var2 = to1Var3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                str11 = str6;
                to1Var2 = to1Var;
                num5 = num4;
                str12 = str7;
                str13 = str8;
                num6 = num3;
                z3 = z;
                str14 = str10;
                str15 = str9;
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
            }
        }
        i4 |= 100663296;
        if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i4 |= i23;
        }
        i19 = i3 & 1024;
        if (i19 != 0) {
            i20 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i2 | i21;
        } else {
            i20 = i2;
        }
        if ((i2 & 48) == 0) {
            i20 |= 16;
        }
        if ((i4 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    str7 = null;
                }
                if (i5 != 0) {
                    str8 = null;
                }
                if (i7 != 0) {
                    str9 = null;
                }
                if (i9 != 0) {
                    num3 = null;
                }
                if (i11 != 0) {
                    num4 = null;
                }
                if (i13 != 0) {
                    str10 = null;
                }
                if (i15 != 0) {
                    str16 = null;
                } else {
                    str16 = str6;
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                composer2 = composerStartRestartGroup;
                function5 = function4;
                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                i22 = i20 & (-113);
                z5 = z4;
                str17 = str16;
            } else {
                if (i24 != 0) {
                    str7 = null;
                }
                if (i5 != 0) {
                    str8 = null;
                }
                if (i7 != 0) {
                    str9 = null;
                }
                if (i9 != 0) {
                    num3 = null;
                }
                if (i11 != 0) {
                    num4 = null;
                }
                if (i13 != 0) {
                    str10 = null;
                }
                if (i15 != 0) {
                    str16 = null;
                } else {
                    str16 = str6;
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                composer2 = composerStartRestartGroup;
                function5 = function4;
                to1Var3 = (to1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(to1.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                i22 = i20 & (-113);
                z5 = z4;
                str17 = str16;
            }
            Integer num11111111111113 = num4;
            String str111111111111114 = str10;
            String str111111111111115 = str7;
            String str21111111111116 = str8;
            String str21111111111117 = str9;
            Integer num11111111111114 = num3;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(530780197, i4, i22, "com.dh.myembyapp.ui.screens.player.PlayerScreen (PlayerScreen.kt:19)");
            }
            dn1.a(str, str111111111111115, str21111111111116, str21111111111117, num11111111111114, num11111111111113, str111111111111114, str17, z5, function1, function5, to1Var3, composer2, i4 & 2147483646, i22 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str12 = str111111111111115;
            str13 = str21111111111116;
            str15 = str21111111111117;
            num6 = num11111111111114;
            num5 = num11111111111113;
            str14 = str111111111111114;
            str11 = str17;
            z3 = z5;
            function3 = function5;
            to1Var2 = to1Var3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            str11 = str6;
            to1Var2 = to1Var;
            num5 = num4;
            str12 = str7;
            str13 = str8;
            num6 = num3;
            z3 = z;
            str14 = str10;
            str15 = str9;
            function3 = function2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str, str12, str13, str15, num6, num5, str14, str11, z3, function1, function3, to1Var2, i, i2, i3));
        }
    }
}
