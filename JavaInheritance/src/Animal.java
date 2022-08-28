public class Animal {
    int animal_age, animal_weight;
    String animal_name, animal_running, animal_eating;
    public Animal(String name, int age, int weight, String running, String eating){
        animal_name = name;
        animal_age = age;
        animal_weight = weight;
        animal_running = running;
        animal_eating = eating;
    }
    public String getName(){
        return animal_name;
    }
    public String getRunning()
    {
        return animal_running;
    }
    public String getEating(){
        return animal_eating;
    }
    public int getAge(){
        return animal_age;
    }
    public int getWeight(){
        return animal_weight;
    }
    public String toString(){
        return "age: " + animal_age + ", weight: " + animal_weight + ", running: " + animal_running + ", eating: " + animal_eating;
    }
}