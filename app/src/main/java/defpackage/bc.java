package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public final  class bc {

    @SerializedName("accentFollowsTheme")
    private final boolean accentFollowsTheme;

    @SerializedName("cardSizeLevel")
    private final int cardSizeLevel;

    @SerializedName("darkThemeGlowPosition")
    private final DarkThemeGlowPosition darkThemeGlowPosition;

    @SerializedName("darkThemeStyle")
    private final DarkThemeStyle darkThemeStyle;

    @SerializedName("detachedFocusBorderEnabled")
    private final boolean detachedFocusBorderEnabled;

    @SerializedName("lightBackgroundStyle")
    private final LightThemeBackgroundStyle lightBackgroundStyle;

    @SerializedName("preset")
    private final AppThemePreset preset;

    public bc(AppThemePreset appThemePreset, LightThemeBackgroundStyle lightThemeBackgroundStyle, DarkThemeStyle darkThemeStyle, DarkThemeGlowPosition darkThemeGlowPosition, boolean z, boolean z2, int i) {
        appThemePreset.getClass();
        lightThemeBackgroundStyle.getClass();
        darkThemeStyle.getClass();
        darkThemeGlowPosition.getClass();
        this.preset = appThemePreset;
        this.lightBackgroundStyle = lightThemeBackgroundStyle;
        this.darkThemeStyle = darkThemeStyle;
        this.darkThemeGlowPosition = darkThemeGlowPosition;
        this.accentFollowsTheme = z;
        this.detachedFocusBorderEnabled = z2;
        this.cardSizeLevel = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    /* JADX INFO: renamed from: d, reason: from getter */

    /* JADX INFO: renamed from: e, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return this.preset == bcVar.preset && this.lightBackgroundStyle == bcVar.lightBackgroundStyle && this.darkThemeStyle == bcVar.darkThemeStyle && this.darkThemeGlowPosition == bcVar.darkThemeGlowPosition && this.accentFollowsTheme == bcVar.accentFollowsTheme && this.detachedFocusBorderEnabled == bcVar.detachedFocusBorderEnabled && this.cardSizeLevel == bcVar.cardSizeLevel;
    }

    /* JADX INFO: renamed from: f, reason: from getter */

    /* JADX INFO: renamed from: g, reason: from getter */

    public final int hashCode() {
        return ((((((this.darkThemeGlowPosition.hashCode() + ((this.darkThemeStyle.hashCode() + ((this.lightBackgroundStyle.hashCode() + (this.preset.hashCode() * 31)) * 31)) * 31)) * 31) + (this.accentFollowsTheme ? 1231 : 1237)) * 31) + (this.detachedFocusBorderEnabled ? 1231 : 1237)) * 31) + this.cardSizeLevel;
    }

    public final String toString() {
        AppThemePreset appThemePreset = this.preset;
        LightThemeBackgroundStyle lightThemeBackgroundStyle = this.lightBackgroundStyle;
        DarkThemeStyle darkThemeStyle = this.darkThemeStyle;
        DarkThemeGlowPosition darkThemeGlowPosition = this.darkThemeGlowPosition;
        boolean z = this.accentFollowsTheme;
        boolean z2 = this.detachedFocusBorderEnabled;
        int i = this.cardSizeLevel;
        StringBuilder sb = new StringBuilder("AppThemeConfig(preset=");
        sb.append(appThemePreset);
        sb.append(", lightBackgroundStyle=");
        sb.append(lightThemeBackgroundStyle);
        sb.append(", darkThemeStyle=");
        sb.append(darkThemeStyle);
        sb.append(", darkThemeGlowPosition=");
        sb.append(darkThemeGlowPosition);
        sb.append(", accentFollowsTheme=");
        i9.r(sb, z, ", detachedFocusBorderEnabled=", z2, ", cardSizeLevel=");
        return ll0.f(sb, i, ")");
    }

    public bc() {
        this(0);
    }

    public /* synthetic */ bc(int i) {
        this(AppThemePreset.DARK, LightThemeBackgroundStyle.PLAIN_WHITE, DarkThemeStyle.INSTANCE.getDEFAULT(), DarkThemeGlowPosition.INSTANCE.getDEFAULT(), true, true, 5);
    }
}
