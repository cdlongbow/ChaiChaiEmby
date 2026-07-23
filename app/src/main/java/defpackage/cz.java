package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.server.DanmakuConfigServerManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class cz extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(DanmakuConfigServerManager danmakuConfigServerManager, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, FocusRequester focusRequester, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.d = danmakuConfigServerManager;
        this.e = state;
        this.b = mutableState;
        this.c = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.i = focusRequester;
        this.j = mutableState5;
        this.k = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new cz((Function1) this.d, (Function0) this.e, (MutableFloatState) this.g, (MutableFloatState) this.h, (MutableIntState) this.j, (MutableFloatState) this.i, (MutableIntState) this.k, this.b, this.c, continuation);
            default:
                return new cz((DanmakuConfigServerManager) this.d, (State) this.e, this.b, this.c, this.g, this.h, (FocusRequester) this.i, this.j, this.k, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((cz) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap bitmapCreateBitmap;
        int i = this.a;
        MutableState mutableState = this.k;
        Object obj2 = this.i;
        MutableState mutableState2 = this.h;
        MutableState mutableState3 = this.g;
        MutableState mutableState4 = this.c;
        Object obj3 = this.e;
        MutableState mutableState5 = this.b;
        Object obj4 = this.d;
        MutableState mutableState6 = this.j;
        switch (i) {
            case 0:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((Function1) obj4).invoke(new DanmakuSettings(((MutableFloatState) mutableState3).getFloatValue(), ((MutableFloatState) mutableState2).getFloatValue(), ((MutableIntState) mutableState6).getIntValue(), ((MutableFloatState) obj2).getFloatValue(), ((MutableIntState) mutableState).getIntValue(), ((Boolean) mutableState5.getValue()).booleanValue(), ((Boolean) mutableState4.getValue()).booleanValue()));
                ((Function0) obj3).invoke();
                break;
            default:
                DanmakuConfigServerManager danmakuConfigServerManager = (DanmakuConfigServerManager) obj4;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                State state = (State) obj3;
                mutableState5.setValue(Boolean.valueOf(((DanmakuConfig) state.getValue()).getEnabled()));
                mutableState4.setValue(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) state.getValue()).getApiSlotNames()));
                mutableState3.setValue(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) state.getValue()).getApiSlotUrls()));
                IntRange intRange = new IntRange(0, 4);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10)), 16));
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    Pair pair = TuplesKt.to(Boxing.boxInt(iNextInt), Boxing.boxBoolean(((DanmakuConfig) state.getValue()).isApiUseProxy(iNextInt)));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                mutableState2.setValue(MapsKt.toMutableMap(linkedHashMap));
                danmakuConfigServerManager.startServer((DanmakuConfig) state.getValue(), new j1(this.b, this.c, this.g, this.h, (FocusRequester) obj2, 4));
                mutableState6.setValue(danmakuConfigServerManager.getServerUrl());
                try {
                    BitMatrix bitMatrixEncode = new QRCodeWriter().encode((String) mutableState6.getValue(), BarcodeFormat.QR_CODE, 300, 300);
                    bitmapCreateBitmap = Bitmap.createBitmap(300, 300, Bitmap.Config.RGB_565);
                    bitmapCreateBitmap.getClass();
                    for (int i2 = 0; i2 < 300; i2++) {
                        for (int i3 = 0; i3 < 300; i3++) {
                            bitmapCreateBitmap.setPixel(i2, i3, bitMatrixEncode.get(i2, i3) ? -16777216 : -1);
                        }
                    }
                } catch (Exception e) {
                    Log.e("DanmakuSettings", "Generate QR code failed", e);
                    bitmapCreateBitmap = null;
                }
                mutableState.setValue(bitmapCreateBitmap);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(Function1 function1, Function0 function0, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableIntState mutableIntState, MutableFloatState mutableFloatState3, MutableIntState mutableIntState2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.d = function1;
        this.e = function0;
        this.g = mutableFloatState;
        this.h = mutableFloatState2;
        this.j = mutableIntState;
        this.i = mutableFloatState3;
        this.k = mutableIntState2;
        this.b = mutableState;
        this.c = mutableState2;
    }
}
