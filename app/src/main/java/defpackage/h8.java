package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CoroutineScope d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ h8(LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester) {
        this.e = legacyTextFieldState;
        this.b = z;
        this.c = z2;
        this.g = textInputService;
        this.h = textFieldValue;
        this.i = imeOptions;
        this.j = offsetMapping;
        this.k = textFieldSelectionManager;
        this.d = coroutineScope;
        this.l = bringIntoViewRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.j;
        Object obj4 = this.k;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                List list = (List) obj8;
                ServerConfig serverConfig = (ServerConfig) obj7;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                a5 a5Var = new a5(serverConfig, 4);
                lazyListScope.items(list.size(), new w5(4, a5Var, list), new x5(list, 3), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new l8(list, serverConfig, this.b, (VideoVersionPrioritySettings) obj6, list, this.c, (String) obj5, (FocusRequester) obj3, (Function3) obj4, this.d, (LazyListState) obj2)));
                return Unit.INSTANCE;
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$13$0((LegacyTextFieldState) obj8, this.b, this.c, (TextInputService) obj7, (TextFieldValue) obj6, (ImeOptions) obj5, (OffsetMapping) obj3, (TextFieldSelectionManager) obj4, this.d, (BringIntoViewRequester) obj2, (FocusState) obj);
            default:
                MutableState mutableState = (MutableState) obj7;
                MutableState mutableState2 = (MutableState) obj6;
                ScrollState scrollState = (ScrollState) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((MutableState) obj8).setValue(bool);
                if (zBooleanValue) {
                    mutableState.setValue(null);
                }
                boolean z = this.b;
                CoroutineScope coroutineScope = this.d;
                if (!z) {
                    if (zBooleanValue && !this.c && !((Boolean) mutableState2.getValue()).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k80(scrollState, mutableState3, focusRequester, mutableState4, null, 1), 3, null);
                    }
                    if (!zBooleanValue) {
                        mutableState3.setValue(Boolean.FALSE);
                    }
                } else if (!zBooleanValue) {
                    mutableState3.setValue(Boolean.FALSE);
                } else if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k80(scrollState, mutableState3, focusRequester, mutableState4, null, 0), 3, null);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h8(List list, ServerConfig serverConfig, boolean z, VideoVersionPrioritySettings videoVersionPrioritySettings, boolean z2, String str, FocusRequester focusRequester, Function3 function3, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.e = list;
        this.g = serverConfig;
        this.b = z;
        this.h = videoVersionPrioritySettings;
        this.c = z2;
        this.i = str;
        this.j = focusRequester;
        this.k = function3;
        this.d = coroutineScope;
        this.l = lazyListState;
    }

    public /* synthetic */ h8(boolean z, CoroutineScope coroutineScope, boolean z2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ScrollState scrollState, MutableState mutableState4, FocusRequester focusRequester, MutableState mutableState5) {
        this.b = z;
        this.d = coroutineScope;
        this.c = z2;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = scrollState;
        this.k = mutableState4;
        this.j = focusRequester;
        this.l = mutableState5;
    }
}
