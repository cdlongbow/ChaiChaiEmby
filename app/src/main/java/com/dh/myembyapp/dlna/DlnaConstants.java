package com.dh.myembyapp.dlna;


/* JADX INFO: loaded from: classes4.dex */
public final class DlnaConstants {
    
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
