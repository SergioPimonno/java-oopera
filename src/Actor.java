public class Actor extends Person{

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public void printActor(){
        System.out.printf("%s %s (%d)%n", this.getName(), this.getSurname(), this.getHeight());
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(object.getClass() != Actor.class) return false;
        Actor actorToCheck = (Actor) object;

        return (this.getName() == actorToCheck.getName() && this.getSurname() == actorToCheck.getSurname() &&
                this.getHeight() == actorToCheck.getHeight());
    }

}
