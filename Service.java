// apply Singelton pattern

import java.util.ArrayList;

public class Service {
    static public Service app;

    private ArrayList<Movie> moviesList;

    private Service() {}

    static public Service getService() {
        if (app == null) {
            app = new Service();
        }
        return app;
    }

    // add - remove - search for movies
}
