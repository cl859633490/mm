package mm.menu;

import java.io.IOException;
import java.util.Arrays;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class Launch extends Application{

	/**
	 * @param args
	 */ private int s,s1=0;
	  private int a1=0; 
	  private int gg,ff,hj=0;
	  ShowImage a = new ShowImage();
	  private ComboBox<String> cbo = new ComboBox<>();
 private String[] flagTitles = {"主食", "小吃", "饮料",
   "汤","公告"};Pane pane1 =new HBox(10);
 ShowImage a1111 = new ShowImage();
 Pane pane1111 =new HBox(10); Pane pane6 = new FlowPane();   
 Pane pane5 = new FlowPane(); Pane pane2 = new FlowPane();
 Pane pan = new FlowPane();  Pane pane = new VBox(1); HBox root = new HBox(pane,pan); VBox root1 = new VBox(pan,pane2,pane5,pane6,pane1111);
 HBox root9 = new HBox(root,root1);

 Node[] I = {
		root9,
		root9,
		root9,
		root9,
		root9
   
 };
	private static Label infoLb; ShowImage a111 = new ShowImage();
	public static void showInfo(String info) {
		Platform.runLater(()->infoLb.setText(info));
	}
	private void initSystem() {
		try {
			showInfo("初始化目录...");
			Thread.sleep(500);
			showInfo("初始化页面...");
			Thread.sleep(500);
			showInfo("版本检测...");
			Thread.sleep(600);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public class Home extends Stage{
		public Home() throws IOException {

		    pane.setPadding(new Insets(5, 5, 2.5, 2.5));
		    ImageView image = new ImageView("image/3.jpg");
		    image.setFitHeight(100);
		    image.setFitWidth(100);
		    pane.getChildren().add(image);
		
		    ImageView imageView2 = new ImageView("image/2.jpg");
		    imageView2.setFitHeight(100);
		    imageView2.setFitWidth(100);
		    pane.getChildren().add(imageView2);   

		    ImageView imageView3 = new ImageView("image/4.jpg");
		    imageView3.setFitHeight(100);
		    imageView3.setFitWidth(100);
		    pane.getChildren().add(imageView3);     
		    ImageView imageView4 = new ImageView("image/5.jpg");
		    imageView4.setFitHeight(100);
		    imageView4.setFitWidth(100);
		    pane.getChildren().add(imageView4);  
		 
		    Label font1 = new Label("2级.干锅手撕菜----材料：大白菜2份\r\n"
		    		+ "3级.板栗烧菜心--材料：大白菜1份，栗子1份\r\n"
		    		+ "4级.剁椒炒鸡蛋--材料：鸡蛋1份，辣椒2份\r\n"
		    		+ "5级.油炸臭豆腐----材料：豆腐2份\r\n"
		    		+ "6级.湖南粉蒸肉--材料：土豆1份，鲜");
		  
		  
		     Text label = new Text("0");
		     Button b=new Button("+"); 	
		     b.setStyle(
			            "-fx-background-color:orange;"+         //设置背景颜色
			                    "-fx-background-radius:20;"+     //设置背景圆角
			                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
			                    "-fx-border-radius:5;"      //设置边框圆角
			                  
			    );
		     b.setOnAction((ActionEvent e) -> { 
		     s++;
		     label.setText(null);
		     label.setText(label.getText() + s);
		   });
		     Button b1=new Button("-");
		     b1.setStyle(
			            "-fx-background-color:orange;"+         //设置背景颜色
			                    "-fx-background-radius:20;"+     //设置背景圆角
			                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
			                    "-fx-border-radius:5;"      //设置边框圆角
			                  
			    );
		    b1.setOnAction((ActionEvent e) -> { 
		    	  if(s>0) s--;
		        label.setText(null);
		        label.setText(label.getText() + s);
		    	});
		  
		     pan.getChildren().addAll(font1,b1,label,b); 
		   
		    
		    
		   
		    Text label1 = new Text("0");
		    Button b3=new Button("+");
		    b3.setOnAction((ActionEvent e) -> { 
		    	  a1++;
		    	     label1.setText(null);
		    	     label1.setText(label1.getText() + a1);
		    	}); Button b31=new Button("-");
		    	 b31.setStyle(
		    	            "-fx-background-color:#FF0030;"+         //设置背景颜色
		    	                    "-fx-background-radius:20;"+     //设置背景圆角
		    	                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		    	                    "-fx-border-radius:5;"      //设置边框圆角
		    	                  
		    	    );
		    	    b31.setOnMouseEntered(e -> {       
		    	    	
		    	    	if(s1%2==0) 	{ b31.setStyle(
		    	    			  "-fx-background-color:#6b19e6;"+         //设置背景颜色
		    	  	                    "-fx-background-radius:20;"+     //设置背景圆角
		    	  	                    "-fx-text-fill:#ff0039;"+        //设置字体颜色
		    	  	                    "-fx-border-radius:5;"      //设置边框圆角
		    	    	                     );}
		    	    	if(s1%2!=0) {
		    	    		b31.setStyle(
		    	    	            "-fx-background-color:#FF0030;"+         //设置背景颜色
		    	    	                    "-fx-background-radius:20;"+     //设置背景圆角
		    	    	                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		    	    	                    "-fx-border-radius:5;"      //设置边框圆角
		    	    	                  
		    	    	    );
		    	    	}
		    	    	  s1++;
		    	      });
		    	    b31.setOnAction((ActionEvent e) -> { 
		    	    	
		    	    	  a1++;
		    	    	     label1.setText(null);
		    	    	     label1.setText(label1.getText() + a1);
		    	    	});
		    	    Button b21=new Button("-");
		    	    	  b21.setOnMouseEntered(e -> {       
		    	    	    	
		    	    	    	{ b21.setStyle(
		    	    	    			  "-fx-background-color:#FF0030;"+         //设置背景颜色
		    	    	    	                    "-fx-background-radius:20;"+     //设置背景圆角
		    	    	    	                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		    	    	    	                    "-fx-border-radius:5;"      //设置边框圆角
		    	    	    	                     );}});
		    	    	pane2.setOnMouseEntered(e -> {   b21.setStyle(
		    	    	            "-fx-background-color:#6b19e6;"+         //设置背景颜色
		    	    	                    "-fx-background-radius:20;"+     //设置背景圆角
		    	    	                    "-fx-text-fill:#ff0039;"+        //设置字体颜色
		    	    	                    "-fx-border-radius:5;"      //设置边框圆角
		    	    	                  
		    	    	    );});
		    b21.setOnAction((ActionEvent e) -> { 
		    	 if(a1>0) a1--;
		         label1.setText(null);
		         label1.setText(label1.getText() + a1);
		    	});
		    
		    Label font21 = new Label("\n\n2级.干锅手撕菜----材料：大白菜2份\r\n"
		    		+ "3级.板栗烧菜心--材料：大白菜1份，栗子1份\r\n"
		    		+ "4级.剁椒炒鸡蛋--材料：鸡蛋1份，辣椒2份\r\n"
		    		+ "5级.油炸臭豆腐----材料：豆腐2份\r\n"
		    		+ "6级.湖南粉蒸肉--材料：土豆1份，鲜");
		  
		    pane2.getChildren().addAll(font21,b21,label1,b31); 
		    
		 
		    Text label2 = new Text("0");
		    Button b5=new Button("-");
		    b5.setStyle(
		            "-fx-background-color:orange;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    b5.setOnAction((ActionEvent e) -> { 
		    	 if(gg>0) gg--;
		         label2.setText(null);
		         label2.setText(label2.getText() + gg);
		    	});
		    
		    Button b4=new Button("+");
		    b4.setStyle(
		            "-fx-background-color:orange;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    b4.setOnAction((ActionEvent e) -> { 
		    	  gg++;
		 	     label2.setText(null);
		 	     label2.setText(label2.getText() + gg);
		    	});
		    
		    Label font211 = new Label("\n\n2级.干锅手撕菜----材料：大白菜2份\r\n"
		    		+ "3级.板栗烧菜心--材料：大白菜1份，栗子1份\r\n"
		    		+ "4级.剁椒炒鸡蛋--材料：鸡蛋1份，辣椒2份\r\n"
		    		+ "5级.油炸臭豆腐----材料：豆腐2份\r\n"
		    		+ "6级.湖南粉蒸肉--材料：土豆1份，鲜");
		  
		    pane5.getChildren().addAll(font211,b5,label2,b4); 
		    
		    
		   
		    Text label3 = new Text("0");
		    Button b8=new Button("-");
		    b8.setStyle(
		            "-fx-background-color:orange;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    b8.setOnAction((ActionEvent e) -> { 
		    	 if(ff>0) ff--;
		         label3.setText(null);
		         label3.setText(label3.getText() + ff);
		    	});
		    
		    Button b7=new Button("+");
		    b7.setStyle(
		            "-fx-background-color:orange;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    b7.setOnAction((ActionEvent e) -> { 
		    	 ff++;
		 	     label3.setText(null);
		 	     label3.setText(label3.getText() + ff);
		    	});
		    
		    Label font2111 = new Label("\n\n2级.干锅手撕菜----材料：大白菜2份\r\n"
		    		+ "3级.板栗烧菜心--材料：大白菜1份，栗子1份\r\n"
		    		+ "4级.剁椒炒鸡蛋--材料：鸡蛋1份，辣椒2份\r\n"
		    		+ "5级.油炸臭豆腐----材料：豆腐2份\r\n"
		    		+ "6级.湖南粉蒸肉--材料：土豆1份，鲜");
		  
		    pane6.getChildren().addAll(font2111,b8,label3,b7);

		    Button a=new Button("合计"); 
		    a.setStyle(
		            "-fx-background-color:yellow;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    a.setOnAction((ActionEvent e) -> { 
		    	hj=s*85+gg*34+ff*23+a1*12;
		    	pane1.setPadding(new Insets(1, 1, 1, 2));
		        Label fonnn = new Label("已点");
		        fonnn.setFont(Font.font("Times New Roman",
		          		 FontWeight.BOLD, FontPosture.ITALIC, 40));
		        Label fon = new Label("\n  一共: "+hj+" $          ");
		        fon.setFont(Font.font("Times New Roman",
		       		 FontWeight.BOLD, FontPosture.ITALIC, 75));
		        ImageView image3 = new ImageView("image/666.jpg");
		        image3.setFitHeight(300);
		        image3.setFitWidth(300);
		        pane1.getChildren().addAll(image3,fonnn,fon); 
		        Scene scene = new Scene(pane1);
        	    Stage primaryStage = null;
				primaryStage.setTitle("支付界面"); // Set the stage title
        	    primaryStage.setScene(scene);
        	primaryStage.show();
		    });
		  
		    Label font21111 = new Label("2级.干锅手撕菜----材料：大白菜2份                 \r\n\n"
		    		);
		    pane1111.getChildren().addAll(font21111,a);
		    Button bbb=new Button("                     已经点了     " +hj+"                                                                            去结算           ");
		    bbb.setOnAction((ActionEvent e) -> { 
		    	
		    	});
		    
		    bbb.setStyle(
		            "-fx-background-color:yellow;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    

		    ListView<String> lv = new ListView<>
		      (FXCollections.observableArrayList(flagTitles));
		    lv.setPrefSize(100, 200);
		    lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		    Pane im = new Pane();
		    im.setPadding(new Insets(10, 100, 10, 10));
		    BorderPane panep = new BorderPane();
		    panep.setPadding(new Insets(10, 100, 10, 10));
		    panep.setLeft(new ScrollPane(lv));   
		    ImageView imagee = new ImageView("image/home.jpg");
		    Button a666=new Button(" ",imagee); 
		    a666.setStyle(
		            "-fx-background-color:white;"+         //设置背景颜色
		                    "-fx-background-radius:20;"+     //设置背景圆角
		                    "-fx-text-fill:#4d0092;"+        //设置字体颜色
		                    "-fx-border-radius:5;"      //设置边框圆角
		                  
		    );
		    a666.setOnAction((ActionEvent e) -> { 
		    	hj=s*85+gg*34+ff*23+a1*12;
		    	pane1.setPadding(new Insets(1, 1, 1, 2));
		        Label fonnn = new Label("已点");
		        fonnn.setFont(Font.font("Times New Roman",
		          		 FontWeight.BOLD, FontPosture.ITALIC, 40));
		        Label fon = new Label("\n  一共: "+hj+" $          ");
		        fon.setFont(Font.font("Times New Roman",
		       		 FontWeight.BOLD, FontPosture.ITALIC, 75));
		        ImageView image3 = new ImageView("image/666.jpg");
		        image3.setFitHeight(300);
		        image3.setFitWidth(300);
		        pane1.getChildren().addAll(image3,fonnn,fon); 
		        	 Scene scene = new Scene(pane1);
		        	    Stage primaryStage = null;
						primaryStage.setTitle("支付界面"); // Set the stage title
		        	    primaryStage.setScene(scene);
		        	primaryStage.show();
			});
		    imagee.setFitHeight(100);
		    imagee.setFitWidth(100);
		    VBox rrr=new VBox(bbb,a666);
		    
		    panep.setBottom(rrr);
		    panep.setCenter(new ScrollPane(im));
		   
		    lv.getSelectionModel().selectedItemProperty().addListener(
		      ov -> {  
		        im.getChildren().clear();
		        
		        for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
		          im.getChildren().addAll(I[i]);
		        }
		    });

	    // Create a scene and place it in the stage
	    Scene scene = new Scene(panep, 642.0, 575.0);
		
			setScene(scene);
			setResizable(false);
			setTitle("Ordering");
				}
	}
	@Override
	public void start(Stage primaryStage) {
	
			Image image = new Image("image/222.gif");
			ImageView view = new ImageView(image);
			view.setFitWidth(400);
			view.setFitHeight(250);
			infoLb = new Label();
			infoLb.setTextFill(Color.BLACK);
			AnchorPane.setRightAnchor(infoLb, 10.0);
			AnchorPane.setBottomAnchor(infoLb, 10.0);
			AnchorPane page = new AnchorPane();
			page.getChildren().addAll(view,infoLb);
			primaryStage.setTitle("Launching....");
			primaryStage.setScene(new Scene(page));
			primaryStage.setWidth(400);
			primaryStage.setHeight(250);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			
			primaryStage.show();
			
			new Thread(()->{
				initSystem();//1
				Platform.runLater(()->{//2
					try {
						Home home = new Home();
					
						home.addEventHandler(WindowEvent.WINDOW_SHOWN, event->{
							primaryStage.hide();
						});
						home.show();
					}catch(Throwable e) {
						e.printStackTrace();//3
					}
			});
			}).start();
		}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			launch(args);
	}

}
