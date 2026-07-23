package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.DanmakuComment;
import com.dh.myembyapp.data.model.DanmakuParams;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PersonInfo;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class gq extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq(ViewModel viewModel, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = viewModel;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return new gq((String) obj3, (FocusRequester) obj2, continuation, 0);
            case 1:
                return new gq((ViewModel) obj2, (String) obj3, continuation, 1);
            case 2:
                return new gq((List) obj3, (DanmakuSettings) obj2, continuation, 2);
            case 3:
                return new gq((MediaItem) obj3, (Function1) obj2, continuation, 3);
            case 4:
                return new gq((ViewModel) obj2, (String) obj3, continuation, 4);
            case 5:
                return new gq((va0) obj3, (MediaItem) obj2, continuation, 5);
            case 6:
                return new gq((Function1) obj3, (State) obj2, continuation, 6);
            case 7:
                return new gq((ViewModel) obj2, (String) obj3, continuation, 7);
            case 8:
                return new gq((cz0) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                return new gq((ViewModel) obj2, (String) obj3, continuation, 9);
            case 10:
                return new gq((ih1) obj3, (ih1) obj2, continuation, 10);
            case 11:
                return new gq((MutableState) obj3, (on1) obj2, continuation, 11);
            case 12:
                return new gq((ScrollState) obj3, (MutableState) obj2, continuation, 12);
            case 13:
                return new gq((hy1) obj3, (Context) obj2, continuation, 13);
            default:
                return new gq((hy1) obj3, (State) obj2, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return ((gq) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DanmakuSettings danmakuSettings;
        DanmakuItemData danmakuItemData;
        DanmakuItemData danmakuItemData2;
        int i;
        String id;
        Object EmptyList;
        int i2 = this.a;
        DanmakuItemData danmakuItemData3 = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (((String) obj3) == null) {
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) obj2, 0, 1, null);
                }
                return Unit.INSTANCE;
            case 1:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                qq qqVar = (qq) obj2;
                String str = (String) obj3;
                MutableStateFlow mutableStateFlow = qqVar.c;
                if (!Intrinsics.areEqual(qqVar.b, str) || !(mutableStateFlow.getValue() instanceof oq)) {
                    mutableStateFlow.setValue(nq.a);
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(qqVar), null, null, new s6(qqVar, str, null), 3, null);
                }
                return Unit.INSTANCE;
            case 2:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) obj3;
                DanmakuSettings danmakuSettings2 = (DanmakuSettings) obj2;
                int iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(RangesKt.coerceIn(danmakuSettings2.getScreenPart(), 0.05f, 1.0f) * 20000.0f), 2000, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                int size = list.size();
                if (size > iCoerceIn) {
                    float f = size;
                    float f2 = f / iCoerceIn;
                    ArrayList arrayList = new ArrayList();
                    for (float f3 = 0.0f; f3 < f && arrayList.size() < iCoerceIn; f3 += f2) {
                        arrayList.add(list.get((int) f3));
                    }
                    Log.w("DanmakuView", c61.k("弹幕数量过多(", size, arrayList.size(), ")，已采样至 ", " 条，防止内存溢出"));
                    list = arrayList;
                }
                Log.d("DanmakuView", "开始处理弹幕，原始: " + size + "，实际处理: " + list.size());
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj4 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    DanmakuComment danmakuComment = (DanmakuComment) obj4;
                    try {
                        DanmakuParams params = danmakuComment.parseParams();
                        int color = params.getColor() == 0 ? -1 : params.getColor() | (-16777216);
                        int mode = params.getMode();
                        int i5 = 4;
                        if (mode != 4) {
                            i5 = 5;
                            if (mode != 5) {
                                i = 1;
                            } else if (danmakuSettings2.getShowTopDanmaku()) {
                                i = i5;
                            } else {
                                danmakuItemData2 = danmakuItemData3;
                                danmakuSettings = danmakuSettings2;
                            }
                            danmakuSettings = danmakuSettings2;
                            try {
                                danmakuItemData = new DanmakuItemData(i3, (long) (params.getTime() * 1000.0f), l00.h(danmakuComment.getM()), i, params.getFontSize(), color, 0, 0, 0, null, 0, 1984, null);
                            } catch (Exception e) {
                                e = e;
                                kb0.G("解析弹幕失败: ", e.getMessage(), "DanmakuView", e);
                                danmakuItemData = null;
                            }
                            danmakuItemData2 = danmakuItemData;
                        } else {
                            if (!danmakuSettings2.getShowBottomDanmaku()) {
                                danmakuItemData2 = danmakuItemData3;
                                danmakuSettings = danmakuSettings2;
                            }
                            i = i5;
                            danmakuSettings = danmakuSettings2;
                            danmakuItemData = new DanmakuItemData(i3, (long) (params.getTime() * 1000.0f), l00.h(danmakuComment.getM()), i, params.getFontSize(), color, 0, 0, 0, null, 0, 1984, null);
                            danmakuItemData2 = danmakuItemData;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        danmakuSettings = danmakuSettings2;
                    }
                    if (danmakuItemData2 != null) {
                        arrayList2.add(danmakuItemData2);
                    }
                    danmakuSettings2 = danmakuSettings;
                    i3 = i4;
                    danmakuItemData3 = null;
                    break;
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList2, new k00(0));
                int size2 = listSortedWith.size();
                int size3 = listSortedWith.size();
                return new up1(listSortedWith, size, size2, size3 > 5000 ? new tw(300, 1500L) : size3 > 2000 ? new tw(500, 1000L) : new tw(1000, 0L));
            case 3:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MediaItem mediaItem = (MediaItem) obj3;
                if (mediaItem != null && (id = mediaItem.getId()) != null) {
                    ((Function1) obj2).invoke(id);
                }
                return Unit.INSTANCE;
            case 4:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((va0) obj2).k((String) obj3, true);
                return Unit.INSTANCE;
            case 5:
                va0 va0Var = (va0) obj3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                try {
                    List<PersonInfo> people = ((MediaItem) obj2).getPeople();
                    if (people != null) {
                        EmptyList = new ArrayList();
                        for (Object obj5 : people) {
                            if (Intrinsics.areEqual(((PersonInfo) obj5).getType(), "Actor")) {
                                EmptyList.add(obj5);
                            }
                        }
                    } else {
                        EmptyList = CollectionsKt.emptyList();
                    }
                    List listW = va0.w(EmptyList);
                    if (!listW.isEmpty()) {
                        va0Var.a0.setValue(listW);
                    }
                    break;
                } catch (Exception e3) {
                    Log.e("DetailViewModel", "加载演职人员失败: " + e3.getMessage());
                }
                return Unit.INSTANCE;
            case 6:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((Function1) obj3).invoke(Boxing.boxBoolean(((Boolean) ((State) obj2).getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((cz0) obj2).e((String) obj3, false);
                return Unit.INSTANCE;
            case 8:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj2;
                if (((String) mutableState.getValue()) != null) {
                    ((cz0) obj3).h.setValue((String) mutableState.getValue());
                }
                return Unit.INSTANCE;
            case 9:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                md1 md1Var = (md1) obj2;
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(md1Var), null, null, new r3(md1Var, (String) obj3, null), 3, null);
                return Unit.INSTANCE;
            case 10:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (!dn1.z0((ih1) obj3)) {
                    ((ih1) obj2).b.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 11:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ExoPlayer exoPlayer = (ExoPlayer) ((MutableState) obj3).getValue();
                PlayerFrameRateMatchingMode playerFrameRateMatchingMode = (PlayerFrameRateMatchingMode) ((on1) obj2).j.getValue();
                playerFrameRateMatchingMode.getClass();
                int i6 = fn1.$EnumSwitchMapping$0[playerFrameRateMatchingMode.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    exoPlayer.setVideoChangeFrameRateStrategy(0);
                    return Unit.INSTANCE;
                }
                qu.f();
                return null;
            case 12:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((MutableState) obj2).setValue(Integer.valueOf(((ScrollState) obj3).getValue()));
                return Unit.INSTANCE;
            case 13:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((hy1) obj3).d((Context) obj2);
                return Unit.INSTANCE;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((hy1) obj3).f((List) ((State) obj2).getValue());
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
