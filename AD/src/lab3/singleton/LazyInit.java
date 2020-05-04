package lab3.singleton;

import java.sql.Timestamp;
import java.util.Date;

public class LazyInit {
    private static LazyInit instance;
    private String name;
    private LazyInit(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        name = "lazy_instance" + timestamp.getTime();    };

    public String getName(){
        return this.name;
    }

    public static LazyInit getInstance()
    {
        if (instance == null){
            instance = new LazyInit();
        }
        return instance;
    }
}

// eager singleton
// recap
