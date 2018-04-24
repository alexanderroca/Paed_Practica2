package Model;

import Model.TracteJson.cities;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LlegeixJson {

    public cities llegeixJson(){
        JsonReader jr = null;

        try {
            jr = new JsonReader(new FileReader("src/calidade.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return new Gson().fromJson(jr, cities.class);
    }
}
