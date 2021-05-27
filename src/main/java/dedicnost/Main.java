package dedicnost;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> saver = new ArrayList<>();
            ArrayList<ShapeParent> shapes = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                saver.add(line);
            }
            for (int i = 0; i < saver.size(); i++) {
                line = saver.get(i);
                String[] splitted = line.split(" ");

                if (splitted[0].equals("S")) {
                    shapes.add(new Square(Float.parseFloat(splitted[1])));
                }
                if (splitted[0].equals("R")) {
                    shapes.add(new Rectangle(Float.parseFloat(splitted[1]), Float.parseFloat(splitted[2])));
                }
                if (splitted[0].equals("C")) {
                    shapes.add(new Circle(Float.parseFloat(splitted[1])));
                }
            }

            //OBSAH PRUMER
            int counter = 0;
            int yo = 0;
            for (int i = 0; i < shapes.size(); i++) {
                yo = (int) (yo + shapes.get(i).obsah());
                counter++;
            }
            System.out.println((float) yo / counter);

            // OBVOD PRUMER
            counter = 0;
            yo = 0;
            for (int i = 0; i < shapes.size(); i++) {
                yo = (int) (yo + shapes.get(i).obvod());
                counter++;
            }
            System.out.println((float) yo / counter);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
