package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/CodecProfile;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "codec", "applyConditions", "", "Lcom/dh/myembyapp/data/model/ProfileCondition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getCodec", "getApplyConditions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CodecProfile {
    public static final int $stable = 8;

    @SerializedName("ApplyConditions")
    private final List<ProfileCondition> applyConditions;

    @SerializedName("Codec")
    private final String codec;

    @SerializedName("Type")
    private final String type;

    public CodecProfile(String str, String str2, List<ProfileCondition> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.type = str;
        this.codec = str2;
        this.applyConditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodecProfile copy$default(CodecProfile codecProfile, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codecProfile.type;
        }
        if ((i & 2) != 0) {
            str2 = codecProfile.codec;
        }
        if ((i & 4) != 0) {
            list = codecProfile.applyConditions;
        }
        return codecProfile.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final List<ProfileCondition> component3() {
        return this.applyConditions;
    }

    public final CodecProfile copy(String type, String codec, List<ProfileCondition> applyConditions) {
        type.getClass();
        codec.getClass();
        applyConditions.getClass();
        return new CodecProfile(type, codec, applyConditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodecProfile)) {
            return false;
        }
        CodecProfile codecProfile = (CodecProfile) other;
        return Intrinsics.areEqual(this.type, codecProfile.type) && Intrinsics.areEqual(this.codec, codecProfile.codec) && Intrinsics.areEqual(this.applyConditions, codecProfile.applyConditions);
    }

    public final List<ProfileCondition> getApplyConditions() {
        return this.applyConditions;
    }



    public int hashCode() {
        return this.applyConditions.hashCode() + i02.i(this.type.hashCode() * 31, 31, this.codec);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.codec;
        List<ProfileCondition> list = this.applyConditions;
        StringBuilder sbZ = kb0.z("CodecProfile(type=", str, ", codec=", str2, ", applyConditions=");
        sbZ.append(list);
        sbZ.append(")");
        return sbZ.toString();
    }
}
