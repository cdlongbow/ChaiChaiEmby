package com.dh.myembyapp.data.model;

import androidx.core.text.util.LocalePreferences;
import defpackage.mr;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a1\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u000f\"\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0000\u001a)\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000f\"\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"resolveAudioCodecPriorityType", "Lcom/dh/myembyapp/data/model/AudioCodecPriorityType;", "sampleMimeType", "", "codecs", "titleLabel", "formatLabel", "stream", "Lcom/dh/myembyapp/data/model/MediaStream;", "resolveAudioCodecPriorityTypeFromText", "text", "resolveAudioLanguagePreference", "Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "descriptiveText", "languageCodes", "", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "detectAudioLanguagePreferenceFromCode", "language", "detectAudioLanguagePreferenceFromText", "normalizeAudioLanguage", "containsAudioLanguageKeyword", "", "keywords", "(Ljava/lang/String;[Ljava/lang/String;)Z", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class AudioStreamDetectionKt {
    private static final boolean containsAudioLanguageKeyword(String str, String... strArr) {
        boolean zContains$default;
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int i = 0;
            while (true) {
                if (i >= lowerCase.length()) {
                    zContains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) lowerCase, false, 2, (Object) null);
                    break;
                }
                char cCharAt = lowerCase.charAt(i);
                if ('a' <= cCharAt && cCharAt < '{') {
                    zContains$default = new Regex(mr.r("(?<![a-z])", Regex.INSTANCE.escape(lowerCase), "(?![a-z])")).containsMatchIn(str);
                    break;
                }
                i++;
            }
            if (zContains$default) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AudioLanguagePreference detectAudioLanguagePreferenceFromCode(String str) {
        String strNormalizeAudioLanguage = normalizeAudioLanguage(str);
        if (strNormalizeAudioLanguage == null) {
            return null;
        }
        switch (strNormalizeAudioLanguage.hashCode()) {
            case 3201:
                if (strNormalizeAudioLanguage.equals("de")) {
                    return AudioLanguagePreference.GERMAN;
                }
                return null;
            case 3241:
                if (strNormalizeAudioLanguage.equals("en")) {
                    return AudioLanguagePreference.ENGLISH;
                }
                return null;
            case 3246:
                if (strNormalizeAudioLanguage.equals("es")) {
                    return AudioLanguagePreference.SPANISH;
                }
                return null;
            case 3276:
                if (strNormalizeAudioLanguage.equals("fr")) {
                    return AudioLanguagePreference.FRENCH;
                }
                return null;
            case 3371:
                if (strNormalizeAudioLanguage.equals("it")) {
                    return AudioLanguagePreference.ITALIAN;
                }
                return null;
            case 3383:
                if (strNormalizeAudioLanguage.equals("ja")) {
                    return AudioLanguagePreference.JAPANESE;
                }
                return null;
            case 3428:
                if (strNormalizeAudioLanguage.equals("ko")) {
                    return AudioLanguagePreference.KOREAN;
                }
                return null;
            case 3651:
                if (strNormalizeAudioLanguage.equals("ru")) {
                    return AudioLanguagePreference.RUSSIAN;
                }
                return null;
            case 3700:
                if (strNormalizeAudioLanguage.equals("th")) {
                    return AudioLanguagePreference.THAI;
                }
                return null;
            case 3886:
                if (strNormalizeAudioLanguage.equals("zh")) {
                    return AudioLanguagePreference.CHINESE;
                }
                return null;
            case 120009:
                if (strNormalizeAudioLanguage.equals("yue")) {
                    return AudioLanguagePreference.CANTONESE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final AudioLanguagePreference detectAudioLanguagePreferenceFromText(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        if (StringsKt.isBlank(lowerCase)) {
            return null;
        }
        if (containsAudioLanguageKeyword(lowerCase, "粤语", "廣東話", "广东话", "廣東語", "cantonese")) {
            return AudioLanguagePreference.CANTONESE;
        }
        if (containsAudioLanguageKeyword(lowerCase, "中文", "国语", "國語", "普通话", "普通話", "华语", "華語", "mandarin", LocalePreferences.CalendarType.CHINESE)) {
            return AudioLanguagePreference.CHINESE;
        }
        if (containsAudioLanguageKeyword(lowerCase, "英语", "英文", "english")) {
            return AudioLanguagePreference.ENGLISH;
        }
        if (containsAudioLanguageKeyword(lowerCase, "韩语", "韓語", "朝鲜语", "朝鮮語", "korean")) {
            return AudioLanguagePreference.KOREAN;
        }
        if (containsAudioLanguageKeyword(lowerCase, "日语", "日語", "japanese")) {
            return AudioLanguagePreference.JAPANESE;
        }
        if (containsAudioLanguageKeyword(lowerCase, "法语", "法語", "french")) {
            return AudioLanguagePreference.FRENCH;
        }
        if (containsAudioLanguageKeyword(lowerCase, "德语", "德語", "german")) {
            return AudioLanguagePreference.GERMAN;
        }
        if (containsAudioLanguageKeyword(lowerCase, "西班牙语", "西班牙語", "spanish")) {
            return AudioLanguagePreference.SPANISH;
        }
        if (containsAudioLanguageKeyword(lowerCase, "俄语", "俄語", "russian")) {
            return AudioLanguagePreference.RUSSIAN;
        }
        if (containsAudioLanguageKeyword(lowerCase, "意大利语", "意大利語", "italian")) {
            return AudioLanguagePreference.ITALIAN;
        }
        if (containsAudioLanguageKeyword(lowerCase, "泰语", "泰語", "thai")) {
            return AudioLanguagePreference.THAI;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0135 A[RETURN] */
    public static final String normalizeAudioLanguage(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        switch (lowerCase) {
            case "yue-cn":
            case "yue-hk":
            case "zh-yue":
                return "yue";
            case "zh-hans":
                return "zh";
            case "zh-hant":
                return "zh";
            case "yue-hans":
            case "yue-hant":
                return "yue";
            case "":
                return null;
            case "de":
                return "de";
            case "en":
                return "en";
            case "es":
                return "es";
            case "fr":
                return "fr";
            case "it":
                return "it";
            case "ja":
                return "ja";
            case "ko":
                return "ko";
            case "ru":
                return "ru";
            case "th":
                return "th";
            case "zh":
            case "chi":
                return "zh";
            case "deu":
                return "de";
            case "eng":
                return "en";
            case "fra":
            case "fre":
                return "fr";
            case "ger":
                return "de";
            case "ita":
                return "it";
            case "jpn":
                return "ja";
            case "kor":
                return "ko";
            case "rus":
                return "ru";
            case "spa":
                return "es";
            case "tha":
                return "th";
            case "und":
                return null;
            case "yue":
                return "yue";
            case "zho":
            case "zh-cn":
                return "zh";
            case "zh-hk":
            case "zh-mo":
                return "yue";
            case "zh-tw":
                return "zh";
            default:
                return lowerCase;
        }
    }

    public static final AudioCodecPriorityType resolveAudioCodecPriorityType(MediaStream mediaStream) {
        mediaStream.getClass();
        String lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream.getCodec(), mediaStream.getDisplayTitle(), mediaStream.getTitle()}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return resolveAudioCodecPriorityTypeFromText(lowerCase);
    }

    private static final AudioCodecPriorityType resolveAudioCodecPriorityTypeFromText(String str) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "truehd", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "mlp", false, 2, (Object) null)) {
            return AudioCodecPriorityType.TRUEHD;
        }
        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "eac3", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ec3", false, 2, (Object) null)) {
            return AudioCodecPriorityType.EAC3;
        }
        if (new Regex("(?<!e)ac-?3").containsMatchIn(str) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ac3", false, 2, (Object) null)) {
            return AudioCodecPriorityType.AC3;
        }
        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "dts", false, 2, (Object) null)) {
            return AudioCodecPriorityType.DTS;
        }
        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "flac", false, 2, (Object) null)) {
            return AudioCodecPriorityType.FLAC;
        }
        return (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "aac", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "mp4a", false, 2, (Object) null)) ? AudioCodecPriorityType.AAC : AudioCodecPriorityType.OTHER;
    }

    public static final AudioLanguagePreference resolveAudioLanguagePreference(String str, String... strArr) {
        strArr.getClass();
        AudioLanguagePreference audioLanguagePreferenceDetectAudioLanguagePreferenceFromText = detectAudioLanguagePreferenceFromText(str);
        if (audioLanguagePreferenceDetectAudioLanguagePreferenceFromText != null) {
            return audioLanguagePreferenceDetectAudioLanguagePreferenceFromText;
        }
        for (String str2 : strArr) {
            AudioLanguagePreference audioLanguagePreferenceDetectAudioLanguagePreferenceFromCode = detectAudioLanguagePreferenceFromCode(str2);
            if (audioLanguagePreferenceDetectAudioLanguagePreferenceFromCode != null) {
                return audioLanguagePreferenceDetectAudioLanguagePreferenceFromCode;
            }
        }
        return null;
    }

    public static final AudioCodecPriorityType resolveAudioCodecPriorityType(String str, String str2, String str3, String str4) {
        String lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3, str4}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return resolveAudioCodecPriorityTypeFromText(lowerCase);
    }
}
