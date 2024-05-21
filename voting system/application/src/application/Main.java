package application;
import static javafx.scene.text.TextAlignment.CENTER; 
import javafx.application.Application;
import javafx.geometry.Pos; 
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage stage) throws Exception {	Scene scene1, scene2,scene3,scene4,scene41,scene5; 
	//************************ Home Page Coding ************************/       
	Rectangle r1 = new Rectangle();   
	r1.setX(202);      
	r1.setY(160);
	r1.setWidth(600); 
	r1.setHeight(350);
	r1.setArcWidth(50);
	r1.setArcHeight(50);   
	r1.setFill(Color.DARKBLUE);
	r1.setOpacity(0.6);
    Text t=new Text("WELCOME TO IQRA UNIVERSITY");
    t.setLayoutX(235);
    t.setLayoutY(220);
    t.setTextAlignment(CENTER);
    t.setFill(Color.WHITE);
    t.setFont(Font.font("Archive", FontWeight.BOLD,35));
    
    Text t1=new Text("Online Voting System");     
    t1.setLayoutX(355);    
    t1.setLayoutY(260);
    t1.setTextAlignment(CENTER);
    t1.setFill(Color.WHITE);
    t1.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,30));

    Button b=new Button("Faculty");
    b.setStyle("-fx-background-color: darkblue; -fx-textfill: white");
    b.setFont(Font.font("Archive", FontWeight.BOLD,22));
    b.setTextAlignment(CENTER);
    b.setLayoutX(450);

    b.setLayoutY(320);
    b.setAlignment(Pos.BOTTOM_CENTER);
    b.setPrefSize(110,50);
    Button b1=new Button("Students");
    b1.setStyle("-fx-background-color: darkblue; -fx-textfill: white; ");
    b1.setFont(Font.font("Archive", FontWeight.BOLD,19.7));
    b1.setTextAlignment(CENTER);    
    b1.setLayoutX(450); 
    b1.setLayoutY(400);
    b1.setAlignment(Pos.BOTTOM_CENTER);  
    b1.setPrefSize(110,50);
    
    Group root1 = new Group(r1,t,t1,b,b1);  
    scene1 = new Scene(root1, 1000, 665);
    
    
    //************************* Faculty Login Page Coding *****
    Rectangle r2 = new Rectangle();  
r2.setWidth(500);
r2.setHeight(665);
r2.setFill(Color.DARKBLUE); 
r2.setOpacity(0.8);  
Text txt=new Text("ONLINE VOTING\nSYSTEM"); 
txt.setLayoutX(65); 
txt.setLayoutY(90);   
txt.setTextAlignment(CENTER);
txt.setFont(Font.font("Verdana", FontWeight.BOLD,40)); 
txt.setFill(Color.WHITE);
Text txt1=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");         txt1.setLayoutX(60);         txt1.setLayoutY(250);         txt1.setTextAlignment(CENTER);
txt1.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40)); 
txt1.setLineSpacing(2); 
txt1.setFill(Color.WHITE);
TextField userNameField2 = new TextField();
userNameField2.setLayoutX(645);  
userNameField2.setLayoutY(220); 
userNameField2.setPrefSize(215, 50);         

userNameField2.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userNameField2.setPromptText("Name");
PasswordField userPasswordField2 = new PasswordField();
userPasswordField2.setLayoutX(645);      
userPasswordField2.setLayoutY(310);      
userPasswordField2.setPrefSize(215, 50);  
userPasswordField2.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userPasswordField2.setPromptText("Password");
Button btn2 = new Button("Login"); 
btn2.setLayoutX(705);
btn2.setLayoutY(450);
btn2.setPrefSize(100,40);
btn2.setStyle("-fx-background-color: darkblue; -fx-textfill: white");
btn2.setFont(Font.font("Archive", FontWeight.BOLD,20));       
btn2.setOpacity(0.9);
Group root2 = new Group(r2, txt,txt1,btn2,userNameField2,userPasswordField2);  
scene2 = new Scene(root2, 1000, 665);


//************************* Student Login Page Coding ************************/

Rectangle r3 = new Rectangle();
r3.setWidth(500);  
r3.setHeight(665);       
r3.setFill(Color.DARKBLUE);      
r3.setOpacity(0.9);               
Text txt3=new Text("ONLINE VOTING\nSYSTEM");      
txt3.setLayoutX(65);      
txt3.setLayoutY(90); 
txt3.setTextAlignment(CENTER);
txt3.setFont(Font.font("Verdana", FontWeight.BOLD,40));  
txt3.setFill(Color.WHITE);
Text txt4=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");         txt4.setLayoutX(60);   
    
txt4.setLayoutY(250);   
txt4.setTextAlignment(CENTER);
txt4.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40));   
txt4.setLineSpacing(2);    
txt4.setFill(Color.WHITE);
TextField userNameField3 = new TextField();  
userNameField3.setLayoutX(645);      
userNameField3.setLayoutY(220);    
userNameField3.setPrefSize(215, 50);      
 userNameField3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userNameField3.setPromptText("Name");
PasswordField userPasswordField3 = new PasswordField();  
userPasswordField3.setLayoutX(645);     
userPasswordField3.setLayoutY(310);     
userPasswordField3.setPrefSize(215, 50);     
userPasswordField3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userPasswordField3.setPromptText("Password");
Button btn3 = new Button("Login");      
btn3.setLayoutX(705);      
btn3.setLayoutY(450);     
btn3.setPrefSize(100,40);
btn3.setStyle("-fx-background-color: darkblue; -fx-textfill: white");
btn3.setFont(Font.font("Archive", FontWeight.BOLD,20));     
btn3.setOpacity(0.9);
Group root3 = new Group(r3, txt3,txt4,btn3,userNameField3,userPasswordField3);
scene3 = new Scene(root3, 1000, 665);

//************************* Faculty Voting Page Coding *************************/
//vote image 1 
Button votef1=new Button("ADNAN STUDENT COUNCIL"); 
votef1.setTranslateX(270); votef1.setTranslateY(125);

//vote image 2
Button votef2=new Button("SHAHEER MAJID STUDENT COUNCIL");
votef2.setTranslateX(550);
votef2.setTranslateY(125); 

//vote image 3
Button votef3=new Button("AZAHAR ALI STUDENT COUNCIL");
votef3.setTranslateX(270); 
votef3.setTranslateY(330);  
  
//vote image 4
Button votef4=new Button("WALI JAWED STUDENT COUNCIL");
votef4.setTranslateX(550);
votef4.setTranslateY(330);

//submit button	     
Button fsubmit=new Button("Submit");
fsubmit.setStyle("-fx-background-color: darkblue; -fx-text-fill: white"); fsubmit.setFont(Font.font("Archive", 
FontWeight.BOLD,22)); 
fsubmit.setTextAlignment(CENTER);
fsubmit.setLayoutX(450);
fsubmit.setLayoutY(550);

fsubmit.setAlignment(Pos.BOTTOM_CENTER); fsubmit.setPrefSize(110,50);

Group root4 = new Group (votef1, votef2, 
votef3,votef4, fsubmit);
scene4 = new Scene(root4, 1000, 
665,Color.WHITESMOKE);
        
//******************** Student Voting Page Coding *********************/

//vote image 1 
Button votef12=new Button("ADNAN STUDENT COUNCIL");
votef12.setTranslateX(270); votef12.setTranslateY(125);
 
//vote image 2
Button votef22=new Button("SHAHEER MAJID STUDENT COUNCIL");
votef22.setTranslateX(550); 
votef22.setTranslateY(125); //vote image 3
Button votef32=new Button("AZHAR ALI STUDENT COUNCIL");
votef32.setTranslateX(270);
votef32.setTranslateY(330); 

//vote image 4
Button votef42=new Button("WALI JAWED STUDENT COUNCIL");

votef42.setTranslateX(550); votef42.setTranslateY(330);

//submit button	    
Button ssubmit=new Button("Submit");
ssubmit.setStyle("-fx-background-color: darkblue; -fx-text-fill: white"); ssubmit.setFont(Font.font("Archive", 
FontWeight.BOLD,22));
ssubmit.setTextAlignment(CENTER);
ssubmit.setLayoutX(450); 
ssubmit.setLayoutY(550);
ssubmit.setAlignment(Pos.BOTTOM_CENTER);
ssubmit.setPrefSize(110,50);
 
Group root41 = new Group(votef12, votef22, 
votef32,votef42, ssubmit);
scene41 = new Scene(root41,1000, 
665,Color.WHITESMOKE);

//************************* Last Page Coding *************************/
  
      
  Text t2=new Text("Thank You");     
  t2.setLayoutX(270);    
  t2.setLayoutY(350);   
  t2.setTextAlignment(CENTER); 
   t2.setFill(Color.BLACK);
  t2.setFont(Font.font("Archive",100));
      
  Text t3=new Text("IQRA UNIVERSITY");   
  t3.setLayoutX(385);   
  t3.setLayoutY(400);   
  t3.setTextAlignment(CENTER);  
  t3.setFill(Color.BLACK);
  t3.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,30));
      
  Group root5 = new Group(t2,t3);

  scene5 = new Scene(root5, 1000, 665,Color.LIGHTBLUE);   
  
  
  //************************* Event Handling Coding *************************/
      
b.setOnAction(e -> stage.setScene(scene2));  //Faculty Page Button        
b1.setOnAction(e -> stage.setScene(scene3));
//Student Page Button
btn2.setOnAction(e -> stage.setScene(scene4));
//Faculty Login Button
btn3.setOnAction(e -> stage.setScene(scene41));
//Student Login Button
fsubmit.setOnAction(e -> stage.setScene(scene5));
//Faculty Vote Submit Button
ssubmit.setOnAction(e -> stage.setScene(scene5));
//Student Vote Submit Button
  
  
  //*************************Stage Show Coding *************************/
      stage.setResizable(false);
stage.setTitle("IQRA UNIVERSITY ONLINE VOTING SYSTEM");    
stage.setScene(scene1);     stage.show();        
}
public static void main(String[] args)
{  
	launch(args);
}






}
