package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.ResolutionLabelStyle;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.UserData;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class l8 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ ServerConfig b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ VideoVersionPrioritySettings d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ FocusRequester i;
    public final /* synthetic */ Function3 j;
    public final /* synthetic */ CoroutineScope k;
    public final /* synthetic */ LazyListState l;

    public l8(List list, ServerConfig serverConfig, boolean z, VideoVersionPrioritySettings videoVersionPrioritySettings, List list2, boolean z2, String str, FocusRequester focusRequester, Function3 function3, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.a = list;
        this.b = serverConfig;
        this.c = z;
        this.d = videoVersionPrioritySettings;
        this.e = list2;
        this.g = z2;
        this.h = str;
        this.i = focusRequester;
        this.j = function3;
        this.k = coroutineScope;
        this.l = lazyListState;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02db  */
    /* JADX WARN: Code duplicated, block: B:146:0x02df  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0300  */
    /* JADX WARN: Code duplicated, block: B:156:0x0307  */
    /* JADX WARN: Code duplicated, block: B:158:0x030b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0312  */
    /* JADX WARN: Code duplicated, block: B:161:0x0316  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0321  */
    /* JADX WARN: Code duplicated, block: B:165:0x0328  */
    /* JADX WARN: Code duplicated, block: B:167:0x032c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0333  */
    /* JADX WARN: Code duplicated, block: B:170:0x0337  */
    /* JADX WARN: Code duplicated, block: B:171:0x033e  */
    /* JADX WARN: Code duplicated, block: B:209:0x03ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:221:0x0458  */
    /* JADX WARN: Code duplicated, block: B:223:0x045b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0505  */
    /* JADX WARN: Code duplicated, block: B:241:0x0508  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        String str;
        Integer childCount;
        int i;
        String str2;
        Integer num;
        String str3;
        MediaStream mediaStream;
        MediaSource mediaSource;
        String strE;
        List<String> groupValues;
        String str4;
        String videoRangeType;
        String videoRange;
        String extendedVideoType;
        String extendedVideoSubType;
        String extendedVideoSubTypeDescription;
        String displayTitle;
        String title;
        String colorTransfer;
        String colorSpace;
        String colorPrimaries;
        String lowerCase;
        String strR;
        Integer bitrate;
        String str5;
        Long size;
        String str6;
        List listBuild;
        Object next;
        boolean z;
        boolean z2;
        ComposableLambda composableLambda;
        UserData userData;
        String primary;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i2 = (iIntValue2 & 6) == 0 ? (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i2 |= composer.changed(iIntValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            MediaItem mediaItem = (MediaItem) this.a.get(iIntValue);
            composer.startReplaceGroup(728023145);
            ServerConfig serverConfig = this.b;
            StringBuilder sbZ = kb0.z("search:", serverConfig.getId(), ":", mediaItem.getId(), ":");
            sbZ.append(iIntValue);
            String string2 = sbZ.toString();
            ImageTags imageTags = mediaItem.getImageTags();
            if (imageTags == null || (primary = imageTags.getPrimary()) == null) {
                string = "";
            } else {
                String id = mediaItem.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(serverConfig.getFullUrl() + "emby/Items/" + id + "/Images/Primary");
                sb.append("?maxWidth=320");
                if (!StringsKt.isBlank(primary)) {
                    sb.append("&tag=".concat(primary));
                }
                string = sb.toString();
            }
            Integer productionYear = mediaItem.getProductionYear();
            if (productionYear == null || (strSubstring = String.valueOf(productionYear.intValue())) == null) {
                String premiereDate = mediaItem.getPremiereDate();
                if (premiereDate != null) {
                    if (premiereDate.length() < 4) {
                        premiereDate = null;
                    }
                    if (premiereDate != null) {
                        String strSubstring = premiereDate.substring(0, 4);
                        str = strSubstring;
                    }
                }
                str = null;
            } else {
                str = strSubstring;
            }
            String type = mediaItem.getType();
            if (Intrinsics.areEqual(type, "Series")) {
                UserData userData2 = mediaItem.getUserData();
                if (userData2 == null || (childCount = userData2.getUnplayedItemCount()) == null) {
                    childCount = mediaItem.getChildCount();
                }
            } else if (Intrinsics.areEqual(type, "Season")) {
                childCount = mediaItem.getChildCount();
                if (childCount == null) {
                    UserData userData3 = mediaItem.getUserData();
                    if (userData3 != null) {
                        childCount = userData3.getUnplayedItemCount();
                    } else {
                        childCount = null;
                    }
                }
            } else {
                childCount = mediaItem.getChildCount();
                if (childCount == null) {
                    UserData userData4 = mediaItem.getUserData();
                    if (userData4 != null) {
                        childCount = userData4.getUnplayedItemCount();
                    } else {
                        childCount = null;
                    }
                }
            }
            boolean zChanged = composer.changed(mediaItem.getId()) | composer.changed(mediaItem.getMediaSources());
            boolean z3 = this.c;
            boolean zChanged2 = zChanged | composer.changed(z3);
            VideoVersionPrioritySettings videoVersionPrioritySettings = this.d;
            boolean zChanged3 = zChanged2 | composer.changed(videoVersionPrioritySettings);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (z3) {
                    if (Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                        List<MediaSource> mediaSources = mediaItem.getMediaSources();
                        if (mediaSources == null) {
                            mediaSources = CollectionsKt.emptyList();
                        }
                        MediaSource mediaSourceSelectBestMediaSourceByPriority = MediaSourcePriorityKt.selectBestMediaSourceByPriority(mediaSources, videoVersionPrioritySettings, true);
                        if (mediaSourceSelectBestMediaSourceByPriority == null) {
                            listBuild = CollectionsKt.emptyList();
                        } else {
                            List listCreateListBuilder = CollectionsKt.createListBuilder();
                            String strBuildVideoResolutionLabel = VideoResolutionKt.buildVideoResolutionLabel(mediaSourceSelectBestMediaSourceByPriority, ResolutionLabelStyle.UPPERCASE);
                            if (strBuildVideoResolutionLabel != null) {
                                listCreateListBuilder.add(strBuildVideoResolutionLabel);
                            }
                            List<MediaStream> mediaStreams = mediaSourceSelectBestMediaSourceByPriority.getMediaStreams();
                            if (mediaStreams != null) {
                                Iterator<T> it = mediaStreams.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = i2;
                                        str2 = string;
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    i = i2;
                                    str2 = string;
                                    if (Intrinsics.areEqual(((MediaStream) next).getType(), "Video")) {
                                        break;
                                    }
                                    i2 = i;
                                    string = str2;
                                }
                                mediaStream = (MediaStream) next;
                            } else {
                                i = i2;
                                str2 = string;
                                mediaStream = null;
                            }
                            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream != null ? mediaStream.getExtendedVideoSubType() : null, mediaStream != null ? mediaStream.getExtendedVideoSubTypeDescription() : null}), " ", null, null, 0, null, null, 62, null);
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = strJoinToString$default.toLowerCase(locale);
                            lowerCase2.getClass();
                            if (StringsKt.isBlank(lowerCase2)) {
                                num = childCount;
                                mediaSource = mediaSourceSelectBestMediaSourceByPriority;
                                str3 = str;
                            } else {
                                String lowerCase3 = lowerCase2.toLowerCase(locale);
                                lowerCase3.getClass();
                                Regex regex = new Regex("dovi\\s*profile\\s*(\\d+)");
                                num = childCount;
                                Regex regex2 = new Regex("profile\\s*(\\d+(?:\\.\\d+)?)");
                                mediaSource = mediaSourceSelectBestMediaSourceByPriority;
                                str3 = str;
                                MatchResult matchResultFind$default = Regex.find$default(regex, lowerCase3, 0, 2, null);
                                if (matchResultFind$default == null) {
                                    matchResultFind$default = Regex.find$default(regex2, lowerCase3, 0, 2, null);
                                }
                                String string3 = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str4 = (String) CollectionsKt.getOrNull(groupValues, 1)) == null) ? null : StringsKt.trim((CharSequence) str4).toString();
                                String str7 = string3 != null ? string3 : "";
                                if (StringsKt.isBlank(str7)) {
                                    strE = null;
                                } else if (StringsKt__StringsKt.contains$default(str7, (CharSequence) ".", false, 2, (Object) null)) {
                                    strE = "P".concat(str7);
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    int length = str7.length();
                                    for (int i3 = 0; i3 < length; i3++) {
                                        char cCharAt = str7.charAt(i3);
                                        if (Character.isDigit(cCharAt)) {
                                            sb2.append(cCharAt);
                                        }
                                    }
                                    String string4 = sb2.toString();
                                    if (string4.length() >= 2) {
                                        strE = ll0.e("P", StringsKt.dropLast(string4, 1), ".", StringsKt.takeLast(string4, 1));
                                    }
                                }
                                String videoType = mediaSource.getVideoType();
                                if (mediaStream != null) {
                                    videoRangeType = mediaStream.getVideoRangeType();
                                } else {
                                    videoRangeType = null;
                                }
                                if (mediaStream != null) {
                                    videoRange = mediaStream.getVideoRange();
                                } else {
                                    videoRange = null;
                                }
                                if (mediaStream != null) {
                                    extendedVideoType = mediaStream.getExtendedVideoType();
                                } else {
                                    extendedVideoType = null;
                                }
                                if (mediaStream != null) {
                                    extendedVideoSubType = mediaStream.getExtendedVideoSubType();
                                } else {
                                    extendedVideoSubType = null;
                                }
                                if (mediaStream != null) {
                                    extendedVideoSubTypeDescription = mediaStream.getExtendedVideoSubTypeDescription();
                                } else {
                                    extendedVideoSubTypeDescription = null;
                                }
                                if (mediaStream != null) {
                                    displayTitle = mediaStream.getDisplayTitle();
                                } else {
                                    displayTitle = null;
                                }
                                if (mediaStream != null) {
                                    title = mediaStream.getTitle();
                                } else {
                                    title = null;
                                }
                                if (mediaStream != null) {
                                    colorTransfer = mediaStream.getColorTransfer();
                                } else {
                                    colorTransfer = null;
                                }
                                if (mediaStream != null) {
                                    colorSpace = mediaStream.getColorSpace();
                                } else {
                                    colorSpace = null;
                                }
                                if (mediaStream != null) {
                                    colorPrimaries = mediaStream.getColorPrimaries();
                                } else {
                                    colorPrimaries = null;
                                }
                                lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{videoType, videoRangeType, videoRange, extendedVideoType, extendedVideoSubType, extendedVideoSubTypeDescription, displayTitle, title, colorTransfer, colorSpace, colorPrimaries, mediaSource.getName(), mediaSource.getPath()}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (!StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "dolbyvision", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "dolby vision", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "dovi", false, 2, (Object) null)) {
                                    if (strE != null) {
                                        strR = mr.r("DV(", strE, ")");
                                    } else {
                                        strR = "DV";
                                    }
                                } else if (StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr10+", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr10plus", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr 10+", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr 10 plus", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr10 plus", false, 2, (Object) null)) {
                                    strR = "HDR10+";
                                } else if (StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr10", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr 10", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "smpte2084", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "smpte 2084", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "st 2084", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "pq10", false, 2, (Object) null)) {
                                    strR = "HDR10";
                                } else {
                                    strR = StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdr", false, 2, (Object) null) ? "HDR" : "SDR";
                                }
                                listCreateListBuilder.add(strR);
                                bitrate = mediaSource.getBitrate();
                                if (bitrate != null || bitrate.intValue() <= 0) {
                                    str5 = null;
                                } else if (bitrate.intValue() >= 1000000) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    str5 = String.format(Locale.US, "%.1fMbps", Arrays.copyOf(new Object[]{Double.valueOf(((double) bitrate.intValue()) / 1000000.0d)}, 1));
                                } else {
                                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                    str5 = String.format(Locale.US, "%dKbps", Arrays.copyOf(new Object[]{Integer.valueOf(bitrate.intValue() / 1000)}, 1));
                                }
                                if (str5 != null) {
                                    listCreateListBuilder.add(str5);
                                }
                                size = mediaSource.getSize();
                                if (size != null || size.longValue() <= 0) {
                                    str6 = null;
                                } else if (size.longValue() >= 1073741824) {
                                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                                    str6 = String.format(Locale.US, "%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(size.longValue() / 1.073741824E9d)}, 1));
                                } else if (size.longValue() >= 1048576) {
                                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                                    str6 = String.format(Locale.US, "%.0fM", Arrays.copyOf(new Object[]{Double.valueOf(size.longValue() / 1048576.0d)}, 1));
                                } else if (size.longValue() >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                                    str6 = String.format(Locale.US, "%.0fK", Arrays.copyOf(new Object[]{Double.valueOf(size.longValue() / 1024.0d)}, 1));
                                } else {
                                    str6 = size + "B";
                                }
                                if (str6 != null) {
                                    listCreateListBuilder.add(str6);
                                }
                                listBuild = CollectionsKt.build(listCreateListBuilder);
                            }
                            strE = null;
                            String videoType2 = mediaSource.getVideoType();
                            if (mediaStream != null) {
                                videoRangeType = mediaStream.getVideoRangeType();
                            } else {
                                videoRangeType = null;
                            }
                            if (mediaStream != null) {
                                videoRange = mediaStream.getVideoRange();
                            } else {
                                videoRange = null;
                            }
                            if (mediaStream != null) {
                                extendedVideoType = mediaStream.getExtendedVideoType();
                            } else {
                                extendedVideoType = null;
                            }
                            if (mediaStream != null) {
                                extendedVideoSubType = mediaStream.getExtendedVideoSubType();
                            } else {
                                extendedVideoSubType = null;
                            }
                            if (mediaStream != null) {
                                extendedVideoSubTypeDescription = mediaStream.getExtendedVideoSubTypeDescription();
                            } else {
                                extendedVideoSubTypeDescription = null;
                            }
                            if (mediaStream != null) {
                                displayTitle = mediaStream.getDisplayTitle();
                            } else {
                                displayTitle = null;
                            }
                            if (mediaStream != null) {
                                title = mediaStream.getTitle();
                            } else {
                                title = null;
                            }
                            if (mediaStream != null) {
                                colorTransfer = mediaStream.getColorTransfer();
                            } else {
                                colorTransfer = null;
                            }
                            if (mediaStream != null) {
                                colorSpace = mediaStream.getColorSpace();
                            } else {
                                colorSpace = null;
                            }
                            if (mediaStream != null) {
                                colorPrimaries = mediaStream.getColorPrimaries();
                            } else {
                                colorPrimaries = null;
                            }
                            lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{videoType2, videoRangeType, videoRange, extendedVideoType, extendedVideoSubType, extendedVideoSubTypeDescription, displayTitle, title, colorTransfer, colorSpace, colorPrimaries, mediaSource.getName(), mediaSource.getPath()}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "dolbyvision", false, 2, (Object) null)) {
                                if (strE != null) {
                                    strR = mr.r("DV(", strE, ")");
                                } else {
                                    strR = "DV";
                                }
                            } else if (strE != null) {
                                strR = mr.r("DV(", strE, ")");
                            } else {
                                strR = "DV";
                            }
                            listCreateListBuilder.add(strR);
                            bitrate = mediaSource.getBitrate();
                            if (bitrate != null) {
                                str5 = null;
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                listCreateListBuilder.add(str5);
                            }
                            size = mediaSource.getSize();
                            if (size != null) {
                                str6 = null;
                            } else {
                                str6 = null;
                            }
                            if (str6 != null) {
                                listCreateListBuilder.add(str6);
                            }
                            listBuild = CollectionsKt.build(listCreateListBuilder);
                        }
                        objRememberedValue = listBuild;
                    } else {
                        listBuild = CollectionsKt.emptyList();
                    }
                    i = i2;
                    str2 = string;
                    num = childCount;
                    str3 = str;
                    objRememberedValue = listBuild;
                } else {
                    i = i2;
                    str2 = string;
                    num = childCount;
                    str3 = str;
                    objRememberedValue = CollectionsKt.emptyList();
                }
                composer.updateRememberedValue(objRememberedValue);
            } else {
                i = i2;
                str2 = string;
                num = childCount;
                str3 = str;
            }
            List list = (List) objRememberedValue;
            String name = mediaItem.getName();
            Modifier modifierFocusProperties = Modifier.INSTANCE;
            int size2 = this.e.size();
            boolean z4 = iIntValue == 0;
            boolean z5 = iIntValue == size2 + (-1);
            if (z4 || z5) {
                z = false;
                modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierFocusProperties, new b8(z4, z5, 0));
            } else {
                z = false;
            }
            Modifier modifier = modifierFocusProperties;
            Float communityRating = mediaItem.getCommunityRating();
            boolean z6 = (Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData = mediaItem.getUserData()) != null && userData.getPlayed()) ? true : z;
            FocusRequester focusRequester = (this.g && Intrinsics.areEqual(string2, this.h)) ? this.i : null;
            if (list.isEmpty()) {
                z2 = true;
                composer.startReplaceGroup(730264134);
                composer.endReplaceGroup();
                composableLambda = null;
            } else {
                composer.startReplaceGroup(730105693);
                z2 = true;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1263801601, true, new j8(list), composer, 54);
                composer.endReplaceGroup();
                composableLambda = composableLambdaRememberComposableLambda;
            }
            boolean z7 = z2;
            Function3 function3 = this.j;
            boolean zChanged4 = composer.changed(function3) | composer.changed(string2) | composer.changedInstance(serverConfig) | composer.changedInstance(mediaItem);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                t6 t6Var = new t6(function3, string2, serverConfig, mediaItem, 1);
                composer.updateRememberedValue(t6Var);
                objRememberedValue2 = t6Var;
            }
            Function0 function0 = (Function0) objRememberedValue2;
            boolean z8 = ((((i & Input.Keys.FORWARD_DEL) ^ 48) <= 32 || !composer.changed(iIntValue)) && (i & 48) != 32) ? z : z7;
            CoroutineScope coroutineScope = this.k;
            boolean zChangedInstance = z8 | composer.changedInstance(coroutineScope);
            LazyListState lazyListState = this.l;
            boolean zChanged5 = zChangedInstance | composer.changed(lazyListState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new k8(lazyListState, coroutineScope, iIntValue);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a41.e(name, str2, function0, modifier, str3, num, focusRequester, false, true, communityRating, z6, null, 0.0f, 0L, 0L, (Function1) objRememberedValue3, null, composableLambda, composer, 805306368, 0, 192896);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
