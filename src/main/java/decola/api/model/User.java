package decola.api.model;

public class User {
    private String name;
    private String email;
    private int age;
    private String profession;  // Novo campo para a profissão

    // Construtores
    public User(String name, String email, int age, String profession) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.profession = profession;  // Inicializando o novo campo
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
