/**
 * Created by George on 8/24/2015.
 */
public class Car {
    public int windows;
    private int doors;
    private int modelNumber;
    private String model;
    public String engine;
    private String sale;

    public void setModel(String model){
      String validModel= model.toLowerCase();
      if(validModel.equals("aventador")|| validModel.equals("veyron")){
          this.model = model;
      }else{
          this.model="Unknown";
      }
    }

    public String getModel(){
        return this.model;
    }
}
