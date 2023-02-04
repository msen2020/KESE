package pages.API;

import java.util.HashMap;
import java.util.Map;

public class Cars {




    public Map<String,Object> dataCars() {

        Map<String, Object> datalarCars = new HashMap<String, Object>();

        datalarCars.put("user", "{\"username\": \"CemalQA\", \"id\" : \"61faf4d46606cd38918aceb9\"}");
        datalarCars.put("baslangic_address", "{\"label\" : \"Lorton, Virginia, Amerika Birleşik Devletleri\", \"list\" : [\"Lorton\",\"Virginia\" ,\"Amerika Birleşik Devletleri\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}");
        datalarCars.put("bitis_address", "{\"label\" : \"Amsterdam, Hollanda\", \"list\" : [\"Amsterdam\",\"Hollanda\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}");
        datalarCars.put("available_dates"," [{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]");
        datalarCars.put("tip",1);
        datalarCars.put("kisisayisi",5);
        datalarCars.put("cinsiyet",2);
        datalarCars.put("yasaralik","[1, 2, 3]");
        datalarCars.put("saat","14:30");
        datalarCars.put("koltuk",3);
        datalarCars.put("destination_list"," [ { \"label\": \"Utrecht, Hollanda\", \"list\": [ \"Utrecht\", \"Hollanda\" ], \"placeId\": \"ChIJNy3TOUNvxkcR6UqvGUz8yNY\", \"lat\": 52.09073739999999, \"lng\": 5.1214201 }, { \"label\": \"Arnhem, Hollanda\", \"list\": [ \"Arnhem\", \"Hollanda\" ], \"placeId\": \"ChIJcyKbzpG6x0cR18pz-eBaHBY\", \"lat\": 51.9851034, \"lng\": 5.898729599999999 } ]");
        datalarCars.put("car_description","artis ne arar la bazarda");

    return datalarCars;

    }

}


