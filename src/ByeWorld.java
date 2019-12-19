import java.util.concurrent.ConcurrentHashMap;


class ByeWorld {
    
    private static ConcurrentHashMap chm;

    public void run(String name, String category) { 
        synchronized (chm) {
            obj = chm.getName(name);
            if (obj == null) {
                obj = new orderObjectMarkdown(name, category);
                chm.put(name, obj);
            }
        }
    }
}