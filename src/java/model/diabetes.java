package model;


public class diabetes {
    private int  user_id;
    private String first_name;
    private String  last_name;
    private String password;
    private String email;
    private String phone;
    
    
    //user id
    public int getUser_id( ){
        return user_id;
    }
    
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
        
    //first name
    public String getFirst_name() {
        return first_name;
    }
    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
   }
   
    
    //lastName
    public String getLast_name(){
         return last_name;
        
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
   }
    
    //password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
   }
    
    //email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    //phone
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
}
