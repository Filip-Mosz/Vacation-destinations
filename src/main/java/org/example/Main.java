package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hallo Welt!" );

        List<String> strings = DataLoader.read("TERC.csv");
       // System.out.println(strings.toString());

        List<String> stringsByFiles = DataLoader.readFile("TERC.csv");
        System.out.println(stringsByFiles.toString());

        System.out.println(VoivodshipMapper.map(stringsByFiles));

    }
}
