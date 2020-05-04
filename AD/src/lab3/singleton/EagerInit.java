package lab3.singleton;

import java.sql.Timestamp;
import java.util.Date;

public class EagerInit {
    private static final EagerInit instance = new EagerInit();
    private String name;

    private EagerInit() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        name = "eager_instance" + timestamp.getTime();
    }
    public String getName(){
        return this.name;
    }

    public static EagerInit getInstance(){
        return instance;
    }
}
