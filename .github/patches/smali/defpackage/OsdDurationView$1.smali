.class Ldefpackage/OsdDurationView$1;
.super Ljava/lang/Object;
.source "OsdDurationView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldefpackage/OsdDurationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ldefpackage/OsdDurationView;


# direct methods
.method constructor <init>(Ldefpackage/OsdDurationView;)V
    .registers 2

    .line 21
    iput-object p1, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 12

    .line 24
    iget-object v0, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v0}, Ldefpackage/OsdDurationView;->-$$Nest$fgetplayer(Ldefpackage/OsdDurationView;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_46

    .line 25
    iget-object v0, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v0}, Ldefpackage/OsdDurationView;->-$$Nest$fgetplayer(Ldefpackage/OsdDurationView;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    move-result-wide v0

    .line 26
    iget-object v2, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v2}, Ldefpackage/OsdDurationView;->-$$Nest$fgetplayer(Ldefpackage/OsdDurationView;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v2

    invoke-interface {v2}, Landroidx/media3/exoplayer/ExoPlayer;->getDuration()J

    move-result-wide v2

    .line 27
    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_46

    .line 28
    iget-object v4, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v0, v1}, Ldefpackage/OsdDurationView;->-$$Nest$smformatTime(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3}, Ldefpackage/OsdDurationView;->-$$Nest$smformatTime(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " / "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ldefpackage/OsdDurationView;->-$$Nest$fputdisplayText(Ldefpackage/OsdDurationView;Ljava/lang/String;)V

    .line 31
    :cond_46
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v3, 0xd

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v3, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v5, 0x2

    aput-object v0, v3, v5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "%02d:%02d:%02d"

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 32
    iget-object v1, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v1, v0}, Ldefpackage/OsdDurationView;->-$$Nest$fputtimeText(Ldefpackage/OsdDurationView;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-virtual {v0}, Ldefpackage/OsdDurationView;->invalidate()V

    .line 34
    iget-object v0, p0, Ldefpackage/OsdDurationView$1;->this$0:Ldefpackage/OsdDurationView;

    invoke-static {v0}, Ldefpackage/OsdDurationView;->-$$Nest$fgethandler(Ldefpackage/OsdDurationView;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    return-void
.end method
