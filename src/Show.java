import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public  void printDirector() {
        if(director != null){
            System.out.println(director.getName() + " " + director.getSurname());
        }else{
            System.out.println("Режисер не указан");
        }
    }

    public void printAllActors(){
        if(listOfActors != null){
            for(Actor actor: listOfActors){
                actor.printActor();
            }
        }else{
            System.out.println("Актеры не указаны");
        }
    }

    public void addActor(Actor actor){
        if(actor != null){
            for(Actor actorToCheck: this.listOfActors){
                if(actorToCheck.equals(actor)) {
                    System.out.println("Этот актер уже есть в списке");
                    return;
                }
            }
            listOfActors.add(actor);
        }else{
            System.out.println("Актер не указан");
        }
    }

    public void changeActor(Actor newOne, String oldOneSurname){
        if(newOne == null || oldOneSurname == null){
            System.out.println("Не указан актер");
            return;
        }
        Actor actorToReplace = null;
        for(Actor actor: listOfActors){
            actorToReplace = (actor.getSurname() == oldOneSurname)? actor: actorToReplace;
        }
        if(actorToReplace == null){
            System.out.println("Указанного для замены актера нет в списке");
            return;
        }
        listOfActors.remove(actorToReplace);
        listOfActors.add(newOne);
    }

}
