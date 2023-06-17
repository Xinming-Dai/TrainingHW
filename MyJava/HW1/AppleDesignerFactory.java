class AppleDesignerFactory {
    // Static variable reference of single_instance
    // of type AppleDesignerFactory
    private static AppleDesignerFactory single_instance = null;
  
    // Declaring a variable of type String
    public String s;
  
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private AppleDesignerFactory()
    {
        s = "Hello I am a string part of AppleDesignerFactory class";
    }
  
    // Static method
    // Static method to create instance of AppleDesignerFactory class
    public static synchronized AppleDesignerFactory getInstance()
    {
        if (single_instance == null)
            single_instance = new AppleDesignerFactory();
  
        return single_instance;
    }
}