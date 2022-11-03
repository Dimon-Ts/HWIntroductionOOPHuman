public class Human {
    String name;
    String town;
    String jobTitle;
    int yearOfBirth;
    Human(String name,String town,int yearOfBirth,String jobTitle){
        this.name = name;
        this.town = town;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.jobTitle = jobTitle;
    }
    public String toString() {
        return "Привет! Меня зовут " + name + "."+"Я из города " + town + "."+
                "Я родился(родилась) в " + yearOfBirth + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!";
    }
}

