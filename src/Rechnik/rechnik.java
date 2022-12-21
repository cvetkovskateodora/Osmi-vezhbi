package Rechnik;

    import java.util.*;

    public class rechnik {
        public static void main(String[] args) {
            Map<String, String> recnik = new HashMap<>();

            recnik.put("two", "dva");
            recnik.put("seven", "sedum");
            recnik.put("eight", "osum");
            recnik.put("hi", "zdravo");

            System.out.println("Klucevi:" + recnik.keySet());
            System.out.println("Vrednosti:" + recnik.values());

            for (Map.Entry<String, String> entry : recnik.entrySet()) {
                System.out.println(entry.getKey() + " | " + entry.getValue());
            }

            if (recnik.containsKey("hi"))
                System.out.println("Prevodot za zborot hi od angliski na makedonski e: " + recnik.get("hi"));

            else
                System.out.println("Takov zbor ne postoi");

        }}
	
