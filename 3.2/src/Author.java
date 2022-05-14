public class Author {
    private String name;
    private String surname;
    private int age;

    Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "Imie: " + getName() + "\n" + "Nazwisko: " + getSurname()+ "\n"  + "wiek: " +getAge();
    }

}
