/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;


/**
 *
 */
public class DAOVino {

    public static void loadJSON(String JSON_FILE,Collection list){
        JSONParser parser = new JSONParser();
        JSONArray json = null;
        try {
            json = (JSONArray) parser.parse(new FileReader(JSON_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Iterator iterator = json.iterator();
        while (iterator.hasNext()) {
            JSONObject features = (JSONObject) iterator.next();
            long precio = 0;
            String country="";
            String description="";
            String title = "";
            try {
                precio = (long) features.get("price");
            } catch (Exception e) {
                precio = 0;
            }
            title = (String) features.get("title");
            //Verificamos que el valor no sea nulo por que sino no se puede comparar las variables country
            if(title==null){
                title="";
            }
            description = (String) features.get("description");

            country = (String) features.get("country");
            Vino d=new Vino(precio, country, description, title);
            list.add(d);



        }

    }

}
