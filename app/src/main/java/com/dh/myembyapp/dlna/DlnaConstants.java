package com.dh.myembyapp.dlna;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaConstants;", "", "<init>", "()V", "ACTION_PLAY_REQUEST", "", "ACTION_CONTROL", "EXTRA_URI", "EXTRA_TITLE", "EXTRA_METADATA", "EXTRA_COMMAND", "EXTRA_POSITION", "CMD_PLAY", "CMD_PAUSE", "CMD_STOP", "CMD_SEEK", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DlnaConstants {
    public static final int $stable = 0;
    public static final String ACTION_CONTROL = "com.dh.myembyapp.dlna.CONTROL";
    public static final String ACTION_PLAY_REQUEST = "com.dh.myembyapp.dlna.PLAY_REQUEST";
    public static final String CMD_PAUSE = "pause";
    public static final String CMD_PLAY = "play";
    public static final String CMD_SEEK = "seek";
    public static final String CMD_STOP = "stop";
    public static final String EXTRA_COMMAND = "command";
    public static final String EXTRA_METADATA = "metadata";
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_TITLE = "title";
    public static final String EXTRA_URI = "uri";
    public static final DlnaConstants INSTANCE = new DlnaConstants();

    private DlnaConstants() {
    }
}
