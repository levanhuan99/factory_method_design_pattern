public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFacory animalFacory=new AnimalFacory();

        Animal animal1=animalFacory.getAnimal("kitty");
        System.out.println("a1 sound like "+ animal1.makeSound());

        Animal animal2=animalFacory.getAnimal("dog");
        System.out.println("a2 sound like " +animal2.makeSound());

    }
}
