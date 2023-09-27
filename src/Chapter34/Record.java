package Chapter34;


public class Record {
    private int personID;
    private String name;
    private int age;
    private String town;

    public Record() {
    }
    
    public Record(int personID, String name, int age, String town) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public Record(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Record{" + "personID=" + personID + ", name=" + name + ", age=" + age + ", town=" + town + '}';
    }
}
