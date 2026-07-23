package com.dh.myembyapp.data.api;

import com.dh.myembyapp.data.model.AuthenticationResult;
import com.dh.myembyapp.data.model.ItemCounts;
import com.dh.myembyapp.data.model.LibraryQueryResult;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PlaybackInfoRequest;
import com.dh.myembyapp.data.model.QueryResult;
import com.google.gson.JsonObject;
import defpackage.lm;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH§@¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u000e\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0017JD\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u001eJZ\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010#\u001a\u00020\u001c2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010%\u001a\u00020\nH§@¢\u0006\u0002\u0010&JP\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u001d\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010%\u001a\u00020\nH§@¢\u0006\u0002\u0010(Jn\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u001d\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010*\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010-\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u0010.JZ\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010-\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00100J\u008c\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u001d\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u00103J2\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00106JP\u00107\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0003\u0010#\u001a\u00020\u001c2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u00108\u001a\u00020\"H§@¢\u0006\u0002\u00109Jd\u0010:\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010;\u001a\u00020\n2\b\b\u0003\u0010*\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010<J<\u0010=\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010>\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"H§@¢\u0006\u0002\u0010?J2\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00106JF\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00032\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010C\u001a\u00020\"2\b\b\u0003\u0010D\u001a\u00020\"2\b\b\u0001\u0010E\u001a\u00020FH§@¢\u0006\u0002\u0010GJ2\u0010H\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010I\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00106JR\u0010J\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010I\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010K\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010,\u001a\u00020\nH§@¢\u0006\u0002\u0010LJd\u0010M\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010N\u001a\u00020\n2\b\b\u0001\u0010*\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010O\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010PJ2\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010I\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00106JZ\u0010R\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010I\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010K\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\nH§@¢\u0006\u0002\u0010SJz\u0010T\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010-\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010*\u001a\u00020\n2\b\b\u0003\u0010U\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u0010VJn\u0010W\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010-\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010*\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010XJT\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010Z\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u0010[Jf\u0010\\\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010]\u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\b\b\u0003\u0010*\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u0010^J2\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010`\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u00106J\u001e\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010E\u001a\u00020bH§@¢\u0006\u0002\u0010cJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010E\u001a\u00020bH§@¢\u0006\u0002\u0010cJ\u001e\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010E\u001a\u00020bH§@¢\u0006\u0002\u0010cJ2\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010g\u001a\u00020hH§@¢\u0006\u0002\u0010iJ2\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010g\u001a\u00020hH§@¢\u0006\u0002\u0010iJ2\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010l\u001a\u00020mH§@¢\u0006\u0002\u0010nJ(\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010J(\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010J2\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0003\u0010r\u001a\u00020\"H§@¢\u0006\u0002\u0010sJ(\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010J(\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010¨\u0006vÀ\u0006\u0003"}, d2 = {"Lcom/dh/myembyapp/data/api/EmbyApiService;", "", "getItemCounts", "Lretrofit2/Response;", "Lcom/dh/myembyapp/data/model/ItemCounts;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authenticateUser", "Lcom/dh/myembyapp/data/model/AuthenticationResult;", "loginRequest", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLibraries", "Lcom/dh/myembyapp/data/model/LibraryQueryResult;", "userId", "fields", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserConfiguration", "", "configuration", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestMedia", "", "Lcom/dh/myembyapp/data/model/MediaItem;", "limit", "", "parentId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResumeItemsV2", "Lcom/dh/myembyapp/data/model/QueryResult;", "recursive", "", "imageTypeLimit", "enableImageTypes", "mediaTypes", "(Ljava/lang/String;IZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResumeItemsForSeries", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastPlayedEpisodeForSeries", "includeItemTypes", "sortBy", "sortOrder", "filters", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResumeItems", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItems", "startIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemDetails", "itemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilarItems", "enableTotalRecordCount", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContainingCollections", "listItemIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemsByIds", "ids", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemChapters", "getPlaybackInfo", "Lcom/dh/myembyapp/data/api/PlaybackInfoResponse;", "autoOpenLiveStream", "isPlayback", "request", "Lcom/dh/myembyapp/data/model/PlaybackInfoRequest;", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/dh/myembyapp/data/model/PlaybackInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeasons", "seriesId", "getEpisodes", "seasonId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findItemsByProviderId", "anyProviderIdEquals", "groupProgramsBySeries", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeasonsForCrossServerMatch", "getEpisodesForCrossServerMatch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteItems", "collapseBoxSetItems", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentlyPlayedItems", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchItems", "searchTerm", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemsByPerson", "personIds", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPersonDetails", "personId", "reportPlaybackProgress", "Lcom/dh/myembyapp/data/api/PlaybackProgressInfo;", "(Lcom/dh/myembyapp/data/api/PlaybackProgressInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportPlaybackStart", "reportPlaybackStopped", "updatePlaybackProgress", "positionTicks", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopPlayingItem", "updateUserData", "userDataRequest", "Lcom/dh/myembyapp/data/api/UserDataRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/dh/myembyapp/data/api/UserDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markFavorite", "unmarkFavorite", "hideFromResume", "hide", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlayedItem", "markPlayedItem", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface EmbyApiService {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getItemChapters$default(EmbyApiService embyApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: getItemChapters");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = "Chapters";
            }
            return embyApiService.getItemChapters(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object getPersonDetails$default(EmbyApiService embyApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: getPersonDetails");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = "Overview,PremiereDate";
            }
            return embyApiService.getPersonDetails(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object getRecentlyPlayedItems$default(EmbyApiService embyApiService, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: getRecentlyPlayedItems");
                return null;
            }
            if ((i2 & 2) != 0) {
                str2 = "IsPlayed";
            }
            return embyApiService.getRecentlyPlayedItems(str, str2, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? "DatePlayed" : str3, (i2 & 16) != 0 ? "Descending" : str4, (i2 & 32) != 0 ? "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData,SeriesName,ParentIndexNumber,IndexNumber,SeriesId" : str5, (i2 & 64) != 0 ? "Movie,Episode,Video" : str6, (i2 & 128) != 0 ? "Primary,Backdrop,Thumb" : str7, (i2 & 256) != 0 ? 20 : i, continuation);
        }

        public static /* synthetic */ Object getSeasons$default(EmbyApiService embyApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: getSeasons");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = "PrimaryImageAspectRatio";
            }
            return embyApiService.getSeasons(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object getSeasonsForCrossServerMatch$default(EmbyApiService embyApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: getSeasonsForCrossServerMatch");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = "BasicSyncInfo,CommunityRating,ProductionYear,EndDate,Container,IndexNumber";
            }
            return embyApiService.getSeasonsForCrossServerMatch(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object hideFromResume$default(EmbyApiService embyApiService, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: hideFromResume");
                return null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return embyApiService.hideFromResume(str, str2, z, continuation);
        }
    }

    @POST("Users/AuthenticateByName")
    Object authenticateUser(@Body Map<String, String> map, Continuation<? super Response<AuthenticationResult>> continuation);

    @DELETE("Users/{userId}/PlayedItems/{itemId}")
    Object deletePlayedItem(@Path("userId") String str, @Path("itemId") String str2, Continuation<? super Response<Unit>> continuation);

    @GET("Users/{userId}/Items")
    Object findItemsByProviderId(@Path("userId") String str, @Query("AnyProviderIdEquals") String str2, @Query("IncludeItemTypes") String str3, @Query("Recursive") boolean z, @Query("GroupProgramsBySeries") boolean z2, @Query("EnableImageTypes") String str4, @Query("Fields") String str5, @Query("Limit") int i, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getContainingCollections(@Path("userId") String str, @Query("ListItemIds") String str2, @Query("IncludeItemTypes") String str3, @Query("Recursive") boolean z, @Query("SortBy") String str4, @Query("Fields") String str5, @Query("EnableImageTypes") String str6, @Query("Limit") int i, Continuation<? super Response<QueryResult>> continuation);

    @GET("Shows/{seriesId}/Episodes")
    Object getEpisodes(@Path("seriesId") String str, @Query("UserId") String str2, @Query("SeasonId") String str3, @Query("Fields") String str4, @Query("SortBy") String str5, @Query("SortOrder") String str6, Continuation<? super Response<QueryResult>> continuation);

    @GET("Shows/{seriesId}/Episodes")
    Object getEpisodesForCrossServerMatch(@Path("seriesId") String str, @Query("UserId") String str2, @Query("SeasonId") String str3, @Query("EnableImageTypes") String str4, @Query("Fields") String str5, @Query("SortBy") String str6, @Query("SortOrder") String str7, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getFavoriteItems(@Path("userId") String str, @Query("Filters") String str2, @Query("Recursive") boolean z, @Query("SortBy") String str3, @Query("SortOrder") String str4, @Query("Fields") String str5, @Query("IncludeItemTypes") String str6, @Query("CollapseBoxSetItems") boolean z2, @Query("EnableImageTypes") String str7, @Query("Limit") Integer num, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items/{itemId}")
    Object getItemChapters(@Path("userId") String str, @Path("itemId") String str2, @Query("Fields") String str3, Continuation<? super Response<MediaItem>> continuation);

    @GET("Items/Counts")
    Object getItemCounts(Continuation<? super Response<ItemCounts>> continuation);

    @GET("Users/{userId}/Items/{itemId}")
    Object getItemDetails(@Path("userId") String str, @Path("itemId") String str2, @Query("Fields") String str3, Continuation<? super Response<MediaItem>> continuation);

    @GET("Users/{userId}/Items")
    Object getItems(@Path("userId") String str, @Query("ParentId") String str2, @Query("SortBy") String str3, @Query("SortOrder") String str4, @Query("Fields") String str5, @Query("Recursive") boolean z, @Query("IncludeItemTypes") String str6, @Query("EnableImageTypes") String str7, @Query("Filters") String str8, @Query("Limit") Integer num, @Query("StartIndex") Integer num2, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getItemsByIds(@Path("userId") String str, @Query("Ids") String str2, @Query("Fields") String str3, @Query("Recursive") boolean z, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getItemsByPerson(@Path("userId") String str, @Query("PersonIds") String str2, @Query("Recursive") boolean z, @Query("IncludeItemTypes") String str3, @Query("SortBy") String str4, @Query("SortOrder") String str5, @Query("Fields") String str6, @Query("Limit") Integer num, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getLastPlayedEpisodeForSeries(@Path("userId") String str, @Query("ParentId") String str2, @Query("Limit") int i, @Query("Recursive") boolean z, @Query("IncludeItemTypes") String str3, @Query("SortBy") String str4, @Query("SortOrder") String str5, @Query("Filters") String str6, @Query("Fields") String str7, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items/Latest")
    Object getLatestMedia(@Path("userId") String str, @Query("Limit") int i, @Query("Fields") String str2, @Query("ParentId") String str3, Continuation<? super Response<List<MediaItem>>> continuation);

    @GET("Users/{userId}/Views")
    Object getLibraries(@Path("userId") String str, @Query("Fields") String str2, Continuation<? super Response<LibraryQueryResult>> continuation);

    @GET("Users/{userId}/Items/{personId}")
    Object getPersonDetails(@Path("userId") String str, @Path("personId") String str2, @Query("Fields") String str3, Continuation<? super Response<MediaItem>> continuation);

    @POST("Items/{itemId}/PlaybackInfo")
    Object getPlaybackInfo(@Path("itemId") String str, @Query("UserId") String str2, @Query("AutoOpenLiveStream") boolean z, @Query("IsPlayback") boolean z2, @Body PlaybackInfoRequest playbackInfoRequest, Continuation<? super Response<PlaybackInfoResponse>> continuation);

    @GET("Users/{userId}/Items")
    Object getRecentlyPlayedItems(@Path("userId") String str, @Query("Filters") String str2, @Query("Recursive") boolean z, @Query("SortBy") String str3, @Query("SortOrder") String str4, @Query("Fields") String str5, @Query("IncludeItemTypes") String str6, @Query("EnableImageTypes") String str7, @Query("Limit") int i, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items")
    Object getResumeItems(@Path("userId") String str, @Query("Limit") int i, @Query("Filters") String str2, @Query("Recursive") boolean z, @Query("SortBy") String str3, @Query("SortOrder") String str4, @Query("Fields") String str5, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items/Resume")
    Object getResumeItemsForSeries(@Path("userId") String str, @Query("ParentId") String str2, @Query("Limit") int i, @Query("Recursive") boolean z, @Query("Fields") String str3, @Query("MediaTypes") String str4, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}/Items/Resume")
    Object getResumeItemsV2(@Path("userId") String str, @Query("Limit") int i, @Query("Recursive") boolean z, @Query("Fields") String str2, @Query("ImageTypeLimit") int i2, @Query("EnableImageTypes") String str3, @Query("MediaTypes") String str4, Continuation<? super Response<QueryResult>> continuation);

    @GET("Shows/{seriesId}/Seasons")
    Object getSeasons(@Path("seriesId") String str, @Query("UserId") String str2, @Query("Fields") String str3, Continuation<? super Response<QueryResult>> continuation);

    @GET("Shows/{seriesId}/Seasons")
    Object getSeasonsForCrossServerMatch(@Path("seriesId") String str, @Query("UserId") String str2, @Query("Fields") String str3, Continuation<? super Response<QueryResult>> continuation);

    @GET("Items/{itemId}/Similar")
    Object getSimilarItems(@Path("itemId") String str, @Query("UserId") String str2, @Query("Limit") int i, @Query("ImageTypeLimit") int i2, @Query("Fields") String str3, @Query("EnableTotalRecordCount") boolean z, Continuation<? super Response<QueryResult>> continuation);

    @GET("Users/{userId}")
    Object getUser(@Path("userId") String str, Continuation<? super Response<JsonObject>> continuation);

    @POST("Users/{userId}/Items/{itemId}/HideFromResume")
    Object hideFromResume(@Path("userId") String str, @Path("itemId") String str2, @Query("Hide") boolean z, Continuation<? super Response<Unit>> continuation);

    @POST("Users/{userId}/FavoriteItems/{itemId}")
    Object markFavorite(@Path("userId") String str, @Path("itemId") String str2, Continuation<? super Response<Unit>> continuation);

    @POST("Users/{userId}/PlayedItems/{itemId}")
    Object markPlayedItem(@Path("userId") String str, @Path("itemId") String str2, Continuation<? super Response<Unit>> continuation);

    @POST("Sessions/Playing/Progress")
    Object reportPlaybackProgress(@Body PlaybackProgressInfo playbackProgressInfo, Continuation<? super Response<Unit>> continuation);

    @POST("Sessions/Playing")
    Object reportPlaybackStart(@Body PlaybackProgressInfo playbackProgressInfo, Continuation<? super Response<Unit>> continuation);

    @POST("Sessions/Playing/Stopped")
    Object reportPlaybackStopped(@Body PlaybackProgressInfo playbackProgressInfo, Continuation<? super Response<Unit>> continuation);

    @GET("Users/{userId}/Items")
    Object searchItems(@Path("userId") String str, @Query("SearchTerm") String str2, @Query("Recursive") boolean z, @Query("Fields") String str3, @Query("IncludeItemTypes") String str4, @Query("Limit") Integer num, Continuation<? super Response<QueryResult>> continuation);

    @DELETE("Users/{userId}/PlayingItems/{itemId}")
    Object stopPlayingItem(@Path("userId") String str, @Path("itemId") String str2, @Query("PositionTicks") long j, Continuation<? super Response<Unit>> continuation);

    @DELETE("Users/{userId}/FavoriteItems/{itemId}")
    Object unmarkFavorite(@Path("userId") String str, @Path("itemId") String str2, Continuation<? super Response<Unit>> continuation);

    @POST("Users/{userId}/PlayingItems/{itemId}/Progress")
    Object updatePlaybackProgress(@Path("userId") String str, @Path("itemId") String str2, @Query("PositionTicks") long j, Continuation<? super Response<Unit>> continuation);

    @POST("Users/{userId}/Configuration")
    Object updateUserConfiguration(@Path("userId") String str, @Body JsonObject jsonObject, Continuation<? super Response<Unit>> continuation);

    @POST("Users/{userId}/Items/{itemId}/UserData")
    Object updateUserData(@Path("userId") String str, @Path("itemId") String str2, @Body UserDataRequest userDataRequest, Continuation<? super Response<Unit>> continuation);
}
