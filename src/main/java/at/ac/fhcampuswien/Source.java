package at.ac.fhcampuswien;

public class Source {
    private String id; //ID of the source (most likely the same as name)
    private String name; //name of the source

    //Getter and Setter
    public Source (String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId (){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
