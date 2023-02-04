package pages.API;

import java.util.HashMap;
import java.util.Map;

public class Breakfast {

    public String id;
    public int approval;
    public static String adminToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYyMDgyNzJiZDE0YzExM2UwMWUwODE2MCIsImVtYWlsIjoiZmFrZWFkbWluQGdtYWlsLmNvbSIsInJvbCI6ImFkbWluIiwia3VsbGFuaWNpX2FkaSI6ImZha2VhZG1pbiIsImR1cnVtIjoxfSwiaWF0IjoxNjQ0OTUzMTEyLCJleHAiOjE2NzY0ODkxMTJ9.GQxLLoe-LiPTmBJxQ2UNr8S10Dld8Xp0mFT0T9rykd4";

    public Breakfast(String id, int approval){

        this.id=id;
        this.approval=approval;

    }

    public Breakfast(){

    }

    public Map<String, Object> patchMap() {

        Map<String, Object> myPatchMap = new HashMap<String, Object>();

        myPatchMap.put("id", "620c98db44c42508ff30d35f" );
        myPatchMap.put("approval", 2 );


        return myPatchMap;
    }


}
