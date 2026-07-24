.class public final Ldefpackage/OsdDurationView;
.super Landroid/view/View;
.source "OsdDurationView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final density:F

.field private displayText:Ljava/lang/String;

.field private final handler:Landroid/os/Handler;

.field private final paint:Landroid/graphics/Paint;

.field private player:Landroidx/media3/exoplayer/ExoPlayer;

.field private final shadowPaint:Landroid/graphics/Paint;

.field private final updater:Ljava/lang/Runnable;

.field private speedText:Ljava/lang/String;

.field private static instance:Ldefpackage/OsdDurationView;

.field private timeText:Ljava/lang/String;

.field private static on1Ref:Lon1;


# direct methods
.method static bridge synthetic -$$Nest$fgethandler(Ldefpackage/OsdDurationView;)Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetplayer(Ldefpackage/OsdDurationView;)Landroidx/media3/exoplayer/ExoPlayer;
    .registers 1

    iget-object p0, p0, Ldefpackage/OsdDurationView;->player:Landroidx/media3/exoplayer/ExoPlayer;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputdisplayText(Ldefpackage/OsdDurationView;Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldefpackage/OsdDurationView;->displayText:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputtimeText(Ldefpackage/OsdDurationView;Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldefpackage/OsdDurationView;->timeText:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$smformatTime(J)Ljava/lang/String;
    .registers 2

    invoke-static {p0, p1}, Ldefpackage/OsdDurationView;->formatTime(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 37
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 15
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    .line 16
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    .line 18
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Ldefpackage/OsdDurationView;->displayText:Ljava/lang/String;

    .line 21
    new-instance v0, Ldefpackage/OsdDurationView$1;

    invoke-direct {v0, p0}, Ldefpackage/OsdDurationView$1;-><init>(Ldefpackage/OsdDurationView;)V

    iput-object v0, p0, Ldefpackage/OsdDurationView;->updater:Ljava/lang/Runnable;

    sput-object p0, Ldefpackage/OsdDurationView;->instance:Ldefpackage/OsdDurationView;

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Ldefpackage/OsdDurationView;->density:F

    .line 39
    iget-object p1, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    iget-object p1, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    iget v0, p0, Ldefpackage/OsdDurationView;->density:F

    const/high16 v1, 0x41800000    # 16.0f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 41
    iget-object p1, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    const/16 v0, 0xb0

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    iget-object p1, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    iget v0, p0, Ldefpackage/OsdDurationView;->density:F

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 43
    iget-object p1, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    const/high16 v0, 0x3fc00000    # 1.5f

    iget v1, p0, Ldefpackage/OsdDurationView;->density:F

    mul-float v1, v1, v0

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 44
    iget-object p1, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Ldefpackage/OsdDurationView;->setVisibility(I)V

    .line 46
    return-void
.end method

.method private static formatTime(J)Ljava/lang/String;
    .registers 7

    .line 78
    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    .line 79
    const-wide/16 v0, 0x3c

    div-long v2, p0, v0

    .line 80
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    rem-long/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v2, p1, v0

    const/4 v0, 0x1

    aput-object p0, p1, v0

    const-string p0, "%d:%02d"

    invoke-static {v4, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static setSpeedText(Ljava/lang/String;)V
    .registers 2

    .line 33
    sget-object v0, Ldefpackage/OsdDurationView;->instance:Ldefpackage/OsdDurationView;

    if-eqz v0, :cond_a

    iput-object p0, v0, Ldefpackage/OsdDurationView;->speedText:Ljava/lang/String;

    invoke-virtual {v0}, Ldefpackage/OsdDurationView;->postInvalidate()V

    :cond_a
    return-void
.end method


# virtual methods
.method public hide()V
    .registers 3

    .line 59
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Ldefpackage/OsdDurationView;->setVisibility(I)V

    .line 60
    iget-object v0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Ldefpackage/OsdDurationView;->updater:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 61
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 3

    .line 73
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 74
    iget-object v0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Ldefpackage/OsdDurationView;->updater:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 75
    sget-object v0, Ldefpackage/OsdDurationView;->instance:Ldefpackage/OsdDurationView;

    if-ne v0, p0, :cond_noinst

    const/4 v0, 0x0

    sput-object v0, Ldefpackage/OsdDurationView;->instance:Ldefpackage/OsdDurationView;

    :cond_noinst
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 8

    .line 65
    iget v0, p0, Ldefpackage/OsdDurationView;->density:F

    const/high16 v1, 0x41800000    # 16.0f

    mul-float v0, v0, v1

    .line 66
    invoke-virtual {p0}, Ldefpackage/OsdDurationView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ldefpackage/OsdDurationView;->density:F

    mul-float v3, v3, v1

    sub-float/2addr v2, v3

    .line 67
    iget-object v1, p0, Ldefpackage/OsdDurationView;->displayText:Ljava/lang/String;

    const/high16 v3, 0x3fc00000    # 1.5f

    add-float v4, v0, v3

    add-float/2addr v3, v2

    iget-object v5, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v4, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 68
    iget-object v1, p0, Ldefpackage/OsdDurationView;->displayText:Ljava/lang/String;

    iget-object v3, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 69
    iget-object v1, p0, Ldefpackage/OsdDurationView;->speedText:Ljava/lang/String;

    if-eqz v1, :cond_nospeed

    iget-object v3, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {p0}, Ldefpackage/OsdDurationView;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v0

    sub-float/2addr v4, v3

    const/high16 v3, 0x3fc00000    # 1.5f

    add-float v5, v4, v3

    add-float/2addr v3, v2

    iget-object v6, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v5, v3, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v3, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v4, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_nospeed

    .line 70
    iget-object v1, p0, Ldefpackage/OsdDurationView;->timeText:Ljava/lang/String;

    if-eqz v1, :cond_noclock

    iget-object v3, p0, Ldefpackage/OsdDurationView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    const/high16 v5, 0x41a00000    # 20.0f

    iget v6, p0, Ldefpackage/OsdDurationView;->density:F

    mul-float v5, v5, v6

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    invoke-virtual {p0}, Ldefpackage/OsdDurationView;->getWidth()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v6, v0

    sub-float v5, v6, v5

    iget v6, p0, Ldefpackage/OsdDurationView;->density:F

    const/high16 v7, 0x41a00000    # 20.0f

    mul-float v7, v7, v6

    add-float v6, v0, v7

    iget-object v2, p0, Ldefpackage/OsdDurationView;->shadowPaint:Landroid/graphics/Paint;

    const/high16 v7, 0x3fc00000    # 1.5f

    move v0, v7

    add-float/2addr v0, v6

    add-float v7, v5, v7

    invoke-virtual {p1, v1, v7, v0, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1, v1, v5, v6, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_noclock

    return-void
.end method

.method public setPlayer(Landroidx/media3/exoplayer/ExoPlayer;)V
    .registers 2

    .line 49
    iput-object p1, p0, Ldefpackage/OsdDurationView;->player:Landroidx/media3/exoplayer/ExoPlayer;

    .line 50
    return-void
.end method

.method public show()V
    .registers 3

    .line 53
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ldefpackage/OsdDurationView;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Ldefpackage/OsdDurationView;->updater:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 55
    iget-object v0, p0, Ldefpackage/OsdDurationView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Ldefpackage/OsdDurationView;->updater:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    return-void
.end method

.method public static setOn1(Lon1;)V
    .registers 1
    sput-object p0, Ldefpackage/OsdDurationView;->on1Ref:Lon1;
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .registers 8
    sget-object v0, Ldefpackage/OsdDurationView;->on1Ref:Lon1;
    if-nez v0, :cond_ret
    iget-object v1, v0, Lon1;->n:Landroidx/compose/runtime/MutableState;
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;
    move-result-object v2
    check-cast v2, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    sget-object v3, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->OFF:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    if-ne v2, v3, :cond_set_menu
    sget-object v3, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->MENU_ONLY:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    if-ne v2, v3, :cond_set_always
    sget-object v3, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->ALWAYS:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    if-ne v2, v3, :cond_set_off
    goto :cond_ret
    :cond_set_off
    sget-object v2, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->OFF:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    goto :cond_update
    :cond_set_menu
    sget-object v2, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->MENU_ONLY:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    goto :cond_update
    :cond_set_always
    sget-object v2, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->ALWAYS:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    :cond_update
    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V
    iget-object v0, v0, Lon1;->a:Lcom/dh/myembyapp/data/preferences/UserPreferences;
    invoke-virtual {v0, v2}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->setSystemDurationDisplayMode(Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;)V
    sget-object v0, Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;->OFF:Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;
    if-ne v2, v0, :cond_show
    invoke-virtual {p0}, Ldefpackage/OsdDurationView;->hide()V
    goto :cond_toast
    :cond_show
    invoke-virtual {p0}, Ldefpackage/OsdDurationView;->show()V
    :cond_toast
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    const-string v1, "Duration: "
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;
    move-result-object v2
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
    move-result-object v1
    const/4 v2, 0x0
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    move-result-object v0
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :cond_ret
    return-void
.end method
