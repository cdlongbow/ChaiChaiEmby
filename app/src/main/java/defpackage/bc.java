package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lbc;", "", "Lcom/dh/myembyapp/data/model/AppThemePreset;", "preset", "Lcom/dh/myembyapp/data/model/AppThemePreset;", "g", "()Lcom/dh/myembyapp/data/model/AppThemePreset;", "Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle;", "lightBackgroundStyle", "Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle;", "f", "()Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle;", "Lcom/dh/myembyapp/data/model/DarkThemeStyle;", "darkThemeStyle", "Lcom/dh/myembyapp/data/model/DarkThemeStyle;", "d", "()Lcom/dh/myembyapp/data/model/DarkThemeStyle;", "Lcom/dh/myembyapp/data/model/DarkThemeGlowPosition;", "darkThemeGlowPosition", "Lcom/dh/myembyapp/data/model/DarkThemeGlowPosition;", "c", "()Lcom/dh/myembyapp/data/model/DarkThemeGlowPosition;", "", "accentFollowsTheme", "Z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Z", "detachedFocusBorderEnabled", "e", "", "cardSizeLevel", "I", "b", "()I", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class bc {

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
