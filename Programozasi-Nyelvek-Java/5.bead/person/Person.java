package person;

public class Person{
    String fstName;
    String sndName;
    String job;
    Gender sex;
    int birth;

    public Person(String fstName, String sndName, String job, Gender sex, int birth){
        this.fstName = fstName;
        this.sndName = sndName;
        this.job = job;
        this.sex = sex;
        this.birth = birth;
    }
    public String toString(){
        return "Name: "  + this.fstName + " " + this.sndName + " \njob: " + this.job + "\nsex: " + this.sex + "\n birth: " + this.birth;
    }
    public boolean equals(Person a){
        if(a==null){
            return false;
        }
        else{
            return this.fstName == a.fstName && this.sndName == a.sndName && this.job == a.job && this.sex == a.sex && this.birth == a.birth;
        }
    }
}