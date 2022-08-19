package sinavOturum;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VeriAktarma {

    public static Map<String, String> derslerVeKodlari() throws IOException {
        String file = "src/sinavOturum/courses.csv";
        BufferedReader course = null;
        String line = "";
        Map<String, String> derslerMap = new HashMap<>();
        List<String> dersList = new ArrayList<>();
        course = new BufferedReader(new FileReader(file));

        while ((line = course.readLine()) != null) {
            String[] arr = line.split(",");
            derslerMap.put(arr[0], arr[1]);
            dersList.add(arr[0]);
        }
        return derslerMap;
    }

    public static Map<String, Ogrenci> ogrenciler() throws IOException {
        String file = "src/sinavOturum/studentCourse.csv";
        BufferedReader course = null;
        String line = "";
        Map<String, Ogrenci> ogrencilerMap = new HashMap<>();
        course = new BufferedReader(new FileReader(file));

        while ((line = course.readLine()) != null) {
            String[] arr = line.split(",");
            Ogrenci ogrenci1 = new Ogrenci(arr[1], arr[2]);
            ogrencilerMap.put(arr[0], ogrenci1);
        }
        return ogrencilerMap;
    }

    public static List<String> ogretmenler() throws IOException {
        String file = "src/sinavOturum/teachers.csv";
        BufferedReader course = null;
        String line = "";
        //Map<String, Ogrenci> ogretmenlerMap = new HashMap<>();
        List<String> ogretmenList = new ArrayList<>();
        course = new BufferedReader(new FileReader(file));

        while ((line = course.readLine()) != null) {
            ogretmenList.add(line);

        }
        return ogretmenList;
    }
}