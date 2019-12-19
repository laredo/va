import java.util.concurrent.ConcurrentHashMap;


class HelloWorld {

    static ConcurrentHashMap repo;

    public String  get(final String ip) {
        if (!IP_Pattern.matcher(ip).matches()) {
            return ip;
        }
        if (repo.containsKey(ip)) {
            return repo.get(ip);
        }
}
}