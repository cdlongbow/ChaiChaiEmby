package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.SubtitleView;
import com.badlogic.gdx.graphics.GL20;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class in1 {
    public static final void a(String str, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        str.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(216906341);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(216906341, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerStartupArtworkOverlay (PlayerScreenHelpers.kt:613)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Color.Companion companion = Color.INSTANCE;
            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifier, companion.m5178getBlack0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM275backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (StringsKt.isBlank(str)) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-409255913);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-409827708);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ColorPainter(companion.m5178getBlack0d7_KjU(), defaultConstructorMarker);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ColorPainter colorPainter = (ColorPainter) objRememberedValue;
                bs0 bs0Var = new bs0(context);
                bs0Var.c = str;
                hs0.a(bs0Var, true);
                fs0 fs0VarA = bs0Var.a();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                int i4 = ColorPainter.$stable;
                g12.b(fs0VarA, null, modifierFillMaxSize$default, colorPainter, colorPainter, colorPainter, null, null, null, crop, composerStartRestartGroup, (i4 << 9) | 432 | (i4 << 12) | (i4 << 15), 6, 31680);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(str, modifier, i, 10));
        }
    }

    public static final List b(List list, Typeface typeface) {
        list.getClass();
        if (typeface == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Cue cueBuild = (Cue) it.next();
            CharSequence charSequence = cueBuild.text;
            if (cueBuild.bitmap == null && charSequence != null && charSequence.length() != 0) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new f31(typeface), 0, spannableString.length(), 33);
                cueBuild = cueBuild.buildUpon().setText(spannableString).build();
                cueBuild.getClass();
            }
            arrayList.add(cueBuild);
        }
        return arrayList;
    }

    public static final String c(UserPreferences.AssSubtitleEnhancementGuard assSubtitleEnhancementGuard) {
        String subtitleLabel = assSubtitleEnhancementGuard.getSubtitleLabel();
        String strConcat = null;
        if (subtitleLabel != null) {
            if (StringsKt.isBlank(subtitleLabel)) {
                subtitleLabel = null;
            }
            if (subtitleLabel != null) {
                strConcat = "，字幕：".concat(subtitleLabel);
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        return "ASS 增强渲染上次异常退出，已自动回退为默认渲染".concat(strConcat);
    }

    public static final String d(String str, String str2, float f) {
        String strN = n(str2);
        if (strN != null && str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                long j = (long) (f * 1000.0f);
                if (j == 0) {
                    return null;
                }
                return str + "|" + strN + "|" + j;
            }
        }
        return null;
    }

    public static final String e(MediaItem mediaItem) {
        mediaItem.getClass();
        List<String> backdropImageTags = mediaItem.getBackdropImageTags();
        String str = backdropImageTags != null ? (String) CollectionsKt.firstOrNull((List) backdropImageTags) : null;
        if (str != null) {
            return RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Backdrop", str, Integer.valueOf(GL20.GL_INVALID_ENUM));
        }
        ImageTags imageTags = mediaItem.getImageTags();
        return (imageTags != null ? imageTags.getPrimary() : null) != null ? RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", mediaItem.getImageTags().getPrimary(), 720) : "";
    }

    public static final String f(MediaStream mediaStream) {
        String displayTitle = mediaStream.getDisplayTitle();
        if (displayTitle != null || (displayTitle = mediaStream.getTitle()) != null) {
            return displayTitle;
        }
        String language = mediaStream.getLanguage();
        if (language == null) {
            language = "未知";
        }
        return language + " (" + (mediaStream.isExternal() ? "外挂" : "字幕") + ")";
    }

    public static final boolean g(MediaStream mediaStream) {
        String strN;
        if (mediaStream != null && Intrinsics.areEqual(mediaStream.getType(), "Subtitle") && !mediaStream.isExternal() && l(mediaStream) && (strN = n(mediaStream.getCodec())) != null) {
            int iHashCode = strN.hashCode();
            if (iHashCode != 96897) {
                if (iHashCode != 114165) {
                    if (iHashCode == 117110 && strN.equals("vtt")) {
                        return true;
                    }
                } else if (strN.equals("srt")) {
                    return true;
                }
            } else if (strN.equals("ass")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public static final boolean h(MediaStream mediaStream, Integer num) {
        boolean z;
        if (num == null) {
            return false;
        }
        if (num.intValue() < 0) {
            return true;
        }
        if (mediaStream == null) {
            return false;
        }
        if (!s(mediaStream, true, num)) {
            if (Intrinsics.areEqual(mediaStream.getType(), "Subtitle") && !mediaStream.isExternal()) {
                String deliveryMethod = mediaStream.getDeliveryMethod();
                if (deliveryMethod == null) {
                    deliveryMethod = "";
                }
                String lowerCase = deliveryMethod.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                int iHashCode = lowerCase.hashCode();
                if (iHashCode == -1820761141 ? lowerCase.equals("external") : iHashCode == -113921284 ? lowerCase.equals("videosidedata") : iHashCode == 103407 && lowerCase.equals("hls")) {
                    z = false;
                } else {
                    z = !l(mediaStream);
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final Activity i(Context context) {
        context.getClass();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return (Activity) context;
    }

    public static final Uri j(Context context, String str, String str2) {
        str.getClass();
        File fileK = k(context, str, str2);
        if (!fileK.isFile() || fileK.length() <= 0) {
            fileK = null;
        }
        if (fileK != null) {
            return Uri.fromFile(fileK);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public static final File k(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str3 = "vtt";
        switch (lowerCase.hashCode()) {
            case -791786078:
                if (!lowerCase.equals("webvtt")) {
                    str3 = "srt";
                }
                break;
            case 96897:
                str3 = "ass";
                if (!lowerCase.equals("ass")) {
                    str3 = "srt";
                }
                break;
            case 114177:
                str3 = "ssa";
                if (!lowerCase.equals("ssa")) {
                    str3 = "srt";
                }
                break;
            case 117110:
                if (!lowerCase.equals("vtt")) {
                    str3 = "srt";
                }
                break;
            default:
                str3 = "srt";
                break;
        }
        File file = new File(context.getCacheDir(), "transcode_subtitles");
        file.mkdirs();
        return new File(file, ll0.e("transcode_subtitle_", UStringsKt.m10141toStringV7xB4Y4(UInt.m8920constructorimpl(str.hashCode()), 16), ".", str3));
    }

    public static final boolean l(MediaStream mediaStream) {
        mediaStream.getClass();
        if (mediaStream.isTextSubtitleStream()) {
            return true;
        }
        String strN = n(mediaStream.getCodec());
        if (strN == null) {
            return false;
        }
        int iHashCode = strN.hashCode();
        if (iHashCode != 96897) {
            if (iHashCode != 114165) {
                if (iHashCode != 117110 || !strN.equals("vtt")) {
                    return false;
                }
            } else if (!strN.equals("srt")) {
                return false;
            }
        } else if (!strN.equals("ass")) {
            return false;
        }
        return true;
    }

    public static final Typeface m(String str) {
        if (str != null && !StringsKt.isBlank(str)) {
            File file = new File(str);
            if (!file.isFile()) {
                Log.w("SubtitleFont", "字幕字体文件不存在: " + str);
                return null;
            }
            try {
                return Typeface.createFromFile(file);
            } catch (Exception e) {
                Log.w("SubtitleFont", "加载字幕字体失败: " + str, e);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String n(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1642769982:
                    if (lowerCase.equals("hdmv_pgs")) {
                        return "pgs";
                    }
                    break;
                case -1320042960:
                    if (lowerCase.equals("dvbsub")) {
                        return "dvb";
                    }
                    break;
                case -1316959897:
                    if (lowerCase.equals("dvb_subtitle")) {
                        return "dvb";
                    }
                    break;
                case -989839516:
                    if (lowerCase.equals("pgssub")) {
                        return "pgs";
                    }
                    break;
                case -891530535:
                    if (lowerCase.equals("subrip")) {
                        return "srt";
                    }
                    break;
                case -791786078:
                    if (lowerCase.equals("webvtt")) {
                        return "vtt";
                    }
                    break;
                case 96897:
                    if (lowerCase.equals("ass")) {
                        return "ass";
                    }
                    break;
                case 99856:
                    if (lowerCase.equals("dvb")) {
                        return "dvb";
                    }
                    break;
                case 110940:
                    if (lowerCase.equals("pgs")) {
                        return "pgs";
                    }
                    break;
                case 114165:
                    if (lowerCase.equals("srt")) {
                        return "srt";
                    }
                    break;
                case 114177:
                    if (lowerCase.equals("ssa")) {
                        return "ass";
                    }
                    break;
                case 117110:
                    if (lowerCase.equals("vtt")) {
                        return "vtt";
                    }
                    break;
            }
        }
        return null;
    }

    public static final Typeface o(Typeface typeface, boolean z, boolean z2, boolean z3, boolean z4, md mdVar) {
        if (typeface != null) {
            boolean z5 = z && z2 && !z3 && z4 && mdVar != null;
            if (!z3 && !z5) {
                return typeface;
            }
        }
        return null;
    }

    public static final Float p(MediaSource mediaSource) {
        List<MediaStream> mediaStreams;
        Object next;
        if (mediaSource != null && (mediaStreams = mediaSource.getMediaStreams()) != null) {
            Iterator<T> it = mediaStreams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaStream) next).getType(), "Video"));
            MediaStream mediaStream = (MediaStream) next;
            if (mediaStream != null) {
                return (Float) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(CollectionsKt.listOf((Object[]) new Double[]{mediaStream.getRealFrameRate(), mediaStream.getAverageFrameRate()})), new uc1(8)), hn1.a));
            }
        }
        return null;
    }

    public static final String q(MediaStream mediaStream) {
        String string;
        String strN = n(mediaStream.getCodec());
        if (strN == null) {
            String codec = mediaStream.getCodec();
            strN = null;
            if (codec != null && (string = StringsKt.trim((CharSequence) codec).toString()) != null) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String strRemovePrefix = StringsKt.removePrefix(lowerCase, (CharSequence) ".");
                if (strRemovePrefix != null && !StringsKt.isBlank(strRemovePrefix)) {
                    strN = strRemovePrefix;
                }
            }
            if (strN == null) {
                return "srt";
            }
        }
        return strN;
    }

    public static final String r(String str) {
        if (str == null) {
            str = "";
        }
        String strTake = StringsKt.take(StringsKt.trim(new Regex("[^A-Za-z0-9._-]").replace(str, "_"), '_'), 48);
        return StringsKt.isBlank(strTake) ? "na" : strTake;
    }

    public static final boolean s(MediaStream mediaStream, boolean z, Integer num) {
        mediaStream.getClass();
        if (!Intrinsics.areEqual(mediaStream.getType(), "Subtitle")) {
            return false;
        }
        if (!z) {
            return mediaStream.isExternal();
        }
        if (num == null || num.intValue() < 0 || mediaStream.getIndex() != num.intValue()) {
            return false;
        }
        return mediaStream.isExternal();
    }

    public static final void t(SubtitleView subtitleView, md mdVar) {
        Object obj;
        int i = 0;
        IntRange intRangeUntil = RangesKt.until(0, subtitleView.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(subtitleView.getChildAt(((IntIterator) it).nextInt()));
        }
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if ((view instanceof fe) && (((fe) view).getTag() instanceof zd)) {
                break;
            }
        }
        View view2 = (View) obj;
        if (mdVar == null) {
            if (view2 != null) {
                subtitleView.removeView(view2);
                return;
            }
            return;
        }
        Object tag = view2 != null ? view2.getTag() : null;
        zd zdVar = tag instanceof zd ? (zd) tag : null;
        if ((zdVar != null ? zdVar.a : null) == mdVar) {
            return;
        }
        if (view2 != null) {
            subtitleView.removeView(view2);
        }
        Context context = subtitleView.getContext();
        context.getClass();
        fe feVar = new fe(context, mdVar);
        feVar.setTag(new zd(mdVar));
        subtitleView.addView(feVar, new FrameLayout.LayoutParams(-1, -1));
    }
}
