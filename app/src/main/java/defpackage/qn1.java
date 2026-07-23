package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.UInt;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qn1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ii0 a(Context context, String str, String str2, List list, boolean z, Integer num, Map map) {
        Uri uri;
        String path;
        String str3;
        Object path2;
        Uri uri2;
        Uri uriJ;
        Object obj;
        Context context2 = context;
        str.getClass();
        list.getClass();
        map.getClass();
        String str4 = str2 == null ? str : str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            MediaStream mediaStream = (MediaStream) obj2;
            if (in1.s(mediaStream, z, num)) {
                obj = obj2;
            } else if (z) {
                int index = mediaStream.getIndex();
                if (num != null && num.intValue() == index && in1.g(mediaStream)) {
                    obj = obj2;
                    if (in1.j(context2, RetrofitClient.INSTANCE.getSubtitleUrl(str, str4, mediaStream.getIndex(), in1.q(mediaStream), 0L), in1.q(mediaStream)) != null) {
                    }
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            MediaStream mediaStream2 = (MediaStream) arrayList.get(i);
            String strN = in1.n(mediaStream2.getCodec());
            String str5 = (strN == null && (strN = mediaStream2.getCodec()) == null) ? "srt" : strN;
            int i3 = size;
            String str6 = "srt";
            String subtitleUrl = RetrofitClient.INSTANCE.getSubtitleUrl(str, str4, mediaStream2.getIndex(), str5, 0L);
            Object objBuild = null;
            if (!z || mediaStream2.isExternal()) {
                uri = 0;
            } else {
                uriJ = in1.j(context2, subtitleUrl, str5);
            }
            if (!z || mediaStream2.isExternal() || uri != 0) {
                uri = uriJ;
                uri = uriJ;
                String strF = in1.f(mediaStream2);
                linkedHashSet.add(strF);
                if (uri == 0 || (path = uri.getPath()) == null) {
                    path = subtitleUrl;
                }
                linkedHashMap.put(strF, path);
                linkedHashMap2.put(strF, str5);
                Uri uri3 = (Uri) map.get(subtitleUrl);
                if (uri3 == null) {
                    if (uri != 0 && (path2 = uri.getPath()) != null) {
                        uri2 = (Uri) map.get(path2);
                    }
                    if (objBuild != null) {
                        objBuild = uri2;
                        uri = objBuild;
                    } else if (uri == 0) {
                        uri = Uri.parse(subtitleUrl);
                    }
                } else {
                    uri = uri3;
                }
                MediaItem.SubtitleConfiguration.Builder builder = new MediaItem.SubtitleConfiguration.Builder(uri);
                MediaItem.SubtitleConfiguration.Builder id = builder.setId("external_" + in1.r(str2 == null ? str : str2) + "_" + mediaStream2.getIndex());
                String lowerCase = str5.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -891530535:
                        str6 = "subrip";
                        lowerCase.equals(str6);
                        str3 = MimeTypes.APPLICATION_SUBRIP;
                        break;
                    case -791786078:
                        if (lowerCase.equals("webvtt")) {
                            str3 = MimeTypes.TEXT_VTT;
                        } else {
                            str3 = MimeTypes.APPLICATION_SUBRIP;
                        }
                        break;
                    case 96897:
                        if (lowerCase.equals("ass")) {
                            str3 = MimeTypes.TEXT_SSA;
                        } else {
                            str3 = MimeTypes.APPLICATION_SUBRIP;
                        }
                        break;
                    case 114165:
                        lowerCase.equals(str6);
                        str3 = MimeTypes.APPLICATION_SUBRIP;
                        break;
                    case 114177:
                        if (lowerCase.equals("ssa")) {
                            str3 = MimeTypes.TEXT_SSA;
                        } else {
                            str3 = MimeTypes.APPLICATION_SUBRIP;
                        }
                        break;
                    case 117110:
                        if (lowerCase.equals("vtt")) {
                            str3 = MimeTypes.TEXT_VTT;
                        } else {
                            str3 = MimeTypes.APPLICATION_SUBRIP;
                        }
                        break;
                    default:
                        str3 = MimeTypes.APPLICATION_SUBRIP;
                        break;
                }
                MediaItem.SubtitleConfiguration.Builder mimeType = id.setMimeType(str3);
                String language = mediaStream2.getLanguage();
                if (language == null) {
                    language = C.LANGUAGE_UNDETERMINED;
                }
                objBuild = mimeType.setLanguage(language).setLabel(strF).setSelectionFlags(mediaStream2.isDefault() ? 1 : 0).build();
            }
            if (objBuild != null) {
                arrayList2.add(objBuild);
            }
            context2 = context;
            size = i3;
            i = i2;
        }
        return new ii0(arrayList2, linkedHashSet, linkedHashMap, linkedHashMap2);
    }

    public static final ArrayList b(List list, Map map) {
        MediaItem.SubtitleConfiguration subtitleConfigurationBuild;
        list.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ta1 ta1Var = (ta1) it.next();
            String str = ta1Var.c;
            String str2 = ta1Var.b;
            String str3 = ta1Var.d;
            File file = new File(str);
            if (file.exists()) {
                Uri uriFromFile = (Uri) map.get(ta1Var.c);
                if (uriFromFile == null) {
                    uriFromFile = Uri.fromFile(file);
                }
                MediaItem.SubtitleConfiguration.Builder builder = new MediaItem.SubtitleConfiguration.Builder(uriFromFile);
                String strR = in1.r(ta1Var.a);
                String strR2 = in1.r(str3);
                String strM10141toStringV7xB4Y4 = UStringsKt.m10141toStringV7xB4Y4(UInt.m8920constructorimpl(str2.hashCode()), 16);
                StringBuilder sbZ = kb0.z("online_", strR, "_", strR2, "_");
                sbZ.append(strM10141toStringV7xB4Y4);
                subtitleConfigurationBuild = builder.setId(sbZ.toString()).setMimeType(str3).setLanguage(ta1Var.f).setLabel(str2).build();
            } else {
                subtitleConfigurationBuild = null;
            }
            if (subtitleConfigurationBuild != null) {
                arrayList.add(subtitleConfigurationBuild);
            }
        }
        return arrayList;
    }
}
