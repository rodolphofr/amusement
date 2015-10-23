import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 		
 		String classification = scanner.nextLine();
        String kind = scanner.nextLine();
        String spec = scanner.nextLine();
 
        String animal = getAnimal(classification, kind, spec);
 
        System.out.println(animal);
        
        scanner.close();
	  
    }

    public static String getAnimal(String classification, String kind, String spec) {
        List<List<List<String>>> table = table(classification);
 
        String animal = "";
 
        if (kind.equals("ave")) {
            List<List<String>> birds = table.get(0);
 
            if (spec.equals("carnivoro")) {
                List<String> carnivorous = birds.get(0);
                animal = carnivorous.get(0);// aguia
 
            } else if (spec.equals("onivoro")) {
                List<String> omnivorous = birds.get(1);
                animal = omnivorous.get(0);// pomba
            }
 
        } else if (kind.equals("mamifero")) {
            List<List<String>> mammals = table.get(1);
 
            if (spec.equals("herbivoro")) {
                List<String> herbivorous = mammals.get(0);
                animal = herbivorous.get(0);// vaca
 
            } else if (spec.equals("onivoro")) {
                List<String> omnivorous = mammals.get(1);
                animal = omnivorous.get(1);// homem
            }
        }
 
        if (kind.equals("inseto")) {
            List<List<String>> insects = table.get(0);
 
            if (spec.equals("hematofago")) {
                List<String> hematofago = insects.get(0);
                animal = hematofago.get(0); // pulga
 
            } else if (spec.equals("herbivoro")) {
                List<String> herbivorous = insects.get(1);
                animal = herbivorous.get(1);// lagarta
            }
 
        } else if (kind.equals("anelideo")) {
            List<List<String>> annelid = table.get(1);
 
            if (spec.equals("hematofago")) {
                List<String> hematofago = annelid.get(0);
                animal = hematofago.get(1); // sanguessuga
 
            } else if (spec.equals("onivoro")) {
                List<String> omnivorous = annelid.get(1);
                animal = omnivorous.get(2);
            }
 
        }
 
        return animal;
 
    }

    public static List<List<List<String>>> table(String classification) {
 
        List<String> carnivorous = new ArrayList<String>();
        carnivorous.add("aguia");//
 
        List<String> herbivorous = new ArrayList<String>();
        herbivorous.add("vaca");//
        herbivorous.add("lagarta");
 
        List<String> omnivorous = new ArrayList<String>();
        omnivorous.add("pomba");
        omnivorous.add("homem");
        omnivorous.add("minhoca");
 
        List<String> hematofago = new ArrayList<String>();
        hematofago.add("pulga");
        hematofago.add("sanguessuga");
 
        List<List<String>> birds = new ArrayList<List<String>>();
        birds.add(carnivorous);
        birds.add(omnivorous);
 
        List<List<String>> mammals = new ArrayList<List<String>>();
        mammals.add(herbivorous);
        mammals.add(omnivorous);
 
        List<List<String>> insects = new ArrayList<List<String>>();
        insects.add(hematofago);
        insects.add(herbivorous);
 
        List<List<String>> annelids = new ArrayList<List<String>>();
        annelids.add(hematofago);
        annelids.add(omnivorous);
 
        if (classification.equals("vertebrado")) {
            List<List<List<String>>> vertebrates = new ArrayList<List<List<String>>>();
            vertebrates.add(birds);
            vertebrates.add(mammals);
            return vertebrates;
        } else {
            List<List<List<String>>> invertebrates = new ArrayList<List<List<String>>>();
            invertebrates.add(insects);
            invertebrates.add(annelids);
            return invertebrates;
        }
    }

}
  