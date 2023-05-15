//package util;
//
//import com.google.common.collect.ImmutableList;
//import com.google.common.io.Resources;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import models.Flight;
//import org.apache.commons.io.IOUtils;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Data {
//    public static ImmutableList<Flight> getFlights() throws IOException {
//
//        //zamiana danych z pliku json w jeden obiekt
//        InputStream inputStream = Resources.getResource("flights.json").openStream();
//        String json = IOUtils.toString(inputStream);
//
//        Type listType = new TypeToken<ArrayList<Flight>>() {}.getType();        //###       // lista obiektów typu Person, ona nigdnie jest stworona - to tylko parametr TypeToken
//        List<Flight> flights = new Gson().fromJson(json, listType);              //### te dwie linijki są nierozerwalne  / ta linijka tworzy nam
//        return ImmutableList.copyOf(flights);
//    }

//    public static ImmutableList<Car> getCars() throws IOException {
//        InputStream inputStream = Resources.getResource("cars.json").openStream();
//        String json = IOUtils.toString(inputStream);
//
//        Type listType = new TypeToken<ArrayList<Car>>() {}.getType();
//        List<Car> cars = new Gson().fromJson(json, listType);
////        return ImmutableList.copyOf(cars);
//    }

