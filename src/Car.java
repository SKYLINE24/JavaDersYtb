public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;

    public Car(String color, String model,double engine,int doors){
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }
    public Car(){
        /*this.color = "Bilgi yok ";
        this.model = "Bilgi yok";
        this.engine = 0;
        this.doors = 0;*/
        this("bilgi yok ","bilgi yok ",0,0);
    }
    public Car(String color, String model){
        this(color,model,0,0);
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
        //burada this yazmasak da olurdu fakat güvenli bir kod oluşturmak için ekledik
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setEngine(int engine){
        this.engine = engine;
    }
    public int getEngine(){
        return (int) this.engine;
    }
    public void setDoors(int doors){
        if (doors ==2 ||doors == 4){
            this.doors = doors;
        }
        else{
            System.out.println("Kapı sayısı 2 vey 4 olabilir");
        }
    }
    public int getDoors(){
        return this.doors;
    }
    public void showInfos(){
        System.out.println("Arabanın Rengi: " + this.color);
        System.out.println("Arabanın Modeli: " + this.model);
        System.out.println("Arabanın Motor Hacmi: " + this.engine);
        System.out.println("Arabanın Kapı Sayısı: " + this.doors);
    }


}
