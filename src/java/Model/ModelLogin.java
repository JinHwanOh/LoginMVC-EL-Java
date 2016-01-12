
package Model;

/**
 *
 * @author Jin Oh
 */
public class ModelLogin {
    // Instance varaible
    String userId = null;
    String password = null;
    boolean valid = false;
    
    //Custructors
    public ModelLogin(){
        // Nothing
    }
    
    public ModelLogin(String userId, String password){
        this.userId = userId;
        this.password = password;
        validate();
    }
    
    // Setters
    public void setUserId(String userId){
        this.userId = userId;
        validate();
    }
    
    public void setPassword(String password){
        this.password = password;
        validate();
    }
    
    public boolean isValid(){
        return valid;
    }
    
    public void setValid(boolean valid){
        this.valid = valid;
    }
    
    private void validate(){
        valid = userId != null && userId.equals("ejd") &&
                password != null && password.equals("1234");
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
