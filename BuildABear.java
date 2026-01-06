
    /**
     * BuildABear.java defines the BuildABear CLASS
     * which is a template for BuildABear OBJECTS
     */
public class BuildABear {
    //3 SECTIONS IN AN OBJECT-CLASS
    //1. INSTANCE VARIABLES (data/attrabutes/fields)
   private  String type; //just declare, dont assign 
   private  String name; 
   private  int fillLevel; 
   private  double price;
   private boolean hasSound;
   private String hasSpeaker;
   private String recording; 

     //All objects can be creared using this pattern:
      //ClassName objectName= new ClassName ();
      
      BuildABear horse = new BuildABear();
      // "BuildABear horse" is DECLARING VARIABLES of type BuildABear
      //"new BuildABear()" is CALLING A CONSTRUCTOR to set up the object 
      //this Java CLASS (data is proteceted from users)

      //2. CONSTRUCTORS
      // DEFAULT CONSTRUCTOR does not take any arguments (no-arg)
      // what gets called wen user says =" new BuildABear()"
      public BuildABear () {
         this.type ="bear"; //WE PICK the initial values! 
         this.name ="Berry"; 
         this.fillLevel= 75;
         this.price = 150.00;
         this.hasSpeaker = false; 
         this.recording = "";
      }
      //PARAMETERIZED CONSTRUCTOR allows user to provide args
      //user PASSES initial values to the constructor call
      public BuildABear(String t, String n, int fl) { 
        this.type = t; //USER pciled the valie for typel 
        this.name= n;
        this.fillLevel= fl; 
        this.price = 150.00;
        this.hasSpeaker= false;
        this.recording= "";
        

      }

      //3. METHODS (behaviors/actions)

      //ACCESSORS ("getters") return the value of an instance variable 
      public String getType() {
        return type; 


      public String getName(){
        return Name;
      }

      public Int getFillLevel(){
        return FillLevel;

      }

      public double getPrice(){
      return price;
      }
     
    
    
    
    } 