package okhttp3.internal.url;

public class _UrlKt {
    public static String toUrlString(String url) { return url; }
    public static boolean isHttpUrl(String url) { return url != null && (url.startsWith("http://") || url.startsWith("https://")); }
}