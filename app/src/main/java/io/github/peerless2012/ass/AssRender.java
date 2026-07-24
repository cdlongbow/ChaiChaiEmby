package io.github.peerless2012.ass;

public class AssRender {
    public native void init();
    public native void release();
    public native AssFrame getFrame(long timeMillis);
    public native AssTrack getTrack();
}