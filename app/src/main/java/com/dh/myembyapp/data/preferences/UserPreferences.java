package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemDurationDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import com.dh.myembyapp.data.model.VideoQualityStandard;
import com.dh.myembyapp.data.model.VideoValueSortDirection;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.dlna.DlnaConstants;
import defpackage.c61;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import defpackage.y82;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u000e\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020(J\u000e\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u000e\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u000e\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020$J\u0006\u00103\u001a\u00020$J\u000e\u00104\u001a\u00020\t2\u0006\u0010'\u001a\u000205J\u0006\u00106\u001a\u000205J\u000e\u00107\u001a\u00020\t2\u0006\u0010'\u001a\u000208J\u0006\u00109\u001a\u000208J\u000e\u0010:\u001a\u00020\t2\u0006\u0010'\u001a\u00020;J\u0006\u0010<\u001a\u00020;J\u000e\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0015J\u0006\u0010?\u001a\u00020\u0015J\u000e\u0010@\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010A\u001a\u00020\u0015J\u0010\u0010B\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010\u000bJ\b\u0010D\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010E\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010F\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010G\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010H\u001a\u00020\u0015J\u000e\u0010I\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010J\u001a\u00020\u0015J\u000e\u0010K\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010L\u001a\u00020\u0015J\u000e\u0010M\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010N\u001a\u00020\u0015J\u000e\u0010O\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010P\u001a\u00020\u0015J\u000e\u0010Q\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010R\u001a\u00020\u0015J\u000e\u0010S\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010T\u001a\u00020\u0015J\u000e\u0010U\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010V\u001a\u00020\u0015J\u000e\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u0015J\u0006\u0010Y\u001a\u00020\u0015J\u000e\u0010Z\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010[\u001a\u00020\u0015J\u001e\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u000bJ\u0012\u0010a\u001a\u00020^2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010b\u001a\u00020\u00152\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010c\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u000bH\u0002J\u000e\u0010d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010e\u001a\u00020\u0015J\u001a\u0010f\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010\u000b2\b\u0010h\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010i\u001a\u00020\tJ\u0012\u0010j\u001a\u0004\u0018\u00010k2\b\b\u0002\u0010l\u001a\u00020^J\u000e\u0010m\u001a\u00020\t2\u0006\u0010n\u001a\u00020oJ\u0006\u0010p\u001a\u00020oJ\u0012\u0010q\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020s0rH\u0002J\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r*\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010u\u001a\u00020\t2\u0006\u0010n\u001a\u00020vJ\u0006\u0010w\u001a\u00020vJ\u0018\u0010x\u001a\b\u0012\u0004\u0012\u00020y0r2\b\u0010z\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010{\u001a\u00020\t2\u0006\u0010n\u001a\u00020|J\u0006\u0010}\u001a\u00020|J\u0018\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0r2\b\u0010z\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\u0080\u0001\u001a\u00020\u000b2\u0015\u0010\u0081\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020$0\u0082\u0001H\u0002J!\u0010\u0084\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020$0\u0082\u00012\b\u0010z\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\u0085\u0001\u001a\u00020\u000b2\u0015\u0010\u0081\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020$0\u0082\u0001H\u0002J!\u0010\u0087\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020$0\u0082\u00012\b\u0010z\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008a\u0001"}, d2 = {"Lcom/dh/myembyapp/data/preferences/UserPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "saveServerUrl", "", "url", "", "getServerUrl", "saveLoginInfo", "userId", "username", "accessToken", "getUserId", "getUsername", "getAccessToken", "isLoggedIn", "", "clearLoginInfo", "saveEnableAggregateSearch", "enable", "getEnableAggregateSearch", "saveLastUsedAggregateHub", "getLastUsedAggregateHub", "saveEnableAggregateSearchInServerSearch", "getEnableAggregateSearchInServerSearch", "savePlaybackSpeed", "speed", "", "getPlaybackSpeed", "saveAudioDelayMs", "delayMs", "", "getAudioDelayMs", "saveSystemTimeDisplayMode", "mode", "Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;", "getSystemTimeDisplayMode", "saveSystemNetworkSpeedDisplayMode", "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;", "getSystemNetworkSpeedDisplayMode", "saveSystemNetworkSpeedPosition", DlnaConstants.EXTRA_POSITION, "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;", "getSystemNetworkSpeedPosition", "saveSeekIntervalSec", "seconds", "getSeekIntervalSec", "savePlayerResizeMode", "Lcom/dh/myembyapp/data/model/PlayerResizeMode;", "getPlayerResizeMode", "savePlayerDefaultViewMode", "Lcom/dh/myembyapp/data/model/PlayerDefaultViewMode;", "getPlayerDefaultViewMode", "savePlayerFrameRateMatchingMode", "Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode;", "getPlayerFrameRateMatchingMode", "saveDisableTopNavFocusRefresh", "disable", "getDisableTopNavFocusRefresh", "saveEnableTransparentTopNavButtons", "getEnableTransparentTopNavButtons", "saveQrNetworkInterfaceName", "interfaceName", "getQrNetworkInterfaceName", "saveServerIconLibraryUrl", "getServerIconLibraryUrl", "saveEnableClickableLibrarySectionTitle", "getEnableClickableLibrarySectionTitle", "saveEnableLibraryRowMoreButton", "getEnableLibraryRowMoreButton", "saveEnableHomeUnplayedOnly", "getEnableHomeUnplayedOnly", "saveEnablePlaybackStartupPoster", "getEnablePlaybackStartupPoster", "saveEnableAggregateSearchVersionTags", "getEnableAggregateSearchVersionTags", "saveEnableDetailAggregateVersionRail", "getEnableDetailAggregateVersionRail", "saveEnableHomeBackFocusServerButton", "getEnableHomeBackFocusServerButton", "saveEnableAppUpdateCheckOnStartup", "getEnableAppUpdateCheckOnStartup", "saveAdminDebugFeaturesUnlocked", "unlocked", "getAdminDebugFeaturesUnlocked", "saveEnableSpecialFeatures", "getEnableSpecialFeatures", "saveAppUpdateStartupCheckCache", "checkedAtMs", "", "hasUpdate", "currentVersion", "getAppUpdateStartupLastCheckTimeMs", "getAppUpdateStartupLastHasUpdate", "isAppUpdateStartupCacheForVersion", "saveEnableAssSubtitleEnhancement", "getEnableAssSubtitleEnhancement", "armAssSubtitleEnhancementGuard", "mediaId", "subtitleLabel", "clearAssSubtitleEnhancementGuard", "consumeRecentAssSubtitleEnhancementGuard", "Lcom/dh/myembyapp/data/preferences/UserPreferences$AssSubtitleEnhancementGuard;", "maxAgeMs", "saveVideoVersionPrioritySettings", "settings", "Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;", "getVideoVersionPrioritySettings", "toJsonString", "", "Lcom/dh/myembyapp/data/model/VideoPriorityRule;", "parseVideoPriorityRules", "saveAudioVersionPrioritySettings", "Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;", "getAudioVersionPrioritySettings", "parseAudioPrioritySortTypes", "Lcom/dh/myembyapp/data/model/AudioPrioritySortType;", "value", "saveSubtitleVersionPrioritySettings", "Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;", "getSubtitleVersionPrioritySettings", "parseSubtitlePrioritySortTypes", "Lcom/dh/myembyapp/data/model/SubtitlePrioritySortType;", "encodeSubtitleLanguagePriorities", "priorities", "", "Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType;", "parseSubtitleLanguagePriorities", "encodeSubtitleFormatPriorities", "Lcom/dh/myembyapp/data/model/SubtitleFormatPriorityType;", "parseSubtitleFormatPriorities", "AssSubtitleEnhancementGuard", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserPreferences {
    public static final int AUDIO_DELAY_MAX_MS = 10000;
    public static final int AUDIO_DELAY_MIN_MS = -10000;
    public static final int AUDIO_DELAY_STEP_MS = 100;
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_ADMIN_DEBUG_FEATURES_UNLOCKED = "admin_debug_features_unlocked";
    private static final String KEY_APP_UPDATE_STARTUP_LAST_CHECKED_VERSION = "app_update_startup_last_checked_version";
    private static final String KEY_APP_UPDATE_STARTUP_LAST_CHECK_TIME_MS = "app_update_startup_last_check_time_ms";
    private static final String KEY_APP_UPDATE_STARTUP_LAST_HAS_UPDATE = "app_update_startup_last_has_update";
    private static final String KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_ACTIVE = "ass_subtitle_enhancement_guard_active";
    private static final String KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_MEDIA_ID = "ass_subtitle_enhancement_guard_media_id";
    private static final String KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_SUBTITLE_LABEL = "ass_subtitle_enhancement_guard_subtitle_label";
    private static final String KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_TIME_MS = "ass_subtitle_enhancement_guard_time_ms";
    private static final String KEY_AUDIO_DELAY_MS = "audio_delay_ms";
    private static final String KEY_AUDIO_PREFERRED_LANGUAGE = "audio_preferred_language";
    private static final String KEY_AUDIO_PRIORITY_AAC = "audio_priority_aac";
    private static final String KEY_AUDIO_PRIORITY_AC3 = "audio_priority_ac3";
    private static final String KEY_AUDIO_PRIORITY_DTS = "audio_priority_dts";
    private static final String KEY_AUDIO_PRIORITY_EAC3 = "audio_priority_eac3";
    private static final String KEY_AUDIO_PRIORITY_FLAC = "audio_priority_flac";
    private static final String KEY_AUDIO_PRIORITY_SORT_TYPES = "audio_priority_sort_types";
    private static final String KEY_AUDIO_PRIORITY_TRUEHD = "audio_priority_truehd";
    private static final String KEY_DISABLE_TOP_NAV_FOCUS_REFRESH = "disable_top_nav_focus_refresh";
    private static final String KEY_ENABLE_AGGREGATE_SEARCH = "enable_aggregate_search";
    private static final String KEY_ENABLE_AGGREGATE_SEARCH_IN_SERVER_SEARCH = "enable_aggregate_search_in_server_search";
    private static final String KEY_ENABLE_AGGREGATE_SEARCH_VERSION_TAGS = "enable_aggregate_search_version_tags";
    private static final String KEY_ENABLE_APP_UPDATE_CHECK_ON_STARTUP = "enable_app_update_check_on_startup";
    private static final String KEY_ENABLE_ASS_SUBTITLE_ENHANCEMENT = "enable_ass_subtitle_enhancement";
    private static final String KEY_ENABLE_CLICKABLE_LIBRARY_SECTION_TITLE = "enable_clickable_library_section_title";
    private static final String KEY_ENABLE_DETAIL_AGGREGATE_VERSION_RAIL = "enable_detail_aggregate_version_rail";
    private static final String KEY_ENABLE_HOME_BACK_FOCUS_SERVER_BUTTON = "enable_home_back_focus_server_button";
    private static final String KEY_ENABLE_HOME_UNPLAYED_ONLY = "enable_home_unplayed_only";
    private static final String KEY_ENABLE_LIBRARY_ROW_MORE_BUTTON = "enable_library_row_more_button";
    private static final String KEY_ENABLE_PLAYBACK_STARTUP_POSTER = "enable_playback_startup_poster";
    private static final String KEY_ENABLE_SPECIAL_FEATURES = "enable_special_features";
    private static final String KEY_ENABLE_TRANSPARENT_TOP_NAV_BUTTONS = "enable_transparent_top_nav_buttons";
    private static final String KEY_IS_LOGGED_IN = "is_logged_in";
    private static final String KEY_LAST_USED_AGGREGATE_HUB = "last_used_aggregate_hub";
    private static final String KEY_PLAYBACK_SPEED = "playback_speed";
    private static final String KEY_PLAYER_DEFAULT_VIEW_MODE = "player_default_view_mode";
    private static final String KEY_PLAYER_FRAME_RATE_MATCHING_MODE = "player_frame_rate_matching_mode";
    private static final String KEY_PLAYER_RESIZE_MODE = "player_resize_mode";
    private static final String KEY_QR_NETWORK_INTERFACE_NAME = "qr_network_interface_name";
    private static final String KEY_SEEK_INTERVAL_SEC = "seek_interval_sec";
    private static final String KEY_SERVER_ICON_LIBRARY_URL = "server_icon_library_url";
    private static final String KEY_SERVER_URL = "server_url";
    private static final String KEY_SUBTITLE_FORMAT_PRIORITIES = "subtitle_format_priorities";
    private static final String KEY_SUBTITLE_LANGUAGE_PRIORITIES = "subtitle_language_priorities";
    private static final String KEY_SUBTITLE_PRIORITY_SORT_TYPES = "subtitle_priority_sort_types";
    private static final String KEY_SYSTEM_NETWORK_SPEED_DISPLAY_MODE = "system_network_speed_display_mode";
    private static final String KEY_SYSTEM_NETWORK_SPEED_POSITION = "system_network_speed_position";
    private static final String KEY_SYSTEM_TIME_DISPLAY_MODE = "system_time_display_mode";
    private static final String KEY_SYSTEM_DURATION_DISPLAY_MODE = "system_duration_display_mode";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_VIDEO_PRIORITY_RULES = "video_priority_rules";
    private static final String PREFS_NAME = "emby_prefs";
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/dh/myembyapp/data/preferences/UserPreferences$AssSubtitleEnhancementGuard;", "", "mediaId", "", "subtitleLabel", "armedAtMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMediaId", "()Ljava/lang/String;", "getSubtitleLabel", "getArmedAtMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssSubtitleEnhancementGuard {
        public static final int $stable = 0;
        private final long armedAtMs;
        private final String mediaId;
        private final String subtitleLabel;

        public AssSubtitleEnhancementGuard(String str, String str2, long j) {
            this.mediaId = str;
            this.subtitleLabel = str2;
            this.armedAtMs = j;
        }

        public static /* synthetic */ AssSubtitleEnhancementGuard copy$default(AssSubtitleEnhancementGuard assSubtitleEnhancementGuard, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assSubtitleEnhancementGuard.mediaId;
            }
            if ((i & 2) != 0) {
                str2 = assSubtitleEnhancementGuard.subtitleLabel;
            }
            if ((i & 4) != 0) {
                j = assSubtitleEnhancementGuard.armedAtMs;
            }
            return assSubtitleEnhancementGuard.copy(str, str2, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        public final AssSubtitleEnhancementGuard copy(String mediaId, String subtitleLabel, long armedAtMs) {
            return new AssSubtitleEnhancementGuard(mediaId, subtitleLabel, armedAtMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssSubtitleEnhancementGuard)) {
                return false;
            }
            AssSubtitleEnhancementGuard assSubtitleEnhancementGuard = (AssSubtitleEnhancementGuard) other;
            return Intrinsics.areEqual(this.mediaId, assSubtitleEnhancementGuard.mediaId) && Intrinsics.areEqual(this.subtitleLabel, assSubtitleEnhancementGuard.subtitleLabel) && this.armedAtMs == assSubtitleEnhancementGuard.armedAtMs;
        }

        public int hashCode() {
            String str = this.mediaId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitleLabel;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.armedAtMs;
            return iHashCode2 + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return c61.i(this.armedAtMs, ")", kb0.z("AssSubtitleEnhancementGuard(mediaId=", this.mediaId, ", subtitleLabel=", this.subtitleLabel, ", armedAtMs="));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020:X\u0086T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/dh/myembyapp/data/preferences/UserPreferences$Companion;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_SERVER_URL", "KEY_USER_ID", "KEY_USERNAME", "KEY_ACCESS_TOKEN", "KEY_IS_LOGGED_IN", "KEY_ENABLE_AGGREGATE_SEARCH", "KEY_LAST_USED_AGGREGATE_HUB", "KEY_ENABLE_AGGREGATE_SEARCH_IN_SERVER_SEARCH", "KEY_PLAYBACK_SPEED", "KEY_AUDIO_DELAY_MS", "KEY_SYSTEM_TIME_DISPLAY_MODE", "KEY_SYSTEM_NETWORK_SPEED_DISPLAY_MODE", "KEY_SYSTEM_NETWORK_SPEED_POSITION", "KEY_SEEK_INTERVAL_SEC", "KEY_PLAYER_RESIZE_MODE", "KEY_PLAYER_DEFAULT_VIEW_MODE", "KEY_PLAYER_FRAME_RATE_MATCHING_MODE", "KEY_DISABLE_TOP_NAV_FOCUS_REFRESH", "KEY_ENABLE_TRANSPARENT_TOP_NAV_BUTTONS", "KEY_ENABLE_CLICKABLE_LIBRARY_SECTION_TITLE", "KEY_ENABLE_LIBRARY_ROW_MORE_BUTTON", "KEY_ENABLE_HOME_UNPLAYED_ONLY", "KEY_ENABLE_PLAYBACK_STARTUP_POSTER", "KEY_ENABLE_AGGREGATE_SEARCH_VERSION_TAGS", "KEY_ENABLE_DETAIL_AGGREGATE_VERSION_RAIL", "KEY_ENABLE_HOME_BACK_FOCUS_SERVER_BUTTON", "KEY_ENABLE_APP_UPDATE_CHECK_ON_STARTUP", "KEY_ADMIN_DEBUG_FEATURES_UNLOCKED", "KEY_ENABLE_SPECIAL_FEATURES", "KEY_APP_UPDATE_STARTUP_LAST_CHECK_TIME_MS", "KEY_APP_UPDATE_STARTUP_LAST_HAS_UPDATE", "KEY_APP_UPDATE_STARTUP_LAST_CHECKED_VERSION", "KEY_ENABLE_ASS_SUBTITLE_ENHANCEMENT", "KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_ACTIVE", "KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_MEDIA_ID", "KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_SUBTITLE_LABEL", "KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_TIME_MS", "KEY_QR_NETWORK_INTERFACE_NAME", "KEY_SERVER_ICON_LIBRARY_URL", "KEY_VIDEO_PRIORITY_RULES", "KEY_AUDIO_PRIORITY_SORT_TYPES", "KEY_AUDIO_PRIORITY_AAC", "KEY_AUDIO_PRIORITY_AC3", "KEY_AUDIO_PRIORITY_EAC3", "KEY_AUDIO_PRIORITY_DTS", "KEY_AUDIO_PRIORITY_TRUEHD", "KEY_AUDIO_PRIORITY_FLAC", "KEY_AUDIO_PREFERRED_LANGUAGE", "KEY_SUBTITLE_PRIORITY_SORT_TYPES", "KEY_SUBTITLE_LANGUAGE_PRIORITIES", "KEY_SUBTITLE_FORMAT_PRIORITIES", "AUDIO_DELAY_MIN_MS", "", "AUDIO_DELAY_MAX_MS", "AUDIO_DELAY_STEP_MS", "normalizeAudioDelayMs", "delayMs", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int normalizeAudioDelayMs(int delayMs) {
            return RangesKt.coerceIn(Math.round(delayMs / 100.0f) * 100, UserPreferences.AUDIO_DELAY_MIN_MS, 10000);
        }

        private Companion() {
        }
    }

    public UserPreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
    }

    public static /* synthetic */ AssSubtitleEnhancementGuard consumeRecentAssSubtitleEnhancementGuard$default(UserPreferences userPreferences, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1800000;
        }
        return userPreferences.consumeRecentAssSubtitleEnhancementGuard(j);
    }

    private final String encodeSubtitleFormatPriorities(Map<SubtitleFormatPriorityType, Integer> priorities) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<SubtitleFormatPriorityType, Integer> entry : priorities.entrySet()) {
            SubtitleFormatPriorityType key = entry.getKey();
            jSONObject.put(key.getStorageValue(), entry.getValue().intValue());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    private final String encodeSubtitleLanguagePriorities(Map<SubtitleLanguagePriorityType, Integer> priorities) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<SubtitleLanguagePriorityType, Integer> entry : priorities.entrySet()) {
            SubtitleLanguagePriorityType key = entry.getKey();
            jSONObject.put(key.getStorageValue(), entry.getValue().intValue());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static /* synthetic */ long getAppUpdateStartupLastCheckTimeMs$default(UserPreferences userPreferences, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return userPreferences.getAppUpdateStartupLastCheckTimeMs(str);
    }

    public static /* synthetic */ boolean getAppUpdateStartupLastHasUpdate$default(UserPreferences userPreferences, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return userPreferences.getAppUpdateStartupLastHasUpdate(str);
    }

    private final boolean isAppUpdateStartupCacheForVersion(String currentVersion) {
        return Intrinsics.areEqual(this.prefs.getString(KEY_APP_UPDATE_STARTUP_LAST_CHECKED_VERSION, null), currentVersion);
    }

    private final List<AudioPrioritySortType> parseAudioPrioritySortTypes(String value) {
        List listSplit$default;
        if (value == null || (listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return AudioVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            AudioPrioritySortType audioPrioritySortTypeFromStorageValue = AudioPrioritySortType.INSTANCE.fromStorageValue(StringsKt.trim((CharSequence) it.next()).toString());
            if (audioPrioritySortTypeFromStorageValue != null) {
                arrayList.add(audioPrioritySortTypeFromStorageValue);
            }
        }
        return arrayList;
    }

    private final Map<SubtitleFormatPriorityType, Integer> parseSubtitleFormatPriorities(String value) {
        Object objM8825constructorimpl;
        if (value == null || StringsKt.isBlank(value)) {
            return SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_FORMAT_PRIORITIES();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(value);
            EnumEntries<SubtitleFormatPriorityType> entries = SubtitleFormatPriorityType.getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10)), 16));
            for (SubtitleFormatPriorityType subtitleFormatPriorityType : entries) {
                SubtitleFormatPriorityType subtitleFormatPriorityType2 = subtitleFormatPriorityType;
                linkedHashMap.put(subtitleFormatPriorityType, Integer.valueOf(jSONObject.optInt(subtitleFormatPriorityType2.getStorageValue(), subtitleFormatPriorityType2.getDefaultPriority())));
            }
            objM8825constructorimpl = Result.m8825constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        Map<SubtitleFormatPriorityType, Integer> default_format_priorities = SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_FORMAT_PRIORITIES();
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = default_format_priorities;
        }
        return (Map) objM8825constructorimpl;
    }

    private final Map<SubtitleLanguagePriorityType, Integer> parseSubtitleLanguagePriorities(String value) {
        Object objM8825constructorimpl;
        if (value == null || StringsKt.isBlank(value)) {
            return SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_LANGUAGE_PRIORITIES();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(value);
            EnumEntries<SubtitleLanguagePriorityType> entries = SubtitleLanguagePriorityType.getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10)), 16));
            for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : entries) {
                SubtitleLanguagePriorityType subtitleLanguagePriorityType2 = subtitleLanguagePriorityType;
                linkedHashMap.put(subtitleLanguagePriorityType, Integer.valueOf(jSONObject.optInt(subtitleLanguagePriorityType2.getStorageValue(), subtitleLanguagePriorityType2.getDefaultPriority())));
            }
            objM8825constructorimpl = Result.m8825constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        Map<SubtitleLanguagePriorityType, Integer> default_language_priorities = SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_LANGUAGE_PRIORITIES();
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = default_language_priorities;
        }
        return (Map) objM8825constructorimpl;
    }

    private final List<SubtitlePrioritySortType> parseSubtitlePrioritySortTypes(String value) {
        List listSplit$default;
        if (value == null || (listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            SubtitlePrioritySortType subtitlePrioritySortTypeFromStorageValue = SubtitlePrioritySortType.INSTANCE.fromStorageValue(StringsKt.trim((CharSequence) it.next()).toString());
            if (subtitlePrioritySortTypeFromStorageValue != null) {
                arrayList.add(subtitlePrioritySortTypeFromStorageValue);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:6:0x000a, B:8:0x001d, B:54:0x00dd, B:11:0x0025, B:21:0x004f, B:24:0x0056, B:29:0x0060, B:31:0x0068, B:32:0x0074, B:34:0x007a, B:36:0x008a, B:37:0x009b, B:39:0x00a2, B:48:0x00cb, B:52:0x00d3, B:53:0x00d5, B:47:0x00c1, B:28:0x005d, B:20:0x0045, B:55:0x00e1, B:57:0x00eb, B:58:0x00f9, B:44:0x00b5, B:17:0x0039), top: B:73:0x000a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:6:0x000a, B:8:0x001d, B:54:0x00dd, B:11:0x0025, B:21:0x004f, B:24:0x0056, B:29:0x0060, B:31:0x0068, B:32:0x0074, B:34:0x007a, B:36:0x008a, B:37:0x009b, B:39:0x00a2, B:48:0x00cb, B:52:0x00d3, B:53:0x00d5, B:47:0x00c1, B:28:0x005d, B:20:0x0045, B:55:0x00e1, B:57:0x00eb, B:58:0x00f9, B:44:0x00b5, B:17:0x0039), top: B:73:0x000a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0074 A[SYNTHETIC] */
    private final List<VideoPriorityRule> parseVideoPriorityRules(String str) {
        Object objM8825constructorimpl;
        List listListOf;
        Object objM8825constructorimpl2;
        VideoPrioritySortType videoPrioritySortType;
        JSONObject jSONObjectOptJSONObject;
        Map mapBuild;
        String strOptString;
        Object objM8825constructorimpl3;
        Map mapCreateMapBuilder;
        if (str == null || StringsKt.isBlank(str)) {
            return CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONArray jSONArray = new JSONArray(str);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("sortType");
                    strOptString2.getClass();
                    VideoValueSortDirection videoValueSortDirection = null;
                    Object obj = null;
                    if (StringsKt.isBlank(strOptString2)) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM8825constructorimpl2 = Result.m8825constructorimpl(VideoPrioritySortType.valueOf(strOptString2));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8831isFailureimpl(objM8825constructorimpl2)) {
                            objM8825constructorimpl2 = null;
                        }
                        videoPrioritySortType = (VideoPrioritySortType) objM8825constructorimpl2;
                        if (videoPrioritySortType == null) {
                            videoPrioritySortType = VideoPrioritySortType.NONE;
                            VideoPrioritySortType videoPrioritySortType2 = videoPrioritySortType;
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("qualityPriorities");
                            if (jSONObjectOptJSONObject != null) {
                                mapCreateMapBuilder = MapsKt.createMapBuilder();
                                for (VideoQualityStandard videoQualityStandard : VideoQualityStandard.getEntries()) {
                                    if (jSONObjectOptJSONObject.has(videoQualityStandard.name())) {
                                        mapCreateMapBuilder.put(videoQualityStandard, Integer.valueOf(jSONObjectOptJSONObject.optInt(videoQualityStandard.name(), 1)));
                                    }
                                }
                                mapBuild = MapsKt.build(mapCreateMapBuilder);
                            } else {
                                mapBuild = null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString("valueSortDirection");
                            strOptString.getClass();
                            if (StringsKt.isBlank(strOptString)) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                try {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    objM8825constructorimpl3 = Result.m8825constructorimpl(VideoValueSortDirection.valueOf(strOptString));
                                } catch (Throwable th2) {
                                    Result.Companion companion5 = Result.INSTANCE;
                                    objM8825constructorimpl3 = Result.m8825constructorimpl(ResultKt.createFailure(th2));
                                }
                                if (!Result.m8831isFailureimpl(objM8825constructorimpl3)) {
                                    obj = objM8825constructorimpl3;
                                }
                                videoValueSortDirection = (VideoValueSortDirection) obj;
                            }
                            listCreateListBuilder.add(new VideoPriorityRule(videoPrioritySortType2, mapBuild, videoValueSortDirection));
                        } else {
                            VideoPrioritySortType videoPrioritySortType3 = videoPrioritySortType;
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("qualityPriorities");
                            if (jSONObjectOptJSONObject != null) {
                                mapCreateMapBuilder = MapsKt.createMapBuilder();
                                while (r7.hasNext()) {
                                    if (jSONObjectOptJSONObject.has(videoQualityStandard.name())) {
                                        mapCreateMapBuilder.put(videoQualityStandard, Integer.valueOf(jSONObjectOptJSONObject.optInt(videoQualityStandard.name(), 1)));
                                    }
                                }
                                mapBuild = MapsKt.build(mapCreateMapBuilder);
                            } else {
                                mapBuild = null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString("valueSortDirection");
                            strOptString.getClass();
                            if (StringsKt.isBlank(strOptString)) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                Result.Companion companion6 = Result.INSTANCE;
                                objM8825constructorimpl3 = Result.m8825constructorimpl(VideoValueSortDirection.valueOf(strOptString));
                                if (!Result.m8831isFailureimpl(objM8825constructorimpl3)) {
                                    obj = objM8825constructorimpl3;
                                }
                                videoValueSortDirection = (VideoValueSortDirection) obj;
                            }
                            listCreateListBuilder.add(new VideoPriorityRule(videoPrioritySortType3, mapBuild, videoValueSortDirection));
                        }
                        Result.Companion companion7 = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                        listListOf = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
                        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                            objM8825constructorimpl = listListOf;
                        }
                        return (List) objM8825constructorimpl;
                    }
                    videoPrioritySortType = VideoPrioritySortType.NONE;
                    VideoPrioritySortType videoPrioritySortType4 = videoPrioritySortType;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("qualityPriorities");
                    if (jSONObjectOptJSONObject != null) {
                        mapCreateMapBuilder = MapsKt.createMapBuilder();
                        while (r7.hasNext()) {
                            if (jSONObjectOptJSONObject.has(videoQualityStandard.name())) {
                                mapCreateMapBuilder.put(videoQualityStandard, Integer.valueOf(jSONObjectOptJSONObject.optInt(videoQualityStandard.name(), 1)));
                            }
                        }
                        mapBuild = MapsKt.build(mapCreateMapBuilder);
                    } else {
                        mapBuild = null;
                    }
                    strOptString = jSONObjectOptJSONObject2.optString("valueSortDirection");
                    strOptString.getClass();
                    if (StringsKt.isBlank(strOptString)) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        Result.Companion companion8 = Result.INSTANCE;
                        objM8825constructorimpl3 = Result.m8825constructorimpl(VideoValueSortDirection.valueOf(strOptString));
                        if (!Result.m8831isFailureimpl(objM8825constructorimpl3)) {
                            obj = objM8825constructorimpl3;
                        }
                        videoValueSortDirection = (VideoValueSortDirection) obj;
                    }
                    listCreateListBuilder.add(new VideoPriorityRule(videoPrioritySortType4, mapBuild, videoValueSortDirection));
                }
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            if (listBuild.isEmpty()) {
                listBuild = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
            }
            objM8825constructorimpl = Result.m8825constructorimpl(listBuild);
        } catch (Throwable th3) {
            Result.Companion companion9 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th3));
        }
        listListOf = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = listListOf;
        }
        return (List) objM8825constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence saveAudioVersionPrioritySettings$lambda$0$0(AudioPrioritySortType audioPrioritySortType) {
        audioPrioritySortType.getClass();
        return audioPrioritySortType.getStorageValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence saveSubtitleVersionPrioritySettings$lambda$0$0(SubtitlePrioritySortType subtitlePrioritySortType) {
        subtitlePrioritySortType.getClass();
        return subtitlePrioritySortType.getStorageValue();
    }

    private final String toJsonString(List<VideoPriorityRule> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (VideoPriorityRule videoPriorityRule : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sortType", videoPriorityRule.getSortType().name());
            Map<VideoQualityStandard, Integer> qualityPriorities = videoPriorityRule.getQualityPriorities();
            if (qualityPriorities != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<VideoQualityStandard, Integer> entry : qualityPriorities.entrySet()) {
                    VideoQualityStandard key = entry.getKey();
                    jSONObject2.put(key.name(), entry.getValue().intValue());
                }
                Unit unit = Unit.INSTANCE;
                jSONObject.put("qualityPriorities", jSONObject2);
            }
            VideoValueSortDirection valueSortDirection = videoPriorityRule.getValueSortDirection();
            if (valueSortDirection != null) {
                jSONObject.put("valueSortDirection", valueSortDirection.name());
            }
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    public final void armAssSubtitleEnhancementGuard(String mediaId, String subtitleLabel) {
        this.prefs.edit().putBoolean(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_ACTIVE, true).putString(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_MEDIA_ID, mediaId).putString(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_SUBTITLE_LABEL, subtitleLabel).putLong(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_TIME_MS, System.currentTimeMillis()).commit();
    }

    public final void clearAssSubtitleEnhancementGuard() {
        this.prefs.edit().remove(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_ACTIVE).remove(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_MEDIA_ID).remove(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_SUBTITLE_LABEL).remove(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_TIME_MS).commit();
    }

    public final void clearLoginInfo() {
        this.prefs.edit().clear().apply();
    }

    public final AssSubtitleEnhancementGuard consumeRecentAssSubtitleEnhancementGuard(long maxAgeMs) {
        boolean z = this.prefs.getBoolean(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_ACTIVE, false);
        long j = this.prefs.getLong(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_TIME_MS, 0L);
        AssSubtitleEnhancementGuard assSubtitleEnhancementGuard = (!z || j <= 0) ? null : new AssSubtitleEnhancementGuard(this.prefs.getString(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_MEDIA_ID, null), this.prefs.getString(KEY_ASS_SUBTITLE_ENHANCEMENT_GUARD_SUBTITLE_LABEL, null), j);
        if (assSubtitleEnhancementGuard != null) {
            clearAssSubtitleEnhancementGuard();
        }
        if (assSubtitleEnhancementGuard != null && System.currentTimeMillis() - assSubtitleEnhancementGuard.getArmedAtMs() <= maxAgeMs) {
            return assSubtitleEnhancementGuard;
        }
        return null;
    }

    public final String getAccessToken() {
        return this.prefs.getString(KEY_ACCESS_TOKEN, null);
    }

    public final boolean getAdminDebugFeaturesUnlocked() {
        return this.prefs.getBoolean(KEY_ADMIN_DEBUG_FEATURES_UNLOCKED, false);
    }

    public final long getAppUpdateStartupLastCheckTimeMs(String currentVersion) {
        if (currentVersion == null || isAppUpdateStartupCacheForVersion(currentVersion)) {
            return this.prefs.getLong(KEY_APP_UPDATE_STARTUP_LAST_CHECK_TIME_MS, 0L);
        }
        return 0L;
    }

    public final boolean getAppUpdateStartupLastHasUpdate(String currentVersion) {
        if (currentVersion == null || isAppUpdateStartupCacheForVersion(currentVersion)) {
            return this.prefs.getBoolean(KEY_APP_UPDATE_STARTUP_LAST_HAS_UPDATE, false);
        }
        return false;
    }

    public final int getAudioDelayMs() {
        return INSTANCE.normalizeAudioDelayMs(this.prefs.getInt(KEY_AUDIO_DELAY_MS, 0));
    }

    public final AudioVersionPrioritySettings getAudioVersionPrioritySettings() {
        return new AudioVersionPrioritySettings(parseAudioPrioritySortTypes(this.prefs.getString(KEY_AUDIO_PRIORITY_SORT_TYPES, null)), AudioLanguagePreference.INSTANCE.fromStorageValue(this.prefs.getString(KEY_AUDIO_PREFERRED_LANGUAGE, null)), this.prefs.getInt(KEY_AUDIO_PRIORITY_AAC, 1), this.prefs.getInt(KEY_AUDIO_PRIORITY_AC3, 1), this.prefs.getInt(KEY_AUDIO_PRIORITY_EAC3, 1), this.prefs.getInt(KEY_AUDIO_PRIORITY_DTS, 1), this.prefs.getInt(KEY_AUDIO_PRIORITY_TRUEHD, 1), this.prefs.getInt(KEY_AUDIO_PRIORITY_FLAC, 1)).normalized();
    }

    public final boolean getDisableTopNavFocusRefresh() {
        return this.prefs.getBoolean(KEY_DISABLE_TOP_NAV_FOCUS_REFRESH, true);
    }

    public final boolean getEnableAggregateSearch() {
        return this.prefs.getBoolean(KEY_ENABLE_AGGREGATE_SEARCH, false);
    }

    public final boolean getEnableAggregateSearchInServerSearch() {
        return this.prefs.getBoolean(KEY_ENABLE_AGGREGATE_SEARCH_IN_SERVER_SEARCH, false);
    }

    public final boolean getEnableAggregateSearchVersionTags() {
        return this.prefs.getBoolean(KEY_ENABLE_AGGREGATE_SEARCH_VERSION_TAGS, false);
    }

    public final boolean getEnableAppUpdateCheckOnStartup() {
        return this.prefs.getBoolean(KEY_ENABLE_APP_UPDATE_CHECK_ON_STARTUP, false);
    }

    public final boolean getEnableAssSubtitleEnhancement() {
        return this.prefs.getBoolean(KEY_ENABLE_ASS_SUBTITLE_ENHANCEMENT, true);
    }

    public final boolean getEnableClickableLibrarySectionTitle() {
        return this.prefs.getBoolean(KEY_ENABLE_CLICKABLE_LIBRARY_SECTION_TITLE, false);
    }

    public final boolean getEnableDetailAggregateVersionRail() {
        return this.prefs.getBoolean(KEY_ENABLE_DETAIL_AGGREGATE_VERSION_RAIL, false);
    }

    public final boolean getEnableHomeBackFocusServerButton() {
        return this.prefs.getBoolean(KEY_ENABLE_HOME_BACK_FOCUS_SERVER_BUTTON, false);
    }

    public final boolean getEnableHomeUnplayedOnly() {
        return this.prefs.getBoolean(KEY_ENABLE_HOME_UNPLAYED_ONLY, false);
    }

    public final boolean getEnableLibraryRowMoreButton() {
        return this.prefs.getBoolean(KEY_ENABLE_LIBRARY_ROW_MORE_BUTTON, false);
    }

    public final boolean getEnablePlaybackStartupPoster() {
        return this.prefs.getBoolean(KEY_ENABLE_PLAYBACK_STARTUP_POSTER, true);
    }

    public final boolean getEnableSpecialFeatures() {
        return this.prefs.getBoolean(KEY_ENABLE_SPECIAL_FEATURES, false);
    }

    public final boolean getEnableTransparentTopNavButtons() {
        return this.prefs.getBoolean(KEY_ENABLE_TRANSPARENT_TOP_NAV_BUTTONS, true);
    }

    public final boolean getLastUsedAggregateHub() {
        return this.prefs.getBoolean(KEY_LAST_USED_AGGREGATE_HUB, false);
    }

    public final float getPlaybackSpeed() {
        return RangesKt.coerceIn(this.prefs.getFloat(KEY_PLAYBACK_SPEED, 1.0f), 0.5f, 3.0f);
    }

    public final PlayerDefaultViewMode getPlayerDefaultViewMode() {
        return PlayerDefaultViewMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_PLAYER_DEFAULT_VIEW_MODE, PlayerDefaultViewMode.SURFACE.getStorageValue()));
    }

    public final PlayerFrameRateMatchingMode getPlayerFrameRateMatchingMode() {
        return PlayerFrameRateMatchingMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_PLAYER_FRAME_RATE_MATCHING_MODE, PlayerFrameRateMatchingMode.SEAMLESS_ONLY.getStorageValue()));
    }

    public final PlayerResizeMode getPlayerResizeMode() {
        return PlayerResizeMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_PLAYER_RESIZE_MODE, PlayerResizeMode.DEFAULT.getStorageValue()));
    }

    public final String getQrNetworkInterfaceName() {
        return this.prefs.getString(KEY_QR_NETWORK_INTERFACE_NAME, null);
    }

    public final int getSeekIntervalSec() {
        return (RangesKt.coerceIn(this.prefs.getInt(KEY_SEEK_INTERVAL_SEC, 10), 5, 60) / 5) * 5;
    }

    public final String getServerIconLibraryUrl() {
        String string;
        String string2 = this.prefs.getString(KEY_SERVER_ICON_LIBRARY_URL, null);
        if (string2 == null || (string = StringsKt.trim((CharSequence) string2).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public final String getServerUrl() {
        return this.prefs.getString(KEY_SERVER_URL, null);
    }

    public final SubtitleVersionPrioritySettings getSubtitleVersionPrioritySettings() {
        return new SubtitleVersionPrioritySettings(parseSubtitlePrioritySortTypes(this.prefs.getString(KEY_SUBTITLE_PRIORITY_SORT_TYPES, null)), parseSubtitleLanguagePriorities(this.prefs.getString(KEY_SUBTITLE_LANGUAGE_PRIORITIES, null)), parseSubtitleFormatPriorities(this.prefs.getString(KEY_SUBTITLE_FORMAT_PRIORITIES, null))).normalized();
    }

    public final SystemNetworkSpeedDisplayMode getSystemNetworkSpeedDisplayMode() {
        SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayModeFromStorageValue = SystemNetworkSpeedDisplayMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_SYSTEM_NETWORK_SPEED_DISPLAY_MODE, null));
        return systemNetworkSpeedDisplayModeFromStorageValue == null ? SystemNetworkSpeedDisplayMode.MENU_ONLY : systemNetworkSpeedDisplayModeFromStorageValue;
    }

    public final SystemNetworkSpeedPosition getSystemNetworkSpeedPosition() {
        SystemNetworkSpeedPosition systemNetworkSpeedPositionFromStorageValue = SystemNetworkSpeedPosition.INSTANCE.fromStorageValue(this.prefs.getString(KEY_SYSTEM_NETWORK_SPEED_POSITION, null));
        return systemNetworkSpeedPositionFromStorageValue == null ? SystemNetworkSpeedPosition.TOP_RIGHT : systemNetworkSpeedPositionFromStorageValue;
    }

    public final SystemTimeDisplayMode getSystemTimeDisplayMode() {
        SystemTimeDisplayMode systemTimeDisplayModeFromStorageValue = SystemTimeDisplayMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_SYSTEM_TIME_DISPLAY_MODE, null));
        return systemTimeDisplayModeFromStorageValue == null ? SystemTimeDisplayMode.MENU_ONLY : systemTimeDisplayModeFromStorageValue;
    }

    public final SystemDurationDisplayMode getSystemDurationDisplayMode() {
        SystemDurationDisplayMode systemDurationDisplayModeFromStorageValue = SystemDurationDisplayMode.INSTANCE.fromStorageValue(this.prefs.getString(KEY_SYSTEM_DURATION_DISPLAY_MODE, null));
        return systemDurationDisplayModeFromStorageValue == null ? SystemDurationDisplayMode.MENU_ONLY : systemDurationDisplayModeFromStorageValue;
    }

    public final String getUserId() {
        return this.prefs.getString(KEY_USER_ID, null);
    }

    public final String getUsername() {
        return this.prefs.getString("username", null);
    }

    public final VideoVersionPrioritySettings getVideoVersionPrioritySettings() {
        return new VideoVersionPrioritySettings(parseVideoPriorityRules(this.prefs.getString(KEY_VIDEO_PRIORITY_RULES, null))).normalized();
    }

    public final boolean isLoggedIn() {
        return this.prefs.getBoolean(KEY_IS_LOGGED_IN, false);
    }

    public final void saveAdminDebugFeaturesUnlocked(boolean unlocked) {
        i9.p(this.prefs, KEY_ADMIN_DEBUG_FEATURES_UNLOCKED, unlocked);
    }

    public final void saveAppUpdateStartupCheckCache(long checkedAtMs, boolean hasUpdate, String currentVersion) {
        currentVersion.getClass();
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putLong(KEY_APP_UPDATE_STARTUP_LAST_CHECK_TIME_MS, checkedAtMs);
        editorEdit.putBoolean(KEY_APP_UPDATE_STARTUP_LAST_HAS_UPDATE, hasUpdate);
        editorEdit.putString(KEY_APP_UPDATE_STARTUP_LAST_CHECKED_VERSION, currentVersion);
        editorEdit.apply();
    }

    public final void saveAudioDelayMs(int delayMs) {
        this.prefs.edit().putInt(KEY_AUDIO_DELAY_MS, INSTANCE.normalizeAudioDelayMs(delayMs)).apply();
    }

    public final void saveAudioVersionPrioritySettings(AudioVersionPrioritySettings settings) {
        settings.getClass();
        AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = settings.normalized();
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_AUDIO_PRIORITY_SORT_TYPES, CollectionsKt___CollectionsKt.joinToString$default(audioVersionPrioritySettingsNormalized.getSortTypes(), ",", null, null, 0, null, new y82(7), 30, null));
        editorEdit.putString(KEY_AUDIO_PREFERRED_LANGUAGE, audioVersionPrioritySettingsNormalized.getPreferredLanguage().getStorageValue());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_AAC, audioVersionPrioritySettingsNormalized.getAacPriority());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_AC3, audioVersionPrioritySettingsNormalized.getAc3Priority());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_EAC3, audioVersionPrioritySettingsNormalized.getEac3Priority());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_DTS, audioVersionPrioritySettingsNormalized.getDtsPriority());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_TRUEHD, audioVersionPrioritySettingsNormalized.getTruehdPriority());
        editorEdit.putInt(KEY_AUDIO_PRIORITY_FLAC, audioVersionPrioritySettingsNormalized.getFlacPriority());
        editorEdit.apply();
    }

    public final void saveDisableTopNavFocusRefresh(boolean disable) {
        i9.p(this.prefs, KEY_DISABLE_TOP_NAV_FOCUS_REFRESH, disable);
    }

    public final void saveEnableAggregateSearch(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_AGGREGATE_SEARCH, enable);
    }

    public final void saveEnableAggregateSearchInServerSearch(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_AGGREGATE_SEARCH_IN_SERVER_SEARCH, enable);
    }

    public final void saveEnableAggregateSearchVersionTags(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_AGGREGATE_SEARCH_VERSION_TAGS, enable);
    }

    public final void saveEnableAppUpdateCheckOnStartup(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_APP_UPDATE_CHECK_ON_STARTUP, enable);
    }

    public final void saveEnableAssSubtitleEnhancement(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_ASS_SUBTITLE_ENHANCEMENT, enable);
    }

    public final void saveEnableClickableLibrarySectionTitle(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_CLICKABLE_LIBRARY_SECTION_TITLE, enable);
    }

    public final void saveEnableDetailAggregateVersionRail(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_DETAIL_AGGREGATE_VERSION_RAIL, enable);
    }

    public final void saveEnableHomeBackFocusServerButton(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_HOME_BACK_FOCUS_SERVER_BUTTON, enable);
    }

    public final void saveEnableHomeUnplayedOnly(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_HOME_UNPLAYED_ONLY, enable);
    }

    public final void saveEnableLibraryRowMoreButton(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_LIBRARY_ROW_MORE_BUTTON, enable);
    }

    public final void saveEnablePlaybackStartupPoster(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_PLAYBACK_STARTUP_POSTER, enable);
    }

    public final void saveEnableSpecialFeatures(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_SPECIAL_FEATURES, enable);
    }

    public final void saveEnableTransparentTopNavButtons(boolean enable) {
        i9.p(this.prefs, KEY_ENABLE_TRANSPARENT_TOP_NAV_BUTTONS, enable);
    }

    public final void saveLastUsedAggregateHub(boolean enable) {
        i9.p(this.prefs, KEY_LAST_USED_AGGREGATE_HUB, enable);
    }

    public final void saveLoginInfo(String userId, String username, String accessToken) {
        s01.D(userId, username, accessToken);
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_USER_ID, userId);
        editorEdit.putString("username", username);
        editorEdit.putString(KEY_ACCESS_TOKEN, accessToken);
        editorEdit.putBoolean(KEY_IS_LOGGED_IN, true);
        editorEdit.apply();
    }

    public final void savePlaybackSpeed(float speed) {
        this.prefs.edit().putFloat(KEY_PLAYBACK_SPEED, RangesKt.coerceIn(speed, 0.5f, 3.0f)).apply();
    }

    public final void savePlayerDefaultViewMode(PlayerDefaultViewMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_PLAYER_DEFAULT_VIEW_MODE, mode.getStorageValue()).apply();
    }

    public final void savePlayerFrameRateMatchingMode(PlayerFrameRateMatchingMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_PLAYER_FRAME_RATE_MATCHING_MODE, mode.getStorageValue()).apply();
    }

    public final void savePlayerResizeMode(PlayerResizeMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_PLAYER_RESIZE_MODE, mode.getStorageValue()).apply();
    }

    public final void saveQrNetworkInterfaceName(String interfaceName) {
        this.prefs.edit().putString(KEY_QR_NETWORK_INTERFACE_NAME, interfaceName).apply();
    }

    public final void saveSeekIntervalSec(int seconds) {
        this.prefs.edit().putInt(KEY_SEEK_INTERVAL_SEC, (RangesKt.coerceIn(seconds, 5, 60) / 5) * 5).apply();
    }

    public final void saveServerIconLibraryUrl(String url) {
        String str = null;
        String string = url != null ? StringsKt.trim((CharSequence) url).toString() : null;
        if (string != null && string.length() != 0) {
            str = string;
        }
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        if (str == null) {
            editorEdit.remove(KEY_SERVER_ICON_LIBRARY_URL);
        } else {
            editorEdit.putString(KEY_SERVER_ICON_LIBRARY_URL, str);
        }
        editorEdit.apply();
    }

    public final void saveServerUrl(String url) {
        url.getClass();
        this.prefs.edit().putString(KEY_SERVER_URL, url).apply();
    }

    public final void saveSubtitleVersionPrioritySettings(SubtitleVersionPrioritySettings settings) {
        settings.getClass();
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = settings.normalized();
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_SUBTITLE_PRIORITY_SORT_TYPES, CollectionsKt___CollectionsKt.joinToString$default(subtitleVersionPrioritySettingsNormalized.getSortTypes(), ",", null, null, 0, null, new y82(8), 30, null));
        editorEdit.putString(KEY_SUBTITLE_LANGUAGE_PRIORITIES, encodeSubtitleLanguagePriorities(subtitleVersionPrioritySettingsNormalized.getLanguagePriorities()));
        editorEdit.putString(KEY_SUBTITLE_FORMAT_PRIORITIES, encodeSubtitleFormatPriorities(subtitleVersionPrioritySettingsNormalized.getFormatPriorities()));
        editorEdit.apply();
    }

    public final void saveSystemNetworkSpeedDisplayMode(SystemNetworkSpeedDisplayMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_SYSTEM_NETWORK_SPEED_DISPLAY_MODE, mode.getStorageValue()).apply();
    }

    public final void saveSystemNetworkSpeedPosition(SystemNetworkSpeedPosition position) {
        position.getClass();
        this.prefs.edit().putString(KEY_SYSTEM_NETWORK_SPEED_POSITION, position.getStorageValue()).apply();
    }

    public final void saveSystemTimeDisplayMode(SystemTimeDisplayMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_SYSTEM_TIME_DISPLAY_MODE, mode.getStorageValue()).apply();
    }

    public final void saveSystemDurationDisplayMode(SystemDurationDisplayMode mode) {
        mode.getClass();
        this.prefs.edit().putString(KEY_SYSTEM_DURATION_DISPLAY_MODE, mode.getStorageValue()).apply();
    }

    public final void saveVideoVersionPrioritySettings(VideoVersionPrioritySettings settings) {
        settings.getClass();
        VideoVersionPrioritySettings videoVersionPrioritySettingsNormalized = settings.normalized();
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_VIDEO_PRIORITY_RULES, toJsonString(videoVersionPrioritySettingsNormalized.getRules()));
        editorEdit.apply();
    }
}
