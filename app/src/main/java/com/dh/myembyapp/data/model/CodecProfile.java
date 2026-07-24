package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class CodecProfile {
    

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
