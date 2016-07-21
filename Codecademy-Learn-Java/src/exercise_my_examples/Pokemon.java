package exercise_my_examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
public class Pokemon {
	
	
	
	
	
	public static void main(String []args){
		HashMap<String, String > pokemon_names = new HashMap<String, String >();
		
		pokemon_names.put("#001","Bulbasaur");
		pokemon_names.put("#002","Ivysaur");
		pokemon_names.put("#003","Venusaur");
		pokemon_names.put("#004","Charmander");
		pokemon_names.put("#005","Charmeleon");
		pokemon_names.put("#006","Charizard");
		pokemon_names.put("#007","Squirtle");
		pokemon_names.put("#008","Wartortle");
		pokemon_names.put("#009","Blastoise");
		pokemon_names.put("#010","Caterpie");
		pokemon_names.put("#011","Metapod");
		pokemon_names.put("#012","Butterfree");
		pokemon_names.put("#013","Weedle");
		pokemon_names.put("#014","Kakuna");
		pokemon_names.put("#015","Beedrill");
		pokemon_names.put("#015","Pidgey");
		pokemon_names.put("#016","Pidgeotto");
		pokemon_names.put("#017","Pidgeot");
		pokemon_names.put("018","Rattata");
		pokemon_names.put("#019","Raticate");
		
			
        ArrayList<String> pokemon_trainer = new ArrayList<String>();
		
		pokemon_trainer.add("Ash Kechum");
		pokemon_trainer.add("Red");
		pokemon_trainer.add("Misty");
		pokemon_trainer.add("Jessie");
		pokemon_trainer.add("James");
		
		System.out.println("\nList of Pokemons:\n");
		Collection<String> values = pokemon_names.values();
		for (String value : values) {
		    System.out.println(value);
		}
		
		
		
		System.out.println("\nList of Pokemon Trainers:\n");
        for(String nameT: pokemon_trainer){
        System.out.println(nameT);
		}
        
        
        String trainerA = pokemon_trainer.get(1);
        String pokemonA = pokemon_names.get("#001");
        
        String trainerB = pokemon_trainer.get(2);
        String pokemonB = pokemon_names.get("#002");
        
        
        boolean trainPA = true;
        
        boolean trainPB = false;
          
       
        
        
        if (trainPA == true && trainPB == true){
        	System.out.println("\nTrainer "+trainerA+" and trainer "+trainerB+" both trained well their pokemons. It is draw!");
        }
        
        else if(trainPA == true && trainPB == false){
        	System.out.println("\nTrainer "+trainerA+" with pokemon " +pokemonA+ " win against trainer "+trainerB+" with pokemon " +pokemonB+"!");
           }
           
        else  if(trainPA == false && trainPB == true){
        	System.out.println("\nTrainer "+trainerB+" with pokemon " +pokemonB+ " win against trainer "+trainerA+" with pokemon " +pokemonA+"!"); 
           }
        	
	
        else{
        	System.out.println("\nTrainer "+trainerA+" and trainer "+trainerB+" failed to train their pokemons. Battle didn't begin!");
		}  
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
	}

	
	
