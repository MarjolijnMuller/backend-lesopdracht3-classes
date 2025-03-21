public class DogOwner {
    private String nameDogOwner;
    private String sexDogOwner;
    private Dog dog;

    public DogOwner(String nameDogOwner, String sexDogOwner) {
        this.nameDogOwner = nameDogOwner;
        this.sexDogOwner = sexDogOwner;
    }

    public void setNameDog(String newName) {
        this.dog.setName(newName);
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setAgeDog() {
        this.dog.incrementAge();
    }

    @Override
    public String toString() {
        return nameDogOwner + " heeft een " + dog.getSex() + " deze is " + dog.getAge() + " jaar oud en van het soort: " + dog.getSpecies() + "." +
                "De hond heet: " + dog.getName();
    }
}
