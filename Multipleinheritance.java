interface camera{
    void photo();

}
interface music{
    void playMusic();
}
class mobile implements camera, music{
    public void photo(){
        System.out.println("photo taken");
    }
    public void playMusic(){
         System.out.println("music playing");
    }
}
public class Main{ 
      public static void main (String[] args) {
    mobile m = new mobile();
    m.photo();
    m.playMusic();
}
}
