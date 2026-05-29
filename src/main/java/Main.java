import java.util.*;
public class Main {
    private static final String TAG = "QueueManager_a32e96";
    private final Map<String, Object> props = new LinkedHashMap<>();
    public Main set(String k, Object v) { props.put(k, v); return this; }
    public Map<String, Object> build() { props.put("_tag", TAG); props.put("_ts", System.currentTimeMillis()); return Collections.unmodifiableMap(props); }
    @Override public String toString() { return TAG + props; }
    public static void main(String[] args) { Main b = new Main().set("host", "localhost").set("port", 8080).set("debug", true); System.out.println("[" + TAG + "] Built: " + b.build()); }
}
