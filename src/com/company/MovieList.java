package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class MovieList {
    // List of movies from file movies.txt
    private ArrayList <String> movies;

    public MovieList (String pathname){
        movies = new ArrayList();
        File file = new File(pathname);
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File does not exist!");
        }
    }

    // Random picked movie
    public Object getRandomMovie() {
        //random movie title from list
        int movieIndex = (int) (Math.random() * movies.size());
        return movies.get(movieIndex);
    }
}
