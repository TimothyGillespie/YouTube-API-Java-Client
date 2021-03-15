package eu.gillespie.youtubeapi.test;

import eu.gillespie.youtubeapi.YouTubeApiV3;
import eu.gillespie.youtubeapi.model.Activity;
import eu.gillespie.youtubeapi.model.PaginatedActivity;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class BasicTest {

    @Test
    void firstTest() {
        Properties properties = new Properties();
        File propertiesFile = new File("testenv.properties");
        if(propertiesFile.exists()) {
            try {
                properties.load(new FileInputStream(propertiesFile));
            } catch (IOException ignored) {}
        }




        PaginatedActivity result = new YouTubeApiV3(properties.getProperty("api.key")).getActivitiesByChannelId("desd");
        System.out.println(result.toString());
    }
}
