/**
 * Created by George on 12/30/2015.
 */
public class Car {
    private  int doors;
    private String model;
    private int wheels;
    private String color;

    public void setColor(String color){
        this.color = color;
    }
  //we use a public method to avoid having our data completely exposed to Main application.
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("Model S") || validModel.equals("Enzo")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
