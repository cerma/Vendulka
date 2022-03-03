package com.cerma.vendulka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Data{
    public String inputLine;

        public String vypocet()  {

            new Thread(new Runnable(){
                @Override
                public void run() {
                    try {
            List hodnoty = new ArrayList();
            URL oracle = new URL("https://vendarulez.herokuapp.com/api/v1/entries");
            BufferedReader in = new BufferedReader(
                       new InputStreamReader(oracle.openStream()));


              while ((inputLine = in.readLine()) != null)
                       hodnoty.add(inputLine);

                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();

            return inputLine;
        }

}
