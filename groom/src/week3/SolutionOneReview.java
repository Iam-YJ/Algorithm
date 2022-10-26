package week3;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SolutionOneReview {
    public static void main(String[] args) {

        Map<String, Boolean> placeOpen = new HashMap<>();
        placeOpen.put("test ,map", true);

        Map<String, Boolean> placeDetailInfo = new HashMap<>();
        placeOpen.put("test ,map", false);

        Place place = new Place(1L, 1L, "TEST", "TEST", placeOpen, LocalDateTime.now(), LocalDateTime.now(),placeDetailInfo, 1);



    }
}
