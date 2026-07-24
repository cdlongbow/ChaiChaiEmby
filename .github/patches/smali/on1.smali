.class public final Lon1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/dh/myembyapp/data/preferences/UserPreferences;

.field public final b:Landroidx/compose/runtime/MutableFloatState;

.field public final c:Landroidx/compose/runtime/MutableState;

.field public final d:Landroidx/compose/runtime/MutableState;

.field public final e:Landroidx/compose/runtime/MutableState;

.field public final f:Landroidx/compose/runtime/MutableIntState;

.field public final g:Landroidx/compose/runtime/MutableIntState;

.field public final h:Landroidx/compose/runtime/MutableState;

.field public final i:Landroidx/compose/runtime/MutableState;

.field public final j:Landroidx/compose/runtime/MutableState;

.field public final k:Landroidx/compose/runtime/MutableState;

.field public final l:Landroidx/compose/runtime/MutableState;

.field public final m:Landroidx/compose/runtime/MutableState;

.field public final n:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Lcom/dh/myembyapp/data/preferences/UserPreferences;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lon1;->a:Lcom/dh/myembyapp/data/preferences/UserPreferences;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getPlaybackSpeed()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lon1;->b:Landroidx/compose/runtime/MutableFloatState;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSystemNetworkSpeedDisplayMode()Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lon1;->c:Landroidx/compose/runtime/MutableState;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSystemNetworkSpeedPosition()Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lon1;->d:Landroidx/compose/runtime/MutableState;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSystemTimeDisplayMode()Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lon1;->e:Landroidx/compose/runtime/MutableState;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSeekIntervalSec()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lon1;->f:Landroidx/compose/runtime/MutableIntState;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getAudioDelayMs()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lon1;->g:Landroidx/compose/runtime/MutableIntState;

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getPlayerResizeMode()Lcom/dh/myembyapp/data/model/PlayerResizeMode;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lon1;->h:Landroidx/compose/runtime/MutableState;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getPlayerDefaultViewMode()Lcom/dh/myembyapp/data/model/PlayerDefaultViewMode;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lon1;->i:Landroidx/compose/runtime/MutableState;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getPlayerFrameRateMatchingMode()Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, Lon1;->j:Landroidx/compose/runtime/MutableState;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getVideoVersionPrioritySettings()Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lon1;->k:Landroidx/compose/runtime/MutableState;

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getAudioVersionPrioritySettings()Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Lon1;->l:Landroidx/compose/runtime/MutableState;

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSubtitleVersionPrioritySettings()Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lon1;->m:Landroidx/compose/runtime/MutableState;

    .line 130
    .line 131
    iget-object p1, p0, Lon1;->a:Lcom/dh/myembyapp/data/preferences/UserPreferences;

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/dh/myembyapp/data/preferences/UserPreferences;->getSystemDurationDisplayMode()Lcom/dh/myembyapp/data/model/SystemDurationDisplayMode;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    const/4 v1, 0x0

    .line 138
    const/4 v2, 0x2

    .line 139
    invoke-static {p1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, Lon1;->n:Landroidx/compose/runtime/MutableState;

    .line 144
    .line 145
    return-void
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
.end method
