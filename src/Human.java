public class Human {

    private String name;
    private String surname;
    private int age;

    public Human() {

    }


    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            return;
        }
        this.name = "";
        name = name.trim().replaceAll(" +", " ");
        String[] parts = name.split(" ");
        for (int i = 0; i < parts.length; i++) {
            this.name += parts[i].toUpperCase().charAt(0) + parts[i].toLowerCase().substring(1) + " ";
        }
        this.name = this.name.trim();
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

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 150) {
            this.age = 150;
        } else {
            this.age = age;
        }
    }
}